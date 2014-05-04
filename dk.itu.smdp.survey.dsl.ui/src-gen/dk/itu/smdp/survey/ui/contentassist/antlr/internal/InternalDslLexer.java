package dk.itu.smdp.survey.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


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
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
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
    public static final int T__59=59;
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
    public String getGrammarFileName() { return "../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11:7: ( 'singleline' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11:9: 'singleline'
            {
            match("singleline"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:12:7: ( 'single' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:12:9: 'single'
            {
            match("single"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:13:7: ( 'multi' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:13:9: 'multi'
            {
            match("multi"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14:7: ( 'multiline' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14:9: 'multiline'
            {
            match("multiline"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:15:7: ( 'show-limits' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:15:9: 'show-limits'
            {
            match("show-limits"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:16:7: ( 'show' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:16:9: 'show'
            {
            match("show"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:17:7: ( 'limits' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:17:9: 'limits'
            {
            match("limits"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:18:7: ( 'other' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:18:9: 'other'
            {
            match("other"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:19:7: ( 'other=\"\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:19:9: 'other=\"\"'
            {
            match("other=\"\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:20:7: ( '<survey' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:20:9: '<survey'
            {
            match("<survey"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:21:7: ( '>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:21:9: '>'
            {
            match('>'); 

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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:22:7: ( '</survey>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:22:9: '</survey>'
            {
            match("</survey>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:23:7: ( 'title=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:23:9: 'title=\"'
            {
            match("title=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:24:7: ( '\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:24:9: '\"'
            {
            match('\"'); 

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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:25:7: ( 'description=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:25:9: 'description=\"'
            {
            match("description=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:26:7: ( 'filename=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:26:9: 'filename=\"'
            {
            match("filename=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:27:7: ( '<template' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:27:9: '<template'
            {
            match("<template"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:28:7: ( 'id=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:28:9: 'id=\"'
            {
            match("id=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:29:7: ( '</template>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:29:9: '</template>'
            {
            match("</template>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:30:7: ( '<a' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:30:9: '<a'
            {
            match("<a"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:31:7: ( '</a>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:31:9: '</a>'
            {
            match("</a>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:32:7: ( '<group' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:32:9: '<group'
            {
            match("<group"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:33:7: ( '</group>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:33:9: '</group>'
            {
            match("</group>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:34:7: ( 'depends-on=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:34:9: 'depends-on=\"'
            {
            match("depends-on=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:35:7: ( '<text' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:35:9: '<text'
            {
            match("<text"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:36:7: ( '/>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:36:9: '/>'
            {
            match("/>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:37:7: ( '<scale' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:37:9: '<scale'
            {
            match("<scale"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:38:7: ( 'min=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:38:9: 'min=\"'
            {
            match("min=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:39:7: ( 'max=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:39:9: 'max=\"'
            {
            match("max=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:40:7: ( 'min-label=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:40:9: 'min-label=\"'
            {
            match("min-label=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:41:7: ( 'max-label=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:41:9: 'max-label=\"'
            {
            match("max-label=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:42:7: ( '<date' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:42:9: '<date'
            {
            match("<date"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:43:7: ( 'start=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:43:9: 'start=\"'
            {
            match("start=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:44:7: ( 'end=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:44:9: 'end=\"'
            {
            match("end=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:45:7: ( '<number' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:45:9: '<number'
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:46:7: ( '<single' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:46:9: '<single'
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:47:7: ( '</single>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:47:9: '</single>'
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:48:7: ( 'other=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:48:9: 'other=\"'
            {
            match("other=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:49:7: ( '<multiple' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:49:9: '<multiple'
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:50:7: ( '</multiple>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:50:9: '</multiple>'
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:51:7: ( '<table' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:51:9: '<table'
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:52:7: ( '</table>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:52:9: '</table>'
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:53:7: ( '-' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:53:9: '-'
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:54:7: ( 'ref=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:54:9: 'ref=\"'
            {
            match("ref=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:55:7: ( '<q>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:55:9: '<q>'
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:56:7: ( '</q>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:56:9: '</q>'
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

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:57:7: ( 'required' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:57:9: 'required'
            {
            match("required"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:58:7: ( 'day' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:58:9: 'day'
            {
            match("day"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:59:7: ( 'month' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:59:9: 'month'
            {
            match("month"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:60:7: ( 'year' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:60:9: 'year'
            {
            match("year"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:61:7: ( 'multiple' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:61:9: 'multiple'
            {
            match("multiple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11406:13: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11406:15: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11406:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11406:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11406:66: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop1;
                }
            } while (true);

            match('\''); 

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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11408:10: ( ( RULE_ID '.' )+ RULE_ID )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11408:12: ( RULE_ID '.' )+ RULE_ID
            {
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11408:12: ( RULE_ID '.' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11408:13: RULE_ID '.'
            	    {
            	    mRULE_ID(); 
            	    match('.'); 

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

            mRULE_ID(); 

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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11410:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11410:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11410:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11412:17: ( '<!--' ( options {greedy=false; } : . )* '-->' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11412:19: '<!--' ( options {greedy=false; } : . )* '-->'
            {
            match("<!--"); 

            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11412:26: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='-') ) {
                        int LA4_3 = input.LA(3);

                        if ( (LA4_3=='>') ) {
                            alt4=2;
                        }
                        else if ( ((LA4_3>='\u0000' && LA4_3<='=')||(LA4_3>='?' && LA4_3<='\uFFFF')) ) {
                            alt4=1;
                        }


                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<=',')||(LA4_1>='.' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=',')||(LA4_0>='.' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11412:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11414:10: ( ( '0' .. '9' )+ )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11414:12: ( '0' .. '9' )+
            {
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11414:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11414:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11416:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11416:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11416:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11416:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop6;
                }
            } while (true);

            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11416:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11416:41: ( '\\r' )? '\\n'
                    {
                    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11416:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11416:41: '\\r'
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11418:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11418:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11418:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11420:16: ( . )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:11420:18: .
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
        // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | RULE_STRING | RULE_FQN | RULE_ID | RULE_ML_COMMENT | RULE_INT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=59;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:316: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:328: RULE_FQN
                {
                mRULE_FQN(); 

                }
                break;
            case 54 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:337: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 55 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:345: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 56 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:361: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 57 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:370: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:386: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 59 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:394: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA2_eotS =
        "\1\uffff\2\3\2\uffff";
    static final String DFA2_eofS =
        "\5\uffff";
    static final String DFA2_minS =
        "\1\101\2\56\2\uffff";
    static final String DFA2_maxS =
        "\3\172\2\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\5\uffff}>";
    static final String[] DFA2_transitionS = {
            "\32\1\4\uffff\1\1\1\uffff\32\1",
            "\1\4\1\uffff\12\2\7\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
            "\1\4\1\uffff\12\2\7\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    static class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()+ loopback of 11408:12: ( RULE_ID '.' )+";
        }
    }
    static final String DFA10_eotS =
        "\1\uffff\4\31\1\25\1\uffff\1\31\1\uffff\3\31\1\25\1\31\1\uffff\2"+
        "\31\1\25\1\31\3\uffff\3\31\1\uffff\1\31\1\uffff\6\31\13\uffff\1"+
        "\31\1\uffff\4\31\2\uffff\1\31\1\uffff\2\31\3\uffff\11\31\13\uffff"+
        "\3\31\1\156\1\31\1\uffff\5\31\1\166\2\31\4\uffff\3\31\6\uffff\3"+
        "\31\1\uffff\1\31\2\uffff\1\31\1\u0081\1\31\2\uffff\1\31\1\u0086"+
        "\1\u0087\1\31\1\u008a\5\31\1\uffff\1\u0091\1\uffff\2\31\2\uffff"+
        "\1\u0094\3\uffff\5\31\1\uffff\2\31\1\uffff\1\u009e\6\31\1\u00a5"+
        "\2\uffff\1\31\1\uffff\1\31\1\u00a8\1\31\1\u00aa\1\uffff\1\31\2\uffff"+
        "\1\u00ac\1\uffff\1\31\1\uffff\1\31\1\uffff";
    static final String DFA10_eofS =
        "\u00af\uffff";
    static final String DFA10_minS =
        "\1\0\4\56\1\41\1\uffff\1\56\1\uffff\3\56\1\57\1\56\1\uffff\2\56"+
        "\1\0\1\56\3\uffff\3\56\1\uffff\1\56\1\uffff\6\56\1\143\2\141\10"+
        "\uffff\1\56\1\uffff\4\56\2\uffff\1\56\1\uffff\2\56\3\uffff\4\56"+
        "\2\55\3\56\3\uffff\1\151\1\141\4\uffff\1\155\1\uffff\5\56\1\uffff"+
        "\5\56\1\55\2\56\4\uffff\3\56\6\uffff\3\56\1\uffff\1\56\2\uffff\3"+
        "\56\2\uffff\12\56\1\uffff\1\56\1\uffff\2\56\2\uffff\1\56\1\42\2"+
        "\uffff\5\56\1\uffff\2\56\1\uffff\1\42\1\56\1\55\5\56\2\uffff\1\56"+
        "\1\uffff\4\56\1\uffff\1\56\2\uffff\1\56\1\uffff\1\56\1\uffff\1\56"+
        "\1\uffff";
    static final String DFA10_maxS =
        "\1\uffff\4\172\1\164\1\uffff\1\172\1\uffff\3\172\1\76\1\172\1\uffff"+
        "\2\172\1\uffff\1\172\3\uffff\3\172\1\uffff\1\172\1\uffff\6\172\1"+
        "\165\1\164\1\145\10\uffff\1\172\1\uffff\4\172\2\uffff\1\172\1\uffff"+
        "\2\172\3\uffff\11\172\3\uffff\1\165\1\145\4\uffff\1\170\1\uffff"+
        "\5\172\1\uffff\10\172\4\uffff\3\172\6\uffff\3\172\1\uffff\1\172"+
        "\2\uffff\3\172\2\uffff\12\172\1\uffff\1\172\1\uffff\2\172\2\uffff"+
        "\1\172\1\42\2\uffff\5\172\1\uffff\2\172\1\uffff\1\42\7\172\2\uffff"+
        "\1\172\1\uffff\4\172\1\uffff\1\172\2\uffff\1\172\1\uffff\1\172\1"+
        "\uffff\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\6\uffff\1\13\1\uffff\1\16\5\uffff\1\53\4\uffff\1\70\1\72\1\73\3"+
        "\uffff\1\66\1\uffff\1\65\11\uffff\1\24\1\26\1\40\1\43\1\47\1\55"+
        "\1\67\1\13\1\uffff\1\16\4\uffff\1\32\1\71\1\uffff\1\53\2\uffff\1"+
        "\64\1\70\1\72\11\uffff\1\12\1\33\1\44\2\uffff\1\25\1\27\1\50\1\56"+
        "\1\uffff\1\51\5\uffff\1\22\10\uffff\1\34\1\36\1\35\1\37\3\uffff"+
        "\1\14\1\45\1\23\1\52\1\21\1\31\3\uffff\1\60\1\uffff\1\42\1\54\3"+
        "\uffff\1\5\1\6\12\uffff\1\62\1\uffff\1\41\2\uffff\1\3\1\61\2\uffff"+
        "\1\10\1\15\5\uffff\1\2\2\uffff\1\7\10\uffff\1\11\1\46\1\uffff\1"+
        "\30\4\uffff\1\63\1\uffff\1\20\1\57\1\uffff\1\4\1\uffff\1\1\1\uffff"+
        "\1\17";
    static final String DFA10_specialS =
        "\1\0\20\uffff\1\1\u009d\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\10\4\25\1\21\5\25\1"+
            "\16\1\25\1\14\12\23\2\25\1\5\1\25\1\6\2\25\32\22\4\25\1\22\1"+
            "\25\3\22\1\11\1\15\1\12\2\22\1\13\2\22\1\3\1\2\1\22\1\4\2\22"+
            "\1\17\1\1\1\7\4\22\1\20\1\22\uff85\25",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\7\32"+
            "\1\27\1\26\12\32\1\30\6\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\36"+
            "\7\32\1\35\5\32\1\37\5\32\1\34\5\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\40\21\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\41\6\32",
            "\1\53\15\uffff\1\43\61\uffff\1\45\2\uffff\1\47\2\uffff\1\46"+
            "\5\uffff\1\51\1\50\2\uffff\1\52\1\uffff\1\42\1\44",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\55\21\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\60"+
            "\3\32\1\57\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\61\21\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\62\26\32",
            "\1\64\16\uffff\1\63",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\65\14\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\67\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\70\25\32",
            "\0\71",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\74\14\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32"+
            "\1\75\13\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\76"+
            "\31\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32"+
            "\1\77\16\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\100\14\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\27\32"+
            "\1\101\2\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\102\14\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\14\32"+
            "\1\103\15\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\7\32"+
            "\1\104\22\32",
            "\1\106\5\uffff\1\107\13\uffff\1\105",
            "\1\112\5\uffff\1\113\5\uffff\1\114\3\uffff\1\115\1\uffff\1"+
            "\110\1\111",
            "\1\117\3\uffff\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\120\6\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\17\32"+
            "\1\122\2\32\1\121\7\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\30\32"+
            "\1\123\1\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32"+
            "\1\124\16\32",
            "\1\33\1\uffff\12\32\3\uffff\1\125\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\126\26\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\5\32"+
            "\1\127\12\32\1\130\11\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\131"+
            "\31\32",
            "",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\6\32"+
            "\1\132\23\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\26\32"+
            "\1\133\3\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\134\10\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\135\6\32",
            "\1\137\1\33\1\uffff\12\32\3\uffff\1\136\3\uffff\32\32\4\uffff"+
            "\1\32\1\uffff\32\32",
            "\1\141\1\33\1\uffff\12\32\3\uffff\1\140\3\uffff\32\32\4\uffff"+
            "\1\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\142\6\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\143\21\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\144\25\32",
            "",
            "",
            "",
            "\1\146\13\uffff\1\145",
            "\1\150\3\uffff\1\147",
            "",
            "",
            "",
            "",
            "\1\151\12\uffff\1\152",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32"+
            "\1\153\16\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\2\32"+
            "\1\154\27\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\155\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\157\25\32",
            "",
            "\1\33\1\uffff\12\32\3\uffff\1\160\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\1\uffff\12\32\3\uffff\1\161\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32"+
            "\1\162\5\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\163\10\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32"+
            "\1\164\16\32",
            "\1\165\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff"+
            "\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\167\6\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\170\21\32",
            "",
            "",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\7\32"+
            "\1\171\22\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\172\6\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\173\10\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\174\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\175\10\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\176\14\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\177\14\32",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\u0080\21\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\u0082\25\32",
            "",
            "",
            "\1\33\1\uffff\12\32\3\uffff\1\u0083\3\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32"+
            "\1\u0084\3\32\1\u0085\12\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32"+
            "\1\u0088\7\32",
            "\1\33\1\uffff\12\32\3\uffff\1\u0089\3\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\3\uffff\1\u008b\3\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\u008c\21\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\u008d\26\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\u008e"+
            "\31\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\u008f\10\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32"+
            "\1\u0090\16\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\u0092\21\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32"+
            "\1\u0093\16\32",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0095",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\17\32"+
            "\1\u0096\12\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32"+
            "\1\u0097\7\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\14\32"+
            "\1\u0098\15\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\u0099\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\u009a\21\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\u009b\14\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\u009c\25\32",
            "",
            "\1\u009d",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\u009f\6\32",
            "\1\u00a0\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff"+
            "\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\u00a1\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\u00a2\26\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\u00a3\14\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\u00a4\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\u00a6\21\32",
            "",
            "\1\33\1\uffff\12\32\3\uffff\1\u00a7\3\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\u00a9\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32"+
            "\1\u00ab\13\32",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\u00ad\14\32",
            "",
            "\1\33\1\uffff\12\32\3\uffff\1\u00ae\3\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | RULE_STRING | RULE_FQN | RULE_ID | RULE_ML_COMMENT | RULE_INT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='s') ) {s = 1;}

                        else if ( (LA10_0=='m') ) {s = 2;}

                        else if ( (LA10_0=='l') ) {s = 3;}

                        else if ( (LA10_0=='o') ) {s = 4;}

                        else if ( (LA10_0=='<') ) {s = 5;}

                        else if ( (LA10_0=='>') ) {s = 6;}

                        else if ( (LA10_0=='t') ) {s = 7;}

                        else if ( (LA10_0=='\"') ) {s = 8;}

                        else if ( (LA10_0=='d') ) {s = 9;}

                        else if ( (LA10_0=='f') ) {s = 10;}

                        else if ( (LA10_0=='i') ) {s = 11;}

                        else if ( (LA10_0=='/') ) {s = 12;}

                        else if ( (LA10_0=='e') ) {s = 13;}

                        else if ( (LA10_0=='-') ) {s = 14;}

                        else if ( (LA10_0=='r') ) {s = 15;}

                        else if ( (LA10_0=='y') ) {s = 16;}

                        else if ( (LA10_0=='\'') ) {s = 17;}

                        else if ( ((LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='c')||(LA10_0>='g' && LA10_0<='h')||(LA10_0>='j' && LA10_0<='k')||LA10_0=='n'||(LA10_0>='p' && LA10_0<='q')||(LA10_0>='u' && LA10_0<='x')||LA10_0=='z') ) {s = 18;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 19;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 20;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||LA10_0=='!'||(LA10_0>='#' && LA10_0<='&')||(LA10_0>='(' && LA10_0<=',')||LA10_0=='.'||(LA10_0>=':' && LA10_0<=';')||LA10_0=='='||(LA10_0>='?' && LA10_0<='@')||(LA10_0>='[' && LA10_0<='^')||LA10_0=='`'||(LA10_0>='{' && LA10_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_17 = input.LA(1);

                        s = -1;
                        if ( ((LA10_17>='\u0000' && LA10_17<='\uFFFF')) ) {s = 57;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}