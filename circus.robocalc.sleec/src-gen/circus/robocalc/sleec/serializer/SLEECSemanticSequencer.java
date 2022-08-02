/*
 * generated by Xtext 2.25.0
 */
package circus.robocalc.sleec.serializer;

import circus.robocalc.sleec.sLEEC.BoolComp;
import circus.robocalc.sleec.sLEEC.Constant;
import circus.robocalc.sleec.sLEEC.Defblock;
import circus.robocalc.sleec.sLEEC.Defeater;
import circus.robocalc.sleec.sLEEC.Event;
import circus.robocalc.sleec.sLEEC.MBoolExpr;
import circus.robocalc.sleec.sLEEC.Measure;
import circus.robocalc.sleec.sLEEC.Not;
import circus.robocalc.sleec.sLEEC.Numeric;
import circus.robocalc.sleec.sLEEC.RelComp;
import circus.robocalc.sleec.sLEEC.Response;
import circus.robocalc.sleec.sLEEC.Rule;
import circus.robocalc.sleec.sLEEC.RuleBlock;
import circus.robocalc.sleec.sLEEC.SLEECPackage;
import circus.robocalc.sleec.sLEEC.Scale;
import circus.robocalc.sleec.sLEEC.Specification;
import circus.robocalc.sleec.sLEEC.Trigger;
import circus.robocalc.sleec.sLEEC.Value;
import circus.robocalc.sleec.services.SLEECGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SLEECSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SLEECGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SLEECPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SLEECPackage.BOOL_COMP:
				sequence_BoolComp(context, (BoolComp) semanticObject); 
				return; 
			case SLEECPackage.BOOLEAN:
				sequence_Type(context, (circus.robocalc.sleec.sLEEC.Boolean) semanticObject); 
				return; 
			case SLEECPackage.CONSTANT:
				sequence_Definition(context, (Constant) semanticObject); 
				return; 
			case SLEECPackage.DEFBLOCK:
				sequence_Defblock(context, (Defblock) semanticObject); 
				return; 
			case SLEECPackage.DEFEATER:
				sequence_Defeater(context, (Defeater) semanticObject); 
				return; 
			case SLEECPackage.EVENT:
				sequence_Definition(context, (Event) semanticObject); 
				return; 
			case SLEECPackage.MBOOL_EXPR:
				sequence_Atom(context, (MBoolExpr) semanticObject); 
				return; 
			case SLEECPackage.MEASURE:
				sequence_Definition(context, (Measure) semanticObject); 
				return; 
			case SLEECPackage.NOT:
				sequence_Not(context, (Not) semanticObject); 
				return; 
			case SLEECPackage.NUMERIC:
				sequence_Type(context, (Numeric) semanticObject); 
				return; 
			case SLEECPackage.REL_COMP:
				sequence_RelComp(context, (RelComp) semanticObject); 
				return; 
			case SLEECPackage.RESPONSE:
				sequence_Response(context, (Response) semanticObject); 
				return; 
			case SLEECPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case SLEECPackage.RULE_BLOCK:
				sequence_RuleBlock(context, (RuleBlock) semanticObject); 
				return; 
			case SLEECPackage.SCALE:
				sequence_Type(context, (Scale) semanticObject); 
				return; 
			case SLEECPackage.SPECIFICATION:
				sequence_Specification(context, (Specification) semanticObject); 
				return; 
			case SLEECPackage.TRIGGER:
				sequence_Trigger(context, (Trigger) semanticObject); 
				return; 
			case SLEECPackage.VALUE:
				sequence_Value(context, (Value) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     MBoolExpr returns MBoolExpr
	 *     BoolComp returns MBoolExpr
	 *     BoolComp.BoolComp_1_0 returns MBoolExpr
	 *     Not returns MBoolExpr
	 *     RelComp returns MBoolExpr
	 *     RelComp.RelComp_1_0 returns MBoolExpr
	 *     Atom returns MBoolExpr
	 *
	 * Constraint:
	 *     (name=ID | value=Value)
	 */
	protected void sequence_Atom(ISerializationContext context, MBoolExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MBoolExpr returns BoolComp
	 *     BoolComp returns BoolComp
	 *     BoolComp.BoolComp_1_0 returns BoolComp
	 *     Not returns BoolComp
	 *     RelComp returns BoolComp
	 *     RelComp.RelComp_1_0 returns BoolComp
	 *     Atom returns BoolComp
	 *
	 * Constraint:
	 *     (left=BoolComp_BoolComp_1_0 op=BoolOp right=Not)
	 */
	protected void sequence_BoolComp(ISerializationContext context, BoolComp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.MBOOL_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.MBOOL_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.BOOL_COMP__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.BOOL_COMP__OP));
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.BOOL_COMP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.BOOL_COMP__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoolCompAccess().getBoolCompLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBoolCompAccess().getOpBoolOpEnumRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getBoolCompAccess().getRightNotParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Defblock returns Defblock
	 *
	 * Constraint:
	 *     definitions+=Definition+
	 */
	protected void sequence_Defblock(ISerializationContext context, Defblock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Defeater returns Defeater
	 *
	 * Constraint:
	 *     (expr=MBoolExpr response=Response?)
	 */
	protected void sequence_Defeater(ISerializationContext context, Defeater semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Constant
	 *
	 * Constraint:
	 *     (name=ConstID value=Value)
	 */
	protected void sequence_Definition(ISerializationContext context, Constant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.DEFINITION__NAME));
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefinitionAccess().getNameConstIDParserRuleCall_2_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDefinitionAccess().getValueValueParserRuleCall_2_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Event
	 *
	 * Constraint:
	 *     name=EventID
	 */
	protected void sequence_Definition(ISerializationContext context, Event semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefinitionAccess().getNameEventIDParserRuleCall_0_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Measure
	 *
	 * Constraint:
	 *     (name=MeasureID type=Type)
	 */
	protected void sequence_Definition(ISerializationContext context, Measure semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.DEFINITION__NAME));
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.MEASURE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.MEASURE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefinitionAccess().getNameMeasureIDParserRuleCall_1_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_1_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MBoolExpr returns Not
	 *     BoolComp returns Not
	 *     BoolComp.BoolComp_1_0 returns Not
	 *     Not returns Not
	 *     RelComp returns Not
	 *     RelComp.RelComp_1_0 returns Not
	 *     Atom returns Not
	 *
	 * Constraint:
	 *     left=RelComp
	 */
	protected void sequence_Not(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.MBOOL_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.MBOOL_EXPR__LEFT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotAccess().getLeftRelCompParserRuleCall_0_2_0(), semanticObject.getLeft());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MBoolExpr returns RelComp
	 *     BoolComp returns RelComp
	 *     BoolComp.BoolComp_1_0 returns RelComp
	 *     Not returns RelComp
	 *     RelComp returns RelComp
	 *     RelComp.RelComp_1_0 returns RelComp
	 *     Atom returns RelComp
	 *
	 * Constraint:
	 *     (left=RelComp_RelComp_1_0 op=RelOp right=Atom)
	 */
	protected void sequence_RelComp(ISerializationContext context, RelComp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.MBOOL_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.MBOOL_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.REL_COMP__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.REL_COMP__OP));
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.REL_COMP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.REL_COMP__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRelCompAccess().getRelCompLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRelCompAccess().getOpRelOpEnumRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getRelCompAccess().getRightAtomParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Response returns Response
	 *
	 * Constraint:
	 *     ((name=[Event|ID] (time=Value response=Response?)?) | (not?='not' name=[Event|ID] time=Value))
	 */
	protected void sequence_Response(ISerializationContext context, Response semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleBlock returns RuleBlock
	 *
	 * Constraint:
	 *     rules+=Rule+
	 */
	protected void sequence_RuleBlock(ISerializationContext context, RuleBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (name=RuleID trigger=Trigger response=Response defeaters+=Defeater*)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Specification returns Specification
	 *
	 * Constraint:
	 *     (defBlock=Defblock ruleBlock=RuleBlock)
	 */
	protected void sequence_Specification(ISerializationContext context, Specification semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.SPECIFICATION__DEF_BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.SPECIFICATION__DEF_BLOCK));
			if (transientValues.isValueTransient(semanticObject, SLEECPackage.Literals.SPECIFICATION__RULE_BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SLEECPackage.Literals.SPECIFICATION__RULE_BLOCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSpecificationAccess().getDefBlockDefblockParserRuleCall_0_0(), semanticObject.getDefBlock());
		feeder.accept(grammarAccess.getSpecificationAccess().getRuleBlockRuleBlockParserRuleCall_1_0(), semanticObject.getRuleBlock());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Trigger
	 *
	 * Constraint:
	 *     (event=[Event|ID] expr=MBoolExpr?)
	 */
	protected void sequence_Trigger(ISerializationContext context, Trigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Boolean
	 *
	 * Constraint:
	 *     {Boolean}
	 */
	protected void sequence_Type(ISerializationContext context, circus.robocalc.sleec.sLEEC.Boolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Numeric
	 *
	 * Constraint:
	 *     {Numeric}
	 */
	protected void sequence_Type(ISerializationContext context, Numeric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Scale
	 *
	 * Constraint:
	 *     (scaleParams+=ScaleParam scaleParams+=ScaleParam*)
	 */
	protected void sequence_Type(ISerializationContext context, Scale semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Value
	 *
	 * Constraint:
	 *     (int=INT | float=FLOAT | value=[Constant|ID])
	 */
	protected void sequence_Value(ISerializationContext context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
