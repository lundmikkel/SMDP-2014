/**
 */
package survey;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.TableQuestion#isRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getTableQuestion()
 * @model
 * @generated
 */
public interface TableQuestion extends Meta {

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
	 * @see survey.SurveyPackage#getTableQuestion_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link survey.TableQuestion#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);
} // TableQuestion
