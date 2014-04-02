/**
 */
package survey.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import survey.Multiple;
import survey.Option;
import survey.Other;
import survey.SurveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.MultipleImpl#isOther <em>Other</em>}</li>
 *   <li>{@link survey.impl.MultipleImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link survey.impl.MultipleImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link survey.impl.MultipleImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link survey.impl.MultipleImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link survey.impl.MultipleImpl#isShowLimits <em>Show Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleImpl extends QuestionImpl implements Multiple {
	/**
	 * The default value of the '{@link #isOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOther()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OTHER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOther()
	 * @generated
	 * @ordered
	 */
	protected boolean other = OTHER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> options;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected Option template;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowLimits() <em>Show Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLimits()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_LIMITS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowLimits() <em>Show Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLimits()
	 * @generated
	 * @ordered
	 */
	protected boolean showLimits = SHOW_LIMITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.MULTIPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOther(boolean newOther) {
		boolean oldOther = other;
		other = newOther;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.MULTIPLE__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Option>(Option.class, this, SurveyPackage.MULTIPLE__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (Option)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SurveyPackage.MULTIPLE__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Option newTemplate) {
		Option oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.MULTIPLE__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.MULTIPLE__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.MULTIPLE__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowLimits() {
		return showLimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowLimits(boolean newShowLimits) {
		boolean oldShowLimits = showLimits;
		showLimits = newShowLimits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.MULTIPLE__SHOW_LIMITS, oldShowLimits, showLimits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyPackage.MULTIPLE__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.MULTIPLE__OTHER:
				return isOther();
			case SurveyPackage.MULTIPLE__OPTIONS:
				return getOptions();
			case SurveyPackage.MULTIPLE__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
			case SurveyPackage.MULTIPLE__LOWER:
				return getLower();
			case SurveyPackage.MULTIPLE__UPPER:
				return getUpper();
			case SurveyPackage.MULTIPLE__SHOW_LIMITS:
				return isShowLimits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SurveyPackage.MULTIPLE__OTHER:
				setOther((Boolean)newValue);
				return;
			case SurveyPackage.MULTIPLE__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
				return;
			case SurveyPackage.MULTIPLE__TEMPLATE:
				setTemplate((Option)newValue);
				return;
			case SurveyPackage.MULTIPLE__LOWER:
				setLower((Integer)newValue);
				return;
			case SurveyPackage.MULTIPLE__UPPER:
				setUpper((Integer)newValue);
				return;
			case SurveyPackage.MULTIPLE__SHOW_LIMITS:
				setShowLimits((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SurveyPackage.MULTIPLE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case SurveyPackage.MULTIPLE__OPTIONS:
				getOptions().clear();
				return;
			case SurveyPackage.MULTIPLE__TEMPLATE:
				setTemplate((Option)null);
				return;
			case SurveyPackage.MULTIPLE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case SurveyPackage.MULTIPLE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case SurveyPackage.MULTIPLE__SHOW_LIMITS:
				setShowLimits(SHOW_LIMITS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SurveyPackage.MULTIPLE__OTHER:
				return other != OTHER_EDEFAULT;
			case SurveyPackage.MULTIPLE__OPTIONS:
				return options != null && !options.isEmpty();
			case SurveyPackage.MULTIPLE__TEMPLATE:
				return template != null;
			case SurveyPackage.MULTIPLE__LOWER:
				return lower != LOWER_EDEFAULT;
			case SurveyPackage.MULTIPLE__UPPER:
				return upper != UPPER_EDEFAULT;
			case SurveyPackage.MULTIPLE__SHOW_LIMITS:
				return showLimits != SHOW_LIMITS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Other.class) {
			switch (derivedFeatureID) {
				case SurveyPackage.MULTIPLE__OTHER: return SurveyPackage.OTHER__OTHER;
				case SurveyPackage.MULTIPLE__OPTIONS: return SurveyPackage.OTHER__OPTIONS;
				case SurveyPackage.MULTIPLE__TEMPLATE: return SurveyPackage.OTHER__TEMPLATE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Other.class) {
			switch (baseFeatureID) {
				case SurveyPackage.OTHER__OTHER: return SurveyPackage.MULTIPLE__OTHER;
				case SurveyPackage.OTHER__OPTIONS: return SurveyPackage.MULTIPLE__OPTIONS;
				case SurveyPackage.OTHER__TEMPLATE: return SurveyPackage.MULTIPLE__TEMPLATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (other: ");
		result.append(other);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", showLimits: ");
		result.append(showLimits);
		result.append(')');
		return result.toString();
	}

} //MultipleImpl
