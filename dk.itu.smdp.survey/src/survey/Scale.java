/**
 */
package survey;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Scale#getLower <em>Lower</em>}</li>
 *   <li>{@link survey.Scale#getUpper <em>Upper</em>}</li>
 *   <li>{@link survey.Scale#getLowerLabel <em>Lower Label</em>}</li>
 *   <li>{@link survey.Scale#getUpperLabel <em>Upper Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getScale()
 * @model
 * @generated
 */
public interface Scale extends Question {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see survey.SurveyPackage#getScale_Lower()
	 * @model required="true"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link survey.Scale#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see survey.SurveyPackage#getScale_Upper()
	 * @model required="true"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link survey.Scale#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

	/**
	 * Returns the value of the '<em><b>Lower Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Label</em>' attribute.
	 * @see #setLowerLabel(String)
	 * @see survey.SurveyPackage#getScale_LowerLabel()
	 * @model
	 * @generated
	 */
	String getLowerLabel();

	/**
	 * Sets the value of the '{@link survey.Scale#getLowerLabel <em>Lower Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Label</em>' attribute.
	 * @see #getLowerLabel()
	 * @generated
	 */
	void setLowerLabel(String value);

	/**
	 * Returns the value of the '<em><b>Upper Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Label</em>' attribute.
	 * @see #setUpperLabel(String)
	 * @see survey.SurveyPackage#getScale_UpperLabel()
	 * @model
	 * @generated
	 */
	String getUpperLabel();

	/**
	 * Sets the value of the '{@link survey.Scale#getUpperLabel <em>Upper Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Label</em>' attribute.
	 * @see #getUpperLabel()
	 * @generated
	 */
	void setUpperLabel(String value);

} // Scale
