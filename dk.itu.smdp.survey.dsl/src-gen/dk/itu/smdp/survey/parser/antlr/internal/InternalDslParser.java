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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<survey'", "'title'", "'='", "'description'", "'>'", "'</survey>'", "'<template'", "'id'", "'</template>'", "'/>'", "'<a'", "'</a>'", "'<group'", "'dependsOn'", "'required'", "'</group>'", "'<single'", "'other'", "'</single>'", "'<multiple'", "'lower'", "'upper'", "'showLimits'", "'</multiple>'", "'<text'", "'multiline'", "'<date'", "'from'", "'to'", "'day'", "'month'", "'year'", "'<number'", "'<scale'", "'lowerLabel'", "'upperLabel'", "'<table'", "'multiple'", "'</table>'", "'-'", "'<tableQuestion'"
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

                        if ( (LA2_0==23||LA2_0==27||LA2_0==30||LA2_0==35||LA2_0==37||(LA2_0>=43 && LA2_0<=44)||LA2_0==47) ) {
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:244:1: ruleItem returns [EObject current=null] : (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_Group_0 = null;

        EObject this_Single_1 = null;

        EObject this_Multiple_2 = null;

        EObject this_Text_3 = null;

        EObject this_Date_4 = null;

        EObject this_Number_5 = null;

        EObject this_Scale_6 = null;

        EObject this_Table_7 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:247:28: ( (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:248:1: (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:248:1: (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 37:
                {
                alt4=5;
                }
                break;
            case 43:
                {
                alt4=6;
                }
                break;
            case 44:
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:259:5: this_Single_1= ruleSingle
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getSingleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleItem562);
                    this_Single_1=ruleSingle();

                    state._fsp--;

                     
                            current = this_Single_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:269:5: this_Multiple_2= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getMultipleParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleItem589);
                    this_Multiple_2=ruleMultiple();

                    state._fsp--;

                     
                            current = this_Multiple_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:279:5: this_Text_3= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getTextParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleItem616);
                    this_Text_3=ruleText();

                    state._fsp--;

                     
                            current = this_Text_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:289:5: this_Date_4= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getDateParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleItem643);
                    this_Date_4=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:299:5: this_Number_5= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getNumberParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleItem670);
                    this_Number_5=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:309:5: this_Scale_6= ruleScale
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getScaleParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleItem697);
                    this_Scale_6=ruleScale();

                    state._fsp--;

                     
                            current = this_Scale_6; 
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:344:1: ruleQuestion returns [EObject current=null] : (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_Single_0 = null;

        EObject this_Multiple_1 = null;

        EObject this_Text_2 = null;

        EObject this_Date_3 = null;

        EObject this_Number_4 = null;

        EObject this_Scale_5 = null;

        EObject this_Table_6 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:347:28: ( (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:348:1: (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:348:1: (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 35:
                {
                alt5=3;
                }
                break;
            case 37:
                {
                alt5=4;
                }
                break;
            case 43:
                {
                alt5=5;
                }
                break;
            case 44:
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:349:5: this_Single_0= ruleSingle
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSingleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleQuestion816);
                    this_Single_0=ruleSingle();

                    state._fsp--;

                     
                            current = this_Single_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:359:5: this_Multiple_1= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleQuestion843);
                    this_Multiple_1=ruleMultiple();

                    state._fsp--;

                     
                            current = this_Multiple_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:369:5: this_Text_2= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTextParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleQuestion870);
                    this_Text_2=ruleText();

                    state._fsp--;

                     
                            current = this_Text_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:379:5: this_Date_3= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getDateParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleQuestion897);
                    this_Date_3=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:389:5: this_Number_4= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getNumberParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleQuestion924);
                    this_Number_4=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:399:5: this_Scale_5= ruleScale
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getScaleParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleQuestion951);
                    this_Scale_5=ruleScale();

                    state._fsp--;

                     
                            current = this_Scale_5; 
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:434:1: ruleOption returns [EObject current=null] : (this_Answer_0= ruleAnswer | this_AnswerTemplate_1= ruleAnswerTemplate ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_Answer_0 = null;

        EObject this_AnswerTemplate_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:437:28: ( (this_Answer_0= ruleAnswer | this_AnswerTemplate_1= ruleAnswerTemplate ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:438:1: (this_Answer_0= ruleAnswer | this_AnswerTemplate_1= ruleAnswerTemplate )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:438:1: (this_Answer_0= ruleAnswer | this_AnswerTemplate_1= ruleAnswerTemplate )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:439:5: this_Answer_0= ruleAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleOption1070);
                    this_Answer_0=ruleAnswer();

                    state._fsp--;

                     
                            current = this_Answer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:449:5: this_AnswerTemplate_1= ruleAnswerTemplate
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerTemplateParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_ruleOption1097);
                    this_AnswerTemplate_1=ruleAnswerTemplate();

                    state._fsp--;

                     
                            current = this_AnswerTemplate_1; 
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:510:1: ruleAnswerTemplate returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) ( (otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) | otherlv_7= '/>' ) ) ;
    public final EObject ruleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_answers_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:513:28: ( (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) ( (otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) | otherlv_7= '/>' ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) ( (otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) | otherlv_7= '/>' ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) ( (otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) | otherlv_7= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:3: otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) ( (otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) | otherlv_7= '/>' )
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:544:2: ( (otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) | otherlv_7= '/>' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:544:3: (otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:544:3: (otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:544:5: otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>'
                    {
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnswerTemplate1361); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnswerTemplateAccess().getGreaterThanSignKeyword_4_0_0());
                        
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
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnswerTemplateAccess().getAnswersAnswerParserRuleCall_4_0_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleAnswerTemplate1382);
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

                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswerTemplate1395); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnswerTemplateAccess().getTemplateKeyword_4_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:571:7: otherlv_7= '/>'
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswerTemplate1414); 

                        	newLeafNode(otherlv_7, grammarAccess.getAnswerTemplateAccess().getSolidusGreaterThanSignKeyword_4_1());
                        

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
    // $ANTLR end "ruleAnswerTemplate"


    // $ANTLR start "entryRuleAnswer"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:583:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:584:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:585:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer1451);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer1461); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:592:1: ruleAnswer returns [EObject current=null] : (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:595:28: ( (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:596:1: (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:596:1: (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:596:3: otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswer1498); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:600:1: (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:600:3: otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswer1511); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getIdKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnswer1523); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getEqualsSignKeyword_1_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:608:1: ( (lv_id_3_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:609:1: (lv_id_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:609:1: (lv_id_3_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:610:3: lv_id_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getIdEStringParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1544);
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

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnswer1558); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:630:1: ( (lv_label_5_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:631:1: (lv_label_5_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:631:1: (lv_label_5_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:632:3: lv_label_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getLabelEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1579);
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

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnswer1591); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:662:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:663:2: (iv_ruleGroup= ruleGroup EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:664:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup1629);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup1639); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:671:1: ruleGroup returns [EObject current=null] : (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:674:28: ( (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:675:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:675:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:675:3: otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleGroup1676); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:679:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:681:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:681:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:682:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:685:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )*
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
                else if ( LA11_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
                    alt11=4;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:688:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:688:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:689:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:689:102: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:690:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:693:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:693:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:693:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:693:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroup1734); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1746); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:701:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:702:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:702:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:703:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getTitleEStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1767);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:726:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:726:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:727:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:727:102: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:728:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:731:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:731:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:731:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:731:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1835); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1847); 

            	        	newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:739:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:740:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:740:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:741:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getDescriptionEStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1868);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:764:4: ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:764:4: ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:765:5: {...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:765:102: ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:766:6: ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:769:6: ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:769:7: {...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:769:16: (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:769:18: otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGroup1936); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getDependsOnKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1948); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:777:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:778:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:778:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:779:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getDependsOnAnswerCrossReference_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1971);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:799:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:799:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:800:5: {...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:800:102: ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:801:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:804:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:804:7: {...}? => ( (lv_required_11_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:804:16: ( (lv_required_11_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:805:1: (lv_required_11_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:805:1: (lv_required_11_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:806:3: lv_required_11_0= 'required'
            	    {
            	    lv_required_11_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGroup2044); 

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

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup2109); 

                	newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:837:1: ( (lv_questions_13_0= ruleQuestion ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27||LA12_0==30||LA12_0==35||LA12_0==37||(LA12_0>=43 && LA12_0<=44)||LA12_0==47) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:838:1: (lv_questions_13_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:838:1: (lv_questions_13_0= ruleQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:839:3: lv_questions_13_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleGroup2130);
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

            otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleGroup2143); 

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


    // $ANTLR start "entryRuleSingle"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:867:1: entryRuleSingle returns [EObject current=null] : iv_ruleSingle= ruleSingle EOF ;
    public final EObject entryRuleSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingle = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:868:2: (iv_ruleSingle= ruleSingle EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:869:2: iv_ruleSingle= ruleSingle EOF
            {
             newCompositeNode(grammarAccess.getSingleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingle_in_entryRuleSingle2179);
            iv_ruleSingle=ruleSingle();

            state._fsp--;

             current =iv_ruleSingle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingle2189); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:876:1: ruleSingle returns [EObject current=null] : (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) ) ) otherlv_16= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) )+ {...}?) ) ) otherlv_20= '</single>' ) ;
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
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;

        EObject lv_options_19_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:879:28: ( (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) ) ) otherlv_16= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) )+ {...}?) ) ) otherlv_20= '</single>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:880:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) ) ) otherlv_16= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) )+ {...}?) ) ) otherlv_20= '</single>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:880:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) ) ) otherlv_16= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) )+ {...}?) ) ) otherlv_20= '</single>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:880:3: otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) ) ) otherlv_16= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) )+ {...}?) ) ) otherlv_20= '</single>'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSingle2226); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:884:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:886:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:886:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:887:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:890:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )*
            loop13:
            do {
                int alt13=7;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2) ) {
                    alt13=3;
                }
                else if ( LA13_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3) ) {
                    alt13=4;
                }
                else if ( LA13_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4) ) {
                    alt13=5;
                }
                else if ( LA13_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5) ) {
                    alt13=6;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:893:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:893:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:894:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:894:103: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:895:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:898:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:898:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:898:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:898:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSingle2284); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSingleAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle2296); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:906:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:907:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:907:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:908:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getTitleEStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2317);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:931:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:931:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:932:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:932:103: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:933:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:936:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:936:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:936:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:936:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle2385); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSingleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle2397); 

            	        	newLeafNode(otherlv_6, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:944:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:945:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:945:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:946:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getDescriptionEStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2418);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:969:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:969:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:970:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:970:103: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:971:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:974:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:974:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:974:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:974:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSingle2486); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSingleAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle2498); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:982:1: ( (lv_id_10_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:983:1: (lv_id_10_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:983:1: (lv_id_10_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:984:3: lv_id_10_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getIdEStringParserRuleCall_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2519);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1007:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1007:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1008:5: {...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1008:103: ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1009:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1012:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1012:7: {...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1012:16: (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1012:18: otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingle2587); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSingleAccess().getDependsOnKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle2599); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1020:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1021:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1021:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1022:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getDependsOnAnswerCrossReference_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2622);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1042:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1042:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1043:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1043:103: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1044:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1047:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1047:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1047:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1048:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1048:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1049:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingle2695); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1069:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1069:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1070:5: {...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1070:103: ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1071:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1074:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1074:7: {...}? => ( (lv_other_15_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1074:16: ( (lv_other_15_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1075:1: (lv_other_15_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1075:1: (lv_other_15_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1076:3: lv_other_15_0= 'other'
            	    {
            	    lv_other_15_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSingle2780); 

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
            	    break loop13;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingle2845); 

                	newLeafNode(otherlv_16, grammarAccess.getSingleAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1107:1: ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1109:1: ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1109:1: ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1110:2: ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1113:2: ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1114:3: ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1114:3: ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( LA15_0 >=RULE_STRING && LA15_0<=RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_3(), 0) ) {
                    alt15=1;
                }
                else if ( (LA15_0==17||LA15_0==21) && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_3(), 1) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1116:4: ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1116:4: ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1117:5: {...}? => ( ({...}? => ( ( ruleEString ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1117:103: ( ({...}? => ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1118:6: ({...}? => ( ( ruleEString ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1121:6: ({...}? => ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1121:7: {...}? => ( ( ruleEString ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1121:16: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1122:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1122:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1123:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getTemplateOptionCrossReference_3_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2913);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1143:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1143:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1144:5: {...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1144:103: ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1145:6: ({...}? => ( (lv_options_19_0= ruleOption ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1148:6: ({...}? => ( (lv_options_19_0= ruleOption ) ) )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==21) ) {
            	            int LA14_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt14=1;
            	            }


            	        }
            	        else if ( (LA14_0==17) ) {
            	            int LA14_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt14=1;
            	            }


            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1148:7: {...}? => ( (lv_options_19_0= ruleOption ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1148:16: ( (lv_options_19_0= ruleOption ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1149:1: (lv_options_19_0= ruleOption )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1149:1: (lv_options_19_0= ruleOption )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1150:3: lv_options_19_0= ruleOption
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getSingleAccess().getOptionsOptionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingle2988);
            	    	    lv_options_19_0=ruleOption();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getSingleRule());
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
            	    	    if ( cnt14 >= 1 ) break loop14;
            	                EarlyExitException eee =
            	                    new EarlyExitException(14, input);
            	                throw eee;
            	        }
            	        cnt14++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSingleAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSingleAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canLeave(grammarAccess.getSingleAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSingleAccess().getUnorderedGroup_3());
            	

            }

            otherlv_20=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSingle3047); 

                	newLeafNode(otherlv_20, grammarAccess.getSingleAccess().getSingleKeyword_4());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1193:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1194:2: (iv_ruleMultiple= ruleMultiple EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1195:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_entryRuleMultiple3083);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiple3093); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1202:1: ruleMultiple returns [EObject current=null] : (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_22= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) ) )+ {...}?) ) ) otherlv_26= '</multiple>' ) ;
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
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;

        AntlrDatatypeRuleToken lv_lower_13_0 = null;

        AntlrDatatypeRuleToken lv_upper_16_0 = null;

        EObject lv_options_25_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1205:28: ( (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_22= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) ) )+ {...}?) ) ) otherlv_26= '</multiple>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1206:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_22= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) ) )+ {...}?) ) ) otherlv_26= '</multiple>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1206:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_22= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) ) )+ {...}?) ) ) otherlv_26= '</multiple>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1206:3: otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_22= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) ) )+ {...}?) ) ) otherlv_26= '</multiple>'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultiple3130); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1210:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1212:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1212:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1213:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1216:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1217:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1217:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )*
            loop16:
            do {
                int alt16=10;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1219:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1219:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1220:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1220:105: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1221:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1224:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1224:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1224:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1224:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultiple3188); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultipleAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple3200); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1232:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1233:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1233:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1234:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getTitleEStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple3221);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1257:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1257:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1258:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1258:105: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1259:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1262:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1262:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1262:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1262:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple3289); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultipleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple3301); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1270:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1271:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1271:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1272:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getDescriptionEStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple3322);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1295:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1295:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1296:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1296:105: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1297:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1300:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1300:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1300:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1300:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultiple3390); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMultipleAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple3402); 

            	        	newLeafNode(otherlv_9, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1308:1: ( (lv_id_10_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1309:1: (lv_id_10_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1309:1: (lv_id_10_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1310:3: lv_id_10_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getIdEStringParserRuleCall_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple3423);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1333:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1333:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1334:5: {...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1334:105: ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1335:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1338:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1338:7: {...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1338:16: (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1338:18: otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) )
            	    {
            	    otherlv_11=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMultiple3491); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMultipleAccess().getLowerKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple3503); 

            	        	newLeafNode(otherlv_12, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1346:1: ( (lv_lower_13_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1347:1: (lv_lower_13_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1347:1: (lv_lower_13_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1348:3: lv_lower_13_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getLowerEIntParserRuleCall_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultiple3524);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1371:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1371:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1372:5: {...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1372:105: ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1373:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1376:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1376:7: {...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1376:16: (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1376:18: otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) )
            	    {
            	    otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMultiple3592); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMultipleAccess().getUpperKeyword_1_4_0());
            	        
            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple3604); 

            	        	newLeafNode(otherlv_15, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1384:1: ( (lv_upper_16_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1385:1: (lv_upper_16_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1385:1: (lv_upper_16_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1386:3: lv_upper_16_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getUpperEIntParserRuleCall_1_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultiple3625);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1409:4: ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1409:4: ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1410:5: {...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1410:105: ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1411:6: ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1414:6: ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1414:7: {...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1414:16: (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1414:18: otherlv_17= 'dependsOn' ( ( ruleEString ) )
            	    {
            	    otherlv_17=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultiple3693); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMultipleAccess().getDependsOnKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1418:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1419:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1419:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1420:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getDependsOnAnswerCrossReference_1_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple3716);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1440:4: ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1440:4: ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1441:5: {...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1441:105: ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1442:6: ({...}? => ( (lv_required_19_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1445:6: ({...}? => ( (lv_required_19_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1445:7: {...}? => ( (lv_required_19_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1445:16: ( (lv_required_19_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1446:1: (lv_required_19_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1446:1: (lv_required_19_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1447:3: lv_required_19_0= 'required'
            	    {
            	    lv_required_19_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultiple3789); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1467:4: ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1467:4: ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1468:5: {...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1468:105: ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1469:6: ({...}? => ( (lv_other_20_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1472:6: ({...}? => ( (lv_other_20_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1472:7: {...}? => ( (lv_other_20_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1472:16: ( (lv_other_20_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1473:1: (lv_other_20_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1473:1: (lv_other_20_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1474:3: lv_other_20_0= 'other'
            	    {
            	    lv_other_20_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultiple3874); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1494:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1494:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1495:5: {...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1495:105: ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1496:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1499:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1499:7: {...}? => ( (lv_showLimits_21_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1499:16: ( (lv_showLimits_21_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1500:1: (lv_showLimits_21_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1500:1: (lv_showLimits_21_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1501:3: lv_showLimits_21_0= 'showLimits'
            	    {
            	    lv_showLimits_21_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMultiple3959); 

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
            	    break loop16;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultiple4024); 

                	newLeafNode(otherlv_22, grammarAccess.getMultipleAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1532:1: ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1534:1: ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1534:1: ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1535:2: ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1538:2: ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1539:3: ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1539:3: ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( LA18_0 >=RULE_STRING && LA18_0<=RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_3(), 0) ) {
                    alt18=1;
                }
                else if ( (LA18_0==17||LA18_0==21) && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_3(), 1) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1541:4: ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1541:4: ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1542:5: {...}? => ( ({...}? => ( ( ruleEString ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1542:105: ( ({...}? => ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1543:6: ({...}? => ( ( ruleEString ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1546:6: ({...}? => ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1546:7: {...}? => ( ( ruleEString ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1546:16: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1547:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1547:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1548:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getTemplateOptionCrossReference_3_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple4092);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1568:4: ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1568:4: ({...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1569:5: {...}? => ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1569:105: ( ({...}? => ( (lv_options_25_0= ruleOption ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1570:6: ({...}? => ( (lv_options_25_0= ruleOption ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1573:6: ({...}? => ( (lv_options_25_0= ruleOption ) ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==21) ) {
            	            int LA17_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt17=1;
            	            }


            	        }
            	        else if ( (LA17_0==17) ) {
            	            int LA17_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt17=1;
            	            }


            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1573:7: {...}? => ( (lv_options_25_0= ruleOption ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1573:16: ( (lv_options_25_0= ruleOption ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1574:1: (lv_options_25_0= ruleOption )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1574:1: (lv_options_25_0= ruleOption )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1575:3: lv_options_25_0= ruleOption
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getMultipleAccess().getOptionsOptionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultiple4167);
            	    	    lv_options_25_0=ruleOption();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"options",
            	    	            		lv_options_25_0, 
            	    	            		"Option");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultipleAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMultipleAccess().getUnorderedGroup_3());
            	

            }

            otherlv_26=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultiple4226); 

                	newLeafNode(otherlv_26, grammarAccess.getMultipleAccess().getMultipleKeyword_4());
                

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


    // $ANTLR start "entryRuleText"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1618:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1619:2: (iv_ruleText= ruleText EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1620:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText4262);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText4272); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1627:1: ruleText returns [EObject current=null] : ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) ) ) otherlv_17= '/>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1630:28: ( ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) ) ) otherlv_17= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1631:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) ) ) otherlv_17= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1631:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) ) ) otherlv_17= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1631:2: () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) ) ) otherlv_17= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1631:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1632:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleText4318); 

                	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1641:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1643:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1643:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1644:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1647:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1648:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1648:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) ) )*
            loop19:
            do {
                int alt19=7;
                int LA19_0 = input.LA(1);

                if ( LA19_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
                    alt19=2;
                }
                else if ( LA19_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
                    alt19=3;
                }
                else if ( LA19_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
                    alt19=4;
                }
                else if ( LA19_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
                    alt19=5;
                }
                else if ( LA19_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
                    alt19=6;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1650:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1650:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1651:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1651:101: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1652:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1655:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1655:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1655:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1655:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleText4376); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTextAccess().getTitleKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText4388); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTextAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1663:1: ( (lv_title_5_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1664:1: (lv_title_5_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1664:1: (lv_title_5_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1665:3: lv_title_5_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getTitleEStringParserRuleCall_2_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText4409);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1688:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1688:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1689:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1689:101: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1690:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1693:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1693:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1693:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1693:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText4477); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getDescriptionKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText4489); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTextAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1701:1: ( (lv_description_8_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1702:1: (lv_description_8_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1702:1: (lv_description_8_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1703:3: lv_description_8_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getDescriptionEStringParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText4510);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1726:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1726:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1727:5: {...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1727:101: ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1728:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1731:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1731:7: {...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1731:16: (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1731:18: otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleText4578); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTextAccess().getIdKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText4590); 

            	        	newLeafNode(otherlv_10, grammarAccess.getTextAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1739:1: ( (lv_id_11_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1740:1: (lv_id_11_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1740:1: (lv_id_11_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1741:3: lv_id_11_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getIdEStringParserRuleCall_2_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText4611);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1764:4: ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1764:4: ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1765:5: {...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1765:101: ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1766:6: ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1769:6: ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1769:7: {...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1769:16: (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1769:18: otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleText4679); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTextAccess().getDependsOnKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText4691); 

            	        	newLeafNode(otherlv_13, grammarAccess.getTextAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1777:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1778:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1778:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1779:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTextRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getDependsOnAnswerCrossReference_2_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText4714);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1799:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1799:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1800:5: {...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1800:101: ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1801:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1804:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1804:7: {...}? => ( (lv_required_15_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1804:16: ( (lv_required_15_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1805:1: (lv_required_15_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1805:1: (lv_required_15_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1806:3: lv_required_15_0= 'required'
            	    {
            	    lv_required_15_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleText4787); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1826:4: ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1826:4: ({...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1827:5: {...}? => ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1827:101: ( ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1828:6: ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1831:6: ({...}? => ( (lv_multiline_16_0= 'multiline' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1831:7: {...}? => ( (lv_multiline_16_0= 'multiline' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1831:16: ( (lv_multiline_16_0= 'multiline' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1832:1: (lv_multiline_16_0= 'multiline' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1832:1: (lv_multiline_16_0= 'multiline' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1833:3: lv_multiline_16_0= 'multiline'
            	    {
            	    lv_multiline_16_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleText4872); 

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
            	    break loop19;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	

            }

            otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleText4937); 

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


    // $ANTLR start "entryRuleDate"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1872:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1873:2: (iv_ruleDate= ruleDate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1874:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate4973);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate4983); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1881:1: ruleDate returns [EObject current=null] : ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )* ) ) ) otherlv_25= '/>' ) ;
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
        Token lv_required_21_0=null;
        Token lv_day_22_0=null;
        Token lv_month_23_0=null;
        Token lv_year_24_0=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_id_11_0 = null;

        AntlrDatatypeRuleToken lv_from_14_0 = null;

        AntlrDatatypeRuleToken lv_to_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1884:28: ( ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )* ) ) ) otherlv_25= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1885:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )* ) ) ) otherlv_25= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1885:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )* ) ) ) otherlv_25= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1885:2: () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )* ) ) ) otherlv_25= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1885:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1886:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleDate5029); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1895:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1897:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1897:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1898:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1901:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1902:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1902:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )*
            loop20:
            do {
                int alt20=11;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1904:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1904:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1905:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1905:101: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1906:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1909:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1909:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1909:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1909:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDate5087); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getTitleKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate5099); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDateAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1917:1: ( (lv_title_5_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1918:1: (lv_title_5_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1918:1: (lv_title_5_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1919:3: lv_title_5_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getTitleEStringParserRuleCall_2_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate5120);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1942:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1942:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1943:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1943:101: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1944:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate5188); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getDescriptionKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate5200); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDateAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1955:1: ( (lv_description_8_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1956:1: (lv_description_8_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1956:1: (lv_description_8_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1957:3: lv_description_8_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getDescriptionEStringParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate5221);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1980:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1980:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1981:5: {...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1981:101: ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1982:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1985:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1985:7: {...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1985:16: (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1985:18: otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDate5289); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDateAccess().getIdKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate5301); 

            	        	newLeafNode(otherlv_10, grammarAccess.getDateAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1993:1: ( (lv_id_11_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1994:1: (lv_id_11_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1994:1: (lv_id_11_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1995:3: lv_id_11_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getIdEStringParserRuleCall_2_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate5322);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2018:4: ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2018:4: ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2019:5: {...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2019:101: ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2020:6: ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2023:6: ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2023:7: {...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2023:16: (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2023:18: otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDate5390); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDateAccess().getFromKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate5402); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDateAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2031:1: ( (lv_from_14_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2032:1: (lv_from_14_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2032:1: (lv_from_14_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2033:3: lv_from_14_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getFromEStringParserRuleCall_2_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate5423);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2056:4: ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2056:4: ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2057:5: {...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2057:101: ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2058:6: ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2061:6: ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2061:7: {...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2061:16: (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2061:18: otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDate5491); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDateAccess().getToKeyword_2_4_0());
            	        
            	    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate5503); 

            	        	newLeafNode(otherlv_16, grammarAccess.getDateAccess().getEqualsSignKeyword_2_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2069:1: ( (lv_to_17_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2070:1: (lv_to_17_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2070:1: (lv_to_17_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2071:3: lv_to_17_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getToEStringParserRuleCall_2_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate5524);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2094:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2094:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:5: {...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2095:101: ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2096:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2099:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2099:7: {...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2099:16: (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2099:18: otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDate5592); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDateAccess().getDependsOnKeyword_2_5_0());
            	        
            	    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate5604); 

            	        	newLeafNode(otherlv_19, grammarAccess.getDateAccess().getEqualsSignKeyword_2_5_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2107:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2108:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2108:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2109:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getDependsOnAnswerCrossReference_2_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate5627);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2130:5: {...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2130:101: ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2131:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2134:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2134:7: {...}? => ( (lv_required_21_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2134:16: ( (lv_required_21_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2135:1: (lv_required_21_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2135:1: (lv_required_21_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2136:3: lv_required_21_0= 'required'
            	    {
            	    lv_required_21_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDate5700); 

            	            newLeafNode(lv_required_21_0, grammarAccess.getDateAccess().getRequiredRequiredKeyword_2_6_0());
            	        

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
            	case 8 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2156:4: ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2156:4: ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2157:5: {...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2157:101: ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2158:6: ({...}? => ( (lv_day_22_0= 'day' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2161:6: ({...}? => ( (lv_day_22_0= 'day' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2161:7: {...}? => ( (lv_day_22_0= 'day' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2161:16: ( (lv_day_22_0= 'day' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2162:1: (lv_day_22_0= 'day' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2162:1: (lv_day_22_0= 'day' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2163:3: lv_day_22_0= 'day'
            	    {
            	    lv_day_22_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDate5785); 

            	            newLeafNode(lv_day_22_0, grammarAccess.getDateAccess().getDayDayKeyword_2_7_0());
            	        

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
            	case 9 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2183:4: ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2183:4: ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2184:5: {...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2184:101: ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2185:6: ({...}? => ( (lv_month_23_0= 'month' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2188:6: ({...}? => ( (lv_month_23_0= 'month' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2188:7: {...}? => ( (lv_month_23_0= 'month' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2188:16: ( (lv_month_23_0= 'month' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2189:1: (lv_month_23_0= 'month' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2189:1: (lv_month_23_0= 'month' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2190:3: lv_month_23_0= 'month'
            	    {
            	    lv_month_23_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDate5870); 

            	            newLeafNode(lv_month_23_0, grammarAccess.getDateAccess().getMonthMonthKeyword_2_8_0());
            	        

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
            	case 10 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2210:4: ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2210:4: ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2211:5: {...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2211:101: ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2212:6: ({...}? => ( (lv_year_24_0= 'year' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2215:6: ({...}? => ( (lv_year_24_0= 'year' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2215:7: {...}? => ( (lv_year_24_0= 'year' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2215:16: ( (lv_year_24_0= 'year' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2216:1: (lv_year_24_0= 'year' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2216:1: (lv_year_24_0= 'year' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2217:3: lv_year_24_0= 'year'
            	    {
            	    lv_year_24_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDate5955); 

            	            newLeafNode(lv_year_24_0, grammarAccess.getDateAccess().getYearYearKeyword_2_9_0());
            	        

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
            	    break loop20;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	

            }

            otherlv_25=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDate6020); 

                	newLeafNode(otherlv_25, grammarAccess.getDateAccess().getSolidusGreaterThanSignKeyword_3());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2256:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2257:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2258:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber6056);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber6066); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2265:1: ruleNumber returns [EObject current=null] : ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_23= '/>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2268:28: ( ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_23= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2269:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_23= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2269:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_23= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2269:2: () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) ) ) otherlv_23= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2269:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2270:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberAccess().getNumberAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleNumber6112); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getNumberKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2279:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2281:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2281:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2282:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2285:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2286:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2286:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )*
            loop21:
            do {
                int alt21=9;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2288:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2288:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2289:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2289:103: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2290:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2293:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2293:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2293:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2293:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNumber6170); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getTitleKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber6182); 

            	        	newLeafNode(otherlv_4, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2301:1: ( (lv_title_5_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2302:1: (lv_title_5_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2302:1: (lv_title_5_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2303:3: lv_title_5_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getTitleEStringParserRuleCall_2_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber6203);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2326:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2326:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2327:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2327:103: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2328:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2331:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2331:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2331:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2331:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber6271); 

            	        	newLeafNode(otherlv_6, grammarAccess.getNumberAccess().getDescriptionKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber6283); 

            	        	newLeafNode(otherlv_7, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2339:1: ( (lv_description_8_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2340:1: (lv_description_8_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2340:1: (lv_description_8_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2341:3: lv_description_8_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getDescriptionEStringParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber6304);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2364:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2364:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2365:5: {...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2365:103: ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2366:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2369:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2369:7: {...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2369:16: (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2369:18: otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleNumber6372); 

            	        	newLeafNode(otherlv_9, grammarAccess.getNumberAccess().getIdKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber6384); 

            	        	newLeafNode(otherlv_10, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2377:1: ( (lv_id_11_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2378:1: (lv_id_11_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2378:1: (lv_id_11_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2379:3: lv_id_11_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getIdEStringParserRuleCall_2_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber6405);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2402:4: ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2402:4: ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2403:5: {...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2403:103: ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2404:6: ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2407:6: ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2407:7: {...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2407:16: (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2407:18: otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) )
            	    {
            	    otherlv_12=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNumber6473); 

            	        	newLeafNode(otherlv_12, grammarAccess.getNumberAccess().getLowerKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber6485); 

            	        	newLeafNode(otherlv_13, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2415:1: ( (lv_lower_14_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2416:1: (lv_lower_14_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2416:1: (lv_lower_14_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2417:3: lv_lower_14_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getLowerEIntParserRuleCall_2_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber6506);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2440:4: ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2440:4: ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2441:5: {...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2441:103: ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2442:6: ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2445:6: ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2445:7: {...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2445:16: (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2445:18: otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) )
            	    {
            	    otherlv_15=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNumber6574); 

            	        	newLeafNode(otherlv_15, grammarAccess.getNumberAccess().getUpperKeyword_2_4_0());
            	        
            	    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber6586); 

            	        	newLeafNode(otherlv_16, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2453:1: ( (lv_upper_17_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2454:1: (lv_upper_17_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2454:1: (lv_upper_17_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2455:3: lv_upper_17_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getUpperEIntParserRuleCall_2_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber6607);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2478:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2478:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2479:5: {...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2479:103: ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2480:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2483:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2483:7: {...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2483:16: (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2483:18: otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNumber6675); 

            	        	newLeafNode(otherlv_18, grammarAccess.getNumberAccess().getDependsOnKeyword_2_5_0());
            	        
            	    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber6687); 

            	        	newLeafNode(otherlv_19, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_5_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2491:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2492:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2492:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2493:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNumberRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getDependsOnAnswerCrossReference_2_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber6710);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2513:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2513:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2514:5: {...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2514:103: ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2515:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2518:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2518:7: {...}? => ( (lv_required_21_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2518:16: ( (lv_required_21_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2519:1: (lv_required_21_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2519:1: (lv_required_21_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2520:3: lv_required_21_0= 'required'
            	    {
            	    lv_required_21_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNumber6783); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2540:4: ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2540:4: ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2541:5: {...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2541:103: ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2542:6: ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2545:6: ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2545:7: {...}? => ( (lv_showLimits_22_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2545:16: ( (lv_showLimits_22_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2546:1: (lv_showLimits_22_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2546:1: (lv_showLimits_22_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2547:3: lv_showLimits_22_0= 'showLimits'
            	    {
            	    lv_showLimits_22_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleNumber6868); 

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
            	    break loop21;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	

            }

            otherlv_23=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNumber6933); 

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


    // $ANTLR start "entryRuleScale"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2586:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2587:2: (iv_ruleScale= ruleScale EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2588:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScale_in_entryRuleScale6969);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScale6979); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2595:1: ruleScale returns [EObject current=null] : (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2598:28: ( (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2599:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2599:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2599:3: otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleScale7016); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2603:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2605:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2605:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2606:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2609:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2610:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2610:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=10;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2612:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2612:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2613:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2613:102: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2614:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2617:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2617:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2617:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2617:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleScale7074); 

            	        	newLeafNode(otherlv_2, grammarAccess.getScaleAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale7086); 

            	        	newLeafNode(otherlv_3, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2625:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2626:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2626:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2627:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getTitleEStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale7107);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2650:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2650:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2651:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2651:102: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2652:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2655:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2655:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2655:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2655:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale7175); 

            	        	newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale7187); 

            	        	newLeafNode(otherlv_6, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2663:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2664:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2664:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2665:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getDescriptionEStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale7208);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2688:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2688:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2689:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2689:102: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2690:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2693:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2693:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2693:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2693:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleScale7276); 

            	        	newLeafNode(otherlv_8, grammarAccess.getScaleAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale7288); 

            	        	newLeafNode(otherlv_9, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2701:1: ( (lv_id_10_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2702:1: (lv_id_10_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2702:1: (lv_id_10_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2703:3: lv_id_10_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getIdEStringParserRuleCall_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale7309);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2726:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2726:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2727:5: {...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2727:102: ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2728:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2731:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2731:7: {...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2731:16: (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2731:18: otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) )
            	    {
            	    otherlv_11=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleScale7377); 

            	        	newLeafNode(otherlv_11, grammarAccess.getScaleAccess().getLowerKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale7389); 

            	        	newLeafNode(otherlv_12, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2739:1: ( (lv_lower_13_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2740:1: (lv_lower_13_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2740:1: (lv_lower_13_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2741:3: lv_lower_13_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getLowerEIntParserRuleCall_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale7410);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2764:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2764:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2765:5: {...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2765:102: ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2766:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2769:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2769:7: {...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2769:16: (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2769:18: otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) )
            	    {
            	    otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleScale7478); 

            	        	newLeafNode(otherlv_14, grammarAccess.getScaleAccess().getUpperKeyword_1_4_0());
            	        
            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale7490); 

            	        	newLeafNode(otherlv_15, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2777:1: ( (lv_upper_16_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2778:1: (lv_upper_16_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2778:1: (lv_upper_16_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2779:3: lv_upper_16_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getUpperEIntParserRuleCall_1_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale7511);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2802:4: ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2802:4: ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2803:5: {...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2803:102: ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2804:6: ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2807:6: ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2807:7: {...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2807:16: (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2807:18: otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) )
            	    {
            	    otherlv_17=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleScale7579); 

            	        	newLeafNode(otherlv_17, grammarAccess.getScaleAccess().getLowerLabelKeyword_1_5_0());
            	        
            	    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale7591); 

            	        	newLeafNode(otherlv_18, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_5_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2815:1: ( (lv_lowerLabel_19_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2816:1: (lv_lowerLabel_19_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2816:1: (lv_lowerLabel_19_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2817:3: lv_lowerLabel_19_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getLowerLabelEStringParserRuleCall_1_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale7612);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2840:4: ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2840:4: ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2841:5: {...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2841:102: ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2842:6: ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2845:6: ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2845:7: {...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2845:16: (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2845:18: otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) )
            	    {
            	    otherlv_20=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleScale7680); 

            	        	newLeafNode(otherlv_20, grammarAccess.getScaleAccess().getUpperLabelKeyword_1_6_0());
            	        
            	    otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale7692); 

            	        	newLeafNode(otherlv_21, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_6_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2853:1: ( (lv_upperLabel_22_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2854:1: (lv_upperLabel_22_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2854:1: (lv_upperLabel_22_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2855:3: lv_upperLabel_22_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getUpperLabelEStringParserRuleCall_1_6_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale7713);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2878:4: ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2878:4: ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2879:5: {...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2879:102: ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2880:6: ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2883:6: ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2883:7: {...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2883:16: (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2883:18: otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleScale7781); 

            	        	newLeafNode(otherlv_23, grammarAccess.getScaleAccess().getDependsOnKeyword_1_7_0());
            	        
            	    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale7793); 

            	        	newLeafNode(otherlv_24, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_7_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2891:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2892:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2892:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2893:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScaleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getDependsOnAnswerCrossReference_1_7_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale7816);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2913:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2913:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2914:5: {...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2914:102: ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2915:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2918:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2918:7: {...}? => ( (lv_required_26_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2918:16: ( (lv_required_26_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2919:1: (lv_required_26_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2919:1: (lv_required_26_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2920:3: lv_required_26_0= 'required'
            	    {
            	    lv_required_26_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleScale7889); 

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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getScaleAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canLeave(grammarAccess.getScaleAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleScale7960); 

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


    // $ANTLR start "entryRuleTable"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2960:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2961:2: (iv_ruleTable= ruleTable EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2962:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable7996);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable8006); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2969:1: ruleTable returns [EObject current=null] : (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) ) )+ {...}?) ) ) otherlv_24= '</table>' ) ;
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
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;

        EObject lv_options_21_0 = null;

        EObject lv_questions_22_0 = null;

        EObject lv_tableOptions_23_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2972:28: ( (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) ) )+ {...}?) ) ) otherlv_24= '</table>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2973:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) ) )+ {...}?) ) ) otherlv_24= '</table>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2973:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) ) )+ {...}?) ) ) otherlv_24= '</table>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2973:3: otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) ) )+ {...}?) ) ) otherlv_24= '</table>'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTable8043); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2977:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2979:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2979:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2980:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2983:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2984:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2984:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=8;
                int LA23_0 = input.LA(1);

                if ( LA23_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
                    alt23=2;
                }
                else if ( LA23_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
                    alt23=3;
                }
                else if ( LA23_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
                    alt23=4;
                }
                else if ( LA23_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
                    alt23=5;
                }
                else if ( LA23_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
                    alt23=6;
                }
                else if ( LA23_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6) ) {
                    alt23=7;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2986:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2986:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2987:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2987:102: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2988:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2991:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2991:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2991:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2991:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTable8101); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable8113); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2999:1: ( (lv_title_4_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3000:1: (lv_title_4_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3000:1: (lv_title_4_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3001:3: lv_title_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable8134);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3024:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3024:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3025:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3025:102: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3026:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3029:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3029:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3029:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3029:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable8202); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable8214); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTableAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3037:1: ( (lv_description_7_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3038:1: (lv_description_7_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3038:1: (lv_description_7_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3039:3: lv_description_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getDescriptionEStringParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable8235);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3062:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3062:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3063:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3063:102: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3064:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3067:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3067:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3067:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3067:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTable8303); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTableAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable8315); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTableAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3075:1: ( (lv_id_10_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3076:1: (lv_id_10_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3076:1: (lv_id_10_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3077:3: lv_id_10_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getIdEStringParserRuleCall_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable8336);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3100:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3100:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3101:5: {...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3101:102: ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3102:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3105:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3105:7: {...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3105:16: (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3105:18: otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTable8404); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTableAccess().getDependsOnKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable8416); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTableAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3113:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3114:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3114:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3115:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getDependsOnAnswerCrossReference_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable8439);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3135:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3135:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3136:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3136:102: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3137:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3140:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3140:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3140:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3141:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3141:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3142:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTable8512); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3162:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3162:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3163:5: {...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3163:102: ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3164:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3167:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3167:7: {...}? => ( (lv_other_15_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3167:16: ( (lv_other_15_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3168:1: (lv_other_15_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3168:1: (lv_other_15_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3169:3: lv_other_15_0= 'other'
            	    {
            	    lv_other_15_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTable8597); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3189:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3189:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3190:5: {...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3190:102: ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3191:6: ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3194:6: ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3194:7: {...}? => ( (lv_multiple_16_0= 'multiple' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3194:16: ( (lv_multiple_16_0= 'multiple' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3195:1: (lv_multiple_16_0= 'multiple' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3195:1: (lv_multiple_16_0= 'multiple' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3196:3: lv_multiple_16_0= 'multiple'
            	    {
            	    lv_multiple_16_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTable8682); 

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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	

            }

            otherlv_17=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable8753); 

                	newLeafNode(otherlv_17, grammarAccess.getTableAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3228:1: ( ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3230:1: ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3230:1: ( ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3231:2: ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3234:2: ( ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3235:3: ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3235:3: ( ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( LA26_0 >=RULE_STRING && LA26_0<=RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {
                    alt26=1;
                }
                else if ( (LA26_0==17||LA26_0==21||LA26_0==51) && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3237:4: ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3237:4: ({...}? => ( ({...}? => ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3238:5: {...}? => ( ({...}? => ( ( ruleEString ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3238:102: ( ({...}? => ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3239:6: ({...}? => ( ( ruleEString ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3242:6: ({...}? => ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3242:7: {...}? => ( ( ruleEString ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3242:16: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3243:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3243:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3244:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getTemplateOptionCrossReference_3_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable8821);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3264:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3264:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3265:5: {...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3265:102: ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3266:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3269:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) ) )+
            	    int cnt25=0;
            	    loop25:
            	    do {
            	        int alt25=2;
            	        switch ( input.LA(1) ) {
            	        case 21:
            	            {
            	            int LA25_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt25=1;
            	            }


            	            }
            	            break;
            	        case 17:
            	            {
            	            int LA25_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt25=1;
            	            }


            	            }
            	            break;
            	        case 51:
            	            {
            	            int LA25_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt25=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt25) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3269:7: {...}? => ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3269:16: ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3271:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3271:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3272:2: ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?)
            	    	    {
            	    	     
            	    	    	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_3_1());
            	    	    	
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3275:2: ( ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?)
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3276:3: ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+ {...}?
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3276:3: ( ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) ) )+
            	    	    int cnt24=0;
            	    	    loop24:
            	    	    do {
            	    	        int alt24=4;
            	    	        switch ( input.LA(1) ) {
            	    	        case 21:
            	    	            {
            	    	            int LA24_2 = input.LA(2);

            	    	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 0) ) {
            	    	                alt24=1;
            	    	            }
            	    	            else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 2) ) {
            	    	                alt24=3;
            	    	            }


            	    	            }
            	    	            break;
            	    	        case 17:
            	    	            {
            	    	            int LA24_3 = input.LA(2);

            	    	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 0) ) {
            	    	                alt24=1;
            	    	            }
            	    	            else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 2) ) {
            	    	                alt24=3;
            	    	            }


            	    	            }
            	    	            break;
            	    	        case 51:
            	    	            {
            	    	            int LA24_4 = input.LA(2);

            	    	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 1) ) {
            	    	                alt24=2;
            	    	            }


            	    	            }
            	    	            break;

            	    	        }

            	    	        switch (alt24) {
            	    	    	case 1 :
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3278:4: ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) )
            	    	    	    {
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3278:4: ({...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) ) )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3279:5: {...}? => ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) )
            	    	    	    {
            	    	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 0) ) {
            	    	    	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 0)");
            	    	    	    }
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3279:104: ( ({...}? => ( (lv_options_21_0= ruleOption ) ) ) )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3280:6: ({...}? => ( (lv_options_21_0= ruleOption ) ) )
            	    	    	    {
            	    	    	     
            	    	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 0);
            	    	    	    	 				
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3283:6: ({...}? => ( (lv_options_21_0= ruleOption ) ) )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3283:7: {...}? => ( (lv_options_21_0= ruleOption ) )
            	    	    	    {
            	    	    	    if ( !((true)) ) {
            	    	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    	    }
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3283:16: ( (lv_options_21_0= ruleOption ) )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3284:1: (lv_options_21_0= ruleOption )
            	    	    	    {
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3284:1: (lv_options_21_0= ruleOption )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3285:3: lv_options_21_0= ruleOption
            	    	    	    {
            	    	    	     
            	    	    	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_3_1_0_0()); 
            	    	    	    	    
            	    	    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable8941);
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

            	    	    	     
            	    	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3_1());
            	    	    	    	 				

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;
            	    	    	case 2 :
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3308:4: ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) )
            	    	    	    {
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3308:4: ({...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) ) )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3309:5: {...}? => ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) )
            	    	    	    {
            	    	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 1) ) {
            	    	    	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 1)");
            	    	    	    }
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3309:104: ( ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) ) )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3310:6: ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) )
            	    	    	    {
            	    	    	     
            	    	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 1);
            	    	    	    	 				
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3313:6: ({...}? => ( (lv_questions_22_0= ruleTableQuestion ) ) )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3313:7: {...}? => ( (lv_questions_22_0= ruleTableQuestion ) )
            	    	    	    {
            	    	    	    if ( !((true)) ) {
            	    	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    	    }
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3313:16: ( (lv_questions_22_0= ruleTableQuestion ) )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3314:1: (lv_questions_22_0= ruleTableQuestion )
            	    	    	    {
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3314:1: (lv_questions_22_0= ruleTableQuestion )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3315:3: lv_questions_22_0= ruleTableQuestion
            	    	    	    {
            	    	    	     
            	    	    	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_3_1_1_0()); 
            	    	    	    	    
            	    	    	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable9016);
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

            	    	    	     
            	    	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3_1());
            	    	    	    	 				

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;
            	    	    	case 3 :
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3338:4: ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) )
            	    	    	    {
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3338:4: ({...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) ) )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3339:5: {...}? => ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) )
            	    	    	    {
            	    	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 2) ) {
            	    	    	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 2)");
            	    	    	    }
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3339:104: ( ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) ) )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3340:6: ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) )
            	    	    	    {
            	    	    	     
            	    	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), 2);
            	    	    	    	 				
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3343:6: ({...}? => ( (lv_tableOptions_23_0= ruleOption ) ) )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3343:7: {...}? => ( (lv_tableOptions_23_0= ruleOption ) )
            	    	    	    {
            	    	    	    if ( !((true)) ) {
            	    	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    	    }
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3343:16: ( (lv_tableOptions_23_0= ruleOption ) )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3344:1: (lv_tableOptions_23_0= ruleOption )
            	    	    	    {
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3344:1: (lv_tableOptions_23_0= ruleOption )
            	    	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3345:3: lv_tableOptions_23_0= ruleOption
            	    	    	    {
            	    	    	     
            	    	    	    	        newCompositeNode(grammarAccess.getTableAccess().getTableOptionsOptionParserRuleCall_3_1_2_0()); 
            	    	    	    	    
            	    	    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable9091);
            	    	    	    lv_tableOptions_23_0=ruleOption();

            	    	    	    state._fsp--;


            	    	    	    	        if (current==null) {
            	    	    	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	    	    	        }
            	    	    	           		add(
            	    	    	           			current, 
            	    	    	           			"tableOptions",
            	    	    	            		lv_tableOptions_23_0, 
            	    	    	            		"Option");
            	    	    	    	        afterParserOrEnumRuleCall();
            	    	    	    	    

            	    	    	    }


            	    	    	    }


            	    	    	    }

            	    	    	     
            	    	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3_1());
            	    	    	    	 				

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

            	    	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3_1()) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3_1())");
            	    	    }

            	    	    }


            	    	    }

            	    	     
            	    	    	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_3_1());
            	    	    	

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	

            }

            otherlv_24=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTable9196); 

                	newLeafNode(otherlv_24, grammarAccess.getTableAccess().getTableKeyword_4());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3403:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3404:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3405:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt9233);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt9244); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3412:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3415:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3416:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3416:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3416:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3416:2: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3417:2: kw= '-'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEInt9283); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt9300); 

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


    // $ANTLR start "entryRuleTableQuestion"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3437:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3438:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3439:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion9345);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion9355); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3446:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= '<tableQuestion' otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) otherlv_3= '/>' ) ;
    public final EObject ruleTableQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3449:28: ( (otherlv_0= '<tableQuestion' otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) otherlv_3= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3450:1: (otherlv_0= '<tableQuestion' otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) otherlv_3= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3450:1: (otherlv_0= '<tableQuestion' otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) otherlv_3= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3450:3: otherlv_0= '<tableQuestion' otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) otherlv_3= '/>'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTableQuestion9392); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getTableQuestionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTableQuestion9404); 

                	newLeafNode(otherlv_1, grammarAccess.getTableQuestionAccess().getTitleKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3458:1: ( (lv_title_2_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3459:1: (lv_title_2_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3459:1: (lv_title_2_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3460:3: lv_title_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getTitleEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTableQuestion9425);
            lv_title_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTableQuestion9437); 

                	newLeafNode(otherlv_3, grammarAccess.getTableQuestionAccess().getSolidusGreaterThanSignKeyword_3());
                

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


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA16_eotS =
        "\13\uffff";
    static final String DFA16_eofS =
        "\13\uffff";
    static final String DFA16_minS =
        "\1\14\12\uffff";
    static final String DFA16_maxS =
        "\1\41\12\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA16_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\1\3\1\1\2\uffff\1\4\5\uffff\1\7\1\10\2\uffff\1"+
            "\11\2\uffff\1\5\1\6\1\12",
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
            return "()* loopback of 1217:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )*";
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
                        if ( (LA16_0==15) ) {s = 1;}

                        else if ( LA16_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA16_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA16_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA16_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA16_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA16_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA16_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA16_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA16_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
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
    static final String DFA20_eotS =
        "\14\uffff";
    static final String DFA20_eofS =
        "\14\uffff";
    static final String DFA20_minS =
        "\1\14\13\uffff";
    static final String DFA20_maxS =
        "\1\52\13\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA20_specialS =
        "\1\0\13\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\1\uffff\1\1\3\uffff\1\7\1\10\14"+
            "\uffff\1\5\1\6\1\11\1\12\1\13",
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
            return "()* loopback of 1902:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_22_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_23_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_24_0= 'year' ) ) ) ) ) )*";
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
                        if ( (LA20_0==20) ) {s = 1;}

                        else if ( LA20_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA20_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA20_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA20_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA20_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA20_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA20_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA20_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA20_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA20_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                         
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
    static final String DFA21_eotS =
        "\12\uffff";
    static final String DFA21_eofS =
        "\12\uffff";
    static final String DFA21_minS =
        "\1\14\11\uffff";
    static final String DFA21_maxS =
        "\1\41\11\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA21_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\1\uffff\1\1\3\uffff\1\7\1\10\5"+
            "\uffff\1\5\1\6\1\11",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 2286:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_0==20) ) {s = 1;}

                        else if ( LA21_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA21_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA21_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA21_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA21_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA21_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA21_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA21_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
                        input.seek(index21_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\13\uffff";
    static final String DFA22_eofS =
        "\13\uffff";
    static final String DFA22_minS =
        "\1\14\12\uffff";
    static final String DFA22_maxS =
        "\1\56\12\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA22_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\1\uffff\1\1\3\uffff\1\11\1\12\5"+
            "\uffff\1\5\1\6\14\uffff\1\7\1\10",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2610:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_0==20) ) {s = 1;}

                        else if ( LA22_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA22_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA22_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA22_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA22_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA22_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA22_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA22_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA22_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
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
        public static final BitSet FOLLOW_15_in_ruleSurvey377 = new BitSet(new long[]{0x0000982848830000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey399 = new BitSet(new long[]{0x0000982848830000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey426 = new BitSet(new long[]{0x0000982848830000L});
        public static final BitSet FOLLOW_16_in_ruleSurvey440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_entryRuleItem478 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItem488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleItem535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleItem562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleItem589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleItem616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleItem643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleItem670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleItem697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleItem724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion759 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleQuestion816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleQuestion843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleQuestion870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleQuestion897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleQuestion924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleQuestion951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleQuestion978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleOption1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleOption1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1255 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplate1265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleAnswerTemplate1302 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAnswerTemplate1314 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnswerTemplate1326 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswerTemplate1347 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleAnswerTemplate1361 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleAnswerTemplate1382 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_19_in_ruleAnswerTemplate1395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAnswerTemplate1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleAnswer1498 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleAnswer1511 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnswer1523 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1544 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnswer1558 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1579 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAnswer1591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1629 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup1639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleGroup1676 = new BitSet(new long[]{0x000000000300D000L});
        public static final BitSet FOLLOW_12_in_ruleGroup1734 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1746 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1767 = new BitSet(new long[]{0x000000000300D000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1835 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1847 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1868 = new BitSet(new long[]{0x000000000300D000L});
        public static final BitSet FOLLOW_24_in_ruleGroup1936 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1948 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1971 = new BitSet(new long[]{0x000000000300D000L});
        public static final BitSet FOLLOW_25_in_ruleGroup2044 = new BitSet(new long[]{0x000000000300D000L});
        public static final BitSet FOLLOW_15_in_ruleGroup2109 = new BitSet(new long[]{0x0000982848800000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup2130 = new BitSet(new long[]{0x000098284C800000L});
        public static final BitSet FOLLOW_26_in_ruleGroup2143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_entryRuleSingle2179 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingle2189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSingle2226 = new BitSet(new long[]{0x000000001304D000L});
        public static final BitSet FOLLOW_12_in_ruleSingle2284 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle2296 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2317 = new BitSet(new long[]{0x000000001304D000L});
        public static final BitSet FOLLOW_14_in_ruleSingle2385 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle2397 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2418 = new BitSet(new long[]{0x000000001304D000L});
        public static final BitSet FOLLOW_18_in_ruleSingle2486 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle2498 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2519 = new BitSet(new long[]{0x000000001304D000L});
        public static final BitSet FOLLOW_24_in_ruleSingle2587 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle2599 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2622 = new BitSet(new long[]{0x000000001304D000L});
        public static final BitSet FOLLOW_25_in_ruleSingle2695 = new BitSet(new long[]{0x000000001304D000L});
        public static final BitSet FOLLOW_28_in_ruleSingle2780 = new BitSet(new long[]{0x000000001304D000L});
        public static final BitSet FOLLOW_15_in_ruleSingle2845 = new BitSet(new long[]{0x0000982848A20030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2913 = new BitSet(new long[]{0x0000982868A20030L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingle2988 = new BitSet(new long[]{0x0000982868A20030L});
        public static final BitSet FOLLOW_29_in_ruleSingle3047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple3083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiple3093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleMultiple3130 = new BitSet(new long[]{0x000000039304D000L});
        public static final BitSet FOLLOW_12_in_ruleMultiple3188 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple3200 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple3221 = new BitSet(new long[]{0x000000039304D000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple3289 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple3301 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple3322 = new BitSet(new long[]{0x000000039304D000L});
        public static final BitSet FOLLOW_18_in_ruleMultiple3390 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple3402 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple3423 = new BitSet(new long[]{0x000000039304D000L});
        public static final BitSet FOLLOW_31_in_ruleMultiple3491 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple3503 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultiple3524 = new BitSet(new long[]{0x000000039304D000L});
        public static final BitSet FOLLOW_32_in_ruleMultiple3592 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple3604 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultiple3625 = new BitSet(new long[]{0x000000039304D000L});
        public static final BitSet FOLLOW_24_in_ruleMultiple3693 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple3716 = new BitSet(new long[]{0x000000039304D000L});
        public static final BitSet FOLLOW_25_in_ruleMultiple3789 = new BitSet(new long[]{0x000000039304D000L});
        public static final BitSet FOLLOW_28_in_ruleMultiple3874 = new BitSet(new long[]{0x000000039304D000L});
        public static final BitSet FOLLOW_33_in_ruleMultiple3959 = new BitSet(new long[]{0x000000039304D000L});
        public static final BitSet FOLLOW_15_in_ruleMultiple4024 = new BitSet(new long[]{0x0000982848A20030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple4092 = new BitSet(new long[]{0x0000982C48A20030L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultiple4167 = new BitSet(new long[]{0x0000982C48A20030L});
        public static final BitSet FOLLOW_34_in_ruleMultiple4226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText4262 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText4272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleText4318 = new BitSet(new long[]{0x0000001003145000L});
        public static final BitSet FOLLOW_12_in_ruleText4376 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText4388 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText4409 = new BitSet(new long[]{0x0000001003145000L});
        public static final BitSet FOLLOW_14_in_ruleText4477 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText4489 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText4510 = new BitSet(new long[]{0x0000001003145000L});
        public static final BitSet FOLLOW_18_in_ruleText4578 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText4590 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText4611 = new BitSet(new long[]{0x0000001003145000L});
        public static final BitSet FOLLOW_24_in_ruleText4679 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText4691 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText4714 = new BitSet(new long[]{0x0000001003145000L});
        public static final BitSet FOLLOW_25_in_ruleText4787 = new BitSet(new long[]{0x0000001003145000L});
        public static final BitSet FOLLOW_36_in_ruleText4872 = new BitSet(new long[]{0x0000001003145000L});
        public static final BitSet FOLLOW_20_in_ruleText4937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate4973 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate4983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleDate5029 = new BitSet(new long[]{0x000007C003145000L});
        public static final BitSet FOLLOW_12_in_ruleDate5087 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate5099 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate5120 = new BitSet(new long[]{0x000007C003145000L});
        public static final BitSet FOLLOW_14_in_ruleDate5188 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate5200 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate5221 = new BitSet(new long[]{0x000007C003145000L});
        public static final BitSet FOLLOW_18_in_ruleDate5289 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate5301 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate5322 = new BitSet(new long[]{0x000007C003145000L});
        public static final BitSet FOLLOW_38_in_ruleDate5390 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate5402 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate5423 = new BitSet(new long[]{0x000007C003145000L});
        public static final BitSet FOLLOW_39_in_ruleDate5491 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate5503 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate5524 = new BitSet(new long[]{0x000007C003145000L});
        public static final BitSet FOLLOW_24_in_ruleDate5592 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate5604 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate5627 = new BitSet(new long[]{0x000007C003145000L});
        public static final BitSet FOLLOW_25_in_ruleDate5700 = new BitSet(new long[]{0x000007C003145000L});
        public static final BitSet FOLLOW_40_in_ruleDate5785 = new BitSet(new long[]{0x000007C003145000L});
        public static final BitSet FOLLOW_41_in_ruleDate5870 = new BitSet(new long[]{0x000007C003145000L});
        public static final BitSet FOLLOW_42_in_ruleDate5955 = new BitSet(new long[]{0x000007C003145000L});
        public static final BitSet FOLLOW_20_in_ruleDate6020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber6056 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber6066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleNumber6112 = new BitSet(new long[]{0x0000000383145000L});
        public static final BitSet FOLLOW_12_in_ruleNumber6170 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber6182 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber6203 = new BitSet(new long[]{0x0000000383145000L});
        public static final BitSet FOLLOW_14_in_ruleNumber6271 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber6283 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber6304 = new BitSet(new long[]{0x0000000383145000L});
        public static final BitSet FOLLOW_18_in_ruleNumber6372 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber6384 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber6405 = new BitSet(new long[]{0x0000000383145000L});
        public static final BitSet FOLLOW_31_in_ruleNumber6473 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber6485 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber6506 = new BitSet(new long[]{0x0000000383145000L});
        public static final BitSet FOLLOW_32_in_ruleNumber6574 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber6586 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber6607 = new BitSet(new long[]{0x0000000383145000L});
        public static final BitSet FOLLOW_24_in_ruleNumber6675 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber6687 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber6710 = new BitSet(new long[]{0x0000000383145000L});
        public static final BitSet FOLLOW_25_in_ruleNumber6783 = new BitSet(new long[]{0x0000000383145000L});
        public static final BitSet FOLLOW_33_in_ruleNumber6868 = new BitSet(new long[]{0x0000000383145000L});
        public static final BitSet FOLLOW_20_in_ruleNumber6933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_entryRuleScale6969 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScale6979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleScale7016 = new BitSet(new long[]{0x0000600183045000L});
        public static final BitSet FOLLOW_12_in_ruleScale7074 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale7086 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale7107 = new BitSet(new long[]{0x0000600183145000L});
        public static final BitSet FOLLOW_14_in_ruleScale7175 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale7187 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale7208 = new BitSet(new long[]{0x0000600183145000L});
        public static final BitSet FOLLOW_18_in_ruleScale7276 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale7288 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale7309 = new BitSet(new long[]{0x0000600183145000L});
        public static final BitSet FOLLOW_31_in_ruleScale7377 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale7389 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale7410 = new BitSet(new long[]{0x0000600183145000L});
        public static final BitSet FOLLOW_32_in_ruleScale7478 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale7490 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale7511 = new BitSet(new long[]{0x0000600183145000L});
        public static final BitSet FOLLOW_45_in_ruleScale7579 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale7591 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale7612 = new BitSet(new long[]{0x0000600183145000L});
        public static final BitSet FOLLOW_46_in_ruleScale7680 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale7692 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale7713 = new BitSet(new long[]{0x0000600183145000L});
        public static final BitSet FOLLOW_24_in_ruleScale7781 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale7793 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale7816 = new BitSet(new long[]{0x0000600183145000L});
        public static final BitSet FOLLOW_25_in_ruleScale7889 = new BitSet(new long[]{0x0000600183145000L});
        public static final BitSet FOLLOW_20_in_ruleScale7960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable7996 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable8006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTable8043 = new BitSet(new long[]{0x0001000013045000L});
        public static final BitSet FOLLOW_12_in_ruleTable8101 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable8113 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable8134 = new BitSet(new long[]{0x000100001304D000L});
        public static final BitSet FOLLOW_14_in_ruleTable8202 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable8214 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable8235 = new BitSet(new long[]{0x000100001304D000L});
        public static final BitSet FOLLOW_18_in_ruleTable8303 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable8315 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable8336 = new BitSet(new long[]{0x000100001304D000L});
        public static final BitSet FOLLOW_24_in_ruleTable8404 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable8416 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable8439 = new BitSet(new long[]{0x000100001304D000L});
        public static final BitSet FOLLOW_25_in_ruleTable8512 = new BitSet(new long[]{0x000100001304D000L});
        public static final BitSet FOLLOW_28_in_ruleTable8597 = new BitSet(new long[]{0x000100001304D000L});
        public static final BitSet FOLLOW_48_in_ruleTable8682 = new BitSet(new long[]{0x000100001304D000L});
        public static final BitSet FOLLOW_15_in_ruleTable8753 = new BitSet(new long[]{0x0008982848A20030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable8821 = new BitSet(new long[]{0x000A982848A20030L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable8941 = new BitSet(new long[]{0x000A982848A20030L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable9016 = new BitSet(new long[]{0x000A982848A20030L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable9091 = new BitSet(new long[]{0x000A982848A20030L});
        public static final BitSet FOLLOW_49_in_ruleTable9196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt9233 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt9244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEInt9283 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt9300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion9345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion9355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTableQuestion9392 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTableQuestion9404 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTableQuestion9425 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTableQuestion9437 = new BitSet(new long[]{0x0000000000000002L});
    }


}