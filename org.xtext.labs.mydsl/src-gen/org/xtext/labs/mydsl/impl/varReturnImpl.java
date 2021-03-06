/**
 * generated by Xtext 2.12.0
 */
package org.xtext.labs.mydsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.labs.mydsl.MydslPackage;
import org.xtext.labs.mydsl.Terminal;
import org.xtext.labs.mydsl.varReturn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>var Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.labs.mydsl.impl.varReturnImpl#getRtn <em>Rtn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class varReturnImpl extends BodyStatementImpl implements varReturn
{
  /**
   * The cached value of the '{@link #getRtn() <em>Rtn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRtn()
   * @generated
   * @ordered
   */
  protected Terminal rtn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected varReturnImpl()
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
    return MydslPackage.Literals.VAR_RETURN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Terminal getRtn()
  {
    return rtn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRtn(Terminal newRtn, NotificationChain msgs)
  {
    Terminal oldRtn = rtn;
    rtn = newRtn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MydslPackage.VAR_RETURN__RTN, oldRtn, newRtn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRtn(Terminal newRtn)
  {
    if (newRtn != rtn)
    {
      NotificationChain msgs = null;
      if (rtn != null)
        msgs = ((InternalEObject)rtn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MydslPackage.VAR_RETURN__RTN, null, msgs);
      if (newRtn != null)
        msgs = ((InternalEObject)newRtn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MydslPackage.VAR_RETURN__RTN, null, msgs);
      msgs = basicSetRtn(newRtn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.VAR_RETURN__RTN, newRtn, newRtn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MydslPackage.VAR_RETURN__RTN:
        return basicSetRtn(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MydslPackage.VAR_RETURN__RTN:
        return getRtn();
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
      case MydslPackage.VAR_RETURN__RTN:
        setRtn((Terminal)newValue);
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
      case MydslPackage.VAR_RETURN__RTN:
        setRtn((Terminal)null);
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
      case MydslPackage.VAR_RETURN__RTN:
        return rtn != null;
    }
    return super.eIsSet(featureID);
  }

} //varReturnImpl
