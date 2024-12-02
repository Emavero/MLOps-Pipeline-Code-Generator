/**
 */
package mlops.impl;

import mlops.DataProcessing;
import mlops.MlopsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Processing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mlops.impl.DataProcessingImpl#getInputPath <em>Input Path</em>}</li>
 *   <li>{@link mlops.impl.DataProcessingImpl#getOutputPath <em>Output Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataProcessingImpl extends MinimalEObjectImpl.Container implements DataProcessing {
	/**
	 * The default value of the '{@link #getInputPath() <em>Input Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPath()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputPath() <em>Input Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPath()
	 * @generated
	 * @ordered
	 */
	protected String inputPath = INPUT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputPath() <em>Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPath()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputPath() <em>Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPath()
	 * @generated
	 * @ordered
	 */
	protected String outputPath = OUTPUT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataProcessingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlopsPackage.Literals.DATA_PROCESSING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputPath() {
		return inputPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputPath(String newInputPath) {
		String oldInputPath = inputPath;
		inputPath = newInputPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlopsPackage.DATA_PROCESSING__INPUT_PATH, oldInputPath, inputPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputPath() {
		return outputPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputPath(String newOutputPath) {
		String oldOutputPath = outputPath;
		outputPath = newOutputPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlopsPackage.DATA_PROCESSING__OUTPUT_PATH, oldOutputPath, outputPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MlopsPackage.DATA_PROCESSING__INPUT_PATH:
				return getInputPath();
			case MlopsPackage.DATA_PROCESSING__OUTPUT_PATH:
				return getOutputPath();
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
			case MlopsPackage.DATA_PROCESSING__INPUT_PATH:
				setInputPath((String)newValue);
				return;
			case MlopsPackage.DATA_PROCESSING__OUTPUT_PATH:
				setOutputPath((String)newValue);
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
			case MlopsPackage.DATA_PROCESSING__INPUT_PATH:
				setInputPath(INPUT_PATH_EDEFAULT);
				return;
			case MlopsPackage.DATA_PROCESSING__OUTPUT_PATH:
				setOutputPath(OUTPUT_PATH_EDEFAULT);
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
			case MlopsPackage.DATA_PROCESSING__INPUT_PATH:
				return INPUT_PATH_EDEFAULT == null ? inputPath != null : !INPUT_PATH_EDEFAULT.equals(inputPath);
			case MlopsPackage.DATA_PROCESSING__OUTPUT_PATH:
				return OUTPUT_PATH_EDEFAULT == null ? outputPath != null : !OUTPUT_PATH_EDEFAULT.equals(outputPath);
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
		result.append(" (inputPath: ");
		result.append(inputPath);
		result.append(", outputPath: ");
		result.append(outputPath);
		result.append(')');
		return result.toString();
	}

} //DataProcessingImpl
