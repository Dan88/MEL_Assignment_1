/**
 */
package statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Libraries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statesml.SystemUnitLibraries#getSystemunit <em>Systemunit</em>}</li>
 * </ul>
 *
 * @see statesml.StatesmlPackage#getSystemUnitLibraries()
 * @model
 * @generated
 */
public interface SystemUnitLibraries extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Systemunit</b></em>' containment reference list.
	 * The list contents are of type {@link statesml.SystemUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systemunit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemunit</em>' containment reference list.
	 * @see statesml.StatesmlPackage#getSystemUnitLibraries_Systemunit()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnit> getSystemunit();

} // SystemUnitLibraries
