/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.expressions.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.expressions.expressions.TypeAnnotation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.expressions.expressions.ExpressionsPackage#getTypeAnnotation()
 * @model
 * @generated
 */
public interface TypeAnnotation extends Expression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see nl.esi.comma.expressions.expressions.ExpressionsPackage#getTypeAnnotation_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link nl.esi.comma.expressions.expressions.TypeAnnotation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // TypeAnnotation