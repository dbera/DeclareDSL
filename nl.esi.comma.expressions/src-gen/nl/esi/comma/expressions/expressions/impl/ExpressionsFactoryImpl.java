/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.expressions.expressions.impl;

import nl.esi.comma.expressions.expressions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExpressionsFactory init()
  {
    try
    {
      ExpressionsFactory theExpressionsFactory = (ExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressionsPackage.eNS_URI);
      if (theExpressionsFactory != null)
      {
        return theExpressionsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExpressionsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ExpressionsPackage.VARIABLE: return createVariable();
      case ExpressionsPackage.EXPRESSION: return createExpression();
      case ExpressionsPackage.EXPRESSION_NOT: return createExpressionNot();
      case ExpressionsPackage.EXPRESSION_MINUS: return createExpressionMinus();
      case ExpressionsPackage.EXPRESSION_PLUS: return createExpressionPlus();
      case ExpressionsPackage.EXPRESSION_BRACKET: return createExpressionBracket();
      case ExpressionsPackage.EXPRESSION_CONSTANT_BOOL: return createExpressionConstantBool();
      case ExpressionsPackage.EXPRESSION_CONSTANT_INT: return createExpressionConstantInt();
      case ExpressionsPackage.EXPRESSION_CONSTANT_STRING: return createExpressionConstantString();
      case ExpressionsPackage.EXPRESSION_ENUM_LITERAL: return createExpressionEnumLiteral();
      case ExpressionsPackage.EXPRESSION_VARIABLE: return createExpressionVariable();
      case ExpressionsPackage.EXPRESSION_ANY: return createExpressionAny();
      case ExpressionsPackage.EXPRESSION_FUNCTION_CALL: return createExpressionFunctionCall();
      case ExpressionsPackage.EXPRESSION_QUANTIFIER: return createExpressionQuantifier();
      case ExpressionsPackage.TYPE_ANNOTATION: return createTypeAnnotation();
      case ExpressionsPackage.PAIR: return createPair();
      case ExpressionsPackage.EXPRESSION_BINARY: return createExpressionBinary();
      case ExpressionsPackage.EXPRESSION_UNARY: return createExpressionUnary();
      case ExpressionsPackage.EXPRESSION_AND: return createExpressionAnd();
      case ExpressionsPackage.EXPRESSION_OR: return createExpressionOr();
      case ExpressionsPackage.EXPRESSION_EQUAL: return createExpressionEqual();
      case ExpressionsPackage.EXPRESSION_NEQUAL: return createExpressionNEqual();
      case ExpressionsPackage.EXPRESSION_GEQ: return createExpressionGeq();
      case ExpressionsPackage.EXPRESSION_GREATER: return createExpressionGreater();
      case ExpressionsPackage.EXPRESSION_LEQ: return createExpressionLeq();
      case ExpressionsPackage.EXPRESSION_LESS: return createExpressionLess();
      case ExpressionsPackage.EXPRESSION_ADDITION: return createExpressionAddition();
      case ExpressionsPackage.EXPRESSION_SUBTRACTION: return createExpressionSubtraction();
      case ExpressionsPackage.EXPRESSION_MULTIPLY: return createExpressionMultiply();
      case ExpressionsPackage.EXPRESSION_DIVISION: return createExpressionDivision();
      case ExpressionsPackage.EXPRESSION_MAXIMUM: return createExpressionMaximum();
      case ExpressionsPackage.EXPRESSION_MINIMUM: return createExpressionMinimum();
      case ExpressionsPackage.EXPRESSION_MODULO: return createExpressionModulo();
      case ExpressionsPackage.EXPRESSION_POWER: return createExpressionPower();
      case ExpressionsPackage.EXPRESSION_VECTOR: return createExpressionVector();
      case ExpressionsPackage.EXPRESSION_MAP: return createExpressionMap();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ExpressionsPackage.QUANTIFIER:
        return createQUANTIFIERFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ExpressionsPackage.QUANTIFIER:
        return convertQUANTIFIERToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionNot createExpressionNot()
  {
    ExpressionNotImpl expressionNot = new ExpressionNotImpl();
    return expressionNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionMinus createExpressionMinus()
  {
    ExpressionMinusImpl expressionMinus = new ExpressionMinusImpl();
    return expressionMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionPlus createExpressionPlus()
  {
    ExpressionPlusImpl expressionPlus = new ExpressionPlusImpl();
    return expressionPlus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionBracket createExpressionBracket()
  {
    ExpressionBracketImpl expressionBracket = new ExpressionBracketImpl();
    return expressionBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionConstantBool createExpressionConstantBool()
  {
    ExpressionConstantBoolImpl expressionConstantBool = new ExpressionConstantBoolImpl();
    return expressionConstantBool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionConstantInt createExpressionConstantInt()
  {
    ExpressionConstantIntImpl expressionConstantInt = new ExpressionConstantIntImpl();
    return expressionConstantInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionConstantString createExpressionConstantString()
  {
    ExpressionConstantStringImpl expressionConstantString = new ExpressionConstantStringImpl();
    return expressionConstantString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionEnumLiteral createExpressionEnumLiteral()
  {
    ExpressionEnumLiteralImpl expressionEnumLiteral = new ExpressionEnumLiteralImpl();
    return expressionEnumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionVariable createExpressionVariable()
  {
    ExpressionVariableImpl expressionVariable = new ExpressionVariableImpl();
    return expressionVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionAny createExpressionAny()
  {
    ExpressionAnyImpl expressionAny = new ExpressionAnyImpl();
    return expressionAny;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionFunctionCall createExpressionFunctionCall()
  {
    ExpressionFunctionCallImpl expressionFunctionCall = new ExpressionFunctionCallImpl();
    return expressionFunctionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionQuantifier createExpressionQuantifier()
  {
    ExpressionQuantifierImpl expressionQuantifier = new ExpressionQuantifierImpl();
    return expressionQuantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeAnnotation createTypeAnnotation()
  {
    TypeAnnotationImpl typeAnnotation = new TypeAnnotationImpl();
    return typeAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pair createPair()
  {
    PairImpl pair = new PairImpl();
    return pair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionBinary createExpressionBinary()
  {
    ExpressionBinaryImpl expressionBinary = new ExpressionBinaryImpl();
    return expressionBinary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionUnary createExpressionUnary()
  {
    ExpressionUnaryImpl expressionUnary = new ExpressionUnaryImpl();
    return expressionUnary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionAnd createExpressionAnd()
  {
    ExpressionAndImpl expressionAnd = new ExpressionAndImpl();
    return expressionAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionOr createExpressionOr()
  {
    ExpressionOrImpl expressionOr = new ExpressionOrImpl();
    return expressionOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionEqual createExpressionEqual()
  {
    ExpressionEqualImpl expressionEqual = new ExpressionEqualImpl();
    return expressionEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionNEqual createExpressionNEqual()
  {
    ExpressionNEqualImpl expressionNEqual = new ExpressionNEqualImpl();
    return expressionNEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionGeq createExpressionGeq()
  {
    ExpressionGeqImpl expressionGeq = new ExpressionGeqImpl();
    return expressionGeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionGreater createExpressionGreater()
  {
    ExpressionGreaterImpl expressionGreater = new ExpressionGreaterImpl();
    return expressionGreater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionLeq createExpressionLeq()
  {
    ExpressionLeqImpl expressionLeq = new ExpressionLeqImpl();
    return expressionLeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionLess createExpressionLess()
  {
    ExpressionLessImpl expressionLess = new ExpressionLessImpl();
    return expressionLess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionAddition createExpressionAddition()
  {
    ExpressionAdditionImpl expressionAddition = new ExpressionAdditionImpl();
    return expressionAddition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionSubtraction createExpressionSubtraction()
  {
    ExpressionSubtractionImpl expressionSubtraction = new ExpressionSubtractionImpl();
    return expressionSubtraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionMultiply createExpressionMultiply()
  {
    ExpressionMultiplyImpl expressionMultiply = new ExpressionMultiplyImpl();
    return expressionMultiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionDivision createExpressionDivision()
  {
    ExpressionDivisionImpl expressionDivision = new ExpressionDivisionImpl();
    return expressionDivision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionMaximum createExpressionMaximum()
  {
    ExpressionMaximumImpl expressionMaximum = new ExpressionMaximumImpl();
    return expressionMaximum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionMinimum createExpressionMinimum()
  {
    ExpressionMinimumImpl expressionMinimum = new ExpressionMinimumImpl();
    return expressionMinimum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionModulo createExpressionModulo()
  {
    ExpressionModuloImpl expressionModulo = new ExpressionModuloImpl();
    return expressionModulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionPower createExpressionPower()
  {
    ExpressionPowerImpl expressionPower = new ExpressionPowerImpl();
    return expressionPower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionVector createExpressionVector()
  {
    ExpressionVectorImpl expressionVector = new ExpressionVectorImpl();
    return expressionVector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionMap createExpressionMap()
  {
    ExpressionMapImpl expressionMap = new ExpressionMapImpl();
    return expressionMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QUANTIFIER createQUANTIFIERFromString(EDataType eDataType, String initialValue)
  {
    QUANTIFIER result = QUANTIFIER.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQUANTIFIERToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionsPackage getExpressionsPackage()
  {
    return (ExpressionsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExpressionsPackage getPackage()
  {
    return ExpressionsPackage.eINSTANCE;
  }

} //ExpressionsFactoryImpl
