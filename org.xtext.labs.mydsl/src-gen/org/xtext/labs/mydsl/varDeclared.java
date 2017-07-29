/**
 * generated by Xtext 2.12.0
 */
package org.xtext.labs.mydsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>var Declared</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.labs.mydsl.varDeclared#getScope <em>Scope</em>}</li>
 *   <li>{@link org.xtext.labs.mydsl.varDeclared#getDim <em>Dim</em>}</li>
 * </ul>
 *
 * @see org.xtext.labs.mydsl.MydslPackage#getvarDeclared()
 * @model
 * @generated
 */
public interface varDeclared extends BodyStatement, varSymbol
{
  /**
   * Returns the value of the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' attribute.
   * @see #setScope(String)
   * @see org.xtext.labs.mydsl.MydslPackage#getvarDeclared_Scope()
   * @model
   * @generated
   */
  String getScope();

  /**
   * Sets the value of the '{@link org.xtext.labs.mydsl.varDeclared#getScope <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' attribute.
   * @see #getScope()
   * @generated
   */
  void setScope(String value);

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
   * @see org.xtext.labs.mydsl.MydslPackage#getvarDeclared_Dim()
   * @model containment="true"
   * @generated
   */
  EList<arrayDimension> getDim();

} // varDeclared