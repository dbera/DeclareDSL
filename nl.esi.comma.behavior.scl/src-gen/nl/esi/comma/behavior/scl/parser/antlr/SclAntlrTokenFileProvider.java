/*
 * generated by Xtext 2.25.0
 */
package nl.esi.comma.behavior.scl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SclAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("nl/esi/comma/behavior/scl/parser/antlr/internal/InternalScl.tokens");
	}
}