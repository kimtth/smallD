/**
 * generated by Xtext 2.12.0
 */
package org.xtext.labs.mydsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.labs.mydsl.FuncCall#getFunc <em>Func</em>}</li>
 * </ul>
 *
 * @see org.xtext.labs.mydsl.MydslPackage#getFuncCall()
 * @model
 * @generated
 */
public interface FuncCall extends AbstractMethodCall
{
  /**
   * Returns the value of the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' reference.
   * @see #setFunc(FuncDefinition)
   * @see org.xtext.labs.mydsl.MydslPackage#getFuncCall_Func()
   * @model
   * @generated
   */
  FuncDefinition getFunc();

  /**
   * Sets the value of the '{@link org.xtext.labs.mydsl.FuncCall#getFunc <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(FuncDefinition value);

} // FuncCall
