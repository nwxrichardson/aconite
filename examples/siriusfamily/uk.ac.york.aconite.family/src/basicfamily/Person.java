/**
 */
package basicfamily;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link basicfamily.Person#getName <em>Name</em>}</li>
 *   <li>{@link basicfamily.Person#getChildren <em>Children</em>}</li>
 *   <li>{@link basicfamily.Person#getParents <em>Parents</em>}</li>
 *   <li>{@link basicfamily.Person#getMother <em>Mother</em>}</li>
 *   <li>{@link basicfamily.Person#getFather <em>Father</em>}</li>
 * </ul>
 *
 * @see basicfamily.BasicfamilyPackage#getPerson()
 * @model abstract="true"
 *        annotation="aconite.diagram name='Relationships'"
 *        annotation="aconite.node name='Rel Default' abstract='true' color='white' showIcon='true' childrenPresentation='List'"
 *        annotation="aconite.container extend='Rel Default' name='Person' sce='' foregroundColor='light_green' container='Relationships'"
 *        annotation="aconite.border extend='Rel Default' sce='parents' name='Parent' container='Person'"
 *        annotation="aconite.node extend='Rel Default' name='Child' container='Person'"
 *        annotation="aconite.container extend='Rel Default' name='Siblings' sce='' labelValue='Siblings' foregroundColor='light_yellow' container='Relationships' showIcon='false'"
 *        annotation="aconite.node name='Sibling' container='Siblings' sce='parents.children-&gt;excluding(self)' showIcon='true'"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see basicfamily.BasicfamilyPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link basicfamily.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link basicfamily.Person}.
	 * It is bidirectional and its opposite is '{@link basicfamily.Person#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see basicfamily.BasicfamilyPackage#getPerson_Children()
	 * @see basicfamily.Person#getParents
	 * @model opposite="parents"
	 *        annotation="aconite.edge name='SiblingsEdge' creatable='false' labelExpression='' color='gray' container='Relationships' targetFinderExpression='aql:self' sourceNode='Person' targetNode='Siblings'"
	 * @generated
	 */
	EList<Person> getChildren();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link basicfamily.Person}.
	 * It is bidirectional and its opposite is '{@link basicfamily.Person#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see basicfamily.BasicfamilyPackage#getPerson_Parents()
	 * @see basicfamily.Person#getChildren
	 * @model opposite="children" upper="2"
	 * @generated
	 */
	EList<Person> getParents();

	/**
	 * Returns the value of the '<em><b>Mother</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' reference.
	 * @see #setMother(Woman)
	 * @see basicfamily.BasicfamilyPackage#getPerson_Mother()
	 * @model derived="true"
	 *        annotation="aconite.edge reconnectable='false' name='Mother' container='Family' sourceNode='Man, Woman' labelExpression='' color='purple'"
	 * @generated
	 */
	Woman getMother();

	/**
	 * Sets the value of the '{@link basicfamily.Person#getMother <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(Woman value);

	/**
	 * Returns the value of the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' reference.
	 * @see #setFather(Man)
	 * @see basicfamily.BasicfamilyPackage#getPerson_Father()
	 * @model derived="true"
	 *        annotation="aconite.edge extend='Mother' name='Father' color='blue'"
	 * @generated
	 */
	Man getFather();

	/**
	 * Sets the value of the '{@link basicfamily.Person#getFather <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(Man value);

} // Person
