/**
 */
package mlops;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlops.Training#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link mlops.Training#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see mlops.MlopsPackage#getTraining()
 * @model
 * @generated
 */
public interface Training extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see mlops.MlopsPackage#getTraining_Algorithm()
	 * @model
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link mlops.Training#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link mlops.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see mlops.MlopsPackage#getTraining_Parameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Training
