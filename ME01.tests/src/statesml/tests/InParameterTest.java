/**
 */
package statesml.tests;

import junit.textui.TestRunner;

import statesml.InParameter;
import statesml.StatesmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>In Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InParameterTest extends ParamterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InParameterTest.class);
	}

	/**
	 * Constructs a new In Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this In Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InParameter getFixture() {
		return (InParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatesmlFactory.eINSTANCE.createInParameter());
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

} //InParameterTest
