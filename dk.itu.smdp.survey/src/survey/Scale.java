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
 *   <li>{@link survey.Scale#getMin <em>Min</em>}</li>
 *   <li>{@link survey.Scale#getMax <em>Max</em>}</li>
 *   <li>{@link survey.Scale#getMinLabel <em>Min Label</em>}</li>
 *   <li>{@link survey.Scale#getMaxLabel <em>Max Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getScale()
 * @model
 * @generated
 */
public interface Scale extends Question {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see survey.SurveyPackage#getScale_Min()
	 * @model required="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link survey.Scale#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see survey.SurveyPackage#getScale_Max()
	 * @model required="true"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link survey.Scale#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Min Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Label</em>' attribute.
	 * @see #setMinLabel(String)
	 * @see survey.SurveyPackage#getScale_MinLabel()
	 * @model
	 * @generated
	 */
	String getMinLabel();

	/**
	 * Sets the value of the '{@link survey.Scale#getMinLabel <em>Min Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Label</em>' attribute.
	 * @see #getMinLabel()
	 * @generated
	 */
	void setMinLabel(String value);

	/**
	 * Returns the value of the '<em><b>Max Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Label</em>' attribute.
	 * @see #setMaxLabel(String)
	 * @see survey.SurveyPackage#getScale_MaxLabel()
	 * @model
	 * @generated
	 */
	String getMaxLabel();

	/**
	 * Sets the value of the '{@link survey.Scale#getMaxLabel <em>Max Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Label</em>' attribute.
	 * @see #getMaxLabel()
	 * @generated
	 */
	void setMaxLabel(String value);

} // Scale
