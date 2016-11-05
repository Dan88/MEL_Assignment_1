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

import statesml.Attribute;
import statesml.Function;
import statesml.StatesmlPackage;
import statesml.SystemUnit;
import statesml.SystemUnitElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.SystemUnitImpl#getSystemunitelement <em>Systemunitelement</em>}</li>
 *   <li>{@link statesml.impl.SystemUnitImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link statesml.impl.SystemUnitImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemUnitImpl extends NamedElementImpl implements SystemUnit {
	/**
	 * The cached value of the '{@link #getSystemunitelement() <em>Systemunitelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemunitelement()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitElement> systemunitelement;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> function;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.SYSTEM_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitElement> getSystemunitelement() {
		if (systemunitelement == null) {
			systemunitelement = new EObjectContainmentEList<SystemUnitElement>(SystemUnitElement.class, this, StatesmlPackage.SYSTEM_UNIT__SYSTEMUNITELEMENT);
		}
		return systemunitelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, StatesmlPackage.SYSTEM_UNIT__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<Function>(Function.class, this, StatesmlPackage.SYSTEM_UNIT__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesmlPackage.SYSTEM_UNIT__SYSTEMUNITELEMENT:
				return ((InternalEList<?>)getSystemunitelement()).basicRemove(otherEnd, msgs);
			case StatesmlPackage.SYSTEM_UNIT__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case StatesmlPackage.SYSTEM_UNIT__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
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
			case StatesmlPackage.SYSTEM_UNIT__SYSTEMUNITELEMENT:
				return getSystemunitelement();
			case StatesmlPackage.SYSTEM_UNIT__FUNCTION:
				return getFunction();
			case StatesmlPackage.SYSTEM_UNIT__ATTRIBUTE:
				return getAttribute();
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
			case StatesmlPackage.SYSTEM_UNIT__SYSTEMUNITELEMENT:
				getSystemunitelement().clear();
				getSystemunitelement().addAll((Collection<? extends SystemUnitElement>)newValue);
				return;
			case StatesmlPackage.SYSTEM_UNIT__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends Function>)newValue);
				return;
			case StatesmlPackage.SYSTEM_UNIT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
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
			case StatesmlPackage.SYSTEM_UNIT__SYSTEMUNITELEMENT:
				getSystemunitelement().clear();
				return;
			case StatesmlPackage.SYSTEM_UNIT__FUNCTION:
				getFunction().clear();
				return;
			case StatesmlPackage.SYSTEM_UNIT__ATTRIBUTE:
				getAttribute().clear();
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
			case StatesmlPackage.SYSTEM_UNIT__SYSTEMUNITELEMENT:
				return systemunitelement != null && !systemunitelement.isEmpty();
			case StatesmlPackage.SYSTEM_UNIT__FUNCTION:
				return function != null && !function.isEmpty();
			case StatesmlPackage.SYSTEM_UNIT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemUnitImpl
