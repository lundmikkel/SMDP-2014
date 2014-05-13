package dk.itu.smdp.survey.generator

import java.util.HashMap
import org.eclipse.xtext.generator.IFileSystemAccess
import survey.Answer
import survey.AnswerTemplateRef
import survey.Date
import survey.DateMode
import survey.Group
import survey.HasOptions
import survey.Item
import survey.Meta
import survey.Multiple
import survey.Number
import survey.Option
import survey.Question
import survey.Scale
import survey.Single
import survey.Survey
import survey.Table
import survey.TableQuestion
import survey.Text

class LatexTemplate extends SurveyTemplate {
	Survey survey
	IFileSystemAccess fsa
	HashMap<String, String> userToUnique
	HashMap<String, Meta> uniqueToMeta
	HashMap<Meta, String> metaToUnique
	
	val static abc = "abcdefghijklmnopqrstuvwxyz"
	
	new(Survey survey, IFileSystemAccess fsa) {
		this.survey = survey
		this.fsa = fsa
	}
	
	def Generate() {
		userToUnique = new HashMap<String, String>()
		uniqueToMeta = new HashMap<String, Meta>()
		metaToUnique = new HashMap<Meta, String>()
		
		survey.genUniqueIds
		
		/*val iter = userToUnique.entrySet().iterator();
	    while (iter.hasNext()) {
	        val pairs = iter.next() as Map.Entry<String, String>;
	        println(pairs.getKey() + " => " + pairs.getValue());
	    }
	    
	    println()
		
		val iter2 = uniqueToMeta.entrySet().iterator();
	    while (iter2.hasNext()) {
	        val pairs = iter2.next() as Map.Entry<String, Meta>;
	        println(pairs.getKey() + " => " + pairs.getValue());
	    }*/
		
		var body = '''
			«FOR item : survey.items»
				«item.genLatex("", false, "")»
				«IF item instanceof Question»
				\vspace*{10mm}\\
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
		val count = if (text.multi) 3 else 1
		
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
		\emph{«date.genLimitsDesc»}\\
		~\\
		~\\
		«date.genLatexDateFormat»
		'''
	}
	
	def genLatexDateFormat(Date date) {
		switch (date.mode) {
			case DateMode.DAY:
				'''
				\begin{tabular}{ c c c c c c }
					\smallpencil & \rule{60pt}{.3pt} & \Big / & \rule{60pt}{.3pt} & \Big / & \rule{80pt}{.3pt} \\
					& day & & month & & year \\
				\end{tabular}\\
				'''
			case DateMode.MONTH:
				'''
				\begin{tabular}{ c c c c }
					\smallpencil & \rule{60pt}{.3pt} & \Big / & \rule{80pt}{.3pt} \\
					& month & & year \\
				\end{tabular}\\
				'''
			case DateMode.YEAR:
				'''
				\begin{tabular}{ c c }
					\smallpencil & \rule{80pt}{.3pt} \\
					& year \\
				\end{tabular}\\
				'''
		} 
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
		\begin{enumerate}[label=\alph*:]
		«FOR a : question.getAnswers»
		\item \Square~ «a.title»
		«ENDFOR»
		«IF question.other || !question.otherLabel.nullOrEmpty»
		\item \Square~ «IF !question.otherLabel.nullOrEmpty»«question.otherLabel»:«ELSE»Other:«ENDIF»
		\smallpencil \hrulefill
		«ENDIF»
		\end{enumerate}
		'''
	}
	
	def dispatch genLatex(Multiple question, String dependsOn, boolean required, String pid) {
		'''
		«question.genHeader(dependsOn, required)»
		\emph{«question.genLimitsDesc»}
		\begin{enumerate}[label=\alph*:]
		«FOR a : question.getAnswers»
		\item \Square~ «a.title»
		«ENDFOR»
		«IF question.other || !question.otherLabel.nullOrEmpty»
		\item \Square~ «IF !question.otherLabel.nullOrEmpty»«question.otherLabel»:«ELSE»Other:«ENDIF»
		\smallpencil \hrulefill
		«ENDIF»
		\end{enumerate}
		'''
	}
	
	def dispatch genLatex(Table question, String dependsOn, boolean required, String pid) {
		val answers = question.getAnswers
		'''
		«question.genHeader(dependsOn, required)»
		\noindent
		\begin{tabular}{ r l «FOR a : answers»c «ENDFOR» }
		& «FOR i : 0..answers.length - 1»& \begin{sideways}«abc.charAt(i)»: «answers.get(i).title»\end{sideways} «ENDFOR» \\ \hline
		«FOR i : 0..question.questions.length - 1»
		«i + 1»: & «question.questions.get(i).title» «question.genRequired(required || question.questions.get(i).required)» «FOR a : answers»& \Square«ENDFOR» \\ \hline
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
	
	def genLabel(Meta meta) {
		if (metaToUnique.containsKey(meta)) {
			val unique = metaToUnique.get(meta)
			'''\label{sec«unique»}'''
		}
	}
	
	def genRequired(Question question, boolean requiredParent)
		'''«IF requiredParent || question.required»* «ENDIF»'''
	
	def genDependsOn(Item item, String parentDependsOn)
		'''«item.genDependsOnString(parentDependsOn)»«item.genDependsOnString(item.dependsOn)»'''
	
	def genDependsOnString(Item item, String dependsOn) {
		if (!dependsOn.nullOrEmpty) {
			val unique = userToUnique.get(dependsOn)
			var qid = unique
			var Meta meta = uniqueToMeta.get(unique)
			
			while (!(meta instanceof Question)) {
				qid = qid.substring(0, qid.lastIndexOf(":"))
				meta = uniqueToMeta.get(qid)
			}
			
			val question = meta as Question
			question.genDependsOnString(qid, unique)
		}
	}
	
	def dispatch genDependsOnString(Scale question, String qid, String uid) {
		val option = uid.substring(qid.length + 2, uid.length)
		("\\emph{" + option + "} in question \\emph{" + qid.ref + "}").genDependsOnString
	}
	
	def dispatch genDependsOnString(Table question, String qid, String uid) {
		val answer = uniqueToMeta.get(uid)
		val i = question.getAnswers.indexOf(answer)
		val letter = abc.charAt(i)
		
		val tbid = uid.substring(0, uid.lastIndexOf(":"))
		val tableQuestion = uniqueToMeta.get(tbid)
		val number = question.questions.indexOf(tableQuestion) + 1
		
		("\\emph{" + letter + "} in question \\emph{" + qid.ref + "." + number + "}").genDependsOnString
	}
	
	def dispatch genDependsOnString(HasOptions question, String qid, String uid) {
		val answer = uniqueToMeta.get(uid)
		val i = question.getAnswers.indexOf(answer)
		val letter = "abcdefghijklmnopqrstuvwxyz".charAt(i)
		
		("\\emph{" + letter + "} in question \\emph{" + qid.ref + "}").genDependsOnString
	}
	
	def dispatch genDependsOnString(Question question, String qid, String uid) {
		("\\emph{" + qid.ref + "}").genDependsOnString
	}
	
	def genDependsOnString(String string)
		'''\textbf{Please only answer if you answered «string»}\\'''
		
	def String ref(String s)
		'''\ref{sec«s»}'''
	
	
	def static String template(String title, String description, String body) {
		'''
		\documentclass{article}

		\usepackage{rotating}
		\usepackage{fullpage}
		\usepackage{dingbat}
		\usepackage{wasysym}
		\usepackage{enumitem}
		\usepackage{titling}
		
		\newcommand{\subtitle}[1]{%
		  \posttitle{%
		    \par\end{center}
		    \begin{center}\large#1\end{center}
		    \vskip0.5em}%
		}
		
		\begin{document}
		
		«IF !title.nullOrEmpty»
		\title{«title»}
		«ENDIF»
		«IF !description.nullOrEmpty»
		\subtitle{«description»}
		«ENDIF»
		
		\date{}
		\maketitle
		
		
		«body»
		
		\end{document}
		'''
	}
	
	int idCounter = 0
	
	def int getNextId() {
		idCounter = idCounter + 1
	}
	
	def getUserId(Meta meta, String pid) {
		if (!meta.name.nullOrEmpty) pid + "-" + meta.name else pid
	}
	
	def addUniqueMeta(String unique, Meta meta) {
		uniqueToMeta.put(unique, meta)
		metaToUnique.put(meta, unique)
	}
	
	def void genUniqueIds(Survey survey) {
		for (Item item : survey.items) {
			item.genUniqueIds("", "")
		}
	}
	
	def dispatch void genUniqueIds(Group group, String userPid, String uniquePid) {
		val userId = group.getUserId(userPid)
		val uniqueId = uniquePid + ":" + getNextId
		
		for (Question question : group.questions) {
			question.genUniqueIds(userId, uniqueId)
		}
	}
	
	def dispatch void genUniqueIds(Question question, String userPid, String uniquePid) {
		if (!question.name.nullOrEmpty) {
			val userId = question.getUserId(userPid).substring(1)
			val uniqueId = uniquePid + ":" + getNextId
			
			userToUnique.put(userId, uniqueId)
			addUniqueMeta(uniqueId, question)
		}
	}
	
	def dispatch void genUniqueIds(Scale scale, String userPid, String uniquePid) {
		if (!scale.name.nullOrEmpty) {	
			val userId = scale.getUserId(userPid)
			val uniqueId = uniquePid + ":" + getNextId
			addUniqueMeta(uniqueId, scale)
			
			for (int i : scale.min..scale.max) {
				val userAid = (userId + "-" + i).substring(1)
				val uniqueAid = uniqueId + ":_" + i
				
				userToUnique.put(userAid, uniqueAid)
			}
		}
	}
	
	def dispatch void genUniqueIds(Table table, String userPid, String uniquePid) {
		val userTid = table.getUserId(userPid)
		val uniqueTid = uniquePid + ":" + getNextId
		addUniqueMeta(uniqueTid, table)
		
		for (TableQuestion tableQuestion : table.questions.filter[!name.nullOrEmpty]) {
			val userTqid = tableQuestion.getUserId(userTid)
			val uniqueTqid = uniqueTid + ":" + getNextId
			addUniqueMeta(uniqueTqid, tableQuestion)
			
			for (Option option : table.options) {
				option.genUniqueIds(userTqid, uniqueTqid)
			}
		}
	}
	
	def dispatch void genUniqueIds(HasOptions question, String userPid, String uniquePid) {
		val userId = question.getUserId(userPid)
		val uniqueId = uniquePid + ":" + getNextId
		addUniqueMeta(uniqueId, question)
		
		for (Option option : question.options) {
			option.genUniqueIds(userId, uniqueId)
		}
	}
	
	def dispatch void genUniqueIds(AnswerTemplateRef templateRef, String userPid, String uniquePid) {
		// Skip if the question has no id
		if (!userPid.nullOrEmpty)
			for (Answer answer : templateRef.template.answers) {
				answer.genUniqueIds(userPid, uniquePid)
			}
	}
	
	def dispatch void genUniqueIds(Answer answer, String userPid, String uniquePid) {
		if (!answer.name.nullOrEmpty) {
			val userId = answer.getUserId(userPid).substring(1)
			val uniqueId = uniquePid + ":" + getNextId
			
			userToUnique.put(userId, uniqueId)
			addUniqueMeta(uniqueId, answer)
		}
	}
}