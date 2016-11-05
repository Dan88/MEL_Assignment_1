/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.Node#getNodetype <em>Nodetype</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends SystemUnitElement {
	/**
	 * Returns the value of the '<em><b>Nodetype</b></em>' containment reference list.
	 * The list contents are of type {@link statesml.NodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodetype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodetype</em>' containment reference list.
	 * @see statesml.StatesmlPackage#getNode_Nodetype()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeType> getNodetype();

} // Node
