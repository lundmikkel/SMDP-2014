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
import survey.Option;
import survey.Other;
import survey.Single;
import survey.SurveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.SingleImpl#isOther <em>Other</em>}</li>
 *   <li>{@link survey.impl.SingleImpl#getOtherLabel <em>Other Label</em>}</li>
 *   <li>{@link survey.impl.SingleImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleImpl extends QuestionImpl implements Single {
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
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SINGLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SINGLE__OTHER, oldOther, other));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SINGLE__OTHER_LABEL, oldOtherLabel, otherLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Option>(Option.class, this, SurveyPackage.SINGLE__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyPackage.SINGLE__OPTIONS:
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
			case SurveyPackage.SINGLE__OTHER:
				return isOther();
			case SurveyPackage.SINGLE__OTHER_LABEL:
				return getOtherLabel();
			case SurveyPackage.SINGLE__OPTIONS:
				return getOptions();
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
			case SurveyPackage.SINGLE__OTHER:
				setOther((Boolean)newValue);
				return;
			case SurveyPackage.SINGLE__OTHER_LABEL:
				setOtherLabel((String)newValue);
				return;
			case SurveyPackage.SINGLE__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
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
			case SurveyPackage.SINGLE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case SurveyPackage.SINGLE__OTHER_LABEL:
				setOtherLabel(OTHER_LABEL_EDEFAULT);
				return;
			case SurveyPackage.SINGLE__OPTIONS:
				getOptions().clear();
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
			case SurveyPackage.SINGLE__OTHER:
				return other != OTHER_EDEFAULT;
			case SurveyPackage.SINGLE__OTHER_LABEL:
				return OTHER_LABEL_EDEFAULT == null ? otherLabel != null : !OTHER_LABEL_EDEFAULT.equals(otherLabel);
			case SurveyPackage.SINGLE__OPTIONS:
				return options != null && !options.isEmpty();
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
				case SurveyPackage.SINGLE__OTHER: return SurveyPackage.OTHER__OTHER;
				case SurveyPackage.SINGLE__OTHER_LABEL: return SurveyPackage.OTHER__OTHER_LABEL;
				default: return -1;
			}
		}
		if (baseClass == HasOptions.class) {
			switch (derivedFeatureID) {
				case SurveyPackage.SINGLE__OPTIONS: return SurveyPackage.HAS_OPTIONS__OPTIONS;
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
				case SurveyPackage.OTHER__OTHER: return SurveyPackage.SINGLE__OTHER;
				case SurveyPackage.OTHER__OTHER_LABEL: return SurveyPackage.SINGLE__OTHER_LABEL;
				default: return -1;
			}
		}
		if (baseClass == HasOptions.class) {
			switch (baseFeatureID) {
				case SurveyPackage.HAS_OPTIONS__OPTIONS: return SurveyPackage.SINGLE__OPTIONS;
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
		result.append(')');
		return result.toString();
	}

} //SingleImpl
