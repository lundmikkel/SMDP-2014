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
import survey.SurveyPackage;
import survey.Table;
import survey.TableQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.TableImpl#isOther <em>Other</em>}</li>
 *   <li>{@link survey.impl.TableImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link survey.impl.TableImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link survey.impl.TableImpl#isMultiple <em>Multiple</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends QuestionImpl implements Table {
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
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<TableQuestion> questions;

	/**
	 * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean multiple = MULTIPLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.TABLE__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Option>(Option.class, this, SurveyPackage.TABLE__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableQuestion> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<TableQuestion>(TableQuestion.class, this, SurveyPackage.TABLE__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiple() {
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiple(boolean newMultiple) {
		boolean oldMultiple = multiple;
		multiple = newMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.TABLE__MULTIPLE, oldMultiple, multiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyPackage.TABLE__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
			case SurveyPackage.TABLE__QUESTIONS:
				return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
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
			case SurveyPackage.TABLE__OTHER:
				return isOther();
			case SurveyPackage.TABLE__OPTIONS:
				return getOptions();
			case SurveyPackage.TABLE__QUESTIONS:
				return getQuestions();
			case SurveyPackage.TABLE__MULTIPLE:
				return isMultiple();
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
			case SurveyPackage.TABLE__OTHER:
				setOther((Boolean)newValue);
				return;
			case SurveyPackage.TABLE__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
				return;
			case SurveyPackage.TABLE__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends TableQuestion>)newValue);
				return;
			case SurveyPackage.TABLE__MULTIPLE:
				setMultiple((Boolean)newValue);
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
			case SurveyPackage.TABLE__OTHER:
				setOther(OTHER_EDEFAULT);
				return;
			case SurveyPackage.TABLE__OPTIONS:
				getOptions().clear();
				return;
			case SurveyPackage.TABLE__QUESTIONS:
				getQuestions().clear();
				return;
			case SurveyPackage.TABLE__MULTIPLE:
				setMultiple(MULTIPLE_EDEFAULT);
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
			case SurveyPackage.TABLE__OTHER:
				return other != OTHER_EDEFAULT;
			case SurveyPackage.TABLE__OPTIONS:
				return options != null && !options.isEmpty();
			case SurveyPackage.TABLE__QUESTIONS:
				return questions != null && !questions.isEmpty();
			case SurveyPackage.TABLE__MULTIPLE:
				return multiple != MULTIPLE_EDEFAULT;
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
				case SurveyPackage.TABLE__OTHER: return SurveyPackage.OTHER__OTHER;
				default: return -1;
			}
		}
		if (baseClass == HasOptions.class) {
			switch (derivedFeatureID) {
				case SurveyPackage.TABLE__OPTIONS: return SurveyPackage.HAS_OPTIONS__OPTIONS;
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
				case SurveyPackage.OTHER__OTHER: return SurveyPackage.TABLE__OTHER;
				default: return -1;
			}
		}
		if (baseClass == HasOptions.class) {
			switch (baseFeatureID) {
				case SurveyPackage.HAS_OPTIONS__OPTIONS: return SurveyPackage.TABLE__OPTIONS;
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
		result.append(", multiple: ");
		result.append(multiple);
		result.append(')');
		return result.toString();
	}

} //TableImpl
