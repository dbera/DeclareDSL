/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.ParamAct#getAct <em>Act</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.ParamAct#getIdx <em>Idx</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.behavior.scl.scl.SclPackage#getParamAct()
 * @model
 * @generated
 */
public interface ParamAct extends EObject
{
  /**
   * Returns the value of the '<em><b>Act</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Act</em>' reference.
   * @see #setAct(Action)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getParamAct_Act()
   * @model
   * @generated
   */
  Action getAct();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.ParamAct#getAct <em>Act</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Act</em>' reference.
   * @see #getAct()
   * @generated
   */
  void setAct(Action value);

  /**
   * Returns the value of the '<em><b>Idx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Idx</em>' attribute.
   * @see #setIdx(int)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getParamAct_Idx()
   * @model
   * @generated
   */
  int getIdx();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.ParamAct#getIdx <em>Idx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Idx</em>' attribute.
   * @see #getIdx()
   * @generated
   */
  void setIdx(int value);

} // ParamAct
