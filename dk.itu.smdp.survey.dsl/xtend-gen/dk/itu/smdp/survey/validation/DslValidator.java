/**
 * generated by Xtext
 */
package dk.itu.smdp.survey.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import dk.itu.smdp.survey.validation.AbstractDslValidator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import survey.Answer;
import survey.AnswerTemplate;
import survey.AnswerTemplateRef;
import survey.Group;
import survey.HasOptions;
import survey.Item;
import survey.Multiple;
import survey.Option;
import survey.Question;
import survey.Scale;
import survey.Survey;
import survey.SurveyPackage.Literals;

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
  
  private final static String minIsLessThanMaxString = "Max value must be larger than min value";
  
  private final static String uniqueIdsAtSameLevelString = "Ids at the same level must be unique";
  
  private final static String invalidRefIdString = "There is no answer with this id";
  
  private final static String ambiguousIdString = "The id %s is ambiguous";
  
  private final static String noNegativeValueString = "The value must be non-negative";
  
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
      boolean _greaterEqualsThan = (min.compareTo(max) >= 0);
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
      boolean _greaterEqualsThan = (min.compareTo(max) >= 0);
      _and = (_and_1 && _greaterEqualsThan);
    }
    if (_and) {
      this.error(
        DslValidator.minIsLessThanMaxString, multiple, 
        Literals.NUMBER__MIN, 
        DslValidator.INVALID_VALUE);
      this.error(
        DslValidator.minIsLessThanMaxString, multiple, 
        Literals.NUMBER__MAX, 
        DslValidator.INVALID_VALUE);
    }
    boolean _and_2 = false;
    boolean _notEquals_2 = (!Objects.equal(min, null));
    if (!_notEquals_2) {
      _and_2 = false;
    } else {
      boolean _lessThan = ((min).intValue() < 0);
      _and_2 = (_notEquals_2 && _lessThan);
    }
    if (_and_2) {
      this.error(
        DslValidator.noNegativeValueString, multiple, 
        Literals.NUMBER__MIN, 
        DslValidator.INVALID_VALUE);
    }
    boolean _and_3 = false;
    boolean _notEquals_3 = (!Objects.equal(max, null));
    if (!_notEquals_3) {
      _and_3 = false;
    } else {
      boolean _lessThan_1 = ((max).intValue() < 0);
      _and_3 = (_notEquals_3 && _lessThan_1);
    }
    if (_and_3) {
      this.error(
        DslValidator.noNegativeValueString, multiple, 
        Literals.NUMBER__MAX, 
        DslValidator.INVALID_VALUE);
    }
  }
  
  /**
   * Check that groups and questions in root have unique names
   */
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
  
  /**
   * Check that questions at the same level have unique names
   */
  @Check
  public void checkUniqueQuestionNames(final Survey survey) {
    EList<Item> _items = survey.getItems();
    Iterable<Question> _filter = Iterables.<Question>filter(_items, Question.class);
    this.checkUniqueQuestionNames(_filter);
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
          Literals.ANSWER__NAME, 
          DslValidator.DUPLICATE_NAME);
        String _name_1 = answer.getName();
        Answer _get = map.get(_name_1);
        this.error(
          DslValidator.uniqueIdsAtSameLevelString, _get, 
          Literals.ANSWER__NAME, 
          DslValidator.DUPLICATE_NAME);
      } else {
        String _name_2 = answer.getName();
        map.put(_name_2, answer);
      }
    }
  }
  
  /**
   * TODO
   */
  @Check
  public void checkDependsOn(final Survey survey) {
    HashMap<String,Question> _hashMap = new HashMap<String, Question>();
    HashMap<String,Question> qMap = _hashMap;
    HashMap<String,Answer> _hashMap_1 = new HashMap<String, Answer>();
    HashMap<String,Answer> aMap = _hashMap_1;
    EList<Item> _items = survey.getItems();
    for (final Item item : _items) {
      this.getFullIds(item, "", qMap, aMap);
    }
    InputOutput.<String>println("Question keys:");
    Set<String> _keySet = qMap.keySet();
    for (final String key : _keySet) {
      InputOutput.<String>println(key);
    }
    InputOutput.<String>println("Answer keys:");
    Set<String> _keySet_1 = aMap.keySet();
    for (final String key_1 : _keySet_1) {
      InputOutput.<String>println(key_1);
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
      {
        String _dependsOn = item_1.getDependsOn();
        String _plus = ("Depends on: " + _dependsOn);
        InputOutput.<String>println(_plus);
        boolean _and = false;
        String _dependsOn_1 = item_1.getDependsOn();
        boolean _containsKey = qMap.containsKey(_dependsOn_1);
        boolean _not = (!_containsKey);
        if (!_not) {
          _and = false;
        } else {
          String _dependsOn_2 = item_1.getDependsOn();
          boolean _containsKey_1 = aMap.containsKey(_dependsOn_2);
          boolean _not_1 = (!_containsKey_1);
          _and = (_not && _not_1);
        }
        if (_and) {
          this.error(
            DslValidator.invalidRefIdString, item_1, 
            Literals.ITEM__DEPENDS_ON, 
            DslValidator.INVALID_VALUE);
        }
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
        {
          String _dependsOn = item_2.getDependsOn();
          String _plus = ("Depends on: " + _dependsOn);
          InputOutput.<String>println(_plus);
          boolean _and = false;
          String _dependsOn_1 = item_2.getDependsOn();
          boolean _containsKey = qMap.containsKey(_dependsOn_1);
          boolean _not = (!_containsKey);
          if (!_not) {
            _and = false;
          } else {
            String _dependsOn_2 = item_2.getDependsOn();
            boolean _containsKey_1 = aMap.containsKey(_dependsOn_2);
            boolean _not_1 = (!_containsKey_1);
            _and = (_not && _not_1);
          }
          if (_and) {
            this.error(
              DslValidator.invalidRefIdString, item_2, 
              Literals.ITEM__DEPENDS_ON, 
              DslValidator.INVALID_VALUE);
          }
        }
      }
    }
  }
  
  protected void _getFullIds(final Group group, final String pid, final HashMap<String,Question> qMap, final HashMap<String,Answer> aMap) {
    EList<Question> _questions = group.getQuestions();
    for (final Question question : _questions) {
      {
        String _xifexpression = null;
        String _name = group.getName();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
        if (_isNullOrEmpty) {
          _xifexpression = pid;
        } else {
          String _plus = (pid + ".");
          String _name_1 = group.getName();
          String _plus_1 = (_plus + _name_1);
          _xifexpression = _plus_1;
        }
        final String id = _xifexpression;
        this.getFullIds(question, id, qMap, aMap);
      }
    }
  }
  
  protected void _getFullIds(final Question question, final String pid, final HashMap<String,Question> qMap, final HashMap<String,Answer> aMap) {
    String _name = question.getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      String _plus = (pid + ".");
      String _name_1 = question.getName();
      String _plus_1 = (_plus + _name_1);
      final String id = _plus_1.substring(1);
      final String s = String.format(DslValidator.ambiguousIdString, id);
      boolean _containsKey = qMap.containsKey(id);
      if (_containsKey) {
        this.error(s, question, 
          Literals.META__NAME, 
          DslValidator.INVALID_VALUE);
        Question _get = qMap.get(id);
        this.error(s, _get, 
          Literals.META__NAME, 
          DslValidator.INVALID_VALUE);
      } else {
        boolean _containsKey_1 = aMap.containsKey(id);
        if (_containsKey_1) {
          this.error(s, question, 
            Literals.META__NAME, 
            DslValidator.INVALID_VALUE);
          Answer _get_1 = aMap.get(id);
          this.error(s, _get_1, 
            Literals.ANSWER__NAME, 
            DslValidator.INVALID_VALUE);
        } else {
          qMap.put(id, question);
        }
      }
    }
  }
  
  protected void _getFullIds(final HasOptions question, final String pid, final HashMap<String,Question> qMap, final HashMap<String,Answer> aMap) {
    EList<Option> _options = question.getOptions();
    for (final Option option : _options) {
      {
        String _xifexpression = null;
        String _name = question.getName();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
        if (_isNullOrEmpty) {
          _xifexpression = pid;
        } else {
          String _plus = (pid + ".");
          String _name_1 = question.getName();
          String _plus_1 = (_plus + _name_1);
          _xifexpression = _plus_1;
        }
        final String id = _xifexpression;
        this.getFullIds(option, id, qMap, aMap);
      }
    }
  }
  
  protected void _getFullIds(final AnswerTemplateRef templateRef, final String pid, final HashMap<String,Question> qMap, final HashMap<String,Answer> aMap) {
    AnswerTemplate _template = templateRef.getTemplate();
    EList<Answer> _answers = _template.getAnswers();
    for (final Answer answer : _answers) {
      {
        String _plus = (pid + ".");
        AnswerTemplate _template_1 = templateRef.getTemplate();
        String _name = _template_1.getName();
        final String id = (_plus + _name);
        this.getFullIds(answer, id, qMap, aMap);
      }
    }
  }
  
  protected void _getFullIds(final Answer answer, final String pid, final HashMap<String,Question> qMap, final HashMap<String,Answer> aMap) {
    String _name = answer.getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      String _plus = (pid + ".");
      String _name_1 = answer.getName();
      String _plus_1 = (_plus + _name_1);
      final String id = _plus_1.substring(1);
      final String s = String.format(DslValidator.ambiguousIdString, id);
      boolean _containsKey = qMap.containsKey(id);
      if (_containsKey) {
        this.error(s, answer, 
          Literals.ANSWER__NAME, 
          DslValidator.INVALID_VALUE);
        Question _get = qMap.get(id);
        this.error(s, _get, 
          Literals.META__NAME, 
          DslValidator.INVALID_VALUE);
      } else {
        boolean _containsKey_1 = aMap.containsKey(id);
        if (_containsKey_1) {
          this.error(s, answer, 
            Literals.ANSWER__NAME, 
            DslValidator.INVALID_VALUE);
          Answer _get_1 = aMap.get(id);
          this.error(s, _get_1, 
            Literals.ANSWER__NAME, 
            DslValidator.INVALID_VALUE);
        } else {
          aMap.put(id, answer);
        }
      }
    }
  }
  
  public void getFullIds(final EObject group, final String pid, final HashMap<String,Question> qMap, final HashMap<String,Answer> aMap) {
    if (group instanceof Group) {
      _getFullIds((Group)group, pid, qMap, aMap);
      return;
    } else if (group instanceof HasOptions) {
      _getFullIds((HasOptions)group, pid, qMap, aMap);
      return;
    } else if (group instanceof Question) {
      _getFullIds((Question)group, pid, qMap, aMap);
      return;
    } else if (group instanceof Answer) {
      _getFullIds((Answer)group, pid, qMap, aMap);
      return;
    } else if (group instanceof AnswerTemplateRef) {
      _getFullIds((AnswerTemplateRef)group, pid, qMap, aMap);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(group, pid, qMap, aMap).toString());
    }
  }
}
