/**
 */
package statesml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import statesml.PrimitiveValue;
import statesml.StatesmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statesml.impl.PrimitiveValueImpl#getString <em>String</em>}</li>
 *   <li>{@link statesml.impl.PrimitiveValueImpl#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link statesml.impl.PrimitiveValueImpl#isBoolean <em>Boolean</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveValueImpl extends ParameterImpl implements PrimitiveValue {
	/**
	 * The default value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected String string = STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_ATTRIBUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected int newAttribute = NEW_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean()
	 * @generated
	 * @ordered
	 */
	protected boolean boolean_ = BOOLEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesmlPackage.Literals.PRIMITIVE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(String newString) {
		String oldString = string;
		string = newString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.PRIMITIVE_VALUE__STRING, oldString, string));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNewAttribute() {
		return newAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewAttribute(int newNewAttribute) {
		int oldNewAttribute = newAttribute;
		newAttribute = newNewAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.PRIMITIVE_VALUE__NEW_ATTRIBUTE, oldNewAttribute, newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoolean() {
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolean(boolean newBoolean) {
		boolean oldBoolean = boolean_;
		boolean_ = newBoolean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesmlPackage.PRIMITIVE_VALUE__BOOLEAN, oldBoolean, boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesmlPackage.PRIMITIVE_VALUE__STRING:
				return getString();
			case StatesmlPackage.PRIMITIVE_VALUE__NEW_ATTRIBUTE:
				return getNewAttribute();
			case StatesmlPackage.PRIMITIVE_VALUE__BOOLEAN:
				return isBoolean();
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
			case StatesmlPackage.PRIMITIVE_VALUE__STRING:
				setString((String)newValue);
				return;
			case StatesmlPackage.PRIMITIVE_VALUE__NEW_ATTRIBUTE:
				setNewAttribute((Integer)newValue);
				return;
			case StatesmlPackage.PRIMITIVE_VALUE__BOOLEAN:
				setBoolean((Boolean)newValue);
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
			case StatesmlPackage.PRIMITIVE_VALUE__STRING:
				setString(STRING_EDEFAULT);
				return;
			case StatesmlPackage.PRIMITIVE_VALUE__NEW_ATTRIBUTE:
				setNewAttribute(NEW_ATTRIBUTE_EDEFAULT);
				return;
			case StatesmlPackage.PRIMITIVE_VALUE__BOOLEAN:
				setBoolean(BOOLEAN_EDEFAULT);
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
			case StatesmlPackage.PRIMITIVE_VALUE__STRING:
				return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
			case StatesmlPackage.PRIMITIVE_VALUE__NEW_ATTRIBUTE:
				return newAttribute != NEW_ATTRIBUTE_EDEFAULT;
			case StatesmlPackage.PRIMITIVE_VALUE__BOOLEAN:
				return boolean_ != BOOLEAN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (String: ");
		result.append(string);
		result.append(", newAttribute: ");
		result.append(newAttribute);
		result.append(", Boolean: ");
		result.append(boolean_);
		result.append(')');
		return result.toString();
	}

} //PrimitiveValueImpl
