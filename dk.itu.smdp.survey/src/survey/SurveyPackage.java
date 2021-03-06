/**
 */
package survey;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see survey.SurveyFactory
 * @model kind="package"
 * @generated
 */
public interface SurveyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "survey";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://survey/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "survey";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurveyPackage eINSTANCE = survey.impl.SurveyPackageImpl.init();

	/**
	 * The meta object id for the '{@link survey.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.MetaImpl
	 * @see survey.impl.SurveyPackageImpl#getMeta()
	 * @generated
	 */
	int META = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.SurveyImpl
	 * @see survey.impl.SurveyPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__NAME = META__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__TITLE = META__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__DESCRIPTION = META__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__ITEMS = META_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__TEMPLATES = META_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__MAIL = META_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = META_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_OPERATION_COUNT = META_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.ItemImpl
	 * @see survey.impl.SurveyPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = META__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TITLE = META__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DESCRIPTION = META__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__REQUIRED = META_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DEPENDS_ON = META_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = META_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = META_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.GroupImpl
	 * @see survey.impl.SurveyPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__REQUIRED = ITEM__REQUIRED;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DEPENDS_ON = ITEM__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__QUESTIONS = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.QuestionImpl
	 * @see survey.impl.SurveyPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DESCRIPTION = ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REQUIRED = ITEM__REQUIRED;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DEPENDS_ON = ITEM__DEPENDS_ON;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.TextImpl
	 * @see survey.impl.SurveyPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TITLE = QUESTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DESCRIPTION = QUESTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DEPENDS_ON = QUESTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MULTI = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.ScaleImpl <em>Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.ScaleImpl
	 * @see survey.impl.SurveyPackageImpl#getScale()
	 * @generated
	 */
	int SCALE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__TITLE = QUESTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__DESCRIPTION = QUESTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__DEPENDS_ON = QUESTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__MIN = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__MAX = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__MIN_LABEL = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__MAX_LABEL = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.DateImpl
	 * @see survey.impl.SurveyPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__TITLE = QUESTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DESCRIPTION = QUESTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DEPENDS_ON = QUESTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MODE = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__START = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__END = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Show Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__SHOW_LIMITS = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.NumberImpl
	 * @see survey.impl.SurveyPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__TITLE = QUESTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__DESCRIPTION = QUESTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__DEPENDS_ON = QUESTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__MIN = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__MAX = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__SHOW_LIMITS = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.HasOptionsImpl <em>Has Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.HasOptionsImpl
	 * @see survey.impl.SurveyPackageImpl#getHasOptions()
	 * @generated
	 */
	int HAS_OPTIONS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPTIONS__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPTIONS__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPTIONS__DESCRIPTION = ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPTIONS__REQUIRED = ITEM__REQUIRED;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPTIONS__DEPENDS_ON = ITEM__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPTIONS__OPTIONS = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Has Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPTIONS_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Has Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OPTIONS_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.HasOtherImpl <em>Has Other</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.HasOtherImpl
	 * @see survey.impl.SurveyPackageImpl#getHasOther()
	 * @generated
	 */
	int HAS_OTHER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OTHER__NAME = HAS_OPTIONS__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OTHER__TITLE = HAS_OPTIONS__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OTHER__DESCRIPTION = HAS_OPTIONS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OTHER__REQUIRED = HAS_OPTIONS__REQUIRED;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OTHER__DEPENDS_ON = HAS_OPTIONS__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OTHER__OPTIONS = HAS_OPTIONS__OPTIONS;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OTHER__OTHER = HAS_OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OTHER__OTHER_LABEL = HAS_OPTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Has Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OTHER_FEATURE_COUNT = HAS_OPTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Has Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_OTHER_OPERATION_COUNT = HAS_OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.OptionImpl
	 * @see survey.impl.SurveyPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 11;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.SingleImpl <em>Single</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.SingleImpl
	 * @see survey.impl.SurveyPackageImpl#getSingle()
	 * @generated
	 */
	int SINGLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__TITLE = QUESTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__DESCRIPTION = QUESTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__DEPENDS_ON = QUESTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__OPTIONS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__OTHER = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Other Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__OTHER_LABEL = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.MultipleImpl <em>Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.MultipleImpl
	 * @see survey.impl.SurveyPackageImpl#getMultiple()
	 * @generated
	 */
	int MULTIPLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__TITLE = QUESTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__DESCRIPTION = QUESTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__DEPENDS_ON = QUESTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__OPTIONS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__OTHER = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Other Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__OTHER_LABEL = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__MIN = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__MAX = QUESTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Show Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__SHOW_LIMITS = QUESTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.TableImpl
	 * @see survey.impl.SurveyPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TITLE = QUESTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DESCRIPTION = QUESTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DEPENDS_ON = QUESTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__OPTIONS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__OTHER = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Other Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__OTHER_LABEL = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__QUESTIONS = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MULTIPLE = QUESTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.TableQuestionImpl <em>Table Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.TableQuestionImpl
	 * @see survey.impl.SurveyPackageImpl#getTableQuestion()
	 * @generated
	 */
	int TABLE_QUESTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION__NAME = META__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION__TITLE = META__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION__DESCRIPTION = META__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION__REQUIRED = META_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION_FEATURE_COUNT = META_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_QUESTION_OPERATION_COUNT = META_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.AnswerTemplateRefImpl <em>Answer Template Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.AnswerTemplateRefImpl
	 * @see survey.impl.SurveyPackageImpl#getAnswerTemplateRef()
	 * @generated
	 */
	int ANSWER_TEMPLATE_REF = 16;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_TEMPLATE_REF__TEMPLATE = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Answer Template Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_TEMPLATE_REF_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Answer Template Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_TEMPLATE_REF_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.AnswerImpl
	 * @see survey.impl.SurveyPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__NAME = OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__TITLE = OPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__DESCRIPTION = OPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = OPTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.AnswerTemplateImpl <em>Answer Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.AnswerTemplateImpl
	 * @see survey.impl.SurveyPackageImpl#getAnswerTemplate()
	 * @generated
	 */
	int ANSWER_TEMPLATE = 18;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_TEMPLATE__ANSWERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_TEMPLATE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Answer Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_TEMPLATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Answer Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.DateMode <em>Date Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.DateMode
	 * @see survey.impl.SurveyPackageImpl#getDateMode()
	 * @generated
	 */
	int DATE_MODE = 19;


	/**
	 * Returns the meta object for class '{@link survey.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see survey.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the attribute '{@link survey.Meta#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see survey.Meta#getName()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Name();

	/**
	 * Returns the meta object for the attribute '{@link survey.Meta#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see survey.Meta#getTitle()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Title();

	/**
	 * Returns the meta object for the attribute '{@link survey.Meta#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see survey.Meta#getDescription()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Description();

	/**
	 * Returns the meta object for class '{@link survey.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see survey.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Survey#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see survey.Survey#getItems()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Survey#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see survey.Survey#getTemplates()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Templates();

	/**
	 * Returns the meta object for the attribute '{@link survey.Survey#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see survey.Survey#getMail()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Mail();

	/**
	 * Returns the meta object for class '{@link survey.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see survey.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link survey.Item#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see survey.Item#isRequired()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Required();

	/**
	 * Returns the meta object for the attribute '{@link survey.Item#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depends On</em>'.
	 * @see survey.Item#getDependsOn()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_DependsOn();

	/**
	 * Returns the meta object for class '{@link survey.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see survey.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Group#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see survey.Group#getQuestions()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Questions();

	/**
	 * Returns the meta object for class '{@link survey.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see survey.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for class '{@link survey.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see survey.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link survey.Text#isMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi</em>'.
	 * @see survey.Text#isMulti()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Multi();

	/**
	 * Returns the meta object for class '{@link survey.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale</em>'.
	 * @see survey.Scale
	 * @generated
	 */
	EClass getScale();

	/**
	 * Returns the meta object for the attribute '{@link survey.Scale#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.Scale#getMin()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_Min();

	/**
	 * Returns the meta object for the attribute '{@link survey.Scale#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.Scale#getMax()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_Max();

	/**
	 * Returns the meta object for the attribute '{@link survey.Scale#getMinLabel <em>Min Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Label</em>'.
	 * @see survey.Scale#getMinLabel()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_MinLabel();

	/**
	 * Returns the meta object for the attribute '{@link survey.Scale#getMaxLabel <em>Max Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Label</em>'.
	 * @see survey.Scale#getMaxLabel()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_MaxLabel();

	/**
	 * Returns the meta object for class '{@link survey.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see survey.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link survey.Date#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see survey.Date#getMode()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Mode();

	/**
	 * Returns the meta object for the attribute '{@link survey.Date#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see survey.Date#getStart()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Start();

	/**
	 * Returns the meta object for the attribute '{@link survey.Date#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see survey.Date#getEnd()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_End();

	/**
	 * Returns the meta object for the attribute '{@link survey.Date#isShowLimits <em>Show Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Limits</em>'.
	 * @see survey.Date#isShowLimits()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_ShowLimits();

	/**
	 * Returns the meta object for class '{@link survey.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see survey.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link survey.Number#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.Number#getMin()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Min();

	/**
	 * Returns the meta object for the attribute '{@link survey.Number#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.Number#getMax()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Max();

	/**
	 * Returns the meta object for the attribute '{@link survey.Number#isShowLimits <em>Show Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Limits</em>'.
	 * @see survey.Number#isShowLimits()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_ShowLimits();

	/**
	 * Returns the meta object for class '{@link survey.HasOther <em>Has Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Other</em>'.
	 * @see survey.HasOther
	 * @generated
	 */
	EClass getHasOther();

	/**
	 * Returns the meta object for the attribute '{@link survey.HasOther#isOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other</em>'.
	 * @see survey.HasOther#isOther()
	 * @see #getHasOther()
	 * @generated
	 */
	EAttribute getHasOther_Other();

	/**
	 * Returns the meta object for the attribute '{@link survey.HasOther#getOtherLabel <em>Other Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Label</em>'.
	 * @see survey.HasOther#getOtherLabel()
	 * @see #getHasOther()
	 * @generated
	 */
	EAttribute getHasOther_OtherLabel();

	/**
	 * Returns the meta object for class '{@link survey.HasOptions <em>Has Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Options</em>'.
	 * @see survey.HasOptions
	 * @generated
	 */
	EClass getHasOptions();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.HasOptions#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see survey.HasOptions#getOptions()
	 * @see #getHasOptions()
	 * @generated
	 */
	EReference getHasOptions_Options();

	/**
	 * Returns the meta object for class '{@link survey.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see survey.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for class '{@link survey.Single <em>Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single</em>'.
	 * @see survey.Single
	 * @generated
	 */
	EClass getSingle();

	/**
	 * Returns the meta object for class '{@link survey.Multiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple</em>'.
	 * @see survey.Multiple
	 * @generated
	 */
	EClass getMultiple();

	/**
	 * Returns the meta object for the attribute '{@link survey.Multiple#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.Multiple#getMin()
	 * @see #getMultiple()
	 * @generated
	 */
	EAttribute getMultiple_Min();

	/**
	 * Returns the meta object for the attribute '{@link survey.Multiple#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.Multiple#getMax()
	 * @see #getMultiple()
	 * @generated
	 */
	EAttribute getMultiple_Max();

	/**
	 * Returns the meta object for the attribute '{@link survey.Multiple#isShowLimits <em>Show Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Limits</em>'.
	 * @see survey.Multiple#isShowLimits()
	 * @see #getMultiple()
	 * @generated
	 */
	EAttribute getMultiple_ShowLimits();

	/**
	 * Returns the meta object for class '{@link survey.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see survey.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Table#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see survey.Table#getQuestions()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Questions();

	/**
	 * Returns the meta object for the attribute '{@link survey.Table#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see survey.Table#isMultiple()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Multiple();

	/**
	 * Returns the meta object for class '{@link survey.TableQuestion <em>Table Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Question</em>'.
	 * @see survey.TableQuestion
	 * @generated
	 */
	EClass getTableQuestion();

	/**
	 * Returns the meta object for the attribute '{@link survey.TableQuestion#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see survey.TableQuestion#isRequired()
	 * @see #getTableQuestion()
	 * @generated
	 */
	EAttribute getTableQuestion_Required();

	/**
	 * Returns the meta object for class '{@link survey.AnswerTemplateRef <em>Answer Template Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Template Ref</em>'.
	 * @see survey.AnswerTemplateRef
	 * @generated
	 */
	EClass getAnswerTemplateRef();

	/**
	 * Returns the meta object for the reference '{@link survey.AnswerTemplateRef#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see survey.AnswerTemplateRef#getTemplate()
	 * @see #getAnswerTemplateRef()
	 * @generated
	 */
	EReference getAnswerTemplateRef_Template();

	/**
	 * Returns the meta object for class '{@link survey.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see survey.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for class '{@link survey.AnswerTemplate <em>Answer Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Template</em>'.
	 * @see survey.AnswerTemplate
	 * @generated
	 */
	EClass getAnswerTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.AnswerTemplate#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see survey.AnswerTemplate#getAnswers()
	 * @see #getAnswerTemplate()
	 * @generated
	 */
	EReference getAnswerTemplate_Answers();

	/**
	 * Returns the meta object for the attribute '{@link survey.AnswerTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see survey.AnswerTemplate#getName()
	 * @see #getAnswerTemplate()
	 * @generated
	 */
	EAttribute getAnswerTemplate_Name();

	/**
	 * Returns the meta object for enum '{@link survey.DateMode <em>Date Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Mode</em>'.
	 * @see survey.DateMode
	 * @generated
	 */
	EEnum getDateMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SurveyFactory getSurveyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link survey.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.MetaImpl
		 * @see survey.impl.SurveyPackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__NAME = eINSTANCE.getMeta_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__TITLE = eINSTANCE.getMeta_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__DESCRIPTION = eINSTANCE.getMeta_Description();

		/**
		 * The meta object literal for the '{@link survey.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.SurveyImpl
		 * @see survey.impl.SurveyPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__ITEMS = eINSTANCE.getSurvey_Items();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__TEMPLATES = eINSTANCE.getSurvey_Templates();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__MAIL = eINSTANCE.getSurvey_Mail();

		/**
		 * The meta object literal for the '{@link survey.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.ItemImpl
		 * @see survey.impl.SurveyPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__REQUIRED = eINSTANCE.getItem_Required();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__DEPENDS_ON = eINSTANCE.getItem_DependsOn();

		/**
		 * The meta object literal for the '{@link survey.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.GroupImpl
		 * @see survey.impl.SurveyPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__QUESTIONS = eINSTANCE.getGroup_Questions();

		/**
		 * The meta object literal for the '{@link survey.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.QuestionImpl
		 * @see survey.impl.SurveyPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link survey.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.TextImpl
		 * @see survey.impl.SurveyPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__MULTI = eINSTANCE.getText_Multi();

		/**
		 * The meta object literal for the '{@link survey.impl.ScaleImpl <em>Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.ScaleImpl
		 * @see survey.impl.SurveyPackageImpl#getScale()
		 * @generated
		 */
		EClass SCALE = eINSTANCE.getScale();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__MIN = eINSTANCE.getScale_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__MAX = eINSTANCE.getScale_Max();

		/**
		 * The meta object literal for the '<em><b>Min Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__MIN_LABEL = eINSTANCE.getScale_MinLabel();

		/**
		 * The meta object literal for the '<em><b>Max Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__MAX_LABEL = eINSTANCE.getScale_MaxLabel();

		/**
		 * The meta object literal for the '{@link survey.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.DateImpl
		 * @see survey.impl.SurveyPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__MODE = eINSTANCE.getDate_Mode();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__START = eINSTANCE.getDate_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__END = eINSTANCE.getDate_End();

		/**
		 * The meta object literal for the '<em><b>Show Limits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__SHOW_LIMITS = eINSTANCE.getDate_ShowLimits();

		/**
		 * The meta object literal for the '{@link survey.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.NumberImpl
		 * @see survey.impl.SurveyPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__MIN = eINSTANCE.getNumber_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__MAX = eINSTANCE.getNumber_Max();

		/**
		 * The meta object literal for the '<em><b>Show Limits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__SHOW_LIMITS = eINSTANCE.getNumber_ShowLimits();

		/**
		 * The meta object literal for the '{@link survey.impl.HasOtherImpl <em>Has Other</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.HasOtherImpl
		 * @see survey.impl.SurveyPackageImpl#getHasOther()
		 * @generated
		 */
		EClass HAS_OTHER = eINSTANCE.getHasOther();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_OTHER__OTHER = eINSTANCE.getHasOther_Other();

		/**
		 * The meta object literal for the '<em><b>Other Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_OTHER__OTHER_LABEL = eINSTANCE.getHasOther_OtherLabel();

		/**
		 * The meta object literal for the '{@link survey.impl.HasOptionsImpl <em>Has Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.HasOptionsImpl
		 * @see survey.impl.SurveyPackageImpl#getHasOptions()
		 * @generated
		 */
		EClass HAS_OPTIONS = eINSTANCE.getHasOptions();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_OPTIONS__OPTIONS = eINSTANCE.getHasOptions_Options();

		/**
		 * The meta object literal for the '{@link survey.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.OptionImpl
		 * @see survey.impl.SurveyPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '{@link survey.impl.SingleImpl <em>Single</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.SingleImpl
		 * @see survey.impl.SurveyPackageImpl#getSingle()
		 * @generated
		 */
		EClass SINGLE = eINSTANCE.getSingle();

		/**
		 * The meta object literal for the '{@link survey.impl.MultipleImpl <em>Multiple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.MultipleImpl
		 * @see survey.impl.SurveyPackageImpl#getMultiple()
		 * @generated
		 */
		EClass MULTIPLE = eINSTANCE.getMultiple();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE__MIN = eINSTANCE.getMultiple_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE__MAX = eINSTANCE.getMultiple_Max();

		/**
		 * The meta object literal for the '<em><b>Show Limits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE__SHOW_LIMITS = eINSTANCE.getMultiple_ShowLimits();

		/**
		 * The meta object literal for the '{@link survey.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.TableImpl
		 * @see survey.impl.SurveyPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__QUESTIONS = eINSTANCE.getTable_Questions();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__MULTIPLE = eINSTANCE.getTable_Multiple();

		/**
		 * The meta object literal for the '{@link survey.impl.TableQuestionImpl <em>Table Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.TableQuestionImpl
		 * @see survey.impl.SurveyPackageImpl#getTableQuestion()
		 * @generated
		 */
		EClass TABLE_QUESTION = eINSTANCE.getTableQuestion();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_QUESTION__REQUIRED = eINSTANCE.getTableQuestion_Required();

		/**
		 * The meta object literal for the '{@link survey.impl.AnswerTemplateRefImpl <em>Answer Template Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.AnswerTemplateRefImpl
		 * @see survey.impl.SurveyPackageImpl#getAnswerTemplateRef()
		 * @generated
		 */
		EClass ANSWER_TEMPLATE_REF = eINSTANCE.getAnswerTemplateRef();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER_TEMPLATE_REF__TEMPLATE = eINSTANCE.getAnswerTemplateRef_Template();

		/**
		 * The meta object literal for the '{@link survey.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.AnswerImpl
		 * @see survey.impl.SurveyPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '{@link survey.impl.AnswerTemplateImpl <em>Answer Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.AnswerTemplateImpl
		 * @see survey.impl.SurveyPackageImpl#getAnswerTemplate()
		 * @generated
		 */
		EClass ANSWER_TEMPLATE = eINSTANCE.getAnswerTemplate();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER_TEMPLATE__ANSWERS = eINSTANCE.getAnswerTemplate_Answers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER_TEMPLATE__NAME = eINSTANCE.getAnswerTemplate_Name();

		/**
		 * The meta object literal for the '{@link survey.DateMode <em>Date Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.DateMode
		 * @see survey.impl.SurveyPackageImpl#getDateMode()
		 * @generated
		 */
		EEnum DATE_MODE = eINSTANCE.getDateMode();

	}

} //SurveyPackage
