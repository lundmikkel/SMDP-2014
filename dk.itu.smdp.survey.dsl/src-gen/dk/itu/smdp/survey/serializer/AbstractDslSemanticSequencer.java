package dk.itu.smdp.survey.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.itu.smdp.survey.services.DslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import survey.Answer;
import survey.AnswerTemplate;
import survey.AnswerTemplateRef;
import survey.Date;
import survey.Group;
import survey.Multiple;
import survey.Scale;
import survey.Single;
import survey.Survey;
import survey.SurveyPackage;
import survey.Table;
import survey.TableQuestion;
import survey.Text;

@SuppressWarnings("all")
public abstract class AbstractDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SurveyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SurveyPackage.ANSWER:
				if(context == grammarAccess.getAnswerRule() ||
				   context == grammarAccess.getOptionRule()) {
					sequence_Answer(context, (Answer) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.ANSWER_TEMPLATE:
				if(context == grammarAccess.getAnswerTemplateRule()) {
					sequence_AnswerTemplate(context, (AnswerTemplate) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.ANSWER_TEMPLATE_REF:
				if(context == grammarAccess.getAnswerTemplateRefRule() ||
				   context == grammarAccess.getOptionRule()) {
					sequence_AnswerTemplateRef(context, (AnswerTemplateRef) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.DATE:
				if(context == grammarAccess.getDateRule() ||
				   context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_Date(context, (Date) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.GROUP:
				if(context == grammarAccess.getGroupRule() ||
				   context == grammarAccess.getItemRule()) {
					sequence_Group(context, (Group) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.MULTIPLE:
				if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getMultipleRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_Multiple(context, (Multiple) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.NUMBER:
				if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getNumberRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_Number(context, (survey.Number) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.SCALE:
				if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getScaleRule()) {
					sequence_Scale(context, (Scale) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.SINGLE:
				if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getSingleRule()) {
					sequence_Single(context, (Single) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.SURVEY:
				if(context == grammarAccess.getSurveyRule()) {
					sequence_Survey(context, (Survey) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.TABLE:
				if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getTableRule()) {
					sequence_Table(context, (Table) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.TABLE_QUESTION:
				if(context == grammarAccess.getTableQuestionRule()) {
					sequence_TableQuestion(context, (TableQuestion) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.TEXT:
				if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getTextRule()) {
					sequence_Text(context, (Text) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     template=[AnswerTemplate|EString]
	 */
	protected void sequence_AnswerTemplateRef(EObject context, AnswerTemplateRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.ANSWER_TEMPLATE_REF__TEMPLATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.ANSWER_TEMPLATE_REF__TEMPLATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnswerTemplateRefAccess().getTemplateAnswerTemplateEStringParserRuleCall_3_0_1(), semanticObject.getTemplate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=EString answers+=Answer+)
	 */
	protected void sequence_AnswerTemplate(EObject context, AnswerTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EString? label=Label)
	 */
	protected void sequence_Answer(EObject context, Answer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString? 
	 *         description=EString? 
	 *         id=EString? 
	 *         from=EString? 
	 *         to=EString? 
	 *         dependsOn=[Answer|EString]? 
	 *         showLimits?='showLimits'? 
	 *         required?='required'? 
	 *         day?='day'? 
	 *         month?='month'? 
	 *         year?='year'?
	 *     )
	 */
	protected void sequence_Date(EObject context, Date semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? description=EString? dependsOn=[Answer|EString]? required?='required'? questions+=Question+)
	 */
	protected void sequence_Group(EObject context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString? 
	 *         description=EString? 
	 *         id=EString? 
	 *         lower=EInt? 
	 *         upper=EInt? 
	 *         dependsOn=[Answer|EString]? 
	 *         required?='required'? 
	 *         other?='other'? 
	 *         showLimits?='showLimits'? 
	 *         options+=Option+
	 *     )
	 */
	protected void sequence_Multiple(EObject context, Multiple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString? 
	 *         description=EString? 
	 *         id=EString? 
	 *         lower=EInt? 
	 *         upper=EInt? 
	 *         dependsOn=[Answer|EString]? 
	 *         required?='required'? 
	 *         showLimits?='showLimits'?
	 *     )
	 */
	protected void sequence_Number(EObject context, survey.Number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString? 
	 *         description=EString? 
	 *         id=EString? 
	 *         lower=EInt 
	 *         upper=EInt 
	 *         lowerLabel=EString? 
	 *         upperLabel=EString? 
	 *         dependsOn=[Answer|EString]? 
	 *         required?='required'?
	 *     )
	 */
	protected void sequence_Scale(EObject context, Scale semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString? 
	 *         description=EString? 
	 *         id=EString? 
	 *         dependsOn=[Answer|EString]? 
	 *         required?='required'? 
	 *         other?='other'? 
	 *         options+=Option+
	 *     )
	 */
	protected void sequence_Single(EObject context, Single semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((title=EString? description=EString? (items+=Item | templates+=AnswerTemplate)*)?)
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     title=Label
	 */
	protected void sequence_TableQuestion(EObject context, TableQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.TABLE_QUESTION__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.TABLE_QUESTION__TITLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTableQuestionAccess().getTitleLabelParserRuleCall_1_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString? 
	 *         description=EString? 
	 *         id=EString? 
	 *         dependsOn=[Answer|EString]? 
	 *         required?='required'? 
	 *         other?='other' 
	 *         multiple?='multiple'? 
	 *         options+=Option+ 
	 *         questions+=TableQuestion+ 
	 *         (options+=Option | questions+=TableQuestion)*
	 *     )
	 */
	protected void sequence_Table(EObject context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString? 
	 *         description=EString? 
	 *         id=EString? 
	 *         dependsOn=[Answer|EString]? 
	 *         required?='required'? 
	 *         multiline?='multiline'?
	 *     )
	 */
	protected void sequence_Text(EObject context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
