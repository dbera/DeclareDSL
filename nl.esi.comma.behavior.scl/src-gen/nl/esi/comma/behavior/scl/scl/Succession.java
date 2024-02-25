/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Succession</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Succession#isEitherA <em>Either A</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Succession#getRefA <em>Ref A</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Succession#isEitherB <em>Either B</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Succession#getRefB <em>Ref B</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Succession#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Succession#getMaxVal <em>Max Val</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.behavior.scl.scl.SclPackage#getSuccession()
 * @model
 * @generated
 */
public interface Succession extends EObject
{
  /**
   * Returns the value of the '<em><b>Either A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Either A</em>' attribute.
   * @see #setEitherA(boolean)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getSuccession_EitherA()
   * @model
   * @generated
   */
  boolean isEitherA();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Succession#isEitherA <em>Either A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Either A</em>' attribute.
   * @see #isEitherA()
   * @generated
   */
  void setEitherA(boolean value);

  /**
   * Returns the value of the '<em><b>Ref A</b></em>' containment reference list.
   * The list contents are of type {@link nl.esi.comma.behavior.scl.scl.Ref}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref A</em>' containment reference list.
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getSuccession_RefA()
   * @model containment="true"
   * @generated
   */
  EList<Ref> getRefA();

  /**
   * Returns the value of the '<em><b>Either B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Either B</em>' attribute.
   * @see #setEitherB(boolean)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getSuccession_EitherB()
   * @model
   * @generated
   */
  boolean isEitherB();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Succession#isEitherB <em>Either B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Either B</em>' attribute.
   * @see #isEitherB()
   * @generated
   */
  void setEitherB(boolean value);

  /**
   * Returns the value of the '<em><b>Ref B</b></em>' containment reference list.
   * The list contents are of type {@link nl.esi.comma.behavior.scl.scl.Ref}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref B</em>' containment reference list.
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getSuccession_RefB()
   * @model containment="true"
   * @generated
   */
  EList<Ref> getRefB();

  /**
   * Returns the value of the '<em><b>Min Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Val</em>' attribute.
   * @see #setMinVal(int)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getSuccession_MinVal()
   * @model
   * @generated
   */
  int getMinVal();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Succession#getMinVal <em>Min Val</em>}' attribute.
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
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getSuccession_MaxVal()
   * @model
   * @generated
   */
  int getMaxVal();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Succession#getMaxVal <em>Max Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Val</em>' attribute.
   * @see #getMaxVal()
   * @generated
   */
  void setMaxVal(int value);

} // Succession
