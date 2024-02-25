/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.expressions.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.esi.comma.expressions.expressions.ExpressionVariable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see nl.esi.comma.expressions.expressions.ExpressionsPackage#getExpressionVariable()
 * @model
 * @generated
 */
public interface ExpressionVariable extends Expression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.esi.comma.expressions.expressions.ExpressionsPackage#getExpressionVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.esi.comma.expressions.expressions.ExpressionVariable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ExpressionVariable