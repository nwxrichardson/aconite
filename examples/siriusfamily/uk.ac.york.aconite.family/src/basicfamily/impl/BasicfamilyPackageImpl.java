/**
 */
package basicfamily.impl;

import basicfamily.BasicfamilyFactory;
import basicfamily.BasicfamilyPackage;
import basicfamily.Family;
import basicfamily.Man;
import basicfamily.Person;
import basicfamily.Woman;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicfamilyPackageImpl extends EPackageImpl implements BasicfamilyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass womanEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see basicfamily.BasicfamilyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicfamilyPackageImpl() {
		super(eNS_URI, BasicfamilyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BasicfamilyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicfamilyPackage init() {
		if (isInited) return (BasicfamilyPackage)EPackage.Registry.INSTANCE.getEPackage(BasicfamilyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasicfamilyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasicfamilyPackageImpl theBasicfamilyPackage = registeredBasicfamilyPackage instanceof BasicfamilyPackageImpl ? (BasicfamilyPackageImpl)registeredBasicfamilyPackage : new BasicfamilyPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBasicfamilyPackage.createPackageContents();

		// Initialize created meta-data
		theBasicfamilyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicfamilyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicfamilyPackage.eNS_URI, theBasicfamilyPackage);
		return theBasicfamilyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Children() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Parents() {
		return (EReference)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Mother() {
		return (EReference)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Father() {
		return (EReference)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFamily() {
		return familyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFamily_Name() {
		return (EAttribute)familyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFamily_Members() {
		return (EReference)familyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMan() {
		return manEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWoman() {
		return womanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicfamilyFactory getBasicfamilyFactory() {
		return (BasicfamilyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);
		createEReference(personEClass, PERSON__CHILDREN);
		createEReference(personEClass, PERSON__PARENTS);
		createEReference(personEClass, PERSON__MOTHER);
		createEReference(personEClass, PERSON__FATHER);

		familyEClass = createEClass(FAMILY);
		createEAttribute(familyEClass, FAMILY__NAME);
		createEReference(familyEClass, FAMILY__MEMBERS);

		manEClass = createEClass(MAN);

		womanEClass = createEClass(WOMAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		manEClass.getESuperTypes().add(this.getPerson());
		womanEClass.getESuperTypes().add(this.getPerson());

		// Initialize classes and features; add operations and parameters
		initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Children(), this.getPerson(), this.getPerson_Parents(), "children", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Parents(), this.getPerson(), this.getPerson_Children(), "parents", null, 0, 2, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Mother(), this.getWoman(), null, "mother", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Father(), this.getMan(), null, "father", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(familyEClass, Family.class, "Family", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFamily_Name(), ecorePackage.getEString(), "name", null, 0, 1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Members(), this.getPerson(), null, "members", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manEClass, Man.class, "Man", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(womanEClass, Woman.class, "Woman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aconite
		createAconiteAnnotations();
		// aconite.diagram
		createAconite_1Annotations();
		// aconite.node
		createAconite_2Annotations();
		// aconite.container
		createAconite_3Annotations();
		// aconite.border
		createAconite_4Annotations();
		// aconite.edge
		createAconite_5Annotations();
	}

	/**
	 * Initializes the annotations for <b>aconite</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAconiteAnnotations() {
		String source = "aconite";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "iconFolder", "uk.ac.york.aconite.family/icons/"
		   });
	}

	/**
	 * Initializes the annotations for <b>aconite.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAconite_1Annotations() {
		String source = "aconite.diagram";
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "name", "Relationships"
		   });
		addAnnotation
		  (familyEClass,
		   source,
		   new String[] {
			   "name", "Family"
		   });
	}

	/**
	 * Initializes the annotations for <b>aconite.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAconite_2Annotations() {
		String source = "aconite.node";
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "name", "Rel Default",
			   "abstract", "true",
			   "color", "white",
			   "showIcon", "true",
			   "childrenPresentation", "List"
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "extend", "Rel Default",
			   "name", "Child",
			   "container", "Person"
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "name", "Sibling",
			   "container", "Siblings",
			   "sce", "parents.children->excluding(self)",
			   "showIcon", "true"
		   });
		addAnnotation
		  (manEClass,
		   source,
		   new String[] {
			   "name", "Man",
			   "container", "Family",
			   "shape", "image",
			   "imagePath", "man.svg",
			   "borderSize", "0"
		   });
		addAnnotation
		  (womanEClass,
		   source,
		   new String[] {
			   "extend", "Man",
			   "name", "Woman",
			   "imagePath", "woman.svg"
		   });
	}

	/**
	 * Initializes the annotations for <b>aconite.container</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAconite_3Annotations() {
		String source = "aconite.container";
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "extend", "Rel Default",
			   "name", "Person",
			   "sce", "",
			   "foregroundColor", "light_green",
			   "container", "Relationships"
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "extend", "Rel Default",
			   "name", "Siblings",
			   "sce", "",
			   "labelValue", "Siblings",
			   "foregroundColor", "light_yellow",
			   "container", "Relationships",
			   "showIcon", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>aconite.border</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAconite_4Annotations() {
		String source = "aconite.border";
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "extend", "Rel Default",
			   "sce", "parents",
			   "name", "Parent",
			   "container", "Person"
		   });
	}

	/**
	 * Initializes the annotations for <b>aconite.edge</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAconite_5Annotations() {
		String source = "aconite.edge";
		addAnnotation
		  (getPerson_Children(),
		   source,
		   new String[] {
			   "name", "SiblingsEdge",
			   "creatable", "false",
			   "labelExpression", "",
			   "color", "gray",
			   "container", "Relationships",
			   "targetFinderExpression", "aql:self",
			   "sourceNode", "Person",
			   "targetNode", "Siblings"
		   });
		addAnnotation
		  (getPerson_Mother(),
		   source,
		   new String[] {
			   "reconnectable", "false",
			   "name", "Mother",
			   "container", "Family",
			   "sourceNode", "Man, Woman",
			   "labelExpression", "",
			   "color", "purple"
		   });
		addAnnotation
		  (getPerson_Father(),
		   source,
		   new String[] {
			   "extend", "Mother",
			   "name", "Father",
			   "color", "blue"
		   });
	}

} //BasicfamilyPackageImpl
