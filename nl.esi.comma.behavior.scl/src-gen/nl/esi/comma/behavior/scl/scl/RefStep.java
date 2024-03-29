/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.RefStep#getStep <em>Step</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.RefStep#getIdx <em>Idx</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.behavior.scl.scl.SclPackage#getRefStep()
 * @model
 * @generated
 */
public interface RefStep extends Ref
{
  /**
   * Returns the value of the '<em><b>Step</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' reference.
   * @see #setStep(Action)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getRefStep_Step()
   * @model
   * @generated
   */
  Action getStep();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.RefStep#getStep <em>Step</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' reference.
   * @see #getStep()
   * @generated
   */
  void setStep(Action value);

  /**
   * Returns the value of the '<em><b>Idx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Idx</em>' attribute.
   * @see #setIdx(int)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getRefStep_Idx()
   * @model
   * @generated
   */
  int getIdx();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.RefStep#getIdx <em>Idx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Idx</em>' attribute.
   * @see #getIdx()
   * @generated
   */
  void setIdx(int value);

} // RefStep
