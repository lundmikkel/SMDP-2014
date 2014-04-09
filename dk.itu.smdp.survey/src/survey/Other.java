/**
 */
package survey;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Other#isOther <em>Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getOther()
 * @model abstract="true"
 * @generated
 */
public interface Other extends EObject {
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
	 * @see survey.SurveyPackage#getOther_Other()
	 * @model
	 * @generated
	 */
	boolean isOther();

	/**
	 * Sets the value of the '{@link survey.Other#isOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #isOther()
	 * @generated
	 */
	void setOther(boolean value);

} // Other
