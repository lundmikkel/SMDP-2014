/**
 * generated by Xtext
 */
package dk.itu.smdp.survey.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import dk.itu.smdp.survey.validation.AbstractDslValidator;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import survey.Answer;
import survey.AnswerTemplate;
import survey.AnswerTemplateRef;
import survey.Group;
import survey.HasOptions;
import survey.Item;
import survey.Meta;
import survey.Multiple;
import survey.Option;
import survey.Question;
import survey.Scale;
import survey.Survey;
import survey.SurveyPackage.Literals;
import survey.Table;
import survey.TableQuestion;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class DslValidator extends AbstractDslValidator {
  public final static String DUPLICATE_NAME = "duplicateName";
  
  public final static String INVALID_VALUE = "invalidValue";
  
  public final static String INVALID_DATE = "invalidDate";
  
  public final static String MISSING_ATTRIBUTE = "missingAttribute";
  
  private final static String invalidEmailAddressString = "The email address must be valid";
  
  private final static String minIsLessThanMaxString = "Max value must be larger than min value";
  
  private final static String minIsLessThanOrEqualMaxString = "Max value must be larger than or equal to min value";
  
  private final static String positiveNumberString = "An answer is required, so the min value must be positive";
  
  private final static String uniqueIdsAtSameLevelString = "Ids at the same level must be unique";
  
  private final static String invalidRefIdString = "There is no answer with this id";
  
  private final static String ambiguousIdString = "The id %s is ambiguous";
  
  private final static String noNegativeValueString = "The value must be non-negative";
  
  private final static String betterUseSingleString = "If your maximum is one, you should rather use a single question instead of a multiple for usability reasons";
  
  @Check
  public void checkValidEmailAddress(final Survey survey) {
    String _mail = survey.getMail();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_mail);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      boolean valid = false;
      final String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
      try {
        String _mail_1 = survey.getMail();
        boolean _matches = _mail_1.matches(emailreg);
        valid = _matches;
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          valid = false;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      boolean _not_1 = (!valid);
      if (_not_1) {
        this.error(
          DslValidator.invalidEmailAddressString, survey, 
          Literals.SURVEY__MAIL, 
          DslValidator.INVALID_VALUE);
      }
    }
  }
  
  /**
   * Check that the min is less than max value in a scale
   */
  @Check
  public void checkMinIsLessThanMax(final Scale scale) {
    int _min = scale.getMin();
    int _max = scale.getMax();
    boolean _greaterEqualsThan = (_min >= _max);
    if (_greaterEqualsThan) {
      this.error(
        DslValidator.minIsLessThanMaxString, scale, 
        Literals.SCALE__MIN, 
        DslValidator.INVALID_VALUE);
      this.error(
        DslValidator.minIsLessThanMaxString, scale, 
        Literals.SCALE__MAX, 
        DslValidator.INVALID_VALUE);
    }
    final String largeScaleString = "Large scales may not render properly nor be very user friendly";
    int _max_1 = scale.getMax();
    int _min_1 = scale.getMin();
    int _minus = (_max_1 - _min_1);
    boolean _greaterThan = (_minus > 20);
    if (_greaterThan) {
      this.warning(largeScaleString, scale, 
        Literals.SCALE__MIN);
      this.warning(largeScaleString, scale, 
        Literals.SCALE__MAX);
    }
    final String bothLabelsString = "You must specify both labels or none of them";
    String _minLabel = scale.getMinLabel();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_minLabel);
    String _maxLabel = scale.getMaxLabel();
    boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_maxLabel);
    boolean _notEquals = (_isNullOrEmpty != _isNullOrEmpty_1);
    if (_notEquals) {
      String _minLabel_1 = scale.getMinLabel();
      boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(_minLabel_1);
      boolean _not = (!_isNullOrEmpty_2);
      if (_not) {
        this.error(bothLabelsString, scale, 
          Literals.SCALE__MIN_LABEL, 
          DslValidator.MISSING_ATTRIBUTE);
      } else {
        this.error(bothLabelsString, scale, 
          Literals.SCALE__MAX_LABEL, 
          DslValidator.MISSING_ATTRIBUTE);
      }
    }
  }
  
  /**
   * Check that the min is less than max value in a scale
   */
  @Check
  public void checkMinIsLessThanMax(final survey.Number number) {
    final Integer min = number.getMin();
    final Integer max = number.getMax();
    boolean _and = false;
    boolean _and_1 = false;
    boolean _notEquals = (!Objects.equal(min, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(max, null));
      _and_1 = (_notEquals && _notEquals_1);
    }
    if (!_and_1) {
      _and = false;
    } else {
      int _intValue = min.intValue();
      int _intValue_1 = max.intValue();
      boolean _greaterEqualsThan = (_intValue >= _intValue_1);
      _and = (_and_1 && _greaterEqualsThan);
    }
    if (_and) {
      this.error(
        DslValidator.minIsLessThanMaxString, number, 
        Literals.NUMBER__MIN, 
        DslValidator.INVALID_VALUE);
      this.error(
        DslValidator.minIsLessThanMaxString, number, 
        Literals.NUMBER__MAX, 
        DslValidator.INVALID_VALUE);
    }
  }
  
  /**
   * Check that the min is less than max value in a scale
   */
  @Check
  public void checkMinIsLessThanMax(final Multiple multiple) {
    final Integer min = multiple.getMin();
    final Integer max = multiple.getMax();
    boolean _and = false;
    boolean _and_1 = false;
    boolean _isRequired = multiple.isRequired();
    if (!_isRequired) {
      _and_1 = false;
    } else {
      boolean _notEquals = (!Objects.equal(min, null));
      _and_1 = (_isRequired && _notEquals);
    }
    if (!_and_1) {
      _and = false;
    } else {
      int _intValue = min.intValue();
      boolean _lessThan = (_intValue < 1);
      _and = (_and_1 && _lessThan);
    }
    if (_and) {
      this.error(
        DslValidator.positiveNumberString, multiple, 
        Literals.MULTIPLE__MIN, 
        DslValidator.INVALID_VALUE);
    }
    boolean _and_2 = false;
    boolean _and_3 = false;
    boolean _notEquals_1 = (!Objects.equal(min, null));
    if (!_notEquals_1) {
      _and_3 = false;
    } else {
      boolean _notEquals_2 = (!Objects.equal(max, null));
      _and_3 = (_notEquals_1 && _notEquals_2);
    }
    if (!_and_3) {
      _and_2 = false;
    } else {
      int _intValue_1 = min.intValue();
      int _intValue_2 = max.intValue();
      boolean _greaterThan = (_intValue_1 > _intValue_2);
      _and_2 = (_and_3 && _greaterThan);
    }
    if (_and_2) {
      this.error(
        DslValidator.minIsLessThanOrEqualMaxString, multiple, 
        Literals.MULTIPLE__MIN, 
        DslValidator.INVALID_VALUE);
      this.error(
        DslValidator.minIsLessThanOrEqualMaxString, multiple, 
        Literals.MULTIPLE__MAX, 
        DslValidator.INVALID_VALUE);
    }
    boolean _and_4 = false;
    boolean _notEquals_3 = (!Objects.equal(min, null));
    if (!_notEquals_3) {
      _and_4 = false;
    } else {
      int _intValue_3 = min.intValue();
      boolean _lessThan_1 = (_intValue_3 < 0);
      _and_4 = (_notEquals_3 && _lessThan_1);
    }
    if (_and_4) {
      this.error(
        DslValidator.noNegativeValueString, multiple, 
        Literals.MULTIPLE__MIN, 
        DslValidator.INVALID_VALUE);
    }
    boolean _and_5 = false;
    boolean _notEquals_4 = (!Objects.equal(max, null));
    if (!_notEquals_4) {
      _and_5 = false;
    } else {
      int _intValue_4 = max.intValue();
      boolean _equals = (_intValue_4 == 1);
      _and_5 = (_notEquals_4 && _equals);
    }
    if (_and_5) {
      this.warning(
        DslValidator.betterUseSingleString, multiple, 
        Literals.MULTIPLE__MAX, 
        DslValidator.INVALID_VALUE);
    } else {
      boolean _and_6 = false;
      boolean _notEquals_5 = (!Objects.equal(max, null));
      if (!_notEquals_5) {
        _and_6 = false;
      } else {
        int _intValue_5 = max.intValue();
        boolean _lessThan_2 = (_intValue_5 < 1);
        _and_6 = (_notEquals_5 && _lessThan_2);
      }
      if (_and_6) {
        this.error(
          DslValidator.noNegativeValueString, multiple, 
          Literals.MULTIPLE__MAX, 
          DslValidator.INVALID_VALUE);
      }
    }
  }
  
  /**
   * Check that groups and questions in root have unique names
   */
  @Check
  public void checkUniqueItemNames(final Survey survey) {
    HashMap<String,Item> _hashMap = new HashMap<String, Item>();
    final HashMap<String,Item> map = _hashMap;
    EList<Item> _items = survey.getItems();
    final Function1<Item,Boolean> _function = new Function1<Item,Boolean>() {
      public Boolean apply(final Item it) {
        String _name = it.getName();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
        boolean _not = (!_isNullOrEmpty);
        return Boolean.valueOf(_not);
      }
    };
    Iterable<Item> _filter = IterableExtensions.<Item>filter(_items, _function);
    for (final Item item : _filter) {
      String _name = item.getName();
      boolean _containsKey = map.containsKey(_name);
      if (_containsKey) {
        this.error(
          DslValidator.uniqueIdsAtSameLevelString, item, 
          Literals.META__NAME, 
          DslValidator.DUPLICATE_NAME);
        String _name_1 = item.getName();
        Item _get = map.get(_name_1);
        this.error(
          DslValidator.uniqueIdsAtSameLevelString, _get, 
          Literals.META__NAME, 
          DslValidator.DUPLICATE_NAME);
      } else {
        String _name_2 = item.getName();
        map.put(_name_2, item);
      }
    }
  }
  
  /**
   * Check that questions at the same level have unique names
   */
  @Check
  public void checkUniqueQuestionNames(final Group group) {
    EList<Question> _questions = group.getQuestions();
    this.checkUniqueQuestionNames(_questions);
  }
  
  public void checkUniqueQuestionNames(final Iterable<Question> questions) {
    HashMap<String,Question> _hashMap = new HashMap<String, Question>();
    final HashMap<String,Question> map = _hashMap;
    final Function1<Question,Boolean> _function = new Function1<Question,Boolean>() {
      public Boolean apply(final Question it) {
        String _name = it.getName();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
        boolean _not = (!_isNullOrEmpty);
        return Boolean.valueOf(_not);
      }
    };
    Iterable<Question> _filter = IterableExtensions.<Question>filter(questions, _function);
    for (final Question question : _filter) {
      String _name = question.getName();
      boolean _containsKey = map.containsKey(_name);
      if (_containsKey) {
        this.error(
          DslValidator.uniqueIdsAtSameLevelString, question, 
          Literals.META__NAME, 
          DslValidator.DUPLICATE_NAME);
        String _name_1 = question.getName();
        Question _get = map.get(_name_1);
        this.error(
          DslValidator.uniqueIdsAtSameLevelString, _get, 
          Literals.META__NAME, 
          DslValidator.DUPLICATE_NAME);
      } else {
        String _name_2 = question.getName();
        map.put(_name_2, question);
      }
    }
  }
  
  /**
   * Check that the AnswerTemplates have unique IDs
   */
  @Check
  public void checkUniqueAnswerTemplateNames(final Survey survey) {
    HashMap<String,AnswerTemplate> _hashMap = new HashMap<String, AnswerTemplate>();
    HashMap<String,AnswerTemplate> map = _hashMap;
    EList<AnswerTemplate> _templates = survey.getTemplates();
    for (final AnswerTemplate template : _templates) {
      String _name = template.getName();
      boolean _containsKey = map.containsKey(_name);
      if (_containsKey) {
        this.error(
          DslValidator.uniqueIdsAtSameLevelString, template, 
          Literals.ANSWER_TEMPLATE__NAME, 
          DslValidator.DUPLICATE_NAME);
        String _name_1 = template.getName();
        AnswerTemplate _get = map.get(_name_1);
        this.error(
          DslValidator.uniqueIdsAtSameLevelString, _get, 
          Literals.ANSWER_TEMPLATE__NAME, 
          DslValidator.DUPLICATE_NAME);
      } else {
        String _name_2 = template.getName();
        map.put(_name_2, template);
      }
    }
  }
  
  /**
   * Check that the answers in an AnswerTemplate have unique IDs
   */
  @Check
  public void checkUniqueAnswerNames(final AnswerTemplate template) {
    EList<Answer> _answers = template.getAnswers();
    this.checkUniqueAnswerNames(_answers);
  }
  
  /**
   * Check that the table questions have unique IDs
   */
  @Check
  public void checkUniqueAnswerNames(final Table table) {
    HashMap<String,TableQuestion> _hashMap = new HashMap<String, TableQuestion>();
    HashMap<String,TableQuestion> map = _hashMap;
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
    for (final TableQuestion question : _filter) {
      String _name = question.getName();
      boolean _containsKey = map.containsKey(_name);
      if (_containsKey) {
        this.error(
          DslValidator.uniqueIdsAtSameLevelString, question, 
          Literals.META__NAME, 
          DslValidator.DUPLICATE_NAME);
        String _name_1 = question.getName();
        TableQuestion _get = map.get(_name_1);
        this.error(
          DslValidator.uniqueIdsAtSameLevelString, _get, 
          Literals.META__NAME, 
          DslValidator.DUPLICATE_NAME);
      } else {
        String _name_2 = question.getName();
        map.put(_name_2, question);
      }
    }
  }
  
  /**
   * Check that the answers in a Question have unique IDs
   */
  @Check
  public void checkUniqueAnswerNames(final HasOptions hasOptions) {
    EList<Option> _options = hasOptions.getOptions();
    Iterable<Answer> _filter = Iterables.<Answer>filter(_options, Answer.class);
    this.checkUniqueAnswerNames(_filter);
  }
  
  public void checkUniqueAnswerNames(final Iterable<Answer> answers) {
    HashMap<String,Answer> _hashMap = new HashMap<String, Answer>();
    HashMap<String,Answer> map = _hashMap;
    final Function1<Answer,Boolean> _function = new Function1<Answer,Boolean>() {
      public Boolean apply(final Answer it) {
        String _name = it.getName();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
        boolean _not = (!_isNullOrEmpty);
        return Boolean.valueOf(_not);
      }
    };
    Iterable<Answer> _filter = IterableExtensions.<Answer>filter(answers, _function);
    for (final Answer answer : _filter) {
      String _name = answer.getName();
      boolean _containsKey = map.containsKey(_name);
      if (_containsKey) {
        this.error(
          DslValidator.uniqueIdsAtSameLevelString, answer, 
          Literals.META__NAME, 
          DslValidator.DUPLICATE_NAME);
        String _name_1 = answer.getName();
        Answer _get = map.get(_name_1);
        this.error(
          DslValidator.uniqueIdsAtSameLevelString, _get, 
          Literals.META__NAME, 
          DslValidator.DUPLICATE_NAME);
      } else {
        String _name_2 = answer.getName();
        map.put(_name_2, answer);
      }
    }
  }
  
  @Check
  public void checkDependsOn(final Survey survey) {
    HashMap<String,Meta> _hashMap = new HashMap<String, Meta>();
    HashMap<String,Meta> map = _hashMap;
    EList<Item> _items = survey.getItems();
    for (final Item item : _items) {
      this.getFullIds(item, "", map);
    }
    EList<Item> _items_1 = survey.getItems();
    final Function1<Item,Boolean> _function = new Function1<Item,Boolean>() {
      public Boolean apply(final Item it) {
        String _dependsOn = it.getDependsOn();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_dependsOn);
        boolean _not = (!_isNullOrEmpty);
        return Boolean.valueOf(_not);
      }
    };
    Iterable<Item> _filter = IterableExtensions.<Item>filter(_items_1, _function);
    for (final Item item_1 : _filter) {
      String _dependsOn = item_1.getDependsOn();
      boolean _containsKey = map.containsKey(_dependsOn);
      boolean _not = (!_containsKey);
      if (_not) {
        this.error(
          DslValidator.invalidRefIdString, item_1, 
          Literals.ITEM__DEPENDS_ON, 
          DslValidator.INVALID_VALUE);
      }
    }
    EList<Item> _items_2 = survey.getItems();
    Iterable<Group> _filter_1 = Iterables.<Group>filter(_items_2, Group.class);
    for (final Group group : _filter_1) {
      EList<Question> _questions = group.getQuestions();
      final Function1<Question,Boolean> _function_1 = new Function1<Question,Boolean>() {
        public Boolean apply(final Question it) {
          String _dependsOn = it.getDependsOn();
          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_dependsOn);
          boolean _not = (!_isNullOrEmpty);
          return Boolean.valueOf(_not);
        }
      };
      Iterable<Question> _filter_2 = IterableExtensions.<Question>filter(_questions, _function_1);
      for (final Item item_2 : _filter_2) {
        String _dependsOn_1 = item_2.getDependsOn();
        boolean _containsKey_1 = map.containsKey(_dependsOn_1);
        boolean _not_1 = (!_containsKey_1);
        if (_not_1) {
          this.error(
            DslValidator.invalidRefIdString, item_2, 
            Literals.ITEM__DEPENDS_ON, 
            DslValidator.INVALID_VALUE);
        }
      }
    }
  }
  
  protected void _getFullIds(final Group group, final String pid, final HashMap<String,Meta> map) {
    EList<Question> _questions = group.getQuestions();
    for (final Question question : _questions) {
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
        final String id = _xifexpression;
        this.getFullIds(question, id, map);
      }
    }
  }
  
  protected void _getFullIds(final Question question, final String pid, final HashMap<String,Meta> map) {
    String _name = question.getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      String _plus = (pid + "-");
      String _name_1 = question.getName();
      String _plus_1 = (_plus + _name_1);
      final String id = _plus_1.substring(1);
      final String s = String.format(DslValidator.ambiguousIdString, id);
      boolean _containsKey = map.containsKey(id);
      if (_containsKey) {
        this.error(s, question, 
          Literals.META__NAME, 
          DslValidator.INVALID_VALUE);
        Meta _get = map.get(id);
        this.error(s, _get, 
          Literals.META__NAME, 
          DslValidator.INVALID_VALUE);
      } else {
        if ((question instanceof Scale)) {
          final Scale scale = ((Scale) question);
          int _min = scale.getMin();
          int _max = scale.getMax();
          IntegerRange _upTo = new IntegerRange(_min, _max);
          for (final int i : _upTo) {
            String _plus_2 = (id + "-");
            String _plus_3 = (_plus_2 + Integer.valueOf(i));
            map.put(_plus_3, question);
          }
        } else {
          map.put(id, question);
        }
      }
    }
  }
  
  protected void _getFullIds(final Table question, final String pid, final HashMap<String,Meta> map) {
    EList<TableQuestion> _questions = question.getQuestions();
    final Function1<TableQuestion,Boolean> _function = new Function1<TableQuestion,Boolean>() {
      public Boolean apply(final TableQuestion it) {
        String _name = it.getName();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
        boolean _not = (!_isNullOrEmpty);
        return Boolean.valueOf(_not);
      }
    };
    Iterable<TableQuestion> _filter = IterableExtensions.<TableQuestion>filter(_questions, _function);
    for (final TableQuestion q : _filter) {
      {
        String _plus = (pid + "-");
        String _name = q.getName();
        String id = (_plus + _name);
        EList<Option> _options = question.getOptions();
        for (final Option option : _options) {
          {
            String _xifexpression = null;
            String _name_1 = question.getName();
            boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name_1);
            if (_isNullOrEmpty) {
              _xifexpression = id;
            } else {
              String _plus_1 = (id + "-");
              String _name_2 = question.getName();
              String _plus_2 = (_plus_1 + _name_2);
              _xifexpression = _plus_2;
            }
            id = _xifexpression;
            this.getFullIds(option, id, map);
          }
        }
      }
    }
  }
  
  protected void _getFullIds(final HasOptions question, final String pid, final HashMap<String,Meta> map) {
    EList<Option> _options = question.getOptions();
    for (final Option option : _options) {
      {
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
        final String id = _xifexpression;
        this.getFullIds(option, id, map);
      }
    }
  }
  
  protected void _getFullIds(final AnswerTemplateRef templateRef, final String pid, final HashMap<String,Meta> map) {
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(pid);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      AnswerTemplate _template = templateRef.getTemplate();
      EList<Answer> _answers = _template.getAnswers();
      for (final Answer answer : _answers) {
        this.getFullIds(answer, pid, map);
      }
    }
  }
  
  protected void _getFullIds(final Answer answer, final String pid, final HashMap<String,Meta> map) {
    String _name = answer.getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      String _plus = (pid + "-");
      String _name_1 = answer.getName();
      String _plus_1 = (_plus + _name_1);
      final String id = _plus_1.substring(1);
      final String s = String.format(DslValidator.ambiguousIdString, id);
      boolean _containsKey = map.containsKey(id);
      if (_containsKey) {
        this.error(s, answer, 
          Literals.META__NAME, 
          DslValidator.INVALID_VALUE);
        Meta _get = map.get(id);
        this.error(s, _get, 
          Literals.META__NAME, 
          DslValidator.INVALID_VALUE);
      } else {
        map.put(id, answer);
      }
    }
  }
  
  public void getFullIds(final EObject question, final String pid, final HashMap<String,Meta> map) {
    if (question instanceof Table) {
      _getFullIds((Table)question, pid, map);
      return;
    } else if (question instanceof Group) {
      _getFullIds((Group)question, pid, map);
      return;
    } else if (question instanceof HasOptions) {
      _getFullIds((HasOptions)question, pid, map);
      return;
    } else if (question instanceof Question) {
      _getFullIds((Question)question, pid, map);
      return;
    } else if (question instanceof Answer) {
      _getFullIds((Answer)question, pid, map);
      return;
    } else if (question instanceof AnswerTemplateRef) {
      _getFullIds((AnswerTemplateRef)question, pid, map);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(question, pid, map).toString());
    }
  }
}
