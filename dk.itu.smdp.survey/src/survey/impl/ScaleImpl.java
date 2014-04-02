/**
 */
package survey.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import survey.Scale;
import survey.SurveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.ScaleImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link survey.impl.ScaleImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link survey.impl.ScaleImpl#getLowerLabel <em>Lower Label</em>}</li>
 *   <li>{@link survey.impl.ScaleImpl#getUpperLabel <em>Upper Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScaleImpl extends QuestionImpl implements Scale {
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
	 * The default value of the '{@link #getLowerLabel() <em>Lower Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerLabel() <em>Lower Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLabel()
	 * @generated
	 * @ordered
	 */
	protected String lowerLabel = LOWER_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperLabel() <em>Upper Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperLabel() <em>Upper Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLabel()
	 * @generated
	 * @ordered
	 */
	protected String upperLabel = UPPER_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SCALE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SCALE__LOWER, oldLower, lower));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SCALE__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerLabel() {
		return lowerLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerLabel(String newLowerLabel) {
		String oldLowerLabel = lowerLabel;
		lowerLabel = newLowerLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SCALE__LOWER_LABEL, oldLowerLabel, lowerLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperLabel() {
		return upperLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperLabel(String newUpperLabel) {
		String oldUpperLabel = upperLabel;
		upperLabel = newUpperLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SCALE__UPPER_LABEL, oldUpperLabel, upperLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.SCALE__LOWER:
				return getLower();
			case SurveyPackage.SCALE__UPPER:
				return getUpper();
			case SurveyPackage.SCALE__LOWER_LABEL:
				return getLowerLabel();
			case SurveyPackage.SCALE__UPPER_LABEL:
				return getUpperLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SurveyPackage.SCALE__LOWER:
				setLower((Integer)newValue);
				return;
			case SurveyPackage.SCALE__UPPER:
				setUpper((Integer)newValue);
				return;
			case SurveyPackage.SCALE__LOWER_LABEL:
				setLowerLabel((String)newValue);
				return;
			case SurveyPackage.SCALE__UPPER_LABEL:
				setUpperLabel((String)newValue);
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
			case SurveyPackage.SCALE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case SurveyPackage.SCALE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case SurveyPackage.SCALE__LOWER_LABEL:
				setLowerLabel(LOWER_LABEL_EDEFAULT);
				return;
			case SurveyPackage.SCALE__UPPER_LABEL:
				setUpperLabel(UPPER_LABEL_EDEFAULT);
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
			case SurveyPackage.SCALE__LOWER:
				return lower != LOWER_EDEFAULT;
			case SurveyPackage.SCALE__UPPER:
				return upper != UPPER_EDEFAULT;
			case SurveyPackage.SCALE__LOWER_LABEL:
				return LOWER_LABEL_EDEFAULT == null ? lowerLabel != null : !LOWER_LABEL_EDEFAULT.equals(lowerLabel);
			case SurveyPackage.SCALE__UPPER_LABEL:
				return UPPER_LABEL_EDEFAULT == null ? upperLabel != null : !UPPER_LABEL_EDEFAULT.equals(upperLabel);
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
		result.append(" (lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", lowerLabel: ");
		result.append(lowerLabel);
		result.append(", upperLabel: ");
		result.append(upperLabel);
		result.append(')');
		return result.toString();
	}

} //ScaleImpl
