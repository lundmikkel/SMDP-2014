/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.HasOptions#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getHasOptions()
 * @model
 * @generated
 */
public interface HasOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link survey.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see survey.SurveyPackage#getHasOptions_Options()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Option> getOptions();

} // HasOptions
