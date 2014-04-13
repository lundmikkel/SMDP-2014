package dk.itu.smdp.survey.serializer;

import com.google.inject.Inject;
import dk.itu.smdp.survey.services.DslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Survey___SurveyKeyword_1_0_GreaterThanSignKeyword_1_2_SurveyKeyword_1_4__q;
	protected AbstractElementAlias match_Text___SingleKeyword_2_5_1_or_SinglelineKeyword_2_5_0__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DslGrammarAccess) access;
		match_Survey___SurveyKeyword_1_0_GreaterThanSignKeyword_1_2_SurveyKeyword_1_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSurveyAccess().getSurveyKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getSurveyAccess().getGreaterThanSignKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getSurveyAccess().getSurveyKeyword_1_4()));
		match_Text___SingleKeyword_2_5_1_or_SinglelineKeyword_2_5_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getTextAccess().getSingleKeyword_2_5_1()), new TokenAlias(false, false, grammarAccess.getTextAccess().getSinglelineKeyword_2_5_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Survey___SurveyKeyword_1_0_GreaterThanSignKeyword_1_2_SurveyKeyword_1_4__q.equals(syntax))
				emit_Survey___SurveyKeyword_1_0_GreaterThanSignKeyword_1_2_SurveyKeyword_1_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Text___SingleKeyword_2_5_1_or_SinglelineKeyword_2_5_0__a.equals(syntax))
				emit_Text___SingleKeyword_2_5_1_or_SinglelineKeyword_2_5_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('<survey' '>' '</survey>')?
	 */
	protected void emit_Survey___SurveyKeyword_1_0_GreaterThanSignKeyword_1_2_SurveyKeyword_1_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('single' | 'singleline')*
	 */
	protected void emit_Text___SingleKeyword_2_5_1_or_SinglelineKeyword_2_5_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
