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

import survey.HasOptions;
import survey.HasOther;
import survey.Multiple;
import survey.Option;
import survey.SurveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.MultipleImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link survey.impl.MultipleImpl#isOther <em>Other</em>}</li>
 *   <li>{@link survey.impl.MultipleImpl#getOtherLabel <em>Other Label</em>}</li>
 *   <li>{@link survey.impl.MultipleImpl#getMin <em>Min</em>}</li>
 *   <li>{@link survey.impl.MultipleImpl#getMax <em>Max</em>}</li>
 *   <li>{@link survey.impl.MultipleImpl#isShowLimits <em>Show Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleImpl extends QuestionImpl implements Multiple {
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
	 * The default value of the '{@link #getOtherLabel() <em>Other Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLabel() <em>Other Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLabel()
	 * @generated
	 * @ordered
	 */
	protected String otherLabel = OTHER_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Integer min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Integer max = MAX_EDEFAULT;

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
	public String getOtherLabel() {
		return otherLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherLabel(String newOtherLabel) {
		String oldOtherLabel = otherLabel;
		otherLabel = newOtherLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.MULTIPLE__OTHER_LABEL, oldOtherLabel, otherLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(Integer newMin) {
		Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.MULTIPLE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(Integer newMax) {
		Integer oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.MULTIPLE__MAX, oldMax, max));
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
			case SurveyPackage.MULTIPLE__OPTIONS:
				return getOptions();
			case SurveyPackage.MULTIPLE__OTHER:
				return isOther();
			case SurveyPackage.MULTIPLE__OTHER_LABEL:
				return getOtherLabel();
			case SurveyPackage.MULTIPLE__MIN:
				return getMin();
			case SurveyPackage.MULTIPLE__MAX:
				return getMax();
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
			case SurveyPackage.MULTIPLE__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
				return;
			case SurveyPackage.MULTIPLE__OTHER:
				setOther((Boolean)newValue);
				return;
			case SurveyPackage.MULTIPLE__OTHER_LABEL:
				setOtherLabel((String)newValue);
				return;
			case SurveyPackage.MULTIPLE__MIN:
				setMin((Integer)newValue);
				return;
			case SurveyPackage.MULTIPLE__MAX:
				setMax((Integer)newValue);
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
			case SurveyPackage.MULTIPLE__OPTIONS:
				getOptions().clear();
				return;
			case SurveyPackage.MULTIPLE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case SurveyPackage.MULTIPLE__OTHER_LABEL:
				setOtherLabel(OTHER_LABEL_EDEFAULT);
				return;
			case SurveyPackage.MULTIPLE__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case SurveyPackage.MULTIPLE__MAX:
				setMax(MAX_EDEFAULT);
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
			case SurveyPackage.MULTIPLE__OPTIONS:
				return options != null && !options.isEmpty();
			case SurveyPackage.MULTIPLE__OTHER:
				return other != OTHER_EDEFAULT;
			case SurveyPackage.MULTIPLE__OTHER_LABEL:
				return OTHER_LABEL_EDEFAULT == null ? otherLabel != null : !OTHER_LABEL_EDEFAULT.equals(otherLabel);
			case SurveyPackage.MULTIPLE__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case SurveyPackage.MULTIPLE__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
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
		if (baseClass == HasOptions.class) {
			switch (derivedFeatureID) {
				case SurveyPackage.MULTIPLE__OPTIONS: return SurveyPackage.HAS_OPTIONS__OPTIONS;
				default: return -1;
			}
		}
		if (baseClass == HasOther.class) {
			switch (derivedFeatureID) {
				case SurveyPackage.MULTIPLE__OTHER: return SurveyPackage.HAS_OTHER__OTHER;
				case SurveyPackage.MULTIPLE__OTHER_LABEL: return SurveyPackage.HAS_OTHER__OTHER_LABEL;
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
		if (baseClass == HasOptions.class) {
			switch (baseFeatureID) {
				case SurveyPackage.HAS_OPTIONS__OPTIONS: return SurveyPackage.MULTIPLE__OPTIONS;
				default: return -1;
			}
		}
		if (baseClass == HasOther.class) {
			switch (baseFeatureID) {
				case SurveyPackage.HAS_OTHER__OTHER: return SurveyPackage.MULTIPLE__OTHER;
				case SurveyPackage.HAS_OTHER__OTHER_LABEL: return SurveyPackage.MULTIPLE__OTHER_LABEL;
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
		result.append(", otherLabel: ");
		result.append(otherLabel);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", showLimits: ");
		result.append(showLimits);
		result.append(')');
		return result.toString();
	}

} //MultipleImpl
