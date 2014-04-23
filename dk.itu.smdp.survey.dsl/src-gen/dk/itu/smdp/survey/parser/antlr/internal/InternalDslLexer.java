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
    public static final int RULE_ID=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int RULE_QUOTED_ID=5;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
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
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_WS=11;

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

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "RULE_QUOTED_ID"
    public final void mRULE_QUOTED_ID() throws RecognitionException {
        try {
            int _type = RULE_QUOTED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3405:16: ( ( '\"' RULE_ID '\"' | '\\'' RULE_ID '\\'' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3405:18: ( '\"' RULE_ID '\"' | '\\'' RULE_ID '\\'' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3405:18: ( '\"' RULE_ID '\"' | '\\'' RULE_ID '\\'' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\"') ) {
                alt1=1;
            }
            else if ( (LA1_0=='\'') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3405:19: '\"' RULE_ID '\"'
                    {
                    match('\"'); 
                    mRULE_ID(); 
                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3405:35: '\\'' RULE_ID '\\''
                    {
                    match('\''); 
                    mRULE_ID(); 
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
    // $ANTLR end "RULE_QUOTED_ID"

    // $ANTLR start "RULE_FQN"
    public final void mRULE_FQN() throws RecognitionException {
        try {
            int _type = RULE_FQN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:10: ( ( '\"' RULE_ID ( '.' RULE_ID )* '\"' | '\\'' RULE_ID ( '.' RULE_ID )* '\\'' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:12: ( '\"' RULE_ID ( '.' RULE_ID )* '\"' | '\\'' RULE_ID ( '.' RULE_ID )* '\\'' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:12: ( '\"' RULE_ID ( '.' RULE_ID )* '\"' | '\\'' RULE_ID ( '.' RULE_ID )* '\\'' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:13: '\"' RULE_ID ( '.' RULE_ID )* '\"'
                    {
                    match('\"'); 
                    mRULE_ID(); 
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:25: ( '.' RULE_ID )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='.') ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:26: '.' RULE_ID
                    	    {
                    	    match('.'); 
                    	    mRULE_ID(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:44: '\\'' RULE_ID ( '.' RULE_ID )* '\\''
                    {
                    match('\''); 
                    mRULE_ID(); 
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:57: ( '.' RULE_ID )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='.') ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3407:58: '.' RULE_ID
                    	    {
                    	    match('.'); 
                    	    mRULE_ID(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
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
    // $ANTLR end "RULE_FQN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3409:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3409:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3409:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3411:17: ( '<!--' ( options {greedy=false; } : . )* '-->' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3411:19: '<!--' ( options {greedy=false; } : . )* '-->'
            {
            match("<!--"); 

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3411:26: ( options {greedy=false; } : . )*
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3411:54: .
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3413:10: ( ( '0' .. '9' )+ )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3413:12: ( '0' .. '9' )+
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3413:12: ( '0' .. '9' )+
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3413:13: '0' .. '9'
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3417:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3417:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3417:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3417:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3417:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3417:41: ( '\\r' )? '\\n'
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3417:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3417:41: '\\r'
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3419:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3419:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3419:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3421:16: ( . )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3421:18: .
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
        // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_QUOTED_ID | RULE_FQN | RULE_ID | RULE_ML_COMMENT | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=54;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:280: RULE_QUOTED_ID
                {
                mRULE_QUOTED_ID(); 

                }
                break;
            case 47 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:295: RULE_FQN
                {
                mRULE_FQN(); 

                }
                break;
            case 48 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:304: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:312: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:328: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 51 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:337: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 52 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:349: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:365: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1:373: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\26\1\43\1\uffff\1\43\1\uffff\4\43\1\26\5\43\1\uffff\2"+
        "\26\16\uffff\1\43\1\107\2\uffff\2\43\1\uffff\1\113\5\43\2\uffff"+
        "\5\43\21\uffff\1\43\1\uffff\2\43\1\145\1\uffff\12\43\14\uffff\3"+
        "\43\1\uffff\7\43\1\175\1\176\1\43\3\uffff\1\u0084\5\43\1\u008c\1"+
        "\u008d\1\u008f\1\u0091\2\uffff\1\u0092\5\uffff\3\43\1\u0098\3\43"+
        "\2\uffff\1\43\1\uffff\1\43\3\uffff\4\43\1\uffff\7\43\1\u00a9\3\43"+
        "\1\u00ad\3\43\1\u00b1\1\uffff\2\43\1\u00b4\1\uffff\3\43\1\uffff"+
        "\1\u00b8\1\u00b9\1\uffff\1\u00ba\1\u00bb\1\u00bc\5\uffff";
    static final String DFA15_eofS =
        "\u00bd\uffff";
    static final String DFA15_minS =
        "\1\0\1\41\1\151\1\uffff\1\141\1\uffff\1\144\1\145\1\150\1\157\1"+
        "\57\1\157\1\160\1\162\1\145\1\164\1\uffff\2\0\4\uffff\1\143\2\141"+
        "\7\uffff\1\164\1\60\2\uffff\1\160\1\171\1\uffff\1\60\1\161\1\156"+
        "\1\157\1\154\1\156\2\uffff\1\167\1\160\1\157\1\141\1\150\2\uffff"+
        "\2\0\5\uffff\1\151\1\141\4\uffff\1\155\1\uffff\1\154\1\uffff\1\143"+
        "\1\145\1\60\1\uffff\1\165\1\147\1\167\2\164\2\145\1\155\1\162\1"+
        "\145\1\uffff\4\0\7\uffff\1\145\1\162\1\156\1\uffff\1\151\1\154\1"+
        "\114\1\151\1\150\2\162\2\60\1\162\1\uffff\2\0\1\60\1\151\1\144\1"+
        "\162\1\145\1\151\4\60\2\uffff\1\60\1\uffff\1\0\1\uffff\1\0\1\uffff"+
        "\1\160\1\163\1\145\1\60\1\155\1\151\1\154\2\uffff\1\141\1\uffff"+
        "\1\141\3\uffff\1\164\1\117\1\144\1\151\1\uffff\1\151\1\156\1\145"+
        "\2\142\1\151\1\156\1\60\1\156\1\164\1\145\1\60\2\145\1\157\1\60"+
        "\1\uffff\1\145\1\163\1\60\1\uffff\2\154\1\156\1\uffff\2\60\1\uffff"+
        "\3\60\5\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\164\1\157\1\uffff\1\145\1\uffff\1\144\1\145\1\151\1\165"+
        "\1\76\1\157\1\160\1\162\1\145\1\164\1\uffff\2\uffff\4\uffff\1\165"+
        "\1\164\1\145\7\uffff\1\164\1\172\2\uffff\1\163\1\171\1\uffff\1\172"+
        "\1\161\1\156\1\157\1\154\1\156\2\uffff\1\167\1\160\1\157\1\141\1"+
        "\150\2\uffff\2\uffff\5\uffff\1\165\1\145\4\uffff\1\170\1\uffff\1"+
        "\154\1\uffff\1\143\1\145\1\172\1\uffff\1\165\1\147\1\167\2\164\2"+
        "\145\1\155\1\162\1\145\1\uffff\4\uffff\7\uffff\1\145\1\162\1\156"+
        "\1\uffff\1\151\1\154\1\114\1\151\1\150\2\162\2\172\1\162\1\uffff"+
        "\2\uffff\1\172\1\151\1\144\1\162\1\145\1\151\4\172\2\uffff\1\172"+
        "\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\160\1\163\1\145\1\172"+
        "\1\155\1\151\1\154\2\uffff\1\141\1\uffff\1\141\3\uffff\1\164\1\117"+
        "\1\144\1\151\1\uffff\1\151\1\156\1\145\2\142\1\151\1\156\1\172\1"+
        "\156\1\164\1\145\1\172\2\145\1\157\1\172\1\uffff\1\145\1\163\1\172"+
        "\1\uffff\2\154\1\156\1\uffff\2\172\1\uffff\3\172\5\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\12\uffff\1\53\2\uffff\1\60\1\62\1\65\1"+
        "\66\3\uffff\1\12\1\14\1\33\1\42\1\46\1\54\1\61\2\uffff\1\60\1\3"+
        "\2\uffff\1\5\6\uffff\1\25\1\64\5\uffff\1\53\1\63\2\uffff\1\62\1"+
        "\65\1\1\1\26\1\43\2\uffff\1\13\1\17\1\47\1\55\1\uffff\1\50\1\uffff"+
        "\1\35\3\uffff\1\10\12\uffff\1\56\4\uffff\1\56\1\6\1\45\1\11\1\52"+
        "\1\7\1\20\3\uffff\1\37\12\uffff\1\56\14\uffff\1\34\1\41\1\uffff"+
        "\1\57\1\uffff\1\57\1\uffff\1\2\7\uffff\1\23\1\40\1\uffff\1\27\1"+
        "\uffff\1\30\1\44\1\57\4\uffff\1\22\20\uffff\1\16\3\uffff\1\51\3"+
        "\uffff\1\15\2\uffff\1\24\3\uffff\1\21\1\36\1\31\1\32\1\4";
    static final String DFA15_specialS =
        "\1\14\20\uffff\1\2\1\13\44\uffff\1\1\1\4\36\uffff\1\10\1\7\1\5\1"+
        "\0\26\uffff\1\11\1\6\16\uffff\1\3\1\uffff\1\12\71\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\21\4\26\1\22\5\26\1"+
            "\20\1\26\1\12\12\24\2\26\1\1\1\3\1\5\2\26\32\23\4\26\1\23\1"+
            "\26\3\23\1\4\1\23\1\15\2\23\1\6\2\23\1\13\1\11\1\23\1\17\2\23"+
            "\1\7\1\10\1\2\1\14\3\23\1\16\1\23\uff85\26",
            "\1\40\15\uffff\1\30\61\uffff\1\32\2\uffff\1\34\2\uffff\1\33"+
            "\5\uffff\1\36\1\35\2\uffff\1\37\1\uffff\1\27\1\31",
            "\1\41\5\uffff\1\42",
            "",
            "\1\46\3\uffff\1\45",
            "",
            "\1\50",
            "\1\51",
            "\1\53\1\52",
            "\1\55\5\uffff\1\54",
            "\1\57\16\uffff\1\56",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "\101\66\32\67\4\66\1\67\1\66\32\67\uff85\66",
            "\101\66\32\70\4\66\1\70\1\66\32\70\uff85\66",
            "",
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
            "\1\106",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\111\2\uffff\1\110",
            "\1\112",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\42\66\1\126\13\66\1\130\1\66\12\127\7\66\32\127\4\66\1\127"+
            "\1\66\32\127\uff85\66",
            "\47\66\1\133\6\66\1\132\1\66\12\131\7\66\32\131\4\66\1\131"+
            "\1\66\32\131\uff85\66",
            "",
            "",
            "",
            "",
            "",
            "\1\135\13\uffff\1\134",
            "\1\137\3\uffff\1\136",
            "",
            "",
            "",
            "",
            "\1\140\12\uffff\1\141",
            "",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\42\66\1\126\13\66\1\130\1\66\12\127\7\66\32\127\4\66\1\127"+
            "\1\66\32\127\uff85\66",
            "\101\66\32\161\4\66\1\161\1\66\32\161\uff85\66",
            "\47\66\1\133\6\66\1\132\1\66\12\131\7\66\32\131\4\66\1\131"+
            "\1\66\32\131\uff85\66",
            "\101\66\32\162\4\66\1\162\1\66\32\162\uff85\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\177",
            "",
            "\42\66\1\u0080\13\66\1\130\1\66\12\u0081\7\66\32\u0081\4\66"+
            "\1\u0081\1\66\32\u0081\uff85\66",
            "\47\66\1\u0082\6\66\1\132\1\66\12\u0083\7\66\32\u0083\4\66"+
            "\1\u0083\1\66\32\u0083\uff85\66",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\u008a\3\43"+
            "\1\u008b\12\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\13\43\1\u008e\16\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\12\43\7\uffff\13\43\1\u0090\16\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\42\66\1\u0080\13\66\1\130\1\66\12\u0081\7\66\32\u0081\4\66"+
            "\1\u0081\1\66\32\u0081\uff85\66",
            "",
            "\47\66\1\u0082\6\66\1\132\1\66\12\u0083\7\66\32\u0083\4\66"+
            "\1\u0083\1\66\32\u0083\uff85\66",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\u0097\16"+
            "\43",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "\1\u009c",
            "",
            "\1\u009d",
            "",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    static class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_QUOTED_ID | RULE_FQN | RULE_ID | RULE_ML_COMMENT | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_90 = input.LA(1);

                        s = -1;
                        if ( ((LA15_90>='\u0000' && LA15_90<='@')||(LA15_90>='[' && LA15_90<='^')||LA15_90=='`'||(LA15_90>='{' && LA15_90<='\uFFFF')) ) {s = 54;}

                        else if ( ((LA15_90>='A' && LA15_90<='Z')||LA15_90=='_'||(LA15_90>='a' && LA15_90<='z')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_55 = input.LA(1);

                        s = -1;
                        if ( (LA15_55=='\"') ) {s = 86;}

                        else if ( ((LA15_55>='\u0000' && LA15_55<='!')||(LA15_55>='#' && LA15_55<='-')||LA15_55=='/'||(LA15_55>=':' && LA15_55<='@')||(LA15_55>='[' && LA15_55<='^')||LA15_55=='`'||(LA15_55>='{' && LA15_55<='\uFFFF')) ) {s = 54;}

                        else if ( ((LA15_55>='0' && LA15_55<='9')||(LA15_55>='A' && LA15_55<='Z')||LA15_55=='_'||(LA15_55>='a' && LA15_55<='z')) ) {s = 87;}

                        else if ( (LA15_55=='.') ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_17 = input.LA(1);

                        s = -1;
                        if ( ((LA15_17>='\u0000' && LA15_17<='@')||(LA15_17>='[' && LA15_17<='^')||LA15_17=='`'||(LA15_17>='{' && LA15_17<='\uFFFF')) ) {s = 54;}

                        else if ( ((LA15_17>='A' && LA15_17<='Z')||LA15_17=='_'||(LA15_17>='a' && LA15_17<='z')) ) {s = 55;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_129 = input.LA(1);

                        s = -1;
                        if ( (LA15_129=='\"') ) {s = 128;}

                        else if ( (LA15_129=='.') ) {s = 88;}

                        else if ( ((LA15_129>='0' && LA15_129<='9')||(LA15_129>='A' && LA15_129<='Z')||LA15_129=='_'||(LA15_129>='a' && LA15_129<='z')) ) {s = 129;}

                        else if ( ((LA15_129>='\u0000' && LA15_129<='!')||(LA15_129>='#' && LA15_129<='-')||LA15_129=='/'||(LA15_129>=':' && LA15_129<='@')||(LA15_129>='[' && LA15_129<='^')||LA15_129=='`'||(LA15_129>='{' && LA15_129<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_56 = input.LA(1);

                        s = -1;
                        if ( ((LA15_56>='0' && LA15_56<='9')||(LA15_56>='A' && LA15_56<='Z')||LA15_56=='_'||(LA15_56>='a' && LA15_56<='z')) ) {s = 89;}

                        else if ( (LA15_56=='.') ) {s = 90;}

                        else if ( (LA15_56=='\'') ) {s = 91;}

                        else if ( ((LA15_56>='\u0000' && LA15_56<='&')||(LA15_56>='(' && LA15_56<='-')||LA15_56=='/'||(LA15_56>=':' && LA15_56<='@')||(LA15_56>='[' && LA15_56<='^')||LA15_56=='`'||(LA15_56>='{' && LA15_56<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_89 = input.LA(1);

                        s = -1;
                        if ( (LA15_89=='\'') ) {s = 91;}

                        else if ( ((LA15_89>='\u0000' && LA15_89<='&')||(LA15_89>='(' && LA15_89<='-')||LA15_89=='/'||(LA15_89>=':' && LA15_89<='@')||(LA15_89>='[' && LA15_89<='^')||LA15_89=='`'||(LA15_89>='{' && LA15_89<='\uFFFF')) ) {s = 54;}

                        else if ( ((LA15_89>='0' && LA15_89<='9')||(LA15_89>='A' && LA15_89<='Z')||LA15_89=='_'||(LA15_89>='a' && LA15_89<='z')) ) {s = 89;}

                        else if ( (LA15_89=='.') ) {s = 90;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_114 = input.LA(1);

                        s = -1;
                        if ( (LA15_114=='\'') ) {s = 130;}

                        else if ( ((LA15_114>='\u0000' && LA15_114<='&')||(LA15_114>='(' && LA15_114<='-')||LA15_114=='/'||(LA15_114>=':' && LA15_114<='@')||(LA15_114>='[' && LA15_114<='^')||LA15_114=='`'||(LA15_114>='{' && LA15_114<='\uFFFF')) ) {s = 54;}

                        else if ( ((LA15_114>='0' && LA15_114<='9')||(LA15_114>='A' && LA15_114<='Z')||LA15_114=='_'||(LA15_114>='a' && LA15_114<='z')) ) {s = 131;}

                        else if ( (LA15_114=='.') ) {s = 90;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_88 = input.LA(1);

                        s = -1;
                        if ( ((LA15_88>='A' && LA15_88<='Z')||LA15_88=='_'||(LA15_88>='a' && LA15_88<='z')) ) {s = 113;}

                        else if ( ((LA15_88>='\u0000' && LA15_88<='@')||(LA15_88>='[' && LA15_88<='^')||LA15_88=='`'||(LA15_88>='{' && LA15_88<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_87 = input.LA(1);

                        s = -1;
                        if ( (LA15_87=='\"') ) {s = 86;}

                        else if ( ((LA15_87>='\u0000' && LA15_87<='!')||(LA15_87>='#' && LA15_87<='-')||LA15_87=='/'||(LA15_87>=':' && LA15_87<='@')||(LA15_87>='[' && LA15_87<='^')||LA15_87=='`'||(LA15_87>='{' && LA15_87<='\uFFFF')) ) {s = 54;}

                        else if ( (LA15_87=='.') ) {s = 88;}

                        else if ( ((LA15_87>='0' && LA15_87<='9')||(LA15_87>='A' && LA15_87<='Z')||LA15_87=='_'||(LA15_87>='a' && LA15_87<='z')) ) {s = 87;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_113 = input.LA(1);

                        s = -1;
                        if ( (LA15_113=='\"') ) {s = 128;}

                        else if ( ((LA15_113>='\u0000' && LA15_113<='!')||(LA15_113>='#' && LA15_113<='-')||LA15_113=='/'||(LA15_113>=':' && LA15_113<='@')||(LA15_113>='[' && LA15_113<='^')||LA15_113=='`'||(LA15_113>='{' && LA15_113<='\uFFFF')) ) {s = 54;}

                        else if ( ((LA15_113>='0' && LA15_113<='9')||(LA15_113>='A' && LA15_113<='Z')||LA15_113=='_'||(LA15_113>='a' && LA15_113<='z')) ) {s = 129;}

                        else if ( (LA15_113=='.') ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_131 = input.LA(1);

                        s = -1;
                        if ( (LA15_131=='\'') ) {s = 130;}

                        else if ( ((LA15_131>='\u0000' && LA15_131<='&')||(LA15_131>='(' && LA15_131<='-')||LA15_131=='/'||(LA15_131>=':' && LA15_131<='@')||(LA15_131>='[' && LA15_131<='^')||LA15_131=='`'||(LA15_131>='{' && LA15_131<='\uFFFF')) ) {s = 54;}

                        else if ( (LA15_131=='.') ) {s = 90;}

                        else if ( ((LA15_131>='0' && LA15_131<='9')||(LA15_131>='A' && LA15_131<='Z')||LA15_131=='_'||(LA15_131>='a' && LA15_131<='z')) ) {s = 131;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA15_18 = input.LA(1);

                        s = -1;
                        if ( ((LA15_18>='A' && LA15_18<='Z')||LA15_18=='_'||(LA15_18>='a' && LA15_18<='z')) ) {s = 56;}

                        else if ( ((LA15_18>='\u0000' && LA15_18<='@')||(LA15_18>='[' && LA15_18<='^')||LA15_18=='`'||(LA15_18>='{' && LA15_18<='\uFFFF')) ) {s = 54;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='<') ) {s = 1;}

                        else if ( (LA15_0=='t') ) {s = 2;}

                        else if ( (LA15_0=='=') ) {s = 3;}

                        else if ( (LA15_0=='d') ) {s = 4;}

                        else if ( (LA15_0=='>') ) {s = 5;}

                        else if ( (LA15_0=='i') ) {s = 6;}

                        else if ( (LA15_0=='r') ) {s = 7;}

                        else if ( (LA15_0=='s') ) {s = 8;}

                        else if ( (LA15_0=='m') ) {s = 9;}

                        else if ( (LA15_0=='/') ) {s = 10;}

                        else if ( (LA15_0=='l') ) {s = 11;}

                        else if ( (LA15_0=='u') ) {s = 12;}

                        else if ( (LA15_0=='f') ) {s = 13;}

                        else if ( (LA15_0=='y') ) {s = 14;}

                        else if ( (LA15_0=='o') ) {s = 15;}

                        else if ( (LA15_0=='-') ) {s = 16;}

                        else if ( (LA15_0=='\"') ) {s = 17;}

                        else if ( (LA15_0=='\'') ) {s = 18;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='c')||LA15_0=='e'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||LA15_0=='n'||(LA15_0>='p' && LA15_0<='q')||(LA15_0>='v' && LA15_0<='x')||LA15_0=='z') ) {s = 19;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 20;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 21;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<=',')||LA15_0=='.'||(LA15_0>=':' && LA15_0<=';')||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='[' && LA15_0<='^')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}