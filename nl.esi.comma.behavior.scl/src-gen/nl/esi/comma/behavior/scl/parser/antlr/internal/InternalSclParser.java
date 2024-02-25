package nl.esi.comma.behavior.scl.parser.antlr.internal;

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
import nl.esi.comma.behavior.scl.services.SclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSclParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOL_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Requirements'", "'for-configurations'", "'use-provided-labels'", "'constraint'", "'is-composed-of'", "'{'", "'}'", "'description'", "';'", "'requirement-tags'", "'Sequence-Def'", "'['", "']'", "'act'", "'seq'", "'feature-list:'", "'action-list:'", "'with'", "'('", "','", "')'", "'P'", "'F'", "'PF'", "'C'", "'E'", "'either'", "'or'", "'eventually-occur-but-not-together'", "'eventually-occur'", "'!<>'", "'occurs'", "'if-and-only-if-not-followed-immediately-by'", "'!-'", "'do-not-occur-together'", "'!<-->'", "'if-and-only-if-not-followed-by'", "'<>'", "'occurs-if-and-only-if-immediately-followed-by'", "'within'", "'-'", "'ms'", "'<!>'", "'if-and-only-if-followed-by'", "'no'", "'in-between'", "'<-->'", "'occur-together'", "'-|-'", "'if'", "'then'", "'occurs-as-well'", "'<'", "'whenever'", "'must'", "'not'", "'have-occurred-immediately-before'", "'>'", "'immediately-follow'", "'!>'", "'must-follow'", "'<!'", "'must-have-occurred'", "'->'", "'eventually-follow'", "'<-'", "'have-occurred-before'", "'occurs-last'", "'occurs-first'", "'occurs-at-most'", "'times'", "'occurs-exactly'", "'consecutively'", "'with-periodicity-of'", "'occurs-at-least'", "'AND'", "'and'", "'OR'", "'=='", "'!='", "'>='", "'<='", "'+'", "'*'", "'/'", "'max'", "'min'", "'mod'", "'^'", "'NOT'", "'in'", "':'", "'Observable'", "'Trigger'", "'Pre-condition'", "'And'", "'exists'", "'forAll'", "'delete'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_BOOL_LITERAL=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalSclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSclParser.tokenNames; }
    public String getGrammarFileName() { return "InternalScl.g"; }



     	private SclGrammarAccess grammarAccess;

        public InternalSclParser(TokenStream input, SclGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SclGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalScl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalScl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalScl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalScl.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_features_0_0= ruleFeatures ) )* ( (lv_actions_1_0= ruleActions ) )+ ( (lv_sequences_2_0= ruleSequenceDef ) )* otherlv_3= 'Requirements' ( (lv_composition_4_0= ruleComposition ) )* (otherlv_5= 'for-configurations' ( (otherlv_6= RULE_ID ) )+ )? ( (lv_templates_7_0= ruleTemplates ) )* ( (lv_useLabels_8_0= 'use-provided-labels' ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_useLabels_8_0=null;
        EObject lv_features_0_0 = null;

        EObject lv_actions_1_0 = null;

        EObject lv_sequences_2_0 = null;

        EObject lv_composition_4_0 = null;

        EObject lv_templates_7_0 = null;



        	enterRule();

        try {
            // InternalScl.g:78:2: ( ( ( (lv_features_0_0= ruleFeatures ) )* ( (lv_actions_1_0= ruleActions ) )+ ( (lv_sequences_2_0= ruleSequenceDef ) )* otherlv_3= 'Requirements' ( (lv_composition_4_0= ruleComposition ) )* (otherlv_5= 'for-configurations' ( (otherlv_6= RULE_ID ) )+ )? ( (lv_templates_7_0= ruleTemplates ) )* ( (lv_useLabels_8_0= 'use-provided-labels' ) )? ) )
            // InternalScl.g:79:2: ( ( (lv_features_0_0= ruleFeatures ) )* ( (lv_actions_1_0= ruleActions ) )+ ( (lv_sequences_2_0= ruleSequenceDef ) )* otherlv_3= 'Requirements' ( (lv_composition_4_0= ruleComposition ) )* (otherlv_5= 'for-configurations' ( (otherlv_6= RULE_ID ) )+ )? ( (lv_templates_7_0= ruleTemplates ) )* ( (lv_useLabels_8_0= 'use-provided-labels' ) )? )
            {
            // InternalScl.g:79:2: ( ( (lv_features_0_0= ruleFeatures ) )* ( (lv_actions_1_0= ruleActions ) )+ ( (lv_sequences_2_0= ruleSequenceDef ) )* otherlv_3= 'Requirements' ( (lv_composition_4_0= ruleComposition ) )* (otherlv_5= 'for-configurations' ( (otherlv_6= RULE_ID ) )+ )? ( (lv_templates_7_0= ruleTemplates ) )* ( (lv_useLabels_8_0= 'use-provided-labels' ) )? )
            // InternalScl.g:80:3: ( (lv_features_0_0= ruleFeatures ) )* ( (lv_actions_1_0= ruleActions ) )+ ( (lv_sequences_2_0= ruleSequenceDef ) )* otherlv_3= 'Requirements' ( (lv_composition_4_0= ruleComposition ) )* (otherlv_5= 'for-configurations' ( (otherlv_6= RULE_ID ) )+ )? ( (lv_templates_7_0= ruleTemplates ) )* ( (lv_useLabels_8_0= 'use-provided-labels' ) )?
            {
            // InternalScl.g:80:3: ( (lv_features_0_0= ruleFeatures ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalScl.g:81:4: (lv_features_0_0= ruleFeatures )
            	    {
            	    // InternalScl.g:81:4: (lv_features_0_0= ruleFeatures )
            	    // InternalScl.g:82:5: lv_features_0_0= ruleFeatures
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFeaturesFeaturesParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_features_0_0=ruleFeatures();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_0_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Features");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalScl.g:99:3: ( (lv_actions_1_0= ruleActions ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalScl.g:100:4: (lv_actions_1_0= ruleActions )
            	    {
            	    // InternalScl.g:100:4: (lv_actions_1_0= ruleActions )
            	    // InternalScl.g:101:5: lv_actions_1_0= ruleActions
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getActionsActionsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_actions_1_0=ruleActions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_1_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Actions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalScl.g:118:3: ( (lv_sequences_2_0= ruleSequenceDef ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalScl.g:119:4: (lv_sequences_2_0= ruleSequenceDef )
            	    {
            	    // InternalScl.g:119:4: (lv_sequences_2_0= ruleSequenceDef )
            	    // InternalScl.g:120:5: lv_sequences_2_0= ruleSequenceDef
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSequencesSequenceDefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_sequences_2_0=ruleSequenceDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sequences",
            	    						lv_sequences_2_0,
            	    						"nl.esi.comma.behavior.scl.Scl.SequenceDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRequirementsKeyword_3());
            		
            // InternalScl.g:141:3: ( (lv_composition_4_0= ruleComposition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalScl.g:142:4: (lv_composition_4_0= ruleComposition )
            	    {
            	    // InternalScl.g:142:4: (lv_composition_4_0= ruleComposition )
            	    // InternalScl.g:143:5: lv_composition_4_0= ruleComposition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getCompositionCompositionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_composition_4_0=ruleComposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"composition",
            	    						lv_composition_4_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Composition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalScl.g:160:3: (otherlv_5= 'for-configurations' ( (otherlv_6= RULE_ID ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalScl.g:161:4: otherlv_5= 'for-configurations' ( (otherlv_6= RULE_ID ) )+
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getForConfigurationsKeyword_5_0());
                    			
                    // InternalScl.g:165:4: ( (otherlv_6= RULE_ID ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1==EOF||LA5_1==RULE_ID||LA5_1==14) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalScl.g:166:5: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalScl.g:166:5: (otherlv_6= RULE_ID )
                    	    // InternalScl.g:167:6: otherlv_6= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getModelRule());
                    	    						}
                    	    					
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getModelAccess().getCommonFeaturesFeatureCrossReference_5_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            // InternalScl.g:179:3: ( (lv_templates_7_0= ruleTemplates ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalScl.g:180:4: (lv_templates_7_0= ruleTemplates )
            	    {
            	    // InternalScl.g:180:4: (lv_templates_7_0= ruleTemplates )
            	    // InternalScl.g:181:5: lv_templates_7_0= ruleTemplates
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTemplatesTemplatesParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_templates_7_0=ruleTemplates();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"templates",
            	    						lv_templates_7_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Templates");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalScl.g:198:3: ( (lv_useLabels_8_0= 'use-provided-labels' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalScl.g:199:4: (lv_useLabels_8_0= 'use-provided-labels' )
                    {
                    // InternalScl.g:199:4: (lv_useLabels_8_0= 'use-provided-labels' )
                    // InternalScl.g:200:5: lv_useLabels_8_0= 'use-provided-labels'
                    {
                    lv_useLabels_8_0=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_useLabels_8_0, grammarAccess.getModelAccess().getUseLabelsUseProvidedLabelsKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					setWithLastConsumed(current, "useLabels", lv_useLabels_8_0 != null, "use-provided-labels");
                    				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleComposition"
    // InternalScl.g:216:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalScl.g:216:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalScl.g:217:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
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
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalScl.g:223:1: ruleComposition returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is-composed-of' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' (otherlv_6= 'description' ( (lv_descTxt_7_0= RULE_STRING ) ) )? (otherlv_8= 'for-configurations' ( (otherlv_9= RULE_ID ) )+ otherlv_10= ';' )? (otherlv_11= 'requirement-tags' ( (lv_tagStr_12_0= RULE_STRING ) )* otherlv_13= ';' )? ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_descTxt_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_tagStr_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalScl.g:229:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is-composed-of' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' (otherlv_6= 'description' ( (lv_descTxt_7_0= RULE_STRING ) ) )? (otherlv_8= 'for-configurations' ( (otherlv_9= RULE_ID ) )+ otherlv_10= ';' )? (otherlv_11= 'requirement-tags' ( (lv_tagStr_12_0= RULE_STRING ) )* otherlv_13= ';' )? ) )
            // InternalScl.g:230:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is-composed-of' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' (otherlv_6= 'description' ( (lv_descTxt_7_0= RULE_STRING ) ) )? (otherlv_8= 'for-configurations' ( (otherlv_9= RULE_ID ) )+ otherlv_10= ';' )? (otherlv_11= 'requirement-tags' ( (lv_tagStr_12_0= RULE_STRING ) )* otherlv_13= ';' )? )
            {
            // InternalScl.g:230:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is-composed-of' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' (otherlv_6= 'description' ( (lv_descTxt_7_0= RULE_STRING ) ) )? (otherlv_8= 'for-configurations' ( (otherlv_9= RULE_ID ) )+ otherlv_10= ';' )? (otherlv_11= 'requirement-tags' ( (lv_tagStr_12_0= RULE_STRING ) )* otherlv_13= ';' )? )
            // InternalScl.g:231:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is-composed-of' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' (otherlv_6= 'description' ( (lv_descTxt_7_0= RULE_STRING ) ) )? (otherlv_8= 'for-configurations' ( (otherlv_9= RULE_ID ) )+ otherlv_10= ';' )? (otherlv_11= 'requirement-tags' ( (lv_tagStr_12_0= RULE_STRING ) )* otherlv_13= ';' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositionAccess().getConstraintKeyword_0());
            		
            // InternalScl.g:235:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalScl.g:236:4: (lv_name_1_0= RULE_ID )
            {
            // InternalScl.g:236:4: (lv_name_1_0= RULE_ID )
            // InternalScl.g:237:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositionAccess().getIsComposedOfKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalScl.g:261:3: ( (otherlv_4= RULE_ID ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalScl.g:262:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalScl.g:262:4: (otherlv_4= RULE_ID )
            	    // InternalScl.g:263:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCompositionRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    					newLeafNode(otherlv_4, grammarAccess.getCompositionAccess().getTemplatesTemplatesCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getCompositionAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalScl.g:278:3: (otherlv_6= 'description' ( (lv_descTxt_7_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalScl.g:279:4: otherlv_6= 'description' ( (lv_descTxt_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getCompositionAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalScl.g:283:4: ( (lv_descTxt_7_0= RULE_STRING ) )
                    // InternalScl.g:284:5: (lv_descTxt_7_0= RULE_STRING )
                    {
                    // InternalScl.g:284:5: (lv_descTxt_7_0= RULE_STRING )
                    // InternalScl.g:285:6: lv_descTxt_7_0= RULE_STRING
                    {
                    lv_descTxt_7_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_descTxt_7_0, grammarAccess.getCompositionAccess().getDescTxtSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"descTxt",
                    							lv_descTxt_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalScl.g:302:3: (otherlv_8= 'for-configurations' ( (otherlv_9= RULE_ID ) )+ otherlv_10= ';' )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalScl.g:303:4: otherlv_8= 'for-configurations' ( (otherlv_9= RULE_ID ) )+ otherlv_10= ';'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositionAccess().getForConfigurationsKeyword_7_0());
                    			
                    // InternalScl.g:307:4: ( (otherlv_9= RULE_ID ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalScl.g:308:5: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalScl.g:308:5: (otherlv_9= RULE_ID )
                    	    // InternalScl.g:309:6: otherlv_9= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getCompositionRule());
                    	    						}
                    	    					
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getCompositionAccess().getCommonFeaturesFeatureCrossReference_7_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    otherlv_10=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getCompositionAccess().getSemicolonKeyword_7_2());
                    			

                    }
                    break;

            }

            // InternalScl.g:325:3: (otherlv_11= 'requirement-tags' ( (lv_tagStr_12_0= RULE_STRING ) )* otherlv_13= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalScl.g:326:4: otherlv_11= 'requirement-tags' ( (lv_tagStr_12_0= RULE_STRING ) )* otherlv_13= ';'
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getCompositionAccess().getRequirementTagsKeyword_8_0());
                    			
                    // InternalScl.g:330:4: ( (lv_tagStr_12_0= RULE_STRING ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_STRING) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalScl.g:331:5: (lv_tagStr_12_0= RULE_STRING )
                    	    {
                    	    // InternalScl.g:331:5: (lv_tagStr_12_0= RULE_STRING )
                    	    // InternalScl.g:332:6: lv_tagStr_12_0= RULE_STRING
                    	    {
                    	    lv_tagStr_12_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    	    						newLeafNode(lv_tagStr_12_0, grammarAccess.getCompositionAccess().getTagStrSTRINGTerminalRuleCall_8_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getCompositionRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"tagStr",
                    	    							lv_tagStr_12_0,
                    	    							"org.eclipse.xtext.common.Terminals.STRING");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getCompositionAccess().getSemicolonKeyword_8_2());
                    			

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
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleSequenceDef"
    // InternalScl.g:357:1: entryRuleSequenceDef returns [EObject current=null] : iv_ruleSequenceDef= ruleSequenceDef EOF ;
    public final EObject entryRuleSequenceDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceDef = null;


        try {
            // InternalScl.g:357:52: (iv_ruleSequenceDef= ruleSequenceDef EOF )
            // InternalScl.g:358:2: iv_ruleSequenceDef= ruleSequenceDef EOF
            {
             newCompositeNode(grammarAccess.getSequenceDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceDef=ruleSequenceDef();

            state._fsp--;

             current =iv_ruleSequenceDef; 
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
    // $ANTLR end "entryRuleSequenceDef"


    // $ANTLR start "ruleSequenceDef"
    // InternalScl.g:364:1: ruleSequenceDef returns [EObject current=null] : (otherlv_0= 'Sequence-Def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actList_3_0= ruleParamAct ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSequenceDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_actList_3_0 = null;



        	enterRule();

        try {
            // InternalScl.g:370:2: ( (otherlv_0= 'Sequence-Def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actList_3_0= ruleParamAct ) )+ otherlv_4= '}' ) )
            // InternalScl.g:371:2: (otherlv_0= 'Sequence-Def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actList_3_0= ruleParamAct ) )+ otherlv_4= '}' )
            {
            // InternalScl.g:371:2: (otherlv_0= 'Sequence-Def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actList_3_0= ruleParamAct ) )+ otherlv_4= '}' )
            // InternalScl.g:372:3: otherlv_0= 'Sequence-Def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_actList_3_0= ruleParamAct ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSequenceDefAccess().getSequenceDefKeyword_0());
            		
            // InternalScl.g:376:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalScl.g:377:4: (lv_name_1_0= RULE_ID )
            {
            // InternalScl.g:377:4: (lv_name_1_0= RULE_ID )
            // InternalScl.g:378:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSequenceDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSequenceDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceDefAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalScl.g:398:3: ( (lv_actList_3_0= ruleParamAct ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalScl.g:399:4: (lv_actList_3_0= ruleParamAct )
            	    {
            	    // InternalScl.g:399:4: (lv_actList_3_0= ruleParamAct )
            	    // InternalScl.g:400:5: lv_actList_3_0= ruleParamAct
            	    {

            	    					newCompositeNode(grammarAccess.getSequenceDefAccess().getActListParamActParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_actList_3_0=ruleParamAct();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSequenceDefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actList",
            	    						lv_actList_3_0,
            	    						"nl.esi.comma.behavior.scl.Scl.ParamAct");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSequenceDefAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSequenceDef"


    // $ANTLR start "entryRuleParamAct"
    // InternalScl.g:425:1: entryRuleParamAct returns [EObject current=null] : iv_ruleParamAct= ruleParamAct EOF ;
    public final EObject entryRuleParamAct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamAct = null;


        try {
            // InternalScl.g:425:49: (iv_ruleParamAct= ruleParamAct EOF )
            // InternalScl.g:426:2: iv_ruleParamAct= ruleParamAct EOF
            {
             newCompositeNode(grammarAccess.getParamActRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamAct=ruleParamAct();

            state._fsp--;

             current =iv_ruleParamAct; 
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
    // $ANTLR end "entryRuleParamAct"


    // $ANTLR start "ruleParamAct"
    // InternalScl.g:432:1: ruleParamAct returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_idx_2_0= RULE_INT ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleParamAct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_idx_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalScl.g:438:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_idx_2_0= RULE_INT ) ) otherlv_3= ']' )? ) )
            // InternalScl.g:439:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_idx_2_0= RULE_INT ) ) otherlv_3= ']' )? )
            {
            // InternalScl.g:439:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_idx_2_0= RULE_INT ) ) otherlv_3= ']' )? )
            // InternalScl.g:440:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_idx_2_0= RULE_INT ) ) otherlv_3= ']' )?
            {
            // InternalScl.g:440:3: ( (otherlv_0= RULE_ID ) )
            // InternalScl.g:441:4: (otherlv_0= RULE_ID )
            {
            // InternalScl.g:441:4: (otherlv_0= RULE_ID )
            // InternalScl.g:442:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamActRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getParamActAccess().getActActionCrossReference_0_0());
            				

            }


            }

            // InternalScl.g:453:3: (otherlv_1= '[' ( (lv_idx_2_0= RULE_INT ) ) otherlv_3= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalScl.g:454:4: otherlv_1= '[' ( (lv_idx_2_0= RULE_INT ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getParamActAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalScl.g:458:4: ( (lv_idx_2_0= RULE_INT ) )
                    // InternalScl.g:459:5: (lv_idx_2_0= RULE_INT )
                    {
                    // InternalScl.g:459:5: (lv_idx_2_0= RULE_INT )
                    // InternalScl.g:460:6: lv_idx_2_0= RULE_INT
                    {
                    lv_idx_2_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    						newLeafNode(lv_idx_2_0, grammarAccess.getParamActAccess().getIdxINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamActRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"idx",
                    							lv_idx_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getParamActAccess().getRightSquareBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleParamAct"


    // $ANTLR start "entryRuleRef"
    // InternalScl.g:485:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // InternalScl.g:485:44: (iv_ruleRef= ruleRef EOF )
            // InternalScl.g:486:2: iv_ruleRef= ruleRef EOF
            {
             newCompositeNode(grammarAccess.getRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRef=ruleRef();

            state._fsp--;

             current =iv_ruleRef; 
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
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // InternalScl.g:492:1: ruleRef returns [EObject current=null] : (this_RefSequence_0= ruleRefSequence | this_RefStep_1= ruleRefStep ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        EObject this_RefSequence_0 = null;

        EObject this_RefStep_1 = null;



        	enterRule();

        try {
            // InternalScl.g:498:2: ( (this_RefSequence_0= ruleRefSequence | this_RefStep_1= ruleRefStep ) )
            // InternalScl.g:499:2: (this_RefSequence_0= ruleRefSequence | this_RefStep_1= ruleRefStep )
            {
            // InternalScl.g:499:2: (this_RefSequence_0= ruleRefSequence | this_RefStep_1= ruleRefStep )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            else if ( (LA17_0==25) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalScl.g:500:3: this_RefSequence_0= ruleRefSequence
                    {

                    			newCompositeNode(grammarAccess.getRefAccess().getRefSequenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefSequence_0=ruleRefSequence();

                    state._fsp--;


                    			current = this_RefSequence_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalScl.g:509:3: this_RefStep_1= ruleRefStep
                    {

                    			newCompositeNode(grammarAccess.getRefAccess().getRefStepParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefStep_1=ruleRefStep();

                    state._fsp--;


                    			current = this_RefStep_1;
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
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleRefStep"
    // InternalScl.g:521:1: entryRuleRefStep returns [EObject current=null] : iv_ruleRefStep= ruleRefStep EOF ;
    public final EObject entryRuleRefStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefStep = null;


        try {
            // InternalScl.g:521:48: (iv_ruleRefStep= ruleRefStep EOF )
            // InternalScl.g:522:2: iv_ruleRefStep= ruleRefStep EOF
            {
             newCompositeNode(grammarAccess.getRefStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefStep=ruleRefStep();

            state._fsp--;

             current =iv_ruleRefStep; 
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
    // $ANTLR end "entryRuleRefStep"


    // $ANTLR start "ruleRefStep"
    // InternalScl.g:528:1: ruleRefStep returns [EObject current=null] : (otherlv_0= 'act' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_idx_3_0= RULE_INT ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleRefStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_idx_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalScl.g:534:2: ( (otherlv_0= 'act' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_idx_3_0= RULE_INT ) ) otherlv_4= ']' )? ) )
            // InternalScl.g:535:2: (otherlv_0= 'act' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_idx_3_0= RULE_INT ) ) otherlv_4= ']' )? )
            {
            // InternalScl.g:535:2: (otherlv_0= 'act' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_idx_3_0= RULE_INT ) ) otherlv_4= ']' )? )
            // InternalScl.g:536:3: otherlv_0= 'act' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_idx_3_0= RULE_INT ) ) otherlv_4= ']' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRefStepAccess().getActKeyword_0());
            		
            // InternalScl.g:540:3: ( (otherlv_1= RULE_ID ) )
            // InternalScl.g:541:4: (otherlv_1= RULE_ID )
            {
            // InternalScl.g:541:4: (otherlv_1= RULE_ID )
            // InternalScl.g:542:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefStepRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getRefStepAccess().getStepActionCrossReference_1_0());
            				

            }


            }

            // InternalScl.g:553:3: (otherlv_2= '[' ( (lv_idx_3_0= RULE_INT ) ) otherlv_4= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalScl.g:554:4: otherlv_2= '[' ( (lv_idx_3_0= RULE_INT ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getRefStepAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalScl.g:558:4: ( (lv_idx_3_0= RULE_INT ) )
                    // InternalScl.g:559:5: (lv_idx_3_0= RULE_INT )
                    {
                    // InternalScl.g:559:5: (lv_idx_3_0= RULE_INT )
                    // InternalScl.g:560:6: lv_idx_3_0= RULE_INT
                    {
                    lv_idx_3_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    						newLeafNode(lv_idx_3_0, grammarAccess.getRefStepAccess().getIdxINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRefStepRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"idx",
                    							lv_idx_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getRefStepAccess().getRightSquareBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleRefStep"


    // $ANTLR start "entryRuleRefSequence"
    // InternalScl.g:585:1: entryRuleRefSequence returns [EObject current=null] : iv_ruleRefSequence= ruleRefSequence EOF ;
    public final EObject entryRuleRefSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefSequence = null;


        try {
            // InternalScl.g:585:52: (iv_ruleRefSequence= ruleRefSequence EOF )
            // InternalScl.g:586:2: iv_ruleRefSequence= ruleRefSequence EOF
            {
             newCompositeNode(grammarAccess.getRefSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefSequence=ruleRefSequence();

            state._fsp--;

             current =iv_ruleRefSequence; 
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
    // $ANTLR end "entryRuleRefSequence"


    // $ANTLR start "ruleRefSequence"
    // InternalScl.g:592:1: ruleRefSequence returns [EObject current=null] : (otherlv_0= 'seq' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRefSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalScl.g:598:2: ( (otherlv_0= 'seq' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalScl.g:599:2: (otherlv_0= 'seq' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalScl.g:599:2: (otherlv_0= 'seq' ( (otherlv_1= RULE_ID ) ) )
            // InternalScl.g:600:3: otherlv_0= 'seq' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRefSequenceAccess().getSeqKeyword_0());
            		
            // InternalScl.g:604:3: ( (otherlv_1= RULE_ID ) )
            // InternalScl.g:605:4: (otherlv_1= RULE_ID )
            {
            // InternalScl.g:605:4: (otherlv_1= RULE_ID )
            // InternalScl.g:606:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefSequenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRefSequenceAccess().getSeqSequenceDefCrossReference_1_0());
            				

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
    // $ANTLR end "ruleRefSequence"


    // $ANTLR start "entryRuleFeatures"
    // InternalScl.g:621:1: entryRuleFeatures returns [EObject current=null] : iv_ruleFeatures= ruleFeatures EOF ;
    public final EObject entryRuleFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatures = null;


        try {
            // InternalScl.g:621:49: (iv_ruleFeatures= ruleFeatures EOF )
            // InternalScl.g:622:2: iv_ruleFeatures= ruleFeatures EOF
            {
             newCompositeNode(grammarAccess.getFeaturesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatures=ruleFeatures();

            state._fsp--;

             current =iv_ruleFeatures; 
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
    // $ANTLR end "entryRuleFeatures"


    // $ANTLR start "ruleFeatures"
    // InternalScl.g:628:1: ruleFeatures returns [EObject current=null] : (otherlv_0= 'feature-list:' otherlv_1= '{' ( (lv_feature_2_0= ruleFeature ) )+ otherlv_3= '}' ) ;
    public final EObject ruleFeatures() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_feature_2_0 = null;



        	enterRule();

        try {
            // InternalScl.g:634:2: ( (otherlv_0= 'feature-list:' otherlv_1= '{' ( (lv_feature_2_0= ruleFeature ) )+ otherlv_3= '}' ) )
            // InternalScl.g:635:2: (otherlv_0= 'feature-list:' otherlv_1= '{' ( (lv_feature_2_0= ruleFeature ) )+ otherlv_3= '}' )
            {
            // InternalScl.g:635:2: (otherlv_0= 'feature-list:' otherlv_1= '{' ( (lv_feature_2_0= ruleFeature ) )+ otherlv_3= '}' )
            // InternalScl.g:636:3: otherlv_0= 'feature-list:' otherlv_1= '{' ( (lv_feature_2_0= ruleFeature ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFeaturesAccess().getFeatureListKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFeaturesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalScl.g:644:3: ( (lv_feature_2_0= ruleFeature ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalScl.g:645:4: (lv_feature_2_0= ruleFeature )
            	    {
            	    // InternalScl.g:645:4: (lv_feature_2_0= ruleFeature )
            	    // InternalScl.g:646:5: lv_feature_2_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getFeaturesAccess().getFeatureFeatureParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_feature_2_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeaturesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_2_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFeaturesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleFeatures"


    // $ANTLR start "entryRuleFeature"
    // InternalScl.g:671:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalScl.g:671:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalScl.g:672:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalScl.g:678:1: ruleFeature returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalScl.g:684:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalScl.g:685:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalScl.g:685:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalScl.g:686:3: (lv_name_0_0= RULE_ID )
            {
            // InternalScl.g:686:3: (lv_name_0_0= RULE_ID )
            // InternalScl.g:687:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFeatureRule());
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleActions"
    // InternalScl.g:706:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalScl.g:706:48: (iv_ruleActions= ruleActions EOF )
            // InternalScl.g:707:2: iv_ruleActions= ruleActions EOF
            {
             newCompositeNode(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActions=ruleActions();

            state._fsp--;

             current =iv_ruleActions; 
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
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalScl.g:713:1: ruleActions returns [EObject current=null] : (otherlv_0= 'action-list:' otherlv_1= '{' ( (lv_act_2_0= ruleAction ) )+ otherlv_3= '}' ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_act_2_0 = null;



        	enterRule();

        try {
            // InternalScl.g:719:2: ( (otherlv_0= 'action-list:' otherlv_1= '{' ( (lv_act_2_0= ruleAction ) )+ otherlv_3= '}' ) )
            // InternalScl.g:720:2: (otherlv_0= 'action-list:' otherlv_1= '{' ( (lv_act_2_0= ruleAction ) )+ otherlv_3= '}' )
            {
            // InternalScl.g:720:2: (otherlv_0= 'action-list:' otherlv_1= '{' ( (lv_act_2_0= ruleAction ) )+ otherlv_3= '}' )
            // InternalScl.g:721:3: otherlv_0= 'action-list:' otherlv_1= '{' ( (lv_act_2_0= ruleAction ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getActionsAccess().getActionListKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getActionsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalScl.g:729:3: ( (lv_act_2_0= ruleAction ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=104 && LA20_0<=107)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalScl.g:730:4: (lv_act_2_0= ruleAction )
            	    {
            	    // InternalScl.g:730:4: (lv_act_2_0= ruleAction )
            	    // InternalScl.g:731:5: lv_act_2_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getActionsAccess().getActActionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_act_2_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"act",
            	    						lv_act_2_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getActionsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleActionParam"
    // InternalScl.g:756:1: entryRuleActionParam returns [EObject current=null] : iv_ruleActionParam= ruleActionParam EOF ;
    public final EObject entryRuleActionParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionParam = null;


        try {
            // InternalScl.g:756:52: (iv_ruleActionParam= ruleActionParam EOF )
            // InternalScl.g:757:2: iv_ruleActionParam= ruleActionParam EOF
            {
             newCompositeNode(grammarAccess.getActionParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionParam=ruleActionParam();

            state._fsp--;

             current =iv_ruleActionParam; 
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
    // $ANTLR end "entryRuleActionParam"


    // $ANTLR start "ruleActionParam"
    // InternalScl.g:763:1: ruleActionParam returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= '(' ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleActionParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalScl.g:769:2: ( (otherlv_0= 'with' otherlv_1= '(' ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* otherlv_5= ')' ) )
            // InternalScl.g:770:2: (otherlv_0= 'with' otherlv_1= '(' ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            {
            // InternalScl.g:770:2: (otherlv_0= 'with' otherlv_1= '(' ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* otherlv_5= ')' )
            // InternalScl.g:771:3: otherlv_0= 'with' otherlv_1= '(' ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getActionParamAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getActionParamAccess().getLeftParenthesisKeyword_1());
            		
            // InternalScl.g:779:3: ( (lv_parameters_2_0= ruleExpression ) )
            // InternalScl.g:780:4: (lv_parameters_2_0= ruleExpression )
            {
            // InternalScl.g:780:4: (lv_parameters_2_0= ruleExpression )
            // InternalScl.g:781:5: lv_parameters_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getActionParamAccess().getParametersExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_parameters_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionParamRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_2_0,
            						"nl.esi.comma.expressions.Expressions.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScl.g:798:3: (otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalScl.g:799:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,31,FOLLOW_24); 

            	    				newLeafNode(otherlv_3, grammarAccess.getActionParamAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalScl.g:803:4: ( (lv_parameters_4_0= ruleExpression ) )
            	    // InternalScl.g:804:5: (lv_parameters_4_0= ruleExpression )
            	    {
            	    // InternalScl.g:804:5: (lv_parameters_4_0= ruleExpression )
            	    // InternalScl.g:805:6: lv_parameters_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getActionParamAccess().getParametersExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_parameters_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActionParamRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_4_0,
            	    							"nl.esi.comma.expressions.Expressions.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActionParamAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleActionParam"


    // $ANTLR start "entryRuleAction"
    // InternalScl.g:831:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalScl.g:831:47: (iv_ruleAction= ruleAction EOF )
            // InternalScl.g:832:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalScl.g:838:1: ruleAction returns [EObject current=null] : ( ( (lv_act_0_0= ruleActionType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_actParam_3_0= ruleActionParam ) )* ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_label_2_0=null;
        Enumerator lv_act_0_0 = null;

        EObject lv_actParam_3_0 = null;



        	enterRule();

        try {
            // InternalScl.g:844:2: ( ( ( (lv_act_0_0= ruleActionType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_actParam_3_0= ruleActionParam ) )* ) )
            // InternalScl.g:845:2: ( ( (lv_act_0_0= ruleActionType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_actParam_3_0= ruleActionParam ) )* )
            {
            // InternalScl.g:845:2: ( ( (lv_act_0_0= ruleActionType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_actParam_3_0= ruleActionParam ) )* )
            // InternalScl.g:846:3: ( (lv_act_0_0= ruleActionType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) ( (lv_actParam_3_0= ruleActionParam ) )*
            {
            // InternalScl.g:846:3: ( (lv_act_0_0= ruleActionType ) )
            // InternalScl.g:847:4: (lv_act_0_0= ruleActionType )
            {
            // InternalScl.g:847:4: (lv_act_0_0= ruleActionType )
            // InternalScl.g:848:5: lv_act_0_0= ruleActionType
            {

            					newCompositeNode(grammarAccess.getActionAccess().getActActionTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_act_0_0=ruleActionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"act",
            						lv_act_0_0,
            						"nl.esi.comma.behavior.scl.Scl.ActionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScl.g:865:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalScl.g:866:4: (lv_name_1_0= RULE_ID )
            {
            // InternalScl.g:866:4: (lv_name_1_0= RULE_ID )
            // InternalScl.g:867:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalScl.g:883:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalScl.g:884:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalScl.g:884:4: (lv_label_2_0= RULE_STRING )
            // InternalScl.g:885:5: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_label_2_0, grammarAccess.getActionAccess().getLabelSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalScl.g:901:3: ( (lv_actParam_3_0= ruleActionParam ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalScl.g:902:4: (lv_actParam_3_0= ruleActionParam )
            	    {
            	    // InternalScl.g:902:4: (lv_actParam_3_0= ruleActionParam )
            	    // InternalScl.g:903:5: lv_actParam_3_0= ruleActionParam
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getActParamActionParamParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_actParam_3_0=ruleActionParam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actParam",
            	    						lv_actParam_3_0,
            	    						"nl.esi.comma.behavior.scl.Scl.ActionParam");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTemplates"
    // InternalScl.g:924:1: entryRuleTemplates returns [EObject current=null] : iv_ruleTemplates= ruleTemplates EOF ;
    public final EObject entryRuleTemplates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplates = null;


        try {
            // InternalScl.g:924:50: (iv_ruleTemplates= ruleTemplates EOF )
            // InternalScl.g:925:2: iv_ruleTemplates= ruleTemplates EOF
            {
             newCompositeNode(grammarAccess.getTemplatesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplates=ruleTemplates();

            state._fsp--;

             current =iv_ruleTemplates; 
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
    // $ANTLR end "entryRuleTemplates"


    // $ANTLR start "ruleTemplates"
    // InternalScl.g:931:1: ruleTemplates returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleDependencies | lv_type_1_2= rulePast | lv_type_1_3= ruleFuture | lv_type_1_4= ruleChoice | lv_type_1_5= ruleExistential ) ) )+ (otherlv_2= 'for-configurations' ( (otherlv_3= RULE_ID ) )+ )? ) ;
    public final EObject ruleTemplates() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;

        EObject lv_type_1_3 = null;

        EObject lv_type_1_4 = null;

        EObject lv_type_1_5 = null;



        	enterRule();

        try {
            // InternalScl.g:937:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleDependencies | lv_type_1_2= rulePast | lv_type_1_3= ruleFuture | lv_type_1_4= ruleChoice | lv_type_1_5= ruleExistential ) ) )+ (otherlv_2= 'for-configurations' ( (otherlv_3= RULE_ID ) )+ )? ) )
            // InternalScl.g:938:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleDependencies | lv_type_1_2= rulePast | lv_type_1_3= ruleFuture | lv_type_1_4= ruleChoice | lv_type_1_5= ruleExistential ) ) )+ (otherlv_2= 'for-configurations' ( (otherlv_3= RULE_ID ) )+ )? )
            {
            // InternalScl.g:938:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleDependencies | lv_type_1_2= rulePast | lv_type_1_3= ruleFuture | lv_type_1_4= ruleChoice | lv_type_1_5= ruleExistential ) ) )+ (otherlv_2= 'for-configurations' ( (otherlv_3= RULE_ID ) )+ )? )
            // InternalScl.g:939:3: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleDependencies | lv_type_1_2= rulePast | lv_type_1_3= ruleFuture | lv_type_1_4= ruleChoice | lv_type_1_5= ruleExistential ) ) )+ (otherlv_2= 'for-configurations' ( (otherlv_3= RULE_ID ) )+ )?
            {
            // InternalScl.g:939:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalScl.g:940:4: (lv_name_0_0= RULE_ID )
            {
            // InternalScl.g:940:4: (lv_name_0_0= RULE_ID )
            // InternalScl.g:941:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTemplatesAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplatesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalScl.g:957:3: ( ( (lv_type_1_1= ruleDependencies | lv_type_1_2= rulePast | lv_type_1_3= ruleFuture | lv_type_1_4= ruleChoice | lv_type_1_5= ruleExistential ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=33 && LA24_0<=37)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalScl.g:958:4: ( (lv_type_1_1= ruleDependencies | lv_type_1_2= rulePast | lv_type_1_3= ruleFuture | lv_type_1_4= ruleChoice | lv_type_1_5= ruleExistential ) )
            	    {
            	    // InternalScl.g:958:4: ( (lv_type_1_1= ruleDependencies | lv_type_1_2= rulePast | lv_type_1_3= ruleFuture | lv_type_1_4= ruleChoice | lv_type_1_5= ruleExistential ) )
            	    // InternalScl.g:959:5: (lv_type_1_1= ruleDependencies | lv_type_1_2= rulePast | lv_type_1_3= ruleFuture | lv_type_1_4= ruleChoice | lv_type_1_5= ruleExistential )
            	    {
            	    // InternalScl.g:959:5: (lv_type_1_1= ruleDependencies | lv_type_1_2= rulePast | lv_type_1_3= ruleFuture | lv_type_1_4= ruleChoice | lv_type_1_5= ruleExistential )
            	    int alt23=5;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt23=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // InternalScl.g:960:6: lv_type_1_1= ruleDependencies
            	            {

            	            						newCompositeNode(grammarAccess.getTemplatesAccess().getTypeDependenciesParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_28);
            	            lv_type_1_1=ruleDependencies();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTemplatesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_1,
            	            							"nl.esi.comma.behavior.scl.Scl.Dependencies");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalScl.g:976:6: lv_type_1_2= rulePast
            	            {

            	            						newCompositeNode(grammarAccess.getTemplatesAccess().getTypePastParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_28);
            	            lv_type_1_2=rulePast();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTemplatesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_2,
            	            							"nl.esi.comma.behavior.scl.Scl.Past");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalScl.g:992:6: lv_type_1_3= ruleFuture
            	            {

            	            						newCompositeNode(grammarAccess.getTemplatesAccess().getTypeFutureParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_28);
            	            lv_type_1_3=ruleFuture();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTemplatesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_3,
            	            							"nl.esi.comma.behavior.scl.Scl.Future");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalScl.g:1008:6: lv_type_1_4= ruleChoice
            	            {

            	            						newCompositeNode(grammarAccess.getTemplatesAccess().getTypeChoiceParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_28);
            	            lv_type_1_4=ruleChoice();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTemplatesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_4,
            	            							"nl.esi.comma.behavior.scl.Scl.Choice");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalScl.g:1024:6: lv_type_1_5= ruleExistential
            	            {

            	            						newCompositeNode(grammarAccess.getTemplatesAccess().getTypeExistentialParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_28);
            	            lv_type_1_5=ruleExistential();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTemplatesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_5,
            	            							"nl.esi.comma.behavior.scl.Scl.Existential");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // InternalScl.g:1042:3: (otherlv_2= 'for-configurations' ( (otherlv_3= RULE_ID ) )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalScl.g:1043:4: otherlv_2= 'for-configurations' ( (otherlv_3= RULE_ID ) )+
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getTemplatesAccess().getForConfigurationsKeyword_2_0());
                    			
                    // InternalScl.g:1047:4: ( (otherlv_3= RULE_ID ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            int LA25_2 = input.LA(2);

                            if ( (LA25_2==EOF||LA25_2==RULE_ID||LA25_2==14) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalScl.g:1048:5: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalScl.g:1048:5: (otherlv_3= RULE_ID )
                    	    // InternalScl.g:1049:6: otherlv_3= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTemplatesRule());
                    	    						}
                    	    					
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getTemplatesAccess().getFeaturesFeatureCrossReference_2_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


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
    // $ANTLR end "ruleTemplates"


    // $ANTLR start "entryRulePast"
    // InternalScl.g:1065:1: entryRulePast returns [EObject current=null] : iv_rulePast= rulePast EOF ;
    public final EObject entryRulePast() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePast = null;


        try {
            // InternalScl.g:1065:45: (iv_rulePast= rulePast EOF )
            // InternalScl.g:1066:2: iv_rulePast= rulePast EOF
            {
             newCompositeNode(grammarAccess.getPastRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePast=rulePast();

            state._fsp--;

             current =iv_rulePast; 
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
    // $ANTLR end "entryRulePast"


    // $ANTLR start "rulePast"
    // InternalScl.g:1072:1: rulePast returns [EObject current=null] : (otherlv_0= 'P' ( ( (lv_type_1_1= rulePrecedence | lv_type_1_2= ruleAlternatePrecedence | lv_type_1_3= ruleChainPrecedence ) ) )+ ) ;
    public final EObject rulePast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;

        EObject lv_type_1_3 = null;



        	enterRule();

        try {
            // InternalScl.g:1078:2: ( (otherlv_0= 'P' ( ( (lv_type_1_1= rulePrecedence | lv_type_1_2= ruleAlternatePrecedence | lv_type_1_3= ruleChainPrecedence ) ) )+ ) )
            // InternalScl.g:1079:2: (otherlv_0= 'P' ( ( (lv_type_1_1= rulePrecedence | lv_type_1_2= ruleAlternatePrecedence | lv_type_1_3= ruleChainPrecedence ) ) )+ )
            {
            // InternalScl.g:1079:2: (otherlv_0= 'P' ( ( (lv_type_1_1= rulePrecedence | lv_type_1_2= ruleAlternatePrecedence | lv_type_1_3= ruleChainPrecedence ) ) )+ )
            // InternalScl.g:1080:3: otherlv_0= 'P' ( ( (lv_type_1_1= rulePrecedence | lv_type_1_2= ruleAlternatePrecedence | lv_type_1_3= ruleChainPrecedence ) ) )+
            {
            otherlv_0=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getPastAccess().getPKeyword_0());
            		
            // InternalScl.g:1084:3: ( ( (lv_type_1_1= rulePrecedence | lv_type_1_2= ruleAlternatePrecedence | lv_type_1_3= ruleChainPrecedence ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==64||LA28_0==73||LA28_0==77) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalScl.g:1085:4: ( (lv_type_1_1= rulePrecedence | lv_type_1_2= ruleAlternatePrecedence | lv_type_1_3= ruleChainPrecedence ) )
            	    {
            	    // InternalScl.g:1085:4: ( (lv_type_1_1= rulePrecedence | lv_type_1_2= ruleAlternatePrecedence | lv_type_1_3= ruleChainPrecedence ) )
            	    // InternalScl.g:1086:5: (lv_type_1_1= rulePrecedence | lv_type_1_2= ruleAlternatePrecedence | lv_type_1_3= ruleChainPrecedence )
            	    {
            	    // InternalScl.g:1086:5: (lv_type_1_1= rulePrecedence | lv_type_1_2= ruleAlternatePrecedence | lv_type_1_3= ruleChainPrecedence )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 77:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 73:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // InternalScl.g:1087:6: lv_type_1_1= rulePrecedence
            	            {

            	            						newCompositeNode(grammarAccess.getPastAccess().getTypePrecedenceParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_31);
            	            lv_type_1_1=rulePrecedence();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPastRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_1,
            	            							"nl.esi.comma.behavior.scl.Scl.Precedence");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalScl.g:1103:6: lv_type_1_2= ruleAlternatePrecedence
            	            {

            	            						newCompositeNode(grammarAccess.getPastAccess().getTypeAlternatePrecedenceParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_31);
            	            lv_type_1_2=ruleAlternatePrecedence();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPastRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_2,
            	            							"nl.esi.comma.behavior.scl.Scl.AlternatePrecedence");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalScl.g:1119:6: lv_type_1_3= ruleChainPrecedence
            	            {

            	            						newCompositeNode(grammarAccess.getPastAccess().getTypeChainPrecedenceParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_31);
            	            lv_type_1_3=ruleChainPrecedence();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPastRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_3,
            	            							"nl.esi.comma.behavior.scl.Scl.ChainPrecedence");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // $ANTLR end "rulePast"


    // $ANTLR start "entryRuleFuture"
    // InternalScl.g:1141:1: entryRuleFuture returns [EObject current=null] : iv_ruleFuture= ruleFuture EOF ;
    public final EObject entryRuleFuture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuture = null;


        try {
            // InternalScl.g:1141:47: (iv_ruleFuture= ruleFuture EOF )
            // InternalScl.g:1142:2: iv_ruleFuture= ruleFuture EOF
            {
             newCompositeNode(grammarAccess.getFutureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuture=ruleFuture();

            state._fsp--;

             current =iv_ruleFuture; 
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
    // $ANTLR end "entryRuleFuture"


    // $ANTLR start "ruleFuture"
    // InternalScl.g:1148:1: ruleFuture returns [EObject current=null] : (otherlv_0= 'F' ( ( (lv_type_1_1= ruleResponse | lv_type_1_2= ruleAlternateResponse | lv_type_1_3= ruleChainResponse ) ) )+ ) ;
    public final EObject ruleFuture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;

        EObject lv_type_1_3 = null;



        	enterRule();

        try {
            // InternalScl.g:1154:2: ( (otherlv_0= 'F' ( ( (lv_type_1_1= ruleResponse | lv_type_1_2= ruleAlternateResponse | lv_type_1_3= ruleChainResponse ) ) )+ ) )
            // InternalScl.g:1155:2: (otherlv_0= 'F' ( ( (lv_type_1_1= ruleResponse | lv_type_1_2= ruleAlternateResponse | lv_type_1_3= ruleChainResponse ) ) )+ )
            {
            // InternalScl.g:1155:2: (otherlv_0= 'F' ( ( (lv_type_1_1= ruleResponse | lv_type_1_2= ruleAlternateResponse | lv_type_1_3= ruleChainResponse ) ) )+ )
            // InternalScl.g:1156:3: otherlv_0= 'F' ( ( (lv_type_1_1= ruleResponse | lv_type_1_2= ruleAlternateResponse | lv_type_1_3= ruleChainResponse ) ) )+
            {
            otherlv_0=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getFutureAccess().getFKeyword_0());
            		
            // InternalScl.g:1160:3: ( ( (lv_type_1_1= ruleResponse | lv_type_1_2= ruleAlternateResponse | lv_type_1_3= ruleChainResponse ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==69||LA30_0==71||LA30_0==75) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalScl.g:1161:4: ( (lv_type_1_1= ruleResponse | lv_type_1_2= ruleAlternateResponse | lv_type_1_3= ruleChainResponse ) )
            	    {
            	    // InternalScl.g:1161:4: ( (lv_type_1_1= ruleResponse | lv_type_1_2= ruleAlternateResponse | lv_type_1_3= ruleChainResponse ) )
            	    // InternalScl.g:1162:5: (lv_type_1_1= ruleResponse | lv_type_1_2= ruleAlternateResponse | lv_type_1_3= ruleChainResponse )
            	    {
            	    // InternalScl.g:1162:5: (lv_type_1_1= ruleResponse | lv_type_1_2= ruleAlternateResponse | lv_type_1_3= ruleChainResponse )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 75:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // InternalScl.g:1163:6: lv_type_1_1= ruleResponse
            	            {

            	            						newCompositeNode(grammarAccess.getFutureAccess().getTypeResponseParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_33);
            	            lv_type_1_1=ruleResponse();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFutureRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_1,
            	            							"nl.esi.comma.behavior.scl.Scl.Response");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalScl.g:1179:6: lv_type_1_2= ruleAlternateResponse
            	            {

            	            						newCompositeNode(grammarAccess.getFutureAccess().getTypeAlternateResponseParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_33);
            	            lv_type_1_2=ruleAlternateResponse();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFutureRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_2,
            	            							"nl.esi.comma.behavior.scl.Scl.AlternateResponse");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalScl.g:1195:6: lv_type_1_3= ruleChainResponse
            	            {

            	            						newCompositeNode(grammarAccess.getFutureAccess().getTypeChainResponseParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_33);
            	            lv_type_1_3=ruleChainResponse();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFutureRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_3,
            	            							"nl.esi.comma.behavior.scl.Scl.ChainResponse");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
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
    // $ANTLR end "ruleFuture"


    // $ANTLR start "entryRuleDependencies"
    // InternalScl.g:1217:1: entryRuleDependencies returns [EObject current=null] : iv_ruleDependencies= ruleDependencies EOF ;
    public final EObject entryRuleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencies = null;


        try {
            // InternalScl.g:1217:53: (iv_ruleDependencies= ruleDependencies EOF )
            // InternalScl.g:1218:2: iv_ruleDependencies= ruleDependencies EOF
            {
             newCompositeNode(grammarAccess.getDependenciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencies=ruleDependencies();

            state._fsp--;

             current =iv_ruleDependencies; 
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
    // $ANTLR end "entryRuleDependencies"


    // $ANTLR start "ruleDependencies"
    // InternalScl.g:1224:1: ruleDependencies returns [EObject current=null] : (otherlv_0= 'PF' ( ( (lv_type_1_1= ruleSuccession | lv_type_1_2= ruleCoExistance | lv_type_1_3= ruleAlternateSuccession | lv_type_1_4= ruleChainSuccession | lv_type_1_5= ruleRespondedExistence | lv_type_1_6= ruleNotSuccession | lv_type_1_7= ruleNotCoExistance | lv_type_1_8= ruleNotChainSuccession ) ) )+ ) ;
    public final EObject ruleDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;

        EObject lv_type_1_3 = null;

        EObject lv_type_1_4 = null;

        EObject lv_type_1_5 = null;

        EObject lv_type_1_6 = null;

        EObject lv_type_1_7 = null;

        EObject lv_type_1_8 = null;



        	enterRule();

        try {
            // InternalScl.g:1230:2: ( (otherlv_0= 'PF' ( ( (lv_type_1_1= ruleSuccession | lv_type_1_2= ruleCoExistance | lv_type_1_3= ruleAlternateSuccession | lv_type_1_4= ruleChainSuccession | lv_type_1_5= ruleRespondedExistence | lv_type_1_6= ruleNotSuccession | lv_type_1_7= ruleNotCoExistance | lv_type_1_8= ruleNotChainSuccession ) ) )+ ) )
            // InternalScl.g:1231:2: (otherlv_0= 'PF' ( ( (lv_type_1_1= ruleSuccession | lv_type_1_2= ruleCoExistance | lv_type_1_3= ruleAlternateSuccession | lv_type_1_4= ruleChainSuccession | lv_type_1_5= ruleRespondedExistence | lv_type_1_6= ruleNotSuccession | lv_type_1_7= ruleNotCoExistance | lv_type_1_8= ruleNotChainSuccession ) ) )+ )
            {
            // InternalScl.g:1231:2: (otherlv_0= 'PF' ( ( (lv_type_1_1= ruleSuccession | lv_type_1_2= ruleCoExistance | lv_type_1_3= ruleAlternateSuccession | lv_type_1_4= ruleChainSuccession | lv_type_1_5= ruleRespondedExistence | lv_type_1_6= ruleNotSuccession | lv_type_1_7= ruleNotCoExistance | lv_type_1_8= ruleNotChainSuccession ) ) )+ )
            // InternalScl.g:1232:3: otherlv_0= 'PF' ( ( (lv_type_1_1= ruleSuccession | lv_type_1_2= ruleCoExistance | lv_type_1_3= ruleAlternateSuccession | lv_type_1_4= ruleChainSuccession | lv_type_1_5= ruleRespondedExistence | lv_type_1_6= ruleNotSuccession | lv_type_1_7= ruleNotCoExistance | lv_type_1_8= ruleNotChainSuccession ) ) )+
            {
            otherlv_0=(Token)match(input,35,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getDependenciesAccess().getPFKeyword_0());
            		
            // InternalScl.g:1236:3: ( ( (lv_type_1_1= ruleSuccession | lv_type_1_2= ruleCoExistance | lv_type_1_3= ruleAlternateSuccession | lv_type_1_4= ruleChainSuccession | lv_type_1_5= ruleRespondedExistence | lv_type_1_6= ruleNotSuccession | lv_type_1_7= ruleNotCoExistance | lv_type_1_8= ruleNotChainSuccession ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==42||LA32_0==45||LA32_0==47||LA32_0==49||LA32_0==52||LA32_0==54||LA32_0==58||LA32_0==60) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalScl.g:1237:4: ( (lv_type_1_1= ruleSuccession | lv_type_1_2= ruleCoExistance | lv_type_1_3= ruleAlternateSuccession | lv_type_1_4= ruleChainSuccession | lv_type_1_5= ruleRespondedExistence | lv_type_1_6= ruleNotSuccession | lv_type_1_7= ruleNotCoExistance | lv_type_1_8= ruleNotChainSuccession ) )
            	    {
            	    // InternalScl.g:1237:4: ( (lv_type_1_1= ruleSuccession | lv_type_1_2= ruleCoExistance | lv_type_1_3= ruleAlternateSuccession | lv_type_1_4= ruleChainSuccession | lv_type_1_5= ruleRespondedExistence | lv_type_1_6= ruleNotSuccession | lv_type_1_7= ruleNotCoExistance | lv_type_1_8= ruleNotChainSuccession ) )
            	    // InternalScl.g:1238:5: (lv_type_1_1= ruleSuccession | lv_type_1_2= ruleCoExistance | lv_type_1_3= ruleAlternateSuccession | lv_type_1_4= ruleChainSuccession | lv_type_1_5= ruleRespondedExistence | lv_type_1_6= ruleNotSuccession | lv_type_1_7= ruleNotCoExistance | lv_type_1_8= ruleNotChainSuccession )
            	    {
            	    // InternalScl.g:1238:5: (lv_type_1_1= ruleSuccession | lv_type_1_2= ruleCoExistance | lv_type_1_3= ruleAlternateSuccession | lv_type_1_4= ruleChainSuccession | lv_type_1_5= ruleRespondedExistence | lv_type_1_6= ruleNotSuccession | lv_type_1_7= ruleNotCoExistance | lv_type_1_8= ruleNotChainSuccession )
            	    int alt31=8;
            	    switch ( input.LA(1) ) {
            	    case 58:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt31=4;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt31=5;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt31=6;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt31=7;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt31=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // InternalScl.g:1239:6: lv_type_1_1= ruleSuccession
            	            {

            	            						newCompositeNode(grammarAccess.getDependenciesAccess().getTypeSuccessionParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_35);
            	            lv_type_1_1=ruleSuccession();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_1,
            	            							"nl.esi.comma.behavior.scl.Scl.Succession");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalScl.g:1255:6: lv_type_1_2= ruleCoExistance
            	            {

            	            						newCompositeNode(grammarAccess.getDependenciesAccess().getTypeCoExistanceParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_35);
            	            lv_type_1_2=ruleCoExistance();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_2,
            	            							"nl.esi.comma.behavior.scl.Scl.CoExistance");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalScl.g:1271:6: lv_type_1_3= ruleAlternateSuccession
            	            {

            	            						newCompositeNode(grammarAccess.getDependenciesAccess().getTypeAlternateSuccessionParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_35);
            	            lv_type_1_3=ruleAlternateSuccession();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_3,
            	            							"nl.esi.comma.behavior.scl.Scl.AlternateSuccession");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalScl.g:1287:6: lv_type_1_4= ruleChainSuccession
            	            {

            	            						newCompositeNode(grammarAccess.getDependenciesAccess().getTypeChainSuccessionParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_35);
            	            lv_type_1_4=ruleChainSuccession();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_4,
            	            							"nl.esi.comma.behavior.scl.Scl.ChainSuccession");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalScl.g:1303:6: lv_type_1_5= ruleRespondedExistence
            	            {

            	            						newCompositeNode(grammarAccess.getDependenciesAccess().getTypeRespondedExistenceParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_35);
            	            lv_type_1_5=ruleRespondedExistence();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_5,
            	            							"nl.esi.comma.behavior.scl.Scl.RespondedExistence");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 6 :
            	            // InternalScl.g:1319:6: lv_type_1_6= ruleNotSuccession
            	            {

            	            						newCompositeNode(grammarAccess.getDependenciesAccess().getTypeNotSuccessionParserRuleCall_1_0_5());
            	            					
            	            pushFollow(FOLLOW_35);
            	            lv_type_1_6=ruleNotSuccession();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_6,
            	            							"nl.esi.comma.behavior.scl.Scl.NotSuccession");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 7 :
            	            // InternalScl.g:1335:6: lv_type_1_7= ruleNotCoExistance
            	            {

            	            						newCompositeNode(grammarAccess.getDependenciesAccess().getTypeNotCoExistanceParserRuleCall_1_0_6());
            	            					
            	            pushFollow(FOLLOW_35);
            	            lv_type_1_7=ruleNotCoExistance();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_7,
            	            							"nl.esi.comma.behavior.scl.Scl.NotCoExistance");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 8 :
            	            // InternalScl.g:1351:6: lv_type_1_8= ruleNotChainSuccession
            	            {

            	            						newCompositeNode(grammarAccess.getDependenciesAccess().getTypeNotChainSuccessionParserRuleCall_1_0_7());
            	            					
            	            pushFollow(FOLLOW_35);
            	            lv_type_1_8=ruleNotChainSuccession();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_8,
            	            							"nl.esi.comma.behavior.scl.Scl.NotChainSuccession");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
    // $ANTLR end "ruleDependencies"


    // $ANTLR start "entryRuleChoice"
    // InternalScl.g:1373:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalScl.g:1373:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalScl.g:1374:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
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
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // InternalScl.g:1380:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'C' ( ( (lv_type_1_1= ruleSimpleChoice | lv_type_1_2= ruleExclusiveChoice ) ) )+ ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;



        	enterRule();

        try {
            // InternalScl.g:1386:2: ( (otherlv_0= 'C' ( ( (lv_type_1_1= ruleSimpleChoice | lv_type_1_2= ruleExclusiveChoice ) ) )+ ) )
            // InternalScl.g:1387:2: (otherlv_0= 'C' ( ( (lv_type_1_1= ruleSimpleChoice | lv_type_1_2= ruleExclusiveChoice ) ) )+ )
            {
            // InternalScl.g:1387:2: (otherlv_0= 'C' ( ( (lv_type_1_1= ruleSimpleChoice | lv_type_1_2= ruleExclusiveChoice ) ) )+ )
            // InternalScl.g:1388:3: otherlv_0= 'C' ( ( (lv_type_1_1= ruleSimpleChoice | lv_type_1_2= ruleExclusiveChoice ) ) )+
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getCKeyword_0());
            		
            // InternalScl.g:1392:3: ( ( (lv_type_1_1= ruleSimpleChoice | lv_type_1_2= ruleExclusiveChoice ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=25 && LA34_0<=26)||LA34_0==38) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalScl.g:1393:4: ( (lv_type_1_1= ruleSimpleChoice | lv_type_1_2= ruleExclusiveChoice ) )
            	    {
            	    // InternalScl.g:1393:4: ( (lv_type_1_1= ruleSimpleChoice | lv_type_1_2= ruleExclusiveChoice ) )
            	    // InternalScl.g:1394:5: (lv_type_1_1= ruleSimpleChoice | lv_type_1_2= ruleExclusiveChoice )
            	    {
            	    // InternalScl.g:1394:5: (lv_type_1_1= ruleSimpleChoice | lv_type_1_2= ruleExclusiveChoice )
            	    int alt33=2;
            	    alt33 = dfa33.predict(input);
            	    switch (alt33) {
            	        case 1 :
            	            // InternalScl.g:1395:6: lv_type_1_1= ruleSimpleChoice
            	            {

            	            						newCompositeNode(grammarAccess.getChoiceAccess().getTypeSimpleChoiceParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_37);
            	            lv_type_1_1=ruleSimpleChoice();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getChoiceRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_1,
            	            							"nl.esi.comma.behavior.scl.Scl.SimpleChoice");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalScl.g:1411:6: lv_type_1_2= ruleExclusiveChoice
            	            {

            	            						newCompositeNode(grammarAccess.getChoiceAccess().getTypeExclusiveChoiceParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_37);
            	            lv_type_1_2=ruleExclusiveChoice();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getChoiceRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_2,
            	            							"nl.esi.comma.behavior.scl.Scl.ExclusiveChoice");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleExistential"
    // InternalScl.g:1433:1: entryRuleExistential returns [EObject current=null] : iv_ruleExistential= ruleExistential EOF ;
    public final EObject entryRuleExistential() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistential = null;


        try {
            // InternalScl.g:1433:52: (iv_ruleExistential= ruleExistential EOF )
            // InternalScl.g:1434:2: iv_ruleExistential= ruleExistential EOF
            {
             newCompositeNode(grammarAccess.getExistentialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistential=ruleExistential();

            state._fsp--;

             current =iv_ruleExistential; 
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
    // $ANTLR end "entryRuleExistential"


    // $ANTLR start "ruleExistential"
    // InternalScl.g:1440:1: ruleExistential returns [EObject current=null] : (otherlv_0= 'E' ( ( (lv_type_1_1= ruleAtLeast | lv_type_1_2= ruleAtMost | lv_type_1_3= ruleInit | lv_type_1_4= ruleEnd | lv_type_1_5= ruleExact ) ) )+ ) ;
    public final EObject ruleExistential() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;

        EObject lv_type_1_3 = null;

        EObject lv_type_1_4 = null;

        EObject lv_type_1_5 = null;



        	enterRule();

        try {
            // InternalScl.g:1446:2: ( (otherlv_0= 'E' ( ( (lv_type_1_1= ruleAtLeast | lv_type_1_2= ruleAtMost | lv_type_1_3= ruleInit | lv_type_1_4= ruleEnd | lv_type_1_5= ruleExact ) ) )+ ) )
            // InternalScl.g:1447:2: (otherlv_0= 'E' ( ( (lv_type_1_1= ruleAtLeast | lv_type_1_2= ruleAtMost | lv_type_1_3= ruleInit | lv_type_1_4= ruleEnd | lv_type_1_5= ruleExact ) ) )+ )
            {
            // InternalScl.g:1447:2: (otherlv_0= 'E' ( ( (lv_type_1_1= ruleAtLeast | lv_type_1_2= ruleAtMost | lv_type_1_3= ruleInit | lv_type_1_4= ruleEnd | lv_type_1_5= ruleExact ) ) )+ )
            // InternalScl.g:1448:3: otherlv_0= 'E' ( ( (lv_type_1_1= ruleAtLeast | lv_type_1_2= ruleAtMost | lv_type_1_3= ruleInit | lv_type_1_4= ruleEnd | lv_type_1_5= ruleExact ) ) )+
            {
            otherlv_0=(Token)match(input,37,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getExistentialAccess().getEKeyword_0());
            		
            // InternalScl.g:1452:3: ( ( (lv_type_1_1= ruleAtLeast | lv_type_1_2= ruleAtMost | lv_type_1_3= ruleInit | lv_type_1_4= ruleEnd | lv_type_1_5= ruleExact ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=25 && LA36_0<=26)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalScl.g:1453:4: ( (lv_type_1_1= ruleAtLeast | lv_type_1_2= ruleAtMost | lv_type_1_3= ruleInit | lv_type_1_4= ruleEnd | lv_type_1_5= ruleExact ) )
            	    {
            	    // InternalScl.g:1453:4: ( (lv_type_1_1= ruleAtLeast | lv_type_1_2= ruleAtMost | lv_type_1_3= ruleInit | lv_type_1_4= ruleEnd | lv_type_1_5= ruleExact ) )
            	    // InternalScl.g:1454:5: (lv_type_1_1= ruleAtLeast | lv_type_1_2= ruleAtMost | lv_type_1_3= ruleInit | lv_type_1_4= ruleEnd | lv_type_1_5= ruleExact )
            	    {
            	    // InternalScl.g:1454:5: (lv_type_1_1= ruleAtLeast | lv_type_1_2= ruleAtMost | lv_type_1_3= ruleInit | lv_type_1_4= ruleEnd | lv_type_1_5= ruleExact )
            	    int alt35=5;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // InternalScl.g:1455:6: lv_type_1_1= ruleAtLeast
            	            {

            	            						newCompositeNode(grammarAccess.getExistentialAccess().getTypeAtLeastParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_39);
            	            lv_type_1_1=ruleAtLeast();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getExistentialRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_1,
            	            							"nl.esi.comma.behavior.scl.Scl.AtLeast");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalScl.g:1471:6: lv_type_1_2= ruleAtMost
            	            {

            	            						newCompositeNode(grammarAccess.getExistentialAccess().getTypeAtMostParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_39);
            	            lv_type_1_2=ruleAtMost();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getExistentialRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_2,
            	            							"nl.esi.comma.behavior.scl.Scl.AtMost");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalScl.g:1487:6: lv_type_1_3= ruleInit
            	            {

            	            						newCompositeNode(grammarAccess.getExistentialAccess().getTypeInitParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_39);
            	            lv_type_1_3=ruleInit();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getExistentialRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_3,
            	            							"nl.esi.comma.behavior.scl.Scl.Init");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalScl.g:1503:6: lv_type_1_4= ruleEnd
            	            {

            	            						newCompositeNode(grammarAccess.getExistentialAccess().getTypeEndParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_39);
            	            lv_type_1_4=ruleEnd();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getExistentialRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_4,
            	            							"nl.esi.comma.behavior.scl.Scl.End");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalScl.g:1519:6: lv_type_1_5= ruleExact
            	            {

            	            						newCompositeNode(grammarAccess.getExistentialAccess().getTypeExactParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_39);
            	            lv_type_1_5=ruleExact();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getExistentialRule());
            	            						}
            	            						add(
            	            							current,
            	            							"type",
            	            							lv_type_1_5,
            	            							"nl.esi.comma.behavior.scl.Scl.Exact");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // $ANTLR end "ruleExistential"


    // $ANTLR start "entryRuleExclusiveChoice"
    // InternalScl.g:1541:1: entryRuleExclusiveChoice returns [EObject current=null] : iv_ruleExclusiveChoice= ruleExclusiveChoice EOF ;
    public final EObject entryRuleExclusiveChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusiveChoice = null;


        try {
            // InternalScl.g:1541:56: (iv_ruleExclusiveChoice= ruleExclusiveChoice EOF )
            // InternalScl.g:1542:2: iv_ruleExclusiveChoice= ruleExclusiveChoice EOF
            {
             newCompositeNode(grammarAccess.getExclusiveChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExclusiveChoice=ruleExclusiveChoice();

            state._fsp--;

             current =iv_ruleExclusiveChoice; 
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
    // $ANTLR end "entryRuleExclusiveChoice"


    // $ANTLR start "ruleExclusiveChoice"
    // InternalScl.g:1548:1: ruleExclusiveChoice returns [EObject current=null] : ( ( (lv_eitherA_0_0= 'either' ) )? ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'or' ( (lv_eitherB_3_0= 'either' ) )? ( (lv_refB_4_0= ruleRef ) )+ otherlv_5= 'eventually-occur-but-not-together' ) ;
    public final EObject ruleExclusiveChoice() throws RecognitionException {
        EObject current = null;

        Token lv_eitherA_0_0=null;
        Token otherlv_2=null;
        Token lv_eitherB_3_0=null;
        Token otherlv_5=null;
        EObject lv_refA_1_0 = null;

        EObject lv_refB_4_0 = null;



        	enterRule();

        try {
            // InternalScl.g:1554:2: ( ( ( (lv_eitherA_0_0= 'either' ) )? ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'or' ( (lv_eitherB_3_0= 'either' ) )? ( (lv_refB_4_0= ruleRef ) )+ otherlv_5= 'eventually-occur-but-not-together' ) )
            // InternalScl.g:1555:2: ( ( (lv_eitherA_0_0= 'either' ) )? ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'or' ( (lv_eitherB_3_0= 'either' ) )? ( (lv_refB_4_0= ruleRef ) )+ otherlv_5= 'eventually-occur-but-not-together' )
            {
            // InternalScl.g:1555:2: ( ( (lv_eitherA_0_0= 'either' ) )? ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'or' ( (lv_eitherB_3_0= 'either' ) )? ( (lv_refB_4_0= ruleRef ) )+ otherlv_5= 'eventually-occur-but-not-together' )
            // InternalScl.g:1556:3: ( (lv_eitherA_0_0= 'either' ) )? ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'or' ( (lv_eitherB_3_0= 'either' ) )? ( (lv_refB_4_0= ruleRef ) )+ otherlv_5= 'eventually-occur-but-not-together'
            {
            // InternalScl.g:1556:3: ( (lv_eitherA_0_0= 'either' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalScl.g:1557:4: (lv_eitherA_0_0= 'either' )
                    {
                    // InternalScl.g:1557:4: (lv_eitherA_0_0= 'either' )
                    // InternalScl.g:1558:5: lv_eitherA_0_0= 'either'
                    {
                    lv_eitherA_0_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_0_0, grammarAccess.getExclusiveChoiceAccess().getEitherAEitherKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExclusiveChoiceRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_0_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:1570:3: ( (lv_refA_1_0= ruleRef ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=25 && LA38_0<=26)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalScl.g:1571:4: (lv_refA_1_0= ruleRef )
            	    {
            	    // InternalScl.g:1571:4: (lv_refA_1_0= ruleRef )
            	    // InternalScl.g:1572:5: lv_refA_1_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getExclusiveChoiceAccess().getRefARefParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_40);
            	    lv_refA_1_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExclusiveChoiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_1_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_2=(Token)match(input,39,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getExclusiveChoiceAccess().getOrKeyword_2());
            		
            // InternalScl.g:1593:3: ( (lv_eitherB_3_0= 'either' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalScl.g:1594:4: (lv_eitherB_3_0= 'either' )
                    {
                    // InternalScl.g:1594:4: (lv_eitherB_3_0= 'either' )
                    // InternalScl.g:1595:5: lv_eitherB_3_0= 'either'
                    {
                    lv_eitherB_3_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_3_0, grammarAccess.getExclusiveChoiceAccess().getEitherBEitherKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExclusiveChoiceRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_3_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:1607:3: ( (lv_refB_4_0= ruleRef ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=25 && LA40_0<=26)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalScl.g:1608:4: (lv_refB_4_0= ruleRef )
            	    {
            	    // InternalScl.g:1608:4: (lv_refB_4_0= ruleRef )
            	    // InternalScl.g:1609:5: lv_refB_4_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getExclusiveChoiceAccess().getRefBRefParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_refB_4_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExclusiveChoiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refB",
            	    						lv_refB_4_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            otherlv_5=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExclusiveChoiceAccess().getEventuallyOccurButNotTogetherKeyword_5());
            		

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
    // $ANTLR end "ruleExclusiveChoice"


    // $ANTLR start "entryRuleSimpleChoice"
    // InternalScl.g:1634:1: entryRuleSimpleChoice returns [EObject current=null] : iv_ruleSimpleChoice= ruleSimpleChoice EOF ;
    public final EObject entryRuleSimpleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleChoice = null;


        try {
            // InternalScl.g:1634:53: (iv_ruleSimpleChoice= ruleSimpleChoice EOF )
            // InternalScl.g:1635:2: iv_ruleSimpleChoice= ruleSimpleChoice EOF
            {
             newCompositeNode(grammarAccess.getSimpleChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleChoice=ruleSimpleChoice();

            state._fsp--;

             current =iv_ruleSimpleChoice; 
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
    // $ANTLR end "entryRuleSimpleChoice"


    // $ANTLR start "ruleSimpleChoice"
    // InternalScl.g:1641:1: ruleSimpleChoice returns [EObject current=null] : ( ( (lv_refA_0_0= ruleRef ) )+ otherlv_1= 'eventually-occur' ) ;
    public final EObject ruleSimpleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_refA_0_0 = null;



        	enterRule();

        try {
            // InternalScl.g:1647:2: ( ( ( (lv_refA_0_0= ruleRef ) )+ otherlv_1= 'eventually-occur' ) )
            // InternalScl.g:1648:2: ( ( (lv_refA_0_0= ruleRef ) )+ otherlv_1= 'eventually-occur' )
            {
            // InternalScl.g:1648:2: ( ( (lv_refA_0_0= ruleRef ) )+ otherlv_1= 'eventually-occur' )
            // InternalScl.g:1649:3: ( (lv_refA_0_0= ruleRef ) )+ otherlv_1= 'eventually-occur'
            {
            // InternalScl.g:1649:3: ( (lv_refA_0_0= ruleRef ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=25 && LA41_0<=26)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalScl.g:1650:4: (lv_refA_0_0= ruleRef )
            	    {
            	    // InternalScl.g:1650:4: (lv_refA_0_0= ruleRef )
            	    // InternalScl.g:1651:5: lv_refA_0_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleChoiceAccess().getRefARefParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_refA_0_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleChoiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_0_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleChoiceAccess().getEventuallyOccurKeyword_1());
            		

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
    // $ANTLR end "ruleSimpleChoice"


    // $ANTLR start "entryRuleNotChainSuccession"
    // InternalScl.g:1676:1: entryRuleNotChainSuccession returns [EObject current=null] : iv_ruleNotChainSuccession= ruleNotChainSuccession EOF ;
    public final EObject entryRuleNotChainSuccession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotChainSuccession = null;


        try {
            // InternalScl.g:1676:59: (iv_ruleNotChainSuccession= ruleNotChainSuccession EOF )
            // InternalScl.g:1677:2: iv_ruleNotChainSuccession= ruleNotChainSuccession EOF
            {
             newCompositeNode(grammarAccess.getNotChainSuccessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotChainSuccession=ruleNotChainSuccession();

            state._fsp--;

             current =iv_ruleNotChainSuccession; 
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
    // $ANTLR end "entryRuleNotChainSuccession"


    // $ANTLR start "ruleNotChainSuccession"
    // InternalScl.g:1683:1: ruleNotChainSuccession returns [EObject current=null] : (otherlv_0= '!<>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-not-followed-immediately-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ ) ;
    public final EObject ruleNotChainSuccession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eitherA_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_eitherB_5_0=null;
        EObject lv_refA_2_0 = null;

        EObject lv_refB_6_0 = null;



        	enterRule();

        try {
            // InternalScl.g:1689:2: ( (otherlv_0= '!<>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-not-followed-immediately-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ ) )
            // InternalScl.g:1690:2: (otherlv_0= '!<>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-not-followed-immediately-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ )
            {
            // InternalScl.g:1690:2: (otherlv_0= '!<>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-not-followed-immediately-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ )
            // InternalScl.g:1691:3: otherlv_0= '!<>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-not-followed-immediately-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+
            {
            otherlv_0=(Token)match(input,42,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getNotChainSuccessionAccess().getExclamationMarkLessThanSignGreaterThanSignKeyword_0());
            		
            // InternalScl.g:1695:3: ( (lv_eitherA_1_0= 'either' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalScl.g:1696:4: (lv_eitherA_1_0= 'either' )
                    {
                    // InternalScl.g:1696:4: (lv_eitherA_1_0= 'either' )
                    // InternalScl.g:1697:5: lv_eitherA_1_0= 'either'
                    {
                    lv_eitherA_1_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_1_0, grammarAccess.getNotChainSuccessionAccess().getEitherAEitherKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNotChainSuccessionRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_1_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:1709:3: ( (lv_refA_2_0= ruleRef ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=25 && LA43_0<=26)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalScl.g:1710:4: (lv_refA_2_0= ruleRef )
            	    {
            	    // InternalScl.g:1710:4: (lv_refA_2_0= ruleRef )
            	    // InternalScl.g:1711:5: lv_refA_2_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getNotChainSuccessionAccess().getRefARefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_refA_2_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNotChainSuccessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_2_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // InternalScl.g:1728:3: (otherlv_3= 'occurs' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalScl.g:1729:4: otherlv_3= 'occurs'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_44); 

                    				newLeafNode(otherlv_3, grammarAccess.getNotChainSuccessionAccess().getOccursKeyword_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,44,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getNotChainSuccessionAccess().getIfAndOnlyIfNotFollowedImmediatelyByKeyword_4());
            		
            // InternalScl.g:1738:3: ( (lv_eitherB_5_0= 'either' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalScl.g:1739:4: (lv_eitherB_5_0= 'either' )
                    {
                    // InternalScl.g:1739:4: (lv_eitherB_5_0= 'either' )
                    // InternalScl.g:1740:5: lv_eitherB_5_0= 'either'
                    {
                    lv_eitherB_5_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_5_0, grammarAccess.getNotChainSuccessionAccess().getEitherBEitherKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNotChainSuccessionRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_5_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:1752:3: ( (lv_refB_6_0= ruleRef ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=25 && LA46_0<=26)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalScl.g:1753:4: (lv_refB_6_0= ruleRef )
            	    {
            	    // InternalScl.g:1753:4: (lv_refB_6_0= ruleRef )
            	    // InternalScl.g:1754:5: lv_refB_6_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getNotChainSuccessionAccess().getRefBRefParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_refB_6_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNotChainSuccessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refB",
            	    						lv_refB_6_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
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
    // $ANTLR end "ruleNotChainSuccession"


    // $ANTLR start "entryRuleNotCoExistance"
    // InternalScl.g:1775:1: entryRuleNotCoExistance returns [EObject current=null] : iv_ruleNotCoExistance= ruleNotCoExistance EOF ;
    public final EObject entryRuleNotCoExistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotCoExistance = null;


        try {
            // InternalScl.g:1775:55: (iv_ruleNotCoExistance= ruleNotCoExistance EOF )
            // InternalScl.g:1776:2: iv_ruleNotCoExistance= ruleNotCoExistance EOF
            {
             newCompositeNode(grammarAccess.getNotCoExistanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotCoExistance=ruleNotCoExistance();

            state._fsp--;

             current =iv_ruleNotCoExistance; 
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
    // $ANTLR end "entryRuleNotCoExistance"


    // $ANTLR start "ruleNotCoExistance"
    // InternalScl.g:1782:1: ruleNotCoExistance returns [EObject current=null] : (otherlv_0= '!-' ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'do-not-occur-together' ) ;
    public final EObject ruleNotCoExistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_refA_1_0 = null;



        	enterRule();

        try {
            // InternalScl.g:1788:2: ( (otherlv_0= '!-' ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'do-not-occur-together' ) )
            // InternalScl.g:1789:2: (otherlv_0= '!-' ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'do-not-occur-together' )
            {
            // InternalScl.g:1789:2: (otherlv_0= '!-' ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'do-not-occur-together' )
            // InternalScl.g:1790:3: otherlv_0= '!-' ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'do-not-occur-together'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getNotCoExistanceAccess().getExclamationMarkHyphenMinusKeyword_0());
            		
            // InternalScl.g:1794:3: ( (lv_refA_1_0= ruleRef ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=25 && LA47_0<=26)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalScl.g:1795:4: (lv_refA_1_0= ruleRef )
            	    {
            	    // InternalScl.g:1795:4: (lv_refA_1_0= ruleRef )
            	    // InternalScl.g:1796:5: lv_refA_1_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getNotCoExistanceAccess().getRefARefParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_45);
            	    lv_refA_1_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNotCoExistanceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_1_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            otherlv_2=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNotCoExistanceAccess().getDoNotOccurTogetherKeyword_2());
            		

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
    // $ANTLR end "ruleNotCoExistance"


    // $ANTLR start "entryRuleNotSuccession"
    // InternalScl.g:1821:1: entryRuleNotSuccession returns [EObject current=null] : iv_ruleNotSuccession= ruleNotSuccession EOF ;
    public final EObject entryRuleNotSuccession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotSuccession = null;


        try {
            // InternalScl.g:1821:54: (iv_ruleNotSuccession= ruleNotSuccession EOF )
            // InternalScl.g:1822:2: iv_ruleNotSuccession= ruleNotSuccession EOF
            {
             newCompositeNode(grammarAccess.getNotSuccessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotSuccession=ruleNotSuccession();

            state._fsp--;

             current =iv_ruleNotSuccession; 
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
    // $ANTLR end "entryRuleNotSuccession"


    // $ANTLR start "ruleNotSuccession"
    // InternalScl.g:1828:1: ruleNotSuccession returns [EObject current=null] : (otherlv_0= '!<-->' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-not-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ ) ;
    public final EObject ruleNotSuccession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eitherA_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_eitherB_5_0=null;
        EObject lv_refA_2_0 = null;

        EObject lv_refB_6_0 = null;



        	enterRule();

        try {
            // InternalScl.g:1834:2: ( (otherlv_0= '!<-->' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-not-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ ) )
            // InternalScl.g:1835:2: (otherlv_0= '!<-->' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-not-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ )
            {
            // InternalScl.g:1835:2: (otherlv_0= '!<-->' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-not-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ )
            // InternalScl.g:1836:3: otherlv_0= '!<-->' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-not-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+
            {
            otherlv_0=(Token)match(input,47,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getNotSuccessionAccess().getExclamationMarkLessThanSignHyphenMinusHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalScl.g:1840:3: ( (lv_eitherA_1_0= 'either' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalScl.g:1841:4: (lv_eitherA_1_0= 'either' )
                    {
                    // InternalScl.g:1841:4: (lv_eitherA_1_0= 'either' )
                    // InternalScl.g:1842:5: lv_eitherA_1_0= 'either'
                    {
                    lv_eitherA_1_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_1_0, grammarAccess.getNotSuccessionAccess().getEitherAEitherKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNotSuccessionRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_1_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:1854:3: ( (lv_refA_2_0= ruleRef ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=25 && LA49_0<=26)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalScl.g:1855:4: (lv_refA_2_0= ruleRef )
            	    {
            	    // InternalScl.g:1855:4: (lv_refA_2_0= ruleRef )
            	    // InternalScl.g:1856:5: lv_refA_2_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getNotSuccessionAccess().getRefARefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_46);
            	    lv_refA_2_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNotSuccessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_2_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            // InternalScl.g:1873:3: (otherlv_3= 'occurs' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==43) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalScl.g:1874:4: otherlv_3= 'occurs'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_47); 

                    				newLeafNode(otherlv_3, grammarAccess.getNotSuccessionAccess().getOccursKeyword_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,48,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getNotSuccessionAccess().getIfAndOnlyIfNotFollowedByKeyword_4());
            		
            // InternalScl.g:1883:3: ( (lv_eitherB_5_0= 'either' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalScl.g:1884:4: (lv_eitherB_5_0= 'either' )
                    {
                    // InternalScl.g:1884:4: (lv_eitherB_5_0= 'either' )
                    // InternalScl.g:1885:5: lv_eitherB_5_0= 'either'
                    {
                    lv_eitherB_5_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_5_0, grammarAccess.getNotSuccessionAccess().getEitherBEitherKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNotSuccessionRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_5_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:1897:3: ( (lv_refB_6_0= ruleRef ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=25 && LA52_0<=26)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalScl.g:1898:4: (lv_refB_6_0= ruleRef )
            	    {
            	    // InternalScl.g:1898:4: (lv_refB_6_0= ruleRef )
            	    // InternalScl.g:1899:5: lv_refB_6_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getNotSuccessionAccess().getRefBRefParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_refB_6_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNotSuccessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refB",
            	    						lv_refB_6_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
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
    // $ANTLR end "ruleNotSuccession"


    // $ANTLR start "entryRuleChainSuccession"
    // InternalScl.g:1920:1: entryRuleChainSuccession returns [EObject current=null] : iv_ruleChainSuccession= ruleChainSuccession EOF ;
    public final EObject entryRuleChainSuccession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChainSuccession = null;


        try {
            // InternalScl.g:1920:56: (iv_ruleChainSuccession= ruleChainSuccession EOF )
            // InternalScl.g:1921:2: iv_ruleChainSuccession= ruleChainSuccession EOF
            {
             newCompositeNode(grammarAccess.getChainSuccessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChainSuccession=ruleChainSuccession();

            state._fsp--;

             current =iv_ruleChainSuccession; 
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
    // $ANTLR end "entryRuleChainSuccession"


    // $ANTLR start "ruleChainSuccession"
    // InternalScl.g:1927:1: ruleChainSuccession returns [EObject current=null] : (otherlv_0= '<>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ otherlv_3= 'occurs-if-and-only-if-immediately-followed-by' ( (lv_eitherB_4_0= 'either' ) )? ( (lv_refB_5_0= ruleRef ) )+ (otherlv_6= 'within' ( (lv_minVal_7_0= RULE_INT ) ) (otherlv_8= '-' ( (lv_maxVal_9_0= RULE_INT ) ) )? otherlv_10= 'ms' )? ) ;
    public final EObject ruleChainSuccession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eitherA_1_0=null;
        Token otherlv_3=null;
        Token lv_eitherB_4_0=null;
        Token otherlv_6=null;
        Token lv_minVal_7_0=null;
        Token otherlv_8=null;
        Token lv_maxVal_9_0=null;
        Token otherlv_10=null;
        EObject lv_refA_2_0 = null;

        EObject lv_refB_5_0 = null;



        	enterRule();

        try {
            // InternalScl.g:1933:2: ( (otherlv_0= '<>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ otherlv_3= 'occurs-if-and-only-if-immediately-followed-by' ( (lv_eitherB_4_0= 'either' ) )? ( (lv_refB_5_0= ruleRef ) )+ (otherlv_6= 'within' ( (lv_minVal_7_0= RULE_INT ) ) (otherlv_8= '-' ( (lv_maxVal_9_0= RULE_INT ) ) )? otherlv_10= 'ms' )? ) )
            // InternalScl.g:1934:2: (otherlv_0= '<>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ otherlv_3= 'occurs-if-and-only-if-immediately-followed-by' ( (lv_eitherB_4_0= 'either' ) )? ( (lv_refB_5_0= ruleRef ) )+ (otherlv_6= 'within' ( (lv_minVal_7_0= RULE_INT ) ) (otherlv_8= '-' ( (lv_maxVal_9_0= RULE_INT ) ) )? otherlv_10= 'ms' )? )
            {
            // InternalScl.g:1934:2: (otherlv_0= '<>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ otherlv_3= 'occurs-if-and-only-if-immediately-followed-by' ( (lv_eitherB_4_0= 'either' ) )? ( (lv_refB_5_0= ruleRef ) )+ (otherlv_6= 'within' ( (lv_minVal_7_0= RULE_INT ) ) (otherlv_8= '-' ( (lv_maxVal_9_0= RULE_INT ) ) )? otherlv_10= 'ms' )? )
            // InternalScl.g:1935:3: otherlv_0= '<>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ otherlv_3= 'occurs-if-and-only-if-immediately-followed-by' ( (lv_eitherB_4_0= 'either' ) )? ( (lv_refB_5_0= ruleRef ) )+ (otherlv_6= 'within' ( (lv_minVal_7_0= RULE_INT ) ) (otherlv_8= '-' ( (lv_maxVal_9_0= RULE_INT ) ) )? otherlv_10= 'ms' )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getChainSuccessionAccess().getLessThanSignGreaterThanSignKeyword_0());
            		
            // InternalScl.g:1939:3: ( (lv_eitherA_1_0= 'either' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==38) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalScl.g:1940:4: (lv_eitherA_1_0= 'either' )
                    {
                    // InternalScl.g:1940:4: (lv_eitherA_1_0= 'either' )
                    // InternalScl.g:1941:5: lv_eitherA_1_0= 'either'
                    {
                    lv_eitherA_1_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_1_0, grammarAccess.getChainSuccessionAccess().getEitherAEitherKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChainSuccessionRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_1_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:1953:3: ( (lv_refA_2_0= ruleRef ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=25 && LA54_0<=26)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalScl.g:1954:4: (lv_refA_2_0= ruleRef )
            	    {
            	    // InternalScl.g:1954:4: (lv_refA_2_0= ruleRef )
            	    // InternalScl.g:1955:5: lv_refA_2_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getChainSuccessionAccess().getRefARefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_48);
            	    lv_refA_2_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChainSuccessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_2_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            otherlv_3=(Token)match(input,50,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getChainSuccessionAccess().getOccursIfAndOnlyIfImmediatelyFollowedByKeyword_3());
            		
            // InternalScl.g:1976:3: ( (lv_eitherB_4_0= 'either' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==38) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalScl.g:1977:4: (lv_eitherB_4_0= 'either' )
                    {
                    // InternalScl.g:1977:4: (lv_eitherB_4_0= 'either' )
                    // InternalScl.g:1978:5: lv_eitherB_4_0= 'either'
                    {
                    lv_eitherB_4_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_4_0, grammarAccess.getChainSuccessionAccess().getEitherBEitherKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChainSuccessionRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_4_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:1990:3: ( (lv_refB_5_0= ruleRef ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=25 && LA56_0<=26)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalScl.g:1991:4: (lv_refB_5_0= ruleRef )
            	    {
            	    // InternalScl.g:1991:4: (lv_refB_5_0= ruleRef )
            	    // InternalScl.g:1992:5: lv_refB_5_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getChainSuccessionAccess().getRefBRefParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_49);
            	    lv_refB_5_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChainSuccessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refB",
            	    						lv_refB_5_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);

            // InternalScl.g:2009:3: (otherlv_6= 'within' ( (lv_minVal_7_0= RULE_INT ) ) (otherlv_8= '-' ( (lv_maxVal_9_0= RULE_INT ) ) )? otherlv_10= 'ms' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==51) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalScl.g:2010:4: otherlv_6= 'within' ( (lv_minVal_7_0= RULE_INT ) ) (otherlv_8= '-' ( (lv_maxVal_9_0= RULE_INT ) ) )? otherlv_10= 'ms'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getChainSuccessionAccess().getWithinKeyword_6_0());
                    			
                    // InternalScl.g:2014:4: ( (lv_minVal_7_0= RULE_INT ) )
                    // InternalScl.g:2015:5: (lv_minVal_7_0= RULE_INT )
                    {
                    // InternalScl.g:2015:5: (lv_minVal_7_0= RULE_INT )
                    // InternalScl.g:2016:6: lv_minVal_7_0= RULE_INT
                    {
                    lv_minVal_7_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_minVal_7_0, grammarAccess.getChainSuccessionAccess().getMinValINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChainSuccessionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minVal",
                    							lv_minVal_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalScl.g:2032:4: (otherlv_8= '-' ( (lv_maxVal_9_0= RULE_INT ) ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==52) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalScl.g:2033:5: otherlv_8= '-' ( (lv_maxVal_9_0= RULE_INT ) )
                            {
                            otherlv_8=(Token)match(input,52,FOLLOW_19); 

                            					newLeafNode(otherlv_8, grammarAccess.getChainSuccessionAccess().getHyphenMinusKeyword_6_2_0());
                            				
                            // InternalScl.g:2037:5: ( (lv_maxVal_9_0= RULE_INT ) )
                            // InternalScl.g:2038:6: (lv_maxVal_9_0= RULE_INT )
                            {
                            // InternalScl.g:2038:6: (lv_maxVal_9_0= RULE_INT )
                            // InternalScl.g:2039:7: lv_maxVal_9_0= RULE_INT
                            {
                            lv_maxVal_9_0=(Token)match(input,RULE_INT,FOLLOW_51); 

                            							newLeafNode(lv_maxVal_9_0, grammarAccess.getChainSuccessionAccess().getMaxValINTTerminalRuleCall_6_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getChainSuccessionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"maxVal",
                            								lv_maxVal_9_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getChainSuccessionAccess().getMsKeyword_6_3());
                    			

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
    // $ANTLR end "ruleChainSuccession"


    // $ANTLR start "entryRuleAlternateSuccession"
    // InternalScl.g:2065:1: entryRuleAlternateSuccession returns [EObject current=null] : iv_ruleAlternateSuccession= ruleAlternateSuccession EOF ;
    public final EObject entryRuleAlternateSuccession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternateSuccession = null;


        try {
            // InternalScl.g:2065:60: (iv_ruleAlternateSuccession= ruleAlternateSuccession EOF )
            // InternalScl.g:2066:2: iv_ruleAlternateSuccession= ruleAlternateSuccession EOF
            {
             newCompositeNode(grammarAccess.getAlternateSuccessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternateSuccession=ruleAlternateSuccession();

            state._fsp--;

             current =iv_ruleAlternateSuccession; 
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
    // $ANTLR end "entryRuleAlternateSuccession"


    // $ANTLR start "ruleAlternateSuccession"
    // InternalScl.g:2072:1: ruleAlternateSuccession returns [EObject current=null] : (otherlv_0= '<!>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ otherlv_7= 'with' ( (lv_eitherC_8_0= 'either' ) )? ( (lv_negation_9_0= 'no' ) )? ( (lv_refC_10_0= ruleRef ) )+ otherlv_11= 'in-between' ) ;
    public final EObject ruleAlternateSuccession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eitherA_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_eitherB_5_0=null;
        Token otherlv_7=null;
        Token lv_eitherC_8_0=null;
        Token lv_negation_9_0=null;
        Token otherlv_11=null;
        EObject lv_refA_2_0 = null;

        EObject lv_refB_6_0 = null;

        EObject lv_refC_10_0 = null;



        	enterRule();

        try {
            // InternalScl.g:2078:2: ( (otherlv_0= '<!>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ otherlv_7= 'with' ( (lv_eitherC_8_0= 'either' ) )? ( (lv_negation_9_0= 'no' ) )? ( (lv_refC_10_0= ruleRef ) )+ otherlv_11= 'in-between' ) )
            // InternalScl.g:2079:2: (otherlv_0= '<!>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ otherlv_7= 'with' ( (lv_eitherC_8_0= 'either' ) )? ( (lv_negation_9_0= 'no' ) )? ( (lv_refC_10_0= ruleRef ) )+ otherlv_11= 'in-between' )
            {
            // InternalScl.g:2079:2: (otherlv_0= '<!>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ otherlv_7= 'with' ( (lv_eitherC_8_0= 'either' ) )? ( (lv_negation_9_0= 'no' ) )? ( (lv_refC_10_0= ruleRef ) )+ otherlv_11= 'in-between' )
            // InternalScl.g:2080:3: otherlv_0= '<!>' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ otherlv_7= 'with' ( (lv_eitherC_8_0= 'either' ) )? ( (lv_negation_9_0= 'no' ) )? ( (lv_refC_10_0= ruleRef ) )+ otherlv_11= 'in-between'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getAlternateSuccessionAccess().getLessThanSignExclamationMarkGreaterThanSignKeyword_0());
            		
            // InternalScl.g:2084:3: ( (lv_eitherA_1_0= 'either' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==38) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalScl.g:2085:4: (lv_eitherA_1_0= 'either' )
                    {
                    // InternalScl.g:2085:4: (lv_eitherA_1_0= 'either' )
                    // InternalScl.g:2086:5: lv_eitherA_1_0= 'either'
                    {
                    lv_eitherA_1_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_1_0, grammarAccess.getAlternateSuccessionAccess().getEitherAEitherKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternateSuccessionRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_1_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2098:3: ( (lv_refA_2_0= ruleRef ) )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=25 && LA60_0<=26)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalScl.g:2099:4: (lv_refA_2_0= ruleRef )
            	    {
            	    // InternalScl.g:2099:4: (lv_refA_2_0= ruleRef )
            	    // InternalScl.g:2100:5: lv_refA_2_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getAlternateSuccessionAccess().getRefARefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_52);
            	    lv_refA_2_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternateSuccessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_2_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);

            // InternalScl.g:2117:3: (otherlv_3= 'occurs' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==43) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalScl.g:2118:4: otherlv_3= 'occurs'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_53); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlternateSuccessionAccess().getOccursKeyword_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,55,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getAlternateSuccessionAccess().getIfAndOnlyIfFollowedByKeyword_4());
            		
            // InternalScl.g:2127:3: ( (lv_eitherB_5_0= 'either' ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==38) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalScl.g:2128:4: (lv_eitherB_5_0= 'either' )
                    {
                    // InternalScl.g:2128:4: (lv_eitherB_5_0= 'either' )
                    // InternalScl.g:2129:5: lv_eitherB_5_0= 'either'
                    {
                    lv_eitherB_5_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_5_0, grammarAccess.getAlternateSuccessionAccess().getEitherBEitherKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternateSuccessionRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_5_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2141:3: ( (lv_refB_6_0= ruleRef ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=25 && LA63_0<=26)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalScl.g:2142:4: (lv_refB_6_0= ruleRef )
            	    {
            	    // InternalScl.g:2142:4: (lv_refB_6_0= ruleRef )
            	    // InternalScl.g:2143:5: lv_refB_6_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getAlternateSuccessionAccess().getRefBRefParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_54);
            	    lv_refB_6_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternateSuccessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refB",
            	    						lv_refB_6_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);

            otherlv_7=(Token)match(input,29,FOLLOW_55); 

            			newLeafNode(otherlv_7, grammarAccess.getAlternateSuccessionAccess().getWithKeyword_7());
            		
            // InternalScl.g:2164:3: ( (lv_eitherC_8_0= 'either' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==38) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalScl.g:2165:4: (lv_eitherC_8_0= 'either' )
                    {
                    // InternalScl.g:2165:4: (lv_eitherC_8_0= 'either' )
                    // InternalScl.g:2166:5: lv_eitherC_8_0= 'either'
                    {
                    lv_eitherC_8_0=(Token)match(input,38,FOLLOW_56); 

                    					newLeafNode(lv_eitherC_8_0, grammarAccess.getAlternateSuccessionAccess().getEitherCEitherKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternateSuccessionRule());
                    					}
                    					setWithLastConsumed(current, "eitherC", lv_eitherC_8_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2178:3: ( (lv_negation_9_0= 'no' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==56) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalScl.g:2179:4: (lv_negation_9_0= 'no' )
                    {
                    // InternalScl.g:2179:4: (lv_negation_9_0= 'no' )
                    // InternalScl.g:2180:5: lv_negation_9_0= 'no'
                    {
                    lv_negation_9_0=(Token)match(input,56,FOLLOW_38); 

                    					newLeafNode(lv_negation_9_0, grammarAccess.getAlternateSuccessionAccess().getNegationNoKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternateSuccessionRule());
                    					}
                    					setWithLastConsumed(current, "negation", lv_negation_9_0 != null, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2192:3: ( (lv_refC_10_0= ruleRef ) )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=25 && LA66_0<=26)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalScl.g:2193:4: (lv_refC_10_0= ruleRef )
            	    {
            	    // InternalScl.g:2193:4: (lv_refC_10_0= ruleRef )
            	    // InternalScl.g:2194:5: lv_refC_10_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getAlternateSuccessionAccess().getRefCRefParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_57);
            	    lv_refC_10_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternateSuccessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refC",
            	    						lv_refC_10_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);

            otherlv_11=(Token)match(input,57,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAlternateSuccessionAccess().getInBetweenKeyword_11());
            		

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
    // $ANTLR end "ruleAlternateSuccession"


    // $ANTLR start "entryRuleSuccession"
    // InternalScl.g:2219:1: entryRuleSuccession returns [EObject current=null] : iv_ruleSuccession= ruleSuccession EOF ;
    public final EObject entryRuleSuccession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuccession = null;


        try {
            // InternalScl.g:2219:51: (iv_ruleSuccession= ruleSuccession EOF )
            // InternalScl.g:2220:2: iv_ruleSuccession= ruleSuccession EOF
            {
             newCompositeNode(grammarAccess.getSuccessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuccession=ruleSuccession();

            state._fsp--;

             current =iv_ruleSuccession; 
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
    // $ANTLR end "entryRuleSuccession"


    // $ANTLR start "ruleSuccession"
    // InternalScl.g:2226:1: ruleSuccession returns [EObject current=null] : (otherlv_0= '<-->' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ (otherlv_7= 'within' ( (lv_minVal_8_0= RULE_INT ) ) (otherlv_9= '-' ( (lv_maxVal_10_0= RULE_INT ) ) )? otherlv_11= 'ms' )? ) ;
    public final EObject ruleSuccession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eitherA_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_eitherB_5_0=null;
        Token otherlv_7=null;
        Token lv_minVal_8_0=null;
        Token otherlv_9=null;
        Token lv_maxVal_10_0=null;
        Token otherlv_11=null;
        EObject lv_refA_2_0 = null;

        EObject lv_refB_6_0 = null;



        	enterRule();

        try {
            // InternalScl.g:2232:2: ( (otherlv_0= '<-->' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ (otherlv_7= 'within' ( (lv_minVal_8_0= RULE_INT ) ) (otherlv_9= '-' ( (lv_maxVal_10_0= RULE_INT ) ) )? otherlv_11= 'ms' )? ) )
            // InternalScl.g:2233:2: (otherlv_0= '<-->' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ (otherlv_7= 'within' ( (lv_minVal_8_0= RULE_INT ) ) (otherlv_9= '-' ( (lv_maxVal_10_0= RULE_INT ) ) )? otherlv_11= 'ms' )? )
            {
            // InternalScl.g:2233:2: (otherlv_0= '<-->' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ (otherlv_7= 'within' ( (lv_minVal_8_0= RULE_INT ) ) (otherlv_9= '-' ( (lv_maxVal_10_0= RULE_INT ) ) )? otherlv_11= 'ms' )? )
            // InternalScl.g:2234:3: otherlv_0= '<-->' ( (lv_eitherA_1_0= 'either' ) )? ( (lv_refA_2_0= ruleRef ) )+ (otherlv_3= 'occurs' )? otherlv_4= 'if-and-only-if-followed-by' ( (lv_eitherB_5_0= 'either' ) )? ( (lv_refB_6_0= ruleRef ) )+ (otherlv_7= 'within' ( (lv_minVal_8_0= RULE_INT ) ) (otherlv_9= '-' ( (lv_maxVal_10_0= RULE_INT ) ) )? otherlv_11= 'ms' )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getSuccessionAccess().getLessThanSignHyphenMinusHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalScl.g:2238:3: ( (lv_eitherA_1_0= 'either' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==38) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalScl.g:2239:4: (lv_eitherA_1_0= 'either' )
                    {
                    // InternalScl.g:2239:4: (lv_eitherA_1_0= 'either' )
                    // InternalScl.g:2240:5: lv_eitherA_1_0= 'either'
                    {
                    lv_eitherA_1_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_1_0, grammarAccess.getSuccessionAccess().getEitherAEitherKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSuccessionRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_1_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2252:3: ( (lv_refA_2_0= ruleRef ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=25 && LA68_0<=26)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalScl.g:2253:4: (lv_refA_2_0= ruleRef )
            	    {
            	    // InternalScl.g:2253:4: (lv_refA_2_0= ruleRef )
            	    // InternalScl.g:2254:5: lv_refA_2_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getSuccessionAccess().getRefARefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_52);
            	    lv_refA_2_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSuccessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_2_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);

            // InternalScl.g:2271:3: (otherlv_3= 'occurs' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==43) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalScl.g:2272:4: otherlv_3= 'occurs'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_53); 

                    				newLeafNode(otherlv_3, grammarAccess.getSuccessionAccess().getOccursKeyword_3());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,55,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getSuccessionAccess().getIfAndOnlyIfFollowedByKeyword_4());
            		
            // InternalScl.g:2281:3: ( (lv_eitherB_5_0= 'either' ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==38) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalScl.g:2282:4: (lv_eitherB_5_0= 'either' )
                    {
                    // InternalScl.g:2282:4: (lv_eitherB_5_0= 'either' )
                    // InternalScl.g:2283:5: lv_eitherB_5_0= 'either'
                    {
                    lv_eitherB_5_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_5_0, grammarAccess.getSuccessionAccess().getEitherBEitherKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSuccessionRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_5_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2295:3: ( (lv_refB_6_0= ruleRef ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=25 && LA71_0<=26)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalScl.g:2296:4: (lv_refB_6_0= ruleRef )
            	    {
            	    // InternalScl.g:2296:4: (lv_refB_6_0= ruleRef )
            	    // InternalScl.g:2297:5: lv_refB_6_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getSuccessionAccess().getRefBRefParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_49);
            	    lv_refB_6_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSuccessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refB",
            	    						lv_refB_6_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
            } while (true);

            // InternalScl.g:2314:3: (otherlv_7= 'within' ( (lv_minVal_8_0= RULE_INT ) ) (otherlv_9= '-' ( (lv_maxVal_10_0= RULE_INT ) ) )? otherlv_11= 'ms' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==51) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalScl.g:2315:4: otherlv_7= 'within' ( (lv_minVal_8_0= RULE_INT ) ) (otherlv_9= '-' ( (lv_maxVal_10_0= RULE_INT ) ) )? otherlv_11= 'ms'
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getSuccessionAccess().getWithinKeyword_7_0());
                    			
                    // InternalScl.g:2319:4: ( (lv_minVal_8_0= RULE_INT ) )
                    // InternalScl.g:2320:5: (lv_minVal_8_0= RULE_INT )
                    {
                    // InternalScl.g:2320:5: (lv_minVal_8_0= RULE_INT )
                    // InternalScl.g:2321:6: lv_minVal_8_0= RULE_INT
                    {
                    lv_minVal_8_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_minVal_8_0, grammarAccess.getSuccessionAccess().getMinValINTTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSuccessionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minVal",
                    							lv_minVal_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalScl.g:2337:4: (otherlv_9= '-' ( (lv_maxVal_10_0= RULE_INT ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==52) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalScl.g:2338:5: otherlv_9= '-' ( (lv_maxVal_10_0= RULE_INT ) )
                            {
                            otherlv_9=(Token)match(input,52,FOLLOW_19); 

                            					newLeafNode(otherlv_9, grammarAccess.getSuccessionAccess().getHyphenMinusKeyword_7_2_0());
                            				
                            // InternalScl.g:2342:5: ( (lv_maxVal_10_0= RULE_INT ) )
                            // InternalScl.g:2343:6: (lv_maxVal_10_0= RULE_INT )
                            {
                            // InternalScl.g:2343:6: (lv_maxVal_10_0= RULE_INT )
                            // InternalScl.g:2344:7: lv_maxVal_10_0= RULE_INT
                            {
                            lv_maxVal_10_0=(Token)match(input,RULE_INT,FOLLOW_51); 

                            							newLeafNode(lv_maxVal_10_0, grammarAccess.getSuccessionAccess().getMaxValINTTerminalRuleCall_7_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSuccessionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"maxVal",
                            								lv_maxVal_10_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getSuccessionAccess().getMsKeyword_7_3());
                    			

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
    // $ANTLR end "ruleSuccession"


    // $ANTLR start "entryRuleCoExistance"
    // InternalScl.g:2370:1: entryRuleCoExistance returns [EObject current=null] : iv_ruleCoExistance= ruleCoExistance EOF ;
    public final EObject entryRuleCoExistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoExistance = null;


        try {
            // InternalScl.g:2370:52: (iv_ruleCoExistance= ruleCoExistance EOF )
            // InternalScl.g:2371:2: iv_ruleCoExistance= ruleCoExistance EOF
            {
             newCompositeNode(grammarAccess.getCoExistanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoExistance=ruleCoExistance();

            state._fsp--;

             current =iv_ruleCoExistance; 
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
    // $ANTLR end "entryRuleCoExistance"


    // $ANTLR start "ruleCoExistance"
    // InternalScl.g:2377:1: ruleCoExistance returns [EObject current=null] : (otherlv_0= '-' ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'occur-together' ) ;
    public final EObject ruleCoExistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_refA_1_0 = null;



        	enterRule();

        try {
            // InternalScl.g:2383:2: ( (otherlv_0= '-' ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'occur-together' ) )
            // InternalScl.g:2384:2: (otherlv_0= '-' ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'occur-together' )
            {
            // InternalScl.g:2384:2: (otherlv_0= '-' ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'occur-together' )
            // InternalScl.g:2385:3: otherlv_0= '-' ( (lv_refA_1_0= ruleRef ) )+ otherlv_2= 'occur-together'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getCoExistanceAccess().getHyphenMinusKeyword_0());
            		
            // InternalScl.g:2389:3: ( (lv_refA_1_0= ruleRef ) )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=25 && LA74_0<=26)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalScl.g:2390:4: (lv_refA_1_0= ruleRef )
            	    {
            	    // InternalScl.g:2390:4: (lv_refA_1_0= ruleRef )
            	    // InternalScl.g:2391:5: lv_refA_1_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getCoExistanceAccess().getRefARefParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_58);
            	    lv_refA_1_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoExistanceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_1_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);

            otherlv_2=(Token)match(input,59,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCoExistanceAccess().getOccurTogetherKeyword_2());
            		

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
    // $ANTLR end "ruleCoExistance"


    // $ANTLR start "entryRuleRespondedExistence"
    // InternalScl.g:2416:1: entryRuleRespondedExistence returns [EObject current=null] : iv_ruleRespondedExistence= ruleRespondedExistence EOF ;
    public final EObject entryRuleRespondedExistence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRespondedExistence = null;


        try {
            // InternalScl.g:2416:59: (iv_ruleRespondedExistence= ruleRespondedExistence EOF )
            // InternalScl.g:2417:2: iv_ruleRespondedExistence= ruleRespondedExistence EOF
            {
             newCompositeNode(grammarAccess.getRespondedExistenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRespondedExistence=ruleRespondedExistence();

            state._fsp--;

             current =iv_ruleRespondedExistence; 
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
    // $ANTLR end "entryRuleRespondedExistence"


    // $ANTLR start "ruleRespondedExistence"
    // InternalScl.g:2423:1: ruleRespondedExistence returns [EObject current=null] : (otherlv_0= '-|-' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'occurs-as-well' ) ;
    public final EObject ruleRespondedExistence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_eitherA_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_eitherB_6_0=null;
        Token otherlv_8=null;
        EObject lv_refA_3_0 = null;

        EObject lv_refB_7_0 = null;



        	enterRule();

        try {
            // InternalScl.g:2429:2: ( (otherlv_0= '-|-' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'occurs-as-well' ) )
            // InternalScl.g:2430:2: (otherlv_0= '-|-' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'occurs-as-well' )
            {
            // InternalScl.g:2430:2: (otherlv_0= '-|-' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'occurs-as-well' )
            // InternalScl.g:2431:3: otherlv_0= '-|-' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'occurs-as-well'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getRespondedExistenceAccess().getHyphenMinusVerticalLineHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,61,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getRespondedExistenceAccess().getIfKeyword_1());
            		
            // InternalScl.g:2439:3: ( (lv_eitherA_2_0= 'either' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==38) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalScl.g:2440:4: (lv_eitherA_2_0= 'either' )
                    {
                    // InternalScl.g:2440:4: (lv_eitherA_2_0= 'either' )
                    // InternalScl.g:2441:5: lv_eitherA_2_0= 'either'
                    {
                    lv_eitherA_2_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_2_0, grammarAccess.getRespondedExistenceAccess().getEitherAEitherKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRespondedExistenceRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_2_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2453:3: ( (lv_refA_3_0= ruleRef ) )+
            int cnt76=0;
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=25 && LA76_0<=26)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalScl.g:2454:4: (lv_refA_3_0= ruleRef )
            	    {
            	    // InternalScl.g:2454:4: (lv_refA_3_0= ruleRef )
            	    // InternalScl.g:2455:5: lv_refA_3_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getRespondedExistenceAccess().getRefARefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_60);
            	    lv_refA_3_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRespondedExistenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_3_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt76 >= 1 ) break loop76;
                        EarlyExitException eee =
                            new EarlyExitException(76, input);
                        throw eee;
                }
                cnt76++;
            } while (true);

            // InternalScl.g:2472:3: (otherlv_4= 'occurs' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==43) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalScl.g:2473:4: otherlv_4= 'occurs'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_61); 

                    				newLeafNode(otherlv_4, grammarAccess.getRespondedExistenceAccess().getOccursKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,62,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getRespondedExistenceAccess().getThenKeyword_5());
            		
            // InternalScl.g:2482:3: ( (lv_eitherB_6_0= 'either' ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==38) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalScl.g:2483:4: (lv_eitherB_6_0= 'either' )
                    {
                    // InternalScl.g:2483:4: (lv_eitherB_6_0= 'either' )
                    // InternalScl.g:2484:5: lv_eitherB_6_0= 'either'
                    {
                    lv_eitherB_6_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_6_0, grammarAccess.getRespondedExistenceAccess().getEitherBEitherKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRespondedExistenceRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_6_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2496:3: ( (lv_refB_7_0= ruleRef ) )+
            int cnt79=0;
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=25 && LA79_0<=26)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalScl.g:2497:4: (lv_refB_7_0= ruleRef )
            	    {
            	    // InternalScl.g:2497:4: (lv_refB_7_0= ruleRef )
            	    // InternalScl.g:2498:5: lv_refB_7_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getRespondedExistenceAccess().getRefBRefParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_refB_7_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRespondedExistenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refB",
            	    						lv_refB_7_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt79 >= 1 ) break loop79;
                        EarlyExitException eee =
                            new EarlyExitException(79, input);
                        throw eee;
                }
                cnt79++;
            } while (true);

            otherlv_8=(Token)match(input,63,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRespondedExistenceAccess().getOccursAsWellKeyword_8());
            		

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
    // $ANTLR end "ruleRespondedExistence"


    // $ANTLR start "entryRuleChainPrecedence"
    // InternalScl.g:2523:1: entryRuleChainPrecedence returns [EObject current=null] : iv_ruleChainPrecedence= ruleChainPrecedence EOF ;
    public final EObject entryRuleChainPrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChainPrecedence = null;


        try {
            // InternalScl.g:2523:56: (iv_ruleChainPrecedence= ruleChainPrecedence EOF )
            // InternalScl.g:2524:2: iv_ruleChainPrecedence= ruleChainPrecedence EOF
            {
             newCompositeNode(grammarAccess.getChainPrecedenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChainPrecedence=ruleChainPrecedence();

            state._fsp--;

             current =iv_ruleChainPrecedence; 
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
    // $ANTLR end "entryRuleChainPrecedence"


    // $ANTLR start "ruleChainPrecedence"
    // InternalScl.g:2530:1: ruleChainPrecedence returns [EObject current=null] : (otherlv_0= '<' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'have-occurred-immediately-before' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? ) ;
    public final EObject ruleChainPrecedence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_eitherB_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_eitherA_6_0=null;
        Token otherlv_8=null;
        Token lv_not_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_minVal_12_0=null;
        Token otherlv_13=null;
        Token lv_maxVal_14_0=null;
        Token otherlv_15=null;
        EObject lv_refB_3_0 = null;

        EObject lv_refA_7_0 = null;



        	enterRule();

        try {
            // InternalScl.g:2536:2: ( (otherlv_0= '<' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'have-occurred-immediately-before' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? ) )
            // InternalScl.g:2537:2: (otherlv_0= '<' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'have-occurred-immediately-before' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? )
            {
            // InternalScl.g:2537:2: (otherlv_0= '<' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'have-occurred-immediately-before' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? )
            // InternalScl.g:2538:3: otherlv_0= '<' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'have-occurred-immediately-before' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getChainPrecedenceAccess().getLessThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getChainPrecedenceAccess().getWheneverKeyword_1());
            		
            // InternalScl.g:2546:3: ( (lv_eitherB_2_0= 'either' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==38) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalScl.g:2547:4: (lv_eitherB_2_0= 'either' )
                    {
                    // InternalScl.g:2547:4: (lv_eitherB_2_0= 'either' )
                    // InternalScl.g:2548:5: lv_eitherB_2_0= 'either'
                    {
                    lv_eitherB_2_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_2_0, grammarAccess.getChainPrecedenceAccess().getEitherBEitherKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChainPrecedenceRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_2_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2560:3: ( (lv_refB_3_0= ruleRef ) )+
            int cnt81=0;
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( ((LA81_0>=25 && LA81_0<=26)) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalScl.g:2561:4: (lv_refB_3_0= ruleRef )
            	    {
            	    // InternalScl.g:2561:4: (lv_refB_3_0= ruleRef )
            	    // InternalScl.g:2562:5: lv_refB_3_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getChainPrecedenceAccess().getRefBRefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_60);
            	    lv_refB_3_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChainPrecedenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refB",
            	    						lv_refB_3_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt81 >= 1 ) break loop81;
                        EarlyExitException eee =
                            new EarlyExitException(81, input);
                        throw eee;
                }
                cnt81++;
            } while (true);

            // InternalScl.g:2579:3: (otherlv_4= 'occurs' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==43) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalScl.g:2580:4: otherlv_4= 'occurs'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_61); 

                    				newLeafNode(otherlv_4, grammarAccess.getChainPrecedenceAccess().getOccursKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,62,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getChainPrecedenceAccess().getThenKeyword_5());
            		
            // InternalScl.g:2589:3: ( (lv_eitherA_6_0= 'either' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==38) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalScl.g:2590:4: (lv_eitherA_6_0= 'either' )
                    {
                    // InternalScl.g:2590:4: (lv_eitherA_6_0= 'either' )
                    // InternalScl.g:2591:5: lv_eitherA_6_0= 'either'
                    {
                    lv_eitherA_6_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_6_0, grammarAccess.getChainPrecedenceAccess().getEitherAEitherKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChainPrecedenceRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_6_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2603:3: ( (lv_refA_7_0= ruleRef ) )+
            int cnt84=0;
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( ((LA84_0>=25 && LA84_0<=26)) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalScl.g:2604:4: (lv_refA_7_0= ruleRef )
            	    {
            	    // InternalScl.g:2604:4: (lv_refA_7_0= ruleRef )
            	    // InternalScl.g:2605:5: lv_refA_7_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getChainPrecedenceAccess().getRefARefParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_64);
            	    lv_refA_7_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChainPrecedenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_7_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt84 >= 1 ) break loop84;
                        EarlyExitException eee =
                            new EarlyExitException(84, input);
                        throw eee;
                }
                cnt84++;
            } while (true);

            otherlv_8=(Token)match(input,66,FOLLOW_65); 

            			newLeafNode(otherlv_8, grammarAccess.getChainPrecedenceAccess().getMustKeyword_8());
            		
            // InternalScl.g:2626:3: ( (lv_not_9_0= 'not' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==67) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalScl.g:2627:4: (lv_not_9_0= 'not' )
                    {
                    // InternalScl.g:2627:4: (lv_not_9_0= 'not' )
                    // InternalScl.g:2628:5: lv_not_9_0= 'not'
                    {
                    lv_not_9_0=(Token)match(input,67,FOLLOW_66); 

                    					newLeafNode(lv_not_9_0, grammarAccess.getChainPrecedenceAccess().getNotNotKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChainPrecedenceRule());
                    					}
                    					setWithLastConsumed(current, "not", lv_not_9_0 != null, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,68,FOLLOW_67); 

            			newLeafNode(otherlv_10, grammarAccess.getChainPrecedenceAccess().getHaveOccurredImmediatelyBeforeKeyword_10());
            		
            // InternalScl.g:2644:3: (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==51) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalScl.g:2645:4: otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms'
                    {
                    otherlv_11=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getChainPrecedenceAccess().getWithinKeyword_11_0());
                    			
                    // InternalScl.g:2649:4: ( (lv_minVal_12_0= RULE_INT ) )
                    // InternalScl.g:2650:5: (lv_minVal_12_0= RULE_INT )
                    {
                    // InternalScl.g:2650:5: (lv_minVal_12_0= RULE_INT )
                    // InternalScl.g:2651:6: lv_minVal_12_0= RULE_INT
                    {
                    lv_minVal_12_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_minVal_12_0, grammarAccess.getChainPrecedenceAccess().getMinValINTTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChainPrecedenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minVal",
                    							lv_minVal_12_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalScl.g:2667:4: (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==52) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalScl.g:2668:5: otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) )
                            {
                            otherlv_13=(Token)match(input,52,FOLLOW_19); 

                            					newLeafNode(otherlv_13, grammarAccess.getChainPrecedenceAccess().getHyphenMinusKeyword_11_2_0());
                            				
                            // InternalScl.g:2672:5: ( (lv_maxVal_14_0= RULE_INT ) )
                            // InternalScl.g:2673:6: (lv_maxVal_14_0= RULE_INT )
                            {
                            // InternalScl.g:2673:6: (lv_maxVal_14_0= RULE_INT )
                            // InternalScl.g:2674:7: lv_maxVal_14_0= RULE_INT
                            {
                            lv_maxVal_14_0=(Token)match(input,RULE_INT,FOLLOW_51); 

                            							newLeafNode(lv_maxVal_14_0, grammarAccess.getChainPrecedenceAccess().getMaxValINTTerminalRuleCall_11_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getChainPrecedenceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"maxVal",
                            								lv_maxVal_14_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getChainPrecedenceAccess().getMsKeyword_11_3());
                    			

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
    // $ANTLR end "ruleChainPrecedence"


    // $ANTLR start "entryRuleChainResponse"
    // InternalScl.g:2700:1: entryRuleChainResponse returns [EObject current=null] : iv_ruleChainResponse= ruleChainResponse EOF ;
    public final EObject entryRuleChainResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChainResponse = null;


        try {
            // InternalScl.g:2700:54: (iv_ruleChainResponse= ruleChainResponse EOF )
            // InternalScl.g:2701:2: iv_ruleChainResponse= ruleChainResponse EOF
            {
             newCompositeNode(grammarAccess.getChainResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChainResponse=ruleChainResponse();

            state._fsp--;

             current =iv_ruleChainResponse; 
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
    // $ANTLR end "entryRuleChainResponse"


    // $ANTLR start "ruleChainResponse"
    // InternalScl.g:2707:1: ruleChainResponse returns [EObject current=null] : (otherlv_0= '>' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'immediately-follow' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? ) ;
    public final EObject ruleChainResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_eitherA_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_eitherB_6_0=null;
        Token otherlv_8=null;
        Token lv_not_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_minVal_12_0=null;
        Token otherlv_13=null;
        Token lv_maxVal_14_0=null;
        Token otherlv_15=null;
        EObject lv_refA_3_0 = null;

        EObject lv_refB_7_0 = null;



        	enterRule();

        try {
            // InternalScl.g:2713:2: ( (otherlv_0= '>' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'immediately-follow' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? ) )
            // InternalScl.g:2714:2: (otherlv_0= '>' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'immediately-follow' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? )
            {
            // InternalScl.g:2714:2: (otherlv_0= '>' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'immediately-follow' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? )
            // InternalScl.g:2715:3: otherlv_0= '>' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'immediately-follow' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )?
            {
            otherlv_0=(Token)match(input,69,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getChainResponseAccess().getGreaterThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,61,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getChainResponseAccess().getIfKeyword_1());
            		
            // InternalScl.g:2723:3: ( (lv_eitherA_2_0= 'either' ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==38) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalScl.g:2724:4: (lv_eitherA_2_0= 'either' )
                    {
                    // InternalScl.g:2724:4: (lv_eitherA_2_0= 'either' )
                    // InternalScl.g:2725:5: lv_eitherA_2_0= 'either'
                    {
                    lv_eitherA_2_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_2_0, grammarAccess.getChainResponseAccess().getEitherAEitherKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChainResponseRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_2_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2737:3: ( (lv_refA_3_0= ruleRef ) )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=25 && LA89_0<=26)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalScl.g:2738:4: (lv_refA_3_0= ruleRef )
            	    {
            	    // InternalScl.g:2738:4: (lv_refA_3_0= ruleRef )
            	    // InternalScl.g:2739:5: lv_refA_3_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getChainResponseAccess().getRefARefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_60);
            	    lv_refA_3_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChainResponseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_3_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
            } while (true);

            // InternalScl.g:2756:3: (otherlv_4= 'occurs' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==43) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalScl.g:2757:4: otherlv_4= 'occurs'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_61); 

                    				newLeafNode(otherlv_4, grammarAccess.getChainResponseAccess().getOccursKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,62,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getChainResponseAccess().getThenKeyword_5());
            		
            // InternalScl.g:2766:3: ( (lv_eitherB_6_0= 'either' ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==38) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalScl.g:2767:4: (lv_eitherB_6_0= 'either' )
                    {
                    // InternalScl.g:2767:4: (lv_eitherB_6_0= 'either' )
                    // InternalScl.g:2768:5: lv_eitherB_6_0= 'either'
                    {
                    lv_eitherB_6_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_6_0, grammarAccess.getChainResponseAccess().getEitherBEitherKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChainResponseRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_6_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2780:3: ( (lv_refB_7_0= ruleRef ) )+
            int cnt92=0;
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=25 && LA92_0<=26)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalScl.g:2781:4: (lv_refB_7_0= ruleRef )
            	    {
            	    // InternalScl.g:2781:4: (lv_refB_7_0= ruleRef )
            	    // InternalScl.g:2782:5: lv_refB_7_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getChainResponseAccess().getRefBRefParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_64);
            	    lv_refB_7_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChainResponseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refB",
            	    						lv_refB_7_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt92 >= 1 ) break loop92;
                        EarlyExitException eee =
                            new EarlyExitException(92, input);
                        throw eee;
                }
                cnt92++;
            } while (true);

            otherlv_8=(Token)match(input,66,FOLLOW_68); 

            			newLeafNode(otherlv_8, grammarAccess.getChainResponseAccess().getMustKeyword_8());
            		
            // InternalScl.g:2803:3: ( (lv_not_9_0= 'not' ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==67) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalScl.g:2804:4: (lv_not_9_0= 'not' )
                    {
                    // InternalScl.g:2804:4: (lv_not_9_0= 'not' )
                    // InternalScl.g:2805:5: lv_not_9_0= 'not'
                    {
                    lv_not_9_0=(Token)match(input,67,FOLLOW_69); 

                    					newLeafNode(lv_not_9_0, grammarAccess.getChainResponseAccess().getNotNotKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChainResponseRule());
                    					}
                    					setWithLastConsumed(current, "not", lv_not_9_0 != null, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,70,FOLLOW_67); 

            			newLeafNode(otherlv_10, grammarAccess.getChainResponseAccess().getImmediatelyFollowKeyword_10());
            		
            // InternalScl.g:2821:3: (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==51) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalScl.g:2822:4: otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms'
                    {
                    otherlv_11=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getChainResponseAccess().getWithinKeyword_11_0());
                    			
                    // InternalScl.g:2826:4: ( (lv_minVal_12_0= RULE_INT ) )
                    // InternalScl.g:2827:5: (lv_minVal_12_0= RULE_INT )
                    {
                    // InternalScl.g:2827:5: (lv_minVal_12_0= RULE_INT )
                    // InternalScl.g:2828:6: lv_minVal_12_0= RULE_INT
                    {
                    lv_minVal_12_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_minVal_12_0, grammarAccess.getChainResponseAccess().getMinValINTTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChainResponseRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minVal",
                    							lv_minVal_12_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalScl.g:2844:4: (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==52) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // InternalScl.g:2845:5: otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) )
                            {
                            otherlv_13=(Token)match(input,52,FOLLOW_19); 

                            					newLeafNode(otherlv_13, grammarAccess.getChainResponseAccess().getHyphenMinusKeyword_11_2_0());
                            				
                            // InternalScl.g:2849:5: ( (lv_maxVal_14_0= RULE_INT ) )
                            // InternalScl.g:2850:6: (lv_maxVal_14_0= RULE_INT )
                            {
                            // InternalScl.g:2850:6: (lv_maxVal_14_0= RULE_INT )
                            // InternalScl.g:2851:7: lv_maxVal_14_0= RULE_INT
                            {
                            lv_maxVal_14_0=(Token)match(input,RULE_INT,FOLLOW_51); 

                            							newLeafNode(lv_maxVal_14_0, grammarAccess.getChainResponseAccess().getMaxValINTTerminalRuleCall_11_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getChainResponseRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"maxVal",
                            								lv_maxVal_14_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getChainResponseAccess().getMsKeyword_11_3());
                    			

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
    // $ANTLR end "ruleChainResponse"


    // $ANTLR start "entryRuleAlternateResponse"
    // InternalScl.g:2877:1: entryRuleAlternateResponse returns [EObject current=null] : iv_ruleAlternateResponse= ruleAlternateResponse EOF ;
    public final EObject entryRuleAlternateResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternateResponse = null;


        try {
            // InternalScl.g:2877:58: (iv_ruleAlternateResponse= ruleAlternateResponse EOF )
            // InternalScl.g:2878:2: iv_ruleAlternateResponse= ruleAlternateResponse EOF
            {
             newCompositeNode(grammarAccess.getAlternateResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternateResponse=ruleAlternateResponse();

            state._fsp--;

             current =iv_ruleAlternateResponse; 
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
    // $ANTLR end "entryRuleAlternateResponse"


    // $ANTLR start "ruleAlternateResponse"
    // InternalScl.g:2884:1: ruleAlternateResponse returns [EObject current=null] : (otherlv_0= '!>' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must-follow' (otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms' )? otherlv_14= 'with' ( (lv_not_15_0= 'no' ) )? ( (lv_eitherC_16_0= 'either' ) )? ( (lv_refC_17_0= ruleRef ) )+ otherlv_18= 'in-between' ) ;
    public final EObject ruleAlternateResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_eitherA_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_eitherB_6_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_minVal_10_0=null;
        Token otherlv_11=null;
        Token lv_maxVal_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_not_15_0=null;
        Token lv_eitherC_16_0=null;
        Token otherlv_18=null;
        EObject lv_refA_3_0 = null;

        EObject lv_refB_7_0 = null;

        EObject lv_refC_17_0 = null;



        	enterRule();

        try {
            // InternalScl.g:2890:2: ( (otherlv_0= '!>' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must-follow' (otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms' )? otherlv_14= 'with' ( (lv_not_15_0= 'no' ) )? ( (lv_eitherC_16_0= 'either' ) )? ( (lv_refC_17_0= ruleRef ) )+ otherlv_18= 'in-between' ) )
            // InternalScl.g:2891:2: (otherlv_0= '!>' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must-follow' (otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms' )? otherlv_14= 'with' ( (lv_not_15_0= 'no' ) )? ( (lv_eitherC_16_0= 'either' ) )? ( (lv_refC_17_0= ruleRef ) )+ otherlv_18= 'in-between' )
            {
            // InternalScl.g:2891:2: (otherlv_0= '!>' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must-follow' (otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms' )? otherlv_14= 'with' ( (lv_not_15_0= 'no' ) )? ( (lv_eitherC_16_0= 'either' ) )? ( (lv_refC_17_0= ruleRef ) )+ otherlv_18= 'in-between' )
            // InternalScl.g:2892:3: otherlv_0= '!>' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must-follow' (otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms' )? otherlv_14= 'with' ( (lv_not_15_0= 'no' ) )? ( (lv_eitherC_16_0= 'either' ) )? ( (lv_refC_17_0= ruleRef ) )+ otherlv_18= 'in-between'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getAlternateResponseAccess().getExclamationMarkGreaterThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,61,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getAlternateResponseAccess().getIfKeyword_1());
            		
            // InternalScl.g:2900:3: ( (lv_eitherA_2_0= 'either' ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==38) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalScl.g:2901:4: (lv_eitherA_2_0= 'either' )
                    {
                    // InternalScl.g:2901:4: (lv_eitherA_2_0= 'either' )
                    // InternalScl.g:2902:5: lv_eitherA_2_0= 'either'
                    {
                    lv_eitherA_2_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_2_0, grammarAccess.getAlternateResponseAccess().getEitherAEitherKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternateResponseRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_2_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2914:3: ( (lv_refA_3_0= ruleRef ) )+
            int cnt97=0;
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=25 && LA97_0<=26)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalScl.g:2915:4: (lv_refA_3_0= ruleRef )
            	    {
            	    // InternalScl.g:2915:4: (lv_refA_3_0= ruleRef )
            	    // InternalScl.g:2916:5: lv_refA_3_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getAlternateResponseAccess().getRefARefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_60);
            	    lv_refA_3_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternateResponseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_3_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
            } while (true);

            // InternalScl.g:2933:3: (otherlv_4= 'occurs' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==43) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalScl.g:2934:4: otherlv_4= 'occurs'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_61); 

                    				newLeafNode(otherlv_4, grammarAccess.getAlternateResponseAccess().getOccursKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,62,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getAlternateResponseAccess().getThenKeyword_5());
            		
            // InternalScl.g:2943:3: ( (lv_eitherB_6_0= 'either' ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==38) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalScl.g:2944:4: (lv_eitherB_6_0= 'either' )
                    {
                    // InternalScl.g:2944:4: (lv_eitherB_6_0= 'either' )
                    // InternalScl.g:2945:5: lv_eitherB_6_0= 'either'
                    {
                    lv_eitherB_6_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_6_0, grammarAccess.getAlternateResponseAccess().getEitherBEitherKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternateResponseRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_6_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:2957:3: ( (lv_refB_7_0= ruleRef ) )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( ((LA100_0>=25 && LA100_0<=26)) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalScl.g:2958:4: (lv_refB_7_0= ruleRef )
            	    {
            	    // InternalScl.g:2958:4: (lv_refB_7_0= ruleRef )
            	    // InternalScl.g:2959:5: lv_refB_7_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getAlternateResponseAccess().getRefBRefParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_70);
            	    lv_refB_7_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternateResponseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refB",
            	    						lv_refB_7_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
            } while (true);

            otherlv_8=(Token)match(input,72,FOLLOW_71); 

            			newLeafNode(otherlv_8, grammarAccess.getAlternateResponseAccess().getMustFollowKeyword_8());
            		
            // InternalScl.g:2980:3: (otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==51) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalScl.g:2981:4: otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms'
                    {
                    otherlv_9=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getAlternateResponseAccess().getWithinKeyword_9_0());
                    			
                    // InternalScl.g:2985:4: ( (lv_minVal_10_0= RULE_INT ) )
                    // InternalScl.g:2986:5: (lv_minVal_10_0= RULE_INT )
                    {
                    // InternalScl.g:2986:5: (lv_minVal_10_0= RULE_INT )
                    // InternalScl.g:2987:6: lv_minVal_10_0= RULE_INT
                    {
                    lv_minVal_10_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_minVal_10_0, grammarAccess.getAlternateResponseAccess().getMinValINTTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlternateResponseRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minVal",
                    							lv_minVal_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalScl.g:3003:4: (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==52) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalScl.g:3004:5: otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) )
                            {
                            otherlv_11=(Token)match(input,52,FOLLOW_19); 

                            					newLeafNode(otherlv_11, grammarAccess.getAlternateResponseAccess().getHyphenMinusKeyword_9_2_0());
                            				
                            // InternalScl.g:3008:5: ( (lv_maxVal_12_0= RULE_INT ) )
                            // InternalScl.g:3009:6: (lv_maxVal_12_0= RULE_INT )
                            {
                            // InternalScl.g:3009:6: (lv_maxVal_12_0= RULE_INT )
                            // InternalScl.g:3010:7: lv_maxVal_12_0= RULE_INT
                            {
                            lv_maxVal_12_0=(Token)match(input,RULE_INT,FOLLOW_51); 

                            							newLeafNode(lv_maxVal_12_0, grammarAccess.getAlternateResponseAccess().getMaxValINTTerminalRuleCall_9_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAlternateResponseRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"maxVal",
                            								lv_maxVal_12_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,53,FOLLOW_72); 

                    				newLeafNode(otherlv_13, grammarAccess.getAlternateResponseAccess().getMsKeyword_9_3());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,29,FOLLOW_55); 

            			newLeafNode(otherlv_14, grammarAccess.getAlternateResponseAccess().getWithKeyword_10());
            		
            // InternalScl.g:3036:3: ( (lv_not_15_0= 'no' ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==56) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalScl.g:3037:4: (lv_not_15_0= 'no' )
                    {
                    // InternalScl.g:3037:4: (lv_not_15_0= 'no' )
                    // InternalScl.g:3038:5: lv_not_15_0= 'no'
                    {
                    lv_not_15_0=(Token)match(input,56,FOLLOW_36); 

                    					newLeafNode(lv_not_15_0, grammarAccess.getAlternateResponseAccess().getNotNoKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternateResponseRule());
                    					}
                    					setWithLastConsumed(current, "not", lv_not_15_0 != null, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:3050:3: ( (lv_eitherC_16_0= 'either' ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==38) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalScl.g:3051:4: (lv_eitherC_16_0= 'either' )
                    {
                    // InternalScl.g:3051:4: (lv_eitherC_16_0= 'either' )
                    // InternalScl.g:3052:5: lv_eitherC_16_0= 'either'
                    {
                    lv_eitherC_16_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherC_16_0, grammarAccess.getAlternateResponseAccess().getEitherCEitherKeyword_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternateResponseRule());
                    					}
                    					setWithLastConsumed(current, "eitherC", lv_eitherC_16_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:3064:3: ( (lv_refC_17_0= ruleRef ) )+
            int cnt105=0;
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( ((LA105_0>=25 && LA105_0<=26)) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalScl.g:3065:4: (lv_refC_17_0= ruleRef )
            	    {
            	    // InternalScl.g:3065:4: (lv_refC_17_0= ruleRef )
            	    // InternalScl.g:3066:5: lv_refC_17_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getAlternateResponseAccess().getRefCRefParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_57);
            	    lv_refC_17_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternateResponseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refC",
            	    						lv_refC_17_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt105 >= 1 ) break loop105;
                        EarlyExitException eee =
                            new EarlyExitException(105, input);
                        throw eee;
                }
                cnt105++;
            } while (true);

            otherlv_18=(Token)match(input,57,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getAlternateResponseAccess().getInBetweenKeyword_14());
            		

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
    // $ANTLR end "ruleAlternateResponse"


    // $ANTLR start "entryRuleAlternatePrecedence"
    // InternalScl.g:3091:1: entryRuleAlternatePrecedence returns [EObject current=null] : iv_ruleAlternatePrecedence= ruleAlternatePrecedence EOF ;
    public final EObject entryRuleAlternatePrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatePrecedence = null;


        try {
            // InternalScl.g:3091:60: (iv_ruleAlternatePrecedence= ruleAlternatePrecedence EOF )
            // InternalScl.g:3092:2: iv_ruleAlternatePrecedence= ruleAlternatePrecedence EOF
            {
             newCompositeNode(grammarAccess.getAlternatePrecedenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternatePrecedence=ruleAlternatePrecedence();

            state._fsp--;

             current =iv_ruleAlternatePrecedence; 
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
    // $ANTLR end "entryRuleAlternatePrecedence"


    // $ANTLR start "ruleAlternatePrecedence"
    // InternalScl.g:3098:1: ruleAlternatePrecedence returns [EObject current=null] : (otherlv_0= '<!' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) ) (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) ) otherlv_8= 'must-have-occurred' (otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms' )? otherlv_14= 'with' ( (lv_not_15_0= 'no' ) )? ( (lv_eitherC_16_0= 'either' ) )? ( (lv_refC_17_0= ruleRef ) ) otherlv_18= 'in-between' ) ;
    public final EObject ruleAlternatePrecedence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_eitherB_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_eitherA_6_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_minVal_10_0=null;
        Token otherlv_11=null;
        Token lv_maxVal_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_not_15_0=null;
        Token lv_eitherC_16_0=null;
        Token otherlv_18=null;
        EObject lv_refB_3_0 = null;

        EObject lv_refA_7_0 = null;

        EObject lv_refC_17_0 = null;



        	enterRule();

        try {
            // InternalScl.g:3104:2: ( (otherlv_0= '<!' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) ) (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) ) otherlv_8= 'must-have-occurred' (otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms' )? otherlv_14= 'with' ( (lv_not_15_0= 'no' ) )? ( (lv_eitherC_16_0= 'either' ) )? ( (lv_refC_17_0= ruleRef ) ) otherlv_18= 'in-between' ) )
            // InternalScl.g:3105:2: (otherlv_0= '<!' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) ) (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) ) otherlv_8= 'must-have-occurred' (otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms' )? otherlv_14= 'with' ( (lv_not_15_0= 'no' ) )? ( (lv_eitherC_16_0= 'either' ) )? ( (lv_refC_17_0= ruleRef ) ) otherlv_18= 'in-between' )
            {
            // InternalScl.g:3105:2: (otherlv_0= '<!' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) ) (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) ) otherlv_8= 'must-have-occurred' (otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms' )? otherlv_14= 'with' ( (lv_not_15_0= 'no' ) )? ( (lv_eitherC_16_0= 'either' ) )? ( (lv_refC_17_0= ruleRef ) ) otherlv_18= 'in-between' )
            // InternalScl.g:3106:3: otherlv_0= '<!' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) ) (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) ) otherlv_8= 'must-have-occurred' (otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms' )? otherlv_14= 'with' ( (lv_not_15_0= 'no' ) )? ( (lv_eitherC_16_0= 'either' ) )? ( (lv_refC_17_0= ruleRef ) ) otherlv_18= 'in-between'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getAlternatePrecedenceAccess().getLessThanSignExclamationMarkKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getAlternatePrecedenceAccess().getWheneverKeyword_1());
            		
            // InternalScl.g:3114:3: ( (lv_eitherB_2_0= 'either' ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==38) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalScl.g:3115:4: (lv_eitherB_2_0= 'either' )
                    {
                    // InternalScl.g:3115:4: (lv_eitherB_2_0= 'either' )
                    // InternalScl.g:3116:5: lv_eitherB_2_0= 'either'
                    {
                    lv_eitherB_2_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_2_0, grammarAccess.getAlternatePrecedenceAccess().getEitherBEitherKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternatePrecedenceRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_2_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:3128:3: ( (lv_refB_3_0= ruleRef ) )
            // InternalScl.g:3129:4: (lv_refB_3_0= ruleRef )
            {
            // InternalScl.g:3129:4: (lv_refB_3_0= ruleRef )
            // InternalScl.g:3130:5: lv_refB_3_0= ruleRef
            {

            					newCompositeNode(grammarAccess.getAlternatePrecedenceAccess().getRefBRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_73);
            lv_refB_3_0=ruleRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlternatePrecedenceRule());
            					}
            					add(
            						current,
            						"refB",
            						lv_refB_3_0,
            						"nl.esi.comma.behavior.scl.Scl.Ref");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScl.g:3147:3: (otherlv_4= 'occurs' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==43) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalScl.g:3148:4: otherlv_4= 'occurs'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_61); 

                    				newLeafNode(otherlv_4, grammarAccess.getAlternatePrecedenceAccess().getOccursKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,62,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getAlternatePrecedenceAccess().getThenKeyword_5());
            		
            // InternalScl.g:3157:3: ( (lv_eitherA_6_0= 'either' ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==38) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalScl.g:3158:4: (lv_eitherA_6_0= 'either' )
                    {
                    // InternalScl.g:3158:4: (lv_eitherA_6_0= 'either' )
                    // InternalScl.g:3159:5: lv_eitherA_6_0= 'either'
                    {
                    lv_eitherA_6_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_6_0, grammarAccess.getAlternatePrecedenceAccess().getEitherAEitherKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternatePrecedenceRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_6_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:3171:3: ( (lv_refA_7_0= ruleRef ) )
            // InternalScl.g:3172:4: (lv_refA_7_0= ruleRef )
            {
            // InternalScl.g:3172:4: (lv_refA_7_0= ruleRef )
            // InternalScl.g:3173:5: lv_refA_7_0= ruleRef
            {

            					newCompositeNode(grammarAccess.getAlternatePrecedenceAccess().getRefARefParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_74);
            lv_refA_7_0=ruleRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlternatePrecedenceRule());
            					}
            					add(
            						current,
            						"refA",
            						lv_refA_7_0,
            						"nl.esi.comma.behavior.scl.Scl.Ref");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,74,FOLLOW_71); 

            			newLeafNode(otherlv_8, grammarAccess.getAlternatePrecedenceAccess().getMustHaveOccurredKeyword_8());
            		
            // InternalScl.g:3194:3: (otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==51) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalScl.g:3195:4: otherlv_9= 'within' ( (lv_minVal_10_0= RULE_INT ) ) (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )? otherlv_13= 'ms'
                    {
                    otherlv_9=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getAlternatePrecedenceAccess().getWithinKeyword_9_0());
                    			
                    // InternalScl.g:3199:4: ( (lv_minVal_10_0= RULE_INT ) )
                    // InternalScl.g:3200:5: (lv_minVal_10_0= RULE_INT )
                    {
                    // InternalScl.g:3200:5: (lv_minVal_10_0= RULE_INT )
                    // InternalScl.g:3201:6: lv_minVal_10_0= RULE_INT
                    {
                    lv_minVal_10_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_minVal_10_0, grammarAccess.getAlternatePrecedenceAccess().getMinValINTTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlternatePrecedenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minVal",
                    							lv_minVal_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalScl.g:3217:4: (otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) ) )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==52) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // InternalScl.g:3218:5: otherlv_11= '-' ( (lv_maxVal_12_0= RULE_INT ) )
                            {
                            otherlv_11=(Token)match(input,52,FOLLOW_19); 

                            					newLeafNode(otherlv_11, grammarAccess.getAlternatePrecedenceAccess().getHyphenMinusKeyword_9_2_0());
                            				
                            // InternalScl.g:3222:5: ( (lv_maxVal_12_0= RULE_INT ) )
                            // InternalScl.g:3223:6: (lv_maxVal_12_0= RULE_INT )
                            {
                            // InternalScl.g:3223:6: (lv_maxVal_12_0= RULE_INT )
                            // InternalScl.g:3224:7: lv_maxVal_12_0= RULE_INT
                            {
                            lv_maxVal_12_0=(Token)match(input,RULE_INT,FOLLOW_51); 

                            							newLeafNode(lv_maxVal_12_0, grammarAccess.getAlternatePrecedenceAccess().getMaxValINTTerminalRuleCall_9_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAlternatePrecedenceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"maxVal",
                            								lv_maxVal_12_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,53,FOLLOW_72); 

                    				newLeafNode(otherlv_13, grammarAccess.getAlternatePrecedenceAccess().getMsKeyword_9_3());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,29,FOLLOW_55); 

            			newLeafNode(otherlv_14, grammarAccess.getAlternatePrecedenceAccess().getWithKeyword_10());
            		
            // InternalScl.g:3250:3: ( (lv_not_15_0= 'no' ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==56) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalScl.g:3251:4: (lv_not_15_0= 'no' )
                    {
                    // InternalScl.g:3251:4: (lv_not_15_0= 'no' )
                    // InternalScl.g:3252:5: lv_not_15_0= 'no'
                    {
                    lv_not_15_0=(Token)match(input,56,FOLLOW_36); 

                    					newLeafNode(lv_not_15_0, grammarAccess.getAlternatePrecedenceAccess().getNotNoKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternatePrecedenceRule());
                    					}
                    					setWithLastConsumed(current, "not", lv_not_15_0 != null, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:3264:3: ( (lv_eitherC_16_0= 'either' ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==38) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalScl.g:3265:4: (lv_eitherC_16_0= 'either' )
                    {
                    // InternalScl.g:3265:4: (lv_eitherC_16_0= 'either' )
                    // InternalScl.g:3266:5: lv_eitherC_16_0= 'either'
                    {
                    lv_eitherC_16_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherC_16_0, grammarAccess.getAlternatePrecedenceAccess().getEitherCEitherKeyword_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternatePrecedenceRule());
                    					}
                    					setWithLastConsumed(current, "eitherC", lv_eitherC_16_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:3278:3: ( (lv_refC_17_0= ruleRef ) )
            // InternalScl.g:3279:4: (lv_refC_17_0= ruleRef )
            {
            // InternalScl.g:3279:4: (lv_refC_17_0= ruleRef )
            // InternalScl.g:3280:5: lv_refC_17_0= ruleRef
            {

            					newCompositeNode(grammarAccess.getAlternatePrecedenceAccess().getRefCRefParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_75);
            lv_refC_17_0=ruleRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlternatePrecedenceRule());
            					}
            					add(
            						current,
            						"refC",
            						lv_refC_17_0,
            						"nl.esi.comma.behavior.scl.Scl.Ref");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,57,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getAlternatePrecedenceAccess().getInBetweenKeyword_14());
            		

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
    // $ANTLR end "ruleAlternatePrecedence"


    // $ANTLR start "entryRuleResponse"
    // InternalScl.g:3305:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalScl.g:3305:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalScl.g:3306:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse; 
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
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalScl.g:3312:1: ruleResponse returns [EObject current=null] : (otherlv_0= '->' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'eventually-follow' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_eitherA_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_eitherB_6_0=null;
        Token otherlv_8=null;
        Token lv_not_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_minVal_12_0=null;
        Token otherlv_13=null;
        Token lv_maxVal_14_0=null;
        Token otherlv_15=null;
        EObject lv_refA_3_0 = null;

        EObject lv_refB_7_0 = null;



        	enterRule();

        try {
            // InternalScl.g:3318:2: ( (otherlv_0= '->' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'eventually-follow' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? ) )
            // InternalScl.g:3319:2: (otherlv_0= '->' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'eventually-follow' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? )
            {
            // InternalScl.g:3319:2: (otherlv_0= '->' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'eventually-follow' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? )
            // InternalScl.g:3320:3: otherlv_0= '->' otherlv_1= 'if' ( (lv_eitherA_2_0= 'either' ) )? ( (lv_refA_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherB_6_0= 'either' ) )? ( (lv_refB_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'eventually-follow' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )?
            {
            otherlv_0=(Token)match(input,75,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getResponseAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,61,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getIfKeyword_1());
            		
            // InternalScl.g:3328:3: ( (lv_eitherA_2_0= 'either' ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==38) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalScl.g:3329:4: (lv_eitherA_2_0= 'either' )
                    {
                    // InternalScl.g:3329:4: (lv_eitherA_2_0= 'either' )
                    // InternalScl.g:3330:5: lv_eitherA_2_0= 'either'
                    {
                    lv_eitherA_2_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_2_0, grammarAccess.getResponseAccess().getEitherAEitherKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResponseRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_2_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:3342:3: ( (lv_refA_3_0= ruleRef ) )+
            int cnt114=0;
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( ((LA114_0>=25 && LA114_0<=26)) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalScl.g:3343:4: (lv_refA_3_0= ruleRef )
            	    {
            	    // InternalScl.g:3343:4: (lv_refA_3_0= ruleRef )
            	    // InternalScl.g:3344:5: lv_refA_3_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getResponseAccess().getRefARefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_60);
            	    lv_refA_3_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResponseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_3_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt114 >= 1 ) break loop114;
                        EarlyExitException eee =
                            new EarlyExitException(114, input);
                        throw eee;
                }
                cnt114++;
            } while (true);

            // InternalScl.g:3361:3: (otherlv_4= 'occurs' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==43) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalScl.g:3362:4: otherlv_4= 'occurs'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_61); 

                    				newLeafNode(otherlv_4, grammarAccess.getResponseAccess().getOccursKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,62,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getResponseAccess().getThenKeyword_5());
            		
            // InternalScl.g:3371:3: ( (lv_eitherB_6_0= 'either' ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==38) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalScl.g:3372:4: (lv_eitherB_6_0= 'either' )
                    {
                    // InternalScl.g:3372:4: (lv_eitherB_6_0= 'either' )
                    // InternalScl.g:3373:5: lv_eitherB_6_0= 'either'
                    {
                    lv_eitherB_6_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_6_0, grammarAccess.getResponseAccess().getEitherBEitherKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResponseRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_6_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:3385:3: ( (lv_refB_7_0= ruleRef ) )+
            int cnt117=0;
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( ((LA117_0>=25 && LA117_0<=26)) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalScl.g:3386:4: (lv_refB_7_0= ruleRef )
            	    {
            	    // InternalScl.g:3386:4: (lv_refB_7_0= ruleRef )
            	    // InternalScl.g:3387:5: lv_refB_7_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getResponseAccess().getRefBRefParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_64);
            	    lv_refB_7_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResponseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refB",
            	    						lv_refB_7_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt117 >= 1 ) break loop117;
                        EarlyExitException eee =
                            new EarlyExitException(117, input);
                        throw eee;
                }
                cnt117++;
            } while (true);

            otherlv_8=(Token)match(input,66,FOLLOW_76); 

            			newLeafNode(otherlv_8, grammarAccess.getResponseAccess().getMustKeyword_8());
            		
            // InternalScl.g:3408:3: ( (lv_not_9_0= 'not' ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==67) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalScl.g:3409:4: (lv_not_9_0= 'not' )
                    {
                    // InternalScl.g:3409:4: (lv_not_9_0= 'not' )
                    // InternalScl.g:3410:5: lv_not_9_0= 'not'
                    {
                    lv_not_9_0=(Token)match(input,67,FOLLOW_77); 

                    					newLeafNode(lv_not_9_0, grammarAccess.getResponseAccess().getNotNotKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResponseRule());
                    					}
                    					setWithLastConsumed(current, "not", lv_not_9_0 != null, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,76,FOLLOW_67); 

            			newLeafNode(otherlv_10, grammarAccess.getResponseAccess().getEventuallyFollowKeyword_10());
            		
            // InternalScl.g:3426:3: (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==51) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalScl.g:3427:4: otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms'
                    {
                    otherlv_11=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getResponseAccess().getWithinKeyword_11_0());
                    			
                    // InternalScl.g:3431:4: ( (lv_minVal_12_0= RULE_INT ) )
                    // InternalScl.g:3432:5: (lv_minVal_12_0= RULE_INT )
                    {
                    // InternalScl.g:3432:5: (lv_minVal_12_0= RULE_INT )
                    // InternalScl.g:3433:6: lv_minVal_12_0= RULE_INT
                    {
                    lv_minVal_12_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_minVal_12_0, grammarAccess.getResponseAccess().getMinValINTTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minVal",
                    							lv_minVal_12_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalScl.g:3449:4: (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==52) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // InternalScl.g:3450:5: otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) )
                            {
                            otherlv_13=(Token)match(input,52,FOLLOW_19); 

                            					newLeafNode(otherlv_13, grammarAccess.getResponseAccess().getHyphenMinusKeyword_11_2_0());
                            				
                            // InternalScl.g:3454:5: ( (lv_maxVal_14_0= RULE_INT ) )
                            // InternalScl.g:3455:6: (lv_maxVal_14_0= RULE_INT )
                            {
                            // InternalScl.g:3455:6: (lv_maxVal_14_0= RULE_INT )
                            // InternalScl.g:3456:7: lv_maxVal_14_0= RULE_INT
                            {
                            lv_maxVal_14_0=(Token)match(input,RULE_INT,FOLLOW_51); 

                            							newLeafNode(lv_maxVal_14_0, grammarAccess.getResponseAccess().getMaxValINTTerminalRuleCall_11_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getResponseRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"maxVal",
                            								lv_maxVal_14_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getResponseAccess().getMsKeyword_11_3());
                    			

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
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRulePrecedence"
    // InternalScl.g:3482:1: entryRulePrecedence returns [EObject current=null] : iv_rulePrecedence= rulePrecedence EOF ;
    public final EObject entryRulePrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedence = null;


        try {
            // InternalScl.g:3482:51: (iv_rulePrecedence= rulePrecedence EOF )
            // InternalScl.g:3483:2: iv_rulePrecedence= rulePrecedence EOF
            {
             newCompositeNode(grammarAccess.getPrecedenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecedence=rulePrecedence();

            state._fsp--;

             current =iv_rulePrecedence; 
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
    // $ANTLR end "entryRulePrecedence"


    // $ANTLR start "rulePrecedence"
    // InternalScl.g:3489:1: rulePrecedence returns [EObject current=null] : (otherlv_0= '<-' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'have-occurred-before' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? ) ;
    public final EObject rulePrecedence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_eitherB_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_eitherA_6_0=null;
        Token otherlv_8=null;
        Token lv_not_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_minVal_12_0=null;
        Token otherlv_13=null;
        Token lv_maxVal_14_0=null;
        Token otherlv_15=null;
        EObject lv_refB_3_0 = null;

        EObject lv_refA_7_0 = null;



        	enterRule();

        try {
            // InternalScl.g:3495:2: ( (otherlv_0= '<-' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'have-occurred-before' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? ) )
            // InternalScl.g:3496:2: (otherlv_0= '<-' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'have-occurred-before' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? )
            {
            // InternalScl.g:3496:2: (otherlv_0= '<-' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'have-occurred-before' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )? )
            // InternalScl.g:3497:3: otherlv_0= '<-' otherlv_1= 'whenever' ( (lv_eitherB_2_0= 'either' ) )? ( (lv_refB_3_0= ruleRef ) )+ (otherlv_4= 'occurs' )? otherlv_5= 'then' ( (lv_eitherA_6_0= 'either' ) )? ( (lv_refA_7_0= ruleRef ) )+ otherlv_8= 'must' ( (lv_not_9_0= 'not' ) )? otherlv_10= 'have-occurred-before' (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )?
            {
            otherlv_0=(Token)match(input,77,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getPrecedenceAccess().getLessThanSignHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getPrecedenceAccess().getWheneverKeyword_1());
            		
            // InternalScl.g:3505:3: ( (lv_eitherB_2_0= 'either' ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==38) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalScl.g:3506:4: (lv_eitherB_2_0= 'either' )
                    {
                    // InternalScl.g:3506:4: (lv_eitherB_2_0= 'either' )
                    // InternalScl.g:3507:5: lv_eitherB_2_0= 'either'
                    {
                    lv_eitherB_2_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherB_2_0, grammarAccess.getPrecedenceAccess().getEitherBEitherKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrecedenceRule());
                    					}
                    					setWithLastConsumed(current, "eitherB", lv_eitherB_2_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:3519:3: ( (lv_refB_3_0= ruleRef ) )+
            int cnt122=0;
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( ((LA122_0>=25 && LA122_0<=26)) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // InternalScl.g:3520:4: (lv_refB_3_0= ruleRef )
            	    {
            	    // InternalScl.g:3520:4: (lv_refB_3_0= ruleRef )
            	    // InternalScl.g:3521:5: lv_refB_3_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getPrecedenceAccess().getRefBRefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_60);
            	    lv_refB_3_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPrecedenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refB",
            	    						lv_refB_3_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt122 >= 1 ) break loop122;
                        EarlyExitException eee =
                            new EarlyExitException(122, input);
                        throw eee;
                }
                cnt122++;
            } while (true);

            // InternalScl.g:3538:3: (otherlv_4= 'occurs' )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==43) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalScl.g:3539:4: otherlv_4= 'occurs'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_61); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrecedenceAccess().getOccursKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,62,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getPrecedenceAccess().getThenKeyword_5());
            		
            // InternalScl.g:3548:3: ( (lv_eitherA_6_0= 'either' ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==38) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalScl.g:3549:4: (lv_eitherA_6_0= 'either' )
                    {
                    // InternalScl.g:3549:4: (lv_eitherA_6_0= 'either' )
                    // InternalScl.g:3550:5: lv_eitherA_6_0= 'either'
                    {
                    lv_eitherA_6_0=(Token)match(input,38,FOLLOW_38); 

                    					newLeafNode(lv_eitherA_6_0, grammarAccess.getPrecedenceAccess().getEitherAEitherKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrecedenceRule());
                    					}
                    					setWithLastConsumed(current, "eitherA", lv_eitherA_6_0 != null, "either");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:3562:3: ( (lv_refA_7_0= ruleRef ) )+
            int cnt125=0;
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( ((LA125_0>=25 && LA125_0<=26)) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalScl.g:3563:4: (lv_refA_7_0= ruleRef )
            	    {
            	    // InternalScl.g:3563:4: (lv_refA_7_0= ruleRef )
            	    // InternalScl.g:3564:5: lv_refA_7_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getPrecedenceAccess().getRefARefParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_64);
            	    lv_refA_7_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPrecedenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"refA",
            	    						lv_refA_7_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt125 >= 1 ) break loop125;
                        EarlyExitException eee =
                            new EarlyExitException(125, input);
                        throw eee;
                }
                cnt125++;
            } while (true);

            otherlv_8=(Token)match(input,66,FOLLOW_78); 

            			newLeafNode(otherlv_8, grammarAccess.getPrecedenceAccess().getMustKeyword_8());
            		
            // InternalScl.g:3585:3: ( (lv_not_9_0= 'not' ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==67) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalScl.g:3586:4: (lv_not_9_0= 'not' )
                    {
                    // InternalScl.g:3586:4: (lv_not_9_0= 'not' )
                    // InternalScl.g:3587:5: lv_not_9_0= 'not'
                    {
                    lv_not_9_0=(Token)match(input,67,FOLLOW_79); 

                    					newLeafNode(lv_not_9_0, grammarAccess.getPrecedenceAccess().getNotNotKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrecedenceRule());
                    					}
                    					setWithLastConsumed(current, "not", lv_not_9_0 != null, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,78,FOLLOW_67); 

            			newLeafNode(otherlv_10, grammarAccess.getPrecedenceAccess().getHaveOccurredBeforeKeyword_10());
            		
            // InternalScl.g:3603:3: (otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==51) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalScl.g:3604:4: otherlv_11= 'within' ( (lv_minVal_12_0= RULE_INT ) ) (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )? otherlv_15= 'ms'
                    {
                    otherlv_11=(Token)match(input,51,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrecedenceAccess().getWithinKeyword_11_0());
                    			
                    // InternalScl.g:3608:4: ( (lv_minVal_12_0= RULE_INT ) )
                    // InternalScl.g:3609:5: (lv_minVal_12_0= RULE_INT )
                    {
                    // InternalScl.g:3609:5: (lv_minVal_12_0= RULE_INT )
                    // InternalScl.g:3610:6: lv_minVal_12_0= RULE_INT
                    {
                    lv_minVal_12_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_minVal_12_0, grammarAccess.getPrecedenceAccess().getMinValINTTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrecedenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minVal",
                    							lv_minVal_12_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalScl.g:3626:4: (otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) ) )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==52) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // InternalScl.g:3627:5: otherlv_13= '-' ( (lv_maxVal_14_0= RULE_INT ) )
                            {
                            otherlv_13=(Token)match(input,52,FOLLOW_19); 

                            					newLeafNode(otherlv_13, grammarAccess.getPrecedenceAccess().getHyphenMinusKeyword_11_2_0());
                            				
                            // InternalScl.g:3631:5: ( (lv_maxVal_14_0= RULE_INT ) )
                            // InternalScl.g:3632:6: (lv_maxVal_14_0= RULE_INT )
                            {
                            // InternalScl.g:3632:6: (lv_maxVal_14_0= RULE_INT )
                            // InternalScl.g:3633:7: lv_maxVal_14_0= RULE_INT
                            {
                            lv_maxVal_14_0=(Token)match(input,RULE_INT,FOLLOW_51); 

                            							newLeafNode(lv_maxVal_14_0, grammarAccess.getPrecedenceAccess().getMaxValINTTerminalRuleCall_11_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrecedenceRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"maxVal",
                            								lv_maxVal_14_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrecedenceAccess().getMsKeyword_11_3());
                    			

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
    // $ANTLR end "rulePrecedence"


    // $ANTLR start "entryRuleEnd"
    // InternalScl.g:3659:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalScl.g:3659:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalScl.g:3660:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
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
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalScl.g:3666:1: ruleEnd returns [EObject current=null] : ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-last' ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ref_0_0 = null;



        	enterRule();

        try {
            // InternalScl.g:3672:2: ( ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-last' ) )
            // InternalScl.g:3673:2: ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-last' )
            {
            // InternalScl.g:3673:2: ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-last' )
            // InternalScl.g:3674:3: ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-last'
            {
            // InternalScl.g:3674:3: ( (lv_ref_0_0= ruleRef ) )+
            int cnt129=0;
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( ((LA129_0>=25 && LA129_0<=26)) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // InternalScl.g:3675:4: (lv_ref_0_0= ruleRef )
            	    {
            	    // InternalScl.g:3675:4: (lv_ref_0_0= ruleRef )
            	    // InternalScl.g:3676:5: lv_ref_0_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getEndAccess().getRefRefParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_80);
            	    lv_ref_0_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEndRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ref",
            	    						lv_ref_0_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt129 >= 1 ) break loop129;
                        EarlyExitException eee =
                            new EarlyExitException(129, input);
                        throw eee;
                }
                cnt129++;
            } while (true);

            otherlv_1=(Token)match(input,79,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEndAccess().getOccursLastKeyword_1());
            		

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
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleInit"
    // InternalScl.g:3701:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // InternalScl.g:3701:45: (iv_ruleInit= ruleInit EOF )
            // InternalScl.g:3702:2: iv_ruleInit= ruleInit EOF
            {
             newCompositeNode(grammarAccess.getInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInit=ruleInit();

            state._fsp--;

             current =iv_ruleInit; 
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
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalScl.g:3708:1: ruleInit returns [EObject current=null] : ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-first' ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ref_0_0 = null;



        	enterRule();

        try {
            // InternalScl.g:3714:2: ( ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-first' ) )
            // InternalScl.g:3715:2: ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-first' )
            {
            // InternalScl.g:3715:2: ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-first' )
            // InternalScl.g:3716:3: ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-first'
            {
            // InternalScl.g:3716:3: ( (lv_ref_0_0= ruleRef ) )+
            int cnt130=0;
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( ((LA130_0>=25 && LA130_0<=26)) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // InternalScl.g:3717:4: (lv_ref_0_0= ruleRef )
            	    {
            	    // InternalScl.g:3717:4: (lv_ref_0_0= ruleRef )
            	    // InternalScl.g:3718:5: lv_ref_0_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getInitAccess().getRefRefParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_81);
            	    lv_ref_0_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ref",
            	    						lv_ref_0_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt130 >= 1 ) break loop130;
                        EarlyExitException eee =
                            new EarlyExitException(130, input);
                        throw eee;
                }
                cnt130++;
            } while (true);

            otherlv_1=(Token)match(input,80,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInitAccess().getOccursFirstKeyword_1());
            		

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
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleAtMost"
    // InternalScl.g:3743:1: entryRuleAtMost returns [EObject current=null] : iv_ruleAtMost= ruleAtMost EOF ;
    public final EObject entryRuleAtMost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtMost = null;


        try {
            // InternalScl.g:3743:47: (iv_ruleAtMost= ruleAtMost EOF )
            // InternalScl.g:3744:2: iv_ruleAtMost= ruleAtMost EOF
            {
             newCompositeNode(grammarAccess.getAtMostRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtMost=ruleAtMost();

            state._fsp--;

             current =iv_ruleAtMost; 
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
    // $ANTLR end "entryRuleAtMost"


    // $ANTLR start "ruleAtMost"
    // InternalScl.g:3750:1: ruleAtMost returns [EObject current=null] : ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-at-most' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' ) ;
    public final EObject ruleAtMost() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_num_2_0=null;
        Token otherlv_3=null;
        EObject lv_ref_0_0 = null;



        	enterRule();

        try {
            // InternalScl.g:3756:2: ( ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-at-most' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' ) )
            // InternalScl.g:3757:2: ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-at-most' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' )
            {
            // InternalScl.g:3757:2: ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-at-most' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' )
            // InternalScl.g:3758:3: ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-at-most' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times'
            {
            // InternalScl.g:3758:3: ( (lv_ref_0_0= ruleRef ) )+
            int cnt131=0;
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( ((LA131_0>=25 && LA131_0<=26)) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // InternalScl.g:3759:4: (lv_ref_0_0= ruleRef )
            	    {
            	    // InternalScl.g:3759:4: (lv_ref_0_0= ruleRef )
            	    // InternalScl.g:3760:5: lv_ref_0_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getAtMostAccess().getRefRefParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_82);
            	    lv_ref_0_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAtMostRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ref",
            	    						lv_ref_0_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt131 >= 1 ) break loop131;
                        EarlyExitException eee =
                            new EarlyExitException(131, input);
                        throw eee;
                }
                cnt131++;
            } while (true);

            otherlv_1=(Token)match(input,81,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAtMostAccess().getOccursAtMostKeyword_1());
            		
            // InternalScl.g:3781:3: ( (lv_num_2_0= RULE_INT ) )
            // InternalScl.g:3782:4: (lv_num_2_0= RULE_INT )
            {
            // InternalScl.g:3782:4: (lv_num_2_0= RULE_INT )
            // InternalScl.g:3783:5: lv_num_2_0= RULE_INT
            {
            lv_num_2_0=(Token)match(input,RULE_INT,FOLLOW_83); 

            					newLeafNode(lv_num_2_0, grammarAccess.getAtMostAccess().getNumINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtMostRule());
            					}
            					setWithLastConsumed(
            						current,
            						"num",
            						lv_num_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,82,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAtMostAccess().getTimesKeyword_3());
            		

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
    // $ANTLR end "ruleAtMost"


    // $ANTLR start "entryRuleExact"
    // InternalScl.g:3807:1: entryRuleExact returns [EObject current=null] : iv_ruleExact= ruleExact EOF ;
    public final EObject entryRuleExact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExact = null;


        try {
            // InternalScl.g:3807:46: (iv_ruleExact= ruleExact EOF )
            // InternalScl.g:3808:2: iv_ruleExact= ruleExact EOF
            {
             newCompositeNode(grammarAccess.getExactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExact=ruleExact();

            state._fsp--;

             current =iv_ruleExact; 
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
    // $ANTLR end "entryRuleExact"


    // $ANTLR start "ruleExact"
    // InternalScl.g:3814:1: ruleExact returns [EObject current=null] : ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-exactly' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' ( (lv_consecutively_4_0= 'consecutively' ) )? (otherlv_5= 'with-periodicity-of' ( (lv_minVal_6_0= RULE_INT ) ) (otherlv_7= '-' ( (lv_maxVal_8_0= RULE_INT ) ) )? otherlv_9= 'ms' )? ) ;
    public final EObject ruleExact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_num_2_0=null;
        Token otherlv_3=null;
        Token lv_consecutively_4_0=null;
        Token otherlv_5=null;
        Token lv_minVal_6_0=null;
        Token otherlv_7=null;
        Token lv_maxVal_8_0=null;
        Token otherlv_9=null;
        EObject lv_ref_0_0 = null;



        	enterRule();

        try {
            // InternalScl.g:3820:2: ( ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-exactly' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' ( (lv_consecutively_4_0= 'consecutively' ) )? (otherlv_5= 'with-periodicity-of' ( (lv_minVal_6_0= RULE_INT ) ) (otherlv_7= '-' ( (lv_maxVal_8_0= RULE_INT ) ) )? otherlv_9= 'ms' )? ) )
            // InternalScl.g:3821:2: ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-exactly' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' ( (lv_consecutively_4_0= 'consecutively' ) )? (otherlv_5= 'with-periodicity-of' ( (lv_minVal_6_0= RULE_INT ) ) (otherlv_7= '-' ( (lv_maxVal_8_0= RULE_INT ) ) )? otherlv_9= 'ms' )? )
            {
            // InternalScl.g:3821:2: ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-exactly' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' ( (lv_consecutively_4_0= 'consecutively' ) )? (otherlv_5= 'with-periodicity-of' ( (lv_minVal_6_0= RULE_INT ) ) (otherlv_7= '-' ( (lv_maxVal_8_0= RULE_INT ) ) )? otherlv_9= 'ms' )? )
            // InternalScl.g:3822:3: ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-exactly' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' ( (lv_consecutively_4_0= 'consecutively' ) )? (otherlv_5= 'with-periodicity-of' ( (lv_minVal_6_0= RULE_INT ) ) (otherlv_7= '-' ( (lv_maxVal_8_0= RULE_INT ) ) )? otherlv_9= 'ms' )?
            {
            // InternalScl.g:3822:3: ( (lv_ref_0_0= ruleRef ) )+
            int cnt132=0;
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( ((LA132_0>=25 && LA132_0<=26)) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // InternalScl.g:3823:4: (lv_ref_0_0= ruleRef )
            	    {
            	    // InternalScl.g:3823:4: (lv_ref_0_0= ruleRef )
            	    // InternalScl.g:3824:5: lv_ref_0_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getExactAccess().getRefRefParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_84);
            	    lv_ref_0_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExactRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ref",
            	    						lv_ref_0_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt132 >= 1 ) break loop132;
                        EarlyExitException eee =
                            new EarlyExitException(132, input);
                        throw eee;
                }
                cnt132++;
            } while (true);

            otherlv_1=(Token)match(input,83,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getExactAccess().getOccursExactlyKeyword_1());
            		
            // InternalScl.g:3845:3: ( (lv_num_2_0= RULE_INT ) )
            // InternalScl.g:3846:4: (lv_num_2_0= RULE_INT )
            {
            // InternalScl.g:3846:4: (lv_num_2_0= RULE_INT )
            // InternalScl.g:3847:5: lv_num_2_0= RULE_INT
            {
            lv_num_2_0=(Token)match(input,RULE_INT,FOLLOW_83); 

            					newLeafNode(lv_num_2_0, grammarAccess.getExactAccess().getNumINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExactRule());
            					}
            					setWithLastConsumed(
            						current,
            						"num",
            						lv_num_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,82,FOLLOW_85); 

            			newLeafNode(otherlv_3, grammarAccess.getExactAccess().getTimesKeyword_3());
            		
            // InternalScl.g:3867:3: ( (lv_consecutively_4_0= 'consecutively' ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==84) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalScl.g:3868:4: (lv_consecutively_4_0= 'consecutively' )
                    {
                    // InternalScl.g:3868:4: (lv_consecutively_4_0= 'consecutively' )
                    // InternalScl.g:3869:5: lv_consecutively_4_0= 'consecutively'
                    {
                    lv_consecutively_4_0=(Token)match(input,84,FOLLOW_86); 

                    					newLeafNode(lv_consecutively_4_0, grammarAccess.getExactAccess().getConsecutivelyConsecutivelyKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExactRule());
                    					}
                    					setWithLastConsumed(current, "consecutively", lv_consecutively_4_0 != null, "consecutively");
                    				

                    }


                    }
                    break;

            }

            // InternalScl.g:3881:3: (otherlv_5= 'with-periodicity-of' ( (lv_minVal_6_0= RULE_INT ) ) (otherlv_7= '-' ( (lv_maxVal_8_0= RULE_INT ) ) )? otherlv_9= 'ms' )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==85) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalScl.g:3882:4: otherlv_5= 'with-periodicity-of' ( (lv_minVal_6_0= RULE_INT ) ) (otherlv_7= '-' ( (lv_maxVal_8_0= RULE_INT ) ) )? otherlv_9= 'ms'
                    {
                    otherlv_5=(Token)match(input,85,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getExactAccess().getWithPeriodicityOfKeyword_5_0());
                    			
                    // InternalScl.g:3886:4: ( (lv_minVal_6_0= RULE_INT ) )
                    // InternalScl.g:3887:5: (lv_minVal_6_0= RULE_INT )
                    {
                    // InternalScl.g:3887:5: (lv_minVal_6_0= RULE_INT )
                    // InternalScl.g:3888:6: lv_minVal_6_0= RULE_INT
                    {
                    lv_minVal_6_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_minVal_6_0, grammarAccess.getExactAccess().getMinValINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExactRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minVal",
                    							lv_minVal_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalScl.g:3904:4: (otherlv_7= '-' ( (lv_maxVal_8_0= RULE_INT ) ) )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==52) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // InternalScl.g:3905:5: otherlv_7= '-' ( (lv_maxVal_8_0= RULE_INT ) )
                            {
                            otherlv_7=(Token)match(input,52,FOLLOW_19); 

                            					newLeafNode(otherlv_7, grammarAccess.getExactAccess().getHyphenMinusKeyword_5_2_0());
                            				
                            // InternalScl.g:3909:5: ( (lv_maxVal_8_0= RULE_INT ) )
                            // InternalScl.g:3910:6: (lv_maxVal_8_0= RULE_INT )
                            {
                            // InternalScl.g:3910:6: (lv_maxVal_8_0= RULE_INT )
                            // InternalScl.g:3911:7: lv_maxVal_8_0= RULE_INT
                            {
                            lv_maxVal_8_0=(Token)match(input,RULE_INT,FOLLOW_51); 

                            							newLeafNode(lv_maxVal_8_0, grammarAccess.getExactAccess().getMaxValINTTerminalRuleCall_5_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExactRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"maxVal",
                            								lv_maxVal_8_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getExactAccess().getMsKeyword_5_3());
                    			

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
    // $ANTLR end "ruleExact"


    // $ANTLR start "entryRuleAtLeast"
    // InternalScl.g:3937:1: entryRuleAtLeast returns [EObject current=null] : iv_ruleAtLeast= ruleAtLeast EOF ;
    public final EObject entryRuleAtLeast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtLeast = null;


        try {
            // InternalScl.g:3937:48: (iv_ruleAtLeast= ruleAtLeast EOF )
            // InternalScl.g:3938:2: iv_ruleAtLeast= ruleAtLeast EOF
            {
             newCompositeNode(grammarAccess.getAtLeastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtLeast=ruleAtLeast();

            state._fsp--;

             current =iv_ruleAtLeast; 
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
    // $ANTLR end "entryRuleAtLeast"


    // $ANTLR start "ruleAtLeast"
    // InternalScl.g:3944:1: ruleAtLeast returns [EObject current=null] : ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-at-least' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' (otherlv_4= 'with-periodicity-of' ( (lv_minVal_5_0= RULE_INT ) ) (otherlv_6= '-' ( (lv_maxVal_7_0= RULE_INT ) ) )? otherlv_8= 'ms' )? ) ;
    public final EObject ruleAtLeast() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_num_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_minVal_5_0=null;
        Token otherlv_6=null;
        Token lv_maxVal_7_0=null;
        Token otherlv_8=null;
        EObject lv_ref_0_0 = null;



        	enterRule();

        try {
            // InternalScl.g:3950:2: ( ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-at-least' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' (otherlv_4= 'with-periodicity-of' ( (lv_minVal_5_0= RULE_INT ) ) (otherlv_6= '-' ( (lv_maxVal_7_0= RULE_INT ) ) )? otherlv_8= 'ms' )? ) )
            // InternalScl.g:3951:2: ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-at-least' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' (otherlv_4= 'with-periodicity-of' ( (lv_minVal_5_0= RULE_INT ) ) (otherlv_6= '-' ( (lv_maxVal_7_0= RULE_INT ) ) )? otherlv_8= 'ms' )? )
            {
            // InternalScl.g:3951:2: ( ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-at-least' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' (otherlv_4= 'with-periodicity-of' ( (lv_minVal_5_0= RULE_INT ) ) (otherlv_6= '-' ( (lv_maxVal_7_0= RULE_INT ) ) )? otherlv_8= 'ms' )? )
            // InternalScl.g:3952:3: ( (lv_ref_0_0= ruleRef ) )+ otherlv_1= 'occurs-at-least' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'times' (otherlv_4= 'with-periodicity-of' ( (lv_minVal_5_0= RULE_INT ) ) (otherlv_6= '-' ( (lv_maxVal_7_0= RULE_INT ) ) )? otherlv_8= 'ms' )?
            {
            // InternalScl.g:3952:3: ( (lv_ref_0_0= ruleRef ) )+
            int cnt136=0;
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( ((LA136_0>=25 && LA136_0<=26)) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // InternalScl.g:3953:4: (lv_ref_0_0= ruleRef )
            	    {
            	    // InternalScl.g:3953:4: (lv_ref_0_0= ruleRef )
            	    // InternalScl.g:3954:5: lv_ref_0_0= ruleRef
            	    {

            	    					newCompositeNode(grammarAccess.getAtLeastAccess().getRefRefParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_87);
            	    lv_ref_0_0=ruleRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAtLeastRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ref",
            	    						lv_ref_0_0,
            	    						"nl.esi.comma.behavior.scl.Scl.Ref");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt136 >= 1 ) break loop136;
                        EarlyExitException eee =
                            new EarlyExitException(136, input);
                        throw eee;
                }
                cnt136++;
            } while (true);

            otherlv_1=(Token)match(input,86,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAtLeastAccess().getOccursAtLeastKeyword_1());
            		
            // InternalScl.g:3975:3: ( (lv_num_2_0= RULE_INT ) )
            // InternalScl.g:3976:4: (lv_num_2_0= RULE_INT )
            {
            // InternalScl.g:3976:4: (lv_num_2_0= RULE_INT )
            // InternalScl.g:3977:5: lv_num_2_0= RULE_INT
            {
            lv_num_2_0=(Token)match(input,RULE_INT,FOLLOW_83); 

            					newLeafNode(lv_num_2_0, grammarAccess.getAtLeastAccess().getNumINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtLeastRule());
            					}
            					setWithLastConsumed(
            						current,
            						"num",
            						lv_num_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,82,FOLLOW_86); 

            			newLeafNode(otherlv_3, grammarAccess.getAtLeastAccess().getTimesKeyword_3());
            		
            // InternalScl.g:3997:3: (otherlv_4= 'with-periodicity-of' ( (lv_minVal_5_0= RULE_INT ) ) (otherlv_6= '-' ( (lv_maxVal_7_0= RULE_INT ) ) )? otherlv_8= 'ms' )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==85) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalScl.g:3998:4: otherlv_4= 'with-periodicity-of' ( (lv_minVal_5_0= RULE_INT ) ) (otherlv_6= '-' ( (lv_maxVal_7_0= RULE_INT ) ) )? otherlv_8= 'ms'
                    {
                    otherlv_4=(Token)match(input,85,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtLeastAccess().getWithPeriodicityOfKeyword_4_0());
                    			
                    // InternalScl.g:4002:4: ( (lv_minVal_5_0= RULE_INT ) )
                    // InternalScl.g:4003:5: (lv_minVal_5_0= RULE_INT )
                    {
                    // InternalScl.g:4003:5: (lv_minVal_5_0= RULE_INT )
                    // InternalScl.g:4004:6: lv_minVal_5_0= RULE_INT
                    {
                    lv_minVal_5_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_minVal_5_0, grammarAccess.getAtLeastAccess().getMinValINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtLeastRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minVal",
                    							lv_minVal_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalScl.g:4020:4: (otherlv_6= '-' ( (lv_maxVal_7_0= RULE_INT ) ) )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==52) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // InternalScl.g:4021:5: otherlv_6= '-' ( (lv_maxVal_7_0= RULE_INT ) )
                            {
                            otherlv_6=(Token)match(input,52,FOLLOW_19); 

                            					newLeafNode(otherlv_6, grammarAccess.getAtLeastAccess().getHyphenMinusKeyword_4_2_0());
                            				
                            // InternalScl.g:4025:5: ( (lv_maxVal_7_0= RULE_INT ) )
                            // InternalScl.g:4026:6: (lv_maxVal_7_0= RULE_INT )
                            {
                            // InternalScl.g:4026:6: (lv_maxVal_7_0= RULE_INT )
                            // InternalScl.g:4027:7: lv_maxVal_7_0= RULE_INT
                            {
                            lv_maxVal_7_0=(Token)match(input,RULE_INT,FOLLOW_51); 

                            							newLeafNode(lv_maxVal_7_0, grammarAccess.getAtLeastAccess().getMaxValINTTerminalRuleCall_4_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtLeastRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"maxVal",
                            								lv_maxVal_7_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getAtLeastAccess().getMsKeyword_4_3());
                    			

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
    // $ANTLR end "ruleAtLeast"


    // $ANTLR start "entryRuleVariable"
    // InternalScl.g:4053:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalScl.g:4053:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalScl.g:4054:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalScl.g:4060:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalScl.g:4066:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalScl.g:4067:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalScl.g:4067:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalScl.g:4068:3: (lv_name_0_0= RULE_ID )
            {
            // InternalScl.g:4068:3: (lv_name_0_0= RULE_ID )
            // InternalScl.g:4069:4: lv_name_0_0= RULE_ID
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
    // InternalScl.g:4088:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalScl.g:4088:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalScl.g:4089:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalScl.g:4095:1: ruleExpression returns [EObject current=null] : this_ExpressionLevel1_0= ruleExpressionLevel1 ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLevel1_0 = null;



        	enterRule();

        try {
            // InternalScl.g:4101:2: (this_ExpressionLevel1_0= ruleExpressionLevel1 )
            // InternalScl.g:4102:2: this_ExpressionLevel1_0= ruleExpressionLevel1
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
    // InternalScl.g:4113:1: entryRuleExpressionLevel1 returns [EObject current=null] : iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF ;
    public final EObject entryRuleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel1 = null;


        try {
            // InternalScl.g:4113:57: (iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF )
            // InternalScl.g:4114:2: iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF
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
    // InternalScl.g:4120:1: ruleExpressionLevel1 returns [EObject current=null] : (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )* ) ;
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
            // InternalScl.g:4126:2: ( (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )* ) )
            // InternalScl.g:4127:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )* )
            {
            // InternalScl.g:4127:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )* )
            // InternalScl.g:4128:3: this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_88);
            this_ExpressionLevel2_0=ruleExpressionLevel2();

            state._fsp--;


            			current = this_ExpressionLevel2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalScl.g:4136:3: ( ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) ) | ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) ) )*
            loop141:
            do {
                int alt141=3;
                int LA141_0 = input.LA(1);

                if ( ((LA141_0>=87 && LA141_0<=88)) ) {
                    alt141=1;
                }
                else if ( (LA141_0==39||LA141_0==89) ) {
                    alt141=2;
                }


                switch (alt141) {
            	case 1 :
            	    // InternalScl.g:4137:4: ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalScl.g:4137:4: ( () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) ) )
            	    // InternalScl.g:4138:5: () (otherlv_2= 'AND' | otherlv_3= 'and' ) ( (lv_right_4_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalScl.g:4138:5: ()
            	    // InternalScl.g:4139:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel1Access().getExpressionAndLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalScl.g:4145:5: (otherlv_2= 'AND' | otherlv_3= 'and' )
            	    int alt139=2;
            	    int LA139_0 = input.LA(1);

            	    if ( (LA139_0==87) ) {
            	        alt139=1;
            	    }
            	    else if ( (LA139_0==88) ) {
            	        alt139=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 139, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt139) {
            	        case 1 :
            	            // InternalScl.g:4146:6: otherlv_2= 'AND'
            	            {
            	            otherlv_2=(Token)match(input,87,FOLLOW_24); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpressionLevel1Access().getANDKeyword_1_0_1_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalScl.g:4151:6: otherlv_3= 'and'
            	            {
            	            otherlv_3=(Token)match(input,88,FOLLOW_24); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpressionLevel1Access().getAndKeyword_1_0_1_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalScl.g:4156:5: ( (lv_right_4_0= ruleExpressionLevel2 ) )
            	    // InternalScl.g:4157:6: (lv_right_4_0= ruleExpressionLevel2 )
            	    {
            	    // InternalScl.g:4157:6: (lv_right_4_0= ruleExpressionLevel2 )
            	    // InternalScl.g:4158:7: lv_right_4_0= ruleExpressionLevel2
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_88);
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
            	    // InternalScl.g:4177:4: ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalScl.g:4177:4: ( () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) ) )
            	    // InternalScl.g:4178:5: () (otherlv_6= 'OR' | otherlv_7= 'or' ) ( (lv_right_8_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalScl.g:4178:5: ()
            	    // InternalScl.g:4179:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel1Access().getExpressionOrLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    // InternalScl.g:4185:5: (otherlv_6= 'OR' | otherlv_7= 'or' )
            	    int alt140=2;
            	    int LA140_0 = input.LA(1);

            	    if ( (LA140_0==89) ) {
            	        alt140=1;
            	    }
            	    else if ( (LA140_0==39) ) {
            	        alt140=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 140, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt140) {
            	        case 1 :
            	            // InternalScl.g:4186:6: otherlv_6= 'OR'
            	            {
            	            otherlv_6=(Token)match(input,89,FOLLOW_24); 

            	            						newLeafNode(otherlv_6, grammarAccess.getExpressionLevel1Access().getORKeyword_1_1_1_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalScl.g:4191:6: otherlv_7= 'or'
            	            {
            	            otherlv_7=(Token)match(input,39,FOLLOW_24); 

            	            						newLeafNode(otherlv_7, grammarAccess.getExpressionLevel1Access().getOrKeyword_1_1_1_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalScl.g:4196:5: ( (lv_right_8_0= ruleExpressionLevel2 ) )
            	    // InternalScl.g:4197:6: (lv_right_8_0= ruleExpressionLevel2 )
            	    {
            	    // InternalScl.g:4197:6: (lv_right_8_0= ruleExpressionLevel2 )
            	    // InternalScl.g:4198:7: lv_right_8_0= ruleExpressionLevel2
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_88);
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
            	    break loop141;
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
    // InternalScl.g:4221:1: entryRuleExpressionLevel2 returns [EObject current=null] : iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF ;
    public final EObject entryRuleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel2 = null;


        try {
            // InternalScl.g:4221:57: (iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF )
            // InternalScl.g:4222:2: iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF
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
    // InternalScl.g:4228:1: ruleExpressionLevel2 returns [EObject current=null] : (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLevel3_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalScl.g:4234:2: ( (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )* ) )
            // InternalScl.g:4235:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )* )
            {
            // InternalScl.g:4235:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )* )
            // InternalScl.g:4236:3: this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_89);
            this_ExpressionLevel3_0=ruleExpressionLevel3();

            state._fsp--;


            			current = this_ExpressionLevel3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalScl.g:4244:3: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) )*
            loop142:
            do {
                int alt142=3;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==90) ) {
                    alt142=1;
                }
                else if ( (LA142_0==91) ) {
                    alt142=2;
                }


                switch (alt142) {
            	case 1 :
            	    // InternalScl.g:4245:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalScl.g:4245:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    // InternalScl.g:4246:5: () otherlv_2= '==' ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalScl.g:4246:5: ()
            	    // InternalScl.g:4247:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel2Access().getExpressionEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,90,FOLLOW_24); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel2Access().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalScl.g:4257:5: ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    // InternalScl.g:4258:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    {
            	    // InternalScl.g:4258:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    // InternalScl.g:4259:7: lv_right_3_0= ruleExpressionLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_89);
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
            	    // InternalScl.g:4278:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalScl.g:4278:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    // InternalScl.g:4279:5: () otherlv_5= '!=' ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalScl.g:4279:5: ()
            	    // InternalScl.g:4280:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel2Access().getExpressionNEqualLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,91,FOLLOW_24); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel2Access().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalScl.g:4290:5: ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    // InternalScl.g:4291:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    {
            	    // InternalScl.g:4291:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    // InternalScl.g:4292:7: lv_right_6_0= ruleExpressionLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_89);
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
            	    break loop142;
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
    // InternalScl.g:4315:1: entryRuleExpressionLevel3 returns [EObject current=null] : iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF ;
    public final EObject entryRuleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel3 = null;


        try {
            // InternalScl.g:4315:57: (iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF )
            // InternalScl.g:4316:2: iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF
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
    // InternalScl.g:4322:1: ruleExpressionLevel3 returns [EObject current=null] : (this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )* ) ;
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
            // InternalScl.g:4328:2: ( (this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )* ) )
            // InternalScl.g:4329:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )* )
            {
            // InternalScl.g:4329:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )* )
            // InternalScl.g:4330:3: this_ExpressionLevel4_0= ruleExpressionLevel4 ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0());
            		
            pushFollow(FOLLOW_90);
            this_ExpressionLevel4_0=ruleExpressionLevel4();

            state._fsp--;


            			current = this_ExpressionLevel4_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalScl.g:4338:3: ( ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) ) | ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) ) )*
            loop143:
            do {
                int alt143=5;
                switch ( input.LA(1) ) {
                case 92:
                    {
                    alt143=1;
                    }
                    break;
                case 69:
                    {
                    alt143=2;
                    }
                    break;
                case 93:
                    {
                    alt143=3;
                    }
                    break;
                case 64:
                    {
                    alt143=4;
                    }
                    break;

                }

                switch (alt143) {
            	case 1 :
            	    // InternalScl.g:4339:4: ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) )
            	    {
            	    // InternalScl.g:4339:4: ( () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) ) )
            	    // InternalScl.g:4340:5: () otherlv_2= '>=' ( (lv_right_3_0= ruleExpressionLevel4 ) )
            	    {
            	    // InternalScl.g:4340:5: ()
            	    // InternalScl.g:4341:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel3Access().getExpressionGeqLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,92,FOLLOW_24); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel3Access().getGreaterThanSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalScl.g:4351:5: ( (lv_right_3_0= ruleExpressionLevel4 ) )
            	    // InternalScl.g:4352:6: (lv_right_3_0= ruleExpressionLevel4 )
            	    {
            	    // InternalScl.g:4352:6: (lv_right_3_0= ruleExpressionLevel4 )
            	    // InternalScl.g:4353:7: lv_right_3_0= ruleExpressionLevel4
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_90);
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
            	    // InternalScl.g:4372:4: ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) )
            	    {
            	    // InternalScl.g:4372:4: ( () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) ) )
            	    // InternalScl.g:4373:5: () otherlv_5= '>' ( (lv_right_6_0= ruleExpressionLevel4 ) )
            	    {
            	    // InternalScl.g:4373:5: ()
            	    // InternalScl.g:4374:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel3Access().getExpressionGreaterLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,69,FOLLOW_24); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel3Access().getGreaterThanSignKeyword_1_1_1());
            	    				
            	    // InternalScl.g:4384:5: ( (lv_right_6_0= ruleExpressionLevel4 ) )
            	    // InternalScl.g:4385:6: (lv_right_6_0= ruleExpressionLevel4 )
            	    {
            	    // InternalScl.g:4385:6: (lv_right_6_0= ruleExpressionLevel4 )
            	    // InternalScl.g:4386:7: lv_right_6_0= ruleExpressionLevel4
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_90);
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
            	    // InternalScl.g:4405:4: ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) )
            	    {
            	    // InternalScl.g:4405:4: ( () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) ) )
            	    // InternalScl.g:4406:5: () otherlv_8= '<=' ( (lv_right_9_0= ruleExpressionLevel4 ) )
            	    {
            	    // InternalScl.g:4406:5: ()
            	    // InternalScl.g:4407:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel3Access().getExpressionLeqLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,93,FOLLOW_24); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpressionLevel3Access().getLessThanSignEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalScl.g:4417:5: ( (lv_right_9_0= ruleExpressionLevel4 ) )
            	    // InternalScl.g:4418:6: (lv_right_9_0= ruleExpressionLevel4 )
            	    {
            	    // InternalScl.g:4418:6: (lv_right_9_0= ruleExpressionLevel4 )
            	    // InternalScl.g:4419:7: lv_right_9_0= ruleExpressionLevel4
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_90);
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
            	    // InternalScl.g:4438:4: ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) )
            	    {
            	    // InternalScl.g:4438:4: ( () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) ) )
            	    // InternalScl.g:4439:5: () otherlv_11= '<' ( (lv_right_12_0= ruleExpressionLevel4 ) )
            	    {
            	    // InternalScl.g:4439:5: ()
            	    // InternalScl.g:4440:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel3Access().getExpressionLessLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,64,FOLLOW_24); 

            	    					newLeafNode(otherlv_11, grammarAccess.getExpressionLevel3Access().getLessThanSignKeyword_1_3_1());
            	    				
            	    // InternalScl.g:4450:5: ( (lv_right_12_0= ruleExpressionLevel4 ) )
            	    // InternalScl.g:4451:6: (lv_right_12_0= ruleExpressionLevel4 )
            	    {
            	    // InternalScl.g:4451:6: (lv_right_12_0= ruleExpressionLevel4 )
            	    // InternalScl.g:4452:7: lv_right_12_0= ruleExpressionLevel4
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel4ParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_90);
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
            	    break loop143;
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
    // InternalScl.g:4475:1: entryRuleExpressionLevel4 returns [EObject current=null] : iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF ;
    public final EObject entryRuleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel4 = null;


        try {
            // InternalScl.g:4475:57: (iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF )
            // InternalScl.g:4476:2: iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF
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
    // InternalScl.g:4482:1: ruleExpressionLevel4 returns [EObject current=null] : (this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLevel5_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalScl.g:4488:2: ( (this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )* ) )
            // InternalScl.g:4489:2: (this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )* )
            {
            // InternalScl.g:4489:2: (this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )* )
            // InternalScl.g:4490:3: this_ExpressionLevel5_0= ruleExpressionLevel5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_0());
            		
            pushFollow(FOLLOW_91);
            this_ExpressionLevel5_0=ruleExpressionLevel5();

            state._fsp--;


            			current = this_ExpressionLevel5_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalScl.g:4498:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) ) )*
            loop144:
            do {
                int alt144=3;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==94) ) {
                    alt144=1;
                }
                else if ( (LA144_0==52) ) {
                    alt144=2;
                }


                switch (alt144) {
            	case 1 :
            	    // InternalScl.g:4499:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) )
            	    {
            	    // InternalScl.g:4499:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) ) )
            	    // InternalScl.g:4500:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel5 ) )
            	    {
            	    // InternalScl.g:4500:5: ()
            	    // InternalScl.g:4501:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel4Access().getExpressionAdditionLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,94,FOLLOW_24); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel4Access().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalScl.g:4511:5: ( (lv_right_3_0= ruleExpressionLevel5 ) )
            	    // InternalScl.g:4512:6: (lv_right_3_0= ruleExpressionLevel5 )
            	    {
            	    // InternalScl.g:4512:6: (lv_right_3_0= ruleExpressionLevel5 )
            	    // InternalScl.g:4513:7: lv_right_3_0= ruleExpressionLevel5
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel4Access().getRightExpressionLevel5ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_91);
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
            	    // InternalScl.g:4532:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) )
            	    {
            	    // InternalScl.g:4532:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) ) )
            	    // InternalScl.g:4533:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel5 ) )
            	    {
            	    // InternalScl.g:4533:5: ()
            	    // InternalScl.g:4534:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel4Access().getExpressionSubtractionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,52,FOLLOW_24); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel4Access().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalScl.g:4544:5: ( (lv_right_6_0= ruleExpressionLevel5 ) )
            	    // InternalScl.g:4545:6: (lv_right_6_0= ruleExpressionLevel5 )
            	    {
            	    // InternalScl.g:4545:6: (lv_right_6_0= ruleExpressionLevel5 )
            	    // InternalScl.g:4546:7: lv_right_6_0= ruleExpressionLevel5
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel4Access().getRightExpressionLevel5ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_91);
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
            	    break loop144;
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
    // InternalScl.g:4569:1: entryRuleExpressionLevel5 returns [EObject current=null] : iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF ;
    public final EObject entryRuleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel5 = null;


        try {
            // InternalScl.g:4569:57: (iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF )
            // InternalScl.g:4570:2: iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF
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
    // InternalScl.g:4576:1: ruleExpressionLevel5 returns [EObject current=null] : (this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) ) )* ) ;
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
            // InternalScl.g:4582:2: ( (this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) ) )* ) )
            // InternalScl.g:4583:2: (this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) ) )* )
            {
            // InternalScl.g:4583:2: (this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) ) )* )
            // InternalScl.g:4584:3: this_ExpressionLevel6_0= ruleExpressionLevel6 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionLevel6ParserRuleCall_0());
            		
            pushFollow(FOLLOW_92);
            this_ExpressionLevel6_0=ruleExpressionLevel6();

            state._fsp--;


            			current = this_ExpressionLevel6_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalScl.g:4592:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) ) )*
            loop145:
            do {
                int alt145=6;
                switch ( input.LA(1) ) {
                case 95:
                    {
                    alt145=1;
                    }
                    break;
                case 96:
                    {
                    alt145=2;
                    }
                    break;
                case 97:
                    {
                    alt145=3;
                    }
                    break;
                case 98:
                    {
                    alt145=4;
                    }
                    break;
                case 99:
                    {
                    alt145=5;
                    }
                    break;

                }

                switch (alt145) {
            	case 1 :
            	    // InternalScl.g:4593:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalScl.g:4593:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )
            	    // InternalScl.g:4594:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalScl.g:4594:5: ()
            	    // InternalScl.g:4595:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionMultiplyLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,95,FOLLOW_24); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel5Access().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalScl.g:4605:5: ( (lv_right_3_0= ruleExpressionLevel6 ) )
            	    // InternalScl.g:4606:6: (lv_right_3_0= ruleExpressionLevel6 )
            	    {
            	    // InternalScl.g:4606:6: (lv_right_3_0= ruleExpressionLevel6 )
            	    // InternalScl.g:4607:7: lv_right_3_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_92);
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
            	    // InternalScl.g:4626:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalScl.g:4626:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) ) )
            	    // InternalScl.g:4627:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalScl.g:4627:5: ()
            	    // InternalScl.g:4628:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionDivisionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,96,FOLLOW_24); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel5Access().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalScl.g:4638:5: ( (lv_right_6_0= ruleExpressionLevel6 ) )
            	    // InternalScl.g:4639:6: (lv_right_6_0= ruleExpressionLevel6 )
            	    {
            	    // InternalScl.g:4639:6: (lv_right_6_0= ruleExpressionLevel6 )
            	    // InternalScl.g:4640:7: lv_right_6_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_92);
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
            	    // InternalScl.g:4659:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalScl.g:4659:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) ) )
            	    // InternalScl.g:4660:5: () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalScl.g:4660:5: ()
            	    // InternalScl.g:4661:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionMaximumLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,97,FOLLOW_24); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpressionLevel5Access().getMaxKeyword_1_2_1());
            	    				
            	    // InternalScl.g:4671:5: ( (lv_right_9_0= ruleExpressionLevel6 ) )
            	    // InternalScl.g:4672:6: (lv_right_9_0= ruleExpressionLevel6 )
            	    {
            	    // InternalScl.g:4672:6: (lv_right_9_0= ruleExpressionLevel6 )
            	    // InternalScl.g:4673:7: lv_right_9_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_92);
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
            	    // InternalScl.g:4692:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalScl.g:4692:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) ) )
            	    // InternalScl.g:4693:5: () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalScl.g:4693:5: ()
            	    // InternalScl.g:4694:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionMinimumLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,98,FOLLOW_24); 

            	    					newLeafNode(otherlv_11, grammarAccess.getExpressionLevel5Access().getMinKeyword_1_3_1());
            	    				
            	    // InternalScl.g:4704:5: ( (lv_right_12_0= ruleExpressionLevel6 ) )
            	    // InternalScl.g:4705:6: (lv_right_12_0= ruleExpressionLevel6 )
            	    {
            	    // InternalScl.g:4705:6: (lv_right_12_0= ruleExpressionLevel6 )
            	    // InternalScl.g:4706:7: lv_right_12_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_92);
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
            	    // InternalScl.g:4725:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) )
            	    {
            	    // InternalScl.g:4725:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) ) )
            	    // InternalScl.g:4726:5: () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel6 ) )
            	    {
            	    // InternalScl.g:4726:5: ()
            	    // InternalScl.g:4727:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel5Access().getExpressionModuloLeftAction_1_4_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_14=(Token)match(input,99,FOLLOW_24); 

            	    					newLeafNode(otherlv_14, grammarAccess.getExpressionLevel5Access().getModKeyword_1_4_1());
            	    				
            	    // InternalScl.g:4737:5: ( (lv_right_15_0= ruleExpressionLevel6 ) )
            	    // InternalScl.g:4738:6: (lv_right_15_0= ruleExpressionLevel6 )
            	    {
            	    // InternalScl.g:4738:6: (lv_right_15_0= ruleExpressionLevel6 )
            	    // InternalScl.g:4739:7: lv_right_15_0= ruleExpressionLevel6
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel5Access().getRightExpressionLevel6ParserRuleCall_1_4_2_0());
            	    						
            	    pushFollow(FOLLOW_92);
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
            	    break loop145;
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
    // InternalScl.g:4762:1: entryRuleExpressionLevel6 returns [EObject current=null] : iv_ruleExpressionLevel6= ruleExpressionLevel6 EOF ;
    public final EObject entryRuleExpressionLevel6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel6 = null;


        try {
            // InternalScl.g:4762:57: (iv_ruleExpressionLevel6= ruleExpressionLevel6 EOF )
            // InternalScl.g:4763:2: iv_ruleExpressionLevel6= ruleExpressionLevel6 EOF
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
    // InternalScl.g:4769:1: ruleExpressionLevel6 returns [EObject current=null] : (this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )? ) ;
    public final EObject ruleExpressionLevel6() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExpressionLevel7_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalScl.g:4775:2: ( (this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )? ) )
            // InternalScl.g:4776:2: (this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )? )
            {
            // InternalScl.g:4776:2: (this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )? )
            // InternalScl.g:4777:3: this_ExpressionLevel7_0= ruleExpressionLevel7 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )?
            {

            			newCompositeNode(grammarAccess.getExpressionLevel6Access().getExpressionLevel7ParserRuleCall_0());
            		
            pushFollow(FOLLOW_93);
            this_ExpressionLevel7_0=ruleExpressionLevel7();

            state._fsp--;


            			current = this_ExpressionLevel7_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalScl.g:4785:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==100) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalScl.g:4786:4: () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel6 ) )
                    {
                    // InternalScl.g:4786:4: ()
                    // InternalScl.g:4787:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExpressionLevel6Access().getExpressionPowerLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,100,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpressionLevel6Access().getCircumflexAccentKeyword_1_1());
                    			
                    // InternalScl.g:4797:4: ( (lv_right_3_0= ruleExpressionLevel6 ) )
                    // InternalScl.g:4798:5: (lv_right_3_0= ruleExpressionLevel6 )
                    {
                    // InternalScl.g:4798:5: (lv_right_3_0= ruleExpressionLevel6 )
                    // InternalScl.g:4799:6: lv_right_3_0= ruleExpressionLevel6
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
    // InternalScl.g:4821:1: entryRuleExpressionLevel7 returns [EObject current=null] : iv_ruleExpressionLevel7= ruleExpressionLevel7 EOF ;
    public final EObject entryRuleExpressionLevel7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel7 = null;


        try {
            // InternalScl.g:4821:57: (iv_ruleExpressionLevel7= ruleExpressionLevel7 EOF )
            // InternalScl.g:4822:2: iv_ruleExpressionLevel7= ruleExpressionLevel7 EOF
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
    // InternalScl.g:4828:1: ruleExpressionLevel7 returns [EObject current=null] : (this_ExpressionNot_0= ruleExpressionNot | this_ExpressionMinus_1= ruleExpressionMinus | this_ExpressionPlus_2= ruleExpressionPlus | this_ExpressionLevel8_3= ruleExpressionLevel8 ) ;
    public final EObject ruleExpressionLevel7() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionNot_0 = null;

        EObject this_ExpressionMinus_1 = null;

        EObject this_ExpressionPlus_2 = null;

        EObject this_ExpressionLevel8_3 = null;



        	enterRule();

        try {
            // InternalScl.g:4834:2: ( (this_ExpressionNot_0= ruleExpressionNot | this_ExpressionMinus_1= ruleExpressionMinus | this_ExpressionPlus_2= ruleExpressionPlus | this_ExpressionLevel8_3= ruleExpressionLevel8 ) )
            // InternalScl.g:4835:2: (this_ExpressionNot_0= ruleExpressionNot | this_ExpressionMinus_1= ruleExpressionMinus | this_ExpressionPlus_2= ruleExpressionPlus | this_ExpressionLevel8_3= ruleExpressionLevel8 )
            {
            // InternalScl.g:4835:2: (this_ExpressionNot_0= ruleExpressionNot | this_ExpressionMinus_1= ruleExpressionMinus | this_ExpressionPlus_2= ruleExpressionPlus | this_ExpressionLevel8_3= ruleExpressionLevel8 )
            int alt147=4;
            switch ( input.LA(1) ) {
            case 67:
            case 101:
                {
                alt147=1;
                }
                break;
            case 52:
                {
                alt147=2;
                }
                break;
            case 94:
                {
                alt147=3;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOL_LITERAL:
            case 30:
            case 64:
            case 108:
            case 109:
            case 110:
                {
                alt147=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }

            switch (alt147) {
                case 1 :
                    // InternalScl.g:4836:3: this_ExpressionNot_0= ruleExpressionNot
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
                    // InternalScl.g:4845:3: this_ExpressionMinus_1= ruleExpressionMinus
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
                    // InternalScl.g:4854:3: this_ExpressionPlus_2= ruleExpressionPlus
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
                    // InternalScl.g:4863:3: this_ExpressionLevel8_3= ruleExpressionLevel8
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
    // InternalScl.g:4875:1: entryRuleExpressionNot returns [EObject current=null] : iv_ruleExpressionNot= ruleExpressionNot EOF ;
    public final EObject entryRuleExpressionNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionNot = null;


        try {
            // InternalScl.g:4875:54: (iv_ruleExpressionNot= ruleExpressionNot EOF )
            // InternalScl.g:4876:2: iv_ruleExpressionNot= ruleExpressionNot EOF
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
    // InternalScl.g:4882:1: ruleExpressionNot returns [EObject current=null] : ( (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) ) ) ;
    public final EObject ruleExpressionNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_sub_2_0 = null;



        	enterRule();

        try {
            // InternalScl.g:4888:2: ( ( (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) ) ) )
            // InternalScl.g:4889:2: ( (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) ) )
            {
            // InternalScl.g:4889:2: ( (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) ) )
            // InternalScl.g:4890:3: (otherlv_0= 'NOT' | otherlv_1= 'not' ) ( (lv_sub_2_0= ruleExpressionLevel8 ) )
            {
            // InternalScl.g:4890:3: (otherlv_0= 'NOT' | otherlv_1= 'not' )
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==101) ) {
                alt148=1;
            }
            else if ( (LA148_0==67) ) {
                alt148=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }
            switch (alt148) {
                case 1 :
                    // InternalScl.g:4891:4: otherlv_0= 'NOT'
                    {
                    otherlv_0=(Token)match(input,101,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getExpressionNotAccess().getNOTKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalScl.g:4896:4: otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionNotAccess().getNotKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalScl.g:4901:3: ( (lv_sub_2_0= ruleExpressionLevel8 ) )
            // InternalScl.g:4902:4: (lv_sub_2_0= ruleExpressionLevel8 )
            {
            // InternalScl.g:4902:4: (lv_sub_2_0= ruleExpressionLevel8 )
            // InternalScl.g:4903:5: lv_sub_2_0= ruleExpressionLevel8
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
    // InternalScl.g:4924:1: entryRuleExpressionMinus returns [EObject current=null] : iv_ruleExpressionMinus= ruleExpressionMinus EOF ;
    public final EObject entryRuleExpressionMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMinus = null;


        try {
            // InternalScl.g:4924:56: (iv_ruleExpressionMinus= ruleExpressionMinus EOF )
            // InternalScl.g:4925:2: iv_ruleExpressionMinus= ruleExpressionMinus EOF
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
    // InternalScl.g:4931:1: ruleExpressionMinus returns [EObject current=null] : (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) ) ;
    public final EObject ruleExpressionMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalScl.g:4937:2: ( (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) ) )
            // InternalScl.g:4938:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) )
            {
            // InternalScl.g:4938:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) )
            // InternalScl.g:4939:3: otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel8 ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0());
            		
            // InternalScl.g:4943:3: ( (lv_sub_1_0= ruleExpressionLevel8 ) )
            // InternalScl.g:4944:4: (lv_sub_1_0= ruleExpressionLevel8 )
            {
            // InternalScl.g:4944:4: (lv_sub_1_0= ruleExpressionLevel8 )
            // InternalScl.g:4945:5: lv_sub_1_0= ruleExpressionLevel8
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
    // InternalScl.g:4966:1: entryRuleExpressionPlus returns [EObject current=null] : iv_ruleExpressionPlus= ruleExpressionPlus EOF ;
    public final EObject entryRuleExpressionPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionPlus = null;


        try {
            // InternalScl.g:4966:55: (iv_ruleExpressionPlus= ruleExpressionPlus EOF )
            // InternalScl.g:4967:2: iv_ruleExpressionPlus= ruleExpressionPlus EOF
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
    // InternalScl.g:4973:1: ruleExpressionPlus returns [EObject current=null] : (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) ) ;
    public final EObject ruleExpressionPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalScl.g:4979:2: ( (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) ) )
            // InternalScl.g:4980:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) )
            {
            // InternalScl.g:4980:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) ) )
            // InternalScl.g:4981:3: otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel8 ) )
            {
            otherlv_0=(Token)match(input,94,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0());
            		
            // InternalScl.g:4985:3: ( (lv_sub_1_0= ruleExpressionLevel8 ) )
            // InternalScl.g:4986:4: (lv_sub_1_0= ruleExpressionLevel8 )
            {
            // InternalScl.g:4986:4: (lv_sub_1_0= ruleExpressionLevel8 )
            // InternalScl.g:4987:5: lv_sub_1_0= ruleExpressionLevel8
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
    // InternalScl.g:5008:1: entryRuleExpressionLevel8 returns [EObject current=null] : iv_ruleExpressionLevel8= ruleExpressionLevel8 EOF ;
    public final EObject entryRuleExpressionLevel8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel8 = null;


        try {
            // InternalScl.g:5008:57: (iv_ruleExpressionLevel8= ruleExpressionLevel8 EOF )
            // InternalScl.g:5009:2: iv_ruleExpressionLevel8= ruleExpressionLevel8 EOF
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
    // InternalScl.g:5015:1: ruleExpressionLevel8 returns [EObject current=null] : (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantBool_1= ruleExpressionConstantBool | this_ExpressionConstantInt_2= ruleExpressionConstantInt | this_ExpressionConstantString_3= ruleExpressionConstantString | this_ExpressionVariable_4= ruleExpressionVariable | this_ExpressionQuantifier_5= ruleExpressionQuantifier | this_ExpressionTypeAnnotated_6= ruleExpressionTypeAnnotated ) ;
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
            // InternalScl.g:5021:2: ( (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantBool_1= ruleExpressionConstantBool | this_ExpressionConstantInt_2= ruleExpressionConstantInt | this_ExpressionConstantString_3= ruleExpressionConstantString | this_ExpressionVariable_4= ruleExpressionVariable | this_ExpressionQuantifier_5= ruleExpressionQuantifier | this_ExpressionTypeAnnotated_6= ruleExpressionTypeAnnotated ) )
            // InternalScl.g:5022:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantBool_1= ruleExpressionConstantBool | this_ExpressionConstantInt_2= ruleExpressionConstantInt | this_ExpressionConstantString_3= ruleExpressionConstantString | this_ExpressionVariable_4= ruleExpressionVariable | this_ExpressionQuantifier_5= ruleExpressionQuantifier | this_ExpressionTypeAnnotated_6= ruleExpressionTypeAnnotated )
            {
            // InternalScl.g:5022:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantBool_1= ruleExpressionConstantBool | this_ExpressionConstantInt_2= ruleExpressionConstantInt | this_ExpressionConstantString_3= ruleExpressionConstantString | this_ExpressionVariable_4= ruleExpressionVariable | this_ExpressionQuantifier_5= ruleExpressionQuantifier | this_ExpressionTypeAnnotated_6= ruleExpressionTypeAnnotated )
            int alt149=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt149=1;
                }
                break;
            case RULE_BOOL_LITERAL:
                {
                alt149=2;
                }
                break;
            case RULE_INT:
                {
                alt149=3;
                }
                break;
            case RULE_STRING:
                {
                alt149=4;
                }
                break;
            case RULE_ID:
                {
                alt149=5;
                }
                break;
            case 108:
            case 109:
            case 110:
                {
                alt149=6;
                }
                break;
            case 64:
                {
                alt149=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }

            switch (alt149) {
                case 1 :
                    // InternalScl.g:5023:3: this_ExpressionBracket_0= ruleExpressionBracket
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
                    // InternalScl.g:5032:3: this_ExpressionConstantBool_1= ruleExpressionConstantBool
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
                    // InternalScl.g:5041:3: this_ExpressionConstantInt_2= ruleExpressionConstantInt
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
                    // InternalScl.g:5050:3: this_ExpressionConstantString_3= ruleExpressionConstantString
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
                    // InternalScl.g:5059:3: this_ExpressionVariable_4= ruleExpressionVariable
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
                    // InternalScl.g:5068:3: this_ExpressionQuantifier_5= ruleExpressionQuantifier
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
                    // InternalScl.g:5077:3: this_ExpressionTypeAnnotated_6= ruleExpressionTypeAnnotated
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
    // InternalScl.g:5089:1: entryRuleExpressionBracket returns [EObject current=null] : iv_ruleExpressionBracket= ruleExpressionBracket EOF ;
    public final EObject entryRuleExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBracket = null;


        try {
            // InternalScl.g:5089:58: (iv_ruleExpressionBracket= ruleExpressionBracket EOF )
            // InternalScl.g:5090:2: iv_ruleExpressionBracket= ruleExpressionBracket EOF
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
    // InternalScl.g:5096:1: ruleExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalScl.g:5102:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalScl.g:5103:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalScl.g:5103:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalScl.g:5104:3: otherlv_0= '(' ( (lv_sub_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalScl.g:5108:3: ( (lv_sub_1_0= ruleExpression ) )
            // InternalScl.g:5109:4: (lv_sub_1_0= ruleExpression )
            {
            // InternalScl.g:5109:4: (lv_sub_1_0= ruleExpression )
            // InternalScl.g:5110:5: lv_sub_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionBracketAccess().getSubExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_94);
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

            otherlv_2=(Token)match(input,32,FOLLOW_2); 

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
    // InternalScl.g:5135:1: entryRuleExpressionConstantBool returns [EObject current=null] : iv_ruleExpressionConstantBool= ruleExpressionConstantBool EOF ;
    public final EObject entryRuleExpressionConstantBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantBool = null;


        try {
            // InternalScl.g:5135:63: (iv_ruleExpressionConstantBool= ruleExpressionConstantBool EOF )
            // InternalScl.g:5136:2: iv_ruleExpressionConstantBool= ruleExpressionConstantBool EOF
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
    // InternalScl.g:5142:1: ruleExpressionConstantBool returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) ;
    public final EObject ruleExpressionConstantBool() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalScl.g:5148:2: ( ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) )
            // InternalScl.g:5149:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            {
            // InternalScl.g:5149:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            // InternalScl.g:5150:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            {
            // InternalScl.g:5150:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            // InternalScl.g:5151:4: lv_value_0_0= RULE_BOOL_LITERAL
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
    // InternalScl.g:5170:1: entryRuleExpressionConstantInt returns [EObject current=null] : iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF ;
    public final EObject entryRuleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantInt = null;


        try {
            // InternalScl.g:5170:62: (iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF )
            // InternalScl.g:5171:2: iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF
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
    // InternalScl.g:5177:1: ruleExpressionConstantInt returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalScl.g:5183:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalScl.g:5184:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalScl.g:5184:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalScl.g:5185:3: (lv_value_0_0= RULE_INT )
            {
            // InternalScl.g:5185:3: (lv_value_0_0= RULE_INT )
            // InternalScl.g:5186:4: lv_value_0_0= RULE_INT
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
    // InternalScl.g:5205:1: entryRuleExpressionConstantString returns [EObject current=null] : iv_ruleExpressionConstantString= ruleExpressionConstantString EOF ;
    public final EObject entryRuleExpressionConstantString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantString = null;


        try {
            // InternalScl.g:5205:65: (iv_ruleExpressionConstantString= ruleExpressionConstantString EOF )
            // InternalScl.g:5206:2: iv_ruleExpressionConstantString= ruleExpressionConstantString EOF
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
    // InternalScl.g:5212:1: ruleExpressionConstantString returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleExpressionConstantString() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalScl.g:5218:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalScl.g:5219:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalScl.g:5219:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalScl.g:5220:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalScl.g:5220:3: (lv_value_0_0= RULE_STRING )
            // InternalScl.g:5221:4: lv_value_0_0= RULE_STRING
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
    // InternalScl.g:5240:1: entryRuleExpressionVariable returns [EObject current=null] : iv_ruleExpressionVariable= ruleExpressionVariable EOF ;
    public final EObject entryRuleExpressionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionVariable = null;


        try {
            // InternalScl.g:5240:59: (iv_ruleExpressionVariable= ruleExpressionVariable EOF )
            // InternalScl.g:5241:2: iv_ruleExpressionVariable= ruleExpressionVariable EOF
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
    // InternalScl.g:5247:1: ruleExpressionVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleExpressionVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalScl.g:5253:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalScl.g:5254:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalScl.g:5254:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalScl.g:5255:3: (lv_name_0_0= RULE_ID )
            {
            // InternalScl.g:5255:3: (lv_name_0_0= RULE_ID )
            // InternalScl.g:5256:4: lv_name_0_0= RULE_ID
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
    // InternalScl.g:5275:1: entryRuleExpressionQuantifier returns [EObject current=null] : iv_ruleExpressionQuantifier= ruleExpressionQuantifier EOF ;
    public final EObject entryRuleExpressionQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionQuantifier = null;


        try {
            // InternalScl.g:5275:61: (iv_ruleExpressionQuantifier= ruleExpressionQuantifier EOF )
            // InternalScl.g:5276:2: iv_ruleExpressionQuantifier= ruleExpressionQuantifier EOF
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
    // InternalScl.g:5282:1: ruleExpressionQuantifier returns [EObject current=null] : ( ( (lv_quantifier_0_0= ruleQUANTIFIER ) ) otherlv_1= '(' ( (lv_iterator_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_collection_4_0= ruleExpression ) ) otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
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
            // InternalScl.g:5288:2: ( ( ( (lv_quantifier_0_0= ruleQUANTIFIER ) ) otherlv_1= '(' ( (lv_iterator_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_collection_4_0= ruleExpression ) ) otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // InternalScl.g:5289:2: ( ( (lv_quantifier_0_0= ruleQUANTIFIER ) ) otherlv_1= '(' ( (lv_iterator_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_collection_4_0= ruleExpression ) ) otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // InternalScl.g:5289:2: ( ( (lv_quantifier_0_0= ruleQUANTIFIER ) ) otherlv_1= '(' ( (lv_iterator_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_collection_4_0= ruleExpression ) ) otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) otherlv_7= ')' )
            // InternalScl.g:5290:3: ( (lv_quantifier_0_0= ruleQUANTIFIER ) ) otherlv_1= '(' ( (lv_iterator_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_collection_4_0= ruleExpression ) ) otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            // InternalScl.g:5290:3: ( (lv_quantifier_0_0= ruleQUANTIFIER ) )
            // InternalScl.g:5291:4: (lv_quantifier_0_0= ruleQUANTIFIER )
            {
            // InternalScl.g:5291:4: (lv_quantifier_0_0= ruleQUANTIFIER )
            // InternalScl.g:5292:5: lv_quantifier_0_0= ruleQUANTIFIER
            {

            					newCompositeNode(grammarAccess.getExpressionQuantifierAccess().getQuantifierQUANTIFIEREnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_1=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExpressionQuantifierAccess().getLeftParenthesisKeyword_1());
            		
            // InternalScl.g:5313:3: ( (lv_iterator_2_0= ruleVariable ) )
            // InternalScl.g:5314:4: (lv_iterator_2_0= ruleVariable )
            {
            // InternalScl.g:5314:4: (lv_iterator_2_0= ruleVariable )
            // InternalScl.g:5315:5: lv_iterator_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getExpressionQuantifierAccess().getIteratorVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_95);
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

            otherlv_3=(Token)match(input,102,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getExpressionQuantifierAccess().getInKeyword_3());
            		
            // InternalScl.g:5336:3: ( (lv_collection_4_0= ruleExpression ) )
            // InternalScl.g:5337:4: (lv_collection_4_0= ruleExpression )
            {
            // InternalScl.g:5337:4: (lv_collection_4_0= ruleExpression )
            // InternalScl.g:5338:5: lv_collection_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionQuantifierAccess().getCollectionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_96);
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

            otherlv_5=(Token)match(input,103,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getExpressionQuantifierAccess().getColonKeyword_5());
            		
            // InternalScl.g:5359:3: ( (lv_condition_6_0= ruleExpression ) )
            // InternalScl.g:5360:4: (lv_condition_6_0= ruleExpression )
            {
            // InternalScl.g:5360:4: (lv_condition_6_0= ruleExpression )
            // InternalScl.g:5361:5: lv_condition_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionQuantifierAccess().getConditionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_94);
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

            otherlv_7=(Token)match(input,32,FOLLOW_2); 

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
    // InternalScl.g:5386:1: entryRuleExpressionTypeAnnotated returns [EObject current=null] : iv_ruleExpressionTypeAnnotated= ruleExpressionTypeAnnotated EOF ;
    public final EObject entryRuleExpressionTypeAnnotated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTypeAnnotated = null;


        try {
            // InternalScl.g:5386:64: (iv_ruleExpressionTypeAnnotated= ruleExpressionTypeAnnotated EOF )
            // InternalScl.g:5387:2: iv_ruleExpressionTypeAnnotated= ruleExpressionTypeAnnotated EOF
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
    // InternalScl.g:5393:1: ruleExpressionTypeAnnotated returns [EObject current=null] : (this_TypeAnnotation_0= ruleTypeAnnotation ( ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' ) | ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' ) ) ) ;
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
            // InternalScl.g:5399:2: ( (this_TypeAnnotation_0= ruleTypeAnnotation ( ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' ) | ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' ) ) ) )
            // InternalScl.g:5400:2: (this_TypeAnnotation_0= ruleTypeAnnotation ( ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' ) | ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' ) ) )
            {
            // InternalScl.g:5400:2: (this_TypeAnnotation_0= ruleTypeAnnotation ( ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' ) | ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' ) ) )
            // InternalScl.g:5401:3: this_TypeAnnotation_0= ruleTypeAnnotation ( ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' ) | ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' ) )
            {

            			newCompositeNode(grammarAccess.getExpressionTypeAnnotatedAccess().getTypeAnnotationParserRuleCall_0());
            		
            pushFollow(FOLLOW_97);
            this_TypeAnnotation_0=ruleTypeAnnotation();

            state._fsp--;


            			current = this_TypeAnnotation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalScl.g:5409:3: ( ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' ) | ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' ) )
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==23) ) {
                alt154=1;
            }
            else if ( (LA154_0==17) ) {
                alt154=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }
            switch (alt154) {
                case 1 :
                    // InternalScl.g:5410:4: ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' )
                    {
                    // InternalScl.g:5410:4: ( () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']' )
                    // InternalScl.g:5411:5: () otherlv_2= '[' ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )? otherlv_6= ']'
                    {
                    // InternalScl.g:5411:5: ()
                    // InternalScl.g:5412:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getExpressionTypeAnnotatedAccess().getExpressionVectorTypeAnnotationAction_1_0_0(),
                    							current);
                    					

                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_98); 

                    					newLeafNode(otherlv_2, grammarAccess.getExpressionTypeAnnotatedAccess().getLeftSquareBracketKeyword_1_0_1());
                    				
                    // InternalScl.g:5422:5: ( ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )* )?
                    int alt151=2;
                    int LA151_0 = input.LA(1);

                    if ( ((LA151_0>=RULE_ID && LA151_0<=RULE_BOOL_LITERAL)||LA151_0==30||LA151_0==52||LA151_0==64||LA151_0==67||LA151_0==94||LA151_0==101||(LA151_0>=108 && LA151_0<=110)) ) {
                        alt151=1;
                    }
                    switch (alt151) {
                        case 1 :
                            // InternalScl.g:5423:6: ( (lv_elements_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )*
                            {
                            // InternalScl.g:5423:6: ( (lv_elements_3_0= ruleExpression ) )
                            // InternalScl.g:5424:7: (lv_elements_3_0= ruleExpression )
                            {
                            // InternalScl.g:5424:7: (lv_elements_3_0= ruleExpression )
                            // InternalScl.g:5425:8: lv_elements_3_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getExpressionTypeAnnotatedAccess().getElementsExpressionParserRuleCall_1_0_2_0_0());
                            							
                            pushFollow(FOLLOW_99);
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

                            // InternalScl.g:5442:6: (otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) ) )*
                            loop150:
                            do {
                                int alt150=2;
                                int LA150_0 = input.LA(1);

                                if ( (LA150_0==31) ) {
                                    alt150=1;
                                }


                                switch (alt150) {
                            	case 1 :
                            	    // InternalScl.g:5443:7: otherlv_4= ',' ( (lv_elements_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,31,FOLLOW_24); 

                            	    							newLeafNode(otherlv_4, grammarAccess.getExpressionTypeAnnotatedAccess().getCommaKeyword_1_0_2_1_0());
                            	    						
                            	    // InternalScl.g:5447:7: ( (lv_elements_5_0= ruleExpression ) )
                            	    // InternalScl.g:5448:8: (lv_elements_5_0= ruleExpression )
                            	    {
                            	    // InternalScl.g:5448:8: (lv_elements_5_0= ruleExpression )
                            	    // InternalScl.g:5449:9: lv_elements_5_0= ruleExpression
                            	    {

                            	    									newCompositeNode(grammarAccess.getExpressionTypeAnnotatedAccess().getElementsExpressionParserRuleCall_1_0_2_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_99);
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
                            	    break loop150;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getExpressionTypeAnnotatedAccess().getRightSquareBracketKeyword_1_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalScl.g:5474:4: ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' )
                    {
                    // InternalScl.g:5474:4: ( () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}' )
                    // InternalScl.g:5475:5: () otherlv_8= '{' ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )? otherlv_12= '}'
                    {
                    // InternalScl.g:5475:5: ()
                    // InternalScl.g:5476:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getExpressionTypeAnnotatedAccess().getExpressionMapTypeAnnotationAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_100); 

                    					newLeafNode(otherlv_8, grammarAccess.getExpressionTypeAnnotatedAccess().getLeftCurlyBracketKeyword_1_1_1());
                    				
                    // InternalScl.g:5486:5: ( ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )* )?
                    int alt153=2;
                    int LA153_0 = input.LA(1);

                    if ( ((LA153_0>=RULE_ID && LA153_0<=RULE_BOOL_LITERAL)||LA153_0==30||LA153_0==52||LA153_0==64||LA153_0==67||LA153_0==94||LA153_0==101||(LA153_0>=108 && LA153_0<=110)) ) {
                        alt153=1;
                    }
                    switch (alt153) {
                        case 1 :
                            // InternalScl.g:5487:6: ( (lv_pairs_9_0= rulePair ) ) (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )*
                            {
                            // InternalScl.g:5487:6: ( (lv_pairs_9_0= rulePair ) )
                            // InternalScl.g:5488:7: (lv_pairs_9_0= rulePair )
                            {
                            // InternalScl.g:5488:7: (lv_pairs_9_0= rulePair )
                            // InternalScl.g:5489:8: lv_pairs_9_0= rulePair
                            {

                            								newCompositeNode(grammarAccess.getExpressionTypeAnnotatedAccess().getPairsPairParserRuleCall_1_1_2_0_0());
                            							
                            pushFollow(FOLLOW_101);
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

                            // InternalScl.g:5506:6: (otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) ) )*
                            loop152:
                            do {
                                int alt152=2;
                                int LA152_0 = input.LA(1);

                                if ( (LA152_0==31) ) {
                                    alt152=1;
                                }


                                switch (alt152) {
                            	case 1 :
                            	    // InternalScl.g:5507:7: otherlv_10= ',' ( (lv_pairs_11_0= rulePair ) )
                            	    {
                            	    otherlv_10=(Token)match(input,31,FOLLOW_24); 

                            	    							newLeafNode(otherlv_10, grammarAccess.getExpressionTypeAnnotatedAccess().getCommaKeyword_1_1_2_1_0());
                            	    						
                            	    // InternalScl.g:5511:7: ( (lv_pairs_11_0= rulePair ) )
                            	    // InternalScl.g:5512:8: (lv_pairs_11_0= rulePair )
                            	    {
                            	    // InternalScl.g:5512:8: (lv_pairs_11_0= rulePair )
                            	    // InternalScl.g:5513:9: lv_pairs_11_0= rulePair
                            	    {

                            	    									newCompositeNode(grammarAccess.getExpressionTypeAnnotatedAccess().getPairsPairParserRuleCall_1_1_2_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_101);
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
                            	    break loop152;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,18,FOLLOW_2); 

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
    // InternalScl.g:5542:1: entryRuleTypeAnnotation returns [EObject current=null] : iv_ruleTypeAnnotation= ruleTypeAnnotation EOF ;
    public final EObject entryRuleTypeAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAnnotation = null;


        try {
            // InternalScl.g:5542:55: (iv_ruleTypeAnnotation= ruleTypeAnnotation EOF )
            // InternalScl.g:5543:2: iv_ruleTypeAnnotation= ruleTypeAnnotation EOF
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
    // InternalScl.g:5549:1: ruleTypeAnnotation returns [EObject current=null] : (otherlv_0= '<' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '>' ) ;
    public final EObject ruleTypeAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalScl.g:5555:2: ( (otherlv_0= '<' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '>' ) )
            // InternalScl.g:5556:2: (otherlv_0= '<' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '>' )
            {
            // InternalScl.g:5556:2: (otherlv_0= '<' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '>' )
            // InternalScl.g:5557:3: otherlv_0= '<' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAnnotationAccess().getLessThanSignKeyword_0());
            		
            // InternalScl.g:5561:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalScl.g:5562:4: (lv_type_1_0= RULE_ID )
            {
            // InternalScl.g:5562:4: (lv_type_1_0= RULE_ID )
            // InternalScl.g:5563:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_102); 

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

            otherlv_2=(Token)match(input,69,FOLLOW_2); 

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
    // InternalScl.g:5587:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalScl.g:5587:45: (iv_rulePair= rulePair EOF )
            // InternalScl.g:5588:2: iv_rulePair= rulePair EOF
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
    // InternalScl.g:5594:1: rulePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalScl.g:5600:2: ( ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalScl.g:5601:2: ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalScl.g:5601:2: ( ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalScl.g:5602:3: ( (lv_key_0_0= ruleExpression ) ) otherlv_1= '->' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalScl.g:5602:3: ( (lv_key_0_0= ruleExpression ) )
            // InternalScl.g:5603:4: (lv_key_0_0= ruleExpression )
            {
            // InternalScl.g:5603:4: (lv_key_0_0= ruleExpression )
            // InternalScl.g:5604:5: lv_key_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPairAccess().getKeyExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_103);
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

            otherlv_1=(Token)match(input,75,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getPairAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalScl.g:5625:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalScl.g:5626:4: (lv_value_2_0= ruleExpression )
            {
            // InternalScl.g:5626:4: (lv_value_2_0= ruleExpression )
            // InternalScl.g:5627:5: lv_value_2_0= ruleExpression
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


    // $ANTLR start "ruleActionType"
    // InternalScl.g:5648:1: ruleActionType returns [Enumerator current=null] : ( (enumLiteral_0= 'Observable' ) | (enumLiteral_1= 'Trigger' ) | (enumLiteral_2= 'Pre-condition' ) | (enumLiteral_3= 'And' ) ) ;
    public final Enumerator ruleActionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalScl.g:5654:2: ( ( (enumLiteral_0= 'Observable' ) | (enumLiteral_1= 'Trigger' ) | (enumLiteral_2= 'Pre-condition' ) | (enumLiteral_3= 'And' ) ) )
            // InternalScl.g:5655:2: ( (enumLiteral_0= 'Observable' ) | (enumLiteral_1= 'Trigger' ) | (enumLiteral_2= 'Pre-condition' ) | (enumLiteral_3= 'And' ) )
            {
            // InternalScl.g:5655:2: ( (enumLiteral_0= 'Observable' ) | (enumLiteral_1= 'Trigger' ) | (enumLiteral_2= 'Pre-condition' ) | (enumLiteral_3= 'And' ) )
            int alt155=4;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt155=1;
                }
                break;
            case 105:
                {
                alt155=2;
                }
                break;
            case 106:
                {
                alt155=3;
                }
                break;
            case 107:
                {
                alt155=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }

            switch (alt155) {
                case 1 :
                    // InternalScl.g:5656:3: (enumLiteral_0= 'Observable' )
                    {
                    // InternalScl.g:5656:3: (enumLiteral_0= 'Observable' )
                    // InternalScl.g:5657:4: enumLiteral_0= 'Observable'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getObservableEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionTypeAccess().getObservableEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalScl.g:5664:3: (enumLiteral_1= 'Trigger' )
                    {
                    // InternalScl.g:5664:3: (enumLiteral_1= 'Trigger' )
                    // InternalScl.g:5665:4: enumLiteral_1= 'Trigger'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getTriggerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionTypeAccess().getTriggerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalScl.g:5672:3: (enumLiteral_2= 'Pre-condition' )
                    {
                    // InternalScl.g:5672:3: (enumLiteral_2= 'Pre-condition' )
                    // InternalScl.g:5673:4: enumLiteral_2= 'Pre-condition'
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getPreConditionEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionTypeAccess().getPreConditionEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalScl.g:5680:3: (enumLiteral_3= 'And' )
                    {
                    // InternalScl.g:5680:3: (enumLiteral_3= 'And' )
                    // InternalScl.g:5681:4: enumLiteral_3= 'And'
                    {
                    enumLiteral_3=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getConjunctionEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionTypeAccess().getConjunctionEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleActionType"


    // $ANTLR start "ruleQUANTIFIER"
    // InternalScl.g:5691:1: ruleQUANTIFIER returns [Enumerator current=null] : ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forAll' ) | (enumLiteral_2= 'delete' ) ) ;
    public final Enumerator ruleQUANTIFIER() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalScl.g:5697:2: ( ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forAll' ) | (enumLiteral_2= 'delete' ) ) )
            // InternalScl.g:5698:2: ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forAll' ) | (enumLiteral_2= 'delete' ) )
            {
            // InternalScl.g:5698:2: ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forAll' ) | (enumLiteral_2= 'delete' ) )
            int alt156=3;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt156=1;
                }
                break;
            case 109:
                {
                alt156=2;
                }
                break;
            case 110:
                {
                alt156=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }

            switch (alt156) {
                case 1 :
                    // InternalScl.g:5699:3: (enumLiteral_0= 'exists' )
                    {
                    // InternalScl.g:5699:3: (enumLiteral_0= 'exists' )
                    // InternalScl.g:5700:4: enumLiteral_0= 'exists'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getQUANTIFIERAccess().getEXISTSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQUANTIFIERAccess().getEXISTSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalScl.g:5707:3: (enumLiteral_1= 'forAll' )
                    {
                    // InternalScl.g:5707:3: (enumLiteral_1= 'forAll' )
                    // InternalScl.g:5708:4: enumLiteral_1= 'forAll'
                    {
                    enumLiteral_1=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getQUANTIFIERAccess().getFORALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQUANTIFIERAccess().getFORALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalScl.g:5715:3: (enumLiteral_2= 'delete' )
                    {
                    // InternalScl.g:5715:3: (enumLiteral_2= 'delete' )
                    // InternalScl.g:5716:4: enumLiteral_2= 'delete'
                    {
                    enumLiteral_2=(Token)match(input,110,FOLLOW_2); 

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


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\2\2\uffff\2\2\1\uffff";
    static final String dfa_3s = "\2\4\1\uffff\2\4\1\uffff";
    static final String dfa_4s = "\1\25\1\4\1\uffff\1\24\1\45\1\uffff";
    static final String dfa_5s = "\2\uffff\1\2\2\uffff\1\1";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\10\uffff\1\1\2\2\5\uffff\1\2",
            "\1\3",
            "",
            "\1\4\11\uffff\1\2\5\uffff\1\5",
            "\1\4\11\uffff\1\2\5\uffff\1\5\14\uffff\5\2",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "302:3: (otherlv_8= 'for-configurations' ( (otherlv_9= RULE_ID ) )+ otherlv_10= ';' )?";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\31\2\4\1\uffff\1\31\1\27\1\uffff\1\6\1\30\1\31";
    static final String dfa_10s = "\1\46\2\4\1\uffff\2\51\1\uffff\1\6\1\30\1\51";
    static final String dfa_11s = "\3\uffff\1\2\2\uffff\1\1\3\uffff";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\1\1\13\uffff\1\3",
            "\1\4",
            "\1\5",
            "",
            "\1\2\1\1\14\uffff\1\3\1\uffff\1\6",
            "\1\7\1\uffff\1\2\1\1\14\uffff\1\3\1\uffff\1\6",
            "",
            "\1\10",
            "\1\11",
            "\1\2\1\1\14\uffff\1\3\1\uffff\1\6"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1394:5: (lv_type_1_1= ruleSimpleChoice | lv_type_1_2= ruleExclusiveChoice )";
        }
    }
    static final String dfa_14s = "\15\uffff";
    static final String dfa_15s = "\1\31\2\4\1\31\1\27\5\uffff\1\6\1\30\1\31";
    static final String dfa_16s = "\1\32\2\4\2\126\5\uffff\1\6\1\30\1\126";
    static final String dfa_17s = "\5\uffff\1\3\1\5\1\2\1\1\1\4\3\uffff";
    static final String dfa_18s = "\15\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\1",
            "\1\3",
            "\1\4",
            "\1\2\1\1\64\uffff\1\11\1\5\1\7\1\uffff\1\6\2\uffff\1\10",
            "\1\12\1\uffff\1\2\1\1\64\uffff\1\11\1\5\1\7\1\uffff\1\6\2\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "\1\14",
            "\1\2\1\1\64\uffff\1\11\1\5\1\7\1\uffff\1\6\2\uffff\1\10"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1454:5: (lv_type_1_1= ruleAtLeast | lv_type_1_2= ruleAtMost | lv_type_1_3= ruleInit | lv_type_1_4= ruleEnd | lv_type_1_5= ruleExact )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010401000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000282002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000202002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00100000400000F0L,0x0000702040000009L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003E00002002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002201L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002201L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x00000000000008A0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000002L,0x00000000000008A0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1452A40000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1452A40000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004006000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004006000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008006000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010006000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020006000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000180006000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400006000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001080006000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000006000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000006000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080080006000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000026000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100004006000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000006000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0200000006000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0800000006000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x4000080006000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x8000000006000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000006000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000006000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0008000020000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x4000080000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001008L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000006000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000006000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000006000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000006000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000006000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000008000000002L,0x0000000003800000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000021L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0010000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x0000000F80000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x00100000410000F0L,0x0000702040000009L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x00100000400400F0L,0x0000702040000009L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});

}