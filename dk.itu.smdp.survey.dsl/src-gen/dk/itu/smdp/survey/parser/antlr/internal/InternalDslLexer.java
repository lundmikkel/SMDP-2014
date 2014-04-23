package dk.itu.smdp.survey.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_FQN=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalDslLexer() {;} 
    public InternalDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:11:7: ( '<survey' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:11:9: '<survey'
            {
            match("<survey"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:12:7: ( 'title' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:12:9: 'title'
            {
            match("title"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:13:7: ( '=' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:13:9: '='
            {
            match('='); 

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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:14:7: ( 'description' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:14:9: 'description'
            {
            match("description"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:15:7: ( '>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:15:9: '>'
            {
            match('>'); 

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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:16:7: ( '</survey>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:16:9: '</survey>'
            {
            match("</survey>"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:17:7: ( '<template' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:17:9: '<template'
            {
            match("<template"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:18:7: ( 'id' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:18:9: 'id'
            {
            match("id"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:19:7: ( '</template>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:19:9: '</template>'
            {
            match("</template>"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:20:7: ( '<a' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:20:9: '<a'
            {
            match("<a"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:21:7: ( '</a>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:21:9: '</a>'
            {
            match("</a>"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:22:7: ( '<group' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:22:9: '<group'
            {
            match("<group"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:23:7: ( 'dependsOn' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:23:9: 'dependsOn'
            {
            match("dependsOn"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:24:7: ( 'required' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:24:9: 'required'
            {
            match("required"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:25:7: ( '</group>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:25:9: '</group>'
            {
            match("</group>"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:26:7: ( '<text' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:26:9: '<text'
            {
            match("<text"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:27:7: ( 'singleline' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:27:9: 'singleline'
            {
            match("singleline"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:28:7: ( 'single' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:28:9: 'single'
            {
            match("single"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:29:7: ( 'multi' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:29:9: 'multi'
            {
            match("multi"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:30:7: ( 'multiline' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:30:9: 'multiline'
            {
            match("multiline"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:31:7: ( '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:31:9: '/>'
            {
            match("/>"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:32:7: ( '<scale' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:32:9: '<scale'
            {
            match("<scale"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:33:7: ( 'lower' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:33:9: 'lower'
            {
            match("lower"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:34:7: ( 'upper' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:34:9: 'upper'
            {
            match("upper"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:35:7: ( 'lowerLabel' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:35:9: 'lowerLabel'
            {
            match("lowerLabel"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:36:7: ( 'upperLabel' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:36:9: 'upperLabel'
            {
            match("upperLabel"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:37:7: ( '<date' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:37:9: '<date'
            {
            match("<date"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:38:7: ( 'from' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:38:9: 'from'
            {
            match("from"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:39:7: ( 'to' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:39:9: 'to'
            {
            match("to"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:40:7: ( 'showLimits' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:40:9: 'showLimits'
            {
            match("showLimits"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:41:7: ( 'day' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:41:9: 'day'
            {
            match("day"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:42:7: ( 'month' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:42:9: 'month'
            {
            match("month"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:43:7: ( 'year' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:43:9: 'year'
            {
            match("year"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:44:7: ( '<number' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:44:9: '<number'
            {
            match("<number"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:45:7: ( '<single' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:45:9: '<single'
            {
            match("<single"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:46:7: ( 'other' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:46:9: 'other'
            {
            match("other"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:47:7: ( '</single>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:47:9: '</single>'
            {
            match("</single>"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:48:7: ( '<multiple' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:48:9: '<multiple'
            {
            match("<multiple"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:49:7: ( '</multiple>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:49:9: '</multiple>'
            {
            match("</multiple>"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:50:7: ( '<table' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:50:9: '<table'
            {
            match("<table"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:51:7: ( 'multiple' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:51:9: 'multiple'
            {
            match("multiple"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:52:7: ( '</table>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:52:9: '</table>'
            {
            match("</table>"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:53:7: ( '-' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:53:9: '-'
            {
            match('-'); 

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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:54:7: ( '<q>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:54:9: '<q>'
            {
            match("<q>"); 


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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:55:7: ( '</q>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:55:9: '</q>'
            {
            match("</q>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3397:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3397:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3397:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\"') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\'') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3397:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3397:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\\') ) {
                            alt1=1;
                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3397:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3397:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop1;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3397:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3397:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3397:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3397:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop2;
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

    // $ANTLR start "RULE_FQN"
    public final void mRULE_FQN() throws RecognitionException {
        try {
            int _type = RULE_FQN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3399:10: ( RULE_ID ( '.' RULE_ID )+ )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3399:12: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3399:20: ( '.' RULE_ID )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='.') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3399:21: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

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
    // $ANTLR end "RULE_FQN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3401:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3401:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3401:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:
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
            	    break loop5;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3403:17: ( '<!--' ( options {greedy=false; } : . )* '-->' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3403:19: '<!--' ( options {greedy=false; } : . )* '-->'
            {
            match("<!--"); 

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3403:26: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='-') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='-') ) {
                        int LA6_3 = input.LA(3);

                        if ( (LA6_3=='>') ) {
                            alt6=2;
                        }
                        else if ( ((LA6_3>='\u0000' && LA6_3<='=')||(LA6_3>='?' && LA6_3<='\uFFFF')) ) {
                            alt6=1;
                        }


                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<=',')||(LA6_1>='.' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=',')||(LA6_0>='.' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3403:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3405:10: ( ( '0' .. '9' )+ )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3405:12: ( '0' .. '9' )+
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3405:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3405:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:41: ( '\\r' )? '\\n'
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:41: '\\r'
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3409:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3409:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3409:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3411:16: ( . )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3411:18: .
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
        // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_STRING | RULE_FQN | RULE_ID | RULE_ML_COMMENT | RULE_INT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=53;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:280: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:292: RULE_FQN
                {
                mRULE_FQN(); 

                }
                break;
            case 48 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:301: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:309: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:325: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 51 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:334: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 52 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:350: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 53 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:358: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\26\1\43\1\uffff\1\43\1\uffff\4\43\1\26\5\43\1\uffff\2"+
        "\26\1\43\15\uffff\1\43\1\107\1\uffff\1\43\2\uffff\2\43\1\uffff\1"+
        "\113\5\43\2\uffff\5\43\17\uffff\1\43\1\uffff\2\43\1\137\1\uffff"+
        "\12\43\6\uffff\3\43\1\uffff\7\43\1\164\1\165\1\43\1\167\5\43\1\177"+
        "\1\u0080\1\u0082\1\u0084\2\uffff\1\u0085\1\uffff\3\43\1\u008a\3"+
        "\43\2\uffff\1\43\1\uffff\1\43\2\uffff\4\43\1\uffff\7\43\1\u009b"+
        "\3\43\1\u009f\3\43\1\u00a3\1\uffff\2\43\1\u00a6\1\uffff\3\43\1\uffff"+
        "\1\u00aa\1\u00ab\1\uffff\1\u00ac\1\u00ad\1\u00ae\5\uffff";
    static final String DFA12_eofS =
        "\u00af\uffff";
    static final String DFA12_minS =
        "\1\0\1\41\1\56\1\uffff\1\56\1\uffff\4\56\1\57\5\56\1\uffff\2\0\1"+
        "\56\3\uffff\1\143\2\141\7\uffff\2\56\1\uffff\1\56\2\uffff\2\56\1"+
        "\uffff\6\56\2\uffff\5\56\7\uffff\1\151\1\141\4\uffff\1\155\1\uffff"+
        "\1\56\1\uffff\3\56\1\uffff\12\56\6\uffff\3\56\1\uffff\24\56\2\uffff"+
        "\1\56\1\uffff\7\56\2\uffff\1\56\1\uffff\1\56\2\uffff\4\56\1\uffff"+
        "\20\56\1\uffff\3\56\1\uffff\3\56\1\uffff\2\56\1\uffff\3\56\5\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\164\1\172\1\uffff\1\172\1\uffff\4\172\1\76\5\172\1\uffff"+
        "\2\uffff\1\172\3\uffff\1\165\1\164\1\145\7\uffff\2\172\1\uffff\1"+
        "\172\2\uffff\2\172\1\uffff\6\172\2\uffff\5\172\7\uffff\1\165\1\145"+
        "\4\uffff\1\170\1\uffff\1\172\1\uffff\3\172\1\uffff\12\172\6\uffff"+
        "\3\172\1\uffff\24\172\2\uffff\1\172\1\uffff\7\172\2\uffff\1\172"+
        "\1\uffff\1\172\2\uffff\4\172\1\uffff\20\172\1\uffff\3\172\1\uffff"+
        "\3\172\1\uffff\2\172\1\uffff\3\172\5\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\12\uffff\1\53\3\uffff\1\62\1\64\1\65\3"+
        "\uffff\1\12\1\14\1\33\1\42\1\46\1\54\1\61\2\uffff\1\60\1\uffff\1"+
        "\57\1\3\2\uffff\1\5\6\uffff\1\25\1\63\5\uffff\1\53\1\56\1\62\1\64"+
        "\1\1\1\26\1\43\2\uffff\1\13\1\17\1\47\1\55\1\uffff\1\50\1\uffff"+
        "\1\35\3\uffff\1\10\12\uffff\1\6\1\45\1\11\1\52\1\7\1\20\3\uffff"+
        "\1\37\24\uffff\1\34\1\41\1\uffff\1\2\7\uffff\1\23\1\40\1\uffff\1"+
        "\27\1\uffff\1\30\1\44\4\uffff\1\22\20\uffff\1\16\3\uffff\1\51\3"+
        "\uffff\1\15\2\uffff\1\24\3\uffff\1\21\1\36\1\31\1\32\1\4";
    static final String DFA12_specialS =
        "\1\0\20\uffff\1\2\1\1\u009c\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\21\4\26\1\22\5\26\1"+
            "\20\1\26\1\12\12\24\2\26\1\1\1\3\1\5\2\26\32\23\4\26\1\23\1"+
            "\26\3\23\1\4\1\23\1\15\2\23\1\6\2\23\1\13\1\11\1\23\1\17\2\23"+
            "\1\7\1\10\1\2\1\14\3\23\1\16\1\23\uff85\26",
            "\1\40\15\uffff\1\30\61\uffff\1\32\2\uffff\1\34\2\uffff\1\33"+
            "\5\uffff\1\36\1\35\2\uffff\1\37\1\uffff\1\27\1\31",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44"+
            "\1\41\5\44\1\42\13\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\50"+
            "\3\44\1\47\25\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\3\44"+
            "\1\52\26\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\53\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\7\44"+
            "\1\55\1\54\21\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44"+
            "\1\57\5\44\1\56\5\44",
            "\1\61\16\uffff\1\60",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44"+
            "\1\62\13\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\17\44"+
            "\1\63\12\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44"+
            "\1\64\10\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\65\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44"+
            "\1\66\6\44",
            "",
            "\0\70",
            "\0\70",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\1\74\5\uffff\1\75\13\uffff\1\73",
            "\1\100\5\uffff\1\101\5\uffff\1\102\3\uffff\1\103\1\uffff\1"+
            "\76\1\77",
            "\1\105\3\uffff\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44"+
            "\1\106\6\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\17\44"+
            "\1\111\2\44\1\110\7\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\30\44"+
            "\1\112\1\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\20\44"+
            "\1\114\11\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44"+
            "\1\115\14\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44"+
            "\1\116\13\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44"+
            "\1\117\16\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44"+
            "\1\120\14\44",
            "",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\26\44"+
            "\1\121\3\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\17\44"+
            "\1\122\12\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44"+
            "\1\123\13\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\124"+
            "\31\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\7\44"+
            "\1\125\22\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127\13\uffff\1\126",
            "\1\131\3\uffff\1\130",
            "",
            "",
            "",
            "",
            "\1\132\12\uffff\1\133",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44"+
            "\1\134\16\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\2\44"+
            "\1\135\27\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\136\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\24\44"+
            "\1\140\5\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\6\44"+
            "\1\141\23\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\26\44"+
            "\1\142\3\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44"+
            "\1\143\6\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44"+
            "\1\144\6\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\145\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\146\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\14\44"+
            "\1\147\15\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44"+
            "\1\150\10\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\151\25\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\152\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44"+
            "\1\153\10\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44"+
            "\1\154\14\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44"+
            "\1\155\21\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44"+
            "\1\156\16\44",
            "\1\45\1\uffff\12\44\7\uffff\13\44\1\157\16\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44"+
            "\1\160\21\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\7\44"+
            "\1\161\22\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44"+
            "\1\162\10\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44"+
            "\1\163\10\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44"+
            "\1\166\10\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44"+
            "\1\170\21\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\3\44"+
            "\1\171\26\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44"+
            "\1\172\10\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\173\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44"+
            "\1\174\21\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44"+
            "\1\175\3\44\1\176\12\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\13\44\1\u0081\16\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\13\44\1\u0083\16\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\17\44"+
            "\1\u0086\12\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44"+
            "\1\u0087\7\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\u0088\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44"+
            "\1\u0089\16\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\14\44"+
            "\1\u008b\15\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44"+
            "\1\u008c\21\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44"+
            "\1\u008d\16\44",
            "",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\u008e"+
            "\31\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\u008f"+
            "\31\44",
            "",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44"+
            "\1\u0090\6\44",
            "\1\45\1\uffff\12\44\7\uffff\16\44\1\u0091\13\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\3\44"+
            "\1\u0092\26\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44"+
            "\1\u0093\21\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44"+
            "\1\u0094\21\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44"+
            "\1\u0095\14\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\u0096\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\44"+
            "\1\u0097\30\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\44"+
            "\1\u0098\30\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44"+
            "\1\u0099\21\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44"+
            "\1\u009a\14\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44"+
            "\1\u009c\14\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44"+
            "\1\u009d\6\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\u009e\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\u00a0\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\u00a1\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44"+
            "\1\u00a2\13\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44"+
            "\1\u00a4\25\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44"+
            "\1\u00a5\7\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44"+
            "\1\u00a7\16\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44"+
            "\1\u00a8\16\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44"+
            "\1\u00a9\14\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\45\1\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_STRING | RULE_FQN | RULE_ID | RULE_ML_COMMENT | RULE_INT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='<') ) {s = 1;}

                        else if ( (LA12_0=='t') ) {s = 2;}

                        else if ( (LA12_0=='=') ) {s = 3;}

                        else if ( (LA12_0=='d') ) {s = 4;}

                        else if ( (LA12_0=='>') ) {s = 5;}

                        else if ( (LA12_0=='i') ) {s = 6;}

                        else if ( (LA12_0=='r') ) {s = 7;}

                        else if ( (LA12_0=='s') ) {s = 8;}

                        else if ( (LA12_0=='m') ) {s = 9;}

                        else if ( (LA12_0=='/') ) {s = 10;}

                        else if ( (LA12_0=='l') ) {s = 11;}

                        else if ( (LA12_0=='u') ) {s = 12;}

                        else if ( (LA12_0=='f') ) {s = 13;}

                        else if ( (LA12_0=='y') ) {s = 14;}

                        else if ( (LA12_0=='o') ) {s = 15;}

                        else if ( (LA12_0=='-') ) {s = 16;}

                        else if ( (LA12_0=='\"') ) {s = 17;}

                        else if ( (LA12_0=='\'') ) {s = 18;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||LA12_0=='e'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='n'||(LA12_0>='p' && LA12_0<='q')||(LA12_0>='v' && LA12_0<='x')||LA12_0=='z') ) {s = 19;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 20;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 21;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=',')||LA12_0=='.'||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<='^')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 56;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 56;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}