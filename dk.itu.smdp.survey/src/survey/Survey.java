/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Survey#getItems <em>Items</em>}</li>
 *   <li>{@link survey.Survey#getTemplates <em>Templates</em>}</li>
 *   <li>{@link survey.Survey#getMail <em>Mail</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getSurvey()
 * @model
 * @generated
 */
public interface Survey extends Meta {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link survey.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see survey.SurveyPackage#getSurvey_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link survey.AnswerTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see survey.SurveyPackage#getSurvey_Templates()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnswerTemplate> getTemplates();

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see survey.SurveyPackage#getSurvey_Mail()
	 * @model
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link survey.Survey#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

} // Survey
