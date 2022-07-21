/**
 * generated by Xtext 2.25.0
 */
package circus.robocalc.sleec.sLEEC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defblock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circus.robocalc.sleec.sLEEC.Defblock#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 *
 * @see circus.robocalc.sleec.sLEEC.SLEECPackage#getDefblock()
 * @model
 * @generated
 */
public interface Defblock extends EObject
{
  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link circus.robocalc.sleec.sLEEC.Definition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see circus.robocalc.sleec.sLEEC.SLEECPackage#getDefblock_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getDefinitions();

} // Defblock