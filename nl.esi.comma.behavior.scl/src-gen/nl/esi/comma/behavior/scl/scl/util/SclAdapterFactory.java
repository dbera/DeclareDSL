/**
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.scl.util;

import nl.esi.comma.behavior.scl.scl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.esi.comma.behavior.scl.scl.SclPackage
 * @generated
 */
public class SclAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SclPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SclAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SclPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SclSwitch<Adapter> modelSwitch =
    new SclSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseComposition(Composition object)
      {
        return createCompositionAdapter();
      }
      @Override
      public Adapter caseSequenceDef(SequenceDef object)
      {
        return createSequenceDefAdapter();
      }
      @Override
      public Adapter caseParamAct(ParamAct object)
      {
        return createParamActAdapter();
      }
      @Override
      public Adapter caseRef(Ref object)
      {
        return createRefAdapter();
      }
      @Override
      public Adapter caseRefStep(RefStep object)
      {
        return createRefStepAdapter();
      }
      @Override
      public Adapter caseRefSequence(RefSequence object)
      {
        return createRefSequenceAdapter();
      }
      @Override
      public Adapter caseFeatures(Features object)
      {
        return createFeaturesAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseActions(Actions object)
      {
        return createActionsAdapter();
      }
      @Override
      public Adapter caseActionParam(ActionParam object)
      {
        return createActionParamAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseTemplates(Templates object)
      {
        return createTemplatesAdapter();
      }
      @Override
      public Adapter casePast(Past object)
      {
        return createPastAdapter();
      }
      @Override
      public Adapter caseFuture(Future object)
      {
        return createFutureAdapter();
      }
      @Override
      public Adapter caseDependencies(Dependencies object)
      {
        return createDependenciesAdapter();
      }
      @Override
      public Adapter caseChoice(Choice object)
      {
        return createChoiceAdapter();
      }
      @Override
      public Adapter caseExistential(Existential object)
      {
        return createExistentialAdapter();
      }
      @Override
      public Adapter caseExclusiveChoice(ExclusiveChoice object)
      {
        return createExclusiveChoiceAdapter();
      }
      @Override
      public Adapter caseSimpleChoice(SimpleChoice object)
      {
        return createSimpleChoiceAdapter();
      }
      @Override
      public Adapter caseNotChainSuccession(NotChainSuccession object)
      {
        return createNotChainSuccessionAdapter();
      }
      @Override
      public Adapter caseNotCoExistance(NotCoExistance object)
      {
        return createNotCoExistanceAdapter();
      }
      @Override
      public Adapter caseNotSuccession(NotSuccession object)
      {
        return createNotSuccessionAdapter();
      }
      @Override
      public Adapter caseChainSuccession(ChainSuccession object)
      {
        return createChainSuccessionAdapter();
      }
      @Override
      public Adapter caseAlternateSuccession(AlternateSuccession object)
      {
        return createAlternateSuccessionAdapter();
      }
      @Override
      public Adapter caseSuccession(Succession object)
      {
        return createSuccessionAdapter();
      }
      @Override
      public Adapter caseCoExistance(CoExistance object)
      {
        return createCoExistanceAdapter();
      }
      @Override
      public Adapter caseRespondedExistence(RespondedExistence object)
      {
        return createRespondedExistenceAdapter();
      }
      @Override
      public Adapter caseChainPrecedence(ChainPrecedence object)
      {
        return createChainPrecedenceAdapter();
      }
      @Override
      public Adapter caseChainResponse(ChainResponse object)
      {
        return createChainResponseAdapter();
      }
      @Override
      public Adapter caseAlternateResponse(AlternateResponse object)
      {
        return createAlternateResponseAdapter();
      }
      @Override
      public Adapter caseAlternatePrecedence(AlternatePrecedence object)
      {
        return createAlternatePrecedenceAdapter();
      }
      @Override
      public Adapter caseResponse(Response object)
      {
        return createResponseAdapter();
      }
      @Override
      public Adapter casePrecedence(Precedence object)
      {
        return createPrecedenceAdapter();
      }
      @Override
      public Adapter caseEnd(End object)
      {
        return createEndAdapter();
      }
      @Override
      public Adapter caseInit(Init object)
      {
        return createInitAdapter();
      }
      @Override
      public Adapter caseAtMost(AtMost object)
      {
        return createAtMostAdapter();
      }
      @Override
      public Adapter caseExact(Exact object)
      {
        return createExactAdapter();
      }
      @Override
      public Adapter caseAtLeast(AtLeast object)
      {
        return createAtLeastAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Composition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Composition
   * @generated
   */
  public Adapter createCompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.SequenceDef <em>Sequence Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.SequenceDef
   * @generated
   */
  public Adapter createSequenceDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.ParamAct <em>Param Act</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.ParamAct
   * @generated
   */
  public Adapter createParamActAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Ref <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Ref
   * @generated
   */
  public Adapter createRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.RefStep <em>Ref Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.RefStep
   * @generated
   */
  public Adapter createRefStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.RefSequence <em>Ref Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.RefSequence
   * @generated
   */
  public Adapter createRefSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Features <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Features
   * @generated
   */
  public Adapter createFeaturesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Actions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Actions
   * @generated
   */
  public Adapter createActionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.ActionParam <em>Action Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.ActionParam
   * @generated
   */
  public Adapter createActionParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Templates <em>Templates</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Templates
   * @generated
   */
  public Adapter createTemplatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Past <em>Past</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Past
   * @generated
   */
  public Adapter createPastAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Future <em>Future</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Future
   * @generated
   */
  public Adapter createFutureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Dependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Dependencies
   * @generated
   */
  public Adapter createDependenciesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Choice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Choice
   * @generated
   */
  public Adapter createChoiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Existential <em>Existential</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Existential
   * @generated
   */
  public Adapter createExistentialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.ExclusiveChoice <em>Exclusive Choice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.ExclusiveChoice
   * @generated
   */
  public Adapter createExclusiveChoiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.SimpleChoice <em>Simple Choice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.SimpleChoice
   * @generated
   */
  public Adapter createSimpleChoiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.NotChainSuccession <em>Not Chain Succession</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.NotChainSuccession
   * @generated
   */
  public Adapter createNotChainSuccessionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.NotCoExistance <em>Not Co Existance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.NotCoExistance
   * @generated
   */
  public Adapter createNotCoExistanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.NotSuccession <em>Not Succession</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.NotSuccession
   * @generated
   */
  public Adapter createNotSuccessionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.ChainSuccession <em>Chain Succession</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.ChainSuccession
   * @generated
   */
  public Adapter createChainSuccessionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.AlternateSuccession <em>Alternate Succession</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.AlternateSuccession
   * @generated
   */
  public Adapter createAlternateSuccessionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Succession <em>Succession</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Succession
   * @generated
   */
  public Adapter createSuccessionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.CoExistance <em>Co Existance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.CoExistance
   * @generated
   */
  public Adapter createCoExistanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.RespondedExistence <em>Responded Existence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.RespondedExistence
   * @generated
   */
  public Adapter createRespondedExistenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.ChainPrecedence <em>Chain Precedence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.ChainPrecedence
   * @generated
   */
  public Adapter createChainPrecedenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.ChainResponse <em>Chain Response</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.ChainResponse
   * @generated
   */
  public Adapter createChainResponseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.AlternateResponse <em>Alternate Response</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.AlternateResponse
   * @generated
   */
  public Adapter createAlternateResponseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.AlternatePrecedence <em>Alternate Precedence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.AlternatePrecedence
   * @generated
   */
  public Adapter createAlternatePrecedenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Response <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Response
   * @generated
   */
  public Adapter createResponseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Precedence <em>Precedence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Precedence
   * @generated
   */
  public Adapter createPrecedenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.End <em>End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.End
   * @generated
   */
  public Adapter createEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Init <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Init
   * @generated
   */
  public Adapter createInitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.AtMost <em>At Most</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.AtMost
   * @generated
   */
  public Adapter createAtMostAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.Exact <em>Exact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.Exact
   * @generated
   */
  public Adapter createExactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.esi.comma.behavior.scl.scl.AtLeast <em>At Least</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.esi.comma.behavior.scl.scl.AtLeast
   * @generated
   */
  public Adapter createAtLeastAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SclAdapterFactory
