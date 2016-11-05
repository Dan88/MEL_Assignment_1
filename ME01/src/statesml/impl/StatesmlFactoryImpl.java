/**
 */
package statesml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import statesml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesmlFactoryImpl extends EFactoryImpl implements StatesmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesmlFactory init() {
		try {
			StatesmlFactory theStatesmlFactory = (StatesmlFactory)EPackage.Registry.INSTANCE.getEFactory(StatesmlPackage.eNS_URI);
			if (theStatesmlFactory != null) {
				return theStatesmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatesmlPackage.STATE_SYSTEM: return createStateSystem();
			case StatesmlPackage.SYSTEM_UNIT: return createSystemUnit();
			case StatesmlPackage.ATTRIBUTE: return createAttribute();
			case StatesmlPackage.FUNCTION: return createFunction();
			case StatesmlPackage.DATA_TYPE: return createDataType();
			case StatesmlPackage.IN_PARAMETER: return createInParameter();
			case StatesmlPackage.RETURN_PARAMETER: return createreturnParameter();
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIES: return createSystemUnitLibraries();
			case StatesmlPackage.DATA_TYPE_LIBRARY: return createDataTypeLibrary();
			case StatesmlPackage.STATE: return createState();
			case StatesmlPackage.TRANSITION: return createTransition();
			case StatesmlPackage.SELECTION_DIVERGENCE: return createSelectionDivergence();
			case StatesmlPackage.SELECTION_CONVERGENCE: return createSelectionConvergence();
			case StatesmlPackage.INITIAL_STATE: return createInitialState();
			case StatesmlPackage.TERMINAL_STATE: return createTerminalState();
			case StatesmlPackage.SYSTEM_UNIT: return createSystemUnit();
			case StatesmlPackage.EDGE: return createEdge();
			case StatesmlPackage.NODE: return createNode();
			case StatesmlPackage.EVENT: return createEvent();
			case StatesmlPackage.ATTRIBUTE: return createAttribute();
			case StatesmlPackage.FUNCTION: return createFunction();
			case StatesmlPackage.CALL: return createCall();
			case StatesmlPackage.PRIMITIVE_VALUE: return createPrimitiveValue();
			case StatesmlPackage.ATTRBUTE_VALUE: return createAttrbuteValue();
			case StatesmlPackage.TRIGGER: return createTrigger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSystem createStateSystem() {
		StateSystemImpl stateSystem = new StateSystemImpl();
		return stateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnit createSystemUnit() {
		SystemUnitImpl systemUnit = new SystemUnitImpl();
		return systemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InParameter createInParameter() {
		InParameterImpl inParameter = new InParameterImpl();
		return inParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public returnParameter createreturnParameter() {
		returnParameterImpl returnParameter = new returnParameterImpl();
		return returnParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitLibraries createSystemUnitLibraries() {
		SystemUnitLibrariesImpl systemUnitLibraries = new SystemUnitLibrariesImpl();
		return systemUnitLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeLibrary createDataTypeLibrary() {
		DataTypeLibraryImpl dataTypeLibrary = new DataTypeLibraryImpl();
		return dataTypeLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionDivergence createSelectionDivergence() {
		SelectionDivergenceImpl selectionDivergence = new SelectionDivergenceImpl();
		return selectionDivergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionConvergence createSelectionConvergence() {
		SelectionConvergenceImpl selectionConvergence = new SelectionConvergenceImpl();
		return selectionConvergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalState createTerminalState() {
		TerminalStateImpl terminalState = new TerminalStateImpl();
		return terminalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnit createSystemUnit() {
		SystemUnitImpl systemUnit = new SystemUnitImpl();
		return systemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveValue createPrimitiveValue() {
		PrimitiveValueImpl primitiveValue = new PrimitiveValueImpl();
		return primitiveValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttrbuteValue createAttrbuteValue() {
		AttrbuteValueImpl attrbuteValue = new AttrbuteValueImpl();
		return attrbuteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesmlPackage getStatesmlPackage() {
		return (StatesmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesmlPackage getPackage() {
		return StatesmlPackage.eINSTANCE;
	}

} //StatesmlFactoryImpl
