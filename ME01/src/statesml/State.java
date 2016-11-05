/**
 */
package statesml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.State#getTerminalstate <em>Terminalstate</em>}</li>
 *   <li>{@link statesml.State#getInitialstate <em>Initialstate</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Terminalstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminalstate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminalstate</em>' containment reference.
	 * @see #setTerminalstate(TerminalState)
	 * @see statesml.StatesmlPackage#getState_Terminalstate()
	 * @model containment="true"
	 * @generated
	 */
	TerminalState getTerminalstate();

	/**
	 * Sets the value of the '{@link statesml.State#getTerminalstate <em>Terminalstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminalstate</em>' containment reference.
	 * @see #getTerminalstate()
	 * @generated
	 */
	void setTerminalstate(TerminalState value);

	/**
	 * Returns the value of the '<em><b>Initialstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialstate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialstate</em>' containment reference.
	 * @see #setInitialstate(InitialState)
	 * @see statesml.StatesmlPackage#getState_Initialstate()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	InitialState getInitialstate();

	/**
	 * Sets the value of the '{@link statesml.State#getInitialstate <em>Initialstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialstate</em>' containment reference.
	 * @see #getInitialstate()
	 * @generated
	 */
	void setInitialstate(InitialState value);

} // State
