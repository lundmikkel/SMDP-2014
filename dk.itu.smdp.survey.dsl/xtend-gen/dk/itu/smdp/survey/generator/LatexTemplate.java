package dk.itu.smdp.survey.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class LatexTemplate {
  public static String template(final String title, final String description, final String body) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\documentclass{article}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\usepackage{amssymb}");
    _builder.newLine();
    _builder.append("\\usepackage{rotating}");
    _builder.newLine();
    _builder.append("\\usepackage{fullpage}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{document}");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(title);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("\\title{");
        _builder.append(title, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\\date{}");
    _builder.newLine();
    _builder.append("\\maketitle");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(description);
      boolean _not_1 = (!_isNullOrEmpty_1);
      if (_not_1) {
        _builder.append("\\noindent ");
        _builder.append(description, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\end{document}");
    _builder.newLine();
    return _builder.toString();
  }
}
