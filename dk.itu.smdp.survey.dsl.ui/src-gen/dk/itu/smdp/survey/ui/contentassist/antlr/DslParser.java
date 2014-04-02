/*
* generated by Xtext
*/
package dk.itu.smdp.survey.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import dk.itu.smdp.survey.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {
	
	@Inject
	private DslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected dk.itu.smdp.survey.ui.contentassist.antlr.internal.InternalDslParser createParser() {
		dk.itu.smdp.survey.ui.contentassist.antlr.internal.InternalDslParser result = new dk.itu.smdp.survey.ui.contentassist.antlr.internal.InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getItemAccess().getAlternatives(), "rule__Item__Alternatives");
					put(grammarAccess.getQuestionAccess().getAlternatives(), "rule__Question__Alternatives");
					put(grammarAccess.getOptionAccess().getAlternatives(), "rule__Option__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getSurveyAccess().getGroup(), "rule__Survey__Group__0");
					put(grammarAccess.getSurveyAccess().getGroup_3(), "rule__Survey__Group_3__0");
					put(grammarAccess.getSurveyAccess().getGroup_4(), "rule__Survey__Group_4__0");
					put(grammarAccess.getSurveyAccess().getGroup_5(), "rule__Survey__Group_5__0");
					put(grammarAccess.getSurveyAccess().getGroup_5_3(), "rule__Survey__Group_5_3__0");
					put(grammarAccess.getSurveyAccess().getGroup_6(), "rule__Survey__Group_6__0");
					put(grammarAccess.getSurveyAccess().getGroup_6_3(), "rule__Survey__Group_6_3__0");
					put(grammarAccess.getAnswerTemplateAccess().getGroup(), "rule__AnswerTemplate__Group__0");
					put(grammarAccess.getAnswerTemplateAccess().getGroup_7(), "rule__AnswerTemplate__Group_7__0");
					put(grammarAccess.getAnswerAccess().getGroup(), "rule__Answer__Group__0");
					put(grammarAccess.getAnswerAccess().getGroup_2(), "rule__Answer__Group_2__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getGroupAccess().getGroup_3(), "rule__Group__Group_3__0");
					put(grammarAccess.getGroupAccess().getGroup_4(), "rule__Group__Group_4__0");
					put(grammarAccess.getGroupAccess().getGroup_5(), "rule__Group__Group_5__0");
					put(grammarAccess.getGroupAccess().getGroup_9(), "rule__Group__Group_9__0");
					put(grammarAccess.getSingleAccess().getGroup(), "rule__Single__Group__0");
					put(grammarAccess.getSingleAccess().getGroup_4(), "rule__Single__Group_4__0");
					put(grammarAccess.getSingleAccess().getGroup_5(), "rule__Single__Group_5__0");
					put(grammarAccess.getSingleAccess().getGroup_6(), "rule__Single__Group_6__0");
					put(grammarAccess.getSingleAccess().getGroup_7(), "rule__Single__Group_7__0");
					put(grammarAccess.getSingleAccess().getGroup_8(), "rule__Single__Group_8__0");
					put(grammarAccess.getSingleAccess().getGroup_12(), "rule__Single__Group_12__0");
					put(grammarAccess.getMultipleAccess().getGroup(), "rule__Multiple__Group__0");
					put(grammarAccess.getMultipleAccess().getGroup_5(), "rule__Multiple__Group_5__0");
					put(grammarAccess.getMultipleAccess().getGroup_6(), "rule__Multiple__Group_6__0");
					put(grammarAccess.getMultipleAccess().getGroup_7(), "rule__Multiple__Group_7__0");
					put(grammarAccess.getMultipleAccess().getGroup_8(), "rule__Multiple__Group_8__0");
					put(grammarAccess.getMultipleAccess().getGroup_9(), "rule__Multiple__Group_9__0");
					put(grammarAccess.getMultipleAccess().getGroup_10(), "rule__Multiple__Group_10__0");
					put(grammarAccess.getMultipleAccess().getGroup_11(), "rule__Multiple__Group_11__0");
					put(grammarAccess.getMultipleAccess().getGroup_15(), "rule__Multiple__Group_15__0");
					put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
					put(grammarAccess.getTextAccess().getGroup_5(), "rule__Text__Group_5__0");
					put(grammarAccess.getTextAccess().getGroup_6(), "rule__Text__Group_6__0");
					put(grammarAccess.getTextAccess().getGroup_7(), "rule__Text__Group_7__0");
					put(grammarAccess.getTextAccess().getGroup_8(), "rule__Text__Group_8__0");
					put(grammarAccess.getDateAccess().getGroup(), "rule__Date__Group__0");
					put(grammarAccess.getDateAccess().getGroup_7(), "rule__Date__Group_7__0");
					put(grammarAccess.getDateAccess().getGroup_8(), "rule__Date__Group_8__0");
					put(grammarAccess.getDateAccess().getGroup_9(), "rule__Date__Group_9__0");
					put(grammarAccess.getDateAccess().getGroup_10(), "rule__Date__Group_10__0");
					put(grammarAccess.getDateAccess().getGroup_11(), "rule__Date__Group_11__0");
					put(grammarAccess.getDateAccess().getGroup_12(), "rule__Date__Group_12__0");
					put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
					put(grammarAccess.getNumberAccess().getGroup_5(), "rule__Number__Group_5__0");
					put(grammarAccess.getNumberAccess().getGroup_6(), "rule__Number__Group_6__0");
					put(grammarAccess.getNumberAccess().getGroup_7(), "rule__Number__Group_7__0");
					put(grammarAccess.getNumberAccess().getGroup_8(), "rule__Number__Group_8__0");
					put(grammarAccess.getNumberAccess().getGroup_9(), "rule__Number__Group_9__0");
					put(grammarAccess.getNumberAccess().getGroup_10(), "rule__Number__Group_10__0");
					put(grammarAccess.getScaleAccess().getGroup(), "rule__Scale__Group__0");
					put(grammarAccess.getScaleAccess().getGroup_3(), "rule__Scale__Group_3__0");
					put(grammarAccess.getScaleAccess().getGroup_4(), "rule__Scale__Group_4__0");
					put(grammarAccess.getScaleAccess().getGroup_5(), "rule__Scale__Group_5__0");
					put(grammarAccess.getScaleAccess().getGroup_10(), "rule__Scale__Group_10__0");
					put(grammarAccess.getScaleAccess().getGroup_11(), "rule__Scale__Group_11__0");
					put(grammarAccess.getScaleAccess().getGroup_12(), "rule__Scale__Group_12__0");
					put(grammarAccess.getTableAccess().getGroup(), "rule__Table__Group__0");
					put(grammarAccess.getTableAccess().getGroup_5(), "rule__Table__Group_5__0");
					put(grammarAccess.getTableAccess().getGroup_6(), "rule__Table__Group_6__0");
					put(grammarAccess.getTableAccess().getGroup_7(), "rule__Table__Group_7__0");
					put(grammarAccess.getTableAccess().getGroup_8(), "rule__Table__Group_8__0");
					put(grammarAccess.getTableAccess().getGroup_9(), "rule__Table__Group_9__0");
					put(grammarAccess.getTableAccess().getGroup_13(), "rule__Table__Group_13__0");
					put(grammarAccess.getTableAccess().getGroup_18(), "rule__Table__Group_18__0");
					put(grammarAccess.getTableAccess().getGroup_23(), "rule__Table__Group_23__0");
					put(grammarAccess.getOption_ImplAccess().getGroup(), "rule__Option_Impl__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getTableQuestionAccess().getGroup(), "rule__TableQuestion__Group__0");
					put(grammarAccess.getSurveyAccess().getTitleAssignment_3_1(), "rule__Survey__TitleAssignment_3_1");
					put(grammarAccess.getSurveyAccess().getDescriptionAssignment_4_1(), "rule__Survey__DescriptionAssignment_4_1");
					put(grammarAccess.getSurveyAccess().getItemsAssignment_5_2(), "rule__Survey__ItemsAssignment_5_2");
					put(grammarAccess.getSurveyAccess().getItemsAssignment_5_3_1(), "rule__Survey__ItemsAssignment_5_3_1");
					put(grammarAccess.getSurveyAccess().getTemplatesAssignment_6_2(), "rule__Survey__TemplatesAssignment_6_2");
					put(grammarAccess.getSurveyAccess().getTemplatesAssignment_6_3_1(), "rule__Survey__TemplatesAssignment_6_3_1");
					put(grammarAccess.getAnswerTemplateAccess().getIdAssignment_3(), "rule__AnswerTemplate__IdAssignment_3");
					put(grammarAccess.getAnswerTemplateAccess().getAnswersAssignment_6(), "rule__AnswerTemplate__AnswersAssignment_6");
					put(grammarAccess.getAnswerTemplateAccess().getAnswersAssignment_7_1(), "rule__AnswerTemplate__AnswersAssignment_7_1");
					put(grammarAccess.getAnswerAccess().getIdAssignment_2_1(), "rule__Answer__IdAssignment_2_1");
					put(grammarAccess.getAnswerAccess().getLabelAssignment_4(), "rule__Answer__LabelAssignment_4");
					put(grammarAccess.getGroupAccess().getRequiredAssignment_0(), "rule__Group__RequiredAssignment_0");
					put(grammarAccess.getGroupAccess().getTitleAssignment_3_1(), "rule__Group__TitleAssignment_3_1");
					put(grammarAccess.getGroupAccess().getDescriptionAssignment_4_1(), "rule__Group__DescriptionAssignment_4_1");
					put(grammarAccess.getGroupAccess().getDependsOnAssignment_5_1(), "rule__Group__DependsOnAssignment_5_1");
					put(grammarAccess.getGroupAccess().getQuestionsAssignment_8(), "rule__Group__QuestionsAssignment_8");
					put(grammarAccess.getGroupAccess().getQuestionsAssignment_9_1(), "rule__Group__QuestionsAssignment_9_1");
					put(grammarAccess.getSingleAccess().getRequiredAssignment_0(), "rule__Single__RequiredAssignment_0");
					put(grammarAccess.getSingleAccess().getOtherAssignment_1(), "rule__Single__OtherAssignment_1");
					put(grammarAccess.getSingleAccess().getTitleAssignment_4_1(), "rule__Single__TitleAssignment_4_1");
					put(grammarAccess.getSingleAccess().getDescriptionAssignment_5_1(), "rule__Single__DescriptionAssignment_5_1");
					put(grammarAccess.getSingleAccess().getIdAssignment_6_1(), "rule__Single__IdAssignment_6_1");
					put(grammarAccess.getSingleAccess().getDependsOnAssignment_7_1(), "rule__Single__DependsOnAssignment_7_1");
					put(grammarAccess.getSingleAccess().getTemplateAssignment_8_1(), "rule__Single__TemplateAssignment_8_1");
					put(grammarAccess.getSingleAccess().getOptionsAssignment_11(), "rule__Single__OptionsAssignment_11");
					put(grammarAccess.getSingleAccess().getOptionsAssignment_12_1(), "rule__Single__OptionsAssignment_12_1");
					put(grammarAccess.getMultipleAccess().getRequiredAssignment_0(), "rule__Multiple__RequiredAssignment_0");
					put(grammarAccess.getMultipleAccess().getOtherAssignment_1(), "rule__Multiple__OtherAssignment_1");
					put(grammarAccess.getMultipleAccess().getShowLimitsAssignment_2(), "rule__Multiple__ShowLimitsAssignment_2");
					put(grammarAccess.getMultipleAccess().getTitleAssignment_5_1(), "rule__Multiple__TitleAssignment_5_1");
					put(grammarAccess.getMultipleAccess().getDescriptionAssignment_6_1(), "rule__Multiple__DescriptionAssignment_6_1");
					put(grammarAccess.getMultipleAccess().getIdAssignment_7_1(), "rule__Multiple__IdAssignment_7_1");
					put(grammarAccess.getMultipleAccess().getLowerAssignment_8_1(), "rule__Multiple__LowerAssignment_8_1");
					put(grammarAccess.getMultipleAccess().getUpperAssignment_9_1(), "rule__Multiple__UpperAssignment_9_1");
					put(grammarAccess.getMultipleAccess().getDependsOnAssignment_10_1(), "rule__Multiple__DependsOnAssignment_10_1");
					put(grammarAccess.getMultipleAccess().getTemplateAssignment_11_1(), "rule__Multiple__TemplateAssignment_11_1");
					put(grammarAccess.getMultipleAccess().getOptionsAssignment_14(), "rule__Multiple__OptionsAssignment_14");
					put(grammarAccess.getMultipleAccess().getOptionsAssignment_15_1(), "rule__Multiple__OptionsAssignment_15_1");
					put(grammarAccess.getTextAccess().getRequiredAssignment_1(), "rule__Text__RequiredAssignment_1");
					put(grammarAccess.getTextAccess().getMultilineAssignment_2(), "rule__Text__MultilineAssignment_2");
					put(grammarAccess.getTextAccess().getTitleAssignment_5_1(), "rule__Text__TitleAssignment_5_1");
					put(grammarAccess.getTextAccess().getDescriptionAssignment_6_1(), "rule__Text__DescriptionAssignment_6_1");
					put(grammarAccess.getTextAccess().getIdAssignment_7_1(), "rule__Text__IdAssignment_7_1");
					put(grammarAccess.getTextAccess().getDependsOnAssignment_8_1(), "rule__Text__DependsOnAssignment_8_1");
					put(grammarAccess.getDateAccess().getRequiredAssignment_1(), "rule__Date__RequiredAssignment_1");
					put(grammarAccess.getDateAccess().getDayAssignment_2(), "rule__Date__DayAssignment_2");
					put(grammarAccess.getDateAccess().getMonthAssignment_3(), "rule__Date__MonthAssignment_3");
					put(grammarAccess.getDateAccess().getYearAssignment_4(), "rule__Date__YearAssignment_4");
					put(grammarAccess.getDateAccess().getTitleAssignment_7_1(), "rule__Date__TitleAssignment_7_1");
					put(grammarAccess.getDateAccess().getDescriptionAssignment_8_1(), "rule__Date__DescriptionAssignment_8_1");
					put(grammarAccess.getDateAccess().getIdAssignment_9_1(), "rule__Date__IdAssignment_9_1");
					put(grammarAccess.getDateAccess().getFromAssignment_10_1(), "rule__Date__FromAssignment_10_1");
					put(grammarAccess.getDateAccess().getToAssignment_11_1(), "rule__Date__ToAssignment_11_1");
					put(grammarAccess.getDateAccess().getDependsOnAssignment_12_1(), "rule__Date__DependsOnAssignment_12_1");
					put(grammarAccess.getNumberAccess().getRequiredAssignment_1(), "rule__Number__RequiredAssignment_1");
					put(grammarAccess.getNumberAccess().getShowLimitsAssignment_2(), "rule__Number__ShowLimitsAssignment_2");
					put(grammarAccess.getNumberAccess().getTitleAssignment_5_1(), "rule__Number__TitleAssignment_5_1");
					put(grammarAccess.getNumberAccess().getDescriptionAssignment_6_1(), "rule__Number__DescriptionAssignment_6_1");
					put(grammarAccess.getNumberAccess().getIdAssignment_7_1(), "rule__Number__IdAssignment_7_1");
					put(grammarAccess.getNumberAccess().getLowerAssignment_8_1(), "rule__Number__LowerAssignment_8_1");
					put(grammarAccess.getNumberAccess().getUpperAssignment_9_1(), "rule__Number__UpperAssignment_9_1");
					put(grammarAccess.getNumberAccess().getDependsOnAssignment_10_1(), "rule__Number__DependsOnAssignment_10_1");
					put(grammarAccess.getScaleAccess().getRequiredAssignment_0(), "rule__Scale__RequiredAssignment_0");
					put(grammarAccess.getScaleAccess().getTitleAssignment_3_1(), "rule__Scale__TitleAssignment_3_1");
					put(grammarAccess.getScaleAccess().getDescriptionAssignment_4_1(), "rule__Scale__DescriptionAssignment_4_1");
					put(grammarAccess.getScaleAccess().getIdAssignment_5_1(), "rule__Scale__IdAssignment_5_1");
					put(grammarAccess.getScaleAccess().getLowerAssignment_7(), "rule__Scale__LowerAssignment_7");
					put(grammarAccess.getScaleAccess().getUpperAssignment_9(), "rule__Scale__UpperAssignment_9");
					put(grammarAccess.getScaleAccess().getLowerLabelAssignment_10_1(), "rule__Scale__LowerLabelAssignment_10_1");
					put(grammarAccess.getScaleAccess().getUpperLabelAssignment_11_1(), "rule__Scale__UpperLabelAssignment_11_1");
					put(grammarAccess.getScaleAccess().getDependsOnAssignment_12_1(), "rule__Scale__DependsOnAssignment_12_1");
					put(grammarAccess.getTableAccess().getRequiredAssignment_0(), "rule__Table__RequiredAssignment_0");
					put(grammarAccess.getTableAccess().getOtherAssignment_1(), "rule__Table__OtherAssignment_1");
					put(grammarAccess.getTableAccess().getMultipleAssignment_2(), "rule__Table__MultipleAssignment_2");
					put(grammarAccess.getTableAccess().getTitleAssignment_5_1(), "rule__Table__TitleAssignment_5_1");
					put(grammarAccess.getTableAccess().getDescriptionAssignment_6_1(), "rule__Table__DescriptionAssignment_6_1");
					put(grammarAccess.getTableAccess().getIdAssignment_7_1(), "rule__Table__IdAssignment_7_1");
					put(grammarAccess.getTableAccess().getDependsOnAssignment_8_1(), "rule__Table__DependsOnAssignment_8_1");
					put(grammarAccess.getTableAccess().getTemplateAssignment_9_1(), "rule__Table__TemplateAssignment_9_1");
					put(grammarAccess.getTableAccess().getOptionsAssignment_12(), "rule__Table__OptionsAssignment_12");
					put(grammarAccess.getTableAccess().getOptionsAssignment_13_1(), "rule__Table__OptionsAssignment_13_1");
					put(grammarAccess.getTableAccess().getQuestionsAssignment_17(), "rule__Table__QuestionsAssignment_17");
					put(grammarAccess.getTableAccess().getQuestionsAssignment_18_1(), "rule__Table__QuestionsAssignment_18_1");
					put(grammarAccess.getTableAccess().getTableOptionsAssignment_22(), "rule__Table__TableOptionsAssignment_22");
					put(grammarAccess.getTableAccess().getTableOptionsAssignment_23_1(), "rule__Table__TableOptionsAssignment_23_1");
					put(grammarAccess.getTableQuestionAccess().getTitleAssignment_3(), "rule__TableQuestion__TitleAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			dk.itu.smdp.survey.ui.contentassist.antlr.internal.InternalDslParser typedParser = (dk.itu.smdp.survey.ui.contentassist.antlr.internal.InternalDslParser) parser;
			typedParser.entryRuleSurvey();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
