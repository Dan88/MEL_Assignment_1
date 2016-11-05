/**
 */
package statesml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.PrimitiveValue#getString <em>String</em>}</li>
 *   <li>{@link statesml.PrimitiveValue#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link statesml.PrimitiveValue#isBoolean <em>Boolean</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getPrimitiveValue()
 * @model
 * @generated
 */
public interface PrimitiveValue extends Parameter {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see statesml.StatesmlPackage#getPrimitiveValue_String()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link statesml.PrimitiveValue#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

	/**
	 * Returns the value of the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Attribute</em>' attribute.
	 * @see #setNewAttribute(int)
	 * @see statesml.StatesmlPackage#getPrimitiveValue_NewAttribute()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNewAttribute();

	/**
	 * Sets the value of the '{@link statesml.PrimitiveValue#getNewAttribute <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Attribute</em>' attribute.
	 * @see #getNewAttribute()
	 * @generated
	 */
	void setNewAttribute(int value);

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' attribute.
	 * @see #setBoolean(boolean)
	 * @see statesml.StatesmlPackage#getPrimitiveValue_Boolean()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isBoolean();

	/**
	 * Sets the value of the '{@link statesml.PrimitiveValue#isBoolean <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' attribute.
	 * @see #isBoolean()
	 * @generated
	 */
	void setBoolean(boolean value);

} // PrimitiveValue
