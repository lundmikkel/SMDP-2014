package dk.itu.smdp.survey.generator

class LatexTemplate {
	def static String template(String title, String description, String body) {
		'''
		\documentclass{article}

		\usepackage{amssymb}
		\usepackage{rotating}
		\usepackage{fullpage}
		
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