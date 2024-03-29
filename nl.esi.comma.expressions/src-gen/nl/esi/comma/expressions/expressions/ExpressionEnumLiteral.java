/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.expressions.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.expressions.expressions.ExpressionEnumLiteral#getType <em>Type</em>}</li>
 *   <li>{@link nl.esi.comma.expressions.expressions.ExpressionEnumLiteral#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.expressions.expressions.ExpressionsPackage#getExpressionEnumLiteral()
 * @model
 * @generated
 */
public interface ExpressionEnumLiteral extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see nl.esi.comma.expressions.expressions.ExpressionsPackage#getExpressionEnumLiteral_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link nl.esi.comma.expressions.expressions.ExpressionEnumLiteral#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see #setLiteral(String)
   * @see nl.esi.comma.expressions.expressions.ExpressionsPackage#getExpressionEnumLiteral_Literal()
   * @model
   * @generated
   */
  String getLiteral();

  /**
   * Sets the value of the '{@link nl.esi.comma.expressions.expressions.ExpressionEnumLiteral#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(String value);

} // ExpressionEnumLiteral
