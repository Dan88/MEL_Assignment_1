/**
 */
package statesml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import statesml.StatesmlFactory;
import statesml.TerminalState;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Terminal State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminalStateTest extends TestCase {

	/**
	 * The fixture for this Terminal State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalState fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TerminalStateTest.class);
	}

	/**
	 * Constructs a new Terminal State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalStateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Terminal State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TerminalState fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Terminal State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalState getFixture() {
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
		setFixture(StatesmlFactory.eINSTANCE.createTerminalState());
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

} //TerminalStateTest
