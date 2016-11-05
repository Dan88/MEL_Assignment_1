/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.StateSystem#getSystemunit <em>Systemunit</em>}</li>
 *   <li>{@link statesml.StateSystem#getEvent <em>Event</em>}</li>
 *   <li>{@link statesml.StateSystem#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getStateSystem()
 * @model
 * @generated
 */
public interface StateSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Systemunit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systemunit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemunit</em>' containment reference.
	 * @see #setSystemunit(SystemUnit)
	 * @see statesml.StatesmlPackage#getStateSystem_Systemunit()
	 * @model containment="true"
	 * @generated
	 */
	SystemUnit getSystemunit();

	/**
	 * Sets the value of the '{@link statesml.StateSystem#getSystemunit <em>Systemunit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemunit</em>' containment reference.
	 * @see #getSystemunit()
	 * @generated
	 */
	void setSystemunit(SystemUnit value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link statesml.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see statesml.StatesmlPackage#getStateSystem_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvent();

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
	 * @see statesml.StatesmlPackage#getStateSystem_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

} // StateSystem
