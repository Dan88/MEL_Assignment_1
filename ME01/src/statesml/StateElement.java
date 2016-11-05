/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.StateElement#getState <em>State</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getStateElement()
 * @model abstract="true"
 * @generated
 */
public interface StateElement extends NodeType {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference list.
	 * The list contents are of type {@link statesml.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference list.
	 * @see statesml.StatesmlPackage#getStateElement_State()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getState();

} // StateElement
