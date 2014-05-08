package dk.itu.smdp.survey.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class PhpTemplate {
  public static String template(final String title, final String description, final String formContent) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<title>");
    _builder.append(title, "        ");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("<!-- Bootstrap -->");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<link href=\"http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css\" rel=\"stylesheet\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<link href=\"http://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css\" rel=\"stylesheet\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<style media=\"screen\" type=\"text/css\">");
    CharSequence _css = PhpTemplate.css();
    _builder.append(_css, "        ");
    _builder.append("</style>");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<!-- WARNING: Respond.js doesn\'t work if you view the page via file:// -->");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<!--[if lt IE 9]>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<script src=\"//oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<script src=\"//oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<![endif]-->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</head>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("    \t\t");
    _builder.append("<div class=\"row\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<?php");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if ($_POST):");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("?>");
    _builder.newLine();
    _builder.append("\t                ");
    _builder.append("<div id=\"header\">");
    _builder.newLine();
    _builder.append("                \t\t");
    {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(title);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("<h1 class=\"page-header\">");
        _builder.append(title, "                		");
        _builder.append("</h1>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("                \t\t");
    _builder.append("<p class=\"lead\">Thanks for submitting your answer</p>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.append("<?php");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.append("/*echo \'<pre>\';");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("print_r($_POST);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("echo \'</pre>\';*/");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.append("echo \'<div class=\"well\"><dl>\';");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("foreach ($_POST as $array) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// No answer");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("if (!isset($array[\'answer\']) || empty($array[\'answer\'])) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("continue;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("/*echo \'<pre>\';");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("print_r($array);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("echo \'</pre>\';*/");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// Print question text");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("echo \'<dt>\', $array[\'question\'], \'</dt>\';");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// Print answer(s)");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("$answers = $array[\'answer\'];");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("if (is_array($answers)) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("foreach ($answers as $answer) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("// Skip empty answers");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("if (empty($answer)) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.append("continue;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("echo \'<dd>\', $answer, \'</dd>\';");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("echo \'<dd>\', $answers, \'</dd>\';");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("echo \'</dl></div>\';");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("?>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<div id=\"header\">");
    _builder.newLine();
    _builder.append("                \t");
    {
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(title);
      boolean _not_1 = (!_isNullOrEmpty_1);
      if (_not_1) {
        _builder.append("<h1 class=\"page-header\">");
        _builder.append(title, "                	");
        _builder.append("</h1>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("                \t");
    {
      boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(description);
      boolean _not_2 = (!_isNullOrEmpty_2);
      if (_not_2) {
        _builder.append("<p class=\"lead\">");
        _builder.append(description, "                	");
        _builder.append("</p>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<form id=\"form\" role=\"form\" method=\"post\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append(formContent, "					");
    _builder.newLineIfNotEmpty();
    _builder.append("                    ");
    _builder.append("<hr/>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<div class=\"form-group\">");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<button type=\"submit\" class=\"btn btn-success btn-lg\">Submit</button>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<button type=\"reset\" class=\"btn btn-danger btn-lg\">Reset</button>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</form>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<?php endif; ?>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<!-- jQuery (necessary for Bootstrap\'s JavaScript plugins) -->");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<!-- Include all compiled plugins (below), or include individual files as needed -->");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<script src=\"https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"http://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.12.0/jquery.validate.min.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<script type=\"text/javascript\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("$( document ).ready(function() {");
    CharSequence _js = PhpTemplate.js();
    _builder.append(_js, "            ");
    _builder.append("});");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static CharSequence css() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".group {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin-bottom: 20px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("input[type=checkbox]~label.error,");
    _builder.newLine();
    _builder.append("input[type=radio]~label.error {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("display: none !important;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".form-group {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin-bottom: 50px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("input[type=number] {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("text-align: right;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#header {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin-bottom: 30px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#header .page-header {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin-bottom: 10px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#header h1 {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("font-size: 60px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("h2 + p.lead {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*font-size: 21px;*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin-bottom: 30px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin-top: -5px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("label.control-label {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("font-size: 16px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("label .help-block {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("font-size: 85%;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".table {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("min-width: 50%; width: auto;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("table.scale td {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("padding: 8px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("text-align: center;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("table.scale .top td {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("padding-bottom: 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("table.scale .bottom {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-top: 1px solid #DDD;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("border-bottom: 1px solid #DDD;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("form hr {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin-top: 30px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence js() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$(\'.input-group.date\').datepicker({");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("autoclose: true,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("todayHighlight: true,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("todayBtn: true");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("$(\'.other-option\')");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".focus(function() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("$(this).siblings(\':radio, :checkbox\').prop(\'checked\', true);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("})");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".blur(function() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(!$(this).val()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("$(this).siblings(\':radio, :checkbox\').prop(\'checked\', false);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("$(\"[data-depends-on]\").each(function() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var _this = $(this);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("_this.hide();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var dependsOnId = $(this).attr(\"data-depends-on\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var dependsOn = $(\"#\" + dependsOnId);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("switch (dependsOn.attr(\"type\")) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("case \"radio\":");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("$(\"input[name=\'\" + dependsOn.attr(\"name\") + \"\']:radio\").change(function () {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("if ($(this).attr(\"id\") == dependsOnId)");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("_this.show();");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("else");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("_this.hide();");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("});");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("case \"checkbox\":");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("dependsOn.change(function() {");
    _builder.newLine();
    _builder.append("                \t");
    _builder.append("if ($(this).prop(\'checked\'))");
    _builder.newLine();
    _builder.append("                \t\t");
    _builder.append("_this.show();");
    _builder.newLine();
    _builder.append("\t                \t\t");
    _builder.append("else");
    _builder.newLine();
    _builder.append("\t                \t\t\t");
    _builder.append("_this.hide();");
    _builder.newLine();
    _builder.append("\t                \t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("\t            \t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t            \t\t");
    _builder.append("dependsOn.bind(\"propertychange keyup input paste\", function() {");
    _builder.newLine();
    _builder.append("                \t");
    _builder.append("if ($(this).val())");
    _builder.newLine();
    _builder.append("                \t\t");
    _builder.append("_this.show();");
    _builder.newLine();
    _builder.append("\t                \t\t");
    _builder.append("else");
    _builder.newLine();
    _builder.append("\t                \t\t\t");
    _builder.append("_this.hide();");
    _builder.newLine();
    _builder.append("\t                \t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("            \t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("var $form = $(\"form\");");
    _builder.newLine();
    _builder.append("$form.validate();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("$form.submit(function (event) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var validate = $form.validate(); ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (!validate.valid()) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("event.preventDefault();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
}
