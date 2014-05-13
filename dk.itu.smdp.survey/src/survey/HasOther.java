/**
 */
package survey;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Other</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.HasOther#isOther <em>Other</em>}</li>
 *   <li>{@link survey.HasOther#getOtherLabel <em>Other Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getHasOther()
 * @model abstract="true"
 * @generated
 */
public interface HasOther extends HasOptions {
	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see #setOther(boolean)
	 * @see survey.SurveyPackage#getHasOther_Other()
	 * @model
	 * @generated
	 */
	boolean isOther();

	/**
	 * Sets the value of the '{@link survey.HasOther#isOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #isOther()
	 * @generated
	 */
	void setOther(boolean value);

	/**
	 * Returns the value of the '<em><b>Other Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Label</em>' attribute.
	 * @see #setOtherLabel(String)
	 * @see survey.SurveyPackage#getHasOther_OtherLabel()
	 * @model
	 * @generated
	 */
	String getOtherLabel();

	/**
	 * Sets the value of the '{@link survey.HasOther#getOtherLabel <em>Other Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Label</em>' attribute.
	 * @see #getOtherLabel()
	 * @generated
	 */
	void setOtherLabel(String value);

} // HasOther
