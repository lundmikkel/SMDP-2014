/**
 */
package survey;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Multiple#getMin <em>Min</em>}</li>
 *   <li>{@link survey.Multiple#getMax <em>Max</em>}</li>
 *   <li>{@link survey.Multiple#isShowLimits <em>Show Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.SurveyPackage#getMultiple()
 * @model
 * @generated
 */
public interface Multiple extends Question, Other, HasOptions {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Integer)
	 * @see survey.SurveyPackage#getMultiple_Min()
	 * @model
	 * @generated
	 */
	Integer getMin();

	/**
	 * Sets the value of the '{@link survey.Multiple#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(Integer)
	 * @see survey.SurveyPackage#getMultiple_Max()
	 * @model
	 * @generated
	 */
	Integer getMax();

	/**
	 * Sets the value of the '{@link survey.Multiple#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Integer value);

	/**
	 * Returns the value of the '<em><b>Show Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Limits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Limits</em>' attribute.
	 * @see #setShowLimits(boolean)
	 * @see survey.SurveyPackage#getMultiple_ShowLimits()
	 * @model
	 * @generated
	 */
	boolean isShowLimits();

	/**
	 * Sets the value of the '{@link survey.Multiple#isShowLimits <em>Show Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Limits</em>' attribute.
	 * @see #isShowLimits()
	 * @generated
	 */
	void setShowLimits(boolean value);

} // Multiple
