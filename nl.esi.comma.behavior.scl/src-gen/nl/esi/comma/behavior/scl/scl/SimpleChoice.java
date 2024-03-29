/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.SimpleChoice#getRefA <em>Ref A</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.behavior.scl.scl.SclPackage#getSimpleChoice()
 * @model
 * @generated
 */
public interface SimpleChoice extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref A</b></em>' containment reference list.
   * The list contents are of type {@link nl.esi.comma.behavior.scl.scl.Ref}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref A</em>' containment reference list.
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getSimpleChoice_RefA()
   * @model containment="true"
   * @generated
   */
  EList<Ref> getRefA();

} // SimpleChoice
