/**
 */
package statesml.tests;

import junit.textui.TestRunner;

import statesml.StatesmlFactory;
import statesml.returnParameter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>return Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class returnParameterTest extends ParamterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(returnParameterTest.class);
	}

	/**
	 * Constructs a new return Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public returnParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this return Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected returnParameter getFixture() {
		return (returnParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatesmlFactory.eINSTANCE.createreturnParameter());
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

} //returnParameterTest
