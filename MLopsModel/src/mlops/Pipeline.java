/**
 */
package mlops;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlops.Pipeline#getName <em>Name</em>}</li>
 *   <li>{@link mlops.Pipeline#getVersion <em>Version</em>}</li>
 *   <li>{@link mlops.Pipeline#getDataProcessing <em>Data Processing</em>}</li>
 *   <li>{@link mlops.Pipeline#getTraining <em>Training</em>}</li>
 *   <li>{@link mlops.Pipeline#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @see mlops.MlopsPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mlops.MlopsPackage#getPipeline_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mlops.Pipeline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see mlops.MlopsPackage#getPipeline_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mlops.Pipeline#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Data Processing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Processing</em>' reference.
	 * @see #setDataProcessing(DataProcessing)
	 * @see mlops.MlopsPackage#getPipeline_DataProcessing()
	 * @model
	 * @generated
	 */
	DataProcessing getDataProcessing();

	/**
	 * Sets the value of the '{@link mlops.Pipeline#getDataProcessing <em>Data Processing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Processing</em>' reference.
	 * @see #getDataProcessing()
	 * @generated
	 */
	void setDataProcessing(DataProcessing value);

	/**
	 * Returns the value of the '<em><b>Training</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training</em>' reference.
	 * @see #setTraining(Training)
	 * @see mlops.MlopsPackage#getPipeline_Training()
	 * @model
	 * @generated
	 */
	Training getTraining();

	/**
	 * Sets the value of the '{@link mlops.Pipeline#getTraining <em>Training</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training</em>' reference.
	 * @see #getTraining()
	 * @generated
	 */
	void setTraining(Training value);

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' reference.
	 * @see #setDeployment(Deployment)
	 * @see mlops.MlopsPackage#getPipeline_Deployment()
	 * @model
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link mlops.Pipeline#getDeployment <em>Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

} // Pipeline
