package dk.itu.smdp.survey.parser.antlr.internal; 

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
import dk.itu.smdp.survey.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FQN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<survey'", "'title=\"'", "'\"'", "'description=\"'", "'filename=\"'", "'email=\"'", "'>'", "'</survey>'", "'<template'", "'id=\"'", "'</template>'", "'<a'", "'</a>'", "'<group'", "'depends-on=\"'", "'required'", "'</group>'", "'<text'", "'singleline'", "'single'", "'multi'", "'multiline'", "'/>'", "'<scale'", "'min=\"'", "'max=\"'", "'min-label=\"'", "'max-label=\"'", "'<date'", "'start=\"'", "'end=\"'", "'show-limits'", "'show'", "'limits'", "'<number'", "'<single'", "'other'", "'other=\"\"'", "'other=\"'", "'</single>'", "'<multiple'", "'</multiple>'", "'<table'", "'multiple'", "'</table>'", "'-'", "'ref=\"'", "'template=\"'", "'<q'", "'</q>'", "'day'", "'month'", "'year'"
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:68:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:69:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:70:2: iv_ruleSurvey= ruleSurvey EOF
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:77:1: ruleSurvey returns [EObject current=null] : ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>' )? ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:28: ( ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>' )? ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:81:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>' )? )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:81:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>' )? )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:81:2: () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>' )?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:81:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:87:2: (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:87:4: otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) ) otherlv_15= '>' ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '</survey>'
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey132); 

                        	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getSurveyKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:91:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:93:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:93:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:94:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?)
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?)
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:98:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+ {...}?
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:98:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) ) )+
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
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:101:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:101:105: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:102:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:105:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:105:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:105:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"' )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:105:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) )? otherlv_5= '\"'
                    	    {
                    	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey190); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSurveyAccess().getTitleKeyword_1_1_0_0());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:109:1: ( (lv_title_4_0= ruleEString ) )?
                    	    int alt1=2;
                    	    int LA1_0 = input.LA(1);

                    	    if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
                    	        alt1=1;
                    	    }
                    	    switch (alt1) {
                    	        case 1 :
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:110:1: (lv_title_4_0= ruleEString )
                    	            {
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:110:1: (lv_title_4_0= ruleEString )
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:111:3: lv_title_4_0= ruleEString
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
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:139:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:139:105: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:140:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:143:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:143:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:143:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:143:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"'
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSurvey292); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getDescriptionKeyword_1_1_1_0());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:147:1: ( (lv_description_7_0= ruleEString ) )?
                    	    int alt2=2;
                    	    int LA2_0 = input.LA(1);

                    	    if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                    	        alt2=1;
                    	    }
                    	    switch (alt2) {
                    	        case 1 :
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:148:1: (lv_description_7_0= ruleEString )
                    	            {
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:148:1: (lv_description_7_0= ruleEString )
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:149:3: lv_description_7_0= ruleEString
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
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:176:4: ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:176:4: ({...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:177:5: {...}? => ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 2)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:177:105: ( ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:178:6: ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 2);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:181:6: ({...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:181:7: {...}? => (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:181:16: (otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:181:18: otherlv_9= 'filename=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"'
                    	    {
                    	    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSurvey394); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSurveyAccess().getFilenameKeyword_1_1_2_0());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:185:1: ( (lv_name_10_0= RULE_ID ) )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==RULE_ID) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:186:1: (lv_name_10_0= RULE_ID )
                    	            {
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:186:1: (lv_name_10_0= RULE_ID )
                    	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:187:3: lv_name_10_0= RULE_ID
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
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:214:4: ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:214:4: ({...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:215:5: {...}? => ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 3)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:215:105: ( ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:216:6: ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 3);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:219:6: ({...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:219:7: {...}? => (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:219:16: (otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"' )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:219:18: otherlv_12= 'email=\"' ( (lv_mail_13_0= RULE_STRING ) ) otherlv_14= '\"'
                    	    {
                    	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSurvey497); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getSurveyAccess().getEmailKeyword_1_1_3_0());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:223:1: ( (lv_mail_13_0= RULE_STRING ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:224:1: (lv_mail_13_0= RULE_STRING )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:224:1: (lv_mail_13_0= RULE_STRING )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:225:3: lv_mail_13_0= RULE_STRING
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
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:264:1: ( ( (lv_items_16_0= ruleItem ) ) | ( (lv_templates_17_0= ruleAnswerTemplate ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==25||LA5_0==29||LA5_0==35||LA5_0==40||(LA5_0>=46 && LA5_0<=47)||LA5_0==52||LA5_0==54) ) {
                            alt5=1;
                        }
                        else if ( (LA5_0==20) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:264:2: ( (lv_items_16_0= ruleItem ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:264:2: ( (lv_items_16_0= ruleItem ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:265:1: (lv_items_16_0= ruleItem )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:265:1: (lv_items_16_0= ruleItem )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:266:3: lv_items_16_0= ruleItem
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
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:283:6: ( (lv_templates_17_0= ruleAnswerTemplate ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:283:6: ( (lv_templates_17_0= ruleAnswerTemplate ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:284:1: (lv_templates_17_0= ruleAnswerTemplate )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:284:1: (lv_templates_17_0= ruleAnswerTemplate )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:285:3: lv_templates_17_0= ruleAnswerTemplate
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:313:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:314:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:315:2: iv_ruleEString= ruleEString EOF
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:322:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:325:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:326:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:326:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:326:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString743); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:334:10: this_ID_1= RULE_ID
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:349:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:350:2: (iv_ruleItem= ruleItem EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:351:2: iv_ruleItem= ruleItem EOF
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:358:1: ruleItem returns [EObject current=null] : (this_Group_0= ruleGroup | this_Question_1= ruleQuestion ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_Group_0 = null;

        EObject this_Question_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:361:28: ( (this_Group_0= ruleGroup | this_Question_1= ruleQuestion ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:362:1: (this_Group_0= ruleGroup | this_Question_1= ruleQuestion )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:362:1: (this_Group_0= ruleGroup | this_Question_1= ruleQuestion )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==29||LA8_0==35||LA8_0==40||(LA8_0>=46 && LA8_0<=47)||LA8_0==52||LA8_0==54) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:363:5: this_Group_0= ruleGroup
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:373:5: this_Question_1= ruleQuestion
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:389:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:390:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:391:2: iv_ruleQuestion= ruleQuestion EOF
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:398:1: ruleQuestion returns [EObject current=null] : (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:401:28: ( (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:402:1: (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:402:1: (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable )
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
            case 46:
                {
                alt9=4;
                }
                break;
            case 47:
                {
                alt9=5;
                }
                break;
            case 52:
                {
                alt9=6;
                }
                break;
            case 54:
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:403:5: this_Text_0= ruleText
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:413:5: this_Scale_1= ruleScale
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:423:5: this_Date_2= ruleDate
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:433:5: this_Number_3= ruleNumber
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:443:5: this_Single_4= ruleSingle
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:453:5: this_Multiple_5= ruleMultiple
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:463:5: this_Table_6= ruleTable
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:479:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:480:2: (iv_ruleOption= ruleOption EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:481:2: iv_ruleOption= ruleOption EOF
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:488:1: ruleOption returns [EObject current=null] : (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_AnswerTemplateRef_0 = null;

        EObject this_Answer_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:491:28: ( (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:492:1: (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:492:1: (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer )
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:493:5: this_AnswerTemplateRef_0= ruleAnswerTemplateRef
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:503:5: this_Answer_1= ruleAnswer
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:519:1: entryRuleAnswerTemplate returns [EObject current=null] : iv_ruleAnswerTemplate= ruleAnswerTemplate EOF ;
    public final EObject entryRuleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:520:2: (iv_ruleAnswerTemplate= ruleAnswerTemplate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:521:2: iv_ruleAnswerTemplate= ruleAnswerTemplate EOF
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:528:1: ruleAnswerTemplate returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:531:28: ( (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:532:1: (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:532:1: (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:532:3: otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswerTemplate1353); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswerTemplate1365); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateAccess().getIdKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:540:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:541:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:541:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:542:3: lv_name_2_0= RULE_ID
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
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:566:1: ( (lv_answers_5_0= ruleAnswer ) )+
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:567:1: (lv_answers_5_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:567:1: (lv_answers_5_0= ruleAnswer )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:568:3: lv_answers_5_0= ruleAnswer
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:596:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:597:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:598:2: iv_ruleAnswer= ruleAnswer EOF
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:605:1: ruleAnswer returns [EObject current=null] : (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:608:28: ( (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:609:1: (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:609:1: (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:609:3: otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )? otherlv_4= '>' ( (lv_title_5_0= ruleEString ) ) otherlv_6= '</a>'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnswer1528); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:613:1: (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:613:3: otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '\"'
                    {
                    otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswer1541); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getIdKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:617:1: ( (lv_name_2_0= RULE_ID ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:618:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:618:1: (lv_name_2_0= RULE_ID )
                            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:619:3: lv_name_2_0= RULE_ID
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
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:643:1: ( (lv_title_5_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:644:1: (lv_title_5_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:644:1: (lv_title_5_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:645:3: lv_title_5_0= ruleEString
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:673:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:674:2: (iv_ruleGroup= ruleGroup EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:675:2: iv_ruleGroup= ruleGroup EOF
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:682:1: ruleGroup returns [EObject current=null] : (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:685:28: ( (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:3: otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_15= '>' ( (lv_questions_16_0= ruleQuestion ) )+ otherlv_17= '</group>'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGroup1706); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:690:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:692:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:692:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:693:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:696:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:697:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:697:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) )*
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:699:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:699:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:700:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:700:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:701:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:704:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:704:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:704:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:704:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1764); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:708:1: ( (lv_title_3_0= ruleEString ) )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:709:1: (lv_title_3_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:709:1: (lv_title_3_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:710:3: lv_title_3_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:737:4: ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:737:4: ({...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:738:5: {...}? => ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:738:102: ( ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:739:6: ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:742:6: ({...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:742:7: {...}? => (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:742:16: (otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:742:18: otherlv_5= 'id=\"' ( (lv_name_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGroup1866); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getIdKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:746:1: ( (lv_name_6_0= ruleEString ) )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:747:1: (lv_name_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:747:1: (lv_name_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:748:3: lv_name_6_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:775:4: ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:775:4: ({...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:776:5: {...}? => ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:776:102: ( ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:777:6: ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:780:6: ({...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:780:7: {...}? => (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:780:16: (otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:780:18: otherlv_8= 'description=\"' ( (lv_description_9_0= ruleEString ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup1968); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getDescriptionKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:784:1: ( (lv_description_9_0= ruleEString ) )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:785:1: (lv_description_9_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:785:1: (lv_description_9_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:786:3: lv_description_9_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:813:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:813:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:814:5: {...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:814:102: ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:815:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:818:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:818:7: {...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:818:16: (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:818:18: otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleGroup2070); 

            	        	newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:822:1: ( (lv_dependsOn_12_0= ruleDEP_ID ) )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_ID||LA17_0==RULE_FQN) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:823:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:823:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:824:3: lv_dependsOn_12_0= ruleDEP_ID
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:851:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:851:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:852:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:852:102: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:853:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:856:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:856:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:856:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:857:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:857:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:858:3: lv_required_14_0= 'required'
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
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:889:1: ( (lv_questions_16_0= ruleQuestion ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29||LA19_0==35||LA19_0==40||(LA19_0>=46 && LA19_0<=47)||LA19_0==52||LA19_0==54) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:890:1: (lv_questions_16_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:890:1: (lv_questions_16_0= ruleQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:3: lv_questions_16_0= ruleQuestion
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:919:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:920:2: (iv_ruleText= ruleText EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:921:2: iv_ruleText= ruleText EOF
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:928:1: ruleText returns [EObject current=null] : ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) ;
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
        Token lv_multi_18_1=null;
        Token lv_multi_18_2=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:931:28: ( ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:932:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:932:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:932:2: () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:932:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:933:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleText2368); 

                	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:942:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:944:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:944:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:945:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:948:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:949:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:949:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) ) )+
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:951:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:951:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:952:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:952:101: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:953:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:956:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:956:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:956:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:956:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2426); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTextAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:960:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:961:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:961:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:962:3: lv_title_4_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:989:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:989:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:990:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:990:101: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:991:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:994:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:994:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:994:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:994:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleText2527); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:998:1: ( (lv_description_7_0= ruleEString ) )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:999:1: (lv_description_7_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:999:1: (lv_description_7_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1000:3: lv_description_7_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1027:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1027:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1028:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1028:101: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1029:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1032:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1032:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1032:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1032:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleText2629); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTextAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1036:1: ( (lv_name_10_0= RULE_ID ) )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==RULE_ID) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1037:1: (lv_name_10_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1037:1: (lv_name_10_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1038:3: lv_name_10_0= RULE_ID
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1065:4: ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1065:4: ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1066:5: {...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1066:101: ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1067:6: ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1070:6: ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1070:7: {...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1070:16: (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1070:18: otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) )? otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleText2732); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTextAccess().getDependsOnKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1074:1: ( (lv_dependsOn_13_0= ruleDEP_ID ) )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==RULE_ID||LA22_0==RULE_FQN) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1075:1: (lv_dependsOn_13_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1075:1: (lv_dependsOn_13_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1076:3: lv_dependsOn_13_0= ruleDEP_ID
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1103:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1103:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1104:5: {...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1104:101: ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1105:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1108:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1108:7: {...}? => ( (lv_required_15_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1108:16: ( (lv_required_15_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1109:1: (lv_required_15_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1109:1: (lv_required_15_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1110:3: lv_required_15_0= 'required'
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1130:4: ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1130:4: ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1131:5: {...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1131:101: ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1132:6: ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1135:6: ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1135:7: {...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1135:16: (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) ) )
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1135:18: otherlv_16= 'singleline'
            	            {
            	            otherlv_16=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleText2919); 

            	                	newLeafNode(otherlv_16, grammarAccess.getTextAccess().getSinglelineKeyword_2_5_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1140:7: otherlv_17= 'single'
            	            {
            	            otherlv_17=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleText2937); 

            	                	newLeafNode(otherlv_17, grammarAccess.getTextAccess().getSingleKeyword_2_5_1());
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1145:6: ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1145:6: ( ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1146:1: ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1146:1: ( (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1147:1: (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1147:1: (lv_multi_18_1= 'multi' | lv_multi_18_2= 'multiline' )
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
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1148:3: lv_multi_18_1= 'multi'
            	                    {
            	                    lv_multi_18_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleText2963); 

            	                            newLeafNode(lv_multi_18_1, grammarAccess.getTextAccess().getMultiMultiKeyword_2_5_2_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getTextRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "multi", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1160:8: lv_multi_18_2= 'multiline'
            	                    {
            	                    lv_multi_18_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleText2992); 

            	                            newLeafNode(lv_multi_18_2, grammarAccess.getTextAccess().getMultiMultilineKeyword_2_5_2_0_1());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getTextRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "multi", true, null);
            	                    	    

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1202:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1203:2: (iv_ruleScale= ruleScale EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1204:2: iv_ruleScale= ruleScale EOF
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1211:1: ruleScale returns [EObject current=null] : (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1214:28: ( (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1215:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1215:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1215:3: otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleScale3150); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1219:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1221:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1221:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1222:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1225:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1226:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1226:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=10;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1228:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1228:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1229:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1229:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1230:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1233:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1233:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1233:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1233:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3208); 

            	        	newLeafNode(otherlv_2, grammarAccess.getScaleAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1237:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1238:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1238:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1239:3: lv_title_3_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1266:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1266:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1267:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1267:102: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1268:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1271:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1271:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1271:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1271:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3309); 

            	        	newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1275:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1276:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1276:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1277:3: lv_description_6_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1304:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1304:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1305:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1305:102: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1306:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1309:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1309:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1309:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1309:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleScale3411); 

            	        	newLeafNode(otherlv_8, grammarAccess.getScaleAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1313:1: ( (lv_name_9_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1314:1: (lv_name_9_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1314:1: (lv_name_9_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1315:3: lv_name_9_0= RULE_ID
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1342:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1342:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1343:5: {...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1343:102: ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1344:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1347:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1347:7: {...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1347:16: (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1347:18: otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleScale3513); 

            	        	newLeafNode(otherlv_11, grammarAccess.getScaleAccess().getMinKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1351:1: ( (lv_min_12_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1352:1: (lv_min_12_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1352:1: (lv_min_12_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1353:3: lv_min_12_0= ruleEInt
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1380:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1380:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1381:5: {...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1381:102: ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1382:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1385:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1385:7: {...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1385:16: (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1385:18: otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"'
            	    {
            	    otherlv_14=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleScale3614); 

            	        	newLeafNode(otherlv_14, grammarAccess.getScaleAccess().getMaxKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1389:1: ( (lv_max_15_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1390:1: (lv_max_15_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1390:1: (lv_max_15_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1391:3: lv_max_15_0= ruleEInt
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1418:4: ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1418:4: ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1419:5: {...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1419:102: ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1420:6: ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1423:6: ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1423:7: {...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1423:16: (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1423:18: otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"'
            	    {
            	    otherlv_17=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleScale3715); 

            	        	newLeafNode(otherlv_17, grammarAccess.getScaleAccess().getMinLabelKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1427:1: ( (lv_minLabel_18_0= ruleEString ) )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1428:1: (lv_minLabel_18_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1428:1: (lv_minLabel_18_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1429:3: lv_minLabel_18_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1456:4: ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1456:4: ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1457:5: {...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1457:102: ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1458:6: ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1461:6: ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1461:7: {...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1461:16: (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1461:18: otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"'
            	    {
            	    otherlv_20=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleScale3817); 

            	        	newLeafNode(otherlv_20, grammarAccess.getScaleAccess().getMaxLabelKeyword_1_6_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1465:1: ( (lv_maxLabel_21_0= ruleEString ) )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1466:1: (lv_maxLabel_21_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1466:1: (lv_maxLabel_21_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1467:3: lv_maxLabel_21_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1494:4: ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1494:4: ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1495:5: {...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1495:102: ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1496:6: ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1499:6: ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1499:7: {...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1499:16: (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1499:18: otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"'
            	    {
            	    otherlv_23=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleScale3919); 

            	        	newLeafNode(otherlv_23, grammarAccess.getScaleAccess().getDependsOnKeyword_1_7_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1503:1: ( (lv_dependsOn_24_0= ruleDEP_ID ) )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==RULE_ID||LA29_0==RULE_FQN) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1504:1: (lv_dependsOn_24_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1504:1: (lv_dependsOn_24_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1505:3: lv_dependsOn_24_0= ruleDEP_ID
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1532:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1532:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1533:5: {...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1533:102: ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1534:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1537:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1537:7: {...}? => ( (lv_required_26_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1537:16: ( (lv_required_26_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1538:1: (lv_required_26_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1538:1: (lv_required_26_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1539:3: lv_required_26_0= 'required'
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1579:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1580:2: (iv_ruleDate= ruleDate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1581:2: iv_ruleDate= ruleDate EOF
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1588:1: ruleDate returns [EObject current=null] : ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>' ) ;
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
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_start_13_0 = null;

        AntlrDatatypeRuleToken lv_end_16_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_19_0 = null;

        Enumerator lv_mode_23_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1591:28: ( ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1592:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1592:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1592:2: () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+ {...}?) ) ) otherlv_24= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1592:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1593:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDate4189); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1602:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1604:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1604:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1605:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1608:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1609:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1609:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=10;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1611:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1611:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1612:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1612:101: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1613:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1616:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1616:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1616:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1616:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4247); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1620:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1621:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1621:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1622:3: lv_title_4_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1649:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1649:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1650:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1650:101: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1651:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1654:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1654:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1654:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1654:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDate4348); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1658:1: ( (lv_description_7_0= ruleEString ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1659:1: (lv_description_7_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1659:1: (lv_description_7_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1660:3: lv_description_7_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1687:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1687:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1688:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1688:101: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1689:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1692:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1692:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1692:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1692:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDate4450); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDateAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1696:1: ( (lv_name_10_0= RULE_ID ) )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==RULE_ID) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1697:1: (lv_name_10_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1697:1: (lv_name_10_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1698:3: lv_name_10_0= RULE_ID
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1725:4: ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1725:4: ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1726:5: {...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1726:101: ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1727:6: ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1730:6: ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1730:7: {...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1730:16: (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1730:18: otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDate4553); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDateAccess().getStartKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1734:1: ( (lv_start_13_0= ruleEString ) )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1735:1: (lv_start_13_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1735:1: (lv_start_13_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1736:3: lv_start_13_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1763:4: ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1763:4: ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1764:5: {...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1764:101: ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1765:6: ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1768:6: ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1768:7: {...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1768:16: (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1768:18: otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"'
            	    {
            	    otherlv_15=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDate4655); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDateAccess().getEndKeyword_2_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1772:1: ( (lv_end_16_0= ruleEString ) )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1773:1: (lv_end_16_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1773:1: (lv_end_16_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1774:3: lv_end_16_0= ruleEString
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1801:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1801:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1802:5: {...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1802:101: ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1803:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1806:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1806:7: {...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1806:16: (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1806:18: otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"'
            	    {
            	    otherlv_18=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDate4757); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDateAccess().getDependsOnKeyword_2_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1810:1: ( (lv_dependsOn_19_0= ruleDEP_ID ) )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==RULE_ID||LA35_0==RULE_FQN) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1811:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1811:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1812:3: lv_dependsOn_19_0= ruleDEP_ID
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1839:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1839:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1840:5: {...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1840:101: ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1841:6: ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1844:6: ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1844:7: {...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1844:16: ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1845:1: ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1845:1: ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1846:1: (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1846:1: (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' )
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1847:3: lv_showLimits_21_1= 'show-limits'
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1859:8: lv_showLimits_21_2= 'show'
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1871:8: lv_showLimits_21_3= 'limits'
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1893:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1893:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1894:5: {...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1894:101: ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1895:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1898:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1898:7: {...}? => ( (lv_required_22_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1898:16: ( (lv_required_22_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1899:1: (lv_required_22_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1899:1: (lv_required_22_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1900:3: lv_required_22_0= 'required'
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1920:4: ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1920:4: ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1921:5: {...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1921:101: ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1922:6: ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1925:6: ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1925:7: {...}? => ( (lv_mode_23_0= ruleDateMode ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1925:16: ( (lv_mode_23_0= ruleDateMode ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1926:1: (lv_mode_23_0= ruleDateMode )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1926:1: (lv_mode_23_0= ruleDateMode )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1927:3: lv_mode_23_0= ruleDateMode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getModeDateModeEnumRuleCall_2_8_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDateMode_in_ruleDate5100);
            	    lv_mode_23_0=ruleDateMode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"mode",
            	            		lv_mode_23_0, 
            	            		"DateMode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_24=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDate5158); 

                	newLeafNode(otherlv_24, grammarAccess.getDateAccess().getSolidusGreaterThanSignKeyword_3());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1970:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1971:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1972:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber5194);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber5204); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1979:1: ruleNumber returns [EObject current=null] : ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1982:28: ( ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1983:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1983:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1983:2: () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1983:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1984:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberAccess().getNumberAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleNumber5250); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getNumberKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1993:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1995:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1995:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1996:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1999:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2000:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2000:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=9;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2002:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2002:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2003:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2003:103: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2004:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2007:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2007:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2007:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2007:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5308); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2011:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2012:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2012:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2013:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5329);
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

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5341); 

            	        	newLeafNode(otherlv_5, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2040:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2040:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2041:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2041:103: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2042:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2045:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2045:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2045:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2045:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNumber5409); 

            	        	newLeafNode(otherlv_6, grammarAccess.getNumberAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2049:1: ( (lv_description_7_0= ruleEString ) )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2050:1: (lv_description_7_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2050:1: (lv_description_7_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2051:3: lv_description_7_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getNumberAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5430);
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

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5443); 

            	        	newLeafNode(otherlv_8, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2078:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2078:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2079:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2079:103: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2080:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2083:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2083:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2083:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2083:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNumber5511); 

            	        	newLeafNode(otherlv_9, grammarAccess.getNumberAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2087:1: ( (lv_name_10_0= RULE_ID ) )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==RULE_ID) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2088:1: (lv_name_10_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2088:1: (lv_name_10_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2089:3: lv_name_10_0= RULE_ID
            	            {
            	            lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNumber5528); 

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

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5546); 

            	        	newLeafNode(otherlv_11, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2116:4: ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2116:4: ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2117:5: {...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2117:103: ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2118:6: ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2121:6: ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2121:7: {...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2121:16: (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2121:18: otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleNumber5614); 

            	        	newLeafNode(otherlv_12, grammarAccess.getNumberAccess().getMinKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2125:1: ( (lv_min_13_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2126:1: (lv_min_13_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2126:1: (lv_min_13_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2127:3: lv_min_13_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getMinEIntParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5635);
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

            	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5647); 

            	        	newLeafNode(otherlv_14, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2154:4: ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2154:4: ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2155:5: {...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2155:103: ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2156:6: ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2159:6: ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2159:7: {...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2159:16: (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2159:18: otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"'
            	    {
            	    otherlv_15=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleNumber5715); 

            	        	newLeafNode(otherlv_15, grammarAccess.getNumberAccess().getMaxKeyword_2_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2163:1: ( (lv_max_16_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2164:1: (lv_max_16_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2164:1: (lv_max_16_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2165:3: lv_max_16_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getMaxEIntParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5736);
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

            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5748); 

            	        	newLeafNode(otherlv_17, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2192:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2192:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2193:5: {...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2193:103: ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2194:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2197:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2197:7: {...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2197:16: (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2197:18: otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"'
            	    {
            	    otherlv_18=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNumber5816); 

            	        	newLeafNode(otherlv_18, grammarAccess.getNumberAccess().getDependsOnKeyword_2_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2201:1: ( (lv_dependsOn_19_0= ruleDEP_ID ) )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==RULE_ID||LA40_0==RULE_FQN) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2202:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2202:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2203:3: lv_dependsOn_19_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getNumberAccess().getDependsOnDEP_IDParserRuleCall_2_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleNumber5837);
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

            	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5850); 

            	        	newLeafNode(otherlv_20, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2230:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2230:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2231:5: {...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2231:103: ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2232:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2235:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2235:7: {...}? => ( (lv_required_21_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2235:16: ( (lv_required_21_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2236:1: (lv_required_21_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2236:1: (lv_required_21_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2237:3: lv_required_21_0= 'required'
            	    {
            	    lv_required_21_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleNumber5923); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2257:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2257:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2258:5: {...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2258:103: ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2259:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2262:6: ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2262:7: {...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2262:16: ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2263:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2263:1: ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2264:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2264:1: (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' )
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2265:3: lv_showLimits_22_1= 'show-limits'
            	            {
            	            lv_showLimits_22_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleNumber6010); 

            	                    newLeafNode(lv_showLimits_22_1, grammarAccess.getNumberAccess().getShowLimitsShowLimitsKeyword_2_7_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getNumberRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2277:8: lv_showLimits_22_2= 'show'
            	            {
            	            lv_showLimits_22_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleNumber6039); 

            	                    newLeafNode(lv_showLimits_22_2, grammarAccess.getNumberAccess().getShowLimitsShowKeyword_2_7_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getNumberRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2289:8: lv_showLimits_22_3= 'limits'
            	            {
            	            lv_showLimits_22_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleNumber6068); 

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

            otherlv_23=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNumber6142); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2331:1: entryRuleSingle returns [EObject current=null] : iv_ruleSingle= ruleSingle EOF ;
    public final EObject entryRuleSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingle = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2332:2: (iv_ruleSingle= ruleSingle EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2333:2: iv_ruleSingle= ruleSingle EOF
            {
             newCompositeNode(grammarAccess.getSingleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingle_in_entryRuleSingle6178);
            iv_ruleSingle=ruleSingle();

            state._fsp--;

             current =iv_ruleSingle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingle6188); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2340:1: ruleSingle returns [EObject current=null] : (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef ) ;
    public final EObject ruleSingle() throws RecognitionException {
        EObject current = null;

        EObject this_SingleWithOptions_0 = null;

        EObject this_SingleRef_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2343:28: ( (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2344:1: (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2344:1: (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2345:5: this_SingleWithOptions_0= ruleSingleWithOptions
                    {
                     
                            newCompositeNode(grammarAccess.getSingleAccess().getSingleWithOptionsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleWithOptions_in_ruleSingle6235);
                    this_SingleWithOptions_0=ruleSingleWithOptions();

                    state._fsp--;

                     
                            current = this_SingleWithOptions_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2355:5: this_SingleRef_1= ruleSingleRef
                    {
                     
                            newCompositeNode(grammarAccess.getSingleAccess().getSingleRefParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleRef_in_ruleSingle6262);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2371:1: entryRuleSingleWithOptions returns [EObject current=null] : iv_ruleSingleWithOptions= ruleSingleWithOptions EOF ;
    public final EObject entryRuleSingleWithOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleWithOptions = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2372:2: (iv_ruleSingleWithOptions= ruleSingleWithOptions EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2373:2: iv_ruleSingleWithOptions= ruleSingleWithOptions EOF
            {
             newCompositeNode(grammarAccess.getSingleWithOptionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleWithOptions_in_entryRuleSingleWithOptions6297);
            iv_ruleSingleWithOptions=ruleSingleWithOptions();

            state._fsp--;

             current =iv_ruleSingleWithOptions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleWithOptions6307); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2380:1: ruleSingleWithOptions returns [EObject current=null] : (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2383:28: ( (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2384:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2384:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2384:3: otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '>' ( (lv_options_20_0= ruleOption ) )+ otherlv_21= '</single>'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleSingleWithOptions6344); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleWithOptionsAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2388:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2390:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2390:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2391:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2394:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2395:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2395:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) ) )+
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
                else if ( LA49_0 >=48 && LA49_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 5) ) {
                    alt49=6;
                }


                switch (alt49) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2397:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2397:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2398:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2398:114: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2399:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2402:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2402:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2402:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2402:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingleWithOptions6402); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSingleWithOptionsAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2406:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2407:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2407:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2408:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleWithOptions6423);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions6435); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2435:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2435:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2436:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2436:114: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2437:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2440:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2440:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2440:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2440:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingleWithOptions6503); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSingleWithOptionsAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2444:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2445:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2445:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2446:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleWithOptions6524);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions6537); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2473:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2473:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2474:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2474:114: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2475:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2478:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2478:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2478:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2478:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSingleWithOptions6605); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSingleWithOptionsAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2482:1: ( (lv_name_9_0= RULE_ID ) )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==RULE_ID) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2483:1: (lv_name_9_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2483:1: (lv_name_9_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2484:3: lv_name_9_0= RULE_ID
            	            {
            	            lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingleWithOptions6622); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions6640); 

            	        	newLeafNode(otherlv_10, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2511:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2511:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2512:5: {...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2512:114: ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2513:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2516:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2516:7: {...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2516:16: (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2516:18: otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingleWithOptions6708); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSingleWithOptionsAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2520:1: ( (lv_dependsOn_12_0= ruleDEP_ID ) )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==RULE_ID||LA46_0==RULE_FQN) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2521:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2521:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2522:3: lv_dependsOn_12_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getDependsOnDEP_IDParserRuleCall_1_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleSingleWithOptions6729);
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

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions6742); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSingleWithOptionsAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2549:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2549:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2550:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2550:114: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2551:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2554:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2554:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2554:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2555:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2555:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2556:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSingleWithOptions6815); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2576:4: ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2576:4: ({...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2577:5: {...}? => ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2577:114: ( ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2578:6: ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleWithOptionsAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2581:6: ({...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2581:7: {...}? => ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2581:16: ( ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) ) | (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' ) )
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( ((LA48_0>=48 && LA48_0<=49)) ) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==50) ) {
            	        alt48=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2581:17: ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2581:17: ( ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2582:1: ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2582:1: ( (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2583:1: (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2583:1: (lv_other_15_1= 'other' | lv_other_15_2= 'other=\"\"' )
            	            int alt47=2;
            	            int LA47_0 = input.LA(1);

            	            if ( (LA47_0==48) ) {
            	                alt47=1;
            	            }
            	            else if ( (LA47_0==49) ) {
            	                alt47=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 47, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt47) {
            	                case 1 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2584:3: lv_other_15_1= 'other'
            	                    {
            	                    lv_other_15_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleSingleWithOptions6903); 

            	                            newLeafNode(lv_other_15_1, grammarAccess.getSingleWithOptionsAccess().getOtherOtherKeyword_1_5_0_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getSingleWithOptionsRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "other", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2596:8: lv_other_15_2= 'other=\"\"'
            	                    {
            	                    lv_other_15_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleSingleWithOptions6932); 

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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2612:6: (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2612:6: (otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"' )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2612:8: otherlv_16= 'other=\"' ( (lv_otherLabel_17_0= ruleEString ) ) otherlv_18= '\"'
            	            {
            	            otherlv_16=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSingleWithOptions6967); 

            	                	newLeafNode(otherlv_16, grammarAccess.getSingleWithOptionsAccess().getOtherKeyword_1_5_1_0());
            	                
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2616:1: ( (lv_otherLabel_17_0= ruleEString ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2617:1: (lv_otherLabel_17_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2617:1: (lv_otherLabel_17_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2618:3: lv_otherLabel_17_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getOtherLabelEStringParserRuleCall_1_5_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleWithOptions6988);
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

            	            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleWithOptions7000); 

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

            otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSingleWithOptions7060); 

                	newLeafNode(otherlv_19, grammarAccess.getSingleWithOptionsAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2657:1: ( (lv_options_20_0= ruleOption ) )+
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2658:1: (lv_options_20_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2658:1: (lv_options_20_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2659:3: lv_options_20_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleWithOptionsAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingleWithOptions7081);
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

            otherlv_21=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSingleWithOptions7094); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2687:1: entryRuleSingleRef returns [EObject current=null] : iv_ruleSingleRef= ruleSingleRef EOF ;
    public final EObject entryRuleSingleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2688:2: (iv_ruleSingleRef= ruleSingleRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2689:2: iv_ruleSingleRef= ruleSingleRef EOF
            {
             newCompositeNode(grammarAccess.getSingleRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleRef_in_entryRuleSingleRef7130);
            iv_ruleSingleRef=ruleSingleRef();

            state._fsp--;

             current =iv_ruleSingleRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleRef7140); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2696:1: ruleSingleRef returns [EObject current=null] : (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '/>' ) ;
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
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_12_0 = null;

        EObject lv_options_15_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2699:28: ( (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2700:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2700:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2700:3: otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '/>'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleSingleRef7177); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleRefAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2704:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2706:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2706:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2707:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2710:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2711:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2711:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=7;
                int LA54_0 = input.LA(1);

                if ( LA54_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 0) ) {
                    alt54=1;
                }
                else if ( LA54_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 1) ) {
                    alt54=2;
                }
                else if ( LA54_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 2) ) {
                    alt54=3;
                }
                else if ( LA54_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 3) ) {
                    alt54=4;
                }
                else if ( LA54_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 4) ) {
                    alt54=5;
                }
                else if ( LA54_0 ==59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 5) ) {
                    alt54=6;
                }


                switch (alt54) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2713:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2713:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2714:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2714:106: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2715:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2718:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2718:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2718:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2718:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingleRef7235); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSingleRefAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2722:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2723:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2723:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2724:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleRefAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleRef7256);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7268); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2751:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2751:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2752:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2752:106: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2753:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2756:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2756:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2756:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2756:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingleRef7336); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSingleRefAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2760:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_STRING)) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2761:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2761:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2762:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleRefAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleRef7357);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7370); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2789:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2789:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2790:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2790:106: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2791:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2794:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2794:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2794:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2794:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSingleRef7438); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSingleRefAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2798:1: ( (lv_name_9_0= RULE_ID ) )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==RULE_ID) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2799:1: (lv_name_9_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2799:1: (lv_name_9_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2800:3: lv_name_9_0= RULE_ID
            	            {
            	            lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingleRef7455); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7473); 

            	        	newLeafNode(otherlv_10, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2827:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2827:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2828:5: {...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2828:106: ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2829:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2832:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2832:7: {...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2832:16: (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2832:18: otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) )? otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingleRef7541); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSingleRefAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2836:1: ( (lv_dependsOn_12_0= ruleDEP_ID ) )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==RULE_ID||LA53_0==RULE_FQN) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2837:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2837:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2838:3: lv_dependsOn_12_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSingleRefAccess().getDependsOnDEP_IDParserRuleCall_1_3_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleSingleRef7562);
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

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleRef7575); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSingleRefAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2865:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2865:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2866:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2866:106: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2867:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2870:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2870:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2870:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2871:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2871:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2872:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSingleRef7648); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2892:4: ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2892:4: ({...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2893:5: {...}? => ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2893:106: ( ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2894:6: ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleRefAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2897:6: ({...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2897:7: {...}? => ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2897:16: ( (lv_options_15_0= ruleAnswerTemplateRefAttr ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2898:1: (lv_options_15_0= ruleAnswerTemplateRefAttr )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2898:1: (lv_options_15_0= ruleAnswerTemplateRefAttr )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2899:3: lv_options_15_0= ruleAnswerTemplateRefAttr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleRefAccess().getOptionsAnswerTemplateRefAttrParserRuleCall_1_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRefAttr_in_ruleSingleRef7736);
            	    lv_options_15_0=ruleAnswerTemplateRefAttr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_15_0, 
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
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSingleRefAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleSingleRef", "getUnorderedGroupHelper().canLeave(grammarAccess.getSingleRefAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSingleRefAccess().getUnorderedGroup_1());
            	

            }

            otherlv_16=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSingleRef7794); 

                	newLeafNode(otherlv_16, grammarAccess.getSingleRefAccess().getSolidusGreaterThanSignKeyword_2());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2942:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2943:2: (iv_ruleMultiple= ruleMultiple EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2944:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_entryRuleMultiple7830);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiple7840); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2951:1: ruleMultiple returns [EObject current=null] : (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef ) ;
    public final EObject ruleMultiple() throws RecognitionException {
        EObject current = null;

        EObject this_MultipleWithOptions_0 = null;

        EObject this_MultipleRef_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2954:28: ( (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2955:1: (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2955:1: (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef )
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2956:5: this_MultipleWithOptions_0= ruleMultipleWithOptions
                    {
                     
                            newCompositeNode(grammarAccess.getMultipleAccess().getMultipleWithOptionsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleWithOptions_in_ruleMultiple7887);
                    this_MultipleWithOptions_0=ruleMultipleWithOptions();

                    state._fsp--;

                     
                            current = this_MultipleWithOptions_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2966:5: this_MultipleRef_1= ruleMultipleRef
                    {
                     
                            newCompositeNode(grammarAccess.getMultipleAccess().getMultipleRefParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleRef_in_ruleMultiple7914);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2982:1: entryRuleMultipleWithOptions returns [EObject current=null] : iv_ruleMultipleWithOptions= ruleMultipleWithOptions EOF ;
    public final EObject entryRuleMultipleWithOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleWithOptions = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2983:2: (iv_ruleMultipleWithOptions= ruleMultipleWithOptions EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2984:2: iv_ruleMultipleWithOptions= ruleMultipleWithOptions EOF
            {
             newCompositeNode(grammarAccess.getMultipleWithOptionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleWithOptions_in_entryRuleMultipleWithOptions7949);
            iv_ruleMultipleWithOptions=ruleMultipleWithOptions();

            state._fsp--;

             current =iv_ruleMultipleWithOptions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleWithOptions7959); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2991:1: ruleMultipleWithOptions returns [EObject current=null] : (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '>' ( (lv_options_27_0= ruleOption ) )+ otherlv_28= '</multiple>' ) ;
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
        Token lv_other_21_1=null;
        Token lv_other_21_2=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token lv_showLimits_25_1=null;
        Token lv_showLimits_25_2=null;
        Token lv_showLimits_25_3=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_18_0 = null;

        AntlrDatatypeRuleToken lv_otherLabel_23_0 = null;

        EObject lv_options_27_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2994:28: ( (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '>' ( (lv_options_27_0= ruleOption ) )+ otherlv_28= '</multiple>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2995:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '>' ( (lv_options_27_0= ruleOption ) )+ otherlv_28= '</multiple>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2995:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '>' ( (lv_options_27_0= ruleOption ) )+ otherlv_28= '</multiple>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2995:3: otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '>' ( (lv_options_27_0= ruleOption ) )+ otherlv_28= '</multiple>'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleMultipleWithOptions7996); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleWithOptionsAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2999:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3001:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3001:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3002:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3005:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3006:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3006:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=10;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3008:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3008:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3009:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3009:116: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3010:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3013:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3013:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3013:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3013:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleWithOptions8054); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultipleWithOptionsAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3017:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3018:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3018:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3019:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleWithOptions8075);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8087); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3046:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3046:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3047:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3047:116: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3048:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3051:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3051:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3051:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3051:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleWithOptions8155); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultipleWithOptionsAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3055:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_STRING)) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3056:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3056:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3057:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleWithOptions8176);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8189); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3084:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3084:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3085:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3085:116: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3086:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3089:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3089:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3089:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3089:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleWithOptions8257); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMultipleWithOptionsAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3093:1: ( (lv_name_9_0= RULE_ID ) )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==RULE_ID) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3094:1: (lv_name_9_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3094:1: (lv_name_9_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3095:3: lv_name_9_0= RULE_ID
            	            {
            	            lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleWithOptions8274); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8292); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3122:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3122:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3123:5: {...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3123:116: ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3124:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3127:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3127:7: {...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3127:16: (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3127:18: otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultipleWithOptions8360); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMultipleWithOptionsAccess().getMinKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3131:1: ( (lv_min_12_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3132:1: (lv_min_12_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3132:1: (lv_min_12_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3133:3: lv_min_12_0= RULE_INT
            	    {
            	    lv_min_12_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultipleWithOptions8377); 

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

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8394); 

            	        	newLeafNode(otherlv_13, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3160:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3160:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3161:5: {...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3161:116: ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3162:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3165:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3165:7: {...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3165:16: (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3165:18: otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"'
            	    {
            	    otherlv_14=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMultipleWithOptions8462); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMultipleWithOptionsAccess().getMaxKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3169:1: ( (lv_max_15_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3170:1: (lv_max_15_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3170:1: (lv_max_15_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3171:3: lv_max_15_0= RULE_INT
            	    {
            	    lv_max_15_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultipleWithOptions8479); 

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

            	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8496); 

            	        	newLeafNode(otherlv_16, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3198:4: ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3198:4: ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3199:5: {...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3199:116: ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3200:6: ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3203:6: ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3203:7: {...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3203:16: (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3203:18: otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"'
            	    {
            	    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleWithOptions8564); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMultipleWithOptionsAccess().getDependsOnKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3207:1: ( (lv_dependsOn_18_0= ruleDEP_ID ) )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==RULE_ID||LA58_0==RULE_FQN) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3208:1: (lv_dependsOn_18_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3208:1: (lv_dependsOn_18_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3209:3: lv_dependsOn_18_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getDependsOnDEP_IDParserRuleCall_1_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleMultipleWithOptions8585);
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

            	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8598); 

            	        	newLeafNode(otherlv_19, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3236:4: ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3236:4: ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3237:5: {...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3237:116: ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3238:6: ({...}? => ( (lv_required_20_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3241:6: ({...}? => ( (lv_required_20_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3241:7: {...}? => ( (lv_required_20_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3241:16: ( (lv_required_20_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3242:1: (lv_required_20_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3242:1: (lv_required_20_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3243:3: lv_required_20_0= 'required'
            	    {
            	    lv_required_20_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultipleWithOptions8671); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3263:4: ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3263:4: ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3264:5: {...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3264:116: ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3265:6: ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3268:6: ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3268:7: {...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3268:16: ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) )
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( ((LA60_0>=48 && LA60_0<=49)) ) {
            	        alt60=1;
            	    }
            	    else if ( (LA60_0==50) ) {
            	        alt60=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 60, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3268:17: ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3268:17: ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3269:1: ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3269:1: ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3270:1: (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3270:1: (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' )
            	            int alt59=2;
            	            int LA59_0 = input.LA(1);

            	            if ( (LA59_0==48) ) {
            	                alt59=1;
            	            }
            	            else if ( (LA59_0==49) ) {
            	                alt59=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 59, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt59) {
            	                case 1 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3271:3: lv_other_21_1= 'other'
            	                    {
            	                    lv_other_21_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMultipleWithOptions8759); 

            	                            newLeafNode(lv_other_21_1, grammarAccess.getMultipleWithOptionsAccess().getOtherOtherKeyword_1_7_0_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "other", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3283:8: lv_other_21_2= 'other=\"\"'
            	                    {
            	                    lv_other_21_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleMultipleWithOptions8788); 

            	                            newLeafNode(lv_other_21_2, grammarAccess.getMultipleWithOptionsAccess().getOtherOtherKeyword_1_7_0_0_1());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3299:6: (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3299:6: (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3299:8: otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"'
            	            {
            	            otherlv_22=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMultipleWithOptions8823); 

            	                	newLeafNode(otherlv_22, grammarAccess.getMultipleWithOptionsAccess().getOtherKeyword_1_7_1_0());
            	                
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3303:1: ( (lv_otherLabel_23_0= ruleEString ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3304:1: (lv_otherLabel_23_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3304:1: (lv_otherLabel_23_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3305:3: lv_otherLabel_23_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getOtherLabelEStringParserRuleCall_1_7_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleWithOptions8844);
            	            lv_otherLabel_23_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultipleWithOptionsRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"otherLabel",
            	                    		lv_otherLabel_23_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_24=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleWithOptions8856); 

            	                	newLeafNode(otherlv_24, grammarAccess.getMultipleWithOptionsAccess().getQuotationMarkKeyword_1_7_1_2());
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3332:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3332:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3333:5: {...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3333:116: ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3334:6: ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3337:6: ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3337:7: {...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleWithOptions", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3337:16: ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3338:1: ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3338:1: ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3339:1: (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3339:1: (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' )
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3340:3: lv_showLimits_25_1= 'show-limits'
            	            {
            	            lv_showLimits_25_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMultipleWithOptions8932); 

            	                    newLeafNode(lv_showLimits_25_1, grammarAccess.getMultipleWithOptionsAccess().getShowLimitsShowLimitsKeyword_1_8_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3352:8: lv_showLimits_25_2= 'show'
            	            {
            	            lv_showLimits_25_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMultipleWithOptions8961); 

            	                    newLeafNode(lv_showLimits_25_2, grammarAccess.getMultipleWithOptionsAccess().getShowLimitsShowKeyword_1_8_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleWithOptionsRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3364:8: lv_showLimits_25_3= 'limits'
            	            {
            	            lv_showLimits_25_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMultipleWithOptions8990); 

            	                    newLeafNode(lv_showLimits_25_3, grammarAccess.getMultipleWithOptionsAccess().getShowLimitsLimitsKeyword_1_8_0_2());
            	                

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

            otherlv_26=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultipleWithOptions9064); 

                	newLeafNode(otherlv_26, grammarAccess.getMultipleWithOptionsAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3398:1: ( (lv_options_27_0= ruleOption ) )+
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3399:1: (lv_options_27_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3399:1: (lv_options_27_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3400:3: lv_options_27_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleWithOptionsAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultipleWithOptions9085);
            	    lv_options_27_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleWithOptionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_27_0, 
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

            otherlv_28=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleMultipleWithOptions9098); 

                	newLeafNode(otherlv_28, grammarAccess.getMultipleWithOptionsAccess().getMultipleKeyword_4());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3428:1: entryRuleMultipleRef returns [EObject current=null] : iv_ruleMultipleRef= ruleMultipleRef EOF ;
    public final EObject entryRuleMultipleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3429:2: (iv_ruleMultipleRef= ruleMultipleRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3430:2: iv_ruleMultipleRef= ruleMultipleRef EOF
            {
             newCompositeNode(grammarAccess.getMultipleRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleRef_in_entryRuleMultipleRef9134);
            iv_ruleMultipleRef=ruleMultipleRef();

            state._fsp--;

             current =iv_ruleMultipleRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleRef9144); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3437:1: ruleMultipleRef returns [EObject current=null] : (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) ;
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
        Token lv_other_21_1=null;
        Token lv_other_21_2=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token lv_showLimits_25_1=null;
        Token lv_showLimits_25_2=null;
        Token lv_showLimits_25_3=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_18_0 = null;

        AntlrDatatypeRuleToken lv_otherLabel_23_0 = null;

        EObject lv_options_26_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3440:28: ( (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3441:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3441:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3441:3: otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleMultipleRef9181); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleRefAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3445:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3447:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3447:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3448:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3451:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3452:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3452:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+
            int cnt70=0;
            loop70:
            do {
                int alt70=11;
                alt70 = dfa70.predict(input);
                switch (alt70) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3454:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3454:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3455:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3455:108: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3456:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3459:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3459:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3459:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3459:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleRef9239); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultipleRefAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3463:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3464:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3464:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3465:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleRefAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleRef9260);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9272); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3492:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3492:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3493:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3493:108: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3494:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3497:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3497:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3497:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3497:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleRef9340); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultipleRefAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3501:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_STRING)) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3502:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3502:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3503:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleRefAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleRef9361);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9374); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3530:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3530:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3531:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3531:108: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3532:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3535:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3535:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3535:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3535:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleRef9442); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMultipleRefAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3539:1: ( (lv_name_9_0= RULE_ID ) )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==RULE_ID) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3540:1: (lv_name_9_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3540:1: (lv_name_9_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3541:3: lv_name_9_0= RULE_ID
            	            {
            	            lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleRef9459); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9477); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3568:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3568:4: ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3569:5: {...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3569:108: ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3570:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3573:6: ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3573:7: {...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3573:16: (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3573:18: otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultipleRef9545); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMultipleRefAccess().getMinKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3577:1: ( (lv_min_12_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3578:1: (lv_min_12_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3578:1: (lv_min_12_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3579:3: lv_min_12_0= RULE_INT
            	    {
            	    lv_min_12_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultipleRef9562); 

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

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9579); 

            	        	newLeafNode(otherlv_13, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3606:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3606:4: ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3607:5: {...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3607:108: ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3608:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3611:6: ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3611:7: {...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3611:16: (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3611:18: otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"'
            	    {
            	    otherlv_14=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMultipleRef9647); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMultipleRefAccess().getMaxKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3615:1: ( (lv_max_15_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3616:1: (lv_max_15_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3616:1: (lv_max_15_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3617:3: lv_max_15_0= RULE_INT
            	    {
            	    lv_max_15_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultipleRef9664); 

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

            	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9681); 

            	        	newLeafNode(otherlv_16, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3644:4: ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3644:4: ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3645:5: {...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3645:108: ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3646:6: ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3649:6: ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3649:7: {...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3649:16: (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3649:18: otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"'
            	    {
            	    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleRef9749); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMultipleRefAccess().getDependsOnKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3653:1: ( (lv_dependsOn_18_0= ruleDEP_ID ) )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==RULE_ID||LA66_0==RULE_FQN) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3654:1: (lv_dependsOn_18_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3654:1: (lv_dependsOn_18_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3655:3: lv_dependsOn_18_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleRefAccess().getDependsOnDEP_IDParserRuleCall_1_5_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleMultipleRef9770);
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

            	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef9783); 

            	        	newLeafNode(otherlv_19, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3682:4: ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3682:4: ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3683:5: {...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3683:108: ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3684:6: ({...}? => ( (lv_required_20_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3687:6: ({...}? => ( (lv_required_20_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3687:7: {...}? => ( (lv_required_20_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3687:16: ( (lv_required_20_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3688:1: (lv_required_20_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3688:1: (lv_required_20_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3689:3: lv_required_20_0= 'required'
            	    {
            	    lv_required_20_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultipleRef9856); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3709:4: ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3709:4: ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3710:5: {...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3710:108: ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3711:6: ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3714:6: ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3714:7: {...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3714:16: ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) )
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( ((LA68_0>=48 && LA68_0<=49)) ) {
            	        alt68=1;
            	    }
            	    else if ( (LA68_0==50) ) {
            	        alt68=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3714:17: ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3714:17: ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3715:1: ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3715:1: ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3716:1: (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3716:1: (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' )
            	            int alt67=2;
            	            int LA67_0 = input.LA(1);

            	            if ( (LA67_0==48) ) {
            	                alt67=1;
            	            }
            	            else if ( (LA67_0==49) ) {
            	                alt67=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 67, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt67) {
            	                case 1 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3717:3: lv_other_21_1= 'other'
            	                    {
            	                    lv_other_21_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMultipleRef9944); 

            	                            newLeafNode(lv_other_21_1, grammarAccess.getMultipleRefAccess().getOtherOtherKeyword_1_7_0_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "other", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3729:8: lv_other_21_2= 'other=\"\"'
            	                    {
            	                    lv_other_21_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleMultipleRef9973); 

            	                            newLeafNode(lv_other_21_2, grammarAccess.getMultipleRefAccess().getOtherOtherKeyword_1_7_0_0_1());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getMultipleRefRule());
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3745:6: (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3745:6: (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3745:8: otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"'
            	            {
            	            otherlv_22=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMultipleRef10008); 

            	                	newLeafNode(otherlv_22, grammarAccess.getMultipleRefAccess().getOtherKeyword_1_7_1_0());
            	                
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3749:1: ( (lv_otherLabel_23_0= ruleEString ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3750:1: (lv_otherLabel_23_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3750:1: (lv_otherLabel_23_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3751:3: lv_otherLabel_23_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultipleRefAccess().getOtherLabelEStringParserRuleCall_1_7_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleRef10029);
            	            lv_otherLabel_23_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultipleRefRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"otherLabel",
            	                    		lv_otherLabel_23_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_24=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleRef10041); 

            	                	newLeafNode(otherlv_24, grammarAccess.getMultipleRefAccess().getQuotationMarkKeyword_1_7_1_2());
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3778:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3778:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3779:5: {...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3779:108: ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3780:6: ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3783:6: ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3783:7: {...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3783:16: ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3784:1: ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3784:1: ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3785:1: (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3785:1: (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' )
            	    int alt69=3;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt69=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt69=2;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt69=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 69, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt69) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3786:3: lv_showLimits_25_1= 'show-limits'
            	            {
            	            lv_showLimits_25_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMultipleRef10117); 

            	                    newLeafNode(lv_showLimits_25_1, grammarAccess.getMultipleRefAccess().getShowLimitsShowLimitsKeyword_1_8_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3798:8: lv_showLimits_25_2= 'show'
            	            {
            	            lv_showLimits_25_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMultipleRef10146); 

            	                    newLeafNode(lv_showLimits_25_2, grammarAccess.getMultipleRefAccess().getShowLimitsShowKeyword_1_8_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleRefRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3810:8: lv_showLimits_25_3= 'limits'
            	            {
            	            lv_showLimits_25_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMultipleRef10175); 

            	                    newLeafNode(lv_showLimits_25_3, grammarAccess.getMultipleRefAccess().getShowLimitsLimitsKeyword_1_8_0_2());
            	                

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3832:4: ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3832:4: ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3833:5: {...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 9)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3833:108: ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3834:6: ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 9);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3837:6: ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3837:7: {...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultipleRef", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3837:16: ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3838:1: (lv_options_26_0= ruleAnswerTemplateRefAttr )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3838:1: (lv_options_26_0= ruleAnswerTemplateRefAttr )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3839:3: lv_options_26_0= ruleAnswerTemplateRefAttr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleRefAccess().getOptionsAnswerTemplateRefAttrParserRuleCall_1_9_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRefAttr_in_ruleMultipleRef10266);
            	    lv_options_26_0=ruleAnswerTemplateRefAttr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_26_0, 
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
            	    if ( cnt70 >= 1 ) break loop70;
                        EarlyExitException eee =
                            new EarlyExitException(70, input);
                        throw eee;
                }
                cnt70++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleMultipleRef", "getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1());
            	

            }

            otherlv_27=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultipleRef10324); 

                	newLeafNode(otherlv_27, grammarAccess.getMultipleRefAccess().getSolidusGreaterThanSignKeyword_2());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3882:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3883:2: (iv_ruleTable= ruleTable EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3884:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable10360);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable10370); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3891:1: ruleTable returns [EObject current=null] : (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_18= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_22_0= ruleOption ) ) | ( (lv_questions_23_0= ruleTableQuestion ) ) )* otherlv_24= '</table>' ) ;
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
        Token lv_other_12_1=null;
        Token lv_other_12_2=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_multiple_17_0=null;
        Token otherlv_18=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_9_0 = null;

        AntlrDatatypeRuleToken lv_otherLabel_14_0 = null;

        EObject lv_options_20_0 = null;

        EObject lv_questions_21_0 = null;

        EObject lv_options_22_0 = null;

        EObject lv_questions_23_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3894:28: ( (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_18= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_22_0= ruleOption ) ) | ( (lv_questions_23_0= ruleTableQuestion ) ) )* otherlv_24= '</table>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3895:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_18= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_22_0= ruleOption ) ) | ( (lv_questions_23_0= ruleTableQuestion ) ) )* otherlv_24= '</table>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3895:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_18= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_22_0= ruleOption ) ) | ( (lv_questions_23_0= ruleTableQuestion ) ) )* otherlv_24= '</table>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3895:3: otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) ) )* ) ) ) otherlv_18= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_22_0= ruleOption ) ) | ( (lv_questions_23_0= ruleTableQuestion ) ) )* otherlv_24= '</table>'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTable10407); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3899:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3901:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3901:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3902:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3905:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3906:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3906:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) ) )*
            loop77:
            do {
                int alt77=7;
                int LA77_0 = input.LA(1);

                if ( LA77_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
                    alt77=1;
                }
                else if ( LA77_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
                    alt77=2;
                }
                else if ( LA77_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
                    alt77=3;
                }
                else if ( LA77_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
                    alt77=4;
                }
                else if ( LA77_0 >=48 && LA77_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
                    alt77=5;
                }
                else if ( (LA77_0==31||LA77_0==55) && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
                    alt77=6;
                }


                switch (alt77) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3908:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3908:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3909:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3909:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3910:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3913:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3913:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3913:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3913:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) )? otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable10465); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3917:1: ( (lv_title_3_0= ruleEString ) )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_STRING)) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3918:1: (lv_title_3_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3918:1: (lv_title_3_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3919:3: lv_title_3_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable10486);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable10499); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3946:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3946:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3947:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3947:102: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3948:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3951:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3951:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3951:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3951:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable10567); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3955:1: ( (lv_description_6_0= ruleEString ) )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( ((LA72_0>=RULE_ID && LA72_0<=RULE_STRING)) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3956:1: (lv_description_6_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3956:1: (lv_description_6_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3957:3: lv_description_6_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTableAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable10588);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable10601); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3984:4: ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3984:4: ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3985:5: {...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3985:102: ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3986:6: ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3989:6: ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3989:7: {...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3989:16: (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3989:18: otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) )? otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTable10669); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTableAccess().getDependsOnKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3993:1: ( (lv_dependsOn_9_0= ruleDEP_ID ) )?
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==RULE_ID||LA73_0==RULE_FQN) ) {
            	        alt73=1;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3994:1: (lv_dependsOn_9_0= ruleDEP_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3994:1: (lv_dependsOn_9_0= ruleDEP_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3995:3: lv_dependsOn_9_0= ruleDEP_ID
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTableAccess().getDependsOnDEP_IDParserRuleCall_1_2_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleTable10690);
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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable10703); 

            	        	newLeafNode(otherlv_10, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4022:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4022:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4023:5: {...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4023:102: ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4024:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4027:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4027:7: {...}? => ( (lv_required_11_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4027:16: ( (lv_required_11_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4028:1: (lv_required_11_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4028:1: (lv_required_11_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4029:3: lv_required_11_0= 'required'
            	    {
            	    lv_required_11_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTable10776); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4049:4: ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4049:4: ({...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4050:5: {...}? => ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4050:102: ( ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4051:6: ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4054:6: ({...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4054:7: {...}? => ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4054:16: ( ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) ) | (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' ) )
            	    int alt75=2;
            	    int LA75_0 = input.LA(1);

            	    if ( ((LA75_0>=48 && LA75_0<=49)) ) {
            	        alt75=1;
            	    }
            	    else if ( (LA75_0==50) ) {
            	        alt75=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 75, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt75) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4054:17: ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4054:17: ( ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4055:1: ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4055:1: ( (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4056:1: (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4056:1: (lv_other_12_1= 'other' | lv_other_12_2= 'other=\"\"' )
            	            int alt74=2;
            	            int LA74_0 = input.LA(1);

            	            if ( (LA74_0==48) ) {
            	                alt74=1;
            	            }
            	            else if ( (LA74_0==49) ) {
            	                alt74=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 74, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt74) {
            	                case 1 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4057:3: lv_other_12_1= 'other'
            	                    {
            	                    lv_other_12_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTable10864); 

            	                            newLeafNode(lv_other_12_1, grammarAccess.getTableAccess().getOtherOtherKeyword_1_4_0_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getTableRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "other", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4069:8: lv_other_12_2= 'other=\"\"'
            	                    {
            	                    lv_other_12_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTable10893); 

            	                            newLeafNode(lv_other_12_2, grammarAccess.getTableAccess().getOtherOtherKeyword_1_4_0_0_1());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getTableRule());
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4085:6: (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4085:6: (otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"' )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4085:8: otherlv_13= 'other=\"' ( (lv_otherLabel_14_0= ruleEString ) ) otherlv_15= '\"'
            	            {
            	            otherlv_13=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTable10928); 

            	                	newLeafNode(otherlv_13, grammarAccess.getTableAccess().getOtherKeyword_1_4_1_0());
            	                
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4089:1: ( (lv_otherLabel_14_0= ruleEString ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4090:1: (lv_otherLabel_14_0= ruleEString )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4090:1: (lv_otherLabel_14_0= ruleEString )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4091:3: lv_otherLabel_14_0= ruleEString
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTableAccess().getOtherLabelEStringParserRuleCall_1_4_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable10949);
            	            lv_otherLabel_14_0=ruleEString();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTableRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"otherLabel",
            	                    		lv_otherLabel_14_0, 
            	                    		"EString");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable10961); 

            	                	newLeafNode(otherlv_15, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_4_1_2());
            	                

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
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4118:4: ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4118:4: ({...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4119:5: {...}? => ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4119:102: ( ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4120:6: ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4123:6: ({...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4123:7: {...}? => (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4123:16: (otherlv_16= 'single' | ( (lv_multiple_17_0= 'multiple' ) ) )
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==31) ) {
            	        alt76=1;
            	    }
            	    else if ( (LA76_0==55) ) {
            	        alt76=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 76, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4123:18: otherlv_16= 'single'
            	            {
            	            otherlv_16=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTable11030); 

            	                	newLeafNode(otherlv_16, grammarAccess.getTableAccess().getSingleKeyword_1_5_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4128:6: ( (lv_multiple_17_0= 'multiple' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4128:6: ( (lv_multiple_17_0= 'multiple' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4129:1: (lv_multiple_17_0= 'multiple' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4129:1: (lv_multiple_17_0= 'multiple' )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4130:3: lv_multiple_17_0= 'multiple'
            	            {
            	            lv_multiple_17_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTable11054); 

            	                    newLeafNode(lv_multiple_17_0, grammarAccess.getTableAccess().getMultipleMultipleKeyword_1_5_1_0());
            	                

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
            	    break loop77;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	

            }

            otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTable11120); 

                	newLeafNode(otherlv_18, grammarAccess.getTableAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4161:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4163:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4163:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4164:2: ( ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4167:2: ( ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4168:3: ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4168:3: ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+
            int cnt80=0;
            loop80:
            do {
                int alt80=3;
                alt80 = dfa80.predict(input);
                switch (alt80) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4170:4: ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4170:4: ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4171:5: {...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4171:102: ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4172:6: ({...}? => ( (lv_options_20_0= ruleOption ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4175:6: ({...}? => ( (lv_options_20_0= ruleOption ) ) )+
            	    int cnt78=0;
            	    loop78:
            	    do {
            	        int alt78=2;
            	        int LA78_0 = input.LA(1);

            	        if ( (LA78_0==20) ) {
            	            int LA78_1 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt78=1;
            	            }


            	        }
            	        else if ( (LA78_0==23) ) {
            	            int LA78_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt78=1;
            	            }


            	        }


            	        switch (alt78) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4175:7: {...}? => ( (lv_options_20_0= ruleOption ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4175:16: ( (lv_options_20_0= ruleOption ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4176:1: (lv_options_20_0= ruleOption )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4176:1: (lv_options_20_0= ruleOption )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4177:3: lv_options_20_0= ruleOption
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_3_0_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable11186);
            	    	    lv_options_20_0=ruleOption();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"options",
            	    	            		lv_options_20_0, 
            	    	            		"Option");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt78 >= 1 ) break loop78;
            	                EarlyExitException eee =
            	                    new EarlyExitException(78, input);
            	                throw eee;
            	        }
            	        cnt78++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4200:4: ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4200:4: ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4201:5: {...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4201:102: ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4202:6: ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4205:6: ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+
            	    int cnt79=0;
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==60) ) {
            	            int LA79_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt79=1;
            	            }


            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4205:7: {...}? => ( (lv_questions_21_0= ruleTableQuestion ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4205:16: ( (lv_questions_21_0= ruleTableQuestion ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4206:1: (lv_questions_21_0= ruleTableQuestion )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4206:1: (lv_questions_21_0= ruleTableQuestion )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4207:3: lv_questions_21_0= ruleTableQuestion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable11262);
            	    	    lv_questions_21_0=ruleTableQuestion();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"questions",
            	    	            		lv_questions_21_0, 
            	    	            		"TableQuestion");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4238:2: ( ( (lv_options_22_0= ruleOption ) ) | ( (lv_questions_23_0= ruleTableQuestion ) ) )*
            loop81:
            do {
                int alt81=3;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==20||LA81_0==23) ) {
                    alt81=1;
                }
                else if ( (LA81_0==60) ) {
                    alt81=2;
                }


                switch (alt81) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4238:3: ( (lv_options_22_0= ruleOption ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4238:3: ( (lv_options_22_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4239:1: (lv_options_22_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4239:1: (lv_options_22_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4240:3: lv_options_22_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable11331);
            	    lv_options_22_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_22_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4257:6: ( (lv_questions_23_0= ruleTableQuestion ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4257:6: ( (lv_questions_23_0= ruleTableQuestion ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4258:1: (lv_questions_23_0= ruleTableQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4258:1: (lv_questions_23_0= ruleTableQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4259:3: lv_questions_23_0= ruleTableQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable11358);
            	    lv_questions_23_0=ruleTableQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_23_0, 
            	            		"TableQuestion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            otherlv_24=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTable11372); 

                	newLeafNode(otherlv_24, grammarAccess.getTableAccess().getTableKeyword_5());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4287:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4288:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4289:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt11409);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt11420); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4296:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4299:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4300:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4300:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4300:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4300:2: (kw= '-' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==57) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4301:2: kw= '-'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleEInt11459); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt11476); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4321:1: entryRuleAnswerTemplateRef returns [EObject current=null] : iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF ;
    public final EObject entryRuleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplateRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4322:2: (iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4323:2: iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef11521);
            iv_ruleAnswerTemplateRef=ruleAnswerTemplateRef();

            state._fsp--;

             current =iv_ruleAnswerTemplateRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplateRef11531); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4330:1: ruleAnswerTemplateRef returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' ) ;
    public final EObject ruleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4333:28: ( (otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4334:1: (otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4334:1: (otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4334:3: otherlv_0= '<template' otherlv_1= 'ref=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswerTemplateRef11568); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateRefAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleAnswerTemplateRef11580); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateRefAccess().getRefKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4342:1: ( (otherlv_2= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4343:1: (otherlv_2= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4343:1: (otherlv_2= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4344:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRefRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplateRef11600); 

            		newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateRefAccess().getTemplateAnswerTemplateCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswerTemplateRef11612); 

                	newLeafNode(otherlv_3, grammarAccess.getAnswerTemplateRefAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAnswerTemplateRef11624); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4371:1: entryRuleAnswerTemplateRefAttr returns [EObject current=null] : iv_ruleAnswerTemplateRefAttr= ruleAnswerTemplateRefAttr EOF ;
    public final EObject entryRuleAnswerTemplateRefAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplateRefAttr = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4372:2: (iv_ruleAnswerTemplateRefAttr= ruleAnswerTemplateRefAttr EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4373:2: iv_ruleAnswerTemplateRefAttr= ruleAnswerTemplateRefAttr EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRefAttrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRefAttr_in_entryRuleAnswerTemplateRefAttr11660);
            iv_ruleAnswerTemplateRefAttr=ruleAnswerTemplateRefAttr();

            state._fsp--;

             current =iv_ruleAnswerTemplateRefAttr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplateRefAttr11670); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4380:1: ruleAnswerTemplateRefAttr returns [EObject current=null] : (otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' ) ;
    public final EObject ruleAnswerTemplateRefAttr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4383:28: ( (otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4384:1: (otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4384:1: (otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4384:3: otherlv_0= 'template=\"' ( (otherlv_1= RULE_ID ) ) otherlv_2= '\"'
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleAnswerTemplateRefAttr11707); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateRefAttrAccess().getTemplateKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4388:1: ( (otherlv_1= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4389:1: (otherlv_1= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4389:1: (otherlv_1= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4390:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRefAttrRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplateRefAttr11727); 

            		newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateRefAttrAccess().getTemplateAnswerTemplateCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswerTemplateRefAttr11739); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4413:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4414:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4415:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion11775);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion11785); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4422:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= '<q' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_6= '>' ( (lv_title_7_0= ruleEString ) ) otherlv_8= '</q>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4425:28: ( (otherlv_0= '<q' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_6= '>' ( (lv_title_7_0= ruleEString ) ) otherlv_8= '</q>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4426:1: (otherlv_0= '<q' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_6= '>' ( (lv_title_7_0= ruleEString ) ) otherlv_8= '</q>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4426:1: (otherlv_0= '<q' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_6= '>' ( (lv_title_7_0= ruleEString ) ) otherlv_8= '</q>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4426:3: otherlv_0= '<q' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_6= '>' ( (lv_title_7_0= ruleEString ) ) otherlv_8= '</q>'
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleTableQuestion11822); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4430:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4432:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4432:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4433:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4436:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4437:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4437:3: ( ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) ) )*
            loop84:
            do {
                int alt84=3;
                int LA84_0 = input.LA(1);

                if ( LA84_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 0) ) {
                    alt84=1;
                }
                else if ( LA84_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 1) ) {
                    alt84=2;
                }


                switch (alt84) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4439:4: ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4439:4: ({...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4440:5: {...}? => ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTableQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4440:110: ( ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4441:6: ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4444:6: ({...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4444:7: {...}? => (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTableQuestion", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4444:16: (otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4444:18: otherlv_2= 'id=\"' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTableQuestion11880); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTableQuestionAccess().getIdKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4448:1: ( (lv_name_3_0= RULE_ID ) )?
            	    int alt83=2;
            	    int LA83_0 = input.LA(1);

            	    if ( (LA83_0==RULE_ID) ) {
            	        alt83=1;
            	    }
            	    switch (alt83) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4449:1: (lv_name_3_0= RULE_ID )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4449:1: (lv_name_3_0= RULE_ID )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4450:3: lv_name_3_0= RULE_ID
            	            {
            	            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTableQuestion11897); 

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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTableQuestion11915); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTableQuestionAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4477:4: ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4477:4: ({...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4478:5: {...}? => ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTableQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4478:110: ( ({...}? => ( (lv_required_5_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4479:6: ({...}? => ( (lv_required_5_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4482:6: ({...}? => ( (lv_required_5_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4482:7: {...}? => ( (lv_required_5_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTableQuestion", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4482:16: ( (lv_required_5_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4483:1: (lv_required_5_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4483:1: (lv_required_5_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4484:3: lv_required_5_0= 'required'
            	    {
            	    lv_required_5_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTableQuestion11988); 

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
            	    break loop84;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableQuestionAccess().getUnorderedGroup_1());
            	

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTableQuestion12053); 

                	newLeafNode(otherlv_6, grammarAccess.getTableQuestionAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4515:1: ( (lv_title_7_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4516:1: (lv_title_7_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4516:1: (lv_title_7_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4517:3: lv_title_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getTitleEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTableQuestion12074);
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

            otherlv_8=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleTableQuestion12086); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4545:1: entryRuleDEP_ID returns [String current=null] : iv_ruleDEP_ID= ruleDEP_ID EOF ;
    public final String entryRuleDEP_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDEP_ID = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4546:2: (iv_ruleDEP_ID= ruleDEP_ID EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4547:2: iv_ruleDEP_ID= ruleDEP_ID EOF
            {
             newCompositeNode(grammarAccess.getDEP_IDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_entryRuleDEP_ID12123);
            iv_ruleDEP_ID=ruleDEP_ID();

            state._fsp--;

             current =iv_ruleDEP_ID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDEP_ID12134); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4554:1: ruleDEP_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN ) ;
    public final AntlrDatatypeRuleToken ruleDEP_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_FQN_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4557:28: ( (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4558:1: (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4558:1: (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID) ) {
                alt85=1;
            }
            else if ( (LA85_0==RULE_FQN) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4558:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDEP_ID12174); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getDEP_IDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4566:10: this_FQN_1= RULE_FQN
                    {
                    this_FQN_1=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleDEP_ID12200); 

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


    // $ANTLR start "ruleDateMode"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4581:1: ruleDateMode returns [Enumerator current=null] : ( (enumLiteral_0= 'day' ) | (enumLiteral_1= 'month' ) | (enumLiteral_2= 'year' ) ) ;
    public final Enumerator ruleDateMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4583:28: ( ( (enumLiteral_0= 'day' ) | (enumLiteral_1= 'month' ) | (enumLiteral_2= 'year' ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4584:1: ( (enumLiteral_0= 'day' ) | (enumLiteral_1= 'month' ) | (enumLiteral_2= 'year' ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4584:1: ( (enumLiteral_0= 'day' ) | (enumLiteral_1= 'month' ) | (enumLiteral_2= 'year' ) )
            int alt86=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt86=1;
                }
                break;
            case 63:
                {
                alt86=2;
                }
                break;
            case 64:
                {
                alt86=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4584:2: (enumLiteral_0= 'day' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4584:2: (enumLiteral_0= 'day' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4584:4: enumLiteral_0= 'day'
                    {
                    enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleDateMode12259); 

                            current = grammarAccess.getDateModeAccess().getDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDateModeAccess().getDAYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4590:6: (enumLiteral_1= 'month' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4590:6: (enumLiteral_1= 'month' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4590:8: enumLiteral_1= 'month'
                    {
                    enumLiteral_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleDateMode12276); 

                            current = grammarAccess.getDateModeAccess().getMONTHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDateModeAccess().getMONTHEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4596:6: (enumLiteral_2= 'year' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4596:6: (enumLiteral_2= 'year' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:4596:8: enumLiteral_2= 'year'
                    {
                    enumLiteral_2=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleDateMode12293); 

                            current = grammarAccess.getDateModeAccess().getYEAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDateModeAccess().getYEAREnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleDateMode"

    // Delegated rules


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA80 dfa80 = new DFA80(this);
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
            return "()+ loopback of 1226:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= ruleEInt ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= ruleEInt ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'min-label=\"' ( (lv_minLabel_18_0= ruleEString ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'max-label=\"' ( (lv_maxLabel_21_0= ruleEString ) )? otherlv_22= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'depends-on=\"' ( (lv_dependsOn_24_0= ruleDEP_ID ) )? otherlv_25= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+";
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
        "\13\uffff";
    static final String DFA37_eofS =
        "\13\uffff";
    static final String DFA37_minS =
        "\1\15\12\uffff";
    static final String DFA37_maxS =
        "\1\100\12\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA37_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\2\1\uffff\1\3\5\uffff\1\4\4\uffff\1\7\1\11\6\uffff\1\1\6"+
            "\uffff\1\5\1\6\3\10\20\uffff\3\12",
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
            return "()+ loopback of 1609:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'start=\"' ( (lv_start_13_0= ruleEString ) )? otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'end=\"' ( (lv_end_16_0= ruleEString ) )? otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mode_23_0= ruleDateMode ) ) ) ) ) )+";
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

                        else if ( LA37_0 >=62 && LA37_0<=64 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                         
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
            return "()+ loopback of 2000:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) )? otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) )? otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=\"' ( (lv_min_13_0= ruleEInt ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'max=\"' ( (lv_max_16_0= ruleEInt ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) )? otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_22_1= 'show-limits' | lv_showLimits_22_2= 'show' | lv_showLimits_22_3= 'limits' ) ) ) ) ) ) )+";
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
        "\24\uffff";
    static final String DFA43_eofS =
        "\24\uffff";
    static final String DFA43_minS =
        "\1\57\1\15\4\4\1\15\2\uffff\4\16\1\15\1\16\1\15\2\16\2\15";
    static final String DFA43_maxS =
        "\1\57\1\73\1\5\3\16\1\73\2\uffff\4\16\1\73\1\16\1\73\2\16\2\73";
    static final String DFA43_acceptS =
        "\7\uffff\1\2\1\1\13\uffff";
    static final String DFA43_specialS =
        "\24\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1",
            "\1\2\1\uffff\1\3\5\uffff\1\4\4\uffff\1\5\1\6\24\uffff\3\10"+
            "\10\uffff\1\7",
            "\1\12\1\11",
            "\1\14\1\13\10\uffff\1\15",
            "\1\16\11\uffff\1\17",
            "\1\20\2\uffff\1\21\6\uffff\1\22",
            "\1\2\1\uffff\1\3\2\uffff\1\10\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\7\15\uffff\3\10\10\uffff\1\7",
            "",
            "",
            "\1\23",
            "\1\23",
            "\1\15",
            "\1\15",
            "\1\2\1\uffff\1\3\2\uffff\1\10\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\7\15\uffff\3\10\10\uffff\1\7",
            "\1\17",
            "\1\2\1\uffff\1\3\2\uffff\1\10\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\7\15\uffff\3\10\10\uffff\1\7",
            "\1\22",
            "\1\22",
            "\1\2\1\uffff\1\3\2\uffff\1\10\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\7\15\uffff\3\10\10\uffff\1\7",
            "\1\2\1\uffff\1\3\2\uffff\1\10\2\uffff\1\4\4\uffff\1\5\1\6\6"+
            "\uffff\1\7\15\uffff\3\10\10\uffff\1\7"
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
            return "2344:1: (this_SingleWithOptions_0= ruleSingleWithOptions | this_SingleRef_1= ruleSingleRef )";
        }
    }
    static final String DFA55_eotS =
        "\43\uffff";
    static final String DFA55_eofS =
        "\43\uffff";
    static final String DFA55_minS =
        "\1\64\1\15\3\4\2\6\1\4\3\15\1\4\3\15\1\uffff\4\16\1\15\1\16\1\15"+
        "\4\16\1\15\1\uffff\2\16\4\15";
    static final String DFA55_maxS =
        "\1\64\1\73\1\5\2\16\2\6\1\16\3\73\1\5\3\73\1\uffff\4\16\1\73\1\16"+
        "\1\73\4\16\1\73\1\uffff\2\16\4\73";
    static final String DFA55_acceptS =
        "\17\uffff\1\2\14\uffff\1\1\6\uffff";
    static final String DFA55_specialS =
        "\43\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\1",
            "\1\2\1\uffff\1\3\5\uffff\1\4\4\uffff\1\7\1\10\10\uffff\1\5"+
            "\1\6\5\uffff\1\14\1\15\1\16\2\uffff\1\11\1\12\1\13\10\uffff"+
            "\1\17",
            "\1\21\1\20",
            "\1\23\1\22\10\uffff\1\24",
            "\1\25\11\uffff\1\26",
            "\1\27",
            "\1\30",
            "\1\31\2\uffff\1\32\6\uffff\1\33",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17",
            "\1\36\1\35",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17",
            "",
            "\1\37",
            "\1\37",
            "\1\24",
            "\1\24",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17",
            "\1\26",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17",
            "\1\40",
            "\1\41",
            "\1\33",
            "\1\33",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17",
            "",
            "\1\42",
            "\1\42",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17",
            "\1\2\1\uffff\1\3\2\uffff\1\34\2\uffff\1\4\4\uffff\1\7\1\10"+
            "\6\uffff\1\17\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\2\uffff"+
            "\1\11\1\12\1\13\10\uffff\1\17"
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "2955:1: (this_MultipleWithOptions_0= ruleMultipleWithOptions | this_MultipleRef_1= ruleMultipleRef )";
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
            "\1\2\1\uffff\1\3\2\uffff\1\1\2\uffff\1\4\4\uffff\1\7\1\10\10"+
            "\uffff\1\5\1\6\5\uffff\3\12\2\uffff\3\11",
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
            return "()+ loopback of 3006:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) )+";
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

                        else if ( LA62_0 >=48 && LA62_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleWithOptionsAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

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
    static final String DFA70_eotS =
        "\14\uffff";
    static final String DFA70_eofS =
        "\14\uffff";
    static final String DFA70_minS =
        "\1\15\13\uffff";
    static final String DFA70_maxS =
        "\1\73\13\uffff";
    static final String DFA70_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA70_specialS =
        "\1\0\13\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\2\1\uffff\1\3\5\uffff\1\4\4\uffff\1\7\1\10\6\uffff\1\1\1"+
            "\uffff\1\5\1\6\5\uffff\3\12\2\uffff\3\11\10\uffff\1\13",
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

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "()+ loopback of 3452:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) )? otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) )? otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=\"' ( (lv_min_12_0= RULE_INT ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=\"' ( (lv_max_15_0= RULE_INT ) ) otherlv_16= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'depends-on=\"' ( (lv_dependsOn_18_0= ruleDEP_ID ) )? otherlv_19= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_20_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_other_21_1= 'other' | lv_other_21_2= 'other=\"\"' ) ) ) | (otherlv_22= 'other=\"' ( (lv_otherLabel_23_0= ruleEString ) ) otherlv_24= '\"' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_25_1= 'show-limits' | lv_showLimits_25_2= 'show' | lv_showLimits_25_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_26_0= ruleAnswerTemplateRefAttr ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_0 = input.LA(1);

                         
                        int index70_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA70_0==34) ) {s = 1;}

                        else if ( LA70_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA70_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA70_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA70_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA70_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA70_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA70_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA70_0 >=48 && LA70_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA70_0 >=43 && LA70_0<=45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                        else if ( LA70_0 ==59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleRefAccess().getUnorderedGroup_1(), 9) ) {s = 11;}

                         
                        input.seek(index70_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA80_eotS =
        "\32\uffff";
    static final String DFA80_eofS =
        "\32\uffff";
    static final String DFA80_minS =
        "\1\24\1\72\2\22\1\uffff\4\4\1\22\1\4\2\16\1\22\2\30\1\16\1\22\2"+
        "\75\1\42\3\0\2\uffff";
    static final String DFA80_maxS =
        "\1\74\1\72\1\25\1\33\1\uffff\1\4\1\16\1\5\1\16\1\33\1\5\2\16\1\22"+
        "\2\30\1\16\1\33\2\75\1\42\3\0\2\uffff";
    static final String DFA80_acceptS =
        "\4\uffff\1\3\23\uffff\1\1\1\2";
    static final String DFA80_specialS =
        "\25\uffff\1\1\1\0\1\2\2\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\1\2\uffff\1\2\40\uffff\1\4\3\uffff\1\3",
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

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "()+ loopback of 4168:3: ( ({...}? => ( ({...}? => ( (lv_options_20_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_21_0= ruleTableQuestion ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_22 = input.LA(1);

                         
                        int index80_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {s = 25;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index80_22);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_21 = input.LA(1);

                         
                        int index80_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 24;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index80_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA80_23 = input.LA(1);

                         
                        int index80_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 24;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index80_23);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
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
        public static final BitSet FOLLOW_18_in_ruleSurvey590 = new BitSet(new long[]{0x0050C10822180000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey612 = new BitSet(new long[]{0x0050C10822180000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey639 = new BitSet(new long[]{0x0050C10822180000L});
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
        public static final BitSet FOLLOW_18_in_ruleGroup2242 = new BitSet(new long[]{0x0050C10822000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup2263 = new BitSet(new long[]{0x0050C10832000000L});
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
        public static final BitSet FOLLOW_36_in_ruleScale3513 = new BitSet(new long[]{0x0200000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3534 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3546 = new BitSet(new long[]{0x000000F40C20A000L});
        public static final BitSet FOLLOW_37_in_ruleScale3614 = new BitSet(new long[]{0x0200000000000040L});
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
        public static final BitSet FOLLOW_40_in_ruleDate4189 = new BitSet(new long[]{0xC0003E000C20A000L,0x0000000000000001L});
        public static final BitSet FOLLOW_13_in_ruleDate4247 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4268 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4280 = new BitSet(new long[]{0xC0003E040C20A000L,0x0000000000000001L});
        public static final BitSet FOLLOW_15_in_ruleDate4348 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4369 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4382 = new BitSet(new long[]{0xC0003E040C20A000L,0x0000000000000001L});
        public static final BitSet FOLLOW_21_in_ruleDate4450 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDate4467 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4485 = new BitSet(new long[]{0xC0003E040C20A000L,0x0000000000000001L});
        public static final BitSet FOLLOW_41_in_ruleDate4553 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4574 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4587 = new BitSet(new long[]{0xC0003E040C20A000L,0x0000000000000001L});
        public static final BitSet FOLLOW_42_in_ruleDate4655 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4676 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4689 = new BitSet(new long[]{0xC0003E040C20A000L,0x0000000000000001L});
        public static final BitSet FOLLOW_26_in_ruleDate4757 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleDate4778 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4791 = new BitSet(new long[]{0xC0003E040C20A000L,0x0000000000000001L});
        public static final BitSet FOLLOW_43_in_ruleDate4866 = new BitSet(new long[]{0xC0003E040C20A000L,0x0000000000000001L});
        public static final BitSet FOLLOW_44_in_ruleDate4895 = new BitSet(new long[]{0xC0003E040C20A000L,0x0000000000000001L});
        public static final BitSet FOLLOW_45_in_ruleDate4924 = new BitSet(new long[]{0xC0003E040C20A000L,0x0000000000000001L});
        public static final BitSet FOLLOW_27_in_ruleDate5012 = new BitSet(new long[]{0xC0003E040C20A000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleDateMode_in_ruleDate5100 = new BitSet(new long[]{0xC0003E040C20A000L,0x0000000000000001L});
        public static final BitSet FOLLOW_34_in_ruleDate5158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber5194 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber5204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleNumber5250 = new BitSet(new long[]{0x000038300C20A000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5308 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5329 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5341 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_15_in_ruleNumber5409 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5430 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5443 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_21_in_ruleNumber5511 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNumber5528 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5546 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_36_in_ruleNumber5614 = new BitSet(new long[]{0x0200000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5635 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5647 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_37_in_ruleNumber5715 = new BitSet(new long[]{0x0200000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5736 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5748 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_26_in_ruleNumber5816 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleNumber5837 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5850 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_27_in_ruleNumber5923 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_43_in_ruleNumber6010 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_44_in_ruleNumber6039 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_45_in_ruleNumber6068 = new BitSet(new long[]{0x000038340C20A000L});
        public static final BitSet FOLLOW_34_in_ruleNumber6142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_entryRuleSingle6178 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingle6188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleWithOptions_in_ruleSingle6235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRef_in_ruleSingle6262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleWithOptions_in_entryRuleSingleWithOptions6297 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleWithOptions6307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleSingleWithOptions6344 = new BitSet(new long[]{0x000700000C20A000L});
        public static final BitSet FOLLOW_13_in_ruleSingleWithOptions6402 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleWithOptions6423 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions6435 = new BitSet(new long[]{0x000700000C24A000L});
        public static final BitSet FOLLOW_15_in_ruleSingleWithOptions6503 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleWithOptions6524 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions6537 = new BitSet(new long[]{0x000700000C24A000L});
        public static final BitSet FOLLOW_21_in_ruleSingleWithOptions6605 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleWithOptions6622 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions6640 = new BitSet(new long[]{0x000700000C24A000L});
        public static final BitSet FOLLOW_26_in_ruleSingleWithOptions6708 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleSingleWithOptions6729 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions6742 = new BitSet(new long[]{0x000700000C24A000L});
        public static final BitSet FOLLOW_27_in_ruleSingleWithOptions6815 = new BitSet(new long[]{0x000700000C24A000L});
        public static final BitSet FOLLOW_48_in_ruleSingleWithOptions6903 = new BitSet(new long[]{0x000700000C24A000L});
        public static final BitSet FOLLOW_49_in_ruleSingleWithOptions6932 = new BitSet(new long[]{0x000700000C24A000L});
        public static final BitSet FOLLOW_50_in_ruleSingleWithOptions6967 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleWithOptions6988 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleWithOptions7000 = new BitSet(new long[]{0x000700000C24A000L});
        public static final BitSet FOLLOW_18_in_ruleSingleWithOptions7060 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingleWithOptions7081 = new BitSet(new long[]{0x0008000000900000L});
        public static final BitSet FOLLOW_51_in_ruleSingleWithOptions7094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRef_in_entryRuleSingleRef7130 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleRef7140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleSingleRef7177 = new BitSet(new long[]{0x080000000C20A000L});
        public static final BitSet FOLLOW_13_in_ruleSingleRef7235 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleRef7256 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7268 = new BitSet(new long[]{0x080000040C20A000L});
        public static final BitSet FOLLOW_15_in_ruleSingleRef7336 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleRef7357 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7370 = new BitSet(new long[]{0x080000040C20A000L});
        public static final BitSet FOLLOW_21_in_ruleSingleRef7438 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleRef7455 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7473 = new BitSet(new long[]{0x080000040C20A000L});
        public static final BitSet FOLLOW_26_in_ruleSingleRef7541 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleSingleRef7562 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleRef7575 = new BitSet(new long[]{0x080000040C20A000L});
        public static final BitSet FOLLOW_27_in_ruleSingleRef7648 = new BitSet(new long[]{0x080000040C20A000L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRefAttr_in_ruleSingleRef7736 = new BitSet(new long[]{0x080000040C20A000L});
        public static final BitSet FOLLOW_34_in_ruleSingleRef7794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple7830 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiple7840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleWithOptions_in_ruleMultiple7887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleRef_in_ruleMultiple7914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleWithOptions_in_entryRuleMultipleWithOptions7949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleWithOptions7959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleMultipleWithOptions7996 = new BitSet(new long[]{0x000738300C20A000L});
        public static final BitSet FOLLOW_13_in_ruleMultipleWithOptions8054 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleWithOptions8075 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8087 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_15_in_ruleMultipleWithOptions8155 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleWithOptions8176 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8189 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_21_in_ruleMultipleWithOptions8257 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleWithOptions8274 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8292 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_36_in_ruleMultipleWithOptions8360 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultipleWithOptions8377 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8394 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_37_in_ruleMultipleWithOptions8462 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultipleWithOptions8479 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8496 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_26_in_ruleMultipleWithOptions8564 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleMultipleWithOptions8585 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8598 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_27_in_ruleMultipleWithOptions8671 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_48_in_ruleMultipleWithOptions8759 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_49_in_ruleMultipleWithOptions8788 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_50_in_ruleMultipleWithOptions8823 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleWithOptions8844 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleWithOptions8856 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_43_in_ruleMultipleWithOptions8932 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_44_in_ruleMultipleWithOptions8961 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_45_in_ruleMultipleWithOptions8990 = new BitSet(new long[]{0x000738300C24A000L});
        public static final BitSet FOLLOW_18_in_ruleMultipleWithOptions9064 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultipleWithOptions9085 = new BitSet(new long[]{0x0020000000900000L});
        public static final BitSet FOLLOW_53_in_ruleMultipleWithOptions9098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleRef_in_entryRuleMultipleRef9134 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleRef9144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleMultipleRef9181 = new BitSet(new long[]{0x080738300C20A000L});
        public static final BitSet FOLLOW_13_in_ruleMultipleRef9239 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleRef9260 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9272 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_15_in_ruleMultipleRef9340 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleRef9361 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9374 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_21_in_ruleMultipleRef9442 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleRef9459 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9477 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_36_in_ruleMultipleRef9545 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultipleRef9562 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9579 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_37_in_ruleMultipleRef9647 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultipleRef9664 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9681 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_26_in_ruleMultipleRef9749 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleMultipleRef9770 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef9783 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_27_in_ruleMultipleRef9856 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_48_in_ruleMultipleRef9944 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_49_in_ruleMultipleRef9973 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_50_in_ruleMultipleRef10008 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleRef10029 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleRef10041 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_43_in_ruleMultipleRef10117 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_44_in_ruleMultipleRef10146 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_45_in_ruleMultipleRef10175 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRefAttr_in_ruleMultipleRef10266 = new BitSet(new long[]{0x080738340C20A000L});
        public static final BitSet FOLLOW_34_in_ruleMultipleRef10324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable10360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable10370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTable10407 = new BitSet(new long[]{0x008700008C04A000L});
        public static final BitSet FOLLOW_13_in_ruleTable10465 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable10486 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable10499 = new BitSet(new long[]{0x008700008C04A000L});
        public static final BitSet FOLLOW_15_in_ruleTable10567 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable10588 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable10601 = new BitSet(new long[]{0x008700008C04A000L});
        public static final BitSet FOLLOW_26_in_ruleTable10669 = new BitSet(new long[]{0x0000000000004090L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleTable10690 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable10703 = new BitSet(new long[]{0x008700008C04A000L});
        public static final BitSet FOLLOW_27_in_ruleTable10776 = new BitSet(new long[]{0x008700008C04A000L});
        public static final BitSet FOLLOW_48_in_ruleTable10864 = new BitSet(new long[]{0x008700008C04A000L});
        public static final BitSet FOLLOW_49_in_ruleTable10893 = new BitSet(new long[]{0x008700008C04A000L});
        public static final BitSet FOLLOW_50_in_ruleTable10928 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable10949 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable10961 = new BitSet(new long[]{0x008700008C04A000L});
        public static final BitSet FOLLOW_31_in_ruleTable11030 = new BitSet(new long[]{0x008700008C04A000L});
        public static final BitSet FOLLOW_55_in_ruleTable11054 = new BitSet(new long[]{0x008700008C04A000L});
        public static final BitSet FOLLOW_18_in_ruleTable11120 = new BitSet(new long[]{0x1000000000900000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable11186 = new BitSet(new long[]{0x1100000000900000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable11262 = new BitSet(new long[]{0x1100000000900000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable11331 = new BitSet(new long[]{0x1100000000900000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable11358 = new BitSet(new long[]{0x1100000000900000L});
        public static final BitSet FOLLOW_56_in_ruleTable11372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt11409 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt11420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleEInt11459 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt11476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef11521 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplateRef11531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAnswerTemplateRef11568 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleAnswerTemplateRef11580 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplateRef11600 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswerTemplateRef11612 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleAnswerTemplateRef11624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRefAttr_in_entryRuleAnswerTemplateRefAttr11660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplateRefAttr11670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleAnswerTemplateRefAttr11707 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplateRefAttr11727 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswerTemplateRefAttr11739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion11775 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion11785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTableQuestion11822 = new BitSet(new long[]{0x0000000008240000L});
        public static final BitSet FOLLOW_21_in_ruleTableQuestion11880 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTableQuestion11897 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTableQuestion11915 = new BitSet(new long[]{0x0000000008240000L});
        public static final BitSet FOLLOW_27_in_ruleTableQuestion11988 = new BitSet(new long[]{0x0000000008240000L});
        public static final BitSet FOLLOW_18_in_ruleTableQuestion12053 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTableQuestion12074 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruleTableQuestion12086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_entryRuleDEP_ID12123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDEP_ID12134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDEP_ID12174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleDEP_ID12200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleDateMode12259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleDateMode12276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleDateMode12293 = new BitSet(new long[]{0x0000000000000002L});
    }


}