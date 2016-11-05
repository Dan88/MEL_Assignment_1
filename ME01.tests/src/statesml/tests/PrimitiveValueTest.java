/**
 */
package statesml.tests;

import junit.textui.TestRunner;

import statesml.PrimitiveValue;
import statesml.StatesmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Primitive Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveValueTest extends ParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrimitiveValueTest.class);
	}

	/**
	 * Constructs a new Primitive Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Primitive Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrimitiveValue getFixture() {
		return (PrimitiveValue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatesmlFactory.eINSTANCE.createPrimitiveValue());
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

} //PrimitiveValueTest
