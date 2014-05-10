/**
 */
package survey.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import survey.Other;
import survey.Question;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveyPackageImpl extends EPackageImpl implements SurveyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerTemplateRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerTemplateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see survey.SurveyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SurveyPackageImpl() {
		super(eNS_URI, SurveyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SurveyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SurveyPackage init() {
		if (isInited) return (SurveyPackage)EPackage.Registry.INSTANCE.getEPackage(SurveyPackage.eNS_URI);

		// Obtain or create and register package
		SurveyPackageImpl theSurveyPackage = (SurveyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SurveyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SurveyPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSurveyPackage.createPackageContents();

		// Initialize created meta-data
		theSurveyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSurveyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SurveyPackage.eNS_URI, theSurveyPackage);
		return theSurveyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeta() {
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Name() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Title() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Description() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurvey() {
		return surveyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurvey_Items() {
		return (EReference)surveyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurvey_Templates() {
		return (EReference)surveyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_Mail() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Required() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_DependsOn() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Questions() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Multiline() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScale() {
		return scaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScale_Min() {
		return (EAttribute)scaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScale_Max() {
		return (EAttribute)scaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScale_MinLabel() {
		return (EAttribute)scaleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScale_MaxLabel() {
		return (EAttribute)scaleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Day() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Month() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Year() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Start() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_End() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_ShowLimits() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber() {
		return numberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumber_Min() {
		return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumber_Max() {
		return (EAttribute)numberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumber_ShowLimits() {
		return (EAttribute)numberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOther() {
		return otherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOther_Other() {
		return (EAttribute)otherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOther_OtherLabel() {
		return (EAttribute)otherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasOptions() {
		return hasOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasOptions_Options() {
		return (EReference)hasOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingle() {
		return singleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiple() {
		return multipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiple_Min() {
		return (EAttribute)multipleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiple_Max() {
		return (EAttribute)multipleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiple_ShowLimits() {
		return (EAttribute)multipleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Questions() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Multiple() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableQuestion() {
		return tableQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableQuestion_Required() {
		return (EAttribute)tableQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswerTemplateRef() {
		return answerTemplateRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnswerTemplateRef_Template() {
		return (EReference)answerTemplateRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswerTemplate() {
		return answerTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnswerTemplate_Answers() {
		return (EReference)answerTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswerTemplate_Name() {
		return (EAttribute)answerTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyFactory getSurveyFactory() {
		return (SurveyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		metaEClass = createEClass(META);
		createEAttribute(metaEClass, META__NAME);
		createEAttribute(metaEClass, META__TITLE);
		createEAttribute(metaEClass, META__DESCRIPTION);

		surveyEClass = createEClass(SURVEY);
		createEReference(surveyEClass, SURVEY__ITEMS);
		createEReference(surveyEClass, SURVEY__TEMPLATES);
		createEAttribute(surveyEClass, SURVEY__MAIL);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__REQUIRED);
		createEAttribute(itemEClass, ITEM__DEPENDS_ON);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__QUESTIONS);

		questionEClass = createEClass(QUESTION);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__MULTILINE);

		scaleEClass = createEClass(SCALE);
		createEAttribute(scaleEClass, SCALE__MIN);
		createEAttribute(scaleEClass, SCALE__MAX);
		createEAttribute(scaleEClass, SCALE__MIN_LABEL);
		createEAttribute(scaleEClass, SCALE__MAX_LABEL);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__DAY);
		createEAttribute(dateEClass, DATE__MONTH);
		createEAttribute(dateEClass, DATE__YEAR);
		createEAttribute(dateEClass, DATE__START);
		createEAttribute(dateEClass, DATE__END);
		createEAttribute(dateEClass, DATE__SHOW_LIMITS);

		numberEClass = createEClass(NUMBER);
		createEAttribute(numberEClass, NUMBER__MIN);
		createEAttribute(numberEClass, NUMBER__MAX);
		createEAttribute(numberEClass, NUMBER__SHOW_LIMITS);

		otherEClass = createEClass(OTHER);
		createEAttribute(otherEClass, OTHER__OTHER);
		createEAttribute(otherEClass, OTHER__OTHER_LABEL);

		hasOptionsEClass = createEClass(HAS_OPTIONS);
		createEReference(hasOptionsEClass, HAS_OPTIONS__OPTIONS);

		optionEClass = createEClass(OPTION);

		singleEClass = createEClass(SINGLE);

		multipleEClass = createEClass(MULTIPLE);
		createEAttribute(multipleEClass, MULTIPLE__MIN);
		createEAttribute(multipleEClass, MULTIPLE__MAX);
		createEAttribute(multipleEClass, MULTIPLE__SHOW_LIMITS);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__QUESTIONS);
		createEAttribute(tableEClass, TABLE__MULTIPLE);

		tableQuestionEClass = createEClass(TABLE_QUESTION);
		createEAttribute(tableQuestionEClass, TABLE_QUESTION__REQUIRED);

		answerTemplateRefEClass = createEClass(ANSWER_TEMPLATE_REF);
		createEReference(answerTemplateRefEClass, ANSWER_TEMPLATE_REF__TEMPLATE);

		answerEClass = createEClass(ANSWER);

		answerTemplateEClass = createEClass(ANSWER_TEMPLATE);
		createEReference(answerTemplateEClass, ANSWER_TEMPLATE__ANSWERS);
		createEAttribute(answerTemplateEClass, ANSWER_TEMPLATE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		surveyEClass.getESuperTypes().add(this.getMeta());
		itemEClass.getESuperTypes().add(this.getMeta());
		groupEClass.getESuperTypes().add(this.getItem());
		questionEClass.getESuperTypes().add(this.getItem());
		textEClass.getESuperTypes().add(this.getQuestion());
		scaleEClass.getESuperTypes().add(this.getQuestion());
		dateEClass.getESuperTypes().add(this.getQuestion());
		numberEClass.getESuperTypes().add(this.getQuestion());
		otherEClass.getESuperTypes().add(this.getItem());
		hasOptionsEClass.getESuperTypes().add(this.getItem());
		singleEClass.getESuperTypes().add(this.getQuestion());
		singleEClass.getESuperTypes().add(this.getOther());
		singleEClass.getESuperTypes().add(this.getHasOptions());
		multipleEClass.getESuperTypes().add(this.getQuestion());
		multipleEClass.getESuperTypes().add(this.getOther());
		multipleEClass.getESuperTypes().add(this.getHasOptions());
		tableEClass.getESuperTypes().add(this.getQuestion());
		tableEClass.getESuperTypes().add(this.getOther());
		tableEClass.getESuperTypes().add(this.getHasOptions());
		tableQuestionEClass.getESuperTypes().add(this.getMeta());
		answerTemplateRefEClass.getESuperTypes().add(this.getOption());
		answerEClass.getESuperTypes().add(this.getOption());
		answerEClass.getESuperTypes().add(this.getMeta());

		// Initialize classes, features, and operations; add parameters
		initEClass(metaEClass, Meta.class, "Meta", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeta_Name(), ecorePackage.getEString(), "name", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_Title(), ecorePackage.getEString(), "title", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_Description(), ecorePackage.getEString(), "description", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyEClass, Survey.class, "Survey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurvey_Items(), this.getItem(), null, "items", null, 0, -1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurvey_Templates(), this.getAnswerTemplate(), null, "templates", null, 0, -1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_Mail(), ecorePackage.getEString(), "mail", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_DependsOn(), ecorePackage.getEString(), "dependsOn", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Questions(), this.getQuestion(), null, "questions", null, 1, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Multiline(), ecorePackage.getEBoolean(), "multiline", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaleEClass, Scale.class, "Scale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScale_Min(), ecorePackage.getEInt(), "min", null, 1, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScale_Max(), ecorePackage.getEInt(), "max", null, 1, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScale_MinLabel(), ecorePackage.getEString(), "minLabel", null, 0, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScale_MaxLabel(), ecorePackage.getEString(), "maxLabel", null, 0, 1, Scale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Day(), ecorePackage.getEBoolean(), "day", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Month(), ecorePackage.getEBoolean(), "month", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Year(), ecorePackage.getEBoolean(), "year", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Start(), ecorePackage.getEString(), "start", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_End(), ecorePackage.getEString(), "end", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_ShowLimits(), ecorePackage.getEBoolean(), "showLimits", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberEClass, survey.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumber_Min(), ecorePackage.getEIntegerObject(), "min", null, 0, 1, survey.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumber_Max(), ecorePackage.getEIntegerObject(), "max", null, 0, 1, survey.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumber_ShowLimits(), ecorePackage.getEBoolean(), "showLimits", null, 0, 1, survey.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otherEClass, Other.class, "Other", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOther_Other(), ecorePackage.getEBoolean(), "other", null, 0, 1, Other.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOther_OtherLabel(), ecorePackage.getEString(), "otherLabel", null, 0, 1, Other.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasOptionsEClass, HasOptions.class, "HasOptions", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasOptions_Options(), this.getOption(), null, "options", null, 1, -1, HasOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleEClass, Single.class, "Single", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleEClass, Multiple.class, "Multiple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiple_Min(), ecorePackage.getEIntegerObject(), "min", null, 0, 1, Multiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiple_Max(), ecorePackage.getEIntegerObject(), "max", null, 0, 1, Multiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiple_ShowLimits(), ecorePackage.getEBoolean(), "showLimits", null, 0, 1, Multiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Questions(), this.getTableQuestion(), null, "questions", null, 1, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableQuestionEClass, TableQuestion.class, "TableQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableQuestion_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, TableQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerTemplateRefEClass, AnswerTemplateRef.class, "AnswerTemplateRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnswerTemplateRef_Template(), this.getAnswerTemplate(), null, "template", null, 1, 1, AnswerTemplateRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(answerTemplateEClass, AnswerTemplate.class, "AnswerTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnswerTemplate_Answers(), this.getAnswer(), null, "answers", null, 1, -1, AnswerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswerTemplate_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnswerTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SurveyPackageImpl
