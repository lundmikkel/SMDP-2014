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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<survey'", "'title'", "'='", "'description'", "'>'", "'</survey>'", "'<template'", "'id'", "'</template>'", "'<a'", "'</a>'", "'<group'", "'dependsOn'", "'required'", "'</group>'", "'<single'", "'other'", "'</single>'", "'<multiple'", "'lower'", "'upper'", "'showLimits'", "','", "'}'", "'</multiple>'", "'<text'", "'multiline'", "'/>'", "'<date'", "'from'", "'to'", "'day'", "'month'", "'year'", "'<number'", "'<scale'", "'lowerLabel'", "'upperLabel'", "'<table'", "'multiple'", "'</table>'", "'Option'", "'-'", "'TableQuestion'", "'{'"
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:76:1: ruleSurvey returns [EObject current=null] : ( () otherlv_1= '<survey' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? otherlv_8= '>' ( ( (lv_items_9_0= ruleItem ) ) ( (lv_items_10_0= ruleItem ) )* )? ( ( (lv_templates_11_0= ruleAnswerTemplate ) ) ( (lv_templates_12_0= ruleAnswerTemplate ) )* )? otherlv_13= '</survey>' ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_items_9_0 = null;

        EObject lv_items_10_0 = null;

        EObject lv_templates_11_0 = null;

        EObject lv_templates_12_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:79:28: ( ( () otherlv_1= '<survey' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? otherlv_8= '>' ( ( (lv_items_9_0= ruleItem ) ) ( (lv_items_10_0= ruleItem ) )* )? ( ( (lv_templates_11_0= ruleAnswerTemplate ) ) ( (lv_templates_12_0= ruleAnswerTemplate ) )* )? otherlv_13= '</survey>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () otherlv_1= '<survey' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? otherlv_8= '>' ( ( (lv_items_9_0= ruleItem ) ) ( (lv_items_10_0= ruleItem ) )* )? ( ( (lv_templates_11_0= ruleAnswerTemplate ) ) ( (lv_templates_12_0= ruleAnswerTemplate ) )* )? otherlv_13= '</survey>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () otherlv_1= '<survey' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? otherlv_8= '>' ( ( (lv_items_9_0= ruleItem ) ) ( (lv_items_10_0= ruleItem ) )* )? ( ( (lv_templates_11_0= ruleAnswerTemplate ) ) ( (lv_templates_12_0= ruleAnswerTemplate ) )* )? otherlv_13= '</survey>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: () otherlv_1= '<survey' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? otherlv_8= '>' ( ( (lv_items_9_0= ruleItem ) ) ( (lv_items_10_0= ruleItem ) )* )? ( ( (lv_templates_11_0= ruleAnswerTemplate ) ) ( (lv_templates_12_0= ruleAnswerTemplate ) )* )? otherlv_13= '</survey>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey131); 

                	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getSurveyKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:90:1: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:90:3: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey144); 

                        	newLeafNode(otherlv_2, grammarAccess.getSurveyAccess().getTitleKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey156); 

                        	newLeafNode(otherlv_3, grammarAccess.getSurveyAccess().getEqualsSignKeyword_2_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:98:1: ( (lv_title_4_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:1: (lv_title_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:1: (lv_title_4_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:3: lv_title_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey177);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:116:4: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:116:6: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey192); 

                        	newLeafNode(otherlv_5, grammarAccess.getSurveyAccess().getDescriptionKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey204); 

                        	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getEqualsSignKeyword_3_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:124:1: ( (lv_description_7_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:125:1: (lv_description_7_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:125:1: (lv_description_7_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:126:3: lv_description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getDescriptionEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey225);
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


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSurvey239); 

                	newLeafNode(otherlv_8, grammarAccess.getSurveyAccess().getGreaterThanSignKeyword_4());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:146:1: ( ( (lv_items_9_0= ruleItem ) ) ( (lv_items_10_0= ruleItem ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22||LA4_0==26||LA4_0==29||LA4_0==36||LA4_0==39||(LA4_0>=45 && LA4_0<=46)||LA4_0==49) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:146:2: ( (lv_items_9_0= ruleItem ) ) ( (lv_items_10_0= ruleItem ) )*
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:146:2: ( (lv_items_9_0= ruleItem ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:147:1: (lv_items_9_0= ruleItem )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:147:1: (lv_items_9_0= ruleItem )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:148:3: lv_items_9_0= ruleItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getItemsItemParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleItem_in_ruleSurvey261);
                    lv_items_9_0=ruleItem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	        }
                           		add(
                           			current, 
                           			"items",
                            		lv_items_9_0, 
                            		"Item");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:164:2: ( (lv_items_10_0= ruleItem ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==22||LA3_0==26||LA3_0==29||LA3_0==36||LA3_0==39||(LA3_0>=45 && LA3_0<=46)||LA3_0==49) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:165:1: (lv_items_10_0= ruleItem )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:165:1: (lv_items_10_0= ruleItem )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:166:3: lv_items_10_0= ruleItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getItemsItemParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleItem_in_ruleSurvey282);
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
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:182:5: ( ( (lv_templates_11_0= ruleAnswerTemplate ) ) ( (lv_templates_12_0= ruleAnswerTemplate ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:182:6: ( (lv_templates_11_0= ruleAnswerTemplate ) ) ( (lv_templates_12_0= ruleAnswerTemplate ) )*
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:182:6: ( (lv_templates_11_0= ruleAnswerTemplate ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:183:1: (lv_templates_11_0= ruleAnswerTemplate )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:183:1: (lv_templates_11_0= ruleAnswerTemplate )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:184:3: lv_templates_11_0= ruleAnswerTemplate
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getTemplatesAnswerTemplateParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_ruleSurvey307);
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

                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:200:2: ( (lv_templates_12_0= ruleAnswerTemplate ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:201:1: (lv_templates_12_0= ruleAnswerTemplate )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:201:1: (lv_templates_12_0= ruleAnswerTemplate )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:202:3: lv_templates_12_0= ruleAnswerTemplate
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getTemplatesAnswerTemplateParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_ruleSurvey328);
                    	    lv_templates_12_0=ruleAnswerTemplate();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"templates",
                    	            		lv_templates_12_0, 
                    	            		"AnswerTemplate");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSurvey343); 

                	newLeafNode(otherlv_13, grammarAccess.getSurveyAccess().getSurveyKeyword_7());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:230:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:231:2: (iv_ruleItem= ruleItem EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:232:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_entryRuleItem379);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItem389); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:239:1: ruleItem returns [EObject current=null] : (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:242:28: ( (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:243:1: (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:243:1: (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            case 36:
                {
                alt7=4;
                }
                break;
            case 39:
                {
                alt7=5;
                }
                break;
            case 45:
                {
                alt7=6;
                }
                break;
            case 46:
                {
                alt7=7;
                }
                break;
            case 49:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:244:5: this_Group_0= ruleGroup
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getGroupParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleItem436);
                    this_Group_0=ruleGroup();

                    state._fsp--;

                     
                            current = this_Group_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:254:5: this_Single_1= ruleSingle
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getSingleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleItem463);
                    this_Single_1=ruleSingle();

                    state._fsp--;

                     
                            current = this_Single_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:264:5: this_Multiple_2= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getMultipleParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleItem490);
                    this_Multiple_2=ruleMultiple();

                    state._fsp--;

                     
                            current = this_Multiple_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:274:5: this_Text_3= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getTextParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleItem517);
                    this_Text_3=ruleText();

                    state._fsp--;

                     
                            current = this_Text_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:284:5: this_Date_4= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getDateParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleItem544);
                    this_Date_4=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:294:5: this_Number_5= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getNumberParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleItem571);
                    this_Number_5=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:304:5: this_Scale_6= ruleScale
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getScaleParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleItem598);
                    this_Scale_6=ruleScale();

                    state._fsp--;

                     
                            current = this_Scale_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:314:5: this_Table_7= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getTableParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleItem625);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:330:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:331:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:332:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion660);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion670); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:339:1: ruleQuestion returns [EObject current=null] : (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:342:28: ( (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:343:1: (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:343:1: (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            case 39:
                {
                alt8=4;
                }
                break;
            case 45:
                {
                alt8=5;
                }
                break;
            case 46:
                {
                alt8=6;
                }
                break;
            case 49:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:344:5: this_Single_0= ruleSingle
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSingleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleQuestion717);
                    this_Single_0=ruleSingle();

                    state._fsp--;

                     
                            current = this_Single_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:354:5: this_Multiple_1= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleQuestion744);
                    this_Multiple_1=ruleMultiple();

                    state._fsp--;

                     
                            current = this_Multiple_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:364:5: this_Text_2= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTextParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleQuestion771);
                    this_Text_2=ruleText();

                    state._fsp--;

                     
                            current = this_Text_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:374:5: this_Date_3= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getDateParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleQuestion798);
                    this_Date_3=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:384:5: this_Number_4= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getNumberParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleQuestion825);
                    this_Number_4=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:394:5: this_Scale_5= ruleScale
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getScaleParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleQuestion852);
                    this_Scale_5=ruleScale();

                    state._fsp--;

                     
                            current = this_Scale_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:404:5: this_Table_6= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTableParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleQuestion879);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:420:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:421:2: (iv_ruleOption= ruleOption EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:422:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption914);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption924); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:429:1: ruleOption returns [EObject current=null] : (this_Option_Impl_0= ruleOption_Impl | this_Answer_1= ruleAnswer | this_AnswerTemplate_2= ruleAnswerTemplate ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_Option_Impl_0 = null;

        EObject this_Answer_1 = null;

        EObject this_AnswerTemplate_2 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:432:28: ( (this_Option_Impl_0= ruleOption_Impl | this_Answer_1= ruleAnswer | this_AnswerTemplate_2= ruleAnswerTemplate ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:433:1: (this_Option_Impl_0= ruleOption_Impl | this_Answer_1= ruleAnswer | this_AnswerTemplate_2= ruleAnswerTemplate )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:433:1: (this_Option_Impl_0= ruleOption_Impl | this_Answer_1= ruleAnswer | this_AnswerTemplate_2= ruleAnswerTemplate )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:434:5: this_Option_Impl_0= ruleOption_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getOption_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOption_Impl_in_ruleOption971);
                    this_Option_Impl_0=ruleOption_Impl();

                    state._fsp--;

                     
                            current = this_Option_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:444:5: this_Answer_1= ruleAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleOption998);
                    this_Answer_1=ruleAnswer();

                    state._fsp--;

                     
                            current = this_Answer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:454:5: this_AnswerTemplate_2= ruleAnswerTemplate
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerTemplateParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_ruleOption1025);
                    this_AnswerTemplate_2=ruleAnswerTemplate();

                    state._fsp--;

                     
                            current = this_AnswerTemplate_2; 
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:470:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:471:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:472:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1061);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1072); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:479:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:482:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:483:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:483:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:483:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1112); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:491:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1138); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:506:1: entryRuleAnswerTemplate returns [EObject current=null] : iv_ruleAnswerTemplate= ruleAnswerTemplate EOF ;
    public final EObject entryRuleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:507:2: (iv_ruleAnswerTemplate= ruleAnswerTemplate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:508:2: iv_ruleAnswerTemplate= ruleAnswerTemplate EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1183);
            iv_ruleAnswerTemplate=ruleAnswerTemplate();

            state._fsp--;

             current =iv_ruleAnswerTemplate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplate1193); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:515:1: ruleAnswerTemplate returns [EObject current=null] : (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= '</template>' ) ;
    public final EObject ruleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_answers_5_0 = null;

        EObject lv_answers_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:518:28: ( (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= '</template>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:519:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= '</template>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:519:1: (otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= '</template>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:519:3: otherlv_0= '<template' otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) otherlv_4= '>' ( (lv_answers_5_0= ruleAnswer ) ) ( (lv_answers_6_0= ruleAnswer ) )* otherlv_7= '</template>'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswerTemplate1230); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateAccess().getTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswerTemplate1242); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateAccess().getIdKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnswerTemplate1254); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateAccess().getEqualsSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:531:1: ( (lv_id_3_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:532:1: (lv_id_3_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:532:1: (lv_id_3_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:533:3: lv_id_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerTemplateAccess().getIdEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswerTemplate1275);
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

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnswerTemplate1287); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerTemplateAccess().getGreaterThanSignKeyword_4());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:553:1: ( (lv_answers_5_0= ruleAnswer ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:554:1: (lv_answers_5_0= ruleAnswer )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:554:1: (lv_answers_5_0= ruleAnswer )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:555:3: lv_answers_5_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getAnswerTemplateAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleAnswerTemplate1308);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:571:2: ( (lv_answers_6_0= ruleAnswer ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:572:1: (lv_answers_6_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:572:1: (lv_answers_6_0= ruleAnswer )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:573:3: lv_answers_6_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAnswerTemplateAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleAnswerTemplate1329);
            	    lv_answers_6_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAnswerTemplateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_6_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswerTemplate1342); 

                	newLeafNode(otherlv_7, grammarAccess.getAnswerTemplateAccess().getTemplateKeyword_7());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:601:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:602:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:603:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer1378);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer1388); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:610:1: ruleAnswer returns [EObject current=null] : (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:613:28: ( (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:614:1: (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:614:1: (otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:614:3: otherlv_0= '<a' (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= '>' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '</a>'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswer1425); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:618:1: (otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:618:3: otherlv_1= 'id' otherlv_2= '=' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswer1438); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getIdKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnswer1450); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getEqualsSignKeyword_1_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:626:1: ( (lv_id_3_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:627:1: (lv_id_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:627:1: (lv_id_3_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:628:3: lv_id_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getIdEStringParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1471);
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

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnswer1485); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getGreaterThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:648:1: ( (lv_label_5_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:649:1: (lv_label_5_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:649:1: (lv_label_5_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:650:3: lv_label_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getLabelEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1506);
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

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswer1518); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:680:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:681:2: (iv_ruleGroup= ruleGroup EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:682:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup1556);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup1566); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:689:1: ruleGroup returns [EObject current=null] : (otherlv_0= '<group' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' otherlv_8= '=' ( ( ruleEString ) ) )? ( (lv_required_10_0= 'required' ) )? otherlv_11= '>' ( (lv_questions_12_0= ruleQuestion ) ) ( (lv_questions_13_0= ruleQuestion ) )* otherlv_14= '</group>' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_required_10_0=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_questions_12_0 = null;

        EObject lv_questions_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:692:28: ( (otherlv_0= '<group' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' otherlv_8= '=' ( ( ruleEString ) ) )? ( (lv_required_10_0= 'required' ) )? otherlv_11= '>' ( (lv_questions_12_0= ruleQuestion ) ) ( (lv_questions_13_0= ruleQuestion ) )* otherlv_14= '</group>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:693:1: (otherlv_0= '<group' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' otherlv_8= '=' ( ( ruleEString ) ) )? ( (lv_required_10_0= 'required' ) )? otherlv_11= '>' ( (lv_questions_12_0= ruleQuestion ) ) ( (lv_questions_13_0= ruleQuestion ) )* otherlv_14= '</group>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:693:1: (otherlv_0= '<group' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' otherlv_8= '=' ( ( ruleEString ) ) )? ( (lv_required_10_0= 'required' ) )? otherlv_11= '>' ( (lv_questions_12_0= ruleQuestion ) ) ( (lv_questions_13_0= ruleQuestion ) )* otherlv_14= '</group>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:693:3: otherlv_0= '<group' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' otherlv_8= '=' ( ( ruleEString ) ) )? ( (lv_required_10_0= 'required' ) )? otherlv_11= '>' ( (lv_questions_12_0= ruleQuestion ) ) ( (lv_questions_13_0= ruleQuestion ) )* otherlv_14= '</group>'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGroup1603); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:697:1: (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:697:3: otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroup1616); 

                        	newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getTitleKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1628); 

                        	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getEqualsSignKeyword_1_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:705:1: ( (lv_title_3_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:706:1: (lv_title_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:706:1: (lv_title_3_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:707:3: lv_title_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupAccess().getTitleEStringParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1649);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:723:4: (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:723:6: otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1664); 

                        	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getDescriptionKeyword_2_0());
                        
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1676); 

                        	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getEqualsSignKeyword_2_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:731:1: ( (lv_description_6_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:732:1: (lv_description_6_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:732:1: (lv_description_6_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:733:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupAccess().getDescriptionEStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1697);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:749:4: (otherlv_7= 'dependsOn' otherlv_8= '=' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:749:6: otherlv_7= 'dependsOn' otherlv_8= '=' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleGroup1712); 

                        	newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getDependsOnKeyword_3_0());
                        
                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1724); 

                        	newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getEqualsSignKeyword_3_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:757:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:758:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:758:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:759:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGroupRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGroupAccess().getDependsOnAnswerCrossReference_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1747);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:772:4: ( (lv_required_10_0= 'required' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:773:1: (lv_required_10_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:773:1: (lv_required_10_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:774:3: lv_required_10_0= 'required'
                    {
                    lv_required_10_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGroup1767); 

                            newLeafNode(lv_required_10_0, grammarAccess.getGroupAccess().getRequiredRequiredKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGroupRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup1793); 

                	newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getGreaterThanSignKeyword_5());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:791:1: ( (lv_questions_12_0= ruleQuestion ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:792:1: (lv_questions_12_0= ruleQuestion )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:792:1: (lv_questions_12_0= ruleQuestion )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:793:3: lv_questions_12_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleGroup1814);
            lv_questions_12_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_12_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:809:2: ( (lv_questions_13_0= ruleQuestion ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26||LA17_0==29||LA17_0==36||LA17_0==39||(LA17_0>=45 && LA17_0<=46)||LA17_0==49) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:810:1: (lv_questions_13_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:810:1: (lv_questions_13_0= ruleQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:811:3: lv_questions_13_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleGroup1835);
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
            	    break loop17;
                }
            } while (true);

            otherlv_14=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGroup1848); 

                	newLeafNode(otherlv_14, grammarAccess.getGroupAccess().getGroupKeyword_8());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:839:1: entryRuleSingle returns [EObject current=null] : iv_ruleSingle= ruleSingle EOF ;
    public final EObject entryRuleSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingle = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:840:2: (iv_ruleSingle= ruleSingle EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:841:2: iv_ruleSingle= ruleSingle EOF
            {
             newCompositeNode(grammarAccess.getSingleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingle_in_entryRuleSingle1884);
            iv_ruleSingle=ruleSingle();

            state._fsp--;

             current =iv_ruleSingle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingle1894); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:848:1: ruleSingle returns [EObject current=null] : (otherlv_0= '<single' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'dependsOn' otherlv_11= '=' ( ( ruleEString ) ) )? ( (lv_required_13_0= 'required' ) )? ( (lv_other_14_0= 'other' ) )? otherlv_15= '>' ( ( ruleEString ) )? ( (lv_options_17_0= ruleOption ) ) ( (lv_options_18_0= ruleOption ) )* otherlv_19= '</single>' ) ;
    public final EObject ruleSingle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_required_13_0=null;
        Token lv_other_14_0=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        EObject lv_options_17_0 = null;

        EObject lv_options_18_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:851:28: ( (otherlv_0= '<single' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'dependsOn' otherlv_11= '=' ( ( ruleEString ) ) )? ( (lv_required_13_0= 'required' ) )? ( (lv_other_14_0= 'other' ) )? otherlv_15= '>' ( ( ruleEString ) )? ( (lv_options_17_0= ruleOption ) ) ( (lv_options_18_0= ruleOption ) )* otherlv_19= '</single>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:852:1: (otherlv_0= '<single' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'dependsOn' otherlv_11= '=' ( ( ruleEString ) ) )? ( (lv_required_13_0= 'required' ) )? ( (lv_other_14_0= 'other' ) )? otherlv_15= '>' ( ( ruleEString ) )? ( (lv_options_17_0= ruleOption ) ) ( (lv_options_18_0= ruleOption ) )* otherlv_19= '</single>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:852:1: (otherlv_0= '<single' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'dependsOn' otherlv_11= '=' ( ( ruleEString ) ) )? ( (lv_required_13_0= 'required' ) )? ( (lv_other_14_0= 'other' ) )? otherlv_15= '>' ( ( ruleEString ) )? ( (lv_options_17_0= ruleOption ) ) ( (lv_options_18_0= ruleOption ) )* otherlv_19= '</single>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:852:3: otherlv_0= '<single' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'dependsOn' otherlv_11= '=' ( ( ruleEString ) ) )? ( (lv_required_13_0= 'required' ) )? ( (lv_other_14_0= 'other' ) )? otherlv_15= '>' ( ( ruleEString ) )? ( (lv_options_17_0= ruleOption ) ) ( (lv_options_18_0= ruleOption ) )* otherlv_19= '</single>'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingle1931); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleAccess().getSingleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:856:1: (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:856:3: otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSingle1944); 

                        	newLeafNode(otherlv_1, grammarAccess.getSingleAccess().getTitleKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle1956); 

                        	newLeafNode(otherlv_2, grammarAccess.getSingleAccess().getEqualsSignKeyword_1_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:864:1: ( (lv_title_3_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:865:1: (lv_title_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:865:1: (lv_title_3_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:866:3: lv_title_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleAccess().getTitleEStringParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle1977);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:882:4: (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:882:6: otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle1992); 

                        	newLeafNode(otherlv_4, grammarAccess.getSingleAccess().getDescriptionKeyword_2_0());
                        
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle2004); 

                        	newLeafNode(otherlv_5, grammarAccess.getSingleAccess().getEqualsSignKeyword_2_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:890:1: ( (lv_description_6_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:1: (lv_description_6_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:1: (lv_description_6_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleAccess().getDescriptionEStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2025);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:908:4: (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:908:6: otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSingle2040); 

                        	newLeafNode(otherlv_7, grammarAccess.getSingleAccess().getIdKeyword_3_0());
                        
                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle2052); 

                        	newLeafNode(otherlv_8, grammarAccess.getSingleAccess().getEqualsSignKeyword_3_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:916:1: ( (lv_id_9_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:917:1: (lv_id_9_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:917:1: (lv_id_9_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:918:3: lv_id_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleAccess().getIdEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2073);
                    lv_id_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:934:4: (otherlv_10= 'dependsOn' otherlv_11= '=' ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:934:6: otherlv_10= 'dependsOn' otherlv_11= '=' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSingle2088); 

                        	newLeafNode(otherlv_10, grammarAccess.getSingleAccess().getDependsOnKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle2100); 

                        	newLeafNode(otherlv_11, grammarAccess.getSingleAccess().getEqualsSignKeyword_4_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:942:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:943:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:943:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:944:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSingleAccess().getDependsOnAnswerCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2123);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:957:4: ( (lv_required_13_0= 'required' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:958:1: (lv_required_13_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:958:1: (lv_required_13_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:959:3: lv_required_13_0= 'required'
                    {
                    lv_required_13_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingle2143); 

                            newLeafNode(lv_required_13_0, grammarAccess.getSingleAccess().getRequiredRequiredKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:972:3: ( (lv_other_14_0= 'other' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:973:1: (lv_other_14_0= 'other' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:973:1: (lv_other_14_0= 'other' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:974:3: lv_other_14_0= 'other'
                    {
                    lv_other_14_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSingle2175); 

                            newLeafNode(lv_other_14_0, grammarAccess.getSingleAccess().getOtherOtherKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleRule());
                    	        }
                           		setWithLastConsumed(current, "other", true, "other");
                    	    

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSingle2201); 

                	newLeafNode(otherlv_15, grammarAccess.getSingleAccess().getGreaterThanSignKeyword_7());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:991:1: ( ( ruleEString ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:992:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:992:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:993:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSingleAccess().getTemplateOptionCrossReference_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2224);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1006:3: ( (lv_options_17_0= ruleOption ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1007:1: (lv_options_17_0= ruleOption )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1007:1: (lv_options_17_0= ruleOption )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1008:3: lv_options_17_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getSingleAccess().getOptionsOptionParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingle2246);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1024:2: ( (lv_options_18_0= ruleOption ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==17||LA25_0==20||LA25_0==52) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1025:1: (lv_options_18_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1025:1: (lv_options_18_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1026:3: lv_options_18_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getOptionsOptionParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingle2267);
            	    lv_options_18_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_18_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_19=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSingle2280); 

                	newLeafNode(otherlv_19, grammarAccess.getSingleAccess().getSingleKeyword_11());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1054:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1055:2: (iv_ruleMultiple= ruleMultiple EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1056:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_entryRuleMultiple2316);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiple2326); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1063:1: ruleMultiple returns [EObject current=null] : (otherlv_0= '<multiple' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'lower' otherlv_11= '=' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' otherlv_14= '=' ( (lv_upper_15_0= ruleEInt ) ) )? (otherlv_16= 'dependsOn' ( ( ruleEString ) ) )? ( (lv_required_18_0= 'required' ) )? ( (lv_other_19_0= 'other' ) )? ( (lv_showLimits_20_0= 'showLimits' ) )? otherlv_21= '>' ( ( ruleEString ) )? ( (lv_options_23_0= ruleOption ) ) (otherlv_24= ',' ( (lv_options_25_0= ruleOption ) ) )* otherlv_26= '}' otherlv_27= '</multiple>' ) ;
    public final EObject ruleMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_required_18_0=null;
        Token lv_other_19_0=null;
        Token lv_showLimits_20_0=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        AntlrDatatypeRuleToken lv_lower_12_0 = null;

        AntlrDatatypeRuleToken lv_upper_15_0 = null;

        EObject lv_options_23_0 = null;

        EObject lv_options_25_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1066:28: ( (otherlv_0= '<multiple' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'lower' otherlv_11= '=' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' otherlv_14= '=' ( (lv_upper_15_0= ruleEInt ) ) )? (otherlv_16= 'dependsOn' ( ( ruleEString ) ) )? ( (lv_required_18_0= 'required' ) )? ( (lv_other_19_0= 'other' ) )? ( (lv_showLimits_20_0= 'showLimits' ) )? otherlv_21= '>' ( ( ruleEString ) )? ( (lv_options_23_0= ruleOption ) ) (otherlv_24= ',' ( (lv_options_25_0= ruleOption ) ) )* otherlv_26= '}' otherlv_27= '</multiple>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1067:1: (otherlv_0= '<multiple' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'lower' otherlv_11= '=' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' otherlv_14= '=' ( (lv_upper_15_0= ruleEInt ) ) )? (otherlv_16= 'dependsOn' ( ( ruleEString ) ) )? ( (lv_required_18_0= 'required' ) )? ( (lv_other_19_0= 'other' ) )? ( (lv_showLimits_20_0= 'showLimits' ) )? otherlv_21= '>' ( ( ruleEString ) )? ( (lv_options_23_0= ruleOption ) ) (otherlv_24= ',' ( (lv_options_25_0= ruleOption ) ) )* otherlv_26= '}' otherlv_27= '</multiple>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1067:1: (otherlv_0= '<multiple' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'lower' otherlv_11= '=' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' otherlv_14= '=' ( (lv_upper_15_0= ruleEInt ) ) )? (otherlv_16= 'dependsOn' ( ( ruleEString ) ) )? ( (lv_required_18_0= 'required' ) )? ( (lv_other_19_0= 'other' ) )? ( (lv_showLimits_20_0= 'showLimits' ) )? otherlv_21= '>' ( ( ruleEString ) )? ( (lv_options_23_0= ruleOption ) ) (otherlv_24= ',' ( (lv_options_25_0= ruleOption ) ) )* otherlv_26= '}' otherlv_27= '</multiple>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1067:3: otherlv_0= '<multiple' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'lower' otherlv_11= '=' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' otherlv_14= '=' ( (lv_upper_15_0= ruleEInt ) ) )? (otherlv_16= 'dependsOn' ( ( ruleEString ) ) )? ( (lv_required_18_0= 'required' ) )? ( (lv_other_19_0= 'other' ) )? ( (lv_showLimits_20_0= 'showLimits' ) )? otherlv_21= '>' ( ( ruleEString ) )? ( (lv_options_23_0= ruleOption ) ) (otherlv_24= ',' ( (lv_options_25_0= ruleOption ) ) )* otherlv_26= '}' otherlv_27= '</multiple>'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMultiple2363); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleAccess().getMultipleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1071:1: (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1071:3: otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultiple2376); 

                        	newLeafNode(otherlv_1, grammarAccess.getMultipleAccess().getTitleKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple2388); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultipleAccess().getEqualsSignKeyword_1_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1079:1: ( (lv_title_3_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1080:1: (lv_title_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1080:1: (lv_title_3_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1081:3: lv_title_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getTitleEStringParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple2409);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1097:4: (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==14) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1097:6: otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple2424); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultipleAccess().getDescriptionKeyword_2_0());
                        
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple2436); 

                        	newLeafNode(otherlv_5, grammarAccess.getMultipleAccess().getEqualsSignKeyword_2_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1105:1: ( (lv_description_6_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1106:1: (lv_description_6_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1106:1: (lv_description_6_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1107:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getDescriptionEStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple2457);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1123:4: (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1123:6: otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultiple2472); 

                        	newLeafNode(otherlv_7, grammarAccess.getMultipleAccess().getIdKeyword_3_0());
                        
                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple2484); 

                        	newLeafNode(otherlv_8, grammarAccess.getMultipleAccess().getEqualsSignKeyword_3_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1131:1: ( (lv_id_9_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1132:1: (lv_id_9_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1132:1: (lv_id_9_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1133:3: lv_id_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getIdEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple2505);
                    lv_id_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1149:4: (otherlv_10= 'lower' otherlv_11= '=' ( (lv_lower_12_0= ruleEInt ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1149:6: otherlv_10= 'lower' otherlv_11= '=' ( (lv_lower_12_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultiple2520); 

                        	newLeafNode(otherlv_10, grammarAccess.getMultipleAccess().getLowerKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple2532); 

                        	newLeafNode(otherlv_11, grammarAccess.getMultipleAccess().getEqualsSignKeyword_4_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1157:1: ( (lv_lower_12_0= ruleEInt ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1158:1: (lv_lower_12_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1158:1: (lv_lower_12_0= ruleEInt )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1159:3: lv_lower_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getLowerEIntParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultiple2553);
                    lv_lower_12_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1175:4: (otherlv_13= 'upper' otherlv_14= '=' ( (lv_upper_15_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1175:6: otherlv_13= 'upper' otherlv_14= '=' ( (lv_upper_15_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMultiple2568); 

                        	newLeafNode(otherlv_13, grammarAccess.getMultipleAccess().getUpperKeyword_5_0());
                        
                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple2580); 

                        	newLeafNode(otherlv_14, grammarAccess.getMultipleAccess().getEqualsSignKeyword_5_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1183:1: ( (lv_upper_15_0= ruleEInt ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1184:1: (lv_upper_15_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1184:1: (lv_upper_15_0= ruleEInt )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1185:3: lv_upper_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getUpperEIntParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultiple2601);
                    lv_upper_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1201:4: (otherlv_16= 'dependsOn' ( ( ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1201:6: otherlv_16= 'dependsOn' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultiple2616); 

                        	newLeafNode(otherlv_16, grammarAccess.getMultipleAccess().getDependsOnKeyword_6_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1205:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1206:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1206:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1207:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getDependsOnAnswerCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple2639);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1220:4: ( (lv_required_18_0= 'required' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1221:1: (lv_required_18_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1221:1: (lv_required_18_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1222:3: lv_required_18_0= 'required'
                    {
                    lv_required_18_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultiple2659); 

                            newLeafNode(lv_required_18_0, grammarAccess.getMultipleAccess().getRequiredRequiredKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1235:3: ( (lv_other_19_0= 'other' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1236:1: (lv_other_19_0= 'other' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1236:1: (lv_other_19_0= 'other' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1237:3: lv_other_19_0= 'other'
                    {
                    lv_other_19_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultiple2691); 

                            newLeafNode(lv_other_19_0, grammarAccess.getMultipleAccess().getOtherOtherKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleRule());
                    	        }
                           		setWithLastConsumed(current, "other", true, "other");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1250:3: ( (lv_showLimits_20_0= 'showLimits' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1251:1: (lv_showLimits_20_0= 'showLimits' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1251:1: (lv_showLimits_20_0= 'showLimits' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1252:3: lv_showLimits_20_0= 'showLimits'
                    {
                    lv_showLimits_20_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMultiple2723); 

                            newLeafNode(lv_showLimits_20_0, grammarAccess.getMultipleAccess().getShowLimitsShowLimitsKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleRule());
                    	        }
                           		setWithLastConsumed(current, "showLimits", true, "showLimits");
                    	    

                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultiple2749); 

                	newLeafNode(otherlv_21, grammarAccess.getMultipleAccess().getGreaterThanSignKeyword_10());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1269:1: ( ( ruleEString ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_ID)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1270:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1270:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1271:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getTemplateOptionCrossReference_11_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple2772);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1284:3: ( (lv_options_23_0= ruleOption ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1285:1: (lv_options_23_0= ruleOption )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1285:1: (lv_options_23_0= ruleOption )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1286:3: lv_options_23_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getMultipleAccess().getOptionsOptionParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultiple2794);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1302:2: (otherlv_24= ',' ( (lv_options_25_0= ruleOption ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==33) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1302:4: otherlv_24= ',' ( (lv_options_25_0= ruleOption ) )
            	    {
            	    otherlv_24=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMultiple2807); 

            	        	newLeafNode(otherlv_24, grammarAccess.getMultipleAccess().getCommaKeyword_13_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1306:1: ( (lv_options_25_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1307:1: (lv_options_25_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1307:1: (lv_options_25_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1308:3: lv_options_25_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getOptionsOptionParserRuleCall_13_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultiple2828);
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
            	    break loop36;
                }
            } while (true);

            otherlv_26=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultiple2842); 

                	newLeafNode(otherlv_26, grammarAccess.getMultipleAccess().getRightCurlyBracketKeyword_14());
                
            otherlv_27=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMultiple2854); 

                	newLeafNode(otherlv_27, grammarAccess.getMultipleAccess().getMultipleKeyword_15());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1340:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1341:2: (iv_ruleText= ruleText EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1342:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText2890);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText2900); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1349:1: ruleText returns [EObject current=null] : ( () otherlv_1= '<text' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )? ( (lv_required_14_0= 'required' ) )? ( (lv_multiline_15_0= 'multiline' ) )? otherlv_16= '/>' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_required_14_0=null;
        Token lv_multiline_15_0=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1352:28: ( ( () otherlv_1= '<text' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )? ( (lv_required_14_0= 'required' ) )? ( (lv_multiline_15_0= 'multiline' ) )? otherlv_16= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1353:1: ( () otherlv_1= '<text' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )? ( (lv_required_14_0= 'required' ) )? ( (lv_multiline_15_0= 'multiline' ) )? otherlv_16= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1353:1: ( () otherlv_1= '<text' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )? ( (lv_required_14_0= 'required' ) )? ( (lv_multiline_15_0= 'multiline' ) )? otherlv_16= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1353:2: () otherlv_1= '<text' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )? ( (lv_required_14_0= 'required' ) )? ( (lv_multiline_15_0= 'multiline' ) )? otherlv_16= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1353:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1354:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleText2946); 

                	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1363:1: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==12) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1363:3: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleText2959); 

                        	newLeafNode(otherlv_2, grammarAccess.getTextAccess().getTitleKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText2971); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextAccess().getEqualsSignKeyword_2_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1371:1: ( (lv_title_4_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1372:1: (lv_title_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1372:1: (lv_title_4_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1373:3: lv_title_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextAccess().getTitleEStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText2992);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1389:4: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==14) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1389:6: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText3007); 

                        	newLeafNode(otherlv_5, grammarAccess.getTextAccess().getDescriptionKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText3019); 

                        	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getEqualsSignKeyword_3_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1397:1: ( (lv_description_7_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1398:1: (lv_description_7_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1398:1: (lv_description_7_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1399:3: lv_description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextAccess().getDescriptionEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText3040);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1415:4: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==18) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1415:6: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleText3055); 

                        	newLeafNode(otherlv_8, grammarAccess.getTextAccess().getIdKeyword_4_0());
                        
                    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText3067); 

                        	newLeafNode(otherlv_9, grammarAccess.getTextAccess().getEqualsSignKeyword_4_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1423:1: ( (lv_id_10_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1424:1: (lv_id_10_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1424:1: (lv_id_10_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1425:3: lv_id_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextAccess().getIdEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText3088);
                    lv_id_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextRule());
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1441:4: (otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1441:6: otherlv_11= 'dependsOn' otherlv_12= '=' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleText3103); 

                        	newLeafNode(otherlv_11, grammarAccess.getTextAccess().getDependsOnKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText3115); 

                        	newLeafNode(otherlv_12, grammarAccess.getTextAccess().getEqualsSignKeyword_5_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1449:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1450:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1450:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1451:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTextAccess().getDependsOnAnswerCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText3138);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1464:4: ( (lv_required_14_0= 'required' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==24) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1465:1: (lv_required_14_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1465:1: (lv_required_14_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1466:3: lv_required_14_0= 'required'
                    {
                    lv_required_14_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleText3158); 

                            newLeafNode(lv_required_14_0, grammarAccess.getTextAccess().getRequiredRequiredKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1479:3: ( (lv_multiline_15_0= 'multiline' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1480:1: (lv_multiline_15_0= 'multiline' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1480:1: (lv_multiline_15_0= 'multiline' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1481:3: lv_multiline_15_0= 'multiline'
                    {
                    lv_multiline_15_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleText3190); 

                            newLeafNode(lv_multiline_15_0, grammarAccess.getTextAccess().getMultilineMultilineKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextRule());
                    	        }
                           		setWithLastConsumed(current, "multiline", true, "multiline");
                    	    

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleText3216); 

                	newLeafNode(otherlv_16, grammarAccess.getTextAccess().getSolidusGreaterThanSignKeyword_8());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1506:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1507:2: (iv_ruleDate= ruleDate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1508:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate3252);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate3262); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1515:1: ruleDate returns [EObject current=null] : ( () otherlv_1= '<date' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'from' otherlv_12= '=' ( (lv_from_13_0= ruleEString ) ) )? (otherlv_14= 'to' otherlv_15= '=' ( (lv_to_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) ) )? ( (lv_required_20_0= 'required' ) )? ( (lv_day_21_0= 'day' ) )? ( (lv_month_22_0= 'month' ) )? ( (lv_year_23_0= 'year' ) )? otherlv_24= '/>' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        Token lv_required_20_0=null;
        Token lv_day_21_0=null;
        Token lv_month_22_0=null;
        Token lv_year_23_0=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;

        AntlrDatatypeRuleToken lv_from_13_0 = null;

        AntlrDatatypeRuleToken lv_to_16_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1518:28: ( ( () otherlv_1= '<date' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'from' otherlv_12= '=' ( (lv_from_13_0= ruleEString ) ) )? (otherlv_14= 'to' otherlv_15= '=' ( (lv_to_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) ) )? ( (lv_required_20_0= 'required' ) )? ( (lv_day_21_0= 'day' ) )? ( (lv_month_22_0= 'month' ) )? ( (lv_year_23_0= 'year' ) )? otherlv_24= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1519:1: ( () otherlv_1= '<date' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'from' otherlv_12= '=' ( (lv_from_13_0= ruleEString ) ) )? (otherlv_14= 'to' otherlv_15= '=' ( (lv_to_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) ) )? ( (lv_required_20_0= 'required' ) )? ( (lv_day_21_0= 'day' ) )? ( (lv_month_22_0= 'month' ) )? ( (lv_year_23_0= 'year' ) )? otherlv_24= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1519:1: ( () otherlv_1= '<date' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'from' otherlv_12= '=' ( (lv_from_13_0= ruleEString ) ) )? (otherlv_14= 'to' otherlv_15= '=' ( (lv_to_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) ) )? ( (lv_required_20_0= 'required' ) )? ( (lv_day_21_0= 'day' ) )? ( (lv_month_22_0= 'month' ) )? ( (lv_year_23_0= 'year' ) )? otherlv_24= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1519:2: () otherlv_1= '<date' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'from' otherlv_12= '=' ( (lv_from_13_0= ruleEString ) ) )? (otherlv_14= 'to' otherlv_15= '=' ( (lv_to_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) ) )? ( (lv_required_20_0= 'required' ) )? ( (lv_day_21_0= 'day' ) )? ( (lv_month_22_0= 'month' ) )? ( (lv_year_23_0= 'year' ) )? otherlv_24= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1519:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1520:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDate3308); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1529:1: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==12) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1529:3: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDate3321); 

                        	newLeafNode(otherlv_2, grammarAccess.getDateAccess().getTitleKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate3333); 

                        	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getEqualsSignKeyword_2_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1537:1: ( (lv_title_4_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1538:1: (lv_title_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1538:1: (lv_title_4_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1539:3: lv_title_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getTitleEStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate3354);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1555:4: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==14) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1555:6: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate3369); 

                        	newLeafNode(otherlv_5, grammarAccess.getDateAccess().getDescriptionKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate3381); 

                        	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getEqualsSignKeyword_3_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1563:1: ( (lv_description_7_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1564:1: (lv_description_7_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1564:1: (lv_description_7_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1565:3: lv_description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getDescriptionEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate3402);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1581:4: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==18) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1581:6: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDate3417); 

                        	newLeafNode(otherlv_8, grammarAccess.getDateAccess().getIdKeyword_4_0());
                        
                    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate3429); 

                        	newLeafNode(otherlv_9, grammarAccess.getDateAccess().getEqualsSignKeyword_4_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1589:1: ( (lv_id_10_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1590:1: (lv_id_10_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1590:1: (lv_id_10_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1591:3: lv_id_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getIdEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate3450);
                    lv_id_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDateRule());
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1607:4: (otherlv_11= 'from' otherlv_12= '=' ( (lv_from_13_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1607:6: otherlv_11= 'from' otherlv_12= '=' ( (lv_from_13_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDate3465); 

                        	newLeafNode(otherlv_11, grammarAccess.getDateAccess().getFromKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate3477); 

                        	newLeafNode(otherlv_12, grammarAccess.getDateAccess().getEqualsSignKeyword_5_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1615:1: ( (lv_from_13_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1616:1: (lv_from_13_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1616:1: (lv_from_13_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1617:3: lv_from_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getFromEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate3498);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1633:4: (otherlv_14= 'to' otherlv_15= '=' ( (lv_to_16_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==41) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1633:6: otherlv_14= 'to' otherlv_15= '=' ( (lv_to_16_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDate3513); 

                        	newLeafNode(otherlv_14, grammarAccess.getDateAccess().getToKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate3525); 

                        	newLeafNode(otherlv_15, grammarAccess.getDateAccess().getEqualsSignKeyword_6_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1641:1: ( (lv_to_16_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1642:1: (lv_to_16_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1642:1: (lv_to_16_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1643:3: lv_to_16_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getToEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate3546);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1659:4: (otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==23) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1659:6: otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDate3561); 

                        	newLeafNode(otherlv_17, grammarAccess.getDateAccess().getDependsOnKeyword_7_0());
                        
                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate3573); 

                        	newLeafNode(otherlv_18, grammarAccess.getDateAccess().getEqualsSignKeyword_7_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1667:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1668:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1668:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1669:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getDependsOnAnswerCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate3596);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1682:4: ( (lv_required_20_0= 'required' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==24) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1683:1: (lv_required_20_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1683:1: (lv_required_20_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1684:3: lv_required_20_0= 'required'
                    {
                    lv_required_20_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDate3616); 

                            newLeafNode(lv_required_20_0, grammarAccess.getDateAccess().getRequiredRequiredKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1697:3: ( (lv_day_21_0= 'day' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1698:1: (lv_day_21_0= 'day' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1698:1: (lv_day_21_0= 'day' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1699:3: lv_day_21_0= 'day'
                    {
                    lv_day_21_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDate3648); 

                            newLeafNode(lv_day_21_0, grammarAccess.getDateAccess().getDayDayKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateRule());
                    	        }
                           		setWithLastConsumed(current, "day", true, "day");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1712:3: ( (lv_month_22_0= 'month' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1713:1: (lv_month_22_0= 'month' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1713:1: (lv_month_22_0= 'month' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1714:3: lv_month_22_0= 'month'
                    {
                    lv_month_22_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDate3680); 

                            newLeafNode(lv_month_22_0, grammarAccess.getDateAccess().getMonthMonthKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateRule());
                    	        }
                           		setWithLastConsumed(current, "month", true, "month");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1727:3: ( (lv_year_23_0= 'year' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==44) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1728:1: (lv_year_23_0= 'year' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1728:1: (lv_year_23_0= 'year' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1729:3: lv_year_23_0= 'year'
                    {
                    lv_year_23_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDate3712); 

                            newLeafNode(lv_year_23_0, grammarAccess.getDateAccess().getYearYearKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateRule());
                    	        }
                           		setWithLastConsumed(current, "year", true, "year");
                    	    

                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDate3738); 

                	newLeafNode(otherlv_24, grammarAccess.getDateAccess().getSolidusGreaterThanSignKeyword_12());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1754:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1755:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1756:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber3774);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber3784); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1763:1: ruleNumber returns [EObject current=null] : ( () otherlv_1= '<number' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )? (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )? (otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) ) )? ( (lv_required_20_0= 'required' ) )? ( (lv_showLimits_21_0= 'showLimits' ) )? otherlv_22= '/>' ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        Token lv_required_20_0=null;
        Token lv_showLimits_21_0=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;

        AntlrDatatypeRuleToken lv_lower_13_0 = null;

        AntlrDatatypeRuleToken lv_upper_16_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1766:28: ( ( () otherlv_1= '<number' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )? (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )? (otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) ) )? ( (lv_required_20_0= 'required' ) )? ( (lv_showLimits_21_0= 'showLimits' ) )? otherlv_22= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1767:1: ( () otherlv_1= '<number' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )? (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )? (otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) ) )? ( (lv_required_20_0= 'required' ) )? ( (lv_showLimits_21_0= 'showLimits' ) )? otherlv_22= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1767:1: ( () otherlv_1= '<number' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )? (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )? (otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) ) )? ( (lv_required_20_0= 'required' ) )? ( (lv_showLimits_21_0= 'showLimits' ) )? otherlv_22= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1767:2: () otherlv_1= '<number' (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )? (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )? (otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) ) )? ( (lv_required_20_0= 'required' ) )? ( (lv_showLimits_21_0= 'showLimits' ) )? otherlv_22= '/>'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1767:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1768:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberAccess().getNumberAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleNumber3830); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getNumberKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1777:1: (otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==12) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1777:3: otherlv_2= 'title' otherlv_3= '=' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNumber3843); 

                        	newLeafNode(otherlv_2, grammarAccess.getNumberAccess().getTitleKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber3855); 

                        	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getEqualsSignKeyword_2_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1785:1: ( (lv_title_4_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1786:1: (lv_title_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1786:1: (lv_title_4_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1787:3: lv_title_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getTitleEStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber3876);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1803:4: (otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==14) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1803:6: otherlv_5= 'description' otherlv_6= '=' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber3891); 

                        	newLeafNode(otherlv_5, grammarAccess.getNumberAccess().getDescriptionKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber3903); 

                        	newLeafNode(otherlv_6, grammarAccess.getNumberAccess().getEqualsSignKeyword_3_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1811:1: ( (lv_description_7_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1812:1: (lv_description_7_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1812:1: (lv_description_7_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1813:3: lv_description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getDescriptionEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber3924);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1829:4: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==18) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1829:6: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleNumber3939); 

                        	newLeafNode(otherlv_8, grammarAccess.getNumberAccess().getIdKeyword_4_0());
                        
                    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber3951); 

                        	newLeafNode(otherlv_9, grammarAccess.getNumberAccess().getEqualsSignKeyword_4_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1837:1: ( (lv_id_10_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1838:1: (lv_id_10_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1838:1: (lv_id_10_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1839:3: lv_id_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getIdEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber3972);
                    lv_id_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberRule());
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1855:4: (otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==30) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1855:6: otherlv_11= 'lower' otherlv_12= '=' ( (lv_lower_13_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNumber3987); 

                        	newLeafNode(otherlv_11, grammarAccess.getNumberAccess().getLowerKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber3999); 

                        	newLeafNode(otherlv_12, grammarAccess.getNumberAccess().getEqualsSignKeyword_5_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1863:1: ( (lv_lower_13_0= ruleEInt ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1864:1: (lv_lower_13_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1864:1: (lv_lower_13_0= ruleEInt )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1865:3: lv_lower_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getLowerEIntParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber4020);
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1881:4: (otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==31) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1881:6: otherlv_14= 'upper' otherlv_15= '=' ( (lv_upper_16_0= ruleEInt ) )
                    {
                    otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNumber4035); 

                        	newLeafNode(otherlv_14, grammarAccess.getNumberAccess().getUpperKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber4047); 

                        	newLeafNode(otherlv_15, grammarAccess.getNumberAccess().getEqualsSignKeyword_6_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1889:1: ( (lv_upper_16_0= ruleEInt ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1890:1: (lv_upper_16_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1890:1: (lv_upper_16_0= ruleEInt )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1891:3: lv_upper_16_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getUpperEIntParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber4068);
                    lv_upper_16_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberRule());
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1907:4: (otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==23) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1907:6: otherlv_17= 'dependsOn' otherlv_18= '=' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNumber4083); 

                        	newLeafNode(otherlv_17, grammarAccess.getNumberAccess().getDependsOnKeyword_7_0());
                        
                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber4095); 

                        	newLeafNode(otherlv_18, grammarAccess.getNumberAccess().getEqualsSignKeyword_7_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1915:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1916:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1916:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1917:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getDependsOnAnswerCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber4118);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1930:4: ( (lv_required_20_0= 'required' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==24) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1931:1: (lv_required_20_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1931:1: (lv_required_20_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1932:3: lv_required_20_0= 'required'
                    {
                    lv_required_20_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNumber4138); 

                            newLeafNode(lv_required_20_0, grammarAccess.getNumberAccess().getRequiredRequiredKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1945:3: ( (lv_showLimits_21_0= 'showLimits' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==32) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1946:1: (lv_showLimits_21_0= 'showLimits' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1946:1: (lv_showLimits_21_0= 'showLimits' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1947:3: lv_showLimits_21_0= 'showLimits'
                    {
                    lv_showLimits_21_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNumber4170); 

                            newLeafNode(lv_showLimits_21_0, grammarAccess.getNumberAccess().getShowLimitsShowLimitsKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberRule());
                    	        }
                           		setWithLastConsumed(current, "showLimits", true, "showLimits");
                    	    

                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleNumber4196); 

                	newLeafNode(otherlv_22, grammarAccess.getNumberAccess().getSolidusGreaterThanSignKeyword_10());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1972:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1973:2: (iv_ruleScale= ruleScale EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1974:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScale_in_entryRuleScale4232);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScale4242); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1981:1: ruleScale returns [EObject current=null] : (otherlv_0= '<scale' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? otherlv_10= 'lower' otherlv_11= '=' ( (lv_lower_12_0= ruleEInt ) ) otherlv_13= 'upper' otherlv_14= '=' ( (lv_upper_15_0= ruleEInt ) ) (otherlv_16= 'lowerLabel' otherlv_17= '=' ( (lv_lowerLabel_18_0= ruleEString ) ) )? (otherlv_19= 'upperLabel' otherlv_20= '=' ( (lv_upperLabel_21_0= ruleEString ) ) )? (otherlv_22= 'dependsOn' otherlv_23= '=' ( ( ruleEString ) ) )? ( (lv_required_25_0= 'required' ) )? otherlv_26= '/>' ) ;
    public final EObject ruleScale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
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
        Token lv_required_25_0=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        AntlrDatatypeRuleToken lv_lower_12_0 = null;

        AntlrDatatypeRuleToken lv_upper_15_0 = null;

        AntlrDatatypeRuleToken lv_lowerLabel_18_0 = null;

        AntlrDatatypeRuleToken lv_upperLabel_21_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1984:28: ( (otherlv_0= '<scale' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? otherlv_10= 'lower' otherlv_11= '=' ( (lv_lower_12_0= ruleEInt ) ) otherlv_13= 'upper' otherlv_14= '=' ( (lv_upper_15_0= ruleEInt ) ) (otherlv_16= 'lowerLabel' otherlv_17= '=' ( (lv_lowerLabel_18_0= ruleEString ) ) )? (otherlv_19= 'upperLabel' otherlv_20= '=' ( (lv_upperLabel_21_0= ruleEString ) ) )? (otherlv_22= 'dependsOn' otherlv_23= '=' ( ( ruleEString ) ) )? ( (lv_required_25_0= 'required' ) )? otherlv_26= '/>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1985:1: (otherlv_0= '<scale' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? otherlv_10= 'lower' otherlv_11= '=' ( (lv_lower_12_0= ruleEInt ) ) otherlv_13= 'upper' otherlv_14= '=' ( (lv_upper_15_0= ruleEInt ) ) (otherlv_16= 'lowerLabel' otherlv_17= '=' ( (lv_lowerLabel_18_0= ruleEString ) ) )? (otherlv_19= 'upperLabel' otherlv_20= '=' ( (lv_upperLabel_21_0= ruleEString ) ) )? (otherlv_22= 'dependsOn' otherlv_23= '=' ( ( ruleEString ) ) )? ( (lv_required_25_0= 'required' ) )? otherlv_26= '/>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1985:1: (otherlv_0= '<scale' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? otherlv_10= 'lower' otherlv_11= '=' ( (lv_lower_12_0= ruleEInt ) ) otherlv_13= 'upper' otherlv_14= '=' ( (lv_upper_15_0= ruleEInt ) ) (otherlv_16= 'lowerLabel' otherlv_17= '=' ( (lv_lowerLabel_18_0= ruleEString ) ) )? (otherlv_19= 'upperLabel' otherlv_20= '=' ( (lv_upperLabel_21_0= ruleEString ) ) )? (otherlv_22= 'dependsOn' otherlv_23= '=' ( ( ruleEString ) ) )? ( (lv_required_25_0= 'required' ) )? otherlv_26= '/>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1985:3: otherlv_0= '<scale' (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )? otherlv_10= 'lower' otherlv_11= '=' ( (lv_lower_12_0= ruleEInt ) ) otherlv_13= 'upper' otherlv_14= '=' ( (lv_upper_15_0= ruleEInt ) ) (otherlv_16= 'lowerLabel' otherlv_17= '=' ( (lv_lowerLabel_18_0= ruleEString ) ) )? (otherlv_19= 'upperLabel' otherlv_20= '=' ( (lv_upperLabel_21_0= ruleEString ) ) )? (otherlv_22= 'dependsOn' otherlv_23= '=' ( ( ruleEString ) ) )? ( (lv_required_25_0= 'required' ) )? otherlv_26= '/>'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleScale4279); 

                	newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1989:1: (otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==12) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1989:3: otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleScale4292); 

                        	newLeafNode(otherlv_1, grammarAccess.getScaleAccess().getTitleKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale4304); 

                        	newLeafNode(otherlv_2, grammarAccess.getScaleAccess().getEqualsSignKeyword_1_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1997:1: ( (lv_title_3_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1998:1: (lv_title_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1998:1: (lv_title_3_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1999:3: lv_title_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getScaleAccess().getTitleEStringParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4325);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2015:4: (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==14) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2015:6: otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale4340); 

                        	newLeafNode(otherlv_4, grammarAccess.getScaleAccess().getDescriptionKeyword_2_0());
                        
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale4352); 

                        	newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getEqualsSignKeyword_2_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2023:1: ( (lv_description_6_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2024:1: (lv_description_6_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2024:1: (lv_description_6_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2025:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getScaleAccess().getDescriptionEStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4373);
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


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2041:4: (otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==18) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2041:6: otherlv_7= 'id' otherlv_8= '=' ( (lv_id_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleScale4388); 

                        	newLeafNode(otherlv_7, grammarAccess.getScaleAccess().getIdKeyword_3_0());
                        
                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale4400); 

                        	newLeafNode(otherlv_8, grammarAccess.getScaleAccess().getEqualsSignKeyword_3_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2049:1: ( (lv_id_9_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2050:1: (lv_id_9_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2050:1: (lv_id_9_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2051:3: lv_id_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getScaleAccess().getIdEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4421);
                    lv_id_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScaleRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleScale4435); 

                	newLeafNode(otherlv_10, grammarAccess.getScaleAccess().getLowerKeyword_4());
                
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale4447); 

                	newLeafNode(otherlv_11, grammarAccess.getScaleAccess().getEqualsSignKeyword_5());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2075:1: ( (lv_lower_12_0= ruleEInt ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2076:1: (lv_lower_12_0= ruleEInt )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2076:1: (lv_lower_12_0= ruleEInt )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2077:3: lv_lower_12_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getScaleAccess().getLowerEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale4468);
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

            otherlv_13=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleScale4480); 

                	newLeafNode(otherlv_13, grammarAccess.getScaleAccess().getUpperKeyword_7());
                
            otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale4492); 

                	newLeafNode(otherlv_14, grammarAccess.getScaleAccess().getEqualsSignKeyword_8());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2101:1: ( (lv_upper_15_0= ruleEInt ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2102:1: (lv_upper_15_0= ruleEInt )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2102:1: (lv_upper_15_0= ruleEInt )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2103:3: lv_upper_15_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getScaleAccess().getUpperEIntParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale4513);
            lv_upper_15_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	        }
                   		set(
                   			current, 
                   			"upper",
                    		lv_upper_15_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2119:2: (otherlv_16= 'lowerLabel' otherlv_17= '=' ( (lv_lowerLabel_18_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==47) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2119:4: otherlv_16= 'lowerLabel' otherlv_17= '=' ( (lv_lowerLabel_18_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleScale4526); 

                        	newLeafNode(otherlv_16, grammarAccess.getScaleAccess().getLowerLabelKeyword_10_0());
                        
                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale4538); 

                        	newLeafNode(otherlv_17, grammarAccess.getScaleAccess().getEqualsSignKeyword_10_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2127:1: ( (lv_lowerLabel_18_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2128:1: (lv_lowerLabel_18_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2128:1: (lv_lowerLabel_18_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:3: lv_lowerLabel_18_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getScaleAccess().getLowerLabelEStringParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4559);
                    lv_lowerLabel_18_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScaleRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerLabel",
                            		lv_lowerLabel_18_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2145:4: (otherlv_19= 'upperLabel' otherlv_20= '=' ( (lv_upperLabel_21_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==48) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2145:6: otherlv_19= 'upperLabel' otherlv_20= '=' ( (lv_upperLabel_21_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleScale4574); 

                        	newLeafNode(otherlv_19, grammarAccess.getScaleAccess().getUpperLabelKeyword_11_0());
                        
                    otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale4586); 

                        	newLeafNode(otherlv_20, grammarAccess.getScaleAccess().getEqualsSignKeyword_11_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2153:1: ( (lv_upperLabel_21_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2154:1: (lv_upperLabel_21_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2154:1: (lv_upperLabel_21_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2155:3: lv_upperLabel_21_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getScaleAccess().getUpperLabelEStringParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4607);
                    lv_upperLabel_21_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScaleRule());
                    	        }
                           		set(
                           			current, 
                           			"upperLabel",
                            		lv_upperLabel_21_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2171:4: (otherlv_22= 'dependsOn' otherlv_23= '=' ( ( ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==23) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2171:6: otherlv_22= 'dependsOn' otherlv_23= '=' ( ( ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleScale4622); 

                        	newLeafNode(otherlv_22, grammarAccess.getScaleAccess().getDependsOnKeyword_12_0());
                        
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale4634); 

                        	newLeafNode(otherlv_23, grammarAccess.getScaleAccess().getEqualsSignKeyword_12_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2179:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2180:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2180:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2181:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getScaleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getScaleAccess().getDependsOnAnswerCrossReference_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4657);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2194:4: ( (lv_required_25_0= 'required' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==24) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2195:1: (lv_required_25_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2195:1: (lv_required_25_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2196:3: lv_required_25_0= 'required'
                    {
                    lv_required_25_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleScale4677); 

                            newLeafNode(lv_required_25_0, grammarAccess.getScaleAccess().getRequiredRequiredKeyword_13_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScaleRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleScale4703); 

                	newLeafNode(otherlv_26, grammarAccess.getScaleAccess().getSolidusGreaterThanSignKeyword_14());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2221:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2222:2: (iv_ruleTable= ruleTable EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2223:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable4739);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable4749); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2230:1: ruleTable returns [EObject current=null] : (otherlv_0= '<table' (otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) )? (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' ( ( ruleEString ) ) )? ( (lv_required_9_0= 'required' ) )? ( (lv_other_10_0= 'other' ) ) ( (lv_multiple_11_0= 'multiple' ) )? otherlv_12= '>' ( ( ruleEString ) )? ( (lv_options_14_0= ruleOption ) ) ( (lv_options_15_0= ruleOption ) )* ( (lv_questions_16_0= ruleTableQuestion ) ) ( (lv_questions_17_0= ruleTableQuestion ) )* ( (lv_tableOptions_18_0= ruleOption ) ) ( (lv_tableOptions_19_0= ruleOption ) )* otherlv_20= '</table>' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_required_9_0=null;
        Token lv_other_10_0=null;
        Token lv_multiple_11_0=null;
        Token otherlv_12=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_id_6_0 = null;

        EObject lv_options_14_0 = null;

        EObject lv_options_15_0 = null;

        EObject lv_questions_16_0 = null;

        EObject lv_questions_17_0 = null;

        EObject lv_tableOptions_18_0 = null;

        EObject lv_tableOptions_19_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2233:28: ( (otherlv_0= '<table' (otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) )? (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' ( ( ruleEString ) ) )? ( (lv_required_9_0= 'required' ) )? ( (lv_other_10_0= 'other' ) ) ( (lv_multiple_11_0= 'multiple' ) )? otherlv_12= '>' ( ( ruleEString ) )? ( (lv_options_14_0= ruleOption ) ) ( (lv_options_15_0= ruleOption ) )* ( (lv_questions_16_0= ruleTableQuestion ) ) ( (lv_questions_17_0= ruleTableQuestion ) )* ( (lv_tableOptions_18_0= ruleOption ) ) ( (lv_tableOptions_19_0= ruleOption ) )* otherlv_20= '</table>' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2234:1: (otherlv_0= '<table' (otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) )? (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' ( ( ruleEString ) ) )? ( (lv_required_9_0= 'required' ) )? ( (lv_other_10_0= 'other' ) ) ( (lv_multiple_11_0= 'multiple' ) )? otherlv_12= '>' ( ( ruleEString ) )? ( (lv_options_14_0= ruleOption ) ) ( (lv_options_15_0= ruleOption ) )* ( (lv_questions_16_0= ruleTableQuestion ) ) ( (lv_questions_17_0= ruleTableQuestion ) )* ( (lv_tableOptions_18_0= ruleOption ) ) ( (lv_tableOptions_19_0= ruleOption ) )* otherlv_20= '</table>' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2234:1: (otherlv_0= '<table' (otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) )? (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' ( ( ruleEString ) ) )? ( (lv_required_9_0= 'required' ) )? ( (lv_other_10_0= 'other' ) ) ( (lv_multiple_11_0= 'multiple' ) )? otherlv_12= '>' ( ( ruleEString ) )? ( (lv_options_14_0= ruleOption ) ) ( (lv_options_15_0= ruleOption ) )* ( (lv_questions_16_0= ruleTableQuestion ) ) ( (lv_questions_17_0= ruleTableQuestion ) )* ( (lv_tableOptions_18_0= ruleOption ) ) ( (lv_tableOptions_19_0= ruleOption ) )* otherlv_20= '</table>' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2234:3: otherlv_0= '<table' (otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) )? (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' ( ( ruleEString ) ) )? ( (lv_required_9_0= 'required' ) )? ( (lv_other_10_0= 'other' ) ) ( (lv_multiple_11_0= 'multiple' ) )? otherlv_12= '>' ( ( ruleEString ) )? ( (lv_options_14_0= ruleOption ) ) ( (lv_options_15_0= ruleOption ) )* ( (lv_questions_16_0= ruleTableQuestion ) ) ( (lv_questions_17_0= ruleTableQuestion ) )* ( (lv_tableOptions_18_0= ruleOption ) ) ( (lv_tableOptions_19_0= ruleOption ) )* otherlv_20= '</table>'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTable4786); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2238:1: (otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==12) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2238:3: otherlv_1= 'title' ( (lv_title_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTable4799); 

                        	newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTitleKeyword_1_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2242:1: ( (lv_title_2_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2243:1: (lv_title_2_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2243:1: (lv_title_2_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2244:3: lv_title_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable4820);
                    lv_title_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2260:4: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==14) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2260:6: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable4835); 

                        	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getDescriptionKeyword_2_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2264:1: ( (lv_description_4_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2265:1: (lv_description_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2265:1: (lv_description_4_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2266:3: lv_description_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable4856);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2282:4: (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==18) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2282:6: otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTable4871); 

                        	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getIdKeyword_3_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2286:1: ( (lv_id_6_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2287:1: (lv_id_6_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2287:1: (lv_id_6_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2288:3: lv_id_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableAccess().getIdEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable4892);
                    lv_id_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2304:4: (otherlv_7= 'dependsOn' ( ( ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==23) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2304:6: otherlv_7= 'dependsOn' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTable4907); 

                        	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getDependsOnKeyword_4_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2308:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2309:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2309:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2310:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTableAccess().getDependsOnAnswerCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable4930);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2323:4: ( (lv_required_9_0= 'required' ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==24) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2324:1: (lv_required_9_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2324:1: (lv_required_9_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2325:3: lv_required_9_0= 'required'
                    {
                    lv_required_9_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTable4950); 

                            newLeafNode(lv_required_9_0, grammarAccess.getTableAccess().getRequiredRequiredKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2338:3: ( (lv_other_10_0= 'other' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2339:1: (lv_other_10_0= 'other' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2339:1: (lv_other_10_0= 'other' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2340:3: lv_other_10_0= 'other'
            {
            lv_other_10_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTable4982); 

                    newLeafNode(lv_other_10_0, grammarAccess.getTableAccess().getOtherOtherKeyword_6_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableRule());
            	        }
                   		setWithLastConsumed(current, "other", true, "other");
            	    

            }


            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2353:2: ( (lv_multiple_11_0= 'multiple' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==50) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2354:1: (lv_multiple_11_0= 'multiple' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2354:1: (lv_multiple_11_0= 'multiple' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2355:3: lv_multiple_11_0= 'multiple'
                    {
                    lv_multiple_11_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTable5013); 

                            newLeafNode(lv_multiple_11_0, grammarAccess.getTableAccess().getMultipleMultipleKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableRule());
                    	        }
                           		setWithLastConsumed(current, "multiple", true, "multiple");
                    	    

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable5039); 

                	newLeafNode(otherlv_12, grammarAccess.getTableAccess().getGreaterThanSignKeyword_8());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2372:1: ( ( ruleEString ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=RULE_STRING && LA74_0<=RULE_ID)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2373:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2373:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2374:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTableAccess().getTemplateOptionCrossReference_9_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable5062);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2387:3: ( (lv_options_14_0= ruleOption ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2388:1: (lv_options_14_0= ruleOption )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2388:1: (lv_options_14_0= ruleOption )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2389:3: lv_options_14_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable5084);
            lv_options_14_0=ruleOption();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableRule());
            	        }
                   		add(
                   			current, 
                   			"options",
                    		lv_options_14_0, 
                    		"Option");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2405:2: ( (lv_options_15_0= ruleOption ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==17||LA75_0==20||LA75_0==52) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2406:1: (lv_options_15_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2406:1: (lv_options_15_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2407:3: lv_options_15_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable5105);
            	    lv_options_15_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_15_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2423:3: ( (lv_questions_16_0= ruleTableQuestion ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2424:1: (lv_questions_16_0= ruleTableQuestion )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2424:1: (lv_questions_16_0= ruleTableQuestion )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2425:3: lv_questions_16_0= ruleTableQuestion
            {
             
            	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable5127);
            lv_questions_16_0=ruleTableQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_16_0, 
                    		"TableQuestion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2441:2: ( (lv_questions_17_0= ruleTableQuestion ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==54) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2442:1: (lv_questions_17_0= ruleTableQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2442:1: (lv_questions_17_0= ruleTableQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2443:3: lv_questions_17_0= ruleTableQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable5148);
            	    lv_questions_17_0=ruleTableQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_17_0, 
            	            		"TableQuestion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2459:3: ( (lv_tableOptions_18_0= ruleOption ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2460:1: (lv_tableOptions_18_0= ruleOption )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2460:1: (lv_tableOptions_18_0= ruleOption )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2461:3: lv_tableOptions_18_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getTableAccess().getTableOptionsOptionParserRuleCall_14_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable5170);
            lv_tableOptions_18_0=ruleOption();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableRule());
            	        }
                   		add(
                   			current, 
                   			"tableOptions",
                    		lv_tableOptions_18_0, 
                    		"Option");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2477:2: ( (lv_tableOptions_19_0= ruleOption ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==17||LA77_0==20||LA77_0==52) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2478:1: (lv_tableOptions_19_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2478:1: (lv_tableOptions_19_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2479:3: lv_tableOptions_19_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getTableOptionsOptionParserRuleCall_15_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable5191);
            	    lv_tableOptions_19_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tableOptions",
            	            		lv_tableOptions_19_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_20=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTable5204); 

                	newLeafNode(otherlv_20, grammarAccess.getTableAccess().getTableKeyword_16());
                

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


    // $ANTLR start "entryRuleOption_Impl"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2507:1: entryRuleOption_Impl returns [EObject current=null] : iv_ruleOption_Impl= ruleOption_Impl EOF ;
    public final EObject entryRuleOption_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption_Impl = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2508:2: (iv_ruleOption_Impl= ruleOption_Impl EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2509:2: iv_ruleOption_Impl= ruleOption_Impl EOF
            {
             newCompositeNode(grammarAccess.getOption_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_Impl_in_entryRuleOption_Impl5240);
            iv_ruleOption_Impl=ruleOption_Impl();

            state._fsp--;

             current =iv_ruleOption_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption_Impl5250); 

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
    // $ANTLR end "entryRuleOption_Impl"


    // $ANTLR start "ruleOption_Impl"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2516:1: ruleOption_Impl returns [EObject current=null] : ( () otherlv_1= 'Option' ) ;
    public final EObject ruleOption_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2519:28: ( ( () otherlv_1= 'Option' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2520:1: ( () otherlv_1= 'Option' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2520:1: ( () otherlv_1= 'Option' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2520:2: () otherlv_1= 'Option'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2520:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2521:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOption_ImplAccess().getOptionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleOption_Impl5296); 

                	newLeafNode(otherlv_1, grammarAccess.getOption_ImplAccess().getOptionKeyword_1());
                

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
    // $ANTLR end "ruleOption_Impl"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2538:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2539:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2540:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt5333);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt5344); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2547:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2550:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2551:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2551:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2551:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2551:2: (kw= '-' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==53) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2552:2: kw= '-'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleEInt5383); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt5400); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2572:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2573:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2574:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion5445);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion5455); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2581:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= 'TableQuestion' otherlv_1= '{' otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleTableQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2584:28: ( (otherlv_0= 'TableQuestion' otherlv_1= '{' otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2585:1: (otherlv_0= 'TableQuestion' otherlv_1= '{' otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2585:1: (otherlv_0= 'TableQuestion' otherlv_1= '{' otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2585:3: otherlv_0= 'TableQuestion' otherlv_1= '{' otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTableQuestion5492); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getTableQuestionKeyword_0());
                
            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTableQuestion5504); 

                	newLeafNode(otherlv_1, grammarAccess.getTableQuestionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTableQuestion5516); 

                	newLeafNode(otherlv_2, grammarAccess.getTableQuestionAccess().getTitleKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2597:1: ( (lv_title_3_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2598:1: (lv_title_3_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2598:1: (lv_title_3_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2599:3: lv_title_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getTitleEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTableQuestion5537);
            lv_title_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTableQuestion5549); 

                	newLeafNode(otherlv_4, grammarAccess.getTableQuestionAccess().getRightCurlyBracketKeyword_4());
                

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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSurvey131 = new BitSet(new long[]{0x000000000000D000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey144 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey156 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey177 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey192 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey204 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey225 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSurvey239 = new BitSet(new long[]{0x0002609024430000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey261 = new BitSet(new long[]{0x0002609024430000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey282 = new BitSet(new long[]{0x0002609024430000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey307 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey328 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleSurvey343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_entryRuleItem379 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItem389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleItem436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleItem463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleItem490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleItem517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleItem544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleItem571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleItem598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleItem625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleQuestion717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleQuestion744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleQuestion771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleQuestion798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleQuestion825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleQuestion852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleQuestion879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_Impl_in_ruleOption971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleOption998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleOption1025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1061 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplate1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleAnswerTemplate1230 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAnswerTemplate1242 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnswerTemplate1254 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswerTemplate1275 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnswerTemplate1287 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleAnswerTemplate1308 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleAnswerTemplate1329 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleAnswerTemplate1342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1378 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAnswer1425 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleAnswer1438 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnswer1450 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1471 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnswer1485 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1506 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnswer1518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleGroup1603 = new BitSet(new long[]{0x000000000180D000L});
        public static final BitSet FOLLOW_12_in_ruleGroup1616 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1628 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1649 = new BitSet(new long[]{0x000000000180C000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1664 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1676 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1697 = new BitSet(new long[]{0x0000000001808000L});
        public static final BitSet FOLLOW_23_in_ruleGroup1712 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1724 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1747 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_24_in_ruleGroup1767 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGroup1793 = new BitSet(new long[]{0x0002609024400000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup1814 = new BitSet(new long[]{0x0002609026400000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup1835 = new BitSet(new long[]{0x0002609026400000L});
        public static final BitSet FOLLOW_25_in_ruleGroup1848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_entryRuleSingle1884 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingle1894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleSingle1931 = new BitSet(new long[]{0x000000000984D000L});
        public static final BitSet FOLLOW_12_in_ruleSingle1944 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle1956 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle1977 = new BitSet(new long[]{0x000000000984C000L});
        public static final BitSet FOLLOW_14_in_ruleSingle1992 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle2004 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2025 = new BitSet(new long[]{0x0000000009848000L});
        public static final BitSet FOLLOW_18_in_ruleSingle2040 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle2052 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2073 = new BitSet(new long[]{0x0000000009808000L});
        public static final BitSet FOLLOW_23_in_ruleSingle2088 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingle2100 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2123 = new BitSet(new long[]{0x0000000009008000L});
        public static final BitSet FOLLOW_24_in_ruleSingle2143 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleSingle2175 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSingle2201 = new BitSet(new long[]{0x0010000000120030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2224 = new BitSet(new long[]{0x0010000000120030L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingle2246 = new BitSet(new long[]{0x0010000010120030L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingle2267 = new BitSet(new long[]{0x0010000010120030L});
        public static final BitSet FOLLOW_28_in_ruleSingle2280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple2316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiple2326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleMultiple2363 = new BitSet(new long[]{0x00000001C984D000L});
        public static final BitSet FOLLOW_12_in_ruleMultiple2376 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple2388 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple2409 = new BitSet(new long[]{0x00000001C984C000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple2424 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple2436 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple2457 = new BitSet(new long[]{0x00000001C9848000L});
        public static final BitSet FOLLOW_18_in_ruleMultiple2472 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple2484 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple2505 = new BitSet(new long[]{0x00000001C9808000L});
        public static final BitSet FOLLOW_30_in_ruleMultiple2520 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple2532 = new BitSet(new long[]{0x0020000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultiple2553 = new BitSet(new long[]{0x0000000189808000L});
        public static final BitSet FOLLOW_31_in_ruleMultiple2568 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple2580 = new BitSet(new long[]{0x0020000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultiple2601 = new BitSet(new long[]{0x0000000109808000L});
        public static final BitSet FOLLOW_23_in_ruleMultiple2616 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple2639 = new BitSet(new long[]{0x0000000109008000L});
        public static final BitSet FOLLOW_24_in_ruleMultiple2659 = new BitSet(new long[]{0x0000000108008000L});
        public static final BitSet FOLLOW_27_in_ruleMultiple2691 = new BitSet(new long[]{0x0000000100008000L});
        public static final BitSet FOLLOW_32_in_ruleMultiple2723 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMultiple2749 = new BitSet(new long[]{0x0010000000120030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple2772 = new BitSet(new long[]{0x0010000000120030L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultiple2794 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_33_in_ruleMultiple2807 = new BitSet(new long[]{0x0010000000120030L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultiple2828 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_34_in_ruleMultiple2842 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleMultiple2854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText2890 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText2900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleText2946 = new BitSet(new long[]{0x0000006001845000L});
        public static final BitSet FOLLOW_12_in_ruleText2959 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText2971 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText2992 = new BitSet(new long[]{0x0000006001844000L});
        public static final BitSet FOLLOW_14_in_ruleText3007 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText3019 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText3040 = new BitSet(new long[]{0x0000006001840000L});
        public static final BitSet FOLLOW_18_in_ruleText3055 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText3067 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText3088 = new BitSet(new long[]{0x0000006001800000L});
        public static final BitSet FOLLOW_23_in_ruleText3103 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleText3115 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText3138 = new BitSet(new long[]{0x0000006001000000L});
        public static final BitSet FOLLOW_24_in_ruleText3158 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_37_in_ruleText3190 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleText3216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate3252 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate3262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleDate3308 = new BitSet(new long[]{0x00001F4001845000L});
        public static final BitSet FOLLOW_12_in_ruleDate3321 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate3333 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate3354 = new BitSet(new long[]{0x00001F4001844000L});
        public static final BitSet FOLLOW_14_in_ruleDate3369 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate3381 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate3402 = new BitSet(new long[]{0x00001F4001840000L});
        public static final BitSet FOLLOW_18_in_ruleDate3417 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate3429 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate3450 = new BitSet(new long[]{0x00001F4001800000L});
        public static final BitSet FOLLOW_40_in_ruleDate3465 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate3477 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate3498 = new BitSet(new long[]{0x00001E4001800000L});
        public static final BitSet FOLLOW_41_in_ruleDate3513 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate3525 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate3546 = new BitSet(new long[]{0x00001C4001800000L});
        public static final BitSet FOLLOW_23_in_ruleDate3561 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDate3573 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate3596 = new BitSet(new long[]{0x00001C4001000000L});
        public static final BitSet FOLLOW_24_in_ruleDate3616 = new BitSet(new long[]{0x00001C4000000000L});
        public static final BitSet FOLLOW_42_in_ruleDate3648 = new BitSet(new long[]{0x0000184000000000L});
        public static final BitSet FOLLOW_43_in_ruleDate3680 = new BitSet(new long[]{0x0000104000000000L});
        public static final BitSet FOLLOW_44_in_ruleDate3712 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleDate3738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber3774 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber3784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleNumber3830 = new BitSet(new long[]{0x00000041C1845000L});
        public static final BitSet FOLLOW_12_in_ruleNumber3843 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber3855 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber3876 = new BitSet(new long[]{0x00000041C1844000L});
        public static final BitSet FOLLOW_14_in_ruleNumber3891 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber3903 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber3924 = new BitSet(new long[]{0x00000041C1840000L});
        public static final BitSet FOLLOW_18_in_ruleNumber3939 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber3951 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber3972 = new BitSet(new long[]{0x00000041C1800000L});
        public static final BitSet FOLLOW_30_in_ruleNumber3987 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber3999 = new BitSet(new long[]{0x0020000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber4020 = new BitSet(new long[]{0x0000004181800000L});
        public static final BitSet FOLLOW_31_in_ruleNumber4035 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber4047 = new BitSet(new long[]{0x0020000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber4068 = new BitSet(new long[]{0x0000004101800000L});
        public static final BitSet FOLLOW_23_in_ruleNumber4083 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleNumber4095 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber4118 = new BitSet(new long[]{0x0000004101000000L});
        public static final BitSet FOLLOW_24_in_ruleNumber4138 = new BitSet(new long[]{0x0000004100000000L});
        public static final BitSet FOLLOW_32_in_ruleNumber4170 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleNumber4196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_entryRuleScale4232 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScale4242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleScale4279 = new BitSet(new long[]{0x0000000040045000L});
        public static final BitSet FOLLOW_12_in_ruleScale4292 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale4304 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4325 = new BitSet(new long[]{0x0000000040044000L});
        public static final BitSet FOLLOW_14_in_ruleScale4340 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale4352 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4373 = new BitSet(new long[]{0x0000000040040000L});
        public static final BitSet FOLLOW_18_in_ruleScale4388 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale4400 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4421 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleScale4435 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale4447 = new BitSet(new long[]{0x0020000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale4468 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleScale4480 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale4492 = new BitSet(new long[]{0x0020000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale4513 = new BitSet(new long[]{0x0001804001800000L});
        public static final BitSet FOLLOW_47_in_ruleScale4526 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale4538 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4559 = new BitSet(new long[]{0x0001004001800000L});
        public static final BitSet FOLLOW_48_in_ruleScale4574 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale4586 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4607 = new BitSet(new long[]{0x0000004001800000L});
        public static final BitSet FOLLOW_23_in_ruleScale4622 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScale4634 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4657 = new BitSet(new long[]{0x0000004001000000L});
        public static final BitSet FOLLOW_24_in_ruleScale4677 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleScale4703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable4739 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable4749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleTable4786 = new BitSet(new long[]{0x0000000009845000L});
        public static final BitSet FOLLOW_12_in_ruleTable4799 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable4820 = new BitSet(new long[]{0x0000000009844000L});
        public static final BitSet FOLLOW_14_in_ruleTable4835 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable4856 = new BitSet(new long[]{0x0000000009840000L});
        public static final BitSet FOLLOW_18_in_ruleTable4871 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable4892 = new BitSet(new long[]{0x0000000009800000L});
        public static final BitSet FOLLOW_23_in_ruleTable4907 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable4930 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_24_in_ruleTable4950 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleTable4982 = new BitSet(new long[]{0x0004000000008000L});
        public static final BitSet FOLLOW_50_in_ruleTable5013 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTable5039 = new BitSet(new long[]{0x0010000000120030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable5062 = new BitSet(new long[]{0x0010000000120030L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable5084 = new BitSet(new long[]{0x0050000000120030L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable5105 = new BitSet(new long[]{0x0050000000120030L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable5127 = new BitSet(new long[]{0x0050000000120030L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable5148 = new BitSet(new long[]{0x0050000000120030L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable5170 = new BitSet(new long[]{0x0018000000120030L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable5191 = new BitSet(new long[]{0x0018000000120030L});
        public static final BitSet FOLLOW_51_in_ruleTable5204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_Impl_in_entryRuleOption_Impl5240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption_Impl5250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleOption_Impl5296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt5333 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt5344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleEInt5383 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt5400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion5445 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion5455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTableQuestion5492 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleTableQuestion5504 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTableQuestion5516 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTableQuestion5537 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleTableQuestion5549 = new BitSet(new long[]{0x0000000000000002L});
    }


}