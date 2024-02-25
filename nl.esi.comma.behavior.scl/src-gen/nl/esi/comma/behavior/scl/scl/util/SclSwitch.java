/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl.util;

import nl.esi.comma.behavior.scl.scl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nl.esi.comma.behavior.scl.scl.SclPackage
 * @generated
 */
public class SclSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SclPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SclSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SclPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SclPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.COMPOSITION:
      {
        Composition composition = (Composition)theEObject;
        T result = caseComposition(composition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.SEQUENCE_DEF:
      {
        SequenceDef sequenceDef = (SequenceDef)theEObject;
        T result = caseSequenceDef(sequenceDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.PARAM_ACT:
      {
        ParamAct paramAct = (ParamAct)theEObject;
        T result = caseParamAct(paramAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.REF:
      {
        Ref ref = (Ref)theEObject;
        T result = caseRef(ref);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.REF_STEP:
      {
        RefStep refStep = (RefStep)theEObject;
        T result = caseRefStep(refStep);
        if (result == null) result = caseRef(refStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.REF_SEQUENCE:
      {
        RefSequence refSequence = (RefSequence)theEObject;
        T result = caseRefSequence(refSequence);
        if (result == null) result = caseRef(refSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.FEATURES:
      {
        Features features = (Features)theEObject;
        T result = caseFeatures(features);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.ACTIONS:
      {
        Actions actions = (Actions)theEObject;
        T result = caseActions(actions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.ACTION_PARAM:
      {
        ActionParam actionParam = (ActionParam)theEObject;
        T result = caseActionParam(actionParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.TEMPLATES:
      {
        Templates templates = (Templates)theEObject;
        T result = caseTemplates(templates);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.PAST:
      {
        Past past = (Past)theEObject;
        T result = casePast(past);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.FUTURE:
      {
        Future future = (Future)theEObject;
        T result = caseFuture(future);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.DEPENDENCIES:
      {
        Dependencies dependencies = (Dependencies)theEObject;
        T result = caseDependencies(dependencies);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.CHOICE:
      {
        Choice choice = (Choice)theEObject;
        T result = caseChoice(choice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.EXISTENTIAL:
      {
        Existential existential = (Existential)theEObject;
        T result = caseExistential(existential);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.EXCLUSIVE_CHOICE:
      {
        ExclusiveChoice exclusiveChoice = (ExclusiveChoice)theEObject;
        T result = caseExclusiveChoice(exclusiveChoice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.SIMPLE_CHOICE:
      {
        SimpleChoice simpleChoice = (SimpleChoice)theEObject;
        T result = caseSimpleChoice(simpleChoice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.NOT_CHAIN_SUCCESSION:
      {
        NotChainSuccession notChainSuccession = (NotChainSuccession)theEObject;
        T result = caseNotChainSuccession(notChainSuccession);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.NOT_CO_EXISTANCE:
      {
        NotCoExistance notCoExistance = (NotCoExistance)theEObject;
        T result = caseNotCoExistance(notCoExistance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.NOT_SUCCESSION:
      {
        NotSuccession notSuccession = (NotSuccession)theEObject;
        T result = caseNotSuccession(notSuccession);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.CHAIN_SUCCESSION:
      {
        ChainSuccession chainSuccession = (ChainSuccession)theEObject;
        T result = caseChainSuccession(chainSuccession);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.ALTERNATE_SUCCESSION:
      {
        AlternateSuccession alternateSuccession = (AlternateSuccession)theEObject;
        T result = caseAlternateSuccession(alternateSuccession);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.SUCCESSION:
      {
        Succession succession = (Succession)theEObject;
        T result = caseSuccession(succession);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.CO_EXISTANCE:
      {
        CoExistance coExistance = (CoExistance)theEObject;
        T result = caseCoExistance(coExistance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.RESPONDED_EXISTENCE:
      {
        RespondedExistence respondedExistence = (RespondedExistence)theEObject;
        T result = caseRespondedExistence(respondedExistence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.CHAIN_PRECEDENCE:
      {
        ChainPrecedence chainPrecedence = (ChainPrecedence)theEObject;
        T result = caseChainPrecedence(chainPrecedence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.CHAIN_RESPONSE:
      {
        ChainResponse chainResponse = (ChainResponse)theEObject;
        T result = caseChainResponse(chainResponse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.ALTERNATE_RESPONSE:
      {
        AlternateResponse alternateResponse = (AlternateResponse)theEObject;
        T result = caseAlternateResponse(alternateResponse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.ALTERNATE_PRECEDENCE:
      {
        AlternatePrecedence alternatePrecedence = (AlternatePrecedence)theEObject;
        T result = caseAlternatePrecedence(alternatePrecedence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.RESPONSE:
      {
        Response response = (Response)theEObject;
        T result = caseResponse(response);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.PRECEDENCE:
      {
        Precedence precedence = (Precedence)theEObject;
        T result = casePrecedence(precedence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.END:
      {
        End end = (End)theEObject;
        T result = caseEnd(end);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.INIT:
      {
        Init init = (Init)theEObject;
        T result = caseInit(init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.AT_MOST:
      {
        AtMost atMost = (AtMost)theEObject;
        T result = caseAtMost(atMost);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.EXACT:
      {
        Exact exact = (Exact)theEObject;
        T result = caseExact(exact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SclPackage.AT_LEAST:
      {
        AtLeast atLeast = (AtLeast)theEObject;
        T result = caseAtLeast(atLeast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComposition(Composition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceDef(SequenceDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Act</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamAct(ParamAct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRef(Ref object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefStep(RefStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefSequence(RefSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Features</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Features</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatures(Features object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActions(Actions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionParam(ActionParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Templates</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Templates</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplates(Templates object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Past</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Past</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePast(Past object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Future</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Future</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuture(Future object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependencies</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependencies</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependencies(Dependencies object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoice(Choice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Existential</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Existential</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistential(Existential object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exclusive Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exclusive Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExclusiveChoice(ExclusiveChoice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleChoice(SimpleChoice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Chain Succession</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Chain Succession</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotChainSuccession(NotChainSuccession object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Co Existance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Co Existance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotCoExistance(NotCoExistance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Succession</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Succession</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotSuccession(NotSuccession object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chain Succession</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chain Succession</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChainSuccession(ChainSuccession object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternate Succession</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternate Succession</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternateSuccession(AlternateSuccession object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Succession</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Succession</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuccession(Succession object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Co Existance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Co Existance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoExistance(CoExistance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Responded Existence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Responded Existence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRespondedExistence(RespondedExistence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chain Precedence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chain Precedence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChainPrecedence(ChainPrecedence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chain Response</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chain Response</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChainResponse(ChainResponse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternate Response</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternate Response</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternateResponse(AlternateResponse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternate Precedence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternate Precedence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternatePrecedence(AlternatePrecedence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Response</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResponse(Response object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precedence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precedence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrecedence(Precedence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnd(End object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInit(Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Most</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Most</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtMost(AtMost object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExact(Exact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Least</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Least</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtLeast(AtLeast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SclSwitch
