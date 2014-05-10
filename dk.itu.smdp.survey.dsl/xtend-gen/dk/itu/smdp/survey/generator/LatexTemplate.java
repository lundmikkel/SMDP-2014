package dk.itu.smdp.survey.generator;

import dk.itu.smdp.survey.generator.SurveyTemplate;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import survey.Answer;
import survey.Date;
import survey.Group;
import survey.Item;
import survey.Multiple;
import survey.Question;
import survey.Scale;
import survey.Single;
import survey.Survey;
import survey.Table;
import survey.TableQuestion;
import survey.Text;

@SuppressWarnings("all")
public class LatexTemplate extends SurveyTemplate {
  private Survey survey;
  
  private IFileSystemAccess fsa;
  
  public LatexTemplate(final Survey survey, final IFileSystemAccess fsa) {
    this.survey = survey;
    this.fsa = fsa;
  }
  
  public void Generate() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Item> _items = this.survey.getItems();
      for(final Item item : _items) {
        CharSequence _genLatex = this.genLatex(item, "", false, "");
        _builder.append(_genLatex, "");
        _builder.newLineIfNotEmpty();
        {
          if ((item instanceof Question)) {
            _builder.append("\\vspace{10mm}");
            _builder.newLine();
          }
        }
      }
    }
    String body = _builder.toString();
    String _title = this.survey.getTitle();
    String _description = this.survey.getDescription();
    String template = LatexTemplate.template(_title, _description, body);
    String _xifexpression = null;
    String _name = this.survey.getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
    if (_isNullOrEmpty) {
      _xifexpression = "index";
    } else {
      String _name_1 = this.survey.getName();
      _xifexpression = _name_1;
    }
    final String filename = (_xifexpression + ".tex");
    this.fsa.generateFile(filename, template);
  }
  
  protected CharSequence _genLatex(final Group group, final String dependsOn, final boolean required, final String pid) {
    CharSequence _xblockexpression = null;
    {
      String _xifexpression = null;
      String _name = group.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        _xifexpression = pid;
      } else {
        String _plus = (pid + "-");
        String _name_1 = group.getName();
        String _plus_1 = (_plus + _name_1);
        _xifexpression = _plus_1;
      }
      final String refId = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      {
        String _title = group.getTitle();
        boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_title);
        boolean _not = (!_isNullOrEmpty_1);
        if (_not) {
          _builder.append("\\section*{\\underline{");
          String _title_1 = group.getTitle();
          _builder.append(_title_1, "");
          _builder.append("}}");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t    ");
      CharSequence _genLabel = this.genLabel(group);
      _builder.append(_genLabel, "	    ");
      _builder.newLineIfNotEmpty();
      {
        String _description = group.getDescription();
        boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(_description);
        boolean _not_1 = (!_isNullOrEmpty_2);
        if (_not_1) {
          _builder.append("\t    ");
          String _description_1 = group.getDescription();
          _builder.append(_description_1, "	    ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        EList<Question> _questions = group.getQuestions();
        for(final Question question : _questions) {
          String _dependsOn = group.getDependsOn();
          boolean _isRequired = group.isRequired();
          Object _genLatex = this.genLatex(question, _dependsOn, _isRequired, refId);
          _builder.append(_genLatex, "");
          _builder.newLineIfNotEmpty();
          _builder.append("\\vspace{10mm}");
          _builder.newLine();
        }
      }
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genLatex(final Text text, final String dependsOn, final boolean required, final String pid) {
    CharSequence _xblockexpression = null;
    {
      int _xifexpression = (int) 0;
      boolean _isMultiline = text.isMultiline();
      if (_isMultiline) {
        _xifexpression = 3;
      } else {
        _xifexpression = 1;
      }
      final int count = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _genHeader = this.genHeader(text, dependsOn, required);
      _builder.append(_genHeader, "");
      _builder.newLineIfNotEmpty();
      {
        IntegerRange _upTo = new IntegerRange(1, count);
        for(final Integer i : _upTo) {
          CharSequence _genWritingLine = this.genWritingLine();
          _builder.append(_genWritingLine, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genLatex(final Scale scale, final String dependsOn, final boolean required, final String pid) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genHeader = this.genHeader(scale, dependsOn, required);
    _builder.append(_genHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\noindent");
    _builder.newLine();
    _builder.append("\\begin{tabular}{ ");
    {
      String _minLabel = scale.getMinLabel();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_minLabel);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append(" r");
      }
    }
    _builder.append(" ");
    {
      int _min = scale.getMin();
      int _max = scale.getMax();
      IntegerRange _upTo = new IntegerRange(_min, _max);
      for(final Integer i : _upTo) {
        _builder.append("c ");
      }
    }
    {
      String _maxLabel = scale.getMaxLabel();
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_maxLabel);
      boolean _not_1 = (!_isNullOrEmpty_1);
      if (_not_1) {
        _builder.append("l ");
      }
    }
    _builder.append(" }");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      int _min_1 = scale.getMin();
      int _max_1 = scale.getMax();
      IntegerRange _upTo_1 = new IntegerRange(_min_1, _max_1);
      for(final Integer i_1 : _upTo_1) {
        _builder.append("& ");
        _builder.append(i_1, "    ");
        _builder.append(" ");
      }
    }
    _builder.append("& \\\\ \\hline");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    String _minLabel_1 = scale.getMinLabel();
    _builder.append(_minLabel_1, "    ");
    _builder.append(" ");
    {
      int _min_2 = scale.getMin();
      int _max_2 = scale.getMax();
      IntegerRange _upTo_2 = new IntegerRange(_min_2, _max_2);
      for(final Integer i_2 : _upTo_2) {
        _builder.append("& \\Square ");
      }
    }
    _builder.append("& ");
    String _maxLabel_1 = scale.getMaxLabel();
    _builder.append(_maxLabel_1, "    ");
    _builder.append("\\\\ \\hline");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{tabular}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genLatex(final Date date, final String dependsOn, final boolean required, final String pid) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genHeader = this.genHeader(date, dependsOn, required);
    _builder.append(_genHeader, "");
    _builder.newLineIfNotEmpty();
    CharSequence _genWritingLine = this.genWritingLine();
    _builder.append(_genWritingLine, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Using this format: ");
    String _genDateFormat = this.genDateFormat(date);
    _builder.append(_genDateFormat, "");
    _builder.append(". \\emph{");
    String _genLimitsDesc = this.genLimitsDesc(date);
    _builder.append(_genLimitsDesc, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genLatex(final survey.Number number, final String dependsOn, final boolean required, final String pid) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genHeader = this.genHeader(number, dependsOn, required);
    _builder.append(_genHeader, "");
    _builder.newLineIfNotEmpty();
    CharSequence _genWritingLine = this.genWritingLine();
    _builder.append(_genWritingLine, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\emph{");
    String _genLimitsDesc = this.genLimitsDesc(number);
    _builder.append(_genLimitsDesc, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genWritingLine() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("~\\newline");
    _builder.newLine();
    _builder.append("\\smallpencil");
    _builder.newLine();
    _builder.append("\\noindent \\hrulefill \\\\");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genLatex(final Single question, final String dependsOn, final boolean required, final String pid) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genHeader = this.genHeader(question, dependsOn, required);
    _builder.append(_genHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\emph{Please choose one only}");
    _builder.newLine();
    _builder.append("\\begin{description}");
    _builder.newLine();
    {
      ArrayList<Answer> _answers = this.getAnswers(question);
      for(final Answer a : _answers) {
        _builder.append("\\item[\\Square] ");
        String _title = a.getTitle();
        _builder.append(_title, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _or = false;
      boolean _isOther = question.isOther();
      if (_isOther) {
        _or = true;
      } else {
        String _otherLabel = question.getOtherLabel();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_otherLabel);
        boolean _not = (!_isNullOrEmpty);
        _or = (_isOther || _not);
      }
      if (_or) {
        _builder.append("\\item[\\Square] ");
        _builder.newLine();
        {
          String _otherLabel_1 = question.getOtherLabel();
          boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_otherLabel_1);
          boolean _not_1 = (!_isNullOrEmpty_1);
          if (_not_1) {
            String _otherLabel_2 = question.getOtherLabel();
            _builder.append(_otherLabel_2, "");
            _builder.append(":");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("Other:");
            _builder.newLine();
          }
        }
        _builder.append("\\smallpencil \\hrulefill");
        _builder.newLine();
      }
    }
    _builder.append("\\end{description}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genLatex(final Multiple question, final String dependsOn, final boolean required, final String pid) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genHeader = this.genHeader(question, dependsOn, required);
    _builder.append(_genHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\emph{");
    String _genLimitsDesc = this.genLimitsDesc(question);
    _builder.append(_genLimitsDesc, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\begin{description}");
    _builder.newLine();
    {
      ArrayList<Answer> _answers = this.getAnswers(question);
      for(final Answer a : _answers) {
        _builder.append("\\item[\\Square] ");
        String _title = a.getTitle();
        _builder.append(_title, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _or = false;
      boolean _isOther = question.isOther();
      if (_isOther) {
        _or = true;
      } else {
        String _otherLabel = question.getOtherLabel();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_otherLabel);
        boolean _not = (!_isNullOrEmpty);
        _or = (_isOther || _not);
      }
      if (_or) {
        _builder.append("\\item[\\Square] ");
        _builder.newLine();
        {
          String _otherLabel_1 = question.getOtherLabel();
          boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_otherLabel_1);
          boolean _not_1 = (!_isNullOrEmpty_1);
          if (_not_1) {
            String _otherLabel_2 = question.getOtherLabel();
            _builder.append(_otherLabel_2, "");
            _builder.append(":");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("Other:");
            _builder.newLine();
          }
        }
        _builder.append("\\smallpencil \\hrulefill");
        _builder.newLine();
      }
    }
    _builder.append("\\end{description}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genLatex(final Table question, final String dependsOn, final boolean required, final String pid) {
    CharSequence _xblockexpression = null;
    {
      final ArrayList<Answer> answers = this.getAnswers(question);
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _genHeader = this.genHeader(question, dependsOn, required);
      _builder.append(_genHeader, "");
      _builder.newLineIfNotEmpty();
      _builder.append("\\noindent");
      _builder.newLine();
      _builder.append("\\begin{tabular}{ l ");
      {
        for(final Answer a : answers) {
          _builder.append("c ");
        }
      }
      _builder.append(" }");
      _builder.newLineIfNotEmpty();
      {
        for(final Answer a_1 : answers) {
          _builder.append("& \\begin{sideways}");
          String _title = a_1.getTitle();
          _builder.append(_title, "");
          _builder.append("\\end{sideways} ");
        }
      }
      _builder.append(" \\\\ \\hline");
      _builder.newLineIfNotEmpty();
      {
        EList<TableQuestion> _questions = question.getQuestions();
        for(final TableQuestion q : _questions) {
          String _title_1 = q.getTitle();
          _builder.append(_title_1, "");
          _builder.append(" ");
          boolean _or = false;
          if (required) {
            _or = true;
          } else {
            boolean _isRequired = q.isRequired();
            _or = (required || _isRequired);
          }
          CharSequence _genRequired = this.genRequired(question, _or);
          _builder.append(_genRequired, "");
          _builder.append(" ");
          {
            for(final Answer a_2 : answers) {
              _builder.append("& \\Square");
            }
          }
          _builder.append(" \\\\ \\hline");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\\end{tabular}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence genHeader(final Question question, final String parentDependsOn, final boolean required) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\section{");
    String _title = question.getTitle();
    _builder.append(_title, "");
    _builder.append(" ");
    CharSequence _genRequired = this.genRequired(question, required);
    _builder.append(_genRequired, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    CharSequence _genLabel = this.genLabel(question);
    _builder.append(_genLabel, "");
    _builder.newLineIfNotEmpty();
    CharSequence _genDependsOn = this.genDependsOn(question, parentDependsOn);
    _builder.append(_genDependsOn, "");
    _builder.newLineIfNotEmpty();
    {
      String _description = question.getDescription();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_description);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _description_1 = question.getDescription();
        _builder.append(_description_1, "");
        _builder.append("\\\\");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genRequired(final Question question, final boolean requiredParent) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _or = false;
      if (requiredParent) {
        _or = true;
      } else {
        boolean _isRequired = question.isRequired();
        _or = (requiredParent || _isRequired);
      }
      if (_or) {
        _builder.append("* ");
      }
    }
    return _builder;
  }
  
  public CharSequence genLabel(final Item item) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = item.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("\\label{");
        String _name_1 = item.getName();
        _builder.append(_name_1, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genDependsOn(final Item item, final String parentDependsOn) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(parentDependsOn);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("Please only answer this question if you replied ");
        _builder.append(" to question \\#\\ref{");
        _builder.append(parentDependsOn, "");
        _builder.append("} (group).\\\\");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _dependsOn = item.getDependsOn();
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_dependsOn);
      boolean _not_1 = (!_isNullOrEmpty_1);
      if (_not_1) {
        _builder.append("Please only answer this question if you replied ");
        _builder.append(" to question \\#\\ref{");
        String _dependsOn_1 = item.getDependsOn();
        _builder.append(_dependsOn_1, "");
        _builder.append("}.\\\\");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static String template(final String title, final String description, final String body) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\documentclass{article}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\usepackage{rotating}");
    _builder.newLine();
    _builder.append("\\usepackage{fullpage}");
    _builder.newLine();
    _builder.append("\\usepackage{dingbat}");
    _builder.newLine();
    _builder.append("\\usepackage{wasysym}");
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
  
  public CharSequence genLatex(final Item date, final String dependsOn, final boolean required, final String pid) {
    if (date instanceof Date) {
      return _genLatex((Date)date, dependsOn, required, pid);
    } else if (date instanceof Multiple) {
      return _genLatex((Multiple)date, dependsOn, required, pid);
    } else if (date instanceof survey.Number) {
      return _genLatex((survey.Number)date, dependsOn, required, pid);
    } else if (date instanceof Scale) {
      return _genLatex((Scale)date, dependsOn, required, pid);
    } else if (date instanceof Single) {
      return _genLatex((Single)date, dependsOn, required, pid);
    } else if (date instanceof Table) {
      return _genLatex((Table)date, dependsOn, required, pid);
    } else if (date instanceof Text) {
      return _genLatex((Text)date, dependsOn, required, pid);
    } else if (date instanceof Group) {
      return _genLatex((Group)date, dependsOn, required, pid);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(date, dependsOn, required, pid).toString());
    }
  }
}
