/**
 */
package statesml.tests;

import junit.textui.TestRunner;

import statesml.StatesmlFactory;
import statesml.SystemUnitLibraries;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Unit Libraries</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemUnitLibrariesTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemUnitLibrariesTest.class);
	}

	/**
	 * Constructs a new System Unit Libraries test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitLibrariesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Unit Libraries test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemUnitLibraries getFixture() {
		return (SystemUnitLibraries)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatesmlFactory.eINSTANCE.createSystemUnitLibraries());
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

} //SystemUnitLibrariesTest
