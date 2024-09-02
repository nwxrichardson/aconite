/**
 */
package basicfamily;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link basicfamily.Family#getName <em>Name</em>}</li>
 *   <li>{@link basicfamily.Family#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see basicfamily.BasicfamilyPackage#getFamily()
 * @model annotation="aconite.diagram name='Family'"
 * @generated
 */
public interface Family extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see basicfamily.BasicfamilyPackage#getFamily_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link basicfamily.Family#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link basicfamily.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see basicfamily.BasicfamilyPackage#getFamily_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getMembers();

} // Family
