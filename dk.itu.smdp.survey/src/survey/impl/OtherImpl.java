/**
 */
package survey.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import survey.Other;
import survey.SurveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.OtherImpl#isOther <em>Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OtherImpl extends MinimalEObjectImpl.Container implements Other {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.OTHER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.OTHER__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.OTHER__OTHER:
				return isOther();
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
			case SurveyPackage.OTHER__OTHER:
				setOther((Boolean)newValue);
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
			case SurveyPackage.OTHER__OTHER:
				setOther(OTHER_EDEFAULT);
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
			case SurveyPackage.OTHER__OTHER:
				return other != OTHER_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //OtherImpl
