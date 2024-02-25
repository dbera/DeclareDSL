/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl.impl;

import java.util.Collection;

import nl.esi.comma.behavior.scl.scl.AlternateResponse;
import nl.esi.comma.behavior.scl.scl.Ref;
import nl.esi.comma.behavior.scl.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternate Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.impl.AlternateResponseImpl#isEitherA <em>Either A</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.impl.AlternateResponseImpl#getRefA <em>Ref A</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.impl.AlternateResponseImpl#isEitherB <em>Either B</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.impl.AlternateResponseImpl#getRefB <em>Ref B</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.impl.AlternateResponseImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.impl.AlternateResponseImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.impl.AlternateResponseImpl#isNot <em>Not</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.impl.AlternateResponseImpl#isEitherC <em>Either C</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.impl.AlternateResponseImpl#getRefC <em>Ref C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternateResponseImpl extends MinimalEObjectImpl.Container implements AlternateResponse
{
  /**
   * The default value of the '{@link #isEitherA() <em>Either A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEitherA()
   * @generated
   * @ordered
   */
  protected static final boolean EITHER_A_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEitherA() <em>Either A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEitherA()
   * @generated
   * @ordered
   */
  protected boolean eitherA = EITHER_A_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefA() <em>Ref A</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefA()
   * @generated
   * @ordered
   */
  protected EList<Ref> refA;

  /**
   * The default value of the '{@link #isEitherB() <em>Either B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEitherB()
   * @generated
   * @ordered
   */
  protected static final boolean EITHER_B_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEitherB() <em>Either B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEitherB()
   * @generated
   * @ordered
   */
  protected boolean eitherB = EITHER_B_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefB() <em>Ref B</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefB()
   * @generated
   * @ordered
   */
  protected EList<Ref> refB;

  /**
   * The default value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinVal()
   * @generated
   * @ordered
   */
  protected static final int MIN_VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinVal()
   * @generated
   * @ordered
   */
  protected int minVal = MIN_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxVal()
   * @generated
   * @ordered
   */
  protected static final int MAX_VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxVal()
   * @generated
   * @ordered
   */
  protected int maxVal = MAX_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected boolean not = NOT_EDEFAULT;

  /**
   * The default value of the '{@link #isEitherC() <em>Either C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEitherC()
   * @generated
   * @ordered
   */
  protected static final boolean EITHER_C_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEitherC() <em>Either C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEitherC()
   * @generated
   * @ordered
   */
  protected boolean eitherC = EITHER_C_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefC() <em>Ref C</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefC()
   * @generated
   * @ordered
   */
  protected EList<Ref> refC;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlternateResponseImpl()
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
    return SclPackage.Literals.ALTERNATE_RESPONSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isEitherA()
  {
    return eitherA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEitherA(boolean newEitherA)
  {
    boolean oldEitherA = eitherA;
    eitherA = newEitherA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ALTERNATE_RESPONSE__EITHER_A, oldEitherA, eitherA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Ref> getRefA()
  {
    if (refA == null)
    {
      refA = new EObjectContainmentEList<Ref>(Ref.class, this, SclPackage.ALTERNATE_RESPONSE__REF_A);
    }
    return refA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isEitherB()
  {
    return eitherB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEitherB(boolean newEitherB)
  {
    boolean oldEitherB = eitherB;
    eitherB = newEitherB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ALTERNATE_RESPONSE__EITHER_B, oldEitherB, eitherB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Ref> getRefB()
  {
    if (refB == null)
    {
      refB = new EObjectContainmentEList<Ref>(Ref.class, this, SclPackage.ALTERNATE_RESPONSE__REF_B);
    }
    return refB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMinVal()
  {
    return minVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMinVal(int newMinVal)
  {
    int oldMinVal = minVal;
    minVal = newMinVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ALTERNATE_RESPONSE__MIN_VAL, oldMinVal, minVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMaxVal()
  {
    return maxVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaxVal(int newMaxVal)
  {
    int oldMaxVal = maxVal;
    maxVal = newMaxVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ALTERNATE_RESPONSE__MAX_VAL, oldMaxVal, maxVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNot(boolean newNot)
  {
    boolean oldNot = not;
    not = newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ALTERNATE_RESPONSE__NOT, oldNot, not));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isEitherC()
  {
    return eitherC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEitherC(boolean newEitherC)
  {
    boolean oldEitherC = eitherC;
    eitherC = newEitherC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ALTERNATE_RESPONSE__EITHER_C, oldEitherC, eitherC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Ref> getRefC()
  {
    if (refC == null)
    {
      refC = new EObjectContainmentEList<Ref>(Ref.class, this, SclPackage.ALTERNATE_RESPONSE__REF_C);
    }
    return refC;
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
      case SclPackage.ALTERNATE_RESPONSE__REF_A:
        return ((InternalEList<?>)getRefA()).basicRemove(otherEnd, msgs);
      case SclPackage.ALTERNATE_RESPONSE__REF_B:
        return ((InternalEList<?>)getRefB()).basicRemove(otherEnd, msgs);
      case SclPackage.ALTERNATE_RESPONSE__REF_C:
        return ((InternalEList<?>)getRefC()).basicRemove(otherEnd, msgs);
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
      case SclPackage.ALTERNATE_RESPONSE__EITHER_A:
        return isEitherA();
      case SclPackage.ALTERNATE_RESPONSE__REF_A:
        return getRefA();
      case SclPackage.ALTERNATE_RESPONSE__EITHER_B:
        return isEitherB();
      case SclPackage.ALTERNATE_RESPONSE__REF_B:
        return getRefB();
      case SclPackage.ALTERNATE_RESPONSE__MIN_VAL:
        return getMinVal();
      case SclPackage.ALTERNATE_RESPONSE__MAX_VAL:
        return getMaxVal();
      case SclPackage.ALTERNATE_RESPONSE__NOT:
        return isNot();
      case SclPackage.ALTERNATE_RESPONSE__EITHER_C:
        return isEitherC();
      case SclPackage.ALTERNATE_RESPONSE__REF_C:
        return getRefC();
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
      case SclPackage.ALTERNATE_RESPONSE__EITHER_A:
        setEitherA((Boolean)newValue);
        return;
      case SclPackage.ALTERNATE_RESPONSE__REF_A:
        getRefA().clear();
        getRefA().addAll((Collection<? extends Ref>)newValue);
        return;
      case SclPackage.ALTERNATE_RESPONSE__EITHER_B:
        setEitherB((Boolean)newValue);
        return;
      case SclPackage.ALTERNATE_RESPONSE__REF_B:
        getRefB().clear();
        getRefB().addAll((Collection<? extends Ref>)newValue);
        return;
      case SclPackage.ALTERNATE_RESPONSE__MIN_VAL:
        setMinVal((Integer)newValue);
        return;
      case SclPackage.ALTERNATE_RESPONSE__MAX_VAL:
        setMaxVal((Integer)newValue);
        return;
      case SclPackage.ALTERNATE_RESPONSE__NOT:
        setNot((Boolean)newValue);
        return;
      case SclPackage.ALTERNATE_RESPONSE__EITHER_C:
        setEitherC((Boolean)newValue);
        return;
      case SclPackage.ALTERNATE_RESPONSE__REF_C:
        getRefC().clear();
        getRefC().addAll((Collection<? extends Ref>)newValue);
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
      case SclPackage.ALTERNATE_RESPONSE__EITHER_A:
        setEitherA(EITHER_A_EDEFAULT);
        return;
      case SclPackage.ALTERNATE_RESPONSE__REF_A:
        getRefA().clear();
        return;
      case SclPackage.ALTERNATE_RESPONSE__EITHER_B:
        setEitherB(EITHER_B_EDEFAULT);
        return;
      case SclPackage.ALTERNATE_RESPONSE__REF_B:
        getRefB().clear();
        return;
      case SclPackage.ALTERNATE_RESPONSE__MIN_VAL:
        setMinVal(MIN_VAL_EDEFAULT);
        return;
      case SclPackage.ALTERNATE_RESPONSE__MAX_VAL:
        setMaxVal(MAX_VAL_EDEFAULT);
        return;
      case SclPackage.ALTERNATE_RESPONSE__NOT:
        setNot(NOT_EDEFAULT);
        return;
      case SclPackage.ALTERNATE_RESPONSE__EITHER_C:
        setEitherC(EITHER_C_EDEFAULT);
        return;
      case SclPackage.ALTERNATE_RESPONSE__REF_C:
        getRefC().clear();
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
      case SclPackage.ALTERNATE_RESPONSE__EITHER_A:
        return eitherA != EITHER_A_EDEFAULT;
      case SclPackage.ALTERNATE_RESPONSE__REF_A:
        return refA != null && !refA.isEmpty();
      case SclPackage.ALTERNATE_RESPONSE__EITHER_B:
        return eitherB != EITHER_B_EDEFAULT;
      case SclPackage.ALTERNATE_RESPONSE__REF_B:
        return refB != null && !refB.isEmpty();
      case SclPackage.ALTERNATE_RESPONSE__MIN_VAL:
        return minVal != MIN_VAL_EDEFAULT;
      case SclPackage.ALTERNATE_RESPONSE__MAX_VAL:
        return maxVal != MAX_VAL_EDEFAULT;
      case SclPackage.ALTERNATE_RESPONSE__NOT:
        return not != NOT_EDEFAULT;
      case SclPackage.ALTERNATE_RESPONSE__EITHER_C:
        return eitherC != EITHER_C_EDEFAULT;
      case SclPackage.ALTERNATE_RESPONSE__REF_C:
        return refC != null && !refC.isEmpty();
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
    result.append(" (eitherA: ");
    result.append(eitherA);
    result.append(", eitherB: ");
    result.append(eitherB);
    result.append(", minVal: ");
    result.append(minVal);
    result.append(", maxVal: ");
    result.append(maxVal);
    result.append(", not: ");
    result.append(not);
    result.append(", eitherC: ");
    result.append(eitherC);
    result.append(')');
    return result.toString();
  }

} //AlternateResponseImpl
