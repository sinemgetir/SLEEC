/*
 * generated by Xtext 2.25.0
 */
grammar InternalSLEEC;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package circus.robocalc.sleec.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package circus.robocalc.sleec.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import circus.robocalc.sleec.services.SLEECGrammarAccess;

}

@parser::members {

 	private SLEECGrammarAccess grammarAccess;

    public InternalSLEECParser(TokenStream input, SLEECGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Specification";
   	}

   	@Override
   	protected SLEECGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSpecification
entryRuleSpecification returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpecificationRule()); }
	iv_ruleSpecification=ruleSpecification
	{ $current=$iv_ruleSpecification.current; }
	EOF;

// Rule Specification
ruleSpecification returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecificationAccess().getDefBlockDefblockParserRuleCall_0_0());
				}
				lv_defBlock_0_0=ruleDefblock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecificationRule());
					}
					set(
						$current,
						"defBlock",
						lv_defBlock_0_0,
						"circus.robocalc.sleec.SLEEC.Defblock");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecificationAccess().getRuleBlockRuleBlockParserRuleCall_1_0());
				}
				lv_ruleBlock_1_0=ruleRuleBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecificationRule());
					}
					set(
						$current,
						"ruleBlock",
						lv_ruleBlock_1_0,
						"circus.robocalc.sleec.SLEEC.RuleBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDefblock
entryRuleDefblock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefblockRule()); }
	iv_ruleDefblock=ruleDefblock
	{ $current=$iv_ruleDefblock.current; }
	EOF;

// Rule Defblock
ruleDefblock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='def_start'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefblockAccess().getDef_startKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefblockAccess().getDefinitionsDefinitionParserRuleCall_1_0());
				}
				lv_definitions_1_0=ruleDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefblockRule());
					}
					add(
						$current,
						"definitions",
						lv_definitions_1_0,
						"circus.robocalc.sleec.SLEEC.Definition");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='def_end'
		{
			newLeafNode(otherlv_2, grammarAccess.getDefblockAccess().getDef_endKeyword_2());
		}
	)
;

// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruleDefinition=ruleDefinition
	{ $current=$iv_ruleDefinition.current; }
	EOF;

// Rule Definition
ruleDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDefinitionAccess().getEventAction_0_0(),
						$current);
				}
			)
			otherlv_1='event'
			{
				newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getEventKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getNameEventIDParserRuleCall_0_2_0());
					}
					lv_name_2_0=ruleEventID
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"name",
							lv_name_2_0,
							"circus.robocalc.sleec.SLEEC.EventID");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDefinitionAccess().getMeasureAction_1_0(),
						$current);
				}
			)
			otherlv_4='measure'
			{
				newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getMeasureKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getNameMeasureIDParserRuleCall_1_2_0());
					}
					lv_name_5_0=ruleMeasureID
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"name",
							lv_name_5_0,
							"circus.robocalc.sleec.SLEEC.MeasureID");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=':'
			{
				newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getColonKeyword_1_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_1_4_0());
					}
					lv_type_7_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"type",
							lv_type_7_0,
							"circus.robocalc.sleec.SLEEC.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDefinitionAccess().getConstantAction_2_0(),
						$current);
				}
			)
			otherlv_9='constant'
			{
				newLeafNode(otherlv_9, grammarAccess.getDefinitionAccess().getConstantKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getNameConstIDParserRuleCall_2_2_0());
					}
					lv_name_10_0=ruleConstID
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"name",
							lv_name_10_0,
							"circus.robocalc.sleec.SLEEC.ConstID");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_11='='
			{
				newLeafNode(otherlv_11, grammarAccess.getDefinitionAccess().getEqualsSignKeyword_2_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getValueValueParserRuleCall_2_4_0());
					}
					lv_value_12_0=ruleValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"value",
							lv_value_12_0,
							"circus.robocalc.sleec.SLEEC.Value");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_int_0_0=RULE_INT
				{
					newLeafNode(lv_int_0_0, grammarAccess.getValueAccess().getIntINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueRule());
					}
					setWithLastConsumed(
						$current,
						"int",
						lv_int_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		    |
		(
			(
				lv_float_1_0=RULE_FLOAT
				{
					newLeafNode(lv_float_1_0, grammarAccess.getValueAccess().getFloatFLOATTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueRule());
					}
					setWithLastConsumed(
						$current,
						"float",
						lv_float_1_0,
						"circus.robocalc.sleec.SLEEC.FLOAT");
				}
			)
		)
		    |
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getValueAccess().getValueConstantCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getBooleanAction_0_0(),
						$current);
				}
			)
			otherlv_1='boolean'
			{
				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getBooleanKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getNumericAction_1_0(),
						$current);
				}
			)
			otherlv_3='numeric'
			{
				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getNumericKeyword_1_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getScaleAction_2_0(),
						$current);
				}
			)
			otherlv_5='scale'
			{
				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getScaleKeyword_2_1());
			}
			otherlv_6='('
			{
				newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeAccess().getScaleParamsScaleParamParserRuleCall_2_3_0());
					}
					lv_scaleParams_7_0=ruleScaleParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeRule());
						}
						add(
							$current,
							"scaleParams",
							lv_scaleParams_7_0,
							"circus.robocalc.sleec.SLEEC.ScaleParam");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getCommaKeyword_2_4_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTypeAccess().getScaleParamsScaleParamParserRuleCall_2_4_1_0());
						}
						lv_scaleParams_9_0=ruleScaleParam
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTypeRule());
							}
							add(
								$current,
								"scaleParams",
								lv_scaleParams_9_0,
								"circus.robocalc.sleec.SLEEC.ScaleParam");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_10=')'
			{
				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_5());
			}
		)
	)
;

// Entry rule entryRuleRuleBlock
entryRuleRuleBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleBlockRule()); }
	iv_ruleRuleBlock=ruleRuleBlock
	{ $current=$iv_ruleRuleBlock.current; }
	EOF;

// Rule RuleBlock
ruleRuleBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rule_start'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleBlockAccess().getRule_startKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleBlockAccess().getRulesRuleParserRuleCall_1_0());
				}
				lv_rules_1_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleBlockRule());
					}
					add(
						$current,
						"rules",
						lv_rules_1_0,
						"circus.robocalc.sleec.SLEEC.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2='rule_end'
		{
			newLeafNode(otherlv_2, grammarAccess.getRuleBlockAccess().getRule_endKeyword_2());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getNameQualifiedNameParserRuleCall_0_0());
				}
				lv_name_0_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"circus.robocalc.sleec.SLEEC.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='when'
		{
			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getWhenKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getTriggerTriggerParserRuleCall_2_0());
				}
				lv_trigger_2_0=ruleTrigger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"trigger",
						lv_trigger_2_0,
						"circus.robocalc.sleec.SLEEC.Trigger");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='then'
		{
			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getThenKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getResponseResponseParserRuleCall_4_0());
				}
				lv_response_4_0=ruleResponse
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"response",
						lv_response_4_0,
						"circus.robocalc.sleec.SLEEC.Response");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getDefeatersDefeaterParserRuleCall_5_0());
				}
				lv_defeaters_5_0=ruleDefeater
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					add(
						$current,
						"defeaters",
						lv_defeaters_5_0,
						"circus.robocalc.sleec.SLEEC.Defeater");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleTrigger
entryRuleTrigger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTriggerRule()); }
	iv_ruleTrigger=ruleTrigger
	{ $current=$iv_ruleTrigger.current; }
	EOF;

// Rule Trigger
ruleTrigger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTriggerRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getEventEventCrossReference_0_0());
				}
			)
		)
		(
			otherlv_1='and'
			{
				newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getAndKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTriggerAccess().getExprMBoolExprParserRuleCall_1_1_0());
					}
					lv_expr_2_0=ruleMBoolExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTriggerRule());
						}
						set(
							$current,
							"expr",
							lv_expr_2_0,
							"circus.robocalc.sleec.SLEEC.MBoolExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleMBoolExpr
entryRuleMBoolExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMBoolExprRule()); }
	iv_ruleMBoolExpr=ruleMBoolExpr
	{ $current=$iv_ruleMBoolExpr.current; }
	EOF;

// Rule MBoolExpr
ruleMBoolExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getMBoolExprAccess().getBoolCompParserRuleCall());
	}
	this_BoolComp_0=ruleBoolComp
	{
		$current = $this_BoolComp_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleBoolComp
entryRuleBoolComp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBoolCompRule()); }
	iv_ruleBoolComp=ruleBoolComp
	{ $current=$iv_ruleBoolComp.current; }
	EOF;

// Rule BoolComp
ruleBoolComp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getBoolCompAccess().getNotParserRuleCall_0());
		}
		this_Not_0=ruleNot
		{
			$current = $this_Not_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getBoolCompAccess().getBoolCompLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getBoolCompAccess().getOpBoolOpEnumRuleCall_1_1_0());
					}
					lv_op_2_0=ruleBoolOp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBoolCompRule());
						}
						set(
							$current,
							"op",
							lv_op_2_0,
							"circus.robocalc.sleec.SLEEC.BoolOp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getBoolCompAccess().getRightNotParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleNot
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBoolCompRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"circus.robocalc.sleec.SLEEC.Not");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleNot
entryRuleNot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNotRule()); }
	iv_ruleNot=ruleNot
	{ $current=$iv_ruleNot.current; }
	EOF;

// Rule Not
ruleNot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNotAccess().getNotAction_0_0(),
						$current);
				}
			)
			otherlv_1='not'
			{
				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNotAccess().getLeftRelCompParserRuleCall_0_2_0());
					}
					lv_left_2_0=ruleRelComp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNotRule());
						}
						set(
							$current,
							"left",
							lv_left_2_0,
							"circus.robocalc.sleec.SLEEC.RelComp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getNotAccess().getRelCompParserRuleCall_1());
		}
		this_RelComp_3=ruleRelComp
		{
			$current = $this_RelComp_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRelComp
entryRuleRelComp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelCompRule()); }
	iv_ruleRelComp=ruleRelComp
	{ $current=$iv_ruleRelComp.current; }
	EOF;

// Rule RelComp
ruleRelComp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRelCompAccess().getAtomParserRuleCall_0());
		}
		this_Atom_0=ruleAtom
		{
			$current = $this_Atom_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getRelCompAccess().getRelCompLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRelCompAccess().getOpRelOpEnumRuleCall_1_1_0());
					}
					lv_op_2_0=ruleRelOp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRelCompRule());
						}
						set(
							$current,
							"op",
							lv_op_2_0,
							"circus.robocalc.sleec.SLEEC.RelOp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRelCompAccess().getRightAtomParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAtom
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRelCompRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"circus.robocalc.sleec.SLEEC.Atom");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAtom
entryRuleAtom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomRule()); }
	iv_ruleAtom=ruleAtom
	{ $current=$iv_ruleAtom.current; }
	EOF;

// Rule Atom
ruleAtom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtomRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		    |
		(
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0());
			}
			{
				newCompositeNode(grammarAccess.getAtomAccess().getMBoolExprParserRuleCall_1_1());
			}
			this_MBoolExpr_2=ruleMBoolExpr
			{
				$current = $this_MBoolExpr_2.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_3=')'
			{
				newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2());
			}
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getAtomAccess().getValueValueParserRuleCall_2_0());
				}
				lv_value_4_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtomRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"circus.robocalc.sleec.SLEEC.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleResponse
entryRuleResponse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResponseRule()); }
	iv_ruleResponse=ruleResponse
	{ $current=$iv_ruleResponse.current; }
	EOF;

// Rule Response
ruleResponse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getResponseRule());
						}
					}
					otherlv_0=RULE_ID
					{
						newLeafNode(otherlv_0, grammarAccess.getResponseAccess().getNameEventCrossReference_0_0_0());
					}
				)
			)
			(
				otherlv_1='within'
				{
					newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getWithinKeyword_0_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getResponseAccess().getTimeValueParserRuleCall_0_1_1_0());
						}
						lv_time_2_0=ruleValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getResponseRule());
							}
							set(
								$current,
								"time",
								lv_time_2_0,
								"circus.robocalc.sleec.SLEEC.Value");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_3='otherwise'
					{
						newLeafNode(otherlv_3, grammarAccess.getResponseAccess().getOtherwiseKeyword_0_1_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getResponseAccess().getResponseResponseParserRuleCall_0_1_2_1_0());
							}
							lv_response_4_0=ruleResponse
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getResponseRule());
								}
								set(
									$current,
									"response",
									lv_response_4_0,
									"circus.robocalc.sleec.SLEEC.Response");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)?
			)?
		)
		    |
		(
			(
				(
					lv_not_5_0='not'
					{
						newLeafNode(lv_not_5_0, grammarAccess.getResponseAccess().getNotNotKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getResponseRule());
						}
						setWithLastConsumed($current, "not", lv_not_5_0 != null, "not");
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getResponseRule());
						}
					}
					otherlv_6=RULE_ID
					{
						newLeafNode(otherlv_6, grammarAccess.getResponseAccess().getNameEventCrossReference_1_1_0());
					}
				)
			)
			otherlv_7='within'
			{
				newLeafNode(otherlv_7, grammarAccess.getResponseAccess().getWithinKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getResponseAccess().getTimeValueParserRuleCall_1_3_0());
					}
					lv_time_8_0=ruleValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getResponseRule());
						}
						set(
							$current,
							"time",
							lv_time_8_0,
							"circus.robocalc.sleec.SLEEC.Value");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleDefeater
entryRuleDefeater returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefeaterRule()); }
	iv_ruleDefeater=ruleDefeater
	{ $current=$iv_ruleDefeater.current; }
	EOF;

// Rule Defeater
ruleDefeater returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='unless'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefeaterAccess().getUnlessKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefeaterAccess().getExprMBoolExprParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleMBoolExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefeaterRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"circus.robocalc.sleec.SLEEC.MBoolExpr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='then'
			{
				newLeafNode(otherlv_2, grammarAccess.getDefeaterAccess().getThenKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefeaterAccess().getResponseResponseParserRuleCall_2_1_0());
					}
					lv_response_3_0=ruleResponse
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefeaterRule());
						}
						set(
							$current,
							"response",
							lv_response_3_0,
							"circus.robocalc.sleec.SLEEC.Response");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleEventID
entryRuleEventID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEventIDRule()); }
	iv_ruleEventID=ruleEventID
	{ $current=$iv_ruleEventID.current.getText(); }
	EOF;

// Rule EventID
ruleEventID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getEventIDAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleMeasureID
entryRuleMeasureID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMeasureIDRule()); }
	iv_ruleMeasureID=ruleMeasureID
	{ $current=$iv_ruleMeasureID.current.getText(); }
	EOF;

// Rule MeasureID
ruleMeasureID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getMeasureIDAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleConstID
entryRuleConstID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getConstIDRule()); }
	iv_ruleConstID=ruleConstID
	{ $current=$iv_ruleConstID.current.getText(); }
	EOF;

// Rule ConstID
ruleConstID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getConstIDAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleScaleParam
entryRuleScaleParam returns [String current=null]:
	{ newCompositeNode(grammarAccess.getScaleParamRule()); }
	iv_ruleScaleParam=ruleScaleParam
	{ $current=$iv_ruleScaleParam.current.getText(); }
	EOF;

// Rule ScaleParam
ruleScaleParam returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getScaleParamAccess().getIDTerminalRuleCall());
	}
;

// Rule RelOp
ruleRelOp returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='<'
			{
				$current = grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='>'
			{
				$current = grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='<>'
			{
				$current = grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='<='
			{
				$current = grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='>='
			{
				$current = grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='='
			{
				$current = grammarAccess.getRelOpAccess().getEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getRelOpAccess().getEQUALEnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule BoolOp
ruleBoolOp returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='and'
			{
				$current = grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='or'
			{
				$current = grammarAccess.getBoolOpAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getBoolOpAccess().getOREnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_FLOAT : RULE_INT '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
