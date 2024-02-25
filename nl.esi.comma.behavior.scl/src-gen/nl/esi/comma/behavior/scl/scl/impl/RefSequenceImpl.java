/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl.impl;

import nl.esi.comma.behavior.scl.scl.RefSequence;
import nl.esi.comma.behavior.scl.scl.SclPackage;
import nl.esi.comma.behavior.scl.scl.SequenceDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.impl.RefSequenceImpl#getSeq <em>Seq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefSequenceImpl extends RefImpl implements RefSequence
{
  /**
   * The cached value of the '{@link #getSeq() <em>Seq</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeq()
   * @generated
   * @ordered
   */
  protected SequenceDef seq;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefSequenceImpl()
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
    return SclPackage.Literals.REF_SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SequenceDef getSeq()
  {
    if (seq != null && seq.eIsProxy())
    {
      InternalEObject oldSeq = (InternalEObject)seq;
      seq = (SequenceDef)eResolveProxy(oldSeq);
      if (seq != oldSeq)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SclPackage.REF_SEQUENCE__SEQ, oldSeq, seq));
      }
    }
    return seq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceDef basicGetSeq()
  {
    return seq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSeq(SequenceDef newSeq)
  {
    SequenceDef oldSeq = seq;
    seq = newSeq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REF_SEQUENCE__SEQ, oldSeq, seq));
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
      case SclPackage.REF_SEQUENCE__SEQ:
        if (resolve) return getSeq();
        return basicGetSeq();
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
      case SclPackage.REF_SEQUENCE__SEQ:
        setSeq((SequenceDef)newValue);
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
      case SclPackage.REF_SEQUENCE__SEQ:
        setSeq((SequenceDef)null);
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
      case SclPackage.REF_SEQUENCE__SEQ:
        return seq != null;
    }
    return super.eIsSet(featureID);
  }

} //RefSequenceImpl
