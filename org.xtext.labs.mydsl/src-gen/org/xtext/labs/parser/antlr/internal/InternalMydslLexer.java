package org.xtext.labs.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMydslLexer extends Lexer {
    public static final int RULE_HEX=7;
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
    public static final int RULE_ID=6;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
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
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int RULE_NUM=5;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DECIMAL=9;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
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
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalMydslLexer() {;} 
    public InternalMydslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMydslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMydsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:11:7: ( 'launch_main' )
            // InternalMydsl.g:11:9: 'launch_main'
            {
            match("launch_main"); 


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
            // InternalMydsl.g:12:7: ( '(' )
            // InternalMydsl.g:12:9: '('
            {
            match('('); 

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
            // InternalMydsl.g:13:7: ( ')' )
            // InternalMydsl.g:13:9: ')'
            {
            match(')'); 

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
            // InternalMydsl.g:14:7: ( '{' )
            // InternalMydsl.g:14:9: '{'
            {
            match('{'); 

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
            // InternalMydsl.g:15:7: ( '}' )
            // InternalMydsl.g:15:9: '}'
            {
            match('}'); 

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
            // InternalMydsl.g:16:7: ( 'return' )
            // InternalMydsl.g:16:9: 'return'
            {
            match("return"); 


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
            // InternalMydsl.g:17:7: ( 'num' )
            // InternalMydsl.g:17:9: 'num'
            {
            match("num"); 


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
            // InternalMydsl.g:18:7: ( 'string' )
            // InternalMydsl.g:18:9: 'string'
            {
            match("string"); 


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
            // InternalMydsl.g:19:7: ( 'bool' )
            // InternalMydsl.g:19:9: 'bool'
            {
            match("bool"); 


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
            // InternalMydsl.g:20:7: ( 'var' )
            // InternalMydsl.g:20:9: 'var'
            {
            match("var"); 


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
            // InternalMydsl.g:21:7: ( 'val' )
            // InternalMydsl.g:21:9: 'val'
            {
            match("val"); 


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
            // InternalMydsl.g:22:7: ( ':' )
            // InternalMydsl.g:22:9: ':'
            {
            match(':'); 

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
            // InternalMydsl.g:23:7: ( 'true' )
            // InternalMydsl.g:23:9: 'true'
            {
            match("true"); 


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
            // InternalMydsl.g:24:7: ( 'false' )
            // InternalMydsl.g:24:9: 'false'
            {
            match("false"); 


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
            // InternalMydsl.g:25:7: ( '[' )
            // InternalMydsl.g:25:9: '['
            {
            match('['); 

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
            // InternalMydsl.g:26:7: ( ']' )
            // InternalMydsl.g:26:9: ']'
            {
            match(']'); 

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
            // InternalMydsl.g:27:7: ( ',' )
            // InternalMydsl.g:27:9: ','
            {
            match(','); 

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
            // InternalMydsl.g:28:7: ( 'def' )
            // InternalMydsl.g:28:9: 'def'
            {
            match("def"); 


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
            // InternalMydsl.g:29:7: ( 'if' )
            // InternalMydsl.g:29:9: 'if'
            {
            match("if"); 


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
            // InternalMydsl.g:30:7: ( 'else' )
            // InternalMydsl.g:30:9: 'else'
            {
            match("else"); 


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
            // InternalMydsl.g:31:7: ( 'while' )
            // InternalMydsl.g:31:9: 'while'
            {
            match("while"); 


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
            // InternalMydsl.g:32:7: ( 'printstr' )
            // InternalMydsl.g:32:9: 'printstr'
            {
            match("printstr"); 


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
            // InternalMydsl.g:33:7: ( 'strjoin' )
            // InternalMydsl.g:33:9: 'strjoin'
            {
            match("strjoin"); 


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
            // InternalMydsl.g:34:7: ( 'strsplit' )
            // InternalMydsl.g:34:9: 'strsplit'
            {
            match("strsplit"); 


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
            // InternalMydsl.g:35:7: ( 'numtostr' )
            // InternalMydsl.g:35:9: 'numtostr'
            {
            match("numtostr"); 


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
            // InternalMydsl.g:36:7: ( 'getargs' )
            // InternalMydsl.g:36:9: 'getargs'
            {
            match("getargs"); 


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
            // InternalMydsl.g:37:7: ( 'break' )
            // InternalMydsl.g:37:9: 'break'
            {
            match("break"); 


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
            // InternalMydsl.g:38:7: ( '-' )
            // InternalMydsl.g:38:9: '-'
            {
            match('-'); 

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
            // InternalMydsl.g:39:7: ( '+' )
            // InternalMydsl.g:39:9: '+'
            {
            match('+'); 

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
            // InternalMydsl.g:40:7: ( '/' )
            // InternalMydsl.g:40:9: '/'
            {
            match('/'); 

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
            // InternalMydsl.g:41:7: ( '*' )
            // InternalMydsl.g:41:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:42:7: ( '>=' )
            // InternalMydsl.g:42:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:43:7: ( '<=' )
            // InternalMydsl.g:43:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:44:7: ( '==' )
            // InternalMydsl.g:44:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:45:7: ( '!=' )
            // InternalMydsl.g:45:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:46:7: ( '<' )
            // InternalMydsl.g:46:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:47:7: ( '>' )
            // InternalMydsl.g:47:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:48:7: ( '=' )
            // InternalMydsl.g:48:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:49:7: ( 'and' )
            // InternalMydsl.g:49:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:50:7: ( 'or' )
            // InternalMydsl.g:50:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:51:7: ( '+=' )
            // InternalMydsl.g:51:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:52:7: ( '-=' )
            // InternalMydsl.g:52:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:53:7: ( '*=' )
            // InternalMydsl.g:53:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:54:7: ( '/=' )
            // InternalMydsl.g:54:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:55:7: ( '%=' )
            // InternalMydsl.g:55:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:56:7: ( '||' )
            // InternalMydsl.g:56:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:57:7: ( '&&' )
            // InternalMydsl.g:57:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:58:7: ( '===' )
            // InternalMydsl.g:58:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:59:7: ( '!==' )
            // InternalMydsl.g:59:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:60:7: ( 'instanceof' )
            // InternalMydsl.g:60:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:61:7: ( '->' )
            // InternalMydsl.g:61:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:62:7: ( '..<' )
            // InternalMydsl.g:62:9: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:63:7: ( '..' )
            // InternalMydsl.g:63:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:64:7: ( '=>' )
            // InternalMydsl.g:64:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:65:7: ( '<>' )
            // InternalMydsl.g:65:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:66:7: ( '?:' )
            // InternalMydsl.g:66:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:67:7: ( '**' )
            // InternalMydsl.g:67:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:68:7: ( '%' )
            // InternalMydsl.g:68:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:69:7: ( '!' )
            // InternalMydsl.g:69:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:70:7: ( 'as' )
            // InternalMydsl.g:70:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:71:7: ( '++' )
            // InternalMydsl.g:71:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:72:7: ( '--' )
            // InternalMydsl.g:72:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:73:7: ( '.' )
            // InternalMydsl.g:73:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:74:7: ( '::' )
            // InternalMydsl.g:74:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:75:7: ( '?.' )
            // InternalMydsl.g:75:9: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:76:7: ( '#' )
            // InternalMydsl.g:76:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:77:7: ( '|' )
            // InternalMydsl.g:77:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:78:7: ( ';' )
            // InternalMydsl.g:78:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:79:7: ( 'switch' )
            // InternalMydsl.g:79:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:80:7: ( 'default' )
            // InternalMydsl.g:80:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:81:7: ( 'case' )
            // InternalMydsl.g:81:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:82:7: ( 'for' )
            // InternalMydsl.g:82:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:83:7: ( 'do' )
            // InternalMydsl.g:83:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:84:7: ( 'extends' )
            // InternalMydsl.g:84:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:85:7: ( 'static' )
            // InternalMydsl.g:85:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:86:7: ( 'import' )
            // InternalMydsl.g:86:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:87:7: ( 'extension' )
            // InternalMydsl.g:87:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:88:7: ( 'super' )
            // InternalMydsl.g:88:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:89:7: ( 'new' )
            // InternalMydsl.g:89:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:90:7: ( 'null' )
            // InternalMydsl.g:90:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:91:7: ( 'typeof' )
            // InternalMydsl.g:91:9: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:92:7: ( 'throw' )
            // InternalMydsl.g:92:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:93:7: ( 'try' )
            // InternalMydsl.g:93:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:94:7: ( 'finally' )
            // InternalMydsl.g:94:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:95:7: ( 'synchronized' )
            // InternalMydsl.g:95:9: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:96:7: ( 'catch' )
            // InternalMydsl.g:96:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:97:8: ( '?' )
            // InternalMydsl.g:97:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:98:8: ( '&' )
            // InternalMydsl.g:98:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "RULE_NUM"
    public final void mRULE_NUM() throws RecognitionException {
        try {
            int _type = RULE_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:7988:10: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // InternalMydsl.g:7988:12: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // InternalMydsl.g:7988:12: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMydsl.g:7988:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMydsl.g:7988:24: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMydsl.g:7988:25: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalMydsl.g:7988:29: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMydsl.g:7988:30: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_NUM"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:7990:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // InternalMydsl.g:7990:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // InternalMydsl.g:7990:12: ( '0x' | '0X' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='x') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='X') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMydsl.g:7990:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalMydsl.g:7990:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalMydsl.g:7990:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='F')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='f')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMydsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            // InternalMydsl.g:7990:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='#') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMydsl.g:7990:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // InternalMydsl.g:7990:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='B'||LA6_0=='b') ) {
                        alt6=1;
                    }
                    else if ( (LA6_0=='L'||LA6_0=='l') ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMydsl.g:7990:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // InternalMydsl.g:7990:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


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
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:7992:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // InternalMydsl.g:7992:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // InternalMydsl.g:7992:21: ( '0' .. '9' | '_' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||LA8_0=='_') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMydsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:7994:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // InternalMydsl.g:7994:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // InternalMydsl.g:7994:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='E'||LA10_0=='e') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMydsl.g:7994:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMydsl.g:7994:36: ( '+' | '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMydsl.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalMydsl.g:7994:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='B'||LA11_0=='b') ) {
                alt11=1;
            }
            else if ( (LA11_0=='D'||LA11_0=='F'||LA11_0=='L'||LA11_0=='d'||LA11_0=='f'||LA11_0=='l') ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalMydsl.g:7994:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalMydsl.g:7994:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:7996:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // InternalMydsl.g:7996:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // InternalMydsl.g:7996:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMydsl.g:7996:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMydsl.g:7996:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='$'||(LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMydsl.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMydsl.g:7998:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // InternalMydsl.g:7998:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // InternalMydsl.g:7998:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\"') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMydsl.g:7998:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // InternalMydsl.g:7998:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMydsl.g:7998:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMydsl.g:7998:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop14;
                        }
                    } while (true);

                    // InternalMydsl.g:7998:44: ( '\"' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\"') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMydsl.g:7998:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMydsl.g:7998:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // InternalMydsl.g:7998:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMydsl.g:7998:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMydsl.g:7998:62: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop16;
                        }
                    } while (true);

                    // InternalMydsl.g:7998:79: ( '\\'' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\'') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMydsl.g:7998:79: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


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
            // InternalMydsl.g:8000:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMydsl.g:8000:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMydsl.g:8000:24: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='*') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='/') ) {
                        alt19=2;
                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMydsl.g:8000:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
            // InternalMydsl.g:8002:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMydsl.g:8002:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMydsl.g:8002:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMydsl.g:8002:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop20;
                }
            } while (true);

            // InternalMydsl.g:8002:40: ( ( '\\r' )? '\\n' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\n'||LA22_0=='\r') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMydsl.g:8002:41: ( '\\r' )? '\\n'
                    {
                    // InternalMydsl.g:8002:41: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMydsl.g:8002:41: '\\r'
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
            // InternalMydsl.g:8004:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMydsl.g:8004:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMydsl.g:8004:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMydsl.g:
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
            // InternalMydsl.g:8006:16: ( . )
            // InternalMydsl.g:8006:18: .
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
        // InternalMydsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_NUM | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=98;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // InternalMydsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalMydsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalMydsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalMydsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalMydsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalMydsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalMydsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalMydsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalMydsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalMydsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalMydsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalMydsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalMydsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalMydsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalMydsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalMydsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalMydsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalMydsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalMydsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalMydsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalMydsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalMydsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalMydsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalMydsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalMydsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalMydsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalMydsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalMydsl.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalMydsl.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalMydsl.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalMydsl.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalMydsl.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalMydsl.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalMydsl.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalMydsl.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalMydsl.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalMydsl.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalMydsl.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalMydsl.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalMydsl.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalMydsl.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalMydsl.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalMydsl.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalMydsl.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalMydsl.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalMydsl.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalMydsl.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalMydsl.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalMydsl.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalMydsl.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalMydsl.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalMydsl.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalMydsl.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalMydsl.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalMydsl.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalMydsl.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalMydsl.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalMydsl.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // InternalMydsl.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // InternalMydsl.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // InternalMydsl.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // InternalMydsl.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // InternalMydsl.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // InternalMydsl.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // InternalMydsl.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // InternalMydsl.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // InternalMydsl.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // InternalMydsl.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // InternalMydsl.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // InternalMydsl.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // InternalMydsl.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // InternalMydsl.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // InternalMydsl.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // InternalMydsl.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // InternalMydsl.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // InternalMydsl.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // InternalMydsl.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // InternalMydsl.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // InternalMydsl.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // InternalMydsl.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // InternalMydsl.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // InternalMydsl.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // InternalMydsl.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // InternalMydsl.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // InternalMydsl.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // InternalMydsl.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // InternalMydsl.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // InternalMydsl.g:1:533: T__101
                {
                mT__101(); 

                }
                break;
            case 89 :
                // InternalMydsl.g:1:540: RULE_NUM
                {
                mRULE_NUM(); 

                }
                break;
            case 90 :
                // InternalMydsl.g:1:549: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 91 :
                // InternalMydsl.g:1:558: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 92 :
                // InternalMydsl.g:1:567: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 93 :
                // InternalMydsl.g:1:580: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 94 :
                // InternalMydsl.g:1:588: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 95 :
                // InternalMydsl.g:1:600: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 96 :
                // InternalMydsl.g:1:616: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 97 :
                // InternalMydsl.g:1:632: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 98 :
                // InternalMydsl.g:1:640: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA24_eotS =
        "\1\52\1\63\4\uffff\5\63\1\103\2\63\3\uffff\6\63\1\132\1\135\1\141\1\144\1\146\1\151\1\154\1\156\2\63\1\163\1\165\1\167\1\171\1\174\2\uffff\1\63\1\52\1\uffff\1\52\1\61\5\uffff\1\63\5\uffff\12\63\2\uffff\6\63\3\uffff\1\63\1\u009c\1\u009d\7\63\23\uffff\1\u00a6\2\uffff\1\u00a8\1\uffff\1\63\1\u00aa\1\u00ab\6\uffff\1\u00ad\6\uffff\1\63\1\uffff\1\52\1\uffff\1\u00b0\2\uffff\2\63\1\u00b4\1\63\1\u00b6\7\63\1\u00c0\1\u00c1\1\63\1\u00c3\3\63\1\u00c7\1\63\1\u00ca\2\uffff\7\63\4\uffff\1\u00d2\4\uffff\2\63\1\uffff\3\63\1\uffff\1\u00d8\1\uffff\7\63\1\u00e0\1\63\2\uffff\1\u00e2\1\uffff\3\63\1\uffff\2\63\1\uffff\2\63\1\u00ea\4\63\1\uffff\1\u00ef\4\63\1\uffff\5\63\1\u00f9\1\63\1\uffff\1\u00fb\1\uffff\1\63\1\u00fd\1\u00fe\4\63\1\uffff\1\63\1\u0105\2\63\1\uffff\1\u0108\1\63\1\u010a\1\63\1\u010c\2\63\1\u010f\1\u0110\1\uffff\1\63\1\uffff\1\u0112\2\uffff\3\63\1\u0116\2\63\1\uffff\2\63\1\uffff\1\63\1\uffff\1\63\1\uffff\1\u011d\1\63\2\uffff\1\63\1\uffff\1\u0120\1\u0121\1\63\1\uffff\1\u0123\2\63\1\u0126\1\63\1\u0128\1\uffff\1\u0129\1\63\2\uffff\1\63\1\uffff\1\63\1\u012d\1\uffff\1\63\2\uffff\2\63\1\u0131\1\uffff\2\63\1\u0134\1\uffff\1\u0135\1\63\2\uffff\1\u0137\1\uffff";
    static final String DFA24_eofS =
        "\u0138\uffff";
    static final String DFA24_minS =
        "\1\0\1\141\4\uffff\2\145\1\164\1\157\1\141\1\72\1\150\1\141\3\uffff\1\145\1\146\1\154\1\150\1\162\1\145\1\55\1\53\2\52\4\75\1\156\1\162\1\75\1\174\1\46\2\56\2\uffff\1\141\1\60\1\uffff\1\60\1\44\5\uffff\1\165\5\uffff\1\164\1\154\1\167\1\141\1\151\1\160\1\156\1\157\1\145\1\154\2\uffff\1\165\1\160\1\162\1\154\1\162\1\156\3\uffff\1\146\2\44\1\163\1\160\1\163\1\164\2\151\1\164\23\uffff\1\75\2\uffff\1\75\1\uffff\1\144\2\44\6\uffff\1\74\6\uffff\1\163\1\uffff\1\60\1\uffff\1\60\2\uffff\1\156\1\165\1\44\1\154\1\44\1\151\2\164\1\145\1\143\1\154\1\141\2\44\1\145\1\44\1\145\1\157\1\163\1\44\1\141\1\44\2\uffff\1\164\1\157\2\145\1\154\1\156\1\141\4\uffff\1\44\4\uffff\1\145\1\143\1\uffff\1\143\1\162\1\157\1\uffff\1\44\1\uffff\1\156\1\157\1\160\1\151\1\143\1\162\1\150\1\44\1\153\2\uffff\1\44\1\uffff\1\157\1\167\1\145\1\uffff\1\154\1\165\1\uffff\1\141\1\162\1\44\1\156\1\145\1\164\1\162\1\uffff\1\44\2\150\1\156\1\163\1\uffff\1\147\1\151\1\154\1\143\1\150\1\44\1\162\1\uffff\1\44\1\uffff\1\146\2\44\2\154\1\156\1\164\1\uffff\1\144\1\44\1\163\1\147\1\uffff\1\44\1\137\1\44\1\164\1\44\1\156\1\151\2\44\1\uffff\1\157\1\uffff\1\44\2\uffff\1\171\1\164\1\143\1\44\1\163\1\151\1\uffff\1\164\1\163\1\uffff\1\155\1\uffff\1\162\1\uffff\1\44\1\164\2\uffff\1\156\1\uffff\2\44\1\145\1\uffff\1\44\1\157\1\162\1\44\1\141\1\44\1\uffff\1\44\1\151\2\uffff\1\157\1\uffff\1\156\1\44\1\uffff\1\151\2\uffff\1\172\1\146\1\44\1\uffff\1\156\1\145\1\44\1\uffff\1\44\1\144\2\uffff\1\44\1\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\141\4\uffff\1\145\1\165\1\171\1\162\1\141\1\72\1\171\1\157\3\uffff\1\157\1\156\1\170\1\150\1\162\1\145\1\76\4\75\2\76\1\75\1\163\1\162\1\75\1\174\1\46\1\71\1\72\2\uffff\1\141\1\170\1\uffff\1\154\1\172\5\uffff\1\165\5\uffff\1\164\1\155\1\167\1\162\1\151\1\160\1\156\1\157\1\145\1\162\2\uffff\1\171\1\160\1\162\1\154\1\162\1\156\3\uffff\1\146\2\172\1\163\1\160\1\163\1\164\2\151\1\164\23\uffff\1\75\2\uffff\1\75\1\uffff\1\144\2\172\6\uffff\1\74\6\uffff\1\164\1\uffff\1\154\1\uffff\1\154\2\uffff\1\156\1\165\1\172\1\154\1\172\1\163\2\164\1\145\1\143\1\154\1\141\2\172\1\145\1\172\1\145\1\157\1\163\1\172\1\141\1\172\2\uffff\1\164\1\157\2\145\1\154\1\156\1\141\4\uffff\1\172\4\uffff\1\145\1\143\1\uffff\1\143\1\162\1\157\1\uffff\1\172\1\uffff\1\156\1\157\1\160\1\151\1\143\1\162\1\150\1\172\1\153\2\uffff\1\172\1\uffff\1\157\1\167\1\145\1\uffff\1\154\1\165\1\uffff\1\141\1\162\1\172\1\156\1\145\1\164\1\162\1\uffff\1\172\2\150\1\156\1\163\1\uffff\1\147\1\151\1\154\1\143\1\150\1\172\1\162\1\uffff\1\172\1\uffff\1\146\2\172\2\154\1\156\1\164\1\uffff\1\163\1\172\1\163\1\147\1\uffff\1\172\1\137\1\172\1\164\1\172\1\156\1\151\2\172\1\uffff\1\157\1\uffff\1\172\2\uffff\1\171\1\164\1\143\1\172\1\163\1\151\1\uffff\1\164\1\163\1\uffff\1\155\1\uffff\1\162\1\uffff\1\172\1\164\2\uffff\1\156\1\uffff\2\172\1\145\1\uffff\1\172\1\157\1\162\1\172\1\141\1\172\1\uffff\1\172\1\151\2\uffff\1\157\1\uffff\1\156\1\172\1\uffff\1\151\2\uffff\1\172\1\146\1\172\1\uffff\1\156\1\145\1\172\1\uffff\1\172\1\144\2\uffff\1\172\1\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\10\uffff\1\17\1\20\1\21\25\uffff\1\102\1\104\2\uffff\1\131\2\uffff\1\135\2\136\1\141\1\142\1\uffff\1\135\1\2\1\3\1\4\1\5\12\uffff\1\100\1\14\6\uffff\1\17\1\20\1\21\12\uffff\1\52\1\63\1\76\1\34\1\51\1\75\1\35\1\54\1\137\1\140\1\36\1\53\1\71\1\37\1\40\1\45\1\41\1\67\1\44\1\uffff\1\66\1\46\1\uffff\1\73\3\uffff\1\55\1\72\1\56\1\103\1\57\1\130\1\uffff\1\77\1\70\1\101\1\127\1\102\1\104\1\uffff\1\132\1\uffff\1\134\1\uffff\1\136\1\141\26\uffff\1\111\1\23\7\uffff\1\60\1\42\1\61\1\43\1\uffff\1\74\1\50\1\64\1\65\2\uffff\1\133\3\uffff\1\7\1\uffff\1\117\11\uffff\1\12\1\13\1\uffff\1\123\3\uffff\1\110\2\uffff\1\22\7\uffff\1\47\5\uffff\1\120\7\uffff\1\11\1\uffff\1\15\7\uffff\1\24\4\uffff\1\107\11\uffff\1\116\1\uffff\1\33\1\uffff\1\122\1\16\6\uffff\1\25\2\uffff\1\126\1\uffff\1\6\1\uffff\1\10\2\uffff\1\113\1\105\1\uffff\1\121\3\uffff\1\114\6\uffff\1\27\2\uffff\1\124\1\106\1\uffff\1\112\2\uffff\1\32\1\uffff\1\31\1\30\3\uffff\1\26\3\uffff\1\115\2\uffff\1\62\1\1\1\uffff\1\125";
    static final String DFA24_specialS =
        "\1\0\u0137\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\36\1\56\1\46\1\55\1\41\1\43\1\57\1\2\1\3\1\32\1\30\1\20\1\27\1\44\1\31\1\51\11\53\1\13\1\47\1\34\1\35\1\33\1\45\1\61\32\55\1\16\1\61\1\17\1\54\1\55\1\61\1\37\1\11\1\50\1\21\1\23\1\15\1\26\1\55\1\22\2\55\1\1\1\55\1\7\1\40\1\25\1\55\1\6\1\10\1\14\1\55\1\12\1\24\3\55\1\4\1\42\1\5\uff82\61",
            "\1\62",
            "",
            "",
            "",
            "",
            "\1\70",
            "\1\72\17\uffff\1\71",
            "\1\73\1\75\1\uffff\1\74\1\uffff\1\76",
            "\1\77\2\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\106\11\uffff\1\104\6\uffff\1\105",
            "\1\107\7\uffff\1\111\5\uffff\1\110",
            "",
            "",
            "",
            "\1\115\11\uffff\1\116",
            "\1\117\6\uffff\1\121\1\120",
            "\1\122\13\uffff\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\131\17\uffff\1\127\1\130",
            "\1\134\21\uffff\1\133",
            "\1\137\4\uffff\1\140\15\uffff\1\136",
            "\1\143\22\uffff\1\142",
            "\1\145",
            "\1\147\1\150",
            "\1\152\1\153",
            "\1\155",
            "\1\157\4\uffff\1\160",
            "\1\161",
            "\1\162",
            "\1\164",
            "\1\166",
            "\1\170\1\uffff\12\52",
            "\1\173\13\uffff\1\172",
            "",
            "",
            "\1\177",
            "\12\u0081\10\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1\u0082\13\uffff\1\u0080\6\uffff\1\u0083\2\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1\u0082\13\uffff\1\u0080",
            "",
            "\12\u0081\10\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1\u0082\22\uffff\1\u0083\2\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1\u0082",
            "\1\63\34\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "",
            "\1\u0086",
            "",
            "",
            "",
            "",
            "",
            "\1\u0087",
            "\1\u0089\1\u0088",
            "\1\u008a",
            "\1\u008c\20\uffff\1\u008b",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0093\5\uffff\1\u0092",
            "",
            "",
            "\1\u0094\3\uffff\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "",
            "",
            "\1\u009b",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a5",
            "",
            "",
            "\1\u00a7",
            "",
            "\1\u00a9",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ac",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ae\1\u00af",
            "",
            "\12\u0081\10\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1\u0082\22\uffff\1\u0083\2\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1\u0082",
            "",
            "\12\u0083\10\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1\u0082\22\uffff\1\u0083\2\uffff\1\u0082\1\uffff\3\u0082\5\uffff\1\u0082",
            "",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\u00b3\6\63",
            "\1\u00b5",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b7\1\u00b8\10\uffff\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c2",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c8",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\u00c9\31\63",
            "",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "",
            "",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e1",
            "",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00fa",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00fc",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103\16\uffff\1\u0104",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0106",
            "\1\u0107",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0109",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u010b",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u010d",
            "\1\u010e",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0111",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "",
            "\1\u011c",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u011e",
            "",
            "",
            "\1\u011f",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0122",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0124",
            "\1\u0125",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0127",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u012a",
            "",
            "",
            "\1\u012b",
            "",
            "\1\u012c",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u012e",
            "",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0136",
            "",
            "",
            "\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_NUM | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='l') ) {s = 1;}

                        else if ( (LA24_0=='(') ) {s = 2;}

                        else if ( (LA24_0==')') ) {s = 3;}

                        else if ( (LA24_0=='{') ) {s = 4;}

                        else if ( (LA24_0=='}') ) {s = 5;}

                        else if ( (LA24_0=='r') ) {s = 6;}

                        else if ( (LA24_0=='n') ) {s = 7;}

                        else if ( (LA24_0=='s') ) {s = 8;}

                        else if ( (LA24_0=='b') ) {s = 9;}

                        else if ( (LA24_0=='v') ) {s = 10;}

                        else if ( (LA24_0==':') ) {s = 11;}

                        else if ( (LA24_0=='t') ) {s = 12;}

                        else if ( (LA24_0=='f') ) {s = 13;}

                        else if ( (LA24_0=='[') ) {s = 14;}

                        else if ( (LA24_0==']') ) {s = 15;}

                        else if ( (LA24_0==',') ) {s = 16;}

                        else if ( (LA24_0=='d') ) {s = 17;}

                        else if ( (LA24_0=='i') ) {s = 18;}

                        else if ( (LA24_0=='e') ) {s = 19;}

                        else if ( (LA24_0=='w') ) {s = 20;}

                        else if ( (LA24_0=='p') ) {s = 21;}

                        else if ( (LA24_0=='g') ) {s = 22;}

                        else if ( (LA24_0=='-') ) {s = 23;}

                        else if ( (LA24_0=='+') ) {s = 24;}

                        else if ( (LA24_0=='/') ) {s = 25;}

                        else if ( (LA24_0=='*') ) {s = 26;}

                        else if ( (LA24_0=='>') ) {s = 27;}

                        else if ( (LA24_0=='<') ) {s = 28;}

                        else if ( (LA24_0=='=') ) {s = 29;}

                        else if ( (LA24_0=='!') ) {s = 30;}

                        else if ( (LA24_0=='a') ) {s = 31;}

                        else if ( (LA24_0=='o') ) {s = 32;}

                        else if ( (LA24_0=='%') ) {s = 33;}

                        else if ( (LA24_0=='|') ) {s = 34;}

                        else if ( (LA24_0=='&') ) {s = 35;}

                        else if ( (LA24_0=='.') ) {s = 36;}

                        else if ( (LA24_0=='?') ) {s = 37;}

                        else if ( (LA24_0=='#') ) {s = 38;}

                        else if ( (LA24_0==';') ) {s = 39;}

                        else if ( (LA24_0=='c') ) {s = 40;}

                        else if ( (LA24_0=='0') ) {s = 41;}

                        else if ( ((LA24_0>='1' && LA24_0<='9')) ) {s = 43;}

                        else if ( (LA24_0=='^') ) {s = 44;}

                        else if ( (LA24_0=='$'||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='h'||(LA24_0>='j' && LA24_0<='k')||LA24_0=='m'||LA24_0=='q'||LA24_0=='u'||(LA24_0>='x' && LA24_0<='z')) ) {s = 45;}

                        else if ( (LA24_0=='\"') ) {s = 46;}

                        else if ( (LA24_0=='\'') ) {s = 47;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 48;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='@'||LA24_0=='\\'||LA24_0=='`'||(LA24_0>='~' && LA24_0<='\uFFFF')) ) {s = 49;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}