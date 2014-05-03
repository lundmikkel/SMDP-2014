/**
 */
package survey.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import survey.Date;
import survey.SurveyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link survey.impl.DateImpl#isDay <em>Day</em>}</li>
 *   <li>{@link survey.impl.DateImpl#isMonth <em>Month</em>}</li>
 *   <li>{@link survey.impl.DateImpl#isYear <em>Year</em>}</li>
 *   <li>{@link survey.impl.DateImpl#getStart <em>Start</em>}</li>
 *   <li>{@link survey.impl.DateImpl#getEnd <em>End</em>}</li>
 *   <li>{@link survey.impl.DateImpl#isShowLimits <em>Show Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateImpl extends QuestionImpl implements Date {
	/**
	 * The default value of the '{@link #isDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDay()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDay()
	 * @generated
	 * @ordered
	 */
	protected boolean day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonth()
	 * @generated
	 * @ordered
	 */
	protected boolean month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isYear()
	 * @generated
	 * @ordered
	 */
	protected static final boolean YEAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isYear()
	 * @generated
	 * @ordered
	 */
	protected boolean year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final String START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected String start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = END_EDEFAULT;

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
	protected DateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.DATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(boolean newDay) {
		boolean oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.DATE__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(boolean newMonth) {
		boolean oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.DATE__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(boolean newYear) {
		boolean oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.DATE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(String newStart) {
		String oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.DATE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(String newEnd) {
		String oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.DATE__END, oldEnd, end));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.DATE__SHOW_LIMITS, oldShowLimits, showLimits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyPackage.DATE__DAY:
				return isDay();
			case SurveyPackage.DATE__MONTH:
				return isMonth();
			case SurveyPackage.DATE__YEAR:
				return isYear();
			case SurveyPackage.DATE__START:
				return getStart();
			case SurveyPackage.DATE__END:
				return getEnd();
			case SurveyPackage.DATE__SHOW_LIMITS:
				return isShowLimits();
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
			case SurveyPackage.DATE__DAY:
				setDay((Boolean)newValue);
				return;
			case SurveyPackage.DATE__MONTH:
				setMonth((Boolean)newValue);
				return;
			case SurveyPackage.DATE__YEAR:
				setYear((Boolean)newValue);
				return;
			case SurveyPackage.DATE__START:
				setStart((String)newValue);
				return;
			case SurveyPackage.DATE__END:
				setEnd((String)newValue);
				return;
			case SurveyPackage.DATE__SHOW_LIMITS:
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
			case SurveyPackage.DATE__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case SurveyPackage.DATE__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case SurveyPackage.DATE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case SurveyPackage.DATE__START:
				setStart(START_EDEFAULT);
				return;
			case SurveyPackage.DATE__END:
				setEnd(END_EDEFAULT);
				return;
			case SurveyPackage.DATE__SHOW_LIMITS:
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
			case SurveyPackage.DATE__DAY:
				return day != DAY_EDEFAULT;
			case SurveyPackage.DATE__MONTH:
				return month != MONTH_EDEFAULT;
			case SurveyPackage.DATE__YEAR:
				return year != YEAR_EDEFAULT;
			case SurveyPackage.DATE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case SurveyPackage.DATE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case SurveyPackage.DATE__SHOW_LIMITS:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (day: ");
		result.append(day);
		result.append(", month: ");
		result.append(month);
		result.append(", year: ");
		result.append(year);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", showLimits: ");
		result.append(showLimits);
		result.append(')');
		return result.toString();
	}

} //DateImpl
