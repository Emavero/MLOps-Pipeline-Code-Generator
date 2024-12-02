/**
 */
package mlops.impl;

import mlops.Deployment;
import mlops.MlopsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mlops.impl.DeploymentImpl#getTargetPlatform <em>Target Platform</em>}</li>
 *   <li>{@link mlops.impl.DeploymentImpl#getScalability <em>Scalability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
	/**
	 * The default value of the '{@link #getTargetPlatform() <em>Target Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PLATFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetPlatform() <em>Target Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPlatform()
	 * @generated
	 * @ordered
	 */
	protected String targetPlatform = TARGET_PLATFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getScalability() <em>Scalability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalability()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScalability() <em>Scalability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalability()
	 * @generated
	 * @ordered
	 */
	protected int scalability = SCALABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlopsPackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetPlatform() {
		return targetPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetPlatform(String newTargetPlatform) {
		String oldTargetPlatform = targetPlatform;
		targetPlatform = newTargetPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlopsPackage.DEPLOYMENT__TARGET_PLATFORM, oldTargetPlatform, targetPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getScalability() {
		return scalability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScalability(int newScalability) {
		int oldScalability = scalability;
		scalability = newScalability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlopsPackage.DEPLOYMENT__SCALABILITY, oldScalability, scalability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MlopsPackage.DEPLOYMENT__TARGET_PLATFORM:
				return getTargetPlatform();
			case MlopsPackage.DEPLOYMENT__SCALABILITY:
				return getScalability();
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
			case MlopsPackage.DEPLOYMENT__TARGET_PLATFORM:
				setTargetPlatform((String)newValue);
				return;
			case MlopsPackage.DEPLOYMENT__SCALABILITY:
				setScalability((Integer)newValue);
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
			case MlopsPackage.DEPLOYMENT__TARGET_PLATFORM:
				setTargetPlatform(TARGET_PLATFORM_EDEFAULT);
				return;
			case MlopsPackage.DEPLOYMENT__SCALABILITY:
				setScalability(SCALABILITY_EDEFAULT);
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
			case MlopsPackage.DEPLOYMENT__TARGET_PLATFORM:
				return TARGET_PLATFORM_EDEFAULT == null ? targetPlatform != null : !TARGET_PLATFORM_EDEFAULT.equals(targetPlatform);
			case MlopsPackage.DEPLOYMENT__SCALABILITY:
				return scalability != SCALABILITY_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (targetPlatform: ");
		result.append(targetPlatform);
		result.append(", scalability: ");
		result.append(scalability);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
