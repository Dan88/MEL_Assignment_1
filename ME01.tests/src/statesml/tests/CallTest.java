/**
 */
package statesml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import statesml.Call;
import statesml.StatesmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CallTest extends TestCase {

	/**
	 * The fixture for this Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Call fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CallTest.class);
	}

	/**
	 * Constructs a new Call test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Call fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Call getFixture() {
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
		setFixture(StatesmlFactory.eINSTANCE.createCall());
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

} //CallTest
