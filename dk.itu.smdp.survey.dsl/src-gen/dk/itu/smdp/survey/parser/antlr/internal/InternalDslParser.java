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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<survey'", "'title'", "'='", "'description'", "'>'", "'</survey>'", "'<template'", "'id'", "'</template>'", "'<a'", "'</a>'", "'<group'", "'dependsOn'", "'required'", "'</group>'", "'<text'", "'multiline'", "'/>'", "'<scale'", "'lower'", "'upper'", "'lowerLabel'", "'upperLabel'", "'<date'", "'from'", "'to'", "'showLimits'", "'day'", "'month'", "'year'", "'<number'", "'<single'", "'other'", "'</single>'", "'<multiple'", "'</multiple>'", "'<table'", "'multiple'", "'</table>'", "'-'", "'<q>'", "'</q>'"
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
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
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
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
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
    public static final int RULE_WS=9;

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:76:1: ruleSurvey returns [EObject current=null] : ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:79:28: ( ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:86:2: (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:86:4: otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>'
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey132); 

                        	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getSurveyKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:90:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )* ) ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:92:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )* ) )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:92:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )* ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:93:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:96:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )* )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )*
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( LA1_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0) ) {
                            alt1=1;
                        }
                        else if ( LA1_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:105: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:101:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey190); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSurveyAccess().getTitleKeyword_1_1_0_0());
                    	        
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey202); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSurveyAccess().getEqualsSignKeyword_1_1_0_1());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:112:1: ( (lv_title_5_0= ruleEString ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:113:1: (lv_title_5_0= ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:113:1: (lv_title_5_0= ruleEString )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:114:3: lv_title_5_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_1_1_0_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey223);
                    	    lv_title_5_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"title",
                    	            		lv_title_5_0, 
                    	            		"EString");
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
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:137:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:137:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:105: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:139:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey291); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getDescriptionKeyword_1_1_1_0());
                    	        
                    	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey303); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getSurveyAccess().getEqualsSignKeyword_1_1_1_1());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:150:1: ( (lv_description_8_0= ruleEString ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:151:1: (lv_description_8_0= ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:151:1: (lv_description_8_0= ruleEString )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:152:3: lv_description_8_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getDescriptionEStringParserRuleCall_1_1_1_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey324);
                    	    lv_description_8_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"description",
                    	            		lv_description_8_0, 
                    	            		"EString");
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

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSurvey377); 

                        	newLeafNode(otherlv_9, grammarAccess.getSurveyAccess().getGreaterThanSignKeyword_1_2());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:186:1: ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==22||LA2_0==26||LA2_0==29||LA2_0==34||(LA2_0>=41 && LA2_0<=42)||LA2_0==45||LA2_0==47) ) {
                            alt2=1;
                        }
                        else if ( (LA2_0==17) ) {
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

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSurvey440); 

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
            case 22:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            case 41:
                {
                alt4=5;
                }
                break;
            case 42:
                {
                alt4=6;
                }
                break;
            case 45:
                {
                alt4=7;
                }
                break;
            case 47:
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
            case 26:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            case 41:
                {
                alt5=4;
                }
                break;
            case 42:
                {
                alt5=5;
                }
                break;
            case 45:
                {
                alt5=6;
                }
                break;
            case 47:
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

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
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


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:465:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:466:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:467:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1133);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1144); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:474:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:477:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:478:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:478:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:478:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1184); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:486:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1210); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:510:1: ruleAnswerTemplate returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) ;
    public final EObject ruleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_answers_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:513:28: ( (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:3: otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswerTemplate1302); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswerTemplate1314); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateAccess().getIdKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnswerTemplate1326); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateAccess().getEqualsSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:526:1: ( (lv_id_3_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:527:1: (lv_id_3_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:527:1: (lv_id_3_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:528:3: lv_id_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerTemplateAccess().getIdEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswerTemplate1347);
            lv_id_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerTemplateRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnswerTemplate1359); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerTemplateAccess().getGreaterThanSignKeyword_4());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:548:1: ( (lv_answers_5_0= ruleAnswer ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
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
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleAnswerTemplate1380);
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

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswerTemplate1393); 

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
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer1429);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer1439); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:587:1: ruleAnswer returns [EObject current=null] : (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleLabel ) ) otherlv_6= '</a>' ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_label_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:590:28: ( (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleLabel ) ) otherlv_6= '</a>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:591:1: (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleLabel ) ) otherlv_6= '</a>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:591:1: (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleLabel ) ) otherlv_6= '</a>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:591:3: otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleLabel ) ) otherlv_6= '</a>'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswer1476); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:595:1: (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:595:3: otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswer1489); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getIdKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnswer1501); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getEqualsSignKeyword_1_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:603:1: ( (lv_id_3_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:604:1: (lv_id_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:604:1: (lv_id_3_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:605:3: lv_id_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getIdEStringParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1522);
                    lv_id_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnswer1536); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:625:1: ( (lv_label_5_0= ruleLabel ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:626:1: (lv_label_5_0= ruleLabel )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:626:1: (lv_label_5_0= ruleLabel )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:627:3: lv_label_5_0= ruleLabel
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getLabelLabelParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLabel_in_ruleAnswer1557);
            lv_label_5_0=ruleLabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"label",
                    		lv_label_5_0, 
                    		"Label");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswer1569); 

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


    // $ANTLR start "entryRuleLabel"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:655:1: entryRuleLabel returns [String current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final String entryRuleLabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabel = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:656:2: (iv_ruleLabel= ruleLabel EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:657:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLabel_in_entryRuleLabel1606);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLabel1617); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:664:1: ruleLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString (this_EString_1= ruleEString )* ) ;
    public final AntlrDatatypeRuleToken ruleLabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_EString_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:667:28: ( (this_EString_0= ruleEString (this_EString_1= ruleEString )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:668:1: (this_EString_0= ruleEString (this_EString_1= ruleEString )* )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:668:1: (this_EString_0= ruleEString (this_EString_1= ruleEString )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:669:5: this_EString_0= ruleEString (this_EString_1= ruleEString )*
            {
             
                    newCompositeNode(grammarAccess.getLabelAccess().getEStringParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLabel1664);
            this_EString_0=ruleEString();

            state._fsp--;


            		current.merge(this_EString_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:679:1: (this_EString_1= ruleEString )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:680:5: this_EString_1= ruleEString
            	    {
            	     
            	            newCompositeNode(grammarAccess.getLabelAccess().getEStringParserRuleCall_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLabel1692);
            	    this_EString_1=ruleEString();

            	    state._fsp--;


            	    		current.merge(this_EString_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleGroup"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:700:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:701:2: (iv_ruleGroup= ruleGroup EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:702:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup1741);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup1751); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:709:1: ruleGroup returns [EObject current=null] : (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_required_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_questions_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:712:28: ( (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:713:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:713:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:713:3: otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGroup1788); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:717:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:719:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:719:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:720:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:723:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:724:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:724:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )*
            loop11:
            do {
                int alt11=5;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
                    alt11=4;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:726:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:726:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:727:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:727:102: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:728:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:731:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:731:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:731:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:731:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroup1846); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1858); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:739:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:740:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:740:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:741:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getTitleEStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1879);
            	    lv_title_4_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:764:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:764:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:765:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:765:102: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:766:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:769:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:769:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:769:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:769:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1947); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1959); 

            	        	newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:777:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:778:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:778:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:779:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getDescriptionEStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1980);
            	    lv_description_7_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:802:4: ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:802:4: ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:803:5: {...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:803:102: ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:804:6: ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:807:6: ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:807:7: {...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:807:16: (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:807:18: otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleGroup2048); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getDependsOnKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup2060); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:815:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:816:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:816:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:817:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getDependsOnAnswerCrossReference_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup2083);
            	    ruleEString();

            	    state._fsp--;

            	     
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
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:837:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:837:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:838:5: {...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:838:102: ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:839:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:842:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:842:7: {...}? => ( (lv_required_11_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:842:16: ( (lv_required_11_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:843:1: (lv_required_11_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:843:1: (lv_required_11_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:844:3: lv_required_11_0= 'required'
            	    {
            	    lv_required_11_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGroup2156); 

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
            	    break loop11;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup2221); 

                	newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:875:1: ( (lv_questions_13_0= ruleQuestion ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26||LA12_0==29||LA12_0==34||(LA12_0>=41 && LA12_0<=42)||LA12_0==45||LA12_0==47) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:876:1: (lv_questions_13_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:876:1: (lv_questions_13_0= ruleQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:877:3: lv_questions_13_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleGroup2242);
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_14=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGroup2255); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:905:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:906:2: (iv_ruleText= ruleText EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:907:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText2291);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText2301); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:914:1: ruleText returns [EObject current=null] : ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) ) ) otherlv_17= '/>' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_required_15_0=null;
        Token lv_multiline_16_0=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_id_11_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:917:28: ( ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) ) ) otherlv_17= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:918:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) ) ) otherlv_17= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:918:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) ) ) otherlv_17= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:918:2: () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) ) ) otherlv_17= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:918:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:919:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleText2347); 

                	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:928:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:930:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:930:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:931:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:934:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:935:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:935:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )*
            loop13:
            do {
                int alt13=7;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
                    alt13=3;
                }
                else if ( LA13_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
                    alt13=4;
                }
                else if ( LA13_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
                    alt13=5;
                }
                else if ( LA13_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
                    alt13=6;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:937:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:937:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:938:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:938:101: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:939:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:942:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:942:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:942:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:942:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleText2405); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTextAccess().getTitleKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2417); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTextAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:950:1: ( (lv_title_5_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:951:1: (lv_title_5_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:951:1: (lv_title_5_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:952:3: lv_title_5_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getTitleEStringParserRuleCall_2_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2438);
            	    lv_title_5_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_5_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:975:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:975:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:976:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:976:101: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:977:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:980:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:980:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:980:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:980:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2506); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getDescriptionKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2518); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTextAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:988:1: ( (lv_description_8_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:989:1: (lv_description_8_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:989:1: (lv_description_8_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:990:3: lv_description_8_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getDescriptionEStringParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2539);
            	    lv_description_8_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_8_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1013:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1013:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1014:5: {...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1014:101: ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1015:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1018:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1018:7: {...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1018:16: (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1018:18: otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleText2607); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTextAccess().getIdKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2619); 

            	        	newLeafNode(otherlv_10, grammarAccess.getTextAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1026:1: ( (lv_id_11_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1027:1: (lv_id_11_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1027:1: (lv_id_11_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1028:3: lv_id_11_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getIdEStringParserRuleCall_2_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2640);
            	    lv_id_11_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"id",
            	            		lv_id_11_0, 
            	            		"EString");
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
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1051:4: ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1051:4: ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1052:5: {...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1052:101: ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1053:6: ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1056:6: ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1056:7: {...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1056:16: (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1056:18: otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleText2708); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTextAccess().getDependsOnKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2720); 

            	        	newLeafNode(otherlv_13, grammarAccess.getTextAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1064:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1065:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1065:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1066:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTextRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getDependsOnAnswerCrossReference_2_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2743);
            	    ruleEString();

            	    state._fsp--;

            	     
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
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1086:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1086:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1087:5: {...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1087:101: ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1088:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1091:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1091:7: {...}? => ( (lv_required_15_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1091:16: ( (lv_required_15_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1092:1: (lv_required_15_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1092:1: (lv_required_15_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1093:3: lv_required_15_0= 'required'
            	    {
            	    lv_required_15_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleText2816); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1113:4: ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1113:4: ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1114:5: {...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1114:101: ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1115:6: ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1118:6: ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1118:7: {...}? => ( (lv_multiline_16_0= 'multiline' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1118:16: ( (lv_multiline_16_0= 'multiline' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1119:1: (lv_multiline_16_0= 'multiline' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1119:1: (lv_multiline_16_0= 'multiline' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1120:3: lv_multiline_16_0= 'multiline'
            	    {
            	    lv_multiline_16_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleText2901); 

            	            newLeafNode(lv_multiline_16_0, grammarAccess.getTextAccess().getMultilineMultilineKeyword_2_5_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTextRule());
            	    	        }
            	           		setWithLastConsumed(current, "multiline", true, "multiline");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	

            }

            otherlv_17=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleText2966); 

                	newLeafNode(otherlv_17, grammarAccess.getTextAccess().getSolidusGreaterThanSignKeyword_3());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1159:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1160:2: (iv_ruleScale= ruleScale EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1161:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScale_in_entryRuleScale3002);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScale3012); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1168:1: ruleScale returns [EObject current=null] : (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) ;
    public final EObject ruleScale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
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
        Token lv_required_26_0=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;

        AntlrDatatypeRuleToken lv_lower_13_0 = null;

        AntlrDatatypeRuleToken lv_upper_16_0 = null;

        AntlrDatatypeRuleToken lv_lowerLabel_19_0 = null;

        AntlrDatatypeRuleToken lv_upperLabel_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1171:28: ( (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1172:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1172:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1172:3: otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleScale3049); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1176:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1178:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1178:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1179:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1182:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1183:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1183:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=10;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1185:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1185:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1186:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1186:102: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1187:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1190:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1190:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1190:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1190:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleScale3107); 

            	        	newLeafNode(otherlv_2, grammarAccess.getScaleAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3119); 

            	        	newLeafNode(otherlv_3, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1198:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1199:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1199:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1200:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getTitleEStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3140);
            	    lv_title_4_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1223:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1223:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1224:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1224:102: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1225:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1228:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1228:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1228:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1228:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3208); 

            	        	newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3220); 

            	        	newLeafNode(otherlv_6, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1236:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1237:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1237:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1238:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getDescriptionEStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3241);
            	    lv_description_7_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1261:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1261:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1262:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1262:102: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1263:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1266:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1266:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1266:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1266:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleScale3309); 

            	        	newLeafNode(otherlv_8, grammarAccess.getScaleAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3321); 

            	        	newLeafNode(otherlv_9, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1274:1: ( (lv_id_10_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1275:1: (lv_id_10_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1275:1: (lv_id_10_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1276:3: lv_id_10_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getIdEStringParserRuleCall_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3342);
            	    lv_id_10_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"id",
            	            		lv_id_10_0, 
            	            		"EString");
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
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1299:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1299:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1300:5: {...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1300:102: ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1301:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1304:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1304:7: {...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1304:16: (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1304:18: otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) )
            	    {
            	    otherlv_11=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleScale3410); 

            	        	newLeafNode(otherlv_11, grammarAccess.getScaleAccess().getLowerKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3422); 

            	        	newLeafNode(otherlv_12, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1312:1: ( (lv_lower_13_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1313:1: (lv_lower_13_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1313:1: (lv_lower_13_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1314:3: lv_lower_13_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getLowerEIntParserRuleCall_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3443);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1337:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1337:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1338:5: {...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1338:102: ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1339:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1342:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1342:7: {...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1342:16: (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1342:18: otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) )
            	    {
            	    otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleScale3511); 

            	        	newLeafNode(otherlv_14, grammarAccess.getScaleAccess().getUpperKeyword_1_4_0());
            	        
            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3523); 

            	        	newLeafNode(otherlv_15, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1350:1: ( (lv_upper_16_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1351:1: (lv_upper_16_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1351:1: (lv_upper_16_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1352:3: lv_upper_16_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getUpperEIntParserRuleCall_1_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3544);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1375:4: ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1375:4: ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1376:5: {...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1376:102: ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1377:6: ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1380:6: ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1380:7: {...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1380:16: (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1380:18: otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) )
            	    {
            	    otherlv_17=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleScale3612); 

            	        	newLeafNode(otherlv_17, grammarAccess.getScaleAccess().getLowerLabelKeyword_1_5_0());
            	        
            	    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3624); 

            	        	newLeafNode(otherlv_18, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_5_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1388:1: ( (lv_lowerLabel_19_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1389:1: (lv_lowerLabel_19_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1389:1: (lv_lowerLabel_19_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1390:3: lv_lowerLabel_19_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getLowerLabelEStringParserRuleCall_1_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3645);
            	    lv_lowerLabel_19_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"lowerLabel",
            	            		lv_lowerLabel_19_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1413:4: ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1413:4: ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1414:5: {...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1414:102: ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1415:6: ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1418:6: ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1418:7: {...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1418:16: (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1418:18: otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) )
            	    {
            	    otherlv_20=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleScale3713); 

            	        	newLeafNode(otherlv_20, grammarAccess.getScaleAccess().getUpperLabelKeyword_1_6_0());
            	        
            	    otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3725); 

            	        	newLeafNode(otherlv_21, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_6_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1426:1: ( (lv_upperLabel_22_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1427:1: (lv_upperLabel_22_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1427:1: (lv_upperLabel_22_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1428:3: lv_upperLabel_22_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getUpperLabelEStringParserRuleCall_1_6_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3746);
            	    lv_upperLabel_22_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"upperLabel",
            	            		lv_upperLabel_22_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1451:4: ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1451:4: ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1452:5: {...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1452:102: ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1453:6: ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1456:6: ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1456:7: {...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1456:16: (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1456:18: otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_23=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleScale3814); 

            	        	newLeafNode(otherlv_23, grammarAccess.getScaleAccess().getDependsOnKeyword_1_7_0());
            	        
            	    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3826); 

            	        	newLeafNode(otherlv_24, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_7_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1464:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1465:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1465:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1466:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScaleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getDependsOnAnswerCrossReference_1_7_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3849);
            	    ruleEString();

            	    state._fsp--;

            	     
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
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1486:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1486:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1487:5: {...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1487:102: ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1488:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1491:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1491:7: {...}? => ( (lv_required_26_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1491:16: ( (lv_required_26_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1492:1: (lv_required_26_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1492:1: (lv_required_26_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1493:3: lv_required_26_0= 'required'
            	    {
            	    lv_required_26_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleScale3922); 

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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getScaleAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canLeave(grammarAccess.getScaleAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_27=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleScale3993); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1533:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1534:2: (iv_ruleDate= ruleDate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1535:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate4029);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate4039); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1542:1: ruleDate returns [EObject current=null] : ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )* ) ) ) otherlv_26= '/>' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_showLimits_21_0=null;
        Token lv_required_22_0=null;
        Token lv_day_23_0=null;
        Token lv_month_24_0=null;
        Token lv_year_25_0=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_id_11_0 = null;

        AntlrDatatypeRuleToken lv_from_14_0 = null;

        AntlrDatatypeRuleToken lv_to_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1545:28: ( ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )* ) ) ) otherlv_26= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1546:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )* ) ) ) otherlv_26= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1546:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )* ) ) ) otherlv_26= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1546:2: () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )* ) ) ) otherlv_26= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1546:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1547:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDate4085); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1556:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1558:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1558:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1559:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1562:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1563:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1563:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )*
            loop15:
            do {
                int alt15=12;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1565:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1565:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1566:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1566:101: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1567:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1570:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1570:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1570:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1570:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDate4143); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getTitleKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4155); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDateAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1578:1: ( (lv_title_5_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1579:1: (lv_title_5_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1579:1: (lv_title_5_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1580:3: lv_title_5_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getTitleEStringParserRuleCall_2_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4176);
            	    lv_title_5_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_5_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1603:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1603:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1604:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1604:101: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1605:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1608:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1608:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1608:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1608:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4244); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getDescriptionKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4256); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDateAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1616:1: ( (lv_description_8_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1617:1: (lv_description_8_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1617:1: (lv_description_8_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1618:3: lv_description_8_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getDescriptionEStringParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4277);
            	    lv_description_8_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_8_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1641:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1641:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1642:5: {...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1642:101: ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1643:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1646:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1646:7: {...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1646:16: (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1646:18: otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDate4345); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDateAccess().getIdKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4357); 

            	        	newLeafNode(otherlv_10, grammarAccess.getDateAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1654:1: ( (lv_id_11_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1655:1: (lv_id_11_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1655:1: (lv_id_11_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1656:3: lv_id_11_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getIdEStringParserRuleCall_2_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4378);
            	    lv_id_11_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"id",
            	            		lv_id_11_0, 
            	            		"EString");
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
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1679:4: ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1679:4: ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1680:5: {...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1680:101: ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1681:6: ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1684:6: ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1684:7: {...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1684:16: (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1684:18: otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleDate4446); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDateAccess().getFromKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4458); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDateAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1692:1: ( (lv_from_14_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1693:1: (lv_from_14_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1693:1: (lv_from_14_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1694:3: lv_from_14_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getFromEStringParserRuleCall_2_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4479);
            	    lv_from_14_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"from",
            	            		lv_from_14_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1717:4: ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1717:4: ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1718:5: {...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1718:101: ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1719:6: ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1722:6: ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1722:7: {...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1722:16: (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1722:18: otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleDate4547); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDateAccess().getToKeyword_2_4_0());
            	        
            	    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4559); 

            	        	newLeafNode(otherlv_16, grammarAccess.getDateAccess().getEqualsSignKeyword_2_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1730:1: ( (lv_to_17_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1731:1: (lv_to_17_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1731:1: (lv_to_17_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1732:3: lv_to_17_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getToEStringParserRuleCall_2_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4580);
            	    lv_to_17_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"to",
            	            		lv_to_17_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1755:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1755:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1756:5: {...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1756:101: ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1757:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1760:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1760:7: {...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1760:16: (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1760:18: otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDate4648); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDateAccess().getDependsOnKeyword_2_5_0());
            	        
            	    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4660); 

            	        	newLeafNode(otherlv_19, grammarAccess.getDateAccess().getEqualsSignKeyword_2_5_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1768:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1769:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1769:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1770:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getDependsOnAnswerCrossReference_2_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4683);
            	    ruleEString();

            	    state._fsp--;

            	     
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
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1790:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1790:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1791:5: {...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1791:101: ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1792:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1795:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1795:7: {...}? => ( (lv_showLimits_21_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1795:16: ( (lv_showLimits_21_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1796:1: (lv_showLimits_21_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1796:1: (lv_showLimits_21_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1797:3: lv_showLimits_21_0= 'showLimits'
            	    {
            	    lv_showLimits_21_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleDate4756); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1817:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1817:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1818:5: {...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1818:101: ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1819:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1822:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1822:7: {...}? => ( (lv_required_22_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1822:16: ( (lv_required_22_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1823:1: (lv_required_22_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1823:1: (lv_required_22_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1824:3: lv_required_22_0= 'required'
            	    {
            	    lv_required_22_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDate4841); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1844:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1844:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1845:5: {...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1845:101: ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1846:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1849:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1849:7: {...}? => ( (lv_day_23_0= 'day' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1849:16: ( (lv_day_23_0= 'day' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1850:1: (lv_day_23_0= 'day' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1850:1: (lv_day_23_0= 'day' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1851:3: lv_day_23_0= 'day'
            	    {
            	    lv_day_23_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDate4926); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1871:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1871:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1872:5: {...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1872:101: ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1873:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1876:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1876:7: {...}? => ( (lv_month_24_0= 'month' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1876:16: ( (lv_month_24_0= 'month' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1877:1: (lv_month_24_0= 'month' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1877:1: (lv_month_24_0= 'month' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1878:3: lv_month_24_0= 'month'
            	    {
            	    lv_month_24_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDate5011); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1898:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1898:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1899:5: {...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1899:102: ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1900:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1903:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1903:7: {...}? => ( (lv_year_25_0= 'year' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1903:16: ( (lv_year_25_0= 'year' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1904:1: (lv_year_25_0= 'year' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1904:1: (lv_year_25_0= 'year' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1905:3: lv_year_25_0= 'year'
            	    {
            	    lv_year_25_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDate5096); 

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
            	    break loop15;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	

            }

            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDate5161); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1944:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1945:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1946:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber5197);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber5207); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1953:1: ruleNumber returns [EObject current=null] : ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_23= '/>' ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_required_21_0=null;
        Token lv_showLimits_22_0=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_id_11_0 = null;

        AntlrDatatypeRuleToken lv_lower_14_0 = null;

        AntlrDatatypeRuleToken lv_upper_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1956:28: ( ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_23= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1957:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_23= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1957:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_23= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1957:2: () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_23= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1957:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1958:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberAccess().getNumberAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNumber5253); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getNumberKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1967:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1969:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1969:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1970:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1973:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1974:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1974:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )*
            loop16:
            do {
                int alt16=9;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1976:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1976:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1977:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1977:103: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1978:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1981:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1981:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1981:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1981:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNumber5311); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getTitleKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5323); 

            	        	newLeafNode(otherlv_4, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1989:1: ( (lv_title_5_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1990:1: (lv_title_5_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1990:1: (lv_title_5_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1991:3: lv_title_5_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getTitleEStringParserRuleCall_2_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5344);
            	    lv_title_5_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_5_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2014:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2014:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2015:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2015:103: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2016:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2019:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2019:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2019:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2019:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5412); 

            	        	newLeafNode(otherlv_6, grammarAccess.getNumberAccess().getDescriptionKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5424); 

            	        	newLeafNode(otherlv_7, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2027:1: ( (lv_description_8_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2028:1: (lv_description_8_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2028:1: (lv_description_8_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2029:3: lv_description_8_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getDescriptionEStringParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5445);
            	    lv_description_8_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_8_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2052:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2052:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2053:5: {...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2053:103: ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2054:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2057:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2057:7: {...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2057:16: (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2057:18: otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleNumber5513); 

            	        	newLeafNode(otherlv_9, grammarAccess.getNumberAccess().getIdKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5525); 

            	        	newLeafNode(otherlv_10, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2065:1: ( (lv_id_11_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2066:1: (lv_id_11_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2066:1: (lv_id_11_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2067:3: lv_id_11_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getIdEStringParserRuleCall_2_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5546);
            	    lv_id_11_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"id",
            	            		lv_id_11_0, 
            	            		"EString");
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
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2090:4: ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2090:4: ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2091:5: {...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2091:103: ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2092:6: ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:6: ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:7: {...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:16: (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:18: otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) )
            	    {
            	    otherlv_12=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNumber5614); 

            	        	newLeafNode(otherlv_12, grammarAccess.getNumberAccess().getLowerKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5626); 

            	        	newLeafNode(otherlv_13, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2103:1: ( (lv_lower_14_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2104:1: (lv_lower_14_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2104:1: (lv_lower_14_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2105:3: lv_lower_14_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getLowerEIntParserRuleCall_2_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5647);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2128:4: ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2128:4: ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:5: {...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:103: ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2130:6: ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2133:6: ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2133:7: {...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2133:16: (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2133:18: otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) )
            	    {
            	    otherlv_15=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNumber5715); 

            	        	newLeafNode(otherlv_15, grammarAccess.getNumberAccess().getUpperKeyword_2_4_0());
            	        
            	    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5727); 

            	        	newLeafNode(otherlv_16, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2141:1: ( (lv_upper_17_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2142:1: (lv_upper_17_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2142:1: (lv_upper_17_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2143:3: lv_upper_17_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getUpperEIntParserRuleCall_2_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5748);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2166:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2166:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2167:5: {...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2167:103: ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2168:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2171:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2171:7: {...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2171:16: (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2171:18: otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNumber5816); 

            	        	newLeafNode(otherlv_18, grammarAccess.getNumberAccess().getDependsOnKeyword_2_5_0());
            	        
            	    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5828); 

            	        	newLeafNode(otherlv_19, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_5_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2179:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2180:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2180:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2181:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNumberRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getDependsOnAnswerCrossReference_2_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber5851);
            	    ruleEString();

            	    state._fsp--;

            	     
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
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2201:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2201:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2202:5: {...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2202:103: ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2203:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2206:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2206:7: {...}? => ( (lv_required_21_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2206:16: ( (lv_required_21_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2207:1: (lv_required_21_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2207:1: (lv_required_21_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2208:3: lv_required_21_0= 'required'
            	    {
            	    lv_required_21_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNumber5924); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2228:4: ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2228:4: ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2229:5: {...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2229:103: ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2230:6: ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2233:6: ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2233:7: {...}? => ( (lv_showLimits_22_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2233:16: ( (lv_showLimits_22_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2234:1: (lv_showLimits_22_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2234:1: (lv_showLimits_22_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2235:3: lv_showLimits_22_0= 'showLimits'
            	    {
            	    lv_showLimits_22_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleNumber6009); 

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
            	    break loop16;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	

            }

            otherlv_23=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleNumber6074); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2274:1: entryRuleSingle returns [EObject current=null] : iv_ruleSingle= ruleSingle EOF ;
    public final EObject entryRuleSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingle = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2275:2: (iv_ruleSingle= ruleSingle EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2276:2: iv_ruleSingle= ruleSingle EOF
            {
             newCompositeNode(grammarAccess.getSingleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingle_in_entryRuleSingle6110);
            iv_ruleSingle=ruleSingle();

            state._fsp--;

             current =iv_ruleSingle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingle6120); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2283:1: ruleSingle returns [EObject current=null] : (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' ) ;
    public final EObject ruleSingle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_required_14_0=null;
        Token lv_other_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;

        EObject lv_options_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2286:28: ( (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2287:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2287:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2287:3: otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleSingle6157); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2291:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2293:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2293:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2294:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2297:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2298:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2298:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )*
            loop17:
            do {
                int alt17=7;
                int LA17_0 = input.LA(1);

                if ( LA17_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2) ) {
                    alt17=3;
                }
                else if ( LA17_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3) ) {
                    alt17=4;
                }
                else if ( LA17_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4) ) {
                    alt17=5;
                }
                else if ( LA17_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5) ) {
                    alt17=6;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2300:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2300:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2301:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2301:103: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2302:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2305:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2305:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2305:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2305:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSingle6215); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSingleAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle6227); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2313:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2314:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2314:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2315:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getTitleEStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle6248);
            	    lv_title_4_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2338:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2338:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2339:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2339:103: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2340:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2343:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2343:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2343:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2343:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle6316); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSingleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle6328); 

            	        	newLeafNode(otherlv_6, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2351:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2352:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2352:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2353:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getDescriptionEStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle6349);
            	    lv_description_7_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2376:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2376:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2377:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2377:103: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2378:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2381:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2381:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2381:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2381:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSingle6417); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSingleAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle6429); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2389:1: ( (lv_id_10_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2390:1: (lv_id_10_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2390:1: (lv_id_10_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2391:3: lv_id_10_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getIdEStringParserRuleCall_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle6450);
            	    lv_id_10_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"id",
            	            		lv_id_10_0, 
            	            		"EString");
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
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2414:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2414:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2415:5: {...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2415:103: ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2416:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2419:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2419:7: {...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2419:16: (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2419:18: otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSingle6518); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSingleAccess().getDependsOnKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle6530); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2427:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2428:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2428:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2429:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getDependsOnAnswerCrossReference_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle6553);
            	    ruleEString();

            	    state._fsp--;

            	     
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
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2449:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2449:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2450:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2450:103: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2451:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2454:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2454:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2454:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2455:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2455:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2456:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingle6626); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2476:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2476:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2477:5: {...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2477:103: ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2478:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2481:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2481:7: {...}? => ( (lv_other_15_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2481:16: ( (lv_other_15_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2482:1: (lv_other_15_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2482:1: (lv_other_15_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2483:3: lv_other_15_0= 'other'
            	    {
            	    lv_other_15_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleSingle6711); 

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
            	    break loop17;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingle6776); 

                	newLeafNode(otherlv_16, grammarAccess.getSingleAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2514:1: ( (lv_options_17_0= ruleOption ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17||LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2515:1: (lv_options_17_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2515:1: (lv_options_17_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2516:3: lv_options_17_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingle6797);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_18=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleSingle6810); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2544:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2545:2: (iv_ruleMultiple= ruleMultiple EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2546:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_entryRuleMultiple6846);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiple6856); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2553:1: ruleMultiple returns [EObject current=null] : (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>' ) ;
    public final EObject ruleMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_required_19_0=null;
        Token lv_other_20_0=null;
        Token lv_showLimits_21_0=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;

        AntlrDatatypeRuleToken lv_lower_13_0 = null;

        AntlrDatatypeRuleToken lv_upper_16_0 = null;

        EObject lv_options_23_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2556:28: ( (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2557:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2557:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2557:3: otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMultiple6893); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2561:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2563:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2563:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2564:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2567:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2568:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2568:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )*
            loop19:
            do {
                int alt19=10;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2570:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2570:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2571:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2571:105: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2572:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2575:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2575:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2575:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2575:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultiple6951); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultipleAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple6963); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2583:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2584:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2584:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2585:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getTitleEStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple6984);
            	    lv_title_4_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2608:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2608:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2609:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2609:105: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2610:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2613:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2613:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2613:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2613:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple7052); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultipleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple7064); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2621:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2622:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2622:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2623:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getDescriptionEStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple7085);
            	    lv_description_7_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2646:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2646:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2647:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2647:105: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2648:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2651:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2651:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2651:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2651:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultiple7153); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMultipleAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple7165); 

            	        	newLeafNode(otherlv_9, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2659:1: ( (lv_id_10_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2660:1: (lv_id_10_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2660:1: (lv_id_10_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2661:3: lv_id_10_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getIdEStringParserRuleCall_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple7186);
            	    lv_id_10_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"id",
            	            		lv_id_10_0, 
            	            		"EString");
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
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2684:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2684:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2685:5: {...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2685:105: ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2686:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2689:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2689:7: {...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2689:16: (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2689:18: otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) )
            	    {
            	    otherlv_11=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultiple7254); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMultipleAccess().getLowerKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple7266); 

            	        	newLeafNode(otherlv_12, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2697:1: ( (lv_lower_13_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2698:1: (lv_lower_13_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2698:1: (lv_lower_13_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2699:3: lv_lower_13_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getLowerEIntParserRuleCall_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultiple7287);
            	    lv_lower_13_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2722:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2722:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2723:5: {...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2723:105: ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2724:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2727:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2727:7: {...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2727:16: (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2727:18: otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) )
            	    {
            	    otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMultiple7355); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMultipleAccess().getUpperKeyword_1_4_0());
            	        
            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple7367); 

            	        	newLeafNode(otherlv_15, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2735:1: ( (lv_upper_16_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2736:1: (lv_upper_16_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2736:1: (lv_upper_16_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2737:3: lv_upper_16_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getUpperEIntParserRuleCall_1_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultiple7388);
            	    lv_upper_16_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2760:4: ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2760:4: ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2761:5: {...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2761:105: ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2762:6: ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2765:6: ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2765:7: {...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2765:16: (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2765:18: otherlv_17= 'dependsOn' ( ( ruleEString ) )
            	    {
            	    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultiple7456); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMultipleAccess().getDependsOnKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2769:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2770:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2770:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2771:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getDependsOnAnswerCrossReference_1_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple7479);
            	    ruleEString();

            	    state._fsp--;

            	     
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
            	case 7 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2791:4: ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2791:4: ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2792:5: {...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2792:105: ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2793:6: ({...}? => ( (lv_required_19_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2796:6: ({...}? => ( (lv_required_19_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2796:7: {...}? => ( (lv_required_19_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2796:16: ( (lv_required_19_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2797:1: (lv_required_19_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2797:1: (lv_required_19_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2798:3: lv_required_19_0= 'required'
            	    {
            	    lv_required_19_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultiple7552); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2818:4: ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2818:4: ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2819:5: {...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2819:105: ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2820:6: ({...}? => ( (lv_other_20_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2823:6: ({...}? => ( (lv_other_20_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2823:7: {...}? => ( (lv_other_20_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2823:16: ( (lv_other_20_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2824:1: (lv_other_20_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2824:1: (lv_other_20_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2825:3: lv_other_20_0= 'other'
            	    {
            	    lv_other_20_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMultiple7637); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2845:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2845:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2846:5: {...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2846:105: ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2847:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2850:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2850:7: {...}? => ( (lv_showLimits_21_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2850:16: ( (lv_showLimits_21_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2851:1: (lv_showLimits_21_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2851:1: (lv_showLimits_21_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2852:3: lv_showLimits_21_0= 'showLimits'
            	    {
            	    lv_showLimits_21_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMultiple7722); 

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
            	    break loop19;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultiple7787); 

                	newLeafNode(otherlv_22, grammarAccess.getMultipleAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2883:1: ( (lv_options_23_0= ruleOption ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17||LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2884:1: (lv_options_23_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2884:1: (lv_options_23_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2885:3: lv_options_23_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultiple7808);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_24=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleMultiple7821); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2913:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2914:2: (iv_ruleTable= ruleTable EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2915:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable7857);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable7867); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2922:1: ruleTable returns [EObject current=null] : (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_required_14_0=null;
        Token lv_other_15_0=null;
        Token lv_multiple_16_0=null;
        Token otherlv_17=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;

        EObject lv_options_19_0 = null;

        EObject lv_questions_20_0 = null;

        EObject lv_options_21_0 = null;

        EObject lv_questions_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2925:28: ( (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2926:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2926:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2926:3: otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTable7904); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2930:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2932:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2932:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2933:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2936:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2937:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2937:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=8;
                int LA21_0 = input.LA(1);

                if ( LA21_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
                    alt21=2;
                }
                else if ( LA21_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
                    alt21=3;
                }
                else if ( LA21_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
                    alt21=4;
                }
                else if ( LA21_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
                    alt21=5;
                }
                else if ( LA21_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
                    alt21=6;
                }
                else if ( LA21_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6) ) {
                    alt21=7;
                }


                switch (alt21) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2939:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2939:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2940:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2940:102: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2941:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2944:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2944:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2944:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2944:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTable7962); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable7974); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2952:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2953:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2953:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2954:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable7995);
            	    lv_title_4_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2977:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2977:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2978:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2978:102: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2979:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2982:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2982:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2982:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2982:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable8063); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable8075); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTableAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2990:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2991:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2991:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2992:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getDescriptionEStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable8096);
            	    lv_description_7_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"EString");
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3015:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3015:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3016:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3016:102: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3017:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3020:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3020:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3020:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3020:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTable8164); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTableAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable8176); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTableAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3028:1: ( (lv_id_10_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3029:1: (lv_id_10_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3029:1: (lv_id_10_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3030:3: lv_id_10_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getIdEStringParserRuleCall_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable8197);
            	    lv_id_10_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"id",
            	            		lv_id_10_0, 
            	            		"EString");
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
            	case 4 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3053:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3053:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3054:5: {...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3054:102: ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3055:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3058:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3058:7: {...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3058:16: (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3058:18: otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTable8265); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTableAccess().getDependsOnKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable8277); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTableAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3066:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3067:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3067:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3068:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getDependsOnAnswerCrossReference_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable8300);
            	    ruleEString();

            	    state._fsp--;

            	     
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
            	case 5 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3088:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3088:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3089:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3089:102: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3090:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3093:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3093:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3093:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3094:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3094:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3095:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTable8373); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3115:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3115:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3116:5: {...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3116:102: ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3117:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3120:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3120:7: {...}? => ( (lv_other_15_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3120:16: ( (lv_other_15_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3121:1: (lv_other_15_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3121:1: (lv_other_15_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3122:3: lv_other_15_0= 'other'
            	    {
            	    lv_other_15_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTable8458); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3142:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3142:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3143:5: {...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3143:102: ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3144:6: ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3147:6: ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3147:7: {...}? => ( (lv_multiple_16_0= 'multiple' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3147:16: ( (lv_multiple_16_0= 'multiple' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3148:1: (lv_multiple_16_0= 'multiple' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3148:1: (lv_multiple_16_0= 'multiple' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3149:3: lv_multiple_16_0= 'multiple'
            	    {
            	    lv_multiple_16_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTable8543); 

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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	

            }

            otherlv_17=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable8614); 

                	newLeafNode(otherlv_17, grammarAccess.getTableAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3181:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3183:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3183:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3184:2: ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3187:2: ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3188:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3188:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=3;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3190:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3190:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3191:5: {...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3191:102: ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3192:6: ({...}? => ( (lv_options_19_0= ruleOption ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3195:6: ({...}? => ( (lv_options_19_0= ruleOption ) ) )+
            	    int cnt22=0;
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==17) ) {
            	            int LA22_1 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt22=1;
            	            }


            	        }
            	        else if ( (LA22_0==20) ) {
            	            int LA22_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt22=1;
            	            }


            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3195:7: {...}? => ( (lv_options_19_0= ruleOption ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3195:16: ( (lv_options_19_0= ruleOption ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3196:1: (lv_options_19_0= ruleOption )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3196:1: (lv_options_19_0= ruleOption )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3197:3: lv_options_19_0= ruleOption
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_3_0_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable8680);
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
            	    	    if ( cnt22 >= 1 ) break loop22;
            	                EarlyExitException eee =
            	                    new EarlyExitException(22, input);
            	                throw eee;
            	        }
            	        cnt22++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3220:4: ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3220:4: ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3221:5: {...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3221:102: ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3222:6: ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3225:6: ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==51) ) {
            	            int LA23_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3225:7: {...}? => ( (lv_questions_20_0= ruleTableQuestion ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3225:16: ( (lv_questions_20_0= ruleTableQuestion ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3226:1: (lv_questions_20_0= ruleTableQuestion )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3226:1: (lv_questions_20_0= ruleTableQuestion )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3227:3: lv_questions_20_0= ruleTableQuestion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable8756);
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

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3258:2: ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==17||LA25_0==20) ) {
                    alt25=1;
                }
                else if ( (LA25_0==51) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3258:3: ( (lv_options_21_0= ruleOption ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3258:3: ( (lv_options_21_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3259:1: (lv_options_21_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3259:1: (lv_options_21_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3260:3: lv_options_21_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable8825);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3277:6: ( (lv_questions_22_0= ruleTableQuestion ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3277:6: ( (lv_questions_22_0= ruleTableQuestion ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3278:1: (lv_questions_22_0= ruleTableQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3278:1: (lv_questions_22_0= ruleTableQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3279:3: lv_questions_22_0= ruleTableQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable8852);
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
            	    break loop25;
                }
            } while (true);

            otherlv_23=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTable8866); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3307:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3308:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3309:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt8903);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt8914); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3316:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3319:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3320:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3320:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3320:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3320:2: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3321:2: kw= '-'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEInt8953); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt8970); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3341:1: entryRuleAnswerTemplateRef returns [EObject current=null] : iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF ;
    public final EObject entryRuleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplateRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3342:2: (iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3343:2: iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef9015);
            iv_ruleAnswerTemplateRef=ruleAnswerTemplateRef();

            state._fsp--;

             current =iv_ruleAnswerTemplateRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplateRef9025); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3350:1: ruleAnswerTemplateRef returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( ( ruleEString ) ) otherlv_4= '/>' ) ;
    public final EObject ruleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3353:28: ( (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( ( ruleEString ) ) otherlv_4= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3354:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( ( ruleEString ) ) otherlv_4= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3354:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( ( ruleEString ) ) otherlv_4= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3354:3: otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( ( ruleEString ) ) otherlv_4= '/>'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswerTemplateRef9062); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateRefAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswerTemplateRef9074); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateRefAccess().getIdKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnswerTemplateRef9086); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateRefAccess().getEqualsSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3366:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3367:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3367:1: ( ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3368:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnswerTemplateRefAccess().getTemplateAnswerTemplateCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswerTemplateRef9109);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnswerTemplateRef9121); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3393:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3394:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3395:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion9157);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion9167); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3402:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= '<q>' ( (lv_title_1_0= ruleLabel ) ) otherlv_2= '</q>' ) ;
    public final EObject ruleTableQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3405:28: ( (otherlv_0= '<q>' ( (lv_title_1_0= ruleLabel ) ) otherlv_2= '</q>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3406:1: (otherlv_0= '<q>' ( (lv_title_1_0= ruleLabel ) ) otherlv_2= '</q>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3406:1: (otherlv_0= '<q>' ( (lv_title_1_0= ruleLabel ) ) otherlv_2= '</q>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3406:3: otherlv_0= '<q>' ( (lv_title_1_0= ruleLabel ) ) otherlv_2= '</q>'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTableQuestion9204); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3410:1: ( (lv_title_1_0= ruleLabel ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3411:1: (lv_title_1_0= ruleLabel )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3411:1: (lv_title_1_0= ruleLabel )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3412:3: lv_title_1_0= ruleLabel
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getTitleLabelParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLabel_in_ruleTableQuestion9225);
            lv_title_1_0=ruleLabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"Label");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTableQuestion9237); 

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


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA14_eotS =
        "\13\uffff";
    static final String DFA14_eofS =
        "\13\uffff";
    static final String DFA14_minS =
        "\1\14\12\uffff";
    static final String DFA14_maxS =
        "\1\41\12\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA14_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\4\uffff\1\11\1\12\3\uffff\1\1\1"+
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1183:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0==28) ) {s = 1;}

                        else if ( LA14_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA14_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA14_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA14_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA14_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA14_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA14_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA14_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA14_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\15\uffff";
    static final String DFA15_eofS =
        "\15\uffff";
    static final String DFA15_minS =
        "\1\14\14\uffff";
    static final String DFA15_maxS =
        "\1\50\14\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA15_specialS =
        "\1\0\14\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\4\uffff\1\7\1\11\3\uffff\1\1\6"+
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
            return "()* loopback of 1563:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )*";
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
                        if ( (LA15_0==28) ) {s = 1;}

                        else if ( LA15_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA15_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA15_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA15_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA15_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA15_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA15_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA15_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA15_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA15_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA15_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                         
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
        "\12\uffff";
    static final String DFA16_eofS =
        "\12\uffff";
    static final String DFA16_minS =
        "\1\14\11\uffff";
    static final String DFA16_maxS =
        "\1\45\11\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA16_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\4\uffff\1\7\1\10\3\uffff\1\1\1"+
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
            return "()* loopback of 1974:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )*";
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
                        if ( (LA16_0==28) ) {s = 1;}

                        else if ( LA16_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA16_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA16_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA16_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA16_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA16_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA16_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA16_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
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
    static final String DFA19_eotS =
        "\13\uffff";
    static final String DFA19_eofS =
        "\13\uffff";
    static final String DFA19_minS =
        "\1\14\12\uffff";
    static final String DFA19_maxS =
        "\1\53\12\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA19_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\1\uffff\1\3\1\1\2\uffff\1\4\4\uffff\1\7\1\10\5\uffff\1"+
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
            return "()* loopback of 2568:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )*";
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
                        if ( (LA19_0==15) ) {s = 1;}

                        else if ( LA19_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA19_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA19_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA19_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA19_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA19_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA19_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA19_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA19_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
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
    static final String DFA24_eotS =
        "\33\uffff";
    static final String DFA24_eofS =
        "\33\uffff";
    static final String DFA24_minS =
        "\1\21\1\22\1\17\1\4\1\uffff\2\15\11\4\1\0\2\34\2\17\2\4\1\0\1\uffff"+
        "\1\0\1\uffff";
    static final String DFA24_maxS =
        "\1\63\2\22\1\5\1\uffff\2\15\1\5\2\64\2\5\2\25\2\64\1\0\2\34\2\17"+
        "\2\25\1\0\1\uffff\1\0\1\uffff";
    static final String DFA24_acceptS =
        "\4\uffff\1\3\23\uffff\1\2\1\uffff\1\1";
    static final String DFA24_specialS =
        "\20\uffff\1\1\6\uffff\1\0\1\uffff\1\2\1\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\2\uffff\1\2\34\uffff\1\4\1\uffff\1\3",
            "\1\5",
            "\1\7\2\uffff\1\6",
            "\1\10\1\11",
            "",
            "\1\12",
            "\1\13",
            "\1\14\1\15",
            "\1\16\1\17\56\uffff\1\20",
            "\1\16\1\17\56\uffff\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26\17\uffff\1\27",
            "\1\25\1\26\17\uffff\1\27",
            "\1\16\1\17\56\uffff\1\20",
            "\1\16\1\17\56\uffff\1\20",
            "\1\uffff",
            "\1\31",
            "\1\31",
            "\1\7",
            "\1\7",
            "\1\25\1\26\17\uffff\1\27",
            "\1\25\1\26\17\uffff\1\27",
            "\1\uffff",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "()+ loopback of 3188:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_23 = input.LA(1);

                         
                        int index24_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 26;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index24_23);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_16 = input.LA(1);

                         
                        int index24_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {s = 24;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index24_16);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_25 = input.LA(1);

                         
                        int index24_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 26;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index24_25);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSurvey132 = new BitSet(new long[]{0x000000000000D000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey190 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey202 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey223 = new BitSet(new long[]{0x000000000000D000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey291 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey303 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey324 = new BitSet(new long[]{0x000000000000D000L});
        public static final BitSet FOLLOW_15_in_ruleSurvey377 = new BitSet(new long[]{0x0000A60424430000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey399 = new BitSet(new long[]{0x0000A60424430000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey426 = new BitSet(new long[]{0x0000A60424430000L});
        public static final BitSet FOLLOW_16_in_ruleSurvey440 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1255 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplate1265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleAnswerTemplate1302 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAnswerTemplate1314 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnswerTemplate1326 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswerTemplate1347 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnswerTemplate1359 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleAnswerTemplate1380 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAnswerTemplate1393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1429 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAnswer1476 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleAnswer1489 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnswer1501 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1522 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnswer1536 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleLabel_in_ruleAnswer1557 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnswer1569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1606 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLabel1617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLabel1664 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLabel1692 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleGroup1788 = new BitSet(new long[]{0x000000000180D000L});
        public static final BitSet FOLLOW_12_in_ruleGroup1846 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1858 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1879 = new BitSet(new long[]{0x000000000180D000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1947 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1959 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1980 = new BitSet(new long[]{0x000000000180D000L});
        public static final BitSet FOLLOW_23_in_ruleGroup2048 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGroup2060 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup2083 = new BitSet(new long[]{0x000000000180D000L});
        public static final BitSet FOLLOW_24_in_ruleGroup2156 = new BitSet(new long[]{0x000000000180D000L});
        public static final BitSet FOLLOW_15_in_ruleGroup2221 = new BitSet(new long[]{0x0000A60424400000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup2242 = new BitSet(new long[]{0x0000A60426400000L});
        public static final BitSet FOLLOW_25_in_ruleGroup2255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText2291 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText2301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleText2347 = new BitSet(new long[]{0x0000000019845000L});
        public static final BitSet FOLLOW_12_in_ruleText2405 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText2417 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2438 = new BitSet(new long[]{0x0000000019845000L});
        public static final BitSet FOLLOW_14_in_ruleText2506 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText2518 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2539 = new BitSet(new long[]{0x0000000019845000L});
        public static final BitSet FOLLOW_18_in_ruleText2607 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText2619 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2640 = new BitSet(new long[]{0x0000000019845000L});
        public static final BitSet FOLLOW_23_in_ruleText2708 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText2720 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2743 = new BitSet(new long[]{0x0000000019845000L});
        public static final BitSet FOLLOW_24_in_ruleText2816 = new BitSet(new long[]{0x0000000019845000L});
        public static final BitSet FOLLOW_27_in_ruleText2901 = new BitSet(new long[]{0x0000000019845000L});
        public static final BitSet FOLLOW_28_in_ruleText2966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_entryRuleScale3002 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScale3012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleScale3049 = new BitSet(new long[]{0x00000003C1845000L});
        public static final BitSet FOLLOW_12_in_ruleScale3107 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3119 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3140 = new BitSet(new long[]{0x00000003D1845000L});
        public static final BitSet FOLLOW_14_in_ruleScale3208 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3220 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3241 = new BitSet(new long[]{0x00000003D1845000L});
        public static final BitSet FOLLOW_18_in_ruleScale3309 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3321 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3342 = new BitSet(new long[]{0x00000003D1845000L});
        public static final BitSet FOLLOW_30_in_ruleScale3410 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3422 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3443 = new BitSet(new long[]{0x00000003D1845000L});
        public static final BitSet FOLLOW_31_in_ruleScale3511 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3523 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3544 = new BitSet(new long[]{0x00000003D1845000L});
        public static final BitSet FOLLOW_32_in_ruleScale3612 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3624 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3645 = new BitSet(new long[]{0x00000003D1845000L});
        public static final BitSet FOLLOW_33_in_ruleScale3713 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3725 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3746 = new BitSet(new long[]{0x00000003D1845000L});
        public static final BitSet FOLLOW_23_in_ruleScale3814 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3826 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3849 = new BitSet(new long[]{0x00000003D1845000L});
        public static final BitSet FOLLOW_24_in_ruleScale3922 = new BitSet(new long[]{0x00000003D1845000L});
        public static final BitSet FOLLOW_28_in_ruleScale3993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate4029 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate4039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleDate4085 = new BitSet(new long[]{0x000001F811845000L});
        public static final BitSet FOLLOW_12_in_ruleDate4143 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate4155 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4176 = new BitSet(new long[]{0x000001F811845000L});
        public static final BitSet FOLLOW_14_in_ruleDate4244 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate4256 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4277 = new BitSet(new long[]{0x000001F811845000L});
        public static final BitSet FOLLOW_18_in_ruleDate4345 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate4357 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4378 = new BitSet(new long[]{0x000001F811845000L});
        public static final BitSet FOLLOW_35_in_ruleDate4446 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate4458 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4479 = new BitSet(new long[]{0x000001F811845000L});
        public static final BitSet FOLLOW_36_in_ruleDate4547 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate4559 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4580 = new BitSet(new long[]{0x000001F811845000L});
        public static final BitSet FOLLOW_23_in_ruleDate4648 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate4660 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4683 = new BitSet(new long[]{0x000001F811845000L});
        public static final BitSet FOLLOW_37_in_ruleDate4756 = new BitSet(new long[]{0x000001F811845000L});
        public static final BitSet FOLLOW_24_in_ruleDate4841 = new BitSet(new long[]{0x000001F811845000L});
        public static final BitSet FOLLOW_38_in_ruleDate4926 = new BitSet(new long[]{0x000001F811845000L});
        public static final BitSet FOLLOW_39_in_ruleDate5011 = new BitSet(new long[]{0x000001F811845000L});
        public static final BitSet FOLLOW_40_in_ruleDate5096 = new BitSet(new long[]{0x000001F811845000L});
        public static final BitSet FOLLOW_28_in_ruleDate5161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber5197 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber5207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleNumber5253 = new BitSet(new long[]{0x00000020D1845000L});
        public static final BitSet FOLLOW_12_in_ruleNumber5311 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5323 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5344 = new BitSet(new long[]{0x00000020D1845000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5412 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5424 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5445 = new BitSet(new long[]{0x00000020D1845000L});
        public static final BitSet FOLLOW_18_in_ruleNumber5513 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5525 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5546 = new BitSet(new long[]{0x00000020D1845000L});
        public static final BitSet FOLLOW_30_in_ruleNumber5614 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5626 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5647 = new BitSet(new long[]{0x00000020D1845000L});
        public static final BitSet FOLLOW_31_in_ruleNumber5715 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5727 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5748 = new BitSet(new long[]{0x00000020D1845000L});
        public static final BitSet FOLLOW_23_in_ruleNumber5816 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5828 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber5851 = new BitSet(new long[]{0x00000020D1845000L});
        public static final BitSet FOLLOW_24_in_ruleNumber5924 = new BitSet(new long[]{0x00000020D1845000L});
        public static final BitSet FOLLOW_37_in_ruleNumber6009 = new BitSet(new long[]{0x00000020D1845000L});
        public static final BitSet FOLLOW_28_in_ruleNumber6074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_entryRuleSingle6110 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingle6120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleSingle6157 = new BitSet(new long[]{0x000008000184D000L});
        public static final BitSet FOLLOW_12_in_ruleSingle6215 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle6227 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle6248 = new BitSet(new long[]{0x000008000184D000L});
        public static final BitSet FOLLOW_14_in_ruleSingle6316 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle6328 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle6349 = new BitSet(new long[]{0x000008000184D000L});
        public static final BitSet FOLLOW_18_in_ruleSingle6417 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle6429 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle6450 = new BitSet(new long[]{0x000008000184D000L});
        public static final BitSet FOLLOW_23_in_ruleSingle6518 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle6530 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle6553 = new BitSet(new long[]{0x000008000184D000L});
        public static final BitSet FOLLOW_24_in_ruleSingle6626 = new BitSet(new long[]{0x000008000184D000L});
        public static final BitSet FOLLOW_43_in_ruleSingle6711 = new BitSet(new long[]{0x000008000184D000L});
        public static final BitSet FOLLOW_15_in_ruleSingle6776 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingle6797 = new BitSet(new long[]{0x0000100000120000L});
        public static final BitSet FOLLOW_44_in_ruleSingle6810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple6846 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiple6856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleMultiple6893 = new BitSet(new long[]{0x00000820C184D000L});
        public static final BitSet FOLLOW_12_in_ruleMultiple6951 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple6963 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple6984 = new BitSet(new long[]{0x00000820C184D000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple7052 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple7064 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple7085 = new BitSet(new long[]{0x00000820C184D000L});
        public static final BitSet FOLLOW_18_in_ruleMultiple7153 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple7165 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple7186 = new BitSet(new long[]{0x00000820C184D000L});
        public static final BitSet FOLLOW_30_in_ruleMultiple7254 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple7266 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultiple7287 = new BitSet(new long[]{0x00000820C184D000L});
        public static final BitSet FOLLOW_31_in_ruleMultiple7355 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple7367 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultiple7388 = new BitSet(new long[]{0x00000820C184D000L});
        public static final BitSet FOLLOW_23_in_ruleMultiple7456 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple7479 = new BitSet(new long[]{0x00000820C184D000L});
        public static final BitSet FOLLOW_24_in_ruleMultiple7552 = new BitSet(new long[]{0x00000820C184D000L});
        public static final BitSet FOLLOW_43_in_ruleMultiple7637 = new BitSet(new long[]{0x00000820C184D000L});
        public static final BitSet FOLLOW_37_in_ruleMultiple7722 = new BitSet(new long[]{0x00000820C184D000L});
        public static final BitSet FOLLOW_15_in_ruleMultiple7787 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultiple7808 = new BitSet(new long[]{0x0000400000120000L});
        public static final BitSet FOLLOW_46_in_ruleMultiple7821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable7857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable7867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTable7904 = new BitSet(new long[]{0x0001080001845000L});
        public static final BitSet FOLLOW_12_in_ruleTable7962 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable7974 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable7995 = new BitSet(new long[]{0x000108000184D000L});
        public static final BitSet FOLLOW_14_in_ruleTable8063 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable8075 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable8096 = new BitSet(new long[]{0x000108000184D000L});
        public static final BitSet FOLLOW_18_in_ruleTable8164 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable8176 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable8197 = new BitSet(new long[]{0x000108000184D000L});
        public static final BitSet FOLLOW_23_in_ruleTable8265 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable8277 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable8300 = new BitSet(new long[]{0x000108000184D000L});
        public static final BitSet FOLLOW_24_in_ruleTable8373 = new BitSet(new long[]{0x000108000184D000L});
        public static final BitSet FOLLOW_43_in_ruleTable8458 = new BitSet(new long[]{0x000108000184D000L});
        public static final BitSet FOLLOW_48_in_ruleTable8543 = new BitSet(new long[]{0x000108000184D000L});
        public static final BitSet FOLLOW_15_in_ruleTable8614 = new BitSet(new long[]{0x0008000000120000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable8680 = new BitSet(new long[]{0x000A000000120000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable8756 = new BitSet(new long[]{0x000A000000120000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable8825 = new BitSet(new long[]{0x000A000000120000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable8852 = new BitSet(new long[]{0x000A000000120000L});
        public static final BitSet FOLLOW_49_in_ruleTable8866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt8903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt8914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEInt8953 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt8970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef9015 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplateRef9025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleAnswerTemplateRef9062 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAnswerTemplateRef9074 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnswerTemplateRef9086 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswerTemplateRef9109 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleAnswerTemplateRef9121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion9157 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion9167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTableQuestion9204 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleLabel_in_ruleTableQuestion9225 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleTableQuestion9237 = new BitSet(new long[]{0x0000000000000002L});
    }


}