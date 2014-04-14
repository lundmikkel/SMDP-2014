/**
 * generated by Xtext
 */
package dk.itu.smdp.survey.validation;

import com.google.common.collect.Iterables;
import dk.itu.smdp.survey.validation.AbstractDslValidator;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import survey.Answer;
import survey.AnswerTemplate;
import survey.Group;
import survey.Item;
import survey.Multiple;
import survey.Option;
import survey.Question;
import survey.Single;
import survey.Survey;
import survey.SurveyPackage.Literals;
import survey.Table;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class DslValidator extends AbstractDslValidator {
  public final static String DUPLICATE_NAME = "duplicateName";
  
  /**
   * Check that the groups have unique titles
   */
  @Check
  public void checkThatGroupTitlesAreUnique(final Survey survey) {
    HashMap<String,Group> _hashMap = new HashMap<String, Group>();
    HashMap<String,Group> groupMap = _hashMap;
    EList<Item> _items = survey.getItems();
    Iterable<Group> _filter = Iterables.<Group>filter(_items, Group.class);
    for (final Group group : _filter) {
      String _title = group.getTitle();
      boolean _isEmpty = _title.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _title_1 = group.getTitle();
        boolean _containsKey = groupMap.containsKey(_title_1);
        if (_containsKey) {
          this.error(
            "Groups must have unique titles", group, 
            Literals.TITLE_AND_DESCRIPTION__TITLE, 
            DslValidator.DUPLICATE_NAME);
        } else {
          String _title_2 = group.getTitle();
          groupMap.put(_title_2, group);
        }
      }
    }
  }
  
  /**
   * Check that questions, not in a group, have a unique ID
   */
  @Check
  public void checkThatQuestionIDsAreUnique(final Survey survey) {
    HashMap<String,Question> _hashMap = new HashMap<String, Question>();
    HashMap<String,Question> questionMap = _hashMap;
    EList<Item> _items = survey.getItems();
    Iterable<Question> _filter = Iterables.<Question>filter(_items, Question.class);
    for (final Question question : _filter) {
      String _id = question.getId();
      boolean _isEmpty = _id.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _id_1 = question.getId();
        boolean _containsKey = questionMap.containsKey(_id_1);
        if (_containsKey) {
          this.error(
            "Questions must have unique IDs", question, 
            Literals.QUESTION__ID, 
            DslValidator.DUPLICATE_NAME);
        } else {
          String _id_2 = question.getId();
          questionMap.put(_id_2, question);
        }
      }
    }
  }
  
  /**
   * Check that answers in questions outside of a group have unique IDs
   */
  @Check
  public void checkThatAnswerIDsAreUnique(final Survey survey) {
    EList<Item> _items = survey.getItems();
    Iterable<Question> _filter = Iterables.<Question>filter(_items, Question.class);
    for (final Question question : _filter) {
      {
        HashMap<String,Answer> _hashMap = new HashMap<String, Answer>();
        HashMap<String,Answer> answerMap = _hashMap;
        if ((question instanceof Single)) {
          Single s = ((Single) question);
          EList<Option> _options = s.getOptions();
          Iterable<Answer> _filter_1 = Iterables.<Answer>filter(_options, Answer.class);
          for (final Answer answer : _filter_1) {
            String _id = answer.getId();
            boolean _isEmpty = _id.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              String _id_1 = answer.getId();
              boolean _containsKey = answerMap.containsKey(_id_1);
              if (_containsKey) {
                this.error(
                  "Answers within a Single must have unique IDs", answer, 
                  Literals.ANSWER__ID, 
                  DslValidator.DUPLICATE_NAME);
              } else {
                String _id_2 = answer.getId();
                answerMap.put(_id_2, answer);
              }
            }
          }
        } else {
          if ((question instanceof Multiple)) {
            Multiple m = ((Multiple) question);
            EList<Option> _options_1 = m.getOptions();
            Iterable<Answer> _filter_2 = Iterables.<Answer>filter(_options_1, Answer.class);
            for (final Answer answer_1 : _filter_2) {
              String _id_3 = answer_1.getId();
              boolean _isEmpty_1 = _id_3.isEmpty();
              boolean _not_1 = (!_isEmpty_1);
              if (_not_1) {
                String _id_4 = answer_1.getId();
                boolean _containsKey_1 = answerMap.containsKey(_id_4);
                if (_containsKey_1) {
                  this.error(
                    "Answers within a Multiple must have unique IDs", answer_1, 
                    Literals.ANSWER__ID, 
                    DslValidator.DUPLICATE_NAME);
                } else {
                  String _id_5 = answer_1.getId();
                  answerMap.put(_id_5, answer_1);
                }
              }
            }
          }
        }
        if ((question instanceof Table)) {
          Table t = ((Table) question);
          EList<Option> _options_2 = t.getOptions();
          Iterable<Answer> _filter_3 = Iterables.<Answer>filter(_options_2, Answer.class);
          for (final Answer answer_2 : _filter_3) {
            String _id_6 = answer_2.getId();
            boolean _isEmpty_2 = _id_6.isEmpty();
            boolean _not_2 = (!_isEmpty_2);
            if (_not_2) {
              String _id_7 = answer_2.getId();
              boolean _containsKey_2 = answerMap.containsKey(_id_7);
              if (_containsKey_2) {
                this.error(
                  "Answers within a Table must have unique IDs", answer_2, 
                  Literals.ANSWER__ID, 
                  DslValidator.DUPLICATE_NAME);
              } else {
                String _id_8 = answer_2.getId();
                answerMap.put(_id_8, answer_2);
              }
            }
          }
        }
      }
    }
  }
  
  /**
   * Check that the questions in each group have unique IDs
   */
  @Check
  public void checkThatQuestionIDsInGroupsAreUnique(final Survey survey) {
    HashMap<String,Question> _hashMap = new HashMap<String, Question>();
    HashMap<String,Question> questionMap = _hashMap;
    EList<Item> _items = survey.getItems();
    Iterable<Group> _filter = Iterables.<Group>filter(_items, Group.class);
    for (final Group group : _filter) {
      EList<Question> _questions = group.getQuestions();
      for (final Question question : _questions) {
        String _id = question.getId();
        boolean _isEmpty = _id.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          String _id_1 = question.getId();
          boolean _containsKey = questionMap.containsKey(_id_1);
          if (_containsKey) {
            this.error(
              "Questions within a group must have unique IDs", question, 
              Literals.QUESTION__ID, 
              DslValidator.DUPLICATE_NAME);
          } else {
            String _id_2 = question.getId();
            questionMap.put(_id_2, question);
          }
        }
      }
    }
  }
  
  /**
   * Check that the answers in each question (of type Single, Multiple or Table) in each group have unique IDs
   */
  @Check
  public void checkThatAnswerIDsInGroupsAreUnique(final Survey survey) {
    EList<Item> _items = survey.getItems();
    Iterable<Group> _filter = Iterables.<Group>filter(_items, Group.class);
    for (final Group group : _filter) {
      EList<Question> _questions = group.getQuestions();
      for (final Question question : _questions) {
        {
          HashMap<String,Answer> _hashMap = new HashMap<String, Answer>();
          HashMap<String,Answer> answerMap = _hashMap;
          if ((question instanceof Single)) {
            Single s = ((Single) question);
            EList<Option> _options = s.getOptions();
            Iterable<Answer> _filter_1 = Iterables.<Answer>filter(_options, Answer.class);
            for (final Answer answer : _filter_1) {
              String _id = answer.getId();
              boolean _isEmpty = _id.isEmpty();
              boolean _not = (!_isEmpty);
              if (_not) {
                String _id_1 = answer.getId();
                boolean _containsKey = answerMap.containsKey(_id_1);
                if (_containsKey) {
                  this.error(
                    "Answers within a Single must have unique IDs", answer, 
                    Literals.ANSWER__ID, 
                    DslValidator.DUPLICATE_NAME);
                } else {
                  String _id_2 = answer.getId();
                  answerMap.put(_id_2, answer);
                }
              }
            }
          }
          if ((question instanceof Multiple)) {
            Multiple m = ((Multiple) question);
            EList<Option> _options_1 = m.getOptions();
            Iterable<Answer> _filter_2 = Iterables.<Answer>filter(_options_1, Answer.class);
            for (final Answer answer_1 : _filter_2) {
              String _id_3 = answer_1.getId();
              boolean _isEmpty_1 = _id_3.isEmpty();
              boolean _not_1 = (!_isEmpty_1);
              if (_not_1) {
                String _id_4 = answer_1.getId();
                boolean _containsKey_1 = answerMap.containsKey(_id_4);
                if (_containsKey_1) {
                  this.error(
                    "Answers within a Multiple must have unique IDs", answer_1, 
                    Literals.ANSWER__ID, 
                    DslValidator.DUPLICATE_NAME);
                } else {
                  String _id_5 = answer_1.getId();
                  answerMap.put(_id_5, answer_1);
                }
              }
            }
          }
          if ((question instanceof Table)) {
            Table t = ((Table) question);
            EList<Option> _options_2 = t.getOptions();
            Iterable<Answer> _filter_3 = Iterables.<Answer>filter(_options_2, Answer.class);
            for (final Answer answer_2 : _filter_3) {
              String _id_6 = answer_2.getId();
              boolean _isEmpty_2 = _id_6.isEmpty();
              boolean _not_2 = (!_isEmpty_2);
              if (_not_2) {
                String _id_7 = answer_2.getId();
                boolean _containsKey_2 = answerMap.containsKey(_id_7);
                if (_containsKey_2) {
                  this.error(
                    "Answers within a Table must have unique IDs", answer_2, 
                    Literals.ANSWER__ID, 
                    DslValidator.DUPLICATE_NAME);
                } else {
                  String _id_8 = answer_2.getId();
                  answerMap.put(_id_8, answer_2);
                }
              }
            }
          }
        }
      }
    }
  }
  
  /**
   * Check that the AnswerTemplates have unique IDs
   */
  @Check
  public void checkThatAnswerTemplateIDsAreUnique(final Survey survey) {
    HashMap<String,AnswerTemplate> _hashMap = new HashMap<String, AnswerTemplate>();
    HashMap<String,AnswerTemplate> answerTemplateMap = _hashMap;
    EList<AnswerTemplate> _templates = survey.getTemplates();
    for (final AnswerTemplate answerTemplate : _templates) {
      String _id = answerTemplate.getId();
      boolean _isEmpty = _id.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _id_1 = answerTemplate.getId();
        boolean _containsKey = answerTemplateMap.containsKey(_id_1);
        if (_containsKey) {
          this.error(
            "AnswerTemplates must have unique IDs", answerTemplate, 
            Literals.ANSWER_TEMPLATE__ID, 
            DslValidator.DUPLICATE_NAME);
        } else {
          String _id_2 = answerTemplate.getId();
          answerTemplateMap.put(_id_2, answerTemplate);
        }
      }
    }
  }
  
  /**
   * Check that the ID of answers in AnswerTemplates have unique IDs
   */
  @Check
  public void checkThatIDsOfAnswersInAnswerTemplatesAreUnique(final Survey survey) {
    HashMap<String,Answer> _hashMap = new HashMap<String, Answer>();
    HashMap<String,Answer> answerMap = _hashMap;
    EList<AnswerTemplate> _templates = survey.getTemplates();
    for (final AnswerTemplate answerTemplate : _templates) {
      EList<Answer> _answers = answerTemplate.getAnswers();
      for (final Answer answer : _answers) {
        String _id = answer.getId();
        boolean _isEmpty = _id.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          String _id_1 = answer.getId();
          boolean _containsKey = answerMap.containsKey(_id_1);
          if (_containsKey) {
            this.error(
              "Answers within AnswerTemplates must have unique IDs", answerTemplate, 
              Literals.ANSWER__ID, 
              DslValidator.DUPLICATE_NAME);
          } else {
            String _id_2 = answer.getId();
            answerMap.put(_id_2, answer);
          }
        }
      }
    }
  }
}
