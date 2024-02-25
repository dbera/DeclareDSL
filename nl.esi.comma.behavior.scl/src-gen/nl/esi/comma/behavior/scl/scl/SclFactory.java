/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.esi.comma.behavior.scl.scl.SclPackage
 * @generated
 */
public interface SclFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SclFactory eINSTANCE = nl.esi.comma.behavior.scl.scl.impl.SclFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Composition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition</em>'.
   * @generated
   */
  Composition createComposition();

  /**
   * Returns a new object of class '<em>Sequence Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Def</em>'.
   * @generated
   */
  SequenceDef createSequenceDef();

  /**
   * Returns a new object of class '<em>Param Act</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Act</em>'.
   * @generated
   */
  ParamAct createParamAct();

  /**
   * Returns a new object of class '<em>Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref</em>'.
   * @generated
   */
  Ref createRef();

  /**
   * Returns a new object of class '<em>Ref Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Step</em>'.
   * @generated
   */
  RefStep createRefStep();

  /**
   * Returns a new object of class '<em>Ref Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Sequence</em>'.
   * @generated
   */
  RefSequence createRefSequence();

  /**
   * Returns a new object of class '<em>Features</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Features</em>'.
   * @generated
   */
  Features createFeatures();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Actions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actions</em>'.
   * @generated
   */
  Actions createActions();

  /**
   * Returns a new object of class '<em>Action Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Param</em>'.
   * @generated
   */
  ActionParam createActionParam();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Templates</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Templates</em>'.
   * @generated
   */
  Templates createTemplates();

  /**
   * Returns a new object of class '<em>Past</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Past</em>'.
   * @generated
   */
  Past createPast();

  /**
   * Returns a new object of class '<em>Future</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Future</em>'.
   * @generated
   */
  Future createFuture();

  /**
   * Returns a new object of class '<em>Dependencies</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependencies</em>'.
   * @generated
   */
  Dependencies createDependencies();

  /**
   * Returns a new object of class '<em>Choice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choice</em>'.
   * @generated
   */
  Choice createChoice();

  /**
   * Returns a new object of class '<em>Existential</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Existential</em>'.
   * @generated
   */
  Existential createExistential();

  /**
   * Returns a new object of class '<em>Exclusive Choice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exclusive Choice</em>'.
   * @generated
   */
  ExclusiveChoice createExclusiveChoice();

  /**
   * Returns a new object of class '<em>Simple Choice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Choice</em>'.
   * @generated
   */
  SimpleChoice createSimpleChoice();

  /**
   * Returns a new object of class '<em>Not Chain Succession</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Chain Succession</em>'.
   * @generated
   */
  NotChainSuccession createNotChainSuccession();

  /**
   * Returns a new object of class '<em>Not Co Existance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Co Existance</em>'.
   * @generated
   */
  NotCoExistance createNotCoExistance();

  /**
   * Returns a new object of class '<em>Not Succession</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Succession</em>'.
   * @generated
   */
  NotSuccession createNotSuccession();

  /**
   * Returns a new object of class '<em>Chain Succession</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chain Succession</em>'.
   * @generated
   */
  ChainSuccession createChainSuccession();

  /**
   * Returns a new object of class '<em>Alternate Succession</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternate Succession</em>'.
   * @generated
   */
  AlternateSuccession createAlternateSuccession();

  /**
   * Returns a new object of class '<em>Succession</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Succession</em>'.
   * @generated
   */
  Succession createSuccession();

  /**
   * Returns a new object of class '<em>Co Existance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Co Existance</em>'.
   * @generated
   */
  CoExistance createCoExistance();

  /**
   * Returns a new object of class '<em>Responded Existence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Responded Existence</em>'.
   * @generated
   */
  RespondedExistence createRespondedExistence();

  /**
   * Returns a new object of class '<em>Chain Precedence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chain Precedence</em>'.
   * @generated
   */
  ChainPrecedence createChainPrecedence();

  /**
   * Returns a new object of class '<em>Chain Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chain Response</em>'.
   * @generated
   */
  ChainResponse createChainResponse();

  /**
   * Returns a new object of class '<em>Alternate Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternate Response</em>'.
   * @generated
   */
  AlternateResponse createAlternateResponse();

  /**
   * Returns a new object of class '<em>Alternate Precedence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternate Precedence</em>'.
   * @generated
   */
  AlternatePrecedence createAlternatePrecedence();

  /**
   * Returns a new object of class '<em>Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Response</em>'.
   * @generated
   */
  Response createResponse();

  /**
   * Returns a new object of class '<em>Precedence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Precedence</em>'.
   * @generated
   */
  Precedence createPrecedence();

  /**
   * Returns a new object of class '<em>End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End</em>'.
   * @generated
   */
  End createEnd();

  /**
   * Returns a new object of class '<em>Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init</em>'.
   * @generated
   */
  Init createInit();

  /**
   * Returns a new object of class '<em>At Most</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Most</em>'.
   * @generated
   */
  AtMost createAtMost();

  /**
   * Returns a new object of class '<em>Exact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exact</em>'.
   * @generated
   */
  Exact createExact();

  /**
   * Returns a new object of class '<em>At Least</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Least</em>'.
   * @generated
   */
  AtLeast createAtLeast();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SclPackage getSclPackage();

} //SclFactory