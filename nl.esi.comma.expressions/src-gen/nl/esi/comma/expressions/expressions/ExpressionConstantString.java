/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.expressions.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Constant String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.expressions.expressions.ExpressionConstantString#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.expressions.expressions.ExpressionsPackage#getExpressionConstantString()
 * @model
 * @generated
 */
public interface ExpressionConstantString extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see nl.esi.comma.expressions.expressions.ExpressionsPackage#getExpressionConstantString_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link nl.esi.comma.expressions.expressions.ExpressionConstantString#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ExpressionConstantString