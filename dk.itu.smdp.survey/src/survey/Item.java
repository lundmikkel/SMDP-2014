/**
 */
package survey;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Item#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link survey.Item#isRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getItem()
 * @model abstract="true"
 * @generated
 */
public interface Item extends Meta, Referable {
	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference.
	 * @see #setDependsOn(Answer)
	 * @see survey.SurveyPackage#getItem_DependsOn()
	 * @model
	 * @generated
	 */
	Answer getDependsOn();

	/**
	 * Sets the value of the '{@link survey.Item#getDependsOn <em>Depends On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' reference.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(Answer value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see survey.SurveyPackage#getItem_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link survey.Item#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

} // Item
