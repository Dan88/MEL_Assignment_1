/**
 */
package statesml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statesml.DataType;
import statesml.DataTypeLibrary;
import statesml.StatesmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.DataTypeLibraryImpl#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeLibraryImpl extends NamedElementImpl implements DataTypeLibrary {
	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> datatype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.DATA_TYPE_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDatatype() {
		if (datatype == null) {
			datatype = new EObjectContainmentEList<DataType>(DataType.class, this, StatesmlPackage.DATA_TYPE_LIBRARY__DATATYPE);
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesmlPackage.DATA_TYPE_LIBRARY__DATATYPE:
				return ((InternalEList<?>)getDatatype()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesmlPackage.DATA_TYPE_LIBRARY__DATATYPE:
				return getDatatype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesmlPackage.DATA_TYPE_LIBRARY__DATATYPE:
				getDatatype().clear();
				getDatatype().addAll((Collection<? extends DataType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatesmlPackage.DATA_TYPE_LIBRARY__DATATYPE:
				getDatatype().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatesmlPackage.DATA_TYPE_LIBRARY__DATATYPE:
				return datatype != null && !datatype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataTypeLibraryImpl
