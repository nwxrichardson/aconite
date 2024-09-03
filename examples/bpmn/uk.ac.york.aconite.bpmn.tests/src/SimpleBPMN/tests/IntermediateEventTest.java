/**
 */
package SimpleBPMN.tests;

import SimpleBPMN.IntermediateEvent;
import SimpleBPMN.SimpleBPMNFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intermediate Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateEventTest extends FlowObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntermediateEventTest.class);
	}

	/**
	 * Constructs a new Intermediate Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intermediate Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntermediateEvent getFixture() {
		return (IntermediateEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimpleBPMNFactory.eINSTANCE.createIntermediateEvent());
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

} //IntermediateEventTest
