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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FQN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<survey'", "'title=\"'", "'\"'", "'description=\"'", "'filename=\"'", "'email=\"'", "'>'", "'</survey>'", "'<template'", "'id=\"'", "'</template>'", "'<a'", "'</a>'", "'<group'", "'depends-on=\"'", "'required'", "'</group>'", "'<text'", "'singleline'", "'single'", "'multi'", "'multiline'", "'/>'", "'<scale'", "'min=\"'", "'max=\"'", "'min-label=\"'", "'max-label=\"'", "'<date'", "'start=\"'", "'end=\"'", "'show-limits'", "'show'", "'limits'", "'day'", "'month'", "'year'", "'<number'", "'<single'", "'other'", "'other=\"\"'", "'other=\"'", "'</single>'", "'<multiple'", "'</multiple>'", "'<table'", "'multiple'", "'</table>'", "'-'", "'ref=\"'", "'template=\"'", "'<q'", "'</q>'"
    };
    public static final int RULE_ID=4;
    public static final int T__64=64;
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:76:1: ruleSurvey returns [EObject current=null] : ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>' )? ) ;
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
        Token lv_mail_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_items_16_0 = null;

        EObject lv_templates_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:79:28: ( ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>' )? ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>' )? )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>' )? )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>' )?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:86:2: (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:86:4: otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>'
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey132); 

                        	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getSurveyKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:90:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:92:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:92:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:93:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?)
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:96:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?)
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=5;
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
                        else if ( LA4_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 3) ) {
                            alt4=4;
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
                    	case 4 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:213:4: ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:213:4: ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:214:5: {...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 3)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:214:105: ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:215:6: ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 3);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:218:6: ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:218:7: {...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:218:16: (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:218:18: otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"'
                    	    {
                    	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSurvey497); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getSurveyAccess().getEmailKeyword_1_1_3_0());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:222:1: ( (lv_mail_13_0= RULE_STRING ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:223:1: (lv_mail_13_0= RULE_STRING )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:223:1: (lv_mail_13_0= RULE_STRING )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:224:3: lv_mail_13_0= RULE_STRING
                    	    {
                    	    lv_mail_13_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSurvey514); 

                    	    			newLeafNode(lv_mail_13_0, grammarAccess.getSurveyAccess().getMailSTRINGTerminalRuleCall_1_1_3_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"mail",
                    	            		lv_mail_13_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey531); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getSurveyAccess().getQuotationMarkKeyword_1_1_3_2());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	    	 				

                    	    }


                    	    }


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

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1()) ) {
                        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canLeave(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1())");
                    }

                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	

                    }

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSurvey590); 

                        	newLeafNode(otherlv_15, grammarAccess.getSurveyAccess().getGreaterThanSignKeyword_1_2());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:263:1: ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==25||LA5_0==29||LA5_0==35||LA5_0==40||(LA5_0>=49 && LA5_0<=50)||LA5_0==55||LA5_0==57) ) {
                            alt5=1;
                        }
                        else if ( (LA5_0==20) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:263:2: ( (lv_items_16_0= ruleItem ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:263:2: ( (lv_items_16_0= ruleItem ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:264:1: (lv_items_16_0= ruleItem )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:264:1: (lv_items_16_0= ruleItem )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:265:3: lv_items_16_0= ruleItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getItemsItemParserRuleCall_1_3_0_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleItem_in_ruleSurvey612);
                    	    lv_items_16_0=ruleItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_16_0, 
                    	            		"Item");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:282:6: ( (lv_templates_17_0= ruleAnswerTemplate ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:282:6: ( (lv_templates_17_0= ruleAnswerTemplate ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:283:1: (lv_templates_17_0= ruleAnswerTemplate )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:283:1: (lv_templates_17_0= ruleAnswerTemplate )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:284:3: lv_templates_17_0= ruleAnswerTemplate
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getTemplatesAnswerTemplateParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_ruleSurvey639);
                    	    lv_templates_17_0=ruleAnswerTemplate();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"templates",
                    	            		lv_templates_17_0, 
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

                    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSurvey653); 

                        	newLeafNode(otherlv_18, grammarAccess.getSurveyAccess().getSurveyKeyword_1_4());
                        

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:312:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:313:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:314:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString692);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString703); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:321:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:324:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:325:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:325:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:325:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString743); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:333:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString769); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:348:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:349:2: (iv_ruleItem= ruleItem EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:350:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_entryRuleItem814);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItem824); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:357:1: ruleItem returns [EObject current=null] : (this_Group_0= ruleGroup | this_Question_1= ruleQuestion ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_Group_0 = null;

        EObject this_Question_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:360:28: ( (this_Group_0= ruleGroup | this_Question_1= ruleQuestion ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:361:1: (this_Group_0= ruleGroup | this_Question_1= ruleQuestion )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:361:1: (this_Group_0= ruleGroup | this_Question_1= ruleQuestion )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==29||LA8_0==35||LA8_0==40||(LA8_0>=49 && LA8_0<=50)||LA8_0==55||LA8_0==57) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:362:5: this_Group_0= ruleGroup
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getGroupParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleItem871);
                    this_Group_0=ruleGroup();

                    state._fsp--;

                     
                            current = this_Group_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:372:5: this_Question_1= ruleQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getQuestionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleItem898);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:388:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:389:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:390:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion933);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion943); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:397:1: ruleQuestion returns [EObject current=null] : (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:400:28: ( (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:401:1: (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:401:1: (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 40:
                {
                alt9=3;
                }
                break;
            case 49:
                {
                alt9=4;
                }
                break;
            case 50:
                {
                alt9=5;
                }
                break;
            case 55:
                {
                alt9=6;
                }
                break;
            case 57:
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:402:5: this_Text_0= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTextParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleQuestion990);
                    this_Text_0=ruleText();

                    state._fsp--;

                     
                            current = this_Text_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:412:5: this_Scale_1= ruleScale
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getScaleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleQuestion1017);
                    this_Scale_1=ruleScale();

                    state._fsp--;

                     
                            current = this_Scale_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:422:5: this_Date_2= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getDateParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleQuestion1044);
                    this_Date_2=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:432:5: this_Number_3= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getNumberParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleQuestion1071);
                    this_Number_3=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:442:5: this_Single_4= ruleSingle
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSingleParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleQuestion1098);
                    this_Single_4=ruleSingle();

                    state._fsp--;

                     
                            current = this_Single_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:452:5: this_Multiple_5= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleQuestion1125);
                    this_Multiple_5=ruleMultiple();

                    state._fsp--;

                     
                            current = this_Multiple_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:462:5: this_Table_6= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTableParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleQuestion1152);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:478:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:479:2: (iv_ruleOption= ruleOption EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:480:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption1187);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption1197); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:487:1: ruleOption returns [EObject current=null] : (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_AnswerTemplateRef_0 = null;

        EObject this_Answer_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:490:28: ( (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:491:1: (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:491:1: (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:492:5: this_AnswerTemplateRef_0= ruleAnswerTemplateRef
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerTemplateRefParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_ruleOption1244);
                    this_AnswerTemplateRef_0=ruleAnswerTemplateRef();

                    state._fsp--;

                     
                            current = this_AnswerTemplateRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:502:5: this_Answer_1= ruleAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleOption1271);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:518:1: entryRuleAnswerTemplate returns [EObject current=null] : iv_ruleAnswerTemplate= ruleAnswerTemplate EOF ;
    public final EObject entryRuleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:519:2: (iv_ruleAnswerTemplate= ruleAnswerTemplate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:520:2: iv_ruleAnswerTemplate= ruleAnswerTemplate EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1306);
            iv_ruleAnswerTemplate=ruleAnswerTemplate();

            state._fsp--;

             current =iv_ruleAnswerTemplate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplate1316); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:527:1: ruleAnswerTemplate returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:530:28: ( (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:531:1: (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:531:1: (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:531:3: otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswerTemplate1353); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswerTemplate1365); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateAccess().getIdKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:539:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:540:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:540:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:541:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplate1382); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswerTemplate1399); 

                	newLeafNode(otherlv_3, grammarAccess.getAnswerTemplateAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswerTemplate1411); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerTemplateAccess().getGreaterThanSignKeyword_4());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:565:1: ( (lv_answers_5_0= ruleAnswer ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:566:1: (lv_answers_5_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:566:1: (lv_answers_5_0= ruleAnswer )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:567:3: lv_answers_5_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAnswerTemplateAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleAnswerTemplate1432);
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

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnswerTemplate1445); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:595:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:596:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:597:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer1481);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer1491); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:604:1: ruleAnswer returns [EObject current=null] : (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:607:28: ( (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:608:1: (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:608:1: (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:608:3: otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnswer1528); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:612:1: (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:612:3: otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"'
                    {
                    otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswer1541); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getIdKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:616:1: ( (lv_name_2_0= RULE_ID ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:617:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:617:1: (lv_name_2_0= RULE_ID )
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:618:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswer1558); 

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

                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswer1576); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnswerAccess().getQuotationMarkKeyword_1_2());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswer1590); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:642:1: ( (lv_title_5_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:643:1: (lv_title_5_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:643:1: (lv_title_5_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:644:3: lv_title_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getTitleEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1611);
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

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAnswer1623); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:672:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:673:2: (iv_ruleGroup= ruleGroup EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:674:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup1659);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup1669); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:681:1: ruleGroup returns [EObject current=null] : (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:684:28: ( (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:685:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:685:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:685:3: otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGroup1706); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:689:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:691:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:691:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:692:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:695:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:696:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:696:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )*
            loop18:
            do {
                int alt18=6;
                int LA18_0 = input.LA(1);

                if ( LA18_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
                    alt18=3;
                }
                else if ( LA18_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
                    alt18=4;
                }
                else if ( LA18_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4) ) {
                    alt18=5;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:698:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:698:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:699:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:699:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:700:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:703:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:703:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:703:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:703:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1764); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:707:1: ( (lv_title_3_0= ruleEString ) )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:708:1: (lv_title_3_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:708:1: (lv_title_3_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:709:3: lv_title_3_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1785);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1798); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:736:4: ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:736:4: ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:737:5: {...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:737:102: ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:738:6: ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:741:6: ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:741:7: {...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:741:16: (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:741:18: otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGroup1866); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getIdKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:745:1: ( (lv_name_6_0= ruleEString ) )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:746:1: (lv_name_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:746:1: (lv_name_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:747:3: lv_name_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1887);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1900); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:774:4: ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:774:4: ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:775:5: {...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:775:102: ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:776:6: ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:779:6: ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:779:7: {...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:779:16: (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:779:18: otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup1968); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getDescriptionKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:783:1: ( (lv_description_9_0= ruleEString ) )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:784:1: (lv_description_9_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:784:1: (lv_description_9_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:785:3: lv_description_9_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getDescriptionEStringParserRuleCall_1_2_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1989);
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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup2002); 

            	        	newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:812:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:812:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:813:5: {...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:813:102: ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:814:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:817:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:817:7: {...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:817:16: (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:817:18: otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleGroup2070); 

            	        	newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:821:1: ( (lv_dependsOn_12_0= ruleDEP_ID ) )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_ID||LA17_0==RULE_FQN) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:822:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:822:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:823:3: lv_dependsOn_12_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getDependsOnDEP_IDParserRuleCall_1_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleGroup2091);
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

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup2104); 

            	        	newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:850:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:850:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:851:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:851:102: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:852:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:855:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:855:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:855:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:856:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:856:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:857:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleGroup2177); 

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

            otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGroup2242); 

                	newLeafNode(otherlv_15, grammarAccess.getGroupAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:888:1: ( (lv_questions_16_0= ruleQuestion ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29||LA19_0==35||LA19_0==40||(LA19_0>=49 && LA19_0<=50)||LA19_0==55||LA19_0==57) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:889:1: (lv_questions_16_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:889:1: (lv_questions_16_0= ruleQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:890:3: lv_questions_16_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleGroup2263);
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

            otherlv_17=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleGroup2276); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:918:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:919:2: (iv_ruleText= ruleText EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:920:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText2312);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText2322); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:927:1: ruleText returns [EObject current=null] : ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:930:28: ( ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:931:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:931:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:931:2: () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:931:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:932:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleText2368); 

                	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:941:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:943:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:943:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:944:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:947:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:948:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:948:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+
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
                else if ( LA25_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
                    alt25=3;
                }
                else if ( LA25_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
                    alt25=4;
                }
                else if ( LA25_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
                    alt25=5;
                }
                else if ( LA25_0 >=30 && LA25_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
                    alt25=6;
                }


                switch (alt25) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:950:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:950:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:951:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:951:101: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:952:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:955:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:955:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:955:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:955:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2426); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTextAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:959:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:960:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:960:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:961:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2447);
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

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2459); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:988:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:988:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:989:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:989:101: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:990:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:993:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:993:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:993:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:993:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleText2527); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:997:1: ( (lv_description_7_0= ruleEString ) )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:998:1: (lv_description_7_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:998:1: (lv_description_7_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:999:3: lv_description_7_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTextAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2548);
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

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2561); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1026:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1026:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1027:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1027:101: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1028:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1031:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1031:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1031:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1031:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleText2629); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTextAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1035:1: ( (lv_name_10_0= RULE_ID ) )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==RULE_ID) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1036:1: (lv_name_10_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1036:1: (lv_name_10_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1037:3: lv_name_10_0= RULE_ID
            	            {
            	            lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleText2646); 

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

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2664); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1064:4: ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1064:4: ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1065:5: {...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1065:101: ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1066:6: ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1069:6: ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1069:7: {...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1069:16: (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1069:18: otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleText2732); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTextAccess().getDependsOnKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1073:1: ( (lv_dependsOn_13_0= ruleDEP_ID ) )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==RULE_ID||LA22_0==RULE_FQN) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1074:1: (lv_dependsOn_13_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1074:1: (lv_dependsOn_13_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1075:3: lv_dependsOn_13_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTextAccess().getDependsOnDEP_IDParserRuleCall_2_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleText2753);
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

            	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2766); 

            	        	newLeafNode(otherlv_14, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1102:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1102:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1103:5: {...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1103:101: ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1104:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1107:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1107:7: {...}? => ( (lv_required_15_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1107:16: ( (lv_required_15_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1108:1: (lv_required_15_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1108:1: (lv_required_15_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1109:3: lv_required_15_0= 'required'
            	    {
            	    lv_required_15_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleText2839); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1129:4: ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1129:4: ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1130:5: {...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1130:101: ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1131:6: ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1134:6: ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1134:7: {...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1134:16: (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) )
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 32:
            	    case 33:
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1134:18: otherlv_16= 'singleline'
            	            {
            	            otherlv_16=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleText2919); 

            	                	newLeafNode(otherlv_16, grammarAccess.getTextAccess().getSinglelineKeyword_2_5_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1139:7: otherlv_17= 'single'
            	            {
            	            otherlv_17=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleText2937); 

            	                	newLeafNode(otherlv_17, grammarAccess.getTextAccess().getSingleKeyword_2_5_1());
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1144:6: ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1144:6: ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1145:1: ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1145:1: ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1146:1: (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1146:1: (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' )
            	            int alt23=2;
            	            int LA23_0 = input.LA(1);

            	            if ( (LA23_0==32) ) {
            	                alt23=1;
            	            }
            	            else if ( (LA23_0==33) ) {
            	                alt23=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 23, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt23) {
            	                case 1 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1147:3: lv_multiline_18_1= 'multi'
            	                    {
            	                    lv_multiline_18_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleText2963); 

            	                            newLeafNode(lv_multiline_18_1, grammarAccess.getTextAccess().getMultilineMultiKeyword_2_5_2_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getTextRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "multiline", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1159:8: lv_multiline_18_2= 'multiline'
            	                    {
            	                    lv_multiline_18_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleText2992); 

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

            otherlv_19=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleText3067); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1201:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1202:2: (iv_ruleScale= ruleScale EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1203:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScale_in_entryRuleScale3103);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScale3113); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1210:1: ruleScale returns [EObject current=null] : (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1213:28: ( (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1214:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1214:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1214:3: otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleScale3150); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1218:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1220:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1220:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1221:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1224:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1225:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1225:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=10;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1227:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1227:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1228:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1228:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1229:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1232:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1232:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1232:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1232:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3208); 

            	        	newLeafNode(otherlv_2, grammarAccess.getScaleAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1236:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1237:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1237:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1238:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3229);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3241); 

            	        	newLeafNode(otherlv_4, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1265:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1265:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1266:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1266:102: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1267:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1270:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1270:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1270:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1270:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3309); 

            	        	newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1274:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1275:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1275:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1276:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getScaleAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3330);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3343); 

            	        	newLeafNode(otherlv_7, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1303:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1303:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1304:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1304:102: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1305:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1308:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1308:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1308:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1308:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleScale3411); 

            	        	newLeafNode(otherlv_8, grammarAccess.getScaleAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1312:1: ( (lv_name_9_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1313:1: (lv_name_9_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1313:1: (lv_name_9_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1314:3: lv_name_9_0= RULE_ID
            	    {
            	    lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleScale3428); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3445); 

            	        	newLeafNode(otherlv_10, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1341:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1341:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1342:5: {...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1342:102: ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1343:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1346:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1346:7: {...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1346:16: (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1346:18: otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleScale3513); 

            	        	newLeafNode(otherlv_11, grammarAccess.getScaleAccess().getMinKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1350:1: ( (lv_min_12_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1351:1: (lv_min_12_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1351:1: (lv_min_12_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1352:3: lv_min_12_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getMinEIntParserRuleCall_1_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3534);
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

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3546); 

            	        	newLeafNode(otherlv_13, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1379:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1379:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1380:5: {...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1380:102: ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1381:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1384:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1384:7: {...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1384:16: (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1384:18: otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"'
            	    {
            	    otherlv_14=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleScale3614); 

            	        	newLeafNode(otherlv_14, grammarAccess.getScaleAccess().getMaxKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1388:1: ( (lv_max_15_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1389:1: (lv_max_15_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1389:1: (lv_max_15_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1390:3: lv_max_15_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getMaxEIntParserRuleCall_1_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3635);
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

            	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3647); 

            	        	newLeafNode(otherlv_16, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1417:4: ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1417:4: ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1418:5: {...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1418:102: ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1419:6: ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1422:6: ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1422:7: {...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1422:16: (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1422:18: otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"'
            	    {
            	    otherlv_17=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleScale3715); 

            	        	newLeafNode(otherlv_17, grammarAccess.getScaleAccess().getMinLabelKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1426:1: ( (lv_minLabel_18_0= ruleEString ) )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1427:1: (lv_minLabel_18_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1427:1: (lv_minLabel_18_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1428:3: lv_minLabel_18_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getScaleAccess().getMinLabelEStringParserRuleCall_1_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3736);
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

            	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3749); 

            	        	newLeafNode(otherlv_19, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1455:4: ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1455:4: ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1456:5: {...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1456:102: ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1457:6: ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1460:6: ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1460:7: {...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1460:16: (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1460:18: otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"'
            	    {
            	    otherlv_20=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleScale3817); 

            	        	newLeafNode(otherlv_20, grammarAccess.getScaleAccess().getMaxLabelKeyword_1_6_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1464:1: ( (lv_maxLabel_21_0= ruleEString ) )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1465:1: (lv_maxLabel_21_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1465:1: (lv_maxLabel_21_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1466:3: lv_maxLabel_21_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getScaleAccess().getMaxLabelEStringParserRuleCall_1_6_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3838);
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

            	    otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3851); 

            	        	newLeafNode(otherlv_22, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_6_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1493:4: ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1493:4: ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1494:5: {...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1494:102: ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1495:6: ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1498:6: ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1498:7: {...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1498:16: (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1498:18: otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"'
            	    {
            	    otherlv_23=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleScale3919); 

            	        	newLeafNode(otherlv_23, grammarAccess.getScaleAccess().getDependsOnKeyword_1_7_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1502:1: ( (lv_dependsOn_24_0= ruleDEP_ID ) )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==RULE_ID||LA29_0==RULE_FQN) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1503:1: (lv_dependsOn_24_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1503:1: (lv_dependsOn_24_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1504:3: lv_dependsOn_24_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getScaleAccess().getDependsOnDEP_IDParserRuleCall_1_7_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleScale3940);
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

            	    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3953); 

            	        	newLeafNode(otherlv_25, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_7_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1531:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1531:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1532:5: {...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1532:102: ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1533:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1536:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1536:7: {...}? => ( (lv_required_26_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1536:16: ( (lv_required_26_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1537:1: (lv_required_26_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1537:1: (lv_required_26_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1538:3: lv_required_26_0= 'required'
            	    {
            	    lv_required_26_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleScale4026); 

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

            otherlv_27=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleScale4097); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1578:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1579:2: (iv_ruleDate= ruleDate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1580:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate4133);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate4143); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1587:1: ruleDate returns [EObject current=null] : ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1590:28: ( ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1591:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1591:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1591:2: () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1591:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1592:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDate4189); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1601:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1603:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1603:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1604:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1607:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1608:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1608:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=12;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1610:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1610:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1611:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1611:101: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1612:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1615:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1615:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1615:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1615:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4247); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1619:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1620:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1620:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1621:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4268);
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

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4280); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1648:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1648:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1649:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1649:101: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1650:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1653:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1653:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1653:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1653:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDate4348); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1657:1: ( (lv_description_7_0= ruleEString ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1658:1: (lv_description_7_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1658:1: (lv_description_7_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1659:3: lv_description_7_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getDateAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4369);
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

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4382); 

            	        	newLeafNode(otherlv_8, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1686:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1686:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1687:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1687:101: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1688:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1691:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1691:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1691:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1691:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDate4450); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDateAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1695:1: ( (lv_name_10_0= RULE_ID ) )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==RULE_ID) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1696:1: (lv_name_10_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1696:1: (lv_name_10_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1697:3: lv_name_10_0= RULE_ID
            	            {
            	            lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDate4467); 

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

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4485); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1724:4: ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1724:4: ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1725:5: {...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1725:101: ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1726:6: ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1729:6: ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1729:7: {...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1729:16: (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1729:18: otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDate4553); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDateAccess().getStartKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1733:1: ( (lv_start_13_0= ruleEString ) )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1734:1: (lv_start_13_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1734:1: (lv_start_13_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1735:3: lv_start_13_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getDateAccess().getStartEStringParserRuleCall_2_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4574);
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

            	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4587); 

            	        	newLeafNode(otherlv_14, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1762:4: ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1762:4: ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1763:5: {...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1763:101: ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1764:6: ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1767:6: ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1767:7: {...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1767:16: (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1767:18: otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"'
            	    {
            	    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDate4655); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDateAccess().getEndKeyword_2_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1771:1: ( (lv_end_16_0= ruleEString ) )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1772:1: (lv_end_16_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1772:1: (lv_end_16_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1773:3: lv_end_16_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getDateAccess().getEndEStringParserRuleCall_2_4_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4676);
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

            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4689); 

            	        	newLeafNode(otherlv_17, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1800:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1800:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1801:5: {...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1801:101: ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1802:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1805:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1805:7: {...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1805:16: (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1805:18: otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"'
            	    {
            	    otherlv_18=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDate4757); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDateAccess().getDependsOnKeyword_2_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1809:1: ( (lv_dependsOn_19_0= ruleDEP_ID ) )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==RULE_ID||LA35_0==RULE_FQN) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1810:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1810:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1811:3: lv_dependsOn_19_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getDateAccess().getDependsOnDEP_IDParserRuleCall_2_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleDate4778);
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

            	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4791); 

            	        	newLeafNode(otherlv_20, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1838:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1838:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1839:5: {...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1839:101: ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1840:6: ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1843:6: ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1843:7: {...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1843:16: ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1844:1: ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1844:1: ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1845:1: (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1845:1: (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' )
            	    int alt36=3;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt36=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt36=2;
            	        }
            	        break;
            	    case 45:
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1846:3: lv_showLimits_21_1= 'show-limits'
            	            {
            	            lv_showLimits_21_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDate4866); 

            	                    newLeafNode(lv_showLimits_21_1, grammarAccess.getDateAccess().getShowLimitsShowLimitsKeyword_2_6_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1858:8: lv_showLimits_21_2= 'show'
            	            {
            	            lv_showLimits_21_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDate4895); 

            	                    newLeafNode(lv_showLimits_21_2, grammarAccess.getDateAccess().getShowLimitsShowKeyword_2_6_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1870:8: lv_showLimits_21_3= 'limits'
            	            {
            	            lv_showLimits_21_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDate4924); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1892:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1892:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1893:5: {...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1893:101: ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1894:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1897:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1897:7: {...}? => ( (lv_required_22_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1897:16: ( (lv_required_22_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1898:1: (lv_required_22_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1898:1: (lv_required_22_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1899:3: lv_required_22_0= 'required'
            	    {
            	    lv_required_22_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDate5012); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1919:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1919:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1920:5: {...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1920:101: ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1921:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1924:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1924:7: {...}? => ( (lv_day_23_0= 'day' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1924:16: ( (lv_day_23_0= 'day' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1925:1: (lv_day_23_0= 'day' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1925:1: (lv_day_23_0= 'day' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1926:3: lv_day_23_0= 'day'
            	    {
            	    lv_day_23_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleDate5097); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1946:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1946:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:5: {...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:101: ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1948:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1951:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1951:7: {...}? => ( (lv_month_24_0= 'month' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1951:16: ( (lv_month_24_0= 'month' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1952:1: (lv_month_24_0= 'month' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1952:1: (lv_month_24_0= 'month' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1953:3: lv_month_24_0= 'month'
            	    {
            	    lv_month_24_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleDate5182); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1973:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1973:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1974:5: {...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1974:102: ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1975:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1978:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1978:7: {...}? => ( (lv_year_25_0= 'year' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1978:16: ( (lv_year_25_0= 'year' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1979:1: (lv_year_25_0= 'year' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1979:1: (lv_year_25_0= 'year' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1980:3: lv_year_25_0= 'year'
            	    {
            	    lv_year_25_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleDate5267); 

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

            otherlv_26=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDate5338); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2020:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2021:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2022:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber5374);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber5384); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2029:1: ruleNumber returns [EObject current=null] : ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2032:28: ( ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2033:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2033:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2033:2: () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2033:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2034:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberAccess().getNumberAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleNumber5430); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getNumberKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2043:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2045:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2045:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2046:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2049:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2050:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2050:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=9;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2052:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2052:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2053:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2053:103: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2054:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2057:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2057:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2057:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2057:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5488); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2061:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2062:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2062:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2063:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5509);
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

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5521); 

            	        	newLeafNode(otherlv_5, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2090:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2090:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2091:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2091:103: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2092:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNumber5589); 

            	        	newLeafNode(otherlv_6, grammarAccess.getNumberAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2099:1: ( (lv_description_7_0= ruleEString ) )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2100:1: (lv_description_7_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2100:1: (lv_description_7_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2101:3: lv_description_7_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getNumberAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5610);
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

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5623); 

            	        	newLeafNode(otherlv_8, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2128:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2128:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:103: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2130:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2133:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2133:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2133:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2133:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNumber5691); 

            	        	newLeafNode(otherlv_9, grammarAccess.getNumberAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2137:1: ( (lv_name_10_0= RULE_ID ) )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==RULE_ID) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2138:1: (lv_name_10_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2138:1: (lv_name_10_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2139:3: lv_name_10_0= RULE_ID
            	            {
            	            lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNumber5708); 

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

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5726); 

            	        	newLeafNode(otherlv_11, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2166:4: ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2166:4: ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2167:5: {...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2167:103: ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2168:6: ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2171:6: ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2171:7: {...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2171:16: (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2171:18: otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleNumber5794); 

            	        	newLeafNode(otherlv_12, grammarAccess.getNumberAccess().getMinKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2175:1: ( (lv_min_13_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2176:1: (lv_min_13_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2176:1: (lv_min_13_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2177:3: lv_min_13_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getMinEIntParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5815);
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

            	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5827); 

            	        	newLeafNode(otherlv_14, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2204:4: ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2204:4: ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2205:5: {...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2205:103: ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2206:6: ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2209:6: ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2209:7: {...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2209:16: (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2209:18: otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"'
            	    {
            	    otherlv_15=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleNumber5895); 

            	        	newLeafNode(otherlv_15, grammarAccess.getNumberAccess().getMaxKeyword_2_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2213:1: ( (lv_max_16_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2214:1: (lv_max_16_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2214:1: (lv_max_16_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2215:3: lv_max_16_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getMaxEIntParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5916);
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

            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5928); 

            	        	newLeafNode(otherlv_17, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2242:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2242:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2243:5: {...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2243:103: ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2244:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2247:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2247:7: {...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2247:16: (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2247:18: otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"'
            	    {
            	    otherlv_18=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNumber5996); 

            	        	newLeafNode(otherlv_18, grammarAccess.getNumberAccess().getDependsOnKeyword_2_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2251:1: ( (lv_dependsOn_19_0= ruleDEP_ID ) )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==RULE_ID||LA40_0==RULE_FQN) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2252:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2252:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2253:3: lv_dependsOn_19_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getNumberAccess().getDependsOnDEP_IDParserRuleCall_2_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleNumber6017);
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

            	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber6030); 

            	        	newLeafNode(otherlv_20, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2280:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2280:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2281:5: {...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2281:103: ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2282:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2285:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2285:7: {...}? => ( (lv_required_21_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2285:16: ( (lv_required_21_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2286:1: (lv_required_21_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2286:1: (lv_required_21_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2287:3: lv_required_21_0= 'required'
            	    {
            	    lv_required_21_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleNumber6103); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2307:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2307:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2308:5: {...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2308:103: ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2309:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2312:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2312:7: {...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2312:16: ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2313:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2313:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2314:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2314:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    int alt41=3;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case 45:
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2315:3: lv_showLimits_22_1= 'show-limits'
            	            {
            	            lv_showLimits_22_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleNumber6190); 

            	                    newLeafNode(lv_showLimits_22_1, grammarAccess.getNumberAccess().getShowLimitsShowLimitsKeyword_2_7_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getNumberRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2327:8: lv_showLimits_22_2= 'show'
            	            {
            	            lv_showLimits_22_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleNumber6219); 

            	                    newLeafNode(lv_showLimits_22_2, grammarAccess.getNumberAccess().getShowLimitsShowKeyword_2_7_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getNumberRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2339:8: lv_showLimits_22_3= 'limits'
            	            {
            	            lv_showLimits_22_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleNumber6248); 

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

            otherlv_23=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNumber6322); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2381:1: entryRuleSingle returns [EObject current=null] : iv_ruleSingle= ruleSingle EOF ;
    public final EObject entryRuleSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingle = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2382:2: (iv_ruleSingle= ruleSingle EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2383:2: iv_ruleSingle= ruleSingle EOF
            {
             newCompositeNode(grammarAccess.getSingleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingle_in_entryRuleSingle6358);
            iv_ruleSingle=ruleSingle();

            state._fsp--;

             current =iv_ruleSingle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingle6368); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2390:1: ruleSingle returns [EObject current=null] : (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef ) ;
    public final EObject ruleSingle() throws RecognitionException {
        EObject current = null;

        EObject this_SingleWithOptions_0 = null;

        EObject this_SingleRef_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2393:28: ( (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2394:1: (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2394:1: (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2395:5: this_SingleWithOptions_0= ruleSingleWithOptions
                    {
                     
                            newCompositeNode(grammarAccess.getSingleAccess().getSingleWithOptionsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleWithOptions_in_ruleSingle6415);
                    this_SingleWithOptions_0=ruleSingleWithOptions();

                    state._fsp--;

                     
                            current = this_SingleWithOptions_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2405:5: this_SingleRef_1= ruleSingleRef
                    {
                     
                            newCompositeNode(grammarAccess.getSingleAccess().getSingleRefParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleRef_in_ruleSingle6442);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2421:1: entryRuleSingleWithOptions returns [EObject current=null] : iv_ruleSingleWithOptions= ruleSingleWithOptions EOF ;
    public final EObject entryRuleSingleWithOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleWithOptions = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2422:2: (iv_ruleSingleWithOptions= ruleSingleWithOptions EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2423:2: iv_ruleSingleWithOptions= ruleSingleWithOptions EOF
            {
             newCompositeNode(grammarAccess.getSingleWithOptionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleWithOptions_in_entryRuleSingleWithOptions6477);
            iv_ruleSingleWithOptions=ruleSingleWithOptions();

            state._fsp--;

             current =iv_ruleSingleWithOptions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleWithOptions6487); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2430:1: ruleSingleWithOptions returns [EObject current=null] : (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2433:28: ( (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2434:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2434:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2434:3: otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSingleWithOptions6524); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleWithOptionsAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2438:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2440:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2440:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2441:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2444:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2445:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2445:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+
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
                else if ( LA49_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 2) ) {
                    alt49=3;
                }
                else if ( LA49_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 3) ) {
                    alt49=4;
                }
                else if ( LA49_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 4) ) {
                    alt49=5;
                }
                else if ( LA49_0 >=51 && LA49_0<=53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 5) ) {
                    alt49=6;
                }


                switch (alt49) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2447:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2447:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2448:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2448:114: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2449:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2452:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2452:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2452:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2452:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingleWithOptions6582); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSingleWithOptionsAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2456:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2457:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2457:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2458:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleWithOptions6603);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions6615); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2485:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2485:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2486:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2486:114: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2487:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2490:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2490:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2490:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2490:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingleWithOptions6683); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSingleWithOptionsAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2494:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2495:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2495:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2496:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleWithOptions6704);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions6717); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2523:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2523:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2524:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2524:114: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2525:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2528:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2528:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2528:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2528:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSingleWithOptions6785); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSingleWithOptionsAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2532:1: ( (lv_name_9_0= RULE_ID ) )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==RULE_ID) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2533:1: (lv_name_9_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2533:1: (lv_name_9_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2534:3: lv_name_9_0= RULE_ID
            	            {
            	            lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingleWithOptions6802); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions6820); 

            	        	newLeafNode(otherlv_10, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2561:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2561:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2562:5: {...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2562:114: ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2563:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2566:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2566:7: {...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2566:16: (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2566:18: otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingleWithOptions6888); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSingleWithOptionsAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2570:1: ( (lv_dependsOn_12_0= ruleDEP_ID ) )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==RULE_ID||LA46_0==RULE_FQN) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2571:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2571:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2572:3: lv_dependsOn_12_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getDependsOnDEP_IDParserRuleCall_1_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleSingleWithOptions6909);
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

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions6922); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2599:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2599:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2600:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2600:114: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2601:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2604:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2604:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2604:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2605:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2605:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2606:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSingleWithOptions6995); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2626:4: ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2626:4: ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2627:5: {...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2627:114: ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2628:6: ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2631:6: ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2631:7: {...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2631:16: ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) )
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( ((LA48_0>=51 && LA48_0<=52)) ) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==53) ) {
            	        alt48=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2631:17: ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2631:17: ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2632:1: ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2632:1: ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2633:1: (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2633:1: (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' )
            	            int alt47=2;
            	            int LA47_0 = input.LA(1);

            	            if ( (LA47_0==51) ) {
            	                alt47=1;
            	            }
            	            else if ( (LA47_0==52) ) {
            	                alt47=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 47, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt47) {
            	                case 1 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2634:3: lv_other_15_1= 'other'
            	                    {
            	                    lv_other_15_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSingleWithOptions7083); 

            	                            newLeafNode(lv_other_15_1, grammarAccess.getSingleWithOptionsAccess().getOtherOtherKeyword_1_5_0_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getSingleWithOptionsRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "other", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2646:8: lv_other_15_2= 'other=\"\"'
            	                    {
            	                    lv_other_15_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleSingleWithOptions7112); 

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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2662:6: (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2662:6: (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2662:8: otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"'
            	            {
            	            otherlv_16=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSingleWithOptions7147); 

            	                	newLeafNode(otherlv_16, grammarAccess.getSingleWithOptionsAccess().getOtherKeyword_1_5_1_0());
            	                
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2666:1: ( (lv_otherLabel_17_0= ruleEString ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2667:1: (lv_otherLabel_17_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2667:1: (lv_otherLabel_17_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2668:3: lv_otherLabel_17_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getOtherLabelEStringParserRuleCall_1_5_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleWithOptions7168);
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

            	            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions7180); 

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

            otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSingleWithOptions7240); 

                	newLeafNode(otherlv_19, grammarAccess.getSingleWithOptionsAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2707:1: ( (lv_options_20_0= ruleOption ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==20||LA50_0==23) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2708:1: (lv_options_20_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2708:1: (lv_options_20_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2709:3: lv_options_20_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingleWithOptions7261);
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

            otherlv_21=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleSingleWithOptions7274); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2737:1: entryRuleSingleRef returns [EObject current=null] : iv_ruleSingleRef= ruleSingleRef EOF ;
    public final EObject entryRuleSingleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2738:2: (iv_ruleSingleRef= ruleSingleRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2739:2: iv_ruleSingleRef= ruleSingleRef EOF
            {
             newCompositeNode(grammarAccess.getSingleRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleRef_in_entryRuleSingleRef7310);
            iv_ruleSingleRef=ruleSingleRef();

            state._fsp--;

             current =iv_ruleSingleRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleRef7320); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2746:1: ruleSingleRef returns [EObject current=null] : (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '/>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2749:28: ( (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2750:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2750:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2750:3: otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '/>'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSingleRef7357); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleRefAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2754:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2756:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2756:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2757:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2760:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2761:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2761:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+
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
                else if ( LA56_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 2) ) {
                    alt56=3;
                }
                else if ( LA56_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 3) ) {
                    alt56=4;
                }
                else if ( LA56_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 4) ) {
                    alt56=5;
                }
                else if ( LA56_0 >=51 && LA56_0<=53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 5) ) {
                    alt56=6;
                }
                else if ( LA56_0 ==62 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 6) ) {
                    alt56=7;
                }


                switch (alt56) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2763:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2763:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2764:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2764:106: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2765:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2768:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2768:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2768:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2768:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingleRef7415); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSingleRefAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2772:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2773:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2773:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2774:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleRefAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleRef7436);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7448); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2801:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2801:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2802:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2802:106: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2803:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2806:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2806:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2806:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2806:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingleRef7516); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSingleRefAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2810:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_STRING)) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2811:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2811:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2812:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleRefAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleRef7537);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7550); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2839:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2839:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2840:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2840:106: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2841:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2844:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2844:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2844:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2844:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSingleRef7618); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSingleRefAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2848:1: ( (lv_name_9_0= RULE_ID ) )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==RULE_ID) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2849:1: (lv_name_9_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2849:1: (lv_name_9_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2850:3: lv_name_9_0= RULE_ID
            	            {
            	            lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingleRef7635); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7653); 

            	        	newLeafNode(otherlv_10, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2877:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2877:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2878:5: {...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2878:106: ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2879:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2882:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2882:7: {...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2882:16: (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2882:18: otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingleRef7721); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSingleRefAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2886:1: ( (lv_dependsOn_12_0= ruleDEP_ID ) )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==RULE_ID||LA53_0==RULE_FQN) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2887:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2887:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2888:3: lv_dependsOn_12_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleRefAccess().getDependsOnDEP_IDParserRuleCall_1_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleSingleRef7742);
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

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7755); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2915:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2915:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2916:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2916:106: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2917:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2920:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2920:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2920:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2921:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2921:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2922:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSingleRef7828); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2942:4: ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2942:4: ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2943:5: {...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2943:106: ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2944:6: ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2947:6: ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2947:7: {...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2947:16: ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) )
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( ((LA55_0>=51 && LA55_0<=52)) ) {
            	        alt55=1;
            	    }
            	    else if ( (LA55_0==53) ) {
            	        alt55=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2947:17: ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2947:17: ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2948:1: ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2948:1: ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2949:1: (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2949:1: (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' )
            	            int alt54=2;
            	            int LA54_0 = input.LA(1);

            	            if ( (LA54_0==51) ) {
            	                alt54=1;
            	            }
            	            else if ( (LA54_0==52) ) {
            	                alt54=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 54, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt54) {
            	                case 1 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2950:3: lv_other_15_1= 'other'
            	                    {
            	                    lv_other_15_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSingleRef7916); 

            	                            newLeafNode(lv_other_15_1, grammarAccess.getSingleRefAccess().getOtherOtherKeyword_1_5_0_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getSingleRefRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "other", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2962:8: lv_other_15_2= 'other=\"\"'
            	                    {
            	                    lv_other_15_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleSingleRef7945); 

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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2978:6: (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2978:6: (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2978:8: otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"'
            	            {
            	            otherlv_16=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSingleRef7980); 

            	                	newLeafNode(otherlv_16, grammarAccess.getSingleRefAccess().getOtherKeyword_1_5_1_0());
            	                
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2982:1: ( (lv_otherLabel_17_0= ruleEString ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2983:1: (lv_otherLabel_17_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2983:1: (lv_otherLabel_17_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2984:3: lv_otherLabel_17_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleRefAccess().getOtherLabelEStringParserRuleCall_1_5_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleRef8001);
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

            	            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef8013); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3011:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3011:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3012:5: {...}? => ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3012:106: ( ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3013:6: ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3016:6: ({...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3016:7: {...}? => ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3016:16: ( (lv_options_19_0= ruleAnswerTemplateRefAttr ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3017:1: (lv_options_19_0= ruleAnswerTemplateRefAttr )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3017:1: (lv_options_19_0= ruleAnswerTemplateRefAttr )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3018:3: lv_options_19_0= ruleAnswerTemplateRefAttr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleRefAccess().getOptionsAnswerTemplateRefAttrParserRuleCall_1_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRefAttr_in_ruleSingleRef8090);
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

            otherlv_20=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSingleRef8148); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3061:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3062:2: (iv_ruleMultiple= ruleMultiple EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3063:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_entryRuleMultiple8184);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiple8194); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3070:1: ruleMultiple returns [EObject current=null] : (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef ) ;
    public final EObject ruleMultiple() throws RecognitionException {
        EObject current = null;

        EObject this_MultipleWithOptions_0 = null;

        EObject this_MultipleRef_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3073:28: ( (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3074:1: (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3074:1: (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef )
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3075:5: this_MultipleWithOptions_0= ruleMultipleWithOptions
                    {
                     
                            newCompositeNode(grammarAccess.getMultipleAccess().getMultipleWithOptionsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleWithOptions_in_ruleMultiple8241);
                    this_MultipleWithOptions_0=ruleMultipleWithOptions();

                    state._fsp--;

                     
                            current = this_MultipleWithOptions_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3085:5: this_MultipleRef_1= ruleMultipleRef
                    {
                     
                            newCompositeNode(grammarAccess.getMultipleAccess().getMultipleRefParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleRef_in_ruleMultiple8268);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3101:1: entryRuleMultipleWithOptions returns [EObject current=null] : iv_ruleMultipleWithOptions= ruleMultipleWithOptions EOF ;
    public final EObject entryRuleMultipleWithOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleWithOptions = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3102:2: (iv_ruleMultipleWithOptions= ruleMultipleWithOptions EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3103:2: iv_ruleMultipleWithOptions= ruleMultipleWithOptions EOF
            {
             newCompositeNode(grammarAccess.getMultipleWithOptionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleWithOptions_in_entryRuleMultipleWithOptions8303);
            iv_ruleMultipleWithOptions=ruleMultipleWithOptions();

            state._fsp--;

             current =iv_ruleMultipleWithOptions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleWithOptions8313); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3110:1: ruleMultipleWithOptions returns [EObject current=null] : (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '>' ( (lv_options_24_0= ruleOption ) )+ otherlv_25= '</multiple>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3113:28: ( (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '>' ( (lv_options_24_0= ruleOption ) )+ otherlv_25= '</multiple>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3114:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '>' ( (lv_options_24_0= ruleOption ) )+ otherlv_25= '</multiple>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3114:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '>' ( (lv_options_24_0= ruleOption ) )+ otherlv_25= '</multiple>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3114:3: otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '>' ( (lv_options_24_0= ruleOption ) )+ otherlv_25= '</multiple>'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMultipleWithOptions8350); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleWithOptionsAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3118:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3120:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3120:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3121:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3124:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3125:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3125:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=10;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3127:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3127:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3128:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3128:116: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3129:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3132:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3132:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3132:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3132:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleWithOptions8408); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultipleWithOptionsAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3136:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3137:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3137:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3138:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleWithOptions8429);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8441); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3165:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3165:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3166:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3166:116: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3167:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3170:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3170:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3170:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3170:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleWithOptions8509); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultipleWithOptionsAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3174:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_STRING)) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3175:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3175:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3176:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleWithOptions8530);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8543); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3203:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3203:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3204:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3204:116: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3205:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3208:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3208:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3208:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3208:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleWithOptions8611); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMultipleWithOptionsAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3212:1: ( (lv_name_9_0= RULE_ID ) )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==RULE_ID) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3213:1: (lv_name_9_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3213:1: (lv_name_9_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3214:3: lv_name_9_0= RULE_ID
            	            {
            	            lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleWithOptions8628); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8646); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3241:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3241:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3242:5: {...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3242:116: ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3243:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3246:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3246:7: {...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3246:16: (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3246:18: otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultipleWithOptions8714); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMultipleWithOptionsAccess().getMinKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3250:1: ( (lv_min_12_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3251:1: (lv_min_12_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3251:1: (lv_min_12_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3252:3: lv_min_12_0= RULE_INT
            	    {
            	    lv_min_12_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultipleWithOptions8731); 

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

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8748); 

            	        	newLeafNode(otherlv_13, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3279:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3279:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3280:5: {...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3280:116: ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3281:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3284:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3284:7: {...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3284:16: (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3284:18: otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"'
            	    {
            	    otherlv_14=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMultipleWithOptions8816); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMultipleWithOptionsAccess().getMaxKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3288:1: ( (lv_max_15_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3289:1: (lv_max_15_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3289:1: (lv_max_15_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3290:3: lv_max_15_0= RULE_INT
            	    {
            	    lv_max_15_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultipleWithOptions8833); 

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

            	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8850); 

            	        	newLeafNode(otherlv_16, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3317:4: ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3317:4: ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3318:5: {...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3318:116: ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3319:6: ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3322:6: ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3322:7: {...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3322:16: (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3322:18: otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"'
            	    {
            	    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleWithOptions8918); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMultipleWithOptionsAccess().getDependsOnKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3326:1: ( (lv_dependsOn_18_0= ruleDEP_ID ) )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==RULE_ID||LA60_0==RULE_FQN) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3327:1: (lv_dependsOn_18_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3327:1: (lv_dependsOn_18_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3328:3: lv_dependsOn_18_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getDependsOnDEP_IDParserRuleCall_1_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleMultipleWithOptions8939);
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

            	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8952); 

            	        	newLeafNode(otherlv_19, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3355:4: ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3355:4: ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3356:5: {...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3356:116: ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3357:6: ({...}? => ( (lv_required_20_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3360:6: ({...}? => ( (lv_required_20_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3360:7: {...}? => ( (lv_required_20_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3360:16: ( (lv_required_20_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3361:1: (lv_required_20_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3361:1: (lv_required_20_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3362:3: lv_required_20_0= 'required'
            	    {
            	    lv_required_20_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultipleWithOptions9025); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3382:4: ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3382:4: ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3383:5: {...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3383:116: ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3384:6: ({...}? => ( (lv_other_21_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3387:6: ({...}? => ( (lv_other_21_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3387:7: {...}? => ( (lv_other_21_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3387:16: ( (lv_other_21_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3388:1: (lv_other_21_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3388:1: (lv_other_21_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3389:3: lv_other_21_0= 'other'
            	    {
            	    lv_other_21_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleMultipleWithOptions9110); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3409:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3409:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3410:5: {...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3410:116: ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3411:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3414:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3414:7: {...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3414:16: ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3416:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3416:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    int alt61=3;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt61=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt61=2;
            	        }
            	        break;
            	    case 45:
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3417:3: lv_showLimits_22_1= 'show-limits'
            	            {
            	            lv_showLimits_22_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMultipleWithOptions9197); 

            	                    newLeafNode(lv_showLimits_22_1, grammarAccess.getMultipleWithOptionsAccess().getShowLimitsShowLimitsKeyword_1_8_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3429:8: lv_showLimits_22_2= 'show'
            	            {
            	            lv_showLimits_22_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMultipleWithOptions9226); 

            	                    newLeafNode(lv_showLimits_22_2, grammarAccess.getMultipleWithOptionsAccess().getShowLimitsShowKeyword_1_8_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3441:8: lv_showLimits_22_3= 'limits'
            	            {
            	            lv_showLimits_22_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMultipleWithOptions9255); 

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

            otherlv_23=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultipleWithOptions9329); 

                	newLeafNode(otherlv_23, grammarAccess.getMultipleWithOptionsAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3475:1: ( (lv_options_24_0= ruleOption ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==20||LA63_0==23) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3476:1: (lv_options_24_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3476:1: (lv_options_24_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3477:3: lv_options_24_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultipleWithOptions9350);
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

            otherlv_25=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMultipleWithOptions9363); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3505:1: entryRuleMultipleRef returns [EObject current=null] : iv_ruleMultipleRef= ruleMultipleRef EOF ;
    public final EObject entryRuleMultipleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3506:2: (iv_ruleMultipleRef= ruleMultipleRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3507:2: iv_ruleMultipleRef= ruleMultipleRef EOF
            {
             newCompositeNode(grammarAccess.getMultipleRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleRef_in_entryRuleMultipleRef9399);
            iv_ruleMultipleRef=ruleMultipleRef();

            state._fsp--;

             current =iv_ruleMultipleRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleRef9409); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3514:1: ruleMultipleRef returns [EObject current=null] : (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3517:28: ( (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3518:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3518:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3518:3: otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMultipleRef9446); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleRefAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3522:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3524:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3524:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3525:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3528:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3529:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3529:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=11;
                alt68 = dfa68.predict(input);
                switch (alt68) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3531:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3531:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3532:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3532:108: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3533:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3536:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3536:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3536:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3536:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleRef9504); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultipleRefAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3540:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3541:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3541:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3542:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleRefAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleRef9525);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9537); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3569:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3569:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3570:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3570:108: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3571:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3574:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3574:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3574:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3574:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleRef9605); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultipleRefAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3578:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_STRING)) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3579:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3579:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3580:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleRefAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleRef9626);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9639); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3607:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3607:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3608:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3608:108: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3609:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3612:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3612:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3612:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3612:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleRef9707); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMultipleRefAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3616:1: ( (lv_name_9_0= RULE_ID ) )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==RULE_ID) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3617:1: (lv_name_9_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3617:1: (lv_name_9_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3618:3: lv_name_9_0= RULE_ID
            	            {
            	            lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleRef9724); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9742); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3645:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3645:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3646:5: {...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3646:108: ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3647:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3650:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3650:7: {...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3650:16: (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3650:18: otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultipleRef9810); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMultipleRefAccess().getMinKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3654:1: ( (lv_min_12_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3655:1: (lv_min_12_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3655:1: (lv_min_12_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3656:3: lv_min_12_0= RULE_INT
            	    {
            	    lv_min_12_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultipleRef9827); 

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

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9844); 

            	        	newLeafNode(otherlv_13, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3683:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3683:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3684:5: {...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3684:108: ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3685:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3688:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3688:7: {...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3688:16: (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3688:18: otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"'
            	    {
            	    otherlv_14=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMultipleRef9912); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMultipleRefAccess().getMaxKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3692:1: ( (lv_max_15_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3693:1: (lv_max_15_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3693:1: (lv_max_15_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3694:3: lv_max_15_0= RULE_INT
            	    {
            	    lv_max_15_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultipleRef9929); 

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

            	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9946); 

            	        	newLeafNode(otherlv_16, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3721:4: ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3721:4: ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3722:5: {...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3722:108: ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3723:6: ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3726:6: ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3726:7: {...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3726:16: (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3726:18: otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"'
            	    {
            	    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleRef10014); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMultipleRefAccess().getDependsOnKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3730:1: ( (lv_dependsOn_18_0= ruleDEP_ID ) )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==RULE_ID||LA66_0==RULE_FQN) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3731:1: (lv_dependsOn_18_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3731:1: (lv_dependsOn_18_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3732:3: lv_dependsOn_18_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleRefAccess().getDependsOnDEP_IDParserRuleCall_1_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleMultipleRef10035);
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

            	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef10048); 

            	        	newLeafNode(otherlv_19, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3759:4: ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3759:4: ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3760:5: {...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3760:108: ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3761:6: ({...}? => ( (lv_required_20_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3764:6: ({...}? => ( (lv_required_20_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3764:7: {...}? => ( (lv_required_20_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3764:16: ( (lv_required_20_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3765:1: (lv_required_20_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3765:1: (lv_required_20_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3766:3: lv_required_20_0= 'required'
            	    {
            	    lv_required_20_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultipleRef10121); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3786:4: ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3786:4: ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3787:5: {...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3787:108: ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3788:6: ({...}? => ( (lv_other_21_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3791:6: ({...}? => ( (lv_other_21_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3791:7: {...}? => ( (lv_other_21_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3791:16: ( (lv_other_21_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3792:1: (lv_other_21_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3792:1: (lv_other_21_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3793:3: lv_other_21_0= 'other'
            	    {
            	    lv_other_21_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleMultipleRef10206); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3813:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3813:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3814:5: {...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3814:108: ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3815:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3818:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3818:7: {...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3818:16: ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3819:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3819:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3820:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3820:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    int alt67=3;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt67=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt67=2;
            	        }
            	        break;
            	    case 45:
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3821:3: lv_showLimits_22_1= 'show-limits'
            	            {
            	            lv_showLimits_22_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMultipleRef10293); 

            	                    newLeafNode(lv_showLimits_22_1, grammarAccess.getMultipleRefAccess().getShowLimitsShowLimitsKeyword_1_8_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3833:8: lv_showLimits_22_2= 'show'
            	            {
            	            lv_showLimits_22_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMultipleRef10322); 

            	                    newLeafNode(lv_showLimits_22_2, grammarAccess.getMultipleRefAccess().getShowLimitsShowKeyword_1_8_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3845:8: lv_showLimits_22_3= 'limits'
            	            {
            	            lv_showLimits_22_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMultipleRef10351); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3867:4: ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3867:4: ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3868:5: {...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 9)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3868:108: ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3869:6: ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 9);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3872:6: ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3872:7: {...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3872:16: ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3873:1: (lv_options_23_0= ruleAnswerTemplateRefAttr )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3873:1: (lv_options_23_0= ruleAnswerTemplateRefAttr )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3874:3: lv_options_23_0= ruleAnswerTemplateRefAttr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleRefAccess().getOptionsAnswerTemplateRefAttrParserRuleCall_1_9_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRefAttr_in_ruleMultipleRef10442);
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

            otherlv_24=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultipleRef10500); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3917:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3918:2: (iv_ruleTable= ruleTable EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3919:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable10536);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable10546); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3926:1: ruleTable returns [EObject current=null] : (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_19_0= ruleOption ) ) | ( (lv_questions_20_0= ruleTableQuestion ) ) )* otherlv_21= '</table>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3929:28: ( (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_19_0= ruleOption ) ) | ( (lv_questions_20_0= ruleTableQuestion ) ) )* otherlv_21= '</table>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3930:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_19_0= ruleOption ) ) | ( (lv_questions_20_0= ruleTableQuestion ) ) )* otherlv_21= '</table>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3930:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_19_0= ruleOption ) ) | ( (lv_questions_20_0= ruleTableQuestion ) ) )* otherlv_21= '</table>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3930:3: otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_19_0= ruleOption ) ) | ( (lv_questions_20_0= ruleTableQuestion ) ) )* otherlv_21= '</table>'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTable10583); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3934:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3936:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3936:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3937:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3940:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3941:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3941:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) ) )*
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
                else if ( LA73_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
                    alt73=3;
                }
                else if ( LA73_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
                    alt73=4;
                }
                else if ( LA73_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
                    alt73=5;
                }
                else if ( (LA73_0==31||LA73_0==58) && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
                    alt73=6;
                }


                switch (alt73) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3943:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3943:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3944:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3944:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3945:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3948:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3948:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3948:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3948:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable10641); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3952:1: ( (lv_title_3_0= ruleEString ) )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_STRING)) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3953:1: (lv_title_3_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3953:1: (lv_title_3_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3954:3: lv_title_3_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable10662);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable10675); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3981:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3981:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3982:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3982:102: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3983:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3986:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3986:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3986:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3986:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable10743); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3990:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_STRING)) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3991:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3991:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3992:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTableAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable10764);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable10777); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4019:4: ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4019:4: ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4020:5: {...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4020:102: ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4021:6: ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4024:6: ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4024:7: {...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4024:16: (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4024:18: otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTable10845); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTableAccess().getDependsOnKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4028:1: ( (lv_dependsOn_9_0= ruleDEP_ID ) )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==RULE_ID||LA71_0==RULE_FQN) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4029:1: (lv_dependsOn_9_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4029:1: (lv_dependsOn_9_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4030:3: lv_dependsOn_9_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTableAccess().getDependsOnDEP_IDParserRuleCall_1_2_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleTable10866);
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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable10879); 

            	        	newLeafNode(otherlv_10, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4057:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4057:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4058:5: {...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4058:102: ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4059:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4062:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4062:7: {...}? => ( (lv_required_11_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4062:16: ( (lv_required_11_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4063:1: (lv_required_11_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4063:1: (lv_required_11_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4064:3: lv_required_11_0= 'required'
            	    {
            	    lv_required_11_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTable10952); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4084:4: ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4084:4: ({...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4085:5: {...}? => ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4085:102: ( ({...}? => ( (lv_other_12_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4086:6: ({...}? => ( (lv_other_12_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4089:6: ({...}? => ( (lv_other_12_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4089:7: {...}? => ( (lv_other_12_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4089:16: ( (lv_other_12_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4090:1: (lv_other_12_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4090:1: (lv_other_12_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4091:3: lv_other_12_0= 'other'
            	    {
            	    lv_other_12_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTable11037); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4111:4: ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4111:4: ({...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4112:5: {...}? => ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4112:102: ( ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4113:6: ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4116:6: ({...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4116:7: {...}? => (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4116:16: (otherlv_13= 'single' | ( (lv_multiple_14_0= 'multiple' ) ) )
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==31) ) {
            	        alt72=1;
            	    }
            	    else if ( (LA72_0==58) ) {
            	        alt72=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 72, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4116:18: otherlv_13= 'single'
            	            {
            	            otherlv_13=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTable11117); 

            	                	newLeafNode(otherlv_13, grammarAccess.getTableAccess().getSingleKeyword_1_5_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4121:6: ( (lv_multiple_14_0= 'multiple' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4121:6: ( (lv_multiple_14_0= 'multiple' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4122:1: (lv_multiple_14_0= 'multiple' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4122:1: (lv_multiple_14_0= 'multiple' )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4123:3: lv_multiple_14_0= 'multiple'
            	            {
            	            lv_multiple_14_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTable11141); 

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

            otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTable11207); 

                	newLeafNode(otherlv_15, grammarAccess.getTableAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4154:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4156:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4156:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4157:2: ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4160:2: ( ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4161:3: ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4161:3: ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+
            int cnt76=0;
            loop76:
            do {
                int alt76=3;
                alt76 = dfa76.predict(input);
                switch (alt76) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4163:4: ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4163:4: ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4164:5: {...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4164:102: ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4165:6: ({...}? => ( (lv_options_17_0= ruleOption ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4168:6: ({...}? => ( (lv_options_17_0= ruleOption ) ) )+
            	    int cnt74=0;
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==20) ) {
            	            int LA74_1 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt74=1;
            	            }


            	        }
            	        else if ( (LA74_0==23) ) {
            	            int LA74_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt74=1;
            	            }


            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4168:7: {...}? => ( (lv_options_17_0= ruleOption ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4168:16: ( (lv_options_17_0= ruleOption ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4169:1: (lv_options_17_0= ruleOption )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4169:1: (lv_options_17_0= ruleOption )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4170:3: lv_options_17_0= ruleOption
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_3_0_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable11273);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4193:4: ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4193:4: ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4194:5: {...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4194:102: ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4195:6: ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4198:6: ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+
            	    int cnt75=0;
            	    loop75:
            	    do {
            	        int alt75=2;
            	        int LA75_0 = input.LA(1);

            	        if ( (LA75_0==63) ) {
            	            int LA75_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt75=1;
            	            }


            	        }


            	        switch (alt75) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4198:7: {...}? => ( (lv_questions_18_0= ruleTableQuestion ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4198:16: ( (lv_questions_18_0= ruleTableQuestion ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4199:1: (lv_questions_18_0= ruleTableQuestion )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4199:1: (lv_questions_18_0= ruleTableQuestion )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4200:3: lv_questions_18_0= ruleTableQuestion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable11349);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4231:2: ( ( (lv_options_19_0= ruleOption ) ) | ( (lv_questions_20_0= ruleTableQuestion ) ) )*
            loop77:
            do {
                int alt77=3;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==20||LA77_0==23) ) {
                    alt77=1;
                }
                else if ( (LA77_0==63) ) {
                    alt77=2;
                }


                switch (alt77) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4231:3: ( (lv_options_19_0= ruleOption ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4231:3: ( (lv_options_19_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4232:1: (lv_options_19_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4232:1: (lv_options_19_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4233:3: lv_options_19_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable11418);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4250:6: ( (lv_questions_20_0= ruleTableQuestion ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4250:6: ( (lv_questions_20_0= ruleTableQuestion ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4251:1: (lv_questions_20_0= ruleTableQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4251:1: (lv_questions_20_0= ruleTableQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4252:3: lv_questions_20_0= ruleTableQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable11445);
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

            otherlv_21=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTable11459); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4280:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4281:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4282:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt11496);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt11507); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4289:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4292:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4293:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4293:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4293:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4293:2: (kw= '-' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==60) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4294:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEInt11546); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt11563); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4314:1: entryRuleAnswerTemplateRef returns [EObject current=null] : iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF ;
    public final EObject entryRuleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplateRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4315:2: (iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4316:2: iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef11608);
            iv_ruleAnswerTemplateRef=ruleAnswerTemplateRef();

            state._fsp--;

             current =iv_ruleAnswerTemplateRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplateRef11618); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4323:1: ruleAnswerTemplateRef returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' ) ;
    public final EObject ruleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4326:28: ( (otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4327:1: (otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4327:1: (otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4327:3: otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswerTemplateRef11655); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateRefAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleAnswerTemplateRef11667); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateRefAccess().getRefKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4335:1: ( (otherlv_2= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4336:1: (otherlv_2= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4336:1: (otherlv_2= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4337:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRefRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplateRef11687); 

            		newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateRefAccess().getTemplateAnswerTemplateCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswerTemplateRef11699); 

                	newLeafNode(otherlv_3, grammarAccess.getAnswerTemplateRefAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAnswerTemplateRef11711); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4364:1: entryRuleAnswerTemplateRefAttr returns [EObject current=null] : iv_ruleAnswerTemplateRefAttr= ruleAnswerTemplateRefAttr EOF ;
    public final EObject entryRuleAnswerTemplateRefAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplateRefAttr = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4365:2: (iv_ruleAnswerTemplateRefAttr= ruleAnswerTemplateRefAttr EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4366:2: iv_ruleAnswerTemplateRefAttr= ruleAnswerTemplateRefAttr EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRefAttrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRefAttr_in_entryRuleAnswerTemplateRefAttr11747);
            iv_ruleAnswerTemplateRefAttr=ruleAnswerTemplateRefAttr();

            state._fsp--;

             current =iv_ruleAnswerTemplateRefAttr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplateRefAttr11757); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4373:1: ruleAnswerTemplateRefAttr returns [EObject current=null] : (otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' ) ;
    public final EObject ruleAnswerTemplateRefAttr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4376:28: ( (otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4377:1: (otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4377:1: (otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4377:3: otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"'
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleAnswerTemplateRefAttr11794); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateRefAttrAccess().getTemplateKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4381:1: ( (otherlv_1= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4382:1: (otherlv_1= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4382:1: (otherlv_1= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4383:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRefAttrRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplateRefAttr11814); 

            		newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateRefAttrAccess().getTemplateAnswerTemplateCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswerTemplateRefAttr11826); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4406:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4407:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4408:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion11862);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion11872); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4415:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= '<q' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_6= '>' ( (lv_title_7_0= ruleEString ) ) otherlv_8= '</q>' ) ;
    public final EObject ruleTableQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_required_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_title_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4418:28: ( (otherlv_0= '<q' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_6= '>' ( (lv_title_7_0= ruleEString ) ) otherlv_8= '</q>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4419:1: (otherlv_0= '<q' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_6= '>' ( (lv_title_7_0= ruleEString ) ) otherlv_8= '</q>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4419:1: (otherlv_0= '<q' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_6= '>' ( (lv_title_7_0= ruleEString ) ) otherlv_8= '</q>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4419:3: otherlv_0= '<q' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_6= '>' ( (lv_title_7_0= ruleEString ) ) otherlv_8= '</q>'
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleTableQuestion11909); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4423:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4425:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4425:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4426:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4429:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4430:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4430:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )*
            loop80:
            do {
                int alt80=3;
                int LA80_0 = input.LA(1);

                if ( LA80_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 0) ) {
                    alt80=1;
                }
                else if ( LA80_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 1) ) {
                    alt80=2;
                }


                switch (alt80) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4432:4: ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4432:4: ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4433:5: {...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTableQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4433:110: ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4434:6: ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4437:6: ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4437:7: {...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTableQuestion", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4437:16: (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4437:18: otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTableQuestion11967); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTableQuestionAccess().getIdKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4441:1: ( (lv_name_3_0= RULE_ID ) )?
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);

            	    if ( (LA79_0==RULE_ID) ) {
            	        alt79=1;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4442:1: (lv_name_3_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4442:1: (lv_name_3_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4443:3: lv_name_3_0= RULE_ID
            	            {
            	            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTableQuestion11984); 

            	            			newLeafNode(lv_name_3_0, grammarAccess.getTableQuestionAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTableQuestionRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"name",
            	                    		lv_name_3_0, 
            	                    		"ID");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTableQuestion12002); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTableQuestionAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4470:4: ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4470:4: ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4471:5: {...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTableQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4471:110: ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4472:6: ({...}? => ( (lv_required_5_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4475:6: ({...}? => ( (lv_required_5_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4475:7: {...}? => ( (lv_required_5_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTableQuestion", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4475:16: ( (lv_required_5_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4476:1: (lv_required_5_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4476:1: (lv_required_5_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4477:3: lv_required_5_0= 'required'
            	    {
            	    lv_required_5_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTableQuestion12075); 

            	            newLeafNode(lv_required_5_0, grammarAccess.getTableQuestionAccess().getRequiredRequiredKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableQuestionRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1());
            	

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTableQuestion12140); 

                	newLeafNode(otherlv_6, grammarAccess.getTableQuestionAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4508:1: ( (lv_title_7_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4509:1: (lv_title_7_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4509:1: (lv_title_7_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4510:3: lv_title_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getTitleEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTableQuestion12161);
            lv_title_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_7_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleTableQuestion12173); 

                	newLeafNode(otherlv_8, grammarAccess.getTableQuestionAccess().getQKeyword_4());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4538:1: entryRuleDEP_ID returns [String current=null] : iv_ruleDEP_ID= ruleDEP_ID EOF ;
    public final String entryRuleDEP_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDEP_ID = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4539:2: (iv_ruleDEP_ID= ruleDEP_ID EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4540:2: iv_ruleDEP_ID= ruleDEP_ID EOF
            {
             newCompositeNode(grammarAccess.getDEP_IDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_entryRuleDEP_ID12210);
            iv_ruleDEP_ID=ruleDEP_ID();

            state._fsp--;

             current =iv_ruleDEP_ID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDEP_ID12221); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4547:1: ruleDEP_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN ) ;
    public final AntlrDatatypeRuleToken ruleDEP_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_FQN_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4550:28: ( (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4551:1: (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4551:1: (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN )
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4551:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDEP_ID12261); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getDEP_IDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4559:10: this_FQN_1= RULE_FQN
                    {
                    this_FQN_1=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleDEP_ID12287); 

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
        "\1\47\12\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA30_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\2\1\uffff\1\3\5\uffff\1\4\4\uffff\1\11\1\12\6\uffff\1\1\1"+
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
            return "()+ loopback of 1225:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+";
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
                        if ( (LA30_0==34) ) {s = 1;}

                        else if ( LA30_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA30_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA30_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA30_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA30_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA30_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA30_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA30_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA30_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
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
        "\1\60\14\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA37_specialS =
        "\1\0\14\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\2\1\uffff\1\3\5\uffff\1\4\4\uffff\1\7\1\11\6\uffff\1\1\6"+
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
            return "()+ loopback of 1608:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+";
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
                        if ( (LA37_0==34) ) {s = 1;}

                        else if ( LA37_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA37_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA37_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA37_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA37_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA37_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA37_0 >=43 && LA37_0<=45 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA37_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA37_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA37_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA37_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                         
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
        "\1\55\11\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA42_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\2\1\uffff\1\3\5\uffff\1\4\4\uffff\1\7\1\10\6\uffff\1\1\1"+
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
            return "()+ loopback of 2050:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+";
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
                        if ( (LA42_0==34) ) {s = 1;}

                        else if ( LA42_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA42_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA42_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA42_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA42_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA42_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA42_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA42_0 >=43 && LA42_0<=45 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
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
        "\1\62\1\15\4\4\3\15\1\4\1\uffff\4\16\1\15\1\16\1\15\2\16\1\15\1"+
        "\uffff\2\16\2\15";
    static final String DFA43_maxS =
        "\1\62\1\76\1\5\3\16\3\76\1\5\1\uffff\4\16\1\76\1\16\1\76\2\16\1"+
        "\76\1\uffff\2\16\2\76";
    static final String DFA43_acceptS =
        "\12\uffff\1\2\12\uffff\1\1\4\uffff";
    static final String DFA43_specialS =
        "\32\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1",
            "\1\2\1\uffff\1\3\5\uffff\1\4\4\uffff\1\5\1\6\27\uffff\1\7\1"+
            "\10\1\11\10\uffff\1\12",
            "\1\14\1\13",
            "\1\16\1\15\10\uffff\1\17",
            "\1\20\11\uffff\1\21",
            "\1\22\2\uffff\1\23\6\uffff\1\24",
            "\1\2\1\uffff\1\3\2\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "\1\2\1\uffff\1\3\2\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "\1\2\1\uffff\1\3\2\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "\1\27\1\26",
            "",
            "\1\30",
            "\1\30",
            "\1\17",
            "\1\17",
            "\1\2\1\uffff\1\3\2\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "\1\21",
            "\1\2\1\uffff\1\3\2\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "\1\24",
            "\1\24",
            "\1\2\1\uffff\1\3\2\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "",
            "\1\31",
            "\1\31",
            "\1\2\1\uffff\1\3\2\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\12\20\uffff\1\7\1\10\1\11\10\uffff\1\12",
            "\1\2\1\uffff\1\3\2\uffff\1\25\2\uffff\1\4\4\uffff\1\5\1\6\6"+
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
            return "2394:1: (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef )";
        }
    }
    static final String DFA57_eotS =
        "\36\uffff";
    static final String DFA57_eofS =
        "\36\uffff";
    static final String DFA57_minS =
        "\1\67\1\15\3\4\2\6\1\4\5\15\1\uffff\4\16\1\15\1\16\1\15\4\16\1\15"+
        "\1\uffff\3\15";
    static final String DFA57_maxS =
        "\1\67\1\76\1\5\2\16\2\6\1\16\5\76\1\uffff\4\16\1\76\1\16\1\76\4"+
        "\16\1\76\1\uffff\3\76";
    static final String DFA57_acceptS =
        "\15\uffff\1\2\14\uffff\1\1\3\uffff";
    static final String DFA57_specialS =
        "\36\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1",
            "\1\2\1\uffff\1\3\5\uffff\1\4\4\uffff\1\7\1\10\10\uffff\1\5"+
            "\1\6\5\uffff\1\12\1\13\1\14\5\uffff\1\11\12\uffff\1\15",
            "\1\17\1\16",
            "\1\21\1\20\10\uffff\1\22",
            "\1\23\11\uffff\1\24",
            "\1\25",
            "\1\26",
            "\1\27\2\uffff\1\30\6\uffff\1\31",
            "\1\2\1\uffff\1\3\2\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\2\1\uffff\1\3\2\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\2\1\uffff\1\3\2\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\2\1\uffff\1\3\2\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\2\1\uffff\1\3\2\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "",
            "\1\33",
            "\1\33",
            "\1\22",
            "\1\22",
            "\1\2\1\uffff\1\3\2\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\24",
            "\1\2\1\uffff\1\3\2\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\34",
            "\1\35",
            "\1\31",
            "\1\31",
            "\1\2\1\uffff\1\3\2\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "",
            "\1\2\1\uffff\1\3\2\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\2\1\uffff\1\3\2\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\15\1\uffff\1\5\1\6\5\uffff\1\12\1\13\1\14\5\uffff"+
            "\1\11\12\uffff\1\15",
            "\1\2\1\uffff\1\3\2\uffff\1\32\2\uffff\1\4\4\uffff\1\7\1\10"+
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
            return "3074:1: (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef )";
        }
    }
    static final String DFA62_eotS =
        "\13\uffff";
    static final String DFA62_eofS =
        "\13\uffff";
    static final String DFA62_minS =
        "\1\15\12\uffff";
    static final String DFA62_maxS =
        "\1\63\12\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA62_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\2\1\uffff\1\3\2\uffff\1\1\2\uffff\1\4\4\uffff\1\7\1\10\10"+
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
            return "()+ loopback of 3125:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+";
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
                        if ( (LA62_0==18) ) {s = 1;}

                        else if ( LA62_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA62_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA62_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA62_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA62_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA62_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA62_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA62_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA62_0 >=43 && LA62_0<=45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
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
        "\1\76\13\uffff";
    static final String DFA68_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA68_specialS =
        "\1\0\13\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\2\1\uffff\1\3\5\uffff\1\4\4\uffff\1\7\1\10\6\uffff\1\1\1"+
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
            return "()+ loopback of 3529:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_21_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_23_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+";
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
                        if ( (LA68_0==34) ) {s = 1;}

                        else if ( LA68_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA68_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA68_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA68_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA68_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA68_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA68_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA68_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA68_0 >=43 && LA68_0<=45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                        else if ( LA68_0 ==62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 9) ) {s = 11;}

                         
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
        "\32\uffff";
    static final String DFA76_eofS =
        "\32\uffff";
    static final String DFA76_minS =
        "\1\24\1\75\2\22\1\uffff\4\4\1\22\1\4\2\16\1\22\2\30\1\16\1\22\2"+
        "\100\1\42\3\0\2\uffff";
    static final String DFA76_maxS =
        "\1\77\1\75\1\25\1\33\1\uffff\1\4\1\16\1\5\1\16\1\33\1\5\2\16\1\22"+
        "\2\30\1\16\1\33\2\100\1\42\3\0\2\uffff";
    static final String DFA76_acceptS =
        "\4\uffff\1\3\23\uffff\1\1\1\2";
    static final String DFA76_specialS =
        "\25\uffff\1\0\1\1\1\2\2\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\1\2\uffff\1\2\43\uffff\1\4\3\uffff\1\3",
            "\1\5",
            "\1\7\2\uffff\1\6",
            "\1\12\2\uffff\1\10\5\uffff\1\11",
            "",
            "\1\13",
            "\1\14\11\uffff\1\15",
            "\1\17\1\16",
            "\1\20\11\uffff\1\21",
            "\1\12\2\uffff\1\10\5\uffff\1\11",
            "\1\23\1\22",
            "\1\24",
            "\1\15",
            "\1\7",
            "\1\25",
            "\1\25",
            "\1\21",
            "\1\12\2\uffff\1\10\5\uffff\1\11",
            "\1\26",
            "\1\26",
            "\1\27",
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
            return "()+ loopback of 4161:3: ( ({...}? => ( ({...}? => ( (lv_options_17_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_18_0= ruleTableQuestion ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_21 = input.LA(1);

                         
                        int index76_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 24;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index76_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_22 = input.LA(1);

                         
                        int index76_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {s = 25;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index76_22);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_23 = input.LA(1);

                         
                        int index76_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 24;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index76_23);
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
        public static final BitSet FOLLOW_14_in_ruleSurvey224 = new BitSet(new long[]{0x000000000007A000L});
        public static final BitSet FOLLOW_15_in_ruleSurvey292 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey313 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey326 = new BitSet(new long[]{0x000000000007A000L});
        public static final BitSet FOLLOW_16_in_ruleSurvey394 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSurvey411 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey429 = new BitSet(new long[]{0x000000000007A000L});
        public static final BitSet FOLLOW_17_in_ruleSurvey497 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSurvey514 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey531 = new BitSet(new long[]{0x000000000007A000L});
        public static final BitSet FOLLOW_18_in_ruleSurvey590 = new BitSet(new long[]{0x0286010822180000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey612 = new BitSet(new long[]{0x0286010822180000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey639 = new BitSet(new long[]{0x0286010822180000L});
        public static final BitSet FOLLOW_19_in_ruleSurvey653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString692 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_entryRuleItem814 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItem824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleItem871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleItem898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion933 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleQuestion990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleQuestion1017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleQuestion1044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleQuestion1071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleQuestion1098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleQuestion1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleQuestion1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption1197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_ruleOption1244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleOption1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplate1316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAnswerTemplate1353 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnswerTemplate1365 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplate1382 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswerTemplate1399 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAnswerTemplate1411 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleAnswerTemplate1432 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleAnswerTemplate1445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleAnswer1528 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleAnswer1541 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswer1558 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswer1576 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAnswer1590 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1611 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleAnswer1623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1659 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup1669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleGroup1706 = new BitSet(new long[]{0x000000000C24A000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1764 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1785 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1798 = new BitSet(new long[]{0x000000000C24A000L});
        public static final BitSet FOLLOW_21_in_ruleGroup1866 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1887 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1900 = new BitSet(new long[]{0x000000000C24A000L});
        public static final BitSet FOLLOW_15_in_ruleGroup1968 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1989 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup2002 = new BitSet(new long[]{0x000000000C24A000L});
        public static final BitSet FOLLOW_26_in_ruleGroup2070 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleGroup2091 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup2104 = new BitSet(new long[]{0x000000000C24A000L});
        public static final BitSet FOLLOW_27_in_ruleGroup2177 = new BitSet(new long[]{0x000000000C24A000L});
        public static final BitSet FOLLOW_18_in_ruleGroup2242 = new BitSet(new long[]{0x0286010822000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup2263 = new BitSet(new long[]{0x0286010832000000L});
        public static final BitSet FOLLOW_28_in_ruleGroup2276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText2312 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText2322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleText2368 = new BitSet(new long[]{0x00000003CC20A000L});
        public static final BitSet FOLLOW_13_in_ruleText2426 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2447 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2459 = new BitSet(new long[]{0x00000007CC20A000L});
        public static final BitSet FOLLOW_15_in_ruleText2527 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2548 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2561 = new BitSet(new long[]{0x00000007CC20A000L});
        public static final BitSet FOLLOW_21_in_ruleText2629 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleText2646 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2664 = new BitSet(new long[]{0x00000007CC20A000L});
        public static final BitSet FOLLOW_26_in_ruleText2732 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleText2753 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2766 = new BitSet(new long[]{0x00000007CC20A000L});
        public static final BitSet FOLLOW_27_in_ruleText2839 = new BitSet(new long[]{0x00000007CC20A000L});
        public static final BitSet FOLLOW_30_in_ruleText2919 = new BitSet(new long[]{0x00000007CC20A000L});
        public static final BitSet FOLLOW_31_in_ruleText2937 = new BitSet(new long[]{0x00000007CC20A000L});
        public static final BitSet FOLLOW_32_in_ruleText2963 = new BitSet(new long[]{0x00000007CC20A000L});
        public static final BitSet FOLLOW_33_in_ruleText2992 = new BitSet(new long[]{0x00000007CC20A000L});
        public static final BitSet FOLLOW_34_in_ruleText3067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_entryRuleScale3103 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScale3113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleScale3150 = new BitSet(new long[]{0x000000F00C20A000L});
        public static final BitSet FOLLOW_13_in_ruleScale3208 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3229 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3241 = new BitSet(new long[]{0x000000F40C20A000L});
        public static final BitSet FOLLOW_15_in_ruleScale3309 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3330 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3343 = new BitSet(new long[]{0x000000F40C20A000L});
        public static final BitSet FOLLOW_21_in_ruleScale3411 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleScale3428 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3445 = new BitSet(new long[]{0x000000F40C20A000L});
        public static final BitSet FOLLOW_36_in_ruleScale3513 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3534 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3546 = new BitSet(new long[]{0x000000F40C20A000L});
        public static final BitSet FOLLOW_37_in_ruleScale3614 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3635 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3647 = new BitSet(new long[]{0x000000F40C20A000L});
        public static final BitSet FOLLOW_38_in_ruleScale3715 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3736 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3749 = new BitSet(new long[]{0x000000F40C20A000L});
        public static final BitSet FOLLOW_39_in_ruleScale3817 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3838 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3851 = new BitSet(new long[]{0x000000F40C20A000L});
        public static final BitSet FOLLOW_26_in_ruleScale3919 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleScale3940 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3953 = new BitSet(new long[]{0x000000F40C20A000L});
        public static final BitSet FOLLOW_27_in_ruleScale4026 = new BitSet(new long[]{0x000000F40C20A000L});
        public static final BitSet FOLLOW_34_in_ruleScale4097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate4133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate4143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleDate4189 = new BitSet(new long[]{0x0001FE000C20A000L});
        public static final BitSet FOLLOW_13_in_ruleDate4247 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4268 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4280 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_15_in_ruleDate4348 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4369 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4382 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_21_in_ruleDate4450 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDate4467 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4485 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_41_in_ruleDate4553 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4574 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4587 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_42_in_ruleDate4655 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4676 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4689 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_26_in_ruleDate4757 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleDate4778 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4791 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_43_in_ruleDate4866 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_44_in_ruleDate4895 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_45_in_ruleDate4924 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_27_in_ruleDate5012 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_46_in_ruleDate5097 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_47_in_ruleDate5182 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_48_in_ruleDate5267 = new BitSet(new long[]{0x0001FE040C20A000L});
        public static final BitSet FOLLOW_34_in_ruleDate5338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber5374 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber5384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleNumber5430 = new BitSet(new long[]{0x000038300C20A000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5488 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5509 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5521 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_15_in_ruleNumber5589 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5610 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5623 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_21_in_ruleNumber5691 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNumber5708 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5726 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_36_in_ruleNumber5794 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5815 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5827 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_37_in_ruleNumber5895 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5916 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5928 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_26_in_ruleNumber5996 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleNumber6017 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber6030 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_27_in_ruleNumber6103 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_43_in_ruleNumber6190 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_44_in_ruleNumber6219 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_45_in_ruleNumber6248 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_34_in_ruleNumber6322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_entryRuleSingle6358 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingle6368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleWithOptions_in_ruleSingle6415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRef_in_ruleSingle6442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleWithOptions_in_entryRuleSingleWithOptions6477 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleWithOptions6487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleSingleWithOptions6524 = new BitSet(new long[]{0x003800000C20A000L});
        public static final BitSet FOLLOW_13_in_ruleSingleWithOptions6582 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleWithOptions6603 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions6615 = new BitSet(new long[]{0x003800000C24A000L});
        public static final BitSet FOLLOW_15_in_ruleSingleWithOptions6683 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleWithOptions6704 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions6717 = new BitSet(new long[]{0x003800000C24A000L});
        public static final BitSet FOLLOW_21_in_ruleSingleWithOptions6785 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleWithOptions6802 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions6820 = new BitSet(new long[]{0x003800000C24A000L});
        public static final BitSet FOLLOW_26_in_ruleSingleWithOptions6888 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleSingleWithOptions6909 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions6922 = new BitSet(new long[]{0x003800000C24A000L});
        public static final BitSet FOLLOW_27_in_ruleSingleWithOptions6995 = new BitSet(new long[]{0x003800000C24A000L});
        public static final BitSet FOLLOW_51_in_ruleSingleWithOptions7083 = new BitSet(new long[]{0x003800000C24A000L});
        public static final BitSet FOLLOW_52_in_ruleSingleWithOptions7112 = new BitSet(new long[]{0x003800000C24A000L});
        public static final BitSet FOLLOW_53_in_ruleSingleWithOptions7147 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleWithOptions7168 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions7180 = new BitSet(new long[]{0x003800000C24A000L});
        public static final BitSet FOLLOW_18_in_ruleSingleWithOptions7240 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingleWithOptions7261 = new BitSet(new long[]{0x0040000000900000L});
        public static final BitSet FOLLOW_54_in_ruleSingleWithOptions7274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRef_in_entryRuleSingleRef7310 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleRef7320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleSingleRef7357 = new BitSet(new long[]{0x403800000C20A000L});
        public static final BitSet FOLLOW_13_in_ruleSingleRef7415 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleRef7436 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7448 = new BitSet(new long[]{0x403800040C20A000L});
        public static final BitSet FOLLOW_15_in_ruleSingleRef7516 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleRef7537 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7550 = new BitSet(new long[]{0x403800040C20A000L});
        public static final BitSet FOLLOW_21_in_ruleSingleRef7618 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleRef7635 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7653 = new BitSet(new long[]{0x403800040C20A000L});
        public static final BitSet FOLLOW_26_in_ruleSingleRef7721 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleSingleRef7742 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7755 = new BitSet(new long[]{0x403800040C20A000L});
        public static final BitSet FOLLOW_27_in_ruleSingleRef7828 = new BitSet(new long[]{0x403800040C20A000L});
        public static final BitSet FOLLOW_51_in_ruleSingleRef7916 = new BitSet(new long[]{0x403800040C20A000L});
        public static final BitSet FOLLOW_52_in_ruleSingleRef7945 = new BitSet(new long[]{0x403800040C20A000L});
        public static final BitSet FOLLOW_53_in_ruleSingleRef7980 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleRef8001 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef8013 = new BitSet(new long[]{0x403800040C20A000L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRefAttr_in_ruleSingleRef8090 = new BitSet(new long[]{0x403800040C20A000L});
        public static final BitSet FOLLOW_34_in_ruleSingleRef8148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple8184 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiple8194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleWithOptions_in_ruleMultiple8241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleRef_in_ruleMultiple8268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleWithOptions_in_entryRuleMultipleWithOptions8303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleWithOptions8313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleMultipleWithOptions8350 = new BitSet(new long[]{0x000838300C20A000L});
        public static final BitSet FOLLOW_13_in_ruleMultipleWithOptions8408 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleWithOptions8429 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8441 = new BitSet(new long[]{0x000838300C24A000L});
        public static final BitSet FOLLOW_15_in_ruleMultipleWithOptions8509 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleWithOptions8530 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8543 = new BitSet(new long[]{0x000838300C24A000L});
        public static final BitSet FOLLOW_21_in_ruleMultipleWithOptions8611 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleWithOptions8628 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8646 = new BitSet(new long[]{0x000838300C24A000L});
        public static final BitSet FOLLOW_36_in_ruleMultipleWithOptions8714 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultipleWithOptions8731 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8748 = new BitSet(new long[]{0x000838300C24A000L});
        public static final BitSet FOLLOW_37_in_ruleMultipleWithOptions8816 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultipleWithOptions8833 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8850 = new BitSet(new long[]{0x000838300C24A000L});
        public static final BitSet FOLLOW_26_in_ruleMultipleWithOptions8918 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleMultipleWithOptions8939 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8952 = new BitSet(new long[]{0x000838300C24A000L});
        public static final BitSet FOLLOW_27_in_ruleMultipleWithOptions9025 = new BitSet(new long[]{0x000838300C24A000L});
        public static final BitSet FOLLOW_51_in_ruleMultipleWithOptions9110 = new BitSet(new long[]{0x000838300C24A000L});
        public static final BitSet FOLLOW_43_in_ruleMultipleWithOptions9197 = new BitSet(new long[]{0x000838300C24A000L});
        public static final BitSet FOLLOW_44_in_ruleMultipleWithOptions9226 = new BitSet(new long[]{0x000838300C24A000L});
        public static final BitSet FOLLOW_45_in_ruleMultipleWithOptions9255 = new BitSet(new long[]{0x000838300C24A000L});
        public static final BitSet FOLLOW_18_in_ruleMultipleWithOptions9329 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultipleWithOptions9350 = new BitSet(new long[]{0x0100000000900000L});
        public static final BitSet FOLLOW_56_in_ruleMultipleWithOptions9363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleRef_in_entryRuleMultipleRef9399 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleRef9409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleMultipleRef9446 = new BitSet(new long[]{0x403838300C20A000L});
        public static final BitSet FOLLOW_13_in_ruleMultipleRef9504 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleRef9525 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9537 = new BitSet(new long[]{0x403838340C20A000L});
        public static final BitSet FOLLOW_15_in_ruleMultipleRef9605 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleRef9626 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9639 = new BitSet(new long[]{0x403838340C20A000L});
        public static final BitSet FOLLOW_21_in_ruleMultipleRef9707 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleRef9724 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9742 = new BitSet(new long[]{0x403838340C20A000L});
        public static final BitSet FOLLOW_36_in_ruleMultipleRef9810 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultipleRef9827 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9844 = new BitSet(new long[]{0x403838340C20A000L});
        public static final BitSet FOLLOW_37_in_ruleMultipleRef9912 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultipleRef9929 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9946 = new BitSet(new long[]{0x403838340C20A000L});
        public static final BitSet FOLLOW_26_in_ruleMultipleRef10014 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleMultipleRef10035 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef10048 = new BitSet(new long[]{0x403838340C20A000L});
        public static final BitSet FOLLOW_27_in_ruleMultipleRef10121 = new BitSet(new long[]{0x403838340C20A000L});
        public static final BitSet FOLLOW_51_in_ruleMultipleRef10206 = new BitSet(new long[]{0x403838340C20A000L});
        public static final BitSet FOLLOW_43_in_ruleMultipleRef10293 = new BitSet(new long[]{0x403838340C20A000L});
        public static final BitSet FOLLOW_44_in_ruleMultipleRef10322 = new BitSet(new long[]{0x403838340C20A000L});
        public static final BitSet FOLLOW_45_in_ruleMultipleRef10351 = new BitSet(new long[]{0x403838340C20A000L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRefAttr_in_ruleMultipleRef10442 = new BitSet(new long[]{0x403838340C20A000L});
        public static final BitSet FOLLOW_34_in_ruleMultipleRef10500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable10536 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable10546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleTable10583 = new BitSet(new long[]{0x040800008C04A000L});
        public static final BitSet FOLLOW_13_in_ruleTable10641 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable10662 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable10675 = new BitSet(new long[]{0x040800008C04A000L});
        public static final BitSet FOLLOW_15_in_ruleTable10743 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable10764 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable10777 = new BitSet(new long[]{0x040800008C04A000L});
        public static final BitSet FOLLOW_26_in_ruleTable10845 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleTable10866 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable10879 = new BitSet(new long[]{0x040800008C04A000L});
        public static final BitSet FOLLOW_27_in_ruleTable10952 = new BitSet(new long[]{0x040800008C04A000L});
        public static final BitSet FOLLOW_51_in_ruleTable11037 = new BitSet(new long[]{0x040800008C04A000L});
        public static final BitSet FOLLOW_31_in_ruleTable11117 = new BitSet(new long[]{0x040800008C04A000L});
        public static final BitSet FOLLOW_58_in_ruleTable11141 = new BitSet(new long[]{0x040800008C04A000L});
        public static final BitSet FOLLOW_18_in_ruleTable11207 = new BitSet(new long[]{0x8000000000900000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable11273 = new BitSet(new long[]{0x8800000000900000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable11349 = new BitSet(new long[]{0x8800000000900000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable11418 = new BitSet(new long[]{0x8800000000900000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable11445 = new BitSet(new long[]{0x8800000000900000L});
        public static final BitSet FOLLOW_59_in_ruleTable11459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt11496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt11507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleEInt11546 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt11563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef11608 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplateRef11618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAnswerTemplateRef11655 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruleAnswerTemplateRef11667 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplateRef11687 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswerTemplateRef11699 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleAnswerTemplateRef11711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRefAttr_in_entryRuleAnswerTemplateRefAttr11747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplateRefAttr11757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleAnswerTemplateRefAttr11794 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplateRefAttr11814 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswerTemplateRefAttr11826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion11862 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion11872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleTableQuestion11909 = new BitSet(new long[]{0x0000000008240000L});
        public static final BitSet FOLLOW_21_in_ruleTableQuestion11967 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTableQuestion11984 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTableQuestion12002 = new BitSet(new long[]{0x0000000008240000L});
        public static final BitSet FOLLOW_27_in_ruleTableQuestion12075 = new BitSet(new long[]{0x0000000008240000L});
        public static final BitSet FOLLOW_18_in_ruleTableQuestion12140 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTableQuestion12161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleTableQuestion12173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_entryRuleDEP_ID12210 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDEP_ID12221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDEP_ID12261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleDEP_ID12287 = new BitSet(new long[]{0x0000000000000002L});
    }


}