package dk.itu.smdp.survey.generator;

import dk.itu.smdp.survey.generator.SurveyTemplate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import survey.Answer;
import survey.AnswerTemplate;
import survey.AnswerTemplateRef;
import survey.Date;
import survey.Group;
import survey.HasOptions;
import survey.Item;
import survey.Meta;
import survey.Multiple;
import survey.Option;
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
  
  private HashMap<String,String> userToUnique;
  
  private HashMap<String,Meta> uniqueToMeta;
  
  private HashMap<Meta,String> metaToUnique;
  
  private final static String abc = "abcdefghijklmnopqrstuvwxyz";
  
  public LatexTemplate(final Survey survey, final IFileSystemAccess fsa) {
    this.survey = survey;
    this.fsa = fsa;
  }
  
  public void Generate() {
    HashMap<String,String> _hashMap = new HashMap<String, String>();
    this.userToUnique = _hashMap;
    HashMap<String,Meta> _hashMap_1 = new HashMap<String, Meta>();
    this.uniqueToMeta = _hashMap_1;
    HashMap<Meta,String> _hashMap_2 = new HashMap<Meta, String>();
    this.metaToUnique = _hashMap_2;
    this.genUniqueIds(this.survey);
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
    CharSequence _genDateFormat = this.genDateFormat(date);
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
    _builder.append("\\begin{enumerate}[label=\\alph*:]");
    _builder.newLine();
    {
      ArrayList<Answer> _answers = this.getAnswers(question);
      for(final Answer a : _answers) {
        _builder.append("\\item \\Square~ ");
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
        _builder.append("\\item \\Square~ ");
        {
          String _otherLabel_1 = question.getOtherLabel();
          boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_otherLabel_1);
          boolean _not_1 = (!_isNullOrEmpty_1);
          if (_not_1) {
            String _otherLabel_2 = question.getOtherLabel();
            _builder.append(_otherLabel_2, "");
            _builder.append(":");
          } else {
            _builder.append("Other:");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\\smallpencil \\hrulefill");
        _builder.newLine();
      }
    }
    _builder.append("\\end{enumerate}");
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
    _builder.append("\\begin{enumerate}[label=\\alph*:]");
    _builder.newLine();
    {
      ArrayList<Answer> _answers = this.getAnswers(question);
      for(final Answer a : _answers) {
        _builder.append("\\item \\Square~ ");
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
        _builder.append("\\item \\Square~ ");
        {
          String _otherLabel_1 = question.getOtherLabel();
          boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_otherLabel_1);
          boolean _not_1 = (!_isNullOrEmpty_1);
          if (_not_1) {
            String _otherLabel_2 = question.getOtherLabel();
            _builder.append(_otherLabel_2, "");
            _builder.append(":");
          } else {
            _builder.append("Other:");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\\smallpencil \\hrulefill");
        _builder.newLine();
      }
    }
    _builder.append("\\end{enumerate}");
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
      _builder.append("\\begin{tabular}{ r l ");
      {
        for(final Answer a : answers) {
          _builder.append("c ");
        }
      }
      _builder.append(" }");
      _builder.newLineIfNotEmpty();
      _builder.append("& ");
      {
        int _length = ((Object[])Conversions.unwrapArray(answers, Object.class)).length;
        int _minus = (_length - 1);
        IntegerRange _upTo = new IntegerRange(0, _minus);
        for(final Integer i : _upTo) {
          _builder.append("& \\begin{sideways}");
          char _charAt = LatexTemplate.abc.charAt((i).intValue());
          _builder.append(_charAt, "");
          _builder.append(": ");
          Answer _get = answers.get((i).intValue());
          String _title = _get.getTitle();
          _builder.append(_title, "");
          _builder.append("\\end{sideways} ");
        }
      }
      _builder.append(" \\\\ \\hline");
      _builder.newLineIfNotEmpty();
      {
        EList<TableQuestion> _questions = question.getQuestions();
        int _length_1 = ((Object[])Conversions.unwrapArray(_questions, Object.class)).length;
        int _minus_1 = (_length_1 - 1);
        IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
        for(final Integer i_1 : _upTo_1) {
          int _plus = ((i_1).intValue() + 1);
          _builder.append(_plus, "");
          _builder.append(": & ");
          EList<TableQuestion> _questions_1 = question.getQuestions();
          TableQuestion _get_1 = _questions_1.get((i_1).intValue());
          String _title_1 = _get_1.getTitle();
          _builder.append(_title_1, "");
          _builder.append(" ");
          boolean _or = false;
          if (required) {
            _or = true;
          } else {
            EList<TableQuestion> _questions_2 = question.getQuestions();
            TableQuestion _get_2 = _questions_2.get((i_1).intValue());
            boolean _isRequired = _get_2.isRequired();
            _or = (required || _isRequired);
          }
          CharSequence _genRequired = this.genRequired(question, _or);
          _builder.append(_genRequired, "");
          _builder.append(" ");
          {
            for(final Answer a_1 : answers) {
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
  
  public CharSequence genLabel(final Meta meta) {
    CharSequence _xifexpression = null;
    boolean _containsKey = this.metaToUnique.containsKey(meta);
    if (_containsKey) {
      CharSequence _xblockexpression = null;
      {
        final String unique = this.metaToUnique.get(meta);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\\label{sec");
        _builder.append(unique, "");
        _builder.append("}");
        _xblockexpression = (_builder);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
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
  
  public CharSequence genDependsOn(final Item item, final String parentDependsOn) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genDependsOnString = this.genDependsOnString(item, parentDependsOn);
    _builder.append(_genDependsOnString, "");
    String _dependsOn = item.getDependsOn();
    CharSequence _genDependsOnString_1 = this.genDependsOnString(item, _dependsOn);
    _builder.append(_genDependsOnString_1, "");
    return _builder;
  }
  
  public CharSequence genDependsOnString(final Item item, final String dependsOn) {
    CharSequence _xifexpression = null;
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(dependsOn);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      CharSequence _xblockexpression = null;
      {
        final String unique = this.userToUnique.get(dependsOn);
        String qid = unique;
        Meta meta = this.uniqueToMeta.get(unique);
        boolean _not_1 = (!(meta instanceof Question));
        boolean _while = _not_1;
        while (_while) {
          {
            int _lastIndexOf = qid.lastIndexOf(":");
            String _substring = qid.substring(0, _lastIndexOf);
            qid = _substring;
            Meta _get = this.uniqueToMeta.get(qid);
            meta = _get;
          }
          boolean _not_2 = (!(meta instanceof Question));
          _while = _not_2;
        }
        final Question question = ((Question) meta);
        CharSequence _genDependsOnString = this.genDependsOnString(question, qid, unique);
        _xblockexpression = (_genDependsOnString);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  protected CharSequence _genDependsOnString(final Scale question, final String qid, final String uid) {
    CharSequence _xblockexpression = null;
    {
      int _length = qid.length();
      int _plus = (_length + 2);
      int _length_1 = uid.length();
      final String option = uid.substring(_plus, _length_1);
      String _plus_1 = ("\\emph{" + option);
      String _plus_2 = (_plus_1 + "} in question \\emph{");
      String _ref = this.ref(qid);
      String _plus_3 = (_plus_2 + _ref);
      String _plus_4 = (_plus_3 + "}");
      CharSequence _genDependsOnString = this.genDependsOnString(_plus_4);
      _xblockexpression = (_genDependsOnString);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genDependsOnString(final Table question, final String qid, final String uid) {
    CharSequence _xblockexpression = null;
    {
      final Meta answer = this.uniqueToMeta.get(uid);
      ArrayList<Answer> _answers = this.getAnswers(question);
      final int i = _answers.indexOf(answer);
      final char letter = LatexTemplate.abc.charAt(i);
      int _lastIndexOf = uid.lastIndexOf(":");
      final String tbid = uid.substring(0, _lastIndexOf);
      final Meta tableQuestion = this.uniqueToMeta.get(tbid);
      EList<TableQuestion> _questions = question.getQuestions();
      int _indexOf = _questions.indexOf(tableQuestion);
      final int number = (_indexOf + 1);
      String _plus = ("\\emph{" + Character.valueOf(letter));
      String _plus_1 = (_plus + "} in question \\emph{");
      String _ref = this.ref(qid);
      String _plus_2 = (_plus_1 + _ref);
      String _plus_3 = (_plus_2 + ".");
      String _plus_4 = (_plus_3 + Integer.valueOf(number));
      String _plus_5 = (_plus_4 + "}");
      CharSequence _genDependsOnString = this.genDependsOnString(_plus_5);
      _xblockexpression = (_genDependsOnString);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genDependsOnString(final HasOptions question, final String qid, final String uid) {
    CharSequence _xblockexpression = null;
    {
      final Meta answer = this.uniqueToMeta.get(uid);
      ArrayList<Answer> _answers = this.getAnswers(question);
      final int i = _answers.indexOf(answer);
      final char letter = "abcdefghijklmnopqrstuvwxyz".charAt(i);
      String _plus = ("\\emph{" + Character.valueOf(letter));
      String _plus_1 = (_plus + "} in question \\emph{");
      String _ref = this.ref(qid);
      String _plus_2 = (_plus_1 + _ref);
      String _plus_3 = (_plus_2 + "}");
      CharSequence _genDependsOnString = this.genDependsOnString(_plus_3);
      _xblockexpression = (_genDependsOnString);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genDependsOnString(final Question question, final String qid, final String uid) {
    String _ref = this.ref(qid);
    String _plus = ("\\emph{" + _ref);
    String _plus_1 = (_plus + "}");
    CharSequence _genDependsOnString = this.genDependsOnString(_plus_1);
    return _genDependsOnString;
  }
  
  public CharSequence genDependsOnString(final String string) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\textbf{Please only answer if you answered ");
    _builder.append(string, "");
    _builder.append("}\\\\");
    return _builder;
  }
  
  public String ref(final String s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\ref{sec");
    _builder.append(s, "");
    _builder.append("}");
    return _builder.toString();
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
    _builder.append("\\usepackage{enumitem}");
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
  
  private int idCounter = 0;
  
  public int getNextId() {
    int _plus = (this.idCounter + 1);
    int _idCounter = this.idCounter = _plus;
    return _idCounter;
  }
  
  public String getUserId(final Meta meta, final String pid) {
    String _xifexpression = null;
    String _name = meta.getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      String _plus = (pid + "-");
      String _name_1 = meta.getName();
      String _plus_1 = (_plus + _name_1);
      _xifexpression = _plus_1;
    } else {
      _xifexpression = pid;
    }
    return _xifexpression;
  }
  
  public String addUniqueMeta(final String unique, final Meta meta) {
    String _xblockexpression = null;
    {
      this.uniqueToMeta.put(unique, meta);
      String _put = this.metaToUnique.put(meta, unique);
      _xblockexpression = (_put);
    }
    return _xblockexpression;
  }
  
  public void genUniqueIds(final Survey survey) {
    EList<Item> _items = survey.getItems();
    for (final Item item : _items) {
      this.genUniqueIds(item, "", "");
    }
  }
  
  protected void _genUniqueIds(final Group group, final String userPid, final String uniquePid) {
    final String userId = this.getUserId(group, userPid);
    String _plus = (uniquePid + ":");
    int _nextId = this.getNextId();
    final String uniqueId = (_plus + Integer.valueOf(_nextId));
    EList<Question> _questions = group.getQuestions();
    for (final Question question : _questions) {
      this.genUniqueIds(question, userId, uniqueId);
    }
  }
  
  protected void _genUniqueIds(final Question question, final String userPid, final String uniquePid) {
    String _name = question.getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      String _userId = this.getUserId(question, userPid);
      final String userId = _userId.substring(1);
      String _plus = (uniquePid + ":");
      int _nextId = this.getNextId();
      final String uniqueId = (_plus + Integer.valueOf(_nextId));
      this.userToUnique.put(userId, uniqueId);
      this.addUniqueMeta(uniqueId, question);
    }
  }
  
  protected void _genUniqueIds(final Scale scale, final String userPid, final String uniquePid) {
    String _name = scale.getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      final String userId = this.getUserId(scale, userPid);
      String _plus = (uniquePid + ":");
      int _nextId = this.getNextId();
      final String uniqueId = (_plus + Integer.valueOf(_nextId));
      this.addUniqueMeta(uniqueId, scale);
      int _min = scale.getMin();
      int _max = scale.getMax();
      IntegerRange _upTo = new IntegerRange(_min, _max);
      for (final int i : _upTo) {
        {
          String _plus_1 = (userId + "-");
          String _plus_2 = (_plus_1 + Integer.valueOf(i));
          final String userAid = _plus_2.substring(1);
          String _plus_3 = (uniqueId + ":_");
          final String uniqueAid = (_plus_3 + Integer.valueOf(i));
          this.userToUnique.put(userAid, uniqueAid);
        }
      }
    }
  }
  
  protected void _genUniqueIds(final Table table, final String userPid, final String uniquePid) {
    final String userTid = this.getUserId(table, userPid);
    String _plus = (uniquePid + ":");
    int _nextId = this.getNextId();
    final String uniqueTid = (_plus + Integer.valueOf(_nextId));
    this.addUniqueMeta(uniqueTid, table);
    EList<TableQuestion> _questions = table.getQuestions();
    final Function1<TableQuestion,Boolean> _function = new Function1<TableQuestion,Boolean>() {
      public Boolean apply(final TableQuestion it) {
        String _name = it.getName();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
        boolean _not = (!_isNullOrEmpty);
        return Boolean.valueOf(_not);
      }
    };
    Iterable<TableQuestion> _filter = IterableExtensions.<TableQuestion>filter(_questions, _function);
    for (final TableQuestion tableQuestion : _filter) {
      {
        final String userTqid = this.getUserId(tableQuestion, userTid);
        String _plus_1 = (uniqueTid + ":");
        int _nextId_1 = this.getNextId();
        final String uniqueTqid = (_plus_1 + Integer.valueOf(_nextId_1));
        this.addUniqueMeta(uniqueTqid, tableQuestion);
        EList<Option> _options = table.getOptions();
        for (final Option option : _options) {
          this.genUniqueIds(option, userTqid, uniqueTqid);
        }
      }
    }
  }
  
  protected void _genUniqueIds(final HasOptions question, final String userPid, final String uniquePid) {
    final String userId = this.getUserId(question, userPid);
    String _plus = (uniquePid + ":");
    int _nextId = this.getNextId();
    final String uniqueId = (_plus + Integer.valueOf(_nextId));
    this.addUniqueMeta(uniqueId, question);
    EList<Option> _options = question.getOptions();
    for (final Option option : _options) {
      this.genUniqueIds(option, userId, uniqueId);
    }
  }
  
  protected void _genUniqueIds(final AnswerTemplateRef templateRef, final String userPid, final String uniquePid) {
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(userPid);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      AnswerTemplate _template = templateRef.getTemplate();
      EList<Answer> _answers = _template.getAnswers();
      for (final Answer answer : _answers) {
        this.genUniqueIds(answer, userPid, uniquePid);
      }
    }
  }
  
  protected void _genUniqueIds(final Answer answer, final String userPid, final String uniquePid) {
    String _name = answer.getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      String _userId = this.getUserId(answer, userPid);
      final String userId = _userId.substring(1);
      String _plus = (uniquePid + ":");
      int _nextId = this.getNextId();
      final String uniqueId = (_plus + Integer.valueOf(_nextId));
      this.userToUnique.put(userId, uniqueId);
      this.addUniqueMeta(uniqueId, answer);
    }
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
  
  public CharSequence genDependsOnString(final Item question, final String qid, final String uid) {
    if (question instanceof Scale) {
      return _genDependsOnString((Scale)question, qid, uid);
    } else if (question instanceof Table) {
      return _genDependsOnString((Table)question, qid, uid);
    } else if (question instanceof HasOptions) {
      return _genDependsOnString((HasOptions)question, qid, uid);
    } else if (question instanceof Question) {
      return _genDependsOnString((Question)question, qid, uid);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(question, qid, uid).toString());
    }
  }
  
  public void genUniqueIds(final EObject scale, final String userPid, final String uniquePid) {
    if (scale instanceof Scale) {
      _genUniqueIds((Scale)scale, userPid, uniquePid);
      return;
    } else if (scale instanceof Table) {
      _genUniqueIds((Table)scale, userPid, uniquePid);
      return;
    } else if (scale instanceof Group) {
      _genUniqueIds((Group)scale, userPid, uniquePid);
      return;
    } else if (scale instanceof HasOptions) {
      _genUniqueIds((HasOptions)scale, userPid, uniquePid);
      return;
    } else if (scale instanceof Question) {
      _genUniqueIds((Question)scale, userPid, uniquePid);
      return;
    } else if (scale instanceof Answer) {
      _genUniqueIds((Answer)scale, userPid, uniquePid);
      return;
    } else if (scale instanceof AnswerTemplateRef) {
      _genUniqueIds((AnswerTemplateRef)scale, userPid, uniquePid);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(scale, userPid, uniquePid).toString());
    }
  }
}
