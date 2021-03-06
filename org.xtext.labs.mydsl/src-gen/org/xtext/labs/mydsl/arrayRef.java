/**
 * generated by Xtext 2.12.0
 */
package org.xtext.labs.mydsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>array Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.labs.mydsl.arrayRef#getVarRef <em>Var Ref</em>}</li>
 *   <li>{@link org.xtext.labs.mydsl.arrayRef#getDim <em>Dim</em>}</li>
 * </ul>
 *
 * @see org.xtext.labs.mydsl.MydslPackage#getarrayRef()
 * @model
 * @generated
 */
public interface arrayRef extends Terminal
{
  /**
   * Returns the value of the '<em><b>Var Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Ref</em>' reference.
   * @see #setVarRef(varSymbol)
   * @see org.xtext.labs.mydsl.MydslPackage#getarrayRef_VarRef()
   * @model
   * @generated
   */
  varSymbol getVarRef();

  /**
   * Sets the value of the '{@link org.xtext.labs.mydsl.arrayRef#getVarRef <em>Var Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Ref</em>' reference.
   * @see #getVarRef()
   * @generated
   */
  void setVarRef(varSymbol value);

  /**
   * Returns the value of the '<em><b>Dim</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.labs.mydsl.arrayDimension}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dim</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dim</em>' containment reference list.
   * @see org.xtext.labs.mydsl.MydslPackage#getarrayRef_Dim()
   * @model containment="true"
   * @generated
   */
  EList<arrayDimension> getDim();

} // arrayRef
