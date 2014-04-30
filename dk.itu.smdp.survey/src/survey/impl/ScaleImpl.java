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
 *   <li>{@link survey.impl.ScaleImpl#getMin <em>Min</em>}</li>
 *   <li>{@link survey.impl.ScaleImpl#getMax <em>Max</em>}</li>
 *   <li>{@link survey.impl.ScaleImpl#getMinLabel <em>Min Label</em>}</li>
 *   <li>{@link survey.impl.ScaleImpl#getMaxLabel <em>Max Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScaleImpl extends QuestionImpl implements Scale {
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLabel() <em>Min Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinLabel() <em>Min Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLabel()
	 * @generated
	 * @ordered
	 */
	protected String minLabel = MIN_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLabel() <em>Max Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLabel() <em>Max Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLabel()
	 * @generated
	 * @ordered
	 */
	protected String maxLabel = MAX_LABEL_EDEFAULT;

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
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SCALE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SCALE__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinLabel() {
		return minLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLabel(String newMinLabel) {
		String oldMinLabel = minLabel;
		minLabel = newMinLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SCALE__MIN_LABEL, oldMinLabel, minLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxLabel() {
		return maxLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLabel(String newMaxLabel) {
		String oldMaxLabel = maxLabel;
		maxLabel = newMaxLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SCALE__MAX_LABEL, oldMaxLabel, maxLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.SCALE__MIN:
				return getMin();
			case SurveyPackage.SCALE__MAX:
				return getMax();
			case SurveyPackage.SCALE__MIN_LABEL:
				return getMinLabel();
			case SurveyPackage.SCALE__MAX_LABEL:
				return getMaxLabel();
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
			case SurveyPackage.SCALE__MIN:
				setMin((Integer)newValue);
				return;
			case SurveyPackage.SCALE__MAX:
				setMax((Integer)newValue);
				return;
			case SurveyPackage.SCALE__MIN_LABEL:
				setMinLabel((String)newValue);
				return;
			case SurveyPackage.SCALE__MAX_LABEL:
				setMaxLabel((String)newValue);
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
			case SurveyPackage.SCALE__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case SurveyPackage.SCALE__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case SurveyPackage.SCALE__MIN_LABEL:
				setMinLabel(MIN_LABEL_EDEFAULT);
				return;
			case SurveyPackage.SCALE__MAX_LABEL:
				setMaxLabel(MAX_LABEL_EDEFAULT);
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
			case SurveyPackage.SCALE__MIN:
				return min != MIN_EDEFAULT;
			case SurveyPackage.SCALE__MAX:
				return max != MAX_EDEFAULT;
			case SurveyPackage.SCALE__MIN_LABEL:
				return MIN_LABEL_EDEFAULT == null ? minLabel != null : !MIN_LABEL_EDEFAULT.equals(minLabel);
			case SurveyPackage.SCALE__MAX_LABEL:
				return MAX_LABEL_EDEFAULT == null ? maxLabel != null : !MAX_LABEL_EDEFAULT.equals(maxLabel);
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
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", minLabel: ");
		result.append(minLabel);
		result.append(", maxLabel: ");
		result.append(maxLabel);
		result.append(')');
		return result.toString();
	}

} //ScaleImpl
