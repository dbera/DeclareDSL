package nl.esi.comma.expressions.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import nl.esi.comma.expressions.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOL_LITERAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'and'", "'OR'", "'or'", "'NOT'", "'not'", "'exists'", "'forAll'", "'delete'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'+'", "'-'", "'*'", "'/'", "'max'", "'min'", "'mod'", "'^'", "'('", "')'", "'in'", "':'", "'['", "']'", "','", "'{'", "'}'", "'->'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_BOOL_LITERAL=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExpressions.g"; }


    	private ExpressionsGrammarAccess grammarAccess;

    	public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleVariable"
    // InternalExpressions.g:53:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalExpressions.g:54:1: ( ruleVariable EOF )
            // InternalExpressions.g:55:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalExpressions.g:62:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:66:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalExpressions.g:67:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalExpressions.g:67:2: ( ( rule__Variable__NameAssignment ) )
            // InternalExpressions.g:68:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalExpressions.g:69:3: ( rule__Variable__NameAssignment )
            // InternalExpressions.g:69:4: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // InternalExpressions.g:78:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalExpressions.g:79:1: ( ruleExpression EOF )
            // InternalExpressions.g:80:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalExpressions.g:87:1: ruleExpression : ( ruleExpressionLevel1 ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:91:2: ( ( ruleExpressionLevel1 ) )
            // InternalExpressions.g:92:2: ( ruleExpressionLevel1 )
            {
            // InternalExpressions.g:92:2: ( ruleExpressionLevel1 )
            // InternalExpressions.g:93:3: ruleExpressionLevel1
            {
             before(grammarAccess.getExpressionAccess().getExpressionLevel1ParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel1();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpressionLevel1ParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalExpressions.g:103:1: entryRuleExpressionLevel1 : ruleExpressionLevel1 EOF ;
    public final void entryRuleExpressionLevel1() throws RecognitionException {
        try {
            // InternalExpressions.g:104:1: ( ruleExpressionLevel1 EOF )
            // InternalExpressions.g:105:1: ruleExpressionLevel1 EOF
            {
             before(grammarAccess.getExpressionLevel1Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel1();

            state._fsp--;

             after(grammarAccess.getExpressionLevel1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalExpressions.g:112:1: ruleExpressionLevel1 : ( ( rule__ExpressionLevel1__Group__0 ) ) ;
    public final void ruleExpressionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:116:2: ( ( ( rule__ExpressionLevel1__Group__0 ) ) )
            // InternalExpressions.g:117:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            {
            // InternalExpressions.g:117:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            // InternalExpressions.g:118:3: ( rule__ExpressionLevel1__Group__0 )
            {
             before(grammarAccess.getExpressionLevel1Access().getGroup()); 
            // InternalExpressions.g:119:3: ( rule__ExpressionLevel1__Group__0 )
            // InternalExpressions.g:119:4: rule__ExpressionLevel1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalExpressions.g:128:1: entryRuleExpressionLevel2 : ruleExpressionLevel2 EOF ;
    public final void entryRuleExpressionLevel2() throws RecognitionException {
        try {
            // InternalExpressions.g:129:1: ( ruleExpressionLevel2 EOF )
            // InternalExpressions.g:130:1: ruleExpressionLevel2 EOF
            {
             before(grammarAccess.getExpressionLevel2Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel2();

            state._fsp--;

             after(grammarAccess.getExpressionLevel2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalExpressions.g:137:1: ruleExpressionLevel2 : ( ( rule__ExpressionLevel2__Group__0 ) ) ;
    public final void ruleExpressionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:141:2: ( ( ( rule__ExpressionLevel2__Group__0 ) ) )
            // InternalExpressions.g:142:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            {
            // InternalExpressions.g:142:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            // InternalExpressions.g:143:3: ( rule__ExpressionLevel2__Group__0 )
            {
             before(grammarAccess.getExpressionLevel2Access().getGroup()); 
            // InternalExpressions.g:144:3: ( rule__ExpressionLevel2__Group__0 )
            // InternalExpressions.g:144:4: rule__ExpressionLevel2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalExpressions.g:153:1: entryRuleExpressionLevel3 : ruleExpressionLevel3 EOF ;
    public final void entryRuleExpressionLevel3() throws RecognitionException {
        try {
            // InternalExpressions.g:154:1: ( ruleExpressionLevel3 EOF )
            // InternalExpressions.g:155:1: ruleExpressionLevel3 EOF
            {
             before(grammarAccess.getExpressionLevel3Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel3();

            state._fsp--;

             after(grammarAccess.getExpressionLevel3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalExpressions.g:162:1: ruleExpressionLevel3 : ( ( rule__ExpressionLevel3__Group__0 ) ) ;
    public final void ruleExpressionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:166:2: ( ( ( rule__ExpressionLevel3__Group__0 ) ) )
            // InternalExpressions.g:167:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            {
            // InternalExpressions.g:167:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            // InternalExpressions.g:168:3: ( rule__ExpressionLevel3__Group__0 )
            {
             before(grammarAccess.getExpressionLevel3Access().getGroup()); 
            // InternalExpressions.g:169:3: ( rule__ExpressionLevel3__Group__0 )
            // InternalExpressions.g:169:4: rule__ExpressionLevel3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalExpressions.g:178:1: entryRuleExpressionLevel4 : ruleExpressionLevel4 EOF ;
    public final void entryRuleExpressionLevel4() throws RecognitionException {
        try {
            // InternalExpressions.g:179:1: ( ruleExpressionLevel4 EOF )
            // InternalExpressions.g:180:1: ruleExpressionLevel4 EOF
            {
             before(grammarAccess.getExpressionLevel4Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel4();

            state._fsp--;

             after(grammarAccess.getExpressionLevel4Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalExpressions.g:187:1: ruleExpressionLevel4 : ( ( rule__ExpressionLevel4__Group__0 ) ) ;
    public final void ruleExpressionLevel4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:191:2: ( ( ( rule__ExpressionLevel4__Group__0 ) ) )
            // InternalExpressions.g:192:2: ( ( rule__ExpressionLevel4__Group__0 ) )
            {
            // InternalExpressions.g:192:2: ( ( rule__ExpressionLevel4__Group__0 ) )
            // InternalExpressions.g:193:3: ( rule__ExpressionLevel4__Group__0 )
            {
             before(grammarAccess.getExpressionLevel4Access().getGroup()); 
            // InternalExpressions.g:194:3: ( rule__ExpressionLevel4__Group__0 )
            // InternalExpressions.g:194:4: rule__ExpressionLevel4__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel4Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalExpressions.g:203:1: entryRuleExpressionLevel5 : ruleExpressionLevel5 EOF ;
    public final void entryRuleExpressionLevel5() throws RecognitionException {
        try {
            // InternalExpressions.g:204:1: ( ruleExpressionLevel5 EOF )
            // InternalExpressions.g:205:1: ruleExpressionLevel5 EOF
            {
             before(grammarAccess.getExpressionLevel5Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel5();

            state._fsp--;

             after(grammarAccess.getExpressionLevel5Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalExpressions.g:212:1: ruleExpressionLevel5 : ( ( rule__ExpressionLevel5__Group__0 ) ) ;
    public final void ruleExpressionLevel5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:216:2: ( ( ( rule__ExpressionLevel5__Group__0 ) ) )
            // InternalExpressions.g:217:2: ( ( rule__ExpressionLevel5__Group__0 ) )
            {
            // InternalExpressions.g:217:2: ( ( rule__ExpressionLevel5__Group__0 ) )
            // InternalExpressions.g:218:3: ( rule__ExpressionLevel5__Group__0 )
            {
             before(grammarAccess.getExpressionLevel5Access().getGroup()); 
            // InternalExpressions.g:219:3: ( rule__ExpressionLevel5__Group__0 )
            // InternalExpressions.g:219:4: rule__ExpressionLevel5__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel5Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionLevel6"
    // InternalExpressions.g:228:1: entryRuleExpressionLevel6 : ruleExpressionLevel6 EOF ;
    public final void entryRuleExpressionLevel6() throws RecognitionException {
        try {
            // InternalExpressions.g:229:1: ( ruleExpressionLevel6 EOF )
            // InternalExpressions.g:230:1: ruleExpressionLevel6 EOF
            {
             before(grammarAccess.getExpressionLevel6Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel6();

            state._fsp--;

             after(grammarAccess.getExpressionLevel6Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel6"


    // $ANTLR start "ruleExpressionLevel6"
    // InternalExpressions.g:237:1: ruleExpressionLevel6 : ( ( rule__ExpressionLevel6__Group__0 ) ) ;
    public final void ruleExpressionLevel6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:241:2: ( ( ( rule__ExpressionLevel6__Group__0 ) ) )
            // InternalExpressions.g:242:2: ( ( rule__ExpressionLevel6__Group__0 ) )
            {
            // InternalExpressions.g:242:2: ( ( rule__ExpressionLevel6__Group__0 ) )
            // InternalExpressions.g:243:3: ( rule__ExpressionLevel6__Group__0 )
            {
             before(grammarAccess.getExpressionLevel6Access().getGroup()); 
            // InternalExpressions.g:244:3: ( rule__ExpressionLevel6__Group__0 )
            // InternalExpressions.g:244:4: rule__ExpressionLevel6__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel6__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel6Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel6"


    // $ANTLR start "entryRuleExpressionLevel7"
    // InternalExpressions.g:253:1: entryRuleExpressionLevel7 : ruleExpressionLevel7 EOF ;
    public final void entryRuleExpressionLevel7() throws RecognitionException {
        try {
            // InternalExpressions.g:254:1: ( ruleExpressionLevel7 EOF )
            // InternalExpressions.g:255:1: ruleExpressionLevel7 EOF
            {
             before(grammarAccess.getExpressionLevel7Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel7();

            state._fsp--;

             after(grammarAccess.getExpressionLevel7Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel7"


    // $ANTLR start "ruleExpressionLevel7"
    // InternalExpressions.g:262:1: ruleExpressionLevel7 : ( ( rule__ExpressionLevel7__Alternatives ) ) ;
    public final void ruleExpressionLevel7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:266:2: ( ( ( rule__ExpressionLevel7__Alternatives ) ) )
            // InternalExpressions.g:267:2: ( ( rule__ExpressionLevel7__Alternatives ) )
            {
            // InternalExpressions.g:267:2: ( ( rule__ExpressionLevel7__Alternatives ) )
            // InternalExpressions.g:268:3: ( rule__ExpressionLevel7__Alternatives )
            {
             before(grammarAccess.getExpressionLevel7Access().getAlternatives()); 
            // InternalExpressions.g:269:3: ( rule__ExpressionLevel7__Alternatives )
            // InternalExpressions.g:269:4: rule__ExpressionLevel7__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel7__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel7Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel7"


    // $ANTLR start "entryRuleExpressionNot"
    // InternalExpressions.g:278:1: entryRuleExpressionNot : ruleExpressionNot EOF ;
    public final void entryRuleExpressionNot() throws RecognitionException {
        try {
            // InternalExpressions.g:279:1: ( ruleExpressionNot EOF )
            // InternalExpressions.g:280:1: ruleExpressionNot EOF
            {
             before(grammarAccess.getExpressionNotRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionNot();

            state._fsp--;

             after(grammarAccess.getExpressionNotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionNot"


    // $ANTLR start "ruleExpressionNot"
    // InternalExpressions.g:287:1: ruleExpressionNot : ( ( rule__ExpressionNot__Group__0 ) ) ;
    public final void ruleExpressionNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:291:2: ( ( ( rule__ExpressionNot__Group__0 ) ) )
            // InternalExpressions.g:292:2: ( ( rule__ExpressionNot__Group__0 ) )
            {
            // InternalExpressions.g:292:2: ( ( rule__ExpressionNot__Group__0 ) )
            // InternalExpressions.g:293:3: ( rule__ExpressionNot__Group__0 )
            {
             before(grammarAccess.getExpressionNotAccess().getGroup()); 
            // InternalExpressions.g:294:3: ( rule__ExpressionNot__Group__0 )
            // InternalExpressions.g:294:4: rule__ExpressionNot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionNot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionNotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionNot"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalExpressions.g:303:1: entryRuleExpressionMinus : ruleExpressionMinus EOF ;
    public final void entryRuleExpressionMinus() throws RecognitionException {
        try {
            // InternalExpressions.g:304:1: ( ruleExpressionMinus EOF )
            // InternalExpressions.g:305:1: ruleExpressionMinus EOF
            {
             before(grammarAccess.getExpressionMinusRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionMinus();

            state._fsp--;

             after(grammarAccess.getExpressionMinusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalExpressions.g:312:1: ruleExpressionMinus : ( ( rule__ExpressionMinus__Group__0 ) ) ;
    public final void ruleExpressionMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:316:2: ( ( ( rule__ExpressionMinus__Group__0 ) ) )
            // InternalExpressions.g:317:2: ( ( rule__ExpressionMinus__Group__0 ) )
            {
            // InternalExpressions.g:317:2: ( ( rule__ExpressionMinus__Group__0 ) )
            // InternalExpressions.g:318:3: ( rule__ExpressionMinus__Group__0 )
            {
             before(grammarAccess.getExpressionMinusAccess().getGroup()); 
            // InternalExpressions.g:319:3: ( rule__ExpressionMinus__Group__0 )
            // InternalExpressions.g:319:4: rule__ExpressionMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalExpressions.g:328:1: entryRuleExpressionPlus : ruleExpressionPlus EOF ;
    public final void entryRuleExpressionPlus() throws RecognitionException {
        try {
            // InternalExpressions.g:329:1: ( ruleExpressionPlus EOF )
            // InternalExpressions.g:330:1: ruleExpressionPlus EOF
            {
             before(grammarAccess.getExpressionPlusRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionPlus();

            state._fsp--;

             after(grammarAccess.getExpressionPlusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalExpressions.g:337:1: ruleExpressionPlus : ( ( rule__ExpressionPlus__Group__0 ) ) ;
    public final void ruleExpressionPlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:341:2: ( ( ( rule__ExpressionPlus__Group__0 ) ) )
            // InternalExpressions.g:342:2: ( ( rule__ExpressionPlus__Group__0 ) )
            {
            // InternalExpressions.g:342:2: ( ( rule__ExpressionPlus__Group__0 ) )
            // InternalExpressions.g:343:3: ( rule__ExpressionPlus__Group__0 )
            {
             before(grammarAccess.getExpressionPlusAccess().getGroup()); 
            // InternalExpressions.g:344:3: ( rule__ExpressionPlus__Group__0 )
            // InternalExpressions.g:344:4: rule__ExpressionPlus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionPlusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel8"
    // InternalExpressions.g:353:1: entryRuleExpressionLevel8 : ruleExpressionLevel8 EOF ;
    public final void entryRuleExpressionLevel8() throws RecognitionException {
        try {
            // InternalExpressions.g:354:1: ( ruleExpressionLevel8 EOF )
            // InternalExpressions.g:355:1: ruleExpressionLevel8 EOF
            {
             before(grammarAccess.getExpressionLevel8Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel8();

            state._fsp--;

             after(grammarAccess.getExpressionLevel8Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionLevel8"


    // $ANTLR start "ruleExpressionLevel8"
    // InternalExpressions.g:362:1: ruleExpressionLevel8 : ( ( rule__ExpressionLevel8__Alternatives ) ) ;
    public final void ruleExpressionLevel8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:366:2: ( ( ( rule__ExpressionLevel8__Alternatives ) ) )
            // InternalExpressions.g:367:2: ( ( rule__ExpressionLevel8__Alternatives ) )
            {
            // InternalExpressions.g:367:2: ( ( rule__ExpressionLevel8__Alternatives ) )
            // InternalExpressions.g:368:3: ( rule__ExpressionLevel8__Alternatives )
            {
             before(grammarAccess.getExpressionLevel8Access().getAlternatives()); 
            // InternalExpressions.g:369:3: ( rule__ExpressionLevel8__Alternatives )
            // InternalExpressions.g:369:4: rule__ExpressionLevel8__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel8__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel8Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionLevel8"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalExpressions.g:378:1: entryRuleExpressionBracket : ruleExpressionBracket EOF ;
    public final void entryRuleExpressionBracket() throws RecognitionException {
        try {
            // InternalExpressions.g:379:1: ( ruleExpressionBracket EOF )
            // InternalExpressions.g:380:1: ruleExpressionBracket EOF
            {
             before(grammarAccess.getExpressionBracketRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionBracket();

            state._fsp--;

             after(grammarAccess.getExpressionBracketRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalExpressions.g:387:1: ruleExpressionBracket : ( ( rule__ExpressionBracket__Group__0 ) ) ;
    public final void ruleExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:391:2: ( ( ( rule__ExpressionBracket__Group__0 ) ) )
            // InternalExpressions.g:392:2: ( ( rule__ExpressionBracket__Group__0 ) )
            {
            // InternalExpressions.g:392:2: ( ( rule__ExpressionBracket__Group__0 ) )
            // InternalExpressions.g:393:3: ( rule__ExpressionBracket__Group__0 )
            {
             before(grammarAccess.getExpressionBracketAccess().getGroup()); 
            // InternalExpressions.g:394:3: ( rule__ExpressionBracket__Group__0 )
            // InternalExpressions.g:394:4: rule__ExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBracketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantBool"
    // InternalExpressions.g:403:1: entryRuleExpressionConstantBool : ruleExpressionConstantBool EOF ;
    public final void entryRuleExpressionConstantBool() throws RecognitionException {
        try {
            // InternalExpressions.g:404:1: ( ruleExpressionConstantBool EOF )
            // InternalExpressions.g:405:1: ruleExpressionConstantBool EOF
            {
             before(grammarAccess.getExpressionConstantBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionConstantBool();

            state._fsp--;

             after(grammarAccess.getExpressionConstantBoolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionConstantBool"


    // $ANTLR start "ruleExpressionConstantBool"
    // InternalExpressions.g:412:1: ruleExpressionConstantBool : ( ( rule__ExpressionConstantBool__ValueAssignment ) ) ;
    public final void ruleExpressionConstantBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:416:2: ( ( ( rule__ExpressionConstantBool__ValueAssignment ) ) )
            // InternalExpressions.g:417:2: ( ( rule__ExpressionConstantBool__ValueAssignment ) )
            {
            // InternalExpressions.g:417:2: ( ( rule__ExpressionConstantBool__ValueAssignment ) )
            // InternalExpressions.g:418:3: ( rule__ExpressionConstantBool__ValueAssignment )
            {
             before(grammarAccess.getExpressionConstantBoolAccess().getValueAssignment()); 
            // InternalExpressions.g:419:3: ( rule__ExpressionConstantBool__ValueAssignment )
            // InternalExpressions.g:419:4: rule__ExpressionConstantBool__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionConstantBool__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionConstantBoolAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionConstantBool"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalExpressions.g:428:1: entryRuleExpressionConstantInt : ruleExpressionConstantInt EOF ;
    public final void entryRuleExpressionConstantInt() throws RecognitionException {
        try {
            // InternalExpressions.g:429:1: ( ruleExpressionConstantInt EOF )
            // InternalExpressions.g:430:1: ruleExpressionConstantInt EOF
            {
             before(grammarAccess.getExpressionConstantIntRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionConstantInt();

            state._fsp--;

             after(grammarAccess.getExpressionConstantIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalExpressions.g:437:1: ruleExpressionConstantInt : ( ( rule__ExpressionConstantInt__ValueAssignment ) ) ;
    public final void ruleExpressionConstantInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:441:2: ( ( ( rule__ExpressionConstantInt__ValueAssignment ) ) )
            // InternalExpressions.g:442:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            {
            // InternalExpressions.g:442:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            // InternalExpressions.g:443:3: ( rule__ExpressionConstantInt__ValueAssignment )
            {
             before(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 
            // InternalExpressions.g:444:3: ( rule__ExpressionConstantInt__ValueAssignment )
            // InternalExpressions.g:444:4: rule__ExpressionConstantInt__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionConstantInt__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "entryRuleExpressionConstantString"
    // InternalExpressions.g:453:1: entryRuleExpressionConstantString : ruleExpressionConstantString EOF ;
    public final void entryRuleExpressionConstantString() throws RecognitionException {
        try {
            // InternalExpressions.g:454:1: ( ruleExpressionConstantString EOF )
            // InternalExpressions.g:455:1: ruleExpressionConstantString EOF
            {
             before(grammarAccess.getExpressionConstantStringRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionConstantString();

            state._fsp--;

             after(grammarAccess.getExpressionConstantStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionConstantString"


    // $ANTLR start "ruleExpressionConstantString"
    // InternalExpressions.g:462:1: ruleExpressionConstantString : ( ( rule__ExpressionConstantString__ValueAssignment ) ) ;
    public final void ruleExpressionConstantString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:466:2: ( ( ( rule__ExpressionConstantString__ValueAssignment ) ) )
            // InternalExpressions.g:467:2: ( ( rule__ExpressionConstantString__ValueAssignment ) )
            {
            // InternalExpressions.g:467:2: ( ( rule__ExpressionConstantString__ValueAssignment ) )
            // InternalExpressions.g:468:3: ( rule__ExpressionConstantString__ValueAssignment )
            {
             before(grammarAccess.getExpressionConstantStringAccess().getValueAssignment()); 
            // InternalExpressions.g:469:3: ( rule__ExpressionConstantString__ValueAssignment )
            // InternalExpressions.g:469:4: rule__ExpressionConstantString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionConstantString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionConstantStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionConstantString"


    // $ANTLR start "entryRuleExpressionVariable"
    // InternalExpressions.g:478:1: entryRuleExpressionVariable : ruleExpressionVariable EOF ;
    public final void entryRuleExpressionVariable() throws RecognitionException {
        try {
            // InternalExpressions.g:479:1: ( ruleExpressionVariable EOF )
            // InternalExpressions.g:480:1: ruleExpressionVariable EOF
            {
             before(grammarAccess.getExpressionVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionVariable();

            state._fsp--;

             after(grammarAccess.getExpressionVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionVariable"


    // $ANTLR start "ruleExpressionVariable"
    // InternalExpressions.g:487:1: ruleExpressionVariable : ( ( rule__ExpressionVariable__NameAssignment ) ) ;
    public final void ruleExpressionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:491:2: ( ( ( rule__ExpressionVariable__NameAssignment ) ) )
            // InternalExpressions.g:492:2: ( ( rule__ExpressionVariable__NameAssignment ) )
            {
            // InternalExpressions.g:492:2: ( ( rule__ExpressionVariable__NameAssignment ) )
            // InternalExpressions.g:493:3: ( rule__ExpressionVariable__NameAssignment )
            {
             before(grammarAccess.getExpressionVariableAccess().getNameAssignment()); 
            // InternalExpressions.g:494:3: ( rule__ExpressionVariable__NameAssignment )
            // InternalExpressions.g:494:4: rule__ExpressionVariable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionVariable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionVariable"


    // $ANTLR start "entryRuleExpressionQuantifier"
    // InternalExpressions.g:503:1: entryRuleExpressionQuantifier : ruleExpressionQuantifier EOF ;
    public final void entryRuleExpressionQuantifier() throws RecognitionException {
        try {
            // InternalExpressions.g:504:1: ( ruleExpressionQuantifier EOF )
            // InternalExpressions.g:505:1: ruleExpressionQuantifier EOF
            {
             before(grammarAccess.getExpressionQuantifierRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionQuantifier();

            state._fsp--;

             after(grammarAccess.getExpressionQuantifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionQuantifier"


    // $ANTLR start "ruleExpressionQuantifier"
    // InternalExpressions.g:512:1: ruleExpressionQuantifier : ( ( rule__ExpressionQuantifier__Group__0 ) ) ;
    public final void ruleExpressionQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:516:2: ( ( ( rule__ExpressionQuantifier__Group__0 ) ) )
            // InternalExpressions.g:517:2: ( ( rule__ExpressionQuantifier__Group__0 ) )
            {
            // InternalExpressions.g:517:2: ( ( rule__ExpressionQuantifier__Group__0 ) )
            // InternalExpressions.g:518:3: ( rule__ExpressionQuantifier__Group__0 )
            {
             before(grammarAccess.getExpressionQuantifierAccess().getGroup()); 
            // InternalExpressions.g:519:3: ( rule__ExpressionQuantifier__Group__0 )
            // InternalExpressions.g:519:4: rule__ExpressionQuantifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionQuantifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionQuantifier"


    // $ANTLR start "entryRuleExpressionTypeAnnotated"
    // InternalExpressions.g:528:1: entryRuleExpressionTypeAnnotated : ruleExpressionTypeAnnotated EOF ;
    public final void entryRuleExpressionTypeAnnotated() throws RecognitionException {
        try {
            // InternalExpressions.g:529:1: ( ruleExpressionTypeAnnotated EOF )
            // InternalExpressions.g:530:1: ruleExpressionTypeAnnotated EOF
            {
             before(grammarAccess.getExpressionTypeAnnotatedRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionTypeAnnotated();

            state._fsp--;

             after(grammarAccess.getExpressionTypeAnnotatedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionTypeAnnotated"


    // $ANTLR start "ruleExpressionTypeAnnotated"
    // InternalExpressions.g:537:1: ruleExpressionTypeAnnotated : ( ( rule__ExpressionTypeAnnotated__Group__0 ) ) ;
    public final void ruleExpressionTypeAnnotated() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:541:2: ( ( ( rule__ExpressionTypeAnnotated__Group__0 ) ) )
            // InternalExpressions.g:542:2: ( ( rule__ExpressionTypeAnnotated__Group__0 ) )
            {
            // InternalExpressions.g:542:2: ( ( rule__ExpressionTypeAnnotated__Group__0 ) )
            // InternalExpressions.g:543:3: ( rule__ExpressionTypeAnnotated__Group__0 )
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup()); 
            // InternalExpressions.g:544:3: ( rule__ExpressionTypeAnnotated__Group__0 )
            // InternalExpressions.g:544:4: rule__ExpressionTypeAnnotated__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionTypeAnnotated"


    // $ANTLR start "entryRuleTypeAnnotation"
    // InternalExpressions.g:553:1: entryRuleTypeAnnotation : ruleTypeAnnotation EOF ;
    public final void entryRuleTypeAnnotation() throws RecognitionException {
        try {
            // InternalExpressions.g:554:1: ( ruleTypeAnnotation EOF )
            // InternalExpressions.g:555:1: ruleTypeAnnotation EOF
            {
             before(grammarAccess.getTypeAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeAnnotation();

            state._fsp--;

             after(grammarAccess.getTypeAnnotationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeAnnotation"


    // $ANTLR start "ruleTypeAnnotation"
    // InternalExpressions.g:562:1: ruleTypeAnnotation : ( ( rule__TypeAnnotation__Group__0 ) ) ;
    public final void ruleTypeAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:566:2: ( ( ( rule__TypeAnnotation__Group__0 ) ) )
            // InternalExpressions.g:567:2: ( ( rule__TypeAnnotation__Group__0 ) )
            {
            // InternalExpressions.g:567:2: ( ( rule__TypeAnnotation__Group__0 ) )
            // InternalExpressions.g:568:3: ( rule__TypeAnnotation__Group__0 )
            {
             before(grammarAccess.getTypeAnnotationAccess().getGroup()); 
            // InternalExpressions.g:569:3: ( rule__TypeAnnotation__Group__0 )
            // InternalExpressions.g:569:4: rule__TypeAnnotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeAnnotation"


    // $ANTLR start "entryRulePair"
    // InternalExpressions.g:578:1: entryRulePair : rulePair EOF ;
    public final void entryRulePair() throws RecognitionException {
        try {
            // InternalExpressions.g:579:1: ( rulePair EOF )
            // InternalExpressions.g:580:1: rulePair EOF
            {
             before(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            rulePair();

            state._fsp--;

             after(grammarAccess.getPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalExpressions.g:587:1: rulePair : ( ( rule__Pair__Group__0 ) ) ;
    public final void rulePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:591:2: ( ( ( rule__Pair__Group__0 ) ) )
            // InternalExpressions.g:592:2: ( ( rule__Pair__Group__0 ) )
            {
            // InternalExpressions.g:592:2: ( ( rule__Pair__Group__0 ) )
            // InternalExpressions.g:593:3: ( rule__Pair__Group__0 )
            {
             before(grammarAccess.getPairAccess().getGroup()); 
            // InternalExpressions.g:594:3: ( rule__Pair__Group__0 )
            // InternalExpressions.g:594:4: rule__Pair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePair"


    // $ANTLR start "ruleQUANTIFIER"
    // InternalExpressions.g:603:1: ruleQUANTIFIER : ( ( rule__QUANTIFIER__Alternatives ) ) ;
    public final void ruleQUANTIFIER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:607:1: ( ( ( rule__QUANTIFIER__Alternatives ) ) )
            // InternalExpressions.g:608:2: ( ( rule__QUANTIFIER__Alternatives ) )
            {
            // InternalExpressions.g:608:2: ( ( rule__QUANTIFIER__Alternatives ) )
            // InternalExpressions.g:609:3: ( rule__QUANTIFIER__Alternatives )
            {
             before(grammarAccess.getQUANTIFIERAccess().getAlternatives()); 
            // InternalExpressions.g:610:3: ( rule__QUANTIFIER__Alternatives )
            // InternalExpressions.g:610:4: rule__QUANTIFIER__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QUANTIFIER__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQUANTIFIERAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQUANTIFIER"


    // $ANTLR start "rule__ExpressionLevel1__Alternatives_1"
    // InternalExpressions.g:618:1: rule__ExpressionLevel1__Alternatives_1 : ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) );
    public final void rule__ExpressionLevel1__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:622:1: ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalExpressions.g:623:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    {
                    // InternalExpressions.g:623:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    // InternalExpressions.g:624:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 
                    // InternalExpressions.g:625:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    // InternalExpressions.g:625:4: rule__ExpressionLevel1__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:629:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    {
                    // InternalExpressions.g:629:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    // InternalExpressions.g:630:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 
                    // InternalExpressions.g:631:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    // InternalExpressions.g:631:4: rule__ExpressionLevel1__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel1__Alternatives_1_0_1"
    // InternalExpressions.g:639:1: rule__ExpressionLevel1__Alternatives_1_0_1 : ( ( 'AND' ) | ( 'and' ) );
    public final void rule__ExpressionLevel1__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:643:1: ( ( 'AND' ) | ( 'and' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExpressions.g:644:2: ( 'AND' )
                    {
                    // InternalExpressions.g:644:2: ( 'AND' )
                    // InternalExpressions.g:645:3: 'AND'
                    {
                     before(grammarAccess.getExpressionLevel1Access().getANDKeyword_1_0_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getExpressionLevel1Access().getANDKeyword_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:650:2: ( 'and' )
                    {
                    // InternalExpressions.g:650:2: ( 'and' )
                    // InternalExpressions.g:651:3: 'and'
                    {
                     before(grammarAccess.getExpressionLevel1Access().getAndKeyword_1_0_1_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getExpressionLevel1Access().getAndKeyword_1_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Alternatives_1_0_1"


    // $ANTLR start "rule__ExpressionLevel1__Alternatives_1_1_1"
    // InternalExpressions.g:660:1: rule__ExpressionLevel1__Alternatives_1_1_1 : ( ( 'OR' ) | ( 'or' ) );
    public final void rule__ExpressionLevel1__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:664:1: ( ( 'OR' ) | ( 'or' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalExpressions.g:665:2: ( 'OR' )
                    {
                    // InternalExpressions.g:665:2: ( 'OR' )
                    // InternalExpressions.g:666:3: 'OR'
                    {
                     before(grammarAccess.getExpressionLevel1Access().getORKeyword_1_1_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getExpressionLevel1Access().getORKeyword_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:671:2: ( 'or' )
                    {
                    // InternalExpressions.g:671:2: ( 'or' )
                    // InternalExpressions.g:672:3: 'or'
                    {
                     before(grammarAccess.getExpressionLevel1Access().getOrKeyword_1_1_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getExpressionLevel1Access().getOrKeyword_1_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Alternatives_1_1_1"


    // $ANTLR start "rule__ExpressionLevel2__Alternatives_1"
    // InternalExpressions.g:681:1: rule__ExpressionLevel2__Alternatives_1 : ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) );
    public final void rule__ExpressionLevel2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:685:1: ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExpressions.g:686:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    {
                    // InternalExpressions.g:686:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    // InternalExpressions.g:687:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 
                    // InternalExpressions.g:688:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    // InternalExpressions.g:688:4: rule__ExpressionLevel2__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:692:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    {
                    // InternalExpressions.g:692:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    // InternalExpressions.g:693:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 
                    // InternalExpressions.g:694:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    // InternalExpressions.g:694:4: rule__ExpressionLevel2__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel3__Alternatives_1"
    // InternalExpressions.g:702:1: rule__ExpressionLevel3__Alternatives_1 : ( ( ( rule__ExpressionLevel3__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel3__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel3__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel3__Group_1_3__0 ) ) );
    public final void rule__ExpressionLevel3__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:706:1: ( ( ( rule__ExpressionLevel3__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel3__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel3__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel3__Group_1_3__0 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalExpressions.g:707:2: ( ( rule__ExpressionLevel3__Group_1_0__0 ) )
                    {
                    // InternalExpressions.g:707:2: ( ( rule__ExpressionLevel3__Group_1_0__0 ) )
                    // InternalExpressions.g:708:3: ( rule__ExpressionLevel3__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpressionLevel3Access().getGroup_1_0()); 
                    // InternalExpressions.g:709:3: ( rule__ExpressionLevel3__Group_1_0__0 )
                    // InternalExpressions.g:709:4: rule__ExpressionLevel3__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel3__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel3Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:713:2: ( ( rule__ExpressionLevel3__Group_1_1__0 ) )
                    {
                    // InternalExpressions.g:713:2: ( ( rule__ExpressionLevel3__Group_1_1__0 ) )
                    // InternalExpressions.g:714:3: ( rule__ExpressionLevel3__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpressionLevel3Access().getGroup_1_1()); 
                    // InternalExpressions.g:715:3: ( rule__ExpressionLevel3__Group_1_1__0 )
                    // InternalExpressions.g:715:4: rule__ExpressionLevel3__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel3__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel3Access().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:719:2: ( ( rule__ExpressionLevel3__Group_1_2__0 ) )
                    {
                    // InternalExpressions.g:719:2: ( ( rule__ExpressionLevel3__Group_1_2__0 ) )
                    // InternalExpressions.g:720:3: ( rule__ExpressionLevel3__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpressionLevel3Access().getGroup_1_2()); 
                    // InternalExpressions.g:721:3: ( rule__ExpressionLevel3__Group_1_2__0 )
                    // InternalExpressions.g:721:4: rule__ExpressionLevel3__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel3__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel3Access().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpressions.g:725:2: ( ( rule__ExpressionLevel3__Group_1_3__0 ) )
                    {
                    // InternalExpressions.g:725:2: ( ( rule__ExpressionLevel3__Group_1_3__0 ) )
                    // InternalExpressions.g:726:3: ( rule__ExpressionLevel3__Group_1_3__0 )
                    {
                     before(grammarAccess.getExpressionLevel3Access().getGroup_1_3()); 
                    // InternalExpressions.g:727:3: ( rule__ExpressionLevel3__Group_1_3__0 )
                    // InternalExpressions.g:727:4: rule__ExpressionLevel3__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel3__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel3Access().getGroup_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel4__Alternatives_1"
    // InternalExpressions.g:735:1: rule__ExpressionLevel4__Alternatives_1 : ( ( ( rule__ExpressionLevel4__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel4__Group_1_1__0 ) ) );
    public final void rule__ExpressionLevel4__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:739:1: ( ( ( rule__ExpressionLevel4__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel4__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalExpressions.g:740:2: ( ( rule__ExpressionLevel4__Group_1_0__0 ) )
                    {
                    // InternalExpressions.g:740:2: ( ( rule__ExpressionLevel4__Group_1_0__0 ) )
                    // InternalExpressions.g:741:3: ( rule__ExpressionLevel4__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpressionLevel4Access().getGroup_1_0()); 
                    // InternalExpressions.g:742:3: ( rule__ExpressionLevel4__Group_1_0__0 )
                    // InternalExpressions.g:742:4: rule__ExpressionLevel4__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel4__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel4Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:746:2: ( ( rule__ExpressionLevel4__Group_1_1__0 ) )
                    {
                    // InternalExpressions.g:746:2: ( ( rule__ExpressionLevel4__Group_1_1__0 ) )
                    // InternalExpressions.g:747:3: ( rule__ExpressionLevel4__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpressionLevel4Access().getGroup_1_1()); 
                    // InternalExpressions.g:748:3: ( rule__ExpressionLevel4__Group_1_1__0 )
                    // InternalExpressions.g:748:4: rule__ExpressionLevel4__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel4__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel4Access().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel5__Alternatives_1"
    // InternalExpressions.g:756:1: rule__ExpressionLevel5__Alternatives_1 : ( ( ( rule__ExpressionLevel5__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel5__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel5__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel5__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel5__Group_1_4__0 ) ) );
    public final void rule__ExpressionLevel5__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:760:1: ( ( ( rule__ExpressionLevel5__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel5__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel5__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel5__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel5__Group_1_4__0 ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            case 32:
                {
                alt7=4;
                }
                break;
            case 33:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalExpressions.g:761:2: ( ( rule__ExpressionLevel5__Group_1_0__0 ) )
                    {
                    // InternalExpressions.g:761:2: ( ( rule__ExpressionLevel5__Group_1_0__0 ) )
                    // InternalExpressions.g:762:3: ( rule__ExpressionLevel5__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpressionLevel5Access().getGroup_1_0()); 
                    // InternalExpressions.g:763:3: ( rule__ExpressionLevel5__Group_1_0__0 )
                    // InternalExpressions.g:763:4: rule__ExpressionLevel5__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel5__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel5Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:767:2: ( ( rule__ExpressionLevel5__Group_1_1__0 ) )
                    {
                    // InternalExpressions.g:767:2: ( ( rule__ExpressionLevel5__Group_1_1__0 ) )
                    // InternalExpressions.g:768:3: ( rule__ExpressionLevel5__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpressionLevel5Access().getGroup_1_1()); 
                    // InternalExpressions.g:769:3: ( rule__ExpressionLevel5__Group_1_1__0 )
                    // InternalExpressions.g:769:4: rule__ExpressionLevel5__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel5__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel5Access().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:773:2: ( ( rule__ExpressionLevel5__Group_1_2__0 ) )
                    {
                    // InternalExpressions.g:773:2: ( ( rule__ExpressionLevel5__Group_1_2__0 ) )
                    // InternalExpressions.g:774:3: ( rule__ExpressionLevel5__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpressionLevel5Access().getGroup_1_2()); 
                    // InternalExpressions.g:775:3: ( rule__ExpressionLevel5__Group_1_2__0 )
                    // InternalExpressions.g:775:4: rule__ExpressionLevel5__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel5__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel5Access().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpressions.g:779:2: ( ( rule__ExpressionLevel5__Group_1_3__0 ) )
                    {
                    // InternalExpressions.g:779:2: ( ( rule__ExpressionLevel5__Group_1_3__0 ) )
                    // InternalExpressions.g:780:3: ( rule__ExpressionLevel5__Group_1_3__0 )
                    {
                     before(grammarAccess.getExpressionLevel5Access().getGroup_1_3()); 
                    // InternalExpressions.g:781:3: ( rule__ExpressionLevel5__Group_1_3__0 )
                    // InternalExpressions.g:781:4: rule__ExpressionLevel5__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel5__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel5Access().getGroup_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExpressions.g:785:2: ( ( rule__ExpressionLevel5__Group_1_4__0 ) )
                    {
                    // InternalExpressions.g:785:2: ( ( rule__ExpressionLevel5__Group_1_4__0 ) )
                    // InternalExpressions.g:786:3: ( rule__ExpressionLevel5__Group_1_4__0 )
                    {
                     before(grammarAccess.getExpressionLevel5Access().getGroup_1_4()); 
                    // InternalExpressions.g:787:3: ( rule__ExpressionLevel5__Group_1_4__0 )
                    // InternalExpressions.g:787:4: rule__ExpressionLevel5__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel5__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel5Access().getGroup_1_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel7__Alternatives"
    // InternalExpressions.g:795:1: rule__ExpressionLevel7__Alternatives : ( ( ruleExpressionNot ) | ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel8 ) );
    public final void rule__ExpressionLevel7__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:799:1: ( ( ruleExpressionNot ) | ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel8 ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 27:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
            case RULE_BOOL_LITERAL:
            case RULE_INT:
            case RULE_STRING:
            case 18:
            case 19:
            case 20:
            case 26:
            case 35:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalExpressions.g:800:2: ( ruleExpressionNot )
                    {
                    // InternalExpressions.g:800:2: ( ruleExpressionNot )
                    // InternalExpressions.g:801:3: ruleExpressionNot
                    {
                     before(grammarAccess.getExpressionLevel7Access().getExpressionNotParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionNot();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel7Access().getExpressionNotParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:806:2: ( ruleExpressionMinus )
                    {
                    // InternalExpressions.g:806:2: ( ruleExpressionMinus )
                    // InternalExpressions.g:807:3: ruleExpressionMinus
                    {
                     before(grammarAccess.getExpressionLevel7Access().getExpressionMinusParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionMinus();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel7Access().getExpressionMinusParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:812:2: ( ruleExpressionPlus )
                    {
                    // InternalExpressions.g:812:2: ( ruleExpressionPlus )
                    // InternalExpressions.g:813:3: ruleExpressionPlus
                    {
                     before(grammarAccess.getExpressionLevel7Access().getExpressionPlusParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionPlus();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel7Access().getExpressionPlusParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpressions.g:818:2: ( ruleExpressionLevel8 )
                    {
                    // InternalExpressions.g:818:2: ( ruleExpressionLevel8 )
                    // InternalExpressions.g:819:3: ruleExpressionLevel8
                    {
                     before(grammarAccess.getExpressionLevel7Access().getExpressionLevel8ParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionLevel8();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel7Access().getExpressionLevel8ParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel7__Alternatives"


    // $ANTLR start "rule__ExpressionNot__Alternatives_0"
    // InternalExpressions.g:828:1: rule__ExpressionNot__Alternatives_0 : ( ( 'NOT' ) | ( 'not' ) );
    public final void rule__ExpressionNot__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:832:1: ( ( 'NOT' ) | ( 'not' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalExpressions.g:833:2: ( 'NOT' )
                    {
                    // InternalExpressions.g:833:2: ( 'NOT' )
                    // InternalExpressions.g:834:3: 'NOT'
                    {
                     before(grammarAccess.getExpressionNotAccess().getNOTKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getExpressionNotAccess().getNOTKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:839:2: ( 'not' )
                    {
                    // InternalExpressions.g:839:2: ( 'not' )
                    // InternalExpressions.g:840:3: 'not'
                    {
                     before(grammarAccess.getExpressionNotAccess().getNotKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getExpressionNotAccess().getNotKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionNot__Alternatives_0"


    // $ANTLR start "rule__ExpressionLevel8__Alternatives"
    // InternalExpressions.g:849:1: rule__ExpressionLevel8__Alternatives : ( ( ruleExpressionBracket ) | ( ruleExpressionConstantBool ) | ( ruleExpressionConstantInt ) | ( ruleExpressionConstantString ) | ( ruleExpressionVariable ) | ( ruleExpressionQuantifier ) | ( ruleExpressionTypeAnnotated ) );
    public final void rule__ExpressionLevel8__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:853:1: ( ( ruleExpressionBracket ) | ( ruleExpressionConstantBool ) | ( ruleExpressionConstantInt ) | ( ruleExpressionConstantString ) | ( ruleExpressionVariable ) | ( ruleExpressionQuantifier ) | ( ruleExpressionTypeAnnotated ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt10=1;
                }
                break;
            case RULE_BOOL_LITERAL:
                {
                alt10=2;
                }
                break;
            case RULE_INT:
                {
                alt10=3;
                }
                break;
            case RULE_STRING:
                {
                alt10=4;
                }
                break;
            case RULE_ID:
                {
                alt10=5;
                }
                break;
            case 18:
            case 19:
            case 20:
                {
                alt10=6;
                }
                break;
            case 26:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalExpressions.g:854:2: ( ruleExpressionBracket )
                    {
                    // InternalExpressions.g:854:2: ( ruleExpressionBracket )
                    // InternalExpressions.g:855:3: ruleExpressionBracket
                    {
                     before(grammarAccess.getExpressionLevel8Access().getExpressionBracketParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionBracket();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel8Access().getExpressionBracketParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:860:2: ( ruleExpressionConstantBool )
                    {
                    // InternalExpressions.g:860:2: ( ruleExpressionConstantBool )
                    // InternalExpressions.g:861:3: ruleExpressionConstantBool
                    {
                     before(grammarAccess.getExpressionLevel8Access().getExpressionConstantBoolParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionConstantBool();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel8Access().getExpressionConstantBoolParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:866:2: ( ruleExpressionConstantInt )
                    {
                    // InternalExpressions.g:866:2: ( ruleExpressionConstantInt )
                    // InternalExpressions.g:867:3: ruleExpressionConstantInt
                    {
                     before(grammarAccess.getExpressionLevel8Access().getExpressionConstantIntParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionConstantInt();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel8Access().getExpressionConstantIntParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpressions.g:872:2: ( ruleExpressionConstantString )
                    {
                    // InternalExpressions.g:872:2: ( ruleExpressionConstantString )
                    // InternalExpressions.g:873:3: ruleExpressionConstantString
                    {
                     before(grammarAccess.getExpressionLevel8Access().getExpressionConstantStringParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionConstantString();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel8Access().getExpressionConstantStringParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExpressions.g:878:2: ( ruleExpressionVariable )
                    {
                    // InternalExpressions.g:878:2: ( ruleExpressionVariable )
                    // InternalExpressions.g:879:3: ruleExpressionVariable
                    {
                     before(grammarAccess.getExpressionLevel8Access().getExpressionVariableParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionVariable();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel8Access().getExpressionVariableParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExpressions.g:884:2: ( ruleExpressionQuantifier )
                    {
                    // InternalExpressions.g:884:2: ( ruleExpressionQuantifier )
                    // InternalExpressions.g:885:3: ruleExpressionQuantifier
                    {
                     before(grammarAccess.getExpressionLevel8Access().getExpressionQuantifierParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionQuantifier();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel8Access().getExpressionQuantifierParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalExpressions.g:890:2: ( ruleExpressionTypeAnnotated )
                    {
                    // InternalExpressions.g:890:2: ( ruleExpressionTypeAnnotated )
                    // InternalExpressions.g:891:3: ruleExpressionTypeAnnotated
                    {
                     before(grammarAccess.getExpressionLevel8Access().getExpressionTypeAnnotatedParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionTypeAnnotated();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel8Access().getExpressionTypeAnnotatedParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel8__Alternatives"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Alternatives_1"
    // InternalExpressions.g:900:1: rule__ExpressionTypeAnnotated__Alternatives_1 : ( ( ( rule__ExpressionTypeAnnotated__Group_1_0__0 ) ) | ( ( rule__ExpressionTypeAnnotated__Group_1_1__0 ) ) );
    public final void rule__ExpressionTypeAnnotated__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:904:1: ( ( ( rule__ExpressionTypeAnnotated__Group_1_0__0 ) ) | ( ( rule__ExpressionTypeAnnotated__Group_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            else if ( (LA11_0==42) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalExpressions.g:905:2: ( ( rule__ExpressionTypeAnnotated__Group_1_0__0 ) )
                    {
                    // InternalExpressions.g:905:2: ( ( rule__ExpressionTypeAnnotated__Group_1_0__0 ) )
                    // InternalExpressions.g:906:3: ( rule__ExpressionTypeAnnotated__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup_1_0()); 
                    // InternalExpressions.g:907:3: ( rule__ExpressionTypeAnnotated__Group_1_0__0 )
                    // InternalExpressions.g:907:4: rule__ExpressionTypeAnnotated__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionTypeAnnotated__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:911:2: ( ( rule__ExpressionTypeAnnotated__Group_1_1__0 ) )
                    {
                    // InternalExpressions.g:911:2: ( ( rule__ExpressionTypeAnnotated__Group_1_1__0 ) )
                    // InternalExpressions.g:912:3: ( rule__ExpressionTypeAnnotated__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup_1_1()); 
                    // InternalExpressions.g:913:3: ( rule__ExpressionTypeAnnotated__Group_1_1__0 )
                    // InternalExpressions.g:913:4: rule__ExpressionTypeAnnotated__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionTypeAnnotated__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Alternatives_1"


    // $ANTLR start "rule__QUANTIFIER__Alternatives"
    // InternalExpressions.g:921:1: rule__QUANTIFIER__Alternatives : ( ( ( 'exists' ) ) | ( ( 'forAll' ) ) | ( ( 'delete' ) ) );
    public final void rule__QUANTIFIER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:925:1: ( ( ( 'exists' ) ) | ( ( 'forAll' ) ) | ( ( 'delete' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt12=1;
                }
                break;
            case 19:
                {
                alt12=2;
                }
                break;
            case 20:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalExpressions.g:926:2: ( ( 'exists' ) )
                    {
                    // InternalExpressions.g:926:2: ( ( 'exists' ) )
                    // InternalExpressions.g:927:3: ( 'exists' )
                    {
                     before(grammarAccess.getQUANTIFIERAccess().getEXISTSEnumLiteralDeclaration_0()); 
                    // InternalExpressions.g:928:3: ( 'exists' )
                    // InternalExpressions.g:928:4: 'exists'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getQUANTIFIERAccess().getEXISTSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:932:2: ( ( 'forAll' ) )
                    {
                    // InternalExpressions.g:932:2: ( ( 'forAll' ) )
                    // InternalExpressions.g:933:3: ( 'forAll' )
                    {
                     before(grammarAccess.getQUANTIFIERAccess().getFORALLEnumLiteralDeclaration_1()); 
                    // InternalExpressions.g:934:3: ( 'forAll' )
                    // InternalExpressions.g:934:4: 'forAll'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getQUANTIFIERAccess().getFORALLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:938:2: ( ( 'delete' ) )
                    {
                    // InternalExpressions.g:938:2: ( ( 'delete' ) )
                    // InternalExpressions.g:939:3: ( 'delete' )
                    {
                     before(grammarAccess.getQUANTIFIERAccess().getDELETEEnumLiteralDeclaration_2()); 
                    // InternalExpressions.g:940:3: ( 'delete' )
                    // InternalExpressions.g:940:4: 'delete'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getQUANTIFIERAccess().getDELETEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QUANTIFIER__Alternatives"


    // $ANTLR start "rule__ExpressionLevel1__Group__0"
    // InternalExpressions.g:948:1: rule__ExpressionLevel1__Group__0 : rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 ;
    public final void rule__ExpressionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:952:1: ( rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 )
            // InternalExpressions.g:953:2: rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExpressionLevel1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__0"


    // $ANTLR start "rule__ExpressionLevel1__Group__0__Impl"
    // InternalExpressions.g:960:1: rule__ExpressionLevel1__Group__0__Impl : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:964:1: ( ( ruleExpressionLevel2 ) )
            // InternalExpressions.g:965:1: ( ruleExpressionLevel2 )
            {
            // InternalExpressions.g:965:1: ( ruleExpressionLevel2 )
            // InternalExpressions.g:966:2: ruleExpressionLevel2
            {
             before(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;

             after(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group__1"
    // InternalExpressions.g:975:1: rule__ExpressionLevel1__Group__1 : rule__ExpressionLevel1__Group__1__Impl ;
    public final void rule__ExpressionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:979:1: ( rule__ExpressionLevel1__Group__1__Impl )
            // InternalExpressions.g:980:2: rule__ExpressionLevel1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__1"


    // $ANTLR start "rule__ExpressionLevel1__Group__1__Impl"
    // InternalExpressions.g:986:1: rule__ExpressionLevel1__Group__1__Impl : ( ( rule__ExpressionLevel1__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:990:1: ( ( ( rule__ExpressionLevel1__Alternatives_1 )* ) )
            // InternalExpressions.g:991:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            {
            // InternalExpressions.g:991:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            // InternalExpressions.g:992:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            {
             before(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 
            // InternalExpressions.g:993:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=15)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExpressions.g:993:3: rule__ExpressionLevel1__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ExpressionLevel1__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0"
    // InternalExpressions.g:1002:1: rule__ExpressionLevel1__Group_1_0__0 : rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 ;
    public final void rule__ExpressionLevel1__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1006:1: ( rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 )
            // InternalExpressions.g:1007:2: rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1
            {
            pushFollow(FOLLOW_5);
            rule__ExpressionLevel1__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0__Impl"
    // InternalExpressions.g:1014:1: rule__ExpressionLevel1__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1018:1: ( ( () ) )
            // InternalExpressions.g:1019:1: ( () )
            {
            // InternalExpressions.g:1019:1: ( () )
            // InternalExpressions.g:1020:2: ()
            {
             before(grammarAccess.getExpressionLevel1Access().getExpressionAndLeftAction_1_0_0()); 
            // InternalExpressions.g:1021:2: ()
            // InternalExpressions.g:1021:3: 
            {
            }

             after(grammarAccess.getExpressionLevel1Access().getExpressionAndLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__1"
    // InternalExpressions.g:1029:1: rule__ExpressionLevel1__Group_1_0__1 : rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 ;
    public final void rule__ExpressionLevel1__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1033:1: ( rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 )
            // InternalExpressions.g:1034:2: rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel1__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__1__Impl"
    // InternalExpressions.g:1041:1: rule__ExpressionLevel1__Group_1_0__1__Impl : ( ( rule__ExpressionLevel1__Alternatives_1_0_1 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1045:1: ( ( ( rule__ExpressionLevel1__Alternatives_1_0_1 ) ) )
            // InternalExpressions.g:1046:1: ( ( rule__ExpressionLevel1__Alternatives_1_0_1 ) )
            {
            // InternalExpressions.g:1046:1: ( ( rule__ExpressionLevel1__Alternatives_1_0_1 ) )
            // InternalExpressions.g:1047:2: ( rule__ExpressionLevel1__Alternatives_1_0_1 )
            {
             before(grammarAccess.getExpressionLevel1Access().getAlternatives_1_0_1()); 
            // InternalExpressions.g:1048:2: ( rule__ExpressionLevel1__Alternatives_1_0_1 )
            // InternalExpressions.g:1048:3: rule__ExpressionLevel1__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Alternatives_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel1Access().getAlternatives_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2"
    // InternalExpressions.g:1056:1: rule__ExpressionLevel1__Group_1_0__2 : rule__ExpressionLevel1__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1060:1: ( rule__ExpressionLevel1__Group_1_0__2__Impl )
            // InternalExpressions.g:1061:2: rule__ExpressionLevel1__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2__Impl"
    // InternalExpressions.g:1067:1: rule__ExpressionLevel1__Group_1_0__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1071:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) )
            // InternalExpressions.g:1072:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            {
            // InternalExpressions.g:1072:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            // InternalExpressions.g:1073:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 
            // InternalExpressions.g:1074:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            // InternalExpressions.g:1074:3: rule__ExpressionLevel1__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0"
    // InternalExpressions.g:1083:1: rule__ExpressionLevel1__Group_1_1__0 : rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 ;
    public final void rule__ExpressionLevel1__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1087:1: ( rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 )
            // InternalExpressions.g:1088:2: rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ExpressionLevel1__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0__Impl"
    // InternalExpressions.g:1095:1: rule__ExpressionLevel1__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1099:1: ( ( () ) )
            // InternalExpressions.g:1100:1: ( () )
            {
            // InternalExpressions.g:1100:1: ( () )
            // InternalExpressions.g:1101:2: ()
            {
             before(grammarAccess.getExpressionLevel1Access().getExpressionOrLeftAction_1_1_0()); 
            // InternalExpressions.g:1102:2: ()
            // InternalExpressions.g:1102:3: 
            {
            }

             after(grammarAccess.getExpressionLevel1Access().getExpressionOrLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__1"
    // InternalExpressions.g:1110:1: rule__ExpressionLevel1__Group_1_1__1 : rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 ;
    public final void rule__ExpressionLevel1__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1114:1: ( rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 )
            // InternalExpressions.g:1115:2: rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel1__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__1__Impl"
    // InternalExpressions.g:1122:1: rule__ExpressionLevel1__Group_1_1__1__Impl : ( ( rule__ExpressionLevel1__Alternatives_1_1_1 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1126:1: ( ( ( rule__ExpressionLevel1__Alternatives_1_1_1 ) ) )
            // InternalExpressions.g:1127:1: ( ( rule__ExpressionLevel1__Alternatives_1_1_1 ) )
            {
            // InternalExpressions.g:1127:1: ( ( rule__ExpressionLevel1__Alternatives_1_1_1 ) )
            // InternalExpressions.g:1128:2: ( rule__ExpressionLevel1__Alternatives_1_1_1 )
            {
             before(grammarAccess.getExpressionLevel1Access().getAlternatives_1_1_1()); 
            // InternalExpressions.g:1129:2: ( rule__ExpressionLevel1__Alternatives_1_1_1 )
            // InternalExpressions.g:1129:3: rule__ExpressionLevel1__Alternatives_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Alternatives_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel1Access().getAlternatives_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2"
    // InternalExpressions.g:1137:1: rule__ExpressionLevel1__Group_1_1__2 : rule__ExpressionLevel1__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1141:1: ( rule__ExpressionLevel1__Group_1_1__2__Impl )
            // InternalExpressions.g:1142:2: rule__ExpressionLevel1__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2__Impl"
    // InternalExpressions.g:1148:1: rule__ExpressionLevel1__Group_1_1__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1152:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) )
            // InternalExpressions.g:1153:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            {
            // InternalExpressions.g:1153:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            // InternalExpressions.g:1154:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 
            // InternalExpressions.g:1155:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            // InternalExpressions.g:1155:3: rule__ExpressionLevel1__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__0"
    // InternalExpressions.g:1164:1: rule__ExpressionLevel2__Group__0 : rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 ;
    public final void rule__ExpressionLevel2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1168:1: ( rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 )
            // InternalExpressions.g:1169:2: rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExpressionLevel2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__0"


    // $ANTLR start "rule__ExpressionLevel2__Group__0__Impl"
    // InternalExpressions.g:1176:1: rule__ExpressionLevel2__Group__0__Impl : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1180:1: ( ( ruleExpressionLevel3 ) )
            // InternalExpressions.g:1181:1: ( ruleExpressionLevel3 )
            {
            // InternalExpressions.g:1181:1: ( ruleExpressionLevel3 )
            // InternalExpressions.g:1182:2: ruleExpressionLevel3
            {
             before(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;

             after(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__1"
    // InternalExpressions.g:1191:1: rule__ExpressionLevel2__Group__1 : rule__ExpressionLevel2__Group__1__Impl ;
    public final void rule__ExpressionLevel2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1195:1: ( rule__ExpressionLevel2__Group__1__Impl )
            // InternalExpressions.g:1196:2: rule__ExpressionLevel2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__1"


    // $ANTLR start "rule__ExpressionLevel2__Group__1__Impl"
    // InternalExpressions.g:1202:1: rule__ExpressionLevel2__Group__1__Impl : ( ( rule__ExpressionLevel2__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1206:1: ( ( ( rule__ExpressionLevel2__Alternatives_1 )* ) )
            // InternalExpressions.g:1207:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            {
            // InternalExpressions.g:1207:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            // InternalExpressions.g:1208:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            {
             before(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 
            // InternalExpressions.g:1209:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=21 && LA14_0<=22)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExpressions.g:1209:3: rule__ExpressionLevel2__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ExpressionLevel2__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0"
    // InternalExpressions.g:1218:1: rule__ExpressionLevel2__Group_1_0__0 : rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 ;
    public final void rule__ExpressionLevel2__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1222:1: ( rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 )
            // InternalExpressions.g:1223:2: rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1
            {
            pushFollow(FOLLOW_9);
            rule__ExpressionLevel2__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0__Impl"
    // InternalExpressions.g:1230:1: rule__ExpressionLevel2__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1234:1: ( ( () ) )
            // InternalExpressions.g:1235:1: ( () )
            {
            // InternalExpressions.g:1235:1: ( () )
            // InternalExpressions.g:1236:2: ()
            {
             before(grammarAccess.getExpressionLevel2Access().getExpressionEqualLeftAction_1_0_0()); 
            // InternalExpressions.g:1237:2: ()
            // InternalExpressions.g:1237:3: 
            {
            }

             after(grammarAccess.getExpressionLevel2Access().getExpressionEqualLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__1"
    // InternalExpressions.g:1245:1: rule__ExpressionLevel2__Group_1_0__1 : rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 ;
    public final void rule__ExpressionLevel2__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1249:1: ( rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 )
            // InternalExpressions.g:1250:2: rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel2__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__1__Impl"
    // InternalExpressions.g:1257:1: rule__ExpressionLevel2__Group_1_0__1__Impl : ( '==' ) ;
    public final void rule__ExpressionLevel2__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1261:1: ( ( '==' ) )
            // InternalExpressions.g:1262:1: ( '==' )
            {
            // InternalExpressions.g:1262:1: ( '==' )
            // InternalExpressions.g:1263:2: '=='
            {
             before(grammarAccess.getExpressionLevel2Access().getEqualsSignEqualsSignKeyword_1_0_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel2Access().getEqualsSignEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2"
    // InternalExpressions.g:1272:1: rule__ExpressionLevel2__Group_1_0__2 : rule__ExpressionLevel2__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1276:1: ( rule__ExpressionLevel2__Group_1_0__2__Impl )
            // InternalExpressions.g:1277:2: rule__ExpressionLevel2__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2__Impl"
    // InternalExpressions.g:1283:1: rule__ExpressionLevel2__Group_1_0__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1287:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) )
            // InternalExpressions.g:1288:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            {
            // InternalExpressions.g:1288:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            // InternalExpressions.g:1289:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 
            // InternalExpressions.g:1290:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            // InternalExpressions.g:1290:3: rule__ExpressionLevel2__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0"
    // InternalExpressions.g:1299:1: rule__ExpressionLevel2__Group_1_1__0 : rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 ;
    public final void rule__ExpressionLevel2__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1303:1: ( rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 )
            // InternalExpressions.g:1304:2: rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ExpressionLevel2__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0__Impl"
    // InternalExpressions.g:1311:1: rule__ExpressionLevel2__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1315:1: ( ( () ) )
            // InternalExpressions.g:1316:1: ( () )
            {
            // InternalExpressions.g:1316:1: ( () )
            // InternalExpressions.g:1317:2: ()
            {
             before(grammarAccess.getExpressionLevel2Access().getExpressionNEqualLeftAction_1_1_0()); 
            // InternalExpressions.g:1318:2: ()
            // InternalExpressions.g:1318:3: 
            {
            }

             after(grammarAccess.getExpressionLevel2Access().getExpressionNEqualLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__1"
    // InternalExpressions.g:1326:1: rule__ExpressionLevel2__Group_1_1__1 : rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 ;
    public final void rule__ExpressionLevel2__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1330:1: ( rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 )
            // InternalExpressions.g:1331:2: rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel2__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__1__Impl"
    // InternalExpressions.g:1338:1: rule__ExpressionLevel2__Group_1_1__1__Impl : ( '!=' ) ;
    public final void rule__ExpressionLevel2__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1342:1: ( ( '!=' ) )
            // InternalExpressions.g:1343:1: ( '!=' )
            {
            // InternalExpressions.g:1343:1: ( '!=' )
            // InternalExpressions.g:1344:2: '!='
            {
             before(grammarAccess.getExpressionLevel2Access().getExclamationMarkEqualsSignKeyword_1_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel2Access().getExclamationMarkEqualsSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2"
    // InternalExpressions.g:1353:1: rule__ExpressionLevel2__Group_1_1__2 : rule__ExpressionLevel2__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1357:1: ( rule__ExpressionLevel2__Group_1_1__2__Impl )
            // InternalExpressions.g:1358:2: rule__ExpressionLevel2__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2__Impl"
    // InternalExpressions.g:1364:1: rule__ExpressionLevel2__Group_1_1__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1368:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) )
            // InternalExpressions.g:1369:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            {
            // InternalExpressions.g:1369:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            // InternalExpressions.g:1370:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 
            // InternalExpressions.g:1371:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            // InternalExpressions.g:1371:3: rule__ExpressionLevel2__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__0"
    // InternalExpressions.g:1380:1: rule__ExpressionLevel3__Group__0 : rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 ;
    public final void rule__ExpressionLevel3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1384:1: ( rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 )
            // InternalExpressions.g:1385:2: rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ExpressionLevel3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__0"


    // $ANTLR start "rule__ExpressionLevel3__Group__0__Impl"
    // InternalExpressions.g:1392:1: rule__ExpressionLevel3__Group__0__Impl : ( ruleExpressionLevel4 ) ;
    public final void rule__ExpressionLevel3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1396:1: ( ( ruleExpressionLevel4 ) )
            // InternalExpressions.g:1397:1: ( ruleExpressionLevel4 )
            {
            // InternalExpressions.g:1397:1: ( ruleExpressionLevel4 )
            // InternalExpressions.g:1398:2: ruleExpressionLevel4
            {
             before(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel4();

            state._fsp--;

             after(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__1"
    // InternalExpressions.g:1407:1: rule__ExpressionLevel3__Group__1 : rule__ExpressionLevel3__Group__1__Impl ;
    public final void rule__ExpressionLevel3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1411:1: ( rule__ExpressionLevel3__Group__1__Impl )
            // InternalExpressions.g:1412:2: rule__ExpressionLevel3__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__1"


    // $ANTLR start "rule__ExpressionLevel3__Group__1__Impl"
    // InternalExpressions.g:1418:1: rule__ExpressionLevel3__Group__1__Impl : ( ( rule__ExpressionLevel3__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1422:1: ( ( ( rule__ExpressionLevel3__Alternatives_1 )* ) )
            // InternalExpressions.g:1423:1: ( ( rule__ExpressionLevel3__Alternatives_1 )* )
            {
            // InternalExpressions.g:1423:1: ( ( rule__ExpressionLevel3__Alternatives_1 )* )
            // InternalExpressions.g:1424:2: ( rule__ExpressionLevel3__Alternatives_1 )*
            {
             before(grammarAccess.getExpressionLevel3Access().getAlternatives_1()); 
            // InternalExpressions.g:1425:2: ( rule__ExpressionLevel3__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=23 && LA15_0<=26)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExpressions.g:1425:3: rule__ExpressionLevel3__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ExpressionLevel3__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExpressionLevel3Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_0__0"
    // InternalExpressions.g:1434:1: rule__ExpressionLevel3__Group_1_0__0 : rule__ExpressionLevel3__Group_1_0__0__Impl rule__ExpressionLevel3__Group_1_0__1 ;
    public final void rule__ExpressionLevel3__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1438:1: ( rule__ExpressionLevel3__Group_1_0__0__Impl rule__ExpressionLevel3__Group_1_0__1 )
            // InternalExpressions.g:1439:2: rule__ExpressionLevel3__Group_1_0__0__Impl rule__ExpressionLevel3__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__ExpressionLevel3__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_0__0__Impl"
    // InternalExpressions.g:1446:1: rule__ExpressionLevel3__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel3__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1450:1: ( ( () ) )
            // InternalExpressions.g:1451:1: ( () )
            {
            // InternalExpressions.g:1451:1: ( () )
            // InternalExpressions.g:1452:2: ()
            {
             before(grammarAccess.getExpressionLevel3Access().getExpressionGeqLeftAction_1_0_0()); 
            // InternalExpressions.g:1453:2: ()
            // InternalExpressions.g:1453:3: 
            {
            }

             after(grammarAccess.getExpressionLevel3Access().getExpressionGeqLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_0__1"
    // InternalExpressions.g:1461:1: rule__ExpressionLevel3__Group_1_0__1 : rule__ExpressionLevel3__Group_1_0__1__Impl rule__ExpressionLevel3__Group_1_0__2 ;
    public final void rule__ExpressionLevel3__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1465:1: ( rule__ExpressionLevel3__Group_1_0__1__Impl rule__ExpressionLevel3__Group_1_0__2 )
            // InternalExpressions.g:1466:2: rule__ExpressionLevel3__Group_1_0__1__Impl rule__ExpressionLevel3__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel3__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_0__1__Impl"
    // InternalExpressions.g:1473:1: rule__ExpressionLevel3__Group_1_0__1__Impl : ( '>=' ) ;
    public final void rule__ExpressionLevel3__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1477:1: ( ( '>=' ) )
            // InternalExpressions.g:1478:1: ( '>=' )
            {
            // InternalExpressions.g:1478:1: ( '>=' )
            // InternalExpressions.g:1479:2: '>='
            {
             before(grammarAccess.getExpressionLevel3Access().getGreaterThanSignEqualsSignKeyword_1_0_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel3Access().getGreaterThanSignEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_0__2"
    // InternalExpressions.g:1488:1: rule__ExpressionLevel3__Group_1_0__2 : rule__ExpressionLevel3__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel3__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1492:1: ( rule__ExpressionLevel3__Group_1_0__2__Impl )
            // InternalExpressions.g:1493:2: rule__ExpressionLevel3__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_0__2__Impl"
    // InternalExpressions.g:1499:1: rule__ExpressionLevel3__Group_1_0__2__Impl : ( ( rule__ExpressionLevel3__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel3__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1503:1: ( ( ( rule__ExpressionLevel3__RightAssignment_1_0_2 ) ) )
            // InternalExpressions.g:1504:1: ( ( rule__ExpressionLevel3__RightAssignment_1_0_2 ) )
            {
            // InternalExpressions.g:1504:1: ( ( rule__ExpressionLevel3__RightAssignment_1_0_2 ) )
            // InternalExpressions.g:1505:2: ( rule__ExpressionLevel3__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_0_2()); 
            // InternalExpressions.g:1506:2: ( rule__ExpressionLevel3__RightAssignment_1_0_2 )
            // InternalExpressions.g:1506:3: rule__ExpressionLevel3__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_1__0"
    // InternalExpressions.g:1515:1: rule__ExpressionLevel3__Group_1_1__0 : rule__ExpressionLevel3__Group_1_1__0__Impl rule__ExpressionLevel3__Group_1_1__1 ;
    public final void rule__ExpressionLevel3__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1519:1: ( rule__ExpressionLevel3__Group_1_1__0__Impl rule__ExpressionLevel3__Group_1_1__1 )
            // InternalExpressions.g:1520:2: rule__ExpressionLevel3__Group_1_1__0__Impl rule__ExpressionLevel3__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
            rule__ExpressionLevel3__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_1__0__Impl"
    // InternalExpressions.g:1527:1: rule__ExpressionLevel3__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel3__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1531:1: ( ( () ) )
            // InternalExpressions.g:1532:1: ( () )
            {
            // InternalExpressions.g:1532:1: ( () )
            // InternalExpressions.g:1533:2: ()
            {
             before(grammarAccess.getExpressionLevel3Access().getExpressionGreaterLeftAction_1_1_0()); 
            // InternalExpressions.g:1534:2: ()
            // InternalExpressions.g:1534:3: 
            {
            }

             after(grammarAccess.getExpressionLevel3Access().getExpressionGreaterLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_1__1"
    // InternalExpressions.g:1542:1: rule__ExpressionLevel3__Group_1_1__1 : rule__ExpressionLevel3__Group_1_1__1__Impl rule__ExpressionLevel3__Group_1_1__2 ;
    public final void rule__ExpressionLevel3__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1546:1: ( rule__ExpressionLevel3__Group_1_1__1__Impl rule__ExpressionLevel3__Group_1_1__2 )
            // InternalExpressions.g:1547:2: rule__ExpressionLevel3__Group_1_1__1__Impl rule__ExpressionLevel3__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel3__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_1__1__Impl"
    // InternalExpressions.g:1554:1: rule__ExpressionLevel3__Group_1_1__1__Impl : ( '>' ) ;
    public final void rule__ExpressionLevel3__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1558:1: ( ( '>' ) )
            // InternalExpressions.g:1559:1: ( '>' )
            {
            // InternalExpressions.g:1559:1: ( '>' )
            // InternalExpressions.g:1560:2: '>'
            {
             before(grammarAccess.getExpressionLevel3Access().getGreaterThanSignKeyword_1_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel3Access().getGreaterThanSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_1__2"
    // InternalExpressions.g:1569:1: rule__ExpressionLevel3__Group_1_1__2 : rule__ExpressionLevel3__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel3__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1573:1: ( rule__ExpressionLevel3__Group_1_1__2__Impl )
            // InternalExpressions.g:1574:2: rule__ExpressionLevel3__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_1__2__Impl"
    // InternalExpressions.g:1580:1: rule__ExpressionLevel3__Group_1_1__2__Impl : ( ( rule__ExpressionLevel3__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel3__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1584:1: ( ( ( rule__ExpressionLevel3__RightAssignment_1_1_2 ) ) )
            // InternalExpressions.g:1585:1: ( ( rule__ExpressionLevel3__RightAssignment_1_1_2 ) )
            {
            // InternalExpressions.g:1585:1: ( ( rule__ExpressionLevel3__RightAssignment_1_1_2 ) )
            // InternalExpressions.g:1586:2: ( rule__ExpressionLevel3__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_1_2()); 
            // InternalExpressions.g:1587:2: ( rule__ExpressionLevel3__RightAssignment_1_1_2 )
            // InternalExpressions.g:1587:3: rule__ExpressionLevel3__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_2__0"
    // InternalExpressions.g:1596:1: rule__ExpressionLevel3__Group_1_2__0 : rule__ExpressionLevel3__Group_1_2__0__Impl rule__ExpressionLevel3__Group_1_2__1 ;
    public final void rule__ExpressionLevel3__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1600:1: ( rule__ExpressionLevel3__Group_1_2__0__Impl rule__ExpressionLevel3__Group_1_2__1 )
            // InternalExpressions.g:1601:2: rule__ExpressionLevel3__Group_1_2__0__Impl rule__ExpressionLevel3__Group_1_2__1
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel3__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_2__0"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_2__0__Impl"
    // InternalExpressions.g:1608:1: rule__ExpressionLevel3__Group_1_2__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel3__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1612:1: ( ( () ) )
            // InternalExpressions.g:1613:1: ( () )
            {
            // InternalExpressions.g:1613:1: ( () )
            // InternalExpressions.g:1614:2: ()
            {
             before(grammarAccess.getExpressionLevel3Access().getExpressionLeqLeftAction_1_2_0()); 
            // InternalExpressions.g:1615:2: ()
            // InternalExpressions.g:1615:3: 
            {
            }

             after(grammarAccess.getExpressionLevel3Access().getExpressionLeqLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_2__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_2__1"
    // InternalExpressions.g:1623:1: rule__ExpressionLevel3__Group_1_2__1 : rule__ExpressionLevel3__Group_1_2__1__Impl rule__ExpressionLevel3__Group_1_2__2 ;
    public final void rule__ExpressionLevel3__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1627:1: ( rule__ExpressionLevel3__Group_1_2__1__Impl rule__ExpressionLevel3__Group_1_2__2 )
            // InternalExpressions.g:1628:2: rule__ExpressionLevel3__Group_1_2__1__Impl rule__ExpressionLevel3__Group_1_2__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel3__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_2__1"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_2__1__Impl"
    // InternalExpressions.g:1635:1: rule__ExpressionLevel3__Group_1_2__1__Impl : ( '<=' ) ;
    public final void rule__ExpressionLevel3__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1639:1: ( ( '<=' ) )
            // InternalExpressions.g:1640:1: ( '<=' )
            {
            // InternalExpressions.g:1640:1: ( '<=' )
            // InternalExpressions.g:1641:2: '<='
            {
             before(grammarAccess.getExpressionLevel3Access().getLessThanSignEqualsSignKeyword_1_2_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel3Access().getLessThanSignEqualsSignKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_2__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_2__2"
    // InternalExpressions.g:1650:1: rule__ExpressionLevel3__Group_1_2__2 : rule__ExpressionLevel3__Group_1_2__2__Impl ;
    public final void rule__ExpressionLevel3__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1654:1: ( rule__ExpressionLevel3__Group_1_2__2__Impl )
            // InternalExpressions.g:1655:2: rule__ExpressionLevel3__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_2__2"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_2__2__Impl"
    // InternalExpressions.g:1661:1: rule__ExpressionLevel3__Group_1_2__2__Impl : ( ( rule__ExpressionLevel3__RightAssignment_1_2_2 ) ) ;
    public final void rule__ExpressionLevel3__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1665:1: ( ( ( rule__ExpressionLevel3__RightAssignment_1_2_2 ) ) )
            // InternalExpressions.g:1666:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2_2 ) )
            {
            // InternalExpressions.g:1666:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2_2 ) )
            // InternalExpressions.g:1667:2: ( rule__ExpressionLevel3__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2_2()); 
            // InternalExpressions.g:1668:2: ( rule__ExpressionLevel3__RightAssignment_1_2_2 )
            // InternalExpressions.g:1668:3: rule__ExpressionLevel3__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_2__2__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_3__0"
    // InternalExpressions.g:1677:1: rule__ExpressionLevel3__Group_1_3__0 : rule__ExpressionLevel3__Group_1_3__0__Impl rule__ExpressionLevel3__Group_1_3__1 ;
    public final void rule__ExpressionLevel3__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1681:1: ( rule__ExpressionLevel3__Group_1_3__0__Impl rule__ExpressionLevel3__Group_1_3__1 )
            // InternalExpressions.g:1682:2: rule__ExpressionLevel3__Group_1_3__0__Impl rule__ExpressionLevel3__Group_1_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ExpressionLevel3__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_3__0"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_3__0__Impl"
    // InternalExpressions.g:1689:1: rule__ExpressionLevel3__Group_1_3__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel3__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1693:1: ( ( () ) )
            // InternalExpressions.g:1694:1: ( () )
            {
            // InternalExpressions.g:1694:1: ( () )
            // InternalExpressions.g:1695:2: ()
            {
             before(grammarAccess.getExpressionLevel3Access().getExpressionLessLeftAction_1_3_0()); 
            // InternalExpressions.g:1696:2: ()
            // InternalExpressions.g:1696:3: 
            {
            }

             after(grammarAccess.getExpressionLevel3Access().getExpressionLessLeftAction_1_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_3__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_3__1"
    // InternalExpressions.g:1704:1: rule__ExpressionLevel3__Group_1_3__1 : rule__ExpressionLevel3__Group_1_3__1__Impl rule__ExpressionLevel3__Group_1_3__2 ;
    public final void rule__ExpressionLevel3__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1708:1: ( rule__ExpressionLevel3__Group_1_3__1__Impl rule__ExpressionLevel3__Group_1_3__2 )
            // InternalExpressions.g:1709:2: rule__ExpressionLevel3__Group_1_3__1__Impl rule__ExpressionLevel3__Group_1_3__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel3__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_3__1"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_3__1__Impl"
    // InternalExpressions.g:1716:1: rule__ExpressionLevel3__Group_1_3__1__Impl : ( '<' ) ;
    public final void rule__ExpressionLevel3__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1720:1: ( ( '<' ) )
            // InternalExpressions.g:1721:1: ( '<' )
            {
            // InternalExpressions.g:1721:1: ( '<' )
            // InternalExpressions.g:1722:2: '<'
            {
             before(grammarAccess.getExpressionLevel3Access().getLessThanSignKeyword_1_3_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel3Access().getLessThanSignKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_3__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_3__2"
    // InternalExpressions.g:1731:1: rule__ExpressionLevel3__Group_1_3__2 : rule__ExpressionLevel3__Group_1_3__2__Impl ;
    public final void rule__ExpressionLevel3__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1735:1: ( rule__ExpressionLevel3__Group_1_3__2__Impl )
            // InternalExpressions.g:1736:2: rule__ExpressionLevel3__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_3__2"


    // $ANTLR start "rule__ExpressionLevel3__Group_1_3__2__Impl"
    // InternalExpressions.g:1742:1: rule__ExpressionLevel3__Group_1_3__2__Impl : ( ( rule__ExpressionLevel3__RightAssignment_1_3_2 ) ) ;
    public final void rule__ExpressionLevel3__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1746:1: ( ( ( rule__ExpressionLevel3__RightAssignment_1_3_2 ) ) )
            // InternalExpressions.g:1747:1: ( ( rule__ExpressionLevel3__RightAssignment_1_3_2 ) )
            {
            // InternalExpressions.g:1747:1: ( ( rule__ExpressionLevel3__RightAssignment_1_3_2 ) )
            // InternalExpressions.g:1748:2: ( rule__ExpressionLevel3__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_3_2()); 
            // InternalExpressions.g:1749:2: ( rule__ExpressionLevel3__RightAssignment_1_3_2 )
            // InternalExpressions.g:1749:3: rule__ExpressionLevel3__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__RightAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1_3__2__Impl"


    // $ANTLR start "rule__ExpressionLevel4__Group__0"
    // InternalExpressions.g:1758:1: rule__ExpressionLevel4__Group__0 : rule__ExpressionLevel4__Group__0__Impl rule__ExpressionLevel4__Group__1 ;
    public final void rule__ExpressionLevel4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1762:1: ( rule__ExpressionLevel4__Group__0__Impl rule__ExpressionLevel4__Group__1 )
            // InternalExpressions.g:1763:2: rule__ExpressionLevel4__Group__0__Impl rule__ExpressionLevel4__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ExpressionLevel4__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group__0"


    // $ANTLR start "rule__ExpressionLevel4__Group__0__Impl"
    // InternalExpressions.g:1770:1: rule__ExpressionLevel4__Group__0__Impl : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionLevel4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1774:1: ( ( ruleExpressionLevel5 ) )
            // InternalExpressions.g:1775:1: ( ruleExpressionLevel5 )
            {
            // InternalExpressions.g:1775:1: ( ruleExpressionLevel5 )
            // InternalExpressions.g:1776:2: ruleExpressionLevel5
            {
             before(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;

             after(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel4__Group__1"
    // InternalExpressions.g:1785:1: rule__ExpressionLevel4__Group__1 : rule__ExpressionLevel4__Group__1__Impl ;
    public final void rule__ExpressionLevel4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1789:1: ( rule__ExpressionLevel4__Group__1__Impl )
            // InternalExpressions.g:1790:2: rule__ExpressionLevel4__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group__1"


    // $ANTLR start "rule__ExpressionLevel4__Group__1__Impl"
    // InternalExpressions.g:1796:1: rule__ExpressionLevel4__Group__1__Impl : ( ( rule__ExpressionLevel4__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1800:1: ( ( ( rule__ExpressionLevel4__Alternatives_1 )* ) )
            // InternalExpressions.g:1801:1: ( ( rule__ExpressionLevel4__Alternatives_1 )* )
            {
            // InternalExpressions.g:1801:1: ( ( rule__ExpressionLevel4__Alternatives_1 )* )
            // InternalExpressions.g:1802:2: ( rule__ExpressionLevel4__Alternatives_1 )*
            {
             before(grammarAccess.getExpressionLevel4Access().getAlternatives_1()); 
            // InternalExpressions.g:1803:2: ( rule__ExpressionLevel4__Alternatives_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=27 && LA16_0<=28)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalExpressions.g:1803:3: rule__ExpressionLevel4__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ExpressionLevel4__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getExpressionLevel4Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel4__Group_1_0__0"
    // InternalExpressions.g:1812:1: rule__ExpressionLevel4__Group_1_0__0 : rule__ExpressionLevel4__Group_1_0__0__Impl rule__ExpressionLevel4__Group_1_0__1 ;
    public final void rule__ExpressionLevel4__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1816:1: ( rule__ExpressionLevel4__Group_1_0__0__Impl rule__ExpressionLevel4__Group_1_0__1 )
            // InternalExpressions.g:1817:2: rule__ExpressionLevel4__Group_1_0__0__Impl rule__ExpressionLevel4__Group_1_0__1
            {
            pushFollow(FOLLOW_17);
            rule__ExpressionLevel4__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel4__Group_1_0__0__Impl"
    // InternalExpressions.g:1824:1: rule__ExpressionLevel4__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel4__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1828:1: ( ( () ) )
            // InternalExpressions.g:1829:1: ( () )
            {
            // InternalExpressions.g:1829:1: ( () )
            // InternalExpressions.g:1830:2: ()
            {
             before(grammarAccess.getExpressionLevel4Access().getExpressionAdditionLeftAction_1_0_0()); 
            // InternalExpressions.g:1831:2: ()
            // InternalExpressions.g:1831:3: 
            {
            }

             after(grammarAccess.getExpressionLevel4Access().getExpressionAdditionLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel4__Group_1_0__1"
    // InternalExpressions.g:1839:1: rule__ExpressionLevel4__Group_1_0__1 : rule__ExpressionLevel4__Group_1_0__1__Impl rule__ExpressionLevel4__Group_1_0__2 ;
    public final void rule__ExpressionLevel4__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1843:1: ( rule__ExpressionLevel4__Group_1_0__1__Impl rule__ExpressionLevel4__Group_1_0__2 )
            // InternalExpressions.g:1844:2: rule__ExpressionLevel4__Group_1_0__1__Impl rule__ExpressionLevel4__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel4__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel4__Group_1_0__1__Impl"
    // InternalExpressions.g:1851:1: rule__ExpressionLevel4__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__ExpressionLevel4__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1855:1: ( ( '+' ) )
            // InternalExpressions.g:1856:1: ( '+' )
            {
            // InternalExpressions.g:1856:1: ( '+' )
            // InternalExpressions.g:1857:2: '+'
            {
             before(grammarAccess.getExpressionLevel4Access().getPlusSignKeyword_1_0_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel4Access().getPlusSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel4__Group_1_0__2"
    // InternalExpressions.g:1866:1: rule__ExpressionLevel4__Group_1_0__2 : rule__ExpressionLevel4__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel4__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1870:1: ( rule__ExpressionLevel4__Group_1_0__2__Impl )
            // InternalExpressions.g:1871:2: rule__ExpressionLevel4__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel4__Group_1_0__2__Impl"
    // InternalExpressions.g:1877:1: rule__ExpressionLevel4__Group_1_0__2__Impl : ( ( rule__ExpressionLevel4__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel4__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1881:1: ( ( ( rule__ExpressionLevel4__RightAssignment_1_0_2 ) ) )
            // InternalExpressions.g:1882:1: ( ( rule__ExpressionLevel4__RightAssignment_1_0_2 ) )
            {
            // InternalExpressions.g:1882:1: ( ( rule__ExpressionLevel4__RightAssignment_1_0_2 ) )
            // InternalExpressions.g:1883:2: ( rule__ExpressionLevel4__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpressionLevel4Access().getRightAssignment_1_0_2()); 
            // InternalExpressions.g:1884:2: ( rule__ExpressionLevel4__RightAssignment_1_0_2 )
            // InternalExpressions.g:1884:3: rule__ExpressionLevel4__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel4Access().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel4__Group_1_1__0"
    // InternalExpressions.g:1893:1: rule__ExpressionLevel4__Group_1_1__0 : rule__ExpressionLevel4__Group_1_1__0__Impl rule__ExpressionLevel4__Group_1_1__1 ;
    public final void rule__ExpressionLevel4__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1897:1: ( rule__ExpressionLevel4__Group_1_1__0__Impl rule__ExpressionLevel4__Group_1_1__1 )
            // InternalExpressions.g:1898:2: rule__ExpressionLevel4__Group_1_1__0__Impl rule__ExpressionLevel4__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
            rule__ExpressionLevel4__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel4__Group_1_1__0__Impl"
    // InternalExpressions.g:1905:1: rule__ExpressionLevel4__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel4__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1909:1: ( ( () ) )
            // InternalExpressions.g:1910:1: ( () )
            {
            // InternalExpressions.g:1910:1: ( () )
            // InternalExpressions.g:1911:2: ()
            {
             before(grammarAccess.getExpressionLevel4Access().getExpressionSubtractionLeftAction_1_1_0()); 
            // InternalExpressions.g:1912:2: ()
            // InternalExpressions.g:1912:3: 
            {
            }

             after(grammarAccess.getExpressionLevel4Access().getExpressionSubtractionLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel4__Group_1_1__1"
    // InternalExpressions.g:1920:1: rule__ExpressionLevel4__Group_1_1__1 : rule__ExpressionLevel4__Group_1_1__1__Impl rule__ExpressionLevel4__Group_1_1__2 ;
    public final void rule__ExpressionLevel4__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1924:1: ( rule__ExpressionLevel4__Group_1_1__1__Impl rule__ExpressionLevel4__Group_1_1__2 )
            // InternalExpressions.g:1925:2: rule__ExpressionLevel4__Group_1_1__1__Impl rule__ExpressionLevel4__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel4__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel4__Group_1_1__1__Impl"
    // InternalExpressions.g:1932:1: rule__ExpressionLevel4__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__ExpressionLevel4__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1936:1: ( ( '-' ) )
            // InternalExpressions.g:1937:1: ( '-' )
            {
            // InternalExpressions.g:1937:1: ( '-' )
            // InternalExpressions.g:1938:2: '-'
            {
             before(grammarAccess.getExpressionLevel4Access().getHyphenMinusKeyword_1_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel4Access().getHyphenMinusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel4__Group_1_1__2"
    // InternalExpressions.g:1947:1: rule__ExpressionLevel4__Group_1_1__2 : rule__ExpressionLevel4__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel4__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1951:1: ( rule__ExpressionLevel4__Group_1_1__2__Impl )
            // InternalExpressions.g:1952:2: rule__ExpressionLevel4__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel4__Group_1_1__2__Impl"
    // InternalExpressions.g:1958:1: rule__ExpressionLevel4__Group_1_1__2__Impl : ( ( rule__ExpressionLevel4__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel4__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1962:1: ( ( ( rule__ExpressionLevel4__RightAssignment_1_1_2 ) ) )
            // InternalExpressions.g:1963:1: ( ( rule__ExpressionLevel4__RightAssignment_1_1_2 ) )
            {
            // InternalExpressions.g:1963:1: ( ( rule__ExpressionLevel4__RightAssignment_1_1_2 ) )
            // InternalExpressions.g:1964:2: ( rule__ExpressionLevel4__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpressionLevel4Access().getRightAssignment_1_1_2()); 
            // InternalExpressions.g:1965:2: ( rule__ExpressionLevel4__RightAssignment_1_1_2 )
            // InternalExpressions.g:1965:3: rule__ExpressionLevel4__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel4Access().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group__0"
    // InternalExpressions.g:1974:1: rule__ExpressionLevel5__Group__0 : rule__ExpressionLevel5__Group__0__Impl rule__ExpressionLevel5__Group__1 ;
    public final void rule__ExpressionLevel5__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1978:1: ( rule__ExpressionLevel5__Group__0__Impl rule__ExpressionLevel5__Group__1 )
            // InternalExpressions.g:1979:2: rule__ExpressionLevel5__Group__0__Impl rule__ExpressionLevel5__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionLevel5__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group__0"


    // $ANTLR start "rule__ExpressionLevel5__Group__0__Impl"
    // InternalExpressions.g:1986:1: rule__ExpressionLevel5__Group__0__Impl : ( ruleExpressionLevel6 ) ;
    public final void rule__ExpressionLevel5__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1990:1: ( ( ruleExpressionLevel6 ) )
            // InternalExpressions.g:1991:1: ( ruleExpressionLevel6 )
            {
            // InternalExpressions.g:1991:1: ( ruleExpressionLevel6 )
            // InternalExpressions.g:1992:2: ruleExpressionLevel6
            {
             before(grammarAccess.getExpressionLevel5Access().getExpressionLevel6ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel6();

            state._fsp--;

             after(grammarAccess.getExpressionLevel5Access().getExpressionLevel6ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group__1"
    // InternalExpressions.g:2001:1: rule__ExpressionLevel5__Group__1 : rule__ExpressionLevel5__Group__1__Impl ;
    public final void rule__ExpressionLevel5__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2005:1: ( rule__ExpressionLevel5__Group__1__Impl )
            // InternalExpressions.g:2006:2: rule__ExpressionLevel5__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group__1"


    // $ANTLR start "rule__ExpressionLevel5__Group__1__Impl"
    // InternalExpressions.g:2012:1: rule__ExpressionLevel5__Group__1__Impl : ( ( rule__ExpressionLevel5__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel5__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2016:1: ( ( ( rule__ExpressionLevel5__Alternatives_1 )* ) )
            // InternalExpressions.g:2017:1: ( ( rule__ExpressionLevel5__Alternatives_1 )* )
            {
            // InternalExpressions.g:2017:1: ( ( rule__ExpressionLevel5__Alternatives_1 )* )
            // InternalExpressions.g:2018:2: ( rule__ExpressionLevel5__Alternatives_1 )*
            {
             before(grammarAccess.getExpressionLevel5Access().getAlternatives_1()); 
            // InternalExpressions.g:2019:2: ( rule__ExpressionLevel5__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=29 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalExpressions.g:2019:3: rule__ExpressionLevel5__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ExpressionLevel5__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getExpressionLevel5Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_0__0"
    // InternalExpressions.g:2028:1: rule__ExpressionLevel5__Group_1_0__0 : rule__ExpressionLevel5__Group_1_0__0__Impl rule__ExpressionLevel5__Group_1_0__1 ;
    public final void rule__ExpressionLevel5__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2032:1: ( rule__ExpressionLevel5__Group_1_0__0__Impl rule__ExpressionLevel5__Group_1_0__1 )
            // InternalExpressions.g:2033:2: rule__ExpressionLevel5__Group_1_0__0__Impl rule__ExpressionLevel5__Group_1_0__1
            {
            pushFollow(FOLLOW_20);
            rule__ExpressionLevel5__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_0__0__Impl"
    // InternalExpressions.g:2040:1: rule__ExpressionLevel5__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel5__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2044:1: ( ( () ) )
            // InternalExpressions.g:2045:1: ( () )
            {
            // InternalExpressions.g:2045:1: ( () )
            // InternalExpressions.g:2046:2: ()
            {
             before(grammarAccess.getExpressionLevel5Access().getExpressionMultiplyLeftAction_1_0_0()); 
            // InternalExpressions.g:2047:2: ()
            // InternalExpressions.g:2047:3: 
            {
            }

             after(grammarAccess.getExpressionLevel5Access().getExpressionMultiplyLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_0__1"
    // InternalExpressions.g:2055:1: rule__ExpressionLevel5__Group_1_0__1 : rule__ExpressionLevel5__Group_1_0__1__Impl rule__ExpressionLevel5__Group_1_0__2 ;
    public final void rule__ExpressionLevel5__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2059:1: ( rule__ExpressionLevel5__Group_1_0__1__Impl rule__ExpressionLevel5__Group_1_0__2 )
            // InternalExpressions.g:2060:2: rule__ExpressionLevel5__Group_1_0__1__Impl rule__ExpressionLevel5__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel5__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_0__1__Impl"
    // InternalExpressions.g:2067:1: rule__ExpressionLevel5__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__ExpressionLevel5__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2071:1: ( ( '*' ) )
            // InternalExpressions.g:2072:1: ( '*' )
            {
            // InternalExpressions.g:2072:1: ( '*' )
            // InternalExpressions.g:2073:2: '*'
            {
             before(grammarAccess.getExpressionLevel5Access().getAsteriskKeyword_1_0_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel5Access().getAsteriskKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_0__2"
    // InternalExpressions.g:2082:1: rule__ExpressionLevel5__Group_1_0__2 : rule__ExpressionLevel5__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel5__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2086:1: ( rule__ExpressionLevel5__Group_1_0__2__Impl )
            // InternalExpressions.g:2087:2: rule__ExpressionLevel5__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_0__2__Impl"
    // InternalExpressions.g:2093:1: rule__ExpressionLevel5__Group_1_0__2__Impl : ( ( rule__ExpressionLevel5__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel5__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2097:1: ( ( ( rule__ExpressionLevel5__RightAssignment_1_0_2 ) ) )
            // InternalExpressions.g:2098:1: ( ( rule__ExpressionLevel5__RightAssignment_1_0_2 ) )
            {
            // InternalExpressions.g:2098:1: ( ( rule__ExpressionLevel5__RightAssignment_1_0_2 ) )
            // InternalExpressions.g:2099:2: ( rule__ExpressionLevel5__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpressionLevel5Access().getRightAssignment_1_0_2()); 
            // InternalExpressions.g:2100:2: ( rule__ExpressionLevel5__RightAssignment_1_0_2 )
            // InternalExpressions.g:2100:3: rule__ExpressionLevel5__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel5Access().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_1__0"
    // InternalExpressions.g:2109:1: rule__ExpressionLevel5__Group_1_1__0 : rule__ExpressionLevel5__Group_1_1__0__Impl rule__ExpressionLevel5__Group_1_1__1 ;
    public final void rule__ExpressionLevel5__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2113:1: ( rule__ExpressionLevel5__Group_1_1__0__Impl rule__ExpressionLevel5__Group_1_1__1 )
            // InternalExpressions.g:2114:2: rule__ExpressionLevel5__Group_1_1__0__Impl rule__ExpressionLevel5__Group_1_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ExpressionLevel5__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_1__0__Impl"
    // InternalExpressions.g:2121:1: rule__ExpressionLevel5__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel5__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2125:1: ( ( () ) )
            // InternalExpressions.g:2126:1: ( () )
            {
            // InternalExpressions.g:2126:1: ( () )
            // InternalExpressions.g:2127:2: ()
            {
             before(grammarAccess.getExpressionLevel5Access().getExpressionDivisionLeftAction_1_1_0()); 
            // InternalExpressions.g:2128:2: ()
            // InternalExpressions.g:2128:3: 
            {
            }

             after(grammarAccess.getExpressionLevel5Access().getExpressionDivisionLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_1__1"
    // InternalExpressions.g:2136:1: rule__ExpressionLevel5__Group_1_1__1 : rule__ExpressionLevel5__Group_1_1__1__Impl rule__ExpressionLevel5__Group_1_1__2 ;
    public final void rule__ExpressionLevel5__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2140:1: ( rule__ExpressionLevel5__Group_1_1__1__Impl rule__ExpressionLevel5__Group_1_1__2 )
            // InternalExpressions.g:2141:2: rule__ExpressionLevel5__Group_1_1__1__Impl rule__ExpressionLevel5__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel5__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_1__1__Impl"
    // InternalExpressions.g:2148:1: rule__ExpressionLevel5__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__ExpressionLevel5__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2152:1: ( ( '/' ) )
            // InternalExpressions.g:2153:1: ( '/' )
            {
            // InternalExpressions.g:2153:1: ( '/' )
            // InternalExpressions.g:2154:2: '/'
            {
             before(grammarAccess.getExpressionLevel5Access().getSolidusKeyword_1_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel5Access().getSolidusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_1__2"
    // InternalExpressions.g:2163:1: rule__ExpressionLevel5__Group_1_1__2 : rule__ExpressionLevel5__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel5__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2167:1: ( rule__ExpressionLevel5__Group_1_1__2__Impl )
            // InternalExpressions.g:2168:2: rule__ExpressionLevel5__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_1__2__Impl"
    // InternalExpressions.g:2174:1: rule__ExpressionLevel5__Group_1_1__2__Impl : ( ( rule__ExpressionLevel5__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel5__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2178:1: ( ( ( rule__ExpressionLevel5__RightAssignment_1_1_2 ) ) )
            // InternalExpressions.g:2179:1: ( ( rule__ExpressionLevel5__RightAssignment_1_1_2 ) )
            {
            // InternalExpressions.g:2179:1: ( ( rule__ExpressionLevel5__RightAssignment_1_1_2 ) )
            // InternalExpressions.g:2180:2: ( rule__ExpressionLevel5__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpressionLevel5Access().getRightAssignment_1_1_2()); 
            // InternalExpressions.g:2181:2: ( rule__ExpressionLevel5__RightAssignment_1_1_2 )
            // InternalExpressions.g:2181:3: rule__ExpressionLevel5__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel5Access().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_2__0"
    // InternalExpressions.g:2190:1: rule__ExpressionLevel5__Group_1_2__0 : rule__ExpressionLevel5__Group_1_2__0__Impl rule__ExpressionLevel5__Group_1_2__1 ;
    public final void rule__ExpressionLevel5__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2194:1: ( rule__ExpressionLevel5__Group_1_2__0__Impl rule__ExpressionLevel5__Group_1_2__1 )
            // InternalExpressions.g:2195:2: rule__ExpressionLevel5__Group_1_2__0__Impl rule__ExpressionLevel5__Group_1_2__1
            {
            pushFollow(FOLLOW_22);
            rule__ExpressionLevel5__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_2__0"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_2__0__Impl"
    // InternalExpressions.g:2202:1: rule__ExpressionLevel5__Group_1_2__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel5__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2206:1: ( ( () ) )
            // InternalExpressions.g:2207:1: ( () )
            {
            // InternalExpressions.g:2207:1: ( () )
            // InternalExpressions.g:2208:2: ()
            {
             before(grammarAccess.getExpressionLevel5Access().getExpressionMaximumLeftAction_1_2_0()); 
            // InternalExpressions.g:2209:2: ()
            // InternalExpressions.g:2209:3: 
            {
            }

             after(grammarAccess.getExpressionLevel5Access().getExpressionMaximumLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_2__0__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_2__1"
    // InternalExpressions.g:2217:1: rule__ExpressionLevel5__Group_1_2__1 : rule__ExpressionLevel5__Group_1_2__1__Impl rule__ExpressionLevel5__Group_1_2__2 ;
    public final void rule__ExpressionLevel5__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2221:1: ( rule__ExpressionLevel5__Group_1_2__1__Impl rule__ExpressionLevel5__Group_1_2__2 )
            // InternalExpressions.g:2222:2: rule__ExpressionLevel5__Group_1_2__1__Impl rule__ExpressionLevel5__Group_1_2__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel5__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_2__1"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_2__1__Impl"
    // InternalExpressions.g:2229:1: rule__ExpressionLevel5__Group_1_2__1__Impl : ( 'max' ) ;
    public final void rule__ExpressionLevel5__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2233:1: ( ( 'max' ) )
            // InternalExpressions.g:2234:1: ( 'max' )
            {
            // InternalExpressions.g:2234:1: ( 'max' )
            // InternalExpressions.g:2235:2: 'max'
            {
             before(grammarAccess.getExpressionLevel5Access().getMaxKeyword_1_2_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel5Access().getMaxKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_2__1__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_2__2"
    // InternalExpressions.g:2244:1: rule__ExpressionLevel5__Group_1_2__2 : rule__ExpressionLevel5__Group_1_2__2__Impl ;
    public final void rule__ExpressionLevel5__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2248:1: ( rule__ExpressionLevel5__Group_1_2__2__Impl )
            // InternalExpressions.g:2249:2: rule__ExpressionLevel5__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_2__2"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_2__2__Impl"
    // InternalExpressions.g:2255:1: rule__ExpressionLevel5__Group_1_2__2__Impl : ( ( rule__ExpressionLevel5__RightAssignment_1_2_2 ) ) ;
    public final void rule__ExpressionLevel5__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2259:1: ( ( ( rule__ExpressionLevel5__RightAssignment_1_2_2 ) ) )
            // InternalExpressions.g:2260:1: ( ( rule__ExpressionLevel5__RightAssignment_1_2_2 ) )
            {
            // InternalExpressions.g:2260:1: ( ( rule__ExpressionLevel5__RightAssignment_1_2_2 ) )
            // InternalExpressions.g:2261:2: ( rule__ExpressionLevel5__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpressionLevel5Access().getRightAssignment_1_2_2()); 
            // InternalExpressions.g:2262:2: ( rule__ExpressionLevel5__RightAssignment_1_2_2 )
            // InternalExpressions.g:2262:3: rule__ExpressionLevel5__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel5Access().getRightAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_2__2__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_3__0"
    // InternalExpressions.g:2271:1: rule__ExpressionLevel5__Group_1_3__0 : rule__ExpressionLevel5__Group_1_3__0__Impl rule__ExpressionLevel5__Group_1_3__1 ;
    public final void rule__ExpressionLevel5__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2275:1: ( rule__ExpressionLevel5__Group_1_3__0__Impl rule__ExpressionLevel5__Group_1_3__1 )
            // InternalExpressions.g:2276:2: rule__ExpressionLevel5__Group_1_3__0__Impl rule__ExpressionLevel5__Group_1_3__1
            {
            pushFollow(FOLLOW_23);
            rule__ExpressionLevel5__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_3__0"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_3__0__Impl"
    // InternalExpressions.g:2283:1: rule__ExpressionLevel5__Group_1_3__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel5__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2287:1: ( ( () ) )
            // InternalExpressions.g:2288:1: ( () )
            {
            // InternalExpressions.g:2288:1: ( () )
            // InternalExpressions.g:2289:2: ()
            {
             before(grammarAccess.getExpressionLevel5Access().getExpressionMinimumLeftAction_1_3_0()); 
            // InternalExpressions.g:2290:2: ()
            // InternalExpressions.g:2290:3: 
            {
            }

             after(grammarAccess.getExpressionLevel5Access().getExpressionMinimumLeftAction_1_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_3__0__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_3__1"
    // InternalExpressions.g:2298:1: rule__ExpressionLevel5__Group_1_3__1 : rule__ExpressionLevel5__Group_1_3__1__Impl rule__ExpressionLevel5__Group_1_3__2 ;
    public final void rule__ExpressionLevel5__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2302:1: ( rule__ExpressionLevel5__Group_1_3__1__Impl rule__ExpressionLevel5__Group_1_3__2 )
            // InternalExpressions.g:2303:2: rule__ExpressionLevel5__Group_1_3__1__Impl rule__ExpressionLevel5__Group_1_3__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel5__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_3__1"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_3__1__Impl"
    // InternalExpressions.g:2310:1: rule__ExpressionLevel5__Group_1_3__1__Impl : ( 'min' ) ;
    public final void rule__ExpressionLevel5__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2314:1: ( ( 'min' ) )
            // InternalExpressions.g:2315:1: ( 'min' )
            {
            // InternalExpressions.g:2315:1: ( 'min' )
            // InternalExpressions.g:2316:2: 'min'
            {
             before(grammarAccess.getExpressionLevel5Access().getMinKeyword_1_3_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel5Access().getMinKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_3__1__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_3__2"
    // InternalExpressions.g:2325:1: rule__ExpressionLevel5__Group_1_3__2 : rule__ExpressionLevel5__Group_1_3__2__Impl ;
    public final void rule__ExpressionLevel5__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2329:1: ( rule__ExpressionLevel5__Group_1_3__2__Impl )
            // InternalExpressions.g:2330:2: rule__ExpressionLevel5__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_3__2"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_3__2__Impl"
    // InternalExpressions.g:2336:1: rule__ExpressionLevel5__Group_1_3__2__Impl : ( ( rule__ExpressionLevel5__RightAssignment_1_3_2 ) ) ;
    public final void rule__ExpressionLevel5__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2340:1: ( ( ( rule__ExpressionLevel5__RightAssignment_1_3_2 ) ) )
            // InternalExpressions.g:2341:1: ( ( rule__ExpressionLevel5__RightAssignment_1_3_2 ) )
            {
            // InternalExpressions.g:2341:1: ( ( rule__ExpressionLevel5__RightAssignment_1_3_2 ) )
            // InternalExpressions.g:2342:2: ( rule__ExpressionLevel5__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getExpressionLevel5Access().getRightAssignment_1_3_2()); 
            // InternalExpressions.g:2343:2: ( rule__ExpressionLevel5__RightAssignment_1_3_2 )
            // InternalExpressions.g:2343:3: rule__ExpressionLevel5__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__RightAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel5Access().getRightAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_3__2__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_4__0"
    // InternalExpressions.g:2352:1: rule__ExpressionLevel5__Group_1_4__0 : rule__ExpressionLevel5__Group_1_4__0__Impl rule__ExpressionLevel5__Group_1_4__1 ;
    public final void rule__ExpressionLevel5__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2356:1: ( rule__ExpressionLevel5__Group_1_4__0__Impl rule__ExpressionLevel5__Group_1_4__1 )
            // InternalExpressions.g:2357:2: rule__ExpressionLevel5__Group_1_4__0__Impl rule__ExpressionLevel5__Group_1_4__1
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionLevel5__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_4__0"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_4__0__Impl"
    // InternalExpressions.g:2364:1: rule__ExpressionLevel5__Group_1_4__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel5__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2368:1: ( ( () ) )
            // InternalExpressions.g:2369:1: ( () )
            {
            // InternalExpressions.g:2369:1: ( () )
            // InternalExpressions.g:2370:2: ()
            {
             before(grammarAccess.getExpressionLevel5Access().getExpressionModuloLeftAction_1_4_0()); 
            // InternalExpressions.g:2371:2: ()
            // InternalExpressions.g:2371:3: 
            {
            }

             after(grammarAccess.getExpressionLevel5Access().getExpressionModuloLeftAction_1_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_4__0__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_4__1"
    // InternalExpressions.g:2379:1: rule__ExpressionLevel5__Group_1_4__1 : rule__ExpressionLevel5__Group_1_4__1__Impl rule__ExpressionLevel5__Group_1_4__2 ;
    public final void rule__ExpressionLevel5__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2383:1: ( rule__ExpressionLevel5__Group_1_4__1__Impl rule__ExpressionLevel5__Group_1_4__2 )
            // InternalExpressions.g:2384:2: rule__ExpressionLevel5__Group_1_4__1__Impl rule__ExpressionLevel5__Group_1_4__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel5__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_4__1"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_4__1__Impl"
    // InternalExpressions.g:2391:1: rule__ExpressionLevel5__Group_1_4__1__Impl : ( 'mod' ) ;
    public final void rule__ExpressionLevel5__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2395:1: ( ( 'mod' ) )
            // InternalExpressions.g:2396:1: ( 'mod' )
            {
            // InternalExpressions.g:2396:1: ( 'mod' )
            // InternalExpressions.g:2397:2: 'mod'
            {
             before(grammarAccess.getExpressionLevel5Access().getModKeyword_1_4_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel5Access().getModKeyword_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_4__1__Impl"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_4__2"
    // InternalExpressions.g:2406:1: rule__ExpressionLevel5__Group_1_4__2 : rule__ExpressionLevel5__Group_1_4__2__Impl ;
    public final void rule__ExpressionLevel5__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2410:1: ( rule__ExpressionLevel5__Group_1_4__2__Impl )
            // InternalExpressions.g:2411:2: rule__ExpressionLevel5__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Group_1_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_4__2"


    // $ANTLR start "rule__ExpressionLevel5__Group_1_4__2__Impl"
    // InternalExpressions.g:2417:1: rule__ExpressionLevel5__Group_1_4__2__Impl : ( ( rule__ExpressionLevel5__RightAssignment_1_4_2 ) ) ;
    public final void rule__ExpressionLevel5__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2421:1: ( ( ( rule__ExpressionLevel5__RightAssignment_1_4_2 ) ) )
            // InternalExpressions.g:2422:1: ( ( rule__ExpressionLevel5__RightAssignment_1_4_2 ) )
            {
            // InternalExpressions.g:2422:1: ( ( rule__ExpressionLevel5__RightAssignment_1_4_2 ) )
            // InternalExpressions.g:2423:2: ( rule__ExpressionLevel5__RightAssignment_1_4_2 )
            {
             before(grammarAccess.getExpressionLevel5Access().getRightAssignment_1_4_2()); 
            // InternalExpressions.g:2424:2: ( rule__ExpressionLevel5__RightAssignment_1_4_2 )
            // InternalExpressions.g:2424:3: rule__ExpressionLevel5__RightAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__RightAssignment_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel5Access().getRightAssignment_1_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__Group_1_4__2__Impl"


    // $ANTLR start "rule__ExpressionLevel6__Group__0"
    // InternalExpressions.g:2433:1: rule__ExpressionLevel6__Group__0 : rule__ExpressionLevel6__Group__0__Impl rule__ExpressionLevel6__Group__1 ;
    public final void rule__ExpressionLevel6__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2437:1: ( rule__ExpressionLevel6__Group__0__Impl rule__ExpressionLevel6__Group__1 )
            // InternalExpressions.g:2438:2: rule__ExpressionLevel6__Group__0__Impl rule__ExpressionLevel6__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ExpressionLevel6__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel6__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel6__Group__0"


    // $ANTLR start "rule__ExpressionLevel6__Group__0__Impl"
    // InternalExpressions.g:2445:1: rule__ExpressionLevel6__Group__0__Impl : ( ruleExpressionLevel7 ) ;
    public final void rule__ExpressionLevel6__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2449:1: ( ( ruleExpressionLevel7 ) )
            // InternalExpressions.g:2450:1: ( ruleExpressionLevel7 )
            {
            // InternalExpressions.g:2450:1: ( ruleExpressionLevel7 )
            // InternalExpressions.g:2451:2: ruleExpressionLevel7
            {
             before(grammarAccess.getExpressionLevel6Access().getExpressionLevel7ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel7();

            state._fsp--;

             after(grammarAccess.getExpressionLevel6Access().getExpressionLevel7ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel6__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel6__Group__1"
    // InternalExpressions.g:2460:1: rule__ExpressionLevel6__Group__1 : rule__ExpressionLevel6__Group__1__Impl ;
    public final void rule__ExpressionLevel6__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2464:1: ( rule__ExpressionLevel6__Group__1__Impl )
            // InternalExpressions.g:2465:2: rule__ExpressionLevel6__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel6__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel6__Group__1"


    // $ANTLR start "rule__ExpressionLevel6__Group__1__Impl"
    // InternalExpressions.g:2471:1: rule__ExpressionLevel6__Group__1__Impl : ( ( rule__ExpressionLevel6__Group_1__0 )? ) ;
    public final void rule__ExpressionLevel6__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2475:1: ( ( ( rule__ExpressionLevel6__Group_1__0 )? ) )
            // InternalExpressions.g:2476:1: ( ( rule__ExpressionLevel6__Group_1__0 )? )
            {
            // InternalExpressions.g:2476:1: ( ( rule__ExpressionLevel6__Group_1__0 )? )
            // InternalExpressions.g:2477:2: ( rule__ExpressionLevel6__Group_1__0 )?
            {
             before(grammarAccess.getExpressionLevel6Access().getGroup_1()); 
            // InternalExpressions.g:2478:2: ( rule__ExpressionLevel6__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalExpressions.g:2478:3: rule__ExpressionLevel6__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel6__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionLevel6Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel6__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel6__Group_1__0"
    // InternalExpressions.g:2487:1: rule__ExpressionLevel6__Group_1__0 : rule__ExpressionLevel6__Group_1__0__Impl rule__ExpressionLevel6__Group_1__1 ;
    public final void rule__ExpressionLevel6__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2491:1: ( rule__ExpressionLevel6__Group_1__0__Impl rule__ExpressionLevel6__Group_1__1 )
            // InternalExpressions.g:2492:2: rule__ExpressionLevel6__Group_1__0__Impl rule__ExpressionLevel6__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__ExpressionLevel6__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel6__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel6__Group_1__0"


    // $ANTLR start "rule__ExpressionLevel6__Group_1__0__Impl"
    // InternalExpressions.g:2499:1: rule__ExpressionLevel6__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel6__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2503:1: ( ( () ) )
            // InternalExpressions.g:2504:1: ( () )
            {
            // InternalExpressions.g:2504:1: ( () )
            // InternalExpressions.g:2505:2: ()
            {
             before(grammarAccess.getExpressionLevel6Access().getExpressionPowerLeftAction_1_0()); 
            // InternalExpressions.g:2506:2: ()
            // InternalExpressions.g:2506:3: 
            {
            }

             after(grammarAccess.getExpressionLevel6Access().getExpressionPowerLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel6__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel6__Group_1__1"
    // InternalExpressions.g:2514:1: rule__ExpressionLevel6__Group_1__1 : rule__ExpressionLevel6__Group_1__1__Impl rule__ExpressionLevel6__Group_1__2 ;
    public final void rule__ExpressionLevel6__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2518:1: ( rule__ExpressionLevel6__Group_1__1__Impl rule__ExpressionLevel6__Group_1__2 )
            // InternalExpressions.g:2519:2: rule__ExpressionLevel6__Group_1__1__Impl rule__ExpressionLevel6__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionLevel6__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel6__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel6__Group_1__1"


    // $ANTLR start "rule__ExpressionLevel6__Group_1__1__Impl"
    // InternalExpressions.g:2526:1: rule__ExpressionLevel6__Group_1__1__Impl : ( '^' ) ;
    public final void rule__ExpressionLevel6__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2530:1: ( ( '^' ) )
            // InternalExpressions.g:2531:1: ( '^' )
            {
            // InternalExpressions.g:2531:1: ( '^' )
            // InternalExpressions.g:2532:2: '^'
            {
             before(grammarAccess.getExpressionLevel6Access().getCircumflexAccentKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel6Access().getCircumflexAccentKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel6__Group_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel6__Group_1__2"
    // InternalExpressions.g:2541:1: rule__ExpressionLevel6__Group_1__2 : rule__ExpressionLevel6__Group_1__2__Impl ;
    public final void rule__ExpressionLevel6__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2545:1: ( rule__ExpressionLevel6__Group_1__2__Impl )
            // InternalExpressions.g:2546:2: rule__ExpressionLevel6__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel6__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel6__Group_1__2"


    // $ANTLR start "rule__ExpressionLevel6__Group_1__2__Impl"
    // InternalExpressions.g:2552:1: rule__ExpressionLevel6__Group_1__2__Impl : ( ( rule__ExpressionLevel6__RightAssignment_1_2 ) ) ;
    public final void rule__ExpressionLevel6__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2556:1: ( ( ( rule__ExpressionLevel6__RightAssignment_1_2 ) ) )
            // InternalExpressions.g:2557:1: ( ( rule__ExpressionLevel6__RightAssignment_1_2 ) )
            {
            // InternalExpressions.g:2557:1: ( ( rule__ExpressionLevel6__RightAssignment_1_2 ) )
            // InternalExpressions.g:2558:2: ( rule__ExpressionLevel6__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionLevel6Access().getRightAssignment_1_2()); 
            // InternalExpressions.g:2559:2: ( rule__ExpressionLevel6__RightAssignment_1_2 )
            // InternalExpressions.g:2559:3: rule__ExpressionLevel6__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel6__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel6Access().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel6__Group_1__2__Impl"


    // $ANTLR start "rule__ExpressionNot__Group__0"
    // InternalExpressions.g:2568:1: rule__ExpressionNot__Group__0 : rule__ExpressionNot__Group__0__Impl rule__ExpressionNot__Group__1 ;
    public final void rule__ExpressionNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2572:1: ( rule__ExpressionNot__Group__0__Impl rule__ExpressionNot__Group__1 )
            // InternalExpressions.g:2573:2: rule__ExpressionNot__Group__0__Impl rule__ExpressionNot__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionNot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionNot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionNot__Group__0"


    // $ANTLR start "rule__ExpressionNot__Group__0__Impl"
    // InternalExpressions.g:2580:1: rule__ExpressionNot__Group__0__Impl : ( ( rule__ExpressionNot__Alternatives_0 ) ) ;
    public final void rule__ExpressionNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2584:1: ( ( ( rule__ExpressionNot__Alternatives_0 ) ) )
            // InternalExpressions.g:2585:1: ( ( rule__ExpressionNot__Alternatives_0 ) )
            {
            // InternalExpressions.g:2585:1: ( ( rule__ExpressionNot__Alternatives_0 ) )
            // InternalExpressions.g:2586:2: ( rule__ExpressionNot__Alternatives_0 )
            {
             before(grammarAccess.getExpressionNotAccess().getAlternatives_0()); 
            // InternalExpressions.g:2587:2: ( rule__ExpressionNot__Alternatives_0 )
            // InternalExpressions.g:2587:3: rule__ExpressionNot__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionNot__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionNotAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionNot__Group__0__Impl"


    // $ANTLR start "rule__ExpressionNot__Group__1"
    // InternalExpressions.g:2595:1: rule__ExpressionNot__Group__1 : rule__ExpressionNot__Group__1__Impl ;
    public final void rule__ExpressionNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2599:1: ( rule__ExpressionNot__Group__1__Impl )
            // InternalExpressions.g:2600:2: rule__ExpressionNot__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionNot__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionNot__Group__1"


    // $ANTLR start "rule__ExpressionNot__Group__1__Impl"
    // InternalExpressions.g:2606:1: rule__ExpressionNot__Group__1__Impl : ( ( rule__ExpressionNot__SubAssignment_1 ) ) ;
    public final void rule__ExpressionNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2610:1: ( ( ( rule__ExpressionNot__SubAssignment_1 ) ) )
            // InternalExpressions.g:2611:1: ( ( rule__ExpressionNot__SubAssignment_1 ) )
            {
            // InternalExpressions.g:2611:1: ( ( rule__ExpressionNot__SubAssignment_1 ) )
            // InternalExpressions.g:2612:2: ( rule__ExpressionNot__SubAssignment_1 )
            {
             before(grammarAccess.getExpressionNotAccess().getSubAssignment_1()); 
            // InternalExpressions.g:2613:2: ( rule__ExpressionNot__SubAssignment_1 )
            // InternalExpressions.g:2613:3: rule__ExpressionNot__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionNot__SubAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionNotAccess().getSubAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionNot__Group__1__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__0"
    // InternalExpressions.g:2622:1: rule__ExpressionMinus__Group__0 : rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 ;
    public final void rule__ExpressionMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2626:1: ( rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 )
            // InternalExpressions.g:2627:2: rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__0"


    // $ANTLR start "rule__ExpressionMinus__Group__0__Impl"
    // InternalExpressions.g:2634:1: rule__ExpressionMinus__Group__0__Impl : ( '-' ) ;
    public final void rule__ExpressionMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2638:1: ( ( '-' ) )
            // InternalExpressions.g:2639:1: ( '-' )
            {
            // InternalExpressions.g:2639:1: ( '-' )
            // InternalExpressions.g:2640:2: '-'
            {
             before(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__1"
    // InternalExpressions.g:2649:1: rule__ExpressionMinus__Group__1 : rule__ExpressionMinus__Group__1__Impl ;
    public final void rule__ExpressionMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2653:1: ( rule__ExpressionMinus__Group__1__Impl )
            // InternalExpressions.g:2654:2: rule__ExpressionMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__1"


    // $ANTLR start "rule__ExpressionMinus__Group__1__Impl"
    // InternalExpressions.g:2660:1: rule__ExpressionMinus__Group__1__Impl : ( ( rule__ExpressionMinus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2664:1: ( ( ( rule__ExpressionMinus__SubAssignment_1 ) ) )
            // InternalExpressions.g:2665:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            {
            // InternalExpressions.g:2665:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            // InternalExpressions.g:2666:2: ( rule__ExpressionMinus__SubAssignment_1 )
            {
             before(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 
            // InternalExpressions.g:2667:2: ( rule__ExpressionMinus__SubAssignment_1 )
            // InternalExpressions.g:2667:3: rule__ExpressionMinus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__SubAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__0"
    // InternalExpressions.g:2676:1: rule__ExpressionPlus__Group__0 : rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 ;
    public final void rule__ExpressionPlus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2680:1: ( rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 )
            // InternalExpressions.g:2681:2: rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionPlus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__0"


    // $ANTLR start "rule__ExpressionPlus__Group__0__Impl"
    // InternalExpressions.g:2688:1: rule__ExpressionPlus__Group__0__Impl : ( '+' ) ;
    public final void rule__ExpressionPlus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2692:1: ( ( '+' ) )
            // InternalExpressions.g:2693:1: ( '+' )
            {
            // InternalExpressions.g:2693:1: ( '+' )
            // InternalExpressions.g:2694:2: '+'
            {
             before(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__1"
    // InternalExpressions.g:2703:1: rule__ExpressionPlus__Group__1 : rule__ExpressionPlus__Group__1__Impl ;
    public final void rule__ExpressionPlus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2707:1: ( rule__ExpressionPlus__Group__1__Impl )
            // InternalExpressions.g:2708:2: rule__ExpressionPlus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__1"


    // $ANTLR start "rule__ExpressionPlus__Group__1__Impl"
    // InternalExpressions.g:2714:1: rule__ExpressionPlus__Group__1__Impl : ( ( rule__ExpressionPlus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionPlus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2718:1: ( ( ( rule__ExpressionPlus__SubAssignment_1 ) ) )
            // InternalExpressions.g:2719:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            {
            // InternalExpressions.g:2719:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            // InternalExpressions.g:2720:2: ( rule__ExpressionPlus__SubAssignment_1 )
            {
             before(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 
            // InternalExpressions.g:2721:2: ( rule__ExpressionPlus__SubAssignment_1 )
            // InternalExpressions.g:2721:3: rule__ExpressionPlus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__SubAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__0"
    // InternalExpressions.g:2730:1: rule__ExpressionBracket__Group__0 : rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 ;
    public final void rule__ExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2734:1: ( rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 )
            // InternalExpressions.g:2735:2: rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionBracket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__0"


    // $ANTLR start "rule__ExpressionBracket__Group__0__Impl"
    // InternalExpressions.g:2742:1: rule__ExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__ExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2746:1: ( ( '(' ) )
            // InternalExpressions.g:2747:1: ( '(' )
            {
            // InternalExpressions.g:2747:1: ( '(' )
            // InternalExpressions.g:2748:2: '('
            {
             before(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__1"
    // InternalExpressions.g:2757:1: rule__ExpressionBracket__Group__1 : rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 ;
    public final void rule__ExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2761:1: ( rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 )
            // InternalExpressions.g:2762:2: rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ExpressionBracket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__1"


    // $ANTLR start "rule__ExpressionBracket__Group__1__Impl"
    // InternalExpressions.g:2769:1: rule__ExpressionBracket__Group__1__Impl : ( ( rule__ExpressionBracket__SubAssignment_1 ) ) ;
    public final void rule__ExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2773:1: ( ( ( rule__ExpressionBracket__SubAssignment_1 ) ) )
            // InternalExpressions.g:2774:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            {
            // InternalExpressions.g:2774:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            // InternalExpressions.g:2775:2: ( rule__ExpressionBracket__SubAssignment_1 )
            {
             before(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 
            // InternalExpressions.g:2776:2: ( rule__ExpressionBracket__SubAssignment_1 )
            // InternalExpressions.g:2776:3: rule__ExpressionBracket__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__SubAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__2"
    // InternalExpressions.g:2784:1: rule__ExpressionBracket__Group__2 : rule__ExpressionBracket__Group__2__Impl ;
    public final void rule__ExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2788:1: ( rule__ExpressionBracket__Group__2__Impl )
            // InternalExpressions.g:2789:2: rule__ExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__2"


    // $ANTLR start "rule__ExpressionBracket__Group__2__Impl"
    // InternalExpressions.g:2795:1: rule__ExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__ExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2799:1: ( ( ')' ) )
            // InternalExpressions.g:2800:1: ( ')' )
            {
            // InternalExpressions.g:2800:1: ( ')' )
            // InternalExpressions.g:2801:2: ')'
            {
             before(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__ExpressionQuantifier__Group__0"
    // InternalExpressions.g:2811:1: rule__ExpressionQuantifier__Group__0 : rule__ExpressionQuantifier__Group__0__Impl rule__ExpressionQuantifier__Group__1 ;
    public final void rule__ExpressionQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2815:1: ( rule__ExpressionQuantifier__Group__0__Impl rule__ExpressionQuantifier__Group__1 )
            // InternalExpressions.g:2816:2: rule__ExpressionQuantifier__Group__0__Impl rule__ExpressionQuantifier__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ExpressionQuantifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__0"


    // $ANTLR start "rule__ExpressionQuantifier__Group__0__Impl"
    // InternalExpressions.g:2823:1: rule__ExpressionQuantifier__Group__0__Impl : ( ( rule__ExpressionQuantifier__QuantifierAssignment_0 ) ) ;
    public final void rule__ExpressionQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2827:1: ( ( ( rule__ExpressionQuantifier__QuantifierAssignment_0 ) ) )
            // InternalExpressions.g:2828:1: ( ( rule__ExpressionQuantifier__QuantifierAssignment_0 ) )
            {
            // InternalExpressions.g:2828:1: ( ( rule__ExpressionQuantifier__QuantifierAssignment_0 ) )
            // InternalExpressions.g:2829:2: ( rule__ExpressionQuantifier__QuantifierAssignment_0 )
            {
             before(grammarAccess.getExpressionQuantifierAccess().getQuantifierAssignment_0()); 
            // InternalExpressions.g:2830:2: ( rule__ExpressionQuantifier__QuantifierAssignment_0 )
            // InternalExpressions.g:2830:3: rule__ExpressionQuantifier__QuantifierAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__QuantifierAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionQuantifierAccess().getQuantifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__0__Impl"


    // $ANTLR start "rule__ExpressionQuantifier__Group__1"
    // InternalExpressions.g:2838:1: rule__ExpressionQuantifier__Group__1 : rule__ExpressionQuantifier__Group__1__Impl rule__ExpressionQuantifier__Group__2 ;
    public final void rule__ExpressionQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2842:1: ( rule__ExpressionQuantifier__Group__1__Impl rule__ExpressionQuantifier__Group__2 )
            // InternalExpressions.g:2843:2: rule__ExpressionQuantifier__Group__1__Impl rule__ExpressionQuantifier__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ExpressionQuantifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__1"


    // $ANTLR start "rule__ExpressionQuantifier__Group__1__Impl"
    // InternalExpressions.g:2850:1: rule__ExpressionQuantifier__Group__1__Impl : ( '(' ) ;
    public final void rule__ExpressionQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2854:1: ( ( '(' ) )
            // InternalExpressions.g:2855:1: ( '(' )
            {
            // InternalExpressions.g:2855:1: ( '(' )
            // InternalExpressions.g:2856:2: '('
            {
             before(grammarAccess.getExpressionQuantifierAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExpressionQuantifierAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__1__Impl"


    // $ANTLR start "rule__ExpressionQuantifier__Group__2"
    // InternalExpressions.g:2865:1: rule__ExpressionQuantifier__Group__2 : rule__ExpressionQuantifier__Group__2__Impl rule__ExpressionQuantifier__Group__3 ;
    public final void rule__ExpressionQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2869:1: ( rule__ExpressionQuantifier__Group__2__Impl rule__ExpressionQuantifier__Group__3 )
            // InternalExpressions.g:2870:2: rule__ExpressionQuantifier__Group__2__Impl rule__ExpressionQuantifier__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__ExpressionQuantifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__2"


    // $ANTLR start "rule__ExpressionQuantifier__Group__2__Impl"
    // InternalExpressions.g:2877:1: rule__ExpressionQuantifier__Group__2__Impl : ( ( rule__ExpressionQuantifier__IteratorAssignment_2 ) ) ;
    public final void rule__ExpressionQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2881:1: ( ( ( rule__ExpressionQuantifier__IteratorAssignment_2 ) ) )
            // InternalExpressions.g:2882:1: ( ( rule__ExpressionQuantifier__IteratorAssignment_2 ) )
            {
            // InternalExpressions.g:2882:1: ( ( rule__ExpressionQuantifier__IteratorAssignment_2 ) )
            // InternalExpressions.g:2883:2: ( rule__ExpressionQuantifier__IteratorAssignment_2 )
            {
             before(grammarAccess.getExpressionQuantifierAccess().getIteratorAssignment_2()); 
            // InternalExpressions.g:2884:2: ( rule__ExpressionQuantifier__IteratorAssignment_2 )
            // InternalExpressions.g:2884:3: rule__ExpressionQuantifier__IteratorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__IteratorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionQuantifierAccess().getIteratorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__2__Impl"


    // $ANTLR start "rule__ExpressionQuantifier__Group__3"
    // InternalExpressions.g:2892:1: rule__ExpressionQuantifier__Group__3 : rule__ExpressionQuantifier__Group__3__Impl rule__ExpressionQuantifier__Group__4 ;
    public final void rule__ExpressionQuantifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2896:1: ( rule__ExpressionQuantifier__Group__3__Impl rule__ExpressionQuantifier__Group__4 )
            // InternalExpressions.g:2897:2: rule__ExpressionQuantifier__Group__3__Impl rule__ExpressionQuantifier__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionQuantifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__3"


    // $ANTLR start "rule__ExpressionQuantifier__Group__3__Impl"
    // InternalExpressions.g:2904:1: rule__ExpressionQuantifier__Group__3__Impl : ( 'in' ) ;
    public final void rule__ExpressionQuantifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2908:1: ( ( 'in' ) )
            // InternalExpressions.g:2909:1: ( 'in' )
            {
            // InternalExpressions.g:2909:1: ( 'in' )
            // InternalExpressions.g:2910:2: 'in'
            {
             before(grammarAccess.getExpressionQuantifierAccess().getInKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExpressionQuantifierAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__3__Impl"


    // $ANTLR start "rule__ExpressionQuantifier__Group__4"
    // InternalExpressions.g:2919:1: rule__ExpressionQuantifier__Group__4 : rule__ExpressionQuantifier__Group__4__Impl rule__ExpressionQuantifier__Group__5 ;
    public final void rule__ExpressionQuantifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2923:1: ( rule__ExpressionQuantifier__Group__4__Impl rule__ExpressionQuantifier__Group__5 )
            // InternalExpressions.g:2924:2: rule__ExpressionQuantifier__Group__4__Impl rule__ExpressionQuantifier__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__ExpressionQuantifier__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__4"


    // $ANTLR start "rule__ExpressionQuantifier__Group__4__Impl"
    // InternalExpressions.g:2931:1: rule__ExpressionQuantifier__Group__4__Impl : ( ( rule__ExpressionQuantifier__CollectionAssignment_4 ) ) ;
    public final void rule__ExpressionQuantifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2935:1: ( ( ( rule__ExpressionQuantifier__CollectionAssignment_4 ) ) )
            // InternalExpressions.g:2936:1: ( ( rule__ExpressionQuantifier__CollectionAssignment_4 ) )
            {
            // InternalExpressions.g:2936:1: ( ( rule__ExpressionQuantifier__CollectionAssignment_4 ) )
            // InternalExpressions.g:2937:2: ( rule__ExpressionQuantifier__CollectionAssignment_4 )
            {
             before(grammarAccess.getExpressionQuantifierAccess().getCollectionAssignment_4()); 
            // InternalExpressions.g:2938:2: ( rule__ExpressionQuantifier__CollectionAssignment_4 )
            // InternalExpressions.g:2938:3: rule__ExpressionQuantifier__CollectionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__CollectionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExpressionQuantifierAccess().getCollectionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__4__Impl"


    // $ANTLR start "rule__ExpressionQuantifier__Group__5"
    // InternalExpressions.g:2946:1: rule__ExpressionQuantifier__Group__5 : rule__ExpressionQuantifier__Group__5__Impl rule__ExpressionQuantifier__Group__6 ;
    public final void rule__ExpressionQuantifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2950:1: ( rule__ExpressionQuantifier__Group__5__Impl rule__ExpressionQuantifier__Group__6 )
            // InternalExpressions.g:2951:2: rule__ExpressionQuantifier__Group__5__Impl rule__ExpressionQuantifier__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionQuantifier__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__5"


    // $ANTLR start "rule__ExpressionQuantifier__Group__5__Impl"
    // InternalExpressions.g:2958:1: rule__ExpressionQuantifier__Group__5__Impl : ( ':' ) ;
    public final void rule__ExpressionQuantifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2962:1: ( ( ':' ) )
            // InternalExpressions.g:2963:1: ( ':' )
            {
            // InternalExpressions.g:2963:1: ( ':' )
            // InternalExpressions.g:2964:2: ':'
            {
             before(grammarAccess.getExpressionQuantifierAccess().getColonKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExpressionQuantifierAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__5__Impl"


    // $ANTLR start "rule__ExpressionQuantifier__Group__6"
    // InternalExpressions.g:2973:1: rule__ExpressionQuantifier__Group__6 : rule__ExpressionQuantifier__Group__6__Impl rule__ExpressionQuantifier__Group__7 ;
    public final void rule__ExpressionQuantifier__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2977:1: ( rule__ExpressionQuantifier__Group__6__Impl rule__ExpressionQuantifier__Group__7 )
            // InternalExpressions.g:2978:2: rule__ExpressionQuantifier__Group__6__Impl rule__ExpressionQuantifier__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__ExpressionQuantifier__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__6"


    // $ANTLR start "rule__ExpressionQuantifier__Group__6__Impl"
    // InternalExpressions.g:2985:1: rule__ExpressionQuantifier__Group__6__Impl : ( ( rule__ExpressionQuantifier__ConditionAssignment_6 ) ) ;
    public final void rule__ExpressionQuantifier__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:2989:1: ( ( ( rule__ExpressionQuantifier__ConditionAssignment_6 ) ) )
            // InternalExpressions.g:2990:1: ( ( rule__ExpressionQuantifier__ConditionAssignment_6 ) )
            {
            // InternalExpressions.g:2990:1: ( ( rule__ExpressionQuantifier__ConditionAssignment_6 ) )
            // InternalExpressions.g:2991:2: ( rule__ExpressionQuantifier__ConditionAssignment_6 )
            {
             before(grammarAccess.getExpressionQuantifierAccess().getConditionAssignment_6()); 
            // InternalExpressions.g:2992:2: ( rule__ExpressionQuantifier__ConditionAssignment_6 )
            // InternalExpressions.g:2992:3: rule__ExpressionQuantifier__ConditionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__ConditionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExpressionQuantifierAccess().getConditionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__6__Impl"


    // $ANTLR start "rule__ExpressionQuantifier__Group__7"
    // InternalExpressions.g:3000:1: rule__ExpressionQuantifier__Group__7 : rule__ExpressionQuantifier__Group__7__Impl ;
    public final void rule__ExpressionQuantifier__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3004:1: ( rule__ExpressionQuantifier__Group__7__Impl )
            // InternalExpressions.g:3005:2: rule__ExpressionQuantifier__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionQuantifier__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__7"


    // $ANTLR start "rule__ExpressionQuantifier__Group__7__Impl"
    // InternalExpressions.g:3011:1: rule__ExpressionQuantifier__Group__7__Impl : ( ')' ) ;
    public final void rule__ExpressionQuantifier__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3015:1: ( ( ')' ) )
            // InternalExpressions.g:3016:1: ( ')' )
            {
            // InternalExpressions.g:3016:1: ( ')' )
            // InternalExpressions.g:3017:2: ')'
            {
             before(grammarAccess.getExpressionQuantifierAccess().getRightParenthesisKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getExpressionQuantifierAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__Group__7__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group__0"
    // InternalExpressions.g:3027:1: rule__ExpressionTypeAnnotated__Group__0 : rule__ExpressionTypeAnnotated__Group__0__Impl rule__ExpressionTypeAnnotated__Group__1 ;
    public final void rule__ExpressionTypeAnnotated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3031:1: ( rule__ExpressionTypeAnnotated__Group__0__Impl rule__ExpressionTypeAnnotated__Group__1 )
            // InternalExpressions.g:3032:2: rule__ExpressionTypeAnnotated__Group__0__Impl rule__ExpressionTypeAnnotated__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ExpressionTypeAnnotated__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group__0"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group__0__Impl"
    // InternalExpressions.g:3039:1: rule__ExpressionTypeAnnotated__Group__0__Impl : ( ruleTypeAnnotation ) ;
    public final void rule__ExpressionTypeAnnotated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3043:1: ( ( ruleTypeAnnotation ) )
            // InternalExpressions.g:3044:1: ( ruleTypeAnnotation )
            {
            // InternalExpressions.g:3044:1: ( ruleTypeAnnotation )
            // InternalExpressions.g:3045:2: ruleTypeAnnotation
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getTypeAnnotationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAnnotation();

            state._fsp--;

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getTypeAnnotationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group__0__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group__1"
    // InternalExpressions.g:3054:1: rule__ExpressionTypeAnnotated__Group__1 : rule__ExpressionTypeAnnotated__Group__1__Impl ;
    public final void rule__ExpressionTypeAnnotated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3058:1: ( rule__ExpressionTypeAnnotated__Group__1__Impl )
            // InternalExpressions.g:3059:2: rule__ExpressionTypeAnnotated__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group__1"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group__1__Impl"
    // InternalExpressions.g:3065:1: rule__ExpressionTypeAnnotated__Group__1__Impl : ( ( rule__ExpressionTypeAnnotated__Alternatives_1 ) ) ;
    public final void rule__ExpressionTypeAnnotated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3069:1: ( ( ( rule__ExpressionTypeAnnotated__Alternatives_1 ) ) )
            // InternalExpressions.g:3070:1: ( ( rule__ExpressionTypeAnnotated__Alternatives_1 ) )
            {
            // InternalExpressions.g:3070:1: ( ( rule__ExpressionTypeAnnotated__Alternatives_1 ) )
            // InternalExpressions.g:3071:2: ( rule__ExpressionTypeAnnotated__Alternatives_1 )
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getAlternatives_1()); 
            // InternalExpressions.g:3072:2: ( rule__ExpressionTypeAnnotated__Alternatives_1 )
            // InternalExpressions.g:3072:3: rule__ExpressionTypeAnnotated__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group__1__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0__0"
    // InternalExpressions.g:3081:1: rule__ExpressionTypeAnnotated__Group_1_0__0 : rule__ExpressionTypeAnnotated__Group_1_0__0__Impl rule__ExpressionTypeAnnotated__Group_1_0__1 ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3085:1: ( rule__ExpressionTypeAnnotated__Group_1_0__0__Impl rule__ExpressionTypeAnnotated__Group_1_0__1 )
            // InternalExpressions.g:3086:2: rule__ExpressionTypeAnnotated__Group_1_0__0__Impl rule__ExpressionTypeAnnotated__Group_1_0__1
            {
            pushFollow(FOLLOW_31);
            rule__ExpressionTypeAnnotated__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0__0"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0__0__Impl"
    // InternalExpressions.g:3093:1: rule__ExpressionTypeAnnotated__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3097:1: ( ( () ) )
            // InternalExpressions.g:3098:1: ( () )
            {
            // InternalExpressions.g:3098:1: ( () )
            // InternalExpressions.g:3099:2: ()
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getExpressionVectorTypeAnnotationAction_1_0_0()); 
            // InternalExpressions.g:3100:2: ()
            // InternalExpressions.g:3100:3: 
            {
            }

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getExpressionVectorTypeAnnotationAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0__1"
    // InternalExpressions.g:3108:1: rule__ExpressionTypeAnnotated__Group_1_0__1 : rule__ExpressionTypeAnnotated__Group_1_0__1__Impl rule__ExpressionTypeAnnotated__Group_1_0__2 ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3112:1: ( rule__ExpressionTypeAnnotated__Group_1_0__1__Impl rule__ExpressionTypeAnnotated__Group_1_0__2 )
            // InternalExpressions.g:3113:2: rule__ExpressionTypeAnnotated__Group_1_0__1__Impl rule__ExpressionTypeAnnotated__Group_1_0__2
            {
            pushFollow(FOLLOW_32);
            rule__ExpressionTypeAnnotated__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0__1"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0__1__Impl"
    // InternalExpressions.g:3120:1: rule__ExpressionTypeAnnotated__Group_1_0__1__Impl : ( '[' ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3124:1: ( ( '[' ) )
            // InternalExpressions.g:3125:1: ( '[' )
            {
            // InternalExpressions.g:3125:1: ( '[' )
            // InternalExpressions.g:3126:2: '['
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getLeftSquareBracketKeyword_1_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExpressionTypeAnnotatedAccess().getLeftSquareBracketKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0__2"
    // InternalExpressions.g:3135:1: rule__ExpressionTypeAnnotated__Group_1_0__2 : rule__ExpressionTypeAnnotated__Group_1_0__2__Impl rule__ExpressionTypeAnnotated__Group_1_0__3 ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3139:1: ( rule__ExpressionTypeAnnotated__Group_1_0__2__Impl rule__ExpressionTypeAnnotated__Group_1_0__3 )
            // InternalExpressions.g:3140:2: rule__ExpressionTypeAnnotated__Group_1_0__2__Impl rule__ExpressionTypeAnnotated__Group_1_0__3
            {
            pushFollow(FOLLOW_32);
            rule__ExpressionTypeAnnotated__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0__2"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0__2__Impl"
    // InternalExpressions.g:3147:1: rule__ExpressionTypeAnnotated__Group_1_0__2__Impl : ( ( rule__ExpressionTypeAnnotated__Group_1_0_2__0 )? ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3151:1: ( ( ( rule__ExpressionTypeAnnotated__Group_1_0_2__0 )? ) )
            // InternalExpressions.g:3152:1: ( ( rule__ExpressionTypeAnnotated__Group_1_0_2__0 )? )
            {
            // InternalExpressions.g:3152:1: ( ( rule__ExpressionTypeAnnotated__Group_1_0_2__0 )? )
            // InternalExpressions.g:3153:2: ( rule__ExpressionTypeAnnotated__Group_1_0_2__0 )?
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup_1_0_2()); 
            // InternalExpressions.g:3154:2: ( rule__ExpressionTypeAnnotated__Group_1_0_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||(LA19_0>=16 && LA19_0<=20)||(LA19_0>=26 && LA19_0<=28)||LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalExpressions.g:3154:3: rule__ExpressionTypeAnnotated__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionTypeAnnotated__Group_1_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0__3"
    // InternalExpressions.g:3162:1: rule__ExpressionTypeAnnotated__Group_1_0__3 : rule__ExpressionTypeAnnotated__Group_1_0__3__Impl ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3166:1: ( rule__ExpressionTypeAnnotated__Group_1_0__3__Impl )
            // InternalExpressions.g:3167:2: rule__ExpressionTypeAnnotated__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0__3"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0__3__Impl"
    // InternalExpressions.g:3173:1: rule__ExpressionTypeAnnotated__Group_1_0__3__Impl : ( ']' ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3177:1: ( ( ']' ) )
            // InternalExpressions.g:3178:1: ( ']' )
            {
            // InternalExpressions.g:3178:1: ( ']' )
            // InternalExpressions.g:3179:2: ']'
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getRightSquareBracketKeyword_1_0_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getExpressionTypeAnnotatedAccess().getRightSquareBracketKeyword_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0__3__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0_2__0"
    // InternalExpressions.g:3189:1: rule__ExpressionTypeAnnotated__Group_1_0_2__0 : rule__ExpressionTypeAnnotated__Group_1_0_2__0__Impl rule__ExpressionTypeAnnotated__Group_1_0_2__1 ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3193:1: ( rule__ExpressionTypeAnnotated__Group_1_0_2__0__Impl rule__ExpressionTypeAnnotated__Group_1_0_2__1 )
            // InternalExpressions.g:3194:2: rule__ExpressionTypeAnnotated__Group_1_0_2__0__Impl rule__ExpressionTypeAnnotated__Group_1_0_2__1
            {
            pushFollow(FOLLOW_33);
            rule__ExpressionTypeAnnotated__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0_2__0"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0_2__0__Impl"
    // InternalExpressions.g:3201:1: rule__ExpressionTypeAnnotated__Group_1_0_2__0__Impl : ( ( rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_0 ) ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3205:1: ( ( ( rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_0 ) ) )
            // InternalExpressions.g:3206:1: ( ( rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_0 ) )
            {
            // InternalExpressions.g:3206:1: ( ( rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_0 ) )
            // InternalExpressions.g:3207:2: ( rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_0 )
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getElementsAssignment_1_0_2_0()); 
            // InternalExpressions.g:3208:2: ( rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_0 )
            // InternalExpressions.g:3208:3: rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getElementsAssignment_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0_2__1"
    // InternalExpressions.g:3216:1: rule__ExpressionTypeAnnotated__Group_1_0_2__1 : rule__ExpressionTypeAnnotated__Group_1_0_2__1__Impl ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3220:1: ( rule__ExpressionTypeAnnotated__Group_1_0_2__1__Impl )
            // InternalExpressions.g:3221:2: rule__ExpressionTypeAnnotated__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0_2__1"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0_2__1__Impl"
    // InternalExpressions.g:3227:1: rule__ExpressionTypeAnnotated__Group_1_0_2__1__Impl : ( ( rule__ExpressionTypeAnnotated__Group_1_0_2_1__0 )* ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3231:1: ( ( ( rule__ExpressionTypeAnnotated__Group_1_0_2_1__0 )* ) )
            // InternalExpressions.g:3232:1: ( ( rule__ExpressionTypeAnnotated__Group_1_0_2_1__0 )* )
            {
            // InternalExpressions.g:3232:1: ( ( rule__ExpressionTypeAnnotated__Group_1_0_2_1__0 )* )
            // InternalExpressions.g:3233:2: ( rule__ExpressionTypeAnnotated__Group_1_0_2_1__0 )*
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup_1_0_2_1()); 
            // InternalExpressions.g:3234:2: ( rule__ExpressionTypeAnnotated__Group_1_0_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalExpressions.g:3234:3: rule__ExpressionTypeAnnotated__Group_1_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__ExpressionTypeAnnotated__Group_1_0_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0_2_1__0"
    // InternalExpressions.g:3243:1: rule__ExpressionTypeAnnotated__Group_1_0_2_1__0 : rule__ExpressionTypeAnnotated__Group_1_0_2_1__0__Impl rule__ExpressionTypeAnnotated__Group_1_0_2_1__1 ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3247:1: ( rule__ExpressionTypeAnnotated__Group_1_0_2_1__0__Impl rule__ExpressionTypeAnnotated__Group_1_0_2_1__1 )
            // InternalExpressions.g:3248:2: rule__ExpressionTypeAnnotated__Group_1_0_2_1__0__Impl rule__ExpressionTypeAnnotated__Group_1_0_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionTypeAnnotated__Group_1_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0_2_1__0"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0_2_1__0__Impl"
    // InternalExpressions.g:3255:1: rule__ExpressionTypeAnnotated__Group_1_0_2_1__0__Impl : ( ',' ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3259:1: ( ( ',' ) )
            // InternalExpressions.g:3260:1: ( ',' )
            {
            // InternalExpressions.g:3260:1: ( ',' )
            // InternalExpressions.g:3261:2: ','
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getCommaKeyword_1_0_2_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getExpressionTypeAnnotatedAccess().getCommaKeyword_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0_2_1__0__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0_2_1__1"
    // InternalExpressions.g:3270:1: rule__ExpressionTypeAnnotated__Group_1_0_2_1__1 : rule__ExpressionTypeAnnotated__Group_1_0_2_1__1__Impl ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3274:1: ( rule__ExpressionTypeAnnotated__Group_1_0_2_1__1__Impl )
            // InternalExpressions.g:3275:2: rule__ExpressionTypeAnnotated__Group_1_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_0_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0_2_1__1"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_0_2_1__1__Impl"
    // InternalExpressions.g:3281:1: rule__ExpressionTypeAnnotated__Group_1_0_2_1__1__Impl : ( ( rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_1_1 ) ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3285:1: ( ( ( rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_1_1 ) ) )
            // InternalExpressions.g:3286:1: ( ( rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_1_1 ) )
            {
            // InternalExpressions.g:3286:1: ( ( rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_1_1 ) )
            // InternalExpressions.g:3287:2: ( rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_1_1 )
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getElementsAssignment_1_0_2_1_1()); 
            // InternalExpressions.g:3288:2: ( rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_1_1 )
            // InternalExpressions.g:3288:3: rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getElementsAssignment_1_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_0_2_1__1__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1__0"
    // InternalExpressions.g:3297:1: rule__ExpressionTypeAnnotated__Group_1_1__0 : rule__ExpressionTypeAnnotated__Group_1_1__0__Impl rule__ExpressionTypeAnnotated__Group_1_1__1 ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3301:1: ( rule__ExpressionTypeAnnotated__Group_1_1__0__Impl rule__ExpressionTypeAnnotated__Group_1_1__1 )
            // InternalExpressions.g:3302:2: rule__ExpressionTypeAnnotated__Group_1_1__0__Impl rule__ExpressionTypeAnnotated__Group_1_1__1
            {
            pushFollow(FOLLOW_30);
            rule__ExpressionTypeAnnotated__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1__0"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1__0__Impl"
    // InternalExpressions.g:3309:1: rule__ExpressionTypeAnnotated__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3313:1: ( ( () ) )
            // InternalExpressions.g:3314:1: ( () )
            {
            // InternalExpressions.g:3314:1: ( () )
            // InternalExpressions.g:3315:2: ()
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getExpressionMapTypeAnnotationAction_1_1_0()); 
            // InternalExpressions.g:3316:2: ()
            // InternalExpressions.g:3316:3: 
            {
            }

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getExpressionMapTypeAnnotationAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1__1"
    // InternalExpressions.g:3324:1: rule__ExpressionTypeAnnotated__Group_1_1__1 : rule__ExpressionTypeAnnotated__Group_1_1__1__Impl rule__ExpressionTypeAnnotated__Group_1_1__2 ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3328:1: ( rule__ExpressionTypeAnnotated__Group_1_1__1__Impl rule__ExpressionTypeAnnotated__Group_1_1__2 )
            // InternalExpressions.g:3329:2: rule__ExpressionTypeAnnotated__Group_1_1__1__Impl rule__ExpressionTypeAnnotated__Group_1_1__2
            {
            pushFollow(FOLLOW_35);
            rule__ExpressionTypeAnnotated__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1__1"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1__1__Impl"
    // InternalExpressions.g:3336:1: rule__ExpressionTypeAnnotated__Group_1_1__1__Impl : ( '{' ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3340:1: ( ( '{' ) )
            // InternalExpressions.g:3341:1: ( '{' )
            {
            // InternalExpressions.g:3341:1: ( '{' )
            // InternalExpressions.g:3342:2: '{'
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getLeftCurlyBracketKeyword_1_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getExpressionTypeAnnotatedAccess().getLeftCurlyBracketKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1__2"
    // InternalExpressions.g:3351:1: rule__ExpressionTypeAnnotated__Group_1_1__2 : rule__ExpressionTypeAnnotated__Group_1_1__2__Impl rule__ExpressionTypeAnnotated__Group_1_1__3 ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3355:1: ( rule__ExpressionTypeAnnotated__Group_1_1__2__Impl rule__ExpressionTypeAnnotated__Group_1_1__3 )
            // InternalExpressions.g:3356:2: rule__ExpressionTypeAnnotated__Group_1_1__2__Impl rule__ExpressionTypeAnnotated__Group_1_1__3
            {
            pushFollow(FOLLOW_35);
            rule__ExpressionTypeAnnotated__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1__2"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1__2__Impl"
    // InternalExpressions.g:3363:1: rule__ExpressionTypeAnnotated__Group_1_1__2__Impl : ( ( rule__ExpressionTypeAnnotated__Group_1_1_2__0 )? ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3367:1: ( ( ( rule__ExpressionTypeAnnotated__Group_1_1_2__0 )? ) )
            // InternalExpressions.g:3368:1: ( ( rule__ExpressionTypeAnnotated__Group_1_1_2__0 )? )
            {
            // InternalExpressions.g:3368:1: ( ( rule__ExpressionTypeAnnotated__Group_1_1_2__0 )? )
            // InternalExpressions.g:3369:2: ( rule__ExpressionTypeAnnotated__Group_1_1_2__0 )?
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup_1_1_2()); 
            // InternalExpressions.g:3370:2: ( rule__ExpressionTypeAnnotated__Group_1_1_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||(LA21_0>=16 && LA21_0<=20)||(LA21_0>=26 && LA21_0<=28)||LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalExpressions.g:3370:3: rule__ExpressionTypeAnnotated__Group_1_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionTypeAnnotated__Group_1_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1__3"
    // InternalExpressions.g:3378:1: rule__ExpressionTypeAnnotated__Group_1_1__3 : rule__ExpressionTypeAnnotated__Group_1_1__3__Impl ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3382:1: ( rule__ExpressionTypeAnnotated__Group_1_1__3__Impl )
            // InternalExpressions.g:3383:2: rule__ExpressionTypeAnnotated__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1__3"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1__3__Impl"
    // InternalExpressions.g:3389:1: rule__ExpressionTypeAnnotated__Group_1_1__3__Impl : ( '}' ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3393:1: ( ( '}' ) )
            // InternalExpressions.g:3394:1: ( '}' )
            {
            // InternalExpressions.g:3394:1: ( '}' )
            // InternalExpressions.g:3395:2: '}'
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getRightCurlyBracketKeyword_1_1_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getExpressionTypeAnnotatedAccess().getRightCurlyBracketKeyword_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1__3__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1_2__0"
    // InternalExpressions.g:3405:1: rule__ExpressionTypeAnnotated__Group_1_1_2__0 : rule__ExpressionTypeAnnotated__Group_1_1_2__0__Impl rule__ExpressionTypeAnnotated__Group_1_1_2__1 ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3409:1: ( rule__ExpressionTypeAnnotated__Group_1_1_2__0__Impl rule__ExpressionTypeAnnotated__Group_1_1_2__1 )
            // InternalExpressions.g:3410:2: rule__ExpressionTypeAnnotated__Group_1_1_2__0__Impl rule__ExpressionTypeAnnotated__Group_1_1_2__1
            {
            pushFollow(FOLLOW_33);
            rule__ExpressionTypeAnnotated__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1_2__0"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1_2__0__Impl"
    // InternalExpressions.g:3417:1: rule__ExpressionTypeAnnotated__Group_1_1_2__0__Impl : ( ( rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_0 ) ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3421:1: ( ( ( rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_0 ) ) )
            // InternalExpressions.g:3422:1: ( ( rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_0 ) )
            {
            // InternalExpressions.g:3422:1: ( ( rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_0 ) )
            // InternalExpressions.g:3423:2: ( rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_0 )
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getPairsAssignment_1_1_2_0()); 
            // InternalExpressions.g:3424:2: ( rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_0 )
            // InternalExpressions.g:3424:3: rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getPairsAssignment_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1_2__1"
    // InternalExpressions.g:3432:1: rule__ExpressionTypeAnnotated__Group_1_1_2__1 : rule__ExpressionTypeAnnotated__Group_1_1_2__1__Impl ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3436:1: ( rule__ExpressionTypeAnnotated__Group_1_1_2__1__Impl )
            // InternalExpressions.g:3437:2: rule__ExpressionTypeAnnotated__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1_2__1"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1_2__1__Impl"
    // InternalExpressions.g:3443:1: rule__ExpressionTypeAnnotated__Group_1_1_2__1__Impl : ( ( rule__ExpressionTypeAnnotated__Group_1_1_2_1__0 )* ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3447:1: ( ( ( rule__ExpressionTypeAnnotated__Group_1_1_2_1__0 )* ) )
            // InternalExpressions.g:3448:1: ( ( rule__ExpressionTypeAnnotated__Group_1_1_2_1__0 )* )
            {
            // InternalExpressions.g:3448:1: ( ( rule__ExpressionTypeAnnotated__Group_1_1_2_1__0 )* )
            // InternalExpressions.g:3449:2: ( rule__ExpressionTypeAnnotated__Group_1_1_2_1__0 )*
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup_1_1_2_1()); 
            // InternalExpressions.g:3450:2: ( rule__ExpressionTypeAnnotated__Group_1_1_2_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==41) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalExpressions.g:3450:3: rule__ExpressionTypeAnnotated__Group_1_1_2_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__ExpressionTypeAnnotated__Group_1_1_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getGroup_1_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1_2_1__0"
    // InternalExpressions.g:3459:1: rule__ExpressionTypeAnnotated__Group_1_1_2_1__0 : rule__ExpressionTypeAnnotated__Group_1_1_2_1__0__Impl rule__ExpressionTypeAnnotated__Group_1_1_2_1__1 ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3463:1: ( rule__ExpressionTypeAnnotated__Group_1_1_2_1__0__Impl rule__ExpressionTypeAnnotated__Group_1_1_2_1__1 )
            // InternalExpressions.g:3464:2: rule__ExpressionTypeAnnotated__Group_1_1_2_1__0__Impl rule__ExpressionTypeAnnotated__Group_1_1_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionTypeAnnotated__Group_1_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_1_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1_2_1__0"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1_2_1__0__Impl"
    // InternalExpressions.g:3471:1: rule__ExpressionTypeAnnotated__Group_1_1_2_1__0__Impl : ( ',' ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3475:1: ( ( ',' ) )
            // InternalExpressions.g:3476:1: ( ',' )
            {
            // InternalExpressions.g:3476:1: ( ',' )
            // InternalExpressions.g:3477:2: ','
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getCommaKeyword_1_1_2_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getExpressionTypeAnnotatedAccess().getCommaKeyword_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1_2_1__0__Impl"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1_2_1__1"
    // InternalExpressions.g:3486:1: rule__ExpressionTypeAnnotated__Group_1_1_2_1__1 : rule__ExpressionTypeAnnotated__Group_1_1_2_1__1__Impl ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3490:1: ( rule__ExpressionTypeAnnotated__Group_1_1_2_1__1__Impl )
            // InternalExpressions.g:3491:2: rule__ExpressionTypeAnnotated__Group_1_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__Group_1_1_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1_2_1__1"


    // $ANTLR start "rule__ExpressionTypeAnnotated__Group_1_1_2_1__1__Impl"
    // InternalExpressions.g:3497:1: rule__ExpressionTypeAnnotated__Group_1_1_2_1__1__Impl : ( ( rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_1_1 ) ) ;
    public final void rule__ExpressionTypeAnnotated__Group_1_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3501:1: ( ( ( rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_1_1 ) ) )
            // InternalExpressions.g:3502:1: ( ( rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_1_1 ) )
            {
            // InternalExpressions.g:3502:1: ( ( rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_1_1 ) )
            // InternalExpressions.g:3503:2: ( rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_1_1 )
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getPairsAssignment_1_1_2_1_1()); 
            // InternalExpressions.g:3504:2: ( rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_1_1 )
            // InternalExpressions.g:3504:3: rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getPairsAssignment_1_1_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__Group_1_1_2_1__1__Impl"


    // $ANTLR start "rule__TypeAnnotation__Group__0"
    // InternalExpressions.g:3513:1: rule__TypeAnnotation__Group__0 : rule__TypeAnnotation__Group__0__Impl rule__TypeAnnotation__Group__1 ;
    public final void rule__TypeAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3517:1: ( rule__TypeAnnotation__Group__0__Impl rule__TypeAnnotation__Group__1 )
            // InternalExpressions.g:3518:2: rule__TypeAnnotation__Group__0__Impl rule__TypeAnnotation__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__TypeAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAnnotation__Group__0"


    // $ANTLR start "rule__TypeAnnotation__Group__0__Impl"
    // InternalExpressions.g:3525:1: rule__TypeAnnotation__Group__0__Impl : ( '<' ) ;
    public final void rule__TypeAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3529:1: ( ( '<' ) )
            // InternalExpressions.g:3530:1: ( '<' )
            {
            // InternalExpressions.g:3530:1: ( '<' )
            // InternalExpressions.g:3531:2: '<'
            {
             before(grammarAccess.getTypeAnnotationAccess().getLessThanSignKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeAnnotationAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAnnotation__Group__0__Impl"


    // $ANTLR start "rule__TypeAnnotation__Group__1"
    // InternalExpressions.g:3540:1: rule__TypeAnnotation__Group__1 : rule__TypeAnnotation__Group__1__Impl rule__TypeAnnotation__Group__2 ;
    public final void rule__TypeAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3544:1: ( rule__TypeAnnotation__Group__1__Impl rule__TypeAnnotation__Group__2 )
            // InternalExpressions.g:3545:2: rule__TypeAnnotation__Group__1__Impl rule__TypeAnnotation__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__TypeAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeAnnotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAnnotation__Group__1"


    // $ANTLR start "rule__TypeAnnotation__Group__1__Impl"
    // InternalExpressions.g:3552:1: rule__TypeAnnotation__Group__1__Impl : ( ( rule__TypeAnnotation__TypeAssignment_1 ) ) ;
    public final void rule__TypeAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3556:1: ( ( ( rule__TypeAnnotation__TypeAssignment_1 ) ) )
            // InternalExpressions.g:3557:1: ( ( rule__TypeAnnotation__TypeAssignment_1 ) )
            {
            // InternalExpressions.g:3557:1: ( ( rule__TypeAnnotation__TypeAssignment_1 ) )
            // InternalExpressions.g:3558:2: ( rule__TypeAnnotation__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeAnnotationAccess().getTypeAssignment_1()); 
            // InternalExpressions.g:3559:2: ( rule__TypeAnnotation__TypeAssignment_1 )
            // InternalExpressions.g:3559:3: rule__TypeAnnotation__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeAnnotation__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAnnotationAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAnnotation__Group__1__Impl"


    // $ANTLR start "rule__TypeAnnotation__Group__2"
    // InternalExpressions.g:3567:1: rule__TypeAnnotation__Group__2 : rule__TypeAnnotation__Group__2__Impl ;
    public final void rule__TypeAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3571:1: ( rule__TypeAnnotation__Group__2__Impl )
            // InternalExpressions.g:3572:2: rule__TypeAnnotation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeAnnotation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAnnotation__Group__2"


    // $ANTLR start "rule__TypeAnnotation__Group__2__Impl"
    // InternalExpressions.g:3578:1: rule__TypeAnnotation__Group__2__Impl : ( '>' ) ;
    public final void rule__TypeAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3582:1: ( ( '>' ) )
            // InternalExpressions.g:3583:1: ( '>' )
            {
            // InternalExpressions.g:3583:1: ( '>' )
            // InternalExpressions.g:3584:2: '>'
            {
             before(grammarAccess.getTypeAnnotationAccess().getGreaterThanSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAnnotationAccess().getGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAnnotation__Group__2__Impl"


    // $ANTLR start "rule__Pair__Group__0"
    // InternalExpressions.g:3594:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3598:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // InternalExpressions.g:3599:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__0"


    // $ANTLR start "rule__Pair__Group__0__Impl"
    // InternalExpressions.g:3606:1: rule__Pair__Group__0__Impl : ( ( rule__Pair__KeyAssignment_0 ) ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3610:1: ( ( ( rule__Pair__KeyAssignment_0 ) ) )
            // InternalExpressions.g:3611:1: ( ( rule__Pair__KeyAssignment_0 ) )
            {
            // InternalExpressions.g:3611:1: ( ( rule__Pair__KeyAssignment_0 ) )
            // InternalExpressions.g:3612:2: ( rule__Pair__KeyAssignment_0 )
            {
             before(grammarAccess.getPairAccess().getKeyAssignment_0()); 
            // InternalExpressions.g:3613:2: ( rule__Pair__KeyAssignment_0 )
            // InternalExpressions.g:3613:3: rule__Pair__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Pair__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__0__Impl"


    // $ANTLR start "rule__Pair__Group__1"
    // InternalExpressions.g:3621:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3625:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // InternalExpressions.g:3626:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__1"


    // $ANTLR start "rule__Pair__Group__1__Impl"
    // InternalExpressions.g:3633:1: rule__Pair__Group__1__Impl : ( '->' ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3637:1: ( ( '->' ) )
            // InternalExpressions.g:3638:1: ( '->' )
            {
            // InternalExpressions.g:3638:1: ( '->' )
            // InternalExpressions.g:3639:2: '->'
            {
             before(grammarAccess.getPairAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__1__Impl"


    // $ANTLR start "rule__Pair__Group__2"
    // InternalExpressions.g:3648:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3652:1: ( rule__Pair__Group__2__Impl )
            // InternalExpressions.g:3653:2: rule__Pair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__2"


    // $ANTLR start "rule__Pair__Group__2__Impl"
    // InternalExpressions.g:3659:1: rule__Pair__Group__2__Impl : ( ( rule__Pair__ValueAssignment_2 ) ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3663:1: ( ( ( rule__Pair__ValueAssignment_2 ) ) )
            // InternalExpressions.g:3664:1: ( ( rule__Pair__ValueAssignment_2 ) )
            {
            // InternalExpressions.g:3664:1: ( ( rule__Pair__ValueAssignment_2 ) )
            // InternalExpressions.g:3665:2: ( rule__Pair__ValueAssignment_2 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_2()); 
            // InternalExpressions.g:3666:2: ( rule__Pair__ValueAssignment_2 )
            // InternalExpressions.g:3666:3: rule__Pair__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pair__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__2__Impl"


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalExpressions.g:3675:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3679:1: ( ( RULE_ID ) )
            // InternalExpressions.g:3680:2: ( RULE_ID )
            {
            // InternalExpressions.g:3680:2: ( RULE_ID )
            // InternalExpressions.g:3681:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_0_2"
    // InternalExpressions.g:3690:1: rule__ExpressionLevel1__RightAssignment_1_0_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3694:1: ( ( ruleExpressionLevel2 ) )
            // InternalExpressions.g:3695:2: ( ruleExpressionLevel2 )
            {
            // InternalExpressions.g:3695:2: ( ruleExpressionLevel2 )
            // InternalExpressions.g:3696:3: ruleExpressionLevel2
            {
             before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;

             after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_1_2"
    // InternalExpressions.g:3705:1: rule__ExpressionLevel1__RightAssignment_1_1_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3709:1: ( ( ruleExpressionLevel2 ) )
            // InternalExpressions.g:3710:2: ( ruleExpressionLevel2 )
            {
            // InternalExpressions.g:3710:2: ( ruleExpressionLevel2 )
            // InternalExpressions.g:3711:3: ruleExpressionLevel2
            {
             before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;

             after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_0_2"
    // InternalExpressions.g:3720:1: rule__ExpressionLevel2__RightAssignment_1_0_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3724:1: ( ( ruleExpressionLevel3 ) )
            // InternalExpressions.g:3725:2: ( ruleExpressionLevel3 )
            {
            // InternalExpressions.g:3725:2: ( ruleExpressionLevel3 )
            // InternalExpressions.g:3726:3: ruleExpressionLevel3
            {
             before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;

             after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_1_2"
    // InternalExpressions.g:3735:1: rule__ExpressionLevel2__RightAssignment_1_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3739:1: ( ( ruleExpressionLevel3 ) )
            // InternalExpressions.g:3740:2: ( ruleExpressionLevel3 )
            {
            // InternalExpressions.g:3740:2: ( ruleExpressionLevel3 )
            // InternalExpressions.g:3741:3: ruleExpressionLevel3
            {
             before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;

             after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel3__RightAssignment_1_0_2"
    // InternalExpressions.g:3750:1: rule__ExpressionLevel3__RightAssignment_1_0_2 : ( ruleExpressionLevel4 ) ;
    public final void rule__ExpressionLevel3__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3754:1: ( ( ruleExpressionLevel4 ) )
            // InternalExpressions.g:3755:2: ( ruleExpressionLevel4 )
            {
            // InternalExpressions.g:3755:2: ( ruleExpressionLevel4 )
            // InternalExpressions.g:3756:3: ruleExpressionLevel4
            {
             before(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel4();

            state._fsp--;

             after(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel3__RightAssignment_1_1_2"
    // InternalExpressions.g:3765:1: rule__ExpressionLevel3__RightAssignment_1_1_2 : ( ruleExpressionLevel4 ) ;
    public final void rule__ExpressionLevel3__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3769:1: ( ( ruleExpressionLevel4 ) )
            // InternalExpressions.g:3770:2: ( ruleExpressionLevel4 )
            {
            // InternalExpressions.g:3770:2: ( ruleExpressionLevel4 )
            // InternalExpressions.g:3771:3: ruleExpressionLevel4
            {
             before(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel4();

            state._fsp--;

             after(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel3__RightAssignment_1_2_2"
    // InternalExpressions.g:3780:1: rule__ExpressionLevel3__RightAssignment_1_2_2 : ( ruleExpressionLevel4 ) ;
    public final void rule__ExpressionLevel3__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3784:1: ( ( ruleExpressionLevel4 ) )
            // InternalExpressions.g:3785:2: ( ruleExpressionLevel4 )
            {
            // InternalExpressions.g:3785:2: ( ruleExpressionLevel4 )
            // InternalExpressions.g:3786:3: ruleExpressionLevel4
            {
             before(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel4();

            state._fsp--;

             after(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__RightAssignment_1_2_2"


    // $ANTLR start "rule__ExpressionLevel3__RightAssignment_1_3_2"
    // InternalExpressions.g:3795:1: rule__ExpressionLevel3__RightAssignment_1_3_2 : ( ruleExpressionLevel4 ) ;
    public final void rule__ExpressionLevel3__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3799:1: ( ( ruleExpressionLevel4 ) )
            // InternalExpressions.g:3800:2: ( ruleExpressionLevel4 )
            {
            // InternalExpressions.g:3800:2: ( ruleExpressionLevel4 )
            // InternalExpressions.g:3801:3: ruleExpressionLevel4
            {
             before(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel4();

            state._fsp--;

             after(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__RightAssignment_1_3_2"


    // $ANTLR start "rule__ExpressionLevel4__RightAssignment_1_0_2"
    // InternalExpressions.g:3810:1: rule__ExpressionLevel4__RightAssignment_1_0_2 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionLevel4__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3814:1: ( ( ruleExpressionLevel5 ) )
            // InternalExpressions.g:3815:2: ( ruleExpressionLevel5 )
            {
            // InternalExpressions.g:3815:2: ( ruleExpressionLevel5 )
            // InternalExpressions.g:3816:3: ruleExpressionLevel5
            {
             before(grammarAccess.getExpressionLevel4Access().getRightExpressionLevel5ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;

             after(grammarAccess.getExpressionLevel4Access().getRightExpressionLevel5ParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel4__RightAssignment_1_1_2"
    // InternalExpressions.g:3825:1: rule__ExpressionLevel4__RightAssignment_1_1_2 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionLevel4__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3829:1: ( ( ruleExpressionLevel5 ) )
            // InternalExpressions.g:3830:2: ( ruleExpressionLevel5 )
            {
            // InternalExpressions.g:3830:2: ( ruleExpressionLevel5 )
            // InternalExpressions.g:3831:3: ruleExpressionLevel5
            {
             before(grammarAccess.getExpressionLevel4Access().getRightExpressionLevel5ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;

             after(grammarAccess.getExpressionLevel4Access().getRightExpressionLevel5ParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel4__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel5__RightAssignment_1_0_2"
    // InternalExpressions.g:3840:1: rule__ExpressionLevel5__RightAssignment_1_0_2 : ( ruleExpressionLevel6 ) ;
    public final void rule__ExpressionLevel5__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3844:1: ( ( ruleExpressionLevel6 ) )
            // InternalExpressions.g:3845:2: ( ruleExpressionLevel6 )
            {
            // InternalExpressions.g:3845:2: ( ruleExpressionLevel6 )
            // InternalExpressions.g:3846:3: ruleExpressionLevel6
            {
             before(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel6();

            state._fsp--;

             after(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel5__RightAssignment_1_1_2"
    // InternalExpressions.g:3855:1: rule__ExpressionLevel5__RightAssignment_1_1_2 : ( ruleExpressionLevel6 ) ;
    public final void rule__ExpressionLevel5__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3859:1: ( ( ruleExpressionLevel6 ) )
            // InternalExpressions.g:3860:2: ( ruleExpressionLevel6 )
            {
            // InternalExpressions.g:3860:2: ( ruleExpressionLevel6 )
            // InternalExpressions.g:3861:3: ruleExpressionLevel6
            {
             before(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel6();

            state._fsp--;

             after(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel5__RightAssignment_1_2_2"
    // InternalExpressions.g:3870:1: rule__ExpressionLevel5__RightAssignment_1_2_2 : ( ruleExpressionLevel6 ) ;
    public final void rule__ExpressionLevel5__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3874:1: ( ( ruleExpressionLevel6 ) )
            // InternalExpressions.g:3875:2: ( ruleExpressionLevel6 )
            {
            // InternalExpressions.g:3875:2: ( ruleExpressionLevel6 )
            // InternalExpressions.g:3876:3: ruleExpressionLevel6
            {
             before(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel6();

            state._fsp--;

             after(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__RightAssignment_1_2_2"


    // $ANTLR start "rule__ExpressionLevel5__RightAssignment_1_3_2"
    // InternalExpressions.g:3885:1: rule__ExpressionLevel5__RightAssignment_1_3_2 : ( ruleExpressionLevel6 ) ;
    public final void rule__ExpressionLevel5__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3889:1: ( ( ruleExpressionLevel6 ) )
            // InternalExpressions.g:3890:2: ( ruleExpressionLevel6 )
            {
            // InternalExpressions.g:3890:2: ( ruleExpressionLevel6 )
            // InternalExpressions.g:3891:3: ruleExpressionLevel6
            {
             before(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel6();

            state._fsp--;

             after(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__RightAssignment_1_3_2"


    // $ANTLR start "rule__ExpressionLevel5__RightAssignment_1_4_2"
    // InternalExpressions.g:3900:1: rule__ExpressionLevel5__RightAssignment_1_4_2 : ( ruleExpressionLevel6 ) ;
    public final void rule__ExpressionLevel5__RightAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3904:1: ( ( ruleExpressionLevel6 ) )
            // InternalExpressions.g:3905:2: ( ruleExpressionLevel6 )
            {
            // InternalExpressions.g:3905:2: ( ruleExpressionLevel6 )
            // InternalExpressions.g:3906:3: ruleExpressionLevel6
            {
             before(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel6();

            state._fsp--;

             after(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel5__RightAssignment_1_4_2"


    // $ANTLR start "rule__ExpressionLevel6__RightAssignment_1_2"
    // InternalExpressions.g:3915:1: rule__ExpressionLevel6__RightAssignment_1_2 : ( ruleExpressionLevel6 ) ;
    public final void rule__ExpressionLevel6__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3919:1: ( ( ruleExpressionLevel6 ) )
            // InternalExpressions.g:3920:2: ( ruleExpressionLevel6 )
            {
            // InternalExpressions.g:3920:2: ( ruleExpressionLevel6 )
            // InternalExpressions.g:3921:3: ruleExpressionLevel6
            {
             before(grammarAccess.getExpressionLevel6Access().getRightExpressionLevel6ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel6();

            state._fsp--;

             after(grammarAccess.getExpressionLevel6Access().getRightExpressionLevel6ParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel6__RightAssignment_1_2"


    // $ANTLR start "rule__ExpressionNot__SubAssignment_1"
    // InternalExpressions.g:3930:1: rule__ExpressionNot__SubAssignment_1 : ( ruleExpressionLevel8 ) ;
    public final void rule__ExpressionNot__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3934:1: ( ( ruleExpressionLevel8 ) )
            // InternalExpressions.g:3935:2: ( ruleExpressionLevel8 )
            {
            // InternalExpressions.g:3935:2: ( ruleExpressionLevel8 )
            // InternalExpressions.g:3936:3: ruleExpressionLevel8
            {
             before(grammarAccess.getExpressionNotAccess().getSubExpressionLevel8ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel8();

            state._fsp--;

             after(grammarAccess.getExpressionNotAccess().getSubExpressionLevel8ParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionNot__SubAssignment_1"


    // $ANTLR start "rule__ExpressionMinus__SubAssignment_1"
    // InternalExpressions.g:3945:1: rule__ExpressionMinus__SubAssignment_1 : ( ruleExpressionLevel8 ) ;
    public final void rule__ExpressionMinus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3949:1: ( ( ruleExpressionLevel8 ) )
            // InternalExpressions.g:3950:2: ( ruleExpressionLevel8 )
            {
            // InternalExpressions.g:3950:2: ( ruleExpressionLevel8 )
            // InternalExpressions.g:3951:3: ruleExpressionLevel8
            {
             before(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel8ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel8();

            state._fsp--;

             after(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel8ParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMinus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionPlus__SubAssignment_1"
    // InternalExpressions.g:3960:1: rule__ExpressionPlus__SubAssignment_1 : ( ruleExpressionLevel8 ) ;
    public final void rule__ExpressionPlus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3964:1: ( ( ruleExpressionLevel8 ) )
            // InternalExpressions.g:3965:2: ( ruleExpressionLevel8 )
            {
            // InternalExpressions.g:3965:2: ( ruleExpressionLevel8 )
            // InternalExpressions.g:3966:3: ruleExpressionLevel8
            {
             before(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel8ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel8();

            state._fsp--;

             after(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel8ParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionPlus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionBracket__SubAssignment_1"
    // InternalExpressions.g:3975:1: rule__ExpressionBracket__SubAssignment_1 : ( ruleExpression ) ;
    public final void rule__ExpressionBracket__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3979:1: ( ( ruleExpression ) )
            // InternalExpressions.g:3980:2: ( ruleExpression )
            {
            // InternalExpressions.g:3980:2: ( ruleExpression )
            // InternalExpressions.g:3981:3: ruleExpression
            {
             before(grammarAccess.getExpressionBracketAccess().getSubExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionBracketAccess().getSubExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__SubAssignment_1"


    // $ANTLR start "rule__ExpressionConstantBool__ValueAssignment"
    // InternalExpressions.g:3990:1: rule__ExpressionConstantBool__ValueAssignment : ( RULE_BOOL_LITERAL ) ;
    public final void rule__ExpressionConstantBool__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:3994:1: ( ( RULE_BOOL_LITERAL ) )
            // InternalExpressions.g:3995:2: ( RULE_BOOL_LITERAL )
            {
            // InternalExpressions.g:3995:2: ( RULE_BOOL_LITERAL )
            // InternalExpressions.g:3996:3: RULE_BOOL_LITERAL
            {
             before(grammarAccess.getExpressionConstantBoolAccess().getValueBOOL_LITERALTerminalRuleCall_0()); 
            match(input,RULE_BOOL_LITERAL,FOLLOW_2); 
             after(grammarAccess.getExpressionConstantBoolAccess().getValueBOOL_LITERALTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionConstantBool__ValueAssignment"


    // $ANTLR start "rule__ExpressionConstantInt__ValueAssignment"
    // InternalExpressions.g:4005:1: rule__ExpressionConstantInt__ValueAssignment : ( RULE_INT ) ;
    public final void rule__ExpressionConstantInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4009:1: ( ( RULE_INT ) )
            // InternalExpressions.g:4010:2: ( RULE_INT )
            {
            // InternalExpressions.g:4010:2: ( RULE_INT )
            // InternalExpressions.g:4011:3: RULE_INT
            {
             before(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionConstantInt__ValueAssignment"


    // $ANTLR start "rule__ExpressionConstantString__ValueAssignment"
    // InternalExpressions.g:4020:1: rule__ExpressionConstantString__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__ExpressionConstantString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4024:1: ( ( RULE_STRING ) )
            // InternalExpressions.g:4025:2: ( RULE_STRING )
            {
            // InternalExpressions.g:4025:2: ( RULE_STRING )
            // InternalExpressions.g:4026:3: RULE_STRING
            {
             before(grammarAccess.getExpressionConstantStringAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExpressionConstantStringAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionConstantString__ValueAssignment"


    // $ANTLR start "rule__ExpressionVariable__NameAssignment"
    // InternalExpressions.g:4035:1: rule__ExpressionVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__ExpressionVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4039:1: ( ( RULE_ID ) )
            // InternalExpressions.g:4040:2: ( RULE_ID )
            {
            // InternalExpressions.g:4040:2: ( RULE_ID )
            // InternalExpressions.g:4041:3: RULE_ID
            {
             before(grammarAccess.getExpressionVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionVariable__NameAssignment"


    // $ANTLR start "rule__ExpressionQuantifier__QuantifierAssignment_0"
    // InternalExpressions.g:4050:1: rule__ExpressionQuantifier__QuantifierAssignment_0 : ( ruleQUANTIFIER ) ;
    public final void rule__ExpressionQuantifier__QuantifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4054:1: ( ( ruleQUANTIFIER ) )
            // InternalExpressions.g:4055:2: ( ruleQUANTIFIER )
            {
            // InternalExpressions.g:4055:2: ( ruleQUANTIFIER )
            // InternalExpressions.g:4056:3: ruleQUANTIFIER
            {
             before(grammarAccess.getExpressionQuantifierAccess().getQuantifierQUANTIFIEREnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQUANTIFIER();

            state._fsp--;

             after(grammarAccess.getExpressionQuantifierAccess().getQuantifierQUANTIFIEREnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__QuantifierAssignment_0"


    // $ANTLR start "rule__ExpressionQuantifier__IteratorAssignment_2"
    // InternalExpressions.g:4065:1: rule__ExpressionQuantifier__IteratorAssignment_2 : ( ruleVariable ) ;
    public final void rule__ExpressionQuantifier__IteratorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4069:1: ( ( ruleVariable ) )
            // InternalExpressions.g:4070:2: ( ruleVariable )
            {
            // InternalExpressions.g:4070:2: ( ruleVariable )
            // InternalExpressions.g:4071:3: ruleVariable
            {
             before(grammarAccess.getExpressionQuantifierAccess().getIteratorVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getExpressionQuantifierAccess().getIteratorVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__IteratorAssignment_2"


    // $ANTLR start "rule__ExpressionQuantifier__CollectionAssignment_4"
    // InternalExpressions.g:4080:1: rule__ExpressionQuantifier__CollectionAssignment_4 : ( ruleExpression ) ;
    public final void rule__ExpressionQuantifier__CollectionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4084:1: ( ( ruleExpression ) )
            // InternalExpressions.g:4085:2: ( ruleExpression )
            {
            // InternalExpressions.g:4085:2: ( ruleExpression )
            // InternalExpressions.g:4086:3: ruleExpression
            {
             before(grammarAccess.getExpressionQuantifierAccess().getCollectionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionQuantifierAccess().getCollectionExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__CollectionAssignment_4"


    // $ANTLR start "rule__ExpressionQuantifier__ConditionAssignment_6"
    // InternalExpressions.g:4095:1: rule__ExpressionQuantifier__ConditionAssignment_6 : ( ruleExpression ) ;
    public final void rule__ExpressionQuantifier__ConditionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4099:1: ( ( ruleExpression ) )
            // InternalExpressions.g:4100:2: ( ruleExpression )
            {
            // InternalExpressions.g:4100:2: ( ruleExpression )
            // InternalExpressions.g:4101:3: ruleExpression
            {
             before(grammarAccess.getExpressionQuantifierAccess().getConditionExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionQuantifierAccess().getConditionExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionQuantifier__ConditionAssignment_6"


    // $ANTLR start "rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_0"
    // InternalExpressions.g:4110:1: rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_0 : ( ruleExpression ) ;
    public final void rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4114:1: ( ( ruleExpression ) )
            // InternalExpressions.g:4115:2: ( ruleExpression )
            {
            // InternalExpressions.g:4115:2: ( ruleExpression )
            // InternalExpressions.g:4116:3: ruleExpression
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getElementsExpressionParserRuleCall_1_0_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getElementsExpressionParserRuleCall_1_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_0"


    // $ANTLR start "rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_1_1"
    // InternalExpressions.g:4125:1: rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_1_1 : ( ruleExpression ) ;
    public final void rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4129:1: ( ( ruleExpression ) )
            // InternalExpressions.g:4130:2: ( ruleExpression )
            {
            // InternalExpressions.g:4130:2: ( ruleExpression )
            // InternalExpressions.g:4131:3: ruleExpression
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getElementsExpressionParserRuleCall_1_0_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getElementsExpressionParserRuleCall_1_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__ElementsAssignment_1_0_2_1_1"


    // $ANTLR start "rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_0"
    // InternalExpressions.g:4140:1: rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_0 : ( rulePair ) ;
    public final void rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4144:1: ( ( rulePair ) )
            // InternalExpressions.g:4145:2: ( rulePair )
            {
            // InternalExpressions.g:4145:2: ( rulePair )
            // InternalExpressions.g:4146:3: rulePair
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getPairsPairParserRuleCall_1_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getPairsPairParserRuleCall_1_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_0"


    // $ANTLR start "rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_1_1"
    // InternalExpressions.g:4155:1: rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_1_1 : ( rulePair ) ;
    public final void rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4159:1: ( ( rulePair ) )
            // InternalExpressions.g:4160:2: ( rulePair )
            {
            // InternalExpressions.g:4160:2: ( rulePair )
            // InternalExpressions.g:4161:3: rulePair
            {
             before(grammarAccess.getExpressionTypeAnnotatedAccess().getPairsPairParserRuleCall_1_1_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getExpressionTypeAnnotatedAccess().getPairsPairParserRuleCall_1_1_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionTypeAnnotated__PairsAssignment_1_1_2_1_1"


    // $ANTLR start "rule__TypeAnnotation__TypeAssignment_1"
    // InternalExpressions.g:4170:1: rule__TypeAnnotation__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeAnnotation__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4174:1: ( ( RULE_ID ) )
            // InternalExpressions.g:4175:2: ( RULE_ID )
            {
            // InternalExpressions.g:4175:2: ( RULE_ID )
            // InternalExpressions.g:4176:3: RULE_ID
            {
             before(grammarAccess.getTypeAnnotationAccess().getTypeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAnnotationAccess().getTypeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAnnotation__TypeAssignment_1"


    // $ANTLR start "rule__Pair__KeyAssignment_0"
    // InternalExpressions.g:4185:1: rule__Pair__KeyAssignment_0 : ( ruleExpression ) ;
    public final void rule__Pair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4189:1: ( ( ruleExpression ) )
            // InternalExpressions.g:4190:2: ( ruleExpression )
            {
            // InternalExpressions.g:4190:2: ( ruleExpression )
            // InternalExpressions.g:4191:3: ruleExpression
            {
             before(grammarAccess.getPairAccess().getKeyExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPairAccess().getKeyExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__KeyAssignment_0"


    // $ANTLR start "rule__Pair__ValueAssignment_2"
    // InternalExpressions.g:4200:1: rule__Pair__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Pair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:4204:1: ( ( ruleExpression ) )
            // InternalExpressions.g:4205:2: ( ruleExpression )
            {
            // InternalExpressions.g:4205:2: ( ruleExpression )
            // InternalExpressions.g:4206:3: ruleExpression
            {
             before(grammarAccess.getPairAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPairAccess().getValueExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000081C1F00F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000001081C1F00F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000008081C1F00F0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});

}