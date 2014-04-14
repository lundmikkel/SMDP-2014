/*
 * generated by Xtext
 */
package dk.itu.smdp.survey.validation

import java.util.HashMap
import survey.Survey
import org.eclipse.xtext.validation.Check
import survey.Question
import survey.SurveyPackage
import survey.Group
import survey.Answer
import survey.Multiple
import survey.Single
import survey.Table
import survey.AnswerTemplate

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class DslValidator extends AbstractDslValidator {

	public static val DUPLICATE_NAME = 'duplicateName'

/*
 * Check that the groups have unique titles
 */
	@Check
	def checkThatGroupTitlesAreUnique(Survey survey) {
		var groupMap = new HashMap<String, Group>
		for (Group group : survey.items.filter(typeof(Group))) {
			if (!group.title.empty) {
				if (groupMap.containsKey(group.title)) {
					error(
						'Groups must have unique titles',
						group,
						SurveyPackage.Literals.TITLE_AND_DESCRIPTION__TITLE,
						DUPLICATE_NAME
					)
				} else {
					groupMap.put(group.title, group)
				}
			}
		}
	}

/*
 * Check that questions, not in a group, have a unique ID
 */
	@Check
	def checkThatQuestionIDsAreUnique(Survey survey) {
		var questionMap = new HashMap<String, Question>
		for (Question question : survey.items.filter(typeof(Question))) {
			if (!question.id.empty) {
				if (questionMap.containsKey(question.id)) {
					error(
						'Questions must have unique IDs',
						question,
						SurveyPackage.Literals.QUESTION__ID,
						DUPLICATE_NAME
					)
				} else {
					questionMap.put(question.id, question)
				}
			}
		}
	}

/*
 * Check that answers in questions outside of a group have unique IDs
 */
	@Check
	def checkThatAnswerIDsAreUnique(Survey survey) {
		for (Question question : survey.items.filter(typeof(Question))) {
			var answerMap = new HashMap<String, Answer>
			if (question instanceof Single) {
				var s = question as Single
				for (Answer answer : s.options.filter(typeof(Answer))) {
					if (!answer.id.empty) {
						if (answerMap.containsKey(answer.id)) {
							error(
								'Answers within a Single must have unique IDs',
								answer,
								SurveyPackage.Literals.ANSWER__ID,
								DUPLICATE_NAME
							)
						} else {
							answerMap.put(answer.id, answer)
						}
					}
				}
			} else if (question instanceof Multiple) {
				var m = question as Multiple
				for (Answer answer : m.options.filter(typeof(Answer))) {
					if (!answer.id.empty) {
						if (answerMap.containsKey(answer.id)) {
							error(
								'Answers within a Multiple must have unique IDs',
								answer,
								SurveyPackage.Literals.ANSWER__ID,
								DUPLICATE_NAME
							)
						} else {
							answerMap.put(answer.id, answer)
						}
					}
				}
			}
			if (question instanceof Table) {
				var t = question as Table
				for (Answer answer : t.options.filter(typeof(Answer))) {
					if (!answer.id.empty) {
						if (answerMap.containsKey(answer.id)) {
							error(
								'Answers within a Table must have unique IDs',
								answer,
								SurveyPackage.Literals.ANSWER__ID,
								DUPLICATE_NAME
							)
						} else {
							answerMap.put(answer.id, answer)
						}
					}
				}
			}
		}
	}

/*
 * Check that the questions in each group have unique IDs
 */
	@Check
	def checkThatQuestionIDsInGroupsAreUnique(Survey survey) {
		var questionMap = new HashMap<String, Question>

		for (Group group : survey.items.filter(typeof(Group))) {
			for (Question question : group.questions) {

				if (!question.id.empty) {
					if (questionMap.containsKey(question.id)) {
						error(
							'Questions within a group must have unique IDs',
							question,
							SurveyPackage.Literals.QUESTION__ID,
							DUPLICATE_NAME
						)
					} else {
						questionMap.put(question.id, question)
					}
				}
			}
		}
	}

/*
 * Check that the answers in each question (of type Single, Multiple or Table) in each group have unique IDs
 */
	@Check
	def checkThatAnswerIDsInGroupsAreUnique(Survey survey) {
		for (Group group : survey.items.filter(typeof(Group))) {
			for (Question question : group.questions) {
				var answerMap = new HashMap<String, Answer>
				if (question instanceof Single) {
					var s = question as Single
					for (Answer answer : s.options.filter(typeof(Answer))) {
						if (!answer.id.empty) {
							if (answerMap.containsKey(answer.id)) {
								error(
									'Answers within a Single must have unique IDs',
									answer,
									SurveyPackage.Literals.ANSWER__ID,
									DUPLICATE_NAME
								)
							} else {
								answerMap.put(answer.id, answer)
							}
						}
					}
				}
				if (question instanceof Multiple) {
					var m = question as Multiple
					for (Answer answer : m.options.filter(typeof(Answer))) {
						if (!answer.id.empty) {
							if (answerMap.containsKey(answer.id)) {
								error(
									'Answers within a Multiple must have unique IDs',
									answer,
									SurveyPackage.Literals.ANSWER__ID,
									DUPLICATE_NAME
								)
							} else {
								answerMap.put(answer.id, answer)
							}
						}
					}
				}
				if (question instanceof Table) {
					var t = question as Table
					for (Answer answer : t.options.filter(typeof(Answer))) {
						if (!answer.id.empty) {
							if (answerMap.containsKey(answer.id)) {
								error(
									'Answers within a Table must have unique IDs',
									answer,
									SurveyPackage.Literals.ANSWER__ID,
									DUPLICATE_NAME
								)
							} else {
								answerMap.put(answer.id, answer)
							}
						}
					}
				}
			}
		}
	}

/*
 * Check that the AnswerTemplates have unique IDs
 */
	@Check
	def checkThatAnswerTemplateIDsAreUnique(Survey survey) {
		var answerTemplateMap = new HashMap<String, AnswerTemplate>

		for (AnswerTemplate answerTemplate : survey.templates) {
			if (!answerTemplate.id.empty) {
				if (answerTemplateMap.containsKey(answerTemplate.id)) {
					error(
						'AnswerTemplates must have unique IDs',
						answerTemplate,
						SurveyPackage.Literals.ANSWER_TEMPLATE__ID,
						DUPLICATE_NAME
					)
				} else {
					answerTemplateMap.put(answerTemplate.id, answerTemplate)
				}
			}
		}
	}

/*
 * Check that the ID of answers in AnswerTemplates have unique IDs
 */
	@Check
	def checkThatIDsOfAnswersInAnswerTemplatesAreUnique(Survey survey) {
		var answerMap = new HashMap<String, Answer>

		for (AnswerTemplate answerTemplate : survey.templates) {
			for (Answer answer : answerTemplate.answers)
				if (!answer.id.empty) {
					if (answerMap.containsKey(answer.id)) {
						error(
							'Answers within AnswerTemplates must have unique IDs',
							answerTemplate,
							SurveyPackage.Literals.ANSWER__ID,
							DUPLICATE_NAME
						)
					} else {
						answerMap.put(answer.id, answer)
					}
				}
		}
	}
}
