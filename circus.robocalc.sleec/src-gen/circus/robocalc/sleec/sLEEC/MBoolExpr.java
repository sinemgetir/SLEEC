/**
 * generated by Xtext 2.25.0
 */
package circus.robocalc.sleec.sLEEC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBool Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circus.robocalc.sleec.sLEEC.MBoolExpr#getName <em>Name</em>}</li>
 *   <li>{@link circus.robocalc.sleec.sLEEC.MBoolExpr#getValue <em>Value</em>}</li>
 *   <li>{@link circus.robocalc.sleec.sLEEC.MBoolExpr#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see circus.robocalc.sleec.sLEEC.SLEECPackage#getMBoolExpr()
 * @model
 * @generated
 */
public interface MBoolExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see circus.robocalc.sleec.sLEEC.SLEECPackage#getMBoolExpr_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link circus.robocalc.sleec.sLEEC.MBoolExpr#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see circus.robocalc.sleec.sLEEC.SLEECPackage#getMBoolExpr_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link circus.robocalc.sleec.sLEEC.MBoolExpr#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(MBoolExpr)
   * @see circus.robocalc.sleec.sLEEC.SLEECPackage#getMBoolExpr_Left()
   * @model containment="true"
   * @generated
   */
  MBoolExpr getLeft();

  /**
   * Sets the value of the '{@link circus.robocalc.sleec.sLEEC.MBoolExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(MBoolExpr value);

} // MBoolExpr
