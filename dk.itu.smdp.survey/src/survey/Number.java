/**
 */
package survey;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Number#getLower <em>Lower</em>}</li>
 *   <li>{@link survey.Number#getUpper <em>Upper</em>}</li>
 *   <li>{@link survey.Number#isShowLimits <em>Show Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getNumber()
 * @model
 * @generated
 */
public interface Number extends Question {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(Integer)
	 * @see survey.SurveyPackage#getNumber_Lower()
	 * @model
	 * @generated
	 */
	Integer getLower();

	/**
	 * Sets the value of the '{@link survey.Number#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(Integer)
	 * @see survey.SurveyPackage#getNumber_Upper()
	 * @model
	 * @generated
	 */
	Integer getUpper();

	/**
	 * Sets the value of the '{@link survey.Number#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Integer value);

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
	 * @see survey.SurveyPackage#getNumber_ShowLimits()
	 * @model
	 * @generated
	 */
	boolean isShowLimits();

	/**
	 * Sets the value of the '{@link survey.Number#isShowLimits <em>Show Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Limits</em>' attribute.
	 * @see #isShowLimits()
	 * @generated
	 */
	void setShowLimits(boolean value);

} // Number
