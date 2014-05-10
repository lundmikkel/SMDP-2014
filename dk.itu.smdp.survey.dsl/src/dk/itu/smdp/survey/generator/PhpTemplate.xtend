package dk.itu.smdp.survey.generator

import java.util.HashMap
import org.eclipse.xtext.generator.IFileSystemAccess
import survey.Answer
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

class PhpTemplate extends SurveyTemplate {
	int nextId = 0
	HashMap<Question, String> idMap = new HashMap<Question, String>()
	Survey survey
	IFileSystemAccess fsa
	
	new(Survey survey, IFileSystemAccess fsa) {
		this.survey = survey
		this.fsa = fsa
	}
	
	def Generate() {
		var body = '''
			«FOR item : survey.items»
				«item.genHtml("", false, "")»
			«ENDFOR»
		'''
		
		var template = template(survey.title, survey.description, body)
		val filename = (if (survey.name.nullOrEmpty) "index" else survey.name) + ".php"
		fsa.generateFile(filename, template)
	}
	
	def getUniqueId(Question question) {
		nextId = nextId + 1;
		var id = 'input' + nextId;
		idMap.put(question, id);
		return id;
	}
	def genRefIdAttr(String id, int i) '''
		«IF !id.nullOrEmpty»
		id="«id.substring(1)»-«i»"
		«ENDIF»
	'''
	
	def genRefIdAttr(String id, Answer a) '''
		«IF !id.nullOrEmpty || !a.name.nullOrEmpty»
		id="«(if (!id.nullOrEmpty) (id.substring(1)) + "-" else "") + a.name»"
		«ENDIF»
	'''
	
	def genRefIdAttr(String id) '''
		«IF !id.nullOrEmpty»
		id="«id.substring(1)»"
		«ENDIF»
	'''
	
	def genDateMinViewMode(Date question) {
		if (question.day)
			return 0
		if (question.month)
			return 1
		if (question.year)
			return 2
	}
	
	def genHiddenInput(Question question, String id) {
		genHiddenInputWithString(question.title, id)
	}
	
	def genHiddenInputWithString(String text, String id) '''
		<input type="hidden" name="«id»[question]" value="«text»" />
	'''
				
	def genRequiredAttr(Question question, boolean requiredParent)
		'''«IF requiredParent || question.required» required «ENDIF»'''
	
	def getMin(Multiple question, boolean required) {
		var min = if (question.min != null) question.min else 0
		if ((required || question.required) && min == 0)
			min = 1
		return min
	}
	
	def getMax(Multiple question, boolean required) {
		if (question.max != null) question.max.intValue else null
	}
	
	//data-rule-required="#«item.dependsOn»:checked"
	def genDependsOnAttr(Item item) '''
		«IF !item.dependsOn.nullOrEmpty»
		data-depends-on="«item.dependsOn»"
		«ENDIF»
	'''
	
	def genDependsOn(Question question) {
		val s = question.genLimitsDesc
		
		if (!s.nullOrEmpty) {
			'''<p class="help-block">«s»</p>'''
		}
	}
	
	def dispatch String genHtml(Group group, String dependsOn, boolean required, String pid) {
		val refId = if (group.name.nullOrEmpty) pid else pid + "-" + group.name
		'''
		<div class="group" «group.genDependsOnAttr»>
		    «IF !group.title.nullOrEmpty»
		    <h2>«group.title»</h2>
		    «ENDIF»
		    « IF !group.description.nullOrEmpty »
		    <p class="lead">«group.description»</p>
		    «ENDIF»
			«FOR question : group.questions»
				«question.genHtml("", group.required, refId)»
			«ENDFOR»
		</div>
		'''
	}
	
	def genHeader(Question question, boolean required) {
		question.genHeader(required, "")
	}
	
	def genHeader(Question question, boolean required, String extraAttributes) '''
		<label class="control-label" «extraAttributes»>
	        «question.title» «question.genRequiredLabel(required)»
	        «IF !question.description.nullOrEmpty»<p class="help-block">«question.description»</p>«ENDIF»
		</label>
		«IF !(question instanceof Table)»
		«question.genHiddenInput(idMap.get(question))»
		«ENDIF»
	'''
	
	def dispatch String genHtml(Text question, String dependsOn, boolean required, String pid) {
		var id = getUniqueId(question)
		var refId = if (question.name.nullOrEmpty) "" else pid + "-" + question.name
		if (refId.nullOrEmpty)
			refId = "-" + id
		
		'''
		<div class="form-group" «question.genDependsOnAttr»>
			«question.genHeader(required, '''for="«id»"''')»
		    <div class="row">
		        <div class="col-xs-4">
					«IF !question.multiline»
					<input class="form-control" «genRefIdAttr(refId)» name="«id»[answer]" «question.genRequiredAttr(required)»>
					«ELSE»
					<textarea class="form-control" «genRefIdAttr(refId)» name="«id»[answer]" rows="3" «question.genRequiredAttr(required)»></textarea>
					«ENDIF»
		        </div>
		    </div>
		</div>
		'''
	}
	
	def dispatch String genHtml(Scale question, String dependsOn, boolean required, String pid) {
		val id = getUniqueId(question)
		// For label references
		if (question.name.nullOrEmpty)
			question.name = id
		val refId = pid + "-" + question.name
		
		'''
	    <div class="form-group" «question.genDependsOnAttr»>
	    	«question.genHeader(required)»
	        <table class="scale">
	            <tr class="top">
	            	«IF !question.minLabel.nullOrEmpty »
	            	<td></td>
	                «ENDIF»
	                «FOR i : question.min..question.max BEFORE '<td>' SEPARATOR '</td><td>' AFTER '</td>' »
	                <label for="«refId.substring(1)»-_«i»">«i»</label>
	                «ENDFOR»
	            	«IF !question.minLabel.nullOrEmpty »
	            	<td></td>
	                «ENDIF»
	            </tr>
	            <tr class="bottom">
	            	«IF !question.minLabel.nullOrEmpty »
	            	<td><label for="«refId.substring(1)»-_«question.min»">«question.minLabel»</label></td>
	                «ENDIF»
	                «FOR i : question.min..question.max BEFORE '<td>' SEPARATOR '</td><td>' AFTER '</td>' »
	                <input type="radio" name="«id»[answer]" «genRefIdAttr(refId, i)» value="«i»" «question.genRequiredAttr(required)»/>
	                «ENDFOR»
	            	«IF !question.minLabel.nullOrEmpty »
	            	<td><label for="«refId.substring(1)»-_«question.max»">«question.maxLabel»</label></td>
	                «ENDIF»
	            </tr>
	        </table>
	    </div>
		'''
	}
	def dispatch String genHtml(Date question, String dependsOn, boolean required, String pid) {
		val id = getUniqueId(question)
		val refId = if (question.name.nullOrEmpty) "" else pid + "-" + question.name
		
		'''
		<div class="form-group" «question.genDependsOnAttr»>
			«question.genHeader(required, '''for="«id»"''')»
		    <div class="row">
		        <div class="col-xs-4">
				    <div class="input-group date"
				    	data-date-format="«question.genDateFormat»"
				    	data-date-min-view-mode="«question.genDateMinViewMode»"
				    	«IF !question.start.nullOrEmpty»data-date-start-date="«question.start»"«ENDIF»
				    	«IF !question.end.nullOrEmpty»data-date-end-date="«question.end»"«ENDIF»
				    	>
						<input «genRefIdAttr(refId)» name="«id»[answer]" type="text" class="form-control" «question.genRequiredAttr(required)»>
						<span class="input-group-addon">
							<i class="glyphicon glyphicon-calendar"></i>
						</span>
					</div>
				</div>
				«IF question.showLimits»
				«question.genDependsOn»
				«ENDIF»
		    </div>
		</div>
		'''
	}
	
	def dispatch String genHtml(Number question, String dependsOn, boolean required, String pid) {
		var id = getUniqueId(question);
		val refId = if (question.name.nullOrEmpty) "" else pid + "-" + question.name
		
		'''
		<div class="form-group" «question.genDependsOnAttr»>
	    	«question.genHeader(required, '''for="«id»"''')»
		    <div class="row">
		        <div class="col-xs-2">
		            <input type="number" class="form-control"  «genRefIdAttr(refId)» name="«id»[answer]" «question.genRequiredAttr(required)» step="1"
		            «IF question.min != null»
		            min="«question.min»" data-rule-min="«question.min»"
		            «ENDIF»
		            «IF question.max != null»
		            max="«question.max»" data-rule-max="«question.max»"
		            «ENDIF»
		            >
		        </div>
		    </div>
            «IF question.showLimits»
            «question.genDependsOn»
            «ENDIF»
		</div>
		'''
	}
	
	def dispatch String genHtml(Single question, String dependsOn, boolean required, String pid) {
		var id = getUniqueId(question);
		val refId = if (question.name.nullOrEmpty) "" else pid + "-" + question.name
		
		'''
		<div class="form-group" «question.genDependsOnAttr»>
	    	«question.genHeader(required)»
			<div>
				«FOR a : question.getAnswers BEFORE '<div class="radio"><label>'
											 SEPARATOR '</label></div><div class="radio"><label>'
											 AFTER '</label></div>' »
				<input
					type="radio"
					name="«id»[answer][]"
					«genRefIdAttr(refId, a)»
					value="«a.title»"
					«question.genRequiredAttr(required)»
				/>
				«a.title»
				«ENDFOR»
				«IF question.other || !question.otherLabel.nullOrEmpty»
				<div class="radio">
				<input type="radio" name="«id»[answer][]" value="" «question.genRequiredAttr(required)»/>
				«IF !question.otherLabel.nullOrEmpty»
				«question.otherLabel»:
				«ELSE»
				Other:
				«ENDIF»
				<input class="other-option" type="text" name="«id»[answer][]"/>
				</div>
				«ENDIF»
			</div>
		</div>
		'''
	}
		
	def dispatch String genHtml(Multiple question, String dependsOn, boolean required, String pid) {
		val id = getUniqueId(question);
		val min = question.getMin(required)
		val max = question.getMax(required)
		val refId = if (question.name.nullOrEmpty) pid else pid + "-" + question.name
		val answers = question.getAnswers
		
		'''
		<div class="form-group">
			«question.genDependsOnAttr»
	    	«question.genHeader(required || min > 0)»
		    «FOR a : answers»
		    <div class="checkbox">
			    <label>
				    <input
				    	type="checkbox"
				    	name="«id»[answer][]"
				    	«genRefIdAttr(refId, a)»
				    	value="«a.title»"
						«question.genRequiredAttr(required || min > 0)»
						«IF min > 0» data-rule-minlength="«min»" «ENDIF»
						«IF max != null» data-rule-maxlength="«max»" «ENDIF»
					/>
			    	«a.title»
			    </label>
		    </div>
			«ENDFOR»
			«IF question.other || !question.otherLabel.nullOrEmpty»
			<div class="checkbox">
			<input type="checkbox" name="«id»[answer][]" value="" «question.genRequiredAttr(required || min > 0)»/>
			«IF !question.otherLabel.nullOrEmpty»
			«question.otherLabel»:
			«ELSE»
			Other:
			«ENDIF»
			<input class="other-option" type="text" name="«id»[answer][]"/>
			</div>
			«ENDIF»
			«IF question.showLimits»
			«question.genDependsOn»
			«ENDIF»
		</div>
		'''
	}
	
	def dispatch String genHtml(Table question, String dependsOn, boolean required, String pid) {
		val answers = question.getAnswers
		'''
		<div class="form-group" «question.genDependsOnAttr»>
	    	«question.genHeader(required)»
		    <table class="table table-striped">
		    	<thead>
					<tr>
						<th></th>
						«FOR a : answers»
						<th>«a.title»</th>
						«ENDFOR»
					</tr>
				</thead>
				<tbody>
					«FOR q : question.questions»
					<tr>
					    <td><label for="«var qid = getUniqueId(question)»">«q.title» «question.genRequiredLabel(required || q.required)»</label></td>
					    «genHiddenInputWithString(q.title, qid)»
					    «FOR a : answers»
					    <td>
					    <input
					    	type="«IF question.multiple»checkbox«ELSE»radio«ENDIF»"
					    	name="«qid»[answer]"
					    	value="«a.title»"
					    	«genRefIdAttr(if (q.name.nullOrEmpty) pid else pid + "-" + q.name, a)»
					    	«question.genRequiredAttr(required || q.required)»
					    /></td>
					    «ENDFOR»
					</tr>
				    «ENDFOR»
				</tbody>
			</table>
		</div>
		'''
	}
	
	def String template(String title, String description, String formContent) {
		'''
		<!DOCTYPE html>
		<html lang="en">
		    <head>
		        <meta charset="utf-8">
		        <meta http-equiv="X-UA-Compatible" content="IE=edge">
		        <meta name="viewport" content="width=device-width, initial-scale=1">
		        <title>«title»</title>
		        <!-- Bootstrap -->
		        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
		        <link href="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" rel="stylesheet">
		        <style media="screen" type="text/css">«css()»</style>
		        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
		        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		        <!--[if lt IE 9]>
		        <script src="//oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		        <script src="//oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
		        <![endif]-->
		    </head>
		
		    <body>
		    	<div class="container">
		    		<div class="row">
						
						<?php
						if ($_POST):
						?>
			                <div id="header">
		                		«IF !title.nullOrEmpty»<h1 class="page-header">«title»</h1>«ENDIF»
		                		<p class="lead">Thanks for submitting your answer</p>
							</div>
			    		<?php
			    		
			    		$s = '<dl>';
			    		
						foreach ($_POST as $array) {
							// No answer
							if (!isset($array['answer']) || empty($array['answer'])) {
								continue;
							}
							
							// Print question text
							$s .= '<dt>' . $array['question'] . '</dt>';
							
							// Print answer(s)
							$answers = $array['answer'];
							if (is_array($answers)) {
								foreach ($answers as $answer) {
									// Skip empty answers
									if (empty($answer)) {
										continue;
									}
									
									$s .= '<dd>' . $answer . '</dd>';
								}
							}
							else {
								$s .= '<dd>' . $answers . '</dd>';
							}
						}
						$s .= '</dl>';
						
			    		echo '<div class="well">' . $s . '</div>';
						
						else:
						?>
		                <div id="header">
		                	«IF !title.nullOrEmpty»<h1 class="page-header">«title»</h1>«ENDIF»
		                	«IF !description.nullOrEmpty»<p class="lead">«description»</p>«ENDIF»
						</div>
		                <form id="form" role="form" method="post">
							«formContent»
		                    <hr/>
		                    <div class="form-group">
		                        <button type="submit" class="btn btn-success btn-lg">Submit</button>
		                        <button type="reset" class="btn btn-danger btn-lg">Reset</button>
		                    </div>
						</form>
						<?php endif; ?>
		            </div>
		        </div>

		        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
		        <!-- Include all compiled plugins (below), or include individual files as needed -->
		        <script src="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
				<script src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.js"></script>
				<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.12.0/jquery.validate.min.js"></script>
				
		        <script type="text/javascript">
		            $( document ).ready(function() {«js()»});
		        </script>
			</body>
		</html>
		'''
	}
	
	def css() '''
		.group {
			margin-bottom: 20px;
		}
		
		input[type=checkbox]~label.error,
		input[type=radio]~label.error {
			display: none !important;
		}
		
		.form-group {
			margin-bottom: 50px;
		}
		
		input[type=number] {
			text-align: right;
		}
		
		#header {
			margin-bottom: 30px;
		}
		
		#header .page-header {
			margin-bottom: 10px;
		}
		
		#header h1 {
			font-size: 60px;
		}
		
		h2 + p.lead {
			/*font-size: 21px;*/
			margin-bottom: 30px;
			margin-top: -5px;
		}
		
		label.control-label {
			font-size: 16px;
		}
		
		label .help-block {
			font-size: 85%;
		}
		
		.table {
			min-width: 50%; width: auto;
		}
		
		table.scale td {
			padding: 8px;
			text-align: center;
		}
		
		table.scale .top td {
			padding-bottom: 0;
		}
		
		table.scale .bottom {
			border-top: 1px solid #DDD;
			border-bottom: 1px solid #DDD;
		}
		
		form hr {
			margin-top: 30px;
		}
    '''
    
    def js() '''
		$('.input-group.date').datepicker({
			autoclose: true,
			todayHighlight: true,
			todayBtn: true
		});
		
		$('.other-option')
			.focus(function() {
				$(this).siblings(':radio, :checkbox').prop('checked', true);
			})
			.blur(function() {
				if(!$(this).val()) {
					$(this).siblings(':radio, :checkbox').prop('checked', false);
				}
			});
		
		$("[data-depends-on]").each(function() {
		    var _this = $(this);
		
		    _this.hide();
		
		    var dependsOnId = $(this).attr("data-depends-on");
		    var dependsOn = $("#" + dependsOnId);
		
		    switch (dependsOn.attr("type")) {
		        case "radio":
		            {
		                $("input[name='" + dependsOn.attr("name") + "']:radio").change(function () {
		                    if ($(this).attr("id") == dependsOnId)
		                        _this.show();
		                    else
		                        _this.hide();
		                });
		            }
		            
		        case "checkbox":
		            {
		                dependsOn.change(function() {
		                	if ($(this).prop('checked'))
		                		_this.show();
	                		else
	                			_this.hide();
	                	});
		            }
		            break;
	            
	            default:
	            	{
	            		dependsOn.bind("propertychange keyup input paste", function() {
		                	if ($(this).val())
		                		_this.show();
	                		else
	                			_this.hide();
	                	});
            		}
		    }
		});
		
		var $form = $("form");
		$form.validate();
		
		$form.submit(function (event) {
			var validate = $form.validate(); 
			
				
			if (!validate.valid()) {
				event.preventDefault();
			}
		});
	'''
}