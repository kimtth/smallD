/**
 * generated by Xtext 2.12.0
 */
package org.xtext.labs.mydsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>main Declared</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.labs.mydsl.mainDeclared#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.labs.mydsl.MydslPackage#getmainDeclared()
 * @model
 * @generated
 */
public interface mainDeclared extends EObject
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.labs.mydsl.BodyStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.xtext.labs.mydsl.MydslPackage#getmainDeclared_Body()
   * @model containment="true"
   * @generated
   */
  EList<BodyStatement> getBody();

} // mainDeclared
