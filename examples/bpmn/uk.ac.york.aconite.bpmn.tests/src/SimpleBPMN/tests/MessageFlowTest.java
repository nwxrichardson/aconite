/**
 */
package SimpleBPMN.tests;

import SimpleBPMN.MessageFlow;
import SimpleBPMN.SimpleBPMNFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageFlowTest extends ConnectingObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MessageFlowTest.class);
	}

	/**
	 * Constructs a new Message Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Message Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MessageFlow getFixture() {
		return (MessageFlow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimpleBPMNFactory.eINSTANCE.createMessageFlow());
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

} //MessageFlowTest
