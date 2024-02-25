package nl.esi.comma.expressions.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.esi.comma.expressions.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOL_LITERAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'and'", "'OR'", "'or'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'+'", "'-'", "'*'", "'/'", "'max'", "'min'", "'mod'", "'^'", "'NOT'", "'not'", "'('", "')'", "'in'", "':'", "'['", "','", "']'", "'{'", "'}'", "'->'", "'exists'", "'forAll'", "'delete'"
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

        public InternalExpressionsParser(TokenStream input, ExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Variable";
       	}

       	@Override
       	protected ExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVariable"
    // InternalExpressions.g:65:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalExpressions.g:65:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalExpressions.g:66:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalExpressions.g:72:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalExpressions.g:78:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalExpressions.g:79:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalExpressions.g:79:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpressions.g:80:3: (lv_name_0_0= RULE_ID )
            {
            // InternalExpressions.g:80:3: (lv_name_0_0= RULE_ID )
            // InternalExpressions.g:81:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // InternalExpressions.g:100:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalExpressions.g:100:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalExpressions.g:101:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalExpressions.g:107:1: ruleExpression returns [EObject current=null] : this_ExpressionLevel1_0= ruleExpressionLevel1 ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLevel1_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:113:2: (this_ExpressionLevel1_0= ruleExpressionLevel1 )
            // InternalExpressions.g:114:2: this_ExpressionLevel1_0= ruleExpressionLevel1
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getExpressionLevel1ParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ExpressionLevel1_0=ruleExpressionLevel1();

            state._fsp--;


            		current = this_ExpressionLevel1_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalExpressions.g:125:1: entryRuleExpressionLevel1 returns [EObject current=null] : iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF ;
    public final EObject entryRuleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel1 = null;


        try {
            // InternalExpressions.g:125:57: (iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF )
            // InternalExpressions.g:126:2: iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel1=ruleExpressionLevel1();

            state._fsp--;

             current =iv_ruleExpressionLevel1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalExpressions.g:132:1: ruleExpressionLevel1 returns [EObject current=null] : (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_ExpressionLevel2_0 = null;

        EObject lv_right_4_0 = null;

        EObject lv_right_8_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:138:2: ( (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )* ) )
            // InternalExpressions.g:139:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )* )
            {
            // InternalExpressions.g:139:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )* )
            // InternalExpressions.g:140:3: this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_ExpressionLevel2_0=ruleExpressionLevel2();

            state._fsp--;


            			current = this_ExpressionLevel2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressions.g:148:3: ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=12 && LA3_0<=13)) ) {
                    alt3=1;
                }
                else if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExpressions.g:149:4: ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalExpressions.g:149:4: ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) )
            	    // InternalExpressions.g:150:5: () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalExpressions.g:150:5: ()
            	    // InternalExpressions.g:151:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel1Access().getExpressionAndLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalExpressions.g:157:5: (otherlv_2= 'AND' | otherlv_3= 'and' )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==12) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==13) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalExpressions.g:158:6: otherlv_2= 'AND'
            	            {
            	            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpressionLevel1Access().getANDKeyword_1_0_1_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalExpressions.g:163:6: otherlv_3= 'and'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpressionLevel1Access().getAndKeyword_1_0_1_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalExpressions.g:168:5: ( (lv_right_4_0= ruleExpressionLevel2 ) )
            	    // InternalExpressions.g:169:6: (lv_right_4_0= ruleExpressionLevel2 )
            	    {
            	    // InternalExpressions.g:169:6: (lv_right_4_0= ruleExpressionLevel2 )
            	    // InternalExpressions.g:170:7: lv_right_4_0= ruleExpressionLevel2
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_3);
            	    lv_right_4_0=ruleExpressionLevel2();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel1Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_4_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel2");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalExpressions.g:189:4: ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalExpressions.g:189:4: ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) )
            	    // InternalExpressions.g:190:5: () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalExpressions.g:190:5: ()
            	    // InternalExpressions.g:191:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel1Access().getExpressionOrLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    // InternalExpressions.g:197:5: (otherlv_6= 'OR' | otherlv_7= 'or' )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==14) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==15) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalExpressions.g:198:6: otherlv_6= 'OR'
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_4); 

            	            						newLeafNode(otherlv_6, grammarAccess.getExpressionLevel1Access().getORKeyword_1_1_1_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalExpressions.g:203:6: otherlv_7= 'or'
            	            {
            	            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            	            						newLeafNode(otherlv_7, grammarAccess.getExpressionLevel1Access().getOrKeyword_1_1_1_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalExpressions.g:208:5: ( (lv_right_8_0= ruleExpressionLevel2 ) )
            	    // InternalExpressions.g:209:6: (lv_right_8_0= ruleExpressionLevel2 )
            	    {
            	    // InternalExpressions.g:209:6: (lv_right_8_0= ruleExpressionLevel2 )
            	    // InternalExpressions.g:210:7: lv_right_8_0= ruleExpressionLevel2
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_3);
            	    lv_right_8_0=ruleExpressionLevel2();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel1Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_8_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel2");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalExpressions.g:233:1: entryRuleExpressionLevel2 returns [EObject current=null] : iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF ;
    public final EObject entryRuleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel2 = null;


        try {
            // InternalExpressions.g:233:57: (iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF )
            // InternalExpressions.g:234:2: iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel2=ruleExpressionLevel2();

            state._fsp--;

             current =iv_ruleExpressionLevel2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalExpressions.g:240:1: ruleExpressionLevel2 returns [EObject current=null] : (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLevel3_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:246:2: ( (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )* ) )
            // InternalExpressions.g:247:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )* )
            {
            // InternalExpressions.g:247:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )* )
            // InternalExpressions.g:248:3: this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_ExpressionLevel3_0=ruleExpressionLevel3();

            state._fsp--;


            			current = this_ExpressionLevel3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressions.g:256:3: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }
                else if ( (LA4_0==17) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExpressions.g:257:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalExpressions.g:257:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    // InternalExpressions.g:258:5: () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalExpressions.g:258:5: ()
            	    // InternalExpressions.g:259:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel2Access().getExpressionEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_4); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel2Access().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalExpressions.g:269:5: ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    // InternalExpressions.g:270:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    {
            	    // InternalExpressions.g:270:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    // InternalExpressions.g:271:7: lv_right_3_0= ruleExpressionLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    lv_right_3_0=ruleExpressionLevel3();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel3");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalExpressions.g:290:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalExpressions.g:290:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    // InternalExpressions.g:291:5: () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalExpressions.g:291:5: ()
            	    // InternalExpressions.g:292:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel2Access().getExpressionNEqualLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel2Access().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalExpressions.g:302:5: ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    // InternalExpressions.g:303:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    {
            	    // InternalExpressions.g:303:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    // InternalExpressions.g:304:7: lv_right_6_0= ruleExpressionLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    lv_right_6_0=ruleExpressionLevel3();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel3");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalExpressions.g:327:1: entryRuleExpressionLevel3 returns [EObject current=null] : iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF ;
    public final EObject entryRuleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel3 = null;


        try {
            // InternalExpressions.g:327:57: (iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF )
            // InternalExpressions.g:328:2: iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel3=ruleExpressionLevel3();

            state._fsp--;

             current =iv_ruleExpressionLevel3; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalExpressions.g:334:1: ruleExpressionLevel3 returns [EObject current=null] : (this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_ExpressionLevel4_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:340:2: ( (this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )* ) )
            // InternalExpressions.g:341:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )* )
            {
            // InternalExpressions.g:341:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )* )
            // InternalExpressions.g:342:3: this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_ExpressionLevel4_0=ruleExpressionLevel4();

            state._fsp--;


            			current = this_ExpressionLevel4_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressions.g:350:3: ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )*
            loop5:
            do {
                int alt5=5;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt5=1;
                    }
                    break;
                case 19:
                    {
                    alt5=2;
                    }
                    break;
                case 20:
                    {
                    alt5=3;
                    }
                    break;
                case 21:
                    {
                    alt5=4;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalExpressions.g:351:4: ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) )
            	    {
            	    // InternalExpressions.g:351:4: ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) )
            	    // InternalExpressions.g:352:5: () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) )
            	    {
            	    // InternalExpressions.g:352:5: ()
            	    // InternalExpressions.g:353:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel3Access().getExpressionGeqLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_4); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel3Access().getGreaterThanSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalExpressions.g:363:5: ( (lv_right_3_0= ruleExpressionLevel4 ) )
            	    // InternalExpressions.g:364:6: (lv_right_3_0= ruleExpressionLevel4 )
            	    {
            	    // InternalExpressions.g:364:6: (lv_right_3_0= ruleExpressionLevel4 )
            	    // InternalExpressions.g:365:7: lv_right_3_0= ruleExpressionLevel4
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_right_3_0=ruleExpressionLevel4();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel3Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel4");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalExpressions.g:384:4: ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) )
            	    {
            	    // InternalExpressions.g:384:4: ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) )
            	    // InternalExpressions.g:385:5: () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) )
            	    {
            	    // InternalExpressions.g:385:5: ()
            	    // InternalExpressions.g:386:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel3Access().getExpressionGreaterLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,19,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel3Access().getGreaterThanSignKeyword_1_1_1());
            	    				
            	    // InternalExpressions.g:396:5: ( (lv_right_6_0= ruleExpressionLevel4 ) )
            	    // InternalExpressions.g:397:6: (lv_right_6_0= ruleExpressionLevel4 )
            	    {
            	    // InternalExpressions.g:397:6: (lv_right_6_0= ruleExpressionLevel4 )
            	    // InternalExpressions.g:398:7: lv_right_6_0= ruleExpressionLevel4
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_right_6_0=ruleExpressionLevel4();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel3Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel4");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalExpressions.g:417:4: ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) )
            	    {
            	    // InternalExpressions.g:417:4: ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) )
            	    // InternalExpressions.g:418:5: () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) )
            	    {
            	    // InternalExpressions.g:418:5: ()
            	    // InternalExpressions.g:419:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel3Access().getExpressionLeqLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,20,FOLLOW_4); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpressionLevel3Access().getLessThanSignEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalExpressions.g:429:5: ( (lv_right_9_0= ruleExpressionLevel4 ) )
            	    // InternalExpressions.g:430:6: (lv_right_9_0= ruleExpressionLevel4 )
            	    {
            	    // InternalExpressions.g:430:6: (lv_right_9_0= ruleExpressionLevel4 )
            	    // InternalExpressions.g:431:7: lv_right_9_0= ruleExpressionLevel4
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_right_9_0=ruleExpressionLevel4();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel3Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel4");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalExpressions.g:450:4: ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) )
            	    {
            	    // InternalExpressions.g:450:4: ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) )
            	    // InternalExpressions.g:451:5: () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) )
            	    {
            	    // InternalExpressions.g:451:5: ()
            	    // InternalExpressions.g:452:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel3Access().getExpressionLessLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,21,FOLLOW_4); 

            	    					newLeafNode(otherlv_11, grammarAccess.getExpressionLevel3Access().getLessThanSignKeyword_1_3_1());
            	    				
            	    // InternalExpressions.g:462:5: ( (lv_right_12_0= ruleExpressionLevel4 ) )
            	    // InternalExpressions.g:463:6: (lv_right_12_0= ruleExpressionLevel4 )
            	    {
            	    // InternalExpressions.g:463:6: (lv_right_12_0= ruleExpressionLevel4 )
            	    // InternalExpressions.g:464:7: lv_right_12_0= ruleExpressionLevel4
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_right_12_0=ruleExpressionLevel4();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel3Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_12_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel4");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalExpressions.g:487:1: entryRuleExpressionLevel4 returns [EObject current=null] : iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF ;
    public final EObject entryRuleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel4 = null;


        try {
            // InternalExpressions.g:487:57: (iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF )
            // InternalExpressions.g:488:2: iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel4Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel4=ruleExpressionLevel4();

            state._fsp--;

             current =iv_ruleExpressionLevel4; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalExpressions.g:494:1: ruleExpressionLevel4 returns [EObject current=null] : (this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLevel5_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:500:2: ( (this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )* ) )
            // InternalExpressions.g:501:2: (this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )* )
            {
            // InternalExpressions.g:501:2: (this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )* )
            // InternalExpressions.g:502:3: this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_ExpressionLevel5_0=ruleExpressionLevel5();

            state._fsp--;


            			current = this_ExpressionLevel5_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressions.g:510:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }
                else if ( (LA6_0==23) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalExpressions.g:511:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) )
            	    {
            	    // InternalExpressions.g:511:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) )
            	    // InternalExpressions.g:512:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) )
            	    {
            	    // InternalExpressions.g:512:5: ()
            	    // InternalExpressions.g:513:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel4Access().getExpressionAdditionLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_4); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel4Access().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalExpressions.g:523:5: ( (lv_right_3_0= ruleExpressionLevel5 ) )
            	    // InternalExpressions.g:524:6: (lv_right_3_0= ruleExpressionLevel5 )
            	    {
            	    // InternalExpressions.g:524:6: (lv_right_3_0= ruleExpressionLevel5 )
            	    // InternalExpressions.g:525:7: lv_right_3_0= ruleExpressionLevel5
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel4Access().getRightExpressionLevel5ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleExpressionLevel5();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel4Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel5");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalExpressions.g:544:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) )
            	    {
            	    // InternalExpressions.g:544:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) )
            	    // InternalExpressions.g:545:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) )
            	    {
            	    // InternalExpressions.g:545:5: ()
            	    // InternalExpressions.g:546:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel4Access().getExpressionSubtractionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,23,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel4Access().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalExpressions.g:556:5: ( (lv_right_6_0= ruleExpressionLevel5 ) )
            	    // InternalExpressions.g:557:6: (lv_right_6_0= ruleExpressionLevel5 )
            	    {
            	    // InternalExpressions.g:557:6: (lv_right_6_0= ruleExpressionLevel5 )
            	    // InternalExpressions.g:558:7: lv_right_6_0= ruleExpressionLevel5
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel4Access().getRightExpressionLevel5ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_right_6_0=ruleExpressionLevel5();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel4Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel5");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalExpressions.g:581:1: entryRuleExpressionLevel5 returns [EObject current=null] : iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF ;
    public final EObject entryRuleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel5 = null;


        try {
            // InternalExpressions.g:581:57: (iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF )
            // InternalExpressions.g:582:2: iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel5Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel5=ruleExpressionLevel5();

            state._fsp--;

             current =iv_ruleExpressionLevel5; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalExpressions.g:588:1: ruleExpressionLevel5 returns [EObject current=null] : (this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject this_ExpressionLevel6_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;

        EObject lv_right_15_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:594:2: ( (this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) ) )* ) )
            // InternalExpressions.g:595:2: (this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) ) )* )
            {
            // InternalExpressions.g:595:2: (this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) ) )* )
            // InternalExpressions.g:596:3: this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionLevel6ParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_ExpressionLevel6_0=ruleExpressionLevel6();

            state._fsp--;


            			current = this_ExpressionLevel6_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressions.g:604:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) ) )*
            loop7:
            do {
                int alt7=6;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    alt7=1;
                    }
                    break;
                case 25:
                    {
                    alt7=2;
                    }
                    break;
                case 26:
                    {
                    alt7=3;
                    }
                    break;
                case 27:
                    {
                    alt7=4;
                    }
                    break;
                case 28:
                    {
                    alt7=5;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalExpressions.g:605:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalExpressions.g:605:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )
            	    // InternalExpressions.g:606:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalExpressions.g:606:5: ()
            	    // InternalExpressions.g:607:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionMultiplyLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_4); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel5Access().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalExpressions.g:617:5: ( (lv_right_3_0= ruleExpressionLevel6 ) )
            	    // InternalExpressions.g:618:6: (lv_right_3_0= ruleExpressionLevel6 )
            	    {
            	    // InternalExpressions.g:618:6: (lv_right_3_0= ruleExpressionLevel6 )
            	    // InternalExpressions.g:619:7: lv_right_3_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=ruleExpressionLevel6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalExpressions.g:638:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalExpressions.g:638:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) )
            	    // InternalExpressions.g:639:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalExpressions.g:639:5: ()
            	    // InternalExpressions.g:640:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionDivisionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,25,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel5Access().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalExpressions.g:650:5: ( (lv_right_6_0= ruleExpressionLevel6 ) )
            	    // InternalExpressions.g:651:6: (lv_right_6_0= ruleExpressionLevel6 )
            	    {
            	    // InternalExpressions.g:651:6: (lv_right_6_0= ruleExpressionLevel6 )
            	    // InternalExpressions.g:652:7: lv_right_6_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_right_6_0=ruleExpressionLevel6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalExpressions.g:671:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalExpressions.g:671:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) )
            	    // InternalExpressions.g:672:5: () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalExpressions.g:672:5: ()
            	    // InternalExpressions.g:673:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionMaximumLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,26,FOLLOW_4); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpressionLevel5Access().getMaxKeyword_1_2_1());
            	    				
            	    // InternalExpressions.g:683:5: ( (lv_right_9_0= ruleExpressionLevel6 ) )
            	    // InternalExpressions.g:684:6: (lv_right_9_0= ruleExpressionLevel6 )
            	    {
            	    // InternalExpressions.g:684:6: (lv_right_9_0= ruleExpressionLevel6 )
            	    // InternalExpressions.g:685:7: lv_right_9_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_right_9_0=ruleExpressionLevel6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalExpressions.g:704:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalExpressions.g:704:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) )
            	    // InternalExpressions.g:705:5: () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalExpressions.g:705:5: ()
            	    // InternalExpressions.g:706:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionMinimumLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,27,FOLLOW_4); 

            	    					newLeafNode(otherlv_11, grammarAccess.getExpressionLevel5Access().getMinKeyword_1_3_1());
            	    				
            	    // InternalExpressions.g:716:5: ( (lv_right_12_0= ruleExpressionLevel6 ) )
            	    // InternalExpressions.g:717:6: (lv_right_12_0= ruleExpressionLevel6 )
            	    {
            	    // InternalExpressions.g:717:6: (lv_right_12_0= ruleExpressionLevel6 )
            	    // InternalExpressions.g:718:7: lv_right_12_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_right_12_0=ruleExpressionLevel6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_12_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalExpressions.g:737:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalExpressions.g:737:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) )
            	    // InternalExpressions.g:738:5: () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalExpressions.g:738:5: ()
            	    // InternalExpressions.g:739:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionModuloLeftAction_1_4_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_14=(Token)match(input,28,FOLLOW_4); 

            	    					newLeafNode(otherlv_14, grammarAccess.getExpressionLevel5Access().getModKeyword_1_4_1());
            	    				
            	    // InternalExpressions.g:749:5: ( (lv_right_15_0= ruleExpressionLevel6 ) )
            	    // InternalExpressions.g:750:6: (lv_right_15_0= ruleExpressionLevel6 )
            	    {
            	    // InternalExpressions.g:750:6: (lv_right_15_0= ruleExpressionLevel6 )
            	    // InternalExpressions.g:751:7: lv_right_15_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_4_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_right_15_0=ruleExpressionLevel6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpressionLevel5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_15_0,
            	    								"nl.esi.comma.expressions.Expressions.ExpressionLevel6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionLevel6"
    // InternalExpressions.g:774:1: entryRuleExpressionLevel6 returns [EObject current=null] : iv_ruleExpressionLevel6= ruleExpressionLevel6 EOF ;
    public final EObject entryRuleExpressionLevel6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel6 = null;


        try {
            // InternalExpressions.g:774:57: (iv_ruleExpressionLevel6= ruleExpressionLevel6 EOF )
            // InternalExpressions.g:775:2: iv_ruleExpressionLevel6= ruleExpressionLevel6 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel6Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel6=ruleExpressionLevel6();

            state._fsp--;

             current =iv_ruleExpressionLevel6; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel6"


    // $ANTLR start "ruleExpressionLevel6"
    // InternalExpressions.g:781:1: ruleExpressionLevel6 returns [EObject current=null] : (this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )? ) ;
    public final EObject ruleExpressionLevel6() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExpressionLevel7_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:787:2: ( (this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )? ) )
            // InternalExpressions.g:788:2: (this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )? )
            {
            // InternalExpressions.g:788:2: (this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )? )
            // InternalExpressions.g:789:3: this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )?
            {

            			newCompositeNode(grammarAccess.getExpressionLevel6Access().getExpressionLevel7ParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_ExpressionLevel7_0=ruleExpressionLevel7();

            state._fsp--;


            			current = this_ExpressionLevel7_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressions.g:797:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalExpressions.g:798:4: () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) )
                    {
                    // InternalExpressions.g:798:4: ()
                    // InternalExpressions.g:799:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExpressionLevel6Access().getExpressionPowerLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpressionLevel6Access().getCircumflexAccentKeyword_1_1());
                    			
                    // InternalExpressions.g:809:4: ( (lv_right_3_0= ruleExpressionLevel6 ) )
                    // InternalExpressions.g:810:5: (lv_right_3_0= ruleExpressionLevel6 )
                    {
                    // InternalExpressions.g:810:5: (lv_right_3_0= ruleExpressionLevel6 )
                    // InternalExpressions.g:811:6: lv_right_3_0= ruleExpressionLevel6
                    {

                    						newCompositeNode(grammarAccess.getExpressionLevel6Access().getRightExpressionLevel6ParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpressionLevel6();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionLevel6Rule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"nl.esi.comma.expressions.Expressions.ExpressionLevel6");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionLevel6"


    // $ANTLR start "entryRuleExpressionLevel7"
    // InternalExpressions.g:833:1: entryRuleExpressionLevel7 returns [EObject current=null] : iv_ruleExpressionLevel7= ruleExpressionLevel7 EOF ;
    public final EObject entryRuleExpressionLevel7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel7 = null;


        try {
            // InternalExpressions.g:833:57: (iv_ruleExpressionLevel7= ruleExpressionLevel7 EOF )
            // InternalExpressions.g:834:2: iv_ruleExpressionLevel7= ruleExpressionLevel7 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel7Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel7=ruleExpressionLevel7();

            state._fsp--;

             current =iv_ruleExpressionLevel7; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel7"


    // $ANTLR start "ruleExpressionLevel7"
    // InternalExpressions.g:840:1: ruleExpressionLevel7 returns [EObject current=null] : (this_ExpressionNot_0= ruleExpressionNot | this_ExpressionMinus_1= ruleExpressionMinus | this_ExpressionPlus_2= ruleExpressionPlus | this_ExpressionLevel8_3= ruleExpressionLevel8 ) ;
    public final EObject ruleExpressionLevel7() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionNot_0 = null;

        EObject this_ExpressionMinus_1 = null;

        EObject this_ExpressionPlus_2 = null;

        EObject this_ExpressionLevel8_3 = null;



        	enterRule();

        try {
            // InternalExpressions.g:846:2: ( (this_ExpressionNot_0= ruleExpressionNot | this_ExpressionMinus_1= ruleExpressionMinus | this_ExpressionPlus_2= ruleExpressionPlus | this_ExpressionLevel8_3= ruleExpressionLevel8 ) )
            // InternalExpressions.g:847:2: (this_ExpressionNot_0= ruleExpressionNot | this_ExpressionMinus_1= ruleExpressionMinus | this_ExpressionPlus_2= ruleExpressionPlus | this_ExpressionLevel8_3= ruleExpressionLevel8 )
            {
            // InternalExpressions.g:847:2: (this_ExpressionNot_0= ruleExpressionNot | this_ExpressionMinus_1= ruleExpressionMinus | this_ExpressionPlus_2= ruleExpressionPlus | this_ExpressionLevel8_3= ruleExpressionLevel8 )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case RULE_ID:
            case RULE_BOOL_LITERAL:
            case RULE_INT:
            case RULE_STRING:
            case 21:
            case 32:
            case 42:
            case 43:
            case 44:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalExpressions.g:848:3: this_ExpressionNot_0= ruleExpressionNot
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel7Access().getExpressionNotParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionNot_0=ruleExpressionNot();

                    state._fsp--;


                    			current = this_ExpressionNot_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExpressions.g:857:3: this_ExpressionMinus_1= ruleExpressionMinus
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel7Access().getExpressionMinusParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionMinus_1=ruleExpressionMinus();

                    state._fsp--;


                    			current = this_ExpressionMinus_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExpressions.g:866:3: this_ExpressionPlus_2= ruleExpressionPlus
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel7Access().getExpressionPlusParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionPlus_2=ruleExpressionPlus();

                    state._fsp--;


                    			current = this_ExpressionPlus_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalExpressions.g:875:3: this_ExpressionLevel8_3= ruleExpressionLevel8
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel7Access().getExpressionLevel8ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionLevel8_3=ruleExpressionLevel8();

                    state._fsp--;


                    			current = this_ExpressionLevel8_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionLevel7"


    // $ANTLR start "entryRuleExpressionNot"
    // InternalExpressions.g:887:1: entryRuleExpressionNot returns [EObject current=null] : iv_ruleExpressionNot= ruleExpressionNot EOF ;
    public final EObject entryRuleExpressionNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionNot = null;


        try {
            // InternalExpressions.g:887:54: (iv_ruleExpressionNot= ruleExpressionNot EOF )
            // InternalExpressions.g:888:2: iv_ruleExpressionNot= ruleExpressionNot EOF
            {
             newCompositeNode(grammarAccess.getExpressionNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionNot=ruleExpressionNot();

            state._fsp--;

             current =iv_ruleExpressionNot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionNot"


    // $ANTLR start "ruleExpressionNot"
    // InternalExpressions.g:894:1: ruleExpressionNot returns [EObject current=null] : ( (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) ) ) ;
    public final EObject ruleExpressionNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_sub_2_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:900:2: ( ( (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) ) ) )
            // InternalExpressions.g:901:2: ( (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) ) )
            {
            // InternalExpressions.g:901:2: ( (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) ) )
            // InternalExpressions.g:902:3: (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) )
            {
            // InternalExpressions.g:902:3: (otherlv_0= 'NOT' | otherlv_1= 'not' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalExpressions.g:903:4: otherlv_0= 'NOT'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getExpressionNotAccess().getNOTKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalExpressions.g:908:4: otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionNotAccess().getNotKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalExpressions.g:913:3: ( (lv_sub_2_0= ruleExpressionLevel8 ) )
            // InternalExpressions.g:914:4: (lv_sub_2_0= ruleExpressionLevel8 )
            {
            // InternalExpressions.g:914:4: (lv_sub_2_0= ruleExpressionLevel8 )
            // InternalExpressions.g:915:5: lv_sub_2_0= ruleExpressionLevel8
            {

            					newCompositeNode(grammarAccess.getExpressionNotAccess().getSubExpressionLevel8ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sub_2_0=ruleExpressionLevel8();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionNotRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_2_0,
            						"nl.esi.comma.expressions.Expressions.ExpressionLevel8");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionNot"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalExpressions.g:936:1: entryRuleExpressionMinus returns [EObject current=null] : iv_ruleExpressionMinus= ruleExpressionMinus EOF ;
    public final EObject entryRuleExpressionMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMinus = null;


        try {
            // InternalExpressions.g:936:56: (iv_ruleExpressionMinus= ruleExpressionMinus EOF )
            // InternalExpressions.g:937:2: iv_ruleExpressionMinus= ruleExpressionMinus EOF
            {
             newCompositeNode(grammarAccess.getExpressionMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionMinus=ruleExpressionMinus();

            state._fsp--;

             current =iv_ruleExpressionMinus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalExpressions.g:943:1: ruleExpressionMinus returns [EObject current=null] : (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) ) ;
    public final EObject ruleExpressionMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:949:2: ( (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) ) )
            // InternalExpressions.g:950:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) )
            {
            // InternalExpressions.g:950:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) )
            // InternalExpressions.g:951:3: otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0());
            		
            // InternalExpressions.g:955:3: ( (lv_sub_1_0= ruleExpressionLevel8 ) )
            // InternalExpressions.g:956:4: (lv_sub_1_0= ruleExpressionLevel8 )
            {
            // InternalExpressions.g:956:4: (lv_sub_1_0= ruleExpressionLevel8 )
            // InternalExpressions.g:957:5: lv_sub_1_0= ruleExpressionLevel8
            {

            					newCompositeNode(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel8ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel8();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionMinusRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_1_0,
            						"nl.esi.comma.expressions.Expressions.ExpressionLevel8");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalExpressions.g:978:1: entryRuleExpressionPlus returns [EObject current=null] : iv_ruleExpressionPlus= ruleExpressionPlus EOF ;
    public final EObject entryRuleExpressionPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionPlus = null;


        try {
            // InternalExpressions.g:978:55: (iv_ruleExpressionPlus= ruleExpressionPlus EOF )
            // InternalExpressions.g:979:2: iv_ruleExpressionPlus= ruleExpressionPlus EOF
            {
             newCompositeNode(grammarAccess.getExpressionPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionPlus=ruleExpressionPlus();

            state._fsp--;

             current =iv_ruleExpressionPlus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalExpressions.g:985:1: ruleExpressionPlus returns [EObject current=null] : (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) ) ;
    public final EObject ruleExpressionPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:991:2: ( (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) ) )
            // InternalExpressions.g:992:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) )
            {
            // InternalExpressions.g:992:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) )
            // InternalExpressions.g:993:3: otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0());
            		
            // InternalExpressions.g:997:3: ( (lv_sub_1_0= ruleExpressionLevel8 ) )
            // InternalExpressions.g:998:4: (lv_sub_1_0= ruleExpressionLevel8 )
            {
            // InternalExpressions.g:998:4: (lv_sub_1_0= ruleExpressionLevel8 )
            // InternalExpressions.g:999:5: lv_sub_1_0= ruleExpressionLevel8
            {

            					newCompositeNode(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel8ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel8();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionPlusRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_1_0,
            						"nl.esi.comma.expressions.Expressions.ExpressionLevel8");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel8"
    // InternalExpressions.g:1020:1: entryRuleExpressionLevel8 returns [EObject current=null] : iv_ruleExpressionLevel8= ruleExpressionLevel8 EOF ;
    public final EObject entryRuleExpressionLevel8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel8 = null;


        try {
            // InternalExpressions.g:1020:57: (iv_ruleExpressionLevel8= ruleExpressionLevel8 EOF )
            // InternalExpressions.g:1021:2: iv_ruleExpressionLevel8= ruleExpressionLevel8 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel8Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel8=ruleExpressionLevel8();

            state._fsp--;

             current =iv_ruleExpressionLevel8; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionLevel8"


    // $ANTLR start "ruleExpressionLevel8"
    // InternalExpressions.g:1027:1: ruleExpressionLevel8 returns [EObject current=null] : (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantBool_1= ruleExpressionConstantBool | this_ExpressionConstantInt_2= ruleExpressionConstantInt | this_ExpressionConstantString_3= ruleExpressionConstantString | this_ExpressionVariable_4= ruleExpressionVariable | this_ExpressionQuantifier_5= ruleExpressionQuantifier | this_ExpressionTypeAnnotated_6= ruleExpressionTypeAnnotated ) ;
    public final EObject ruleExpressionLevel8() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionBracket_0 = null;

        EObject this_ExpressionConstantBool_1 = null;

        EObject this_ExpressionConstantInt_2 = null;

        EObject this_ExpressionConstantString_3 = null;

        EObject this_ExpressionVariable_4 = null;

        EObject this_ExpressionQuantifier_5 = null;

        EObject this_ExpressionTypeAnnotated_6 = null;



        	enterRule();

        try {
            // InternalExpressions.g:1033:2: ( (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantBool_1= ruleExpressionConstantBool | this_ExpressionConstantInt_2= ruleExpressionConstantInt | this_ExpressionConstantString_3= ruleExpressionConstantString | this_ExpressionVariable_4= ruleExpressionVariable | this_ExpressionQuantifier_5= ruleExpressionQuantifier | this_ExpressionTypeAnnotated_6= ruleExpressionTypeAnnotated ) )
            // InternalExpressions.g:1034:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantBool_1= ruleExpressionConstantBool | this_ExpressionConstantInt_2= ruleExpressionConstantInt | this_ExpressionConstantString_3= ruleExpressionConstantString | this_ExpressionVariable_4= ruleExpressionVariable | this_ExpressionQuantifier_5= ruleExpressionQuantifier | this_ExpressionTypeAnnotated_6= ruleExpressionTypeAnnotated )
            {
            // InternalExpressions.g:1034:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantBool_1= ruleExpressionConstantBool | this_ExpressionConstantInt_2= ruleExpressionConstantInt | this_ExpressionConstantString_3= ruleExpressionConstantString | this_ExpressionVariable_4= ruleExpressionVariable | this_ExpressionQuantifier_5= ruleExpressionQuantifier | this_ExpressionTypeAnnotated_6= ruleExpressionTypeAnnotated )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt11=1;
                }
                break;
            case RULE_BOOL_LITERAL:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            case RULE_STRING:
                {
                alt11=4;
                }
                break;
            case RULE_ID:
                {
                alt11=5;
                }
                break;
            case 42:
            case 43:
            case 44:
                {
                alt11=6;
                }
                break;
            case 21:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalExpressions.g:1035:3: this_ExpressionBracket_0= ruleExpressionBracket
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionBracketParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionBracket_0=ruleExpressionBracket();

                    state._fsp--;


                    			current = this_ExpressionBracket_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExpressions.g:1044:3: this_ExpressionConstantBool_1= ruleExpressionConstantBool
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionConstantBoolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionConstantBool_1=ruleExpressionConstantBool();

                    state._fsp--;


                    			current = this_ExpressionConstantBool_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExpressions.g:1053:3: this_ExpressionConstantInt_2= ruleExpressionConstantInt
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionConstantIntParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionConstantInt_2=ruleExpressionConstantInt();

                    state._fsp--;


                    			current = this_ExpressionConstantInt_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalExpressions.g:1062:3: this_ExpressionConstantString_3= ruleExpressionConstantString
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionConstantStringParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionConstantString_3=ruleExpressionConstantString();

                    state._fsp--;


                    			current = this_ExpressionConstantString_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalExpressions.g:1071:3: this_ExpressionVariable_4= ruleExpressionVariable
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionVariableParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionVariable_4=ruleExpressionVariable();

                    state._fsp--;


                    			current = this_ExpressionVariable_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalExpressions.g:1080:3: this_ExpressionQuantifier_5= ruleExpressionQuantifier
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionQuantifierParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionQuantifier_5=ruleExpressionQuantifier();

                    state._fsp--;


                    			current = this_ExpressionQuantifier_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalExpressions.g:1089:3: this_ExpressionTypeAnnotated_6= ruleExpressionTypeAnnotated
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel8Access().getExpressionTypeAnnotatedParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionTypeAnnotated_6=ruleExpressionTypeAnnotated();

                    state._fsp--;


                    			current = this_ExpressionTypeAnnotated_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionLevel8"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalExpressions.g:1101:1: entryRuleExpressionBracket returns [EObject current=null] : iv_ruleExpressionBracket= ruleExpressionBracket EOF ;
    public final EObject entryRuleExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBracket = null;


        try {
            // InternalExpressions.g:1101:58: (iv_ruleExpressionBracket= ruleExpressionBracket EOF )
            // InternalExpressions.g:1102:2: iv_ruleExpressionBracket= ruleExpressionBracket EOF
            {
             newCompositeNode(grammarAccess.getExpressionBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBracket=ruleExpressionBracket();

            state._fsp--;

             current =iv_ruleExpressionBracket; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalExpressions.g:1108:1: ruleExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:1114:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalExpressions.g:1115:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalExpressions.g:1115:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalExpressions.g:1116:3: otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalExpressions.g:1120:3: ( (lv_sub_1_0= ruleExpression ) )
            // InternalExpressions.g:1121:4: (lv_sub_1_0= ruleExpression )
            {
            // InternalExpressions.g:1121:4: (lv_sub_1_0= ruleExpression )
            // InternalExpressions.g:1122:5: lv_sub_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionBracketAccess().getSubExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_sub_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionBracketRule());
            					}
            					set(
            						current,
            						"sub",
            						lv_sub_1_0,
            						"nl.esi.comma.expressions.Expressions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantBool"
    // InternalExpressions.g:1147:1: entryRuleExpressionConstantBool returns [EObject current=null] : iv_ruleExpressionConstantBool= ruleExpressionConstantBool EOF ;
    public final EObject entryRuleExpressionConstantBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantBool = null;


        try {
            // InternalExpressions.g:1147:63: (iv_ruleExpressionConstantBool= ruleExpressionConstantBool EOF )
            // InternalExpressions.g:1148:2: iv_ruleExpressionConstantBool= ruleExpressionConstantBool EOF
            {
             newCompositeNode(grammarAccess.getExpressionConstantBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionConstantBool=ruleExpressionConstantBool();

            state._fsp--;

             current =iv_ruleExpressionConstantBool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionConstantBool"


    // $ANTLR start "ruleExpressionConstantBool"
    // InternalExpressions.g:1154:1: ruleExpressionConstantBool returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) ;
    public final EObject ruleExpressionConstantBool() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalExpressions.g:1160:2: ( ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) )
            // InternalExpressions.g:1161:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            {
            // InternalExpressions.g:1161:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            // InternalExpressions.g:1162:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            {
            // InternalExpressions.g:1162:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            // InternalExpressions.g:1163:4: lv_value_0_0= RULE_BOOL_LITERAL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL_LITERAL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getExpressionConstantBoolAccess().getValueBOOL_LITERALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpressionConstantBoolRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"nl.esi.comma.expressions.Expressions.BOOL_LITERAL");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionConstantBool"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalExpressions.g:1182:1: entryRuleExpressionConstantInt returns [EObject current=null] : iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF ;
    public final EObject entryRuleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantInt = null;


        try {
            // InternalExpressions.g:1182:62: (iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF )
            // InternalExpressions.g:1183:2: iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF
            {
             newCompositeNode(grammarAccess.getExpressionConstantIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionConstantInt=ruleExpressionConstantInt();

            state._fsp--;

             current =iv_ruleExpressionConstantInt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalExpressions.g:1189:1: ruleExpressionConstantInt returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalExpressions.g:1195:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalExpressions.g:1196:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalExpressions.g:1196:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalExpressions.g:1197:3: (lv_value_0_0= RULE_INT )
            {
            // InternalExpressions.g:1197:3: (lv_value_0_0= RULE_INT )
            // InternalExpressions.g:1198:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpressionConstantIntRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "entryRuleExpressionConstantString"
    // InternalExpressions.g:1217:1: entryRuleExpressionConstantString returns [EObject current=null] : iv_ruleExpressionConstantString= ruleExpressionConstantString EOF ;
    public final EObject entryRuleExpressionConstantString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantString = null;


        try {
            // InternalExpressions.g:1217:65: (iv_ruleExpressionConstantString= ruleExpressionConstantString EOF )
            // InternalExpressions.g:1218:2: iv_ruleExpressionConstantString= ruleExpressionConstantString EOF
            {
             newCompositeNode(grammarAccess.getExpressionConstantStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionConstantString=ruleExpressionConstantString();

            state._fsp--;

             current =iv_ruleExpressionConstantString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionConstantString"


    // $ANTLR start "ruleExpressionConstantString"
    // InternalExpressions.g:1224:1: ruleExpressionConstantString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleExpressionConstantString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalExpressions.g:1230:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalExpressions.g:1231:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalExpressions.g:1231:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalExpressions.g:1232:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalExpressions.g:1232:3: (lv_value_0_0= RULE_STRING )
            // InternalExpressions.g:1233:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getExpressionConstantStringAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpressionConstantStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionConstantString"


    // $ANTLR start "entryRuleExpressionVariable"
    // InternalExpressions.g:1252:1: entryRuleExpressionVariable returns [EObject current=null] : iv_ruleExpressionVariable= ruleExpressionVariable EOF ;
    public final EObject entryRuleExpressionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionVariable = null;


        try {
            // InternalExpressions.g:1252:59: (iv_ruleExpressionVariable= ruleExpressionVariable EOF )
            // InternalExpressions.g:1253:2: iv_ruleExpressionVariable= ruleExpressionVariable EOF
            {
             newCompositeNode(grammarAccess.getExpressionVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionVariable=ruleExpressionVariable();

            state._fsp--;

             current =iv_ruleExpressionVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionVariable"


    // $ANTLR start "ruleExpressionVariable"
    // InternalExpressions.g:1259:1: ruleExpressionVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExpressionVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalExpressions.g:1265:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalExpressions.g:1266:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalExpressions.g:1266:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalExpressions.g:1267:3: (lv_name_0_0= RULE_ID )
            {
            // InternalExpressions.g:1267:3: (lv_name_0_0= RULE_ID )
            // InternalExpressions.g:1268:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getExpressionVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpressionVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionVariable"


    // $ANTLR start "entryRuleExpressionQuantifier"
    // InternalExpressions.g:1287:1: entryRuleExpressionQuantifier returns [EObject current=null] : iv_ruleExpressionQuantifier= ruleExpressionQuantifier EOF ;
    public final EObject entryRuleExpressionQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionQuantifier = null;


        try {
            // InternalExpressions.g:1287:61: (iv_ruleExpressionQuantifier= ruleExpressionQuantifier EOF )
            // InternalExpressions.g:1288:2: iv_ruleExpressionQuantifier= ruleExpressionQuantifier EOF
            {
             newCompositeNode(grammarAccess.getExpressionQuantifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionQuantifier=ruleExpressionQuantifier();

            state._fsp--;

             current =iv_ruleExpressionQuantifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionQuantifier"


    // $ANTLR start "ruleExpressionQuantifier"
    // InternalExpressions.g:1294:1: ruleExpressionQuantifier returns [EObject current=null] : ( ( (lv_quantifier_0_0= ruleQUANTIFIER ) ) otherlv_1= '(' ( (lv_iterator_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_collection_4_0= ruleExpression ) ) otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleExpressionQuantifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_quantifier_0_0 = null;

        EObject lv_iterator_2_0 = null;

        EObject lv_collection_4_0 = null;

        EObject lv_condition_6_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:1300:2: ( ( ( (lv_quantifier_0_0= ruleQUANTIFIER ) ) otherlv_1= '(' ( (lv_iterator_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_collection_4_0= ruleExpression ) ) otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // InternalExpressions.g:1301:2: ( ( (lv_quantifier_0_0= ruleQUANTIFIER ) ) otherlv_1= '(' ( (lv_iterator_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_collection_4_0= ruleExpression ) ) otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // InternalExpressions.g:1301:2: ( ( (lv_quantifier_0_0= ruleQUANTIFIER ) ) otherlv_1= '(' ( (lv_iterator_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_collection_4_0= ruleExpression ) ) otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) otherlv_7= ')' )
            // InternalExpressions.g:1302:3: ( (lv_quantifier_0_0= ruleQUANTIFIER ) ) otherlv_1= '(' ( (lv_iterator_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_collection_4_0= ruleExpression ) ) otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            // InternalExpressions.g:1302:3: ( (lv_quantifier_0_0= ruleQUANTIFIER ) )
            // InternalExpressions.g:1303:4: (lv_quantifier_0_0= ruleQUANTIFIER )
            {
            // InternalExpressions.g:1303:4: (lv_quantifier_0_0= ruleQUANTIFIER )
            // InternalExpressions.g:1304:5: lv_quantifier_0_0= ruleQUANTIFIER
            {

            					newCompositeNode(grammarAccess.getExpressionQuantifierAccess().getQuantifierQUANTIFIEREnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_quantifier_0_0=ruleQUANTIFIER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionQuantifierRule());
            					}
            					set(
            						current,
            						"quantifier",
            						lv_quantifier_0_0,
            						"nl.esi.comma.expressions.Expressions.QUANTIFIER");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getExpressionQuantifierAccess().getLeftParenthesisKeyword_1());
            		
            // InternalExpressions.g:1325:3: ( (lv_iterator_2_0= ruleVariable ) )
            // InternalExpressions.g:1326:4: (lv_iterator_2_0= ruleVariable )
            {
            // InternalExpressions.g:1326:4: (lv_iterator_2_0= ruleVariable )
            // InternalExpressions.g:1327:5: lv_iterator_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getExpressionQuantifierAccess().getIteratorVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_iterator_2_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionQuantifierRule());
            					}
            					set(
            						current,
            						"iterator",
            						lv_iterator_2_0,
            						"nl.esi.comma.expressions.Expressions.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getExpressionQuantifierAccess().getInKeyword_3());
            		
            // InternalExpressions.g:1348:3: ( (lv_collection_4_0= ruleExpression ) )
            // InternalExpressions.g:1349:4: (lv_collection_4_0= ruleExpression )
            {
            // InternalExpressions.g:1349:4: (lv_collection_4_0= ruleExpression )
            // InternalExpressions.g:1350:5: lv_collection_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionQuantifierAccess().getCollectionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_collection_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionQuantifierRule());
            					}
            					set(
            						current,
            						"collection",
            						lv_collection_4_0,
            						"nl.esi.comma.expressions.Expressions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getExpressionQuantifierAccess().getColonKeyword_5());
            		
            // InternalExpressions.g:1371:3: ( (lv_condition_6_0= ruleExpression ) )
            // InternalExpressions.g:1372:4: (lv_condition_6_0= ruleExpression )
            {
            // InternalExpressions.g:1372:4: (lv_condition_6_0= ruleExpression )
            // InternalExpressions.g:1373:5: lv_condition_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionQuantifierAccess().getConditionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_condition_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionQuantifierRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_6_0,
            						"nl.esi.comma.expressions.Expressions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExpressionQuantifierAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionQuantifier"


    // $ANTLR start "entryRuleExpressionTypeAnnotated"
    // InternalExpressions.g:1398:1: entryRuleExpressionTypeAnnotated returns [EObject current=null] : iv_ruleExpressionTypeAnnotated= ruleExpressionTypeAnnotated EOF ;
    public final EObject entryRuleExpressionTypeAnnotated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTypeAnnotated = null;


        try {
            // InternalExpressions.g:1398:64: (iv_ruleExpressionTypeAnnotated= ruleExpressionTypeAnnotated EOF )
            // InternalExpressions.g:1399:2: iv_ruleExpressionTypeAnnotated= ruleExpressionTypeAnnotated EOF
            {
             newCompositeNode(grammarAccess.getExpressionTypeAnnotatedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionTypeAnnotated=ruleExpressionTypeAnnotated();

            state._fsp--;

             current =iv_ruleExpressionTypeAnnotated; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionTypeAnnotated"


    // $ANTLR start "ruleExpressionTypeAnnotated"
    // InternalExpressions.g:1405:1: ruleExpressionTypeAnnotated returns [EObject current=null] : (this_TypeAnnotation_0= ruleTypeAnnotation ( ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' ) | ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' ) ) ) ;
    public final EObject ruleExpressionTypeAnnotated() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_TypeAnnotation_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_pairs_9_0 = null;

        EObject lv_pairs_11_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:1411:2: ( (this_TypeAnnotation_0= ruleTypeAnnotation ( ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' ) | ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' ) ) ) )
            // InternalExpressions.g:1412:2: (this_TypeAnnotation_0= ruleTypeAnnotation ( ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' ) | ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' ) ) )
            {
            // InternalExpressions.g:1412:2: (this_TypeAnnotation_0= ruleTypeAnnotation ( ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' ) | ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' ) ) )
            // InternalExpressions.g:1413:3: this_TypeAnnotation_0= ruleTypeAnnotation ( ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' ) | ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' ) )
            {

            			newCompositeNode(grammarAccess.getExpressionTypeAnnotatedAccess().getTypeAnnotationParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_TypeAnnotation_0=ruleTypeAnnotation();

            state._fsp--;


            			current = this_TypeAnnotation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressions.g:1421:3: ( ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' ) | ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            else if ( (LA16_0==39) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalExpressions.g:1422:4: ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' )
                    {
                    // InternalExpressions.g:1422:4: ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' )
                    // InternalExpressions.g:1423:5: () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']'
                    {
                    // InternalExpressions.g:1423:5: ()
                    // InternalExpressions.g:1424:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getExpressionTypeAnnotatedAccess().getExpressionVectorTypeAnnotationAction_1_0_0(),
                    							current);
                    					

                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_16); 

                    					newLeafNode(otherlv_2, grammarAccess.getExpressionTypeAnnotatedAccess().getLeftSquareBracketKeyword_1_0_1());
                    				
                    // InternalExpressions.g:1434:5: ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||(LA13_0>=21 && LA13_0<=23)||(LA13_0>=30 && LA13_0<=32)||(LA13_0>=42 && LA13_0<=44)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalExpressions.g:1435:6: ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )*
                            {
                            // InternalExpressions.g:1435:6: ( (lv_elements_3_0= ruleExpression ) )
                            // InternalExpressions.g:1436:7: (lv_elements_3_0= ruleExpression )
                            {
                            // InternalExpressions.g:1436:7: (lv_elements_3_0= ruleExpression )
                            // InternalExpressions.g:1437:8: lv_elements_3_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getExpressionTypeAnnotatedAccess().getElementsExpressionParserRuleCall_1_0_2_0_0());
                            							
                            pushFollow(FOLLOW_17);
                            lv_elements_3_0=ruleExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getExpressionTypeAnnotatedRule());
                            								}
                            								add(
                            									current,
                            									"elements",
                            									lv_elements_3_0,
                            									"nl.esi.comma.expressions.Expressions.Expression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalExpressions.g:1454:6: (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==37) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalExpressions.g:1455:7: otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,37,FOLLOW_4); 

                            	    							newLeafNode(otherlv_4, grammarAccess.getExpressionTypeAnnotatedAccess().getCommaKeyword_1_0_2_1_0());
                            	    						
                            	    // InternalExpressions.g:1459:7: ( (lv_elements_5_0= ruleExpression ) )
                            	    // InternalExpressions.g:1460:8: (lv_elements_5_0= ruleExpression )
                            	    {
                            	    // InternalExpressions.g:1460:8: (lv_elements_5_0= ruleExpression )
                            	    // InternalExpressions.g:1461:9: lv_elements_5_0= ruleExpression
                            	    {

                            	    									newCompositeNode(grammarAccess.getExpressionTypeAnnotatedAccess().getElementsExpressionParserRuleCall_1_0_2_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_17);
                            	    lv_elements_5_0=ruleExpression();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getExpressionTypeAnnotatedRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"elements",
                            	    										lv_elements_5_0,
                            	    										"nl.esi.comma.expressions.Expressions.Expression");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getExpressionTypeAnnotatedAccess().getRightSquareBracketKeyword_1_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:1486:4: ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' )
                    {
                    // InternalExpressions.g:1486:4: ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' )
                    // InternalExpressions.g:1487:5: () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}'
                    {
                    // InternalExpressions.g:1487:5: ()
                    // InternalExpressions.g:1488:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getExpressionTypeAnnotatedAccess().getExpressionMapTypeAnnotationAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_8=(Token)match(input,39,FOLLOW_18); 

                    					newLeafNode(otherlv_8, grammarAccess.getExpressionTypeAnnotatedAccess().getLeftCurlyBracketKeyword_1_1_1());
                    				
                    // InternalExpressions.g:1498:5: ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||(LA15_0>=21 && LA15_0<=23)||(LA15_0>=30 && LA15_0<=32)||(LA15_0>=42 && LA15_0<=44)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalExpressions.g:1499:6: ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )*
                            {
                            // InternalExpressions.g:1499:6: ( (lv_pairs_9_0= rulePair ) )
                            // InternalExpressions.g:1500:7: (lv_pairs_9_0= rulePair )
                            {
                            // InternalExpressions.g:1500:7: (lv_pairs_9_0= rulePair )
                            // InternalExpressions.g:1501:8: lv_pairs_9_0= rulePair
                            {

                            								newCompositeNode(grammarAccess.getExpressionTypeAnnotatedAccess().getPairsPairParserRuleCall_1_1_2_0_0());
                            							
                            pushFollow(FOLLOW_19);
                            lv_pairs_9_0=rulePair();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getExpressionTypeAnnotatedRule());
                            								}
                            								add(
                            									current,
                            									"pairs",
                            									lv_pairs_9_0,
                            									"nl.esi.comma.expressions.Expressions.Pair");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalExpressions.g:1518:6: (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==37) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalExpressions.g:1519:7: otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) )
                            	    {
                            	    otherlv_10=(Token)match(input,37,FOLLOW_4); 

                            	    							newLeafNode(otherlv_10, grammarAccess.getExpressionTypeAnnotatedAccess().getCommaKeyword_1_1_2_1_0());
                            	    						
                            	    // InternalExpressions.g:1523:7: ( (lv_pairs_11_0= rulePair ) )
                            	    // InternalExpressions.g:1524:8: (lv_pairs_11_0= rulePair )
                            	    {
                            	    // InternalExpressions.g:1524:8: (lv_pairs_11_0= rulePair )
                            	    // InternalExpressions.g:1525:9: lv_pairs_11_0= rulePair
                            	    {

                            	    									newCompositeNode(grammarAccess.getExpressionTypeAnnotatedAccess().getPairsPairParserRuleCall_1_1_2_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_19);
                            	    lv_pairs_11_0=rulePair();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getExpressionTypeAnnotatedRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"pairs",
                            	    										lv_pairs_11_0,
                            	    										"nl.esi.comma.expressions.Expressions.Pair");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getExpressionTypeAnnotatedAccess().getRightCurlyBracketKeyword_1_1_3());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionTypeAnnotated"


    // $ANTLR start "entryRuleTypeAnnotation"
    // InternalExpressions.g:1554:1: entryRuleTypeAnnotation returns [EObject current=null] : iv_ruleTypeAnnotation= ruleTypeAnnotation EOF ;
    public final EObject entryRuleTypeAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAnnotation = null;


        try {
            // InternalExpressions.g:1554:55: (iv_ruleTypeAnnotation= ruleTypeAnnotation EOF )
            // InternalExpressions.g:1555:2: iv_ruleTypeAnnotation= ruleTypeAnnotation EOF
            {
             newCompositeNode(grammarAccess.getTypeAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeAnnotation=ruleTypeAnnotation();

            state._fsp--;

             current =iv_ruleTypeAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeAnnotation"


    // $ANTLR start "ruleTypeAnnotation"
    // InternalExpressions.g:1561:1: ruleTypeAnnotation returns [EObject current=null] : (otherlv_0= '<' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '>' ) ;
    public final EObject ruleTypeAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExpressions.g:1567:2: ( (otherlv_0= '<' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '>' ) )
            // InternalExpressions.g:1568:2: (otherlv_0= '<' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '>' )
            {
            // InternalExpressions.g:1568:2: (otherlv_0= '<' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '>' )
            // InternalExpressions.g:1569:3: otherlv_0= '<' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAnnotationAccess().getLessThanSignKeyword_0());
            		
            // InternalExpressions.g:1573:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalExpressions.g:1574:4: (lv_type_1_0= RULE_ID )
            {
            // InternalExpressions.g:1574:4: (lv_type_1_0= RULE_ID )
            // InternalExpressions.g:1575:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_type_1_0, grammarAccess.getTypeAnnotationAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAnnotationAccess().getGreaterThanSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeAnnotation"


    // $ANTLR start "entryRulePair"
    // InternalExpressions.g:1599:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalExpressions.g:1599:45: (iv_rulePair= rulePair EOF )
            // InternalExpressions.g:1600:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalExpressions.g:1606:1: rulePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:1612:2: ( ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalExpressions.g:1613:2: ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalExpressions.g:1613:2: ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalExpressions.g:1614:3: ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalExpressions.g:1614:3: ( (lv_key_0_0= ruleExpression ) )
            // InternalExpressions.g:1615:4: (lv_key_0_0= ruleExpression )
            {
            // InternalExpressions.g:1615:4: (lv_key_0_0= ruleExpression )
            // InternalExpressions.g:1616:5: lv_key_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPairAccess().getKeyExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_key_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPairRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"nl.esi.comma.expressions.Expressions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPairAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalExpressions.g:1637:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalExpressions.g:1638:4: (lv_value_2_0= ruleExpression )
            {
            // InternalExpressions.g:1638:4: (lv_value_2_0= ruleExpression )
            // InternalExpressions.g:1639:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPairAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"nl.esi.comma.expressions.Expressions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePair"


    // $ANTLR start "ruleQUANTIFIER"
    // InternalExpressions.g:1660:1: ruleQUANTIFIER returns [Enumerator current=null] : ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forAll' ) | (enumLiteral_2= 'delete' ) ) ;
    public final Enumerator ruleQUANTIFIER() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalExpressions.g:1666:2: ( ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forAll' ) | (enumLiteral_2= 'delete' ) ) )
            // InternalExpressions.g:1667:2: ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forAll' ) | (enumLiteral_2= 'delete' ) )
            {
            // InternalExpressions.g:1667:2: ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forAll' ) | (enumLiteral_2= 'delete' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt17=1;
                }
                break;
            case 43:
                {
                alt17=2;
                }
                break;
            case 44:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalExpressions.g:1668:3: (enumLiteral_0= 'exists' )
                    {
                    // InternalExpressions.g:1668:3: (enumLiteral_0= 'exists' )
                    // InternalExpressions.g:1669:4: enumLiteral_0= 'exists'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getQUANTIFIERAccess().getEXISTSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQUANTIFIERAccess().getEXISTSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:1676:3: (enumLiteral_1= 'forAll' )
                    {
                    // InternalExpressions.g:1676:3: (enumLiteral_1= 'forAll' )
                    // InternalExpressions.g:1677:4: enumLiteral_1= 'forAll'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getQUANTIFIERAccess().getFORALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQUANTIFIERAccess().getFORALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:1684:3: (enumLiteral_2= 'delete' )
                    {
                    // InternalExpressions.g:1684:3: (enumLiteral_2= 'delete' )
                    // InternalExpressions.g:1685:4: enumLiteral_2= 'delete'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getQUANTIFIERAccess().getDELETEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQUANTIFIERAccess().getDELETEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQUANTIFIER"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00001C01C0E000F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00001C41C0E000F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00001D01C0E000F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});

}