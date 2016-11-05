/**
 */
package statesml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statesml.Attribute;
import statesml.Event;
import statesml.StateSystem;
import statesml.StatesmlPackage;
import statesml.SystemUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.StateSystemImpl#getSystemunit <em>Systemunit</em>}</li>
 *   <li>{@link statesml.impl.StateSystemImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link statesml.impl.StateSystemImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateSystemImpl extends MinimalEObjectImpl.Container implements StateSystem {
	/**
	 * The cached value of the '{@link #getSystemunit() <em>Systemunit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemunit()
	 * @generated
	 * @ordered
	 */
	protected SystemUnit systemunit;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

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
	protected StateSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.STATE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnit getSystemunit() {
		return systemunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemunit(SystemUnit newSystemunit, NotificationChain msgs) {
		SystemUnit oldSystemunit = systemunit;
		systemunit = newSystemunit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesmlPackage.STATE_SYSTEM__SYSTEMUNIT, oldSystemunit, newSystemunit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemunit(SystemUnit newSystemunit) {
		if (newSystemunit != systemunit) {
			NotificationChain msgs = null;
			if (systemunit != null)
				msgs = ((InternalEObject)systemunit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatesmlPackage.STATE_SYSTEM__SYSTEMUNIT, null, msgs);
			if (newSystemunit != null)
				msgs = ((InternalEObject)newSystemunit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatesmlPackage.STATE_SYSTEM__SYSTEMUNIT, null, msgs);
			msgs = basicSetSystemunit(newSystemunit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.STATE_SYSTEM__SYSTEMUNIT, newSystemunit, newSystemunit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<Event>(Event.class, this, StatesmlPackage.STATE_SYSTEM__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, StatesmlPackage.STATE_SYSTEM__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesmlPackage.STATE_SYSTEM__SYSTEMUNIT:
				return basicSetSystemunit(null, msgs);
			case StatesmlPackage.STATE_SYSTEM__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case StatesmlPackage.STATE_SYSTEM__ATTRIBUTE:
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
			case StatesmlPackage.STATE_SYSTEM__SYSTEMUNIT:
				return getSystemunit();
			case StatesmlPackage.STATE_SYSTEM__EVENT:
				return getEvent();
			case StatesmlPackage.STATE_SYSTEM__ATTRIBUTE:
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
			case StatesmlPackage.STATE_SYSTEM__SYSTEMUNIT:
				setSystemunit((SystemUnit)newValue);
				return;
			case StatesmlPackage.STATE_SYSTEM__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case StatesmlPackage.STATE_SYSTEM__ATTRIBUTE:
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
			case StatesmlPackage.STATE_SYSTEM__SYSTEMUNIT:
				setSystemunit((SystemUnit)null);
				return;
			case StatesmlPackage.STATE_SYSTEM__EVENT:
				getEvent().clear();
				return;
			case StatesmlPackage.STATE_SYSTEM__ATTRIBUTE:
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
			case StatesmlPackage.STATE_SYSTEM__SYSTEMUNIT:
				return systemunit != null;
			case StatesmlPackage.STATE_SYSTEM__EVENT:
				return event != null && !event.isEmpty();
			case StatesmlPackage.STATE_SYSTEM__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateSystemImpl
