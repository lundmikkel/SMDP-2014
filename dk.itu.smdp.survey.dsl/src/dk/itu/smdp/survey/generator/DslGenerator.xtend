/*
 * generated by Xtext
 */
package dk.itu.smdp.survey.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import survey.*
import com.google.common.collect.DiscreteDomains.BigIntegerDomain

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class DslGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var survey = resource.contents.head as Survey
		
		survey.genHtml(fsa)
		survey.genLatex(fsa)
	}
	
	def genHtml(Survey survey, IFileSystemAccess fsa) {
		var template = '''
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>«survey.title»</title>
        <!-- Bootstrap -->
        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
        <style media="screen" type="text/css">
            .group { margin-bottom: 20px; margin-top: 50px; }
            input[type=number] { text-align: right; }
            h2 + p.lead { font-size: 21px; margin-bottom: 30px; margin-top: -15px; }
            label.control-label { font-size: 16px; }
            label .help-block { font-size: 85%; }
            table.scale td { padding: 8px; text-align: center; }
            table.scale .top td { padding-bottom: 0; }
            table.scale .bottom { border-top: 1px solid #DDD; border-bottom: 1px solid #DDD; }
            form .form-group + .form-group { padding-top: 15px; }
            form hr { margin-top: 30px; }
        </style>
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>
    	<div class="container">
            <div class="row">
                <div> <h1>«survey.title»</h1> <p class="lead">«survey.description»</p> </div>
                <form role="form">
					«FOR item : survey.items»
						«item.genHtml»
					«ENDFOR»
                    <hr/>
                    <div class="form-group">
                        <button type="submit" class="btn btn-success btn-lg">Submit</button>
                        <button type="reset" class="btn btn-danger btn-lg">Reset</button>
                    </div>
				</form>
            </div>
        </div>
	</body>
</html>
		'''
		
		fsa.generateFile("survey.html", template)
	}
	
	// TODO: Make sure all items in group are required
	def dispatch String genHtml(Group group) '''
<div class="group">
    «IF !group.title.nullOrEmpty»
    <h2 id="grid" class="page-header">«group.title»</h2>
    «ENDIF»
    « IF !group.description.nullOrEmpty »
    <p class="lead">«group.description»</p>
    «ENDIF»
	«FOR question : group.questions»
		«question.genHtml»
	«ENDFOR»
</div>
	'''
	
	def dispatch String genHtml(Text question) {
		// TODO: Get id
		var id = 'name'
		
		'''
<div class="form-group">
    <label for="«id»" class="control-label">
        «question.title»
        «question.genQuestionDesc»
    </label>
    <div class="row">
        <div class="col-xs-4">
			«IF !question.multiline»
			<input class="form-control" id="«id»" «question.genRequired»>
			«ELSE»
			<textarea class="form-control" id="«id»" «question.genRequired» rows="3"></textarea>
			«ENDIF»
        </div>
    </div>
</div>
		'''
	}
	
	def dispatch String genHtml(Scale question) {
		// TODO: Get id 
		var id ='radio_1'
		
		'''
<div class="group">
    <div class="form-group">
        <label class="control-label">
	        «question.title»
	        «question.genQuestionDesc»
        </label>
        <table class="scale">
            <tr class="top">
                <td></td>
                «FOR i : question.lower..question.upper BEFORE '<td>' SEPARATOR '</td><td>' AFTER '</td>' »
                <label for="«id»_«i»">«i»</label>
                «ENDFOR»
                <td></td>
            </tr>
            <tr class="bottom">
                <td><label for="«id»_«question.lower»">«question.lowerLabel»</label></td>
                
                «FOR i : question.lower..question.upper BEFORE '<td>' SEPARATOR '</td><td>' AFTER '</td>' »
                <input type="radio" name="«id»" id="«id»_«i»" value="«i»" />
                «ENDFOR»
                <td><label for="«id»_«question.upper»">«question.upperLabel»</label></td>
            </tr>
        </table>
    </div>
</div>
		'''
	}
	
	def dispatch String genHtml(Number question) {
		// TODO: Get id 
		var id ='children'
		
		// TODO: Generate min/max, step, value
		'''
<div class="form-group">
    <label for="«id»" class="control-label">
        «question.title»
        «question.genQuestionDesc»
    </label>
    <div class="row">
        <div class="col-xs-2">
            <input type="number" class="form-control" id="«id»" «question.genRequired» min="0" step="1" value="0">
        </div>
    </div>
</div>
		'''
	}
	
	/*def dispatch String genHtml(Single question) {
		var id = 'question'
		question.options.get(0);
		
		'''
<div class="form-group">
    <label class="control-label">
    	«question.title»
    	«question.genQuestionDesc»
    </label>
    <div>
    	«FOR i : 0..question.options.size BEFORE '<div class="radio"><label>' SEPARATOR '</label></div><div class="radio"><label>' AFTER '</label></div>' »
        <input type="radio" name="«id»" id="«id»_«i»" value="«i»" />
        «(question.options.get(i) as Option).»	
        «ENDFOR»
        <div class="radio">
            <label>
                <input type="radio" name="«id»" id="«id»_«i»" value="male" />
                Male
            </label>
        </div>
        <div class="radio">
            <label>
                <input type="radio" name="radio_1" id="radio_sex_2" value="female" />
                Female
            </label>
        </div>
        <div class="radio">
            <label>
                <input type="radio" name="radio_1" id="radio_sex_2" value="option3" />
                <input class="form-control input-sm" id="name">
            </label>
        </div>
    </div>
</div>
		'''
	}*/
	
	def dispatch String genHtml(Question question) '''
		«question.title»
	'''
	
	def genQuestionDesc(TitleAndDescription item) '''
	«IF !item.description.nullOrEmpty»
	<p class="help-block">«item.description»</p>
	«ENDIF»
	'''
	
	def genRequired(Item item) '''
	«IF item.required» required «ENDIF»
	'''
	
	def genLatex(Survey survey, IFileSystemAccess fsa) {
		fsa.generateFile("survey.tex", "Something something")
	}
}
