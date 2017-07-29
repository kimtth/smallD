/**
 * generated by Xtext 2.12.0
 */
package org.xtext.labs.mydsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.labs.mydsl.BodyStatement;
import org.xtext.labs.mydsl.IfExpression;
import org.xtext.labs.mydsl.MydslPackage;
import org.xtext.labs.mydsl.varExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.labs.mydsl.impl.IfExpressionImpl#getIfconditon <em>Ifconditon</em>}</li>
 *   <li>{@link org.xtext.labs.mydsl.impl.IfExpressionImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.xtext.labs.mydsl.impl.IfExpressionImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfExpressionImpl extends BodyStatementImpl implements IfExpression
{
  /**
   * The cached value of the '{@link #getIfconditon() <em>Ifconditon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfconditon()
   * @generated
   * @ordered
   */
  protected varExpression ifconditon;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected EList<BodyStatement> then;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected EList<BodyStatement> else_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfExpressionImpl()
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
    return MydslPackage.Literals.IF_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public varExpression getIfconditon()
  {
    return ifconditon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfconditon(varExpression newIfconditon, NotificationChain msgs)
  {
    varExpression oldIfconditon = ifconditon;
    ifconditon = newIfconditon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MydslPackage.IF_EXPRESSION__IFCONDITON, oldIfconditon, newIfconditon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfconditon(varExpression newIfconditon)
  {
    if (newIfconditon != ifconditon)
    {
      NotificationChain msgs = null;
      if (ifconditon != null)
        msgs = ((InternalEObject)ifconditon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MydslPackage.IF_EXPRESSION__IFCONDITON, null, msgs);
      if (newIfconditon != null)
        msgs = ((InternalEObject)newIfconditon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MydslPackage.IF_EXPRESSION__IFCONDITON, null, msgs);
      msgs = basicSetIfconditon(newIfconditon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.IF_EXPRESSION__IFCONDITON, newIfconditon, newIfconditon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BodyStatement> getThen()
  {
    if (then == null)
    {
      then = new EObjectContainmentEList<BodyStatement>(BodyStatement.class, this, MydslPackage.IF_EXPRESSION__THEN);
    }
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BodyStatement> getElse()
  {
    if (else_ == null)
    {
      else_ = new EObjectContainmentEList<BodyStatement>(BodyStatement.class, this, MydslPackage.IF_EXPRESSION__ELSE);
    }
    return else_;
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
      case MydslPackage.IF_EXPRESSION__IFCONDITON:
        return basicSetIfconditon(null, msgs);
      case MydslPackage.IF_EXPRESSION__THEN:
        return ((InternalEList<?>)getThen()).basicRemove(otherEnd, msgs);
      case MydslPackage.IF_EXPRESSION__ELSE:
        return ((InternalEList<?>)getElse()).basicRemove(otherEnd, msgs);
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
      case MydslPackage.IF_EXPRESSION__IFCONDITON:
        return getIfconditon();
      case MydslPackage.IF_EXPRESSION__THEN:
        return getThen();
      case MydslPackage.IF_EXPRESSION__ELSE:
        return getElse();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MydslPackage.IF_EXPRESSION__IFCONDITON:
        setIfconditon((varExpression)newValue);
        return;
      case MydslPackage.IF_EXPRESSION__THEN:
        getThen().clear();
        getThen().addAll((Collection<? extends BodyStatement>)newValue);
        return;
      case MydslPackage.IF_EXPRESSION__ELSE:
        getElse().clear();
        getElse().addAll((Collection<? extends BodyStatement>)newValue);
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
      case MydslPackage.IF_EXPRESSION__IFCONDITON:
        setIfconditon((varExpression)null);
        return;
      case MydslPackage.IF_EXPRESSION__THEN:
        getThen().clear();
        return;
      case MydslPackage.IF_EXPRESSION__ELSE:
        getElse().clear();
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
      case MydslPackage.IF_EXPRESSION__IFCONDITON:
        return ifconditon != null;
      case MydslPackage.IF_EXPRESSION__THEN:
        return then != null && !then.isEmpty();
      case MydslPackage.IF_EXPRESSION__ELSE:
        return else_ != null && !else_.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IfExpressionImpl
