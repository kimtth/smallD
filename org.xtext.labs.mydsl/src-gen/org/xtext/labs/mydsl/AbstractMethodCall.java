/**
 * generated by Xtext 2.12.0
 */
package org.xtext.labs.mydsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.labs.mydsl.AbstractMethodCall#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.xtext.labs.mydsl.MydslPackage#getAbstractMethodCall()
 * @model
 * @generated
 */
public interface AbstractMethodCall extends BodyStatement, TerminalOrMethod
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.labs.mydsl.Terminal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.xtext.labs.mydsl.MydslPackage#getAbstractMethodCall_Args()
   * @model containment="true"
   * @generated
   */
  EList<Terminal> getArgs();

} // AbstractMethodCall
