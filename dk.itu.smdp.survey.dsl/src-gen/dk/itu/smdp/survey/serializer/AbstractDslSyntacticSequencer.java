package dk.itu.smdp.survey.serializer;

import com.google.inject.Inject;
import dk.itu.smdp.survey.services.DslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Survey___SurveyKeyword_1_0_GreaterThanSignKeyword_1_3_SurveyKeyword_1_5__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DslGrammarAccess) access;
		match_Survey___SurveyKeyword_1_0_GreaterThanSignKeyword_1_3_SurveyKeyword_1_5__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSurveyAccess().getSurveyKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getSurveyAccess().getGreaterThanSignKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getSurveyAccess().getSurveyKeyword_1_5()));
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
			if(match_Survey___SurveyKeyword_1_0_GreaterThanSignKeyword_1_3_SurveyKeyword_1_5__q.equals(syntax))
				emit_Survey___SurveyKeyword_1_0_GreaterThanSignKeyword_1_3_SurveyKeyword_1_5__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('<survey' '>' '</survey>')?
	 */
	protected void emit_Survey___SurveyKeyword_1_0_GreaterThanSignKeyword_1_3_SurveyKeyword_1_5__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
