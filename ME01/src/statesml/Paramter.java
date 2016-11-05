/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paramter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.Paramter#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getParamter()
 * @model abstract="true"
 * @generated
 */
public interface Paramter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link statesml.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference list.
	 * @see statesml.StatesmlPackage#getParamter_Datatype()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDatatype();

} // Paramter
