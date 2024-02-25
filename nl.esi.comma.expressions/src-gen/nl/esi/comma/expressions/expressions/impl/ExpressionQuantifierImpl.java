/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.expressions.expressions.impl;

import nl.esi.comma.expressions.expressions.Expression;
import nl.esi.comma.expressions.expressions.ExpressionQuantifier;
import nl.esi.comma.expressions.expressions.ExpressionsPackage;
import nl.esi.comma.expressions.expressions.QUANTIFIER;
import nl.esi.comma.expressions.expressions.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Quantifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.expressions.expressions.impl.ExpressionQuantifierImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link nl.esi.comma.expressions.expressions.impl.ExpressionQuantifierImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link nl.esi.comma.expressions.expressions.impl.ExpressionQuantifierImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link nl.esi.comma.expressions.expressions.impl.ExpressionQuantifierImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionQuantifierImpl extends ExpressionImpl implements ExpressionQuantifier
{
  /**
   * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifier()
   * @generated
   * @ordered
   */
  protected static final QUANTIFIER QUANTIFIER_EDEFAULT = QUANTIFIER.EXISTS;

  /**
   * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifier()
   * @generated
   * @ordered
   */
  protected QUANTIFIER quantifier = QUANTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getIterator() <em>Iterator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIterator()
   * @generated
   * @ordered
   */
  protected Variable iterator;

  /**
   * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected Expression collection;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionQuantifierImpl()
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
    return ExpressionsPackage.Literals.EXPRESSION_QUANTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QUANTIFIER getQuantifier()
  {
    return quantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQuantifier(QUANTIFIER newQuantifier)
  {
    QUANTIFIER oldQuantifier = quantifier;
    quantifier = newQuantifier == null ? QUANTIFIER_EDEFAULT : newQuantifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.EXPRESSION_QUANTIFIER__QUANTIFIER, oldQuantifier, quantifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getIterator()
  {
    return iterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIterator(Variable newIterator, NotificationChain msgs)
  {
    Variable oldIterator = iterator;
    iterator = newIterator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.EXPRESSION_QUANTIFIER__ITERATOR, oldIterator, newIterator);
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
  public void setIterator(Variable newIterator)
  {
    if (newIterator != iterator)
    {
      NotificationChain msgs = null;
      if (iterator != null)
        msgs = ((InternalEObject)iterator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.EXPRESSION_QUANTIFIER__ITERATOR, null, msgs);
      if (newIterator != null)
        msgs = ((InternalEObject)newIterator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.EXPRESSION_QUANTIFIER__ITERATOR, null, msgs);
      msgs = basicSetIterator(newIterator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.EXPRESSION_QUANTIFIER__ITERATOR, newIterator, newIterator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getCollection()
  {
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollection(Expression newCollection, NotificationChain msgs)
  {
    Expression oldCollection = collection;
    collection = newCollection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.EXPRESSION_QUANTIFIER__COLLECTION, oldCollection, newCollection);
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
  public void setCollection(Expression newCollection)
  {
    if (newCollection != collection)
    {
      NotificationChain msgs = null;
      if (collection != null)
        msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.EXPRESSION_QUANTIFIER__COLLECTION, null, msgs);
      if (newCollection != null)
        msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.EXPRESSION_QUANTIFIER__COLLECTION, null, msgs);
      msgs = basicSetCollection(newCollection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.EXPRESSION_QUANTIFIER__COLLECTION, newCollection, newCollection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.EXPRESSION_QUANTIFIER__CONDITION, oldCondition, newCondition);
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
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.EXPRESSION_QUANTIFIER__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.EXPRESSION_QUANTIFIER__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.EXPRESSION_QUANTIFIER__CONDITION, newCondition, newCondition));
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
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__ITERATOR:
        return basicSetIterator(null, msgs);
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__COLLECTION:
        return basicSetCollection(null, msgs);
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__CONDITION:
        return basicSetCondition(null, msgs);
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
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__QUANTIFIER:
        return getQuantifier();
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__ITERATOR:
        return getIterator();
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__COLLECTION:
        return getCollection();
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__CONDITION:
        return getCondition();
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
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__QUANTIFIER:
        setQuantifier((QUANTIFIER)newValue);
        return;
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__ITERATOR:
        setIterator((Variable)newValue);
        return;
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__COLLECTION:
        setCollection((Expression)newValue);
        return;
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__CONDITION:
        setCondition((Expression)newValue);
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
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__QUANTIFIER:
        setQuantifier(QUANTIFIER_EDEFAULT);
        return;
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__ITERATOR:
        setIterator((Variable)null);
        return;
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__COLLECTION:
        setCollection((Expression)null);
        return;
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__CONDITION:
        setCondition((Expression)null);
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
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__QUANTIFIER:
        return quantifier != QUANTIFIER_EDEFAULT;
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__ITERATOR:
        return iterator != null;
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__COLLECTION:
        return collection != null;
      case ExpressionsPackage.EXPRESSION_QUANTIFIER__CONDITION:
        return condition != null;
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
    result.append(" (quantifier: ");
    result.append(quantifier);
    result.append(')');
    return result.toString();
  }

} //ExpressionQuantifierImpl