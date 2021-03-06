package dk.itu.smdp.survey.generator

import java.util.ArrayList
import survey.Answer
import survey.AnswerTemplateRef
import survey.Date
import survey.HasOptions
import survey.Multiple
import survey.Number
import survey.Option
import survey.Question
import survey.Item
import survey.Group
import survey.Survey
import survey.DateMode

abstract class SurveyTemplate {
	def genDateFormat(Date question) {
		switch (question.mode) {
			case DateMode.DAY:
				'''dd/mm/yyyy'''
			
			case DateMode.MONTH:
				'''mm/yyyy'''
				
			case DateMode.YEAR:
				'''yyyy'''
		}
	}
	
	def dispatch String genLimitsDesc(Date question) {
		val start = question.start
		val end = question.end
		
		if (!start.nullOrEmpty && !end.nullOrEmpty)
			'''The date must be between «start» and «end»'''
		else if (!end.nullOrEmpty)
			'''The date must be before «end»'''
		else if (!start.nullOrEmpty)
			'''The date must be after «start»'''
	}
	
	def dispatch String genLimitsDesc(Number question) {
		val min = question.min
		val max = question.max
		
		if (min != null && max != null) {
			'''The value must be between «min» and «max» (both included)'''
		}
		else if (min != null) {
			switch(min) {
				case 0:
					'''The value must be non-negative'''
				case 1:
					'''The value must be positive'''
				default:
					'''The value must be larger than or equal to «min»'''
			}
		}
		else if (max != null) {
			switch(max) {
				case -1:
					'''The value must be negative'''
				default:
					'''The value must be less than or equal to «max»'''
			}
		}
	}
	
	def dispatch String genLimitsDesc(Multiple question) {
		val min = question.min
		val max = question.max

		if (min != null && max != null) {
			if (min.intValue == max.intValue)
				'''Select «min» options'''
			else
				'''Select between «min» and «max» options'''
		}
		else if (min != null)
			'''Select at least «min» options'''
		else if (max != null)
			'''Select at most «min» options'''
	}
	
	def getAnswers(HasOptions hasOptions) {
		var answers = new ArrayList<Answer>()
		
		for (Option option : hasOptions.options) {
			if (option instanceof Answer) {
				answers.add(option as Answer)
			}
			else if (option instanceof AnswerTemplateRef) {
				for (Answer answer : (option as AnswerTemplateRef).template.answers) {
					answers.add(answer)
				}
			}
		}
		
		return answers
	}
	
	def getQuestions(Survey survey) {
		var questions = new ArrayList<Question>()
		
		for (Item item : survey.items) {
			if (item instanceof Question) {
				questions.add(item as Question)
			}
			else if (item instanceof Group) {
				for (Question question : (item as Group).questions) {
					questions.add(question)
				}
			}
		}
		
		return questions
	}
	
	def genRequiredLabel(Question question, boolean requiredParent)
		'''«IF requiredParent || question.required»* «ENDIF»'''
}