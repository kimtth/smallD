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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.labs.mydsl.MydslPackage;
import org.xtext.labs.mydsl.Terminal;
import org.xtext.labs.mydsl.TerminalOrMethod;
import org.xtext.labs.mydsl.varAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>var Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.labs.mydsl.impl.varAssignmentImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.labs.mydsl.impl.varAssignmentImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.labs.mydsl.impl.varAssignmentImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class varAssignmentImpl extends varExpressionImpl implements varAssignment
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Terminal left;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected EList<String> op;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EList<TerminalOrMethod> right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected varAssignmentImpl()
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
    return MydslPackage.Literals.VAR_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Terminal getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Terminal newLeft, NotificationChain msgs)
  {
    Terminal oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MydslPackage.VAR_ASSIGNMENT__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Terminal newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MydslPackage.VAR_ASSIGNMENT__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MydslPackage.VAR_ASSIGNMENT__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MydslPackage.VAR_ASSIGNMENT__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOp()
  {
    if (op == null)
    {
      op = new EDataTypeEList<String>(String.class, this, MydslPackage.VAR_ASSIGNMENT__OP);
    }
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TerminalOrMethod> getRight()
  {
    if (right == null)
    {
      right = new EObjectContainmentEList<TerminalOrMethod>(TerminalOrMethod.class, this, MydslPackage.VAR_ASSIGNMENT__RIGHT);
    }
    return right;
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
      case MydslPackage.VAR_ASSIGNMENT__LEFT:
        return basicSetLeft(null, msgs);
      case MydslPackage.VAR_ASSIGNMENT__RIGHT:
        return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
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
      case MydslPackage.VAR_ASSIGNMENT__LEFT:
        return getLeft();
      case MydslPackage.VAR_ASSIGNMENT__OP:
        return getOp();
      case MydslPackage.VAR_ASSIGNMENT__RIGHT:
        return getRight();
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
      case MydslPackage.VAR_ASSIGNMENT__LEFT:
        setLeft((Terminal)newValue);
        return;
      case MydslPackage.VAR_ASSIGNMENT__OP:
        getOp().clear();
        getOp().addAll((Collection<? extends String>)newValue);
        return;
      case MydslPackage.VAR_ASSIGNMENT__RIGHT:
        getRight().clear();
        getRight().addAll((Collection<? extends TerminalOrMethod>)newValue);
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
      case MydslPackage.VAR_ASSIGNMENT__LEFT:
        setLeft((Terminal)null);
        return;
      case MydslPackage.VAR_ASSIGNMENT__OP:
        getOp().clear();
        return;
      case MydslPackage.VAR_ASSIGNMENT__RIGHT:
        getRight().clear();
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
      case MydslPackage.VAR_ASSIGNMENT__LEFT:
        return left != null;
      case MydslPackage.VAR_ASSIGNMENT__OP:
        return op != null && !op.isEmpty();
      case MydslPackage.VAR_ASSIGNMENT__RIGHT:
        return right != null && !right.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //varAssignmentImpl
