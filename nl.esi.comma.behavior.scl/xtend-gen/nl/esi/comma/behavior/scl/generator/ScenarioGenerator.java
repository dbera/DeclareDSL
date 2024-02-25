package nl.esi.comma.behavior.scl.generator;

import dk.brics.automaton.Automaton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nl.esi.comma.automata.AlgorithmType;
import nl.esi.comma.automata.EAutomaton;
import nl.esi.comma.automata.ScenarioComputeResult;
import nl.esi.comma.behavior.scl.scl.Action;
import nl.esi.comma.behavior.scl.scl.ActionType;
import nl.esi.comma.behavior.scl.scl.Actions;
import nl.esi.comma.behavior.scl.scl.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ScenarioGenerator {
  public void generateTestScenarios(final Map<String, ConstraintStateMachine> mapContraintToAutomata, final List<Actions> actList, final Model constraintSource, final int numSCN, final IFileSystemAccess2 fsa, final String path, final String _taskName, final String algorithm) {
    Actions acts = IterableExtensions.<Actions>head(actList);
    Set<String> _keySet = mapContraintToAutomata.keySet();
    for (final String constraint : _keySet) {
      {
        Automaton automata = mapContraintToAutomata.get(constraint).getComputedAutomata();
        Map<String, Character> map = mapContraintToAutomata.get(constraint).getUnicodeMap();
        AlgorithmType algorithmType = null;
        boolean _equals = algorithm.equals("prefix-suffix");
        if (_equals) {
          algorithmType = AlgorithmType.PREFIX_SUFFIX;
        }
        boolean _equals_1 = algorithm.equals("prefix-suffix-minimized");
        if (_equals_1) {
          algorithmType = AlgorithmType.PREFIX_SUFFIX_MINIMIZED;
        }
        boolean _equals_2 = algorithm.equals("bfs");
        if (_equals_2) {
          algorithmType = AlgorithmType.BFS;
        }
        boolean _equals_3 = algorithm.equals("dfs");
        if (_equals_3) {
          algorithmType = AlgorithmType.DFS;
        }
        List<String> existingCases = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList());
        final ScenarioComputeResult result = new EAutomaton(automata).computeScenarios(algorithmType, existingCases);
        ArrayList<List<String>> listOfStrList = new ArrayList<List<String>>();
        for (final String str : result.scenarios) {
          {
            char[] chArr = str.toCharArray();
            ConstraintStateMachine cAutomataInst = mapContraintToAutomata.get(constraint);
            ArrayList<String> newStrList = new ArrayList<String>();
            for (final char c : chArr) {
              newStrList.add(cAutomataInst.getStepName(c));
            }
            System.out.println(((("Complete: " + str) + " - > ") + newStrList));
            listOfStrList.add(newStrList);
          }
        }
        int _size = listOfStrList.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          fsa.generateFile((((path + "GeneratedFeatures\\") + constraint) + ".feature"), this.generateFeatureFile(constraint, acts, listOfStrList));
          fsa.generateFile((((path + "GeneratedFeatures\\") + constraint) + ".statistics.txt"), result.statistics);
        }
      }
    }
  }
  
  public ActionType getStepType(final String step, final Actions acts) {
    EList<Action> _act = acts.getAct();
    for (final Action a : _act) {
      boolean _equals = a.getName().equals(step);
      if (_equals) {
        return a.getAct();
      }
    }
    return ActionType.TRIGGER;
  }
  
  public String getGherkinType(final ActionType actType) {
    boolean _equals = actType.equals(ActionType.PRE_CONDITION);
    if (_equals) {
      return "Given";
    }
    boolean _equals_1 = actType.equals(ActionType.TRIGGER);
    if (_equals_1) {
      return "When";
    }
    boolean _equals_2 = actType.equals(ActionType.OBSERVABLE);
    if (_equals_2) {
      return "Then";
    }
    boolean _equals_3 = actType.equals(ActionType.CONJUNCTION);
    if (_equals_3) {
      return "And";
    }
    return null;
  }
  
  public CharSequence generateFeatureFile(final String constraint, final Actions acts, final ArrayList<List<String>> SCNList) {
    CharSequence _xblockexpression = null;
    {
      int idx = 0;
      int stepIdx = 0;
      ActionType ctx = ActionType.PRE_CONDITION;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature: ");
      _builder.append(constraint);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        for(final List<String> stepList : SCNList) {
          _builder.append("Scenario: ");
          _builder.append(constraint);
          _builder.append("_");
          _builder.append(idx);
          _builder.newLineIfNotEmpty();
          String _xblockexpression_1 = null;
          {
            idx++;
            _xblockexpression_1 = "";
          }
          _builder.append(_xblockexpression_1);
          _builder.newLineIfNotEmpty();
          String _xblockexpression_2 = null;
          {
            ctx = ActionType.PRE_CONDITION;
            _xblockexpression_2 = "";
          }
          _builder.append(_xblockexpression_2);
          _builder.newLineIfNotEmpty();
          String _xblockexpression_3 = null;
          {
            stepIdx = 0;
            _xblockexpression_3 = "";
          }
          _builder.append(_xblockexpression_3);
          _builder.newLineIfNotEmpty();
          {
            for(final String step : stepList) {
              {
                boolean _equals = ctx.equals(this.getStepType(step, acts));
                if (_equals) {
                  {
                    if ((stepIdx == 0)) {
                      String _gherkinType = this.getGherkinType(ctx);
                      _builder.append(_gherkinType);
                      _builder.append(" ");
                      _builder.append(step);
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append(ActionType.CONJUNCTION);
                      _builder.append(" ");
                      _builder.append(step);
                      _builder.newLineIfNotEmpty();
                    }
                  }
                } else {
                  {
                    if ((stepIdx == 0)) {
                      String _gherkinType_1 = this.getGherkinType(ctx);
                      _builder.append(_gherkinType_1);
                      _builder.append(" ");
                      _builder.append(step);
                      _builder.newLineIfNotEmpty();
                    } else {
                      String _xblockexpression_4 = null;
                      {
                        ctx = this.getStepType(step, acts);
                        _xblockexpression_4 = "";
                      }
                      _builder.append(_xblockexpression_4);
                      _builder.newLineIfNotEmpty();
                      String _gherkinType_2 = this.getGherkinType(ctx);
                      _builder.append(_gherkinType_2);
                      _builder.append(" ");
                      _builder.append(step);
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
              String _xblockexpression_5 = null;
              {
                stepIdx++;
                _xblockexpression_5 = "";
              }
              _builder.append(_xblockexpression_5);
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.newLine();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
