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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_QUOTED_ID", "RULE_FQN", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<survey'", "'title'", "'='", "'description'", "'>'", "'</survey>'", "'<template'", "'id'", "'</template>'", "'<a'", "'</a>'", "'<group'", "'dependsOn'", "'required'", "'</group>'", "'<text'", "'singleline'", "'single'", "'multi'", "'multiline'", "'/>'", "'<scale'", "'lower'", "'upper'", "'lowerLabel'", "'upperLabel'", "'<date'", "'from'", "'to'", "'showLimits'", "'day'", "'month'", "'year'", "'<number'", "'<single'", "'other'", "'</single>'", "'<multiple'", "'</multiple>'", "'<table'", "'multiple'", "'</table>'", "'-'", "'<q>'", "'</q>'"
    };
    public static final int RULE_ID=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
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
    public static final int RULE_STRING=4;
    public static final int T__32=32;
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:76:1: ruleSurvey returns [EObject current=null] : ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_items_10_0 = null;

        EObject lv_templates_11_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:79:28: ( ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:86:2: (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:86:4: otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>'
                    {
                    otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey132); 

                        	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getSurveyKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:90:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )* ) ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:92:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )* ) )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:92:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )* ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:93:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:96:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )* )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )*
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( LA1_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0) ) {
                            alt1=1;
                        }
                        else if ( LA1_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:105: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:101:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey190); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSurveyAccess().getTitleKeyword_1_1_0_0());
                    	        
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSurvey202); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSurveyAccess().getEqualsSignKeyword_1_1_0_1());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:112:1: ( (lv_title_5_0= ruleQuotedString ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:113:1: (lv_title_5_0= ruleQuotedString )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:113:1: (lv_title_5_0= ruleQuotedString )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:114:3: lv_title_5_0= ruleQuotedString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getTitleQuotedStringParserRuleCall_1_1_0_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleSurvey223);
                    	    lv_title_5_0=ruleQuotedString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"title",
                    	            		lv_title_5_0, 
                    	            		"QuotedString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:137:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:137:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:105: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:139:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSurvey291); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getDescriptionKeyword_1_1_1_0());
                    	        
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSurvey303); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getSurveyAccess().getEqualsSignKeyword_1_1_1_1());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:150:1: ( (lv_description_8_0= ruleQuotedString ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:151:1: (lv_description_8_0= ruleQuotedString )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:151:1: (lv_description_8_0= ruleQuotedString )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:152:3: lv_description_8_0= ruleQuotedString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getDescriptionQuotedStringParserRuleCall_1_1_1_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleSurvey324);
                    	    lv_description_8_0=ruleQuotedString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"description",
                    	            		lv_description_8_0, 
                    	            		"QuotedString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


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

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSurvey377); 

                        	newLeafNode(otherlv_9, grammarAccess.getSurveyAccess().getGreaterThanSignKeyword_1_2());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:186:1: ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==24||LA2_0==28||LA2_0==34||LA2_0==39||(LA2_0>=46 && LA2_0<=47)||LA2_0==50||LA2_0==52) ) {
                            alt2=1;
                        }
                        else if ( (LA2_0==19) ) {
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

                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSurvey440); 

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


    // $ANTLR start "entryRuleItem"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:235:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:236:2: (iv_ruleItem= ruleItem EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:237:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_entryRuleItem478);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItem488); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:244:1: ruleItem returns [EObject current=null] : (this_Group_0= ruleGroup | this_Text_1= ruleText | this_Scale_2= ruleScale | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Single_5= ruleSingle | this_Multiple_6= ruleMultiple | this_Table_7= ruleTable ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:247:28: ( (this_Group_0= ruleGroup | this_Text_1= ruleText | this_Scale_2= ruleScale | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Single_5= ruleSingle | this_Multiple_6= ruleMultiple | this_Table_7= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:248:1: (this_Group_0= ruleGroup | this_Text_1= ruleText | this_Scale_2= ruleScale | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Single_5= ruleSingle | this_Multiple_6= ruleMultiple | this_Table_7= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:248:1: (this_Group_0= ruleGroup | this_Text_1= ruleText | this_Scale_2= ruleScale | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Single_5= ruleSingle | this_Multiple_6= ruleMultiple | this_Table_7= ruleTable )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case 39:
                {
                alt4=4;
                }
                break;
            case 46:
                {
                alt4=5;
                }
                break;
            case 47:
                {
                alt4=6;
                }
                break;
            case 50:
                {
                alt4=7;
                }
                break;
            case 52:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:249:5: this_Group_0= ruleGroup
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getGroupParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleItem535);
                    this_Group_0=ruleGroup();

                    state._fsp--;

                     
                            current = this_Group_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:259:5: this_Text_1= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getTextParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleItem562);
                    this_Text_1=ruleText();

                    state._fsp--;

                     
                            current = this_Text_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:269:5: this_Scale_2= ruleScale
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getScaleParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleItem589);
                    this_Scale_2=ruleScale();

                    state._fsp--;

                     
                            current = this_Scale_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:279:5: this_Date_3= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getDateParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleItem616);
                    this_Date_3=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:289:5: this_Number_4= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getNumberParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleItem643);
                    this_Number_4=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:299:5: this_Single_5= ruleSingle
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getSingleParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleItem670);
                    this_Single_5=ruleSingle();

                    state._fsp--;

                     
                            current = this_Single_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:309:5: this_Multiple_6= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getMultipleParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleItem697);
                    this_Multiple_6=ruleMultiple();

                    state._fsp--;

                     
                            current = this_Multiple_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:319:5: this_Table_7= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getTableParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleItem724);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:335:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:336:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:337:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion759);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion769); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:344:1: ruleQuestion returns [EObject current=null] : (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:347:28: ( (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:348:1: (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:348:1: (this_Text_0= ruleText | this_Scale_1= ruleScale | this_Date_2= ruleDate | this_Number_3= ruleNumber | this_Single_4= ruleSingle | this_Multiple_5= ruleMultiple | this_Table_6= ruleTable )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 34:
                {
                alt5=2;
                }
                break;
            case 39:
                {
                alt5=3;
                }
                break;
            case 46:
                {
                alt5=4;
                }
                break;
            case 47:
                {
                alt5=5;
                }
                break;
            case 50:
                {
                alt5=6;
                }
                break;
            case 52:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:349:5: this_Text_0= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTextParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleQuestion816);
                    this_Text_0=ruleText();

                    state._fsp--;

                     
                            current = this_Text_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:359:5: this_Scale_1= ruleScale
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getScaleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleQuestion843);
                    this_Scale_1=ruleScale();

                    state._fsp--;

                     
                            current = this_Scale_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:369:5: this_Date_2= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getDateParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleQuestion870);
                    this_Date_2=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:379:5: this_Number_3= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getNumberParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleQuestion897);
                    this_Number_3=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:389:5: this_Single_4= ruleSingle
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSingleParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleQuestion924);
                    this_Single_4=ruleSingle();

                    state._fsp--;

                     
                            current = this_Single_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:399:5: this_Multiple_5= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleQuestion951);
                    this_Multiple_5=ruleMultiple();

                    state._fsp--;

                     
                            current = this_Multiple_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:409:5: this_Table_6= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTableParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleQuestion978);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:425:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:426:2: (iv_ruleOption= ruleOption EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:427:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption1013);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption1023); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:434:1: ruleOption returns [EObject current=null] : (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_AnswerTemplateRef_0 = null;

        EObject this_Answer_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:437:28: ( (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:438:1: (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:438:1: (this_AnswerTemplateRef_0= ruleAnswerTemplateRef | this_Answer_1= ruleAnswer )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:439:5: this_AnswerTemplateRef_0= ruleAnswerTemplateRef
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerTemplateRefParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_ruleOption1070);
                    this_AnswerTemplateRef_0=ruleAnswerTemplateRef();

                    state._fsp--;

                     
                            current = this_AnswerTemplateRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:449:5: this_Answer_1= ruleAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleOption1097);
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


    // $ANTLR start "entryRuleQuotedString"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:465:1: entryRuleQuotedString returns [String current=null] : iv_ruleQuotedString= ruleQuotedString EOF ;
    public final String entryRuleQuotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuotedString = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:466:2: (iv_ruleQuotedString= ruleQuotedString EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:467:2: iv_ruleQuotedString= ruleQuotedString EOF
            {
             newCompositeNode(grammarAccess.getQuotedStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_entryRuleQuotedString1133);
            iv_ruleQuotedString=ruleQuotedString();

            state._fsp--;

             current =iv_ruleQuotedString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedString1144); 

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
    // $ANTLR end "entryRuleQuotedString"


    // $ANTLR start "ruleQuotedString"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:474:1: ruleQuotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_QUOTED_ID_1= RULE_QUOTED_ID ) ;
    public final AntlrDatatypeRuleToken ruleQuotedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_QUOTED_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:477:28: ( (this_STRING_0= RULE_STRING | this_QUOTED_ID_1= RULE_QUOTED_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:478:1: (this_STRING_0= RULE_STRING | this_QUOTED_ID_1= RULE_QUOTED_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:478:1: (this_STRING_0= RULE_STRING | this_QUOTED_ID_1= RULE_QUOTED_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_QUOTED_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:478:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedString1184); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getQuotedStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:486:10: this_QUOTED_ID_1= RULE_QUOTED_ID
                    {
                    this_QUOTED_ID_1=(Token)match(input,RULE_QUOTED_ID,FollowSets000.FOLLOW_RULE_QUOTED_ID_in_ruleQuotedString1210); 

                    		current.merge(this_QUOTED_ID_1);
                        
                     
                        newLeafNode(this_QUOTED_ID_1, grammarAccess.getQuotedStringAccess().getQUOTED_IDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleQuotedString"


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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:510:1: ruleAnswerTemplate returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_QUOTED_ID ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) ;
    public final EObject ruleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_answers_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:513:28: ( (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_QUOTED_ID ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_QUOTED_ID ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_QUOTED_ID ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:3: otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_QUOTED_ID ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswerTemplate1302); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswerTemplate1314); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateAccess().getIdKeyword_1());
                
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnswerTemplate1326); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateAccess().getEqualsSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:526:1: ( (lv_name_3_0= RULE_QUOTED_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:527:1: (lv_name_3_0= RULE_QUOTED_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:527:1: (lv_name_3_0= RULE_QUOTED_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:528:3: lv_name_3_0= RULE_QUOTED_ID
            {
            lv_name_3_0=(Token)match(input,RULE_QUOTED_ID,FollowSets000.FOLLOW_RULE_QUOTED_ID_in_ruleAnswerTemplate1343); 

            			newLeafNode(lv_name_3_0, grammarAccess.getAnswerTemplateAccess().getNameQUOTED_IDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"QUOTED_ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswerTemplate1360); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerTemplateAccess().getGreaterThanSignKeyword_4());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:548:1: ( (lv_answers_5_0= ruleAnswer ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
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

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswerTemplate1394); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:587:1: ruleAnswer returns [EObject current=null] : (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_QUOTED_ID ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleQuotedString ) ) otherlv_6= '</a>' ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_label_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:590:28: ( (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_QUOTED_ID ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleQuotedString ) ) otherlv_6= '</a>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:591:1: (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_QUOTED_ID ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleQuotedString ) ) otherlv_6= '</a>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:591:1: (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_QUOTED_ID ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleQuotedString ) ) otherlv_6= '</a>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:591:3: otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_QUOTED_ID ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleQuotedString ) ) otherlv_6= '</a>'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnswer1477); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:595:1: (otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_QUOTED_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:595:3: otherlv_1= 'id' otherlv_2= '=' ( (lv_name_3_0= RULE_QUOTED_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswer1490); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getIdKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnswer1502); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getEqualsSignKeyword_1_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:603:1: ( (lv_name_3_0= RULE_QUOTED_ID ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:604:1: (lv_name_3_0= RULE_QUOTED_ID )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:604:1: (lv_name_3_0= RULE_QUOTED_ID )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:605:3: lv_name_3_0= RULE_QUOTED_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_QUOTED_ID,FollowSets000.FOLLOW_RULE_QUOTED_ID_in_ruleAnswer1519); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getAnswerAccess().getNameQUOTED_IDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"QUOTED_ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswer1538); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:625:1: ( (lv_label_5_0= ruleQuotedString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:626:1: (lv_label_5_0= ruleQuotedString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:626:1: (lv_label_5_0= ruleQuotedString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:627:3: lv_label_5_0= ruleQuotedString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getLabelQuotedStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleAnswer1559);
            lv_label_5_0=ruleQuotedString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"label",
                    		lv_label_5_0, 
                    		"QuotedString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnswer1571); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:664:1: ruleGroup returns [EObject current=null] : (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_required_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_questions_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:667:28: ( (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:668:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:668:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:668:3: otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGroup1654); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:672:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:674:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:674:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:675:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:678:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:679:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:679:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )*
            loop10:
            do {
                int alt10=5;
                int LA10_0 = input.LA(1);

                if ( LA10_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
                    alt10=4;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:681:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:681:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:682:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:682:102: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:683:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1712); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup1724); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:694:1: ( (lv_title_4_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:695:1: (lv_title_4_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:695:1: (lv_title_4_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:696:3: lv_title_4_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getTitleQuotedStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleGroup1745);
            	    lv_title_4_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:719:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:719:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:720:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:720:102: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:721:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:724:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:724:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:724:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:724:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGroup1813); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup1825); 

            	        	newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:732:1: ( (lv_description_7_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:733:1: (lv_description_7_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:733:1: (lv_description_7_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:734:3: lv_description_7_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getDescriptionQuotedStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleGroup1846);
            	    lv_description_7_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:757:4: ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:757:4: ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:758:5: {...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:758:102: ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:759:6: ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:762:6: ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:762:7: {...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:762:16: (otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:762:18: otherlv_8= 'dependsOn' otherlv_9= '=' ( (otherlv_10= RULE_FQN ) )
            	    {
            	    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGroup1914); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getDependsOnKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup1926); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:770:1: ( (otherlv_10= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:771:1: (otherlv_10= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:771:1: (otherlv_10= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:772:3: otherlv_10= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupRule());
            	    	        }
            	            
            	    otherlv_10=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleGroup1946); 

            	    		newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getDependsOnAnswerCrossReference_1_2_2_0()); 
            	    	

            	    }


            	    }


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
            	    lv_required_11_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleGroup2019); 

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

            otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGroup2084); 

                	newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:828:1: ( (lv_questions_13_0= ruleQuestion ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28||LA11_0==34||LA11_0==39||(LA11_0>=46 && LA11_0<=47)||LA11_0==50||LA11_0==52) ) {
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

            otherlv_14=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleGroup2118); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:867:1: ruleText returns [EObject current=null] : ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_required_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_multiline_18_1=null;
        Token lv_multiline_18_2=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:870:28: ( ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:871:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:871:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:871:2: () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:871:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:872:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleText2210); 

                	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:881:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:883:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:883:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:884:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:887:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:888:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:888:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=7;
                int LA14_0 = input.LA(1);

                if ( LA14_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
                    alt14=4;
                }
                else if ( LA14_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
                    alt14=5;
                }
                else if ( LA14_0 >=29 && LA14_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
                    alt14=6;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:890:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:890:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:101: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:895:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:895:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:895:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:895:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2268); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTextAccess().getTitleKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleText2280); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTextAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:903:1: ( (lv_title_5_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:904:1: (lv_title_5_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:904:1: (lv_title_5_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:905:3: lv_title_5_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getTitleQuotedStringParserRuleCall_2_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleText2301);
            	    lv_title_5_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_5_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:928:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:928:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:929:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:929:101: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:930:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:933:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:933:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:933:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:933:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleText2369); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getDescriptionKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleText2381); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTextAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:941:1: ( (lv_description_8_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:942:1: (lv_description_8_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:942:1: (lv_description_8_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:943:3: lv_description_8_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getDescriptionQuotedStringParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleText2402);
            	    lv_description_8_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_8_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:966:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:966:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:967:5: {...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:967:101: ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:968:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:971:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:971:7: {...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:971:16: (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:971:18: otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleText2470); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTextAccess().getIdKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleText2482); 

            	        	newLeafNode(otherlv_10, grammarAccess.getTextAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:979:1: ( (lv_name_11_0= RULE_QUOTED_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:980:1: (lv_name_11_0= RULE_QUOTED_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:980:1: (lv_name_11_0= RULE_QUOTED_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:981:3: lv_name_11_0= RULE_QUOTED_ID
            	    {
            	    lv_name_11_0=(Token)match(input,RULE_QUOTED_ID,FollowSets000.FOLLOW_RULE_QUOTED_ID_in_ruleText2499); 

            	    			newLeafNode(lv_name_11_0, grammarAccess.getTextAccess().getNameQUOTED_IDTerminalRuleCall_2_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTextRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_11_0, 
            	            		"QUOTED_ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1004:4: ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1004:4: ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1005:5: {...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1005:101: ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1006:6: ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1009:6: ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1009:7: {...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1009:16: (otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1009:18: otherlv_12= 'dependsOn' otherlv_13= '=' ( (otherlv_14= RULE_FQN ) )
            	    {
            	    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleText2572); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTextAccess().getDependsOnKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleText2584); 

            	        	newLeafNode(otherlv_13, grammarAccess.getTextAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1017:1: ( (otherlv_14= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1018:1: (otherlv_14= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1018:1: (otherlv_14= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1019:3: otherlv_14= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTextRule());
            	    	        }
            	            
            	    otherlv_14=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleText2604); 

            	    		newLeafNode(otherlv_14, grammarAccess.getTextAccess().getDependsOnAnswerCrossReference_2_3_2_0()); 
            	    	

            	    }


            	    }


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
            	    lv_required_15_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleText2677); 

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
            	    case 29:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 31:
            	    case 32:
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
            	            otherlv_16=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleText2757); 

            	                	newLeafNode(otherlv_16, grammarAccess.getTextAccess().getSinglelineKeyword_2_5_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1074:7: otherlv_17= 'single'
            	            {
            	            otherlv_17=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleText2775); 

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

            	            if ( (LA12_0==31) ) {
            	                alt12=1;
            	            }
            	            else if ( (LA12_0==32) ) {
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
            	                    lv_multiline_18_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleText2801); 

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
            	                    lv_multiline_18_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleText2830); 

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

            otherlv_19=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleText2905); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1145:1: ruleScale returns [EObject current=null] : (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) ;
    public final EObject ruleScale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
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
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_required_26_0=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_lower_13_0 = null;

        AntlrDatatypeRuleToken lv_upper_16_0 = null;

        AntlrDatatypeRuleToken lv_lowerLabel_19_0 = null;

        AntlrDatatypeRuleToken lv_upperLabel_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1148:28: ( (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1149:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1149:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1149:3: otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleScale2988); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1153:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1155:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1155:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1156:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1159:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1160:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1160:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=10;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1162:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1162:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1163:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1163:102: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1164:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1167:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1167:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1167:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1167:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3046); 

            	        	newLeafNode(otherlv_2, grammarAccess.getScaleAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3058); 

            	        	newLeafNode(otherlv_3, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1175:1: ( (lv_title_4_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1176:1: (lv_title_4_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1176:1: (lv_title_4_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1177:3: lv_title_4_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getTitleQuotedStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleScale3079);
            	    lv_title_4_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"QuotedString");
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
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1200:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1200:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1201:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1201:102: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1202:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1205:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1205:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1205:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1205:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleScale3147); 

            	        	newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3159); 

            	        	newLeafNode(otherlv_6, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1213:1: ( (lv_description_7_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1214:1: (lv_description_7_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1214:1: (lv_description_7_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1215:3: lv_description_7_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getDescriptionQuotedStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleScale3180);
            	    lv_description_7_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"QuotedString");
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
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1238:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1238:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1239:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1239:102: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1240:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1243:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1243:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1243:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1243:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleScale3248); 

            	        	newLeafNode(otherlv_8, grammarAccess.getScaleAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3260); 

            	        	newLeafNode(otherlv_9, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1251:1: ( (lv_name_10_0= RULE_QUOTED_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1252:1: (lv_name_10_0= RULE_QUOTED_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1252:1: (lv_name_10_0= RULE_QUOTED_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1253:3: lv_name_10_0= RULE_QUOTED_ID
            	    {
            	    lv_name_10_0=(Token)match(input,RULE_QUOTED_ID,FollowSets000.FOLLOW_RULE_QUOTED_ID_in_ruleScale3277); 

            	    			newLeafNode(lv_name_10_0, grammarAccess.getScaleAccess().getNameQUOTED_IDTerminalRuleCall_1_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScaleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_10_0, 
            	            		"QUOTED_ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1276:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1276:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1277:5: {...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1277:102: ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1278:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1281:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1281:7: {...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1281:16: (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1281:18: otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) )
            	    {
            	    otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleScale3350); 

            	        	newLeafNode(otherlv_11, grammarAccess.getScaleAccess().getLowerKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3362); 

            	        	newLeafNode(otherlv_12, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1289:1: ( (lv_lower_13_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1290:1: (lv_lower_13_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1290:1: (lv_lower_13_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1291:3: lv_lower_13_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getLowerEIntParserRuleCall_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3383);
            	    lv_lower_13_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1314:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1314:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1315:5: {...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1315:102: ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1316:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1319:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1319:7: {...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1319:16: (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1319:18: otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) )
            	    {
            	    otherlv_14=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleScale3451); 

            	        	newLeafNode(otherlv_14, grammarAccess.getScaleAccess().getUpperKeyword_1_4_0());
            	        
            	    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3463); 

            	        	newLeafNode(otherlv_15, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1327:1: ( (lv_upper_16_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1328:1: (lv_upper_16_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1328:1: (lv_upper_16_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1329:3: lv_upper_16_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getUpperEIntParserRuleCall_1_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3484);
            	    lv_upper_16_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"upper",
            	            		lv_upper_16_0, 
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1352:4: ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1352:4: ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1353:5: {...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1353:102: ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1354:6: ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1357:6: ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1357:7: {...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1357:16: (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1357:18: otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) )
            	    {
            	    otherlv_17=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleScale3552); 

            	        	newLeafNode(otherlv_17, grammarAccess.getScaleAccess().getLowerLabelKeyword_1_5_0());
            	        
            	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3564); 

            	        	newLeafNode(otherlv_18, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_5_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1365:1: ( (lv_lowerLabel_19_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1366:1: (lv_lowerLabel_19_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1366:1: (lv_lowerLabel_19_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1367:3: lv_lowerLabel_19_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getLowerLabelQuotedStringParserRuleCall_1_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleScale3585);
            	    lv_lowerLabel_19_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"lowerLabel",
            	            		lv_lowerLabel_19_0, 
            	            		"QuotedString");
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
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1390:4: ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1390:4: ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1391:5: {...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1391:102: ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1392:6: ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1395:6: ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1395:7: {...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1395:16: (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1395:18: otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) )
            	    {
            	    otherlv_20=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleScale3653); 

            	        	newLeafNode(otherlv_20, grammarAccess.getScaleAccess().getUpperLabelKeyword_1_6_0());
            	        
            	    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3665); 

            	        	newLeafNode(otherlv_21, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_6_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1403:1: ( (lv_upperLabel_22_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1404:1: (lv_upperLabel_22_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1404:1: (lv_upperLabel_22_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1405:3: lv_upperLabel_22_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getUpperLabelQuotedStringParserRuleCall_1_6_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleScale3686);
            	    lv_upperLabel_22_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"upperLabel",
            	            		lv_upperLabel_22_0, 
            	            		"QuotedString");
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
            	case 8 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1428:4: ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1428:4: ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1429:5: {...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1429:102: ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1430:6: ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1433:6: ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1433:7: {...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1433:16: (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1433:18: otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) )
            	    {
            	    otherlv_23=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleScale3754); 

            	        	newLeafNode(otherlv_23, grammarAccess.getScaleAccess().getDependsOnKeyword_1_7_0());
            	        
            	    otherlv_24=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleScale3766); 

            	        	newLeafNode(otherlv_24, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_7_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1441:1: ( (otherlv_25= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1442:1: (otherlv_25= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1442:1: (otherlv_25= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1443:3: otherlv_25= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScaleRule());
            	    	        }
            	            
            	    otherlv_25=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleScale3786); 

            	    		newLeafNode(otherlv_25, grammarAccess.getScaleAccess().getDependsOnAnswerCrossReference_1_7_2_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1461:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1461:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1462:5: {...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1462:102: ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1463:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1466:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1466:7: {...}? => ( (lv_required_26_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1466:16: ( (lv_required_26_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1467:1: (lv_required_26_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1467:1: (lv_required_26_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1468:3: lv_required_26_0= 'required'
            	    {
            	    lv_required_26_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleScale3859); 

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

            otherlv_27=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleScale3930); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1508:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1509:2: (iv_ruleDate= ruleDate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1510:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate3966);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate3976); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1517:1: ruleDate returns [EObject current=null] : ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_showLimits_21_0=null;
        Token lv_required_22_0=null;
        Token lv_day_23_0=null;
        Token lv_month_24_0=null;
        Token lv_year_25_0=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_from_14_0 = null;

        AntlrDatatypeRuleToken lv_to_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1520:28: ( ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1521:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1521:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1521:2: () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1521:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1522:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDate4022); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1531:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1533:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1533:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1534:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1537:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1538:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1538:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=12;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1540:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1540:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1541:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1541:101: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1542:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1545:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1545:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1545:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1545:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4080); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getTitleKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDate4092); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDateAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1553:1: ( (lv_title_5_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1554:1: (lv_title_5_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1554:1: (lv_title_5_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1555:3: lv_title_5_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getTitleQuotedStringParserRuleCall_2_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleDate4113);
            	    lv_title_5_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_5_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1578:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1578:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1579:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1579:101: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1580:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1583:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1583:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1583:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1583:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDate4181); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getDescriptionKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDate4193); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDateAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1591:1: ( (lv_description_8_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1592:1: (lv_description_8_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1592:1: (lv_description_8_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1593:3: lv_description_8_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getDescriptionQuotedStringParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleDate4214);
            	    lv_description_8_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_8_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1616:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1616:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1617:5: {...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1617:101: ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1618:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1621:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1621:7: {...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1621:16: (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1621:18: otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDate4282); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDateAccess().getIdKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDate4294); 

            	        	newLeafNode(otherlv_10, grammarAccess.getDateAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1629:1: ( (lv_name_11_0= RULE_QUOTED_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1630:1: (lv_name_11_0= RULE_QUOTED_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1630:1: (lv_name_11_0= RULE_QUOTED_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1631:3: lv_name_11_0= RULE_QUOTED_ID
            	    {
            	    lv_name_11_0=(Token)match(input,RULE_QUOTED_ID,FollowSets000.FOLLOW_RULE_QUOTED_ID_in_ruleDate4311); 

            	    			newLeafNode(lv_name_11_0, grammarAccess.getDateAccess().getNameQUOTED_IDTerminalRuleCall_2_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_11_0, 
            	            		"QUOTED_ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1654:4: ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1654:4: ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1655:5: {...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1655:101: ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1656:6: ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1659:6: ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1659:7: {...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1659:16: (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1659:18: otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) )
            	    {
            	    otherlv_12=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDate4384); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDateAccess().getFromKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDate4396); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDateAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1667:1: ( (lv_from_14_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1668:1: (lv_from_14_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1668:1: (lv_from_14_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1669:3: lv_from_14_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getFromQuotedStringParserRuleCall_2_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleDate4417);
            	    lv_from_14_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"from",
            	            		lv_from_14_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1692:4: ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1692:4: ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1693:5: {...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1693:101: ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1694:6: ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1697:6: ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1697:7: {...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1697:16: (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1697:18: otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) )
            	    {
            	    otherlv_15=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDate4485); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDateAccess().getToKeyword_2_4_0());
            	        
            	    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDate4497); 

            	        	newLeafNode(otherlv_16, grammarAccess.getDateAccess().getEqualsSignKeyword_2_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1705:1: ( (lv_to_17_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1706:1: (lv_to_17_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1706:1: (lv_to_17_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1707:3: lv_to_17_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getToQuotedStringParserRuleCall_2_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleDate4518);
            	    lv_to_17_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"to",
            	            		lv_to_17_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1730:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1730:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1731:5: {...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1731:101: ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1732:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1735:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1735:7: {...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1735:16: (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1735:18: otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) )
            	    {
            	    otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDate4586); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDateAccess().getDependsOnKeyword_2_5_0());
            	        
            	    otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDate4598); 

            	        	newLeafNode(otherlv_19, grammarAccess.getDateAccess().getEqualsSignKeyword_2_5_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1743:1: ( (otherlv_20= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1744:1: (otherlv_20= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1744:1: (otherlv_20= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1745:3: otherlv_20= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	            
            	    otherlv_20=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleDate4618); 

            	    		newLeafNode(otherlv_20, grammarAccess.getDateAccess().getDependsOnAnswerCrossReference_2_5_2_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1763:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1763:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1764:5: {...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1764:101: ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1765:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1768:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1768:7: {...}? => ( (lv_showLimits_21_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1768:16: ( (lv_showLimits_21_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1769:1: (lv_showLimits_21_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1769:1: (lv_showLimits_21_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1770:3: lv_showLimits_21_0= 'showLimits'
            	    {
            	    lv_showLimits_21_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDate4691); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1790:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1790:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1791:5: {...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1791:101: ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1792:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1795:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1795:7: {...}? => ( (lv_required_22_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1795:16: ( (lv_required_22_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1796:1: (lv_required_22_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1796:1: (lv_required_22_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1797:3: lv_required_22_0= 'required'
            	    {
            	    lv_required_22_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDate4776); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1817:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1817:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1818:5: {...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1818:101: ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1819:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1822:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1822:7: {...}? => ( (lv_day_23_0= 'day' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1822:16: ( (lv_day_23_0= 'day' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1823:1: (lv_day_23_0= 'day' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1823:1: (lv_day_23_0= 'day' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1824:3: lv_day_23_0= 'day'
            	    {
            	    lv_day_23_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDate4861); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1844:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1844:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1845:5: {...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1845:101: ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1846:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1849:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1849:7: {...}? => ( (lv_month_24_0= 'month' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1849:16: ( (lv_month_24_0= 'month' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1850:1: (lv_month_24_0= 'month' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1850:1: (lv_month_24_0= 'month' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1851:3: lv_month_24_0= 'month'
            	    {
            	    lv_month_24_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDate4946); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1871:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1871:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1872:5: {...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1872:102: ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1873:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1876:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1876:7: {...}? => ( (lv_year_25_0= 'year' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1876:16: ( (lv_year_25_0= 'year' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1877:1: (lv_year_25_0= 'year' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1877:1: (lv_year_25_0= 'year' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1878:3: lv_year_25_0= 'year'
            	    {
            	    lv_year_25_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDate5031); 

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

            otherlv_26=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleDate5102); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1918:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1919:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1920:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber5138);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber5148); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1927:1: ruleNumber returns [EObject current=null] : ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_required_21_0=null;
        Token lv_showLimits_22_0=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_lower_14_0 = null;

        AntlrDatatypeRuleToken lv_upper_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1930:28: ( ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1931:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1931:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1931:2: () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1931:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1932:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberAccess().getNumberAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleNumber5194); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getNumberKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1941:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1943:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1943:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1944:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1948:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1948:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=9;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1950:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1950:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1951:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1951:103: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1952:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1955:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1955:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1955:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1955:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5252); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getTitleKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNumber5264); 

            	        	newLeafNode(otherlv_4, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1963:1: ( (lv_title_5_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1964:1: (lv_title_5_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1964:1: (lv_title_5_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1965:3: lv_title_5_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getTitleQuotedStringParserRuleCall_2_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleNumber5285);
            	    lv_title_5_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_5_0, 
            	            		"QuotedString");
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
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1988:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1988:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1989:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1989:103: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1990:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1993:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1993:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1993:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1993:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNumber5353); 

            	        	newLeafNode(otherlv_6, grammarAccess.getNumberAccess().getDescriptionKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNumber5365); 

            	        	newLeafNode(otherlv_7, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2001:1: ( (lv_description_8_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2002:1: (lv_description_8_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2002:1: (lv_description_8_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2003:3: lv_description_8_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getDescriptionQuotedStringParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleNumber5386);
            	    lv_description_8_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_8_0, 
            	            		"QuotedString");
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
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2026:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2026:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2027:5: {...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2027:103: ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2028:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2031:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2031:7: {...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2031:16: (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2031:18: otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNumber5454); 

            	        	newLeafNode(otherlv_9, grammarAccess.getNumberAccess().getIdKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNumber5466); 

            	        	newLeafNode(otherlv_10, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2039:1: ( (lv_name_11_0= RULE_QUOTED_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2040:1: (lv_name_11_0= RULE_QUOTED_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2040:1: (lv_name_11_0= RULE_QUOTED_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2041:3: lv_name_11_0= RULE_QUOTED_ID
            	    {
            	    lv_name_11_0=(Token)match(input,RULE_QUOTED_ID,FollowSets000.FOLLOW_RULE_QUOTED_ID_in_ruleNumber5483); 

            	    			newLeafNode(lv_name_11_0, grammarAccess.getNumberAccess().getNameQUOTED_IDTerminalRuleCall_2_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNumberRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_11_0, 
            	            		"QUOTED_ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2064:4: ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2064:4: ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2065:5: {...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2065:103: ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2066:6: ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2069:6: ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2069:7: {...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2069:16: (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2069:18: otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) )
            	    {
            	    otherlv_12=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleNumber5556); 

            	        	newLeafNode(otherlv_12, grammarAccess.getNumberAccess().getLowerKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNumber5568); 

            	        	newLeafNode(otherlv_13, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2077:1: ( (lv_lower_14_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2078:1: (lv_lower_14_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2078:1: (lv_lower_14_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2079:3: lv_lower_14_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getLowerEIntParserRuleCall_2_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5589);
            	    lv_lower_14_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"lower",
            	            		lv_lower_14_0, 
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2102:4: ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2102:4: ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2103:5: {...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2103:103: ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2104:6: ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2107:6: ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2107:7: {...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2107:16: (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2107:18: otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) )
            	    {
            	    otherlv_15=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleNumber5657); 

            	        	newLeafNode(otherlv_15, grammarAccess.getNumberAccess().getUpperKeyword_2_4_0());
            	        
            	    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNumber5669); 

            	        	newLeafNode(otherlv_16, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2115:1: ( (lv_upper_17_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2116:1: (lv_upper_17_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2116:1: (lv_upper_17_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2117:3: lv_upper_17_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getUpperEIntParserRuleCall_2_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5690);
            	    lv_upper_17_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"upper",
            	            		lv_upper_17_0, 
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2140:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2140:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2141:5: {...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2141:103: ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2142:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2145:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2145:7: {...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2145:16: (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2145:18: otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) )
            	    {
            	    otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNumber5758); 

            	        	newLeafNode(otherlv_18, grammarAccess.getNumberAccess().getDependsOnKeyword_2_5_0());
            	        
            	    otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNumber5770); 

            	        	newLeafNode(otherlv_19, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_5_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2153:1: ( (otherlv_20= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2154:1: (otherlv_20= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2154:1: (otherlv_20= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2155:3: otherlv_20= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNumberRule());
            	    	        }
            	            
            	    otherlv_20=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleNumber5790); 

            	    		newLeafNode(otherlv_20, grammarAccess.getNumberAccess().getDependsOnAnswerCrossReference_2_5_2_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2173:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2173:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2174:5: {...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2174:103: ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2175:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2178:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2178:7: {...}? => ( (lv_required_21_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2178:16: ( (lv_required_21_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2179:1: (lv_required_21_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2179:1: (lv_required_21_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2180:3: lv_required_21_0= 'required'
            	    {
            	    lv_required_21_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNumber5863); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2200:4: ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2200:4: ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2201:5: {...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2201:103: ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2202:6: ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2205:6: ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2205:7: {...}? => ( (lv_showLimits_22_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2205:16: ( (lv_showLimits_22_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2206:1: (lv_showLimits_22_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2206:1: (lv_showLimits_22_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2207:3: lv_showLimits_22_0= 'showLimits'
            	    {
            	    lv_showLimits_22_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNumber5948); 

            	            newLeafNode(lv_showLimits_22_0, grammarAccess.getNumberAccess().getShowLimitsShowLimitsKeyword_2_7_0());
            	        

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

            otherlv_23=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleNumber6019); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2247:1: entryRuleSingle returns [EObject current=null] : iv_ruleSingle= ruleSingle EOF ;
    public final EObject entryRuleSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingle = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2248:2: (iv_ruleSingle= ruleSingle EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2249:2: iv_ruleSingle= ruleSingle EOF
            {
             newCompositeNode(grammarAccess.getSingleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingle_in_entryRuleSingle6055);
            iv_ruleSingle=ruleSingle();

            state._fsp--;

             current =iv_ruleSingle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingle6065); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2256:1: ruleSingle returns [EObject current=null] : (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' ) ;
    public final EObject ruleSingle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_required_14_0=null;
        Token lv_other_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_options_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2259:28: ( (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2260:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2260:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2260:3: otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleSingle6102); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2264:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2266:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2266:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2267:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2270:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2271:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2271:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=7;
                int LA18_0 = input.LA(1);

                if ( LA18_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2) ) {
                    alt18=3;
                }
                else if ( LA18_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3) ) {
                    alt18=4;
                }
                else if ( LA18_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4) ) {
                    alt18=5;
                }
                else if ( LA18_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5) ) {
                    alt18=6;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2273:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2273:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2274:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2274:103: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2275:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2278:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2278:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2278:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2278:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle6160); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSingleAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingle6172); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2286:1: ( (lv_title_4_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2287:1: (lv_title_4_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2287:1: (lv_title_4_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2288:3: lv_title_4_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getTitleQuotedStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleSingle6193);
            	    lv_title_4_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2311:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2311:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2312:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2312:103: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2313:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2316:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2316:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2316:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2316:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSingle6261); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSingleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingle6273); 

            	        	newLeafNode(otherlv_6, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2324:1: ( (lv_description_7_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2325:1: (lv_description_7_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2325:1: (lv_description_7_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2326:3: lv_description_7_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getDescriptionQuotedStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleSingle6294);
            	    lv_description_7_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2349:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2349:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2350:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2350:103: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2351:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2354:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2354:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2354:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2354:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSingle6362); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSingleAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingle6374); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2362:1: ( (lv_name_10_0= RULE_QUOTED_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2363:1: (lv_name_10_0= RULE_QUOTED_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2363:1: (lv_name_10_0= RULE_QUOTED_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2364:3: lv_name_10_0= RULE_QUOTED_ID
            	    {
            	    lv_name_10_0=(Token)match(input,RULE_QUOTED_ID,FollowSets000.FOLLOW_RULE_QUOTED_ID_in_ruleSingle6391); 

            	    			newLeafNode(lv_name_10_0, grammarAccess.getSingleAccess().getNameQUOTED_IDTerminalRuleCall_1_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_10_0, 
            	            		"QUOTED_ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2387:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2387:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2388:5: {...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2388:103: ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2389:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2392:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2392:7: {...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2392:16: (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2392:18: otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) )
            	    {
            	    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingle6464); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSingleAccess().getDependsOnKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingle6476); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2400:1: ( (otherlv_13= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2401:1: (otherlv_13= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2401:1: (otherlv_13= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2402:3: otherlv_13= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	            
            	    otherlv_13=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleSingle6496); 

            	    		newLeafNode(otherlv_13, grammarAccess.getSingleAccess().getDependsOnAnswerCrossReference_1_3_2_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2420:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2420:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2421:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2421:103: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2422:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2425:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2425:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2425:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2426:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2426:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2427:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingle6569); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2447:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2447:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2448:5: {...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2448:103: ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2449:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2452:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2452:7: {...}? => ( (lv_other_15_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2452:16: ( (lv_other_15_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2453:1: (lv_other_15_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2453:1: (lv_other_15_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2454:3: lv_other_15_0= 'other'
            	    {
            	    lv_other_15_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleSingle6654); 

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

            otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSingle6725); 

                	newLeafNode(otherlv_16, grammarAccess.getSingleAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2486:1: ( (lv_options_17_0= ruleOption ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19||LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2487:1: (lv_options_17_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2487:1: (lv_options_17_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2488:3: lv_options_17_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingle6746);
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

            otherlv_18=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleSingle6759); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2516:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2517:2: (iv_ruleMultiple= ruleMultiple EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2518:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_entryRuleMultiple6795);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiple6805); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2525:1: ruleMultiple returns [EObject current=null] : (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>' ) ;
    public final EObject ruleMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_lower_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_upper_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_required_19_0=null;
        Token lv_other_20_0=null;
        Token lv_showLimits_21_0=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_options_23_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2528:28: ( (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2529:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2529:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2529:3: otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMultiple6842); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2533:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2535:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2535:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2536:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2539:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2540:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2540:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=10;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2542:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2542:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2543:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2543:105: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2544:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2547:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2547:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2547:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2547:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple6900); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultipleAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultiple6912); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2555:1: ( (lv_title_4_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2556:1: (lv_title_4_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2556:1: (lv_title_4_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2557:3: lv_title_4_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getTitleQuotedStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleMultiple6933);
            	    lv_title_4_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2580:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2580:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2581:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2581:105: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2582:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2585:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2585:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2585:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2585:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultiple7001); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultipleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultiple7013); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2593:1: ( (lv_description_7_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2594:1: (lv_description_7_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2594:1: (lv_description_7_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2595:3: lv_description_7_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getDescriptionQuotedStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleMultiple7034);
            	    lv_description_7_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2618:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2618:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2619:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2619:105: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2620:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2623:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2623:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2623:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2623:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultiple7102); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMultipleAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultiple7114); 

            	        	newLeafNode(otherlv_9, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2631:1: ( (lv_name_10_0= RULE_QUOTED_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2632:1: (lv_name_10_0= RULE_QUOTED_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2632:1: (lv_name_10_0= RULE_QUOTED_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2633:3: lv_name_10_0= RULE_QUOTED_ID
            	    {
            	    lv_name_10_0=(Token)match(input,RULE_QUOTED_ID,FollowSets000.FOLLOW_RULE_QUOTED_ID_in_ruleMultiple7131); 

            	    			newLeafNode(lv_name_10_0, grammarAccess.getMultipleAccess().getNameQUOTED_IDTerminalRuleCall_1_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_10_0, 
            	            		"QUOTED_ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2656:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2656:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2657:5: {...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2657:105: ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2658:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2661:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2661:7: {...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2661:16: (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2661:18: otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) )
            	    {
            	    otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMultiple7204); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMultipleAccess().getLowerKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultiple7216); 

            	        	newLeafNode(otherlv_12, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2669:1: ( (lv_lower_13_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2670:1: (lv_lower_13_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2670:1: (lv_lower_13_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2671:3: lv_lower_13_0= RULE_INT
            	    {
            	    lv_lower_13_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultiple7233); 

            	    			newLeafNode(lv_lower_13_0, grammarAccess.getMultipleAccess().getLowerINTTerminalRuleCall_1_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"lower",
            	            		lv_lower_13_0, 
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2694:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2694:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2695:5: {...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2695:105: ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2696:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2699:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2699:7: {...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2699:16: (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2699:18: otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) )
            	    {
            	    otherlv_14=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultiple7306); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMultipleAccess().getUpperKeyword_1_4_0());
            	        
            	    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultiple7318); 

            	        	newLeafNode(otherlv_15, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2707:1: ( (lv_upper_16_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2708:1: (lv_upper_16_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2708:1: (lv_upper_16_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2709:3: lv_upper_16_0= RULE_INT
            	    {
            	    lv_upper_16_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultiple7335); 

            	    			newLeafNode(lv_upper_16_0, grammarAccess.getMultipleAccess().getUpperINTTerminalRuleCall_1_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"upper",
            	            		lv_upper_16_0, 
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2732:4: ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2732:4: ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2733:5: {...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2733:105: ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2734:6: ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2737:6: ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2737:7: {...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2737:16: (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2737:18: otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) )
            	    {
            	    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultiple7408); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMultipleAccess().getDependsOnKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2741:1: ( (otherlv_18= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2742:1: (otherlv_18= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2742:1: (otherlv_18= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2743:3: otherlv_18= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	            
            	    otherlv_18=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleMultiple7428); 

            	    		newLeafNode(otherlv_18, grammarAccess.getMultipleAccess().getDependsOnAnswerCrossReference_1_5_1_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2761:4: ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2761:4: ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2762:5: {...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2762:105: ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2763:6: ({...}? => ( (lv_required_19_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2766:6: ({...}? => ( (lv_required_19_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2766:7: {...}? => ( (lv_required_19_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2766:16: ( (lv_required_19_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2767:1: (lv_required_19_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2767:1: (lv_required_19_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2768:3: lv_required_19_0= 'required'
            	    {
            	    lv_required_19_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultiple7501); 

            	            newLeafNode(lv_required_19_0, grammarAccess.getMultipleAccess().getRequiredRequiredKeyword_1_6_0());
            	        

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2788:4: ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2788:4: ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2789:5: {...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2789:105: ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2790:6: ({...}? => ( (lv_other_20_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2793:6: ({...}? => ( (lv_other_20_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2793:7: {...}? => ( (lv_other_20_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2793:16: ( (lv_other_20_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2794:1: (lv_other_20_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2794:1: (lv_other_20_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2795:3: lv_other_20_0= 'other'
            	    {
            	    lv_other_20_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMultiple7586); 

            	            newLeafNode(lv_other_20_0, grammarAccess.getMultipleAccess().getOtherOtherKeyword_1_7_0());
            	        

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2815:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2815:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2816:5: {...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2816:105: ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2817:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2820:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2820:7: {...}? => ( (lv_showLimits_21_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2820:16: ( (lv_showLimits_21_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2821:1: (lv_showLimits_21_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2821:1: (lv_showLimits_21_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2822:3: lv_showLimits_21_0= 'showLimits'
            	    {
            	    lv_showLimits_21_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMultiple7671); 

            	            newLeafNode(lv_showLimits_21_0, grammarAccess.getMultipleAccess().getShowLimitsShowLimitsKeyword_1_8_0());
            	        

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

            otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultiple7742); 

                	newLeafNode(otherlv_22, grammarAccess.getMultipleAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2854:1: ( (lv_options_23_0= ruleOption ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19||LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2855:1: (lv_options_23_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2855:1: (lv_options_23_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2856:3: lv_options_23_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultiple7763);
            	    lv_options_23_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_23_0, 
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

            otherlv_24=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleMultiple7776); 

                	newLeafNode(otherlv_24, grammarAccess.getMultipleAccess().getMultipleKeyword_4());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2884:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2885:2: (iv_ruleTable= ruleTable EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2886:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable7812);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable7822); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2893:1: ruleTable returns [EObject current=null] : (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_required_14_0=null;
        Token lv_other_15_0=null;
        Token lv_multiple_16_0=null;
        Token otherlv_17=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_options_19_0 = null;

        EObject lv_questions_20_0 = null;

        EObject lv_options_21_0 = null;

        EObject lv_questions_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2896:28: ( (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2897:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2897:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2897:3: otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTable7859); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2901:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2903:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2903:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2904:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2907:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2908:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2908:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )*
            loop22:
            do {
                int alt22=8;
                int LA22_0 = input.LA(1);

                if ( LA22_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
                    alt22=3;
                }
                else if ( LA22_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
                    alt22=4;
                }
                else if ( LA22_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
                    alt22=5;
                }
                else if ( LA22_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
                    alt22=6;
                }
                else if ( LA22_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6) ) {
                    alt22=7;
                }


                switch (alt22) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2910:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2910:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2911:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2911:102: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2912:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2915:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2915:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2915:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2915:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable7917); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable7929); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2923:1: ( (lv_title_4_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2924:1: (lv_title_4_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2924:1: (lv_title_4_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2925:3: lv_title_4_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getTitleQuotedStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleTable7950);
            	    lv_title_4_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2948:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2948:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2949:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2949:102: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2950:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2953:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2953:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2953:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2953:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTable8018); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable8030); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTableAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2961:1: ( (lv_description_7_0= ruleQuotedString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2962:1: (lv_description_7_0= ruleQuotedString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2962:1: (lv_description_7_0= ruleQuotedString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2963:3: lv_description_7_0= ruleQuotedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getDescriptionQuotedStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleTable8051);
            	    lv_description_7_0=ruleQuotedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"QuotedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2986:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2986:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2987:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2987:102: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2988:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2991:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2991:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2991:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2991:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTable8119); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTableAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable8131); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTableAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2999:1: ( (lv_name_10_0= RULE_QUOTED_ID ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3000:1: (lv_name_10_0= RULE_QUOTED_ID )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3000:1: (lv_name_10_0= RULE_QUOTED_ID )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3001:3: lv_name_10_0= RULE_QUOTED_ID
            	    {
            	    lv_name_10_0=(Token)match(input,RULE_QUOTED_ID,FollowSets000.FOLLOW_RULE_QUOTED_ID_in_ruleTable8148); 

            	    			newLeafNode(lv_name_10_0, grammarAccess.getTableAccess().getNameQUOTED_IDTerminalRuleCall_1_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_10_0, 
            	            		"QUOTED_ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3024:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3024:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3025:5: {...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3025:102: ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3026:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3029:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3029:7: {...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3029:16: (otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3029:18: otherlv_11= 'dependsOn' otherlv_12= '=' ( (otherlv_13= RULE_FQN ) )
            	    {
            	    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTable8221); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTableAccess().getDependsOnKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable8233); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTableAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3037:1: ( (otherlv_13= RULE_FQN ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3038:1: (otherlv_13= RULE_FQN )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3038:1: (otherlv_13= RULE_FQN )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3039:3: otherlv_13= RULE_FQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	            
            	    otherlv_13=(Token)match(input,RULE_FQN,FollowSets000.FOLLOW_RULE_FQN_in_ruleTable8253); 

            	    		newLeafNode(otherlv_13, grammarAccess.getTableAccess().getDependsOnAnswerCrossReference_1_3_2_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3057:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3057:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3058:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3058:102: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3059:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3062:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3062:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3062:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3063:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3063:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3064:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTable8326); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3084:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3084:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3085:5: {...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3085:102: ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3086:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3089:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3089:7: {...}? => ( (lv_other_15_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3089:16: ( (lv_other_15_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3090:1: (lv_other_15_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3090:1: (lv_other_15_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3091:3: lv_other_15_0= 'other'
            	    {
            	    lv_other_15_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTable8411); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3111:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3111:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3112:5: {...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3112:102: ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3113:6: ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3116:6: ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3116:7: {...}? => ( (lv_multiple_16_0= 'multiple' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3116:16: ( (lv_multiple_16_0= 'multiple' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3117:1: (lv_multiple_16_0= 'multiple' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3117:1: (lv_multiple_16_0= 'multiple' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3118:3: lv_multiple_16_0= 'multiple'
            	    {
            	    lv_multiple_16_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTable8496); 

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

            otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTable8561); 

                	newLeafNode(otherlv_17, grammarAccess.getTableAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3149:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3151:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3151:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3152:2: ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3155:2: ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3156:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3156:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=3;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3158:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3158:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3159:5: {...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3159:102: ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3160:6: ({...}? => ( (lv_options_19_0= ruleOption ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3163:6: ({...}? => ( (lv_options_19_0= ruleOption ) ) )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==19) ) {
            	            int LA23_1 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	        }
            	        else if ( (LA23_0==22) ) {
            	            int LA23_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3163:7: {...}? => ( (lv_options_19_0= ruleOption ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3163:16: ( (lv_options_19_0= ruleOption ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3164:1: (lv_options_19_0= ruleOption )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3164:1: (lv_options_19_0= ruleOption )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3165:3: lv_options_19_0= ruleOption
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_3_0_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable8627);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3188:4: ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3188:4: ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3189:5: {...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3189:102: ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3190:6: ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3193:6: ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+
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
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3193:7: {...}? => ( (lv_questions_20_0= ruleTableQuestion ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3193:16: ( (lv_questions_20_0= ruleTableQuestion ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3194:1: (lv_questions_20_0= ruleTableQuestion )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3194:1: (lv_questions_20_0= ruleTableQuestion )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3195:3: lv_questions_20_0= ruleTableQuestion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable8703);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3226:2: ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==19||LA26_0==22) ) {
                    alt26=1;
                }
                else if ( (LA26_0==56) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3226:3: ( (lv_options_21_0= ruleOption ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3226:3: ( (lv_options_21_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3227:1: (lv_options_21_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3227:1: (lv_options_21_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3228:3: lv_options_21_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable8772);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3245:6: ( (lv_questions_22_0= ruleTableQuestion ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3245:6: ( (lv_questions_22_0= ruleTableQuestion ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3246:1: (lv_questions_22_0= ruleTableQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3246:1: (lv_questions_22_0= ruleTableQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3247:3: lv_questions_22_0= ruleTableQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable8799);
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

            otherlv_23=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTable8813); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3275:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3276:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3277:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt8850);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt8861); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3284:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3287:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3288:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3288:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3288:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3288:2: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==55) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3289:2: kw= '-'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleEInt8900); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt8917); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3309:1: entryRuleAnswerTemplateRef returns [EObject current=null] : iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF ;
    public final EObject entryRuleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplateRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3310:2: (iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3311:2: iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef8962);
            iv_ruleAnswerTemplateRef=ruleAnswerTemplateRef();

            state._fsp--;

             current =iv_ruleAnswerTemplateRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplateRef8972); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3318:1: ruleAnswerTemplateRef returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (otherlv_3= RULE_QUOTED_ID ) ) otherlv_4= '/>' ) ;
    public final EObject ruleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3321:28: ( (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (otherlv_3= RULE_QUOTED_ID ) ) otherlv_4= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3322:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (otherlv_3= RULE_QUOTED_ID ) ) otherlv_4= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3322:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (otherlv_3= RULE_QUOTED_ID ) ) otherlv_4= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3322:3: otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (otherlv_3= RULE_QUOTED_ID ) ) otherlv_4= '/>'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswerTemplateRef9009); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateRefAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswerTemplateRef9021); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateRefAccess().getIdKeyword_1());
                
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnswerTemplateRef9033); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateRefAccess().getEqualsSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3334:1: ( (otherlv_3= RULE_QUOTED_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3335:1: (otherlv_3= RULE_QUOTED_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3335:1: (otherlv_3= RULE_QUOTED_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3336:3: otherlv_3= RULE_QUOTED_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRefRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_QUOTED_ID,FollowSets000.FOLLOW_RULE_QUOTED_ID_in_ruleAnswerTemplateRef9053); 

            		newLeafNode(otherlv_3, grammarAccess.getAnswerTemplateRefAccess().getTemplateAnswerTemplateCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAnswerTemplateRef9065); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3359:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3360:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3361:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion9101);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion9111); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3368:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= '<q>' ( (lv_title_1_0= ruleQuotedString ) ) otherlv_2= '</q>' ) ;
    public final EObject ruleTableQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3371:28: ( (otherlv_0= '<q>' ( (lv_title_1_0= ruleQuotedString ) ) otherlv_2= '</q>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3372:1: (otherlv_0= '<q>' ( (lv_title_1_0= ruleQuotedString ) ) otherlv_2= '</q>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3372:1: (otherlv_0= '<q>' ( (lv_title_1_0= ruleQuotedString ) ) otherlv_2= '</q>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3372:3: otherlv_0= '<q>' ( (lv_title_1_0= ruleQuotedString ) ) otherlv_2= '</q>'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTableQuestion9148); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3376:1: ( (lv_title_1_0= ruleQuotedString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3377:1: (lv_title_1_0= ruleQuotedString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3377:1: (lv_title_1_0= ruleQuotedString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3378:3: lv_title_1_0= ruleQuotedString
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getTitleQuotedStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuotedString_in_ruleTableQuestion9169);
            lv_title_1_0=ruleQuotedString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"QuotedString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTableQuestion9181); 

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
        "\1\16\12\uffff";
    static final String DFA15_maxS =
        "\1\46\12\uffff";
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
            return "()+ loopback of 1160:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( (otherlv_25= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+";
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
                        if ( (LA15_0==33) ) {s = 1;}

                        else if ( LA15_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA15_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA15_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA15_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA15_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA15_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA15_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA15_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA15_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
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
        "\1\16\14\uffff";
    static final String DFA16_maxS =
        "\1\55\14\uffff";
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
            return "()+ loopback of 1538:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+";
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
                        if ( (LA16_0==33) ) {s = 1;}

                        else if ( LA16_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA16_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA16_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA16_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA16_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA16_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA16_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA16_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA16_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA16_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA16_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                         
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
        "\1\16\11\uffff";
    static final String DFA17_maxS =
        "\1\52\11\uffff";
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
            return "()+ loopback of 1948:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_name_11_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( (otherlv_20= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+";
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
                        if ( (LA17_0==33) ) {s = 1;}

                        else if ( LA17_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA17_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA17_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA17_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA17_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA17_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA17_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA17_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
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
        "\1\16\12\uffff";
    static final String DFA20_maxS =
        "\1\60\12\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA20_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\1\uffff\1\3\1\1\2\uffff\1\4\4\uffff\1\7\1\10\10\uffff\1"+
            "\5\1\6\5\uffff\1\12\5\uffff\1\11",
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
            return "()+ loopback of 2540:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleQuotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_name_10_0= RULE_QUOTED_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( (otherlv_18= RULE_FQN ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+";
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
                        if ( (LA20_0==17) ) {s = 1;}

                        else if ( LA20_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA20_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA20_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA20_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA20_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA20_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA20_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA20_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA20_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
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
        "\1\23\1\24\1\21\1\4\1\uffff\2\17\1\4\2\71\2\5\2\27\1\0\1\41\1\21"+
        "\1\0\1\uffff\1\0\1\uffff";
    static final String DFA25_maxS =
        "\1\70\2\24\1\5\1\uffff\2\17\1\5\2\71\2\5\2\27\1\0\1\41\1\21\1\0"+
        "\1\uffff\1\0\1\uffff";
    static final String DFA25_acceptS =
        "\4\uffff\1\3\15\uffff\1\2\1\uffff\1\1";
    static final String DFA25_specialS =
        "\16\uffff\1\1\2\uffff\1\0\1\uffff\1\2\1\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\2\uffff\1\2\37\uffff\1\4\1\uffff\1\3",
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
            return "()+ loopback of 3156:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+";
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
                        int LA25_14 = input.LA(1);

                         
                        int index25_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index25_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_19 = input.LA(1);

                         
                        int index25_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index25_19);
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
        public static final BitSet FOLLOW_13_in_ruleSurvey132 = new BitSet(new long[]{0x0000000000034000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey190 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSurvey202 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleSurvey223 = new BitSet(new long[]{0x0000000000034000L});
        public static final BitSet FOLLOW_16_in_ruleSurvey291 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSurvey303 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleSurvey324 = new BitSet(new long[]{0x0000000000034000L});
        public static final BitSet FOLLOW_17_in_ruleSurvey377 = new BitSet(new long[]{0x0014C084110C0000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey399 = new BitSet(new long[]{0x0014C084110C0000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey426 = new BitSet(new long[]{0x0014C084110C0000L});
        public static final BitSet FOLLOW_18_in_ruleSurvey440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_entryRuleItem478 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItem488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleItem535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleItem562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleItem589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleItem616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleItem643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleItem670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleItem697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleItem724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion759 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleQuestion816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleQuestion843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleQuestion870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleQuestion897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleQuestion924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleQuestion951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleQuestion978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_ruleOption1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleOption1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuotedString_in_entryRuleQuotedString1133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedString1144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedString1184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_QUOTED_ID_in_ruleQuotedString1210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1255 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplate1265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAnswerTemplate1302 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAnswerTemplate1314 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnswerTemplate1326 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_QUOTED_ID_in_ruleAnswerTemplate1343 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAnswerTemplate1360 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleAnswerTemplate1381 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleAnswerTemplate1394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1430 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAnswer1477 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleAnswer1490 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnswer1502 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_QUOTED_ID_in_ruleAnswer1519 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAnswer1538 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleAnswer1559 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAnswer1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup1617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleGroup1654 = new BitSet(new long[]{0x0000000006034000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1712 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGroup1724 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleGroup1745 = new BitSet(new long[]{0x0000000006034000L});
        public static final BitSet FOLLOW_16_in_ruleGroup1813 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGroup1825 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleGroup1846 = new BitSet(new long[]{0x0000000006034000L});
        public static final BitSet FOLLOW_25_in_ruleGroup1914 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGroup1926 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleGroup1946 = new BitSet(new long[]{0x0000000006034000L});
        public static final BitSet FOLLOW_26_in_ruleGroup2019 = new BitSet(new long[]{0x0000000006034000L});
        public static final BitSet FOLLOW_17_in_ruleGroup2084 = new BitSet(new long[]{0x0014C08411000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup2105 = new BitSet(new long[]{0x0014C08419000000L});
        public static final BitSet FOLLOW_27_in_ruleGroup2118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText2154 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText2164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleText2210 = new BitSet(new long[]{0x00000001E6114000L});
        public static final BitSet FOLLOW_14_in_ruleText2268 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleText2280 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleText2301 = new BitSet(new long[]{0x00000003E6114000L});
        public static final BitSet FOLLOW_16_in_ruleText2369 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleText2381 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleText2402 = new BitSet(new long[]{0x00000003E6114000L});
        public static final BitSet FOLLOW_20_in_ruleText2470 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleText2482 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_QUOTED_ID_in_ruleText2499 = new BitSet(new long[]{0x00000003E6114000L});
        public static final BitSet FOLLOW_25_in_ruleText2572 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleText2584 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleText2604 = new BitSet(new long[]{0x00000003E6114000L});
        public static final BitSet FOLLOW_26_in_ruleText2677 = new BitSet(new long[]{0x00000003E6114000L});
        public static final BitSet FOLLOW_29_in_ruleText2757 = new BitSet(new long[]{0x00000003E6114000L});
        public static final BitSet FOLLOW_30_in_ruleText2775 = new BitSet(new long[]{0x00000003E6114000L});
        public static final BitSet FOLLOW_31_in_ruleText2801 = new BitSet(new long[]{0x00000003E6114000L});
        public static final BitSet FOLLOW_32_in_ruleText2830 = new BitSet(new long[]{0x00000003E6114000L});
        public static final BitSet FOLLOW_33_in_ruleText2905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_entryRuleScale2941 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScale2951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleScale2988 = new BitSet(new long[]{0x0000007806114000L});
        public static final BitSet FOLLOW_14_in_ruleScale3046 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleScale3058 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleScale3079 = new BitSet(new long[]{0x0000007A06114000L});
        public static final BitSet FOLLOW_16_in_ruleScale3147 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleScale3159 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleScale3180 = new BitSet(new long[]{0x0000007A06114000L});
        public static final BitSet FOLLOW_20_in_ruleScale3248 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleScale3260 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_QUOTED_ID_in_ruleScale3277 = new BitSet(new long[]{0x0000007A06114000L});
        public static final BitSet FOLLOW_35_in_ruleScale3350 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleScale3362 = new BitSet(new long[]{0x0080000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3383 = new BitSet(new long[]{0x0000007A06114000L});
        public static final BitSet FOLLOW_36_in_ruleScale3451 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleScale3463 = new BitSet(new long[]{0x0080000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3484 = new BitSet(new long[]{0x0000007A06114000L});
        public static final BitSet FOLLOW_37_in_ruleScale3552 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleScale3564 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleScale3585 = new BitSet(new long[]{0x0000007A06114000L});
        public static final BitSet FOLLOW_38_in_ruleScale3653 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleScale3665 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleScale3686 = new BitSet(new long[]{0x0000007A06114000L});
        public static final BitSet FOLLOW_25_in_ruleScale3754 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleScale3766 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleScale3786 = new BitSet(new long[]{0x0000007A06114000L});
        public static final BitSet FOLLOW_26_in_ruleScale3859 = new BitSet(new long[]{0x0000007A06114000L});
        public static final BitSet FOLLOW_33_in_ruleScale3930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate3966 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate3976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleDate4022 = new BitSet(new long[]{0x00003F0006114000L});
        public static final BitSet FOLLOW_14_in_ruleDate4080 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDate4092 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleDate4113 = new BitSet(new long[]{0x00003F0206114000L});
        public static final BitSet FOLLOW_16_in_ruleDate4181 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDate4193 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleDate4214 = new BitSet(new long[]{0x00003F0206114000L});
        public static final BitSet FOLLOW_20_in_ruleDate4282 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDate4294 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_QUOTED_ID_in_ruleDate4311 = new BitSet(new long[]{0x00003F0206114000L});
        public static final BitSet FOLLOW_40_in_ruleDate4384 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDate4396 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleDate4417 = new BitSet(new long[]{0x00003F0206114000L});
        public static final BitSet FOLLOW_41_in_ruleDate4485 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDate4497 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleDate4518 = new BitSet(new long[]{0x00003F0206114000L});
        public static final BitSet FOLLOW_25_in_ruleDate4586 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDate4598 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleDate4618 = new BitSet(new long[]{0x00003F0206114000L});
        public static final BitSet FOLLOW_42_in_ruleDate4691 = new BitSet(new long[]{0x00003F0206114000L});
        public static final BitSet FOLLOW_26_in_ruleDate4776 = new BitSet(new long[]{0x00003F0206114000L});
        public static final BitSet FOLLOW_43_in_ruleDate4861 = new BitSet(new long[]{0x00003F0206114000L});
        public static final BitSet FOLLOW_44_in_ruleDate4946 = new BitSet(new long[]{0x00003F0206114000L});
        public static final BitSet FOLLOW_45_in_ruleDate5031 = new BitSet(new long[]{0x00003F0206114000L});
        public static final BitSet FOLLOW_33_in_ruleDate5102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber5138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber5148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleNumber5194 = new BitSet(new long[]{0x0000041806114000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5252 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleNumber5264 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleNumber5285 = new BitSet(new long[]{0x0000041A06114000L});
        public static final BitSet FOLLOW_16_in_ruleNumber5353 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleNumber5365 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleNumber5386 = new BitSet(new long[]{0x0000041A06114000L});
        public static final BitSet FOLLOW_20_in_ruleNumber5454 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleNumber5466 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_QUOTED_ID_in_ruleNumber5483 = new BitSet(new long[]{0x0000041A06114000L});
        public static final BitSet FOLLOW_35_in_ruleNumber5556 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleNumber5568 = new BitSet(new long[]{0x0080000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5589 = new BitSet(new long[]{0x0000041A06114000L});
        public static final BitSet FOLLOW_36_in_ruleNumber5657 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleNumber5669 = new BitSet(new long[]{0x0080000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5690 = new BitSet(new long[]{0x0000041A06114000L});
        public static final BitSet FOLLOW_25_in_ruleNumber5758 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleNumber5770 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleNumber5790 = new BitSet(new long[]{0x0000041A06114000L});
        public static final BitSet FOLLOW_26_in_ruleNumber5863 = new BitSet(new long[]{0x0000041A06114000L});
        public static final BitSet FOLLOW_42_in_ruleNumber5948 = new BitSet(new long[]{0x0000041A06114000L});
        public static final BitSet FOLLOW_33_in_ruleNumber6019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_entryRuleSingle6055 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingle6065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleSingle6102 = new BitSet(new long[]{0x0001000006114000L});
        public static final BitSet FOLLOW_14_in_ruleSingle6160 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSingle6172 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleSingle6193 = new BitSet(new long[]{0x0001000006134000L});
        public static final BitSet FOLLOW_16_in_ruleSingle6261 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSingle6273 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleSingle6294 = new BitSet(new long[]{0x0001000006134000L});
        public static final BitSet FOLLOW_20_in_ruleSingle6362 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSingle6374 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_QUOTED_ID_in_ruleSingle6391 = new BitSet(new long[]{0x0001000006134000L});
        public static final BitSet FOLLOW_25_in_ruleSingle6464 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSingle6476 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleSingle6496 = new BitSet(new long[]{0x0001000006134000L});
        public static final BitSet FOLLOW_26_in_ruleSingle6569 = new BitSet(new long[]{0x0001000006134000L});
        public static final BitSet FOLLOW_48_in_ruleSingle6654 = new BitSet(new long[]{0x0001000006134000L});
        public static final BitSet FOLLOW_17_in_ruleSingle6725 = new BitSet(new long[]{0x0000000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingle6746 = new BitSet(new long[]{0x0002000000480000L});
        public static final BitSet FOLLOW_49_in_ruleSingle6759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple6795 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiple6805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleMultiple6842 = new BitSet(new long[]{0x0001041806114000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple6900 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMultiple6912 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleMultiple6933 = new BitSet(new long[]{0x0001041806134000L});
        public static final BitSet FOLLOW_16_in_ruleMultiple7001 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMultiple7013 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleMultiple7034 = new BitSet(new long[]{0x0001041806134000L});
        public static final BitSet FOLLOW_20_in_ruleMultiple7102 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMultiple7114 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_QUOTED_ID_in_ruleMultiple7131 = new BitSet(new long[]{0x0001041806134000L});
        public static final BitSet FOLLOW_35_in_ruleMultiple7204 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMultiple7216 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultiple7233 = new BitSet(new long[]{0x0001041806134000L});
        public static final BitSet FOLLOW_36_in_ruleMultiple7306 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMultiple7318 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultiple7335 = new BitSet(new long[]{0x0001041806134000L});
        public static final BitSet FOLLOW_25_in_ruleMultiple7408 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleMultiple7428 = new BitSet(new long[]{0x0001041806134000L});
        public static final BitSet FOLLOW_26_in_ruleMultiple7501 = new BitSet(new long[]{0x0001041806134000L});
        public static final BitSet FOLLOW_48_in_ruleMultiple7586 = new BitSet(new long[]{0x0001041806134000L});
        public static final BitSet FOLLOW_42_in_ruleMultiple7671 = new BitSet(new long[]{0x0001041806134000L});
        public static final BitSet FOLLOW_17_in_ruleMultiple7742 = new BitSet(new long[]{0x0000000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultiple7763 = new BitSet(new long[]{0x0008000000480000L});
        public static final BitSet FOLLOW_51_in_ruleMultiple7776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable7812 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable7822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTable7859 = new BitSet(new long[]{0x0021000006134000L});
        public static final BitSet FOLLOW_14_in_ruleTable7917 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTable7929 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleTable7950 = new BitSet(new long[]{0x0021000006134000L});
        public static final BitSet FOLLOW_16_in_ruleTable8018 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTable8030 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleTable8051 = new BitSet(new long[]{0x0021000006134000L});
        public static final BitSet FOLLOW_20_in_ruleTable8119 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTable8131 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_QUOTED_ID_in_ruleTable8148 = new BitSet(new long[]{0x0021000006134000L});
        public static final BitSet FOLLOW_25_in_ruleTable8221 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTable8233 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_FQN_in_ruleTable8253 = new BitSet(new long[]{0x0021000006134000L});
        public static final BitSet FOLLOW_26_in_ruleTable8326 = new BitSet(new long[]{0x0021000006134000L});
        public static final BitSet FOLLOW_48_in_ruleTable8411 = new BitSet(new long[]{0x0021000006134000L});
        public static final BitSet FOLLOW_53_in_ruleTable8496 = new BitSet(new long[]{0x0021000006134000L});
        public static final BitSet FOLLOW_17_in_ruleTable8561 = new BitSet(new long[]{0x0100000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable8627 = new BitSet(new long[]{0x0140000000480000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable8703 = new BitSet(new long[]{0x0140000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable8772 = new BitSet(new long[]{0x0140000000480000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable8799 = new BitSet(new long[]{0x0140000000480000L});
        public static final BitSet FOLLOW_54_in_ruleTable8813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt8850 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt8861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleEInt8900 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt8917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef8962 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplateRef8972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAnswerTemplateRef9009 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAnswerTemplateRef9021 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnswerTemplateRef9033 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_QUOTED_ID_in_ruleAnswerTemplateRef9053 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleAnswerTemplateRef9065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion9101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion9111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTableQuestion9148 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQuotedString_in_ruleTableQuestion9169 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleTableQuestion9181 = new BitSet(new long[]{0x0000000000000002L});
    }


}