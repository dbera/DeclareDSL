/*
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.parser.antlr;

import com.google.inject.Inject;
import nl.esi.comma.behavior.scl.parser.antlr.internal.InternalSclParser;
import nl.esi.comma.behavior.scl.services.SclGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SclParser extends AbstractAntlrParser {

	@Inject
	private SclGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSclParser createParser(XtextTokenStream stream) {
		return new InternalSclParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public SclGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SclGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
