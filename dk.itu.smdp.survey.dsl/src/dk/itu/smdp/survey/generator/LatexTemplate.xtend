package dk.itu.smdp.survey.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import survey.Date
import survey.Group
import survey.Item
import survey.Multiple
import survey.Number
import survey.Question
import survey.Scale
import survey.Single
import survey.Survey
import survey.Table
import survey.Text

class LatexTemplate extends SurveyTemplate {
	Survey survey
	IFileSystemAccess fsa
	
	new(Survey survey, IFileSystemAccess fsa) {
		this.survey = survey
		this.fsa = fsa
	}
	
	def Generate() {
		var body = '''
			«FOR item : survey.items»
				«item.genLatex("", false, "")»
				«IF item instanceof Question»
				\vspace{10mm}
				«ENDIF»
			«ENDFOR»
		'''
		
		var template = template(survey.title, survey.description, body)
		val filename = (if (survey.name.nullOrEmpty) "index" else survey.name) + ".tex"
		fsa.generateFile(filename, template)
	}
	
	def dispatch genLatex(Group group, String dependsOn, boolean required, String pid) {
		val refId = if (group.name.nullOrEmpty) pid else pid + "-" + group.name
		
		'''
		«IF !group.title.nullOrEmpty»
		\section*{\underline{«group.title»}}
	    «ENDIF»
	    «group.genLabel»
	    «IF !group.description.nullOrEmpty »
	    «group.description»
	    «ENDIF»
		
		«FOR question : group.questions»
			«question.genLatex(group.dependsOn, group.required, refId)»
			\vspace{10mm}
		«ENDFOR»
		'''
	}
	
	def dispatch genLatex(Text text, String dependsOn, boolean required, String pid) {
		val count = if (text.multiline) 3 else 1
		
		'''
		«text.genHeader(dependsOn, required)»
		«FOR i : 1..count»
		«genWritingLine()»
		«ENDFOR»
		'''
	}
	
	def dispatch genLatex(Scale scale, String dependsOn, boolean required, String pid) {
		'''
		«scale.genHeader(dependsOn, required)»
		\noindent
		\begin{tabular}{ «IF !scale.minLabel.nullOrEmpty» r«ENDIF» «FOR i : scale.min..scale.max»c «ENDFOR»«IF !scale.maxLabel.nullOrEmpty»l «ENDIF» }
		    «FOR i : scale.min..scale.max»& «i» «ENDFOR»& \\ \hline
		    «scale.minLabel» «FOR i : scale.min..scale.max»& \Square «ENDFOR»& «scale.maxLabel»\\ \hline
		\end{tabular}
		'''
	}
	
	def dispatch genLatex(Date date, String dependsOn, boolean required, String pid) {
		'''
		«date.genHeader(dependsOn, required)»
		«genWritingLine()»
		Using this format: «date.genDateFormat». \emph{«date.genLimitsDesc»}
		'''
	}
	
	def dispatch genLatex(Number number, String dependsOn, boolean required, String pid) {
		'''
		«number.genHeader(dependsOn, required)»
		«genWritingLine()»
		\emph{«number.genLimitsDesc»}
		'''
	}
	
	def genWritingLine() '''
		~\newline
		\smallpencil
		\noindent \hrulefill \\
	'''
	
	def dispatch genLatex(Single question, String dependsOn, boolean required, String pid) {
		'''
		«question.genHeader(dependsOn, required)»
		\emph{Please choose one only}
		\begin{description}
		«FOR a : question.getAnswers»
		\item[\Square] «a.title»
		«ENDFOR»
		«IF question.other || !question.otherLabel.nullOrEmpty»
		\item[\Square] 
		«IF !question.otherLabel.nullOrEmpty»
		«question.otherLabel»:
		«ELSE»
		Other:
		«ENDIF»
		\smallpencil \hrulefill
		«ENDIF»
		\end{description}
		'''
	}
	
	def dispatch genLatex(Multiple question, String dependsOn, boolean required, String pid) {
		'''
		«question.genHeader(dependsOn, required)»
		\emph{«question.genLimitsDesc»}
		\begin{description}
		«FOR a : question.getAnswers»
		\item[\Square] «a.title»
		«ENDFOR»
		«IF question.other || !question.otherLabel.nullOrEmpty»
		\item[\Square] 
		«IF !question.otherLabel.nullOrEmpty»
		«question.otherLabel»:
		«ELSE»
		Other:
		«ENDIF»
		\smallpencil \hrulefill
		«ENDIF»
		\end{description}
		'''
	}
	
	def dispatch genLatex(Table question, String dependsOn, boolean required, String pid) {
		val answers = question.getAnswers
		'''
		«question.genHeader(dependsOn, required)»
		\noindent
		\begin{tabular}{ l «FOR a : answers»c «ENDFOR» }
		«FOR a : answers»& \begin{sideways}«a.title»\end{sideways} «ENDFOR» \\ \hline
		«FOR q : question.questions»
		«q.title» «question.genRequired(required || q.required)» «FOR a : answers»& \Square«ENDFOR» \\ \hline
		«ENDFOR»
		\end{tabular}
		'''
	}
	
	def genHeader(Question question, String parentDependsOn, boolean required) '''
		\section{«question.title» «question.genRequired(required)»}
		«question.genLabel»
		«question.genDependsOn(parentDependsOn)»
		«IF !question.description.nullOrEmpty»«question.description»\\«ENDIF»
	'''
	
	def genRequired(Question question, boolean requiredParent)
		'''«IF requiredParent || question.required»* «ENDIF»'''
	
	def genLabel(Item item)'''
		«IF !item.name.nullOrEmpty»
		\label{«item.name»}
		«ENDIF»
	'''
	
	def genDependsOn(Item item, String parentDependsOn) {
		// TODO: Write nice description	
		
		'''
		«IF !parentDependsOn.nullOrEmpty»
		Please only answer this question if you replied «» to question \#\ref{«parentDependsOn»} (group).\\
		«ENDIF»
		«IF !item.dependsOn.nullOrEmpty»
		Please only answer this question if you replied «» to question \#\ref{«item.dependsOn»}.\\
		«ENDIF»
		'''
	}
	
	def static String template(String title, String description, String body) {
		'''
		\documentclass{article}

		\usepackage{rotating}
		\usepackage{fullpage}
		\usepackage{dingbat}
		\usepackage{wasysym}
		
		\begin{document}
		
		«IF !title.nullOrEmpty»
		\title{«title»}
		«ENDIF»
		
		\date{}
		\maketitle
		
		«IF !description.nullOrEmpty»
		\noindent «description»
		«ENDIF»
		
		«body»
		
		\end{document}
		'''
	}
}