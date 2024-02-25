package nl.esi.comma.behavior.scl.generator;

import dk.brics.automaton.Automaton;
import dk.brics.automaton.RegExp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nl.esi.comma.automata.RelationType;
import nl.esi.comma.automata.Semantics;
import nl.esi.comma.behavior.scl.scl.AlternatePrecedence;
import nl.esi.comma.behavior.scl.scl.AlternateResponse;
import nl.esi.comma.behavior.scl.scl.AlternateSuccession;
import nl.esi.comma.behavior.scl.scl.AtLeast;
import nl.esi.comma.behavior.scl.scl.AtMost;
import nl.esi.comma.behavior.scl.scl.ChainPrecedence;
import nl.esi.comma.behavior.scl.scl.ChainResponse;
import nl.esi.comma.behavior.scl.scl.ChainSuccession;
import nl.esi.comma.behavior.scl.scl.Choice;
import nl.esi.comma.behavior.scl.scl.CoExistance;
import nl.esi.comma.behavior.scl.scl.Composition;
import nl.esi.comma.behavior.scl.scl.Dependencies;
import nl.esi.comma.behavior.scl.scl.End;
import nl.esi.comma.behavior.scl.scl.Exact;
import nl.esi.comma.behavior.scl.scl.ExclusiveChoice;
import nl.esi.comma.behavior.scl.scl.Existential;
import nl.esi.comma.behavior.scl.scl.Future;
import nl.esi.comma.behavior.scl.scl.Init;
import nl.esi.comma.behavior.scl.scl.Model;
import nl.esi.comma.behavior.scl.scl.NotChainSuccession;
import nl.esi.comma.behavior.scl.scl.NotCoExistance;
import nl.esi.comma.behavior.scl.scl.NotSuccession;
import nl.esi.comma.behavior.scl.scl.Past;
import nl.esi.comma.behavior.scl.scl.Precedence;
import nl.esi.comma.behavior.scl.scl.Ref;
import nl.esi.comma.behavior.scl.scl.RefSequence;
import nl.esi.comma.behavior.scl.scl.RefStep;
import nl.esi.comma.behavior.scl.scl.RespondedExistence;
import nl.esi.comma.behavior.scl.scl.Response;
import nl.esi.comma.behavior.scl.scl.SimpleChoice;
import nl.esi.comma.behavior.scl.scl.Succession;
import nl.esi.comma.behavior.scl.scl.Templates;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ConstraintsStateMachineGenerator {
  private Set<String> activityList = new HashSet<String>();
  
  private Map<String, Character> unicodeMap = new HashMap<String, Character>();
  
  private char symbol = 'a';
  
  private char fs = '0';
  
  private Map<String, ConstraintStateMachine> mapContraintToAutomata = new HashMap<String, ConstraintStateMachine>();
  
  public Map<String, ConstraintStateMachine> generateStateMachine(final Model model, final String path, final String name) {
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(model.getComposition());
    if (_isNullOrEmpty) {
      this.computeStepLabels(model.getTemplates());
      ConstraintStateMachine constraintSMInst = this.computeStateMachine(model.getTemplates(), path, name);
      this.mapContraintToAutomata.put(name, constraintSMInst);
    } else {
      EList<Composition> _composition = model.getComposition();
      for (final Composition elm : _composition) {
        {
          this.symbol = 'a';
          HashSet<String> _hashSet = new HashSet<String>();
          this.activityList = _hashSet;
          HashMap<String, Character> _hashMap = new HashMap<String, Character>();
          this.unicodeMap = _hashMap;
          this.fs = '0';
          HashSet<Templates> templateList = new HashSet<Templates>();
          EList<Templates> _templates = elm.getTemplates();
          for (final Templates t : _templates) {
            templateList.add(t);
          }
          this.computeStepLabels(IterableExtensions.<Templates>toList(templateList));
          ConstraintStateMachine constraintSMInst_1 = this.computeStateMachine(IterableExtensions.<Templates>toList(templateList), path, elm.getName());
          this.mapContraintToAutomata.put(elm.getName(), constraintSMInst_1);
        }
      }
    }
    return this.mapContraintToAutomata;
  }
  
  public ArrayList<Automaton> getAutomatonForStrings(final List<String> strList) {
    ArrayList<Automaton> _a_ = new ArrayList<Automaton>();
    for (final String str : strList) {
      {
        System.out.println(str);
        RegExp r = new RegExp(str);
        _a_.add(r.toAutomaton());
      }
    }
    return _a_;
  }
  
  public RelationType getRelationType(final boolean either) {
    if (either) {
      return RelationType.OR;
    } else {
      return RelationType.AND;
    }
  }
  
  public ConstraintStateMachine computeStateMachine(final List<Templates> templateList, final String path, final String name) {
    Semantics sem = new Semantics();
    boolean debug = false;
    List<Automaton> automataList = new ArrayList<Automaton>();
    for (final Templates templates : templateList) {
      EList<EObject> _type = templates.getType();
      for (final EObject elm : _type) {
        {
          if ((elm instanceof Choice)) {
            EList<EObject> _type_1 = ((Choice)elm).getType();
            for (final EObject elmInst : _type_1) {
              {
                if ((elmInst instanceof SimpleChoice)) {
                  ArrayList<Character> refACharList = new ArrayList<Character>();
                  ArrayList<String> _refName = this.getRefName(((SimpleChoice)elmInst).getRefA());
                  for (final String elmA : _refName) {
                    refACharList.add(this.unicodeMap.get(elmA));
                  }
                  List<String> strList = sem.getSimpleChoice(refACharList);
                  automataList.addAll(this.getAutomatonForStrings(strList));
                }
                if ((elmInst instanceof ExclusiveChoice)) {
                  ArrayList<Character> refACharList_1 = new ArrayList<Character>();
                  ArrayList<Character> refBCharList = new ArrayList<Character>();
                  ArrayList<String> _refName_1 = this.getRefName(((ExclusiveChoice)elmInst).getRefA());
                  for (final String elmA_1 : _refName_1) {
                    refACharList_1.add(this.unicodeMap.get(elmA_1));
                  }
                  ArrayList<String> _refName_2 = this.getRefName(((ExclusiveChoice)elmInst).getRefB());
                  for (final String elmB : _refName_2) {
                    refBCharList.add(this.unicodeMap.get(elmB));
                  }
                  List<String> strList_1 = sem.getExclusiveChoice(refACharList_1, refBCharList);
                  automataList.addAll(this.getAutomatonForStrings(strList_1));
                }
              }
            }
          }
          if ((elm instanceof Existential)) {
            EList<EObject> _type_2 = ((Existential)elm).getType();
            for (final EObject elmInst_1 : _type_2) {
              {
                if ((elmInst_1 instanceof AtLeast)) {
                  ArrayList<Character> refACharList = new ArrayList<Character>();
                  ArrayList<String> _refName = this.getRefName(((AtLeast)elmInst_1).getRef());
                  for (final String elmA : _refName) {
                    refACharList.add(this.unicodeMap.get(elmA));
                  }
                  List<String> strList = sem.getAtLeast(refACharList, ((AtLeast)elmInst_1).getNum());
                  automataList.addAll(this.getAutomatonForStrings(strList));
                }
                if ((elmInst_1 instanceof AtMost)) {
                  ArrayList<Character> refACharList_1 = new ArrayList<Character>();
                  ArrayList<String> _refName_1 = this.getRefName(((AtMost)elmInst_1).getRef());
                  for (final String elmA_1 : _refName_1) {
                    refACharList_1.add(this.unicodeMap.get(elmA_1));
                  }
                  List<String> strList_1 = sem.getAtMost(refACharList_1, ((AtMost)elmInst_1).getNum());
                  automataList.addAll(this.getAutomatonForStrings(strList_1));
                }
                if ((elmInst_1 instanceof Exact)) {
                  ArrayList<Character> refACharList_2 = new ArrayList<Character>();
                  ArrayList<String> _refName_2 = this.getRefName(((Exact)elmInst_1).getRef());
                  for (final String elmA_2 : _refName_2) {
                    refACharList_2.add(this.unicodeMap.get(elmA_2));
                  }
                  List<String> strList_2 = sem.getExactOccurence(refACharList_2, ((Exact)elmInst_1).getNum(), ((Exact)elmInst_1).isConsecutively());
                  automataList.addAll(this.getAutomatonForStrings(strList_2));
                }
                if ((elmInst_1 instanceof Init)) {
                  ArrayList<Character> refACharList_3 = new ArrayList<Character>();
                  ArrayList<String> _refName_3 = this.getRefName(((Init)elmInst_1).getRef());
                  for (final String elmA_3 : _refName_3) {
                    refACharList_3.add(this.unicodeMap.get(elmA_3));
                  }
                  List<String> strList_3 = sem.getInit(refACharList_3);
                  automataList.addAll(this.getAutomatonForStrings(strList_3));
                }
                if ((elmInst_1 instanceof End)) {
                  ArrayList<Character> refACharList_4 = new ArrayList<Character>();
                  ArrayList<String> _refName_4 = this.getRefName(((End)elmInst_1).getRef());
                  for (final String elmA_4 : _refName_4) {
                    refACharList_4.add(this.unicodeMap.get(elmA_4));
                  }
                  List<String> strList_4 = sem.getEnd(refACharList_4);
                  automataList.addAll(this.getAutomatonForStrings(strList_4));
                }
              }
            }
          }
          if ((elm instanceof Future)) {
            EList<EObject> _type_3 = ((Future)elm).getType();
            for (final EObject elmInst_2 : _type_3) {
              {
                if ((elmInst_2 instanceof Response)) {
                  ArrayList<Character> refACharList = new ArrayList<Character>();
                  ArrayList<Character> refBCharList = new ArrayList<Character>();
                  ArrayList<String> _refName = this.getRefName(((Response)elmInst_2).getRefA());
                  for (final String elmA : _refName) {
                    refACharList.add(this.unicodeMap.get(elmA));
                  }
                  ArrayList<String> _refName_1 = this.getRefName(((Response)elmInst_2).getRefB());
                  for (final String elmB : _refName_1) {
                    refBCharList.add(this.unicodeMap.get(elmB));
                  }
                  List<String> strList = sem.getResponse(refACharList, this.getRelationType(((Response)elmInst_2).isEitherA()), refBCharList, this.getRelationType(((Response)elmInst_2).isEitherB()), ((Response)elmInst_2).isNot());
                  automataList.addAll(this.getAutomatonForStrings(strList));
                }
                if ((elmInst_2 instanceof AlternateResponse)) {
                  ArrayList<Character> refACharList_1 = new ArrayList<Character>();
                  ArrayList<Character> refBCharList_1 = new ArrayList<Character>();
                  ArrayList<Character> refCCharList = new ArrayList<Character>();
                  ArrayList<String> _refName_2 = this.getRefName(((AlternateResponse)elmInst_2).getRefA());
                  for (final String elmA_1 : _refName_2) {
                    refACharList_1.add(this.unicodeMap.get(elmA_1));
                  }
                  ArrayList<String> _refName_3 = this.getRefName(((AlternateResponse)elmInst_2).getRefB());
                  for (final String elmB_1 : _refName_3) {
                    refBCharList_1.add(this.unicodeMap.get(elmB_1));
                  }
                  ArrayList<String> _refName_4 = this.getRefName(((AlternateResponse)elmInst_2).getRefC());
                  for (final String elmC : _refName_4) {
                    refCCharList.add(this.unicodeMap.get(elmC));
                  }
                  List<String> strList_1 = sem.getAlternateResponse(refACharList_1, this.getRelationType(((AlternateResponse)elmInst_2).isEitherA()), refBCharList_1, this.getRelationType(((AlternateResponse)elmInst_2).isEitherB()), refCCharList, this.getRelationType(((AlternateResponse)elmInst_2).isEitherC()), ((AlternateResponse)elmInst_2).isNot());
                  automataList.addAll(this.getAutomatonForStrings(strList_1));
                }
                if ((elmInst_2 instanceof ChainResponse)) {
                  ArrayList<Character> refACharList_2 = new ArrayList<Character>();
                  ArrayList<Character> refBCharList_2 = new ArrayList<Character>();
                  ArrayList<String> _refName_5 = this.getRefName(((ChainResponse)elmInst_2).getRefA());
                  for (final String elmA_2 : _refName_5) {
                    refACharList_2.add(this.unicodeMap.get(elmA_2));
                  }
                  ArrayList<String> _refName_6 = this.getRefName(((ChainResponse)elmInst_2).getRefB());
                  for (final String elmB_2 : _refName_6) {
                    refBCharList_2.add(this.unicodeMap.get(elmB_2));
                  }
                  List<String> strList_2 = sem.getChainResponse(refACharList_2, this.getRelationType(((ChainResponse)elmInst_2).isEitherA()), refBCharList_2, this.getRelationType(((ChainResponse)elmInst_2).isEitherB()), ((ChainResponse)elmInst_2).isNot());
                  automataList.addAll(this.getAutomatonForStrings(strList_2));
                }
              }
            }
          }
          if ((elm instanceof Past)) {
            EList<EObject> _type_4 = ((Past)elm).getType();
            for (final EObject elmInst_3 : _type_4) {
              {
                if ((elmInst_3 instanceof Precedence)) {
                  ArrayList<Character> refACharList = new ArrayList<Character>();
                  ArrayList<Character> refBCharList = new ArrayList<Character>();
                  ArrayList<String> _refName = this.getRefName(((Precedence)elmInst_3).getRefA());
                  for (final String elmA : _refName) {
                    refACharList.add(this.unicodeMap.get(elmA));
                  }
                  ArrayList<String> _refName_1 = this.getRefName(((Precedence)elmInst_3).getRefB());
                  for (final String elmB : _refName_1) {
                    refBCharList.add(this.unicodeMap.get(elmB));
                  }
                  List<String> strList = sem.getPrecedence(refACharList, this.getRelationType(((Precedence)elmInst_3).isEitherA()), refBCharList, this.getRelationType(((Precedence)elmInst_3).isEitherB()), ((Precedence)elmInst_3).isNot());
                  automataList.addAll(this.getAutomatonForStrings(strList));
                }
                if ((elmInst_3 instanceof AlternatePrecedence)) {
                  ArrayList<Character> refACharList_1 = new ArrayList<Character>();
                  ArrayList<Character> refBCharList_1 = new ArrayList<Character>();
                  ArrayList<Character> refCCharList = new ArrayList<Character>();
                  ArrayList<String> _refName_2 = this.getRefName(((AlternatePrecedence)elmInst_3).getRefA());
                  for (final String elmA_1 : _refName_2) {
                    refACharList_1.add(this.unicodeMap.get(elmA_1));
                  }
                  ArrayList<String> _refName_3 = this.getRefName(((AlternatePrecedence)elmInst_3).getRefB());
                  for (final String elmB_1 : _refName_3) {
                    refBCharList_1.add(this.unicodeMap.get(elmB_1));
                  }
                  ArrayList<String> _refName_4 = this.getRefName(((AlternatePrecedence)elmInst_3).getRefC());
                  for (final String elmC : _refName_4) {
                    refCCharList.add(this.unicodeMap.get(elmC));
                  }
                  List<String> strList_1 = sem.getAlternatePrecedence(refACharList_1, this.getRelationType(((AlternatePrecedence)elmInst_3).isEitherA()), refBCharList_1, this.getRelationType(((AlternatePrecedence)elmInst_3).isEitherB()), refCCharList, this.getRelationType(((AlternatePrecedence)elmInst_3).isEitherC()), ((AlternatePrecedence)elmInst_3).isNot());
                  automataList.addAll(this.getAutomatonForStrings(strList_1));
                }
                if ((elmInst_3 instanceof ChainPrecedence)) {
                  ArrayList<Character> refACharList_2 = new ArrayList<Character>();
                  ArrayList<Character> refBCharList_2 = new ArrayList<Character>();
                  ArrayList<String> _refName_5 = this.getRefName(((ChainPrecedence)elmInst_3).getRefA());
                  for (final String elmA_2 : _refName_5) {
                    refACharList_2.add(this.unicodeMap.get(elmA_2));
                  }
                  ArrayList<String> _refName_6 = this.getRefName(((ChainPrecedence)elmInst_3).getRefB());
                  for (final String elmB_2 : _refName_6) {
                    refBCharList_2.add(this.unicodeMap.get(elmB_2));
                  }
                  List<String> strList_2 = sem.getChainPrecedence(refACharList_2, this.getRelationType(((ChainPrecedence)elmInst_3).isEitherA()), refBCharList_2, this.getRelationType(((ChainPrecedence)elmInst_3).isEitherB()), ((ChainPrecedence)elmInst_3).isNot());
                  automataList.addAll(this.getAutomatonForStrings(strList_2));
                }
              }
            }
          }
          if ((elm instanceof Dependencies)) {
            EList<EObject> _type_5 = ((Dependencies)elm).getType();
            for (final EObject elmInst_4 : _type_5) {
              {
                if ((elmInst_4 instanceof RespondedExistence)) {
                  ArrayList<Character> refACharList = new ArrayList<Character>();
                  ArrayList<Character> refBCharList = new ArrayList<Character>();
                  ArrayList<String> _refName = this.getRefName(((RespondedExistence)elmInst_4).getRefA());
                  for (final String elmA : _refName) {
                    refACharList.add(this.unicodeMap.get(elmA));
                  }
                  ArrayList<String> _refName_1 = this.getRefName(((RespondedExistence)elmInst_4).getRefB());
                  for (final String elmB : _refName_1) {
                    refBCharList.add(this.unicodeMap.get(elmB));
                  }
                  List<String> strList = sem.getRespondedExistence(refACharList, this.getRelationType(((RespondedExistence)elmInst_4).isEitherA()), refBCharList, this.getRelationType(((RespondedExistence)elmInst_4).isEitherB()), false);
                  automataList.addAll(this.getAutomatonForStrings(strList));
                }
                if ((elmInst_4 instanceof CoExistance)) {
                  ArrayList<Character> refACharList_1 = new ArrayList<Character>();
                  ArrayList<String> _refName_2 = this.getRefName(((CoExistance)elmInst_4).getRefA());
                  for (final String elmA_1 : _refName_2) {
                    refACharList_1.add(this.unicodeMap.get(elmA_1));
                  }
                  List<String> strList_1 = sem.getCoExistence(refACharList_1, false);
                  automataList.addAll(this.getAutomatonForStrings(strList_1));
                }
                if ((elmInst_4 instanceof Succession)) {
                  ArrayList<Character> refACharList_2 = new ArrayList<Character>();
                  ArrayList<Character> refBCharList_1 = new ArrayList<Character>();
                  ArrayList<String> _refName_3 = this.getRefName(((Succession)elmInst_4).getRefA());
                  for (final String elmA_2 : _refName_3) {
                    refACharList_2.add(this.unicodeMap.get(elmA_2));
                  }
                  ArrayList<String> _refName_4 = this.getRefName(((Succession)elmInst_4).getRefB());
                  for (final String elmB_1 : _refName_4) {
                    refBCharList_1.add(this.unicodeMap.get(elmB_1));
                  }
                  List<String> strList_2 = sem.getSuccession(refACharList_2, this.getRelationType(((Succession)elmInst_4).isEitherA()), refBCharList_1, this.getRelationType(((Succession)elmInst_4).isEitherB()), false);
                  automataList.addAll(this.getAutomatonForStrings(strList_2));
                }
                if ((elmInst_4 instanceof AlternateSuccession)) {
                  ArrayList<Character> refACharList_3 = new ArrayList<Character>();
                  ArrayList<Character> refBCharList_2 = new ArrayList<Character>();
                  ArrayList<Character> refCCharList = new ArrayList<Character>();
                  ArrayList<String> _refName_5 = this.getRefName(((AlternateSuccession)elmInst_4).getRefA());
                  for (final String elmA_3 : _refName_5) {
                    refACharList_3.add(this.unicodeMap.get(elmA_3));
                  }
                  ArrayList<String> _refName_6 = this.getRefName(((AlternateSuccession)elmInst_4).getRefB());
                  for (final String elmB_2 : _refName_6) {
                    refBCharList_2.add(this.unicodeMap.get(elmB_2));
                  }
                  ArrayList<String> _refName_7 = this.getRefName(((AlternateSuccession)elmInst_4).getRefC());
                  for (final String elmC : _refName_7) {
                    refCCharList.add(this.unicodeMap.get(elmC));
                  }
                  List<String> strList_3 = sem.getAlternateSuccession(refACharList_3, this.getRelationType(((AlternateSuccession)elmInst_4).isEitherA()), refBCharList_2, this.getRelationType(((AlternateSuccession)elmInst_4).isEitherB()), refCCharList, this.getRelationType(((AlternateSuccession)elmInst_4).isEitherC()), false);
                  automataList.addAll(this.getAutomatonForStrings(strList_3));
                }
                if ((elmInst_4 instanceof ChainSuccession)) {
                  ArrayList<Character> refACharList_4 = new ArrayList<Character>();
                  ArrayList<Character> refBCharList_3 = new ArrayList<Character>();
                  ArrayList<String> _refName_8 = this.getRefName(((ChainSuccession)elmInst_4).getRefA());
                  for (final String elmA_4 : _refName_8) {
                    refACharList_4.add(this.unicodeMap.get(elmA_4));
                  }
                  ArrayList<String> _refName_9 = this.getRefName(((ChainSuccession)elmInst_4).getRefB());
                  for (final String elmB_3 : _refName_9) {
                    refBCharList_3.add(this.unicodeMap.get(elmB_3));
                  }
                  List<String> strList_4 = sem.getChainSuccession(refACharList_4, this.getRelationType(((ChainSuccession)elmInst_4).isEitherA()), refBCharList_3, this.getRelationType(((ChainSuccession)elmInst_4).isEitherB()), false);
                  automataList.addAll(this.getAutomatonForStrings(strList_4));
                }
                if ((elmInst_4 instanceof NotSuccession)) {
                  ArrayList<Character> refACharList_5 = new ArrayList<Character>();
                  ArrayList<Character> refBCharList_4 = new ArrayList<Character>();
                  ArrayList<String> _refName_10 = this.getRefName(((NotSuccession)elmInst_4).getRefA());
                  for (final String elmA_5 : _refName_10) {
                    refACharList_5.add(this.unicodeMap.get(elmA_5));
                  }
                  ArrayList<String> _refName_11 = this.getRefName(((NotSuccession)elmInst_4).getRefB());
                  for (final String elmB_4 : _refName_11) {
                    refBCharList_4.add(this.unicodeMap.get(elmB_4));
                  }
                  List<String> strList_5 = sem.getSuccession(refACharList_5, this.getRelationType(((NotSuccession)elmInst_4).isEitherA()), refBCharList_4, this.getRelationType(((NotSuccession)elmInst_4).isEitherB()), true);
                  automataList.addAll(this.getAutomatonForStrings(strList_5));
                }
                if ((elmInst_4 instanceof NotCoExistance)) {
                  ArrayList<Character> refACharList_6 = new ArrayList<Character>();
                  ArrayList<String> _refName_12 = this.getRefName(((NotCoExistance)elmInst_4).getRefA());
                  for (final String elmA_6 : _refName_12) {
                    refACharList_6.add(this.unicodeMap.get(elmA_6));
                  }
                  List<String> strList_6 = sem.getCoExistence(refACharList_6, true);
                  automataList.addAll(this.getAutomatonForStrings(strList_6));
                }
                if ((elmInst_4 instanceof NotChainSuccession)) {
                  ArrayList<Character> refACharList_7 = new ArrayList<Character>();
                  ArrayList<Character> refBCharList_5 = new ArrayList<Character>();
                  ArrayList<String> _refName_13 = this.getRefName(((NotChainSuccession)elmInst_4).getRefA());
                  for (final String elmA_7 : _refName_13) {
                    refACharList_7.add(this.unicodeMap.get(elmA_7));
                  }
                  ArrayList<String> _refName_14 = this.getRefName(((NotChainSuccession)elmInst_4).getRefB());
                  for (final String elmB_5 : _refName_14) {
                    refBCharList_5.add(this.unicodeMap.get(elmB_5));
                  }
                  List<String> strList_7 = sem.getChainSuccession(refACharList_7, this.getRelationType(((NotChainSuccession)elmInst_4).isEitherA()), refBCharList_5, this.getRelationType(((NotChainSuccession)elmInst_4).isEitherB()), true);
                  automataList.addAll(this.getAutomatonForStrings(strList_7));
                }
              }
            }
          }
        }
      }
    }
    String regex = "[";
    Set<String> _keySet = this.unicodeMap.keySet();
    for (final String act : _keySet) {
      String _regex = regex;
      Character _get = this.unicodeMap.get(act);
      regex = (_regex + _get);
    }
    this.fs = this.symbol;
    String _regex_1 = regex;
    String _plus = (Character.valueOf(this.symbol) + "]*");
    regex = (_regex_1 + _plus);
    RegExp r = new RegExp(regex);
    automataList.add(r.toAutomaton());
    this.unicodeMap.put("ANY", Character.valueOf(this.symbol));
    ConstraintStateMachine constraintSMInst = new ConstraintStateMachine(name, this.unicodeMap, automataList);
    constraintSMInst.computeAutomaton(path);
    return constraintSMInst;
  }
  
  /**
   * def displayAutomaton(Automaton fa, String path, boolean useProvidedLabels)
   * {
   * try(
   * var BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path + "g.dot")))
   * ) {
   * try { out.write(transformWithLabels(fa.toDot(),useProvidedLabels)); } catch (IOException e) { e.printStackTrace(); }
   * } catch (FileNotFoundException e1) { e1.printStackTrace(); } catch (IOException e1) { e1.printStackTrace(); }
   * 
   * var ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "dot -Tpng -O g.dot");
   * builder.redirectErrorStream(true);
   * var Process p = null;
   * try { p = builder.start(); } catch (IOException e) { e.printStackTrace(); }
   * var BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
   * var String line = null;
   * do {
   * try {
   * line = r.readLine();
   * } catch (IOException e) {
   * e.printStackTrace();
   * }
   * //if (line == null) { break; }
   * //System.out.println(line);
   * } while (line!==null)
   * //String path = "C:\\Users\\berad\\Desktop\\ContentsFeb2021\\JavaAndCSharpSources\\JavaWorkspace2020\\wrkspace\\DemoRegExp\\g.dot.png";
   * var String expr1 = "dot -Tpng " + path + "g.dot -O g.dot";
   * //String apath = path + "g.dot.png";
   * var String expr2 = "rundll32.exe \"C:\\Program Files\\Windows Photo Viewer\\PhotoViewer.dll\", ImageView_Fullscreen " + path + "g.dot.png";
   * try { Runtime.getRuntime().exec(expr1); } catch (IOException e) { e.printStackTrace(); }
   * try { Runtime.getRuntime().exec(expr2); } catch (IOException e) { e.printStackTrace(); }
   * }
   * 
   * def String transformWithLabels(String str, boolean useProvidedLabels) {
   * var String final_str = str;
   * if(useProvidedLabels) {
   * for(String key : unicodeMap.keySet()) {
   * //System.out.println("check<!> " + "[label=\"" + "\\u"+String.format("%04x", (int) unicodeMap.get(key)) + "\"]"  + " -> " + key);
   * if(final_str.contains("[label=\"" + unicodeMap.get(key).toString() + "\"]")) {
   * //System.out.println("check " + "[label=\"" + unicodeMap.get(key).toString() + "\"]"  + " -> " + key);
   * final_str = final_str.replace("[label=\"" + unicodeMap.get(key).toString() + "\"]", "[label=\"" + key + "\"]");
   * }
   * if(final_str.contains("[label=\"" + "\\u"+String.format("%04x", Character.getNumericValue(unicodeMap.get(key))) + "\"]")) {
   * //System.out.println("check<> " + "\\u"+String.format("%04x", (int) unicodeMap.get(key))  + " -> " + key);
   * final_str = final_str.replace("[label=\"" + "\\u"+String.format("%04x", Character.getNumericValue(unicodeMap.get(key))) + "\"]", "[label=\"" + key + "\"]");
   * }
   * }
   * }
   * return final_str;
   * }
   */
  public void computeStepLabels(final List<Templates> templateList) {
    for (final Templates templates : templateList) {
      EList<EObject> _type = templates.getType();
      for (final EObject elm : _type) {
        {
          if ((elm instanceof Choice)) {
            EList<EObject> _type_1 = ((Choice)elm).getType();
            for (final EObject elmInst : _type_1) {
              {
                if ((elmInst instanceof SimpleChoice)) {
                  this.addActivityToMap(((SimpleChoice)elmInst).getRefA());
                }
                if ((elmInst instanceof ExclusiveChoice)) {
                  this.addActivityToMap(((ExclusiveChoice)elmInst).getRefA(), ((ExclusiveChoice)elmInst).getRefB());
                }
              }
            }
          }
          if ((elm instanceof Existential)) {
            EList<EObject> _type_2 = ((Existential)elm).getType();
            for (final EObject elmInst_1 : _type_2) {
              {
                if ((elmInst_1 instanceof AtLeast)) {
                  this.addActivityToMap(((AtLeast)elmInst_1).getRef());
                }
                if ((elmInst_1 instanceof Exact)) {
                  this.addActivityToMap(((Exact)elmInst_1).getRef());
                }
                if ((elmInst_1 instanceof AtMost)) {
                  this.addActivityToMap(((AtMost)elmInst_1).getRef());
                }
                if ((elmInst_1 instanceof Init)) {
                  this.addActivityToMap(((Init)elmInst_1).getRef());
                }
                if ((elmInst_1 instanceof End)) {
                  this.addActivityToMap(((End)elmInst_1).getRef());
                }
              }
            }
          }
          if ((elm instanceof Future)) {
            EList<EObject> _type_3 = ((Future)elm).getType();
            for (final EObject elmInst_2 : _type_3) {
              {
                if ((elmInst_2 instanceof Response)) {
                  this.addActivityToMap(((Response)elmInst_2).getRefA(), ((Response)elmInst_2).getRefB());
                }
                if ((elmInst_2 instanceof AlternateResponse)) {
                  this.addActivityToMap(((AlternateResponse)elmInst_2).getRefA(), ((AlternateResponse)elmInst_2).getRefB());
                }
                if ((elmInst_2 instanceof ChainResponse)) {
                  this.addActivityToMap(((ChainResponse)elmInst_2).getRefA(), ((ChainResponse)elmInst_2).getRefB());
                }
              }
            }
          }
          if ((elm instanceof Past)) {
            EList<EObject> _type_4 = ((Past)elm).getType();
            for (final EObject elmInst_3 : _type_4) {
              {
                if ((elmInst_3 instanceof Precedence)) {
                  this.addActivityToMap(((Precedence)elmInst_3).getRefA(), ((Precedence)elmInst_3).getRefB());
                }
                if ((elmInst_3 instanceof AlternatePrecedence)) {
                  this.addActivityToMap(((AlternatePrecedence)elmInst_3).getRefA(), ((AlternatePrecedence)elmInst_3).getRefB());
                }
                if ((elmInst_3 instanceof ChainPrecedence)) {
                  this.addActivityToMap(((ChainPrecedence)elmInst_3).getRefA(), ((ChainPrecedence)elmInst_3).getRefB());
                }
              }
            }
          }
          if ((elm instanceof Dependencies)) {
            EList<EObject> _type_5 = ((Dependencies)elm).getType();
            for (final EObject elmInst_4 : _type_5) {
              {
                if ((elmInst_4 instanceof RespondedExistence)) {
                  this.addActivityToMap(((RespondedExistence)elmInst_4).getRefA(), ((RespondedExistence)elmInst_4).getRefB());
                }
                if ((elmInst_4 instanceof CoExistance)) {
                  this.addActivityToMap(((CoExistance)elmInst_4).getRefA());
                }
                if ((elmInst_4 instanceof Succession)) {
                  this.addActivityToMap(((Succession)elmInst_4).getRefA(), ((Succession)elmInst_4).getRefB());
                }
                if ((elmInst_4 instanceof AlternateSuccession)) {
                  this.addActivityToMap(((AlternateSuccession)elmInst_4).getRefA(), ((AlternateSuccession)elmInst_4).getRefB());
                }
                if ((elmInst_4 instanceof ChainSuccession)) {
                  this.addActivityToMap(((ChainSuccession)elmInst_4).getRefA(), ((ChainSuccession)elmInst_4).getRefB());
                }
                if ((elmInst_4 instanceof NotSuccession)) {
                  this.addActivityToMap(((NotSuccession)elmInst_4).getRefA(), ((NotSuccession)elmInst_4).getRefB());
                }
                if ((elmInst_4 instanceof NotCoExistance)) {
                  this.addActivityToMap(((NotCoExistance)elmInst_4).getRefA());
                }
                if ((elmInst_4 instanceof NotChainSuccession)) {
                  this.addActivityToMap(((NotChainSuccession)elmInst_4).getRefA(), ((NotChainSuccession)elmInst_4).getRefB());
                }
              }
            }
          }
        }
      }
    }
  }
  
  public char addActivityToMap(final Ref elmA) {
    char _xblockexpression = (char) 0;
    {
      String refName = this.getRefName(elmA);
      this.activityList.add(refName);
      char _xifexpression = (char) 0;
      boolean _containsKey = this.unicodeMap.containsKey(refName);
      boolean _not = (!_containsKey);
      if (_not) {
        char _xblockexpression_1 = (char) 0;
        {
          this.unicodeMap.put(refName, Character.valueOf(this.symbol));
          _xblockexpression_1 = this.symbol++;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public void addActivityToMap(final List<Ref> elmA) {
    ArrayList<String> refAName = this.getRefName(elmA);
    for (final String elmAName : refAName) {
      {
        this.activityList.add(elmAName);
        boolean _containsKey = this.unicodeMap.containsKey(elmAName);
        boolean _not = (!_containsKey);
        if (_not) {
          this.unicodeMap.put(elmAName, Character.valueOf(this.symbol));
          this.symbol++;
        }
      }
    }
  }
  
  public void addActivityToMap(final List<Ref> elmA, final List<Ref> elmB) {
    ArrayList<String> refAName = this.getRefName(elmA);
    ArrayList<String> refBName = this.getRefName(elmB);
    for (final String elmAName : refAName) {
      {
        this.activityList.add(elmAName);
        boolean _containsKey = this.unicodeMap.containsKey(elmAName);
        boolean _not = (!_containsKey);
        if (_not) {
          this.unicodeMap.put(elmAName, Character.valueOf(this.symbol));
          this.symbol++;
        }
      }
    }
    for (final String elmBName : refBName) {
      {
        this.activityList.add(elmBName);
        boolean _containsKey = this.unicodeMap.containsKey(elmBName);
        boolean _not = (!_containsKey);
        if (_not) {
          this.unicodeMap.put(elmBName, Character.valueOf(this.symbol));
          this.symbol++;
        }
      }
    }
  }
  
  public char addActivityToMap(final Ref elmA, final Ref elmB) {
    char _xblockexpression = (char) 0;
    {
      String refAName = this.getRefName(elmA);
      String refBName = this.getRefName(elmB);
      this.activityList.add(refAName);
      boolean _containsKey = this.unicodeMap.containsKey(refAName);
      boolean _not = (!_containsKey);
      if (_not) {
        this.unicodeMap.put(refAName, Character.valueOf(this.symbol));
        this.symbol++;
      }
      this.activityList.add(refBName);
      char _xifexpression = (char) 0;
      boolean _containsKey_1 = this.unicodeMap.containsKey(refBName);
      boolean _not_1 = (!_containsKey_1);
      if (_not_1) {
        char _xblockexpression_1 = (char) 0;
        {
          this.unicodeMap.put(refBName, Character.valueOf(this.symbol));
          _xblockexpression_1 = this.symbol++;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public void addActivityToMap(final Ref elmA, final List<Ref> elmB) {
    String refAName = this.getRefName(elmA);
    ArrayList<String> refBName = this.getRefName(elmB);
    this.activityList.add(refAName);
    boolean _containsKey = this.unicodeMap.containsKey(refAName);
    boolean _not = (!_containsKey);
    if (_not) {
      this.unicodeMap.put(refAName, Character.valueOf(this.symbol));
      this.symbol++;
    }
    for (final String elmBName : refBName) {
      {
        this.activityList.add(elmBName);
        boolean _containsKey_1 = this.unicodeMap.containsKey(elmBName);
        boolean _not_1 = (!_containsKey_1);
        if (_not_1) {
          this.unicodeMap.put(elmBName, Character.valueOf(this.symbol));
          this.symbol++;
        }
      }
    }
  }
  
  public char addActivityToMap(final List<Ref> elmA, final Ref elmB) {
    char _xblockexpression = (char) 0;
    {
      ArrayList<String> refAName = this.getRefName(elmA);
      String refBName = this.getRefName(elmB);
      for (final String elmAName : refAName) {
        {
          this.activityList.add(elmAName);
          boolean _containsKey = this.unicodeMap.containsKey(elmAName);
          boolean _not = (!_containsKey);
          if (_not) {
            this.unicodeMap.put(elmAName, Character.valueOf(this.symbol));
            this.symbol++;
          }
        }
      }
      this.activityList.add(refBName);
      char _xifexpression = (char) 0;
      boolean _containsKey = this.unicodeMap.containsKey(refAName);
      boolean _not = (!_containsKey);
      if (_not) {
        char _xblockexpression_1 = (char) 0;
        {
          this.unicodeMap.put(refBName, Character.valueOf(this.symbol));
          _xblockexpression_1 = this.symbol++;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String getRefName(final Ref ref) {
    String refName = "";
    if ((ref instanceof RefStep)) {
      refName = ((RefStep)ref).getStep().getName();
    } else {
      if ((ref instanceof RefSequence)) {
        refName = ((RefSequence)ref).getSeq().getName();
      }
    }
    return refName;
  }
  
  public ArrayList<String> getRefName(final List<Ref> refList) {
    ArrayList<String> refName = new ArrayList<String>();
    for (final Ref ref : refList) {
      {
        if ((ref instanceof RefStep)) {
          refName.add(((RefStep)ref).getStep().getName());
        }
        if ((ref instanceof RefSequence)) {
          refName.add(((RefSequence)ref).getSeq().getName());
        }
      }
    }
    return refName;
  }
}
