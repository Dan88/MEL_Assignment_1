/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.SystemUnit#getSystemunitelement <em>Systemunitelement</em>}</li>
 *   <li>{@link statesml.SystemUnit#getFunction <em>Function</em>}</li>
 *   <li>{@link statesml.SystemUnit#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getSystemUnit()
 * @model
 * @generated
 */
public interface SystemUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Systemunitelement</b></em>' containment reference list.
	 * The list contents are of type {@link statesml.SystemUnitElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systemunitelement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemunitelement</em>' containment reference list.
	 * @see statesml.StatesmlPackage#getSystemUnit_Systemunitelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnitElement> getSystemunitelement();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link statesml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see statesml.StatesmlPackage#getSystemUnit_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link statesml.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see statesml.StatesmlPackage#getSystemUnit_Function()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunction();

} // SystemUnit
