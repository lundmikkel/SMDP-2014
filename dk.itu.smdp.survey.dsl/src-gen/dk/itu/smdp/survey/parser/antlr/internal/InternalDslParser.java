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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Survey'", "'{'", "'title'", "'description'", "'items'", "','", "'}'", "'templates'", "'AnswerTemplate'", "'id'", "'answers'", "'Answer'", "'label'", "'required'", "'Group'", "'dependsOn'", "'questions'", "'other'", "'Single'", "'template'", "'options'", "'showLimits'", "'Multiple'", "'lower'", "'upper'", "'multiline'", "'Text'", "'day'", "'month'", "'year'", "'Date'", "'from'", "'to'", "'Number'", "'Scale'", "'lowerLabel'", "'upperLabel'", "'multiple'", "'Table'", "'tableOptions'", "'Option'", "'-'", "'TableQuestion'"
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
    public static final int T__53=53;
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:76:1: ruleSurvey returns [EObject current=null] : ( () otherlv_1= 'Survey' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'items' otherlv_8= '{' ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* otherlv_12= '}' )? (otherlv_13= 'templates' otherlv_14= '{' ( (lv_templates_15_0= ruleAnswerTemplate ) ) (otherlv_16= ',' ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_items_9_0 = null;

        EObject lv_items_11_0 = null;

        EObject lv_templates_15_0 = null;

        EObject lv_templates_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:79:28: ( ( () otherlv_1= 'Survey' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'items' otherlv_8= '{' ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* otherlv_12= '}' )? (otherlv_13= 'templates' otherlv_14= '{' ( (lv_templates_15_0= ruleAnswerTemplate ) ) (otherlv_16= ',' ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () otherlv_1= 'Survey' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'items' otherlv_8= '{' ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* otherlv_12= '}' )? (otherlv_13= 'templates' otherlv_14= '{' ( (lv_templates_15_0= ruleAnswerTemplate ) ) (otherlv_16= ',' ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:1: ( () otherlv_1= 'Survey' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'items' otherlv_8= '{' ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* otherlv_12= '}' )? (otherlv_13= 'templates' otherlv_14= '{' ( (lv_templates_15_0= ruleAnswerTemplate ) ) (otherlv_16= ',' ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:80:2: () otherlv_1= 'Survey' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'items' otherlv_8= '{' ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* otherlv_12= '}' )? (otherlv_13= 'templates' otherlv_14= '{' ( (lv_templates_15_0= ruleAnswerTemplate ) ) (otherlv_16= ',' ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '}' )? otherlv_19= '}'
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
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey143); 

                	newLeafNode(otherlv_2, grammarAccess.getSurveyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:94:1: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:94:3: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey156); 

                        	newLeafNode(otherlv_3, grammarAccess.getSurveyAccess().getTitleKeyword_3_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:98:1: ( (lv_title_4_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:1: (lv_title_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:99:1: (lv_title_4_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:100:3: lv_title_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_3_1_0()); 
                    	    
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:116:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:116:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey192); 

                        	newLeafNode(otherlv_5, grammarAccess.getSurveyAccess().getDescriptionKeyword_4_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:120:1: ( (lv_description_6_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:121:1: (lv_description_6_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:121:1: (lv_description_6_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:122:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey213);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:4: (otherlv_7= 'items' otherlv_8= '{' ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* otherlv_12= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:138:6: otherlv_7= 'items' otherlv_8= '{' ( (lv_items_9_0= ruleItem ) ) (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSurvey228); 

                        	newLeafNode(otherlv_7, grammarAccess.getSurveyAccess().getItemsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey240); 

                        	newLeafNode(otherlv_8, grammarAccess.getSurveyAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:146:1: ( (lv_items_9_0= ruleItem ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:147:1: (lv_items_9_0= ruleItem )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:147:1: (lv_items_9_0= ruleItem )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:148:3: lv_items_9_0= ruleItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getItemsItemParserRuleCall_5_2_0()); 
                    	    
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

                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:164:2: (otherlv_10= ',' ( (lv_items_11_0= ruleItem ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:164:4: otherlv_10= ',' ( (lv_items_11_0= ruleItem ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSurvey274); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSurveyAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:168:1: ( (lv_items_11_0= ruleItem ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:169:1: (lv_items_11_0= ruleItem )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:169:1: (lv_items_11_0= ruleItem )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:170:3: lv_items_11_0= ruleItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getItemsItemParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleItem_in_ruleSurvey295);
                    	    lv_items_11_0=ruleItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_11_0, 
                    	            		"Item");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSurvey309); 

                        	newLeafNode(otherlv_12, grammarAccess.getSurveyAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:190:3: (otherlv_13= 'templates' otherlv_14= '{' ( (lv_templates_15_0= ruleAnswerTemplate ) ) (otherlv_16= ',' ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:190:5: otherlv_13= 'templates' otherlv_14= '{' ( (lv_templates_15_0= ruleAnswerTemplate ) ) (otherlv_16= ',' ( (lv_templates_17_0= ruleAnswerTemplate ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSurvey324); 

                        	newLeafNode(otherlv_13, grammarAccess.getSurveyAccess().getTemplatesKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey336); 

                        	newLeafNode(otherlv_14, grammarAccess.getSurveyAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:198:1: ( (lv_templates_15_0= ruleAnswerTemplate ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:199:1: (lv_templates_15_0= ruleAnswerTemplate )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:199:1: (lv_templates_15_0= ruleAnswerTemplate )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:200:3: lv_templates_15_0= ruleAnswerTemplate
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getTemplatesAnswerTemplateParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_ruleSurvey357);
                    lv_templates_15_0=ruleAnswerTemplate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	        }
                           		add(
                           			current, 
                           			"templates",
                            		lv_templates_15_0, 
                            		"AnswerTemplate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:216:2: (otherlv_16= ',' ( (lv_templates_17_0= ruleAnswerTemplate ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:216:4: otherlv_16= ',' ( (lv_templates_17_0= ruleAnswerTemplate ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSurvey370); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getSurveyAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:220:1: ( (lv_templates_17_0= ruleAnswerTemplate ) )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:221:1: (lv_templates_17_0= ruleAnswerTemplate )
                    	    {
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:221:1: (lv_templates_17_0= ruleAnswerTemplate )
                    	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:222:3: lv_templates_17_0= ruleAnswerTemplate
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getTemplatesAnswerTemplateParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_ruleSurvey391);
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

                    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSurvey405); 

                        	newLeafNode(otherlv_18, grammarAccess.getSurveyAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSurvey419); 

                	newLeafNode(otherlv_19, grammarAccess.getSurveyAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:254:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:255:2: (iv_ruleItem= ruleItem EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:256:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleItem_in_entryRuleItem455);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItem465); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:263:1: ruleItem returns [EObject current=null] : (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:266:28: ( (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:267:1: (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:267:1: (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable )
            int alt7=8;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:268:5: this_Group_0= ruleGroup
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getGroupParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleItem512);
                    this_Group_0=ruleGroup();

                    state._fsp--;

                     
                            current = this_Group_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:278:5: this_Single_1= ruleSingle
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getSingleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleItem539);
                    this_Single_1=ruleSingle();

                    state._fsp--;

                     
                            current = this_Single_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:288:5: this_Multiple_2= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getMultipleParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleItem566);
                    this_Multiple_2=ruleMultiple();

                    state._fsp--;

                     
                            current = this_Multiple_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:298:5: this_Text_3= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getTextParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleItem593);
                    this_Text_3=ruleText();

                    state._fsp--;

                     
                            current = this_Text_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:308:5: this_Date_4= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getDateParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleItem620);
                    this_Date_4=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:318:5: this_Number_5= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getNumberParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleItem647);
                    this_Number_5=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:328:5: this_Scale_6= ruleScale
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getScaleParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleItem674);
                    this_Scale_6=ruleScale();

                    state._fsp--;

                     
                            current = this_Scale_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:338:5: this_Table_7= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getTableParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleItem701);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:354:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:355:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:356:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion736);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion746); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:363:1: ruleQuestion returns [EObject current=null] : (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:366:28: ( (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:367:1: (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:367:1: (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable )
            int alt8=7;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:368:5: this_Single_0= ruleSingle
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSingleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingle_in_ruleQuestion793);
                    this_Single_0=ruleSingle();

                    state._fsp--;

                     
                            current = this_Single_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:378:5: this_Multiple_1= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_ruleQuestion820);
                    this_Multiple_1=ruleMultiple();

                    state._fsp--;

                     
                            current = this_Multiple_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:388:5: this_Text_2= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTextParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleQuestion847);
                    this_Text_2=ruleText();

                    state._fsp--;

                     
                            current = this_Text_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:398:5: this_Date_3= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getDateParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleQuestion874);
                    this_Date_3=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:408:5: this_Number_4= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getNumberParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleQuestion901);
                    this_Number_4=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:418:5: this_Scale_5= ruleScale
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getScaleParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScale_in_ruleQuestion928);
                    this_Scale_5=ruleScale();

                    state._fsp--;

                     
                            current = this_Scale_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:428:5: this_Table_6= ruleTable
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTableParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleQuestion955);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:444:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:445:2: (iv_ruleOption= ruleOption EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:446:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption990);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption1000); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:453:1: ruleOption returns [EObject current=null] : (this_Option_Impl_0= ruleOption_Impl | this_Answer_1= ruleAnswer | this_AnswerTemplate_2= ruleAnswerTemplate ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_Option_Impl_0 = null;

        EObject this_Answer_1 = null;

        EObject this_AnswerTemplate_2 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:456:28: ( (this_Option_Impl_0= ruleOption_Impl | this_Answer_1= ruleAnswer | this_AnswerTemplate_2= ruleAnswerTemplate ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:457:1: (this_Option_Impl_0= ruleOption_Impl | this_Answer_1= ruleAnswer | this_AnswerTemplate_2= ruleAnswerTemplate )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:457:1: (this_Option_Impl_0= ruleOption_Impl | this_Answer_1= ruleAnswer | this_AnswerTemplate_2= ruleAnswerTemplate )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 19:
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:458:5: this_Option_Impl_0= ruleOption_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getOption_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOption_Impl_in_ruleOption1047);
                    this_Option_Impl_0=ruleOption_Impl();

                    state._fsp--;

                     
                            current = this_Option_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:468:5: this_Answer_1= ruleAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleOption1074);
                    this_Answer_1=ruleAnswer();

                    state._fsp--;

                     
                            current = this_Answer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:478:5: this_AnswerTemplate_2= ruleAnswerTemplate
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getAnswerTemplateParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_ruleOption1101);
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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:494:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:495:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:496:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1137);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1148); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:503:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:506:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:507:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:507:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:507:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1188); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:515:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1214); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:530:1: entryRuleAnswerTemplate returns [EObject current=null] : iv_ruleAnswerTemplate= ruleAnswerTemplate EOF ;
    public final EObject entryRuleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerTemplate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:531:2: (iv_ruleAnswerTemplate= ruleAnswerTemplate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:532:2: iv_ruleAnswerTemplate= ruleAnswerTemplate EOF
            {
             newCompositeNode(grammarAccess.getAnswerTemplateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1259);
            iv_ruleAnswerTemplate=ruleAnswerTemplate();

            state._fsp--;

             current =iv_ruleAnswerTemplate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerTemplate1269); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:539:1: ruleAnswerTemplate returns [EObject current=null] : (otherlv_0= 'AnswerTemplate' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleAnswerTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_answers_6_0 = null;

        EObject lv_answers_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:542:28: ( (otherlv_0= 'AnswerTemplate' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:543:1: (otherlv_0= 'AnswerTemplate' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:543:1: (otherlv_0= 'AnswerTemplate' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:543:3: otherlv_0= 'AnswerTemplate' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'answers' otherlv_5= '{' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswerTemplate1306); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTemplateAccess().getAnswerTemplateKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnswerTemplate1318); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerTemplateAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswerTemplate1330); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerTemplateAccess().getIdKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:555:1: ( (lv_id_3_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:556:1: (lv_id_3_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:556:1: (lv_id_3_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:557:3: lv_id_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerTemplateAccess().getIdEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswerTemplate1351);
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

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswerTemplate1363); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerTemplateAccess().getAnswersKeyword_4());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnswerTemplate1375); 

                	newLeafNode(otherlv_5, grammarAccess.getAnswerTemplateAccess().getLeftCurlyBracketKeyword_5());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:581:1: ( (lv_answers_6_0= ruleAnswer ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:582:1: (lv_answers_6_0= ruleAnswer )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:582:1: (lv_answers_6_0= ruleAnswer )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:583:3: lv_answers_6_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getAnswerTemplateAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleAnswerTemplate1396);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:599:2: (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:599:4: otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnswerTemplate1409); 

            	        	newLeafNode(otherlv_7, grammarAccess.getAnswerTemplateAccess().getCommaKeyword_7_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:603:1: ( (lv_answers_8_0= ruleAnswer ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:604:1: (lv_answers_8_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:604:1: (lv_answers_8_0= ruleAnswer )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:605:3: lv_answers_8_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAnswerTemplateAccess().getAnswersAnswerParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleAnswerTemplate1430);
            	    lv_answers_8_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAnswerTemplateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_8_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswerTemplate1444); 

                	newLeafNode(otherlv_9, grammarAccess.getAnswerTemplateAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswerTemplate1456); 

                	newLeafNode(otherlv_10, grammarAccess.getAnswerTemplateAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:637:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:638:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:639:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer1492);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer1502); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:646:1: ruleAnswer returns [EObject current=null] : (otherlv_0= 'Answer' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'label' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '}' ) ;
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
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:649:28: ( (otherlv_0= 'Answer' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'label' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:650:1: (otherlv_0= 'Answer' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'label' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:650:1: (otherlv_0= 'Answer' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'label' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:650:3: otherlv_0= 'Answer' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? otherlv_4= 'label' ( (lv_label_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnswer1539); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAnswerKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnswer1551); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getLeftCurlyBracketKeyword_1());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:658:1: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:658:3: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswer1564); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getIdKeyword_2_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:662:1: ( (lv_id_3_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:663:1: (lv_id_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:663:1: (lv_id_3_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:664:3: lv_id_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1585);
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

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnswer1599); 

                	newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getLabelKeyword_3());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:684:1: ( (lv_label_5_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:685:1: (lv_label_5_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:685:1: (lv_label_5_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:686:3: lv_label_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getLabelEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1620);
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

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswer1632); 

                	newLeafNode(otherlv_6, grammarAccess.getAnswerAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:716:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:717:2: (iv_ruleGroup= ruleGroup EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:718:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup1670);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup1680); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:725:1: ruleGroup returns [EObject current=null] : ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Group' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' ( ( ruleEString ) ) )? otherlv_9= 'questions' otherlv_10= '{' ( (lv_questions_11_0= ruleQuestion ) ) (otherlv_12= ',' ( (lv_questions_13_0= ruleQuestion ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token lv_required_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_questions_11_0 = null;

        EObject lv_questions_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:728:28: ( ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Group' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' ( ( ruleEString ) ) )? otherlv_9= 'questions' otherlv_10= '{' ( (lv_questions_11_0= ruleQuestion ) ) (otherlv_12= ',' ( (lv_questions_13_0= ruleQuestion ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:729:1: ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Group' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' ( ( ruleEString ) ) )? otherlv_9= 'questions' otherlv_10= '{' ( (lv_questions_11_0= ruleQuestion ) ) (otherlv_12= ',' ( (lv_questions_13_0= ruleQuestion ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:729:1: ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Group' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' ( ( ruleEString ) ) )? otherlv_9= 'questions' otherlv_10= '{' ( (lv_questions_11_0= ruleQuestion ) ) (otherlv_12= ',' ( (lv_questions_13_0= ruleQuestion ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:729:2: ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Group' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'dependsOn' ( ( ruleEString ) ) )? otherlv_9= 'questions' otherlv_10= '{' ( (lv_questions_11_0= ruleQuestion ) ) (otherlv_12= ',' ( (lv_questions_13_0= ruleQuestion ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:729:2: ( (lv_required_0_0= 'required' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:730:1: (lv_required_0_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:730:1: (lv_required_0_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:731:3: lv_required_0_0= 'required'
                    {
                    lv_required_0_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGroup1723); 

                            newLeafNode(lv_required_0_0, grammarAccess.getGroupAccess().getRequiredRequiredKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGroupRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGroup1749); 

                	newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroup1761); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:752:1: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:752:3: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup1774); 

                        	newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getTitleKeyword_3_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:756:1: ( (lv_title_4_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:757:1: (lv_title_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:757:1: (lv_title_4_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:758:3: lv_title_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupAccess().getTitleEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1795);
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:774:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:774:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup1810); 

                        	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getDescriptionKeyword_4_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:778:1: ( (lv_description_6_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:779:1: (lv_description_6_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:779:1: (lv_description_6_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:780:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1831);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:796:4: (otherlv_7= 'dependsOn' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:796:6: otherlv_7= 'dependsOn' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleGroup1846); 

                        	newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getDependsOnKeyword_5_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:800:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:801:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:801:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:802:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGroupRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGroupAccess().getDependsOnAnswerCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup1869);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleGroup1883); 

                	newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getQuestionsKeyword_6());
                
            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroup1895); 

                	newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_7());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:823:1: ( (lv_questions_11_0= ruleQuestion ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:824:1: (lv_questions_11_0= ruleQuestion )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:824:1: (lv_questions_11_0= ruleQuestion )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:825:3: lv_questions_11_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleGroup1916);
            lv_questions_11_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_11_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:841:2: (otherlv_12= ',' ( (lv_questions_13_0= ruleQuestion ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:841:4: otherlv_12= ',' ( (lv_questions_13_0= ruleQuestion ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGroup1929); 

            	        	newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getCommaKeyword_9_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:845:1: ( (lv_questions_13_0= ruleQuestion ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:846:1: (lv_questions_13_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:846:1: (lv_questions_13_0= ruleQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:847:3: lv_questions_13_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleGroup1950);
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


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGroup1964); 

                	newLeafNode(otherlv_14, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGroup1976); 

                	newLeafNode(otherlv_15, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:879:1: entryRuleSingle returns [EObject current=null] : iv_ruleSingle= ruleSingle EOF ;
    public final EObject entryRuleSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingle = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:880:2: (iv_ruleSingle= ruleSingle EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:881:2: iv_ruleSingle= ruleSingle EOF
            {
             newCompositeNode(grammarAccess.getSingleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingle_in_entryRuleSingle2012);
            iv_ruleSingle=ruleSingle();

            state._fsp--;

             current =iv_ruleSingle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingle2022); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:888:1: ruleSingle returns [EObject current=null] : ( ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? otherlv_2= 'Single' otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_12= 'template' ( ( ruleEString ) ) )? otherlv_14= 'options' otherlv_15= '{' ( (lv_options_16_0= ruleOption ) ) (otherlv_17= ',' ( (lv_options_18_0= ruleOption ) ) )* otherlv_19= '}' otherlv_20= '}' ) ;
    public final EObject ruleSingle() throws RecognitionException {
        EObject current = null;

        Token lv_required_0_0=null;
        Token lv_other_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        EObject lv_options_16_0 = null;

        EObject lv_options_18_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:891:28: ( ( ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? otherlv_2= 'Single' otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_12= 'template' ( ( ruleEString ) ) )? otherlv_14= 'options' otherlv_15= '{' ( (lv_options_16_0= ruleOption ) ) (otherlv_17= ',' ( (lv_options_18_0= ruleOption ) ) )* otherlv_19= '}' otherlv_20= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:1: ( ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? otherlv_2= 'Single' otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_12= 'template' ( ( ruleEString ) ) )? otherlv_14= 'options' otherlv_15= '{' ( (lv_options_16_0= ruleOption ) ) (otherlv_17= ',' ( (lv_options_18_0= ruleOption ) ) )* otherlv_19= '}' otherlv_20= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:1: ( ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? otherlv_2= 'Single' otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_12= 'template' ( ( ruleEString ) ) )? otherlv_14= 'options' otherlv_15= '{' ( (lv_options_16_0= ruleOption ) ) (otherlv_17= ',' ( (lv_options_18_0= ruleOption ) ) )* otherlv_19= '}' otherlv_20= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:2: ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? otherlv_2= 'Single' otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_12= 'template' ( ( ruleEString ) ) )? otherlv_14= 'options' otherlv_15= '{' ( (lv_options_16_0= ruleOption ) ) (otherlv_17= ',' ( (lv_options_18_0= ruleOption ) ) )* otherlv_19= '}' otherlv_20= '}'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:892:2: ( (lv_required_0_0= 'required' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:893:1: (lv_required_0_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:893:1: (lv_required_0_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:894:3: lv_required_0_0= 'required'
                    {
                    lv_required_0_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingle2065); 

                            newLeafNode(lv_required_0_0, grammarAccess.getSingleAccess().getRequiredRequiredKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:907:3: ( (lv_other_1_0= 'other' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:908:1: (lv_other_1_0= 'other' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:908:1: (lv_other_1_0= 'other' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:909:3: lv_other_1_0= 'other'
                    {
                    lv_other_1_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSingle2097); 

                            newLeafNode(lv_other_1_0, grammarAccess.getSingleAccess().getOtherOtherKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleRule());
                    	        }
                           		setWithLastConsumed(current, "other", true, "other");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSingle2123); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleAccess().getSingleKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSingle2135); 

                	newLeafNode(otherlv_3, grammarAccess.getSingleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:930:1: (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:930:3: otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingle2148); 

                        	newLeafNode(otherlv_4, grammarAccess.getSingleAccess().getTitleKeyword_4_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:934:1: ( (lv_title_5_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:935:1: (lv_title_5_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:935:1: (lv_title_5_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:936:3: lv_title_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleAccess().getTitleEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2169);
                    lv_title_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleRule());
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:952:4: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:952:6: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingle2184); 

                        	newLeafNode(otherlv_6, grammarAccess.getSingleAccess().getDescriptionKeyword_5_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:956:1: ( (lv_description_7_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:957:1: (lv_description_7_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:957:1: (lv_description_7_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:958:3: lv_description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2205);
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:974:4: (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:974:6: otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSingle2220); 

                        	newLeafNode(otherlv_8, grammarAccess.getSingleAccess().getIdKeyword_6_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:978:1: ( (lv_id_9_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:979:1: (lv_id_9_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:979:1: (lv_id_9_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:980:3: lv_id_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleAccess().getIdEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2241);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:996:4: (otherlv_10= 'dependsOn' ( ( ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:996:6: otherlv_10= 'dependsOn' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingle2256); 

                        	newLeafNode(otherlv_10, grammarAccess.getSingleAccess().getDependsOnKeyword_7_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1000:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1001:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1001:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1002:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSingleAccess().getDependsOnAnswerCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2279);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1015:4: (otherlv_12= 'template' ( ( ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1015:6: otherlv_12= 'template' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSingle2294); 

                        	newLeafNode(otherlv_12, grammarAccess.getSingleAccess().getTemplateKeyword_8_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1019:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1020:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1020:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1021:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSingleAccess().getTemplateOptionCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingle2317);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSingle2331); 

                	newLeafNode(otherlv_14, grammarAccess.getSingleAccess().getOptionsKeyword_9());
                
            otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSingle2343); 

                	newLeafNode(otherlv_15, grammarAccess.getSingleAccess().getLeftCurlyBracketKeyword_10());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1042:1: ( (lv_options_16_0= ruleOption ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1043:1: (lv_options_16_0= ruleOption )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1043:1: (lv_options_16_0= ruleOption )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1044:3: lv_options_16_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getSingleAccess().getOptionsOptionParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingle2364);
            lv_options_16_0=ruleOption();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleRule());
            	        }
                   		add(
                   			current, 
                   			"options",
                    		lv_options_16_0, 
                    		"Option");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1060:2: (otherlv_17= ',' ( (lv_options_18_0= ruleOption ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1060:4: otherlv_17= ',' ( (lv_options_18_0= ruleOption ) )
            	    {
            	    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSingle2377); 

            	        	newLeafNode(otherlv_17, grammarAccess.getSingleAccess().getCommaKeyword_12_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1064:1: ( (lv_options_18_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1065:1: (lv_options_18_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1065:1: (lv_options_18_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1066:3: lv_options_18_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleAccess().getOptionsOptionParserRuleCall_12_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSingle2398);
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


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSingle2412); 

                	newLeafNode(otherlv_19, grammarAccess.getSingleAccess().getRightCurlyBracketKeyword_13());
                
            otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSingle2424); 

                	newLeafNode(otherlv_20, grammarAccess.getSingleAccess().getRightCurlyBracketKeyword_14());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1098:1: entryRuleMultiple returns [EObject current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final EObject entryRuleMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiple = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1099:2: (iv_ruleMultiple= ruleMultiple EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1100:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiple_in_entryRuleMultiple2460);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiple2470); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1107:1: ruleMultiple returns [EObject current=null] : ( ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? ( (lv_showLimits_2_0= 'showLimits' ) )? otherlv_3= 'Multiple' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) ) )? (otherlv_15= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_17= 'template' ( ( ruleEString ) ) )? otherlv_19= 'options' otherlv_20= '{' ( (lv_options_21_0= ruleOption ) ) (otherlv_22= ',' ( (lv_options_23_0= ruleOption ) ) )* otherlv_24= '}' otherlv_25= '}' ) ;
    public final EObject ruleMultiple() throws RecognitionException {
        EObject current = null;

        Token lv_required_0_0=null;
        Token lv_other_1_0=null;
        Token lv_showLimits_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_title_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;

        AntlrDatatypeRuleToken lv_lower_12_0 = null;

        AntlrDatatypeRuleToken lv_upper_14_0 = null;

        EObject lv_options_21_0 = null;

        EObject lv_options_23_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1110:28: ( ( ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? ( (lv_showLimits_2_0= 'showLimits' ) )? otherlv_3= 'Multiple' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) ) )? (otherlv_15= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_17= 'template' ( ( ruleEString ) ) )? otherlv_19= 'options' otherlv_20= '{' ( (lv_options_21_0= ruleOption ) ) (otherlv_22= ',' ( (lv_options_23_0= ruleOption ) ) )* otherlv_24= '}' otherlv_25= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1111:1: ( ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? ( (lv_showLimits_2_0= 'showLimits' ) )? otherlv_3= 'Multiple' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) ) )? (otherlv_15= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_17= 'template' ( ( ruleEString ) ) )? otherlv_19= 'options' otherlv_20= '{' ( (lv_options_21_0= ruleOption ) ) (otherlv_22= ',' ( (lv_options_23_0= ruleOption ) ) )* otherlv_24= '}' otherlv_25= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1111:1: ( ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? ( (lv_showLimits_2_0= 'showLimits' ) )? otherlv_3= 'Multiple' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) ) )? (otherlv_15= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_17= 'template' ( ( ruleEString ) ) )? otherlv_19= 'options' otherlv_20= '{' ( (lv_options_21_0= ruleOption ) ) (otherlv_22= ',' ( (lv_options_23_0= ruleOption ) ) )* otherlv_24= '}' otherlv_25= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1111:2: ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? ( (lv_showLimits_2_0= 'showLimits' ) )? otherlv_3= 'Multiple' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) ) )? (otherlv_15= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_17= 'template' ( ( ruleEString ) ) )? otherlv_19= 'options' otherlv_20= '{' ( (lv_options_21_0= ruleOption ) ) (otherlv_22= ',' ( (lv_options_23_0= ruleOption ) ) )* otherlv_24= '}' otherlv_25= '}'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1111:2: ( (lv_required_0_0= 'required' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1112:1: (lv_required_0_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1112:1: (lv_required_0_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1113:3: lv_required_0_0= 'required'
                    {
                    lv_required_0_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultiple2513); 

                            newLeafNode(lv_required_0_0, grammarAccess.getMultipleAccess().getRequiredRequiredKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1126:3: ( (lv_other_1_0= 'other' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1127:1: (lv_other_1_0= 'other' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1127:1: (lv_other_1_0= 'other' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1128:3: lv_other_1_0= 'other'
                    {
                    lv_other_1_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultiple2545); 

                            newLeafNode(lv_other_1_0, grammarAccess.getMultipleAccess().getOtherOtherKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleRule());
                    	        }
                           		setWithLastConsumed(current, "other", true, "other");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1141:3: ( (lv_showLimits_2_0= 'showLimits' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1142:1: (lv_showLimits_2_0= 'showLimits' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1142:1: (lv_showLimits_2_0= 'showLimits' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1143:3: lv_showLimits_2_0= 'showLimits'
                    {
                    lv_showLimits_2_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMultiple2577); 

                            newLeafNode(lv_showLimits_2_0, grammarAccess.getMultipleAccess().getShowLimitsShowLimitsKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleRule());
                    	        }
                           		setWithLastConsumed(current, "showLimits", true, "showLimits");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMultiple2603); 

                	newLeafNode(otherlv_3, grammarAccess.getMultipleAccess().getMultipleKeyword_3());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultiple2615); 

                	newLeafNode(otherlv_4, grammarAccess.getMultipleAccess().getLeftCurlyBracketKeyword_4());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1164:1: (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1164:3: otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiple2628); 

                        	newLeafNode(otherlv_5, grammarAccess.getMultipleAccess().getTitleKeyword_5_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1168:1: ( (lv_title_6_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1169:1: (lv_title_6_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1169:1: (lv_title_6_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1170:3: lv_title_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getTitleEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple2649);
                    lv_title_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1186:4: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1186:6: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiple2664); 

                        	newLeafNode(otherlv_7, grammarAccess.getMultipleAccess().getDescriptionKeyword_6_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1190:1: ( (lv_description_8_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1191:1: (lv_description_8_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1191:1: (lv_description_8_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1192:3: lv_description_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple2685);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1208:4: (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1208:6: otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultiple2700); 

                        	newLeafNode(otherlv_9, grammarAccess.getMultipleAccess().getIdKeyword_7_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1212:1: ( (lv_id_10_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1213:1: (lv_id_10_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1213:1: (lv_id_10_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1214:3: lv_id_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getIdEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple2721);
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1230:4: (otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1230:6: otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultiple2736); 

                        	newLeafNode(otherlv_11, grammarAccess.getMultipleAccess().getLowerKeyword_8_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1234:1: ( (lv_lower_12_0= ruleEInt ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1235:1: (lv_lower_12_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1235:1: (lv_lower_12_0= ruleEInt )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1236:3: lv_lower_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getLowerEIntParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultiple2757);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1252:4: (otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1252:6: otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMultiple2772); 

                        	newLeafNode(otherlv_13, grammarAccess.getMultipleAccess().getUpperKeyword_9_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1256:1: ( (lv_upper_14_0= ruleEInt ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1257:1: (lv_upper_14_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1257:1: (lv_upper_14_0= ruleEInt )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1258:3: lv_upper_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getUpperEIntParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultiple2793);
                    lv_upper_14_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleRule());
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1274:4: (otherlv_15= 'dependsOn' ( ( ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1274:6: otherlv_15= 'dependsOn' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultiple2808); 

                        	newLeafNode(otherlv_15, grammarAccess.getMultipleAccess().getDependsOnKeyword_10_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1278:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1279:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1279:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1280:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getDependsOnAnswerCrossReference_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple2831);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1293:4: (otherlv_17= 'template' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1293:6: otherlv_17= 'template' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultiple2846); 

                        	newLeafNode(otherlv_17, grammarAccess.getMultipleAccess().getTemplateKeyword_11_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1297:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1298:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1298:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1299:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMultipleAccess().getTemplateOptionCrossReference_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiple2869);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMultiple2883); 

                	newLeafNode(otherlv_19, grammarAccess.getMultipleAccess().getOptionsKeyword_12());
                
            otherlv_20=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultiple2895); 

                	newLeafNode(otherlv_20, grammarAccess.getMultipleAccess().getLeftCurlyBracketKeyword_13());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1320:1: ( (lv_options_21_0= ruleOption ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1321:1: (lv_options_21_0= ruleOption )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1321:1: (lv_options_21_0= ruleOption )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1322:3: lv_options_21_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getMultipleAccess().getOptionsOptionParserRuleCall_14_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultiple2916);
            lv_options_21_0=ruleOption();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleRule());
            	        }
                   		add(
                   			current, 
                   			"options",
                    		lv_options_21_0, 
                    		"Option");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1338:2: (otherlv_22= ',' ( (lv_options_23_0= ruleOption ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==16) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1338:4: otherlv_22= ',' ( (lv_options_23_0= ruleOption ) )
            	    {
            	    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultiple2929); 

            	        	newLeafNode(otherlv_22, grammarAccess.getMultipleAccess().getCommaKeyword_15_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1342:1: ( (lv_options_23_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1343:1: (lv_options_23_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1343:1: (lv_options_23_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1344:3: lv_options_23_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleAccess().getOptionsOptionParserRuleCall_15_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultiple2950);
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


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_24=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultiple2964); 

                	newLeafNode(otherlv_24, grammarAccess.getMultipleAccess().getRightCurlyBracketKeyword_16());
                
            otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultiple2976); 

                	newLeafNode(otherlv_25, grammarAccess.getMultipleAccess().getRightCurlyBracketKeyword_17());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1376:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1377:2: (iv_ruleText= ruleText EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1378:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText3012);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText3022); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1385:1: ruleText returns [EObject current=null] : ( () ( (lv_required_1_0= 'required' ) )? ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'Text' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' ( ( ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token lv_multiline_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_title_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1388:28: ( ( () ( (lv_required_1_0= 'required' ) )? ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'Text' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' ( ( ruleEString ) ) )? otherlv_13= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1389:1: ( () ( (lv_required_1_0= 'required' ) )? ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'Text' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' ( ( ruleEString ) ) )? otherlv_13= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1389:1: ( () ( (lv_required_1_0= 'required' ) )? ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'Text' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' ( ( ruleEString ) ) )? otherlv_13= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1389:2: () ( (lv_required_1_0= 'required' ) )? ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'Text' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' ( ( ruleEString ) ) )? otherlv_13= '}'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1389:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1390:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1395:2: ( (lv_required_1_0= 'required' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1396:1: (lv_required_1_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1396:1: (lv_required_1_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1397:3: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleText3074); 

                            newLeafNode(lv_required_1_0, grammarAccess.getTextAccess().getRequiredRequiredKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1410:3: ( (lv_multiline_2_0= 'multiline' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1411:1: (lv_multiline_2_0= 'multiline' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1411:1: (lv_multiline_2_0= 'multiline' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1412:3: lv_multiline_2_0= 'multiline'
                    {
                    lv_multiline_2_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleText3106); 

                            newLeafNode(lv_multiline_2_0, grammarAccess.getTextAccess().getMultilineMultilineKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextRule());
                    	        }
                           		setWithLastConsumed(current, "multiline", true, "multiline");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleText3132); 

                	newLeafNode(otherlv_3, grammarAccess.getTextAccess().getTextKeyword_3());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleText3144); 

                	newLeafNode(otherlv_4, grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_4());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1433:1: (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1433:3: otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleText3157); 

                        	newLeafNode(otherlv_5, grammarAccess.getTextAccess().getTitleKeyword_5_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1437:1: ( (lv_title_6_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1438:1: (lv_title_6_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1438:1: (lv_title_6_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1439:3: lv_title_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextAccess().getTitleEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText3178);
                    lv_title_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1455:4: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==14) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1455:6: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleText3193); 

                        	newLeafNode(otherlv_7, grammarAccess.getTextAccess().getDescriptionKeyword_6_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1459:1: ( (lv_description_8_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1460:1: (lv_description_8_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1460:1: (lv_description_8_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1461:3: lv_description_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText3214);
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1477:4: (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1477:6: otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleText3229); 

                        	newLeafNode(otherlv_9, grammarAccess.getTextAccess().getIdKeyword_7_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1481:1: ( (lv_id_10_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1482:1: (lv_id_10_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1482:1: (lv_id_10_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1483:3: lv_id_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextAccess().getIdEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText3250);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1499:4: (otherlv_11= 'dependsOn' ( ( ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==26) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1499:6: otherlv_11= 'dependsOn' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleText3265); 

                        	newLeafNode(otherlv_11, grammarAccess.getTextAccess().getDependsOnKeyword_8_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1503:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1504:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1504:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1505:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTextAccess().getDependsOnAnswerCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText3288);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleText3302); 

                	newLeafNode(otherlv_13, grammarAccess.getTextAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1530:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1531:2: (iv_ruleDate= ruleDate EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1532:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate3338);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate3348); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1539:1: ruleDate returns [EObject current=null] : ( () ( (lv_required_1_0= 'required' ) )? ( (lv_day_2_0= 'day' ) )? ( (lv_month_3_0= 'month' ) )? ( (lv_year_4_0= 'year' ) )? otherlv_5= 'Date' otherlv_6= '{' (otherlv_7= 'title' ( (lv_title_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= ruleEString ) ) )? (otherlv_13= 'from' ( (lv_from_14_0= ruleEString ) ) )? (otherlv_15= 'to' ( (lv_to_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token lv_day_2_0=null;
        Token lv_month_3_0=null;
        Token lv_year_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_title_8_0 = null;

        AntlrDatatypeRuleToken lv_description_10_0 = null;

        AntlrDatatypeRuleToken lv_id_12_0 = null;

        AntlrDatatypeRuleToken lv_from_14_0 = null;

        AntlrDatatypeRuleToken lv_to_16_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1542:28: ( ( () ( (lv_required_1_0= 'required' ) )? ( (lv_day_2_0= 'day' ) )? ( (lv_month_3_0= 'month' ) )? ( (lv_year_4_0= 'year' ) )? otherlv_5= 'Date' otherlv_6= '{' (otherlv_7= 'title' ( (lv_title_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= ruleEString ) ) )? (otherlv_13= 'from' ( (lv_from_14_0= ruleEString ) ) )? (otherlv_15= 'to' ( (lv_to_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )? otherlv_19= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1543:1: ( () ( (lv_required_1_0= 'required' ) )? ( (lv_day_2_0= 'day' ) )? ( (lv_month_3_0= 'month' ) )? ( (lv_year_4_0= 'year' ) )? otherlv_5= 'Date' otherlv_6= '{' (otherlv_7= 'title' ( (lv_title_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= ruleEString ) ) )? (otherlv_13= 'from' ( (lv_from_14_0= ruleEString ) ) )? (otherlv_15= 'to' ( (lv_to_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )? otherlv_19= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1543:1: ( () ( (lv_required_1_0= 'required' ) )? ( (lv_day_2_0= 'day' ) )? ( (lv_month_3_0= 'month' ) )? ( (lv_year_4_0= 'year' ) )? otherlv_5= 'Date' otherlv_6= '{' (otherlv_7= 'title' ( (lv_title_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= ruleEString ) ) )? (otherlv_13= 'from' ( (lv_from_14_0= ruleEString ) ) )? (otherlv_15= 'to' ( (lv_to_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )? otherlv_19= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1543:2: () ( (lv_required_1_0= 'required' ) )? ( (lv_day_2_0= 'day' ) )? ( (lv_month_3_0= 'month' ) )? ( (lv_year_4_0= 'year' ) )? otherlv_5= 'Date' otherlv_6= '{' (otherlv_7= 'title' ( (lv_title_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'id' ( (lv_id_12_0= ruleEString ) ) )? (otherlv_13= 'from' ( (lv_from_14_0= ruleEString ) ) )? (otherlv_15= 'to' ( (lv_to_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )? otherlv_19= '}'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1543:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1544:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1549:2: ( (lv_required_1_0= 'required' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==24) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1550:1: (lv_required_1_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1550:1: (lv_required_1_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1551:3: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDate3400); 

                            newLeafNode(lv_required_1_0, grammarAccess.getDateAccess().getRequiredRequiredKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1564:3: ( (lv_day_2_0= 'day' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1565:1: (lv_day_2_0= 'day' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1565:1: (lv_day_2_0= 'day' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1566:3: lv_day_2_0= 'day'
                    {
                    lv_day_2_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDate3432); 

                            newLeafNode(lv_day_2_0, grammarAccess.getDateAccess().getDayDayKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateRule());
                    	        }
                           		setWithLastConsumed(current, "day", true, "day");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1579:3: ( (lv_month_3_0= 'month' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1580:1: (lv_month_3_0= 'month' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1580:1: (lv_month_3_0= 'month' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1581:3: lv_month_3_0= 'month'
                    {
                    lv_month_3_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDate3464); 

                            newLeafNode(lv_month_3_0, grammarAccess.getDateAccess().getMonthMonthKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateRule());
                    	        }
                           		setWithLastConsumed(current, "month", true, "month");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1594:3: ( (lv_year_4_0= 'year' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1595:1: (lv_year_4_0= 'year' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1595:1: (lv_year_4_0= 'year' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1596:3: lv_year_4_0= 'year'
                    {
                    lv_year_4_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDate3496); 

                            newLeafNode(lv_year_4_0, grammarAccess.getDateAccess().getYearYearKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateRule());
                    	        }
                           		setWithLastConsumed(current, "year", true, "year");
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDate3522); 

                	newLeafNode(otherlv_5, grammarAccess.getDateAccess().getDateKeyword_5());
                
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDate3534); 

                	newLeafNode(otherlv_6, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_6());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1617:1: (otherlv_7= 'title' ( (lv_title_8_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==13) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1617:3: otherlv_7= 'title' ( (lv_title_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDate3547); 

                        	newLeafNode(otherlv_7, grammarAccess.getDateAccess().getTitleKeyword_7_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1621:1: ( (lv_title_8_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1622:1: (lv_title_8_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1622:1: (lv_title_8_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1623:3: lv_title_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getTitleEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate3568);
                    lv_title_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDateRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1639:4: (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==14) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1639:6: otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDate3583); 

                        	newLeafNode(otherlv_9, grammarAccess.getDateAccess().getDescriptionKeyword_8_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1643:1: ( (lv_description_10_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1644:1: (lv_description_10_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1644:1: (lv_description_10_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1645:3: lv_description_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getDescriptionEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate3604);
                    lv_description_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDateRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1661:4: (otherlv_11= 'id' ( (lv_id_12_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==20) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1661:6: otherlv_11= 'id' ( (lv_id_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDate3619); 

                        	newLeafNode(otherlv_11, grammarAccess.getDateAccess().getIdKeyword_9_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1665:1: ( (lv_id_12_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1666:1: (lv_id_12_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1666:1: (lv_id_12_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1667:3: lv_id_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getIdEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate3640);
                    lv_id_12_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDateRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_12_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1683:4: (otherlv_13= 'from' ( (lv_from_14_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1683:6: otherlv_13= 'from' ( (lv_from_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDate3655); 

                        	newLeafNode(otherlv_13, grammarAccess.getDateAccess().getFromKeyword_10_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1687:1: ( (lv_from_14_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1688:1: (lv_from_14_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1688:1: (lv_from_14_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1689:3: lv_from_14_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getFromEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate3676);
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1705:4: (otherlv_15= 'to' ( (lv_to_16_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1705:6: otherlv_15= 'to' ( (lv_to_16_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDate3691); 

                        	newLeafNode(otherlv_15, grammarAccess.getDateAccess().getToKeyword_11_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1709:1: ( (lv_to_16_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1710:1: (lv_to_16_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1710:1: (lv_to_16_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1711:3: lv_to_16_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getToEStringParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate3712);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1727:4: (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==26) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1727:6: otherlv_17= 'dependsOn' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDate3727); 

                        	newLeafNode(otherlv_17, grammarAccess.getDateAccess().getDependsOnKeyword_12_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1731:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1732:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1732:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1733:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDateAccess().getDependsOnAnswerCrossReference_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDate3750);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDate3764); 

                	newLeafNode(otherlv_19, grammarAccess.getDateAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1758:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1759:2: (iv_ruleNumber= ruleNumber EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1760:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber3800);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber3810); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1767:1: ruleNumber returns [EObject current=null] : ( () ( (lv_required_1_0= 'required' ) )? ( (lv_showLimits_2_0= 'showLimits' ) )? otherlv_3= 'Number' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) ) )? (otherlv_15= 'dependsOn' ( ( ruleEString ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token lv_showLimits_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_title_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;

        AntlrDatatypeRuleToken lv_lower_12_0 = null;

        AntlrDatatypeRuleToken lv_upper_14_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1770:28: ( ( () ( (lv_required_1_0= 'required' ) )? ( (lv_showLimits_2_0= 'showLimits' ) )? otherlv_3= 'Number' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) ) )? (otherlv_15= 'dependsOn' ( ( ruleEString ) ) )? otherlv_17= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1771:1: ( () ( (lv_required_1_0= 'required' ) )? ( (lv_showLimits_2_0= 'showLimits' ) )? otherlv_3= 'Number' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) ) )? (otherlv_15= 'dependsOn' ( ( ruleEString ) ) )? otherlv_17= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1771:1: ( () ( (lv_required_1_0= 'required' ) )? ( (lv_showLimits_2_0= 'showLimits' ) )? otherlv_3= 'Number' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) ) )? (otherlv_15= 'dependsOn' ( ( ruleEString ) ) )? otherlv_17= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1771:2: () ( (lv_required_1_0= 'required' ) )? ( (lv_showLimits_2_0= 'showLimits' ) )? otherlv_3= 'Number' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) ) )? (otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) ) )? (otherlv_15= 'dependsOn' ( ( ruleEString ) ) )? otherlv_17= '}'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1771:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1772:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberAccess().getNumberAction_0(),
                        current);
                

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1777:2: ( (lv_required_1_0= 'required' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==24) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1778:1: (lv_required_1_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1778:1: (lv_required_1_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1779:3: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNumber3862); 

                            newLeafNode(lv_required_1_0, grammarAccess.getNumberAccess().getRequiredRequiredKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1792:3: ( (lv_showLimits_2_0= 'showLimits' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==32) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1793:1: (lv_showLimits_2_0= 'showLimits' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1793:1: (lv_showLimits_2_0= 'showLimits' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1794:3: lv_showLimits_2_0= 'showLimits'
                    {
                    lv_showLimits_2_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNumber3894); 

                            newLeafNode(lv_showLimits_2_0, grammarAccess.getNumberAccess().getShowLimitsShowLimitsKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberRule());
                    	        }
                           		setWithLastConsumed(current, "showLimits", true, "showLimits");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleNumber3920); 

                	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getNumberKeyword_3());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNumber3932); 

                	newLeafNode(otherlv_4, grammarAccess.getNumberAccess().getLeftCurlyBracketKeyword_4());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1815:1: (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==13) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1815:3: otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNumber3945); 

                        	newLeafNode(otherlv_5, grammarAccess.getNumberAccess().getTitleKeyword_5_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1819:1: ( (lv_title_6_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1820:1: (lv_title_6_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1820:1: (lv_title_6_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1821:3: lv_title_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getTitleEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber3966);
                    lv_title_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1837:4: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==14) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1837:6: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleNumber3981); 

                        	newLeafNode(otherlv_7, grammarAccess.getNumberAccess().getDescriptionKeyword_6_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1841:1: ( (lv_description_8_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1842:1: (lv_description_8_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1842:1: (lv_description_8_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1843:3: lv_description_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber4002);
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1859:4: (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==20) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1859:6: otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNumber4017); 

                        	newLeafNode(otherlv_9, grammarAccess.getNumberAccess().getIdKeyword_7_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1863:1: ( (lv_id_10_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1864:1: (lv_id_10_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1864:1: (lv_id_10_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1865:3: lv_id_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getIdEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber4038);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1881:4: (otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==34) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1881:6: otherlv_11= 'lower' ( (lv_lower_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNumber4053); 

                        	newLeafNode(otherlv_11, grammarAccess.getNumberAccess().getLowerKeyword_8_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1885:1: ( (lv_lower_12_0= ruleEInt ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1886:1: (lv_lower_12_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1886:1: (lv_lower_12_0= ruleEInt )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1887:3: lv_lower_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getLowerEIntParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber4074);
                    lv_lower_12_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberRule());
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1903:4: (otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==35) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1903:6: otherlv_13= 'upper' ( (lv_upper_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleNumber4089); 

                        	newLeafNode(otherlv_13, grammarAccess.getNumberAccess().getUpperKeyword_9_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1907:1: ( (lv_upper_14_0= ruleEInt ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1908:1: (lv_upper_14_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1908:1: (lv_upper_14_0= ruleEInt )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1909:3: lv_upper_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getUpperEIntParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber4110);
                    lv_upper_14_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberRule());
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1925:4: (otherlv_15= 'dependsOn' ( ( ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==26) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1925:6: otherlv_15= 'dependsOn' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNumber4125); 

                        	newLeafNode(otherlv_15, grammarAccess.getNumberAccess().getDependsOnKeyword_10_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1929:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1930:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1930:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1931:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getDependsOnAnswerCrossReference_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleNumber4148);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleNumber4162); 

                	newLeafNode(otherlv_17, grammarAccess.getNumberAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1956:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1957:2: (iv_ruleScale= ruleScale EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1958:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScale_in_entryRuleScale4198);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScale4208); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1965:1: ruleScale returns [EObject current=null] : ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Scale' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) )? otherlv_9= 'lower' ( (lv_lower_10_0= ruleEInt ) ) otherlv_11= 'upper' ( (lv_upper_12_0= ruleEInt ) ) (otherlv_13= 'lowerLabel' ( (lv_lowerLabel_14_0= ruleEString ) ) )? (otherlv_15= 'upperLabel' ( (lv_upperLabel_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleScale() throws RecognitionException {
        EObject current = null;

        Token lv_required_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_id_8_0 = null;

        AntlrDatatypeRuleToken lv_lower_10_0 = null;

        AntlrDatatypeRuleToken lv_upper_12_0 = null;

        AntlrDatatypeRuleToken lv_lowerLabel_14_0 = null;

        AntlrDatatypeRuleToken lv_upperLabel_16_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1968:28: ( ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Scale' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) )? otherlv_9= 'lower' ( (lv_lower_10_0= ruleEInt ) ) otherlv_11= 'upper' ( (lv_upper_12_0= ruleEInt ) ) (otherlv_13= 'lowerLabel' ( (lv_lowerLabel_14_0= ruleEString ) ) )? (otherlv_15= 'upperLabel' ( (lv_upperLabel_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )? otherlv_19= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1969:1: ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Scale' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) )? otherlv_9= 'lower' ( (lv_lower_10_0= ruleEInt ) ) otherlv_11= 'upper' ( (lv_upper_12_0= ruleEInt ) ) (otherlv_13= 'lowerLabel' ( (lv_lowerLabel_14_0= ruleEString ) ) )? (otherlv_15= 'upperLabel' ( (lv_upperLabel_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )? otherlv_19= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1969:1: ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Scale' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) )? otherlv_9= 'lower' ( (lv_lower_10_0= ruleEInt ) ) otherlv_11= 'upper' ( (lv_upper_12_0= ruleEInt ) ) (otherlv_13= 'lowerLabel' ( (lv_lowerLabel_14_0= ruleEString ) ) )? (otherlv_15= 'upperLabel' ( (lv_upperLabel_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )? otherlv_19= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1969:2: ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Scale' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) )? otherlv_9= 'lower' ( (lv_lower_10_0= ruleEInt ) ) otherlv_11= 'upper' ( (lv_upper_12_0= ruleEInt ) ) (otherlv_13= 'lowerLabel' ( (lv_lowerLabel_14_0= ruleEString ) ) )? (otherlv_15= 'upperLabel' ( (lv_upperLabel_16_0= ruleEString ) ) )? (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )? otherlv_19= '}'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1969:2: ( (lv_required_0_0= 'required' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==24) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1970:1: (lv_required_0_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1970:1: (lv_required_0_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1971:3: lv_required_0_0= 'required'
                    {
                    lv_required_0_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleScale4251); 

                            newLeafNode(lv_required_0_0, grammarAccess.getScaleAccess().getRequiredRequiredKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getScaleRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleScale4277); 

                	newLeafNode(otherlv_1, grammarAccess.getScaleAccess().getScaleKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleScale4289); 

                	newLeafNode(otherlv_2, grammarAccess.getScaleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1992:1: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==13) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1992:3: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScale4302); 

                        	newLeafNode(otherlv_3, grammarAccess.getScaleAccess().getTitleKeyword_3_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1996:1: ( (lv_title_4_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1997:1: (lv_title_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1997:1: (lv_title_4_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:1998:3: lv_title_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getScaleAccess().getTitleEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4323);
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2014:4: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==14) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2014:6: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScale4338); 

                        	newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getDescriptionKeyword_4_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2018:1: ( (lv_description_6_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2019:1: (lv_description_6_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2019:1: (lv_description_6_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2020:3: lv_description_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getScaleAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4359);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2036:4: (otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==20) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2036:6: otherlv_7= 'id' ( (lv_id_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleScale4374); 

                        	newLeafNode(otherlv_7, grammarAccess.getScaleAccess().getIdKeyword_5_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2040:1: ( (lv_id_8_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2041:1: (lv_id_8_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2041:1: (lv_id_8_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2042:3: lv_id_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getScaleAccess().getIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4395);
                    lv_id_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScaleRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleScale4409); 

                	newLeafNode(otherlv_9, grammarAccess.getScaleAccess().getLowerKeyword_6());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2062:1: ( (lv_lower_10_0= ruleEInt ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2063:1: (lv_lower_10_0= ruleEInt )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2063:1: (lv_lower_10_0= ruleEInt )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2064:3: lv_lower_10_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getScaleAccess().getLowerEIntParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale4430);
            lv_lower_10_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	        }
                   		set(
                   			current, 
                   			"lower",
                    		lv_lower_10_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleScale4442); 

                	newLeafNode(otherlv_11, grammarAccess.getScaleAccess().getUpperKeyword_8());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2084:1: ( (lv_upper_12_0= ruleEInt ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2085:1: (lv_upper_12_0= ruleEInt )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2085:1: (lv_upper_12_0= ruleEInt )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2086:3: lv_upper_12_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getScaleAccess().getUpperEIntParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleScale4463);
            lv_upper_12_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScaleRule());
            	        }
                   		set(
                   			current, 
                   			"upper",
                    		lv_upper_12_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2102:2: (otherlv_13= 'lowerLabel' ( (lv_lowerLabel_14_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==46) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2102:4: otherlv_13= 'lowerLabel' ( (lv_lowerLabel_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleScale4476); 

                        	newLeafNode(otherlv_13, grammarAccess.getScaleAccess().getLowerLabelKeyword_10_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2106:1: ( (lv_lowerLabel_14_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2107:1: (lv_lowerLabel_14_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2107:1: (lv_lowerLabel_14_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2108:3: lv_lowerLabel_14_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getScaleAccess().getLowerLabelEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4497);
                    lv_lowerLabel_14_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScaleRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerLabel",
                            		lv_lowerLabel_14_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2124:4: (otherlv_15= 'upperLabel' ( (lv_upperLabel_16_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==47) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2124:6: otherlv_15= 'upperLabel' ( (lv_upperLabel_16_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleScale4512); 

                        	newLeafNode(otherlv_15, grammarAccess.getScaleAccess().getUpperLabelKeyword_11_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2128:1: ( (lv_upperLabel_16_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:1: (lv_upperLabel_16_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2129:1: (lv_upperLabel_16_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2130:3: lv_upperLabel_16_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getScaleAccess().getUpperLabelEStringParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4533);
                    lv_upperLabel_16_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScaleRule());
                    	        }
                           		set(
                           			current, 
                           			"upperLabel",
                            		lv_upperLabel_16_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2146:4: (otherlv_17= 'dependsOn' ( ( ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==26) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2146:6: otherlv_17= 'dependsOn' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleScale4548); 

                        	newLeafNode(otherlv_17, grammarAccess.getScaleAccess().getDependsOnKeyword_12_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2150:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2151:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2151:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2152:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getScaleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getScaleAccess().getDependsOnAnswerCrossReference_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleScale4571);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleScale4585); 

                	newLeafNode(otherlv_19, grammarAccess.getScaleAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2177:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2178:2: (iv_ruleTable= ruleTable EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2179:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable4621);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable4631); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2186:1: ruleTable returns [EObject current=null] : ( ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? ( (lv_multiple_2_0= 'multiple' ) )? otherlv_3= 'Table' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_13= 'template' ( ( ruleEString ) ) )? otherlv_15= 'options' otherlv_16= '{' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= '}' otherlv_21= 'questions' otherlv_22= '{' ( (lv_questions_23_0= ruleTableQuestion ) ) (otherlv_24= ',' ( (lv_questions_25_0= ruleTableQuestion ) ) )* otherlv_26= '}' otherlv_27= 'tableOptions' otherlv_28= '{' ( (lv_tableOptions_29_0= ruleOption ) ) (otherlv_30= ',' ( (lv_tableOptions_31_0= ruleOption ) ) )* otherlv_32= '}' otherlv_33= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token lv_required_0_0=null;
        Token lv_other_1_0=null;
        Token lv_multiple_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_title_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_id_10_0 = null;

        EObject lv_options_17_0 = null;

        EObject lv_options_19_0 = null;

        EObject lv_questions_23_0 = null;

        EObject lv_questions_25_0 = null;

        EObject lv_tableOptions_29_0 = null;

        EObject lv_tableOptions_31_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2189:28: ( ( ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? ( (lv_multiple_2_0= 'multiple' ) )? otherlv_3= 'Table' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_13= 'template' ( ( ruleEString ) ) )? otherlv_15= 'options' otherlv_16= '{' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= '}' otherlv_21= 'questions' otherlv_22= '{' ( (lv_questions_23_0= ruleTableQuestion ) ) (otherlv_24= ',' ( (lv_questions_25_0= ruleTableQuestion ) ) )* otherlv_26= '}' otherlv_27= 'tableOptions' otherlv_28= '{' ( (lv_tableOptions_29_0= ruleOption ) ) (otherlv_30= ',' ( (lv_tableOptions_31_0= ruleOption ) ) )* otherlv_32= '}' otherlv_33= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2190:1: ( ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? ( (lv_multiple_2_0= 'multiple' ) )? otherlv_3= 'Table' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_13= 'template' ( ( ruleEString ) ) )? otherlv_15= 'options' otherlv_16= '{' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= '}' otherlv_21= 'questions' otherlv_22= '{' ( (lv_questions_23_0= ruleTableQuestion ) ) (otherlv_24= ',' ( (lv_questions_25_0= ruleTableQuestion ) ) )* otherlv_26= '}' otherlv_27= 'tableOptions' otherlv_28= '{' ( (lv_tableOptions_29_0= ruleOption ) ) (otherlv_30= ',' ( (lv_tableOptions_31_0= ruleOption ) ) )* otherlv_32= '}' otherlv_33= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2190:1: ( ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? ( (lv_multiple_2_0= 'multiple' ) )? otherlv_3= 'Table' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_13= 'template' ( ( ruleEString ) ) )? otherlv_15= 'options' otherlv_16= '{' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= '}' otherlv_21= 'questions' otherlv_22= '{' ( (lv_questions_23_0= ruleTableQuestion ) ) (otherlv_24= ',' ( (lv_questions_25_0= ruleTableQuestion ) ) )* otherlv_26= '}' otherlv_27= 'tableOptions' otherlv_28= '{' ( (lv_tableOptions_29_0= ruleOption ) ) (otherlv_30= ',' ( (lv_tableOptions_31_0= ruleOption ) ) )* otherlv_32= '}' otherlv_33= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2190:2: ( (lv_required_0_0= 'required' ) )? ( (lv_other_1_0= 'other' ) )? ( (lv_multiple_2_0= 'multiple' ) )? otherlv_3= 'Table' otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )? (otherlv_11= 'dependsOn' ( ( ruleEString ) ) )? (otherlv_13= 'template' ( ( ruleEString ) ) )? otherlv_15= 'options' otherlv_16= '{' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= '}' otherlv_21= 'questions' otherlv_22= '{' ( (lv_questions_23_0= ruleTableQuestion ) ) (otherlv_24= ',' ( (lv_questions_25_0= ruleTableQuestion ) ) )* otherlv_26= '}' otherlv_27= 'tableOptions' otherlv_28= '{' ( (lv_tableOptions_29_0= ruleOption ) ) (otherlv_30= ',' ( (lv_tableOptions_31_0= ruleOption ) ) )* otherlv_32= '}' otherlv_33= '}'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2190:2: ( (lv_required_0_0= 'required' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==24) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2191:1: (lv_required_0_0= 'required' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2191:1: (lv_required_0_0= 'required' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2192:3: lv_required_0_0= 'required'
                    {
                    lv_required_0_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTable4674); 

                            newLeafNode(lv_required_0_0, grammarAccess.getTableAccess().getRequiredRequiredKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2205:3: ( (lv_other_1_0= 'other' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==28) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2206:1: (lv_other_1_0= 'other' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2206:1: (lv_other_1_0= 'other' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2207:3: lv_other_1_0= 'other'
                    {
                    lv_other_1_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTable4706); 

                            newLeafNode(lv_other_1_0, grammarAccess.getTableAccess().getOtherOtherKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableRule());
                    	        }
                           		setWithLastConsumed(current, "other", true, "other");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2220:3: ( (lv_multiple_2_0= 'multiple' ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==48) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2221:1: (lv_multiple_2_0= 'multiple' )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2221:1: (lv_multiple_2_0= 'multiple' )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2222:3: lv_multiple_2_0= 'multiple'
                    {
                    lv_multiple_2_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTable4738); 

                            newLeafNode(lv_multiple_2_0, grammarAccess.getTableAccess().getMultipleMultipleKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableRule());
                    	        }
                           		setWithLastConsumed(current, "multiple", true, "multiple");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTable4764); 

                	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getTableKeyword_3());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTable4776); 

                	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2243:1: (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==13) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2243:3: otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable4789); 

                        	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getTitleKeyword_5_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2247:1: ( (lv_title_6_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2248:1: (lv_title_6_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2248:1: (lv_title_6_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2249:3: lv_title_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable4810);
                    lv_title_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2265:4: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==14) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2265:6: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable4825); 

                        	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getDescriptionKeyword_6_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2269:1: ( (lv_description_8_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2270:1: (lv_description_8_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2270:1: (lv_description_8_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2271:3: lv_description_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable4846);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableRule());
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2287:4: (otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==20) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2287:6: otherlv_9= 'id' ( (lv_id_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTable4861); 

                        	newLeafNode(otherlv_9, grammarAccess.getTableAccess().getIdKeyword_7_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2291:1: ( (lv_id_10_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2292:1: (lv_id_10_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2292:1: (lv_id_10_0= ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2293:3: lv_id_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableAccess().getIdEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable4882);
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
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2309:4: (otherlv_11= 'dependsOn' ( ( ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==26) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2309:6: otherlv_11= 'dependsOn' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTable4897); 

                        	newLeafNode(otherlv_11, grammarAccess.getTableAccess().getDependsOnKeyword_8_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2313:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2314:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2314:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2315:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTableAccess().getDependsOnAnswerCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable4920);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2328:4: (otherlv_13= 'template' ( ( ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==30) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2328:6: otherlv_13= 'template' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTable4935); 

                        	newLeafNode(otherlv_13, grammarAccess.getTableAccess().getTemplateKeyword_9_0());
                        
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2332:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2333:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2333:1: ( ruleEString )
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2334:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTableAccess().getTemplateOptionCrossReference_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable4958);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTable4972); 

                	newLeafNode(otherlv_15, grammarAccess.getTableAccess().getOptionsKeyword_10());
                
            otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTable4984); 

                	newLeafNode(otherlv_16, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_11());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2355:1: ( (lv_options_17_0= ruleOption ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2356:1: (lv_options_17_0= ruleOption )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2356:1: (lv_options_17_0= ruleOption )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2357:3: lv_options_17_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable5005);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2373:2: (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==16) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2373:4: otherlv_18= ',' ( (lv_options_19_0= ruleOption ) )
            	    {
            	    otherlv_18=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTable5018); 

            	        	newLeafNode(otherlv_18, grammarAccess.getTableAccess().getCommaKeyword_13_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2377:1: ( (lv_options_19_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2378:1: (lv_options_19_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2378:1: (lv_options_19_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2379:3: lv_options_19_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getOptionsOptionParserRuleCall_13_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable5039);
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
            	    break loop76;
                }
            } while (true);

            otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTable5053); 

                	newLeafNode(otherlv_20, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_14());
                
            otherlv_21=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTable5065); 

                	newLeafNode(otherlv_21, grammarAccess.getTableAccess().getQuestionsKeyword_15());
                
            otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTable5077); 

                	newLeafNode(otherlv_22, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_16());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2407:1: ( (lv_questions_23_0= ruleTableQuestion ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2408:1: (lv_questions_23_0= ruleTableQuestion )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2408:1: (lv_questions_23_0= ruleTableQuestion )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2409:3: lv_questions_23_0= ruleTableQuestion
            {
             
            	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_17_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable5098);
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

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2425:2: (otherlv_24= ',' ( (lv_questions_25_0= ruleTableQuestion ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==16) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2425:4: otherlv_24= ',' ( (lv_questions_25_0= ruleTableQuestion ) )
            	    {
            	    otherlv_24=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTable5111); 

            	        	newLeafNode(otherlv_24, grammarAccess.getTableAccess().getCommaKeyword_18_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2429:1: ( (lv_questions_25_0= ruleTableQuestion ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2430:1: (lv_questions_25_0= ruleTableQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2430:1: (lv_questions_25_0= ruleTableQuestion )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2431:3: lv_questions_25_0= ruleTableQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getQuestionsTableQuestionParserRuleCall_18_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_ruleTable5132);
            	    lv_questions_25_0=ruleTableQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_25_0, 
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

            otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTable5146); 

                	newLeafNode(otherlv_26, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_19());
                
            otherlv_27=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTable5158); 

                	newLeafNode(otherlv_27, grammarAccess.getTableAccess().getTableOptionsKeyword_20());
                
            otherlv_28=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTable5170); 

                	newLeafNode(otherlv_28, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_21());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2459:1: ( (lv_tableOptions_29_0= ruleOption ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2460:1: (lv_tableOptions_29_0= ruleOption )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2460:1: (lv_tableOptions_29_0= ruleOption )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2461:3: lv_tableOptions_29_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getTableAccess().getTableOptionsOptionParserRuleCall_22_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable5191);
            lv_tableOptions_29_0=ruleOption();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTableRule());
            	        }
                   		add(
                   			current, 
                   			"tableOptions",
                    		lv_tableOptions_29_0, 
                    		"Option");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2477:2: (otherlv_30= ',' ( (lv_tableOptions_31_0= ruleOption ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==16) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2477:4: otherlv_30= ',' ( (lv_tableOptions_31_0= ruleOption ) )
            	    {
            	    otherlv_30=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTable5204); 

            	        	newLeafNode(otherlv_30, grammarAccess.getTableAccess().getCommaKeyword_23_0());
            	        
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2481:1: ( (lv_tableOptions_31_0= ruleOption ) )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2482:1: (lv_tableOptions_31_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2482:1: (lv_tableOptions_31_0= ruleOption )
            	    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2483:3: lv_tableOptions_31_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getTableOptionsOptionParserRuleCall_23_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleTable5225);
            	    lv_tableOptions_31_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tableOptions",
            	            		lv_tableOptions_31_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_32=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTable5239); 

                	newLeafNode(otherlv_32, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_24());
                
            otherlv_33=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTable5251); 

                	newLeafNode(otherlv_33, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_25());
                

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2515:1: entryRuleOption_Impl returns [EObject current=null] : iv_ruleOption_Impl= ruleOption_Impl EOF ;
    public final EObject entryRuleOption_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption_Impl = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2516:2: (iv_ruleOption_Impl= ruleOption_Impl EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2517:2: iv_ruleOption_Impl= ruleOption_Impl EOF
            {
             newCompositeNode(grammarAccess.getOption_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_Impl_in_entryRuleOption_Impl5287);
            iv_ruleOption_Impl=ruleOption_Impl();

            state._fsp--;

             current =iv_ruleOption_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption_Impl5297); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2524:1: ruleOption_Impl returns [EObject current=null] : ( () otherlv_1= 'Option' ) ;
    public final EObject ruleOption_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2527:28: ( ( () otherlv_1= 'Option' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2528:1: ( () otherlv_1= 'Option' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2528:1: ( () otherlv_1= 'Option' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2528:2: () otherlv_1= 'Option'
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2528:2: ()
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2529:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOption_ImplAccess().getOptionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleOption_Impl5343); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2546:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2547:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2548:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt5380);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt5391); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2555:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2558:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2559:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2559:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2559:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2559:2: (kw= '-' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==52) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2560:2: kw= '-'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEInt5430); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt5447); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2580:1: entryRuleTableQuestion returns [EObject current=null] : iv_ruleTableQuestion= ruleTableQuestion EOF ;
    public final EObject entryRuleTableQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableQuestion = null;


        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2581:2: (iv_ruleTableQuestion= ruleTableQuestion EOF )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2582:2: iv_ruleTableQuestion= ruleTableQuestion EOF
            {
             newCompositeNode(grammarAccess.getTableQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion5492);
            iv_ruleTableQuestion=ruleTableQuestion();

            state._fsp--;

             current =iv_ruleTableQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTableQuestion5502); 

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
    // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2589:1: ruleTableQuestion returns [EObject current=null] : (otherlv_0= 'TableQuestion' otherlv_1= '{' otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleTableQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2592:28: ( (otherlv_0= 'TableQuestion' otherlv_1= '{' otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2593:1: (otherlv_0= 'TableQuestion' otherlv_1= '{' otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2593:1: (otherlv_0= 'TableQuestion' otherlv_1= '{' otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '}' )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2593:3: otherlv_0= 'TableQuestion' otherlv_1= '{' otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTableQuestion5539); 

                	newLeafNode(otherlv_0, grammarAccess.getTableQuestionAccess().getTableQuestionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTableQuestion5551); 

                	newLeafNode(otherlv_1, grammarAccess.getTableQuestionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTableQuestion5563); 

                	newLeafNode(otherlv_2, grammarAccess.getTableQuestionAccess().getTitleKeyword_2());
                
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2605:1: ( (lv_title_3_0= ruleEString ) )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2606:1: (lv_title_3_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2606:1: (lv_title_3_0= ruleEString )
            // ../dk.itu.smdp.survey.dsl/src-gen/dk/itu/smdp/survey/parser/antlr/internal/InternalDsl.g:2607:3: lv_title_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTableQuestionAccess().getTitleEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTableQuestion5584);
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

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTableQuestion5596); 

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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA7_eotS =
        "\14\uffff";
    static final String DFA7_eofS =
        "\14\uffff";
    static final String DFA7_minS =
        "\1\30\1\31\1\uffff\1\35\1\uffff\1\41\6\uffff";
    static final String DFA7_maxS =
        "\2\61\1\uffff\1\61\1\uffff\1\54\6\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA7_specialS =
        "\14\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\2\2\uffff\1\3\1\4\2\uffff\1\5\1\6\2\uffff\2\7\4\10\2"+
            "\uffff\1\11\1\12\2\uffff\2\13",
            "\1\2\2\uffff\1\3\1\4\2\uffff\1\5\1\6\2\uffff\2\7\4\10\2\uffff"+
            "\1\11\1\12\2\uffff\2\13",
            "",
            "\1\4\2\uffff\2\6\16\uffff\2\13",
            "",
            "\1\6\12\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "267:1: (this_Group_0= ruleGroup | this_Single_1= ruleSingle | this_Multiple_2= ruleMultiple | this_Text_3= ruleText | this_Date_4= ruleDate | this_Number_5= ruleNumber | this_Scale_6= ruleScale | this_Table_7= ruleTable )";
        }
    }
    static final String DFA8_eotS =
        "\13\uffff";
    static final String DFA8_eofS =
        "\13\uffff";
    static final String DFA8_minS =
        "\1\30\1\34\1\35\1\uffff\1\41\6\uffff";
    static final String DFA8_maxS =
        "\3\61\1\uffff\1\54\6\uffff";
    static final String DFA8_acceptS =
        "\3\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String DFA8_specialS =
        "\13\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\3\uffff\1\2\1\3\2\uffff\1\4\1\5\2\uffff\2\6\4\7\2\uffff"+
            "\1\10\1\11\2\uffff\2\12",
            "\1\2\1\3\2\uffff\1\4\1\5\2\uffff\2\6\4\7\2\uffff\1\10\1\11"+
            "\2\uffff\2\12",
            "\1\3\2\uffff\2\5\16\uffff\2\12",
            "",
            "\1\5\12\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "367:1: (this_Single_0= ruleSingle | this_Multiple_1= ruleMultiple | this_Text_2= ruleText | this_Date_3= ruleDate | this_Number_4= ruleNumber | this_Scale_5= ruleScale | this_Table_6= ruleTable )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSurvey131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey143 = new BitSet(new long[]{0x000000000006E000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey156 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey177 = new BitSet(new long[]{0x000000000006C000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey192 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey213 = new BitSet(new long[]{0x0000000000068000L});
        public static final BitSet FOLLOW_15_in_ruleSurvey228 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey240 = new BitSet(new long[]{0x000333F333000000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey261 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleSurvey274 = new BitSet(new long[]{0x000333F333000000L});
        public static final BitSet FOLLOW_ruleItem_in_ruleSurvey295 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleSurvey309 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleSurvey324 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey336 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey357 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleSurvey370 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleSurvey391 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleSurvey405 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSurvey419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleItem_in_entryRuleItem455 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItem465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleItem512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleItem539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleItem566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleItem593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleItem620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleItem647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleItem674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleItem701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion736 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_ruleQuestion793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_ruleQuestion820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleQuestion847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_ruleQuestion874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleQuestion901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_ruleQuestion928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleQuestion955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption990 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption1000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_Impl_in_ruleOption1047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleOption1074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_ruleOption1101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1137 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerTemplate_in_entryRuleAnswerTemplate1259 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerTemplate1269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAnswerTemplate1306 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnswerTemplate1318 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAnswerTemplate1330 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswerTemplate1351 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnswerTemplate1363 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnswerTemplate1375 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleAnswerTemplate1396 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleAnswerTemplate1409 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleAnswerTemplate1430 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleAnswerTemplate1444 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAnswerTemplate1456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1492 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAnswer1539 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnswer1551 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_20_in_ruleAnswer1564 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1585 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAnswer1599 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1620 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAnswer1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1670 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup1680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleGroup1723 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleGroup1749 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGroup1761 = new BitSet(new long[]{0x000000000C006000L});
        public static final BitSet FOLLOW_13_in_ruleGroup1774 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1795 = new BitSet(new long[]{0x000000000C004000L});
        public static final BitSet FOLLOW_14_in_ruleGroup1810 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1831 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_26_in_ruleGroup1846 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup1869 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleGroup1883 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGroup1895 = new BitSet(new long[]{0x000333F333000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup1916 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleGroup1929 = new BitSet(new long[]{0x000333F333000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup1950 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleGroup1964 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleGroup1976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingle_in_entryRuleSingle2012 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingle2022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleSingle2065 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_28_in_ruleSingle2097 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleSingle2123 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSingle2135 = new BitSet(new long[]{0x00000000C4106000L});
        public static final BitSet FOLLOW_13_in_ruleSingle2148 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2169 = new BitSet(new long[]{0x00000000C4104000L});
        public static final BitSet FOLLOW_14_in_ruleSingle2184 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2205 = new BitSet(new long[]{0x00000000C4100000L});
        public static final BitSet FOLLOW_20_in_ruleSingle2220 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2241 = new BitSet(new long[]{0x00000000C4000000L});
        public static final BitSet FOLLOW_26_in_ruleSingle2256 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2279 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleSingle2294 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingle2317 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleSingle2331 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSingle2343 = new BitSet(new long[]{0x0008000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingle2364 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleSingle2377 = new BitSet(new long[]{0x0008000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSingle2398 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleSingle2412 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSingle2424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple2460 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiple2470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleMultiple2513 = new BitSet(new long[]{0x0000000310000000L});
        public static final BitSet FOLLOW_28_in_ruleMultiple2545 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_32_in_ruleMultiple2577 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMultiple2603 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMultiple2615 = new BitSet(new long[]{0x0000000CC4106000L});
        public static final BitSet FOLLOW_13_in_ruleMultiple2628 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple2649 = new BitSet(new long[]{0x0000000CC4104000L});
        public static final BitSet FOLLOW_14_in_ruleMultiple2664 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple2685 = new BitSet(new long[]{0x0000000CC4100000L});
        public static final BitSet FOLLOW_20_in_ruleMultiple2700 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple2721 = new BitSet(new long[]{0x0000000CC4000000L});
        public static final BitSet FOLLOW_34_in_ruleMultiple2736 = new BitSet(new long[]{0x0010000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultiple2757 = new BitSet(new long[]{0x00000008C4000000L});
        public static final BitSet FOLLOW_35_in_ruleMultiple2772 = new BitSet(new long[]{0x0010000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultiple2793 = new BitSet(new long[]{0x00000000C4000000L});
        public static final BitSet FOLLOW_26_in_ruleMultiple2808 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple2831 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleMultiple2846 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiple2869 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMultiple2883 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMultiple2895 = new BitSet(new long[]{0x0008000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultiple2916 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleMultiple2929 = new BitSet(new long[]{0x0008000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultiple2950 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleMultiple2964 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMultiple2976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText3012 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText3022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleText3074 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_36_in_ruleText3106 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleText3132 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleText3144 = new BitSet(new long[]{0x0000000004126000L});
        public static final BitSet FOLLOW_13_in_ruleText3157 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText3178 = new BitSet(new long[]{0x0000000004124000L});
        public static final BitSet FOLLOW_14_in_ruleText3193 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText3214 = new BitSet(new long[]{0x0000000004120000L});
        public static final BitSet FOLLOW_20_in_ruleText3229 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText3250 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_26_in_ruleText3265 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText3288 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleText3302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate3338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleDate3400 = new BitSet(new long[]{0x000003C000000000L});
        public static final BitSet FOLLOW_38_in_ruleDate3432 = new BitSet(new long[]{0x0000038000000000L});
        public static final BitSet FOLLOW_39_in_ruleDate3464 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_40_in_ruleDate3496 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleDate3522 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDate3534 = new BitSet(new long[]{0x00000C0004126000L});
        public static final BitSet FOLLOW_13_in_ruleDate3547 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate3568 = new BitSet(new long[]{0x00000C0004124000L});
        public static final BitSet FOLLOW_14_in_ruleDate3583 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate3604 = new BitSet(new long[]{0x00000C0004120000L});
        public static final BitSet FOLLOW_20_in_ruleDate3619 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate3640 = new BitSet(new long[]{0x00000C0004020000L});
        public static final BitSet FOLLOW_42_in_ruleDate3655 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate3676 = new BitSet(new long[]{0x0000080004020000L});
        public static final BitSet FOLLOW_43_in_ruleDate3691 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate3712 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_26_in_ruleDate3727 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDate3750 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDate3764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber3800 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber3810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleNumber3862 = new BitSet(new long[]{0x0000100100000000L});
        public static final BitSet FOLLOW_32_in_ruleNumber3894 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleNumber3920 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNumber3932 = new BitSet(new long[]{0x0000000C04126000L});
        public static final BitSet FOLLOW_13_in_ruleNumber3945 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber3966 = new BitSet(new long[]{0x0000000C04124000L});
        public static final BitSet FOLLOW_14_in_ruleNumber3981 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber4002 = new BitSet(new long[]{0x0000000C04120000L});
        public static final BitSet FOLLOW_20_in_ruleNumber4017 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber4038 = new BitSet(new long[]{0x0000000C04020000L});
        public static final BitSet FOLLOW_34_in_ruleNumber4053 = new BitSet(new long[]{0x0010000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber4074 = new BitSet(new long[]{0x0000000804020000L});
        public static final BitSet FOLLOW_35_in_ruleNumber4089 = new BitSet(new long[]{0x0010000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber4110 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_26_in_ruleNumber4125 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleNumber4148 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleNumber4162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScale_in_entryRuleScale4198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScale4208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleScale4251 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleScale4277 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleScale4289 = new BitSet(new long[]{0x0000000400106000L});
        public static final BitSet FOLLOW_13_in_ruleScale4302 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4323 = new BitSet(new long[]{0x0000000400104000L});
        public static final BitSet FOLLOW_14_in_ruleScale4338 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4359 = new BitSet(new long[]{0x0000000400100000L});
        public static final BitSet FOLLOW_20_in_ruleScale4374 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4395 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleScale4409 = new BitSet(new long[]{0x0010000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale4430 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleScale4442 = new BitSet(new long[]{0x0010000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleScale4463 = new BitSet(new long[]{0x0000C00004020000L});
        public static final BitSet FOLLOW_46_in_ruleScale4476 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4497 = new BitSet(new long[]{0x0000800004020000L});
        public static final BitSet FOLLOW_47_in_ruleScale4512 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4533 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_26_in_ruleScale4548 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleScale4571 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleScale4585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable4621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable4631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleTable4674 = new BitSet(new long[]{0x0003000010000000L});
        public static final BitSet FOLLOW_28_in_ruleTable4706 = new BitSet(new long[]{0x0003000000000000L});
        public static final BitSet FOLLOW_48_in_ruleTable4738 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleTable4764 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTable4776 = new BitSet(new long[]{0x00000000C4106000L});
        public static final BitSet FOLLOW_13_in_ruleTable4789 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable4810 = new BitSet(new long[]{0x00000000C4104000L});
        public static final BitSet FOLLOW_14_in_ruleTable4825 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable4846 = new BitSet(new long[]{0x00000000C4100000L});
        public static final BitSet FOLLOW_20_in_ruleTable4861 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable4882 = new BitSet(new long[]{0x00000000C4000000L});
        public static final BitSet FOLLOW_26_in_ruleTable4897 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable4920 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleTable4935 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable4958 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleTable4972 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTable4984 = new BitSet(new long[]{0x0008000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable5005 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleTable5018 = new BitSet(new long[]{0x0008000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable5039 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleTable5053 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleTable5065 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTable5077 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable5098 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleTable5111 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_ruleTable5132 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleTable5146 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleTable5158 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTable5170 = new BitSet(new long[]{0x0008000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable5191 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleTable5204 = new BitSet(new long[]{0x0008000000480000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleTable5225 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleTable5239 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTable5251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_Impl_in_entryRuleOption_Impl5287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption_Impl5297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleOption_Impl5343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt5380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt5391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEInt5430 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt5447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTableQuestion_in_entryRuleTableQuestion5492 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTableQuestion5502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTableQuestion5539 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTableQuestion5551 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTableQuestion5563 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTableQuestion5584 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTableQuestion5596 = new BitSet(new long[]{0x0000000000000002L});
    }


}