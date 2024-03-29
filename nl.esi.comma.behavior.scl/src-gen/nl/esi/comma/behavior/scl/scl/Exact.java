/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Exact#getRef <em>Ref</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Exact#getNum <em>Num</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Exact#isConsecutively <em>Consecutively</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Exact#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Exact#getMaxVal <em>Max Val</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.behavior.scl.scl.SclPackage#getExact()
 * @model
 * @generated
 */
public interface Exact extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference list.
   * The list contents are of type {@link nl.esi.comma.behavior.scl.scl.Ref}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference list.
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getExact_Ref()
   * @model containment="true"
   * @generated
   */
  EList<Ref> getRef();

  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(int)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getExact_Num()
   * @model
   * @generated
   */
  int getNum();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Exact#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(int value);

  /**
   * Returns the value of the '<em><b>Consecutively</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consecutively</em>' attribute.
   * @see #setConsecutively(boolean)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getExact_Consecutively()
   * @model
   * @generated
   */
  boolean isConsecutively();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Exact#isConsecutively <em>Consecutively</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Consecutively</em>' attribute.
   * @see #isConsecutively()
   * @generated
   */
  void setConsecutively(boolean value);

  /**
   * Returns the value of the '<em><b>Min Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Val</em>' attribute.
   * @see #setMinVal(int)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getExact_MinVal()
   * @model
   * @generated
   */
  int getMinVal();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Exact#getMinVal <em>Min Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Val</em>' attribute.
   * @see #getMinVal()
   * @generated
   */
  void setMinVal(int value);

  /**
   * Returns the value of the '<em><b>Max Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Val</em>' attribute.
   * @see #setMaxVal(int)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getExact_MaxVal()
   * @model
   * @generated
   */
  int getMaxVal();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Exact#getMaxVal <em>Max Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Val</em>' attribute.
   * @see #getMaxVal()
   * @generated
   */
  void setMaxVal(int value);

} // Exact
