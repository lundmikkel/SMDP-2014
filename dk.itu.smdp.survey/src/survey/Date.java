/**
 */
package survey;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Date#getMode <em>Mode</em>}</li>
 *   <li>{@link survey.Date#getStart <em>Start</em>}</li>
 *   <li>{@link survey.Date#getEnd <em>End</em>}</li>
 *   <li>{@link survey.Date#isShowLimits <em>Show Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getDate()
 * @model
 * @generated
 */
public interface Date extends Question {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link survey.DateMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see survey.DateMode
	 * @see #setMode(DateMode)
	 * @see survey.SurveyPackage#getDate_Mode()
	 * @model
	 * @generated
	 */
	DateMode getMode();

	/**
	 * Sets the value of the '{@link survey.Date#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see survey.DateMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(DateMode value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see survey.SurveyPackage#getDate_Start()
	 * @model
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link survey.Date#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see survey.SurveyPackage#getDate_End()
	 * @model
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link survey.Date#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Show Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Limits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Limits</em>' attribute.
	 * @see #setShowLimits(boolean)
	 * @see survey.SurveyPackage#getDate_ShowLimits()
	 * @model
	 * @generated
	 */
	boolean isShowLimits();

	/**
	 * Sets the value of the '{@link survey.Date#isShowLimits <em>Show Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Limits</em>' attribute.
	 * @see #isShowLimits()
	 * @generated
	 */
	void setShowLimits(boolean value);

} // Date
