/**
 */
package SimpleBPMN.provider;


import SimpleBPMN.Group;
import SimpleBPMN.SimpleBPMNFactory;
import SimpleBPMN.SimpleBPMNPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link SimpleBPMN.Group} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupItemProvider extends ArtifactItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SimpleBPMNPackage.Literals.GROUP__ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Group.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Group"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Group)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Group_type") :
			getString("_UI_Group_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Group.class)) {
			case SimpleBPMNPackage.GROUP__ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createBPMNElement()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createPool()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createXOR()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createOR()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createAND()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createIntermediateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleBPMNPackage.Literals.GROUP__ELEMENTS,
				 SimpleBPMNFactory.eINSTANCE.createGroup()));
	}

}
