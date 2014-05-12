/*
 * generated by Xtext
 */
package dk.itu.smdp.survey.validation

import java.util.HashMap
import org.eclipse.xtext.validation.Check
import survey.Answer
import survey.AnswerTemplate
import survey.AnswerTemplateRef
import survey.Group
import survey.HasOptions
import survey.Item
import survey.Multiple
import survey.Number
import survey.Option
import survey.Question
import survey.Scale
import survey.Survey
import survey.SurveyPackage
import survey.Table
import survey.Date
import survey.TableQuestion
import survey.Meta

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class DslValidator extends AbstractDslValidator {

	public static val DUPLICATE_NAME = 'duplicateName'
	public static val INVALID_VALUE = 'invalidValue'
	public static val INVALID_DATE = 'invalidDate'
	public static val MISSING_ATTRIBUTE = 'missingAttribute'
	
	private static val invalidEmailAddressString = 'The email address must be valid'
	private static val minIsLessThanMaxString = 'Max value must be larger than min value'
	private static val minIsLessThanOrEqualMaxString = 'Max value must be larger than or equal to min value'
	private static val positiveNumberString = 'An answer is required, so the min value must be positive'
	private static val uniqueIdsAtSameLevelString = 'Ids at the same level must be unique'
	private static val invalidRefIdString = 'There is no answer with this id'
	private static val ambiguousIdString = 'The id %s is ambiguous'
	private static val noNegativeValueString = 'The value must be non-negative'
	private static val betterUseSingleString = 'If your maximum is one, you should rather use a single question instead of a multiple for usability reasons'
	private static val setDateGranularityString = "You cannot specify date and year without having month"

	@Check
	def checkValidEmailAddress(Survey survey) {
		if (!survey.mail.nullOrEmpty) {
			var boolean valid
			val emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"
			
			try {
				valid = survey.mail.matches(emailreg);
			} catch (Exception e) {
				valid = false;
			}
			
			if (!valid) {
				error(
					invalidEmailAddressString,
					survey,
					SurveyPackage.Literals.SURVEY__MAIL,
					INVALID_VALUE
				)
			}
		}
	}


	/**
	 * Check that the min is less than max value in a scale 
	 */
	@Check
	def checkMinIsLessThanMax(Scale scale) {
		if (scale.min >= scale.max) {
			error(
				minIsLessThanMaxString,
				scale,
				SurveyPackage.Literals.SCALE__MIN,
				INVALID_VALUE
			)
			error(
				minIsLessThanMaxString,
				scale,
				SurveyPackage.Literals.SCALE__MAX,
				INVALID_VALUE
			)
		}
		
		val largeScaleString = 'Large scales may not render properly nor be very user friendly'
		if (scale.max - scale.min > 20) {
			warning(
				largeScaleString,
				scale,
				SurveyPackage.Literals.SCALE__MIN
			)
			warning(
				largeScaleString,
				scale,
				SurveyPackage.Literals.SCALE__MAX
			)
		}
		
		val bothLabelsString = 'You must specify both labels or none of them'
		if (scale.minLabel.nullOrEmpty != scale.maxLabel.nullOrEmpty) {
			if (!scale.minLabel.nullOrEmpty) {
				error(
					bothLabelsString,
					scale,
					SurveyPackage.Literals.SCALE__MIN_LABEL,
					MISSING_ATTRIBUTE
				)
			}
			else {
				error(
					bothLabelsString,
					scale,
					SurveyPackage.Literals.SCALE__MAX_LABEL,
					MISSING_ATTRIBUTE
				)
			}
		}
	}
	
	/**
	 * Check that the min is less than max value in a scale 
	 */
	@Check
	def checkMinIsLessThanMax(Number number) {
		val min = number.min
		val max = number.max
		if (min != null && max != null && min.intValue >= max.intValue) {
			error(
				minIsLessThanMaxString,
				number,
				SurveyPackage.Literals.NUMBER__MIN,
				INVALID_VALUE
			)
			error(
				minIsLessThanMaxString,
				number,
				SurveyPackage.Literals.NUMBER__MAX,
				INVALID_VALUE
			)
		}
	}
	
	/**
	 * Check that the min is less than max value in a scale 
	 */
	@Check
	def checkMinIsLessThanMax(Multiple multiple) {
		val min = multiple.min
		val max = multiple.max
		if (multiple.required && min != null && min.intValue <1) {
			error(
				positiveNumberString,
				multiple,
				SurveyPackage.Literals.MULTIPLE__MIN,
				INVALID_VALUE
			)
		}
		if (min != null && max != null && min.intValue > max.intValue) {
			error(
				minIsLessThanOrEqualMaxString,
				multiple,
				SurveyPackage.Literals.MULTIPLE__MIN,
				INVALID_VALUE
			)
			error(
				minIsLessThanOrEqualMaxString,
				multiple,
				SurveyPackage.Literals.MULTIPLE__MAX,
				INVALID_VALUE
			)
		}
		if (min != null && min.intValue < 0) {
			error(
				noNegativeValueString,
				multiple,
				SurveyPackage.Literals.MULTIPLE__MIN,
				INVALID_VALUE
			)
		}
		if (max != null && max.intValue == 1) {
			warning(
				betterUseSingleString,
				multiple,
				SurveyPackage.Literals.MULTIPLE__MAX,
				INVALID_VALUE
			)
		}
		else if (max != null && max.intValue < 1) {
			error(
				noNegativeValueString,
				multiple,
				SurveyPackage.Literals.MULTIPLE__MAX,
				INVALID_VALUE
			)
		}
	}
	
	/**
	 * Check that the min is less than max value in a scale 
	 */
	@Check
	def checkDateGranularity(Date date) {
		if (date.day && !date.month && date.year) {
			error(
				setDateGranularityString,
				date,
				SurveyPackage.Literals.DATE__DAY,
				INVALID_VALUE
			)
			error(
				setDateGranularityString,
				date,
				SurveyPackage.Literals.DATE__YEAR,
				INVALID_VALUE
			)
		}
	}


	/**
	 * Check that groups and questions in root have unique names
	 */
	@Check
	def checkUniqueItemNames(Survey survey) {
		val map = new HashMap<String, Item>()
		for (Item item : survey.items.filter([!name.nullOrEmpty])) {
			if (map.containsKey(item.name)) {
				error(
					uniqueIdsAtSameLevelString,
					item,
					SurveyPackage.Literals.META__NAME,
					DUPLICATE_NAME
				)
				error(
					uniqueIdsAtSameLevelString,
					map.get(item.name),
					SurveyPackage.Literals.META__NAME,
					DUPLICATE_NAME
				)
			}
			else {
				map.put(item.name, item)
			}
		}
	}
	
	/**
	 * Check that questions at the same level have unique names
	 */
	@Check
	def checkUniqueQuestionNames(Group group) {
		group.questions.checkUniqueQuestionNames
	}
	
	def checkUniqueQuestionNames(Iterable<Question> questions) {
		val map = new HashMap<String, Question>()
		for (Question question : questions.filter([!name.nullOrEmpty])) {
			if (map.containsKey(question.name)) {
				error(
					uniqueIdsAtSameLevelString,
					question,
					SurveyPackage.Literals.META__NAME,
					DUPLICATE_NAME
				)
				error(
					uniqueIdsAtSameLevelString,
					map.get(question.name),
					SurveyPackage.Literals.META__NAME,
					DUPLICATE_NAME
				)
			}
			else {
				map.put(question.name, question)
			}
		}
	}
	
	/**
	 * Check that the AnswerTemplates have unique IDs
	 */
	@Check
	def checkUniqueAnswerTemplateNames(Survey survey) {
		var map = new HashMap<String, AnswerTemplate>

		for (AnswerTemplate template : survey.templates) {
			if (map.containsKey(template.name)) {
				error(
					uniqueIdsAtSameLevelString,
					template,
					SurveyPackage.Literals.ANSWER_TEMPLATE__NAME,
					DUPLICATE_NAME
				)
				error(
					uniqueIdsAtSameLevelString,
					map.get(template.name),
					SurveyPackage.Literals.ANSWER_TEMPLATE__NAME,
					DUPLICATE_NAME
				)
			}
			else {
				map.put(template.name, template)
			}
		}
	}
	
	/**
	 * Check that the answers in an AnswerTemplate have unique IDs
	 */
	@Check
	def checkUniqueAnswerNames(AnswerTemplate template) {
		template.answers.checkUniqueAnswerNames
	}
	
	/**
	 * Check that the table questions have unique IDs
	 */
	@Check
	def checkUniqueAnswerNames(Table table) {
		var map = new HashMap<String, TableQuestion>

		for (TableQuestion question : table.questions.filter[!name.nullOrEmpty]) {
			if (map.containsKey(question.name)) {
				error(
					uniqueIdsAtSameLevelString,
					question,
					SurveyPackage.Literals.META__NAME,
					DUPLICATE_NAME
				)
				error(
					uniqueIdsAtSameLevelString,
					map.get(question.name),
					SurveyPackage.Literals.META__NAME,
					DUPLICATE_NAME
				)
			}
			else {
				map.put(question.name, question)
			}
		}
	}
	
	/**
	 * Check that the answers in a Question have unique IDs
	 */
	@Check
	def checkUniqueAnswerNames(HasOptions hasOptions) {
		hasOptions.options.filter(typeof(Answer)).checkUniqueAnswerNames
	}
	
	def checkUniqueAnswerNames(Iterable<Answer> answers) {
		var map = new HashMap<String, Answer>

		for (Answer answer : answers.filter([!name.nullOrEmpty])) {
			if (map.containsKey(answer.name)) {
				error(
					uniqueIdsAtSameLevelString,
					answer,
					SurveyPackage.Literals.META__NAME,
					DUPLICATE_NAME
				)
				error(
					uniqueIdsAtSameLevelString,
					map.get(answer.name),
					SurveyPackage.Literals.META__NAME,
					DUPLICATE_NAME
				)
			}
			else {
				map.put(answer.name, answer)
			}
		}
	}

	@Check
	def checkDependsOn(Survey survey) {
		var map = new HashMap<String, Meta>()
		for (Item item : survey.items) {
			item.getFullIds("", map)
		}
		
		for (Item item : survey.items.filter[!dependsOn.nullOrEmpty]) {
			if (!map.containsKey(item.dependsOn)) {
				error(
					invalidRefIdString,
					item,
					SurveyPackage.Literals.ITEM__DEPENDS_ON,
					INVALID_VALUE
				)
			}
		}
		
		
		for (Group group : survey.items.filter(typeof(Group))) {
			for (Item item : group.questions.filter[!dependsOn.nullOrEmpty]) {
				if (!map.containsKey(item.dependsOn)) {
					error(
						invalidRefIdString,
						item,
						SurveyPackage.Literals.ITEM__DEPENDS_ON,
						INVALID_VALUE
					)
				}
			}
		}
	}
	
	def dispatch void getFullIds(Group group, String pid, HashMap<String, Meta> map) {
		for (Question question : group.questions) {	
			val id = if (group.name.nullOrEmpty) pid else pid + "-" + group.name
			question.getFullIds(id, map)
		}
	}
	
	def dispatch void getFullIds(Question question, String pid, HashMap<String, Meta> map) {
		if (!question.name.nullOrEmpty) {
			val id = (pid + "-" + question.name).substring(1)
			val s = String::format(ambiguousIdString, id) 
			
			if (map.containsKey(id)) {
				error(
					s,
					question,
					SurveyPackage.Literals.META__NAME,
					INVALID_VALUE
				)
				error(
					s,
					map.get(id),
					SurveyPackage.Literals.META__NAME,
					INVALID_VALUE
				)
			}
			else {
				if (question instanceof Scale) {
					val scale = question as Scale
					for (int i : scale.min..scale.max) {
						map.put(id + "-" + i, question)
					}
				}	
				else			
					map.put(id, question)
			}
		}
	}
	
	def dispatch void getFullIds(Table question, String pid, HashMap<String, Meta> map) {
		for (TableQuestion q : question.questions.filter[!name.nullOrEmpty]) {
			var id = pid + "-" + q.name
			for (Option option : question.options) {
				id = if (question.name.nullOrEmpty) id else id + "-" + question.name
				option.getFullIds(id, map)
			}
		}
	}
	
	def dispatch void getFullIds(HasOptions question, String pid, HashMap<String, Meta> map) {
		for (Option option : question.options) {
			val id = if (question.name.nullOrEmpty) pid else pid + "-" + question.name
			option.getFullIds(id, map)
		}
	}
	
	def dispatch void getFullIds(AnswerTemplateRef templateRef, String pid, HashMap<String, Meta> map) {
		// Skip if the question has no id
		if (!pid.nullOrEmpty)
			for (Answer answer : templateRef.template.answers) {
				answer.getFullIds(pid, map)
			}
	}
	
	def dispatch void getFullIds(Answer answer, String pid, HashMap<String, Meta> map) {
		if (!answer.name.nullOrEmpty) {
			val id = (pid + "-" + answer.name).substring(1)
			val s = String::format(ambiguousIdString, id) 
			
			if (map.containsKey(id)) {
				error(
					s,
					answer,
					SurveyPackage.Literals.META__NAME,
					INVALID_VALUE
				)
				error(
					s,
					map.get(id),
					SurveyPackage.Literals.META__NAME,
					INVALID_VALUE
				)
			}
			else {
				map.put(id, answer)
			}
		}
	}
}
