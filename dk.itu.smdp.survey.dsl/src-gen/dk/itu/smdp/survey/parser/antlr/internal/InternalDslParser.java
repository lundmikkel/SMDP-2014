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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FQN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<survey'", "'title=\"'", "'\"'", "'description=\"'", "'>'", "'</survey>'", "'<template'", "'id=\"'", "'</template>'", "'<a'", "'</a>'", "'<group'", "'depends-on=\"'", "'required'", "'</group>'", "'<text'", "'singleline'", "'single'", "'multi'", "'multiline'", "'/>'", "'<scale'", "'min='", "'max='", "'min-label=\"'", "'max-label=\"'", "'<date'", "'from=\"'", "'to=\"'", "'show-limits'", "'show'", "'limits'", "'day'", "'month'", "'year'", "'<number'", "'<single'", "'other'", "'</single>'", "'<multiple'", "'id\"\"'", "'</multiple>'", "'<table'", "'multiple'", "'</table>'", "'-'", "'<q>'", "'</q>'"
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

                        if ( (LA2_0==23||LA2_0==27||LA2_0==33||LA2_0==38||(LA2_0>=47 && LA2_0<=48)||LA2_0==51||LA2_0==54) ) {
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
            case 47:
                {
                alt5=5;
                }
                break;
            case 48:
                {
                alt5=6;
                }
                break;
            case 51:
                {
                alt5=7;
                }
                break;
            case 54:
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
            case 47:
                {
                alt6=4;
                }
                break;
            case 48:
                {
                alt6=5;
                }
                break;
            case 51:
                {
                alt6=6;
                }
                break;
            case 54:
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:664:1: ruleGroup returns [EObject current=null] : (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_required_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_9_0 = null;

        EObject lv_questions_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:667:28: ( (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:668:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:668:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:668:3: otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleGroup1654); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:672:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:674:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:674:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:675:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:678:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:679:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:679:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )*
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:757:4: ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:757:4: ({...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:758:5: {...}? => ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:758:102: ( ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:759:6: ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:762:6: ({...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:762:7: {...}? => (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:762:16: (otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:762:18: otherlv_8= 'depends-on=\"' ( (lv_dependsOn_9_0= ruleDEP_ID ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGroup1914); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getDependsOnKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:766:1: ( (lv_dependsOn_9_0= ruleDEP_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:767:1: (lv_dependsOn_9_0= ruleDEP_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:767:1: (lv_dependsOn_9_0= ruleDEP_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:768:3: lv_dependsOn_9_0= ruleDEP_ID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getDependsOnDEP_IDParserRuleCall_1_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleGroup1935);
            	    lv_dependsOn_9_0=ruleDEP_ID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"dependsOn",
            	            		lv_dependsOn_9_0, 
            	            		"DEP_ID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1947); 

            	        	newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:795:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:795:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:796:5: {...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:796:102: ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:797:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:800:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:800:7: {...}? => ( (lv_required_11_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:800:16: ( (lv_required_11_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:801:1: (lv_required_11_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:801:1: (lv_required_11_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:802:3: lv_required_11_0= 'required'
            	    {
            	    lv_required_11_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGroup2020); 

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

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGroup2085); 

                	newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:833:1: ( (lv_questions_13_0= ruleQuestion ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27||LA11_0==33||LA11_0==38||(LA11_0>=47 && LA11_0<=48)||LA11_0==51||LA11_0==54) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:834:1: (lv_questions_13_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:834:1: (lv_questions_13_0= ruleQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:835:3: lv_questions_13_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleGroup2106);
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

            otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleGroup2119); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:863:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:864:2: (iv_ruleText= ruleText EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:865:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText2155);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText2165); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:872:1: ruleText returns [EObject current=null] : ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:875:28: ( ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:876:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:876:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:876:2: () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:876:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:877:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleText2211); 

                	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:886:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:888:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:888:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:889:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:893:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:893:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:895:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:895:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:896:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:896:101: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:897:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:900:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:900:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:900:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:900:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2269); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTextAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:904:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:905:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:905:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:906:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2290);
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

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2302); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:933:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:933:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:934:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:934:101: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:935:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:938:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:938:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:938:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:938:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleText2370); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:942:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:943:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:943:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:944:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2391);
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

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2403); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:971:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:971:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:972:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:972:101: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:973:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:976:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:976:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:976:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:976:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleText2471); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTextAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:980:1: ( (lv_name_10_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:981:1: (lv_name_10_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:981:1: (lv_name_10_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:982:3: lv_name_10_0= RULE_ID
            	    {
            	    lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleText2488); 

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

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2505); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1009:4: ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1009:4: ({...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1010:5: {...}? => ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1010:101: ( ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1011:6: ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1014:6: ({...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1014:7: {...}? => (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1014:16: (otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1014:18: otherlv_12= 'depends-on=\"' ( (lv_dependsOn_13_0= ruleDEP_ID ) ) otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleText2573); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTextAccess().getDependsOnKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1018:1: ( (lv_dependsOn_13_0= ruleDEP_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1019:1: (lv_dependsOn_13_0= ruleDEP_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1019:1: (lv_dependsOn_13_0= ruleDEP_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1020:3: lv_dependsOn_13_0= ruleDEP_ID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getDependsOnDEP_IDParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleText2594);
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

            	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2606); 

            	        	newLeafNode(otherlv_14, grammarAccess.getTextAccess().getQuotationMarkKeyword_2_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1047:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1047:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1048:5: {...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1048:101: ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1049:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1052:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1052:7: {...}? => ( (lv_required_15_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1052:16: ( (lv_required_15_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1053:1: (lv_required_15_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1053:1: (lv_required_15_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1054:3: lv_required_15_0= 'required'
            	    {
            	    lv_required_15_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleText2679); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1074:4: ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1074:4: ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1075:5: {...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1075:101: ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1076:6: ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1079:6: ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1079:7: {...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1079:16: (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) )
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
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1079:18: otherlv_16= 'singleline'
            	            {
            	            otherlv_16=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleText2759); 

            	                	newLeafNode(otherlv_16, grammarAccess.getTextAccess().getSinglelineKeyword_2_5_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1084:7: otherlv_17= 'single'
            	            {
            	            otherlv_17=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleText2777); 

            	                	newLeafNode(otherlv_17, grammarAccess.getTextAccess().getSingleKeyword_2_5_1());
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1089:6: ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1089:6: ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1090:1: ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1090:1: ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1091:1: (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1091:1: (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' )
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
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1092:3: lv_multiline_18_1= 'multi'
            	                    {
            	                    lv_multiline_18_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleText2803); 

            	                            newLeafNode(lv_multiline_18_1, grammarAccess.getTextAccess().getMultilineMultiKeyword_2_5_2_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getTextRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "multiline", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1104:8: lv_multiline_18_2= 'multiline'
            	                    {
            	                    lv_multiline_18_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleText2832); 

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

            otherlv_19=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleText2907); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1146:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1147:2: (iv_ruleScale= ruleScale EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1148:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScale_in_entryRuleScale2943);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScale2953); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1155:1: ruleScale returns [EObject current=null] : (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= '/>' ) ;
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
        Token otherlv_23=null;
        Token lv_required_24_0=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_min_12_0 = null;

        AntlrDatatypeRuleToken lv_max_14_0 = null;

        AntlrDatatypeRuleToken lv_minLabel_16_0 = null;

        AntlrDatatypeRuleToken lv_maxLabel_19_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1158:28: ( (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1159:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1159:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1159:3: otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= '/>'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleScale2990); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1163:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1165:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1165:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1166:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1169:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1170:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1170:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=10;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1172:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1172:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1173:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1173:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1174:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1177:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1177:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1177:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1177:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3048); 

            	        	newLeafNode(otherlv_2, grammarAccess.getScaleAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1181:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1182:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1182:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1183:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3069);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3081); 

            	        	newLeafNode(otherlv_4, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1210:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1210:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1211:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1211:102: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1212:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1215:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1215:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1215:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1215:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3149); 

            	        	newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1219:1: ( (lv_description_6_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1220:1: (lv_description_6_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1220:1: (lv_description_6_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1221:3: lv_description_6_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3170);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3182); 

            	        	newLeafNode(otherlv_7, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1248:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1248:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1249:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1249:102: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1250:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1253:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1253:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1253:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1253:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleScale3250); 

            	        	newLeafNode(otherlv_8, grammarAccess.getScaleAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1257:1: ( (lv_name_9_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1258:1: (lv_name_9_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1258:1: (lv_name_9_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1259:3: lv_name_9_0= RULE_ID
            	    {
            	    lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleScale3267); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3284); 

            	        	newLeafNode(otherlv_10, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1286:4: ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1286:4: ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1287:5: {...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1287:102: ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1288:6: ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1291:6: ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1291:7: {...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1291:16: (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1291:18: otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) )
            	    {
            	    otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleScale3352); 

            	        	newLeafNode(otherlv_11, grammarAccess.getScaleAccess().getMinKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1295:1: ( (lv_min_12_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1296:1: (lv_min_12_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1296:1: (lv_min_12_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1297:3: lv_min_12_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getMinEIntParserRuleCall_1_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3373);
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


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1320:4: ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1320:4: ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1321:5: {...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1321:102: ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1322:6: ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1325:6: ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1325:7: {...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1325:16: (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1325:18: otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) )
            	    {
            	    otherlv_13=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleScale3441); 

            	        	newLeafNode(otherlv_13, grammarAccess.getScaleAccess().getMaxKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1329:1: ( (lv_max_14_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1330:1: (lv_max_14_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1330:1: (lv_max_14_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1331:3: lv_max_14_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getMaxEIntParserRuleCall_1_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3462);
            	    lv_max_14_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"max",
            	            		lv_max_14_0, 
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1354:4: ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1354:4: ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1355:5: {...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1355:102: ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1356:6: ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1359:6: ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1359:7: {...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1359:16: (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1359:18: otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"'
            	    {
            	    otherlv_15=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleScale3530); 

            	        	newLeafNode(otherlv_15, grammarAccess.getScaleAccess().getMinLabelKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1363:1: ( (lv_minLabel_16_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1364:1: (lv_minLabel_16_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1364:1: (lv_minLabel_16_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1365:3: lv_minLabel_16_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getMinLabelEStringParserRuleCall_1_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3551);
            	    lv_minLabel_16_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"minLabel",
            	            		lv_minLabel_16_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3563); 

            	        	newLeafNode(otherlv_17, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1392:4: ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1392:4: ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1393:5: {...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1393:102: ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1394:6: ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1397:6: ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1397:7: {...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1397:16: (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1397:18: otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"'
            	    {
            	    otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleScale3631); 

            	        	newLeafNode(otherlv_18, grammarAccess.getScaleAccess().getMaxLabelKeyword_1_6_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1401:1: ( (lv_maxLabel_19_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1402:1: (lv_maxLabel_19_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1402:1: (lv_maxLabel_19_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1403:3: lv_maxLabel_19_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getMaxLabelEStringParserRuleCall_1_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3652);
            	    lv_maxLabel_19_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"maxLabel",
            	            		lv_maxLabel_19_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3664); 

            	        	newLeafNode(otherlv_20, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_6_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1430:4: ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1430:4: ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1431:5: {...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1431:102: ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1432:6: ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1435:6: ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1435:7: {...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1435:16: (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1435:18: otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"'
            	    {
            	    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleScale3732); 

            	        	newLeafNode(otherlv_21, grammarAccess.getScaleAccess().getDependsOnKeyword_1_7_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1439:1: ( (lv_dependsOn_22_0= ruleDEP_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1440:1: (lv_dependsOn_22_0= ruleDEP_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1440:1: (lv_dependsOn_22_0= ruleDEP_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1441:3: lv_dependsOn_22_0= ruleDEP_ID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getDependsOnDEP_IDParserRuleCall_1_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleScale3753);
            	    lv_dependsOn_22_0=ruleDEP_ID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"dependsOn",
            	            		lv_dependsOn_22_0, 
            	            		"DEP_ID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3765); 

            	        	newLeafNode(otherlv_23, grammarAccess.getScaleAccess().getQuotationMarkKeyword_1_7_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1468:4: ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1468:4: ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1469:5: {...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1469:102: ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1470:6: ({...}? => ( (lv_required_24_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1473:6: ({...}? => ( (lv_required_24_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1473:7: {...}? => ( (lv_required_24_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1473:16: ( (lv_required_24_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1474:1: (lv_required_24_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1474:1: (lv_required_24_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1475:3: lv_required_24_0= 'required'
            	    {
            	    lv_required_24_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleScale3838); 

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

            otherlv_25=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleScale3909); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1515:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1516:2: (iv_ruleDate= ruleDate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1517:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate3945);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate3955); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1524:1: ruleDate returns [EObject current=null] : ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' ) ;
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

        AntlrDatatypeRuleToken lv_from_13_0 = null;

        AntlrDatatypeRuleToken lv_to_16_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_19_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1527:28: ( ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1528:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1528:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1528:2: () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1528:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1529:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDate4001); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1538:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1540:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1540:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1541:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1544:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1545:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1545:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=12;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1547:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1547:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1548:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1548:101: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1549:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1552:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1552:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1552:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1552:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4059); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1556:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1557:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1557:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1558:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4080);
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

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4092); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1585:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1585:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1586:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1586:101: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1587:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1590:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1590:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1590:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1590:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDate4160); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1594:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1595:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1595:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1596:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4181);
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

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4193); 

            	        	newLeafNode(otherlv_8, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1623:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1623:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1624:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1624:101: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1625:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1628:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1628:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1628:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1628:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDate4261); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDateAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1632:1: ( (lv_name_10_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1633:1: (lv_name_10_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1633:1: (lv_name_10_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1634:3: lv_name_10_0= RULE_ID
            	    {
            	    lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDate4278); 

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

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4295); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1661:4: ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1661:4: ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1662:5: {...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1662:101: ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1663:6: ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1666:6: ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1666:7: {...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1666:16: (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1666:18: otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"'
            	    {
            	    otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDate4363); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDateAccess().getFromKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1670:1: ( (lv_from_13_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1671:1: (lv_from_13_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1671:1: (lv_from_13_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1672:3: lv_from_13_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getFromEStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4384);
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

            	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4396); 

            	        	newLeafNode(otherlv_14, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1699:4: ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1699:4: ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1700:5: {...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1700:101: ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1701:6: ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1704:6: ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1704:7: {...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1704:16: (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1704:18: otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"'
            	    {
            	    otherlv_15=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDate4464); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDateAccess().getToKeyword_2_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1708:1: ( (lv_to_16_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1709:1: (lv_to_16_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1709:1: (lv_to_16_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1710:3: lv_to_16_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getToEStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4485);
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

            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4497); 

            	        	newLeafNode(otherlv_17, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_4_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1737:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1737:4: ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1738:5: {...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1738:101: ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1739:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1742:6: ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1742:7: {...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1742:16: (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1742:18: otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"'
            	    {
            	    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDate4565); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDateAccess().getDependsOnKeyword_2_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1746:1: ( (lv_dependsOn_19_0= ruleDEP_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1747:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1747:1: (lv_dependsOn_19_0= ruleDEP_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1748:3: lv_dependsOn_19_0= ruleDEP_ID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getDependsOnDEP_IDParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleDate4586);
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

            	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4598); 

            	        	newLeafNode(otherlv_20, grammarAccess.getDateAccess().getQuotationMarkKeyword_2_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1775:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1775:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1776:5: {...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1776:101: ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1777:6: ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1780:6: ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1780:7: {...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1780:16: ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1781:1: ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1781:1: ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1782:1: (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1782:1: (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' )
            	    int alt16=3;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1783:3: lv_showLimits_21_1= 'show-limits'
            	            {
            	            lv_showLimits_21_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDate4673); 

            	                    newLeafNode(lv_showLimits_21_1, grammarAccess.getDateAccess().getShowLimitsShowLimitsKeyword_2_6_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1795:8: lv_showLimits_21_2= 'show'
            	            {
            	            lv_showLimits_21_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDate4702); 

            	                    newLeafNode(lv_showLimits_21_2, grammarAccess.getDateAccess().getShowLimitsShowKeyword_2_6_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1807:8: lv_showLimits_21_3= 'limits'
            	            {
            	            lv_showLimits_21_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDate4731); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1829:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1829:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1830:5: {...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1830:101: ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1831:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1834:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1834:7: {...}? => ( (lv_required_22_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1834:16: ( (lv_required_22_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1835:1: (lv_required_22_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1835:1: (lv_required_22_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1836:3: lv_required_22_0= 'required'
            	    {
            	    lv_required_22_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDate4819); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1856:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1856:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1857:5: {...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1857:101: ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1858:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1861:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1861:7: {...}? => ( (lv_day_23_0= 'day' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1861:16: ( (lv_day_23_0= 'day' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1862:1: (lv_day_23_0= 'day' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1862:1: (lv_day_23_0= 'day' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1863:3: lv_day_23_0= 'day'
            	    {
            	    lv_day_23_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDate4904); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1883:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1883:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1884:5: {...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1884:101: ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1885:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1888:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1888:7: {...}? => ( (lv_month_24_0= 'month' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1888:16: ( (lv_month_24_0= 'month' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1889:1: (lv_month_24_0= 'month' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1889:1: (lv_month_24_0= 'month' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1890:3: lv_month_24_0= 'month'
            	    {
            	    lv_month_24_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDate4989); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1910:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1910:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1911:5: {...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1911:102: ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1912:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1915:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1915:7: {...}? => ( (lv_year_25_0= 'year' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1915:16: ( (lv_year_25_0= 'year' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1916:1: (lv_year_25_0= 'year' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1916:1: (lv_year_25_0= 'year' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1917:3: lv_year_25_0= 'year'
            	    {
            	    lv_year_25_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleDate5074); 

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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDateAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canLeave(grammarAccess.getDateAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	

            }

            otherlv_26=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDate5145); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1957:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1958:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1959:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber5181);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber5191); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1966:1: ruleNumber returns [EObject current=null] : ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '/>' ) ;
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
        Token otherlv_18=null;
        Token lv_required_19_0=null;
        Token lv_showLimits_20_1=null;
        Token lv_showLimits_20_2=null;
        Token lv_showLimits_20_3=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_min_13_0 = null;

        AntlrDatatypeRuleToken lv_max_15_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1969:28: ( ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1970:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1970:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1970:2: () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1970:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1971:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberAccess().getNumberAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleNumber5237); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getNumberKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1980:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1982:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1982:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1983:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1986:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1987:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1987:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=9;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1989:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1989:4: ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1990:5: {...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1990:103: ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1991:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1994:6: ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1994:7: {...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1994:16: (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1994:18: otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"'
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5295); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1998:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1999:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1999:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2000:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getTitleEStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5316);
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

            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5328); 

            	        	newLeafNode(otherlv_5, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2027:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2027:4: ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2028:5: {...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2028:103: ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2029:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2032:6: ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2032:7: {...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2032:16: (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2032:18: otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"'
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNumber5396); 

            	        	newLeafNode(otherlv_6, grammarAccess.getNumberAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2036:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2037:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2037:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2038:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getDescriptionEStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5417);
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

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5429); 

            	        	newLeafNode(otherlv_8, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2065:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2065:4: ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2066:5: {...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2066:103: ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2067:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2070:6: ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2070:7: {...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2070:16: (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2070:18: otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"'
            	    {
            	    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNumber5497); 

            	        	newLeafNode(otherlv_9, grammarAccess.getNumberAccess().getIdKeyword_2_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2074:1: ( (lv_name_10_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2075:1: (lv_name_10_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2075:1: (lv_name_10_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2076:3: lv_name_10_0= RULE_ID
            	    {
            	    lv_name_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNumber5514); 

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

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5531); 

            	        	newLeafNode(otherlv_11, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2103:4: ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2103:4: ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2104:5: {...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2104:103: ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2105:6: ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2108:6: ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2108:7: {...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2108:16: (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2108:18: otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) )
            	    {
            	    otherlv_12=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNumber5599); 

            	        	newLeafNode(otherlv_12, grammarAccess.getNumberAccess().getMinKeyword_2_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2112:1: ( (lv_min_13_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2113:1: (lv_min_13_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2113:1: (lv_min_13_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2114:3: lv_min_13_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getMinEIntParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5620);
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


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2137:4: ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2137:4: ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2138:5: {...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2138:103: ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2139:6: ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2142:6: ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2142:7: {...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2142:16: (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2142:18: otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) )
            	    {
            	    otherlv_14=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleNumber5688); 

            	        	newLeafNode(otherlv_14, grammarAccess.getNumberAccess().getMaxKeyword_2_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2146:1: ( (lv_max_15_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2147:1: (lv_max_15_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2147:1: (lv_max_15_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2148:3: lv_max_15_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getMaxEIntParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5709);
            	    lv_max_15_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"max",
            	            		lv_max_15_0, 
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2171:4: ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2171:4: ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2172:5: {...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2172:103: ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2173:6: ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2176:6: ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2176:7: {...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2176:16: (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2176:18: otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"'
            	    {
            	    otherlv_16=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNumber5777); 

            	        	newLeafNode(otherlv_16, grammarAccess.getNumberAccess().getDependsOnKeyword_2_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2180:1: ( (lv_dependsOn_17_0= ruleDEP_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2181:1: (lv_dependsOn_17_0= ruleDEP_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2181:1: (lv_dependsOn_17_0= ruleDEP_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2182:3: lv_dependsOn_17_0= ruleDEP_ID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getDependsOnDEP_IDParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleNumber5798);
            	    lv_dependsOn_17_0=ruleDEP_ID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"dependsOn",
            	            		lv_dependsOn_17_0, 
            	            		"DEP_ID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5810); 

            	        	newLeafNode(otherlv_18, grammarAccess.getNumberAccess().getQuotationMarkKeyword_2_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2209:4: ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2209:4: ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2210:5: {...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2210:103: ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2211:6: ({...}? => ( (lv_required_19_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2214:6: ({...}? => ( (lv_required_19_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2214:7: {...}? => ( (lv_required_19_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2214:16: ( (lv_required_19_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2215:1: (lv_required_19_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2215:1: (lv_required_19_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2216:3: lv_required_19_0= 'required'
            	    {
            	    lv_required_19_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNumber5883); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2236:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2236:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2237:5: {...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2237:103: ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2238:6: ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2241:6: ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2241:7: {...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2241:16: ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2242:1: ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2242:1: ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2243:1: (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2243:1: (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' )
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2244:3: lv_showLimits_20_1= 'show-limits'
            	            {
            	            lv_showLimits_20_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNumber5970); 

            	                    newLeafNode(lv_showLimits_20_1, grammarAccess.getNumberAccess().getShowLimitsShowLimitsKeyword_2_7_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getNumberRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2256:8: lv_showLimits_20_2= 'show'
            	            {
            	            lv_showLimits_20_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNumber5999); 

            	                    newLeafNode(lv_showLimits_20_2, grammarAccess.getNumberAccess().getShowLimitsShowKeyword_2_7_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getNumberRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2268:8: lv_showLimits_20_3= 'limits'
            	            {
            	            lv_showLimits_20_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleNumber6028); 

            	                    newLeafNode(lv_showLimits_20_3, grammarAccess.getNumberAccess().getShowLimitsLimitsKeyword_2_7_0_2());
            	                

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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNumberAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canLeave(grammarAccess.getNumberAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	

            }

            otherlv_21=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNumber6102); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2310:1: entryRuleSingle returns [EObject current=null] : iv_ruleSingle= ruleSingle EOF ;
    public final EObject entryRuleSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingle = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2311:2: (iv_ruleSingle= ruleSingle EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2312:2: iv_ruleSingle= ruleSingle EOF
            {
             newCompositeNode(grammarAccess.getSingleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingle_in_entryRuleSingle6138);
            iv_ruleSingle=ruleSingle();

            state._fsp--;

             current =iv_ruleSingle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingle6148); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2319:1: ruleSingle returns [EObject current=null] : (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' ) ;
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
        Token otherlv_13=null;
        Token lv_required_14_0=null;
        Token lv_other_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_12_0 = null;

        EObject lv_options_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2322:28: ( (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2323:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2323:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2323:3: otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleSingle6185); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2327:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2329:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2329:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2330:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2333:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2334:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2334:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=7;
                int LA20_0 = input.LA(1);

                if ( LA20_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2) ) {
                    alt20=3;
                }
                else if ( LA20_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3) ) {
                    alt20=4;
                }
                else if ( LA20_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4) ) {
                    alt20=5;
                }
                else if ( LA20_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5) ) {
                    alt20=6;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2336:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2336:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2337:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2337:103: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2338:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2341:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2341:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2341:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2341:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle6243); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSingleAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2345:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2346:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2346:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2347:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle6264);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle6276); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSingleAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2374:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2374:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2375:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2375:103: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2376:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2379:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2379:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2379:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2379:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingle6344); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSingleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2383:1: ( (lv_description_6_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2384:1: (lv_description_6_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2384:1: (lv_description_6_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2385:3: lv_description_6_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle6365);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle6377); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSingleAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2412:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2412:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2413:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2413:103: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2414:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2417:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2417:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2417:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2417:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSingle6445); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSingleAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2421:1: ( (lv_name_9_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2422:1: (lv_name_9_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2422:1: (lv_name_9_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2423:3: lv_name_9_0= RULE_ID
            	    {
            	    lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingle6462); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle6479); 

            	        	newLeafNode(otherlv_10, grammarAccess.getSingleAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2450:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2450:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2451:5: {...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2451:103: ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2452:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2455:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2455:7: {...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2455:16: (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2455:18: otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingle6547); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSingleAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2459:1: ( (lv_dependsOn_12_0= ruleDEP_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2460:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2460:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2461:3: lv_dependsOn_12_0= ruleDEP_ID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getDependsOnDEP_IDParserRuleCall_1_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleSingle6568);
            	    lv_dependsOn_12_0=ruleDEP_ID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"dependsOn",
            	            		lv_dependsOn_12_0, 
            	            		"DEP_ID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle6580); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSingleAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2488:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2488:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2489:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2489:103: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2490:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2493:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2493:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2493:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2494:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2494:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2495:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingle6653); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2515:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2515:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2516:5: {...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2516:103: ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2517:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2520:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2520:7: {...}? => ( (lv_other_15_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2520:16: ( (lv_other_15_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2521:1: (lv_other_15_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2521:1: (lv_other_15_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2522:3: lv_other_15_0= 'other'
            	    {
            	    lv_other_15_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleSingle6738); 

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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSingleAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canLeave(grammarAccess.getSingleAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSingle6809); 

                	newLeafNode(otherlv_16, grammarAccess.getSingleAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2554:1: ( (lv_options_17_0= ruleOption ) )+
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2555:1: (lv_options_17_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2555:1: (lv_options_17_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2556:3: lv_options_17_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingle6830);
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_18=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSingle6843); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2584:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2585:2: (iv_ruleMultiple= ruleMultiple EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2586:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_entryRuleMultiple6879);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiple6889); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2593:1: ruleMultiple returns [EObject current=null] : (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '>' ( (lv_options_22_0= ruleOption ) )+ otherlv_23= '</multiple>' ) ;
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
        Token lv_min_12_0=null;
        Token otherlv_13=null;
        Token lv_max_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_required_18_0=null;
        Token lv_other_19_0=null;
        Token lv_showLimits_20_1=null;
        Token lv_showLimits_20_2=null;
        Token lv_showLimits_20_3=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_16_0 = null;

        EObject lv_options_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2596:28: ( (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '>' ( (lv_options_22_0= ruleOption ) )+ otherlv_23= '</multiple>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2597:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '>' ( (lv_options_22_0= ruleOption ) )+ otherlv_23= '</multiple>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2597:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '>' ( (lv_options_22_0= ruleOption ) )+ otherlv_23= '</multiple>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2597:3: otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_21= '>' ( (lv_options_22_0= ruleOption ) )+ otherlv_23= '</multiple>'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleMultiple6926); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2601:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2603:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2603:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2604:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2607:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2608:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2608:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=10;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2610:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2610:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2611:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2611:105: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2612:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2615:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2615:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2615:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2615:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple6984); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultipleAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2619:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2620:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2620:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2621:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple7005);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple7017); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMultipleAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2648:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2648:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2649:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2649:105: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2650:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2653:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2653:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2653:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2653:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultiple7085); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultipleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2657:1: ( (lv_description_6_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2658:1: (lv_description_6_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2658:1: (lv_description_6_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2659:3: lv_description_6_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple7106);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple7118); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMultipleAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2686:4: ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2686:4: ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2687:5: {...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2687:105: ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2688:6: ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2691:6: ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2691:7: {...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2691:16: (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2691:18: otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleMultiple7186); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMultipleAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2695:1: ( (lv_name_9_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2696:1: (lv_name_9_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2696:1: (lv_name_9_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2697:3: lv_name_9_0= RULE_ID
            	    {
            	    lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultiple7203); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple7220); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMultipleAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2724:4: ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2724:4: ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2725:5: {...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2725:105: ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2726:6: ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2729:6: ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2729:7: {...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2729:16: (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2729:18: otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) )
            	    {
            	    otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultiple7288); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMultipleAccess().getMinKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2733:1: ( (lv_min_12_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2734:1: (lv_min_12_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2734:1: (lv_min_12_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2735:3: lv_min_12_0= RULE_INT
            	    {
            	    lv_min_12_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultiple7305); 

            	    			newLeafNode(lv_min_12_0, grammarAccess.getMultipleAccess().getMinINTTerminalRuleCall_1_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"min",
            	            		lv_min_12_0, 
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2758:4: ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2758:4: ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2759:5: {...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2759:105: ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2760:6: ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2763:6: ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2763:7: {...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2763:16: (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2763:18: otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) )
            	    {
            	    otherlv_13=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMultiple7378); 

            	        	newLeafNode(otherlv_13, grammarAccess.getMultipleAccess().getMaxKeyword_1_4_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2767:1: ( (lv_max_14_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2768:1: (lv_max_14_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2768:1: (lv_max_14_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2769:3: lv_max_14_0= RULE_INT
            	    {
            	    lv_max_14_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultiple7395); 

            	    			newLeafNode(lv_max_14_0, grammarAccess.getMultipleAccess().getMaxINTTerminalRuleCall_1_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"max",
            	            		lv_max_14_0, 
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2792:4: ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2792:4: ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2793:5: {...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2793:105: ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2794:6: ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2797:6: ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2797:7: {...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2797:16: (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2797:18: otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"'
            	    {
            	    otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultiple7468); 

            	        	newLeafNode(otherlv_15, grammarAccess.getMultipleAccess().getDependsOnKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2801:1: ( (lv_dependsOn_16_0= ruleDEP_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2802:1: (lv_dependsOn_16_0= ruleDEP_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2802:1: (lv_dependsOn_16_0= ruleDEP_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2803:3: lv_dependsOn_16_0= ruleDEP_ID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getDependsOnDEP_IDParserRuleCall_1_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleMultiple7489);
            	    lv_dependsOn_16_0=ruleDEP_ID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"dependsOn",
            	            		lv_dependsOn_16_0, 
            	            		"DEP_ID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple7501); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMultipleAccess().getQuotationMarkKeyword_1_5_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2830:4: ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2830:4: ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2831:5: {...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2831:105: ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2832:6: ({...}? => ( (lv_required_18_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2835:6: ({...}? => ( (lv_required_18_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2835:7: {...}? => ( (lv_required_18_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2835:16: ( (lv_required_18_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2836:1: (lv_required_18_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2836:1: (lv_required_18_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2837:3: lv_required_18_0= 'required'
            	    {
            	    lv_required_18_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultiple7574); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2857:4: ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2857:4: ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2858:5: {...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2858:105: ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2859:6: ({...}? => ( (lv_other_19_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2862:6: ({...}? => ( (lv_other_19_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2862:7: {...}? => ( (lv_other_19_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2862:16: ( (lv_other_19_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2863:1: (lv_other_19_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2863:1: (lv_other_19_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2864:3: lv_other_19_0= 'other'
            	    {
            	    lv_other_19_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleMultiple7659); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2884:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2884:4: ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2885:5: {...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2885:105: ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2886:6: ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2889:6: ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2889:7: {...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2889:16: ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2890:1: ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2890:1: ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2891:1: (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2891:1: (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2892:3: lv_showLimits_20_1= 'show-limits'
            	            {
            	            lv_showLimits_20_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMultiple7746); 

            	                    newLeafNode(lv_showLimits_20_1, grammarAccess.getMultipleAccess().getShowLimitsShowLimitsKeyword_1_8_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2904:8: lv_showLimits_20_2= 'show'
            	            {
            	            lv_showLimits_20_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMultiple7775); 

            	                    newLeafNode(lv_showLimits_20_2, grammarAccess.getMultipleAccess().getShowLimitsShowKeyword_1_8_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2916:8: lv_showLimits_20_3= 'limits'
            	            {
            	            lv_showLimits_20_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMultiple7804); 

            	                    newLeafNode(lv_showLimits_20_3, grammarAccess.getMultipleAccess().getShowLimitsLimitsKeyword_1_8_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultipleRule());
            	            	        }
            	                   		setWithLastConsumed(current, "showLimits", true, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultiple7878); 

                	newLeafNode(otherlv_21, grammarAccess.getMultipleAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2950:1: ( (lv_options_22_0= ruleOption ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18||LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2951:1: (lv_options_22_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2951:1: (lv_options_22_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2952:3: lv_options_22_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultiple7899);
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_23=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleMultiple7912); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2980:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2981:2: (iv_ruleTable= ruleTable EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2982:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable7948);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable7958); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2989:1: ruleTable returns [EObject current=null] : (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' ) ;
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
        Token otherlv_13=null;
        Token lv_required_14_0=null;
        Token lv_other_15_0=null;
        Token lv_multiple_16_0=null;
        Token otherlv_17=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_dependsOn_12_0 = null;

        EObject lv_options_19_0 = null;

        EObject lv_questions_20_0 = null;

        EObject lv_options_21_0 = null;

        EObject lv_questions_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2992:28: ( (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2993:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2993:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2993:3: otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTable7995); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2997:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2999:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2999:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3000:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3003:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3004:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3004:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )*
            loop25:
            do {
                int alt25=8;
                int LA25_0 = input.LA(1);

                if ( LA25_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
                    alt25=3;
                }
                else if ( LA25_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
                    alt25=4;
                }
                else if ( LA25_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
                    alt25=5;
                }
                else if ( LA25_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
                    alt25=6;
                }
                else if ( LA25_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6) ) {
                    alt25=7;
                }


                switch (alt25) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3006:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3006:4: ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3007:5: {...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3007:102: ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3008:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3011:6: ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3011:7: {...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3011:16: (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3011:18: otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"'
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable8053); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3015:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3016:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3016:1: (lv_title_3_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3017:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable8074);
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

            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable8086); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_0_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3044:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3044:4: ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3045:5: {...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3045:102: ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3046:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3049:6: ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3049:7: {...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3049:16: (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3049:18: otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"'
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable8154); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getDescriptionKeyword_1_1_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3053:1: ( (lv_description_6_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3054:1: (lv_description_6_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3054:1: (lv_description_6_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3055:3: lv_description_6_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getDescriptionEStringParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable8175);
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable8187); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3082:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3082:4: ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3083:5: {...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3083:102: ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3084:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3087:6: ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3087:7: {...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3087:16: (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3087:18: otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"'
            	    {
            	    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTable8255); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTableAccess().getIdKeyword_1_2_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3091:1: ( (lv_name_9_0= RULE_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3092:1: (lv_name_9_0= RULE_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3092:1: (lv_name_9_0= RULE_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3093:3: lv_name_9_0= RULE_ID
            	    {
            	    lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTable8272); 

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

            	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable8289); 

            	        	newLeafNode(otherlv_10, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3120:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3120:4: ({...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3121:5: {...}? => ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3121:102: ( ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3122:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3125:6: ({...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3125:7: {...}? => (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3125:16: (otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3125:18: otherlv_11= 'depends-on=\"' ( (lv_dependsOn_12_0= ruleDEP_ID ) ) otherlv_13= '\"'
            	    {
            	    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTable8357); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTableAccess().getDependsOnKeyword_1_3_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3129:1: ( (lv_dependsOn_12_0= ruleDEP_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3130:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3130:1: (lv_dependsOn_12_0= ruleDEP_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3131:3: lv_dependsOn_12_0= ruleDEP_ID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getDependsOnDEP_IDParserRuleCall_1_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_ruleTable8378);
            	    lv_dependsOn_12_0=ruleDEP_ID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"dependsOn",
            	            		lv_dependsOn_12_0, 
            	            		"DEP_ID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable8390); 

            	        	newLeafNode(otherlv_13, grammarAccess.getTableAccess().getQuotationMarkKeyword_1_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3158:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3158:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3159:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3159:102: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3160:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3163:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3163:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3163:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3164:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3164:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3165:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTable8463); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3185:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3185:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3186:5: {...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3186:102: ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3187:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3190:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3190:7: {...}? => ( (lv_other_15_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3190:16: ( (lv_other_15_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3191:1: (lv_other_15_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3191:1: (lv_other_15_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3192:3: lv_other_15_0= 'other'
            	    {
            	    lv_other_15_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTable8548); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3212:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3212:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3213:5: {...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3213:102: ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3214:6: ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3217:6: ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3217:7: {...}? => ( (lv_multiple_16_0= 'multiple' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3217:16: ( (lv_multiple_16_0= 'multiple' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3218:1: (lv_multiple_16_0= 'multiple' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3218:1: (lv_multiple_16_0= 'multiple' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3219:3: lv_multiple_16_0= 'multiple'
            	    {
            	    lv_multiple_16_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTable8633); 

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
            	    break loop25;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	

            }

            otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTable8698); 

                	newLeafNode(otherlv_17, grammarAccess.getTableAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3250:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3252:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3252:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3253:2: ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3256:2: ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3257:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3257:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=3;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3259:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3259:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3260:5: {...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3260:102: ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3261:6: ({...}? => ( (lv_options_19_0= ruleOption ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3264:6: ({...}? => ( (lv_options_19_0= ruleOption ) ) )+
            	    int cnt26=0;
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==18) ) {
            	            int LA26_1 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt26=1;
            	            }


            	        }
            	        else if ( (LA26_0==21) ) {
            	            int LA26_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt26=1;
            	            }


            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3264:7: {...}? => ( (lv_options_19_0= ruleOption ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3264:16: ( (lv_options_19_0= ruleOption ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3265:1: (lv_options_19_0= ruleOption )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3265:1: (lv_options_19_0= ruleOption )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3266:3: lv_options_19_0= ruleOption
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_3_0_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable8764);
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
            	    	    if ( cnt26 >= 1 ) break loop26;
            	                EarlyExitException eee =
            	                    new EarlyExitException(26, input);
            	                throw eee;
            	        }
            	        cnt26++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3289:4: ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3289:4: ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3290:5: {...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3290:102: ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3291:6: ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3294:6: ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+
            	    int cnt27=0;
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==58) ) {
            	            int LA27_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt27=1;
            	            }


            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3294:7: {...}? => ( (lv_questions_20_0= ruleTableQuestion ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3294:16: ( (lv_questions_20_0= ruleTableQuestion ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3295:1: (lv_questions_20_0= ruleTableQuestion )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3295:1: (lv_questions_20_0= ruleTableQuestion )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3296:3: lv_questions_20_0= ruleTableQuestion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable8840);
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
            	    	    if ( cnt27 >= 1 ) break loop27;
            	                EarlyExitException eee =
            	                    new EarlyExitException(27, input);
            	                throw eee;
            	        }
            	        cnt27++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3327:2: ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18||LA29_0==21) ) {
                    alt29=1;
                }
                else if ( (LA29_0==58) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3327:3: ( (lv_options_21_0= ruleOption ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3327:3: ( (lv_options_21_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3328:1: (lv_options_21_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3328:1: (lv_options_21_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3329:3: lv_options_21_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable8909);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3346:6: ( (lv_questions_22_0= ruleTableQuestion ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3346:6: ( (lv_questions_22_0= ruleTableQuestion ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3347:1: (lv_questions_22_0= ruleTableQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3347:1: (lv_questions_22_0= ruleTableQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3348:3: lv_questions_22_0= ruleTableQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable8936);
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
            	    break loop29;
                }
            } while (true);

            otherlv_23=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTable8950); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3376:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3377:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3378:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt8987);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt8998); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3385:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3388:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3389:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3389:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3389:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3389:2: (kw= '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==57) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3390:2: kw= '-'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleEInt9037); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt9054); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3410:1: entryRuleAnswerTemplateRef returns [EObject current=null] : iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF ;
    public final EObject entryRuleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplateRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3411:2: (iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3412:2: iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef9099);
            iv_ruleAnswerTemplateRef=ruleAnswerTemplateRef();

            state._fsp--;

             current =iv_ruleAnswerTemplateRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplateRef9109); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3419:1: ruleAnswerTemplateRef returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' ) ;
    public final EObject ruleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3422:28: ( (otherlv_0= '<template' otherlv_1= 'id=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3423:1: (otherlv_0= '<template' otherlv_1= 'id=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3423:1: (otherlv_0= '<template' otherlv_1= 'id=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3423:3: otherlv_0= '<template' otherlv_1= 'id=\"' ( (otherlv_2= RULE_ID ) ) otherlv_3= '\"' otherlv_4= '/>'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswerTemplateRef9146); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateRefAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswerTemplateRef9158); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateRefAccess().getIdKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3431:1: ( (otherlv_2= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3432:1: (otherlv_2= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3432:1: (otherlv_2= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3433:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRefRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplateRef9178); 

            		newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateRefAccess().getTemplateAnswerTemplateCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnswerTemplateRef9190); 

                	newLeafNode(otherlv_3, grammarAccess.getAnswerTemplateRefAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAnswerTemplateRef9202); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3460:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3461:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3462:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion9238);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion9248); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3469:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= '<q>' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '</q>' ) ;
    public final EObject ruleTableQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3472:28: ( (otherlv_0= '<q>' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '</q>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3473:1: (otherlv_0= '<q>' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '</q>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3473:1: (otherlv_0= '<q>' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '</q>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3473:3: otherlv_0= '<q>' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '</q>'
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTableQuestion9285); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3477:1: ( (lv_title_1_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3478:1: (lv_title_1_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3478:1: (lv_title_1_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3479:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTableQuestion9306);
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

            otherlv_2=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTableQuestion9318); 

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


    // $ANTLR start "entryRuleDEP_ID"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3507:1: entryRuleDEP_ID returns [String current=null] : iv_ruleDEP_ID= ruleDEP_ID EOF ;
    public final String entryRuleDEP_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDEP_ID = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3508:2: (iv_ruleDEP_ID= ruleDEP_ID EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3509:2: iv_ruleDEP_ID= ruleDEP_ID EOF
            {
             newCompositeNode(grammarAccess.getDEP_IDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDEP_ID_in_entryRuleDEP_ID9355);
            iv_ruleDEP_ID=ruleDEP_ID();

            state._fsp--;

             current =iv_ruleDEP_ID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDEP_ID9366); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3516:1: ruleDEP_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN ) ;
    public final AntlrDatatypeRuleToken ruleDEP_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_FQN_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3519:28: ( (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3520:1: (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3520:1: (this_ID_0= RULE_ID | this_FQN_1= RULE_FQN )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_FQN) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3520:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDEP_ID9406); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getDEP_IDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3528:10: this_FQN_1= RULE_FQN
                    {
                    this_FQN_1=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleDEP_ID9432); 

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


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA28 dfa28 = new DFA28(this);
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
            return "()+ loopback of 1170:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id=\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'min-label=\"' ( (lv_minLabel_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'max-label=\"' ( (lv_maxLabel_19_0= ruleEString ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'depends-on=\"' ( (lv_dependsOn_22_0= ruleDEP_ID ) ) otherlv_23= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_24_0= 'required' ) ) ) ) ) )+";
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
    static final String DFA17_eotS =
        "\15\uffff";
    static final String DFA17_eofS =
        "\15\uffff";
    static final String DFA17_minS =
        "\1\15\14\uffff";
    static final String DFA17_maxS =
        "\1\56\14\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA17_specialS =
        "\1\0\14\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\4\uffff\1\7\1\11\6\uffff\1\1\6"+
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
            return "()+ loopback of 1545:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from=\"' ( (lv_from_13_0= ruleEString ) ) otherlv_14= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to=\"' ( (lv_to_16_0= ruleEString ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'depends-on=\"' ( (lv_dependsOn_19_0= ruleDEP_ID ) ) otherlv_20= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_21_1= 'show-limits' | lv_showLimits_21_2= 'show' | lv_showLimits_21_3= 'limits' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+";
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

                        else if ( LA17_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA17_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA17_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA17_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA17_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA17_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA17_0 >=41 && LA17_0<=43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA17_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA17_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA17_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA17_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                         
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
    static final String DFA19_eotS =
        "\12\uffff";
    static final String DFA19_eofS =
        "\12\uffff";
    static final String DFA19_minS =
        "\1\15\11\uffff";
    static final String DFA19_maxS =
        "\1\53\11\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA19_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\4\uffff\1\7\1\10\6\uffff\1\1\1"+
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1987:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title=\"' ( (lv_title_4_0= ruleEString ) ) otherlv_5= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description=\"' ( (lv_description_7_0= ruleEString ) ) otherlv_8= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id=\"' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'min=' ( (lv_min_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'max=' ( (lv_max_15_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'depends-on=\"' ( (lv_dependsOn_17_0= ruleDEP_ID ) ) otherlv_18= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_0==32) ) {s = 1;}

                        else if ( LA19_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA19_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA19_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA19_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA19_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA19_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA19_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA19_0 >=41 && LA19_0<=43 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\13\uffff";
    static final String DFA23_eofS =
        "\13\uffff";
    static final String DFA23_minS =
        "\1\15\12\uffff";
    static final String DFA23_maxS =
        "\1\64\12\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA23_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\2\1\uffff\1\3\1\1\7\uffff\1\7\1\10\10\uffff\1\5\1\6\5\uffff"+
            "\3\12\5\uffff\1\11\2\uffff\1\4",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2608:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title=\"' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description=\"' ( (lv_description_6_0= ruleEString ) ) otherlv_7= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id\"\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'min=' ( (lv_min_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'max=' ( (lv_max_14_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'depends-on=\"' ( (lv_dependsOn_16_0= ruleDEP_ID ) ) otherlv_17= '\"' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_18_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_19_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_showLimits_20_1= 'show-limits' | lv_showLimits_20_2= 'show' | lv_showLimits_20_3= 'limits' ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA23_0==16) ) {s = 1;}

                        else if ( LA23_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA23_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA23_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA23_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA23_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA23_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA23_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA23_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA23_0 >=41 && LA23_0<=43 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\25\uffff";
    static final String DFA28_eofS =
        "\25\uffff";
    static final String DFA28_minS =
        "\1\22\1\23\1\20\1\4\1\uffff\2\5\1\4\2\73\2\16\2\26\1\0\1\40\1\20"+
        "\1\0\1\uffff\1\0\1\uffff";
    static final String DFA28_maxS =
        "\1\72\2\23\1\5\1\uffff\3\5\2\73\2\16\2\26\1\0\1\40\1\20\1\0\1\uffff"+
        "\1\0\1\uffff";
    static final String DFA28_acceptS =
        "\4\uffff\1\3\15\uffff\1\2\1\uffff\1\1";
    static final String DFA28_specialS =
        "\16\uffff\1\0\2\uffff\1\2\1\uffff\1\1\1\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\2\uffff\1\2\42\uffff\1\4\1\uffff\1\3",
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()+ loopback of 3257:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_14 = input.LA(1);

                         
                        int index28_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index28_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_19 = input.LA(1);

                         
                        int index28_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index28_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_17 = input.LA(1);

                         
                        int index28_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index28_17);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
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
        public static final BitSet FOLLOW_16_in_ruleSurvey377 = new BitSet(new long[]{0x0049804208860000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey399 = new BitSet(new long[]{0x0049804208860000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey426 = new BitSet(new long[]{0x0049804208860000L});
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
        public static final BitSet FOLLOW_24_in_ruleGroup1914 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleGroup1935 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1947 = new BitSet(new long[]{0x000000000301A000L});
        public static final BitSet FOLLOW_25_in_ruleGroup2020 = new BitSet(new long[]{0x000000000301A000L});
        public static final BitSet FOLLOW_16_in_ruleGroup2085 = new BitSet(new long[]{0x0049804208800000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup2106 = new BitSet(new long[]{0x004980420C800000L});
        public static final BitSet FOLLOW_26_in_ruleGroup2119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText2155 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText2165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleText2211 = new BitSet(new long[]{0x00000000F308A000L});
        public static final BitSet FOLLOW_13_in_ruleText2269 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2290 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2302 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_15_in_ruleText2370 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2391 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2403 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_19_in_ruleText2471 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleText2488 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2505 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_24_in_ruleText2573 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleText2594 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleText2606 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_25_in_ruleText2679 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_28_in_ruleText2759 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_29_in_ruleText2777 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_30_in_ruleText2803 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_31_in_ruleText2832 = new BitSet(new long[]{0x00000001F308A000L});
        public static final BitSet FOLLOW_32_in_ruleText2907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_entryRuleScale2943 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScale2953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleScale2990 = new BitSet(new long[]{0x0000003C0308A000L});
        public static final BitSet FOLLOW_13_in_ruleScale3048 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3069 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3081 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_15_in_ruleScale3149 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3170 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3182 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_19_in_ruleScale3250 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleScale3267 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3284 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_34_in_ruleScale3352 = new BitSet(new long[]{0x0200000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3373 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_35_in_ruleScale3441 = new BitSet(new long[]{0x0200000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3462 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_36_in_ruleScale3530 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3551 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3563 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_37_in_ruleScale3631 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3652 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3664 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_24_in_ruleScale3732 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleScale3753 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleScale3765 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_25_in_ruleScale3838 = new BitSet(new long[]{0x0000003D0308A000L});
        public static final BitSet FOLLOW_32_in_ruleScale3909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate3945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate3955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDate4001 = new BitSet(new long[]{0x00007F800308A000L});
        public static final BitSet FOLLOW_13_in_ruleDate4059 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4080 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4092 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_15_in_ruleDate4160 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4181 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4193 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_19_in_ruleDate4261 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDate4278 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4295 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_39_in_ruleDate4363 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4384 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4396 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_40_in_ruleDate4464 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4485 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4497 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_24_in_ruleDate4565 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleDate4586 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDate4598 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_41_in_ruleDate4673 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_42_in_ruleDate4702 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_43_in_ruleDate4731 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_25_in_ruleDate4819 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_44_in_ruleDate4904 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_45_in_ruleDate4989 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_46_in_ruleDate5074 = new BitSet(new long[]{0x00007F810308A000L});
        public static final BitSet FOLLOW_32_in_ruleDate5145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber5181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber5191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleNumber5237 = new BitSet(new long[]{0x00000E0C0308A000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5295 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5316 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5328 = new BitSet(new long[]{0x00000E0D0308A000L});
        public static final BitSet FOLLOW_15_in_ruleNumber5396 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5417 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5429 = new BitSet(new long[]{0x00000E0D0308A000L});
        public static final BitSet FOLLOW_19_in_ruleNumber5497 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNumber5514 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5531 = new BitSet(new long[]{0x00000E0D0308A000L});
        public static final BitSet FOLLOW_34_in_ruleNumber5599 = new BitSet(new long[]{0x0200000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5620 = new BitSet(new long[]{0x00000E0D0308A000L});
        public static final BitSet FOLLOW_35_in_ruleNumber5688 = new BitSet(new long[]{0x0200000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5709 = new BitSet(new long[]{0x00000E0D0308A000L});
        public static final BitSet FOLLOW_24_in_ruleNumber5777 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleNumber5798 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5810 = new BitSet(new long[]{0x00000E0D0308A000L});
        public static final BitSet FOLLOW_25_in_ruleNumber5883 = new BitSet(new long[]{0x00000E0D0308A000L});
        public static final BitSet FOLLOW_41_in_ruleNumber5970 = new BitSet(new long[]{0x00000E0D0308A000L});
        public static final BitSet FOLLOW_42_in_ruleNumber5999 = new BitSet(new long[]{0x00000E0D0308A000L});
        public static final BitSet FOLLOW_43_in_ruleNumber6028 = new BitSet(new long[]{0x00000E0D0308A000L});
        public static final BitSet FOLLOW_32_in_ruleNumber6102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_entryRuleSingle6138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingle6148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleSingle6185 = new BitSet(new long[]{0x000200000308A000L});
        public static final BitSet FOLLOW_13_in_ruleSingle6243 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle6264 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingle6276 = new BitSet(new long[]{0x000200000309A000L});
        public static final BitSet FOLLOW_15_in_ruleSingle6344 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle6365 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingle6377 = new BitSet(new long[]{0x000200000309A000L});
        public static final BitSet FOLLOW_19_in_ruleSingle6445 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingle6462 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingle6479 = new BitSet(new long[]{0x000200000309A000L});
        public static final BitSet FOLLOW_24_in_ruleSingle6547 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleSingle6568 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingle6580 = new BitSet(new long[]{0x000200000309A000L});
        public static final BitSet FOLLOW_25_in_ruleSingle6653 = new BitSet(new long[]{0x000200000309A000L});
        public static final BitSet FOLLOW_49_in_ruleSingle6738 = new BitSet(new long[]{0x000200000309A000L});
        public static final BitSet FOLLOW_16_in_ruleSingle6809 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingle6830 = new BitSet(new long[]{0x0004000000240000L});
        public static final BitSet FOLLOW_50_in_ruleSingle6843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple6879 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiple6889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleMultiple6926 = new BitSet(new long[]{0x00120E0C0300A000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple6984 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple7005 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple7017 = new BitSet(new long[]{0x00120E0C0301A000L});
        public static final BitSet FOLLOW_15_in_ruleMultiple7085 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple7106 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple7118 = new BitSet(new long[]{0x00120E0C0301A000L});
        public static final BitSet FOLLOW_52_in_ruleMultiple7186 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultiple7203 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple7220 = new BitSet(new long[]{0x00120E0C0301A000L});
        public static final BitSet FOLLOW_34_in_ruleMultiple7288 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultiple7305 = new BitSet(new long[]{0x00120E0C0301A000L});
        public static final BitSet FOLLOW_35_in_ruleMultiple7378 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultiple7395 = new BitSet(new long[]{0x00120E0C0301A000L});
        public static final BitSet FOLLOW_24_in_ruleMultiple7468 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleMultiple7489 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple7501 = new BitSet(new long[]{0x00120E0C0301A000L});
        public static final BitSet FOLLOW_25_in_ruleMultiple7574 = new BitSet(new long[]{0x00120E0C0301A000L});
        public static final BitSet FOLLOW_49_in_ruleMultiple7659 = new BitSet(new long[]{0x00120E0C0301A000L});
        public static final BitSet FOLLOW_41_in_ruleMultiple7746 = new BitSet(new long[]{0x00120E0C0301A000L});
        public static final BitSet FOLLOW_42_in_ruleMultiple7775 = new BitSet(new long[]{0x00120E0C0301A000L});
        public static final BitSet FOLLOW_43_in_ruleMultiple7804 = new BitSet(new long[]{0x00120E0C0301A000L});
        public static final BitSet FOLLOW_16_in_ruleMultiple7878 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultiple7899 = new BitSet(new long[]{0x0020000000240000L});
        public static final BitSet FOLLOW_53_in_ruleMultiple7912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable7948 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable7958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTable7995 = new BitSet(new long[]{0x008200000309A000L});
        public static final BitSet FOLLOW_13_in_ruleTable8053 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable8074 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable8086 = new BitSet(new long[]{0x008200000309A000L});
        public static final BitSet FOLLOW_15_in_ruleTable8154 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable8175 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable8187 = new BitSet(new long[]{0x008200000309A000L});
        public static final BitSet FOLLOW_19_in_ruleTable8255 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTable8272 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable8289 = new BitSet(new long[]{0x008200000309A000L});
        public static final BitSet FOLLOW_24_in_ruleTable8357 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_ruleTable8378 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable8390 = new BitSet(new long[]{0x008200000309A000L});
        public static final BitSet FOLLOW_25_in_ruleTable8463 = new BitSet(new long[]{0x008200000309A000L});
        public static final BitSet FOLLOW_49_in_ruleTable8548 = new BitSet(new long[]{0x008200000309A000L});
        public static final BitSet FOLLOW_55_in_ruleTable8633 = new BitSet(new long[]{0x008200000309A000L});
        public static final BitSet FOLLOW_16_in_ruleTable8698 = new BitSet(new long[]{0x0400000000240000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable8764 = new BitSet(new long[]{0x0500000000240000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable8840 = new BitSet(new long[]{0x0500000000240000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable8909 = new BitSet(new long[]{0x0500000000240000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable8936 = new BitSet(new long[]{0x0500000000240000L});
        public static final BitSet FOLLOW_56_in_ruleTable8950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt8987 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt8998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleEInt9037 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt9054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef9099 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplateRef9109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAnswerTemplateRef9146 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnswerTemplateRef9158 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplateRef9178 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAnswerTemplateRef9190 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleAnswerTemplateRef9202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion9238 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion9248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTableQuestion9285 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTableQuestion9306 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_ruleTableQuestion9318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDEP_ID_in_entryRuleDEP_ID9355 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDEP_ID9366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDEP_ID9406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleDEP_ID9432 = new BitSet(new long[]{0x0000000000000002L});
    }


}