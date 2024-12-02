/**
 */
package mlops;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mlops.MlopsFactory
 * @model kind="package"
 * @generated
 */
public interface MlopsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mlops";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mlops.ensias.ma";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mlops";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MlopsPackage eINSTANCE = mlops.impl.MlopsPackageImpl.init();

	/**
	 * The meta object id for the '{@link mlops.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlops.impl.PipelineImpl
	 * @see mlops.impl.MlopsPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Data Processing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__DATA_PROCESSING = 2;

	/**
	 * The feature id for the '<em><b>Training</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TRAINING = 3;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__DEPLOYMENT = 4;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlops.impl.DataProcessingImpl <em>Data Processing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlops.impl.DataProcessingImpl
	 * @see mlops.impl.MlopsPackageImpl#getDataProcessing()
	 * @generated
	 */
	int DATA_PROCESSING = 1;

	/**
	 * The feature id for the '<em><b>Input Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING__INPUT_PATH = 0;

	/**
	 * The feature id for the '<em><b>Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING__OUTPUT_PATH = 1;

	/**
	 * The number of structural features of the '<em>Data Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlops.impl.TrainingImpl <em>Training</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlops.impl.TrainingImpl
	 * @see mlops.impl.MlopsPackageImpl#getTraining()
	 * @generated
	 */
	int TRAINING = 2;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Training</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlops.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlops.impl.ParameterImpl
	 * @see mlops.impl.MlopsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mlops.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mlops.impl.DeploymentImpl
	 * @see mlops.impl.MlopsPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 4;

	/**
	 * The feature id for the '<em><b>Target Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__TARGET_PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Scalability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SCALABILITY = 1;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mlops.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see mlops.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the attribute '{@link mlops.Pipeline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mlops.Pipeline#getName()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Name();

	/**
	 * Returns the meta object for the attribute '{@link mlops.Pipeline#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mlops.Pipeline#getVersion()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Version();

	/**
	 * Returns the meta object for the reference '{@link mlops.Pipeline#getDataProcessing <em>Data Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Processing</em>'.
	 * @see mlops.Pipeline#getDataProcessing()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_DataProcessing();

	/**
	 * Returns the meta object for the reference '{@link mlops.Pipeline#getTraining <em>Training</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Training</em>'.
	 * @see mlops.Pipeline#getTraining()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Training();

	/**
	 * Returns the meta object for the reference '{@link mlops.Pipeline#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment</em>'.
	 * @see mlops.Pipeline#getDeployment()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Deployment();

	/**
	 * Returns the meta object for class '{@link mlops.DataProcessing <em>Data Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Processing</em>'.
	 * @see mlops.DataProcessing
	 * @generated
	 */
	EClass getDataProcessing();

	/**
	 * Returns the meta object for the attribute '{@link mlops.DataProcessing#getInputPath <em>Input Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Path</em>'.
	 * @see mlops.DataProcessing#getInputPath()
	 * @see #getDataProcessing()
	 * @generated
	 */
	EAttribute getDataProcessing_InputPath();

	/**
	 * Returns the meta object for the attribute '{@link mlops.DataProcessing#getOutputPath <em>Output Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Path</em>'.
	 * @see mlops.DataProcessing#getOutputPath()
	 * @see #getDataProcessing()
	 * @generated
	 */
	EAttribute getDataProcessing_OutputPath();

	/**
	 * Returns the meta object for class '{@link mlops.Training <em>Training</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training</em>'.
	 * @see mlops.Training
	 * @generated
	 */
	EClass getTraining();

	/**
	 * Returns the meta object for the attribute '{@link mlops.Training#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see mlops.Training#getAlgorithm()
	 * @see #getTraining()
	 * @generated
	 */
	EAttribute getTraining_Algorithm();

	/**
	 * Returns the meta object for the reference list '{@link mlops.Training#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see mlops.Training#getParameters()
	 * @see #getTraining()
	 * @generated
	 */
	EReference getTraining_Parameters();

	/**
	 * Returns the meta object for class '{@link mlops.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see mlops.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link mlops.Parameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see mlops.Parameter#getKey()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link mlops.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mlops.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link mlops.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see mlops.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the attribute '{@link mlops.Deployment#getTargetPlatform <em>Target Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Platform</em>'.
	 * @see mlops.Deployment#getTargetPlatform()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_TargetPlatform();

	/**
	 * Returns the meta object for the attribute '{@link mlops.Deployment#getScalability <em>Scalability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalability</em>'.
	 * @see mlops.Deployment#getScalability()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Scalability();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MlopsFactory getMlopsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mlops.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlops.impl.PipelineImpl
		 * @see mlops.impl.MlopsPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__NAME = eINSTANCE.getPipeline_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__VERSION = eINSTANCE.getPipeline_Version();

		/**
		 * The meta object literal for the '<em><b>Data Processing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__DATA_PROCESSING = eINSTANCE.getPipeline_DataProcessing();

		/**
		 * The meta object literal for the '<em><b>Training</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TRAINING = eINSTANCE.getPipeline_Training();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__DEPLOYMENT = eINSTANCE.getPipeline_Deployment();

		/**
		 * The meta object literal for the '{@link mlops.impl.DataProcessingImpl <em>Data Processing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlops.impl.DataProcessingImpl
		 * @see mlops.impl.MlopsPackageImpl#getDataProcessing()
		 * @generated
		 */
		EClass DATA_PROCESSING = eINSTANCE.getDataProcessing();

		/**
		 * The meta object literal for the '<em><b>Input Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROCESSING__INPUT_PATH = eINSTANCE.getDataProcessing_InputPath();

		/**
		 * The meta object literal for the '<em><b>Output Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROCESSING__OUTPUT_PATH = eINSTANCE.getDataProcessing_OutputPath();

		/**
		 * The meta object literal for the '{@link mlops.impl.TrainingImpl <em>Training</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlops.impl.TrainingImpl
		 * @see mlops.impl.MlopsPackageImpl#getTraining()
		 * @generated
		 */
		EClass TRAINING = eINSTANCE.getTraining();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING__ALGORITHM = eINSTANCE.getTraining_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING__PARAMETERS = eINSTANCE.getTraining_Parameters();

		/**
		 * The meta object literal for the '{@link mlops.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlops.impl.ParameterImpl
		 * @see mlops.impl.MlopsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KEY = eINSTANCE.getParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link mlops.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mlops.impl.DeploymentImpl
		 * @see mlops.impl.MlopsPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Target Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__TARGET_PLATFORM = eINSTANCE.getDeployment_TargetPlatform();

		/**
		 * The meta object literal for the '<em><b>Scalability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__SCALABILITY = eINSTANCE.getDeployment_Scalability();

	}

} //MlopsPackage
