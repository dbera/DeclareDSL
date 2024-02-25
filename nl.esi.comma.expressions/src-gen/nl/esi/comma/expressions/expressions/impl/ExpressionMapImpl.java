/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.expressions.expressions.impl;

import java.util.Collection;

import nl.esi.comma.expressions.expressions.ExpressionMap;
import nl.esi.comma.expressions.expressions.ExpressionsPackage;
import nl.esi.comma.expressions.expressions.Pair;
import nl.esi.comma.expressions.expressions.TypeAnnotation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.expressions.expressions.impl.ExpressionMapImpl#getTypeAnnotation <em>Type Annotation</em>}</li>
 *   <li>{@link nl.esi.comma.expressions.expressions.impl.ExpressionMapImpl#getPairs <em>Pairs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionMapImpl extends ExpressionImpl implements ExpressionMap
{
  /**
   * The cached value of the '{@link #getTypeAnnotation() <em>Type Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeAnnotation()
   * @generated
   * @ordered
   */
  protected TypeAnnotation typeAnnotation;

  /**
   * The cached value of the '{@link #getPairs() <em>Pairs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPairs()
   * @generated
   * @ordered
   */
  protected EList<Pair> pairs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionMapImpl()
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
    return ExpressionsPackage.Literals.EXPRESSION_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeAnnotation getTypeAnnotation()
  {
    return typeAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeAnnotation(TypeAnnotation newTypeAnnotation, NotificationChain msgs)
  {
    TypeAnnotation oldTypeAnnotation = typeAnnotation;
    typeAnnotation = newTypeAnnotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.EXPRESSION_MAP__TYPE_ANNOTATION, oldTypeAnnotation, newTypeAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTypeAnnotation(TypeAnnotation newTypeAnnotation)
  {
    if (newTypeAnnotation != typeAnnotation)
    {
      NotificationChain msgs = null;
      if (typeAnnotation != null)
        msgs = ((InternalEObject)typeAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.EXPRESSION_MAP__TYPE_ANNOTATION, null, msgs);
      if (newTypeAnnotation != null)
        msgs = ((InternalEObject)newTypeAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.EXPRESSION_MAP__TYPE_ANNOTATION, null, msgs);
      msgs = basicSetTypeAnnotation(newTypeAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.EXPRESSION_MAP__TYPE_ANNOTATION, newTypeAnnotation, newTypeAnnotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Pair> getPairs()
  {
    if (pairs == null)
    {
      pairs = new EObjectContainmentEList<Pair>(Pair.class, this, ExpressionsPackage.EXPRESSION_MAP__PAIRS);
    }
    return pairs;
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
      case ExpressionsPackage.EXPRESSION_MAP__TYPE_ANNOTATION:
        return basicSetTypeAnnotation(null, msgs);
      case ExpressionsPackage.EXPRESSION_MAP__PAIRS:
        return ((InternalEList<?>)getPairs()).basicRemove(otherEnd, msgs);
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
      case ExpressionsPackage.EXPRESSION_MAP__TYPE_ANNOTATION:
        return getTypeAnnotation();
      case ExpressionsPackage.EXPRESSION_MAP__PAIRS:
        return getPairs();
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
      case ExpressionsPackage.EXPRESSION_MAP__TYPE_ANNOTATION:
        setTypeAnnotation((TypeAnnotation)newValue);
        return;
      case ExpressionsPackage.EXPRESSION_MAP__PAIRS:
        getPairs().clear();
        getPairs().addAll((Collection<? extends Pair>)newValue);
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
      case ExpressionsPackage.EXPRESSION_MAP__TYPE_ANNOTATION:
        setTypeAnnotation((TypeAnnotation)null);
        return;
      case ExpressionsPackage.EXPRESSION_MAP__PAIRS:
        getPairs().clear();
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
      case ExpressionsPackage.EXPRESSION_MAP__TYPE_ANNOTATION:
        return typeAnnotation != null;
      case ExpressionsPackage.EXPRESSION_MAP__PAIRS:
        return pairs != null && !pairs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExpressionMapImpl