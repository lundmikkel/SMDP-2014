/**
 */
package survey;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer Template Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.AnswerTemplateRef#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getAnswerTemplateRef()
 * @model
 * @generated
 */
public interface AnswerTemplateRef extends Option {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(AnswerTemplate)
	 * @see survey.SurveyPackage#getAnswerTemplateRef_Template()
	 * @model required="true"
	 * @generated
	 */
	AnswerTemplate getTemplate();

	/**
	 * Sets the value of the '{@link survey.AnswerTemplateRef#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(AnswerTemplate value);

} // AnswerTemplateRef
