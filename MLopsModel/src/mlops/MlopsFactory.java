/**
 */
package mlops;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mlops.MlopsPackage
 * @generated
 */
public interface MlopsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MlopsFactory eINSTANCE = mlops.impl.MlopsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipeline</em>'.
	 * @generated
	 */
	Pipeline createPipeline();

	/**
	 * Returns a new object of class '<em>Data Processing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Processing</em>'.
	 * @generated
	 */
	DataProcessing createDataProcessing();

	/**
	 * Returns a new object of class '<em>Training</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Training</em>'.
	 * @generated
	 */
	Training createTraining();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment</em>'.
	 * @generated
	 */
	Deployment createDeployment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MlopsPackage getMlopsPackage();

} //MlopsFactory
