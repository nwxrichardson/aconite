/**
 */
package basicfamily.tests;

import basicfamily.BasicfamilyFactory;
import basicfamily.Woman;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Woman</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WomanTest extends PersonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WomanTest.class);
	}

	/**
	 * Constructs a new Woman test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WomanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Woman test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Woman getFixture() {
		return (Woman)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BasicfamilyFactory.eINSTANCE.createWoman());
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

} //WomanTest
