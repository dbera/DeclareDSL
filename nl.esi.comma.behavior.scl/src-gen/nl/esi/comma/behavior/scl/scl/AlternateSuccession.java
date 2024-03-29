/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternate Succession</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.AlternateSuccession#isEitherA <em>Either A</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.AlternateSuccession#getRefA <em>Ref A</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.AlternateSuccession#isEitherB <em>Either B</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.AlternateSuccession#getRefB <em>Ref B</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.AlternateSuccession#isEitherC <em>Either C</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.AlternateSuccession#isNegation <em>Negation</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.AlternateSuccession#getRefC <em>Ref C</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAlternateSuccession()
 * @model
 * @generated
 */
public interface AlternateSuccession extends EObject
{
  /**
   * Returns the value of the '<em><b>Either A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Either A</em>' attribute.
   * @see #setEitherA(boolean)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAlternateSuccession_EitherA()
   * @model
   * @generated
   */
  boolean isEitherA();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.AlternateSuccession#isEitherA <em>Either A</em>}' attribute.
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
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAlternateSuccession_RefA()
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
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAlternateSuccession_EitherB()
   * @model
   * @generated
   */
  boolean isEitherB();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.AlternateSuccession#isEitherB <em>Either B</em>}' attribute.
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
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAlternateSuccession_RefB()
   * @model containment="true"
   * @generated
   */
  EList<Ref> getRefB();

  /**
   * Returns the value of the '<em><b>Either C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Either C</em>' attribute.
   * @see #setEitherC(boolean)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAlternateSuccession_EitherC()
   * @model
   * @generated
   */
  boolean isEitherC();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.AlternateSuccession#isEitherC <em>Either C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Either C</em>' attribute.
   * @see #isEitherC()
   * @generated
   */
  void setEitherC(boolean value);

  /**
   * Returns the value of the '<em><b>Negation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negation</em>' attribute.
   * @see #setNegation(boolean)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAlternateSuccession_Negation()
   * @model
   * @generated
   */
  boolean isNegation();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.AlternateSuccession#isNegation <em>Negation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negation</em>' attribute.
   * @see #isNegation()
   * @generated
   */
  void setNegation(boolean value);

  /**
   * Returns the value of the '<em><b>Ref C</b></em>' containment reference list.
   * The list contents are of type {@link nl.esi.comma.behavior.scl.scl.Ref}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref C</em>' containment reference list.
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getAlternateSuccession_RefC()
   * @model containment="true"
   * @generated
   */
  EList<Ref> getRefC();

} // AlternateSuccession
