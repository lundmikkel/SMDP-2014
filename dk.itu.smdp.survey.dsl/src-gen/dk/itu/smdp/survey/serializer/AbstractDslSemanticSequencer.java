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
				if(context == grammarAccess.getAnswerTemplateRefAttrRule()) {
					sequence_AnswerTemplateRefAttr(context, (AnswerTemplateRef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAnswerTemplateRefRule() ||
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
				if(context == grammarAccess.getMultipleRefRule()) {
					sequence_MultipleRef(context, (Multiple) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getMultipleWithOptionsRule()) {
					sequence_MultipleWithOptions(context, (Multiple) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getMultipleRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_Multiple_MultipleRef_MultipleWithOptions(context, (Multiple) semanticObject); 
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
				if(context == grammarAccess.getSingleRefRule()) {
					sequence_SingleRef(context, (Single) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSingleWithOptionsRule()) {
					sequence_SingleWithOptions(context, (Single) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getSingleRule()) {
					sequence_Single_SingleRef_SingleWithOptions(context, (Single) semanticObject); 
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
	 *     template=[AnswerTemplate|ID]
	 */
	protected void sequence_AnswerTemplateRefAttr(EObject context, AnswerTemplateRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.ANSWER_TEMPLATE_REF__TEMPLATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.ANSWER_TEMPLATE_REF__TEMPLATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnswerTemplateRefAttrAccess().getTemplateAnswerTemplateIDTerminalRuleCall_1_0_1(), semanticObject.getTemplate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     template=[AnswerTemplate|ID]
	 */
	protected void sequence_AnswerTemplateRef(EObject context, AnswerTemplateRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.ANSWER_TEMPLATE_REF__TEMPLATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.ANSWER_TEMPLATE_REF__TEMPLATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnswerTemplateRefAccess().getTemplateAnswerTemplateIDTerminalRuleCall_2_0_1(), semanticObject.getTemplate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID answers+=Answer+)
	 */
	protected void sequence_AnswerTemplate(EObject context, AnswerTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? title=EString)
	 */
	protected void sequence_Answer(EObject context, Answer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString 
	 *         description=EString? 
	 *         name=ID? 
	 *         start=EString? 
	 *         end=EString? 
	 *         dependsOn=DEP_ID? 
	 *         (showLimits?='show-limits' | showLimits?='show' | showLimits?='limits')? 
	 *         required?='required'? 
	 *         mode=DateMode?
	 *     )
	 */
	protected void sequence_Date(EObject context, Date semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString? 
	 *         name=EString? 
	 *         description=EString? 
	 *         dependsOn=DEP_ID? 
	 *         required?='required'? 
	 *         questions+=Question+
	 *     )
	 */
	protected void sequence_Group(EObject context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString 
	 *         description=EString? 
	 *         name=ID? 
	 *         min=INT? 
	 *         max=INT? 
	 *         dependsOn=DEP_ID? 
	 *         required?='required'? 
	 *         (other?='other' | other?='other=""' | otherLabel=EString)? 
	 *         (showLimits?='show-limits' | showLimits?='show' | showLimits?='limits')? 
	 *         options+=AnswerTemplateRefAttr
	 *     )
	 */
	protected void sequence_MultipleRef(EObject context, Multiple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString 
	 *         description=EString? 
	 *         name=ID? 
	 *         min=INT? 
	 *         max=INT? 
	 *         dependsOn=DEP_ID? 
	 *         required?='required'? 
	 *         (other?='other' | other?='other=""' | otherLabel=EString)? 
	 *         (showLimits?='show-limits' | showLimits?='show' | showLimits?='limits')? 
	 *         options+=Option+
	 *     )
	 */
	protected void sequence_MultipleWithOptions(EObject context, Multiple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             title=EString 
	 *             description=EString? 
	 *             name=ID? 
	 *             min=INT? 
	 *             max=INT? 
	 *             dependsOn=DEP_ID? 
	 *             required?='required'? 
	 *             (other?='other' | other?='other=""' | otherLabel=EString)? 
	 *             (showLimits?='show-limits' | showLimits?='show' | showLimits?='limits')? 
	 *             options+=Option+
	 *         ) | 
	 *         (
	 *             title=EString 
	 *             description=EString? 
	 *             name=ID? 
	 *             min=INT? 
	 *             max=INT? 
	 *             dependsOn=DEP_ID? 
	 *             required?='required'? 
	 *             (other?='other' | other?='other=""' | otherLabel=EString)? 
	 *             (showLimits?='show-limits' | showLimits?='show' | showLimits?='limits')? 
	 *             options+=AnswerTemplateRefAttr
	 *         )
	 *     )
	 */
	protected void sequence_Multiple_MultipleRef_MultipleWithOptions(EObject context, Multiple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString 
	 *         description=EString? 
	 *         name=ID? 
	 *         min=EInt? 
	 *         max=EInt? 
	 *         dependsOn=DEP_ID? 
	 *         required?='required'? 
	 *         (showLimits?='show-limits' | showLimits?='show' | showLimits?='limits')?
	 *     )
	 */
	protected void sequence_Number(EObject context, survey.Number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString 
	 *         description=EString? 
	 *         name=ID? 
	 *         min=EInt 
	 *         max=EInt 
	 *         minLabel=EString? 
	 *         maxLabel=EString? 
	 *         dependsOn=DEP_ID? 
	 *         required?='required'?
	 *     )
	 */
	protected void sequence_Scale(EObject context, Scale semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString 
	 *         description=EString? 
	 *         name=ID? 
	 *         dependsOn=DEP_ID? 
	 *         required?='required'? 
	 *         options+=AnswerTemplateRefAttr
	 *     )
	 */
	protected void sequence_SingleRef(EObject context, Single semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString 
	 *         description=EString? 
	 *         name=ID? 
	 *         dependsOn=DEP_ID? 
	 *         required?='required'? 
	 *         (other?='other' | other?='other=""' | otherLabel=EString)? 
	 *         options+=Option+
	 *     )
	 */
	protected void sequence_SingleWithOptions(EObject context, Single semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             title=EString 
	 *             description=EString? 
	 *             name=ID? 
	 *             dependsOn=DEP_ID? 
	 *             required?='required'? 
	 *             (other?='other' | other?='other=""' | otherLabel=EString)? 
	 *             options+=Option+
	 *         ) | 
	 *         (
	 *             title=EString 
	 *             description=EString? 
	 *             name=ID? 
	 *             dependsOn=DEP_ID? 
	 *             required?='required'? 
	 *             options+=AnswerTemplateRefAttr
	 *         )
	 *     )
	 */
	protected void sequence_Single_SingleRef_SingleWithOptions(EObject context, Single semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((title=EString? description=EString? name=ID? mail=STRING (items+=Item | templates+=AnswerTemplate)*)?)
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? required?='required'? title=EString)
	 */
	protected void sequence_TableQuestion(EObject context, TableQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString? 
	 *         description=EString? 
	 *         dependsOn=DEP_ID? 
	 *         required?='required'? 
	 *         (other?='other' | other?='other=""' | otherLabel=EString)? 
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
	 *         title=EString 
	 *         description=EString? 
	 *         name=ID? 
	 *         dependsOn=DEP_ID? 
	 *         required?='required'? 
	 *         (multi?='multi' | multi?='multiline')?
	 *     )
	 */
	protected void sequence_Text(EObject context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
