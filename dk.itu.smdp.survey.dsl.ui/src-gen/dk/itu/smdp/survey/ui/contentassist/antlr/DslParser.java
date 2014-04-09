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
					put(grammarAccess.getSurveyAccess().getAlternatives_1_3(), "rule__Survey__Alternatives_1_3");
					put(grammarAccess.getItemAccess().getAlternatives(), "rule__Item__Alternatives");
					put(grammarAccess.getQuestionAccess().getAlternatives(), "rule__Question__Alternatives");
					put(grammarAccess.getOptionAccess().getAlternatives(), "rule__Option__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getAnswerTemplateAccess().getAlternatives_4(), "rule__AnswerTemplate__Alternatives_4");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getSurveyAccess().getGroup(), "rule__Survey__Group__0");
					put(grammarAccess.getSurveyAccess().getGroup_1(), "rule__Survey__Group_1__0");
					put(grammarAccess.getSurveyAccess().getGroup_1_1_0(), "rule__Survey__Group_1_1_0__0");
					put(grammarAccess.getSurveyAccess().getGroup_1_1_1(), "rule__Survey__Group_1_1_1__0");
					put(grammarAccess.getAnswerTemplateAccess().getGroup(), "rule__AnswerTemplate__Group__0");
					put(grammarAccess.getAnswerTemplateAccess().getGroup_4_0(), "rule__AnswerTemplate__Group_4_0__0");
					put(grammarAccess.getAnswerAccess().getGroup(), "rule__Answer__Group__0");
					put(grammarAccess.getAnswerAccess().getGroup_1(), "rule__Answer__Group_1__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getGroupAccess().getGroup_1_0(), "rule__Group__Group_1_0__0");
					put(grammarAccess.getGroupAccess().getGroup_1_1(), "rule__Group__Group_1_1__0");
					put(grammarAccess.getGroupAccess().getGroup_1_2(), "rule__Group__Group_1_2__0");
					put(grammarAccess.getSingleAccess().getGroup(), "rule__Single__Group__0");
					put(grammarAccess.getSingleAccess().getGroup_1_0(), "rule__Single__Group_1_0__0");
					put(grammarAccess.getSingleAccess().getGroup_1_1(), "rule__Single__Group_1_1__0");
					put(grammarAccess.getSingleAccess().getGroup_1_2(), "rule__Single__Group_1_2__0");
					put(grammarAccess.getSingleAccess().getGroup_1_3(), "rule__Single__Group_1_3__0");
					put(grammarAccess.getMultipleAccess().getGroup(), "rule__Multiple__Group__0");
					put(grammarAccess.getMultipleAccess().getGroup_1_0(), "rule__Multiple__Group_1_0__0");
					put(grammarAccess.getMultipleAccess().getGroup_1_1(), "rule__Multiple__Group_1_1__0");
					put(grammarAccess.getMultipleAccess().getGroup_1_2(), "rule__Multiple__Group_1_2__0");
					put(grammarAccess.getMultipleAccess().getGroup_1_3(), "rule__Multiple__Group_1_3__0");
					put(grammarAccess.getMultipleAccess().getGroup_1_4(), "rule__Multiple__Group_1_4__0");
					put(grammarAccess.getMultipleAccess().getGroup_1_5(), "rule__Multiple__Group_1_5__0");
					put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
					put(grammarAccess.getTextAccess().getGroup_2_0(), "rule__Text__Group_2_0__0");
					put(grammarAccess.getTextAccess().getGroup_2_1(), "rule__Text__Group_2_1__0");
					put(grammarAccess.getTextAccess().getGroup_2_2(), "rule__Text__Group_2_2__0");
					put(grammarAccess.getTextAccess().getGroup_2_3(), "rule__Text__Group_2_3__0");
					put(grammarAccess.getDateAccess().getGroup(), "rule__Date__Group__0");
					put(grammarAccess.getDateAccess().getGroup_2_0(), "rule__Date__Group_2_0__0");
					put(grammarAccess.getDateAccess().getGroup_2_1(), "rule__Date__Group_2_1__0");
					put(grammarAccess.getDateAccess().getGroup_2_2(), "rule__Date__Group_2_2__0");
					put(grammarAccess.getDateAccess().getGroup_2_3(), "rule__Date__Group_2_3__0");
					put(grammarAccess.getDateAccess().getGroup_2_4(), "rule__Date__Group_2_4__0");
					put(grammarAccess.getDateAccess().getGroup_2_5(), "rule__Date__Group_2_5__0");
					put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
					put(grammarAccess.getNumberAccess().getGroup_2_0(), "rule__Number__Group_2_0__0");
					put(grammarAccess.getNumberAccess().getGroup_2_1(), "rule__Number__Group_2_1__0");
					put(grammarAccess.getNumberAccess().getGroup_2_2(), "rule__Number__Group_2_2__0");
					put(grammarAccess.getNumberAccess().getGroup_2_3(), "rule__Number__Group_2_3__0");
					put(grammarAccess.getNumberAccess().getGroup_2_4(), "rule__Number__Group_2_4__0");
					put(grammarAccess.getNumberAccess().getGroup_2_5(), "rule__Number__Group_2_5__0");
					put(grammarAccess.getScaleAccess().getGroup(), "rule__Scale__Group__0");
					put(grammarAccess.getScaleAccess().getGroup_1_0(), "rule__Scale__Group_1_0__0");
					put(grammarAccess.getScaleAccess().getGroup_1_1(), "rule__Scale__Group_1_1__0");
					put(grammarAccess.getScaleAccess().getGroup_1_2(), "rule__Scale__Group_1_2__0");
					put(grammarAccess.getScaleAccess().getGroup_1_3(), "rule__Scale__Group_1_3__0");
					put(grammarAccess.getScaleAccess().getGroup_1_4(), "rule__Scale__Group_1_4__0");
					put(grammarAccess.getScaleAccess().getGroup_1_5(), "rule__Scale__Group_1_5__0");
					put(grammarAccess.getScaleAccess().getGroup_1_6(), "rule__Scale__Group_1_6__0");
					put(grammarAccess.getScaleAccess().getGroup_1_7(), "rule__Scale__Group_1_7__0");
					put(grammarAccess.getTableAccess().getGroup(), "rule__Table__Group__0");
					put(grammarAccess.getTableAccess().getGroup_1_0(), "rule__Table__Group_1_0__0");
					put(grammarAccess.getTableAccess().getGroup_1_1(), "rule__Table__Group_1_1__0");
					put(grammarAccess.getTableAccess().getGroup_1_2(), "rule__Table__Group_1_2__0");
					put(grammarAccess.getTableAccess().getGroup_1_3(), "rule__Table__Group_1_3__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getTableQuestionAccess().getGroup(), "rule__TableQuestion__Group__0");
					put(grammarAccess.getSurveyAccess().getTitleAssignment_1_1_0_2(), "rule__Survey__TitleAssignment_1_1_0_2");
					put(grammarAccess.getSurveyAccess().getDescriptionAssignment_1_1_1_2(), "rule__Survey__DescriptionAssignment_1_1_1_2");
					put(grammarAccess.getSurveyAccess().getItemsAssignment_1_3_0(), "rule__Survey__ItemsAssignment_1_3_0");
					put(grammarAccess.getSurveyAccess().getTemplatesAssignment_1_3_1(), "rule__Survey__TemplatesAssignment_1_3_1");
					put(grammarAccess.getAnswerTemplateAccess().getIdAssignment_3(), "rule__AnswerTemplate__IdAssignment_3");
					put(grammarAccess.getAnswerTemplateAccess().getAnswersAssignment_4_0_1(), "rule__AnswerTemplate__AnswersAssignment_4_0_1");
					put(grammarAccess.getAnswerAccess().getIdAssignment_1_2(), "rule__Answer__IdAssignment_1_2");
					put(grammarAccess.getAnswerAccess().getLabelAssignment_3(), "rule__Answer__LabelAssignment_3");
					put(grammarAccess.getGroupAccess().getTitleAssignment_1_0_2(), "rule__Group__TitleAssignment_1_0_2");
					put(grammarAccess.getGroupAccess().getDescriptionAssignment_1_1_2(), "rule__Group__DescriptionAssignment_1_1_2");
					put(grammarAccess.getGroupAccess().getDependsOnAssignment_1_2_2(), "rule__Group__DependsOnAssignment_1_2_2");
					put(grammarAccess.getGroupAccess().getRequiredAssignment_1_3(), "rule__Group__RequiredAssignment_1_3");
					put(grammarAccess.getGroupAccess().getQuestionsAssignment_3(), "rule__Group__QuestionsAssignment_3");
					put(grammarAccess.getSingleAccess().getTitleAssignment_1_0_2(), "rule__Single__TitleAssignment_1_0_2");
					put(grammarAccess.getSingleAccess().getDescriptionAssignment_1_1_2(), "rule__Single__DescriptionAssignment_1_1_2");
					put(grammarAccess.getSingleAccess().getIdAssignment_1_2_2(), "rule__Single__IdAssignment_1_2_2");
					put(grammarAccess.getSingleAccess().getDependsOnAssignment_1_3_2(), "rule__Single__DependsOnAssignment_1_3_2");
					put(grammarAccess.getSingleAccess().getRequiredAssignment_1_4(), "rule__Single__RequiredAssignment_1_4");
					put(grammarAccess.getSingleAccess().getOtherAssignment_1_5(), "rule__Single__OtherAssignment_1_5");
					put(grammarAccess.getSingleAccess().getTemplateAssignment_3_0(), "rule__Single__TemplateAssignment_3_0");
					put(grammarAccess.getSingleAccess().getOptionsAssignment_3_1(), "rule__Single__OptionsAssignment_3_1");
					put(grammarAccess.getMultipleAccess().getTitleAssignment_1_0_2(), "rule__Multiple__TitleAssignment_1_0_2");
					put(grammarAccess.getMultipleAccess().getDescriptionAssignment_1_1_2(), "rule__Multiple__DescriptionAssignment_1_1_2");
					put(grammarAccess.getMultipleAccess().getIdAssignment_1_2_2(), "rule__Multiple__IdAssignment_1_2_2");
					put(grammarAccess.getMultipleAccess().getLowerAssignment_1_3_2(), "rule__Multiple__LowerAssignment_1_3_2");
					put(grammarAccess.getMultipleAccess().getUpperAssignment_1_4_2(), "rule__Multiple__UpperAssignment_1_4_2");
					put(grammarAccess.getMultipleAccess().getDependsOnAssignment_1_5_1(), "rule__Multiple__DependsOnAssignment_1_5_1");
					put(grammarAccess.getMultipleAccess().getRequiredAssignment_1_6(), "rule__Multiple__RequiredAssignment_1_6");
					put(grammarAccess.getMultipleAccess().getOtherAssignment_1_7(), "rule__Multiple__OtherAssignment_1_7");
					put(grammarAccess.getMultipleAccess().getShowLimitsAssignment_1_8(), "rule__Multiple__ShowLimitsAssignment_1_8");
					put(grammarAccess.getMultipleAccess().getTemplateAssignment_3_0(), "rule__Multiple__TemplateAssignment_3_0");
					put(grammarAccess.getMultipleAccess().getOptionsAssignment_3_1(), "rule__Multiple__OptionsAssignment_3_1");
					put(grammarAccess.getTextAccess().getTitleAssignment_2_0_2(), "rule__Text__TitleAssignment_2_0_2");
					put(grammarAccess.getTextAccess().getDescriptionAssignment_2_1_2(), "rule__Text__DescriptionAssignment_2_1_2");
					put(grammarAccess.getTextAccess().getIdAssignment_2_2_2(), "rule__Text__IdAssignment_2_2_2");
					put(grammarAccess.getTextAccess().getDependsOnAssignment_2_3_2(), "rule__Text__DependsOnAssignment_2_3_2");
					put(grammarAccess.getTextAccess().getRequiredAssignment_2_4(), "rule__Text__RequiredAssignment_2_4");
					put(grammarAccess.getTextAccess().getMultilineAssignment_2_5(), "rule__Text__MultilineAssignment_2_5");
					put(grammarAccess.getDateAccess().getTitleAssignment_2_0_2(), "rule__Date__TitleAssignment_2_0_2");
					put(grammarAccess.getDateAccess().getDescriptionAssignment_2_1_2(), "rule__Date__DescriptionAssignment_2_1_2");
					put(grammarAccess.getDateAccess().getIdAssignment_2_2_2(), "rule__Date__IdAssignment_2_2_2");
					put(grammarAccess.getDateAccess().getFromAssignment_2_3_2(), "rule__Date__FromAssignment_2_3_2");
					put(grammarAccess.getDateAccess().getToAssignment_2_4_2(), "rule__Date__ToAssignment_2_4_2");
					put(grammarAccess.getDateAccess().getDependsOnAssignment_2_5_2(), "rule__Date__DependsOnAssignment_2_5_2");
					put(grammarAccess.getDateAccess().getRequiredAssignment_2_6(), "rule__Date__RequiredAssignment_2_6");
					put(grammarAccess.getDateAccess().getDayAssignment_2_7(), "rule__Date__DayAssignment_2_7");
					put(grammarAccess.getDateAccess().getMonthAssignment_2_8(), "rule__Date__MonthAssignment_2_8");
					put(grammarAccess.getDateAccess().getYearAssignment_2_9(), "rule__Date__YearAssignment_2_9");
					put(grammarAccess.getNumberAccess().getTitleAssignment_2_0_2(), "rule__Number__TitleAssignment_2_0_2");
					put(grammarAccess.getNumberAccess().getDescriptionAssignment_2_1_2(), "rule__Number__DescriptionAssignment_2_1_2");
					put(grammarAccess.getNumberAccess().getIdAssignment_2_2_2(), "rule__Number__IdAssignment_2_2_2");
					put(grammarAccess.getNumberAccess().getLowerAssignment_2_3_2(), "rule__Number__LowerAssignment_2_3_2");
					put(grammarAccess.getNumberAccess().getUpperAssignment_2_4_2(), "rule__Number__UpperAssignment_2_4_2");
					put(grammarAccess.getNumberAccess().getDependsOnAssignment_2_5_2(), "rule__Number__DependsOnAssignment_2_5_2");
					put(grammarAccess.getNumberAccess().getRequiredAssignment_2_6(), "rule__Number__RequiredAssignment_2_6");
					put(grammarAccess.getNumberAccess().getShowLimitsAssignment_2_7(), "rule__Number__ShowLimitsAssignment_2_7");
					put(grammarAccess.getScaleAccess().getTitleAssignment_1_0_2(), "rule__Scale__TitleAssignment_1_0_2");
					put(grammarAccess.getScaleAccess().getDescriptionAssignment_1_1_2(), "rule__Scale__DescriptionAssignment_1_1_2");
					put(grammarAccess.getScaleAccess().getIdAssignment_1_2_2(), "rule__Scale__IdAssignment_1_2_2");
					put(grammarAccess.getScaleAccess().getLowerAssignment_1_3_2(), "rule__Scale__LowerAssignment_1_3_2");
					put(grammarAccess.getScaleAccess().getUpperAssignment_1_4_2(), "rule__Scale__UpperAssignment_1_4_2");
					put(grammarAccess.getScaleAccess().getLowerLabelAssignment_1_5_2(), "rule__Scale__LowerLabelAssignment_1_5_2");
					put(grammarAccess.getScaleAccess().getUpperLabelAssignment_1_6_2(), "rule__Scale__UpperLabelAssignment_1_6_2");
					put(grammarAccess.getScaleAccess().getDependsOnAssignment_1_7_2(), "rule__Scale__DependsOnAssignment_1_7_2");
					put(grammarAccess.getScaleAccess().getRequiredAssignment_1_8(), "rule__Scale__RequiredAssignment_1_8");
					put(grammarAccess.getTableAccess().getTitleAssignment_1_0_2(), "rule__Table__TitleAssignment_1_0_2");
					put(grammarAccess.getTableAccess().getDescriptionAssignment_1_1_2(), "rule__Table__DescriptionAssignment_1_1_2");
					put(grammarAccess.getTableAccess().getIdAssignment_1_2_2(), "rule__Table__IdAssignment_1_2_2");
					put(grammarAccess.getTableAccess().getDependsOnAssignment_1_3_2(), "rule__Table__DependsOnAssignment_1_3_2");
					put(grammarAccess.getTableAccess().getRequiredAssignment_1_4(), "rule__Table__RequiredAssignment_1_4");
					put(grammarAccess.getTableAccess().getOtherAssignment_1_5(), "rule__Table__OtherAssignment_1_5");
					put(grammarAccess.getTableAccess().getMultipleAssignment_1_6(), "rule__Table__MultipleAssignment_1_6");
					put(grammarAccess.getTableAccess().getTemplateAssignment_3_0(), "rule__Table__TemplateAssignment_3_0");
					put(grammarAccess.getTableAccess().getOptionsAssignment_3_1_0(), "rule__Table__OptionsAssignment_3_1_0");
					put(grammarAccess.getTableAccess().getQuestionsAssignment_3_1_1(), "rule__Table__QuestionsAssignment_3_1_1");
					put(grammarAccess.getTableAccess().getTableOptionsAssignment_3_1_2(), "rule__Table__TableOptionsAssignment_3_1_2");
					put(grammarAccess.getTableQuestionAccess().getTitleAssignment_2(), "rule__TableQuestion__TitleAssignment_2");
					put(grammarAccess.getSurveyAccess().getUnorderedGroup_1_1(), "rule__Survey__UnorderedGroup_1_1");
					put(grammarAccess.getGroupAccess().getUnorderedGroup_1(), "rule__Group__UnorderedGroup_1");
					put(grammarAccess.getSingleAccess().getUnorderedGroup_1(), "rule__Single__UnorderedGroup_1");
					put(grammarAccess.getSingleAccess().getUnorderedGroup_3(), "rule__Single__UnorderedGroup_3");
					put(grammarAccess.getMultipleAccess().getUnorderedGroup_1(), "rule__Multiple__UnorderedGroup_1");
					put(grammarAccess.getMultipleAccess().getUnorderedGroup_3(), "rule__Multiple__UnorderedGroup_3");
					put(grammarAccess.getTextAccess().getUnorderedGroup_2(), "rule__Text__UnorderedGroup_2");
					put(grammarAccess.getDateAccess().getUnorderedGroup_2(), "rule__Date__UnorderedGroup_2");
					put(grammarAccess.getNumberAccess().getUnorderedGroup_2(), "rule__Number__UnorderedGroup_2");
					put(grammarAccess.getScaleAccess().getUnorderedGroup_1(), "rule__Scale__UnorderedGroup_1");
					put(grammarAccess.getTableAccess().getUnorderedGroup_1(), "rule__Table__UnorderedGroup_1");
					put(grammarAccess.getTableAccess().getUnorderedGroup_3(), "rule__Table__UnorderedGroup_3");
					put(grammarAccess.getTableAccess().getUnorderedGroup_3_1(), "rule__Table__UnorderedGroup_3_1");
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
