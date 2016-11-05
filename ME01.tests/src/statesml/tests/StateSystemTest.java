/**
 */
package statesml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import statesml.StateSystem;
import statesml.StatesmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>State System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateSystemTest extends TestCase {

	/**
	 * The fixture for this State System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StateSystemTest.class);
	}

	/**
	 * Constructs a new State System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this State System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StateSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this State System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateSystem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatesmlFactory.eINSTANCE.createStateSystem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StateSystemTest
