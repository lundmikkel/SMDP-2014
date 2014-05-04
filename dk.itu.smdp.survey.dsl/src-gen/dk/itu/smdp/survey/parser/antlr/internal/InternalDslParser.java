package dk.itu.smdp.survey.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.smdp.survey.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FQN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<survey'", "'title=\"'", "'\"'", "'description=\"'", "'filename=\"'", "'>'", "'</survey>'", "'<template'", "'id=\"'", "'</template>'", "'<a'", "'</a>'", "'<group'", "'depends-on=\"'", "'required'", "'</group>'", "'<text'", "'singleline'", "'single'", "'multi'", "'multiline'", "'/>'", "'<scale'", "'min=\"'", "'max=\"'", "'min-label=\"'", "'max-label=\"'", "'<date'", "'start=\"'", "'end=\"'", "'show-limits'", "'show'", "'limits'", "'day'", "'month'", "'year'", "'<number'", "'<single'", "'other'", "'other=\"\"'", "'other=\"'", "'</single>'", "'<multiple'", "'</multiple>'", "'<table'", "'multiple'", "'</table>'", "'-'", "'ref=\"'", "'template=\"'", "'<q'", "'</q>'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
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
    public static final int RULE_INT=6;
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
    public static final int RULE_FQN=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
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


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Survey";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSurvey"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:67:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey75);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey85); 

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
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:76:1: ruleSurvey returns [EObject current=null] : ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )* ) ) ) otherlv_12= '>' ( ( (lv_items_13_0= ruleItem ) ) | ( (lv_templates_14_0= ruleAnswerTemplate ) ) )* otherlv_15= '</survey>' )? ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_items_13_0 = null;

        EObject lv_templates_14_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:79:28: ( ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )* ) ) ) otherlv_12= '>' ( ( (lv_items_13_0= ruleItem ) ) | ( (lv_templates_14_0= ruleAnswerTemplate ) ) )* otherlv_15= '</survey>' )? ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )* ) ) ) otherlv_12= '>' ( ( (lv_items_13_0= ruleItem ) ) | ( (lv_templates_14_0= ruleAnswerTemplate ) ) )* otherlv_15= '</survey>' )? )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )* ) ) ) otherlv_12= '>' ( ( (lv_items_13_0= ruleItem ) ) | ( (lv_templates_14_0= ruleAnswerTemplate ) ) )* otherlv_15= '</survey>' )? )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )* ) ) ) otherlv_12= '>' ( ( (lv_items_13_0= ruleItem ) ) | ( (lv_templates_14_0= ruleAnswerTemplate ) ) )* otherlv_15= '</survey>' )?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:86:2: (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )* ) ) ) otherlv_12= '>' ( ( (lv_items_13_0= ruleItem ) ) | ( (lv_templates_14_0= ruleAnswerTemplate ) ) )* otherlv_15= '</survey>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:86:4: otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )* ) ) ) otherlv_12= '>' ( ( (lv_items_13_0= ruleItem ) ) | ( (lv_templates_14_0= ruleAnswerTemplate ) ) )* otherlv_15= '</survey>'
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey132); 

                        	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getSurveyKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:90:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )* ) ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:92:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )* ) )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:92:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )* ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:93:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:96:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )* )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )*
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) )*
                    loop4:
                    do {
                        int alt4=4;
                        int LA4_0 = input.LA(1);

                        if ( LA4_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0) ) {
                            alt4=1;
                        }
                        else if ( LA4_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1) ) {
                            alt4=2;
                        }
                        else if ( LA4_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 2) ) {
                            alt4=3;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:105: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:101:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"'
                    	    {
                    	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey190); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSurveyAccess().getTitleKeyword_1_1_0_0());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:108:1: ( (lv_title_4_0= ruleEString ) )?
                    	    int alt1=2;
                    	    int LA1_0 = input.LA(1);

                    	    if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
                    	        alt1=1;
                    	    }
                    	    switch (alt1) {
                    	        case 1 :
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:109:1: (lv_title_4_0= ruleEString )
                    	            {
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:109:1: (lv_title_4_0= ruleEString )
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:110:3: lv_title_4_0= ruleEString
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_1_1_0_1_0()); 
                    	            	    
                    	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey211);
                    	            lv_title_4_0=ruleEString();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"title",
                    	                    		lv_title_4_0, 
                    	                    		"EString");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey224); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSurveyAccess().getQuotationMarkKeyword_1_1_0_2());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:137:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:137:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:105: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:139:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"'
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSurvey292); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getDescriptionKeyword_1_1_1_0());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:146:1: ( (lv_description_7_0= ruleEString ) )?
                    	    int alt2=2;
                    	    int LA2_0 = input.LA(1);

                    	    if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                    	        alt2=1;
                    	    }
                    	    switch (alt2) {
                    	        case 1 :
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:147:1: (lv_description_7_0= ruleEString )
                    	            {
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:147:1: (lv_description_7_0= ruleEString )
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:148:3: lv_description_7_0= ruleEString
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getSurveyAccess().getDescriptionEStringParserRuleCall_1_1_1_1_0()); 
                    	            	    
                    	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey313);
                    	            lv_description_7_0=ruleEString();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"description",
                    	                    		lv_description_7_0, 
                    	                    		"EString");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey326); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getSurveyAccess().getQuotationMarkKeyword_1_1_1_2());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:175:4: ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:175:4: ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:176:5: {...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 2)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:176:105: ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:177:6: ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 2);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:180:6: ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:180:7: {...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:180:16: (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:180:18: otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"'
                    	    {
                    	    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSurvey394); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSurveyAccess().getFilenameKeyword_1_1_2_0());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:184:1: ( (lv_name_10_0= RULE_ID ) )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==RULE_ID) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:185:1: (lv_name_10_0= RULE_ID )
                    	            {
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:185:1: (lv_name_10_0= RULE_ID )
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:186:3: lv_name_10_0= RULE_ID
                    	            {
                    	            lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSurvey411); 

                    	            			newLeafNode(lv_name_10_0, grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_1_2_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getSurveyRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"name",
                    	                    		lv_name_10_0, 
                    	                    		"ID");
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey429); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getSurveyAccess().getQuotationMarkKeyword_1_1_2_2());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	    	 				

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

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	

                    }

                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSurvey482); 

                        	newLeafNode(otherlv_12, grammarAccess.getSurveyAccess().getGreaterThanSignKeyword_1_2());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:224:1: ( ( (lv_items_13_0= ruleItem ) ) | ( (lv_templates_14_0= ruleAnswerTemplate ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==24||LA5_0==28||LA5_0==34||LA5_0==39||(LA5_0>=48 && LA5_0<=49)||LA5_0==54||LA5_0==56) ) {
                            alt5=1;
                        }
                        else if ( (LA5_0==19) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:224:2: ( (lv_items_13_0= ruleItem ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:224:2: ( (lv_items_13_0= ruleItem ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:225:1: (lv_items_13_0= ruleItem )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:225:1: (lv_items_13_0= ruleItem )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:226:3: lv_items_13_0= ruleItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getItemsItemParserRuleCall_1_3_0_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleItem_in_ruleSurvey504);
                    	    lv_items_13_0=ruleItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_13_0, 
                    	            		"Item");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:243:6: ( (lv_templates_14_0= ruleAnswerTemplate ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:243:6: ( (lv_templates_14_0= ruleAnswerTemplate ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:244:1: (lv_templates_14_0= ruleAnswerTemplate )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:244:1: (lv_templates_14_0= ruleAnswerTemplate )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:245:3: lv_templates_14_0= ruleAnswerTemplate
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getTemplatesAnswerTemplateParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_ruleSurvey531);
                    	    lv_templates_14_0=ruleAnswerTemplate();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"templates",
                    	            		lv_templates_14_0, 
                    	            		"AnswerTemplate");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSurvey545); 

                        	newLeafNode(otherlv_15, grammarAccess.getSurveyAccess().getSurveyKeyword_1_4());
                        

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
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:273:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:274:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:275:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString584);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString595); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:282:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:285:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:286:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:286:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:286:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString635); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:294:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString661); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleItem"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:309:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:310:2: (iv_ruleItem= ruleItem EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:311:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_entryRuleItem706);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItem716); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:318:1: ruleItem returns [EObject current=null] : (this_Group_0= ruleGroup | this_Question_1= ruleQuestion ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_Group_0 = null;

        EObject this_Question_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:321:28: ( (this_Group_0= ruleGroup | this_Question_1= ruleQuestion ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:322:1: (this_Group_0= ruleGroup | this_Question_1= ruleQuestion )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:322:1: (this_Group_0= ruleGroup | this_Question_1= ruleQuestion )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==28||LA8_0==34||LA8_0==39||(LA8_0>=48 && LA8_0<=49)||LA8_0==54||LA8_0==56) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:323:5: this_Group_0= ruleGroup
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getGroupParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleItem763);
                    this_Group_0=ruleGroup();

                    state._fsp--;

                     
                            current = this_Group_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:333:5: this_Question_1= ruleQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getQuestionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleItem790);
                    this_Question_1=ruleQuestion();

                    state._fsp--;

                     
                            current = this_Question_1; 
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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleQuestion"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:349:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:350:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:351:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion825);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion835); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:358:1: ruleQuestion returns [EObject current=null] : (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_Scale_1 = null;

        EObject this_Date_2 = null;

        EObject this_Number_3 = null;

        EObject this_Single_4 = null;

        EObject this_Multiple_5 = null;

        EObject this_Table_6 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:361:28: ( (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:362:1: (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:362:1: (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 39:
                {
                alt9=3;
                }
                break;
            case 48:
                {
                alt9=4;
                }
                break;
            case 49:
                {
                alt9=5;
                }
                break;
            case 54:
                {
                alt9=6;
                }
                break;
            case 56:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:363:5: this_Text_0= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTextParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleQuestion882);
                    this_Text_0=ruleText();

                    state._fsp--;

                     
                            current = this_Text_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:373:5: this_Scale_1= ruleScale
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getScaleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleQuestion909);
                    this_Scale_1=ruleScale();

                    state._fsp--;

                     
                            current = this_Scale_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:383:5: this_Date_2= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getDateParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleQuestion936);
                    this_Date_2=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:393:5: this_Number_3= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getNumberParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleQuestion963);
                    this_Number_3=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:403:5: this_Single_4= ruleSingle
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSingleParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleQuestion990);
                    this_Single_4=ruleSingle();

                    state._fsp--;

                     
                            current = this_Single_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:413:5: this_Multiple_5= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleQuestion1017);
                    this_Multiple_5=ruleMultiple();

                    state._fsp--;

                     
                            current = this_Multiple_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:423:5: this_Table_6= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTableParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleQuestion1044);
                    this_Table_6=ruleTable();

                    state._fsp--;

                     
                            current = this_Table_6; 
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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleOption"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:439:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:440:2: (iv_ruleOption= ruleOption EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:441:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption1079);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption1089); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:448:1: ruleOption returns [EObject current=null] : (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_AnswerTemplateRef_0 = null;

        EObject this_Answer_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:451:28: ( (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:452:1: (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:452:1: (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:453:5: this_AnswerTemplateRef_0= ruleAnswerTemplateRef
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerTemplateRefParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_ruleOption1136);
                    this_AnswerTemplateRef_0=ruleAnswerTemplateRef();

                    state._fsp--;

                     
                            current = this_AnswerTemplateRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:463:5: this_Answer_1= ruleAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleOption1163);
                    this_Answer_1=ruleAnswer();

                    state._fsp--;

                     
                            current = this_Answer_1; 
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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleAnswerTemplate"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:479:1: entryRuleAnswerTemplate returns [EObject current=null] : iv_ruleAnswerTemplate= ruleAnswerTemplate EOF ;
    public final EObject entryRuleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:480:2: (iv_ruleAnswerTemplate= ruleAnswerTemplate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:481:2: iv_ruleAnswerTemplate= ruleAnswerTemplate EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1198);
            iv_ruleAnswerTemplate=ruleAnswerTemplate();

            state._fsp--;

             current =iv_ruleAnswerTemplate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplate1208); 

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
    // $ANTLR end "entryRuleAnswerTemplate"


    // $ANTLR start "ruleAnswerTemplate"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:488:1: ruleAnswerTemplate returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) ;
    public final EObject ruleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_answers_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:491:28: ( (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:492:1: (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:492:1: (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:492:3: otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswerTemplate1245); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswerTemplate1257); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateAccess().getIdKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:500:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:501:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:501:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:502:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplate1274); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAnswerTemplateAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswerTemplate1291); 

                	newLeafNode(otherlv_3, grammarAccess.getAnswerTemplateAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswerTemplate1303); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerTemplateAccess().getGreaterThanSignKeyword_4());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:526:1: ( (lv_answers_5_0= ruleAnswer ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:527:1: (lv_answers_5_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:527:1: (lv_answers_5_0= ruleAnswer )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:528:3: lv_answers_5_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAnswerTemplateAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleAnswerTemplate1324);
            	    lv_answers_5_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAnswerTemplateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_5_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswerTemplate1337); 

                	newLeafNode(otherlv_6, grammarAccess.getAnswerTemplateAccess().getTemplateKeyword_6());
                

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
    // $ANTLR end "ruleAnswerTemplate"


    // $ANTLR start "entryRuleAnswer"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:556:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:557:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:558:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer1373);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer1383); 

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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:565:1: ruleAnswer returns [EObject current=null] : (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>' ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:568:28: ( (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:569:1: (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:569:1: (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:569:3: otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnswer1420); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:573:1: (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:573:3: otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"'
                    {
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswer1433); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getIdKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:577:1: ( (lv_name_2_0= RULE_ID ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:578:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:578:1: (lv_name_2_0= RULE_ID )
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:579:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswer1450); 

                            			newLeafNode(lv_name_2_0, grammarAccess.getAnswerAccess().getNameIDTerminalRuleCall_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAnswerRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_2_0, 
                                    		"ID");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswer1468); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnswerAccess().getQuotationMarkKeyword_1_2());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswer1482); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:603:1: ( (lv_title_5_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:604:1: (lv_title_5_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:604:1: (lv_title_5_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:605:3: lv_title_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getTitleEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1503);
            lv_title_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnswer1515); 

                	newLeafNode(otherlv_6, grammarAccess.getAnswerAccess().getAKeyword_4());
                

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
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleGroup"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:633:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:634:2: (iv_ruleGroup= ruleGroup EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:635:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup1551);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup1561); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:642:1: ruleGroup returns [EObject current=null] : (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_required_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_12_0 = null;

        EObject lv_questions_16_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:645:28: ( (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:646:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:646:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:646:3: otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGroup1598); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:650:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:652:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:652:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:653:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:656:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:657:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:657:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )*
            loop18:
            do {
                int alt18=6;
                int LA18_0 = input.LA(1);

                if ( LA18_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
                    alt18=3;
                }
                else if ( LA18_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
                    alt18=4;
                }
                else if ( LA18_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4) ) {
                    alt18=5;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:659:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:659:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:660:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:660:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:661:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:664:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:664:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:664:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:664:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1656); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:668:1: ( (lv_title_3_0= ruleEString ) )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:669:1: (lv_title_3_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:669:1: (lv_title_3_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:670:3: lv_title_3_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1677);
            	            lv_title_3_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"title",
            	                    		lv_title_3_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1690); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:697:4: ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:697:4: ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:698:5: {...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:698:102: ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:699:6: ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:702:6: ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:702:7: {...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:702:16: (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:702:18: otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGroup1758); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getIdKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:706:1: ( (lv_name_6_0= ruleEString ) )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:707:1: (lv_name_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:707:1: (lv_name_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:708:3: lv_name_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1779);
            	            lv_name_6_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_6_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1792); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:735:4: ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:735:4: ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:736:5: {...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:736:102: ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:737:6: ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:740:6: ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:740:7: {...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:740:16: (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:740:18: otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup1860); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getDescriptionKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:744:1: ( (lv_description_9_0= ruleEString ) )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:745:1: (lv_description_9_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:745:1: (lv_description_9_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:746:3: lv_description_9_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getDescriptionEStringParserRuleCall_1_2_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1881);
            	            lv_description_9_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_9_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1894); 

            	        	newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:773:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:773:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:774:5: {...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:774:102: ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:775:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:778:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:778:7: {...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:778:16: (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:778:18: otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGroup1962); 

            	        	newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:782:1: ( (lv_dependsOn_12_0= ruleDEP_ID ) )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_ID||LA17_0==RULE_FQN) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:783:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:783:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:784:3: lv_dependsOn_12_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getDependsOnDEP_IDParserRuleCall_1_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleGroup1983);
            	            lv_dependsOn_12_0=ruleDEP_ID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"dependsOn",
            	                    		lv_dependsOn_12_0, 
            	                    		"DEP_ID");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1996); 

            	        	newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:811:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:811:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:812:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:812:102: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:813:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:816:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:816:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:816:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:817:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:817:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:818:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleGroup2069); 

            	            newLeafNode(lv_required_14_0, grammarAccess.getGroupAccess().getRequiredRequiredKeyword_1_4_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	

            }

            otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGroup2134); 

                	newLeafNode(otherlv_15, grammarAccess.getGroupAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:849:1: ( (lv_questions_16_0= ruleQuestion ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28||LA19_0==34||LA19_0==39||(LA19_0>=48 && LA19_0<=49)||LA19_0==54||LA19_0==56) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:850:1: (lv_questions_16_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:850:1: (lv_questions_16_0= ruleQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:851:3: lv_questions_16_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleGroup2155);
            	    lv_questions_16_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_16_0, 
            	            		"Question");
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

            otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleGroup2168); 

                	newLeafNode(otherlv_17, grammarAccess.getGroupAccess().getGroupKeyword_4());
                

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleText"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:879:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:880:2: (iv_ruleText= ruleText EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:881:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText2204);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText2214); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:888:1: ruleText returns [EObject current=null] : ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_required_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_multiline_18_1=null;
        Token lv_multiline_18_2=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:28: ( ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:2: () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:893:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleText2260); 

                	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:902:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:904:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:904:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:905:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:908:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:909:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:909:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=7;
                int LA25_0 = input.LA(1);

                if ( LA25_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
                    alt25=3;
                }
                else if ( LA25_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
                    alt25=4;
                }
                else if ( LA25_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
                    alt25=5;
                }
                else if ( LA25_0 >=29 && LA25_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
                    alt25=6;
                }


                switch (alt25) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:911:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:911:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:912:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:912:101: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:913:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:916:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:916:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:916:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:916:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2318); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTextAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:920:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:921:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:921:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:922:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2339);
            	    lv_title_4_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2351); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:949:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:949:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:950:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:950:101: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:951:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:954:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:954:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:954:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:954:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleText2419); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:958:1: ( (lv_description_7_0= ruleEString ) )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:959:1: (lv_description_7_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:959:1: (lv_description_7_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:960:3: lv_description_7_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTextAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2440);
            	            lv_description_7_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTextRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_7_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2453); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:987:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:987:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:988:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:988:101: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:989:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:992:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:992:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:992:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:992:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleText2521); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTextAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:996:1: ( (lv_name_10_0= RULE_ID ) )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==RULE_ID) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:997:1: (lv_name_10_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:997:1: (lv_name_10_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:998:3: lv_name_10_0= RULE_ID
            	            {
            	            lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleText2538); 

            	            			newLeafNode(lv_name_10_0, grammarAccess.getTextAccess().getNameIDTerminalRuleCall_2_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTextRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_10_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2556); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1025:4: ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1025:4: ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1026:5: {...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1026:101: ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1027:6: ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1030:6: ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1030:7: {...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1030:16: (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1030:18: otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleText2624); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTextAccess().getDependsOnKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1034:1: ( (lv_dependsOn_13_0= ruleDEP_ID ) )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==RULE_ID||LA22_0==RULE_FQN) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1035:1: (lv_dependsOn_13_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1035:1: (lv_dependsOn_13_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1036:3: lv_dependsOn_13_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTextAccess().getDependsOnDEP_IDParserRuleCall_2_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleText2645);
            	            lv_dependsOn_13_0=ruleDEP_ID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTextRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"dependsOn",
            	                    		lv_dependsOn_13_0, 
            	                    		"DEP_ID");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2658); 

            	        	newLeafNode(otherlv_14, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1063:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1063:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1064:5: {...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1064:101: ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1065:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1068:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1068:7: {...}? => ( (lv_required_15_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1068:16: ( (lv_required_15_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1069:1: (lv_required_15_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1069:1: (lv_required_15_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1070:3: lv_required_15_0= 'required'
            	    {
            	    lv_required_15_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleText2731); 

            	            newLeafNode(lv_required_15_0, grammarAccess.getTextAccess().getRequiredRequiredKeyword_2_4_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTextRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1090:4: ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1090:4: ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1091:5: {...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1091:101: ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1092:6: ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1095:6: ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1095:7: {...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1095:16: (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) )
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 31:
            	    case 32:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1095:18: otherlv_16= 'singleline'
            	            {
            	            otherlv_16=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleText2811); 

            	                	newLeafNode(otherlv_16, grammarAccess.getTextAccess().getSinglelineKeyword_2_5_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1100:7: otherlv_17= 'single'
            	            {
            	            otherlv_17=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleText2829); 

            	                	newLeafNode(otherlv_17, grammarAccess.getTextAccess().getSingleKeyword_2_5_1());
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1105:6: ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1105:6: ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1106:1: ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1106:1: ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1107:1: (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1107:1: (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' )
            	            int alt23=2;
            	            int LA23_0 = input.LA(1);

            	            if ( (LA23_0==31) ) {
            	                alt23=1;
            	            }
            	            else if ( (LA23_0==32) ) {
            	                alt23=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 23, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt23) {
            	                case 1 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1108:3: lv_multiline_18_1= 'multi'
            	                    {
            	                    lv_multiline_18_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleText2855); 

            	                            newLeafNode(lv_multiline_18_1, grammarAccess.getTextAccess().getMultilineMultiKeyword_2_5_2_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getTextRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "multiline", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1120:8: lv_multiline_18_2= 'multiline'
            	                    {
            	                    lv_multiline_18_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleText2884); 

            	                            newLeafNode(lv_multiline_18_2, grammarAccess.getTextAccess().getMultilineMultilineKeyword_2_5_2_0_1());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getTextRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "multiline", true, null);
            	                    	    

            	                    }
            	                    break;

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTextAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canLeave(grammarAccess.getTextAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	

            }

            otherlv_19=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleText2959); 

                	newLeafNode(otherlv_19, grammarAccess.getTextAccess().getSolidusGreaterThanSignKeyword_3());
                

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleScale"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1162:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1163:2: (iv_ruleScale= ruleScale EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1164:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScale_in_entryRuleScale2995);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScale3005); 

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
    // $ANTLR end "entryRuleScale"


    // $ANTLR start "ruleScale"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1171:1: ruleScale returns [EObject current=null] : (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) ;
    public final EObject ruleScale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token lv_required_26_0=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_min_12_0 = null;

        AntlrDatatypeRuleToken lv_max_15_0 = null;

        AntlrDatatypeRuleToken lv_minLabel_18_0 = null;

        AntlrDatatypeRuleToken lv_maxLabel_21_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_24_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1174:28: ( (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1175:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1175:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1175:3: otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleScale3042); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1179:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1181:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1181:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1182:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1185:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1186:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1186:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=10;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1188:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1188:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1189:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1189:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1190:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1193:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1193:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1193:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1193:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3100); 

            	        	newLeafNode(otherlv_2, grammarAccess.getScaleAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1197:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1198:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1198:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1199:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3121);
            	    lv_title_3_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_3_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3133); 

            	        	newLeafNode(otherlv_4, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1226:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1226:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1227:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1227:102: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1228:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1231:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1231:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1231:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1231:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3201); 

            	        	newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1235:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1236:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1236:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1237:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getScaleAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3222);
            	            lv_description_6_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_6_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3235); 

            	        	newLeafNode(otherlv_7, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1264:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1264:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1265:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1265:102: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1266:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1269:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1269:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1269:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1269:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleScale3303); 

            	        	newLeafNode(otherlv_8, grammarAccess.getScaleAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1273:1: ( (lv_name_9_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1274:1: (lv_name_9_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1274:1: (lv_name_9_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1275:3: lv_name_9_0= RULE_ID
            	    {
            	    lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleScale3320); 

            	    			newLeafNode(lv_name_9_0, grammarAccess.getScaleAccess().getNameIDTerminalRuleCall_1_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScaleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_9_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3337); 

            	        	newLeafNode(otherlv_10, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1302:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1302:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1303:5: {...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1303:102: ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1304:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1307:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1307:7: {...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1307:16: (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1307:18: otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleScale3405); 

            	        	newLeafNode(otherlv_11, grammarAccess.getScaleAccess().getMinKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1311:1: ( (lv_min_12_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1312:1: (lv_min_12_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1312:1: (lv_min_12_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1313:3: lv_min_12_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getMinEIntParserRuleCall_1_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3426);
            	    lv_min_12_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"min",
            	            		lv_min_12_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3438); 

            	        	newLeafNode(otherlv_13, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1340:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1340:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1341:5: {...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1341:102: ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1342:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1345:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1345:7: {...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1345:16: (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1345:18: otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"'
            	    {
            	    otherlv_14=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleScale3506); 

            	        	newLeafNode(otherlv_14, grammarAccess.getScaleAccess().getMaxKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1349:1: ( (lv_max_15_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1350:1: (lv_max_15_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1350:1: (lv_max_15_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1351:3: lv_max_15_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getMaxEIntParserRuleCall_1_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3527);
            	    lv_max_15_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"max",
            	            		lv_max_15_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3539); 

            	        	newLeafNode(otherlv_16, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1378:4: ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1378:4: ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1379:5: {...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1379:102: ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1380:6: ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1383:6: ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1383:7: {...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1383:16: (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1383:18: otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"'
            	    {
            	    otherlv_17=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleScale3607); 

            	        	newLeafNode(otherlv_17, grammarAccess.getScaleAccess().getMinLabelKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1387:1: ( (lv_minLabel_18_0= ruleEString ) )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1388:1: (lv_minLabel_18_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1388:1: (lv_minLabel_18_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1389:3: lv_minLabel_18_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getScaleAccess().getMinLabelEStringParserRuleCall_1_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3628);
            	            lv_minLabel_18_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"minLabel",
            	                    		lv_minLabel_18_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3641); 

            	        	newLeafNode(otherlv_19, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1416:4: ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1416:4: ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1417:5: {...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1417:102: ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1418:6: ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1421:6: ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1421:7: {...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1421:16: (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1421:18: otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"'
            	    {
            	    otherlv_20=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleScale3709); 

            	        	newLeafNode(otherlv_20, grammarAccess.getScaleAccess().getMaxLabelKeyword_1_6_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1425:1: ( (lv_maxLabel_21_0= ruleEString ) )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1426:1: (lv_maxLabel_21_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1426:1: (lv_maxLabel_21_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1427:3: lv_maxLabel_21_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getScaleAccess().getMaxLabelEStringParserRuleCall_1_6_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3730);
            	            lv_maxLabel_21_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"maxLabel",
            	                    		lv_maxLabel_21_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3743); 

            	        	newLeafNode(otherlv_22, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_6_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1454:4: ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1454:4: ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1455:5: {...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1455:102: ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1456:6: ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1459:6: ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1459:7: {...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1459:16: (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1459:18: otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"'
            	    {
            	    otherlv_23=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleScale3811); 

            	        	newLeafNode(otherlv_23, grammarAccess.getScaleAccess().getDependsOnKeyword_1_7_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1463:1: ( (lv_dependsOn_24_0= ruleDEP_ID ) )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==RULE_ID||LA29_0==RULE_FQN) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1464:1: (lv_dependsOn_24_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1464:1: (lv_dependsOn_24_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1465:3: lv_dependsOn_24_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getScaleAccess().getDependsOnDEP_IDParserRuleCall_1_7_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleScale3832);
            	            lv_dependsOn_24_0=ruleDEP_ID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"dependsOn",
            	                    		lv_dependsOn_24_0, 
            	                    		"DEP_ID");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3845); 

            	        	newLeafNode(otherlv_25, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_7_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1492:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1492:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1493:5: {...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1493:102: ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1494:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1497:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1497:7: {...}? => ( (lv_required_26_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1497:16: ( (lv_required_26_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1498:1: (lv_required_26_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1498:1: (lv_required_26_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1499:3: lv_required_26_0= 'required'
            	    {
            	    lv_required_26_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleScale3918); 

            	            newLeafNode(lv_required_26_0, grammarAccess.getScaleAccess().getRequiredRequiredKeyword_1_8_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScaleRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getScaleAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canLeave(grammarAccess.getScaleAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_27=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleScale3989); 

                	newLeafNode(otherlv_27, grammarAccess.getScaleAccess().getSolidusGreaterThanSignKeyword_2());
                

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
    // $ANTLR end "ruleScale"


    // $ANTLR start "entryRuleDate"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1539:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1540:2: (iv_ruleDate= ruleDate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1541:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate4025);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate4035); 

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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1548:1: ruleDate returns [EObject current=null] : ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_showLimits_21_1=null;
        Token lv_showLimits_21_2=null;
        Token lv_showLimits_21_3=null;
        Token lv_required_22_0=null;
        Token lv_day_23_0=null;
        Token lv_month_24_0=null;
        Token lv_year_25_0=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_start_13_0 = null;

        AntlrDatatypeRuleToken lv_end_16_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_19_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1551:28: ( ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1552:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1552:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1552:2: () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1552:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1553:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDate4081); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1562:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1564:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1564:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1565:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1568:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1569:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1569:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=12;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1571:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1571:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1572:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1572:101: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1573:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1576:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1576:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1576:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1576:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4139); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1580:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1581:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1581:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1582:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4160);
            	    lv_title_4_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4172); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1609:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1609:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1610:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1610:101: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1611:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1614:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1614:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1614:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1614:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDate4240); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1618:1: ( (lv_description_7_0= ruleEString ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1619:1: (lv_description_7_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1619:1: (lv_description_7_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1620:3: lv_description_7_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getDateAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4261);
            	            lv_description_7_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getDateRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_7_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4274); 

            	        	newLeafNode(otherlv_8, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1647:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1647:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1648:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1648:101: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1649:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1652:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1652:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1652:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1652:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDate4342); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDateAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1656:1: ( (lv_name_10_0= RULE_ID ) )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==RULE_ID) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1657:1: (lv_name_10_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1657:1: (lv_name_10_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1658:3: lv_name_10_0= RULE_ID
            	            {
            	            lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDate4359); 

            	            			newLeafNode(lv_name_10_0, grammarAccess.getDateAccess().getNameIDTerminalRuleCall_2_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDateRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_10_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4377); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1685:4: ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1685:4: ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1686:5: {...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1686:101: ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1687:6: ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1690:6: ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1690:7: {...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1690:16: (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1690:18: otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDate4445); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDateAccess().getStartKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1694:1: ( (lv_start_13_0= ruleEString ) )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1695:1: (lv_start_13_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1695:1: (lv_start_13_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1696:3: lv_start_13_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getDateAccess().getStartEStringParserRuleCall_2_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4466);
            	            lv_start_13_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getDateRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"start",
            	                    		lv_start_13_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4479); 

            	        	newLeafNode(otherlv_14, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1723:4: ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1723:4: ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1724:5: {...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1724:101: ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1725:6: ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1728:6: ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1728:7: {...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1728:16: (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1728:18: otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"'
            	    {
            	    otherlv_15=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDate4547); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDateAccess().getEndKeyword_2_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1732:1: ( (lv_end_16_0= ruleEString ) )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1733:1: (lv_end_16_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1733:1: (lv_end_16_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1734:3: lv_end_16_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getDateAccess().getEndEStringParserRuleCall_2_4_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4568);
            	            lv_end_16_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getDateRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"end",
            	                    		lv_end_16_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4581); 

            	        	newLeafNode(otherlv_17, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1761:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1761:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1762:5: {...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1762:101: ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1763:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1766:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1766:7: {...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1766:16: (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1766:18: otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"'
            	    {
            	    otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDate4649); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDateAccess().getDependsOnKeyword_2_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1770:1: ( (lv_dependsOn_19_0= ruleDEP_ID ) )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==RULE_ID||LA35_0==RULE_FQN) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1771:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1771:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1772:3: lv_dependsOn_19_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getDateAccess().getDependsOnDEP_IDParserRuleCall_2_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleDate4670);
            	            lv_dependsOn_19_0=ruleDEP_ID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getDateRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"dependsOn",
            	                    		lv_dependsOn_19_0, 
            	                    		"DEP_ID");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4683); 

            	        	newLeafNode(otherlv_20, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1799:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1799:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1800:5: {...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1800:101: ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1801:6: ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1804:6: ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1804:7: {...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1804:16: ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1805:1: ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1805:1: ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1806:1: (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1806:1: (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' )
            	    int alt36=3;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt36=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt36=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt36=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt36) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1807:3: lv_showLimits_21_1= 'show-limits'
            	            {
            	            lv_showLimits_21_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDate4758); 

            	                    newLeafNode(lv_showLimits_21_1, grammarAccess.getDateAccess().getShowLimitsShowLimitsKeyword_2_6_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1819:8: lv_showLimits_21_2= 'show'
            	            {
            	            lv_showLimits_21_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDate4787); 

            	                    newLeafNode(lv_showLimits_21_2, grammarAccess.getDateAccess().getShowLimitsShowKeyword_2_6_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1831:8: lv_showLimits_21_3= 'limits'
            	            {
            	            lv_showLimits_21_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDate4816); 

            	                    newLeafNode(lv_showLimits_21_3, grammarAccess.getDateAccess().getShowLimitsLimitsKeyword_2_6_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1853:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1853:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1854:5: {...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1854:101: ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1855:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1858:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1858:7: {...}? => ( (lv_required_22_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1858:16: ( (lv_required_22_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1859:1: (lv_required_22_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1859:1: (lv_required_22_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1860:3: lv_required_22_0= 'required'
            	    {
            	    lv_required_22_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDate4904); 

            	            newLeafNode(lv_required_22_0, grammarAccess.getDateAccess().getRequiredRequiredKeyword_2_7_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1880:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1880:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1881:5: {...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1881:101: ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1882:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1885:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1885:7: {...}? => ( (lv_day_23_0= 'day' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1885:16: ( (lv_day_23_0= 'day' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1886:1: (lv_day_23_0= 'day' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1886:1: (lv_day_23_0= 'day' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1887:3: lv_day_23_0= 'day'
            	    {
            	    lv_day_23_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDate4989); 

            	            newLeafNode(lv_day_23_0, grammarAccess.getDateAccess().getDayDayKeyword_2_8_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	           		setWithLastConsumed(current, "day", true, "day");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1907:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1907:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1908:5: {...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1908:101: ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1909:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1912:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1912:7: {...}? => ( (lv_month_24_0= 'month' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1912:16: ( (lv_month_24_0= 'month' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1913:1: (lv_month_24_0= 'month' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1913:1: (lv_month_24_0= 'month' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1914:3: lv_month_24_0= 'month'
            	    {
            	    lv_month_24_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleDate5074); 

            	            newLeafNode(lv_month_24_0, grammarAccess.getDateAccess().getMonthMonthKeyword_2_9_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	           		setWithLastConsumed(current, "month", true, "month");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1934:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1934:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1935:5: {...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1935:102: ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1936:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1939:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1939:7: {...}? => ( (lv_year_25_0= 'year' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1939:16: ( (lv_year_25_0= 'year' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1940:1: (lv_year_25_0= 'year' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1940:1: (lv_year_25_0= 'year' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1941:3: lv_year_25_0= 'year'
            	    {
            	    lv_year_25_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleDate5159); 

            	            newLeafNode(lv_year_25_0, grammarAccess.getDateAccess().getYearYearKeyword_2_10_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	           		setWithLastConsumed(current, "year", true, "year");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDateAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canLeave(grammarAccess.getDateAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	

            }

            otherlv_26=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleDate5230); 

                	newLeafNode(otherlv_26, grammarAccess.getDateAccess().getSolidusGreaterThanSignKeyword_3());
                

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleNumber"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1981:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1982:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1983:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber5266);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber5276); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1990:1: ruleNumber returns [EObject current=null] : ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_required_21_0=null;
        Token lv_showLimits_22_1=null;
        Token lv_showLimits_22_2=null;
        Token lv_showLimits_22_3=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_min_13_0 = null;

        AntlrDatatypeRuleToken lv_max_16_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_19_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1993:28: ( ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1994:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1994:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1994:2: () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1994:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1995:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberAccess().getNumberAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleNumber5322); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getNumberKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2004:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2006:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2006:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2007:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2010:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2011:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2011:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=9;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2013:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2013:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2014:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2014:103: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2015:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2018:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2018:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2018:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2018:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5380); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2022:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2023:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2023:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2024:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5401);
            	    lv_title_4_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5413); 

            	        	newLeafNode(otherlv_5, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2051:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2051:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2052:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2052:103: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2053:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2056:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2056:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2056:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2056:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNumber5481); 

            	        	newLeafNode(otherlv_6, grammarAccess.getNumberAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2060:1: ( (lv_description_7_0= ruleEString ) )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2061:1: (lv_description_7_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2061:1: (lv_description_7_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2062:3: lv_description_7_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getNumberAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5502);
            	            lv_description_7_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_7_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5515); 

            	        	newLeafNode(otherlv_8, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2089:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2089:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2090:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2090:103: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2091:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2094:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2094:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2094:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2094:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNumber5583); 

            	        	newLeafNode(otherlv_9, grammarAccess.getNumberAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2098:1: ( (lv_name_10_0= RULE_ID ) )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==RULE_ID) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2099:1: (lv_name_10_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2099:1: (lv_name_10_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2100:3: lv_name_10_0= RULE_ID
            	            {
            	            lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNumber5600); 

            	            			newLeafNode(lv_name_10_0, grammarAccess.getNumberAccess().getNameIDTerminalRuleCall_2_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getNumberRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_10_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5618); 

            	        	newLeafNode(otherlv_11, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2127:4: ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2127:4: ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2128:5: {...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2128:103: ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:6: ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2132:6: ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2132:7: {...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2132:16: (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2132:18: otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleNumber5686); 

            	        	newLeafNode(otherlv_12, grammarAccess.getNumberAccess().getMinKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2136:1: ( (lv_min_13_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2137:1: (lv_min_13_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2137:1: (lv_min_13_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2138:3: lv_min_13_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getMinEIntParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5707);
            	    lv_min_13_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"min",
            	            		lv_min_13_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5719); 

            	        	newLeafNode(otherlv_14, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2165:4: ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2165:4: ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2166:5: {...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2166:103: ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2167:6: ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2170:6: ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2170:7: {...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2170:16: (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2170:18: otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"'
            	    {
            	    otherlv_15=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleNumber5787); 

            	        	newLeafNode(otherlv_15, grammarAccess.getNumberAccess().getMaxKeyword_2_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2174:1: ( (lv_max_16_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2175:1: (lv_max_16_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2175:1: (lv_max_16_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2176:3: lv_max_16_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getMaxEIntParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5808);
            	    lv_max_16_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"max",
            	            		lv_max_16_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5820); 

            	        	newLeafNode(otherlv_17, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2203:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2203:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2204:5: {...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2204:103: ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2205:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2208:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2208:7: {...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2208:16: (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2208:18: otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"'
            	    {
            	    otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNumber5888); 

            	        	newLeafNode(otherlv_18, grammarAccess.getNumberAccess().getDependsOnKeyword_2_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2212:1: ( (lv_dependsOn_19_0= ruleDEP_ID ) )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==RULE_ID||LA40_0==RULE_FQN) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2213:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2213:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2214:3: lv_dependsOn_19_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getNumberAccess().getDependsOnDEP_IDParserRuleCall_2_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleNumber5909);
            	            lv_dependsOn_19_0=ruleDEP_ID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"dependsOn",
            	                    		lv_dependsOn_19_0, 
            	                    		"DEP_ID");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5922); 

            	        	newLeafNode(otherlv_20, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2241:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2241:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2242:5: {...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2242:103: ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2243:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2246:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2246:7: {...}? => ( (lv_required_21_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2246:16: ( (lv_required_21_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2247:1: (lv_required_21_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2247:1: (lv_required_21_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2248:3: lv_required_21_0= 'required'
            	    {
            	    lv_required_21_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNumber5995); 

            	            newLeafNode(lv_required_21_0, grammarAccess.getNumberAccess().getRequiredRequiredKeyword_2_6_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNumberRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2268:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2268:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2269:5: {...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2269:103: ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2270:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2273:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2273:7: {...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2273:16: ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2274:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2274:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2275:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2275:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    int alt41=3;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2276:3: lv_showLimits_22_1= 'show-limits'
            	            {
            	            lv_showLimits_22_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNumber6082); 

            	                    newLeafNode(lv_showLimits_22_1, grammarAccess.getNumberAccess().getShowLimitsShowLimitsKeyword_2_7_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getNumberRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2288:8: lv_showLimits_22_2= 'show'
            	            {
            	            lv_showLimits_22_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleNumber6111); 

            	                    newLeafNode(lv_showLimits_22_2, grammarAccess.getNumberAccess().getShowLimitsShowKeyword_2_7_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getNumberRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2300:8: lv_showLimits_22_3= 'limits'
            	            {
            	            lv_showLimits_22_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleNumber6140); 

            	                    newLeafNode(lv_showLimits_22_3, grammarAccess.getNumberAccess().getShowLimitsLimitsKeyword_2_7_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getNumberRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNumberAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canLeave(grammarAccess.getNumberAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	

            }

            otherlv_23=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleNumber6214); 

                	newLeafNode(otherlv_23, grammarAccess.getNumberAccess().getSolidusGreaterThanSignKeyword_3());
                

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleSingle"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2342:1: entryRuleSingle returns [EObject current=null] : iv_ruleSingle= ruleSingle EOF ;
    public final EObject entryRuleSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingle = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2343:2: (iv_ruleSingle= ruleSingle EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2344:2: iv_ruleSingle= ruleSingle EOF
            {
             newCompositeNode(grammarAccess.getSingleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingle_in_entryRuleSingle6250);
            iv_ruleSingle=ruleSingle();

            state._fsp--;

             current =iv_ruleSingle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingle6260); 

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
    // $ANTLR end "entryRuleSingle"


    // $ANTLR start "ruleSingle"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2351:1: ruleSingle returns [EObject current=null] : (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef ) ;
    public final EObject ruleSingle() throws RecognitionException {
        EObject current = null;

        EObject this_SingleWithOptions_0 = null;

        EObject this_SingleRef_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2354:28: ( (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2355:1: (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2355:1: (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2356:5: this_SingleWithOptions_0= ruleSingleWithOptions
                    {
                     
                            newCompositeNode(grammarAccess.getSingleAccess().getSingleWithOptionsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleWithOptions_in_ruleSingle6307);
                    this_SingleWithOptions_0=ruleSingleWithOptions();

                    state._fsp--;

                     
                            current = this_SingleWithOptions_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2366:5: this_SingleRef_1= ruleSingleRef
                    {
                     
                            newCompositeNode(grammarAccess.getSingleAccess().getSingleRefParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleRef_in_ruleSingle6334);
                    this_SingleRef_1=ruleSingleRef();

                    state._fsp--;

                     
                            current = this_SingleRef_1; 
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
    // $ANTLR end "ruleSingle"


    // $ANTLR start "entryRuleSingleWithOptions"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2382:1: entryRuleSingleWithOptions returns [EObject current=null] : iv_ruleSingleWithOptions= ruleSingleWithOptions EOF ;
    public final EObject entryRuleSingleWithOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleWithOptions = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2383:2: (iv_ruleSingleWithOptions= ruleSingleWithOptions EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2384:2: iv_ruleSingleWithOptions= ruleSingleWithOptions EOF
            {
             newCompositeNode(grammarAccess.getSingleWithOptionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleWithOptions_in_entryRuleSingleWithOptions6369);
            iv_ruleSingleWithOptions=ruleSingleWithOptions();

            state._fsp--;

             current =iv_ruleSingleWithOptions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleWithOptions6379); 

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
    // $ANTLR end "entryRuleSingleWithOptions"


    // $ANTLR start "ruleSingleWithOptions"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2391:1: ruleSingleWithOptions returns [EObject current=null] : (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>' ) ;
    public final EObject ruleSingleWithOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_required_14_0=null;
        Token lv_other_15_1=null;
        Token lv_other_15_2=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_12_0 = null;

        AntlrDatatypeRuleToken lv_otherLabel_17_0 = null;

        EObject lv_options_20_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2394:28: ( (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2395:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2395:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2395:3: otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleSingleWithOptions6416); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleWithOptionsAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2399:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2401:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2401:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2402:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2405:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2406:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2406:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=7;
                int LA49_0 = input.LA(1);

                if ( LA49_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 0) ) {
                    alt49=1;
                }
                else if ( LA49_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 1) ) {
                    alt49=2;
                }
                else if ( LA49_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 2) ) {
                    alt49=3;
                }
                else if ( LA49_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 3) ) {
                    alt49=4;
                }
                else if ( LA49_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 4) ) {
                    alt49=5;
                }
                else if ( LA49_0 >=50 && LA49_0<=52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 5) ) {
                    alt49=6;
                }


                switch (alt49) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2408:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2408:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2409:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2409:114: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2410:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2413:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2413:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2413:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2413:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingleWithOptions6474); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSingleWithOptionsAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2417:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2418:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2418:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2419:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleWithOptions6495);
            	    lv_title_3_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleWithOptionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_3_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions6507); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2446:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2446:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2447:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2447:114: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2448:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2451:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2451:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2451:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2451:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingleWithOptions6575); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSingleWithOptionsAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2455:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2456:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2456:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2457:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleWithOptions6596);
            	            lv_description_6_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSingleWithOptionsRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_6_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions6609); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2484:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2484:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2485:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2485:114: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2486:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2489:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2489:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2489:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2489:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSingleWithOptions6677); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSingleWithOptionsAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2493:1: ( (lv_name_9_0= RULE_ID ) )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==RULE_ID) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2494:1: (lv_name_9_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2494:1: (lv_name_9_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2495:3: lv_name_9_0= RULE_ID
            	            {
            	            lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingleWithOptions6694); 

            	            			newLeafNode(lv_name_9_0, grammarAccess.getSingleWithOptionsAccess().getNameIDTerminalRuleCall_1_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getSingleWithOptionsRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_9_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions6712); 

            	        	newLeafNode(otherlv_10, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2522:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2522:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2523:5: {...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2523:114: ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2524:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2527:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2527:7: {...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2527:16: (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2527:18: otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingleWithOptions6780); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSingleWithOptionsAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2531:1: ( (lv_dependsOn_12_0= ruleDEP_ID ) )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==RULE_ID||LA46_0==RULE_FQN) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2532:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2532:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2533:3: lv_dependsOn_12_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getDependsOnDEP_IDParserRuleCall_1_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleSingleWithOptions6801);
            	            lv_dependsOn_12_0=ruleDEP_ID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSingleWithOptionsRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"dependsOn",
            	                    		lv_dependsOn_12_0, 
            	                    		"DEP_ID");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions6814); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2560:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2560:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2561:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2561:114: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2562:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2565:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2565:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2565:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2566:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2566:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2567:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingleWithOptions6887); 

            	            newLeafNode(lv_required_14_0, grammarAccess.getSingleWithOptionsAccess().getRequiredRequiredKeyword_1_4_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleWithOptionsRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2587:4: ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2587:4: ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2588:5: {...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2588:114: ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2589:6: ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2592:6: ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2592:7: {...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2592:16: ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) )
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( ((LA48_0>=50 && LA48_0<=51)) ) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==52) ) {
            	        alt48=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2592:17: ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2592:17: ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2593:1: ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2593:1: ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2594:1: (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2594:1: (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' )
            	            int alt47=2;
            	            int LA47_0 = input.LA(1);

            	            if ( (LA47_0==50) ) {
            	                alt47=1;
            	            }
            	            else if ( (LA47_0==51) ) {
            	                alt47=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 47, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt47) {
            	                case 1 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2595:3: lv_other_15_1= 'other'
            	                    {
            	                    lv_other_15_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSingleWithOptions6975); 

            	                            newLeafNode(lv_other_15_1, grammarAccess.getSingleWithOptionsAccess().getOtherOtherKeyword_1_5_0_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getSingleWithOptionsRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "other", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2607:8: lv_other_15_2= 'other=\"\"'
            	                    {
            	                    lv_other_15_2=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSingleWithOptions7004); 

            	                            newLeafNode(lv_other_15_2, grammarAccess.getSingleWithOptionsAccess().getOtherOtherKeyword_1_5_0_0_1());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getSingleWithOptionsRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "other", true, null);
            	                    	    

            	                    }
            	                    break;

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2623:6: (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2623:6: (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2623:8: otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"'
            	            {
            	            otherlv_16=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleSingleWithOptions7039); 

            	                	newLeafNode(otherlv_16, grammarAccess.getSingleWithOptionsAccess().getOtherKeyword_1_5_1_0());
            	                
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2627:1: ( (lv_otherLabel_17_0= ruleEString ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2628:1: (lv_otherLabel_17_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2628:1: (lv_otherLabel_17_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2629:3: lv_otherLabel_17_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getOtherLabelEStringParserRuleCall_1_5_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleWithOptions7060);
            	            lv_otherLabel_17_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSingleWithOptionsRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"otherLabel",
            	                    		lv_otherLabel_17_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions7072); 

            	                	newLeafNode(otherlv_18, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_5_1_2());
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canLeave(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	

            }

            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSingleWithOptions7132); 

                	newLeafNode(otherlv_19, grammarAccess.getSingleWithOptionsAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2668:1: ( (lv_options_20_0= ruleOption ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==19||LA50_0==22) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2669:1: (lv_options_20_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2669:1: (lv_options_20_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2670:3: lv_options_20_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingleWithOptions7153);
            	    lv_options_20_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleWithOptionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_20_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            otherlv_21=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSingleWithOptions7166); 

                	newLeafNode(otherlv_21, grammarAccess.getSingleWithOptionsAccess().getSingleKeyword_4());
                

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
    // $ANTLR end "ruleSingleWithOptions"


    // $ANTLR start "entryRuleSingleRef"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2698:1: entryRuleSingleRef returns [EObject current=null] : iv_ruleSingleRef= ruleSingleRef EOF ;
    public final EObject entryRuleSingleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2699:2: (iv_ruleSingleRef= ruleSingleRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2700:2: iv_ruleSingleRef= ruleSingleRef EOF
            {
             newCompositeNode(grammarAccess.getSingleRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleRef_in_entryRuleSingleRef7202);
            iv_ruleSingleRef=ruleSingleRef();

            state._fsp--;

             current =iv_ruleSingleRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleRef7212); 

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
    // $ANTLR end "entryRuleSingleRef"


    // $ANTLR start "ruleSingleRef"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2707:1: ruleSingleRef returns [EObject current=null] : (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '/>' ) ;
    public final EObject ruleSingleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_required_14_0=null;
        Token lv_other_15_1=null;
        Token lv_other_15_2=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_12_0 = null;

        AntlrDatatypeRuleToken lv_otherLabel_17_0 = null;

        EObject lv_options_19_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2710:28: ( (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2711:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2711:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2711:3: otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '/>'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleSingleRef7249); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleRefAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2715:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2717:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2717:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2718:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2721:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2722:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2722:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=8;
                int LA56_0 = input.LA(1);

                if ( LA56_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 0) ) {
                    alt56=1;
                }
                else if ( LA56_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 1) ) {
                    alt56=2;
                }
                else if ( LA56_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 2) ) {
                    alt56=3;
                }
                else if ( LA56_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 3) ) {
                    alt56=4;
                }
                else if ( LA56_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 4) ) {
                    alt56=5;
                }
                else if ( LA56_0 >=50 && LA56_0<=52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 5) ) {
                    alt56=6;
                }
                else if ( LA56_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 6) ) {
                    alt56=7;
                }


                switch (alt56) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2724:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2724:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2725:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2725:106: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2726:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2729:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2729:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2729:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2729:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingleRef7307); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSingleRefAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2733:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2734:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2734:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2735:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleRefAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleRef7328);
            	    lv_title_3_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRefRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_3_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7340); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2762:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2762:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2763:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2763:106: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2764:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2767:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2767:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2767:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2767:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingleRef7408); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSingleRefAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2771:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_STRING)) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2772:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2772:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2773:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleRefAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleRef7429);
            	            lv_description_6_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSingleRefRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_6_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7442); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2800:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2800:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2801:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2801:106: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2802:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2805:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2805:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2805:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2805:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSingleRef7510); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSingleRefAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2809:1: ( (lv_name_9_0= RULE_ID ) )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==RULE_ID) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2810:1: (lv_name_9_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2810:1: (lv_name_9_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2811:3: lv_name_9_0= RULE_ID
            	            {
            	            lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingleRef7527); 

            	            			newLeafNode(lv_name_9_0, grammarAccess.getSingleRefAccess().getNameIDTerminalRuleCall_1_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getSingleRefRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_9_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7545); 

            	        	newLeafNode(otherlv_10, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2838:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2838:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2839:5: {...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2839:106: ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2840:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2843:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2843:7: {...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2843:16: (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2843:18: otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingleRef7613); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSingleRefAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2847:1: ( (lv_dependsOn_12_0= ruleDEP_ID ) )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==RULE_ID||LA53_0==RULE_FQN) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2848:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2848:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2849:3: lv_dependsOn_12_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleRefAccess().getDependsOnDEP_IDParserRuleCall_1_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleSingleRef7634);
            	            lv_dependsOn_12_0=ruleDEP_ID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSingleRefRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"dependsOn",
            	                    		lv_dependsOn_12_0, 
            	                    		"DEP_ID");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7647); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2876:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2876:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2877:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2877:106: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2878:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2881:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2881:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2881:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2882:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2882:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2883:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingleRef7720); 

            	            newLeafNode(lv_required_14_0, grammarAccess.getSingleRefAccess().getRequiredRequiredKeyword_1_4_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRefRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2903:4: ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2903:4: ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2904:5: {...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2904:106: ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2905:6: ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2908:6: ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2908:7: {...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2908:16: ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) )
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( ((LA55_0>=50 && LA55_0<=51)) ) {
            	        alt55=1;
            	    }
            	    else if ( (LA55_0==52) ) {
            	        alt55=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2908:17: ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2908:17: ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2909:1: ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2909:1: ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2910:1: (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2910:1: (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' )
            	            int alt54=2;
            	            int LA54_0 = input.LA(1);

            	            if ( (LA54_0==50) ) {
            	                alt54=1;
            	            }
            	            else if ( (LA54_0==51) ) {
            	                alt54=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 54, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt54) {
            	                case 1 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2911:3: lv_other_15_1= 'other'
            	                    {
            	                    lv_other_15_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSingleRef7808); 

            	                            newLeafNode(lv_other_15_1, grammarAccess.getSingleRefAccess().getOtherOtherKeyword_1_5_0_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getSingleRefRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "other", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2923:8: lv_other_15_2= 'other=\"\"'
            	                    {
            	                    lv_other_15_2=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSingleRef7837); 

            	                            newLeafNode(lv_other_15_2, grammarAccess.getSingleRefAccess().getOtherOtherKeyword_1_5_0_0_1());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getSingleRefRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "other", true, null);
            	                    	    

            	                    }
            	                    break;

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2939:6: (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2939:6: (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2939:8: otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"'
            	            {
            	            otherlv_16=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleSingleRef7872); 

            	                	newLeafNode(otherlv_16, grammarAccess.getSingleRefAccess().getOtherKeyword_1_5_1_0());
            	                
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2943:1: ( (lv_otherLabel_17_0= ruleEString ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2944:1: (lv_otherLabel_17_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2944:1: (lv_otherLabel_17_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2945:3: lv_otherLabel_17_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleRefAccess().getOtherLabelEStringParserRuleCall_1_5_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleRef7893);
            	            lv_otherLabel_17_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSingleRefRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"otherLabel",
            	                    		lv_otherLabel_17_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7905); 

            	                	newLeafNode(otherlv_18, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_5_1_2());
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2972:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2972:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2973:5: {...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2973:106: ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2974:6: ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2977:6: ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2977:7: {...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2977:16: ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2978:1: (lv_options_19_0= ruleAnswerTemplateRefAttr )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2978:1: (lv_options_19_0= ruleAnswerTemplateRefAttr )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2979:3: lv_options_19_0= ruleAnswerTemplateRefAttr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleRefAccess().getOptionsAnswerTemplateRefAttrParserRuleCall_1_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRefAttr_in_ruleSingleRef7982);
            	    lv_options_19_0=ruleAnswerTemplateRefAttr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_19_0, 
            	            		"AnswerTemplateRefAttr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSingleRefAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canLeave(grammarAccess.getSingleRefAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	

            }

            otherlv_20=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSingleRef8040); 

                	newLeafNode(otherlv_20, grammarAccess.getSingleRefAccess().getSolidusGreaterThanSignKeyword_2());
                

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
    // $ANTLR end "ruleSingleRef"


    // $ANTLR start "entryRuleMultiple"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3022:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3023:2: (iv_ruleMultiple= ruleMultiple EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3024:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_entryRuleMultiple8076);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiple8086); 

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
    // $ANTLR end "entryRuleMultiple"


    // $ANTLR start "ruleMultiple"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3031:1: ruleMultiple returns [EObject current=null] : (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef ) ;
    public final EObject ruleMultiple() throws RecognitionException {
        EObject current = null;

        EObject this_MultipleWithOptions_0 = null;

        EObject this_MultipleRef_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3034:28: ( (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3035:1: (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3035:1: (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef )
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3036:5: this_MultipleWithOptions_0= ruleMultipleWithOptions
                    {
                     
                            newCompositeNode(grammarAccess.getMultipleAccess().getMultipleWithOptionsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleWithOptions_in_ruleMultiple8133);
                    this_MultipleWithOptions_0=ruleMultipleWithOptions();

                    state._fsp--;

                     
                            current = this_MultipleWithOptions_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3046:5: this_MultipleRef_1= ruleMultipleRef
                    {
                     
                            newCompositeNode(grammarAccess.getMultipleAccess().getMultipleRefParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleRef_in_ruleMultiple8160);
                    this_MultipleRef_1=ruleMultipleRef();

                    state._fsp--;

                     
                            current = this_MultipleRef_1; 
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
    // $ANTLR end "ruleMultiple"


    // $ANTLR start "entryRuleMultipleWithOptions"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3062:1: entryRuleMultipleWithOptions returns [EObject current=null] : iv_ruleMultipleWithOptions= ruleMultipleWithOptions EOF ;
    public final EObject entryRuleMultipleWithOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleWithOptions = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3063:2: (iv_ruleMultipleWithOptions= ruleMultipleWithOptions EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3064:2: iv_ruleMultipleWithOptions= ruleMultipleWithOptions EOF
            {
             newCompositeNode(grammarAccess.getMultipleWithOptionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleWithOptions_in_entryRuleMultipleWithOptions8195);
            iv_ruleMultipleWithOptions=ruleMultipleWithOptions();

            state._fsp--;

             current =iv_ruleMultipleWithOptions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleWithOptions8205); 

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
    // $ANTLR end "entryRuleMultipleWithOptions"


    // $ANTLR start "ruleMultipleWithOptions"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3071:1: ruleMultipleWithOptions returns [EObject current=null] : (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '>' ( (lv_options_24_0= ruleOption ) )+ otherlv_25= '</multiple>' ) ;
    public final EObject ruleMultipleWithOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_min_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_max_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_required_20_0=null;
        Token lv_other_21_0=null;
        Token lv_showLimits_22_1=null;
        Token lv_showLimits_22_2=null;
        Token lv_showLimits_22_3=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_18_0 = null;

        EObject lv_options_24_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3074:28: ( (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '>' ( (lv_options_24_0= ruleOption ) )+ otherlv_25= '</multiple>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3075:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '>' ( (lv_options_24_0= ruleOption ) )+ otherlv_25= '</multiple>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3075:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '>' ( (lv_options_24_0= ruleOption ) )+ otherlv_25= '</multiple>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3075:3: otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '>' ( (lv_options_24_0= ruleOption ) )+ otherlv_25= '</multiple>'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMultipleWithOptions8242); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleWithOptionsAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3079:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3081:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3081:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3082:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3085:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3086:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3086:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=10;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3088:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3088:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3089:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3089:116: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3090:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3093:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3093:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3093:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3093:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleWithOptions8300); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultipleWithOptionsAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3097:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3098:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3098:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3099:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleWithOptions8321);
            	    lv_title_3_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleWithOptionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_3_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8333); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3126:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3126:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3127:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3127:116: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3128:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3131:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3131:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3131:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3131:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleWithOptions8401); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultipleWithOptionsAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3135:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_STRING)) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3136:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3136:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3137:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleWithOptions8422);
            	            lv_description_6_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultipleWithOptionsRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_6_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8435); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3164:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3164:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3165:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3165:116: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3166:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3169:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3169:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3169:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3169:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultipleWithOptions8503); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMultipleWithOptionsAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3173:1: ( (lv_name_9_0= RULE_ID ) )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==RULE_ID) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3174:1: (lv_name_9_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3174:1: (lv_name_9_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3175:3: lv_name_9_0= RULE_ID
            	            {
            	            lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleWithOptions8520); 

            	            			newLeafNode(lv_name_9_0, grammarAccess.getMultipleWithOptionsAccess().getNameIDTerminalRuleCall_1_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_9_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8538); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3202:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3202:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3203:5: {...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3203:116: ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3204:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3207:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3207:7: {...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3207:16: (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3207:18: otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMultipleWithOptions8606); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMultipleWithOptionsAccess().getMinKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3211:1: ( (lv_min_12_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3212:1: (lv_min_12_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3212:1: (lv_min_12_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3213:3: lv_min_12_0= RULE_INT
            	    {
            	    lv_min_12_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultipleWithOptions8623); 

            	    			newLeafNode(lv_min_12_0, grammarAccess.getMultipleWithOptionsAccess().getMinINTTerminalRuleCall_1_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"min",
            	            		lv_min_12_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8640); 

            	        	newLeafNode(otherlv_13, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3240:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3240:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3241:5: {...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3241:116: ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3242:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3245:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3245:7: {...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3245:16: (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3245:18: otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"'
            	    {
            	    otherlv_14=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultipleWithOptions8708); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMultipleWithOptionsAccess().getMaxKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3249:1: ( (lv_max_15_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3250:1: (lv_max_15_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3250:1: (lv_max_15_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3251:3: lv_max_15_0= RULE_INT
            	    {
            	    lv_max_15_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultipleWithOptions8725); 

            	    			newLeafNode(lv_max_15_0, grammarAccess.getMultipleWithOptionsAccess().getMaxINTTerminalRuleCall_1_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"max",
            	            		lv_max_15_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8742); 

            	        	newLeafNode(otherlv_16, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3278:4: ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3278:4: ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3279:5: {...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3279:116: ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3280:6: ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3283:6: ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3283:7: {...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3283:16: (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3283:18: otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"'
            	    {
            	    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultipleWithOptions8810); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMultipleWithOptionsAccess().getDependsOnKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3287:1: ( (lv_dependsOn_18_0= ruleDEP_ID ) )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==RULE_ID||LA60_0==RULE_FQN) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3288:1: (lv_dependsOn_18_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3288:1: (lv_dependsOn_18_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3289:3: lv_dependsOn_18_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getDependsOnDEP_IDParserRuleCall_1_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleMultipleWithOptions8831);
            	            lv_dependsOn_18_0=ruleDEP_ID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultipleWithOptionsRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"dependsOn",
            	                    		lv_dependsOn_18_0, 
            	                    		"DEP_ID");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8844); 

            	        	newLeafNode(otherlv_19, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3316:4: ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3316:4: ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3317:5: {...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3317:116: ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3318:6: ({...}? => ( (lv_required_20_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3321:6: ({...}? => ( (lv_required_20_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3321:7: {...}? => ( (lv_required_20_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3321:16: ( (lv_required_20_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3322:1: (lv_required_20_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3322:1: (lv_required_20_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3323:3: lv_required_20_0= 'required'
            	    {
            	    lv_required_20_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleWithOptions8917); 

            	            newLeafNode(lv_required_20_0, grammarAccess.getMultipleWithOptionsAccess().getRequiredRequiredKeyword_1_6_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3343:4: ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3343:4: ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3344:5: {...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3344:116: ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3345:6: ({...}? => ( (lv_other_21_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3348:6: ({...}? => ( (lv_other_21_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3348:7: {...}? => ( (lv_other_21_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3348:16: ( (lv_other_21_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3349:1: (lv_other_21_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3349:1: (lv_other_21_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3350:3: lv_other_21_0= 'other'
            	    {
            	    lv_other_21_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMultipleWithOptions9002); 

            	            newLeafNode(lv_other_21_0, grammarAccess.getMultipleWithOptionsAccess().getOtherOtherKeyword_1_7_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	    	        }
            	           		setWithLastConsumed(current, "other", true, "other");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3370:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3370:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3371:5: {...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3371:116: ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3372:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3375:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3375:7: {...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3375:16: ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3376:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3376:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3377:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3377:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    int alt61=3;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt61=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt61=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt61=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 61, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt61) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3378:3: lv_showLimits_22_1= 'show-limits'
            	            {
            	            lv_showLimits_22_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMultipleWithOptions9089); 

            	                    newLeafNode(lv_showLimits_22_1, grammarAccess.getMultipleWithOptionsAccess().getShowLimitsShowLimitsKeyword_1_8_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3390:8: lv_showLimits_22_2= 'show'
            	            {
            	            lv_showLimits_22_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMultipleWithOptions9118); 

            	                    newLeafNode(lv_showLimits_22_2, grammarAccess.getMultipleWithOptionsAccess().getShowLimitsShowKeyword_1_8_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3402:8: lv_showLimits_22_3= 'limits'
            	            {
            	            lv_showLimits_22_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMultipleWithOptions9147); 

            	                    newLeafNode(lv_showLimits_22_3, grammarAccess.getMultipleWithOptionsAccess().getShowLimitsLimitsKeyword_1_8_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	

            }

            otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultipleWithOptions9221); 

                	newLeafNode(otherlv_23, grammarAccess.getMultipleWithOptionsAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3436:1: ( (lv_options_24_0= ruleOption ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==19||LA63_0==22) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3437:1: (lv_options_24_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3437:1: (lv_options_24_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3438:3: lv_options_24_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultipleWithOptions9242);
            	    lv_options_24_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleWithOptionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_24_0, 
            	            		"Option");
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

            otherlv_25=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMultipleWithOptions9255); 

                	newLeafNode(otherlv_25, grammarAccess.getMultipleWithOptionsAccess().getMultipleKeyword_4());
                

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
    // $ANTLR end "ruleMultipleWithOptions"


    // $ANTLR start "entryRuleMultipleRef"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3466:1: entryRuleMultipleRef returns [EObject current=null] : iv_ruleMultipleRef= ruleMultipleRef EOF ;
    public final EObject entryRuleMultipleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3467:2: (iv_ruleMultipleRef= ruleMultipleRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3468:2: iv_ruleMultipleRef= ruleMultipleRef EOF
            {
             newCompositeNode(grammarAccess.getMultipleRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleRef_in_entryRuleMultipleRef9291);
            iv_ruleMultipleRef=ruleMultipleRef();

            state._fsp--;

             current =iv_ruleMultipleRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleRef9301); 

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
    // $ANTLR end "entryRuleMultipleRef"


    // $ANTLR start "ruleMultipleRef"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3475:1: ruleMultipleRef returns [EObject current=null] : (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>' ) ;
    public final EObject ruleMultipleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_min_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_max_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_required_20_0=null;
        Token lv_other_21_0=null;
        Token lv_showLimits_22_1=null;
        Token lv_showLimits_22_2=null;
        Token lv_showLimits_22_3=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_18_0 = null;

        EObject lv_options_23_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3478:28: ( (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3479:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3479:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3479:3: otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMultipleRef9338); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleRefAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3483:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3485:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3485:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3486:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3489:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3490:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3490:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=11;
                alt68 = dfa68.predict(input);
                switch (alt68) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3492:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3492:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3493:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3493:108: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3494:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3497:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3497:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3497:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3497:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleRef9396); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultipleRefAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3501:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3502:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3502:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3503:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleRefAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleRef9417);
            	    lv_title_3_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRefRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_3_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9429); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3530:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3530:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3531:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3531:108: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3532:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3535:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3535:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3535:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3535:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleRef9497); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultipleRefAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3539:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_STRING)) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3540:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3540:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3541:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleRefAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleRef9518);
            	            lv_description_6_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultipleRefRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_6_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9531); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3568:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3568:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3569:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3569:108: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3570:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3573:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3573:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3573:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3573:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultipleRef9599); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMultipleRefAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3577:1: ( (lv_name_9_0= RULE_ID ) )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==RULE_ID) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3578:1: (lv_name_9_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3578:1: (lv_name_9_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3579:3: lv_name_9_0= RULE_ID
            	            {
            	            lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleRef9616); 

            	            			newLeafNode(lv_name_9_0, grammarAccess.getMultipleRefAccess().getNameIDTerminalRuleCall_1_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_9_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9634); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3606:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3606:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3607:5: {...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3607:108: ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3608:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3611:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3611:7: {...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3611:16: (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3611:18: otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMultipleRef9702); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMultipleRefAccess().getMinKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3615:1: ( (lv_min_12_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3616:1: (lv_min_12_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3616:1: (lv_min_12_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3617:3: lv_min_12_0= RULE_INT
            	    {
            	    lv_min_12_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultipleRef9719); 

            	    			newLeafNode(lv_min_12_0, grammarAccess.getMultipleRefAccess().getMinINTTerminalRuleCall_1_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"min",
            	            		lv_min_12_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9736); 

            	        	newLeafNode(otherlv_13, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3644:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3644:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3645:5: {...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3645:108: ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3646:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3649:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3649:7: {...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3649:16: (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3649:18: otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"'
            	    {
            	    otherlv_14=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultipleRef9804); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMultipleRefAccess().getMaxKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3653:1: ( (lv_max_15_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3654:1: (lv_max_15_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3654:1: (lv_max_15_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3655:3: lv_max_15_0= RULE_INT
            	    {
            	    lv_max_15_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultipleRef9821); 

            	    			newLeafNode(lv_max_15_0, grammarAccess.getMultipleRefAccess().getMaxINTTerminalRuleCall_1_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"max",
            	            		lv_max_15_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9838); 

            	        	newLeafNode(otherlv_16, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3682:4: ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3682:4: ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3683:5: {...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3683:108: ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3684:6: ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3687:6: ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3687:7: {...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3687:16: (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3687:18: otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"'
            	    {
            	    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultipleRef9906); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMultipleRefAccess().getDependsOnKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3691:1: ( (lv_dependsOn_18_0= ruleDEP_ID ) )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==RULE_ID||LA66_0==RULE_FQN) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3692:1: (lv_dependsOn_18_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3692:1: (lv_dependsOn_18_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3693:3: lv_dependsOn_18_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleRefAccess().getDependsOnDEP_IDParserRuleCall_1_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleMultipleRef9927);
            	            lv_dependsOn_18_0=ruleDEP_ID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultipleRefRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"dependsOn",
            	                    		lv_dependsOn_18_0, 
            	                    		"DEP_ID");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9940); 

            	        	newLeafNode(otherlv_19, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3720:4: ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3720:4: ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3721:5: {...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3721:108: ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3722:6: ({...}? => ( (lv_required_20_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3725:6: ({...}? => ( (lv_required_20_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3725:7: {...}? => ( (lv_required_20_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3725:16: ( (lv_required_20_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3726:1: (lv_required_20_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3726:1: (lv_required_20_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3727:3: lv_required_20_0= 'required'
            	    {
            	    lv_required_20_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleRef10013); 

            	            newLeafNode(lv_required_20_0, grammarAccess.getMultipleRefAccess().getRequiredRequiredKeyword_1_6_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3747:4: ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3747:4: ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3748:5: {...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3748:108: ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3749:6: ({...}? => ( (lv_other_21_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3752:6: ({...}? => ( (lv_other_21_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3752:7: {...}? => ( (lv_other_21_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3752:16: ( (lv_other_21_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3753:1: (lv_other_21_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3753:1: (lv_other_21_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3754:3: lv_other_21_0= 'other'
            	    {
            	    lv_other_21_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMultipleRef10098); 

            	            newLeafNode(lv_other_21_0, grammarAccess.getMultipleRefAccess().getOtherOtherKeyword_1_7_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	    	        }
            	           		setWithLastConsumed(current, "other", true, "other");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3774:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3774:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3775:5: {...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3775:108: ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3776:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3779:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3779:7: {...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3779:16: ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3780:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3780:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3781:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3781:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    int alt67=3;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt67=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt67=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt67=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 67, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt67) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3782:3: lv_showLimits_22_1= 'show-limits'
            	            {
            	            lv_showLimits_22_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMultipleRef10185); 

            	                    newLeafNode(lv_showLimits_22_1, grammarAccess.getMultipleRefAccess().getShowLimitsShowLimitsKeyword_1_8_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3794:8: lv_showLimits_22_2= 'show'
            	            {
            	            lv_showLimits_22_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMultipleRef10214); 

            	                    newLeafNode(lv_showLimits_22_2, grammarAccess.getMultipleRefAccess().getShowLimitsShowKeyword_1_8_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3806:8: lv_showLimits_22_3= 'limits'
            	            {
            	            lv_showLimits_22_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMultipleRef10243); 

            	                    newLeafNode(lv_showLimits_22_3, grammarAccess.getMultipleRefAccess().getShowLimitsLimitsKeyword_1_8_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3828:4: ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3828:4: ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3829:5: {...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 9)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3829:108: ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3830:6: ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 9);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3833:6: ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3833:7: {...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3833:16: ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3834:1: (lv_options_23_0= ruleAnswerTemplateRefAttr )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3834:1: (lv_options_23_0= ruleAnswerTemplateRefAttr )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3835:3: lv_options_23_0= ruleAnswerTemplateRefAttr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleRefAccess().getOptionsAnswerTemplateRefAttrParserRuleCall_1_9_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRefAttr_in_ruleMultipleRef10334);
            	    lv_options_23_0=ruleAnswerTemplateRefAttr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_23_0, 
            	            		"AnswerTemplateRefAttr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	

            }

            otherlv_24=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMultipleRef10392); 

                	newLeafNode(otherlv_24, grammarAccess.getMultipleRefAccess().getSolidusGreaterThanSignKeyword_2());
                

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
    // $ANTLR end "ruleMultipleRef"


    // $ANTLR start "entryRuleTable"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3878:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3879:2: (iv_ruleTable= ruleTable EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3880:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable10428);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable10438); 

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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3887:1: ruleTable returns [EObject current=null] : (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_19_0= ruleOption ) ) | ( (lv_questions_20_0= ruleTableQuestion ) ) )* otherlv_21= '</table>' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_required_11_0=null;
        Token lv_other_12_0=null;
        Token otherlv_13=null;
        Token lv_multiple_14_0=null;
        Token otherlv_15=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_9_0 = null;

        EObject lv_options_17_0 = null;

        EObject lv_questions_18_0 = null;

        EObject lv_options_19_0 = null;

        EObject lv_questions_20_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3890:28: ( (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_19_0= ruleOption ) ) | ( (lv_questions_20_0= ruleTableQuestion ) ) )* otherlv_21= '</table>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3891:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_19_0= ruleOption ) ) | ( (lv_questions_20_0= ruleTableQuestion ) ) )* otherlv_21= '</table>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3891:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_19_0= ruleOption ) ) | ( (lv_questions_20_0= ruleTableQuestion ) ) )* otherlv_21= '</table>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3891:3: otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_19_0= ruleOption ) ) | ( (lv_questions_20_0= ruleTableQuestion ) ) )* otherlv_21= '</table>'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTable10475); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3895:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3897:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3897:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3898:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3901:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3902:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3902:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )*
            loop73:
            do {
                int alt73=7;
                int LA73_0 = input.LA(1);

                if ( LA73_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
                    alt73=1;
                }
                else if ( LA73_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
                    alt73=2;
                }
                else if ( LA73_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
                    alt73=3;
                }
                else if ( LA73_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
                    alt73=4;
                }
                else if ( LA73_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
                    alt73=5;
                }
                else if ( (LA73_0==30||LA73_0==57) && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
                    alt73=6;
                }


                switch (alt73) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3904:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3904:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3905:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3905:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3906:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3909:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3909:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3909:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3909:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable10533); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3913:1: ( (lv_title_3_0= ruleEString ) )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_STRING)) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3914:1: (lv_title_3_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3914:1: (lv_title_3_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3915:3: lv_title_3_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable10554);
            	            lv_title_3_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTableRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"title",
            	                    		lv_title_3_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable10567); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3942:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3942:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3943:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3943:102: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3944:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3947:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3947:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3947:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3947:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable10635); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3951:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_STRING)) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3952:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3952:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3953:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTableAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable10656);
            	            lv_description_6_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTableRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_6_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable10669); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3980:4: ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3980:4: ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3981:5: {...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3981:102: ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3982:6: ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3985:6: ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3985:7: {...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3985:16: (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3985:18: otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTable10737); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTableAccess().getDependsOnKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3989:1: ( (lv_dependsOn_9_0= ruleDEP_ID ) )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==RULE_ID||LA71_0==RULE_FQN) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3990:1: (lv_dependsOn_9_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3990:1: (lv_dependsOn_9_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3991:3: lv_dependsOn_9_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTableAccess().getDependsOnDEP_IDParserRuleCall_1_2_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleTable10758);
            	            lv_dependsOn_9_0=ruleDEP_ID();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTableRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"dependsOn",
            	                    		lv_dependsOn_9_0, 
            	                    		"DEP_ID");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable10771); 

            	        	newLeafNode(otherlv_10, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4018:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4018:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4019:5: {...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4019:102: ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4020:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4023:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4023:7: {...}? => ( (lv_required_11_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4023:16: ( (lv_required_11_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4024:1: (lv_required_11_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4024:1: (lv_required_11_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4025:3: lv_required_11_0= 'required'
            	    {
            	    lv_required_11_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTable10844); 

            	            newLeafNode(lv_required_11_0, grammarAccess.getTableAccess().getRequiredRequiredKeyword_1_3_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4045:4: ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4045:4: ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4046:5: {...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4046:102: ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4047:6: ({...}? => ( (lv_other_12_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4050:6: ({...}? => ( (lv_other_12_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4050:7: {...}? => ( (lv_other_12_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4050:16: ( (lv_other_12_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4051:1: (lv_other_12_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4051:1: (lv_other_12_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4052:3: lv_other_12_0= 'other'
            	    {
            	    lv_other_12_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTable10929); 

            	            newLeafNode(lv_other_12_0, grammarAccess.getTableAccess().getOtherOtherKeyword_1_4_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	           		setWithLastConsumed(current, "other", true, "other");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4072:4: ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4072:4: ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4073:5: {...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4073:102: ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4074:6: ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4077:6: ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4077:7: {...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4077:16: (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) )
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==30) ) {
            	        alt72=1;
            	    }
            	    else if ( (LA72_0==57) ) {
            	        alt72=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 72, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4077:18: otherlv_13= 'single'
            	            {
            	            otherlv_13=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTable11009); 

            	                	newLeafNode(otherlv_13, grammarAccess.getTableAccess().getSingleKeyword_1_5_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4082:6: ( (lv_multiple_14_0= 'multiple' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4082:6: ( (lv_multiple_14_0= 'multiple' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4083:1: (lv_multiple_14_0= 'multiple' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4083:1: (lv_multiple_14_0= 'multiple' )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4084:3: lv_multiple_14_0= 'multiple'
            	            {
            	            lv_multiple_14_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTable11033); 

            	                    newLeafNode(lv_multiple_14_0, grammarAccess.getTableAccess().getMultipleMultipleKeyword_1_5_1_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTableRule());
            	            	        }
            	                   		setWithLastConsumed(current, "multiple", true, "multiple");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	

            }

            otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTable11099); 

                	newLeafNode(otherlv_15, grammarAccess.getTableAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4115:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4117:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4117:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4118:2: ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4121:2: ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4122:3: ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4122:3: ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+
            int cnt76=0;
            loop76:
            do {
                int alt76=3;
                alt76 = dfa76.predict(input);
                switch (alt76) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4124:4: ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4124:4: ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4125:5: {...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4125:102: ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4126:6: ({...}? => ( (lv_options_17_0= ruleOption ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4129:6: ({...}? => ( (lv_options_17_0= ruleOption ) ) )+
            	    int cnt74=0;
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==19) ) {
            	            int LA74_1 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt74=1;
            	            }


            	        }
            	        else if ( (LA74_0==22) ) {
            	            int LA74_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt74=1;
            	            }


            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4129:7: {...}? => ( (lv_options_17_0= ruleOption ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4129:16: ( (lv_options_17_0= ruleOption ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4130:1: (lv_options_17_0= ruleOption )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4130:1: (lv_options_17_0= ruleOption )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4131:3: lv_options_17_0= ruleOption
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_3_0_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable11165);
            	    	    lv_options_17_0=ruleOption();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"options",
            	    	            		lv_options_17_0, 
            	    	            		"Option");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4154:4: ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4154:4: ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4155:5: {...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4155:102: ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4156:6: ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4159:6: ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+
            	    int cnt75=0;
            	    loop75:
            	    do {
            	        int alt75=2;
            	        int LA75_0 = input.LA(1);

            	        if ( (LA75_0==62) ) {
            	            int LA75_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt75=1;
            	            }


            	        }


            	        switch (alt75) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4159:7: {...}? => ( (lv_questions_18_0= ruleTableQuestion ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4159:16: ( (lv_questions_18_0= ruleTableQuestion ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4160:1: (lv_questions_18_0= ruleTableQuestion )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4160:1: (lv_questions_18_0= ruleTableQuestion )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4161:3: lv_questions_18_0= ruleTableQuestion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable11241);
            	    	    lv_questions_18_0=ruleTableQuestion();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"questions",
            	    	            		lv_questions_18_0, 
            	    	            		"TableQuestion");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt75 >= 1 ) break loop75;
            	                EarlyExitException eee =
            	                    new EarlyExitException(75, input);
            	                throw eee;
            	        }
            	        cnt75++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4192:2: ( ( (lv_options_19_0= ruleOption ) ) | ( (lv_questions_20_0= ruleTableQuestion ) ) )*
            loop77:
            do {
                int alt77=3;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==19||LA77_0==22) ) {
                    alt77=1;
                }
                else if ( (LA77_0==62) ) {
                    alt77=2;
                }


                switch (alt77) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4192:3: ( (lv_options_19_0= ruleOption ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4192:3: ( (lv_options_19_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4193:1: (lv_options_19_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4193:1: (lv_options_19_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4194:3: lv_options_19_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable11310);
            	    lv_options_19_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_19_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4211:6: ( (lv_questions_20_0= ruleTableQuestion ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4211:6: ( (lv_questions_20_0= ruleTableQuestion ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4212:1: (lv_questions_20_0= ruleTableQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4212:1: (lv_questions_20_0= ruleTableQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4213:3: lv_questions_20_0= ruleTableQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable11337);
            	    lv_questions_20_0=ruleTableQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_20_0, 
            	            		"TableQuestion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_21=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTable11351); 

                	newLeafNode(otherlv_21, grammarAccess.getTableAccess().getTableKeyword_5());
                

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4241:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4242:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4243:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt11388);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt11399); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4250:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4253:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4254:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4254:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4254:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4254:2: (kw= '-' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==59) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4255:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEInt11438); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt11455); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleAnswerTemplateRef"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4275:1: entryRuleAnswerTemplateRef returns [EObject current=null] : iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF ;
    public final EObject entryRuleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplateRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4276:2: (iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4277:2: iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef11500);
            iv_ruleAnswerTemplateRef=ruleAnswerTemplateRef();

            state._fsp--;

             current =iv_ruleAnswerTemplateRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplateRef11510); 

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
    // $ANTLR end "entryRuleAnswerTemplateRef"


    // $ANTLR start "ruleAnswerTemplateRef"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4284:1: ruleAnswerTemplateRef returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' ) ;
    public final EObject ruleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4287:28: ( (otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4288:1: (otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4288:1: (otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4288:3: otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswerTemplateRef11547); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateRefAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleAnswerTemplateRef11559); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateRefAccess().getRefKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4296:1: ( (otherlv_2= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4297:1: (otherlv_2= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4297:1: (otherlv_2= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4298:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRefRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplateRef11579); 

            		newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateRefAccess().getTemplateAnswerTemplateCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswerTemplateRef11591); 

                	newLeafNode(otherlv_3, grammarAccess.getAnswerTemplateRefAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAnswerTemplateRef11603); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerTemplateRefAccess().getSolidusGreaterThanSignKeyword_4());
                

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
    // $ANTLR end "ruleAnswerTemplateRef"


    // $ANTLR start "entryRuleAnswerTemplateRefAttr"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4325:1: entryRuleAnswerTemplateRefAttr returns [EObject current=null] : iv_ruleAnswerTemplateRefAttr= ruleAnswerTemplateRefAttr EOF ;
    public final EObject entryRuleAnswerTemplateRefAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplateRefAttr = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4326:2: (iv_ruleAnswerTemplateRefAttr= ruleAnswerTemplateRefAttr EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4327:2: iv_ruleAnswerTemplateRefAttr= ruleAnswerTemplateRefAttr EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRefAttrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRefAttr_in_entryRuleAnswerTemplateRefAttr11639);
            iv_ruleAnswerTemplateRefAttr=ruleAnswerTemplateRefAttr();

            state._fsp--;

             current =iv_ruleAnswerTemplateRefAttr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplateRefAttr11649); 

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
    // $ANTLR end "entryRuleAnswerTemplateRefAttr"


    // $ANTLR start "ruleAnswerTemplateRefAttr"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4334:1: ruleAnswerTemplateRefAttr returns [EObject current=null] : (otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' ) ;
    public final EObject ruleAnswerTemplateRefAttr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4337:28: ( (otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4338:1: (otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4338:1: (otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4338:3: otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"'
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleAnswerTemplateRefAttr11686); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateRefAttrAccess().getTemplateKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4342:1: ( (otherlv_1= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4343:1: (otherlv_1= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4343:1: (otherlv_1= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4344:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRefAttrRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplateRefAttr11706); 

            		newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateRefAttrAccess().getTemplateAnswerTemplateCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswerTemplateRefAttr11718); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateRefAttrAccess().getQuotationMarkKeyword_2());
                

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
    // $ANTLR end "ruleAnswerTemplateRefAttr"


    // $ANTLR start "entryRuleTableQuestion"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4367:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4368:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4369:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion11754);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion11764); 

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
    // $ANTLR end "entryRuleTableQuestion"


    // $ANTLR start "ruleTableQuestion"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4376:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= '<q' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</q>' ) ;
    public final EObject ruleTableQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4379:28: ( (otherlv_0= '<q' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</q>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4380:1: (otherlv_0= '<q' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</q>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4380:1: (otherlv_0= '<q' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</q>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4380:3: otherlv_0= '<q' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</q>'
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleTableQuestion11801); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4384:1: (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==20) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4384:3: otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"'
                    {
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTableQuestion11814); 

                        	newLeafNode(otherlv_1, grammarAccess.getTableQuestionAccess().getIdKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4388:1: ( (lv_name_2_0= RULE_ID ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==RULE_ID) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4389:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4389:1: (lv_name_2_0= RULE_ID )
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4390:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTableQuestion11831); 

                            			newLeafNode(lv_name_2_0, grammarAccess.getTableQuestionAccess().getNameIDTerminalRuleCall_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTableQuestionRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_2_0, 
                                    		"ID");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTableQuestion11849); 

                        	newLeafNode(otherlv_3, grammarAccess.getTableQuestionAccess().getQuotationMarkKeyword_1_2());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTableQuestion11863); 

                	newLeafNode(otherlv_4, grammarAccess.getTableQuestionAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4414:1: ( (lv_title_5_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4415:1: (lv_title_5_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4415:1: (lv_title_5_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4416:3: lv_title_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getTitleEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTableQuestion11884);
            lv_title_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleTableQuestion11896); 

                	newLeafNode(otherlv_6, grammarAccess.getTableQuestionAccess().getQKeyword_4());
                

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
    // $ANTLR end "ruleTableQuestion"


    // $ANTLR start "entryRuleDEP_ID"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4444:1: entryRuleDEP_ID returns [String current=null] : iv_ruleDEP_ID= ruleDEP_ID EOF ;
    public final String entryRuleDEP_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDEP_ID = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4445:2: (iv_ruleDEP_ID= ruleDEP_ID EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4446:2: iv_ruleDEP_ID= ruleDEP_ID EOF
            {
             newCompositeNode(grammarAccess.getDEP_IDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_entryRuleDEP_ID11933);
            iv_ruleDEP_ID=ruleDEP_ID();

            state._fsp--;

             current =iv_ruleDEP_ID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDEP_ID11944); 

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
    // $ANTLR end "entryRuleDEP_ID"


    // $ANTLR start "ruleDEP_ID"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4453:1: ruleDEP_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN ) ;
    public final AntlrDatatypeRuleToken ruleDEP_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_FQN_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4456:28: ( (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4457:1: (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4457:1: (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_FQN) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4457:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDEP_ID11984); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getDEP_IDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4465:10: this_FQN_1= RULE_FQN
                    {
                    this_FQN_1=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleDEP_ID12010); 

                    		current.merge(this_FQN_1);
                        
                     
                        newLeafNode(this_FQN_1, grammarAccess.getDEP_IDAccess().getFQNTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleDEP_ID"

    // Delegated rules


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA76 dfa76 = new DFA76(this);
    static final String DFA30_eotS =
        "\13\uffff";
    static final String DFA30_eofS =
        "\13\uffff";
    static final String DFA30_minS =
        "\1\15\12\uffff";
    static final String DFA30_maxS =
        "\1\46\12\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA30_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\2\1\uffff\1\3\4\uffff\1\4\4\uffff\1\11\1\12\6\uffff\1\1\1"+
            "\uffff\1\5\1\6\1\7\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1186:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0==33) ) {s = 1;}

                        else if ( LA30_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA30_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA30_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA30_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA30_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA30_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA30_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA30_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA30_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\15\uffff";
    static final String DFA37_eofS =
        "\15\uffff";
    static final String DFA37_minS =
        "\1\15\14\uffff";
    static final String DFA37_maxS =
        "\1\57\14\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA37_specialS =
        "\1\0\14\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\2\1\uffff\1\3\4\uffff\1\4\4\uffff\1\7\1\11\6\uffff\1\1\6"+
            "\uffff\1\5\1\6\3\10\1\12\1\13\1\14",
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
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1569:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_0 = input.LA(1);

                         
                        int index37_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_0==33) ) {s = 1;}

                        else if ( LA37_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA37_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA37_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA37_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA37_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA37_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA37_0 >=42 && LA37_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA37_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA37_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA37_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA37_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                         
                        input.seek(index37_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\12\uffff";
    static final String DFA42_eofS =
        "\12\uffff";
    static final String DFA42_minS =
        "\1\15\11\uffff";
    static final String DFA42_maxS =
        "\1\54\11\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA42_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\2\1\uffff\1\3\4\uffff\1\4\4\uffff\1\7\1\10\6\uffff\1\1\1"+
            "\uffff\1\5\1\6\5\uffff\3\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2011:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_0 = input.LA(1);

                         
                        int index42_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA42_0==33) ) {s = 1;}

                        else if ( LA42_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA42_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA42_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA42_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA42_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA42_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA42_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA42_0 >=42 && LA42_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
                        input.seek(index42_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\32\uffff";
    static final String DFA43_eofS =
        "\32\uffff";
    static final String DFA43_minS =
        "\1\61\1\15\4\4\3\15\1\4\1\uffff\4\16\1\15\1\16\1\15\2\16\1\15\1"+
        "\uffff\2\16\2\15";
    static final String DFA43_maxS =
        "\1\61\1\75\1\5\3\16\3\75\1\5\1\uffff\4\16\1\75\1\16\1\75\2\16\1"+
        "\75\1\uffff\2\16\2\75";
    static final String DFA43_acceptS =
        "\12\uffff\1\2\12\uffff\1\1\4\uffff";
    static final String DFA43_specialS =
        "\32\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1",
            "\1\2\1\uffff\1\3\4\uffff\1\4\4\uffff\1\5\1\6\27\uffff\1\7\1"+
            "\10\1\11\10\uffff\1\12",
            "\1\14\1\13",
            "\1\16\1\15\10\uffff\1\17",
            "\1\20\11\uffff\1\21",
            "\1\22\2\uffff\1\23\6\uffff\1\24",
            "\1\2\1\uffff\1\3\1\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "\1\2\1\uffff\1\3\1\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "\1\2\1\uffff\1\3\1\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "\1\27\1\26",
            "",
            "\1\30",
            "\1\30",
            "\1\17",
            "\1\17",
            "\1\2\1\uffff\1\3\1\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "\1\21",
            "\1\2\1\uffff\1\3\1\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "\1\24",
            "\1\24",
            "\1\2\1\uffff\1\3\1\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "",
            "\1\31",
            "\1\31",
            "\1\2\1\uffff\1\3\1\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "\1\2\1\uffff\1\3\1\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12"
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "2355:1: (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef )";
        }
    }
    static final String DFA57_eotS =
        "\36\uffff";
    static final String DFA57_eofS =
        "\36\uffff";
    static final String DFA57_minS =
        "\1\66\1\15\3\4\2\6\1\4\5\15\1\uffff\4\16\1\15\1\16\1\15\4\16\1\15"+
        "\1\uffff\3\15";
    static final String DFA57_maxS =
        "\1\66\1\75\1\5\2\16\2\6\1\16\5\75\1\uffff\4\16\1\75\1\16\1\75\4"+
        "\16\1\75\1\uffff\3\75";
    static final String DFA57_acceptS =
        "\15\uffff\1\2\14\uffff\1\1\3\uffff";
    static final String DFA57_specialS =
        "\36\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1",
            "\1\2\1\uffff\1\3\4\uffff\1\4\4\uffff\1\7\1\10\10\uffff\1\5"+
            "\1\6\5\uffff\1\12\1\13\1\14\5\uffff\1\11\12\uffff\1\15",
            "\1\17\1\16",
            "\1\21\1\20\10\uffff\1\22",
            "\1\23\11\uffff\1\24",
            "\1\25",
            "\1\26",
            "\1\27\2\uffff\1\30\6\uffff\1\31",
            "\1\2\1\uffff\1\3\1\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\2\1\uffff\1\3\1\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\2\1\uffff\1\3\1\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\2\1\uffff\1\3\1\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\2\1\uffff\1\3\1\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "",
            "\1\33",
            "\1\33",
            "\1\22",
            "\1\22",
            "\1\2\1\uffff\1\3\1\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\24",
            "\1\2\1\uffff\1\3\1\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\34",
            "\1\35",
            "\1\31",
            "\1\31",
            "\1\2\1\uffff\1\3\1\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "",
            "\1\2\1\uffff\1\3\1\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\2\1\uffff\1\3\1\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\2\1\uffff\1\3\1\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15"
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3035:1: (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef )";
        }
    }
    static final String DFA62_eotS =
        "\13\uffff";
    static final String DFA62_eofS =
        "\13\uffff";
    static final String DFA62_minS =
        "\1\15\12\uffff";
    static final String DFA62_maxS =
        "\1\62\12\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA62_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\2\1\uffff\1\3\1\uffff\1\1\2\uffff\1\4\4\uffff\1\7\1\10\10"+
            "\uffff\1\5\1\6\5\uffff\3\12\5\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "()+ loopback of 3086:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_0 = input.LA(1);

                         
                        int index62_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA62_0==17) ) {s = 1;}

                        else if ( LA62_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA62_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA62_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA62_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA62_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA62_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA62_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA62_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA62_0 >=42 && LA62_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
                        input.seek(index62_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\14\uffff";
    static final String DFA68_eofS =
        "\14\uffff";
    static final String DFA68_minS =
        "\1\15\13\uffff";
    static final String DFA68_maxS =
        "\1\75\13\uffff";
    static final String DFA68_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA68_specialS =
        "\1\0\13\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\2\1\uffff\1\3\4\uffff\1\4\4\uffff\1\7\1\10\6\uffff\1\1\1"+
            "\uffff\1\5\1\6\5\uffff\3\12\5\uffff\1\11\12\uffff\1\13",
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
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "()+ loopback of 3490:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_0 = input.LA(1);

                         
                        int index68_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA68_0==33) ) {s = 1;}

                        else if ( LA68_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA68_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA68_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA68_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA68_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA68_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA68_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA68_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA68_0 >=42 && LA68_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                        else if ( LA68_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 9) ) {s = 11;}

                         
                        input.seek(index68_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\31\uffff";
    static final String DFA76_eofS =
        "\31\uffff";
    static final String DFA76_minS =
        "\1\23\1\74\2\21\1\uffff\5\4\2\16\1\21\2\27\1\16\1\21\2\77\1\41\3"+
        "\0\2\uffff";
    static final String DFA76_maxS =
        "\1\76\1\74\2\24\1\uffff\1\4\1\16\1\5\1\16\1\5\2\16\1\21\2\27\1\16"+
        "\1\21\2\77\1\41\3\0\2\uffff";
    static final String DFA76_acceptS =
        "\4\uffff\1\3\22\uffff\1\1\1\2";
    static final String DFA76_specialS =
        "\24\uffff\1\1\1\2\1\0\2\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\1\2\uffff\1\2\43\uffff\1\4\3\uffff\1\3",
            "\1\5",
            "\1\7\2\uffff\1\6",
            "\1\11\2\uffff\1\10",
            "",
            "\1\12",
            "\1\13\11\uffff\1\14",
            "\1\16\1\15",
            "\1\17\11\uffff\1\20",
            "\1\22\1\21",
            "\1\23",
            "\1\14",
            "\1\7",
            "\1\24",
            "\1\24",
            "\1\20",
            "\1\11",
            "\1\25",
            "\1\25",
            "\1\26",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "()+ loopback of 4122:3: ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_22 = input.LA(1);

                         
                        int index76_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index76_22);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_20 = input.LA(1);

                         
                        int index76_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index76_20);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_21 = input.LA(1);

                         
                        int index76_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {s = 24;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index76_21);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleSurvey132 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey190 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey211 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey224 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_15_in_ruleSurvey292 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey313 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey326 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_16_in_ruleSurvey394 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSurvey411 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey429 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_17_in_ruleSurvey482 = new BitSet(new long[]{0x01430084110C0000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey504 = new BitSet(new long[]{0x01430084110C0000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey531 = new BitSet(new long[]{0x01430084110C0000L});
        public static final BitSet FOLLOW_18_in_ruleSurvey545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString584 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_entryRuleItem706 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItem716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleItem763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleItem790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion825 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleQuestion882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleQuestion909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleQuestion936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleQuestion963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleQuestion990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleQuestion1017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleQuestion1044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1079 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_ruleOption1136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleOption1163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplate1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAnswerTemplate1245 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAnswerTemplate1257 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplate1274 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswerTemplate1291 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAnswerTemplate1303 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleAnswerTemplate1324 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleAnswerTemplate1337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAnswer1420 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleAnswer1433 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswer1450 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswer1468 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAnswer1482 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1503 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAnswer1515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1551 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup1561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleGroup1598 = new BitSet(new long[]{0x000000000612A000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1656 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1677 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1690 = new BitSet(new long[]{0x000000000612A000L});
        public static final BitSet FOLLOW_20_in_ruleGroup1758 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1779 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1792 = new BitSet(new long[]{0x000000000612A000L});
        public static final BitSet FOLLOW_15_in_ruleGroup1860 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1881 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1894 = new BitSet(new long[]{0x000000000612A000L});
        public static final BitSet FOLLOW_25_in_ruleGroup1962 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleGroup1983 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1996 = new BitSet(new long[]{0x000000000612A000L});
        public static final BitSet FOLLOW_26_in_ruleGroup2069 = new BitSet(new long[]{0x000000000612A000L});
        public static final BitSet FOLLOW_17_in_ruleGroup2134 = new BitSet(new long[]{0x0143008411000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup2155 = new BitSet(new long[]{0x0143008419000000L});
        public static final BitSet FOLLOW_27_in_ruleGroup2168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText2204 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText2214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleText2260 = new BitSet(new long[]{0x00000001E610A000L});
        public static final BitSet FOLLOW_13_in_ruleText2318 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2339 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2351 = new BitSet(new long[]{0x00000003E610A000L});
        public static final BitSet FOLLOW_15_in_ruleText2419 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2440 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2453 = new BitSet(new long[]{0x00000003E610A000L});
        public static final BitSet FOLLOW_20_in_ruleText2521 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleText2538 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2556 = new BitSet(new long[]{0x00000003E610A000L});
        public static final BitSet FOLLOW_25_in_ruleText2624 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleText2645 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2658 = new BitSet(new long[]{0x00000003E610A000L});
        public static final BitSet FOLLOW_26_in_ruleText2731 = new BitSet(new long[]{0x00000003E610A000L});
        public static final BitSet FOLLOW_29_in_ruleText2811 = new BitSet(new long[]{0x00000003E610A000L});
        public static final BitSet FOLLOW_30_in_ruleText2829 = new BitSet(new long[]{0x00000003E610A000L});
        public static final BitSet FOLLOW_31_in_ruleText2855 = new BitSet(new long[]{0x00000003E610A000L});
        public static final BitSet FOLLOW_32_in_ruleText2884 = new BitSet(new long[]{0x00000003E610A000L});
        public static final BitSet FOLLOW_33_in_ruleText2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_entryRuleScale2995 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScale3005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleScale3042 = new BitSet(new long[]{0x000000780610A000L});
        public static final BitSet FOLLOW_13_in_ruleScale3100 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3121 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3133 = new BitSet(new long[]{0x0000007A0610A000L});
        public static final BitSet FOLLOW_15_in_ruleScale3201 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3222 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3235 = new BitSet(new long[]{0x0000007A0610A000L});
        public static final BitSet FOLLOW_20_in_ruleScale3303 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleScale3320 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3337 = new BitSet(new long[]{0x0000007A0610A000L});
        public static final BitSet FOLLOW_35_in_ruleScale3405 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3426 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3438 = new BitSet(new long[]{0x0000007A0610A000L});
        public static final BitSet FOLLOW_36_in_ruleScale3506 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3527 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3539 = new BitSet(new long[]{0x0000007A0610A000L});
        public static final BitSet FOLLOW_37_in_ruleScale3607 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3628 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3641 = new BitSet(new long[]{0x0000007A0610A000L});
        public static final BitSet FOLLOW_38_in_ruleScale3709 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3730 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3743 = new BitSet(new long[]{0x0000007A0610A000L});
        public static final BitSet FOLLOW_25_in_ruleScale3811 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleScale3832 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3845 = new BitSet(new long[]{0x0000007A0610A000L});
        public static final BitSet FOLLOW_26_in_ruleScale3918 = new BitSet(new long[]{0x0000007A0610A000L});
        public static final BitSet FOLLOW_33_in_ruleScale3989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate4025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate4035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleDate4081 = new BitSet(new long[]{0x0000FF000610A000L});
        public static final BitSet FOLLOW_13_in_ruleDate4139 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4160 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4172 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_15_in_ruleDate4240 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4261 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4274 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_20_in_ruleDate4342 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDate4359 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4377 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_40_in_ruleDate4445 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4466 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4479 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_41_in_ruleDate4547 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4568 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4581 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_25_in_ruleDate4649 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleDate4670 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4683 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_42_in_ruleDate4758 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_43_in_ruleDate4787 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_44_in_ruleDate4816 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_26_in_ruleDate4904 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_45_in_ruleDate4989 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_46_in_ruleDate5074 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_47_in_ruleDate5159 = new BitSet(new long[]{0x0000FF020610A000L});
        public static final BitSet FOLLOW_33_in_ruleDate5230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber5266 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber5276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleNumber5322 = new BitSet(new long[]{0x00001C180610A000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5380 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5401 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5413 = new BitSet(new long[]{0x00001C1A0610A000L});
        public static final BitSet FOLLOW_15_in_ruleNumber5481 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5502 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5515 = new BitSet(new long[]{0x00001C1A0610A000L});
        public static final BitSet FOLLOW_20_in_ruleNumber5583 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNumber5600 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5618 = new BitSet(new long[]{0x00001C1A0610A000L});
        public static final BitSet FOLLOW_35_in_ruleNumber5686 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5707 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5719 = new BitSet(new long[]{0x00001C1A0610A000L});
        public static final BitSet FOLLOW_36_in_ruleNumber5787 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5808 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5820 = new BitSet(new long[]{0x00001C1A0610A000L});
        public static final BitSet FOLLOW_25_in_ruleNumber5888 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleNumber5909 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5922 = new BitSet(new long[]{0x00001C1A0610A000L});
        public static final BitSet FOLLOW_26_in_ruleNumber5995 = new BitSet(new long[]{0x00001C1A0610A000L});
        public static final BitSet FOLLOW_42_in_ruleNumber6082 = new BitSet(new long[]{0x00001C1A0610A000L});
        public static final BitSet FOLLOW_43_in_ruleNumber6111 = new BitSet(new long[]{0x00001C1A0610A000L});
        public static final BitSet FOLLOW_44_in_ruleNumber6140 = new BitSet(new long[]{0x00001C1A0610A000L});
        public static final BitSet FOLLOW_33_in_ruleNumber6214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_entryRuleSingle6250 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingle6260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleWithOptions_in_ruleSingle6307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRef_in_ruleSingle6334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleWithOptions_in_entryRuleSingleWithOptions6369 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleWithOptions6379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleSingleWithOptions6416 = new BitSet(new long[]{0x001C00000610A000L});
        public static final BitSet FOLLOW_13_in_ruleSingleWithOptions6474 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleWithOptions6495 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions6507 = new BitSet(new long[]{0x001C00000612A000L});
        public static final BitSet FOLLOW_15_in_ruleSingleWithOptions6575 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleWithOptions6596 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions6609 = new BitSet(new long[]{0x001C00000612A000L});
        public static final BitSet FOLLOW_20_in_ruleSingleWithOptions6677 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleWithOptions6694 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions6712 = new BitSet(new long[]{0x001C00000612A000L});
        public static final BitSet FOLLOW_25_in_ruleSingleWithOptions6780 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleSingleWithOptions6801 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions6814 = new BitSet(new long[]{0x001C00000612A000L});
        public static final BitSet FOLLOW_26_in_ruleSingleWithOptions6887 = new BitSet(new long[]{0x001C00000612A000L});
        public static final BitSet FOLLOW_50_in_ruleSingleWithOptions6975 = new BitSet(new long[]{0x001C00000612A000L});
        public static final BitSet FOLLOW_51_in_ruleSingleWithOptions7004 = new BitSet(new long[]{0x001C00000612A000L});
        public static final BitSet FOLLOW_52_in_ruleSingleWithOptions7039 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleWithOptions7060 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions7072 = new BitSet(new long[]{0x001C00000612A000L});
        public static final BitSet FOLLOW_17_in_ruleSingleWithOptions7132 = new BitSet(new long[]{0x0000000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingleWithOptions7153 = new BitSet(new long[]{0x0020000000480000L});
        public static final BitSet FOLLOW_53_in_ruleSingleWithOptions7166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRef_in_entryRuleSingleRef7202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleRef7212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleSingleRef7249 = new BitSet(new long[]{0x201C00000610A000L});
        public static final BitSet FOLLOW_13_in_ruleSingleRef7307 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleRef7328 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7340 = new BitSet(new long[]{0x201C00020610A000L});
        public static final BitSet FOLLOW_15_in_ruleSingleRef7408 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleRef7429 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7442 = new BitSet(new long[]{0x201C00020610A000L});
        public static final BitSet FOLLOW_20_in_ruleSingleRef7510 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleRef7527 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7545 = new BitSet(new long[]{0x201C00020610A000L});
        public static final BitSet FOLLOW_25_in_ruleSingleRef7613 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleSingleRef7634 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7647 = new BitSet(new long[]{0x201C00020610A000L});
        public static final BitSet FOLLOW_26_in_ruleSingleRef7720 = new BitSet(new long[]{0x201C00020610A000L});
        public static final BitSet FOLLOW_50_in_ruleSingleRef7808 = new BitSet(new long[]{0x201C00020610A000L});
        public static final BitSet FOLLOW_51_in_ruleSingleRef7837 = new BitSet(new long[]{0x201C00020610A000L});
        public static final BitSet FOLLOW_52_in_ruleSingleRef7872 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleRef7893 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7905 = new BitSet(new long[]{0x201C00020610A000L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRefAttr_in_ruleSingleRef7982 = new BitSet(new long[]{0x201C00020610A000L});
        public static final BitSet FOLLOW_33_in_ruleSingleRef8040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple8076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiple8086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleWithOptions_in_ruleMultiple8133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleRef_in_ruleMultiple8160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleWithOptions_in_entryRuleMultipleWithOptions8195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleWithOptions8205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleMultipleWithOptions8242 = new BitSet(new long[]{0x00041C180610A000L});
        public static final BitSet FOLLOW_13_in_ruleMultipleWithOptions8300 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleWithOptions8321 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8333 = new BitSet(new long[]{0x00041C180612A000L});
        public static final BitSet FOLLOW_15_in_ruleMultipleWithOptions8401 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleWithOptions8422 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8435 = new BitSet(new long[]{0x00041C180612A000L});
        public static final BitSet FOLLOW_20_in_ruleMultipleWithOptions8503 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleWithOptions8520 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8538 = new BitSet(new long[]{0x00041C180612A000L});
        public static final BitSet FOLLOW_35_in_ruleMultipleWithOptions8606 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultipleWithOptions8623 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8640 = new BitSet(new long[]{0x00041C180612A000L});
        public static final BitSet FOLLOW_36_in_ruleMultipleWithOptions8708 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultipleWithOptions8725 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8742 = new BitSet(new long[]{0x00041C180612A000L});
        public static final BitSet FOLLOW_25_in_ruleMultipleWithOptions8810 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleMultipleWithOptions8831 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8844 = new BitSet(new long[]{0x00041C180612A000L});
        public static final BitSet FOLLOW_26_in_ruleMultipleWithOptions8917 = new BitSet(new long[]{0x00041C180612A000L});
        public static final BitSet FOLLOW_50_in_ruleMultipleWithOptions9002 = new BitSet(new long[]{0x00041C180612A000L});
        public static final BitSet FOLLOW_42_in_ruleMultipleWithOptions9089 = new BitSet(new long[]{0x00041C180612A000L});
        public static final BitSet FOLLOW_43_in_ruleMultipleWithOptions9118 = new BitSet(new long[]{0x00041C180612A000L});
        public static final BitSet FOLLOW_44_in_ruleMultipleWithOptions9147 = new BitSet(new long[]{0x00041C180612A000L});
        public static final BitSet FOLLOW_17_in_ruleMultipleWithOptions9221 = new BitSet(new long[]{0x0000000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultipleWithOptions9242 = new BitSet(new long[]{0x0080000000480000L});
        public static final BitSet FOLLOW_55_in_ruleMultipleWithOptions9255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleRef_in_entryRuleMultipleRef9291 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleRef9301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleMultipleRef9338 = new BitSet(new long[]{0x201C1C180610A000L});
        public static final BitSet FOLLOW_13_in_ruleMultipleRef9396 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleRef9417 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9429 = new BitSet(new long[]{0x201C1C1A0610A000L});
        public static final BitSet FOLLOW_15_in_ruleMultipleRef9497 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleRef9518 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9531 = new BitSet(new long[]{0x201C1C1A0610A000L});
        public static final BitSet FOLLOW_20_in_ruleMultipleRef9599 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleRef9616 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9634 = new BitSet(new long[]{0x201C1C1A0610A000L});
        public static final BitSet FOLLOW_35_in_ruleMultipleRef9702 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultipleRef9719 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9736 = new BitSet(new long[]{0x201C1C1A0610A000L});
        public static final BitSet FOLLOW_36_in_ruleMultipleRef9804 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultipleRef9821 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9838 = new BitSet(new long[]{0x201C1C1A0610A000L});
        public static final BitSet FOLLOW_25_in_ruleMultipleRef9906 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleMultipleRef9927 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9940 = new BitSet(new long[]{0x201C1C1A0610A000L});
        public static final BitSet FOLLOW_26_in_ruleMultipleRef10013 = new BitSet(new long[]{0x201C1C1A0610A000L});
        public static final BitSet FOLLOW_50_in_ruleMultipleRef10098 = new BitSet(new long[]{0x201C1C1A0610A000L});
        public static final BitSet FOLLOW_42_in_ruleMultipleRef10185 = new BitSet(new long[]{0x201C1C1A0610A000L});
        public static final BitSet FOLLOW_43_in_ruleMultipleRef10214 = new BitSet(new long[]{0x201C1C1A0610A000L});
        public static final BitSet FOLLOW_44_in_ruleMultipleRef10243 = new BitSet(new long[]{0x201C1C1A0610A000L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRefAttr_in_ruleMultipleRef10334 = new BitSet(new long[]{0x201C1C1A0610A000L});
        public static final BitSet FOLLOW_33_in_ruleMultipleRef10392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable10428 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable10438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTable10475 = new BitSet(new long[]{0x020400004602A000L});
        public static final BitSet FOLLOW_13_in_ruleTable10533 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable10554 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable10567 = new BitSet(new long[]{0x020400004602A000L});
        public static final BitSet FOLLOW_15_in_ruleTable10635 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable10656 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable10669 = new BitSet(new long[]{0x020400004602A000L});
        public static final BitSet FOLLOW_25_in_ruleTable10737 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleTable10758 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable10771 = new BitSet(new long[]{0x020400004602A000L});
        public static final BitSet FOLLOW_26_in_ruleTable10844 = new BitSet(new long[]{0x020400004602A000L});
        public static final BitSet FOLLOW_50_in_ruleTable10929 = new BitSet(new long[]{0x020400004602A000L});
        public static final BitSet FOLLOW_30_in_ruleTable11009 = new BitSet(new long[]{0x020400004602A000L});
        public static final BitSet FOLLOW_57_in_ruleTable11033 = new BitSet(new long[]{0x020400004602A000L});
        public static final BitSet FOLLOW_17_in_ruleTable11099 = new BitSet(new long[]{0x4000000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable11165 = new BitSet(new long[]{0x4400000000480000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable11241 = new BitSet(new long[]{0x4400000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable11310 = new BitSet(new long[]{0x4400000000480000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable11337 = new BitSet(new long[]{0x4400000000480000L});
        public static final BitSet FOLLOW_58_in_ruleTable11351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt11388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt11399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleEInt11438 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt11455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef11500 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplateRef11510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAnswerTemplateRef11547 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_60_in_ruleAnswerTemplateRef11559 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplateRef11579 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswerTemplateRef11591 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleAnswerTemplateRef11603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRefAttr_in_entryRuleAnswerTemplateRefAttr11639 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplateRefAttr11649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleAnswerTemplateRefAttr11686 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplateRefAttr11706 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswerTemplateRefAttr11718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion11754 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion11764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTableQuestion11801 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleTableQuestion11814 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTableQuestion11831 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTableQuestion11849 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTableQuestion11863 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTableQuestion11884 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_ruleTableQuestion11896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_entryRuleDEP_ID11933 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDEP_ID11944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDEP_ID11984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleDEP_ID12010 = new BitSet(new long[]{0x0000000000000002L});
    }


}