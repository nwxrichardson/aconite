/**
 */
package SimpleBPMN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SimpleBPMN.Pool#getLanes <em>Lanes</em>}</li>
 * </ul>
 *
 * @see SimpleBPMN.SimpleBPMNPackage#getPool()
 * @model annotation="aconite.container name='Pool' container='BPD, Group'"
 * @generated
 */
public interface Pool extends Swimlane {
	/**
	 * Returns the value of the '<em><b>Lanes</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleBPMN.Lane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes</em>' containment reference list.
	 * @see SimpleBPMN.SimpleBPMNPackage#getPool_Lanes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lane> getLanes();

} // Pool
