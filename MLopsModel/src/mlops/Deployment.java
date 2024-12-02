/**
 */
package mlops;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlops.Deployment#getTargetPlatform <em>Target Platform</em>}</li>
 *   <li>{@link mlops.Deployment#getScalability <em>Scalability</em>}</li>
 * </ul>
 *
 * @see mlops.MlopsPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Platform</em>' attribute.
	 * @see #setTargetPlatform(String)
	 * @see mlops.MlopsPackage#getDeployment_TargetPlatform()
	 * @model
	 * @generated
	 */
	String getTargetPlatform();

	/**
	 * Sets the value of the '{@link mlops.Deployment#getTargetPlatform <em>Target Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Platform</em>' attribute.
	 * @see #getTargetPlatform()
	 * @generated
	 */
	void setTargetPlatform(String value);

	/**
	 * Returns the value of the '<em><b>Scalability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalability</em>' attribute.
	 * @see #setScalability(int)
	 * @see mlops.MlopsPackage#getDeployment_Scalability()
	 * @model
	 * @generated
	 */
	int getScalability();

	/**
	 * Sets the value of the '{@link mlops.Deployment#getScalability <em>Scalability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalability</em>' attribute.
	 * @see #getScalability()
	 * @generated
	 */
	void setScalability(int value);

} // Deployment
