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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<survey'", "'title'", "'='", "'description'", "'>'", "'</survey>'", "'<template'", "'id'", "'</template>'", "'<templateref'", "'/>'", "'<a'", "'</a>'", "'<group'", "'dependsOn'", "'required'", "'</group>'", "'<text'", "'singleline'", "'single'", "'multi'", "'multiline'", "'<scale'", "'lower'", "'upper'", "'lowerLabel'", "'upperLabel'", "'<date'", "'from'", "'to'", "'showLimits'", "'day'", "'month'", "'year'", "'<number'", "'<single'", "'other'", "'</single>'", "'<multiple'", "'</multiple>'", "'<table'", "'multiple'", "'</table>'", "'-'", "'<q>'", "'</q>'"
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
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:76:1: ruleSurvey returns [EObject current=null] : ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_items_10_0 = null;

        EObject lv_templates_11_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:79:28: ( ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )? )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: () (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:86:2: (otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:86:4: otherlv_1= '<survey' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_9= '>' ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )* otherlv_12= '</survey>'
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey132); 

                        	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getSurveyKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:90:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:92:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:92:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:93:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1());
                    	
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:96:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )* )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )*
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:97:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) )*
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
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:105: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:101:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 0);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:104:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey190); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSurveyAccess().getTitleKeyword_1_1_0_0());
                    	        
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey202); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSurveyAccess().getEqualsSignKeyword_1_1_0_1());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:112:1: ( (lv_title_5_0= RULE_STRING ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:113:1: (lv_title_5_0= RULE_STRING )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:113:1: (lv_title_5_0= RULE_STRING )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:114:3: lv_title_5_0= RULE_STRING
                    	    {
                    	    lv_title_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSurvey219); 

                    	    			newLeafNode(lv_title_5_0, grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_1_1_0_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"title",
                    	            		lv_title_5_0, 
                    	            		"STRING");
                    	    	    

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
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:137:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:137:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:105: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:139:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), 1);
                    	    	 				
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSurvey", "true");
                    	    }
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:142:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey292); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getDescriptionKeyword_1_1_1_0());
                    	        
                    	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey304); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getSurveyAccess().getEqualsSignKeyword_1_1_1_1());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:150:1: ( (lv_description_8_0= RULE_STRING ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:151:1: (lv_description_8_0= RULE_STRING )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:151:1: (lv_description_8_0= RULE_STRING )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:152:3: lv_description_8_0= RULE_STRING
                    	    {
                    	    lv_description_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSurvey321); 

                    	    			newLeafNode(lv_description_8_0, grammarAccess.getSurveyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"description",
                    	            		lv_description_8_0, 
                    	            		"STRING");
                    	    	    

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

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSurvey379); 

                        	newLeafNode(otherlv_9, grammarAccess.getSurveyAccess().getGreaterThanSignKeyword_1_2());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:186:1: ( ( (lv_items_10_0= ruleItem ) ) | ( (lv_templates_11_0= ruleAnswerTemplate ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==24||LA2_0==28||LA2_0==33||LA2_0==38||(LA2_0>=45 && LA2_0<=46)||LA2_0==49||LA2_0==51) ) {
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
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleItem_in_ruleSurvey401);
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
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_ruleSurvey428);
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

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSurvey442); 

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
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_entryRuleItem480);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItem490); 

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
            case 33:
                {
                alt4=3;
                }
                break;
            case 38:
                {
                alt4=4;
                }
                break;
            case 45:
                {
                alt4=5;
                }
                break;
            case 46:
                {
                alt4=6;
                }
                break;
            case 49:
                {
                alt4=7;
                }
                break;
            case 51:
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleItem537);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleItem564);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleItem591);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleItem618);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleItem645);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleItem672);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleItem699);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleItem726);
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
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion761);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion771); 

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
            case 33:
                {
                alt5=2;
                }
                break;
            case 38:
                {
                alt5=3;
                }
                break;
            case 45:
                {
                alt5=4;
                }
                break;
            case 46:
                {
                alt5=5;
                }
                break;
            case 49:
                {
                alt5=6;
                }
                break;
            case 51:
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleQuestion818);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleQuestion845);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleQuestion872);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleQuestion899);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleQuestion926);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleQuestion953);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleQuestion980);
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
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption1015);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption1025); 

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

            if ( (LA6_0==20) ) {
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_ruleOption1072);
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
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleOption1099);
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
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1135);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1146); 

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
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1186); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:486:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1212); 

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
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1257);
            iv_ruleAnswerTemplate=ruleAnswerTemplate();

            state._fsp--;

             current =iv_ruleAnswerTemplate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplate1267); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:510:1: ruleAnswerTemplate returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= RULE_ID ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) ;
    public final EObject ruleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_answers_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:513:28: ( (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= RULE_ID ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= RULE_ID ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= RULE_ID ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:514:3: otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= RULE_ID ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) )+ otherlv_6= '</template>'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswerTemplate1304); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswerTemplate1316); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateAccess().getIdKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnswerTemplate1328); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateAccess().getEqualsSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:526:1: ( (lv_id_3_0= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:527:1: (lv_id_3_0= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:527:1: (lv_id_3_0= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:528:3: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplate1345); 

            			newLeafNode(lv_id_3_0, grammarAccess.getAnswerTemplateAccess().getIdIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnswerTemplate1362); 

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
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleAnswerTemplate1383);
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

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswerTemplate1396); 

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


    // $ANTLR start "entryRuleAnswerTemplateRef"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:578:1: entryRuleAnswerTemplateRef returns [EObject current=null] : iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF ;
    public final EObject entryRuleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplateRef = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:579:2: (iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:580:2: iv_ruleAnswerTemplateRef= ruleAnswerTemplateRef EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef1432);
            iv_ruleAnswerTemplateRef=ruleAnswerTemplateRef();

            state._fsp--;

             current =iv_ruleAnswerTemplateRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplateRef1442); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:587:1: ruleAnswerTemplateRef returns [EObject current=null] : (otherlv_0= '<templateref' otherlv_1= 'id' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '/>' ) ;
    public final EObject ruleAnswerTemplateRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:590:28: ( (otherlv_0= '<templateref' otherlv_1= 'id' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:591:1: (otherlv_0= '<templateref' otherlv_1= 'id' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:591:1: (otherlv_0= '<templateref' otherlv_1= 'id' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:591:3: otherlv_0= '<templateref' otherlv_1= 'id' otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '/>'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswerTemplateRef1479); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateRefAccess().getTemplaterefKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswerTemplateRef1491); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateRefAccess().getIdKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnswerTemplateRef1503); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateRefAccess().getEqualsSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:603:1: ( (otherlv_3= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:604:1: (otherlv_3= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:604:1: (otherlv_3= RULE_ID )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:605:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerTemplateRefRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnswerTemplateRef1523); 

            		newLeafNode(otherlv_3, grammarAccess.getAnswerTemplateRefAccess().getTemplateAnswerTemplateCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswerTemplateRef1535); 

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


    // $ANTLR start "entryRuleAnswer"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:628:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:629:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:630:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer1571);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer1581); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:637:1: ruleAnswer returns [EObject current=null] : (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleLabel ) ) otherlv_6= '</a>' ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_label_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:640:28: ( (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleLabel ) ) otherlv_6= '</a>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:641:1: (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleLabel ) ) otherlv_6= '</a>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:641:1: (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleLabel ) ) otherlv_6= '</a>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:641:3: otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= RULE_STRING ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleLabel ) ) otherlv_6= '</a>'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnswer1618); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:645:1: (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:645:3: otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswer1631); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getIdKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnswer1643); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getEqualsSignKeyword_1_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:653:1: ( (lv_id_3_0= RULE_STRING ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:654:1: (lv_id_3_0= RULE_STRING )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:654:1: (lv_id_3_0= RULE_STRING )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:655:3: lv_id_3_0= RULE_STRING
                    {
                    lv_id_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnswer1660); 

                    			newLeafNode(lv_id_3_0, grammarAccess.getAnswerAccess().getIdSTRINGTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnswer1679); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:675:1: ( (lv_label_5_0= ruleLabel ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:676:1: (lv_label_5_0= ruleLabel )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:676:1: (lv_label_5_0= ruleLabel )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:677:3: lv_label_5_0= ruleLabel
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getLabelLabelParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLabel_in_ruleAnswer1700);
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

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnswer1712); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:705:1: entryRuleLabel returns [String current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final String entryRuleLabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabel = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:706:2: (iv_ruleLabel= ruleLabel EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:707:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLabel_in_entryRuleLabel1749);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLabel1760); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:714:1: ruleLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString (this_EString_1= ruleEString )* ) ;
    public final AntlrDatatypeRuleToken ruleLabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_EString_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:717:28: ( (this_EString_0= ruleEString (this_EString_1= ruleEString )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:718:1: (this_EString_0= ruleEString (this_EString_1= ruleEString )* )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:718:1: (this_EString_0= ruleEString (this_EString_1= ruleEString )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:719:5: this_EString_0= ruleEString (this_EString_1= ruleEString )*
            {
             
                    newCompositeNode(grammarAccess.getLabelAccess().getEStringParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLabel1807);
            this_EString_0=ruleEString();

            state._fsp--;


            		current.merge(this_EString_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:729:1: (this_EString_1= ruleEString )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:730:5: this_EString_1= ruleEString
            	    {
            	     
            	            newCompositeNode(grammarAccess.getLabelAccess().getEStringParserRuleCall_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLabel1835);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:748:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:749:2: (iv_ruleGroup= ruleGroup EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:750:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup1882);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup1892); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:757:1: ruleGroup returns [EObject current=null] : (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_required_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_questions_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:760:28: ( (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:761:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:761:1: (otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:761:3: otherlv_0= '<group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) ) otherlv_12= '>' ( (lv_questions_13_0= ruleQuestion ) )+ otherlv_14= '</group>'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGroup1929); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:765:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:767:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:767:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:768:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:771:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )* )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:772:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )*
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:772:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) ) )*
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
                else if ( LA11_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
                    alt11=4;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:774:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:774:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:775:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:775:102: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:776:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:779:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:779:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:779:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:779:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroup1987); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1999); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:787:1: ( (lv_title_4_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:788:1: (lv_title_4_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:788:1: (lv_title_4_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:789:3: lv_title_4_0= RULE_STRING
            	    {
            	    lv_title_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleGroup2016); 

            	    			newLeafNode(lv_title_4_0, grammarAccess.getGroupAccess().getTitleSTRINGTerminalRuleCall_1_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:812:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:812:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:813:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:813:102: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:814:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:817:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:817:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:817:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:817:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup2089); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup2101); 

            	        	newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:825:1: ( (lv_description_7_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:826:1: (lv_description_7_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:826:1: (lv_description_7_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:827:3: lv_description_7_0= RULE_STRING
            	    {
            	    lv_description_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleGroup2118); 

            	    			newLeafNode(lv_description_7_0, grammarAccess.getGroupAccess().getDescriptionSTRINGTerminalRuleCall_1_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:850:4: ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:850:4: ({...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:851:5: {...}? => ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:851:102: ( ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:852:6: ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:855:6: ({...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:855:7: {...}? => (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:855:16: (otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:855:18: otherlv_8= 'dependsOn' otherlv_9= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGroup2191); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getDependsOnKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup2203); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:863:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:864:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:864:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:865:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getDependsOnAnswerCrossReference_1_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup2226);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:885:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:885:4: ({...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:886:5: {...}? => ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:886:102: ( ({...}? => ( (lv_required_11_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:887:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:890:6: ({...}? => ( (lv_required_11_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:890:7: {...}? => ( (lv_required_11_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:890:16: ( (lv_required_11_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:1: (lv_required_11_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:1: (lv_required_11_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:3: lv_required_11_0= 'required'
            	    {
            	    lv_required_11_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleGroup2299); 

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

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup2364); 

                	newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:923:1: ( (lv_questions_13_0= ruleQuestion ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28||LA12_0==33||LA12_0==38||(LA12_0>=45 && LA12_0<=46)||LA12_0==49||LA12_0==51) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:924:1: (lv_questions_13_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:924:1: (lv_questions_13_0= ruleQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:925:3: lv_questions_13_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleGroup2385);
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

            otherlv_14=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleGroup2398); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:953:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:954:2: (iv_ruleText= ruleText EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:955:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText2434);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText2444); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:962:1: ruleText returns [EObject current=null] : ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_id_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_required_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_multiline_18_1=null;
        Token lv_multiline_18_2=null;
        Token otherlv_19=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:965:28: ( ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:966:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:966:1: ( () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:966:2: () otherlv_1= '<text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:966:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:967:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleText2490); 

                	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:976:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:978:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:978:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:979:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:982:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:983:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:983:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=7;
                int LA15_0 = input.LA(1);

                if ( LA15_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
                    alt15=3;
                }
                else if ( LA15_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
                    alt15=4;
                }
                else if ( LA15_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
                    alt15=5;
                }
                else if ( LA15_0 >=29 && LA15_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
                    alt15=6;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:985:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:985:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:986:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:986:101: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:987:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:990:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:990:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:990:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:990:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleText2548); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTextAccess().getTitleKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2560); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTextAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:998:1: ( (lv_title_5_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:999:1: (lv_title_5_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:999:1: (lv_title_5_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1000:3: lv_title_5_0= RULE_STRING
            	    {
            	    lv_title_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleText2577); 

            	    			newLeafNode(lv_title_5_0, grammarAccess.getTextAccess().getTitleSTRINGTerminalRuleCall_2_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTextRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"title",
            	            		lv_title_5_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1023:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1023:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1024:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1024:101: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1025:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1028:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1028:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1028:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1028:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText2650); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getDescriptionKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2662); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTextAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1036:1: ( (lv_description_8_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1037:1: (lv_description_8_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1037:1: (lv_description_8_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1038:3: lv_description_8_0= RULE_STRING
            	    {
            	    lv_description_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleText2679); 

            	    			newLeafNode(lv_description_8_0, grammarAccess.getTextAccess().getDescriptionSTRINGTerminalRuleCall_2_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTextRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_8_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1061:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1061:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1062:5: {...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1062:101: ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1063:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1066:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1066:7: {...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1066:16: (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1066:18: otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleText2752); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTextAccess().getIdKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2764); 

            	        	newLeafNode(otherlv_10, grammarAccess.getTextAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1074:1: ( (lv_id_11_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1075:1: (lv_id_11_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1075:1: (lv_id_11_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1076:3: lv_id_11_0= RULE_STRING
            	    {
            	    lv_id_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleText2781); 

            	    			newLeafNode(lv_id_11_0, grammarAccess.getTextAccess().getIdSTRINGTerminalRuleCall_2_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTextRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_11_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1099:4: ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1099:4: ({...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1100:5: {...}? => ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1100:101: ( ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1101:6: ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1104:6: ({...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1104:7: {...}? => (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1104:16: (otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1104:18: otherlv_12= 'dependsOn' otherlv_13= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleText2854); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTextAccess().getDependsOnKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2866); 

            	        	newLeafNode(otherlv_13, grammarAccess.getTextAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1112:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1113:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1113:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1114:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTextRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getDependsOnAnswerCrossReference_2_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2889);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1134:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1134:4: ({...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1135:5: {...}? => ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1135:101: ( ({...}? => ( (lv_required_15_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1136:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1139:6: ({...}? => ( (lv_required_15_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1139:7: {...}? => ( (lv_required_15_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1139:16: ( (lv_required_15_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1140:1: (lv_required_15_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1140:1: (lv_required_15_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1141:3: lv_required_15_0= 'required'
            	    {
            	    lv_required_15_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleText2962); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1161:4: ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1161:4: ({...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1162:5: {...}? => ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1162:101: ( ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1163:6: ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1166:6: ({...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1166:7: {...}? => (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1166:16: (otherlv_16= 'singleline' | otherlv_17= 'single' | ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) ) )
            	    int alt14=3;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 31:
            	    case 32:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1166:18: otherlv_16= 'singleline'
            	            {
            	            otherlv_16=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleText3042); 

            	                	newLeafNode(otherlv_16, grammarAccess.getTextAccess().getSinglelineKeyword_2_5_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1171:7: otherlv_17= 'single'
            	            {
            	            otherlv_17=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleText3060); 

            	                	newLeafNode(otherlv_17, grammarAccess.getTextAccess().getSingleKeyword_2_5_1());
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1176:6: ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1176:6: ( ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1177:1: ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1177:1: ( (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' ) )
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1178:1: (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' )
            	            {
            	            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1178:1: (lv_multiline_18_1= 'multi' | lv_multiline_18_2= 'multiline' )
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==31) ) {
            	                alt13=1;
            	            }
            	            else if ( (LA13_0==32) ) {
            	                alt13=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 13, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1179:3: lv_multiline_18_1= 'multi'
            	                    {
            	                    lv_multiline_18_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleText3086); 

            	                            newLeafNode(lv_multiline_18_1, grammarAccess.getTextAccess().getMultilineMultiKeyword_2_5_2_0_0());
            	                        

            	                    	        if (current==null) {
            	                    	            current = createModelElement(grammarAccess.getTextRule());
            	                    	        }
            	                           		setWithLastConsumed(current, "multiline", true, null);
            	                    	    

            	                    }
            	                    break;
            	                case 2 :
            	                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1191:8: lv_multiline_18_2= 'multiline'
            	                    {
            	                    lv_multiline_18_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleText3115); 

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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTextAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canLeave(grammarAccess.getTextAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	

            }

            otherlv_19=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleText3190); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1233:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1234:2: (iv_ruleScale= ruleScale EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1235:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScale_in_entryRuleScale3226);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScale3236); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1242:1: ruleScale returns [EObject current=null] : (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) ;
    public final EObject ruleScale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_id_10_0=null;
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
        AntlrDatatypeRuleToken lv_lower_13_0 = null;

        AntlrDatatypeRuleToken lv_upper_16_0 = null;

        AntlrDatatypeRuleToken lv_lowerLabel_19_0 = null;

        AntlrDatatypeRuleToken lv_upperLabel_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1245:28: ( (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1246:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1246:1: (otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1246:3: otherlv_0= '<scale' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '/>'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleScale3273); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1250:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1252:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1252:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1253:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1256:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1257:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1257:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=10;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1259:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1259:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1260:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1260:102: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1261:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1264:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1264:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1264:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1264:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleScale3331); 

            	        	newLeafNode(otherlv_2, grammarAccess.getScaleAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3343); 

            	        	newLeafNode(otherlv_3, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1272:1: ( (lv_title_4_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1273:1: (lv_title_4_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1273:1: (lv_title_4_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1274:3: lv_title_4_0= RULE_STRING
            	    {
            	    lv_title_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleScale3360); 

            	    			newLeafNode(lv_title_4_0, grammarAccess.getScaleAccess().getTitleSTRINGTerminalRuleCall_1_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScaleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1297:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1297:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1298:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1298:102: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1299:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1302:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1302:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1302:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1302:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale3433); 

            	        	newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3445); 

            	        	newLeafNode(otherlv_6, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1310:1: ( (lv_description_7_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1311:1: (lv_description_7_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1311:1: (lv_description_7_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1312:3: lv_description_7_0= RULE_STRING
            	    {
            	    lv_description_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleScale3462); 

            	    			newLeafNode(lv_description_7_0, grammarAccess.getScaleAccess().getDescriptionSTRINGTerminalRuleCall_1_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScaleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1335:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1335:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1336:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1336:102: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1337:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1340:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1340:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1340:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1340:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleScale3535); 

            	        	newLeafNode(otherlv_8, grammarAccess.getScaleAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3547); 

            	        	newLeafNode(otherlv_9, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1348:1: ( (lv_id_10_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1349:1: (lv_id_10_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1349:1: (lv_id_10_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1350:3: lv_id_10_0= RULE_STRING
            	    {
            	    lv_id_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleScale3564); 

            	    			newLeafNode(lv_id_10_0, grammarAccess.getScaleAccess().getIdSTRINGTerminalRuleCall_1_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScaleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_10_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1373:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1373:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1374:5: {...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1374:102: ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1375:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1378:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1378:7: {...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1378:16: (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1378:18: otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) )
            	    {
            	    otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleScale3637); 

            	        	newLeafNode(otherlv_11, grammarAccess.getScaleAccess().getLowerKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3649); 

            	        	newLeafNode(otherlv_12, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1386:1: ( (lv_lower_13_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1387:1: (lv_lower_13_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1387:1: (lv_lower_13_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1388:3: lv_lower_13_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getLowerEIntParserRuleCall_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3670);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1411:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1411:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1412:5: {...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1412:102: ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1413:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1416:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1416:7: {...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1416:16: (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1416:18: otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) )
            	    {
            	    otherlv_14=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleScale3738); 

            	        	newLeafNode(otherlv_14, grammarAccess.getScaleAccess().getUpperKeyword_1_4_0());
            	        
            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3750); 

            	        	newLeafNode(otherlv_15, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1424:1: ( (lv_upper_16_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1425:1: (lv_upper_16_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1425:1: (lv_upper_16_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1426:3: lv_upper_16_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getUpperEIntParserRuleCall_1_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale3771);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1449:4: ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1449:4: ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1450:5: {...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1450:102: ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1451:6: ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1454:6: ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1454:7: {...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1454:16: (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1454:18: otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) )
            	    {
            	    otherlv_17=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleScale3839); 

            	        	newLeafNode(otherlv_17, grammarAccess.getScaleAccess().getLowerLabelKeyword_1_5_0());
            	        
            	    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3851); 

            	        	newLeafNode(otherlv_18, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_5_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1462:1: ( (lv_lowerLabel_19_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1463:1: (lv_lowerLabel_19_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1463:1: (lv_lowerLabel_19_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1464:3: lv_lowerLabel_19_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getLowerLabelEStringParserRuleCall_1_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3872);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1487:4: ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1487:4: ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1488:5: {...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1488:102: ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1489:6: ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1492:6: ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1492:7: {...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1492:16: (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1492:18: otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) )
            	    {
            	    otherlv_20=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleScale3940); 

            	        	newLeafNode(otherlv_20, grammarAccess.getScaleAccess().getUpperLabelKeyword_1_6_0());
            	        
            	    otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale3952); 

            	        	newLeafNode(otherlv_21, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_6_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1500:1: ( (lv_upperLabel_22_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1501:1: (lv_upperLabel_22_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1501:1: (lv_upperLabel_22_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1502:3: lv_upperLabel_22_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getUpperLabelEStringParserRuleCall_1_6_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale3973);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1525:4: ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1525:4: ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1526:5: {...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1526:102: ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1527:6: ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1530:6: ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1530:7: {...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1530:16: (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1530:18: otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_23=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleScale4041); 

            	        	newLeafNode(otherlv_23, grammarAccess.getScaleAccess().getDependsOnKeyword_1_7_0());
            	        
            	    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale4053); 

            	        	newLeafNode(otherlv_24, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_7_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1538:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1539:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1539:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1540:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getScaleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getScaleAccess().getDependsOnAnswerCrossReference_1_7_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4076);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1560:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1560:4: ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1561:5: {...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1561:102: ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1562:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1565:6: ({...}? => ( (lv_required_26_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1565:7: {...}? => ( (lv_required_26_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleScale", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1565:16: ( (lv_required_26_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1566:1: (lv_required_26_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1566:1: (lv_required_26_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1567:3: lv_required_26_0= 'required'
            	    {
            	    lv_required_26_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleScale4149); 

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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getScaleAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleScale", "getUnorderedGroupHelper().canLeave(grammarAccess.getScaleAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getScaleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_27=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleScale4220); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1607:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1608:2: (iv_ruleDate= ruleDate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1609:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate4256);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate4266); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1616:1: ruleDate returns [EObject current=null] : ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_id_11_0=null;
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
        AntlrDatatypeRuleToken lv_from_14_0 = null;

        AntlrDatatypeRuleToken lv_to_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1619:28: ( ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1620:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1620:1: ( () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1620:2: () otherlv_1= '<date' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) ) otherlv_26= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1620:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1621:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDate4312); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1630:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1632:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1632:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1633:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDateAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1636:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1637:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1637:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=12;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1639:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1639:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1640:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1640:101: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1641:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1644:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1644:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1644:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1644:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDate4370); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getTitleKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4382); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDateAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1652:1: ( (lv_title_5_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1653:1: (lv_title_5_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1653:1: (lv_title_5_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1654:3: lv_title_5_0= RULE_STRING
            	    {
            	    lv_title_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDate4399); 

            	    			newLeafNode(lv_title_5_0, grammarAccess.getDateAccess().getTitleSTRINGTerminalRuleCall_2_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"title",
            	            		lv_title_5_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1677:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1677:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1678:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1678:101: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1679:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1682:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1682:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1682:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1682:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate4472); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getDescriptionKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4484); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDateAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1690:1: ( (lv_description_8_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1691:1: (lv_description_8_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1691:1: (lv_description_8_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1692:3: lv_description_8_0= RULE_STRING
            	    {
            	    lv_description_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDate4501); 

            	    			newLeafNode(lv_description_8_0, grammarAccess.getDateAccess().getDescriptionSTRINGTerminalRuleCall_2_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_8_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1715:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1715:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1716:5: {...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1716:101: ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1717:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1720:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1720:7: {...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1720:16: (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1720:18: otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDate4574); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDateAccess().getIdKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4586); 

            	        	newLeafNode(otherlv_10, grammarAccess.getDateAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1728:1: ( (lv_id_11_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1729:1: (lv_id_11_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1729:1: (lv_id_11_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1730:3: lv_id_11_0= RULE_STRING
            	    {
            	    lv_id_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDate4603); 

            	    			newLeafNode(lv_id_11_0, grammarAccess.getDateAccess().getIdSTRINGTerminalRuleCall_2_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_11_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1753:4: ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1753:4: ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1754:5: {...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1754:101: ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1755:6: ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1758:6: ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1758:7: {...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1758:16: (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1758:18: otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDate4676); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDateAccess().getFromKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4688); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDateAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1766:1: ( (lv_from_14_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1767:1: (lv_from_14_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1767:1: (lv_from_14_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1768:3: lv_from_14_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getFromEStringParserRuleCall_2_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4709);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1791:4: ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1791:4: ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1792:5: {...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1792:101: ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1793:6: ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1796:6: ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1796:7: {...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1796:16: (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1796:18: otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDate4777); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDateAccess().getToKeyword_2_4_0());
            	        
            	    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4789); 

            	        	newLeafNode(otherlv_16, grammarAccess.getDateAccess().getEqualsSignKeyword_2_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1804:1: ( (lv_to_17_0= ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1805:1: (lv_to_17_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1805:1: (lv_to_17_0= ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1806:3: lv_to_17_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getToEStringParserRuleCall_2_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4810);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1829:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1829:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1830:5: {...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1830:101: ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1831:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1834:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1834:7: {...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1834:16: (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1834:18: otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDate4878); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDateAccess().getDependsOnKeyword_2_5_0());
            	        
            	    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate4890); 

            	        	newLeafNode(otherlv_19, grammarAccess.getDateAccess().getEqualsSignKeyword_2_5_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1842:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1843:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1843:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1844:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getDateAccess().getDependsOnAnswerCrossReference_2_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate4913);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1864:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1864:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1865:5: {...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1865:101: ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1866:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1869:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1869:7: {...}? => ( (lv_showLimits_21_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1869:16: ( (lv_showLimits_21_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1870:1: (lv_showLimits_21_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1870:1: (lv_showLimits_21_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1871:3: lv_showLimits_21_0= 'showLimits'
            	    {
            	    lv_showLimits_21_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDate4986); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1891:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1891:4: ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1892:5: {...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1892:101: ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1893:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1896:6: ({...}? => ( (lv_required_22_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1896:7: {...}? => ( (lv_required_22_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1896:16: ( (lv_required_22_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1897:1: (lv_required_22_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1897:1: (lv_required_22_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1898:3: lv_required_22_0= 'required'
            	    {
            	    lv_required_22_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDate5071); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1918:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1918:4: ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1919:5: {...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1919:101: ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1920:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1923:6: ({...}? => ( (lv_day_23_0= 'day' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1923:7: {...}? => ( (lv_day_23_0= 'day' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1923:16: ( (lv_day_23_0= 'day' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1924:1: (lv_day_23_0= 'day' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1924:1: (lv_day_23_0= 'day' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1925:3: lv_day_23_0= 'day'
            	    {
            	    lv_day_23_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDate5156); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1945:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1945:4: ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1946:5: {...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1946:101: ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1950:6: ({...}? => ( (lv_month_24_0= 'month' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1950:7: {...}? => ( (lv_month_24_0= 'month' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1950:16: ( (lv_month_24_0= 'month' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1951:1: (lv_month_24_0= 'month' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1951:1: (lv_month_24_0= 'month' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1952:3: lv_month_24_0= 'month'
            	    {
            	    lv_month_24_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDate5241); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1972:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1972:4: ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1973:5: {...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1973:102: ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1974:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1977:6: ({...}? => ( (lv_year_25_0= 'year' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1977:7: {...}? => ( (lv_year_25_0= 'year' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDate", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1977:16: ( (lv_year_25_0= 'year' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1978:1: (lv_year_25_0= 'year' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1978:1: (lv_year_25_0= 'year' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1979:3: lv_year_25_0= 'year'
            	    {
            	    lv_year_25_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDate5326); 

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

            otherlv_26=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDate5397); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2019:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2020:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2021:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber5433);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber5443); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2028:1: ruleNumber returns [EObject current=null] : ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_id_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_required_21_0=null;
        Token lv_showLimits_22_0=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_lower_14_0 = null;

        AntlrDatatypeRuleToken lv_upper_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2031:28: ( ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2032:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2032:1: ( () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2032:2: () otherlv_1= '<number' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_23= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2032:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2033:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberAccess().getNumberAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleNumber5489); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getNumberKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2042:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2044:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2044:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2045:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2048:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2049:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2049:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=9;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2051:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2051:4: ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2052:5: {...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2052:103: ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2053:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2056:6: ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2056:7: {...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2056:16: (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2056:18: otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNumber5547); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getTitleKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5559); 

            	        	newLeafNode(otherlv_4, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2064:1: ( (lv_title_5_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2065:1: (lv_title_5_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2065:1: (lv_title_5_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2066:3: lv_title_5_0= RULE_STRING
            	    {
            	    lv_title_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleNumber5576); 

            	    			newLeafNode(lv_title_5_0, grammarAccess.getNumberAccess().getTitleSTRINGTerminalRuleCall_2_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNumberRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"title",
            	            		lv_title_5_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2089:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2089:4: ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2090:5: {...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2090:103: ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2091:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2094:6: ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2094:7: {...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2094:16: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2094:18: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber5649); 

            	        	newLeafNode(otherlv_6, grammarAccess.getNumberAccess().getDescriptionKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5661); 

            	        	newLeafNode(otherlv_7, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2102:1: ( (lv_description_8_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2103:1: (lv_description_8_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2103:1: (lv_description_8_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2104:3: lv_description_8_0= RULE_STRING
            	    {
            	    lv_description_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleNumber5678); 

            	    			newLeafNode(lv_description_8_0, grammarAccess.getNumberAccess().getDescriptionSTRINGTerminalRuleCall_2_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNumberRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_8_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2127:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2127:4: ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2128:5: {...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2128:103: ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2132:6: ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2132:7: {...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2132:16: (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2132:18: otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleNumber5751); 

            	        	newLeafNode(otherlv_9, grammarAccess.getNumberAccess().getIdKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5763); 

            	        	newLeafNode(otherlv_10, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2140:1: ( (lv_id_11_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2141:1: (lv_id_11_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2141:1: (lv_id_11_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2142:3: lv_id_11_0= RULE_STRING
            	    {
            	    lv_id_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleNumber5780); 

            	    			newLeafNode(lv_id_11_0, grammarAccess.getNumberAccess().getIdSTRINGTerminalRuleCall_2_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNumberRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_11_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2165:4: ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2165:4: ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2166:5: {...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2166:103: ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2167:6: ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2170:6: ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2170:7: {...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2170:16: (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2170:18: otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) )
            	    {
            	    otherlv_12=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNumber5853); 

            	        	newLeafNode(otherlv_12, grammarAccess.getNumberAccess().getLowerKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5865); 

            	        	newLeafNode(otherlv_13, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2178:1: ( (lv_lower_14_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2179:1: (lv_lower_14_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2179:1: (lv_lower_14_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2180:3: lv_lower_14_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getLowerEIntParserRuleCall_2_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5886);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2203:4: ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2203:4: ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2204:5: {...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2204:103: ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2205:6: ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2208:6: ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2208:7: {...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2208:16: (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2208:18: otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) )
            	    {
            	    otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleNumber5954); 

            	        	newLeafNode(otherlv_15, grammarAccess.getNumberAccess().getUpperKeyword_2_4_0());
            	        
            	    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber5966); 

            	        	newLeafNode(otherlv_16, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2216:1: ( (lv_upper_17_0= ruleEInt ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2217:1: (lv_upper_17_0= ruleEInt )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2217:1: (lv_upper_17_0= ruleEInt )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2218:3: lv_upper_17_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getUpperEIntParserRuleCall_2_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber5987);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2241:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2241:4: ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2242:5: {...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2242:103: ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2243:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2246:6: ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2246:7: {...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2246:16: (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2246:18: otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNumber6055); 

            	        	newLeafNode(otherlv_18, grammarAccess.getNumberAccess().getDependsOnKeyword_2_5_0());
            	        
            	    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber6067); 

            	        	newLeafNode(otherlv_19, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_5_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2254:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2255:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2255:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2256:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNumberRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getNumberAccess().getDependsOnAnswerCrossReference_2_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber6090);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2276:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2276:4: ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2277:5: {...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2277:103: ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2278:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2281:6: ({...}? => ( (lv_required_21_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2281:7: {...}? => ( (lv_required_21_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2281:16: ( (lv_required_21_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2282:1: (lv_required_21_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2282:1: (lv_required_21_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2283:3: lv_required_21_0= 'required'
            	    {
            	    lv_required_21_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNumber6163); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2303:4: ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2303:4: ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2304:5: {...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2304:103: ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2305:6: ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2308:6: ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2308:7: {...}? => ( (lv_showLimits_22_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumber", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2308:16: ( (lv_showLimits_22_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2309:1: (lv_showLimits_22_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2309:1: (lv_showLimits_22_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2310:3: lv_showLimits_22_0= 'showLimits'
            	    {
            	    lv_showLimits_22_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNumber6248); 

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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNumberAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleNumber", "getUnorderedGroupHelper().canLeave(grammarAccess.getNumberAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNumberAccess().getUnorderedGroup_2());
            	

            }

            otherlv_23=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNumber6319); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2350:1: entryRuleSingle returns [EObject current=null] : iv_ruleSingle= ruleSingle EOF ;
    public final EObject entryRuleSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingle = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2351:2: (iv_ruleSingle= ruleSingle EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2352:2: iv_ruleSingle= ruleSingle EOF
            {
             newCompositeNode(grammarAccess.getSingleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingle_in_entryRuleSingle6355);
            iv_ruleSingle=ruleSingle();

            state._fsp--;

             current =iv_ruleSingle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingle6365); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2359:1: ruleSingle returns [EObject current=null] : (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' ) ;
    public final EObject ruleSingle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_id_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_required_14_0=null;
        Token lv_other_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_options_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2362:28: ( (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2363:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2363:1: (otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2363:3: otherlv_0= '<single' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) ) otherlv_16= '>' ( (lv_options_17_0= ruleOption ) )+ otherlv_18= '</single>'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleSingle6402); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2367:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2369:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2369:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2370:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2373:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2374:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2374:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=7;
                int LA19_0 = input.LA(1);

                if ( LA19_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1) ) {
                    alt19=2;
                }
                else if ( LA19_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2) ) {
                    alt19=3;
                }
                else if ( LA19_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3) ) {
                    alt19=4;
                }
                else if ( LA19_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4) ) {
                    alt19=5;
                }
                else if ( LA19_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5) ) {
                    alt19=6;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2376:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2376:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2377:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2377:103: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2378:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2381:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2381:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2381:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2381:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSingle6460); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSingleAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle6472); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2389:1: ( (lv_title_4_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2390:1: (lv_title_4_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2390:1: (lv_title_4_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2391:3: lv_title_4_0= RULE_STRING
            	    {
            	    lv_title_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSingle6489); 

            	    			newLeafNode(lv_title_4_0, grammarAccess.getSingleAccess().getTitleSTRINGTerminalRuleCall_1_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2414:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2414:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2415:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2415:103: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2416:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2419:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2419:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2419:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2419:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle6562); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSingleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle6574); 

            	        	newLeafNode(otherlv_6, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2427:1: ( (lv_description_7_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2428:1: (lv_description_7_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2428:1: (lv_description_7_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2429:3: lv_description_7_0= RULE_STRING
            	    {
            	    lv_description_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSingle6591); 

            	    			newLeafNode(lv_description_7_0, grammarAccess.getSingleAccess().getDescriptionSTRINGTerminalRuleCall_1_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2452:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2452:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2453:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2453:103: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2454:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2457:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2457:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2457:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2457:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSingle6664); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSingleAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle6676); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2465:1: ( (lv_id_10_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2466:1: (lv_id_10_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2466:1: (lv_id_10_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2467:3: lv_id_10_0= RULE_STRING
            	    {
            	    lv_id_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSingle6693); 

            	    			newLeafNode(lv_id_10_0, grammarAccess.getSingleAccess().getIdSTRINGTerminalRuleCall_1_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_10_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2490:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2490:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2491:5: {...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2491:103: ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2492:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2495:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2495:7: {...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2495:16: (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2495:18: otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingle6766); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSingleAccess().getDependsOnKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle6778); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2503:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2504:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2504:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2505:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSingleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getDependsOnAnswerCrossReference_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle6801);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2525:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2525:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2526:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2526:103: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2527:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2530:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2530:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2530:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2531:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2531:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2532:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingle6874); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2552:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2552:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2553:5: {...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canSelect(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2553:103: ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2554:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSingleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2557:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2557:7: {...}? => ( (lv_other_15_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSingle", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2557:16: ( (lv_other_15_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2558:1: (lv_other_15_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2558:1: (lv_other_15_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2559:3: lv_other_15_0= 'other'
            	    {
            	    lv_other_15_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleSingle6959); 

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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSingleAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleSingle", "getUnorderedGroupHelper().canLeave(grammarAccess.getSingleAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSingleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingle7030); 

                	newLeafNode(otherlv_16, grammarAccess.getSingleAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2591:1: ( (lv_options_17_0= ruleOption ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20||LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2592:1: (lv_options_17_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2592:1: (lv_options_17_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2593:3: lv_options_17_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingle7051);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_18=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleSingle7064); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2621:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2622:2: (iv_ruleMultiple= ruleMultiple EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2623:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_entryRuleMultiple7100);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiple7110); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2630:1: ruleMultiple returns [EObject current=null] : (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>' ) ;
    public final EObject ruleMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_id_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_lower_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_upper_16_0=null;
        Token otherlv_17=null;
        Token lv_required_19_0=null;
        Token lv_other_20_0=null;
        Token lv_showLimits_21_0=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_options_23_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2633:28: ( (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2634:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2634:1: (otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2634:3: otherlv_0= '<multiple' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) ) otherlv_22= '>' ( (lv_options_23_0= ruleOption ) )+ otherlv_24= '</multiple>'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleMultiple7147); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2638:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2640:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2640:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2641:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2644:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2645:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2645:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=10;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2647:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2647:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2648:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2648:105: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2649:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2652:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2652:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2652:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2652:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultiple7205); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultipleAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple7217); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2660:1: ( (lv_title_4_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2661:1: (lv_title_4_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2661:1: (lv_title_4_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2662:3: lv_title_4_0= RULE_STRING
            	    {
            	    lv_title_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMultiple7234); 

            	    			newLeafNode(lv_title_4_0, grammarAccess.getMultipleAccess().getTitleSTRINGTerminalRuleCall_1_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2685:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2685:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2686:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2686:105: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2687:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2690:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2690:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2690:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2690:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple7307); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultipleAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple7319); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2698:1: ( (lv_description_7_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2699:1: (lv_description_7_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2699:1: (lv_description_7_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2700:3: lv_description_7_0= RULE_STRING
            	    {
            	    lv_description_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMultiple7336); 

            	    			newLeafNode(lv_description_7_0, grammarAccess.getMultipleAccess().getDescriptionSTRINGTerminalRuleCall_1_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2723:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2723:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2724:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2724:105: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2725:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2728:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2728:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2728:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2728:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultiple7409); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMultipleAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple7421); 

            	        	newLeafNode(otherlv_9, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2736:1: ( (lv_id_10_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2737:1: (lv_id_10_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2737:1: (lv_id_10_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2738:3: lv_id_10_0= RULE_STRING
            	    {
            	    lv_id_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMultiple7438); 

            	    			newLeafNode(lv_id_10_0, grammarAccess.getMultipleAccess().getIdSTRINGTerminalRuleCall_1_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_10_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2761:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2761:4: ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2762:5: {...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2762:105: ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2763:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2766:6: ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2766:7: {...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2766:16: (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2766:18: otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) )
            	    {
            	    otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultiple7511); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMultipleAccess().getLowerKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple7523); 

            	        	newLeafNode(otherlv_12, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2774:1: ( (lv_lower_13_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2775:1: (lv_lower_13_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2775:1: (lv_lower_13_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2776:3: lv_lower_13_0= RULE_INT
            	    {
            	    lv_lower_13_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultiple7540); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2799:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2799:4: ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2800:5: {...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2800:105: ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2801:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2804:6: ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2804:7: {...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2804:16: (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2804:18: otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) )
            	    {
            	    otherlv_14=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMultiple7613); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMultipleAccess().getUpperKeyword_1_4_0());
            	        
            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple7625); 

            	        	newLeafNode(otherlv_15, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_4_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2812:1: ( (lv_upper_16_0= RULE_INT ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2813:1: (lv_upper_16_0= RULE_INT )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2813:1: (lv_upper_16_0= RULE_INT )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2814:3: lv_upper_16_0= RULE_INT
            	    {
            	    lv_upper_16_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleMultiple7642); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2837:4: ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2837:4: ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2838:5: {...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2838:105: ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2839:6: ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2842:6: ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2842:7: {...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2842:16: (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2842:18: otherlv_17= 'dependsOn' ( ( ruleEString ) )
            	    {
            	    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultiple7715); 

            	        	newLeafNode(otherlv_17, grammarAccess.getMultipleAccess().getDependsOnKeyword_1_5_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2846:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2847:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2847:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2848:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultipleRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getDependsOnAnswerCrossReference_1_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple7738);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2868:4: ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2868:4: ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2869:5: {...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2869:105: ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2870:6: ({...}? => ( (lv_required_19_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2873:6: ({...}? => ( (lv_required_19_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2873:7: {...}? => ( (lv_required_19_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2873:16: ( (lv_required_19_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2874:1: (lv_required_19_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2874:1: (lv_required_19_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2875:3: lv_required_19_0= 'required'
            	    {
            	    lv_required_19_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultiple7811); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2895:4: ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2895:4: ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2896:5: {...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2896:105: ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2897:6: ({...}? => ( (lv_other_20_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2900:6: ({...}? => ( (lv_other_20_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2900:7: {...}? => ( (lv_other_20_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2900:16: ( (lv_other_20_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2901:1: (lv_other_20_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2901:1: (lv_other_20_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2902:3: lv_other_20_0= 'other'
            	    {
            	    lv_other_20_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMultiple7896); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2922:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2922:4: ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2923:5: {...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2923:105: ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2924:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2927:6: ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2927:7: {...}? => ( (lv_showLimits_21_0= 'showLimits' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiple", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2927:16: ( (lv_showLimits_21_0= 'showLimits' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2928:1: (lv_showLimits_21_0= 'showLimits' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2928:1: (lv_showLimits_21_0= 'showLimits' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2929:3: lv_showLimits_21_0= 'showLimits'
            	    {
            	    lv_showLimits_21_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMultiple7981); 

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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleMultiple", "getUnorderedGroupHelper().canLeave(grammarAccess.getMultipleAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMultipleAccess().getUnorderedGroup_1());
            	

            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultiple8052); 

                	newLeafNode(otherlv_22, grammarAccess.getMultipleAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2961:1: ( (lv_options_23_0= ruleOption ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20||LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2962:1: (lv_options_23_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2962:1: (lv_options_23_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2963:3: lv_options_23_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getOptionsOptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultiple8073);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_24=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMultiple8086); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2991:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2992:2: (iv_ruleTable= ruleTable EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2993:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable8122);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable8132); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3000:1: ruleTable returns [EObject current=null] : (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_id_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_required_14_0=null;
        Token lv_other_15_0=null;
        Token lv_multiple_16_0=null;
        Token otherlv_17=null;
        Token otherlv_23=null;
        EObject lv_options_19_0 = null;

        EObject lv_questions_20_0 = null;

        EObject lv_options_21_0 = null;

        EObject lv_questions_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3003:28: ( (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3004:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3004:1: (otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3004:3: otherlv_0= '<table' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) ) otherlv_17= '>' ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) ) ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )* otherlv_23= '</table>'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTable8169); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3008:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3010:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3010:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3011:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_1());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3014:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3015:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3015:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) ) )+
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
                else if ( LA23_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
                    alt23=4;
                }
                else if ( LA23_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
                    alt23=5;
                }
                else if ( LA23_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
                    alt23=6;
                }
                else if ( LA23_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6) ) {
                    alt23=7;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3017:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3017:4: ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3018:5: {...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3018:102: ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3019:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3022:6: ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3022:7: {...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3022:16: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3022:18: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTable8227); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTitleKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable8239); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3030:1: ( (lv_title_4_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3031:1: (lv_title_4_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3031:1: (lv_title_4_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3032:3: lv_title_4_0= RULE_STRING
            	    {
            	    lv_title_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTable8256); 

            	    			newLeafNode(lv_title_4_0, grammarAccess.getTableAccess().getTitleSTRINGTerminalRuleCall_1_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3055:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3055:4: ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3056:5: {...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3056:102: ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3057:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3060:6: ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3060:7: {...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3060:16: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3060:18: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable8329); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getDescriptionKeyword_1_1_0());
            	        
            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable8341); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTableAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3068:1: ( (lv_description_7_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3069:1: (lv_description_7_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3069:1: (lv_description_7_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3070:3: lv_description_7_0= RULE_STRING
            	    {
            	    lv_description_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTable8358); 

            	    			newLeafNode(lv_description_7_0, grammarAccess.getTableAccess().getDescriptionSTRINGTerminalRuleCall_1_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_7_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3093:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3093:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3094:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3094:102: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3095:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3098:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3098:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3098:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3098:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTable8431); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTableAccess().getIdKeyword_1_2_0());
            	        
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable8443); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTableAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3106:1: ( (lv_id_10_0= RULE_STRING ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3107:1: (lv_id_10_0= RULE_STRING )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3107:1: (lv_id_10_0= RULE_STRING )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3108:3: lv_id_10_0= RULE_STRING
            	    {
            	    lv_id_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTable8460); 

            	    			newLeafNode(lv_id_10_0, grammarAccess.getTableAccess().getIdSTRINGTerminalRuleCall_1_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_10_0, 
            	            		"STRING");
            	    	    

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3131:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3131:4: ({...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3132:5: {...}? => ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3132:102: ( ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3133:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3136:6: ({...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3136:7: {...}? => (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3136:16: (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3136:18: otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTable8533); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTableAccess().getDependsOnKeyword_1_3_0());
            	        
            	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable8545); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTableAccess().getEqualsSignKeyword_1_3_1());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3144:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3145:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3145:1: ( ruleEString )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3146:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTableRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getDependsOnAnswerCrossReference_1_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable8568);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3166:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3166:4: ({...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3167:5: {...}? => ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3167:102: ( ({...}? => ( (lv_required_14_0= 'required' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3168:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3171:6: ({...}? => ( (lv_required_14_0= 'required' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3171:7: {...}? => ( (lv_required_14_0= 'required' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3171:16: ( (lv_required_14_0= 'required' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3172:1: (lv_required_14_0= 'required' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3172:1: (lv_required_14_0= 'required' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3173:3: lv_required_14_0= 'required'
            	    {
            	    lv_required_14_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTable8641); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3193:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3193:4: ({...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3194:5: {...}? => ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3194:102: ( ({...}? => ( (lv_other_15_0= 'other' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3195:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3198:6: ({...}? => ( (lv_other_15_0= 'other' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3198:7: {...}? => ( (lv_other_15_0= 'other' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3198:16: ( (lv_other_15_0= 'other' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3199:1: (lv_other_15_0= 'other' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3199:1: (lv_other_15_0= 'other' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3200:3: lv_other_15_0= 'other'
            	    {
            	    lv_other_15_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTable8726); 

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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3220:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3220:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3221:5: {...}? => ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3221:102: ( ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3222:6: ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3225:6: ({...}? => ( (lv_multiple_16_0= 'multiple' ) ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3225:7: {...}? => ( (lv_multiple_16_0= 'multiple' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3225:16: ( (lv_multiple_16_0= 'multiple' ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3226:1: (lv_multiple_16_0= 'multiple' )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3226:1: (lv_multiple_16_0= 'multiple' )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3227:3: lv_multiple_16_0= 'multiple'
            	    {
            	    lv_multiple_16_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTable8811); 

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

            otherlv_17=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable8882); 

                	newLeafNode(otherlv_17, grammarAccess.getTableAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3259:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3261:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3261:1: ( ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3262:2: ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTableAccess().getUnorderedGroup_3());
            	
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3265:2: ( ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?)
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3266:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+ {...}?
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3266:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=3;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3268:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3268:4: ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3269:5: {...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3269:102: ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3270:6: ({...}? => ( (lv_options_19_0= ruleOption ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3273:6: ({...}? => ( (lv_options_19_0= ruleOption ) ) )+
            	    int cnt24=0;
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==20) ) {
            	            int LA24_1 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt24=1;
            	            }


            	        }
            	        else if ( (LA24_0==22) ) {
            	            int LA24_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt24=1;
            	            }


            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3273:7: {...}? => ( (lv_options_19_0= ruleOption ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3273:16: ( (lv_options_19_0= ruleOption ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3274:1: (lv_options_19_0= ruleOption )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3274:1: (lv_options_19_0= ruleOption )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3275:3: lv_options_19_0= ruleOption
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_3_0_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable8948);
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
            	case 2 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3298:4: ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3298:4: ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3299:5: {...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3299:102: ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3300:6: ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3303:6: ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+
            	    int cnt25=0;
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==55) ) {
            	            int LA25_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt25=1;
            	            }


            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3303:7: {...}? => ( (lv_questions_20_0= ruleTableQuestion ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTable", "true");
            	    	    }
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3303:16: ( (lv_questions_20_0= ruleTableQuestion ) )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3304:1: (lv_questions_20_0= ruleTableQuestion )
            	    	    {
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3304:1: (lv_questions_20_0= ruleTableQuestion )
            	    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3305:3: lv_questions_20_0= ruleTableQuestion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable9024);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3336:2: ( ( (lv_options_21_0= ruleOption ) ) | ( (lv_questions_22_0= ruleTableQuestion ) ) )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==20||LA27_0==22) ) {
                    alt27=1;
                }
                else if ( (LA27_0==55) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3336:3: ( (lv_options_21_0= ruleOption ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3336:3: ( (lv_options_21_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3337:1: (lv_options_21_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3337:1: (lv_options_21_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3338:3: lv_options_21_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable9093);
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
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3355:6: ( (lv_questions_22_0= ruleTableQuestion ) )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3355:6: ( (lv_questions_22_0= ruleTableQuestion ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3356:1: (lv_questions_22_0= ruleTableQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3356:1: (lv_questions_22_0= ruleTableQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3357:3: lv_questions_22_0= ruleTableQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable9120);
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
            	    break loop27;
                }
            } while (true);

            otherlv_23=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTable9134); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3385:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3386:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3387:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt9171);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt9182); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3394:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3397:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3398:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3398:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3398:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3398:2: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3399:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleEInt9221); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt9238); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3419:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3420:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3421:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion9283);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion9293); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3428:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= '<q>' ( (lv_title_1_0= ruleLabel ) ) otherlv_2= '</q>' ) ;
    public final EObject ruleTableQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3431:28: ( (otherlv_0= '<q>' ( (lv_title_1_0= ruleLabel ) ) otherlv_2= '</q>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3432:1: (otherlv_0= '<q>' ( (lv_title_1_0= ruleLabel ) ) otherlv_2= '</q>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3432:1: (otherlv_0= '<q>' ( (lv_title_1_0= ruleLabel ) ) otherlv_2= '</q>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3432:3: otherlv_0= '<q>' ( (lv_title_1_0= ruleLabel ) ) otherlv_2= '</q>'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTableQuestion9330); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3436:1: ( (lv_title_1_0= ruleLabel ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3437:1: (lv_title_1_0= ruleLabel )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3437:1: (lv_title_1_0= ruleLabel )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:3438:3: lv_title_1_0= ruleLabel
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getTitleLabelParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLabel_in_ruleTableQuestion9351);
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

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTableQuestion9363); 

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


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA16_eotS =
        "\13\uffff";
    static final String DFA16_eofS =
        "\13\uffff";
    static final String DFA16_minS =
        "\1\14\12\uffff";
    static final String DFA16_maxS =
        "\1\45\12\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA16_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\2\uffff\1\1\3\uffff\1\11\1\12\7"+
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
            return "()+ loopback of 1257:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'lowerLabel' otherlv_18= '=' ( (lv_lowerLabel_19_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'upperLabel' otherlv_21= '=' ( (lv_upperLabel_22_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'dependsOn' otherlv_24= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_26_0= 'required' ) ) ) ) ) )+";
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
                        if ( (LA16_0==21) ) {s = 1;}

                        else if ( LA16_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA16_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA16_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA16_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA16_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA16_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA16_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA16_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA16_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getScaleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
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
        "\15\uffff";
    static final String DFA17_eofS =
        "\15\uffff";
    static final String DFA17_minS =
        "\1\14\14\uffff";
    static final String DFA17_maxS =
        "\1\54\14\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA17_specialS =
        "\1\0\14\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\2\uffff\1\1\3\uffff\1\7\1\11\14"+
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
            return "()+ loopback of 1637:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'from' otherlv_13= '=' ( (lv_from_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'to' otherlv_16= '=' ( (lv_to_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_22_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_day_23_0= 'day' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_month_24_0= 'month' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_year_25_0= 'year' ) ) ) ) ) )+";
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
                        if ( (LA17_0==21) ) {s = 1;}

                        else if ( LA17_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA17_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA17_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA17_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA17_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA17_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA17_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA17_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA17_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA17_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA17_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                         
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
    static final String DFA18_eotS =
        "\12\uffff";
    static final String DFA18_eofS =
        "\12\uffff";
    static final String DFA18_minS =
        "\1\14\11\uffff";
    static final String DFA18_maxS =
        "\1\51\11\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA18_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\uffff\1\3\3\uffff\1\4\2\uffff\1\1\3\uffff\1\7\1\10\7"+
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2049:3: ( ({...}? => ( ({...}? => (otherlv_3= 'title' otherlv_4= '=' ( (lv_title_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'id' otherlv_10= '=' ( (lv_id_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lower' otherlv_13= '=' ( (lv_lower_14_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'upper' otherlv_16= '=' ( (lv_upper_17_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'dependsOn' otherlv_19= '=' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_21_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_22_0= 'showLimits' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_0==21) ) {s = 1;}

                        else if ( LA18_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA18_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA18_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA18_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA18_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA18_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA18_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA18_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumberAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\13\uffff";
    static final String DFA21_eofS =
        "\13\uffff";
    static final String DFA21_minS =
        "\1\14\12\uffff";
    static final String DFA21_maxS =
        "\1\57\12\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA21_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\1\uffff\1\3\1\1\2\uffff\1\4\6\uffff\1\7\1\10\7\uffff\1"+
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
            return "()+ loopback of 2645:3: ( ({...}? => ( ({...}? => (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'dependsOn' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_required_19_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_other_20_0= 'other' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_showLimits_21_0= 'showLimits' ) ) ) ) ) )+";
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
                        if ( (LA21_0==15) ) {s = 1;}

                        else if ( LA21_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA21_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA21_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA21_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA21_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA21_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA21_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA21_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA21_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
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
    static final String DFA26_eotS =
        "\31\uffff";
    static final String DFA26_eofS =
        "\31\uffff";
    static final String DFA26_minS =
        "\1\24\1\22\1\17\1\4\1\uffff\2\15\3\4\1\5\5\4\1\0\1\25\1\17\2\4\1"+
        "\0\1\uffff\1\0\1\uffff";
    static final String DFA26_maxS =
        "\1\67\2\22\1\5\1\uffff\2\15\1\5\2\70\1\5\1\4\2\27\2\70\1\0\1\25"+
        "\1\17\2\27\1\0\1\uffff\1\0\1\uffff";
    static final String DFA26_acceptS =
        "\4\uffff\1\3\21\uffff\1\2\1\uffff\1\1";
    static final String DFA26_specialS =
        "\20\uffff\1\1\4\uffff\1\2\1\uffff\1\0\1\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\1\uffff\1\2\36\uffff\1\4\1\uffff\1\3",
            "\1\5",
            "\1\7\2\uffff\1\6",
            "\1\10\1\11",
            "",
            "\1\12",
            "\1\13",
            "\1\14\1\15",
            "\1\16\1\17\62\uffff\1\20",
            "\1\16\1\17\62\uffff\1\20",
            "\1\21",
            "\1\22",
            "\1\23\1\24\21\uffff\1\25",
            "\1\23\1\24\21\uffff\1\25",
            "\1\16\1\17\62\uffff\1\20",
            "\1\16\1\17\62\uffff\1\20",
            "\1\uffff",
            "\1\27",
            "\1\7",
            "\1\23\1\24\21\uffff\1\25",
            "\1\23\1\24\21\uffff\1\25",
            "\1\uffff",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()+ loopback of 3266:3: ( ({...}? => ( ({...}? => ( (lv_options_19_0= ruleOption ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_questions_20_0= ruleTableQuestion ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_23 = input.LA(1);

                         
                        int index26_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 24;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index26_23);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_16 = input.LA(1);

                         
                        int index26_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 1) ) {s = 22;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index26_16);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_21 = input.LA(1);

                         
                        int index26_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getTableAccess().getUnorderedGroup_3(), 0) ) {s = 24;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getTableAccess().getUnorderedGroup_3()) ) {s = 4;}

                         
                        input.seek(index26_21);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSurvey132 = new BitSet(new long[]{0x000000000000D000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey190 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey202 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSurvey219 = new BitSet(new long[]{0x000000000000D000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey292 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey304 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSurvey321 = new BitSet(new long[]{0x000000000000D000L});
        public static final BitSet FOLLOW_15_in_ruleSurvey379 = new BitSet(new long[]{0x000A604211030000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey401 = new BitSet(new long[]{0x000A604211030000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey428 = new BitSet(new long[]{0x000A604211030000L});
        public static final BitSet FOLLOW_16_in_ruleSurvey442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_entryRuleItem480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItem490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleItem537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleItem564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleItem591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleItem618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleItem645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleItem672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleItem699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleItem726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion761 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleQuestion818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleQuestion845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleQuestion872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleQuestion899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleQuestion926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleQuestion953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleQuestion980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1015 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption1025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_ruleOption1072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleOption1099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1135 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1257 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplate1267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleAnswerTemplate1304 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAnswerTemplate1316 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnswerTemplate1328 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplate1345 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnswerTemplate1362 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleAnswerTemplate1383 = new BitSet(new long[]{0x0000000000480000L});
        public static final BitSet FOLLOW_19_in_ruleAnswerTemplate1396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplateRef_in_entryRuleAnswerTemplateRef1432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplateRef1442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAnswerTemplateRef1479 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAnswerTemplateRef1491 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnswerTemplateRef1503 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnswerTemplateRef1523 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnswerTemplateRef1535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAnswer1618 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleAnswer1631 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnswer1643 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnswer1660 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnswer1679 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleLabel_in_ruleAnswer1700 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAnswer1712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1749 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLabel1760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLabel1807 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLabel1835 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1882 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup1892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleGroup1929 = new BitSet(new long[]{0x000000000600D000L});
        public static final BitSet FOLLOW_12_in_ruleGroup1987 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1999 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleGroup2016 = new BitSet(new long[]{0x000000000600D000L});
        public static final BitSet FOLLOW_14_in_ruleGroup2089 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGroup2101 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleGroup2118 = new BitSet(new long[]{0x000000000600D000L});
        public static final BitSet FOLLOW_25_in_ruleGroup2191 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGroup2203 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup2226 = new BitSet(new long[]{0x000000000600D000L});
        public static final BitSet FOLLOW_26_in_ruleGroup2299 = new BitSet(new long[]{0x000000000600D000L});
        public static final BitSet FOLLOW_15_in_ruleGroup2364 = new BitSet(new long[]{0x000A604211000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup2385 = new BitSet(new long[]{0x000A604219000000L});
        public static final BitSet FOLLOW_27_in_ruleGroup2398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText2434 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText2444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleText2490 = new BitSet(new long[]{0x00000001E6045000L});
        public static final BitSet FOLLOW_12_in_ruleText2548 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText2560 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleText2577 = new BitSet(new long[]{0x00000001E6245000L});
        public static final BitSet FOLLOW_14_in_ruleText2650 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText2662 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleText2679 = new BitSet(new long[]{0x00000001E6245000L});
        public static final BitSet FOLLOW_18_in_ruleText2752 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText2764 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleText2781 = new BitSet(new long[]{0x00000001E6245000L});
        public static final BitSet FOLLOW_25_in_ruleText2854 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText2866 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2889 = new BitSet(new long[]{0x00000001E6245000L});
        public static final BitSet FOLLOW_26_in_ruleText2962 = new BitSet(new long[]{0x00000001E6245000L});
        public static final BitSet FOLLOW_29_in_ruleText3042 = new BitSet(new long[]{0x00000001E6245000L});
        public static final BitSet FOLLOW_30_in_ruleText3060 = new BitSet(new long[]{0x00000001E6245000L});
        public static final BitSet FOLLOW_31_in_ruleText3086 = new BitSet(new long[]{0x00000001E6245000L});
        public static final BitSet FOLLOW_32_in_ruleText3115 = new BitSet(new long[]{0x00000001E6245000L});
        public static final BitSet FOLLOW_21_in_ruleText3190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_entryRuleScale3226 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScale3236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleScale3273 = new BitSet(new long[]{0x0000003C06045000L});
        public static final BitSet FOLLOW_12_in_ruleScale3331 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3343 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleScale3360 = new BitSet(new long[]{0x0000003C06245000L});
        public static final BitSet FOLLOW_14_in_ruleScale3433 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3445 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleScale3462 = new BitSet(new long[]{0x0000003C06245000L});
        public static final BitSet FOLLOW_18_in_ruleScale3535 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3547 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleScale3564 = new BitSet(new long[]{0x0000003C06245000L});
        public static final BitSet FOLLOW_34_in_ruleScale3637 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3649 = new BitSet(new long[]{0x0040000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3670 = new BitSet(new long[]{0x0000003C06245000L});
        public static final BitSet FOLLOW_35_in_ruleScale3738 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3750 = new BitSet(new long[]{0x0040000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale3771 = new BitSet(new long[]{0x0000003C06245000L});
        public static final BitSet FOLLOW_36_in_ruleScale3839 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3851 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3872 = new BitSet(new long[]{0x0000003C06245000L});
        public static final BitSet FOLLOW_37_in_ruleScale3940 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale3952 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale3973 = new BitSet(new long[]{0x0000003C06245000L});
        public static final BitSet FOLLOW_25_in_ruleScale4041 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale4053 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4076 = new BitSet(new long[]{0x0000003C06245000L});
        public static final BitSet FOLLOW_26_in_ruleScale4149 = new BitSet(new long[]{0x0000003C06245000L});
        public static final BitSet FOLLOW_21_in_ruleScale4220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate4256 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate4266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDate4312 = new BitSet(new long[]{0x00001F8006045000L});
        public static final BitSet FOLLOW_12_in_ruleDate4370 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate4382 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDate4399 = new BitSet(new long[]{0x00001F8006245000L});
        public static final BitSet FOLLOW_14_in_ruleDate4472 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate4484 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDate4501 = new BitSet(new long[]{0x00001F8006245000L});
        public static final BitSet FOLLOW_18_in_ruleDate4574 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate4586 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDate4603 = new BitSet(new long[]{0x00001F8006245000L});
        public static final BitSet FOLLOW_39_in_ruleDate4676 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate4688 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4709 = new BitSet(new long[]{0x00001F8006245000L});
        public static final BitSet FOLLOW_40_in_ruleDate4777 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate4789 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4810 = new BitSet(new long[]{0x00001F8006245000L});
        public static final BitSet FOLLOW_25_in_ruleDate4878 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate4890 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate4913 = new BitSet(new long[]{0x00001F8006245000L});
        public static final BitSet FOLLOW_41_in_ruleDate4986 = new BitSet(new long[]{0x00001F8006245000L});
        public static final BitSet FOLLOW_26_in_ruleDate5071 = new BitSet(new long[]{0x00001F8006245000L});
        public static final BitSet FOLLOW_42_in_ruleDate5156 = new BitSet(new long[]{0x00001F8006245000L});
        public static final BitSet FOLLOW_43_in_ruleDate5241 = new BitSet(new long[]{0x00001F8006245000L});
        public static final BitSet FOLLOW_44_in_ruleDate5326 = new BitSet(new long[]{0x00001F8006245000L});
        public static final BitSet FOLLOW_21_in_ruleDate5397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber5433 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber5443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleNumber5489 = new BitSet(new long[]{0x0000020C06045000L});
        public static final BitSet FOLLOW_12_in_ruleNumber5547 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5559 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleNumber5576 = new BitSet(new long[]{0x0000020C06245000L});
        public static final BitSet FOLLOW_14_in_ruleNumber5649 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5661 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleNumber5678 = new BitSet(new long[]{0x0000020C06245000L});
        public static final BitSet FOLLOW_18_in_ruleNumber5751 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5763 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleNumber5780 = new BitSet(new long[]{0x0000020C06245000L});
        public static final BitSet FOLLOW_34_in_ruleNumber5853 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5865 = new BitSet(new long[]{0x0040000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5886 = new BitSet(new long[]{0x0000020C06245000L});
        public static final BitSet FOLLOW_35_in_ruleNumber5954 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber5966 = new BitSet(new long[]{0x0040000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber5987 = new BitSet(new long[]{0x0000020C06245000L});
        public static final BitSet FOLLOW_25_in_ruleNumber6055 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber6067 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber6090 = new BitSet(new long[]{0x0000020C06245000L});
        public static final BitSet FOLLOW_26_in_ruleNumber6163 = new BitSet(new long[]{0x0000020C06245000L});
        public static final BitSet FOLLOW_41_in_ruleNumber6248 = new BitSet(new long[]{0x0000020C06245000L});
        public static final BitSet FOLLOW_21_in_ruleNumber6319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_entryRuleSingle6355 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingle6365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleSingle6402 = new BitSet(new long[]{0x0000800006045000L});
        public static final BitSet FOLLOW_12_in_ruleSingle6460 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle6472 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSingle6489 = new BitSet(new long[]{0x000080000604D000L});
        public static final BitSet FOLLOW_14_in_ruleSingle6562 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle6574 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSingle6591 = new BitSet(new long[]{0x000080000604D000L});
        public static final BitSet FOLLOW_18_in_ruleSingle6664 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle6676 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSingle6693 = new BitSet(new long[]{0x000080000604D000L});
        public static final BitSet FOLLOW_25_in_ruleSingle6766 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle6778 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle6801 = new BitSet(new long[]{0x000080000604D000L});
        public static final BitSet FOLLOW_26_in_ruleSingle6874 = new BitSet(new long[]{0x000080000604D000L});
        public static final BitSet FOLLOW_47_in_ruleSingle6959 = new BitSet(new long[]{0x000080000604D000L});
        public static final BitSet FOLLOW_15_in_ruleSingle7030 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingle7051 = new BitSet(new long[]{0x0001000000500000L});
        public static final BitSet FOLLOW_48_in_ruleSingle7064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple7100 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiple7110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleMultiple7147 = new BitSet(new long[]{0x0000820C06045000L});
        public static final BitSet FOLLOW_12_in_ruleMultiple7205 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple7217 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiple7234 = new BitSet(new long[]{0x0000820C0604D000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple7307 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple7319 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiple7336 = new BitSet(new long[]{0x0000820C0604D000L});
        public static final BitSet FOLLOW_18_in_ruleMultiple7409 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple7421 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiple7438 = new BitSet(new long[]{0x0000820C0604D000L});
        public static final BitSet FOLLOW_34_in_ruleMultiple7511 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple7523 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultiple7540 = new BitSet(new long[]{0x0000820C0604D000L});
        public static final BitSet FOLLOW_35_in_ruleMultiple7613 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple7625 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleMultiple7642 = new BitSet(new long[]{0x0000820C0604D000L});
        public static final BitSet FOLLOW_25_in_ruleMultiple7715 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple7738 = new BitSet(new long[]{0x0000820C0604D000L});
        public static final BitSet FOLLOW_26_in_ruleMultiple7811 = new BitSet(new long[]{0x0000820C0604D000L});
        public static final BitSet FOLLOW_47_in_ruleMultiple7896 = new BitSet(new long[]{0x0000820C0604D000L});
        public static final BitSet FOLLOW_41_in_ruleMultiple7981 = new BitSet(new long[]{0x0000820C0604D000L});
        public static final BitSet FOLLOW_15_in_ruleMultiple8052 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultiple8073 = new BitSet(new long[]{0x0004000000500000L});
        public static final BitSet FOLLOW_50_in_ruleMultiple8086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable8122 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable8132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTable8169 = new BitSet(new long[]{0x0010800006045000L});
        public static final BitSet FOLLOW_12_in_ruleTable8227 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable8239 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTable8256 = new BitSet(new long[]{0x001080000604D000L});
        public static final BitSet FOLLOW_14_in_ruleTable8329 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable8341 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTable8358 = new BitSet(new long[]{0x001080000604D000L});
        public static final BitSet FOLLOW_18_in_ruleTable8431 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable8443 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTable8460 = new BitSet(new long[]{0x001080000604D000L});
        public static final BitSet FOLLOW_25_in_ruleTable8533 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable8545 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable8568 = new BitSet(new long[]{0x001080000604D000L});
        public static final BitSet FOLLOW_26_in_ruleTable8641 = new BitSet(new long[]{0x001080000604D000L});
        public static final BitSet FOLLOW_47_in_ruleTable8726 = new BitSet(new long[]{0x001080000604D000L});
        public static final BitSet FOLLOW_52_in_ruleTable8811 = new BitSet(new long[]{0x001080000604D000L});
        public static final BitSet FOLLOW_15_in_ruleTable8882 = new BitSet(new long[]{0x0080000000500000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable8948 = new BitSet(new long[]{0x00A0000000500000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable9024 = new BitSet(new long[]{0x00A0000000500000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable9093 = new BitSet(new long[]{0x00A0000000500000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable9120 = new BitSet(new long[]{0x00A0000000500000L});
        public static final BitSet FOLLOW_53_in_ruleTable9134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt9171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt9182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleEInt9221 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt9238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion9283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion9293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTableQuestion9330 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleLabel_in_ruleTableQuestion9351 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleTableQuestion9363 = new BitSet(new long[]{0x0000000000000002L});
    }


}