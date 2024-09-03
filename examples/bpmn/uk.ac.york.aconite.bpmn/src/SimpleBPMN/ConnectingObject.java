/**
 */
package SimpleBPMN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connecting Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SimpleBPMN.ConnectingObject#getFrom <em>From</em>}</li>
 *   <li>{@link SimpleBPMN.ConnectingObject#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see SimpleBPMN.SimpleBPMNPackage#getConnectingObject()
 * @model abstract="true"
 *        annotation="aconite.edge container='BPD' name='Link' abstract='true' source='from' target='to' color='black'"
 * @generated
 */
public interface ConnectingObject extends BPMNElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(FlowObject)
	 * @see SimpleBPMN.SimpleBPMNPackage#getConnectingObject_From()
	 * @model
	 * @generated
	 */
	FlowObject getFrom();

	/**
	 * Sets the value of the '{@link SimpleBPMN.ConnectingObject#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(FlowObject value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(FlowObject)
	 * @see SimpleBPMN.SimpleBPMNPackage#getConnectingObject_To()
	 * @model
	 * @generated
	 */
	FlowObject getTo();

	/**
	 * Sets the value of the '{@link SimpleBPMN.ConnectingObject#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(FlowObject value);

} // ConnectingObject
