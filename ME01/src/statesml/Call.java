/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.Call#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends EObject {
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
	 * @see statesml.StatesmlPackage#getCall_Function()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunction();

} // Call
