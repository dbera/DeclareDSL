/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Action#getAct <em>Act</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Action#getName <em>Name</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Action#getLabel <em>Label</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Action#getActParam <em>Act Param</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Act</b></em>' attribute.
   * The literals are from the enumeration {@link nl.esi.comma.behavior.scl.scl.ActionType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Act</em>' attribute.
   * @see nl.esi.comma.behavior.scl.scl.ActionType
   * @see #setAct(ActionType)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAction_Act()
   * @model
   * @generated
   */
  ActionType getAct();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Action#getAct <em>Act</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Act</em>' attribute.
   * @see nl.esi.comma.behavior.scl.scl.ActionType
   * @see #getAct()
   * @generated
   */
  void setAct(ActionType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAction_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Action#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Act Param</b></em>' containment reference list.
   * The list contents are of type {@link nl.esi.comma.behavior.scl.scl.ActionParam}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Act Param</em>' containment reference list.
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAction_ActParam()
   * @model containment="true"
   * @generated
   */
  EList<ActionParam> getActParam();

} // Action
