package dk.itu.smdp.survey.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import survey.Answer;
import survey.AnswerTemplate;
import survey.AnswerTemplateRef;
import survey.Date;
import survey.HasOptions;
import survey.Multiple;
import survey.Option;
import survey.Question;

@SuppressWarnings("all")
public abstract class SurveyTemplate {
  public String genDateFormat(final Date question) {
    ArrayList<String> _arrayList = new ArrayList<String>();
    ArrayList<String> list = _arrayList;
    boolean _isDay = question.isDay();
    if (_isDay) {
      list.add("dd");
    }
    boolean _isMonth = question.isMonth();
    if (_isMonth) {
      list.add("mm");
    }
    boolean _isYear = question.isYear();
    if (_isYear) {
      list.add("yyyy");
    }
    return IterableExtensions.join(list, "/");
  }
  
  protected String _genLimitsDesc(final Date question) {
    String _xblockexpression = null;
    {
      final String start = question.getStart();
      final String end = question.getEnd();
      String _xifexpression = null;
      boolean _and = false;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(start);
      boolean _not = (!_isNullOrEmpty);
      if (!_not) {
        _and = false;
      } else {
        boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(end);
        boolean _not_1 = (!_isNullOrEmpty_1);
        _and = (_not && _not_1);
      }
      if (_and) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The date must be between ");
        _builder.append(start, "");
        _builder.append(" and ");
        _builder.append(end, "");
        _xifexpression = _builder.toString();
      } else {
        String _xifexpression_1 = null;
        boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(end);
        boolean _not_2 = (!_isNullOrEmpty_2);
        if (_not_2) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("The date must be before ");
          _builder_1.append(end, "");
          _xifexpression_1 = _builder_1.toString();
        } else {
          String _xifexpression_2 = null;
          boolean _isNullOrEmpty_3 = StringExtensions.isNullOrEmpty(start);
          boolean _not_3 = (!_isNullOrEmpty_3);
          if (_not_3) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("The date must be after ");
            _builder_2.append(start, "");
            _xifexpression_2 = _builder_2.toString();
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected String _genLimitsDesc(final survey.Number question) {
    String _xblockexpression = null;
    {
      final Integer min = question.getMin();
      final Integer max = question.getMax();
      String _xifexpression = null;
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(min, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _notEquals_1 = (!Objects.equal(max, null));
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The value must be between ");
        _builder.append(min, "");
        _builder.append(" and ");
        _builder.append(max, "");
        _builder.append(" (both included)");
        _xifexpression = _builder.toString();
      } else {
        String _xifexpression_1 = null;
        boolean _notEquals_2 = (!Objects.equal(min, null));
        if (_notEquals_2) {
          String _switchResult = null;
          boolean _matched = false;
          if (!_matched) {
            if (Objects.equal(min,0)) {
              _matched=true;
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("The value must be non-negative");
              _switchResult = _builder_1.toString();
            }
          }
          if (!_matched) {
            if (Objects.equal(min,1)) {
              _matched=true;
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("The value must be positive");
              _switchResult = _builder_2.toString();
            }
          }
          if (!_matched) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("The value must be larger than or equal to ");
            _builder_3.append(min, "");
            _switchResult = _builder_3.toString();
          }
          _xifexpression_1 = _switchResult;
        } else {
          String _xifexpression_2 = null;
          boolean _notEquals_3 = (!Objects.equal(max, null));
          if (_notEquals_3) {
            String _switchResult_1 = null;
            boolean _matched_1 = false;
            if (!_matched_1) {
              int _minus = (-1);
              if (Objects.equal(max,_minus)) {
                _matched_1=true;
                StringConcatenation _builder_4 = new StringConcatenation();
                _builder_4.append("The value must be negative");
                _switchResult_1 = _builder_4.toString();
              }
            }
            if (!_matched_1) {
              StringConcatenation _builder_5 = new StringConcatenation();
              _builder_5.append("The value must be less than or equal to ");
              _builder_5.append(max, "");
              _switchResult_1 = _builder_5.toString();
            }
            _xifexpression_2 = _switchResult_1;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected String _genLimitsDesc(final Multiple question) {
    String _xblockexpression = null;
    {
      final Integer min = question.getMin();
      final Integer max = question.getMax();
      String _xifexpression = null;
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(min, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _notEquals_1 = (!Objects.equal(max, null));
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        String _xifexpression_1 = null;
        int _intValue = min.intValue();
        int _intValue_1 = max.intValue();
        boolean _equals = (_intValue == _intValue_1);
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Select ");
          _builder.append(min, "");
          _builder.append(" options");
          _xifexpression_1 = _builder.toString();
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Select between ");
          _builder_1.append(min, "");
          _builder_1.append(" and ");
          _builder_1.append(max, "");
          _builder_1.append(" options");
          _xifexpression_1 = _builder_1.toString();
        }
        _xifexpression = _xifexpression_1;
      } else {
        String _xifexpression_2 = null;
        boolean _notEquals_2 = (!Objects.equal(min, null));
        if (_notEquals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("Select at least ");
          _builder_2.append(min, "");
          _builder_2.append(" options");
          _xifexpression_2 = _builder_2.toString();
        } else {
          String _xifexpression_3 = null;
          boolean _notEquals_3 = (!Objects.equal(max, null));
          if (_notEquals_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("Select at most ");
            _builder_3.append(min, "");
            _builder_3.append(" options");
            _xifexpression_3 = _builder_3.toString();
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression = _xifexpression_2;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public ArrayList<Answer> getAnswers(final HasOptions hasOptions) {
    ArrayList<Answer> _arrayList = new ArrayList<Answer>();
    ArrayList<Answer> answers = _arrayList;
    EList<Option> _options = hasOptions.getOptions();
    for (final Option option : _options) {
      if ((option instanceof Answer)) {
        answers.add(((Answer) option));
      } else {
        if ((option instanceof AnswerTemplateRef)) {
          final AnswerTemplate template = ((AnswerTemplateRef) option).getTemplate();
          EList<Answer> _answers = template.getAnswers();
          for (final Answer answer : _answers) {
            {
              boolean _and = false;
              String _name = answer.getName();
              boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
              boolean _not = (!_isNullOrEmpty);
              if (!_not) {
                _and = false;
              } else {
                String _name_1 = answer.getName();
                boolean _contains = _name_1.contains("-");
                boolean _not_1 = (!_contains);
                _and = (_not && _not_1);
              }
              if (_and) {
                String _name_2 = template.getName();
                String _plus = (_name_2 + "-");
                String _name_3 = answer.getName();
                String _plus_1 = (_plus + _name_3);
                answer.setName(_plus_1);
              }
              answers.add(answer);
            }
          }
        }
      }
    }
    return answers;
  }
  
  public CharSequence genRequiredLabel(final Question question, final boolean requiredParent) {
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
  
  public String genLimitsDesc(final Question question) {
    if (question instanceof Date) {
      return _genLimitsDesc((Date)question);
    } else if (question instanceof Multiple) {
      return _genLimitsDesc((Multiple)question);
    } else if (question instanceof survey.Number) {
      return _genLimitsDesc((survey.Number)question);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(question).toString());
    }
  }
}
