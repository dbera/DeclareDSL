/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.expressions.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.expressions.expressions.ExpressionUnary#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.expressions.expressions.ExpressionsPackage#getExpressionUnary()
 * @model
 * @generated
 */
public interface ExpressionUnary extends Expression
{
  /**
   * Returns the value of the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' containment reference.
   * @see #setSub(Expression)
   * @see nl.esi.comma.expressions.expressions.ExpressionsPackage#getExpressionUnary_Sub()
   * @model containment="true"
   * @generated
   */
  Expression getSub();

  /**
   * Sets the value of the '{@link nl.esi.comma.expressions.expressions.ExpressionUnary#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(Expression value);

} // ExpressionUnary
