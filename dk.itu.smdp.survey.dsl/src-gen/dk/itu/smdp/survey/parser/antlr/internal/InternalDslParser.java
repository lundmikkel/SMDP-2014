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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_FQN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<survey'", "'title=\"'", "'\"'", "'description=\"'", "'>'", "'</survey>'", "'<template'", "'id=\"'", "'</template>'", "'<a'", "'</a>'", "'<group'", "'dependsOn=\"'", "'required'", "'</group>'", "'<text'", "'singleline'", "'single'", "'multi'", "'multiline'", "'/>'", "'<scale'", "'lower='", "'upper='", "'lowerLabel=\"'", "'upperLabel=\"'", "'<date'", "'from=\"'", "'to=\"'", "'showLimits'", "'day'", "'month'", "'year'", "'<number'", "'<single'", "'other'", "'</single>'", "'<multiple'", "'id\"\"'", "'</multiple>'", "'<table'", "'multiple'", "'</table>'", "'-'", "'<q>'", "'</q>'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
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
    public static final int RULE_STRING=4;
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:76:1: ruleSurvey returns [EObject current=null] : ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_items_10_0 = null;

        EObject lv_templates_11_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:79:28: ( ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:86:2: (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:86:4: otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>'
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey132); 

                        	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getSurveyKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:90:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )* ) ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:92:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )* ) )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:92:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )* ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:93:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:96:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )* )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )*
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( LA1_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0) ) {
                            alt1=1;
                        }
                        else if ( LA1_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:105: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:101:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
                    	    {
                    	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey190); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSurveyAccess().getTitleKeyword_1_1_0_0());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:108:1: ( (lv_title_4_0= ruleEString ) )
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

                    	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey223); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSurveyAccess().getQuotationMarkKeyword_1_1_0_2());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:137:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:137:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:105: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:139:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"'
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSurvey291); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getDescriptionKeyword_1_1_1_0());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:146:1: ( (lv_description_7_0= ruleEString ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:147:1: (lv_description_7_0= ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:147:1: (lv_description_7_0= ruleEString )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:148:3: lv_description_7_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getDescriptionEStringParserRuleCall_1_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey312);
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

                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey324); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getSurveyAccess().getQuotationMarkKeyword_1_1_1_2());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	

                    }

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSurvey377); 

                        	newLeafNode(otherlv_9, grammarAccess.getSurveyAccess().getGreaterThanSignKeyword_1_2());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:186:1: ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==23||LA2_0==27||LA2_0==33||LA2_0==38||(LA2_0>=45 && LA2_0<=46)||LA2_0==49||LA2_0==52) ) {
                            alt2=1;
                        }
                        else if ( (LA2_0==18) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:186:2: ( (lv_items_10_0= ruleItem ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:186:2: ( (lv_items_10_0= ruleItem ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:187:1: (lv_items_10_0= ruleItem )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:187:1: (lv_items_10_0= ruleItem )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:188:3: lv_items_10_0= ruleItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getItemsItemParserRuleCall_1_3_0_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleItem_in_ruleSurvey399);
                    	    lv_items_10_0=ruleItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_10_0, 
                    	            		"Item");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:205:6: ( (lv_templates_11_0= ruleAnswerTemplate ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:205:6: ( (lv_templates_11_0= ruleAnswerTemplate ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:206:1: (lv_templates_11_0= ruleAnswerTemplate )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:206:1: (lv_templates_11_0= ruleAnswerTemplate )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:207:3: lv_templates_11_0= ruleAnswerTemplate
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getTemplatesAnswerTemplateParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_ruleSurvey426);
                    	    lv_templates_11_0=ruleAnswerTemplate();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"templates",
                    	            		lv_templates_11_0, 
                    	            		"AnswerTemplate");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSurvey440); 

                        	newLeafNode(otherlv_12, grammarAccess.getSurveyAccess().getSurveyKeyword_1_4());
                        

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:235:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:236:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:237:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString479);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString490); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:244:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:247:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:248:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:248:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:248:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString530); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:256:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString556); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:271:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:272:2: (iv_ruleItem= ruleItem EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:273:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_entryRuleItem601);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItem611); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:280:1: ruleItem returns [EObject current=null] : (this_Group_0= ruleGroup | this_Text_1= ruleText | this_Scale_2= ruleScale | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Single_5= ruleSingle | this_Multiple_6= ruleMultiple | this_Table_7= ruleTable ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_Group_0 = null;

        EObject this_Text_1 = null;

        EObject this_Scale_2 = null;

        EObject this_Date_3 = null;

        EObject this_Number_4 = null;

        EObject this_Single_5 = null;

        EObject this_Multiple_6 = null;

        EObject this_Table_7 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:283:28: ( (this_Group_0= ruleGroup | this_Text_1= ruleText | this_Scale_2= ruleScale | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Single_5= ruleSingle | this_Multiple_6= ruleMultiple | this_Table_7= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:284:1: (this_Group_0= ruleGroup | this_Text_1= ruleText | this_Scale_2= ruleScale | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Single_5= ruleSingle | this_Multiple_6= ruleMultiple | this_Table_7= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:284:1: (this_Group_0= ruleGroup | this_Text_1= ruleText | this_Scale_2= ruleScale | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Single_5= ruleSingle | this_Multiple_6= ruleMultiple | this_Table_7= ruleTable )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 33:
                {
                alt5=3;
                }
                break;
            case 38:
                {
                alt5=4;
                }
                break;
            case 45:
                {
                alt5=5;
                }
                break;
            case 46:
                {
                alt5=6;
                }
                break;
            case 49:
                {
                alt5=7;
                }
                break;
            case 52:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:285:5: this_Group_0= ruleGroup
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getGroupParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleItem658);
                    this_Group_0=ruleGroup();

                    state._fsp--;

                     
                            current = this_Group_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:295:5: this_Text_1= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getTextParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleItem685);
                    this_Text_1=ruleText();

                    state._fsp--;

                     
                            current = this_Text_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:305:5: this_Scale_2= ruleScale
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getScaleParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleItem712);
                    this_Scale_2=ruleScale();

                    state._fsp--;

                     
                            current = this_Scale_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:315:5: this_Date_3= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getDateParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleItem739);
                    this_Date_3=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:325:5: this_Number_4= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getNumberParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleItem766);
                    this_Number_4=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:335:5: this_Single_5= ruleSingle
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getSingleParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleItem793);
                    this_Single_5=ruleSingle();

                    state._fsp--;

                     
                            current = this_Single_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:345:5: this_Multiple_6= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getMultipleParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleItem820);
                    this_Multiple_6=ruleMultiple();

                    state._fsp--;

                     
                            current = this_Multiple_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:355:5: this_Table_7= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getTableParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleItem847);
                    this_Table_7=ruleTable();

                    state._fsp--;

                     
                            current = this_Table_7; 
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:371:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:372:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:373:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion882);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion892); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:380:1: ruleQuestion returns [EObject current=null] : (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:383:28: ( (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:384:1: (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:384:1: (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 33:
                {
                alt6=2;
                }
                break;
            case 38:
                {
                alt6=3;
                }
                break;
            case 45:
                {
                alt6=4;
                }
                break;
            case 46:
                {
                alt6=5;
                }
                break;
            case 49:
                {
                alt6=6;
                }
                break;
            case 52:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:385:5: this_Text_0= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTextParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleQuestion939);
                    this_Text_0=ruleText();

                    state._fsp--;

                     
                            current = this_Text_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:395:5: this_Scale_1= ruleScale
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getScaleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleQuestion966);
                    this_Scale_1=ruleScale();

                    state._fsp--;

                     
                            current = this_Scale_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:405:5: this_Date_2= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getDateParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleQuestion993);
                    this_Date_2=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:415:5: this_Number_3= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getNumberParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleQuestion1020);
                    this_Number_3=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:425:5: this_Single_4= ruleSingle
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSingleParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleQuestion1047);
                    this_Single_4=ruleSingle();

                    state._fsp--;

                     
                            current = this_Single_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:435:5: this_Multiple_5= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleQuestion1074);
                    this_Multiple_5=ruleMultiple();

                    state._fsp--;

                     
                            current = this_Multiple_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:445:5: this_Table_6= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTableParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleQuestion1101);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:461:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:462:2: (iv_ruleOption= ruleOption EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:463:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption1136);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption1146); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:470:1: ruleOption returns [EObject current=null] : (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_AnswerTemplateRef_0 = null;

        EObject this_Answer_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:473:28: ( (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:474:1: (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:474:1: (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:475:5: this_AnswerTemplateRef_0= ruleAnswerTemplateRef
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerTemplateRefParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_ruleOption1193);
                    this_AnswerTemplateRef_0=ruleAnswerTemplateRef();

                    state._fsp--;

                     
                            current = this_AnswerTemplateRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:485:5: this_Answer_1= ruleAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleOption1220);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:501:1: entryRuleAnswerTemplate returns [EObject current=null] : iv_ruleAnswerTemplate= ruleAnswerTemplate EOF ;
    public final EObject entryRuleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:502:2: (iv_ruleAnswerTemplate= ruleAnswerTemplate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:503:2: iv_ruleAnswerTemplate= ruleAnswerTemplate EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1255);
            iv_ruleAnswerTemplate=ruleAnswerTemplate();

            state._fsp--;

             current =iv_ruleAnswerTemplate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplate1265); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:510:1: ruleAnswerTemplate returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:513:28: ( (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:1: (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:1: (otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:3: otherlv_0= '<template' otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswerTemplate1302); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswerTemplate1314); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateAccess().getIdKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:522:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:523:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:523:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:524:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplate1331); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswerTemplate1348); 

                	newLeafNode(otherlv_3, grammarAccess.getAnswerTemplateAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnswerTemplate1360); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerTemplateAccess().getGreaterThanSignKeyword_4());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:548:1: ( (lv_answers_5_0= ruleAnswer ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:549:1: (lv_answers_5_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:549:1: (lv_answers_5_0= ruleAnswer )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:550:3: lv_answers_5_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAnswerTemplateAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleAnswerTemplate1381);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswerTemplate1394); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:578:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:579:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:580:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer1430);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer1440); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:587:1: ruleAnswer returns [EObject current=null] : (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>' ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_label_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:590:28: ( (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:591:1: (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:591:1: (otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:591:3: otherlv_0= '<a' (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswer1477); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:595:1: (otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:595:3: otherlv_1= 'id=\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"'
                    {
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswer1490); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getIdKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:599:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:600:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:600:1: (lv_name_2_0= RULE_ID )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:601:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswer1507); 

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

                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswer1524); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnswerAccess().getQuotationMarkKeyword_1_2());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnswer1538); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:625:1: ( (lv_label_5_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:626:1: (lv_label_5_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:626:1: (lv_label_5_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:627:3: lv_label_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getLabelEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1559);
            lv_label_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"label",
                    		lv_label_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnswer1571); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:655:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:656:2: (iv_ruleGroup= ruleGroup EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:657:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup1607);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup1617); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:664:1: ruleGroup returns [EObject current=null] : (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_required_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_questions_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:667:28: ( (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:668:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:668:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:668:3: otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleGroup1654); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:672:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:674:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:674:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:675:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:678:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:679:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:679:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )*
            loop10:
            do {
                int alt10=5;
                int LA10_0 = input.LA(1);

                if ( LA10_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
                    alt10=4;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:681:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:681:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:682:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:682:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:683:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1712); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:690:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:691:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:691:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:692:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1733);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1745); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:719:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:719:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:720:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:720:102: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:721:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:724:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:724:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:724:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:724:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup1813); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:728:1: ( (lv_description_6_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:729:1: (lv_description_6_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:729:1: (lv_description_6_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:730:3: lv_description_6_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1834);
            	    lv_description_6_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_6_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1846); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:757:4: ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:757:4: ({...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:758:5: {...}? => ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:758:102: ( ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:759:6: ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:762:6: ({...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:762:7: {...}? => (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:762:16: (otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:762:18: otherlv_8= 'dependsOn=\"' ( (otherlv_9= RULE_FQN ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGroup1914); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getDependsOnKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:766:1: ( (otherlv_9= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:767:1: (otherlv_9= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:767:1: (otherlv_9= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:768:3: otherlv_9= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupRule());
            	    	        }
            	            
            	    otherlv_9=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleGroup1934); 

            	    		newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getDependsOnReferableCrossReference_1_2_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1946); 

            	        	newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:790:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:790:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:791:5: {...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:791:102: ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:792:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:795:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:795:7: {...}? => ( (lv_required_11_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:795:16: ( (lv_required_11_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:796:1: (lv_required_11_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:796:1: (lv_required_11_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:797:3: lv_required_11_0= 'required'
            	    {
            	    lv_required_11_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGroup2019); 

            	            newLeafNode(lv_required_11_0, grammarAccess.getGroupAccess().getRequiredRequiredKeyword_1_3_0());
            	        

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
            	    break loop10;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	

            }

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGroup2084); 

                	newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:828:1: ( (lv_questions_13_0= ruleQuestion ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27||LA11_0==33||LA11_0==38||(LA11_0>=45 && LA11_0<=46)||LA11_0==49||LA11_0==52) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:829:1: (lv_questions_13_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:829:1: (lv_questions_13_0= ruleQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:830:3: lv_questions_13_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleGroup2105);
            	    lv_questions_13_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_13_0, 
            	            		"Question");
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

            otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleGroup2118); 

                	newLeafNode(otherlv_14, grammarAccess.getGroupAccess().getGroupKeyword_4());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:858:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:859:2: (iv_ruleText= ruleText EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:860:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText2154);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText2164); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:867:1: ruleText returns [EObject current=null] : ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) ;
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
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_required_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_multiline_18_1=null;
        Token lv_multiline_18_2=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:870:28: ( ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:871:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:871:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:871:2: () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:871:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:872:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleText2210); 

                	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:881:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:883:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:883:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:884:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:887:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:888:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:888:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=7;
                int LA14_0 = input.LA(1);

                if ( LA14_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
                    alt14=4;
                }
                else if ( LA14_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
                    alt14=5;
                }
                else if ( LA14_0 >=28 && LA14_0<=31 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
                    alt14=6;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:890:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:890:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:101: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:895:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:895:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:895:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:895:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2268); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTextAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:899:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:900:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:900:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:901:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2289);
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

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2301); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:928:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:928:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:929:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:929:101: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:930:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:933:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:933:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:933:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:933:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleText2369); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:937:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:938:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:938:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:939:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2390);
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

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2402); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:966:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:966:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:967:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:967:101: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:968:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:971:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:971:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:971:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:971:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleText2470); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTextAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:975:1: ( (lv_name_10_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:976:1: (lv_name_10_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:976:1: (lv_name_10_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:977:3: lv_name_10_0= RULE_ID
            	    {
            	    lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleText2487); 

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

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2504); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1004:4: ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1004:4: ({...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1005:5: {...}? => ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1005:101: ( ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1006:6: ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1009:6: ({...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1009:7: {...}? => (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1009:16: (otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1009:18: otherlv_12= 'dependsOn=\"' ( (otherlv_13= RULE_FQN ) ) otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleText2572); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTextAccess().getDependsOnKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1013:1: ( (otherlv_13= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1014:1: (otherlv_13= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1014:1: (otherlv_13= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1015:3: otherlv_13= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTextRule());
            	    	        }
            	            
            	    otherlv_13=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleText2592); 

            	    		newLeafNode(otherlv_13, grammarAccess.getTextAccess().getDependsOnReferableCrossReference_2_3_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2604); 

            	        	newLeafNode(otherlv_14, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1037:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1037:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1038:5: {...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1038:101: ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1039:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1042:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1042:7: {...}? => ( (lv_required_15_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1042:16: ( (lv_required_15_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1043:1: (lv_required_15_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1043:1: (lv_required_15_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1044:3: lv_required_15_0= 'required'
            	    {
            	    lv_required_15_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleText2677); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1064:4: ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1064:4: ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1065:5: {...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1065:101: ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1066:6: ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1069:6: ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1069:7: {...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1069:16: (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) )
            	    int alt13=3;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 30:
            	    case 31:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1069:18: otherlv_16= 'singleline'
            	            {
            	            otherlv_16=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleText2757); 

            	                	newLeafNode(otherlv_16, grammarAccess.getTextAccess().getSinglelineKeyword_2_5_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1074:7: otherlv_17= 'single'
            	            {
            	            otherlv_17=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleText2775); 

            	                	newLeafNode(otherlv_17, grammarAccess.getTextAccess().getSingleKeyword_2_5_1());
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1079:6: ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1079:6: ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1080:1: ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1080:1: ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1081:1: (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1081:1: (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' )
            	            int alt12=2;
            	            int LA12_0 = input.LA(1);

            	            if ( (LA12_0==30) ) {
            	                alt12=1;
            	            }
            	            else if ( (LA12_0==31) ) {
            	                alt12=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 12, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt12) {
            	                case 1 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1082:3: lv_multiline_18_1= 'multi'
            	                    {
            	                    lv_multiline_18_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleText2801); 

            	                            newLeafNode(lv_multiline_18_1, grammarAccess.getTextAccess().getMultilineMultiKeyword_2_5_2_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getTextRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "multiline", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1094:8: lv_multiline_18_2= 'multiline'
            	                    {
            	                    lv_multiline_18_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleText2830); 

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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTextAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canLeave(grammarAccess.getTextAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	

            }

            otherlv_19=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleText2905); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1136:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1137:2: (iv_ruleScale= ruleScale EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1138:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScale_in_entryRuleScale2941);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScale2951); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1145:1: ruleScale returns [EObject current=null] : (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= '/>' ) ;
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
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_required_24_0=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_lower_12_0 = null;

        AntlrDatatypeRuleToken lv_upper_14_0 = null;

        AntlrDatatypeRuleToken lv_lowerLabel_16_0 = null;

        AntlrDatatypeRuleToken lv_upperLabel_19_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1148:28: ( (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1149:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1149:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1149:3: otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= '/>'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleScale2988); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1153:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1155:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1155:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1156:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1159:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1160:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1160:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=10;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1162:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1162:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1163:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1163:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1164:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1167:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1167:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1167:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1167:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3046); 

            	        	newLeafNode(otherlv_2, grammarAccess.getScaleAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1171:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1172:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1172:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1173:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3067);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3079); 

            	        	newLeafNode(otherlv_4, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1200:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1200:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1201:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1201:102: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1202:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1205:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1205:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1205:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1205:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3147); 

            	        	newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1209:1: ( (lv_description_6_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1210:1: (lv_description_6_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1210:1: (lv_description_6_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1211:3: lv_description_6_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3168);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3180); 

            	        	newLeafNode(otherlv_7, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1238:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1238:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1239:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1239:102: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1240:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1243:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1243:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1243:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1243:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleScale3248); 

            	        	newLeafNode(otherlv_8, grammarAccess.getScaleAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1247:1: ( (lv_name_9_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1248:1: (lv_name_9_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1248:1: (lv_name_9_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1249:3: lv_name_9_0= RULE_ID
            	    {
            	    lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleScale3265); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3282); 

            	        	newLeafNode(otherlv_10, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1276:4: ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1276:4: ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1277:5: {...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1277:102: ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1278:6: ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1281:6: ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1281:7: {...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1281:16: (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1281:18: otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) )
            	    {
            	    otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleScale3350); 

            	        	newLeafNode(otherlv_11, grammarAccess.getScaleAccess().getLowerKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1285:1: ( (lv_lower_12_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1286:1: (lv_lower_12_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1286:1: (lv_lower_12_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1287:3: lv_lower_12_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getLowerEIntParserRuleCall_1_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3371);
            	    lv_lower_12_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"lower",
            	            		lv_lower_12_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1310:4: ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1310:4: ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1311:5: {...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1311:102: ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1312:6: ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1315:6: ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1315:7: {...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1315:16: (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1315:18: otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) )
            	    {
            	    otherlv_13=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleScale3439); 

            	        	newLeafNode(otherlv_13, grammarAccess.getScaleAccess().getUpperKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1319:1: ( (lv_upper_14_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1320:1: (lv_upper_14_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1320:1: (lv_upper_14_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1321:3: lv_upper_14_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getUpperEIntParserRuleCall_1_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3460);
            	    lv_upper_14_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"upper",
            	            		lv_upper_14_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1344:4: ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1344:4: ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1345:5: {...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1345:102: ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1346:6: ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1349:6: ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1349:7: {...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1349:16: (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1349:18: otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"'
            	    {
            	    otherlv_15=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleScale3528); 

            	        	newLeafNode(otherlv_15, grammarAccess.getScaleAccess().getLowerLabelKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1353:1: ( (lv_lowerLabel_16_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1354:1: (lv_lowerLabel_16_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1354:1: (lv_lowerLabel_16_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1355:3: lv_lowerLabel_16_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getLowerLabelEStringParserRuleCall_1_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3549);
            	    lv_lowerLabel_16_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"lowerLabel",
            	            		lv_lowerLabel_16_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3561); 

            	        	newLeafNode(otherlv_17, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1382:4: ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1382:4: ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1383:5: {...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1383:102: ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1384:6: ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1387:6: ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1387:7: {...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1387:16: (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1387:18: otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"'
            	    {
            	    otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleScale3629); 

            	        	newLeafNode(otherlv_18, grammarAccess.getScaleAccess().getUpperLabelKeyword_1_6_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1391:1: ( (lv_upperLabel_19_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1392:1: (lv_upperLabel_19_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1392:1: (lv_upperLabel_19_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1393:3: lv_upperLabel_19_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getUpperLabelEStringParserRuleCall_1_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3650);
            	    lv_upperLabel_19_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"upperLabel",
            	            		lv_upperLabel_19_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3662); 

            	        	newLeafNode(otherlv_20, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_6_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1420:4: ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1420:4: ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1421:5: {...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1421:102: ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1422:6: ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1425:6: ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1425:7: {...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1425:16: (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1425:18: otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"'
            	    {
            	    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleScale3730); 

            	        	newLeafNode(otherlv_21, grammarAccess.getScaleAccess().getDependsOnKeyword_1_7_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1429:1: ( (otherlv_22= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1430:1: (otherlv_22= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1430:1: (otherlv_22= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1431:3: otherlv_22= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScaleRule());
            	    	        }
            	            
            	    otherlv_22=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleScale3750); 

            	    		newLeafNode(otherlv_22, grammarAccess.getScaleAccess().getDependsOnReferableCrossReference_1_7_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3762); 

            	        	newLeafNode(otherlv_23, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_7_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1453:4: ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1453:4: ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1454:5: {...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1454:102: ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1455:6: ({...}? => ( (lv_required_24_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1458:6: ({...}? => ( (lv_required_24_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1458:7: {...}? => ( (lv_required_24_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1458:16: ( (lv_required_24_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1459:1: (lv_required_24_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1459:1: (lv_required_24_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1460:3: lv_required_24_0= 'required'
            	    {
            	    lv_required_24_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleScale3835); 

            	            newLeafNode(lv_required_24_0, grammarAccess.getScaleAccess().getRequiredRequiredKeyword_1_8_0());
            	        

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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getScaleAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canLeave(grammarAccess.getScaleAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_25=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleScale3906); 

                	newLeafNode(otherlv_25, grammarAccess.getScaleAccess().getSolidusGreaterThanSignKeyword_2());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1500:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1501:2: (iv_ruleDate= ruleDate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1502:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate3942);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate3952); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1509:1: ruleDate returns [EObject current=null] : ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' ) ;
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
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_showLimits_21_0=null;
        Token lv_required_22_0=null;
        Token lv_day_23_0=null;
        Token lv_month_24_0=null;
        Token lv_year_25_0=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_from_13_0 = null;

        AntlrDatatypeRuleToken lv_to_16_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1512:28: ( ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1513:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1513:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1513:2: () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1513:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1514:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDate3998); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1523:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1525:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1525:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1526:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1529:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1530:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1530:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=12;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1532:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1532:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1533:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1533:101: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1534:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1537:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1537:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1537:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1537:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4056); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1541:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1542:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1542:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1543:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4077);
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

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4089); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1570:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1570:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1571:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1571:101: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1572:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1575:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1575:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1575:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1575:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDate4157); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1579:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1580:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1580:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1581:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4178);
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

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4190); 

            	        	newLeafNode(otherlv_8, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1608:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1608:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1609:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1609:101: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1610:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1613:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1613:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1613:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1613:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDate4258); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDateAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1617:1: ( (lv_name_10_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1618:1: (lv_name_10_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1618:1: (lv_name_10_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1619:3: lv_name_10_0= RULE_ID
            	    {
            	    lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDate4275); 

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

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4292); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1646:4: ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1646:4: ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1647:5: {...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1647:101: ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1648:6: ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1651:6: ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1651:7: {...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1651:16: (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1651:18: otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDate4360); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDateAccess().getFromKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1655:1: ( (lv_from_13_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1656:1: (lv_from_13_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1656:1: (lv_from_13_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1657:3: lv_from_13_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getFromEStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4381);
            	    lv_from_13_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"from",
            	            		lv_from_13_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4393); 

            	        	newLeafNode(otherlv_14, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1684:4: ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1684:4: ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1685:5: {...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1685:101: ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1686:6: ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1689:6: ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1689:7: {...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1689:16: (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1689:18: otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"'
            	    {
            	    otherlv_15=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDate4461); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDateAccess().getToKeyword_2_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1693:1: ( (lv_to_16_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1694:1: (lv_to_16_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1694:1: (lv_to_16_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1695:3: lv_to_16_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getToEStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4482);
            	    lv_to_16_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"to",
            	            		lv_to_16_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4494); 

            	        	newLeafNode(otherlv_17, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1722:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1722:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1723:5: {...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1723:101: ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1724:6: ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1727:6: ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1727:7: {...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1727:16: (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1727:18: otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"'
            	    {
            	    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDate4562); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDateAccess().getDependsOnKeyword_2_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1731:1: ( (otherlv_19= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1732:1: (otherlv_19= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1732:1: (otherlv_19= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1733:3: otherlv_19= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	            
            	    otherlv_19=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleDate4582); 

            	    		newLeafNode(otherlv_19, grammarAccess.getDateAccess().getDependsOnReferableCrossReference_2_5_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4594); 

            	        	newLeafNode(otherlv_20, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1755:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1755:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1756:5: {...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1756:101: ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1757:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1760:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1760:7: {...}? => ( (lv_showLimits_21_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1760:16: ( (lv_showLimits_21_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1761:1: (lv_showLimits_21_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1761:1: (lv_showLimits_21_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1762:3: lv_showLimits_21_0= 'showLimits'
            	    {
            	    lv_showLimits_21_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDate4667); 

            	            newLeafNode(lv_showLimits_21_0, grammarAccess.getDateAccess().getShowLimitsShowLimitsKeyword_2_6_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	           		setWithLastConsumed(current, "showLimits", true, "showLimits");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1782:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1782:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1783:5: {...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1783:101: ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1784:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1787:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1787:7: {...}? => ( (lv_required_22_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1787:16: ( (lv_required_22_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1788:1: (lv_required_22_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1788:1: (lv_required_22_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1789:3: lv_required_22_0= 'required'
            	    {
            	    lv_required_22_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDate4752); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1809:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1809:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1810:5: {...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1810:101: ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1811:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1814:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1814:7: {...}? => ( (lv_day_23_0= 'day' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1814:16: ( (lv_day_23_0= 'day' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1815:1: (lv_day_23_0= 'day' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1815:1: (lv_day_23_0= 'day' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1816:3: lv_day_23_0= 'day'
            	    {
            	    lv_day_23_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDate4837); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1836:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1836:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1837:5: {...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1837:101: ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1838:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1841:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1841:7: {...}? => ( (lv_month_24_0= 'month' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1841:16: ( (lv_month_24_0= 'month' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1842:1: (lv_month_24_0= 'month' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1842:1: (lv_month_24_0= 'month' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1843:3: lv_month_24_0= 'month'
            	    {
            	    lv_month_24_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDate4922); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1863:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1863:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1864:5: {...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1864:102: ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1865:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1868:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1868:7: {...}? => ( (lv_year_25_0= 'year' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1868:16: ( (lv_year_25_0= 'year' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1869:1: (lv_year_25_0= 'year' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1869:1: (lv_year_25_0= 'year' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1870:3: lv_year_25_0= 'year'
            	    {
            	    lv_year_25_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDate5007); 

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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDateAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canLeave(grammarAccess.getDateAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	

            }

            otherlv_26=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDate5078); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1910:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1911:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1912:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber5114);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber5124); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1919:1: ruleNumber returns [EObject current=null] : ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '/>' ) ;
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_required_19_0=null;
        Token lv_showLimits_20_0=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_lower_13_0 = null;

        AntlrDatatypeRuleToken lv_upper_15_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1922:28: ( ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1923:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1923:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1923:2: () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1923:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1924:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberAccess().getNumberAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleNumber5170); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getNumberKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1933:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1935:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1935:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1936:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1939:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1940:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1940:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=9;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1942:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1942:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1943:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1943:103: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1944:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5228); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1951:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1952:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1952:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1953:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5249);
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

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5261); 

            	        	newLeafNode(otherlv_5, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1980:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1980:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1981:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1981:103: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1982:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1985:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1985:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1985:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1985:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNumber5329); 

            	        	newLeafNode(otherlv_6, grammarAccess.getNumberAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1989:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1990:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1990:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1991:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5350);
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

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5362); 

            	        	newLeafNode(otherlv_8, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2018:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2018:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2019:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2019:103: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2020:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2023:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2023:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2023:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2023:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNumber5430); 

            	        	newLeafNode(otherlv_9, grammarAccess.getNumberAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2027:1: ( (lv_name_10_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2028:1: (lv_name_10_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2028:1: (lv_name_10_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2029:3: lv_name_10_0= RULE_ID
            	    {
            	    lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNumber5447); 

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

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5464); 

            	        	newLeafNode(otherlv_11, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2056:4: ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2056:4: ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2057:5: {...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2057:103: ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2058:6: ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2061:6: ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2061:7: {...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2061:16: (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2061:18: otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) )
            	    {
            	    otherlv_12=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNumber5532); 

            	        	newLeafNode(otherlv_12, grammarAccess.getNumberAccess().getLowerKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2065:1: ( (lv_lower_13_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2066:1: (lv_lower_13_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2066:1: (lv_lower_13_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2067:3: lv_lower_13_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getLowerEIntParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5553);
            	    lv_lower_13_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"lower",
            	            		lv_lower_13_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2090:4: ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2090:4: ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2091:5: {...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2091:103: ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2092:6: ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:6: ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:7: {...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:16: (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:18: otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) )
            	    {
            	    otherlv_14=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleNumber5621); 

            	        	newLeafNode(otherlv_14, grammarAccess.getNumberAccess().getUpperKeyword_2_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2099:1: ( (lv_upper_15_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2100:1: (lv_upper_15_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2100:1: (lv_upper_15_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2101:3: lv_upper_15_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getUpperEIntParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5642);
            	    lv_upper_15_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"upper",
            	            		lv_upper_15_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2124:4: ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2124:4: ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2125:5: {...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2125:103: ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2126:6: ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:6: ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:7: {...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:16: (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:18: otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"'
            	    {
            	    otherlv_16=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNumber5710); 

            	        	newLeafNode(otherlv_16, grammarAccess.getNumberAccess().getDependsOnKeyword_2_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2133:1: ( (otherlv_17= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2134:1: (otherlv_17= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2134:1: (otherlv_17= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2135:3: otherlv_17= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNumberRule());
            	    	        }
            	            
            	    otherlv_17=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleNumber5730); 

            	    		newLeafNode(otherlv_17, grammarAccess.getNumberAccess().getDependsOnReferableCrossReference_2_5_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5742); 

            	        	newLeafNode(otherlv_18, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2157:4: ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2157:4: ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2158:5: {...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2158:103: ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2159:6: ({...}? => ( (lv_required_19_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2162:6: ({...}? => ( (lv_required_19_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2162:7: {...}? => ( (lv_required_19_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2162:16: ( (lv_required_19_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2163:1: (lv_required_19_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2163:1: (lv_required_19_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2164:3: lv_required_19_0= 'required'
            	    {
            	    lv_required_19_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNumber5815); 

            	            newLeafNode(lv_required_19_0, grammarAccess.getNumberAccess().getRequiredRequiredKeyword_2_6_0());
            	        

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2184:4: ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2184:4: ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2185:5: {...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2185:103: ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2186:6: ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2189:6: ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2189:7: {...}? => ( (lv_showLimits_20_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2189:16: ( (lv_showLimits_20_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2190:1: (lv_showLimits_20_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2190:1: (lv_showLimits_20_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2191:3: lv_showLimits_20_0= 'showLimits'
            	    {
            	    lv_showLimits_20_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNumber5900); 

            	            newLeafNode(lv_showLimits_20_0, grammarAccess.getNumberAccess().getShowLimitsShowLimitsKeyword_2_7_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNumberRule());
            	    	        }
            	           		setWithLastConsumed(current, "showLimits", true, "showLimits");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNumberAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canLeave(grammarAccess.getNumberAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	

            }

            otherlv_21=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNumber5971); 

                	newLeafNode(otherlv_21, grammarAccess.getNumberAccess().getSolidusGreaterThanSignKeyword_3());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2231:1: entryRuleSingle returns [EObject current=null] : iv_ruleSingle= ruleSingle EOF ;
    public final EObject entryRuleSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingle = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2232:2: (iv_ruleSingle= ruleSingle EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2233:2: iv_ruleSingle= ruleSingle EOF
            {
             newCompositeNode(grammarAccess.getSingleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingle_in_entryRuleSingle6007);
            iv_ruleSingle=ruleSingle();

            state._fsp--;

             current =iv_ruleSingle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingle6017); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2240:1: ruleSingle returns [EObject current=null] : (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' ) ;
    public final EObject ruleSingle() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_required_14_0=null;
        Token lv_other_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_options_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2243:28: ( (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2244:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2244:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2244:3: otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleSingle6054); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2248:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2250:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2250:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2251:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2254:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2255:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2255:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=7;
                int LA18_0 = input.LA(1);

                if ( LA18_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2) ) {
                    alt18=3;
                }
                else if ( LA18_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3) ) {
                    alt18=4;
                }
                else if ( LA18_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4) ) {
                    alt18=5;
                }
                else if ( LA18_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5) ) {
                    alt18=6;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2257:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2257:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2258:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2258:103: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2259:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2262:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2262:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2262:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2262:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle6112); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSingleAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2266:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2267:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2267:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2268:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle6133);
            	    lv_title_3_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_3_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle6145); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSingleAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2295:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2295:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2296:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2296:103: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2297:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2300:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2300:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2300:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2300:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingle6213); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSingleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2304:1: ( (lv_description_6_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2305:1: (lv_description_6_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2305:1: (lv_description_6_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2306:3: lv_description_6_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle6234);
            	    lv_description_6_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_6_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle6246); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSingleAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2333:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2333:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2334:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2334:103: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2335:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2338:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2338:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2338:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2338:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSingle6314); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSingleAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2342:1: ( (lv_name_9_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2343:1: (lv_name_9_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2343:1: (lv_name_9_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2344:3: lv_name_9_0= RULE_ID
            	    {
            	    lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingle6331); 

            	    			newLeafNode(lv_name_9_0, grammarAccess.getSingleAccess().getNameIDTerminalRuleCall_1_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_9_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle6348); 

            	        	newLeafNode(otherlv_10, grammarAccess.getSingleAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2371:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2371:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2372:5: {...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2372:103: ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2373:6: ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2376:6: ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2376:7: {...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2376:16: (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2376:18: otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingle6416); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSingleAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2380:1: ( (otherlv_12= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2381:1: (otherlv_12= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2381:1: (otherlv_12= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2382:3: otherlv_12= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	            
            	    otherlv_12=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleSingle6436); 

            	    		newLeafNode(otherlv_12, grammarAccess.getSingleAccess().getDependsOnReferableCrossReference_1_3_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle6448); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSingleAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2404:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2404:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2405:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2405:103: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2406:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2409:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2409:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2409:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2410:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2410:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2411:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingle6521); 

            	            newLeafNode(lv_required_14_0, grammarAccess.getSingleAccess().getRequiredRequiredKeyword_1_4_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2431:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2431:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2432:5: {...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2432:103: ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2433:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2436:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2436:7: {...}? => ( (lv_other_15_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2436:16: ( (lv_other_15_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2437:1: (lv_other_15_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2437:1: (lv_other_15_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2438:3: lv_other_15_0= 'other'
            	    {
            	    lv_other_15_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleSingle6606); 

            	            newLeafNode(lv_other_15_0, grammarAccess.getSingleAccess().getOtherOtherKeyword_1_5_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	           		setWithLastConsumed(current, "other", true, "other");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSingleAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canLeave(grammarAccess.getSingleAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSingle6677); 

                	newLeafNode(otherlv_16, grammarAccess.getSingleAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2470:1: ( (lv_options_17_0= ruleOption ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18||LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2471:1: (lv_options_17_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2471:1: (lv_options_17_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2472:3: lv_options_17_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingle6698);
            	    lv_options_17_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_17_0, 
            	            		"Option");
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

            otherlv_18=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleSingle6711); 

                	newLeafNode(otherlv_18, grammarAccess.getSingleAccess().getSingleKeyword_4());
                

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


    // $ANTLR start "entryRuleMultiple"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2500:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2501:2: (iv_ruleMultiple= ruleMultiple EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2502:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_entryRuleMultiple6747);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiple6757); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2509:1: ruleMultiple returns [EObject current=null] : (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '>' ( (lv_options_22_0= ruleOption ) )+ otherlv_23= '</multiple>' ) ;
    public final EObject ruleMultiple() throws RecognitionException {
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
        Token lv_lower_12_0=null;
        Token otherlv_13=null;
        Token lv_upper_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_required_18_0=null;
        Token lv_other_19_0=null;
        Token lv_showLimits_20_0=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_options_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2512:28: ( (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '>' ( (lv_options_22_0= ruleOption ) )+ otherlv_23= '</multiple>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2513:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '>' ( (lv_options_22_0= ruleOption ) )+ otherlv_23= '</multiple>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2513:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '>' ( (lv_options_22_0= ruleOption ) )+ otherlv_23= '</multiple>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2513:3: otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '>' ( (lv_options_22_0= ruleOption ) )+ otherlv_23= '</multiple>'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleMultiple6794); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2517:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2519:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2519:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2520:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2523:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2524:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2524:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=10;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2526:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2526:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2527:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2527:105: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2528:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2531:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2531:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2531:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2531:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple6852); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultipleAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2535:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2536:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2536:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2537:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple6873);
            	    lv_title_3_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_3_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple6885); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMultipleAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2564:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2564:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2565:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2565:105: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2566:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2569:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2569:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2569:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2569:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultiple6953); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultipleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2573:1: ( (lv_description_6_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2574:1: (lv_description_6_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2574:1: (lv_description_6_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2575:3: lv_description_6_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple6974);
            	    lv_description_6_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_6_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple6986); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMultipleAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2602:4: ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2602:4: ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2603:5: {...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2603:105: ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2604:6: ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2607:6: ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2607:7: {...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2607:16: (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2607:18: otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMultiple7054); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMultipleAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2611:1: ( (lv_name_9_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2612:1: (lv_name_9_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2612:1: (lv_name_9_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2613:3: lv_name_9_0= RULE_ID
            	    {
            	    lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultiple7071); 

            	    			newLeafNode(lv_name_9_0, grammarAccess.getMultipleAccess().getNameIDTerminalRuleCall_1_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_9_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple7088); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMultipleAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2640:4: ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2640:4: ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2641:5: {...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2641:105: ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2642:6: ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2645:6: ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2645:7: {...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2645:16: (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2645:18: otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) )
            	    {
            	    otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultiple7156); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMultipleAccess().getLowerKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2649:1: ( (lv_lower_12_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2650:1: (lv_lower_12_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2650:1: (lv_lower_12_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2651:3: lv_lower_12_0= RULE_INT
            	    {
            	    lv_lower_12_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultiple7173); 

            	    			newLeafNode(lv_lower_12_0, grammarAccess.getMultipleAccess().getLowerINTTerminalRuleCall_1_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"lower",
            	            		lv_lower_12_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2674:4: ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2674:4: ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2675:5: {...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2675:105: ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2676:6: ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2679:6: ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2679:7: {...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2679:16: (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2679:18: otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) )
            	    {
            	    otherlv_13=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMultiple7246); 

            	        	newLeafNode(otherlv_13, grammarAccess.getMultipleAccess().getUpperKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2683:1: ( (lv_upper_14_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2684:1: (lv_upper_14_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2684:1: (lv_upper_14_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2685:3: lv_upper_14_0= RULE_INT
            	    {
            	    lv_upper_14_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultiple7263); 

            	    			newLeafNode(lv_upper_14_0, grammarAccess.getMultipleAccess().getUpperINTTerminalRuleCall_1_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"upper",
            	            		lv_upper_14_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2708:4: ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2708:4: ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2709:5: {...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2709:105: ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2710:6: ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2713:6: ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2713:7: {...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2713:16: (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2713:18: otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"'
            	    {
            	    otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultiple7336); 

            	        	newLeafNode(otherlv_15, grammarAccess.getMultipleAccess().getDependsOnKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2717:1: ( (otherlv_16= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2718:1: (otherlv_16= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2718:1: (otherlv_16= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2719:3: otherlv_16= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	            
            	    otherlv_16=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleMultiple7356); 

            	    		newLeafNode(otherlv_16, grammarAccess.getMultipleAccess().getDependsOnReferableCrossReference_1_5_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple7368); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMultipleAccess().getQuotationMarkKeyword_1_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2741:4: ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2741:4: ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2742:5: {...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2742:105: ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2743:6: ({...}? => ( (lv_required_18_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2746:6: ({...}? => ( (lv_required_18_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2746:7: {...}? => ( (lv_required_18_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2746:16: ( (lv_required_18_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2747:1: (lv_required_18_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2747:1: (lv_required_18_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2748:3: lv_required_18_0= 'required'
            	    {
            	    lv_required_18_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultiple7441); 

            	            newLeafNode(lv_required_18_0, grammarAccess.getMultipleAccess().getRequiredRequiredKeyword_1_6_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(current, "required", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2768:4: ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2768:4: ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2769:5: {...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2769:105: ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2770:6: ({...}? => ( (lv_other_19_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2773:6: ({...}? => ( (lv_other_19_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2773:7: {...}? => ( (lv_other_19_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2773:16: ( (lv_other_19_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2774:1: (lv_other_19_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2774:1: (lv_other_19_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2775:3: lv_other_19_0= 'other'
            	    {
            	    lv_other_19_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMultiple7526); 

            	            newLeafNode(lv_other_19_0, grammarAccess.getMultipleAccess().getOtherOtherKeyword_1_7_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(current, "other", true, "other");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2795:4: ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2795:4: ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2796:5: {...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2796:105: ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2797:6: ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2800:6: ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2800:7: {...}? => ( (lv_showLimits_20_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2800:16: ( (lv_showLimits_20_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2801:1: (lv_showLimits_20_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2801:1: (lv_showLimits_20_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2802:3: lv_showLimits_20_0= 'showLimits'
            	    {
            	    lv_showLimits_20_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMultiple7611); 

            	            newLeafNode(lv_showLimits_20_0, grammarAccess.getMultipleAccess().getShowLimitsShowLimitsKeyword_1_8_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(current, "showLimits", true, "showLimits");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultiple7682); 

                	newLeafNode(otherlv_21, grammarAccess.getMultipleAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2834:1: ( (lv_options_22_0= ruleOption ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==18||LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2835:1: (lv_options_22_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2835:1: (lv_options_22_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2836:3: lv_options_22_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultiple7703);
            	    lv_options_22_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_22_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_23=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleMultiple7716); 

                	newLeafNode(otherlv_23, grammarAccess.getMultipleAccess().getMultipleKeyword_4());
                

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


    // $ANTLR start "entryRuleTable"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2864:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2865:2: (iv_ruleTable= ruleTable EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2866:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable7752);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable7762); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2873:1: ruleTable returns [EObject current=null] : (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' ) ;
    public final EObject ruleTable() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_required_14_0=null;
        Token lv_other_15_0=null;
        Token lv_multiple_16_0=null;
        Token otherlv_17=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_options_19_0 = null;

        EObject lv_questions_20_0 = null;

        EObject lv_options_21_0 = null;

        EObject lv_questions_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2876:28: ( (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2877:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2877:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2877:3: otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTable7799); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2881:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2883:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2883:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2884:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2887:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2888:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2888:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )*
            loop22:
            do {
                int alt22=8;
                int LA22_0 = input.LA(1);

                if ( LA22_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
                    alt22=3;
                }
                else if ( LA22_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
                    alt22=4;
                }
                else if ( LA22_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
                    alt22=5;
                }
                else if ( LA22_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
                    alt22=6;
                }
                else if ( LA22_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6) ) {
                    alt22=7;
                }


                switch (alt22) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2890:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2890:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2891:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2891:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2892:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2895:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2895:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2895:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2895:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable7857); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2899:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2900:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2900:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2901:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable7878);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable7890); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2928:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2928:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2929:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2929:102: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2930:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2933:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2933:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2933:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2933:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable7958); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2937:1: ( (lv_description_6_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2938:1: (lv_description_6_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2938:1: (lv_description_6_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2939:3: lv_description_6_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable7979);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable7991); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2966:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2966:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2967:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2967:102: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2968:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2971:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2971:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2971:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2971:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTable8059); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTableAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2975:1: ( (lv_name_9_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2976:1: (lv_name_9_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2976:1: (lv_name_9_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2977:3: lv_name_9_0= RULE_ID
            	    {
            	    lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTable8076); 

            	    			newLeafNode(lv_name_9_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_9_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable8093); 

            	        	newLeafNode(otherlv_10, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3004:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3004:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3005:5: {...}? => ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3005:102: ( ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3006:6: ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3009:6: ({...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3009:7: {...}? => (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3009:16: (otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3009:18: otherlv_11= 'dependsOn=\"' ( (otherlv_12= RULE_FQN ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTable8161); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTableAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3013:1: ( (otherlv_12= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3014:1: (otherlv_12= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3014:1: (otherlv_12= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3015:3: otherlv_12= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	            
            	    otherlv_12=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleTable8181); 

            	    		newLeafNode(otherlv_12, grammarAccess.getTableAccess().getDependsOnReferableCrossReference_1_3_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable8193); 

            	        	newLeafNode(otherlv_13, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3037:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3037:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3038:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3038:102: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3039:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3042:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3042:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3042:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3043:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3043:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3044:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTable8266); 

            	            newLeafNode(lv_required_14_0, grammarAccess.getTableAccess().getRequiredRequiredKeyword_1_4_0());
            	        

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
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3064:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3064:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3065:5: {...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3065:102: ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3066:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3069:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3069:7: {...}? => ( (lv_other_15_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3069:16: ( (lv_other_15_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3070:1: (lv_other_15_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3070:1: (lv_other_15_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3071:3: lv_other_15_0= 'other'
            	    {
            	    lv_other_15_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTable8351); 

            	            newLeafNode(lv_other_15_0, grammarAccess.getTableAccess().getOtherOtherKeyword_1_5_0());
            	        

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
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3091:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3091:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3092:5: {...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3092:102: ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3093:6: ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3096:6: ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3096:7: {...}? => ( (lv_multiple_16_0= 'multiple' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3096:16: ( (lv_multiple_16_0= 'multiple' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3097:1: (lv_multiple_16_0= 'multiple' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3097:1: (lv_multiple_16_0= 'multiple' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3098:3: lv_multiple_16_0= 'multiple'
            	    {
            	    lv_multiple_16_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTable8436); 

            	            newLeafNode(lv_multiple_16_0, grammarAccess.getTableAccess().getMultipleMultipleKeyword_1_6_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	           		setWithLastConsumed(current, "multiple", true, "multiple");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	

            }

            otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTable8501); 

                	newLeafNode(otherlv_17, grammarAccess.getTableAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3129:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3131:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3131:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3132:2: ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3135:2: ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3136:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3136:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=3;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3138:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3138:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3139:5: {...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3139:102: ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3140:6: ({...}? => ( (lv_options_19_0= ruleOption ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3143:6: ({...}? => ( (lv_options_19_0= ruleOption ) ) )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==18) ) {
            	            int LA23_1 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	        }
            	        else if ( (LA23_0==21) ) {
            	            int LA23_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3143:7: {...}? => ( (lv_options_19_0= ruleOption ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3143:16: ( (lv_options_19_0= ruleOption ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3144:1: (lv_options_19_0= ruleOption )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3144:1: (lv_options_19_0= ruleOption )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3145:3: lv_options_19_0= ruleOption
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_3_0_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable8567);
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

            	    	default :
            	    	    if ( cnt23 >= 1 ) break loop23;
            	                EarlyExitException eee =
            	                    new EarlyExitException(23, input);
            	                throw eee;
            	        }
            	        cnt23++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3168:4: ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3168:4: ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3169:5: {...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3169:102: ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3170:6: ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3173:6: ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+
            	    int cnt24=0;
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==56) ) {
            	            int LA24_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt24=1;
            	            }


            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3173:7: {...}? => ( (lv_questions_20_0= ruleTableQuestion ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3173:16: ( (lv_questions_20_0= ruleTableQuestion ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3174:1: (lv_questions_20_0= ruleTableQuestion )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3174:1: (lv_questions_20_0= ruleTableQuestion )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3175:3: lv_questions_20_0= ruleTableQuestion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable8643);
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
            	    	    if ( cnt24 >= 1 ) break loop24;
            	                EarlyExitException eee =
            	                    new EarlyExitException(24, input);
            	                throw eee;
            	        }
            	        cnt24++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3206:2: ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18||LA26_0==21) ) {
                    alt26=1;
                }
                else if ( (LA26_0==56) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3206:3: ( (lv_options_21_0= ruleOption ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3206:3: ( (lv_options_21_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3207:1: (lv_options_21_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3207:1: (lv_options_21_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3208:3: lv_options_21_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable8712);
            	    lv_options_21_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_21_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3225:6: ( (lv_questions_22_0= ruleTableQuestion ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3225:6: ( (lv_questions_22_0= ruleTableQuestion ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3226:1: (lv_questions_22_0= ruleTableQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3226:1: (lv_questions_22_0= ruleTableQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3227:3: lv_questions_22_0= ruleTableQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable8739);
            	    lv_questions_22_0=ruleTableQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_22_0, 
            	            		"TableQuestion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_23=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTable8753); 

                	newLeafNode(otherlv_23, grammarAccess.getTableAccess().getTableKeyword_5());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3255:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3256:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3257:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt8790);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt8801); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3264:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3267:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3268:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3268:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3268:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3268:2: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==55) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3269:2: kw= '-'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleEInt8840); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt8857); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3289:1: entryRuleAnswerTemplateRef returns [EObject current=null] : iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF ;
    public final EObject entryRuleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplateRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3290:2: (iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3291:2: iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef8902);
            iv_ruleAnswerTemplateRef=ruleAnswerTemplateRef();

            state._fsp--;

             current =iv_ruleAnswerTemplateRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplateRef8912); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3298:1: ruleAnswerTemplateRef returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' ) ;
    public final EObject ruleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3301:28: ( (otherlv_0= '<template' otherlv_1= 'id=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3302:1: (otherlv_0= '<template' otherlv_1= 'id=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3302:1: (otherlv_0= '<template' otherlv_1= 'id=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3302:3: otherlv_0= '<template' otherlv_1= 'id=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswerTemplateRef8949); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateRefAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswerTemplateRef8961); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateRefAccess().getIdKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3310:1: ( (otherlv_2= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3311:1: (otherlv_2= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3311:1: (otherlv_2= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3312:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRefRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplateRef8981); 

            		newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateRefAccess().getTemplateAnswerTemplateCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswerTemplateRef8993); 

                	newLeafNode(otherlv_3, grammarAccess.getAnswerTemplateRefAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAnswerTemplateRef9005); 

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


    // $ANTLR start "entryRuleTableQuestion"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3339:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3340:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3341:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion9041);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion9051); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3348:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= '<q>' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '</q>' ) ;
    public final EObject ruleTableQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3351:28: ( (otherlv_0= '<q>' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '</q>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3352:1: (otherlv_0= '<q>' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '</q>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3352:1: (otherlv_0= '<q>' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '</q>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3352:3: otherlv_0= '<q>' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '</q>'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTableQuestion9088); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3356:1: ( (lv_title_1_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3357:1: (lv_title_1_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3357:1: (lv_title_1_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3358:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTableQuestion9109);
            lv_title_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTableQuestion9121); 

                	newLeafNode(otherlv_2, grammarAccess.getTableQuestionAccess().getQKeyword_2());
                

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

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA15_eotS =
        "\13\uffff";
    static final String DFA15_eofS =
        "\13\uffff";
    static final String DFA15_minS =
        "\1\15\12\uffff";
    static final String DFA15_maxS =
        "\1\45\12\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA15_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\4\uffff\1\11\1\12\6\uffff\1\1\1"+
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

    class DFA15 extends DFA {

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
            return "()+ loopback of 1160:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'lowerLabel=\"' ( (lv_lowerLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'upperLabel=\"' ( (lv_upperLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'dependsOn=\"' ( (otherlv_22= RULE_FQN ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                         
                        int index15_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_0==32) ) {s = 1;}

                        else if ( LA15_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA15_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA15_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA15_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA15_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA15_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA15_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA15_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA15_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
                        input.seek(index15_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\15\uffff";
    static final String DFA16_eofS =
        "\15\uffff";
    static final String DFA16_minS =
        "\1\15\14\uffff";
    static final String DFA16_maxS =
        "\1\54\14\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA16_specialS =
        "\1\0\14\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\4\uffff\1\7\1\11\6\uffff\1\1\6"+
            "\uffff\1\5\1\6\1\10\1\12\1\13\1\14",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1530:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn=\"' ( (otherlv_19= RULE_FQN ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_0==32) ) {s = 1;}

                        else if ( LA16_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA16_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA16_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA16_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA16_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA16_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA16_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA16_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA16_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA16_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA16_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\12\uffff";
    static final String DFA17_eofS =
        "\12\uffff";
    static final String DFA17_minS =
        "\1\15\11\uffff";
    static final String DFA17_maxS =
        "\1\51\11\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA17_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\4\uffff\1\7\1\10\6\uffff\1\1\1"+
            "\uffff\1\5\1\6\5\uffff\1\11",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1940:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper=' ( (lv_upper_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'dependsOn=\"' ( (otherlv_17= RULE_FQN ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_0==32) ) {s = 1;}

                        else if ( LA17_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA17_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA17_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA17_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA17_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA17_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA17_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA17_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
                        input.seek(index17_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\13\uffff";
    static final String DFA20_eofS =
        "\13\uffff";
    static final String DFA20_minS =
        "\1\15\12\uffff";
    static final String DFA20_maxS =
        "\1\62\12\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA20_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\1\uffff\1\3\1\1\7\uffff\1\7\1\10\10\uffff\1\5\1\6\5\uffff"+
            "\1\12\5\uffff\1\11\2\uffff\1\4",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2524:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower=' ( (lv_lower_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'upper=' ( (lv_upper_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dependsOn=\"' ( (otherlv_16= RULE_FQN ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_20_0= 'showLimits' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                         
                        int index20_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA20_0==16) ) {s = 1;}

                        else if ( LA20_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA20_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA20_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA20_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA20_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA20_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA20_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA20_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA20_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
                        input.seek(index20_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\25\uffff";
    static final String DFA25_eofS =
        "\25\uffff";
    static final String DFA25_minS =
        "\1\22\1\23\1\20\1\4\1\uffff\2\5\1\4\2\71\2\16\2\26\1\0\1\40\1\20"+
        "\1\0\1\uffff\1\0\1\uffff";
    static final String DFA25_maxS =
        "\1\70\2\23\1\5\1\uffff\3\5\2\71\2\16\2\26\1\0\1\40\1\20\1\0\1\uffff"+
        "\1\0\1\uffff";
    static final String DFA25_acceptS =
        "\4\uffff\1\3\15\uffff\1\2\1\uffff\1\1";
    static final String DFA25_specialS =
        "\16\uffff\1\2\2\uffff\1\0\1\uffff\1\1\1\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\2\uffff\1\2\40\uffff\1\4\1\uffff\1\3",
            "\1\5",
            "\1\7\2\uffff\1\6",
            "\1\10\1\11",
            "",
            "\1\12",
            "\1\13",
            "\1\14\1\15",
            "\1\16",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\21",
            "\1\uffff",
            "\1\23",
            "\1\7",
            "\1\uffff",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()+ loopback of 3136:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_17 = input.LA(1);

                         
                        int index25_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index25_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_19 = input.LA(1);

                         
                        int index25_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index25_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_14 = input.LA(1);

                         
                        int index25_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index25_14);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleSurvey132 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey190 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey211 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey223 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_15_in_ruleSurvey291 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey312 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey324 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_16_in_ruleSurvey377 = new BitSet(new long[]{0x0012604208860000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey399 = new BitSet(new long[]{0x0012604208860000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey426 = new BitSet(new long[]{0x0012604208860000L});
        public static final BitSet FOLLOW_17_in_ruleSurvey440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_entryRuleItem601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItem611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleItem658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleItem685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleItem712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleItem739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleItem766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleItem793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleItem820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleItem847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion882 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleQuestion939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleQuestion966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleQuestion993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleQuestion1020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleQuestion1047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleQuestion1074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleQuestion1101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1136 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption1146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_ruleOption1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleOption1220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1255 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplate1265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAnswerTemplate1302 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnswerTemplate1314 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplate1331 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswerTemplate1348 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAnswerTemplate1360 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleAnswerTemplate1381 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleAnswerTemplate1394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1430 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleAnswer1477 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleAnswer1490 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswer1507 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswer1524 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAnswer1538 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1559 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAnswer1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup1617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleGroup1654 = new BitSet(new long[]{0x000000000301A000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1712 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1733 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1745 = new BitSet(new long[]{0x000000000301A000L});
        public static final BitSet FOLLOW_15_in_ruleGroup1813 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1834 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1846 = new BitSet(new long[]{0x000000000301A000L});
        public static final BitSet FOLLOW_24_in_ruleGroup1914 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleGroup1934 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1946 = new BitSet(new long[]{0x000000000301A000L});
        public static final BitSet FOLLOW_25_in_ruleGroup2019 = new BitSet(new long[]{0x000000000301A000L});
        public static final BitSet FOLLOW_16_in_ruleGroup2084 = new BitSet(new long[]{0x0012604208800000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup2105 = new BitSet(new long[]{0x001260420C800000L});
        public static final BitSet FOLLOW_26_in_ruleGroup2118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText2154 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText2164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleText2210 = new BitSet(new long[]{0x00000000F308A000L});
        public static final BitSet FOLLOW_13_in_ruleText2268 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2289 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2301 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_15_in_ruleText2369 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2390 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2402 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_19_in_ruleText2470 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleText2487 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2504 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_24_in_ruleText2572 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleText2592 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2604 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_25_in_ruleText2677 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_28_in_ruleText2757 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_29_in_ruleText2775 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_30_in_ruleText2801 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_31_in_ruleText2830 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_32_in_ruleText2905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_entryRuleScale2941 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScale2951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleScale2988 = new BitSet(new long[]{0x0000003C0308A000L});
        public static final BitSet FOLLOW_13_in_ruleScale3046 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3067 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3079 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_15_in_ruleScale3147 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3168 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3180 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_19_in_ruleScale3248 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleScale3265 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3282 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_34_in_ruleScale3350 = new BitSet(new long[]{0x0080000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3371 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_35_in_ruleScale3439 = new BitSet(new long[]{0x0080000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3460 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_36_in_ruleScale3528 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3549 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3561 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_37_in_ruleScale3629 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3650 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3662 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_24_in_ruleScale3730 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleScale3750 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3762 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_25_in_ruleScale3835 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_32_in_ruleScale3906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate3942 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate3952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDate3998 = new BitSet(new long[]{0x00001F800308A000L});
        public static final BitSet FOLLOW_13_in_ruleDate4056 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4077 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4089 = new BitSet(new long[]{0x00001F810308A000L});
        public static final BitSet FOLLOW_15_in_ruleDate4157 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4178 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4190 = new BitSet(new long[]{0x00001F810308A000L});
        public static final BitSet FOLLOW_19_in_ruleDate4258 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDate4275 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4292 = new BitSet(new long[]{0x00001F810308A000L});
        public static final BitSet FOLLOW_39_in_ruleDate4360 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4381 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4393 = new BitSet(new long[]{0x00001F810308A000L});
        public static final BitSet FOLLOW_40_in_ruleDate4461 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4482 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4494 = new BitSet(new long[]{0x00001F810308A000L});
        public static final BitSet FOLLOW_24_in_ruleDate4562 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleDate4582 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4594 = new BitSet(new long[]{0x00001F810308A000L});
        public static final BitSet FOLLOW_41_in_ruleDate4667 = new BitSet(new long[]{0x00001F810308A000L});
        public static final BitSet FOLLOW_25_in_ruleDate4752 = new BitSet(new long[]{0x00001F810308A000L});
        public static final BitSet FOLLOW_42_in_ruleDate4837 = new BitSet(new long[]{0x00001F810308A000L});
        public static final BitSet FOLLOW_43_in_ruleDate4922 = new BitSet(new long[]{0x00001F810308A000L});
        public static final BitSet FOLLOW_44_in_ruleDate5007 = new BitSet(new long[]{0x00001F810308A000L});
        public static final BitSet FOLLOW_32_in_ruleDate5078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber5114 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber5124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleNumber5170 = new BitSet(new long[]{0x0000020C0308A000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5228 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5249 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5261 = new BitSet(new long[]{0x0000020D0308A000L});
        public static final BitSet FOLLOW_15_in_ruleNumber5329 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5350 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5362 = new BitSet(new long[]{0x0000020D0308A000L});
        public static final BitSet FOLLOW_19_in_ruleNumber5430 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNumber5447 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5464 = new BitSet(new long[]{0x0000020D0308A000L});
        public static final BitSet FOLLOW_34_in_ruleNumber5532 = new BitSet(new long[]{0x0080000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5553 = new BitSet(new long[]{0x0000020D0308A000L});
        public static final BitSet FOLLOW_35_in_ruleNumber5621 = new BitSet(new long[]{0x0080000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5642 = new BitSet(new long[]{0x0000020D0308A000L});
        public static final BitSet FOLLOW_24_in_ruleNumber5710 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleNumber5730 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5742 = new BitSet(new long[]{0x0000020D0308A000L});
        public static final BitSet FOLLOW_25_in_ruleNumber5815 = new BitSet(new long[]{0x0000020D0308A000L});
        public static final BitSet FOLLOW_41_in_ruleNumber5900 = new BitSet(new long[]{0x0000020D0308A000L});
        public static final BitSet FOLLOW_32_in_ruleNumber5971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_entryRuleSingle6007 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingle6017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleSingle6054 = new BitSet(new long[]{0x000080000308A000L});
        public static final BitSet FOLLOW_13_in_ruleSingle6112 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle6133 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingle6145 = new BitSet(new long[]{0x000080000309A000L});
        public static final BitSet FOLLOW_15_in_ruleSingle6213 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle6234 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingle6246 = new BitSet(new long[]{0x000080000309A000L});
        public static final BitSet FOLLOW_19_in_ruleSingle6314 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingle6331 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingle6348 = new BitSet(new long[]{0x000080000309A000L});
        public static final BitSet FOLLOW_24_in_ruleSingle6416 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleSingle6436 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingle6448 = new BitSet(new long[]{0x000080000309A000L});
        public static final BitSet FOLLOW_25_in_ruleSingle6521 = new BitSet(new long[]{0x000080000309A000L});
        public static final BitSet FOLLOW_47_in_ruleSingle6606 = new BitSet(new long[]{0x000080000309A000L});
        public static final BitSet FOLLOW_16_in_ruleSingle6677 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingle6698 = new BitSet(new long[]{0x0001000000240000L});
        public static final BitSet FOLLOW_48_in_ruleSingle6711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple6747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiple6757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleMultiple6794 = new BitSet(new long[]{0x0004820C0300A000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple6852 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple6873 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple6885 = new BitSet(new long[]{0x0004820C0301A000L});
        public static final BitSet FOLLOW_15_in_ruleMultiple6953 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple6974 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple6986 = new BitSet(new long[]{0x0004820C0301A000L});
        public static final BitSet FOLLOW_50_in_ruleMultiple7054 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultiple7071 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple7088 = new BitSet(new long[]{0x0004820C0301A000L});
        public static final BitSet FOLLOW_34_in_ruleMultiple7156 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultiple7173 = new BitSet(new long[]{0x0004820C0301A000L});
        public static final BitSet FOLLOW_35_in_ruleMultiple7246 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultiple7263 = new BitSet(new long[]{0x0004820C0301A000L});
        public static final BitSet FOLLOW_24_in_ruleMultiple7336 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleMultiple7356 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple7368 = new BitSet(new long[]{0x0004820C0301A000L});
        public static final BitSet FOLLOW_25_in_ruleMultiple7441 = new BitSet(new long[]{0x0004820C0301A000L});
        public static final BitSet FOLLOW_47_in_ruleMultiple7526 = new BitSet(new long[]{0x0004820C0301A000L});
        public static final BitSet FOLLOW_41_in_ruleMultiple7611 = new BitSet(new long[]{0x0004820C0301A000L});
        public static final BitSet FOLLOW_16_in_ruleMultiple7682 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultiple7703 = new BitSet(new long[]{0x0008000000240000L});
        public static final BitSet FOLLOW_51_in_ruleMultiple7716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable7752 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable7762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTable7799 = new BitSet(new long[]{0x002080000309A000L});
        public static final BitSet FOLLOW_13_in_ruleTable7857 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable7878 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable7890 = new BitSet(new long[]{0x002080000309A000L});
        public static final BitSet FOLLOW_15_in_ruleTable7958 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable7979 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable7991 = new BitSet(new long[]{0x002080000309A000L});
        public static final BitSet FOLLOW_19_in_ruleTable8059 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTable8076 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable8093 = new BitSet(new long[]{0x002080000309A000L});
        public static final BitSet FOLLOW_24_in_ruleTable8161 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleTable8181 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable8193 = new BitSet(new long[]{0x002080000309A000L});
        public static final BitSet FOLLOW_25_in_ruleTable8266 = new BitSet(new long[]{0x002080000309A000L});
        public static final BitSet FOLLOW_47_in_ruleTable8351 = new BitSet(new long[]{0x002080000309A000L});
        public static final BitSet FOLLOW_53_in_ruleTable8436 = new BitSet(new long[]{0x002080000309A000L});
        public static final BitSet FOLLOW_16_in_ruleTable8501 = new BitSet(new long[]{0x0100000000240000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable8567 = new BitSet(new long[]{0x0140000000240000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable8643 = new BitSet(new long[]{0x0140000000240000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable8712 = new BitSet(new long[]{0x0140000000240000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable8739 = new BitSet(new long[]{0x0140000000240000L});
        public static final BitSet FOLLOW_54_in_ruleTable8753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt8790 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt8801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleEInt8840 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt8857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef8902 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplateRef8912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAnswerTemplateRef8949 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnswerTemplateRef8961 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplateRef8981 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswerTemplateRef8993 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleAnswerTemplateRef9005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion9041 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion9051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTableQuestion9088 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTableQuestion9109 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleTableQuestion9121 = new BitSet(new long[]{0x0000000000000002L});
    }


}