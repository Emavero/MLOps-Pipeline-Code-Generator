/**
 */
package mlops.impl;

import mlops.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MlopsFactoryImpl extends EFactoryImpl implements MlopsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MlopsFactory init() {
		try {
			MlopsFactory theMlopsFactory = (MlopsFactory)EPackage.Registry.INSTANCE.getEFactory(MlopsPackage.eNS_URI);
			if (theMlopsFactory != null) {
				return theMlopsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MlopsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MlopsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MlopsPackage.PIPELINE: return createPipeline();
			case MlopsPackage.DATA_PROCESSING: return createDataProcessing();
			case MlopsPackage.TRAINING: return createTraining();
			case MlopsPackage.PARAMETER: return createParameter();
			case MlopsPackage.DEPLOYMENT: return createDeployment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataProcessing createDataProcessing() {
		DataProcessingImpl dataProcessing = new DataProcessingImpl();
		return dataProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Training createTraining() {
		TrainingImpl training = new TrainingImpl();
		return training;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MlopsPackage getMlopsPackage() {
		return (MlopsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MlopsPackage getPackage() {
		return MlopsPackage.eINSTANCE;
	}

} //MlopsFactoryImpl
