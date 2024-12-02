/**
 */
package mlops.impl;

import mlops.DataProcessing;
import mlops.Deployment;
import mlops.MlopsPackage;
import mlops.Pipeline;
import mlops.Training;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mlops.impl.PipelineImpl#getName <em>Name</em>}</li>
 *   <li>{@link mlops.impl.PipelineImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mlops.impl.PipelineImpl#getDataProcessing <em>Data Processing</em>}</li>
 *   <li>{@link mlops.impl.PipelineImpl#getTraining <em>Training</em>}</li>
 *   <li>{@link mlops.impl.PipelineImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataProcessing() <em>Data Processing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProcessing()
	 * @generated
	 * @ordered
	 */
	protected DataProcessing dataProcessing;

	/**
	 * The cached value of the '{@link #getTraining() <em>Training</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraining()
	 * @generated
	 * @ordered
	 */
	protected Training training;

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected Deployment deployment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlopsPackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlopsPackage.PIPELINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlopsPackage.PIPELINE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataProcessing getDataProcessing() {
		if (dataProcessing != null && dataProcessing.eIsProxy()) {
			InternalEObject oldDataProcessing = (InternalEObject)dataProcessing;
			dataProcessing = (DataProcessing)eResolveProxy(oldDataProcessing);
			if (dataProcessing != oldDataProcessing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MlopsPackage.PIPELINE__DATA_PROCESSING, oldDataProcessing, dataProcessing));
			}
		}
		return dataProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcessing basicGetDataProcessing() {
		return dataProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataProcessing(DataProcessing newDataProcessing) {
		DataProcessing oldDataProcessing = dataProcessing;
		dataProcessing = newDataProcessing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlopsPackage.PIPELINE__DATA_PROCESSING, oldDataProcessing, dataProcessing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Training getTraining() {
		if (training != null && training.eIsProxy()) {
			InternalEObject oldTraining = (InternalEObject)training;
			training = (Training)eResolveProxy(oldTraining);
			if (training != oldTraining) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MlopsPackage.PIPELINE__TRAINING, oldTraining, training));
			}
		}
		return training;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Training basicGetTraining() {
		return training;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTraining(Training newTraining) {
		Training oldTraining = training;
		training = newTraining;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlopsPackage.PIPELINE__TRAINING, oldTraining, training));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deployment getDeployment() {
		if (deployment != null && deployment.eIsProxy()) {
			InternalEObject oldDeployment = (InternalEObject)deployment;
			deployment = (Deployment)eResolveProxy(oldDeployment);
			if (deployment != oldDeployment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MlopsPackage.PIPELINE__DEPLOYMENT, oldDeployment, deployment));
			}
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment basicGetDeployment() {
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployment(Deployment newDeployment) {
		Deployment oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlopsPackage.PIPELINE__DEPLOYMENT, oldDeployment, deployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MlopsPackage.PIPELINE__NAME:
				return getName();
			case MlopsPackage.PIPELINE__VERSION:
				return getVersion();
			case MlopsPackage.PIPELINE__DATA_PROCESSING:
				if (resolve) return getDataProcessing();
				return basicGetDataProcessing();
			case MlopsPackage.PIPELINE__TRAINING:
				if (resolve) return getTraining();
				return basicGetTraining();
			case MlopsPackage.PIPELINE__DEPLOYMENT:
				if (resolve) return getDeployment();
				return basicGetDeployment();
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
			case MlopsPackage.PIPELINE__NAME:
				setName((String)newValue);
				return;
			case MlopsPackage.PIPELINE__VERSION:
				setVersion((String)newValue);
				return;
			case MlopsPackage.PIPELINE__DATA_PROCESSING:
				setDataProcessing((DataProcessing)newValue);
				return;
			case MlopsPackage.PIPELINE__TRAINING:
				setTraining((Training)newValue);
				return;
			case MlopsPackage.PIPELINE__DEPLOYMENT:
				setDeployment((Deployment)newValue);
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
			case MlopsPackage.PIPELINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MlopsPackage.PIPELINE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case MlopsPackage.PIPELINE__DATA_PROCESSING:
				setDataProcessing((DataProcessing)null);
				return;
			case MlopsPackage.PIPELINE__TRAINING:
				setTraining((Training)null);
				return;
			case MlopsPackage.PIPELINE__DEPLOYMENT:
				setDeployment((Deployment)null);
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
			case MlopsPackage.PIPELINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MlopsPackage.PIPELINE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MlopsPackage.PIPELINE__DATA_PROCESSING:
				return dataProcessing != null;
			case MlopsPackage.PIPELINE__TRAINING:
				return training != null;
			case MlopsPackage.PIPELINE__DEPLOYMENT:
				return deployment != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //PipelineImpl
