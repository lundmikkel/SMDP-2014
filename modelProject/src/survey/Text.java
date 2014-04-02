/**
 */
package survey;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Text#isMultiline <em>Multiline</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Question {
	/**
	 * Returns the value of the '<em><b>Multiline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiline</em>' attribute.
	 * @see #setMultiline(boolean)
	 * @see survey.SurveyPackage#getText_Multiline()
	 * @model
	 * @generated
	 */
	boolean isMultiline();

	/**
	 * Sets the value of the '{@link survey.Text#isMultiline <em>Multiline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiline</em>' attribute.
	 * @see #isMultiline()
	 * @generated
	 */
	void setMultiline(boolean value);

} // Text
