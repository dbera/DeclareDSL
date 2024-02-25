package nl.esi.comma.behavior.scl.generator;

import dk.brics.automaton.Automaton;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class ConstraintStateMachine {
  private String name = new String();
  
  private Map<String, Character> unicodeMap = new HashMap<String, Character>();
  
  private List<Automaton> automataList = new ArrayList<Automaton>();
  
  private Automaton fa = new Automaton();
  
  public ConstraintStateMachine(final String _name, final Map<String, Character> _unicodeMap, final List<Automaton> _automataList) {
    this.name = _name;
    Set<String> _keySet = _unicodeMap.keySet();
    for (final String k : _keySet) {
      this.unicodeMap.put(k, _unicodeMap.get(k));
    }
    for (final Automaton elm : _automataList) {
      this.automataList.add(elm.clone());
    }
  }
  
  public String getName() {
    return this.name;
  }
  
  public Map<String, Character> getUnicodeMap() {
    return this.unicodeMap;
  }
  
  public List<Automaton> getAutomataList() {
    return this.automataList;
  }
  
  public Automaton getComputedAutomata() {
    return this.fa;
  }
  
  public String getStepName(final char c) {
    Set<String> _keySet = this.unicodeMap.keySet();
    for (final String k : _keySet) {
      boolean _equals = Character.valueOf(c).equals(this.unicodeMap.get(k));
      if (_equals) {
        return k;
      }
    }
    return " ANY ";
  }
  
  public void printUnicodeMap() {
    Set<String> _keySet = this.unicodeMap.keySet();
    for (final String k : _keySet) {
      Character _get = this.unicodeMap.get(k);
      String _plus = ((("Key : " + k) + " Value : ") + _get);
      System.out.println(_plus);
    }
  }
  
  public Process computeAutomaton(final String path) {
    Process _xblockexpression = null;
    {
      Automaton _automaton = new Automaton();
      this.fa = _automaton;
      Process _xifexpression = null;
      int _size = this.automataList.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        Process _xblockexpression_1 = null;
        {
          this.fa = this.automataList.get(0);
          for (int i = 1; (i < this.automataList.size()); i++) {
            this.fa = this.fa.intersection(this.automataList.get(i));
          }
          _xblockexpression_1 = this.displayAutomaton(this.fa, path, true);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Process displayAutomaton(final Automaton fa, final String path, final boolean useProvidedLabels) {
    try {
      Process _xblockexpression = null;
      {
        this.printUnicodeMap();
        String fname = (this.name + ".dot");
        try (BufferedWriter out = new Function0<BufferedWriter>() {
          @Override
          public BufferedWriter apply() {
            try {
              FileOutputStream _fileOutputStream = new FileOutputStream((path + fname));
              OutputStreamWriter _outputStreamWriter = new OutputStreamWriter(_fileOutputStream);
              return new BufferedWriter(_outputStreamWriter);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        }.apply()) {
          try {
            out.write(this.transformWithLabels(fa.toDot(), useProvidedLabels));
          } catch (final Throwable _t) {
            if (_t instanceof IOException) {
              final IOException e = (IOException)_t;
              e.printStackTrace();
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        } catch (final Throwable _t) {
          if (_t instanceof FileNotFoundException) {
            final FileNotFoundException e1 = (FileNotFoundException)_t;
            e1.printStackTrace();
          } else if (_t instanceof IOException) {
            final IOException e1_1 = (IOException)_t;
            e1_1.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", ("dot -Tpng -O " + fname));
        builder.redirectErrorStream(true);
        Process p = null;
        try {
          p = builder.start();
        } catch (final Throwable _t) {
          if (_t instanceof IOException) {
            final IOException e = (IOException)_t;
            e.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        InputStream _inputStream = p.getInputStream();
        InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
        BufferedReader r = new BufferedReader(_inputStreamReader);
        String line = null;
        do {
          try {
            line = r.readLine();
          } catch (final Throwable _t) {
            if (_t instanceof IOException) {
              final IOException e = (IOException)_t;
              e.printStackTrace();
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        } while((line != null));
        String expr1 = (((("dot -Tpng " + path) + fname) + " -O ") + fname);
        TimeUnit.SECONDS.sleep(3);
        String expr2 = ((("rundll32.exe \"C:\\Program Files\\Windows Photo Viewer\\PhotoViewer.dll\", ImageView_Fullscreen " + path) + fname) + ".png");
        try {
          Runtime.getRuntime().exec(expr1);
        } catch (final Throwable _t) {
          if (_t instanceof IOException) {
            final IOException e = (IOException)_t;
            e.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        Process _xtrycatchfinallyexpression = null;
        try {
          _xtrycatchfinallyexpression = Runtime.getRuntime().exec(expr2);
        } catch (final Throwable _t) {
          if (_t instanceof IOException) {
            final IOException e = (IOException)_t;
            e.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        _xblockexpression = _xtrycatchfinallyexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String transformWithLabels(final String str, final boolean useProvidedLabels) {
    String final_str = str;
    if (useProvidedLabels) {
      Set<String> _keySet = this.unicodeMap.keySet();
      for (final String key : _keySet) {
        {
          String _string = this.unicodeMap.get(key).toString();
          String _plus = ("[label=\"" + _string);
          String _plus_1 = (_plus + "\"]");
          boolean _contains = final_str.contains(_plus_1);
          if (_contains) {
            String _string_1 = this.unicodeMap.get(key).toString();
            String _plus_2 = ("[label=\"" + _string_1);
            String _plus_3 = (_plus_2 + "\"]");
            final_str = final_str.replace(_plus_3, (("[label=\"" + key) + "\"]"));
          }
          String _format = String.format("%04x", Integer.valueOf(Character.getNumericValue((this.unicodeMap.get(key)).charValue())));
          String _plus_4 = (("[label=\"" + "\\u") + _format);
          String _plus_5 = (_plus_4 + "\"]");
          boolean _contains_1 = final_str.contains(_plus_5);
          if (_contains_1) {
            String _format_1 = String.format("%04x", Integer.valueOf(Character.getNumericValue((this.unicodeMap.get(key)).charValue())));
            String _plus_6 = (("[label=\"" + "\\u") + _format_1);
            String _plus_7 = (_plus_6 + "\"]");
            final_str = final_str.replace(_plus_7, (("[label=\"" + key) + "\"]"));
          }
        }
      }
    }
    return final_str;
  }
}
