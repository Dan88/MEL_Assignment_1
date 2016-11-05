/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.DataType#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends NamedElement {
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
	 * @see statesml.StatesmlPackage#getDataType_Function()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunction();

} // DataType
