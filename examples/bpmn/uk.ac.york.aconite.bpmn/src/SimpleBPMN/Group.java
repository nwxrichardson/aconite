/**
 */
package SimpleBPMN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SimpleBPMN.Group#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see SimpleBPMN.SimpleBPMNPackage#getGroup()
 * @model annotation="aconite.container container='BPD' name='Group'"
 * @generated
 */
public interface Group extends Artifact {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleBPMN.BPMNElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see SimpleBPMN.SimpleBPMNPackage#getGroup_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPMNElement> getElements();

} // Group
