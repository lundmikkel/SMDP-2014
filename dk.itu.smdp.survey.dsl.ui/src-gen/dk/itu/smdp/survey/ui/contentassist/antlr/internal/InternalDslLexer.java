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
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:20:7: ( 'day' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:20:9: 'day'
            {
            match("day"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:21:7: ( 'month' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:21:9: 'month'
            {
            match("month"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:22:7: ( 'year' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:22:9: 'year'
            {
            match("year"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:23:7: ( '<survey' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:23:9: '<survey'
            {
            match("<survey"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:24:7: ( '>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:24:9: '>'
            {
            match('>'); 

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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:25:7: ( '</survey>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:25:9: '</survey>'
            {
            match("</survey>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:26:7: ( 'title=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:26:9: 'title=\"'
            {
            match("title=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:27:7: ( '\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:27:9: '\"'
            {
            match('\"'); 

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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:28:7: ( 'description=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:28:9: 'description=\"'
            {
            match("description=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:29:7: ( 'filename=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:29:9: 'filename=\"'
            {
            match("filename=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:30:7: ( 'email=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:30:9: 'email=\"'
            {
            match("email=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:31:7: ( '<template' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:31:9: '<template'
            {
            match("<template"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:32:7: ( 'id=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:32:9: 'id=\"'
            {
            match("id=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:33:7: ( '</template>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:33:9: '</template>'
            {
            match("</template>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:34:7: ( '<a' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:34:9: '<a'
            {
            match("<a"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:35:7: ( '</a>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:35:9: '</a>'
            {
            match("</a>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:36:7: ( '<group' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:36:9: '<group'
            {
            match("<group"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:37:7: ( '</group>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:37:9: '</group>'
            {
            match("</group>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:38:7: ( 'depends-on=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:38:9: 'depends-on=\"'
            {
            match("depends-on=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:39:7: ( '<text' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:39:9: '<text'
            {
            match("<text"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:40:7: ( '/>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:40:9: '/>'
            {
            match("/>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:41:7: ( '<scale' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:41:9: '<scale'
            {
            match("<scale"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:42:7: ( 'min=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:42:9: 'min=\"'
            {
            match("min=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:43:7: ( 'max=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:43:9: 'max=\"'
            {
            match("max=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:44:7: ( 'min-label=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:44:9: 'min-label=\"'
            {
            match("min-label=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:45:7: ( 'max-label=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:45:9: 'max-label=\"'
            {
            match("max-label=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:46:7: ( '<date' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:46:9: '<date'
            {
            match("<date"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:47:7: ( 'start=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:47:9: 'start=\"'
            {
            match("start=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:48:7: ( 'end=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:48:9: 'end=\"'
            {
            match("end=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:49:7: ( '<number' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:49:9: '<number'
            {
            match("<number"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:50:7: ( '<single' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:50:9: '<single'
            {
            match("<single"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:51:7: ( '</single>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:51:9: '</single>'
            {
            match("</single>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:52:7: ( 'other=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:52:9: 'other=\"'
            {
            match("other=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:53:7: ( '<multiple' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:53:9: '<multiple'
            {
            match("<multiple"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:54:7: ( '</multiple>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:54:9: '</multiple>'
            {
            match("</multiple>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:55:7: ( '<table' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:55:9: '<table'
            {
            match("<table"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:56:7: ( '</table>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:56:9: '</table>'
            {
            match("</table>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:57:7: ( '-' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:57:9: '-'
            {
            match('-'); 

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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:58:7: ( 'ref=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:58:9: 'ref=\"'
            {
            match("ref=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:59:7: ( 'template=\"' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:59:9: 'template=\"'
            {
            match("template=\""); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:60:7: ( '<q' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:60:9: '<q'
            {
            match("<q"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:61:7: ( '</q>' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:61:9: '</q>'
            {
            match("</q>"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:62:7: ( 'required' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:62:9: 'required'
            {
            match("required"); 


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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:63:7: ( 'multiple' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:63:9: 'multiple'
            {
            match("multiple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14417:13: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14417:15: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14417:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14417:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14417:66: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14419:10: ( ( RULE_ID '-' )+ ( RULE_ID | RULE_INT ) )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14419:12: ( RULE_ID '-' )+ ( RULE_ID | RULE_INT )
            {
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14419:12: ( RULE_ID '-' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14419:13: RULE_ID '-'
            	    {
            	    mRULE_ID(); 
            	    match('-'); 

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

            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14419:27: ( RULE_ID | RULE_INT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                alt3=1;
            }
            else if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14419:28: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14419:36: RULE_INT
                    {
                    mRULE_INT(); 

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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14421:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14421:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14421:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14423:17: ( '<!--' ( options {greedy=false; } : . )* '-->' )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14423:19: '<!--' ( options {greedy=false; } : . )* '-->'
            {
            match("<!--"); 

            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14423:26: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='-') ) {
                        int LA5_3 = input.LA(3);

                        if ( (LA5_3=='>') ) {
                            alt5=2;
                        }
                        else if ( ((LA5_3>='\u0000' && LA5_3<='=')||(LA5_3>='?' && LA5_3<='\uFFFF')) ) {
                            alt5=1;
                        }


                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<=',')||(LA5_1>='.' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=',')||(LA5_0>='.' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14423:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14425:10: ( ( '0' .. '9' )+ )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14425:12: ( '0' .. '9' )+
            {
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14425:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14425:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14427:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14427:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14427:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14427:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14427:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14427:41: ( '\\r' )? '\\n'
                    {
                    // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14427:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14427:41: '\\r'
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14429:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14429:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14429:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14431:16: ( . )
            // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:14431:18: .
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
        // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | RULE_STRING | RULE_FQN | RULE_ID | RULE_ML_COMMENT | RULE_INT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=61;
        alt11 = dfa11.predict(input);
        switch (alt11) {
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
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:328: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 55 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:340: RULE_FQN
                {
                mRULE_FQN(); 

                }
                break;
            case 56 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:349: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 57 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:357: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 58 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:373: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 59 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:382: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 60 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:398: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 61 :
                // ../dk.itu.smdp.survey.dsl.ui/src-gen/dk/itu/smdp/survey/ui/contentassist/antlr/internal/InternalDsl.g:1:406: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA2_eotS =
        "\1\uffff\1\2\1\uffff\1\2\1\uffff";
    static final String DFA2_eofS =
        "\5\uffff";
    static final String DFA2_minS =
        "\1\60\1\55\1\uffff\1\55\1\uffff";
    static final String DFA2_maxS =
        "\2\172\1\uffff\1\172\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA2_specialS =
        "\5\uffff}>";
    static final String[] DFA2_transitionS = {
            "\12\2\7\uffff\32\1\4\uffff\1\1\1\uffff\32\1",
            "\1\4\2\uffff\12\3\7\uffff\32\3\4\uffff\1\3\1\uffff\32\3",
            "",
            "\1\4\2\uffff\12\3\7\uffff\32\3\4\uffff\1\3\1\uffff\32\3",
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
            return "()+ loopback of 14419:12: ( RULE_ID '-' )+";
        }
    }
    static final String DFA11_eotS =
        "\1\uffff\6\32\1\25\1\uffff\1\32\1\uffff\3\32\1\25\1\uffff\1\32\1"+
        "\25\1\32\3\uffff\4\32\2\uffff\11\32\13\uffff\2\32\1\uffff\4\32\3"+
        "\uffff\1\32\3\uffff\11\32\1\151\3\32\13\uffff\5\32\1\uffff\3\32"+
        "\1\174\3\32\4\uffff\2\32\1\uffff\2\32\1\u0086\6\uffff\4\32\2\uffff"+
        "\2\32\2\uffff\1\32\1\u0091\1\u0092\2\33\1\32\1\u0097\2\32\1\uffff"+
        "\5\32\1\u00a0\1\33\1\uffff\2\32\2\uffff\2\33\1\u00a6\2\uffff\2\32"+
        "\1\uffff\2\32\1\uffff\2\32\1\uffff\1\33\2\32\2\33\1\uffff\1\u00b4"+
        "\6\32\1\33\1\32\1\u00bd\2\33\2\uffff\1\32\1\uffff\2\32\1\u00c4\1"+
        "\32\1\33\1\u00c7\1\uffff\2\33\1\32\1\33\3\uffff\1\u00cc\1\33\3\uffff"+
        "\1\32\1\33\1\uffff\1\u00d0\1\32\3\uffff";
    static final String DFA11_eofS =
        "\u00d2\uffff";
    static final String DFA11_minS =
        "\1\0\6\55\1\41\1\uffff\1\55\1\uffff\3\55\1\57\1\uffff\1\55\1\0\1"+
        "\55\3\uffff\4\55\2\uffff\11\55\1\143\2\141\10\uffff\2\55\1\uffff"+
        "\4\55\3\uffff\1\55\3\uffff\15\55\3\uffff\1\151\1\141\4\uffff\1\155"+
        "\1\uffff\5\55\1\uffff\7\55\1\uffff\1\60\1\uffff\1\60\2\55\1\uffff"+
        "\3\55\6\uffff\4\55\2\uffff\2\55\1\60\1\uffff\3\55\2\141\4\55\1\uffff"+
        "\6\55\1\151\1\uffff\2\55\2\uffff\2\142\1\55\1\42\1\uffff\2\55\1"+
        "\uffff\2\55\1\uffff\2\55\1\uffff\1\155\2\55\2\145\1\uffff\1\42\6"+
        "\55\1\151\2\55\2\154\2\uffff\1\55\1\60\4\55\1\164\1\55\1\uffff\2"+
        "\75\1\55\1\156\3\uffff\1\55\1\163\3\uffff\1\55\1\75\1\uffff\2\55"+
        "\3\uffff";
    static final String DFA11_maxS =
        "\1\uffff\6\172\1\164\1\uffff\1\172\1\uffff\3\172\1\76\1\uffff\1"+
        "\172\1\uffff\1\172\3\uffff\4\172\2\uffff\11\172\1\165\1\164\1\145"+
        "\10\uffff\2\172\1\uffff\4\172\3\uffff\1\172\3\uffff\15\172\3\uffff"+
        "\1\165\1\145\4\uffff\1\170\1\uffff\5\172\1\uffff\7\172\1\uffff\1"+
        "\172\1\uffff\3\172\1\uffff\3\172\6\uffff\4\172\2\uffff\3\172\1\uffff"+
        "\3\172\2\141\4\172\1\uffff\6\172\1\151\1\uffff\2\172\2\uffff\2\142"+
        "\1\172\1\42\1\uffff\2\172\1\uffff\2\172\1\uffff\2\172\1\uffff\1"+
        "\155\2\172\2\145\1\uffff\1\42\6\172\1\151\2\172\2\154\2\uffff\6"+
        "\172\1\164\1\172\1\uffff\2\75\1\172\1\156\3\uffff\1\172\1\163\3"+
        "\uffff\1\172\1\75\1\uffff\2\172\3\uffff";
    static final String DFA11_acceptS =
        "\10\uffff\1\16\1\uffff\1\21\4\uffff\1\57\3\uffff\1\72\1\74\1\75"+
        "\4\uffff\1\70\1\67\14\uffff\1\30\1\32\1\44\1\47\1\53\1\62\1\71\1"+
        "\16\2\uffff\1\21\4\uffff\1\36\1\73\1\57\1\uffff\1\66\1\72\1\74\15"+
        "\uffff\1\15\1\37\1\50\2\uffff\1\31\1\33\1\54\1\63\1\uffff\1\55\5"+
        "\uffff\1\26\7\uffff\1\40\1\uffff\1\41\3\uffff\1\12\3\uffff\1\17"+
        "\1\51\1\27\1\56\1\25\1\35\4\uffff\1\46\1\60\3\uffff\1\6\11\uffff"+
        "\1\14\7\uffff\1\45\2\uffff\1\3\1\13\4\uffff\1\10\2\uffff\1\20\2"+
        "\uffff\1\24\2\uffff\1\2\5\uffff\1\7\14\uffff\1\11\1\52\10\uffff"+
        "\1\65\4\uffff\1\61\1\23\1\64\2\uffff\1\4\1\42\1\43\2\uffff\1\1\2"+
        "\uffff\1\34\1\5\1\22";
    static final String DFA11_specialS =
        "\1\1\20\uffff\1\0\u00c0\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\12\4\25\1\21\5\25\1"+
            "\17\1\25\1\16\12\23\2\25\1\7\1\25\1\10\2\25\32\22\4\25\1\22"+
            "\1\25\3\22\1\5\1\14\1\13\2\22\1\15\2\22\1\3\1\2\1\22\1\4\2\22"+
            "\1\20\1\1\1\11\4\22\1\6\1\22\uff85\25",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\7\31"+
            "\1\27\1\26\12\31\1\30\6\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\37"+
            "\7\31\1\36\5\31\1\35\5\31\1\34\5\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\40\21\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\41\6\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\42"+
            "\3\31\1\43\25\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\44\25\31",
            "\1\56\15\uffff\1\46\61\uffff\1\50\2\uffff\1\52\2\uffff\1\51"+
            "\5\uffff\1\54\1\53\2\uffff\1\55\1\uffff\1\45\1\47",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\61\3\31\1\60\21\31",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\63\21\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\14\31"+
            "\1\64\1\65\14\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\66\26\31",
            "\1\70\16\uffff\1\67",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\72\25\31",
            "\0\73",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\76\14\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\16\31"+
            "\1\77\13\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\100"+
            "\31\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31"+
            "\1\101\16\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\102\14\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\103\14\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\27\31"+
            "\1\104\2\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\14\31"+
            "\1\105\15\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\7\31"+
            "\1\106\22\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\30\31"+
            "\1\107\1\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\17\31"+
            "\1\111\2\31\1\110\7\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\112"+
            "\31\31",
            "\1\114\5\uffff\1\115\13\uffff\1\113",
            "\1\120\5\uffff\1\121\5\uffff\1\122\3\uffff\1\123\1\uffff\1"+
            "\116\1\117",
            "\1\125\3\uffff\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\126\6\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\14\31"+
            "\1\127\15\31",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31"+
            "\1\130\16\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\131"+
            "\31\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\132\26\31",
            "\1\33\2\uffff\12\31\3\uffff\1\133\3\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "",
            "",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\5\31"+
            "\1\134\12\31\1\135\11\31",
            "",
            "",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\6\31"+
            "\1\136\23\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\26\31"+
            "\1\137\3\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\140\10\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\141\6\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\142\6\31",
            "\1\144\2\uffff\12\31\3\uffff\1\143\3\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "\1\146\2\uffff\12\31\3\uffff\1\145\3\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\147\21\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\150\25\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\2\31"+
            "\1\152\27\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\153\25\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\154\10\31",
            "",
            "",
            "",
            "\1\156\13\uffff\1\155",
            "\1\160\3\uffff\1\157",
            "",
            "",
            "",
            "",
            "\1\161\12\uffff\1\162",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31"+
            "\1\163\16\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\17\31"+
            "\1\164\12\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\165\25\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\166\21\31",
            "\1\33\2\uffff\12\31\3\uffff\1\167\3\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "",
            "\1\33\2\uffff\12\31\3\uffff\1\170\3\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\24\31"+
            "\1\171\5\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31"+
            "\1\172\16\31",
            "\1\173\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32"+
            "\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\175\6\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\176\21\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\7\31"+
            "\1\177\22\31",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\13\33\1\u0080\16"+
            "\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\13\33\1\u0081\16"+
            "\33",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\u0082\6\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\u0083\10\31",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\u0084\10\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\u0085\14\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\u0087\25\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31"+
            "\1\u0088\16\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\u0089\14\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31"+
            "\1\u008a\16\31",
            "",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\u008b\21\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\u008c\25\31",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\13\33\1\u008d\16"+
            "\33",
            "",
            "\1\33\2\uffff\12\31\3\uffff\1\u008e\3\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31"+
            "\1\u008f\3\31\1\u0090\12\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0093",
            "\1\u0094",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31"+
            "\1\u0095\7\31",
            "\1\33\2\uffff\12\31\3\uffff\1\u0096\3\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\u0098\21\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\u0099\26\31",
            "",
            "\1\33\2\uffff\12\31\3\uffff\1\u009a\3\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\u009b"+
            "\31\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\u009c"+
            "\31\31",
            "\1\33\2\uffff\12\31\3\uffff\1\u009d\3\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\u009e\10\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31"+
            "\1\u009f\16\31",
            "\1\u00a1",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\u00a2\21\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31"+
            "\1\u00a3\16\31",
            "",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00a7",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\17\31"+
            "\1\u00a8\12\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31"+
            "\1\u00a9\7\31",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\u00aa\6\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\14\31"+
            "\1\u00ab\15\31",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\u00ac\25\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\u00ad\21\31",
            "",
            "\1\u00ae",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\u00af\14\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\u00b0\25\31",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\u00b5\6\31",
            "\1\u00b6\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32"+
            "\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\u00b7\25\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\u00b8\25\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\u00b9\26\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\u00ba\14\31",
            "\1\u00bb",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\u00bc\25\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00be",
            "\1\u00bf",
            "",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\u00c0\21\31",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\u00c1\13"+
            "\33",
            "\1\33\2\uffff\12\31\3\uffff\1\u00c2\3\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "\1\33\2\uffff\12\31\3\uffff\1\u00c3\3\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\u00c5\25\31",
            "\1\u00c6",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\16\31"+
            "\1\u00ca\13\31",
            "\1\u00cb",
            "",
            "",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00cd",
            "",
            "",
            "",
            "\1\33\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\u00ce\14\31",
            "\1\u00cf",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\31\3\uffff\1\u00d1\3\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | RULE_STRING | RULE_FQN | RULE_ID | RULE_ML_COMMENT | RULE_INT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_17 = input.LA(1);

                        s = -1;
                        if ( ((LA11_17>='\u0000' && LA11_17<='\uFFFF')) ) {s = 59;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='s') ) {s = 1;}

                        else if ( (LA11_0=='m') ) {s = 2;}

                        else if ( (LA11_0=='l') ) {s = 3;}

                        else if ( (LA11_0=='o') ) {s = 4;}

                        else if ( (LA11_0=='d') ) {s = 5;}

                        else if ( (LA11_0=='y') ) {s = 6;}

                        else if ( (LA11_0=='<') ) {s = 7;}

                        else if ( (LA11_0=='>') ) {s = 8;}

                        else if ( (LA11_0=='t') ) {s = 9;}

                        else if ( (LA11_0=='\"') ) {s = 10;}

                        else if ( (LA11_0=='f') ) {s = 11;}

                        else if ( (LA11_0=='e') ) {s = 12;}

                        else if ( (LA11_0=='i') ) {s = 13;}

                        else if ( (LA11_0=='/') ) {s = 14;}

                        else if ( (LA11_0=='-') ) {s = 15;}

                        else if ( (LA11_0=='r') ) {s = 16;}

                        else if ( (LA11_0=='\'') ) {s = 17;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='c')||(LA11_0>='g' && LA11_0<='h')||(LA11_0>='j' && LA11_0<='k')||LA11_0=='n'||(LA11_0>='p' && LA11_0<='q')||(LA11_0>='u' && LA11_0<='x')||LA11_0=='z') ) {s = 18;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 19;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 20;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='(' && LA11_0<=',')||LA11_0=='.'||(LA11_0>=':' && LA11_0<=';')||LA11_0=='='||(LA11_0>='?' && LA11_0<='@')||(LA11_0>='[' && LA11_0<='^')||LA11_0=='`'||(LA11_0>='{' && LA11_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}