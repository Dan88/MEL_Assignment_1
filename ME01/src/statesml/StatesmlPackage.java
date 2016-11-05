/**
 */
package statesml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see statesml.StatesmlFactory
 * @model kind="package"
 * @generated
 */
public interface StatesmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statesml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/statesml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statesml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesmlPackage eINSTANCE = statesml.impl.StatesmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link statesml.impl.StateSystemImpl <em>State System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.StateSystemImpl
	 * @see statesml.impl.StatesmlPackageImpl#getStateSystem()
	 * @generated
	 */
	int STATE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Systemunit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SYSTEM__SYSTEMUNIT = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SYSTEM__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SYSTEM__ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>State System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>State System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.NamedElementImpl
	 * @see statesml.impl.StatesmlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.SystemUnitImpl <em>System Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.SystemUnitImpl
	 * @see statesml.impl.StatesmlPackageImpl#getSystemUnit()
	 * @generated
	 */
	int SYSTEM_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT__ATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT__FUNCTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.AttributeImpl
	 * @see statesml.impl.StatesmlPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATATYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.FunctionImpl
	 * @see statesml.impl.StatesmlPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Paramter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMTER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Returnparameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURNPARAMETER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INPARAMETER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.DataTypeImpl
	 * @see statesml.impl.StatesmlPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FUNCTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.ParamterImpl <em>Paramter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.ParamterImpl
	 * @see statesml.impl.StatesmlPackageImpl#getParamter()
	 * @generated
	 */
	int PARAMTER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMTER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMTER__DATATYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paramter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMTER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paramter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMTER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.InParameterImpl <em>In Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.InParameterImpl
	 * @see statesml.impl.StatesmlPackageImpl#getInParameter()
	 * @generated
	 */
	int IN_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER__NAME = PARAMTER__NAME;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER__DATATYPE = PARAMTER__DATATYPE;

	/**
	 * The number of structural features of the '<em>In Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER_FEATURE_COUNT = PARAMTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PARAMETER_OPERATION_COUNT = PARAMTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.returnParameterImpl <em>return Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.returnParameterImpl
	 * @see statesml.impl.StatesmlPackageImpl#getreturnParameter()
	 * @generated
	 */
	int RETURN_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER__NAME = PARAMTER__NAME;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER__DATATYPE = PARAMTER__DATATYPE;

	/**
	 * The number of structural features of the '<em>return Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_FEATURE_COUNT = PARAMTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>return Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_OPERATION_COUNT = PARAMTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.SystemUnitLibrariesImpl <em>System Unit Libraries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.SystemUnitLibrariesImpl
	 * @see statesml.impl.StatesmlPackageImpl#getSystemUnitLibraries()
	 * @generated
	 */
	int SYSTEM_UNIT_LIBRARIES = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_LIBRARIES__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Systemunit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_LIBRARIES__SYSTEMUNIT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Unit Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_LIBRARIES_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Unit Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_LIBRARIES_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.DataTypeLibraryImpl <em>Data Type Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.DataTypeLibraryImpl
	 * @see statesml.impl.StatesmlPackageImpl#getDataTypeLibrary()
	 * @generated
	 */
	int DATA_TYPE_LIBRARY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_LIBRARY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_LIBRARY__DATATYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_LIBRARY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Type Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_LIBRARY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.NamedElementImpl
	 * @see statesml.impl.StatesmlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.StateImpl
	 * @see statesml.impl.StatesmlPackageImpl#getState()
	 * @generated
	 */
	int STATE = 12;

	/**
	 * The feature id for the '<em><b>Terminalstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TERMINALSTATE = 0;

	/**
	 * The feature id for the '<em><b>Initialstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIALSTATE = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.NodeTypeImpl
	 * @see statesml.impl.StatesmlPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 24;

	/**
	 * The number of structural features of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.TransitionImpl
	 * @see statesml.impl.StatesmlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 13;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.SelectionDivergenceImpl <em>Selection Divergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.SelectionDivergenceImpl
	 * @see statesml.impl.StatesmlPackageImpl#getSelectionDivergence()
	 * @generated
	 */
	int SELECTION_DIVERGENCE = 14;

	/**
	 * The number of structural features of the '<em>Selection Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selection Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.SelectionConvergenceImpl <em>Selection Convergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.SelectionConvergenceImpl
	 * @see statesml.impl.StatesmlPackageImpl#getSelectionConvergence()
	 * @generated
	 */
	int SELECTION_CONVERGENCE = 15;

	/**
	 * The number of structural features of the '<em>Selection Convergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selection Convergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.InitialStateImpl
	 * @see statesml.impl.StatesmlPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 16;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.TerminalStateImpl <em>Terminal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.TerminalStateImpl
	 * @see statesml.impl.StatesmlPackageImpl#getTerminalState()
	 * @generated
	 */
	int TERMINAL_STATE = 17;

	/**
	 * The number of structural features of the '<em>Terminal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_STATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Terminal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.SystemUnitImpl <em>System Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.SystemUnitImpl
	 * @see statesml.impl.StatesmlPackageImpl#getSystemUnit()
	 * @generated
	 */
	int SYSTEM_UNIT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Systemunitelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT__SYSTEMUNITELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT__FUNCTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT__ATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>System Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.SystemUnitElementImpl <em>System Unit Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.SystemUnitElementImpl
	 * @see statesml.impl.StatesmlPackageImpl#getSystemUnitElement()
	 * @generated
	 */
	int SYSTEM_UNIT_ELEMENT = 21;

	/**
	 * The number of structural features of the '<em>System Unit Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System Unit Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.EdgeImpl
	 * @see statesml.impl.StatesmlPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 19;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = SYSTEM_UNIT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = SYSTEM_UNIT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.NodeImpl
	 * @see statesml.impl.StatesmlPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 20;

	/**
	 * The feature id for the '<em><b>Nodetype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODETYPE = SYSTEM_UNIT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = SYSTEM_UNIT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = SYSTEM_UNIT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.EventImpl
	 * @see statesml.impl.StatesmlPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 22;

	/**
	 * The feature id for the '<em><b>Change Expession</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CHANGE_EXPESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.AttributeImpl
	 * @see statesml.impl.StatesmlPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 23;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.FunctionImpl
	 * @see statesml.impl.StatesmlPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 25;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.CallImpl
	 * @see statesml.impl.StatesmlPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 26;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__FUNCTION = 0;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.ParameterImpl
	 * @see statesml.impl.StatesmlPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 27;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.PrimitiveValueImpl
	 * @see statesml.impl.StatesmlPackageImpl#getPrimitiveValue()
	 * @generated
	 */
	int PRIMITIVE_VALUE = 28;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__STRING = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__NEW_ATTRIBUTE = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__BOOLEAN = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Primitive Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Primitive Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.AttrbuteValueImpl <em>Attrbute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.AttrbuteValueImpl
	 * @see statesml.impl.StatesmlPackageImpl#getAttrbuteValue()
	 * @generated
	 */
	int ATTRBUTE_VALUE = 29;

	/**
	 * The number of structural features of the '<em>Attrbute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRBUTE_VALUE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attrbute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRBUTE_VALUE_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statesml.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.TriggerImpl
	 * @see statesml.impl.StatesmlPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 30;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statesml.impl.StateElementImpl <em>State Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statesml.impl.StateElementImpl
	 * @see statesml.impl.StatesmlPackageImpl#getStateElement()
	 * @generated
	 */
	int STATE_ELEMENT = 31;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ELEMENT__STATE = NODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ELEMENT_FEATURE_COUNT = NODE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ELEMENT_OPERATION_COUNT = NODE_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link statesml.StateSystem <em>State System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State System</em>'.
	 * @see statesml.StateSystem
	 * @generated
	 */
	EClass getStateSystem();

	/**
	 * Returns the meta object for the containment reference '{@link statesml.StateSystem#getSystemunit <em>Systemunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Systemunit</em>'.
	 * @see statesml.StateSystem#getSystemunit()
	 * @see #getStateSystem()
	 * @generated
	 */
	EReference getStateSystem_Systemunit();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.StateSystem#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see statesml.StateSystem#getEvent()
	 * @see #getStateSystem()
	 * @generated
	 */
	EReference getStateSystem_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.StateSystem#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see statesml.StateSystem#getAttribute()
	 * @see #getStateSystem()
	 * @generated
	 */
	EReference getStateSystem_Attribute();

	/**
	 * Returns the meta object for class '{@link statesml.SystemUnit <em>System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit</em>'.
	 * @see statesml.SystemUnit
	 * @generated
	 */
	EClass getSystemUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.SystemUnit#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see statesml.SystemUnit#getAttribute()
	 * @see #getSystemUnit()
	 * @generated
	 */
	EReference getSystemUnit_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.SystemUnit#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see statesml.SystemUnit#getFunction()
	 * @see #getSystemUnit()
	 * @generated
	 */
	EReference getSystemUnit_Function();

	/**
	 * Returns the meta object for class '{@link statesml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see statesml.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.Attribute#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype</em>'.
	 * @see statesml.Attribute#getDatatype()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Datatype();

	/**
	 * Returns the meta object for class '{@link statesml.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see statesml.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.Function#getParamter <em>Paramter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paramter</em>'.
	 * @see statesml.Function#getParamter()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Paramter();

	/**
	 * Returns the meta object for the containment reference '{@link statesml.Function#getReturnparameter <em>Returnparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returnparameter</em>'.
	 * @see statesml.Function#getReturnparameter()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Returnparameter();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.Function#getInparameter <em>Inparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inparameter</em>'.
	 * @see statesml.Function#getInparameter()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Inparameter();

	/**
	 * Returns the meta object for class '{@link statesml.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see statesml.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.DataType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see statesml.DataType#getFunction()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Function();

	/**
	 * Returns the meta object for class '{@link statesml.Paramter <em>Paramter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paramter</em>'.
	 * @see statesml.Paramter
	 * @generated
	 */
	EClass getParamter();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.Paramter#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype</em>'.
	 * @see statesml.Paramter#getDatatype()
	 * @see #getParamter()
	 * @generated
	 */
	EReference getParamter_Datatype();

	/**
	 * Returns the meta object for class '{@link statesml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see statesml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link statesml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link statesml.InParameter <em>In Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Parameter</em>'.
	 * @see statesml.InParameter
	 * @generated
	 */
	EClass getInParameter();

	/**
	 * Returns the meta object for class '{@link statesml.returnParameter <em>return Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>return Parameter</em>'.
	 * @see statesml.returnParameter
	 * @generated
	 */
	EClass getreturnParameter();

	/**
	 * Returns the meta object for class '{@link statesml.SystemUnitLibraries <em>System Unit Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit Libraries</em>'.
	 * @see statesml.SystemUnitLibraries
	 * @generated
	 */
	EClass getSystemUnitLibraries();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.SystemUnitLibraries#getSystemunit <em>Systemunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systemunit</em>'.
	 * @see statesml.SystemUnitLibraries#getSystemunit()
	 * @see #getSystemUnitLibraries()
	 * @generated
	 */
	EReference getSystemUnitLibraries_Systemunit();

	/**
	 * Returns the meta object for class '{@link statesml.DataTypeLibrary <em>Data Type Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Library</em>'.
	 * @see statesml.DataTypeLibrary
	 * @generated
	 */
	EClass getDataTypeLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.DataTypeLibrary#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype</em>'.
	 * @see statesml.DataTypeLibrary#getDatatype()
	 * @see #getDataTypeLibrary()
	 * @generated
	 */
	EReference getDataTypeLibrary_Datatype();

	/**
	 * Returns the meta object for class '{@link statesml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see statesml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link statesml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link statesml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statesml.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference '{@link statesml.State#getTerminalstate <em>Terminalstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terminalstate</em>'.
	 * @see statesml.State#getTerminalstate()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Terminalstate();

	/**
	 * Returns the meta object for the containment reference '{@link statesml.State#getInitialstate <em>Initialstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialstate</em>'.
	 * @see statesml.State#getInitialstate()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Initialstate();

	/**
	 * Returns the meta object for class '{@link statesml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statesml.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for class '{@link statesml.SelectionDivergence <em>Selection Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Divergence</em>'.
	 * @see statesml.SelectionDivergence
	 * @generated
	 */
	EClass getSelectionDivergence();

	/**
	 * Returns the meta object for class '{@link statesml.SelectionConvergence <em>Selection Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Convergence</em>'.
	 * @see statesml.SelectionConvergence
	 * @generated
	 */
	EClass getSelectionConvergence();

	/**
	 * Returns the meta object for class '{@link statesml.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statesml.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link statesml.TerminalState <em>Terminal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal State</em>'.
	 * @see statesml.TerminalState
	 * @generated
	 */
	EClass getTerminalState();

	/**
	 * Returns the meta object for class '{@link statesml.SystemUnit <em>System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit</em>'.
	 * @see statesml.SystemUnit
	 * @generated
	 */
	EClass getSystemUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.SystemUnit#getSystemunitelement <em>Systemunitelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systemunitelement</em>'.
	 * @see statesml.SystemUnit#getSystemunitelement()
	 * @see #getSystemUnit()
	 * @generated
	 */
	EReference getSystemUnit_Systemunitelement();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.SystemUnit#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see statesml.SystemUnit#getFunction()
	 * @see #getSystemUnit()
	 * @generated
	 */
	EReference getSystemUnit_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.SystemUnit#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see statesml.SystemUnit#getAttribute()
	 * @see #getSystemUnit()
	 * @generated
	 */
	EReference getSystemUnit_Attribute();

	/**
	 * Returns the meta object for class '{@link statesml.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see statesml.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for class '{@link statesml.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see statesml.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.Node#getNodetype <em>Nodetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodetype</em>'.
	 * @see statesml.Node#getNodetype()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Nodetype();

	/**
	 * Returns the meta object for class '{@link statesml.SystemUnitElement <em>System Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit Element</em>'.
	 * @see statesml.SystemUnitElement
	 * @generated
	 */
	EClass getSystemUnitElement();

	/**
	 * Returns the meta object for class '{@link statesml.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see statesml.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link statesml.Event#isChangeExpession <em>Change Expession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Expession</em>'.
	 * @see statesml.Event#isChangeExpession()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_ChangeExpession();

	/**
	 * Returns the meta object for the attribute '{@link statesml.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statesml.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link statesml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see statesml.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link statesml.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see statesml.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for class '{@link statesml.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see statesml.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.Function#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see statesml.Function#getParameter()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameter();

	/**
	 * Returns the meta object for class '{@link statesml.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see statesml.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the containment reference list '{@link statesml.Call#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see statesml.Call#getFunction()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Function();

	/**
	 * Returns the meta object for class '{@link statesml.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see statesml.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link statesml.PrimitiveValue <em>Primitive Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Value</em>'.
	 * @see statesml.PrimitiveValue
	 * @generated
	 */
	EClass getPrimitiveValue();

	/**
	 * Returns the meta object for the attribute '{@link statesml.PrimitiveValue#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see statesml.PrimitiveValue#getString()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EAttribute getPrimitiveValue_String();

	/**
	 * Returns the meta object for the attribute '{@link statesml.PrimitiveValue#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see statesml.PrimitiveValue#getNewAttribute()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EAttribute getPrimitiveValue_NewAttribute();

	/**
	 * Returns the meta object for the attribute '{@link statesml.PrimitiveValue#isBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean</em>'.
	 * @see statesml.PrimitiveValue#isBoolean()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EAttribute getPrimitiveValue_Boolean();

	/**
	 * Returns the meta object for class '{@link statesml.AttrbuteValue <em>Attrbute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attrbute Value</em>'.
	 * @see statesml.AttrbuteValue
	 * @generated
	 */
	EClass getAttrbuteValue();

	/**
	 * Returns the meta object for class '{@link statesml.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see statesml.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link statesml.StateElement <em>State Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Element</em>'.
	 * @see statesml.StateElement
	 * @generated
	 */
	EClass getStateElement();

	/**
	 * Returns the meta object for the reference list '{@link statesml.StateElement#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State</em>'.
	 * @see statesml.StateElement#getState()
	 * @see #getStateElement()
	 * @generated
	 */
	EReference getStateElement_State();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesmlFactory getStatesmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link statesml.impl.StateSystemImpl <em>State System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.StateSystemImpl
		 * @see statesml.impl.StatesmlPackageImpl#getStateSystem()
		 * @generated
		 */
		EClass STATE_SYSTEM = eINSTANCE.getStateSystem();

		/**
		 * The meta object literal for the '<em><b>Systemunit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SYSTEM__SYSTEMUNIT = eINSTANCE.getStateSystem_Systemunit();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SYSTEM__EVENT = eINSTANCE.getStateSystem_Event();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SYSTEM__ATTRIBUTE = eINSTANCE.getStateSystem_Attribute();

		/**
		 * The meta object literal for the '{@link statesml.impl.SystemUnitImpl <em>System Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.SystemUnitImpl
		 * @see statesml.impl.StatesmlPackageImpl#getSystemUnit()
		 * @generated
		 */
		EClass SYSTEM_UNIT = eINSTANCE.getSystemUnit();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT__ATTRIBUTE = eINSTANCE.getSystemUnit_Attribute();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT__FUNCTION = eINSTANCE.getSystemUnit_Function();

		/**
		 * The meta object literal for the '{@link statesml.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.AttributeImpl
		 * @see statesml.impl.StatesmlPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DATATYPE = eINSTANCE.getAttribute_Datatype();

		/**
		 * The meta object literal for the '{@link statesml.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.FunctionImpl
		 * @see statesml.impl.StatesmlPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Paramter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMTER = eINSTANCE.getFunction_Paramter();

		/**
		 * The meta object literal for the '<em><b>Returnparameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURNPARAMETER = eINSTANCE.getFunction_Returnparameter();

		/**
		 * The meta object literal for the '<em><b>Inparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INPARAMETER = eINSTANCE.getFunction_Inparameter();

		/**
		 * The meta object literal for the '{@link statesml.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.DataTypeImpl
		 * @see statesml.impl.StatesmlPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__FUNCTION = eINSTANCE.getDataType_Function();

		/**
		 * The meta object literal for the '{@link statesml.impl.ParamterImpl <em>Paramter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.ParamterImpl
		 * @see statesml.impl.StatesmlPackageImpl#getParamter()
		 * @generated
		 */
		EClass PARAMTER = eINSTANCE.getParamter();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMTER__DATATYPE = eINSTANCE.getParamter_Datatype();

		/**
		 * The meta object literal for the '{@link statesml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.NamedElementImpl
		 * @see statesml.impl.StatesmlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link statesml.impl.InParameterImpl <em>In Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.InParameterImpl
		 * @see statesml.impl.StatesmlPackageImpl#getInParameter()
		 * @generated
		 */
		EClass IN_PARAMETER = eINSTANCE.getInParameter();

		/**
		 * The meta object literal for the '{@link statesml.impl.returnParameterImpl <em>return Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.returnParameterImpl
		 * @see statesml.impl.StatesmlPackageImpl#getreturnParameter()
		 * @generated
		 */
		EClass RETURN_PARAMETER = eINSTANCE.getreturnParameter();

		/**
		 * The meta object literal for the '{@link statesml.impl.SystemUnitLibrariesImpl <em>System Unit Libraries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.SystemUnitLibrariesImpl
		 * @see statesml.impl.StatesmlPackageImpl#getSystemUnitLibraries()
		 * @generated
		 */
		EClass SYSTEM_UNIT_LIBRARIES = eINSTANCE.getSystemUnitLibraries();

		/**
		 * The meta object literal for the '<em><b>Systemunit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_LIBRARIES__SYSTEMUNIT = eINSTANCE.getSystemUnitLibraries_Systemunit();

		/**
		 * The meta object literal for the '{@link statesml.impl.DataTypeLibraryImpl <em>Data Type Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.DataTypeLibraryImpl
		 * @see statesml.impl.StatesmlPackageImpl#getDataTypeLibrary()
		 * @generated
		 */
		EClass DATA_TYPE_LIBRARY = eINSTANCE.getDataTypeLibrary();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_LIBRARY__DATATYPE = eINSTANCE.getDataTypeLibrary_Datatype();

		/**
		 * The meta object literal for the '{@link statesml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.NamedElementImpl
		 * @see statesml.impl.StatesmlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link statesml.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.StateImpl
		 * @see statesml.impl.StatesmlPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Terminalstate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TERMINALSTATE = eINSTANCE.getState_Terminalstate();

		/**
		 * The meta object literal for the '<em><b>Initialstate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INITIALSTATE = eINSTANCE.getState_Initialstate();

		/**
		 * The meta object literal for the '{@link statesml.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.TransitionImpl
		 * @see statesml.impl.StatesmlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link statesml.impl.SelectionDivergenceImpl <em>Selection Divergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.SelectionDivergenceImpl
		 * @see statesml.impl.StatesmlPackageImpl#getSelectionDivergence()
		 * @generated
		 */
		EClass SELECTION_DIVERGENCE = eINSTANCE.getSelectionDivergence();

		/**
		 * The meta object literal for the '{@link statesml.impl.SelectionConvergenceImpl <em>Selection Convergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.SelectionConvergenceImpl
		 * @see statesml.impl.StatesmlPackageImpl#getSelectionConvergence()
		 * @generated
		 */
		EClass SELECTION_CONVERGENCE = eINSTANCE.getSelectionConvergence();

		/**
		 * The meta object literal for the '{@link statesml.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.InitialStateImpl
		 * @see statesml.impl.StatesmlPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statesml.impl.TerminalStateImpl <em>Terminal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.TerminalStateImpl
		 * @see statesml.impl.StatesmlPackageImpl#getTerminalState()
		 * @generated
		 */
		EClass TERMINAL_STATE = eINSTANCE.getTerminalState();

		/**
		 * The meta object literal for the '{@link statesml.impl.SystemUnitImpl <em>System Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.SystemUnitImpl
		 * @see statesml.impl.StatesmlPackageImpl#getSystemUnit()
		 * @generated
		 */
		EClass SYSTEM_UNIT = eINSTANCE.getSystemUnit();

		/**
		 * The meta object literal for the '<em><b>Systemunitelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT__SYSTEMUNITELEMENT = eINSTANCE.getSystemUnit_Systemunitelement();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT__FUNCTION = eINSTANCE.getSystemUnit_Function();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT__ATTRIBUTE = eINSTANCE.getSystemUnit_Attribute();

		/**
		 * The meta object literal for the '{@link statesml.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.EdgeImpl
		 * @see statesml.impl.StatesmlPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '{@link statesml.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.NodeImpl
		 * @see statesml.impl.StatesmlPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Nodetype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODETYPE = eINSTANCE.getNode_Nodetype();

		/**
		 * The meta object literal for the '{@link statesml.impl.SystemUnitElementImpl <em>System Unit Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.SystemUnitElementImpl
		 * @see statesml.impl.StatesmlPackageImpl#getSystemUnitElement()
		 * @generated
		 */
		EClass SYSTEM_UNIT_ELEMENT = eINSTANCE.getSystemUnitElement();

		/**
		 * The meta object literal for the '{@link statesml.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.EventImpl
		 * @see statesml.impl.StatesmlPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Change Expession</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__CHANGE_EXPESSION = eINSTANCE.getEvent_ChangeExpession();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link statesml.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.AttributeImpl
		 * @see statesml.impl.StatesmlPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link statesml.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.NodeTypeImpl
		 * @see statesml.impl.StatesmlPackageImpl#getNodeType()
		 * @generated
		 */
		EClass NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link statesml.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.FunctionImpl
		 * @see statesml.impl.StatesmlPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETER = eINSTANCE.getFunction_Parameter();

		/**
		 * The meta object literal for the '{@link statesml.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.CallImpl
		 * @see statesml.impl.StatesmlPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__FUNCTION = eINSTANCE.getCall_Function();

		/**
		 * The meta object literal for the '{@link statesml.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.ParameterImpl
		 * @see statesml.impl.StatesmlPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link statesml.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.PrimitiveValueImpl
		 * @see statesml.impl.StatesmlPackageImpl#getPrimitiveValue()
		 * @generated
		 */
		EClass PRIMITIVE_VALUE = eINSTANCE.getPrimitiveValue();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE__STRING = eINSTANCE.getPrimitiveValue_String();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE__NEW_ATTRIBUTE = eINSTANCE.getPrimitiveValue_NewAttribute();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE__BOOLEAN = eINSTANCE.getPrimitiveValue_Boolean();

		/**
		 * The meta object literal for the '{@link statesml.impl.AttrbuteValueImpl <em>Attrbute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.AttrbuteValueImpl
		 * @see statesml.impl.StatesmlPackageImpl#getAttrbuteValue()
		 * @generated
		 */
		EClass ATTRBUTE_VALUE = eINSTANCE.getAttrbuteValue();

		/**
		 * The meta object literal for the '{@link statesml.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.TriggerImpl
		 * @see statesml.impl.StatesmlPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link statesml.impl.StateElementImpl <em>State Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statesml.impl.StateElementImpl
		 * @see statesml.impl.StatesmlPackageImpl#getStateElement()
		 * @generated
		 */
		EClass STATE_ELEMENT = eINSTANCE.getStateElement();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_ELEMENT__STATE = eINSTANCE.getStateElement_State();

	}

} //StatesmlPackage
