/**
 * generated by Xtext 2.12.0
 */
package org.xtext.labs.mydsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.labs.mydsl.MydslPackage;
import org.xtext.labs.mydsl.varRef;
import org.xtext.labs.mydsl.varSymbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>var Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.labs.mydsl.impl.varRefImpl#getVarRef <em>Var Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class varRefImpl extends TerminalImpl implements varRef
{
  /**
   * The cached value of the '{@link #getVarRef() <em>Var Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarRef()
   * @generated
   * @ordered
   */
  protected varSymbol varRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected varRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MydslPackage.Literals.VAR_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public varSymbol getVarRef()
  {
    if (varRef != null && varRef.eIsProxy())
    {
      InternalEObject oldVarRef = (InternalEObject)varRef;
      varRef = (varSymbol)eResolveProxy(oldVarRef);
      if (varRef != oldVarRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MydslPackage.VAR_REF__VAR_REF, oldVarRef, varRef));
      }
    }
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public varSymbol basicGetVarRef()
  {
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarRef(varSymbol newVarRef)
  {
    varSymbol oldVarRef = varRef;
    varRef = newVarRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.VAR_REF__VAR_REF, oldVarRef, varRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MydslPackage.VAR_REF__VAR_REF:
        if (resolve) return getVarRef();
        return basicGetVarRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MydslPackage.VAR_REF__VAR_REF:
        setVarRef((varSymbol)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MydslPackage.VAR_REF__VAR_REF:
        setVarRef((varSymbol)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MydslPackage.VAR_REF__VAR_REF:
        return varRef != null;
    }
    return super.eIsSet(featureID);
  }

} //varRefImpl
