package dk.itu.smdp.survey.generator

class PhpTemplate {
	def static String template(String title, String description, String formContent) {
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
			                <div>
		                		«IF !title.nullOrEmpty»<h1>«title»</h1>«ENDIF»
		                		<p class="lead">Thanks for submitting your answer</p>
							</div>
			    		<?php
						
						echo '<dl class="dl-horizontal">';
						foreach ($_POST as $key => $value) {
							// Question
							if (strpos($key,'_question') !== false) {
								echo '<dt>', $value, '</dt>';
							}
							// Answer
							else {
								echo '<dd>', $value, '</dd>';
							}
						}
						echo '</dl>';
						
						else:
						?>
		                <div>
		                	«IF !title.nullOrEmpty»<h1>«title»</h1>«ENDIF»
		                	«IF !description.nullOrEmpty»<p class="lead">«description»</p>«ENDIF»
						</div>
		                <form role="form" method="post">
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
				
		        <script type="text/javascript">
		            $( document ).ready(function() {«js()»});
		        </script>
			</body>
		</html>
		'''
	}
	
	def static css() '''
		.group {
			margin-bottom: 20px;
			margin-top: 50px;
		}
		
		input[type=number] {
			text-align: right;
		}
		
		h2 + p.lead {
			font-size: 21px;
			margin-bottom: 30px;
			margin-top: -15px;
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
		
		form .form-group + .form-group {
			padding-top: 15px;
		}
		
		form hr {
			margin-top: 30px;
		}
    '''
    
    def static js() '''
		$('.input-group.date').datepicker({
			autoclose: true,
			todayHighlight: true,
			todayBtn: true
		});
		
		$("[data-depends-on]").each(function() {
		    var _this = $(this);
		
		    _this.hide();
		
		    var dependsOnId = $(this).attr("data-depends-on");
		    var dependsOn = $("#" + dependsOnId);
		
		    switch (dependsOn.attr("type")) {
		        case "radio":
		            {
		                $("input[name=" + dependsOn.attr("name") + "]:radio").change(function () {
		                    if ($(this).attr("id") == dependsOnId)
		                        _this.show();
		                    else
		                        _this.hide();
		                });
		            }
		            break;
		    }
		});
	'''
}