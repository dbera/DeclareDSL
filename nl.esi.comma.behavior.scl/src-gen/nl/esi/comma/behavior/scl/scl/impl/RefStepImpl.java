/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl.impl;

import nl.esi.comma.behavior.scl.scl.Action;
import nl.esi.comma.behavior.scl.scl.RefStep;
import nl.esi.comma.behavior.scl.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.impl.RefStepImpl#getStep <em>Step</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.impl.RefStepImpl#getIdx <em>Idx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefStepImpl extends RefImpl implements RefStep
{
  /**
   * The cached value of the '{@link #getStep() <em>Step</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStep()
   * @generated
   * @ordered
   */
  protected Action step;

  /**
   * The default value of the '{@link #getIdx() <em>Idx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdx()
   * @generated
   * @ordered
   */
  protected static final int IDX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIdx() <em>Idx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdx()
   * @generated
   * @ordered
   */
  protected int idx = IDX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefStepImpl()
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
    return SclPackage.Literals.REF_STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action getStep()
  {
    if (step != null && step.eIsProxy())
    {
      InternalEObject oldStep = (InternalEObject)step;
      step = (Action)eResolveProxy(oldStep);
      if (step != oldStep)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SclPackage.REF_STEP__STEP, oldStep, step));
      }
    }
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action basicGetStep()
  {
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStep(Action newStep)
  {
    Action oldStep = step;
    step = newStep;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REF_STEP__STEP, oldStep, step));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getIdx()
  {
    return idx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIdx(int newIdx)
  {
    int oldIdx = idx;
    idx = newIdx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REF_STEP__IDX, oldIdx, idx));
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
      case SclPackage.REF_STEP__STEP:
        if (resolve) return getStep();
        return basicGetStep();
      case SclPackage.REF_STEP__IDX:
        return getIdx();
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
      case SclPackage.REF_STEP__STEP:
        setStep((Action)newValue);
        return;
      case SclPackage.REF_STEP__IDX:
        setIdx((Integer)newValue);
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
      case SclPackage.REF_STEP__STEP:
        setStep((Action)null);
        return;
      case SclPackage.REF_STEP__IDX:
        setIdx(IDX_EDEFAULT);
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
      case SclPackage.REF_STEP__STEP:
        return step != null;
      case SclPackage.REF_STEP__IDX:
        return idx != IDX_EDEFAULT;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (idx: ");
    result.append(idx);
    result.append(')');
    return result.toString();
  }

} //RefStepImpl
