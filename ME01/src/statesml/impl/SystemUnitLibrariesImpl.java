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

import statesml.StatesmlPackage;
import statesml.SystemUnit;
import statesml.SystemUnitLibraries;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Unit Libraries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.SystemUnitLibrariesImpl#getSystemunit <em>Systemunit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemUnitLibrariesImpl extends NamedElementImpl implements SystemUnitLibraries {
	/**
	 * The cached value of the '{@link #getSystemunit() <em>Systemunit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemunit()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnit> systemunit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemUnitLibrariesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.SYSTEM_UNIT_LIBRARIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnit> getSystemunit() {
		if (systemunit == null) {
			systemunit = new EObjectContainmentEList<SystemUnit>(SystemUnit.class, this, StatesmlPackage.SYSTEM_UNIT_LIBRARIES__SYSTEMUNIT);
		}
		return systemunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIES__SYSTEMUNIT:
				return ((InternalEList<?>)getSystemunit()).basicRemove(otherEnd, msgs);
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
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIES__SYSTEMUNIT:
				return getSystemunit();
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
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIES__SYSTEMUNIT:
				getSystemunit().clear();
				getSystemunit().addAll((Collection<? extends SystemUnit>)newValue);
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
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIES__SYSTEMUNIT:
				getSystemunit().clear();
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
			case StatesmlPackage.SYSTEM_UNIT_LIBRARIES__SYSTEMUNIT:
				return systemunit != null && !systemunit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemUnitLibrariesImpl
