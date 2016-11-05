/**
 */
package statesml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import statesml.InitialState;
import statesml.State;
import statesml.StatesmlPackage;
import statesml.TerminalState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.StateImpl#getTerminalstate <em>Terminalstate</em>}</li>
 *   <li>{@link statesml.impl.StateImpl#getInitialstate <em>Initialstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getTerminalstate() <em>Terminalstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalstate()
	 * @generated
	 * @ordered
	 */
	protected TerminalState terminalstate;

	/**
	 * The cached value of the '{@link #getInitialstate() <em>Initialstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialstate()
	 * @generated
	 * @ordered
	 */
	protected InitialState initialstate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalState getTerminalstate() {
		return terminalstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminalstate(TerminalState newTerminalstate, NotificationChain msgs) {
		TerminalState oldTerminalstate = terminalstate;
		terminalstate = newTerminalstate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesmlPackage.STATE__TERMINALSTATE, oldTerminalstate, newTerminalstate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminalstate(TerminalState newTerminalstate) {
		if (newTerminalstate != terminalstate) {
			NotificationChain msgs = null;
			if (terminalstate != null)
				msgs = ((InternalEObject)terminalstate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatesmlPackage.STATE__TERMINALSTATE, null, msgs);
			if (newTerminalstate != null)
				msgs = ((InternalEObject)newTerminalstate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatesmlPackage.STATE__TERMINALSTATE, null, msgs);
			msgs = basicSetTerminalstate(newTerminalstate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.STATE__TERMINALSTATE, newTerminalstate, newTerminalstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getInitialstate() {
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialstate(InitialState newInitialstate, NotificationChain msgs) {
		InitialState oldInitialstate = initialstate;
		initialstate = newInitialstate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesmlPackage.STATE__INITIALSTATE, oldInitialstate, newInitialstate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialstate(InitialState newInitialstate) {
		if (newInitialstate != initialstate) {
			NotificationChain msgs = null;
			if (initialstate != null)
				msgs = ((InternalEObject)initialstate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatesmlPackage.STATE__INITIALSTATE, null, msgs);
			if (newInitialstate != null)
				msgs = ((InternalEObject)newInitialstate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatesmlPackage.STATE__INITIALSTATE, null, msgs);
			msgs = basicSetInitialstate(newInitialstate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.STATE__INITIALSTATE, newInitialstate, newInitialstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesmlPackage.STATE__TERMINALSTATE:
				return basicSetTerminalstate(null, msgs);
			case StatesmlPackage.STATE__INITIALSTATE:
				return basicSetInitialstate(null, msgs);
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
			case StatesmlPackage.STATE__TERMINALSTATE:
				return getTerminalstate();
			case StatesmlPackage.STATE__INITIALSTATE:
				return getInitialstate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesmlPackage.STATE__TERMINALSTATE:
				setTerminalstate((TerminalState)newValue);
				return;
			case StatesmlPackage.STATE__INITIALSTATE:
				setInitialstate((InitialState)newValue);
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
			case StatesmlPackage.STATE__TERMINALSTATE:
				setTerminalstate((TerminalState)null);
				return;
			case StatesmlPackage.STATE__INITIALSTATE:
				setInitialstate((InitialState)null);
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
			case StatesmlPackage.STATE__TERMINALSTATE:
				return terminalstate != null;
			case StatesmlPackage.STATE__INITIALSTATE:
				return initialstate != null;
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
