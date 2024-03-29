package nl.esi.comma.expressions.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsLexer extends Lexer {
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

    public InternalExpressionsLexer() {;} 
    public InternalExpressionsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalExpressionsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalExpressions.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:11:7: ( 'AND' )
            // InternalExpressions.g:11:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:12:7: ( 'and' )
            // InternalExpressions.g:12:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:13:7: ( 'OR' )
            // InternalExpressions.g:13:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:14:7: ( 'or' )
            // InternalExpressions.g:14:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:15:7: ( '==' )
            // InternalExpressions.g:15:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:16:7: ( '!=' )
            // InternalExpressions.g:16:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:17:7: ( '>=' )
            // InternalExpressions.g:17:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:18:7: ( '>' )
            // InternalExpressions.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:19:7: ( '<=' )
            // InternalExpressions.g:19:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:20:7: ( '<' )
            // InternalExpressions.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:21:7: ( '+' )
            // InternalExpressions.g:21:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:22:7: ( '-' )
            // InternalExpressions.g:22:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:23:7: ( '*' )
            // InternalExpressions.g:23:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:24:7: ( '/' )
            // InternalExpressions.g:24:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:25:7: ( 'max' )
            // InternalExpressions.g:25:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:26:7: ( 'min' )
            // InternalExpressions.g:26:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:27:7: ( 'mod' )
            // InternalExpressions.g:27:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:28:7: ( '^' )
            // InternalExpressions.g:28:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:29:7: ( 'NOT' )
            // InternalExpressions.g:29:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:30:7: ( 'not' )
            // InternalExpressions.g:30:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:31:7: ( '(' )
            // InternalExpressions.g:31:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:32:7: ( ')' )
            // InternalExpressions.g:32:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:33:7: ( 'in' )
            // InternalExpressions.g:33:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:34:7: ( ':' )
            // InternalExpressions.g:34:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:35:7: ( '[' )
            // InternalExpressions.g:35:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:36:7: ( ',' )
            // InternalExpressions.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:37:7: ( ']' )
            // InternalExpressions.g:37:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:38:7: ( '{' )
            // InternalExpressions.g:38:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:39:7: ( '}' )
            // InternalExpressions.g:39:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:40:7: ( '->' )
            // InternalExpressions.g:40:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:41:7: ( 'exists' )
            // InternalExpressions.g:41:9: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:42:7: ( 'forAll' )
            // InternalExpressions.g:42:9: 'forAll'
            {
            match("forAll"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:43:7: ( 'delete' )
            // InternalExpressions.g:43:9: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_BOOL_LITERAL"
    public final void mRULE_BOOL_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BOOL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:1694:19: ( ( 'true' | 'false' | 'TRUE' | 'FALSE' | 'True' | 'False' ) )
            // InternalExpressions.g:1694:21: ( 'true' | 'false' | 'TRUE' | 'FALSE' | 'True' | 'False' )
            {
            // InternalExpressions.g:1694:21: ( 'true' | 'false' | 'TRUE' | 'FALSE' | 'True' | 'False' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt1=1;
                }
                break;
            case 'f':
                {
                alt1=2;
                }
                break;
            case 'T':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='R') ) {
                    alt1=3;
                }
                else if ( (LA1_3=='r') ) {
                    alt1=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'F':
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4=='A') ) {
                    alt1=4;
                }
                else if ( (LA1_4=='a') ) {
                    alt1=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalExpressions.g:1694:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:1694:29: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:1694:37: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 4 :
                    // InternalExpressions.g:1694:44: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;
                case 5 :
                    // InternalExpressions.g:1694:52: 'True'
                    {
                    match("True"); 


                    }
                    break;
                case 6 :
                    // InternalExpressions.g:1694:59: 'False'
                    {
                    match("False"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL_LITERAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:1696:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalExpressions.g:1696:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalExpressions.g:1696:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalExpressions.g:1696:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalExpressions.g:1696:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExpressions.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:1698:10: ( ( '0' .. '9' )+ )
            // InternalExpressions.g:1698:12: ( '0' .. '9' )+
            {
            // InternalExpressions.g:1698:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExpressions.g:1698:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:1700:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalExpressions.g:1700:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalExpressions.g:1700:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalExpressions.g:1700:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalExpressions.g:1700:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalExpressions.g:1700:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalExpressions.g:1700:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalExpressions.g:1700:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalExpressions.g:1700:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalExpressions.g:1700:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalExpressions.g:1700:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:1702:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalExpressions.g:1702:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalExpressions.g:1702:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalExpressions.g:1702:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:1704:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalExpressions.g:1704:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalExpressions.g:1704:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExpressions.g:1704:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalExpressions.g:1704:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalExpressions.g:1704:41: ( '\\r' )? '\\n'
                    {
                    // InternalExpressions.g:1704:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalExpressions.g:1704:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:1706:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalExpressions.g:1706:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalExpressions.g:1706:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExpressions.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressions.g:1708:16: ( . )
            // InternalExpressions.g:1708:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalExpressions.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_BOOL_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=41;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalExpressions.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalExpressions.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalExpressions.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalExpressions.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalExpressions.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalExpressions.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalExpressions.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalExpressions.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalExpressions.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalExpressions.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalExpressions.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalExpressions.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalExpressions.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalExpressions.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalExpressions.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalExpressions.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalExpressions.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalExpressions.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalExpressions.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalExpressions.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalExpressions.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalExpressions.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalExpressions.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalExpressions.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalExpressions.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalExpressions.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalExpressions.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalExpressions.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalExpressions.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalExpressions.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalExpressions.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalExpressions.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalExpressions.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalExpressions.g:1:208: RULE_BOOL_LITERAL
                {
                mRULE_BOOL_LITERAL(); 

                }
                break;
            case 35 :
                // InternalExpressions.g:1:226: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalExpressions.g:1:234: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // InternalExpressions.g:1:243: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // InternalExpressions.g:1:255: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // InternalExpressions.g:1:271: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // InternalExpressions.g:1:287: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalExpressions.g:1:295: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\4\47\2\45\1\56\1\60\1\uffff\1\63\1\uffff\1\67\1\47\1\73\2\47\2\uffff\1\47\6\uffff\6\47\2\uffff\2\45\2\uffff\1\47\1\uffff\1\47\1\125\1\126\15\uffff\3\47\1\uffff\2\47\2\uffff\1\134\6\uffff\11\47\3\uffff\1\146\1\147\2\uffff\1\150\1\151\1\152\1\153\1\154\1\uffff\11\47\7\uffff\4\47\3\172\4\47\1\172\1\47\1\uffff\2\172\1\u0080\1\u0081\1\u0082\3\uffff";
    static final String DFA13_eofS =
        "\u0083\uffff";
    static final String DFA13_minS =
        "\1\0\1\116\1\156\1\122\1\162\4\75\1\uffff\1\76\1\uffff\1\52\1\141\1\101\1\117\1\157\2\uffff\1\156\6\uffff\1\170\1\141\1\145\1\162\1\122\1\101\2\uffff\2\0\2\uffff\1\104\1\uffff\1\144\2\60\15\uffff\1\170\1\156\1\144\1\uffff\1\124\1\164\2\uffff\1\60\6\uffff\1\151\1\162\2\154\1\165\1\125\1\165\1\114\1\154\3\uffff\2\60\2\uffff\5\60\1\uffff\1\163\1\101\1\163\2\145\1\105\1\145\1\123\1\163\7\uffff\1\164\1\154\1\145\1\164\3\60\1\105\1\145\1\163\1\154\1\60\1\145\1\uffff\5\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\116\1\156\1\122\1\162\4\75\1\uffff\1\76\1\uffff\1\57\1\157\1\172\1\117\1\157\2\uffff\1\156\6\uffff\1\170\1\157\1\145\2\162\1\141\2\uffff\2\uffff\2\uffff\1\104\1\uffff\1\144\2\172\15\uffff\1\170\1\156\1\144\1\uffff\1\124\1\164\2\uffff\1\172\6\uffff\1\151\1\162\2\154\1\165\1\125\1\165\1\114\1\154\3\uffff\2\172\2\uffff\5\172\1\uffff\1\163\1\101\1\163\2\145\1\105\1\145\1\123\1\163\7\uffff\1\164\1\154\1\145\1\164\3\172\1\105\1\145\1\163\1\154\1\172\1\145\1\uffff\5\172\3\uffff";
    static final String DFA13_acceptS =
        "\11\uffff\1\13\1\uffff\1\15\5\uffff\1\25\1\26\1\uffff\1\30\1\31\1\32\1\33\1\34\1\35\6\uffff\1\43\1\44\2\uffff\1\50\1\51\1\uffff\1\43\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\36\1\14\1\15\1\46\1\47\1\16\3\uffff\1\22\2\uffff\1\25\1\26\1\uffff\1\30\1\31\1\32\1\33\1\34\1\35\11\uffff\1\44\1\45\1\50\2\uffff\1\3\1\4\5\uffff\1\27\11\uffff\1\1\1\2\1\17\1\20\1\21\1\23\1\24\15\uffff\1\42\5\uffff\1\37\1\40\1\41";
    static final String DFA13_specialS =
        "\1\1\41\uffff\1\2\1\0\137\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\6\1\42\4\45\1\43\1\21\1\22\1\13\1\11\1\26\1\12\1\45\1\14\12\41\1\24\1\45\1\10\1\5\1\7\2\45\1\1\4\40\1\37\7\40\1\17\1\3\4\40\1\36\6\40\1\25\1\45\1\27\1\16\1\40\1\45\1\2\2\40\1\34\1\32\1\33\2\40\1\23\3\40\1\15\1\20\1\4\4\40\1\35\6\40\1\30\1\45\1\31\uff82\45",
            "\1\46",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\57",
            "",
            "\1\62",
            "",
            "\1\65\4\uffff\1\66",
            "\1\70\7\uffff\1\71\5\uffff\1\72",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\111\15\uffff\1\110",
            "\1\112",
            "\1\113",
            "\1\114\37\uffff\1\115",
            "\1\116\37\uffff\1\117",
            "",
            "",
            "\0\121",
            "\0\121",
            "",
            "",
            "\1\123",
            "",
            "\1\124",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\177",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_BOOL_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_35 = input.LA(1);

                        s = -1;
                        if ( ((LA13_35>='\u0000' && LA13_35<='\uFFFF')) ) {s = 81;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='A') ) {s = 1;}

                        else if ( (LA13_0=='a') ) {s = 2;}

                        else if ( (LA13_0=='O') ) {s = 3;}

                        else if ( (LA13_0=='o') ) {s = 4;}

                        else if ( (LA13_0=='=') ) {s = 5;}

                        else if ( (LA13_0=='!') ) {s = 6;}

                        else if ( (LA13_0=='>') ) {s = 7;}

                        else if ( (LA13_0=='<') ) {s = 8;}

                        else if ( (LA13_0=='+') ) {s = 9;}

                        else if ( (LA13_0=='-') ) {s = 10;}

                        else if ( (LA13_0=='*') ) {s = 11;}

                        else if ( (LA13_0=='/') ) {s = 12;}

                        else if ( (LA13_0=='m') ) {s = 13;}

                        else if ( (LA13_0=='^') ) {s = 14;}

                        else if ( (LA13_0=='N') ) {s = 15;}

                        else if ( (LA13_0=='n') ) {s = 16;}

                        else if ( (LA13_0=='(') ) {s = 17;}

                        else if ( (LA13_0==')') ) {s = 18;}

                        else if ( (LA13_0=='i') ) {s = 19;}

                        else if ( (LA13_0==':') ) {s = 20;}

                        else if ( (LA13_0=='[') ) {s = 21;}

                        else if ( (LA13_0==',') ) {s = 22;}

                        else if ( (LA13_0==']') ) {s = 23;}

                        else if ( (LA13_0=='{') ) {s = 24;}

                        else if ( (LA13_0=='}') ) {s = 25;}

                        else if ( (LA13_0=='e') ) {s = 26;}

                        else if ( (LA13_0=='f') ) {s = 27;}

                        else if ( (LA13_0=='d') ) {s = 28;}

                        else if ( (LA13_0=='t') ) {s = 29;}

                        else if ( (LA13_0=='T') ) {s = 30;}

                        else if ( (LA13_0=='F') ) {s = 31;}

                        else if ( ((LA13_0>='B' && LA13_0<='E')||(LA13_0>='G' && LA13_0<='M')||(LA13_0>='P' && LA13_0<='S')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='c')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='l')||(LA13_0>='p' && LA13_0<='s')||(LA13_0>='u' && LA13_0<='z')) ) {s = 32;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 33;}

                        else if ( (LA13_0=='\"') ) {s = 34;}

                        else if ( (LA13_0=='\'') ) {s = 35;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 36;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='&')||LA13_0=='.'||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_34 = input.LA(1);

                        s = -1;
                        if ( ((LA13_34>='\u0000' && LA13_34<='\uFFFF')) ) {s = 81;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}