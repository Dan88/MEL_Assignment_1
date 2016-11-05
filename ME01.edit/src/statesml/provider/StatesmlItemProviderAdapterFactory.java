/**
 */
package statesml.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import statesml.util.StatesmlAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesmlItemProviderAdapterFactory extends StatesmlAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesmlItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.StateSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateSystemItemProvider stateSystemItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.StateSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateSystemAdapter() {
		if (stateSystemItemProvider == null) {
			stateSystemItemProvider = new StateSystemItemProvider(this);
		}

		return stateSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.SystemUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemUnitItemProvider systemUnitItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.SystemUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemUnitAdapter() {
		if (systemUnitItemProvider == null) {
			systemUnitItemProvider = new SystemUnitItemProvider(this);
		}

		return systemUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.DataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeItemProvider dataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTypeAdapter() {
		if (dataTypeItemProvider == null) {
			dataTypeItemProvider = new DataTypeItemProvider(this);
		}

		return dataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.InParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InParameterItemProvider inParameterItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.InParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInParameterAdapter() {
		if (inParameterItemProvider == null) {
			inParameterItemProvider = new InParameterItemProvider(this);
		}

		return inParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.returnParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected returnParameterItemProvider returnParameterItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.returnParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createreturnParameterAdapter() {
		if (returnParameterItemProvider == null) {
			returnParameterItemProvider = new returnParameterItemProvider(this);
		}

		return returnParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.SystemUnitLibraries} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemUnitLibrariesItemProvider systemUnitLibrariesItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.SystemUnitLibraries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemUnitLibrariesAdapter() {
		if (systemUnitLibrariesItemProvider == null) {
			systemUnitLibrariesItemProvider = new SystemUnitLibrariesItemProvider(this);
		}

		return systemUnitLibrariesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.DataTypeLibrary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeLibraryItemProvider dataTypeLibraryItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.DataTypeLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTypeLibraryAdapter() {
		if (dataTypeLibraryItemProvider == null) {
			dataTypeLibraryItemProvider = new DataTypeLibraryItemProvider(this);
		}

		return dataTypeLibraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.SelectionDivergence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionDivergenceItemProvider selectionDivergenceItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.SelectionDivergence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionDivergenceAdapter() {
		if (selectionDivergenceItemProvider == null) {
			selectionDivergenceItemProvider = new SelectionDivergenceItemProvider(this);
		}

		return selectionDivergenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.SelectionConvergence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionConvergenceItemProvider selectionConvergenceItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.SelectionConvergence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionConvergenceAdapter() {
		if (selectionConvergenceItemProvider == null) {
			selectionConvergenceItemProvider = new SelectionConvergenceItemProvider(this);
		}

		return selectionConvergenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.InitialState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialStateItemProvider initialStateItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.InitialState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitialStateAdapter() {
		if (initialStateItemProvider == null) {
			initialStateItemProvider = new InitialStateItemProvider(this);
		}

		return initialStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.TerminalState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalStateItemProvider terminalStateItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.TerminalState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTerminalStateAdapter() {
		if (terminalStateItemProvider == null) {
			terminalStateItemProvider = new TerminalStateItemProvider(this);
		}

		return terminalStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.SystemUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemUnitItemProvider systemUnitItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.SystemUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemUnitAdapter() {
		if (systemUnitItemProvider == null) {
			systemUnitItemProvider = new SystemUnitItemProvider(this);
		}

		return systemUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.Edge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeItemProvider edgeItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEdgeAdapter() {
		if (edgeItemProvider == null) {
			edgeItemProvider = new EdgeItemProvider(this);
		}

		return edgeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.Node} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeItemProvider nodeItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeAdapter() {
		if (nodeItemProvider == null) {
			nodeItemProvider = new NodeItemProvider(this);
		}

		return nodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.Call} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallItemProvider callItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.Call}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallAdapter() {
		if (callItemProvider == null) {
			callItemProvider = new CallItemProvider(this);
		}

		return callItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.PrimitiveValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveValueItemProvider primitiveValueItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.PrimitiveValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveValueAdapter() {
		if (primitiveValueItemProvider == null) {
			primitiveValueItemProvider = new PrimitiveValueItemProvider(this);
		}

		return primitiveValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.AttrbuteValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttrbuteValueItemProvider attrbuteValueItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.AttrbuteValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttrbuteValueAdapter() {
		if (attrbuteValueItemProvider == null) {
			attrbuteValueItemProvider = new AttrbuteValueItemProvider(this);
		}

		return attrbuteValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link statesml.Trigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerItemProvider triggerItemProvider;

	/**
	 * This creates an adapter for a {@link statesml.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTriggerAdapter() {
		if (triggerItemProvider == null) {
			triggerItemProvider = new TriggerItemProvider(this);
		}

		return triggerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (stateSystemItemProvider != null) stateSystemItemProvider.dispose();
		if (systemUnitItemProvider != null) systemUnitItemProvider.dispose();
		if (attributeItemProvider != null) attributeItemProvider.dispose();
		if (functionItemProvider != null) functionItemProvider.dispose();
		if (dataTypeItemProvider != null) dataTypeItemProvider.dispose();
		if (inParameterItemProvider != null) inParameterItemProvider.dispose();
		if (returnParameterItemProvider != null) returnParameterItemProvider.dispose();
		if (systemUnitLibrariesItemProvider != null) systemUnitLibrariesItemProvider.dispose();
		if (dataTypeLibraryItemProvider != null) dataTypeLibraryItemProvider.dispose();
		if (stateItemProvider != null) stateItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (selectionDivergenceItemProvider != null) selectionDivergenceItemProvider.dispose();
		if (selectionConvergenceItemProvider != null) selectionConvergenceItemProvider.dispose();
		if (initialStateItemProvider != null) initialStateItemProvider.dispose();
		if (terminalStateItemProvider != null) terminalStateItemProvider.dispose();
		if (systemUnitItemProvider != null) systemUnitItemProvider.dispose();
		if (edgeItemProvider != null) edgeItemProvider.dispose();
		if (nodeItemProvider != null) nodeItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (attributeItemProvider != null) attributeItemProvider.dispose();
		if (functionItemProvider != null) functionItemProvider.dispose();
		if (callItemProvider != null) callItemProvider.dispose();
		if (primitiveValueItemProvider != null) primitiveValueItemProvider.dispose();
		if (attrbuteValueItemProvider != null) attrbuteValueItemProvider.dispose();
		if (triggerItemProvider != null) triggerItemProvider.dispose();
	}

}
