package dk.itu.smdp.survey.generator;

import com.google.common.base.Objects;
import dk.itu.smdp.survey.generator.SurveyTemplate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import survey.Answer;
import survey.Date;
import survey.DateMode;
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
public class PhpTemplate extends SurveyTemplate {
  private int nextId = 0;
  
  private HashMap<Question,String> idMap = new Function0<HashMap<Question,String>>() {
    public HashMap<Question,String> apply() {
      HashMap<Question,String> _hashMap = new HashMap<Question, String>();
      return _hashMap;
    }
  }.apply();
  
  private Survey survey;
  
  private IFileSystemAccess fsa;
  
  public PhpTemplate(final Survey survey, final IFileSystemAccess fsa) {
    this.survey = survey;
    this.fsa = fsa;
  }
  
  public void Generate() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Item> _items = this.survey.getItems();
      for(final Item item : _items) {
        String _genHtml = this.genHtml(item, "", false, "");
        _builder.append(_genHtml, "");
        _builder.newLineIfNotEmpty();
      }
    }
    String body = _builder.toString();
    String template = this.template(this.survey, body);
    String _xifexpression = null;
    String _name = this.survey.getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
    if (_isNullOrEmpty) {
      _xifexpression = "index";
    } else {
      String _name_1 = this.survey.getName();
      _xifexpression = _name_1;
    }
    final String filename = (_xifexpression + ".php");
    this.fsa.generateFile(filename, template);
  }
  
  public String getUniqueId(final Question question) {
    int _plus = (this.nextId + 1);
    this.nextId = _plus;
    String id = ("input" + Integer.valueOf(this.nextId));
    this.idMap.put(question, id);
    return id;
  }
  
  public CharSequence genRefIdAttr(final String id, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(id);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("id=\"");
        String _substring = id.substring(1);
        _builder.append(_substring, "");
        _builder.append("-");
        _builder.append(i, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genRefIdAttr(final String id, final Answer a) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _or = false;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(id);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _or = true;
      } else {
        String _name = a.getName();
        boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_name);
        boolean _not_1 = (!_isNullOrEmpty_1);
        _or = (_not || _not_1);
      }
      if (_or) {
        _builder.append("id=\"");
        String _xifexpression = null;
        boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(id);
        boolean _not_2 = (!_isNullOrEmpty_2);
        if (_not_2) {
          String _substring = id.substring(1);
          String _plus = (_substring + "-");
          _xifexpression = _plus;
        } else {
          _xifexpression = "";
        }
        String _name_1 = a.getName();
        String _plus_1 = (_xifexpression + _name_1);
        _builder.append(_plus_1, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genRefIdAttr(final String id) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(id);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("id=\"");
        String _substring = id.substring(1);
        _builder.append(_substring, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genHiddenInput(final Question question, final String id) {
    String _title = question.getTitle();
    CharSequence _genHiddenInputWithString = this.genHiddenInputWithString(_title, id);
    return _genHiddenInputWithString;
  }
  
  public CharSequence genHiddenInputWithString(final String text, final String id) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<input type=\"hidden\" name=\"");
    _builder.append(id, "");
    _builder.append("[question]\" value=\"");
    _builder.append(text, "");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genRequiredAttr(final Question question, final boolean requiredParent) {
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
        _builder.append(" required ");
      }
    }
    return _builder;
  }
  
  public Integer getMin(final Multiple question, final boolean required) {
    Integer _xifexpression = null;
    Integer _min = question.getMin();
    boolean _notEquals = (!Objects.equal(_min, null));
    if (_notEquals) {
      Integer _min_1 = question.getMin();
      _xifexpression = _min_1;
    } else {
      _xifexpression = Integer.valueOf(0);
    }
    Integer min = _xifexpression;
    boolean _and = false;
    boolean _or = false;
    if (required) {
      _or = true;
    } else {
      boolean _isRequired = question.isRequired();
      _or = (required || _isRequired);
    }
    if (!_or) {
      _and = false;
    } else {
      boolean _equals = ((min).intValue() == 0);
      _and = (_or && _equals);
    }
    if (_and) {
      min = Integer.valueOf(1);
    }
    return min;
  }
  
  public Integer getMax(final Multiple question, final boolean required) {
    Integer _xifexpression = null;
    Integer _max = question.getMax();
    boolean _notEquals = (!Objects.equal(_max, null));
    if (_notEquals) {
      Integer _max_1 = question.getMax();
      int _intValue = _max_1.intValue();
      _xifexpression = Integer.valueOf(_intValue);
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public CharSequence genDependsOnAttr(final Item item) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _dependsOn = item.getDependsOn();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_dependsOn);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("data-depends-on=\"");
        String _dependsOn_1 = item.getDependsOn();
        _builder.append(_dependsOn_1, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genDependsOn(final Question question) {
    CharSequence _xblockexpression = null;
    {
      final String s = this.genLimitsDesc(question);
      CharSequence _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(s);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<p class=\"help-block\">");
        _builder.append(s, "");
        _builder.append("</p>");
        _xifexpression = _builder;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected String _genHtml(final Group group, final String dependsOn, final boolean required, final String pid) {
    String _xblockexpression = null;
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
      _builder.append("<div class=\"group\" ");
      CharSequence _genDependsOnAttr = this.genDependsOnAttr(group);
      _builder.append(_genDependsOnAttr, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      {
        String _title = group.getTitle();
        boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_title);
        boolean _not = (!_isNullOrEmpty_1);
        if (_not) {
          _builder.append("    ");
          _builder.append("<h2>");
          String _title_1 = group.getTitle();
          _builder.append(_title_1, "    ");
          _builder.append("</h2>");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        String _description = group.getDescription();
        boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(_description);
        boolean _not_1 = (!_isNullOrEmpty_2);
        if (_not_1) {
          _builder.append("    ");
          _builder.append("<p class=\"lead\">");
          String _description_1 = group.getDescription();
          _builder.append(_description_1, "    ");
          _builder.append("</p>");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<Question> _questions = group.getQuestions();
        for(final Question question : _questions) {
          _builder.append("\t");
          boolean _isRequired = group.isRequired();
          String _genHtml = this.genHtml(question, "", _isRequired, refId);
          _builder.append(_genHtml, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  public CharSequence genHeader(final Question question, final boolean required) {
    CharSequence _genHeader = this.genHeader(question, required, "");
    return _genHeader;
  }
  
  public CharSequence genHeader(final Question question, final boolean required, final String extraAttributes) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<label class=\"control-label\" ");
    _builder.append(extraAttributes, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    String _title = question.getTitle();
    _builder.append(_title, "	        ");
    _builder.append(" ");
    CharSequence _genRequiredLabel = this.genRequiredLabel(question, required);
    _builder.append(_genRequiredLabel, "	        ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    {
      String _description = question.getDescription();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_description);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("<p class=\"help-block\">");
        String _description_1 = question.getDescription();
        _builder.append(_description_1, "	        ");
        _builder.append("</p>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</label>");
    _builder.newLine();
    {
      boolean _not_1 = (!(question instanceof Table));
      if (_not_1) {
        String _get = this.idMap.get(question);
        CharSequence _genHiddenInput = this.genHiddenInput(question, _get);
        _builder.append(_genHiddenInput, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected String _genHtml(final Text question, final String dependsOn, final boolean required, final String pid) {
    String _xblockexpression = null;
    {
      String id = this.getUniqueId(question);
      String _xifexpression = null;
      String _name = question.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        _xifexpression = "";
      } else {
        String _plus = (pid + "-");
        String _name_1 = question.getName();
        String _plus_1 = (_plus + _name_1);
        _xifexpression = _plus_1;
      }
      String refId = _xifexpression;
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(refId);
      if (_isNullOrEmpty_1) {
        String _plus_2 = ("-" + id);
        refId = _plus_2;
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"form-group\" ");
      CharSequence _genDependsOnAttr = this.genDependsOnAttr(question);
      _builder.append(_genDependsOnAttr, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("for=\"");
      _builder_1.append(id, "");
      _builder_1.append("\"");
      CharSequence _genHeader = this.genHeader(question, required, _builder_1.toString());
      _builder.append(_genHeader, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("<div class=\"row\">");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<div class=\"col-xs-4\">");
      _builder.newLine();
      {
        boolean _isMulti = question.isMulti();
        boolean _not = (!_isMulti);
        if (_not) {
          _builder.append("\t\t\t");
          _builder.append("<input class=\"form-control\" ");
          CharSequence _genRefIdAttr = this.genRefIdAttr(refId);
          _builder.append(_genRefIdAttr, "			");
          _builder.append(" name=\"");
          _builder.append(id, "			");
          _builder.append("[answer]\" ");
          CharSequence _genRequiredAttr = this.genRequiredAttr(question, required);
          _builder.append(_genRequiredAttr, "			");
          _builder.append(">");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t\t\t");
          _builder.append("<textarea class=\"form-control\" ");
          CharSequence _genRefIdAttr_1 = this.genRefIdAttr(refId);
          _builder.append(_genRefIdAttr_1, "			");
          _builder.append(" name=\"");
          _builder.append(id, "			");
          _builder.append("[answer]\" rows=\"3\" ");
          CharSequence _genRequiredAttr_1 = this.genRequiredAttr(question, required);
          _builder.append(_genRequiredAttr_1, "			");
          _builder.append("></textarea>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("        ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  protected String _genHtml(final Scale question, final String dependsOn, final boolean required, final String pid) {
    String _xblockexpression = null;
    {
      final String id = this.getUniqueId(question);
      String _name = question.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        question.setName(id);
      }
      String _plus = (pid + "-");
      String _name_1 = question.getName();
      final String refId = (_plus + _name_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"form-group\" ");
      CharSequence _genDependsOnAttr = this.genDependsOnAttr(question);
      _builder.append(_genDependsOnAttr, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _genHeader = this.genHeader(question, required);
      _builder.append(_genHeader, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("<table class=\"scale\">");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<tr class=\"top\">");
      _builder.newLine();
      {
        String _minLabel = question.getMinLabel();
        boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_minLabel);
        boolean _not = (!_isNullOrEmpty_1);
        if (_not) {
          _builder.append("        \t");
          _builder.append("<td></td>");
          _builder.newLine();
        }
      }
      {
        int _min = question.getMin();
        int _max = question.getMax();
        IntegerRange _upTo = new IntegerRange(_min, _max);
        boolean _hasElements = false;
        for(final Integer i : _upTo) {
          if (!_hasElements) {
            _hasElements = true;
            _builder.append("<td>", "            ");
          } else {
            _builder.appendImmediate("</td><td>", "            ");
          }
          _builder.append("            ");
          _builder.append("<label for=\"");
          String _substring = refId.substring(1);
          _builder.append(_substring, "            ");
          _builder.append("-");
          _builder.append(i, "            ");
          _builder.append("\">");
          _builder.append(i, "            ");
          _builder.append("</label>");
          _builder.newLineIfNotEmpty();
        }
        if (_hasElements) {
          _builder.append("</td>", "            ");
        }
      }
      {
        String _minLabel_1 = question.getMinLabel();
        boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(_minLabel_1);
        boolean _not_1 = (!_isNullOrEmpty_2);
        if (_not_1) {
          _builder.append("        \t");
          _builder.append("<td></td>");
          _builder.newLine();
        }
      }
      _builder.append("        ");
      _builder.append("</tr>");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<tr class=\"bottom\">");
      _builder.newLine();
      {
        String _minLabel_2 = question.getMinLabel();
        boolean _isNullOrEmpty_3 = StringExtensions.isNullOrEmpty(_minLabel_2);
        boolean _not_2 = (!_isNullOrEmpty_3);
        if (_not_2) {
          _builder.append("        \t");
          _builder.append("<td><label for=\"");
          String _substring_1 = refId.substring(1);
          _builder.append(_substring_1, "        	");
          _builder.append("-");
          int _min_1 = question.getMin();
          _builder.append(_min_1, "        	");
          _builder.append("\">");
          String _minLabel_3 = question.getMinLabel();
          _builder.append(_minLabel_3, "        	");
          _builder.append("</label></td>");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        int _min_2 = question.getMin();
        int _max_1 = question.getMax();
        IntegerRange _upTo_1 = new IntegerRange(_min_2, _max_1);
        boolean _hasElements_1 = false;
        for(final Integer i_1 : _upTo_1) {
          if (!_hasElements_1) {
            _hasElements_1 = true;
            _builder.append("<td>", "            ");
          } else {
            _builder.appendImmediate("</td><td>", "            ");
          }
          _builder.append("            ");
          _builder.append("<input type=\"radio\" name=\"");
          _builder.append(id, "            ");
          _builder.append("[answer]\" ");
          CharSequence _genRefIdAttr = this.genRefIdAttr(refId, (i_1).intValue());
          _builder.append(_genRefIdAttr, "            ");
          _builder.append(" value=\"");
          _builder.append(i_1, "            ");
          _builder.append("\" ");
          CharSequence _genRequiredAttr = this.genRequiredAttr(question, required);
          _builder.append(_genRequiredAttr, "            ");
          _builder.append("/>");
          _builder.newLineIfNotEmpty();
        }
        if (_hasElements_1) {
          _builder.append("</td>", "            ");
        }
      }
      {
        String _minLabel_4 = question.getMinLabel();
        boolean _isNullOrEmpty_4 = StringExtensions.isNullOrEmpty(_minLabel_4);
        boolean _not_3 = (!_isNullOrEmpty_4);
        if (_not_3) {
          _builder.append("        \t");
          _builder.append("<td><label for=\"");
          String _substring_2 = refId.substring(1);
          _builder.append(_substring_2, "        	");
          _builder.append("-");
          int _max_2 = question.getMax();
          _builder.append(_max_2, "        	");
          _builder.append("\">");
          String _maxLabel = question.getMaxLabel();
          _builder.append(_maxLabel, "        	");
          _builder.append("</label></td>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("        ");
      _builder.append("</tr>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("</table>");
      _builder.newLine();
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  protected String _genHtml(final Date question, final String dependsOn, final boolean required, final String pid) {
    String _xblockexpression = null;
    {
      final String id = this.getUniqueId(question);
      String _xifexpression = null;
      String _name = question.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        _xifexpression = "";
      } else {
        String _plus = (pid + "-");
        String _name_1 = question.getName();
        String _plus_1 = (_plus + _name_1);
        _xifexpression = _plus_1;
      }
      final String refId = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"form-group\" ");
      CharSequence _genDependsOnAttr = this.genDependsOnAttr(question);
      _builder.append(_genDependsOnAttr, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("for=\"");
      _builder_1.append(id, "");
      _builder_1.append("\"");
      CharSequence _genHeader = this.genHeader(question, required, _builder_1.toString());
      _builder.append(_genHeader, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("<div class=\"row\">");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<div class=\"col-xs-4\">");
      _builder.newLine();
      _builder.append("\t\t    ");
      _builder.append("<div class=\"input-group date\"");
      _builder.newLine();
      _builder.append("\t\t    \t");
      _builder.append("data-date-format=\"");
      CharSequence _genDateFormat = this.genDateFormat(question);
      _builder.append(_genDateFormat, "		    	");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t    \t");
      _builder.append("data-date-min-view-mode=\"");
      DateMode _mode = question.getMode();
      _builder.append(_mode, "		    	");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t    \t");
      {
        String _start = question.getStart();
        boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_start);
        boolean _not = (!_isNullOrEmpty_1);
        if (_not) {
          _builder.append("data-date-start-date=\"");
          String _start_1 = question.getStart();
          _builder.append(_start_1, "		    	");
          _builder.append("\"");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t    \t");
      {
        String _end = question.getEnd();
        boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(_end);
        boolean _not_1 = (!_isNullOrEmpty_2);
        if (_not_1) {
          _builder.append("data-date-end-date=\"");
          String _end_1 = question.getEnd();
          _builder.append(_end_1, "		    	");
          _builder.append("\"");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t    \t");
      _builder.append(">");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("<input ");
      CharSequence _genRefIdAttr = this.genRefIdAttr(refId);
      _builder.append(_genRefIdAttr, "				");
      _builder.append(" name=\"");
      _builder.append(id, "				");
      _builder.append("[answer]\" type=\"text\" class=\"form-control\" ");
      CharSequence _genRequiredAttr = this.genRequiredAttr(question, required);
      _builder.append(_genRequiredAttr, "				");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append("<span class=\"input-group-addon\">");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("<i class=\"glyphicon glyphicon-calendar\"></i>");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("</span>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("</div>");
      _builder.newLine();
      {
        boolean _isShowLimits = question.isShowLimits();
        if (_isShowLimits) {
          _builder.append("\t");
          CharSequence _genDependsOn = this.genDependsOn(question);
          _builder.append(_genDependsOn, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  protected String _genHtml(final survey.Number question, final String dependsOn, final boolean required, final String pid) {
    String _xblockexpression = null;
    {
      String id = this.getUniqueId(question);
      String _xifexpression = null;
      String _name = question.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        _xifexpression = "";
      } else {
        String _plus = (pid + "-");
        String _name_1 = question.getName();
        String _plus_1 = (_plus + _name_1);
        _xifexpression = _plus_1;
      }
      final String refId = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"form-group\" ");
      CharSequence _genDependsOnAttr = this.genDependsOnAttr(question);
      _builder.append(_genDependsOnAttr, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t    \t");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("for=\"");
      _builder_1.append(id, "");
      _builder_1.append("\"");
      CharSequence _genHeader = this.genHeader(question, required, _builder_1.toString());
      _builder.append(_genHeader, "	    	");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("<div class=\"row\">");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("<div class=\"col-xs-2\">");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("<input type=\"number\" class=\"form-control\"  ");
      CharSequence _genRefIdAttr = this.genRefIdAttr(refId);
      _builder.append(_genRefIdAttr, "            ");
      _builder.append(" name=\"");
      _builder.append(id, "            ");
      _builder.append("[answer]\" ");
      CharSequence _genRequiredAttr = this.genRequiredAttr(question, required);
      _builder.append(_genRequiredAttr, "            ");
      _builder.append(" step=\"1\"");
      _builder.newLineIfNotEmpty();
      {
        Integer _min = question.getMin();
        boolean _notEquals = (!Objects.equal(_min, null));
        if (_notEquals) {
          _builder.append("            ");
          _builder.append("min=\"");
          Integer _min_1 = question.getMin();
          _builder.append(_min_1, "            ");
          _builder.append("\" data-rule-min=\"");
          Integer _min_2 = question.getMin();
          _builder.append(_min_2, "            ");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        Integer _max = question.getMax();
        boolean _notEquals_1 = (!Objects.equal(_max, null));
        if (_notEquals_1) {
          _builder.append("            ");
          _builder.append("max=\"");
          Integer _max_1 = question.getMax();
          _builder.append(_max_1, "            ");
          _builder.append("\" data-rule-max=\"");
          Integer _max_2 = question.getMax();
          _builder.append(_max_2, "            ");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("            ");
      _builder.append(">");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("</div>");
      _builder.newLine();
      {
        boolean _isShowLimits = question.isShowLimits();
        if (_isShowLimits) {
          _builder.append("            ");
          CharSequence _genDependsOn = this.genDependsOn(question);
          _builder.append(_genDependsOn, "            ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  protected String _genHtml(final Single question, final String dependsOn, final boolean required, final String pid) {
    String _xblockexpression = null;
    {
      String id = this.getUniqueId(question);
      String _xifexpression = null;
      String _name = question.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        _xifexpression = "";
      } else {
        String _plus = (pid + "-");
        String _name_1 = question.getName();
        String _plus_1 = (_plus + _name_1);
        _xifexpression = _plus_1;
      }
      final String refId = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"form-group\" ");
      CharSequence _genDependsOnAttr = this.genDependsOnAttr(question);
      _builder.append(_genDependsOnAttr, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t    \t");
      CharSequence _genHeader = this.genHeader(question, required);
      _builder.append(_genHeader, "	    	");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("<div>");
      _builder.newLine();
      {
        ArrayList<Answer> _answers = this.getAnswers(question);
        boolean _hasElements = false;
        for(final Answer a : _answers) {
          if (!_hasElements) {
            _hasElements = true;
            _builder.append("<div class=\"radio\"><label>", "		");
          } else {
            _builder.appendImmediate("</label></div><div class=\"radio\"><label>", "		");
          }
          _builder.append("\t\t");
          _builder.append("<input");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("type=\"radio\"");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("name=\"");
          _builder.append(id, "			");
          _builder.append("[answer][]\"");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t");
          CharSequence _genRefIdAttr = this.genRefIdAttr(refId, a);
          _builder.append(_genRefIdAttr, "			");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("value=\"");
          String _title = a.getTitle();
          _builder.append(_title, "			");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t");
          CharSequence _genRequiredAttr = this.genRequiredAttr(question, required);
          _builder.append(_genRequiredAttr, "			");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("/>");
          _builder.newLine();
          _builder.append("\t\t");
          String _title_1 = a.getTitle();
          _builder.append(_title_1, "		");
          _builder.newLineIfNotEmpty();
        }
        if (_hasElements) {
          _builder.append("</label></div>", "		");
        }
      }
      {
        boolean _or = false;
        boolean _isOther = question.isOther();
        if (_isOther) {
          _or = true;
        } else {
          String _otherLabel = question.getOtherLabel();
          boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_otherLabel);
          boolean _not = (!_isNullOrEmpty_1);
          _or = (_isOther || _not);
        }
        if (_or) {
          _builder.append("\t\t");
          _builder.append("<div class=\"radio\">");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("<input type=\"radio\" name=\"");
          _builder.append(id, "		");
          _builder.append("[answer][]\" value=\"\" ");
          CharSequence _genRequiredAttr_1 = this.genRequiredAttr(question, required);
          _builder.append(_genRequiredAttr_1, "		");
          _builder.append("/>");
          _builder.newLineIfNotEmpty();
          {
            String _otherLabel_1 = question.getOtherLabel();
            boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(_otherLabel_1);
            boolean _not_1 = (!_isNullOrEmpty_2);
            if (_not_1) {
              _builder.append("\t\t");
              String _otherLabel_2 = question.getOtherLabel();
              _builder.append(_otherLabel_2, "		");
              _builder.append(":");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t\t");
              _builder.append("Other:");
              _builder.newLine();
            }
          }
          _builder.append("\t\t");
          _builder.append("<input class=\"other-option\" type=\"text\" name=\"");
          _builder.append(id, "		");
          _builder.append("[answer][]\"/>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("</div>");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  protected String _genHtml(final Multiple question, final String dependsOn, final boolean required, final String pid) {
    String _xblockexpression = null;
    {
      final String id = this.getUniqueId(question);
      final Integer min = this.getMin(question, required);
      final Integer max = this.getMax(question, required);
      String _xifexpression = null;
      String _name = question.getName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
      if (_isNullOrEmpty) {
        _xifexpression = pid;
      } else {
        String _plus = (pid + "-");
        String _name_1 = question.getName();
        String _plus_1 = (_plus + _name_1);
        _xifexpression = _plus_1;
      }
      final String refId = _xifexpression;
      final ArrayList<Answer> answers = this.getAnswers(question);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"form-group\">");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _genDependsOnAttr = this.genDependsOnAttr(question);
      _builder.append(_genDependsOnAttr, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("\t    \t");
      boolean _or = false;
      if (required) {
        _or = true;
      } else {
        boolean _greaterThan = ((min).intValue() > 0);
        _or = (required || _greaterThan);
      }
      CharSequence _genHeader = this.genHeader(question, _or);
      _builder.append(_genHeader, "	    	");
      _builder.newLineIfNotEmpty();
      {
        for(final Answer a : answers) {
          _builder.append("\t\t    ");
          _builder.append("<div class=\"checkbox\">");
          _builder.newLine();
          _builder.append("\t\t\t    ");
          _builder.append("<label>");
          _builder.newLine();
          _builder.append("\t\t\t\t    ");
          _builder.append("<input");
          _builder.newLine();
          _builder.append("\t\t\t\t    \t");
          _builder.append("type=\"checkbox\"");
          _builder.newLine();
          _builder.append("\t\t\t\t    \t");
          _builder.append("name=\"");
          _builder.append(id, "				    	");
          _builder.append("[answer][]\"");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t    \t");
          CharSequence _genRefIdAttr = this.genRefIdAttr(refId, a);
          _builder.append(_genRefIdAttr, "				    	");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t    \t");
          _builder.append("value=\"");
          String _title = a.getTitle();
          _builder.append(_title, "				    	");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          boolean _or_1 = false;
          if (required) {
            _or_1 = true;
          } else {
            boolean _greaterThan_1 = ((min).intValue() > 0);
            _or_1 = (required || _greaterThan_1);
          }
          CharSequence _genRequiredAttr = this.genRequiredAttr(question, _or_1);
          _builder.append(_genRequiredAttr, "	");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          {
            boolean _greaterThan_2 = ((min).intValue() > 0);
            if (_greaterThan_2) {
              _builder.append(" data-rule-minlength=\"");
              _builder.append(min, "	");
              _builder.append("\" ");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          {
            boolean _notEquals = (!Objects.equal(max, null));
            if (_notEquals) {
              _builder.append(" data-rule-maxlength=\"");
              _builder.append(max, "	");
              _builder.append("\" ");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("/>");
          _builder.newLine();
          _builder.append("\t\t\t    \t");
          String _title_1 = a.getTitle();
          _builder.append(_title_1, "			    	");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t    ");
          _builder.append("</label>");
          _builder.newLine();
          _builder.append("\t\t    ");
          _builder.append("</div>");
          _builder.newLine();
        }
      }
      {
        boolean _or_2 = false;
        boolean _isOther = question.isOther();
        if (_isOther) {
          _or_2 = true;
        } else {
          String _otherLabel = question.getOtherLabel();
          boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_otherLabel);
          boolean _not = (!_isNullOrEmpty_1);
          _or_2 = (_isOther || _not);
        }
        if (_or_2) {
          _builder.append("\t");
          _builder.append("<div class=\"checkbox\">");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("<input type=\"checkbox\" name=\"");
          _builder.append(id, "	");
          _builder.append("[answer][]\" value=\"\" ");
          boolean _or_3 = false;
          if (required) {
            _or_3 = true;
          } else {
            boolean _greaterThan_3 = ((min).intValue() > 0);
            _or_3 = (required || _greaterThan_3);
          }
          CharSequence _genRequiredAttr_1 = this.genRequiredAttr(question, _or_3);
          _builder.append(_genRequiredAttr_1, "	");
          _builder.append("/>");
          _builder.newLineIfNotEmpty();
          {
            String _otherLabel_1 = question.getOtherLabel();
            boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(_otherLabel_1);
            boolean _not_1 = (!_isNullOrEmpty_2);
            if (_not_1) {
              _builder.append("\t");
              String _otherLabel_2 = question.getOtherLabel();
              _builder.append(_otherLabel_2, "	");
              _builder.append(":");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              _builder.append("Other:");
              _builder.newLine();
            }
          }
          _builder.append("\t");
          _builder.append("<input class=\"other-option\" type=\"text\" name=\"");
          _builder.append(id, "	");
          _builder.append("[answer][]\"/>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("</div>");
          _builder.newLine();
        }
      }
      {
        boolean _isShowLimits = question.isShowLimits();
        if (_isShowLimits) {
          _builder.append("\t");
          CharSequence _genDependsOn = this.genDependsOn(question);
          _builder.append(_genDependsOn, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  protected String _genHtml(final Table question, final String dependsOn, final boolean required, final String pid) {
    String _xblockexpression = null;
    {
      final ArrayList<Answer> answers = this.getAnswers(question);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"form-group\" ");
      CharSequence _genDependsOnAttr = this.genDependsOnAttr(question);
      _builder.append(_genDependsOnAttr, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t    \t");
      CharSequence _genHeader = this.genHeader(question, required);
      _builder.append(_genHeader, "	    	");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("<table class=\"table table-striped\">");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("<thead>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<tr>");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("<th></th>");
      _builder.newLine();
      {
        for(final Answer a : answers) {
          _builder.append("\t\t\t\t");
          _builder.append("<th>");
          String _title = a.getTitle();
          _builder.append(_title, "				");
          _builder.append("</th>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t\t");
      _builder.append("</tr>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</thead>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<tbody>");
      _builder.newLine();
      {
        EList<TableQuestion> _questions = question.getQuestions();
        for(final TableQuestion q : _questions) {
          _builder.append("\t\t\t");
          _builder.append("<tr>");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("    ");
          _builder.append("<td><label for=\"");
          String qid = this.getUniqueId(question);
          _builder.append("\">");
          String _title_1 = q.getTitle();
          _builder.append(_title_1, "			    ");
          _builder.append(" ");
          boolean _or = false;
          if (required) {
            _or = true;
          } else {
            boolean _isRequired = q.isRequired();
            _or = (required || _isRequired);
          }
          CharSequence _genRequiredLabel = this.genRequiredLabel(question, _or);
          _builder.append(_genRequiredLabel, "			    ");
          _builder.append("</label></td>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("    ");
          String _title_2 = q.getTitle();
          CharSequence _genHiddenInputWithString = this.genHiddenInputWithString(_title_2, qid);
          _builder.append(_genHiddenInputWithString, "			    ");
          _builder.newLineIfNotEmpty();
          {
            for(final Answer a_1 : answers) {
              _builder.append("\t\t\t");
              _builder.append("    ");
              _builder.append("<td>");
              _builder.newLine();
              _builder.append("\t\t\t");
              _builder.append("    ");
              _builder.append("<input");
              _builder.newLine();
              _builder.append("\t\t\t");
              _builder.append("    ");
              _builder.append("\t");
              _builder.append("type=\"");
              {
                boolean _isMultiple = question.isMultiple();
                if (_isMultiple) {
                  _builder.append("checkbox");
                } else {
                  _builder.append("radio");
                }
              }
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t");
              _builder.append("    ");
              _builder.append("\t");
              _builder.append("name=\"");
              _builder.append(qid, "			    	");
              _builder.append("[answer]\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t");
              _builder.append("    ");
              _builder.append("\t");
              _builder.append("value=\"");
              String _title_3 = a_1.getTitle();
              _builder.append(_title_3, "			    	");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t");
              _builder.append("    ");
              _builder.append("\t");
              String _xifexpression = null;
              String _name = q.getName();
              boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
              if (_isNullOrEmpty) {
                _xifexpression = pid;
              } else {
                String _plus = (pid + "-");
                String _name_1 = q.getName();
                String _plus_1 = (_plus + _name_1);
                _xifexpression = _plus_1;
              }
              CharSequence _genRefIdAttr = this.genRefIdAttr(_xifexpression, a_1);
              _builder.append(_genRefIdAttr, "			    	");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t");
              _builder.append("    ");
              _builder.append("\t");
              boolean _or_1 = false;
              if (required) {
                _or_1 = true;
              } else {
                boolean _isRequired_1 = q.isRequired();
                _or_1 = (required || _isRequired_1);
              }
              CharSequence _genRequiredAttr = this.genRequiredAttr(question, _or_1);
              _builder.append(_genRequiredAttr, "			    	");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t\t");
              _builder.append("    ");
              _builder.append("/></td>");
              _builder.newLine();
            }
          }
          _builder.append("\t\t\t");
          _builder.append("</tr>");
          _builder.newLine();
        }
      }
      _builder.append("\t\t");
      _builder.append("</tbody>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</table>");
      _builder.newLine();
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  public String template(final Survey survey, final String formContent) {
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
    String _title = survey.getTitle();
    _builder.append(_title, "        ");
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
    _builder.append("<style type=\"text/css\">");
    CharSequence _css = this.css();
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
    _builder.append("<h1 class=\"page-header\">");
    String _title_1 = survey.getTitle();
    _builder.append(_title_1, "                		");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("                \t\t");
    _builder.append("<p class=\"lead\">Thanks for submitting your answer</p>");
    _builder.newLine();
    _builder.append("                \t\t");
    _builder.append("<p>A mail with your reply will be send to <?php echo $_POST[\'survey\'][\'to\']; ?>.</p>");
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
    _builder.append("$s = \'<dl>\';");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("foreach ($_POST as $key => $array) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("if ($key == \"survey\")");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("continue;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
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
    _builder.append("// Print question text");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("$s .= \'<dt>\' . $array[\'question\'] . \'</dt>\';");
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
    _builder.append("$s .= \'<dd>\' . $answer . \'</dd>\';");
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
    _builder.append("$s .= \'<dd>\' . $answers . \'</dd>\';");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("$s .= \'</dl>\';");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.append("echo \'<div class=\"well\">\' . $s . \'</div>\';");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.append("$message = \'<html><body>\' . $s . \'</body></html>\';");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.append("$headers = \"From: Surveys @ ITU\\r\\n\";");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("$headers .= \"MIME-Version: 1.0\\r\\n\";");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("$headers .= \"Content-Type: text/html; charset=ISO-8859-1\\r\\n\";");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.append("// Send mail");
    _builder.newLine();
    _builder.append("\t    \t\t");
    _builder.append("mail($_POST[\'survey\'][\'to\'], $_POST[\'survey\'][\'subject\'], $message, $headers);");
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
    _builder.append("<h1 class=\"page-header\">");
    String _title_2 = survey.getTitle();
    _builder.append(_title_2, "                	");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("                \t");
    {
      String _description = survey.getDescription();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_description);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("<p class=\"lead\">");
        String _description_1 = survey.getDescription();
        _builder.append(_description_1, "                	");
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
    _builder.append("                \t");
    _builder.append("<input type=\"hidden\" name=\"survey[subject]\" value=\"");
    String _title_3 = survey.getTitle();
    _builder.append(_title_3, "                	");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("                \t");
    _builder.append("<input type=\"hidden\" name=\"survey[to]\" value=\"");
    String _mail = survey.getMail();
    _builder.append(_mail, "                	");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
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
    CharSequence _js = this.js();
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
  
  public CharSequence css() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".group {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin-bottom: 20px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("dd + dt {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("margin-top: 10px;");
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
  
  public CharSequence js() {
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
    _builder.append("var dependsOnId = $(this).attr(\"data-depends-on\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var dependsOn = $(\"#\" + dependsOnId);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (dependsOn.attr(\'type\') == \'checkbox\' || dependsOn.attr(\'type\') == \'radio\') {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (!dependsOn.prop(\'checked\'))");
    _builder.newLine();
    _builder.append("\t    \t");
    _builder.append("_this.hide();");
    _builder.newLine();
    _builder.append("\t    \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t    \t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (!dependsOn.val())");
    _builder.newLine();
    _builder.append("\t    \t");
    _builder.append("_this.hide();");
    _builder.newLine();
    _builder.append("    \t\t");
    _builder.append("}");
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
  
  public String genHtml(final Item question, final String dependsOn, final boolean required, final String pid) {
    if (question instanceof Multiple) {
      return _genHtml((Multiple)question, dependsOn, required, pid);
    } else if (question instanceof Single) {
      return _genHtml((Single)question, dependsOn, required, pid);
    } else if (question instanceof Table) {
      return _genHtml((Table)question, dependsOn, required, pid);
    } else if (question instanceof Date) {
      return _genHtml((Date)question, dependsOn, required, pid);
    } else if (question instanceof survey.Number) {
      return _genHtml((survey.Number)question, dependsOn, required, pid);
    } else if (question instanceof Scale) {
      return _genHtml((Scale)question, dependsOn, required, pid);
    } else if (question instanceof Text) {
      return _genHtml((Text)question, dependsOn, required, pid);
    } else if (question instanceof Group) {
      return _genHtml((Group)question, dependsOn, required, pid);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(question, dependsOn, required, pid).toString());
    }
  }
}
