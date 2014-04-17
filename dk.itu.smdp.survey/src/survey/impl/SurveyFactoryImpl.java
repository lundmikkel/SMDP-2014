/**
 */
package survey.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import survey.Answer;
import survey.AnswerTemplate;
import survey.AnswerTemplateRef;
import survey.Date;
import survey.Group;
import survey.Multiple;
import survey.Scale;
import survey.Single;
import survey.Survey;
import survey.SurveyFactory;
import survey.SurveyPackage;
import survey.Table;
import survey.TableQuestion;
import survey.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveyFactoryImpl extends EFactoryImpl implements SurveyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SurveyFactory init() {
		try {
			SurveyFactory theSurveyFactory = (SurveyFactory)EPackage.Registry.INSTANCE.getEFactory(SurveyPackage.eNS_URI);
			if (theSurveyFactory != null) {
				return theSurveyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SurveyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SurveyPackage.SURVEY: return createSurvey();
			case SurveyPackage.GROUP: return createGroup();
			case SurveyPackage.TEXT: return createText();
			case SurveyPackage.SCALE: return createScale();
			case SurveyPackage.DATE: return createDate();
			case SurveyPackage.NUMBER: return createNumber();
			case SurveyPackage.SINGLE: return createSingle();
			case SurveyPackage.MULTIPLE: return createMultiple();
			case SurveyPackage.TABLE: return createTable();
			case SurveyPackage.TABLE_QUESTION: return createTableQuestion();
			case SurveyPackage.ANSWER_TEMPLATE_REF: return createAnswerTemplateRef();
			case SurveyPackage.ANSWER: return createAnswer();
			case SurveyPackage.ANSWER_TEMPLATE: return createAnswerTemplate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey createSurvey() {
		SurveyImpl survey = new SurveyImpl();
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Single createSingle() {
		SingleImpl single = new SingleImpl();
		return single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiple createMultiple() {
		MultipleImpl multiple = new MultipleImpl();
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public survey.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scale createScale() {
		ScaleImpl scale = new ScaleImpl();
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerTemplate createAnswerTemplate() {
		AnswerTemplateImpl answerTemplate = new AnswerTemplateImpl();
		return answerTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableQuestion createTableQuestion() {
		TableQuestionImpl tableQuestion = new TableQuestionImpl();
		return tableQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerTemplateRef createAnswerTemplateRef() {
		AnswerTemplateRefImpl answerTemplateRef = new AnswerTemplateRefImpl();
		return answerTemplateRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyPackage getSurveyPackage() {
		return (SurveyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SurveyPackage getPackage() {
		return SurveyPackage.eINSTANCE;
	}

} //SurveyFactoryImpl
