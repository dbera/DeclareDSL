/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Composition#getName <em>Name</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Composition#getTemplates <em>Templates</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Composition#getDescTxt <em>Desc Txt</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Composition#getCommonFeatures <em>Common Features</em>}</li>
 *   <li>{@link nl.esi.comma.behavior.scl.scl.Composition#getTagStr <em>Tag Str</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.behavior.scl.scl.SclPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getComposition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Composition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Templates</b></em>' reference list.
   * The list contents are of type {@link nl.esi.comma.behavior.scl.scl.Templates}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Templates</em>' reference list.
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getComposition_Templates()
   * @model
   * @generated
   */
  EList<Templates> getTemplates();

  /**
   * Returns the value of the '<em><b>Desc Txt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc Txt</em>' attribute.
   * @see #setDescTxt(String)
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getComposition_DescTxt()
   * @model
   * @generated
   */
  String getDescTxt();

  /**
   * Sets the value of the '{@link nl.esi.comma.behavior.scl.scl.Composition#getDescTxt <em>Desc Txt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc Txt</em>' attribute.
   * @see #getDescTxt()
   * @generated
   */
  void setDescTxt(String value);

  /**
   * Returns the value of the '<em><b>Common Features</b></em>' reference list.
   * The list contents are of type {@link nl.esi.comma.behavior.scl.scl.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Common Features</em>' reference list.
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getComposition_CommonFeatures()
   * @model
   * @generated
   */
  EList<Feature> getCommonFeatures();

  /**
   * Returns the value of the '<em><b>Tag Str</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag Str</em>' attribute list.
   * @see nl.esi.comma.behavior.scl.scl.SclPackage#getComposition_TagStr()
   * @model unique="false"
   * @generated
   */
  EList<String> getTagStr();

} // Composition
