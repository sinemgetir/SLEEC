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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSLEECParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def_start'", "'def_end'", "'event'", "'measure'", "':'", "'constant'", "'='", "'boolean'", "'numeric'", "'scale'", "'('", "','", "')'", "'rule_start'", "'rule_end'", "'when'", "'then'", "'and'", "'not'", "'within'", "'otherwise'", "'unless'", "'<'", "'>'", "'<>'", "'<='", "'>='", "'or'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", "'months'", "'years'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSLEECParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSLEECParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSLEECParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSLEEC.g"; }



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




    // $ANTLR start "entryRuleSpecification"
    // InternalSLEEC.g:65:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalSLEEC.g:65:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalSLEEC.g:66:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalSLEEC.g:72:1: ruleSpecification returns [EObject current=null] : ( ( (lv_defBlock_0_0= ruleDefblock ) ) ( (lv_ruleBlock_1_0= ruleRuleBlock ) ) ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_defBlock_0_0 = null;

        EObject lv_ruleBlock_1_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:78:2: ( ( ( (lv_defBlock_0_0= ruleDefblock ) ) ( (lv_ruleBlock_1_0= ruleRuleBlock ) ) ) )
            // InternalSLEEC.g:79:2: ( ( (lv_defBlock_0_0= ruleDefblock ) ) ( (lv_ruleBlock_1_0= ruleRuleBlock ) ) )
            {
            // InternalSLEEC.g:79:2: ( ( (lv_defBlock_0_0= ruleDefblock ) ) ( (lv_ruleBlock_1_0= ruleRuleBlock ) ) )
            // InternalSLEEC.g:80:3: ( (lv_defBlock_0_0= ruleDefblock ) ) ( (lv_ruleBlock_1_0= ruleRuleBlock ) )
            {
            // InternalSLEEC.g:80:3: ( (lv_defBlock_0_0= ruleDefblock ) )
            // InternalSLEEC.g:81:4: (lv_defBlock_0_0= ruleDefblock )
            {
            // InternalSLEEC.g:81:4: (lv_defBlock_0_0= ruleDefblock )
            // InternalSLEEC.g:82:5: lv_defBlock_0_0= ruleDefblock
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getDefBlockDefblockParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_defBlock_0_0=ruleDefblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            					}
            					set(
            						current,
            						"defBlock",
            						lv_defBlock_0_0,
            						"circus.robocalc.sleec.SLEEC.Defblock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSLEEC.g:99:3: ( (lv_ruleBlock_1_0= ruleRuleBlock ) )
            // InternalSLEEC.g:100:4: (lv_ruleBlock_1_0= ruleRuleBlock )
            {
            // InternalSLEEC.g:100:4: (lv_ruleBlock_1_0= ruleRuleBlock )
            // InternalSLEEC.g:101:5: lv_ruleBlock_1_0= ruleRuleBlock
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getRuleBlockRuleBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ruleBlock_1_0=ruleRuleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            					}
            					set(
            						current,
            						"ruleBlock",
            						lv_ruleBlock_1_0,
            						"circus.robocalc.sleec.SLEEC.RuleBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleDefblock"
    // InternalSLEEC.g:122:1: entryRuleDefblock returns [EObject current=null] : iv_ruleDefblock= ruleDefblock EOF ;
    public final EObject entryRuleDefblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefblock = null;


        try {
            // InternalSLEEC.g:122:49: (iv_ruleDefblock= ruleDefblock EOF )
            // InternalSLEEC.g:123:2: iv_ruleDefblock= ruleDefblock EOF
            {
             newCompositeNode(grammarAccess.getDefblockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefblock=ruleDefblock();

            state._fsp--;

             current =iv_ruleDefblock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefblock"


    // $ANTLR start "ruleDefblock"
    // InternalSLEEC.g:129:1: ruleDefblock returns [EObject current=null] : (otherlv_0= 'def_start' ( (lv_definitions_1_0= ruleDefinition ) )+ otherlv_2= 'def_end' ) ;
    public final EObject ruleDefblock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_definitions_1_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:135:2: ( (otherlv_0= 'def_start' ( (lv_definitions_1_0= ruleDefinition ) )+ otherlv_2= 'def_end' ) )
            // InternalSLEEC.g:136:2: (otherlv_0= 'def_start' ( (lv_definitions_1_0= ruleDefinition ) )+ otherlv_2= 'def_end' )
            {
            // InternalSLEEC.g:136:2: (otherlv_0= 'def_start' ( (lv_definitions_1_0= ruleDefinition ) )+ otherlv_2= 'def_end' )
            // InternalSLEEC.g:137:3: otherlv_0= 'def_start' ( (lv_definitions_1_0= ruleDefinition ) )+ otherlv_2= 'def_end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefblockAccess().getDef_startKeyword_0());
            		
            // InternalSLEEC.g:141:3: ( (lv_definitions_1_0= ruleDefinition ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSLEEC.g:142:4: (lv_definitions_1_0= ruleDefinition )
            	    {
            	    // InternalSLEEC.g:142:4: (lv_definitions_1_0= ruleDefinition )
            	    // InternalSLEEC.g:143:5: lv_definitions_1_0= ruleDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getDefblockAccess().getDefinitionsDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_definitions_1_0=ruleDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDefblockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"definitions",
            	    						lv_definitions_1_0,
            	    						"circus.robocalc.sleec.SLEEC.Definition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDefblockAccess().getDef_endKeyword_2());
            		

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
    // $ANTLR end "ruleDefblock"


    // $ANTLR start "entryRuleDefinition"
    // InternalSLEEC.g:168:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalSLEEC.g:168:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalSLEEC.g:169:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalSLEEC.g:175:1: ruleDefinition returns [EObject current=null] : ( ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'measure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) ) | ( () otherlv_9= 'constant' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        EObject lv_type_7_0 = null;

        AntlrDatatypeRuleToken lv_value_12_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:181:2: ( ( ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'measure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) ) | ( () otherlv_9= 'constant' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) ) ) ) )
            // InternalSLEEC.g:182:2: ( ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'measure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) ) | ( () otherlv_9= 'constant' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) ) ) )
            {
            // InternalSLEEC.g:182:2: ( ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'measure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) ) | ( () otherlv_9= 'constant' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSLEEC.g:183:3: ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // InternalSLEEC.g:183:3: ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) )
                    // InternalSLEEC.g:184:4: () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalSLEEC.g:184:4: ()
                    // InternalSLEEC.g:185:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getEventAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getEventKeyword_0_1());
                    			
                    // InternalSLEEC.g:195:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalSLEEC.g:196:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalSLEEC.g:196:5: (lv_name_2_0= RULE_ID )
                    // InternalSLEEC.g:197:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:215:3: ( () otherlv_4= 'measure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) )
                    {
                    // InternalSLEEC.g:215:3: ( () otherlv_4= 'measure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) ) )
                    // InternalSLEEC.g:216:4: () otherlv_4= 'measure' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_type_7_0= ruleType ) )
                    {
                    // InternalSLEEC.g:216:4: ()
                    // InternalSLEEC.g:217:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getMeasureAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getMeasureKeyword_1_1());
                    			
                    // InternalSLEEC.g:227:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalSLEEC.g:228:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalSLEEC.g:228:5: (lv_name_5_0= RULE_ID )
                    // InternalSLEEC.g:229:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getColonKeyword_1_3());
                    			
                    // InternalSLEEC.g:249:4: ( (lv_type_7_0= ruleType ) )
                    // InternalSLEEC.g:250:5: (lv_type_7_0= ruleType )
                    {
                    // InternalSLEEC.g:250:5: (lv_type_7_0= ruleType )
                    // InternalSLEEC.g:251:6: lv_type_7_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getTypeTypeParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_7_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"circus.robocalc.sleec.SLEEC.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:270:3: ( () otherlv_9= 'constant' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) ) )
                    {
                    // InternalSLEEC.g:270:3: ( () otherlv_9= 'constant' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) ) )
                    // InternalSLEEC.g:271:4: () otherlv_9= 'constant' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_value_12_0= ruleValue ) )
                    {
                    // InternalSLEEC.g:271:4: ()
                    // InternalSLEEC.g:272:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefinitionAccess().getConstAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getDefinitionAccess().getConstantKeyword_2_1());
                    			
                    // InternalSLEEC.g:282:4: ( (lv_name_10_0= RULE_ID ) )
                    // InternalSLEEC.g:283:5: (lv_name_10_0= RULE_ID )
                    {
                    // InternalSLEEC.g:283:5: (lv_name_10_0= RULE_ID )
                    // InternalSLEEC.g:284:6: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_10_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getDefinitionAccess().getEqualsSignKeyword_2_3());
                    			
                    // InternalSLEEC.g:304:4: ( (lv_value_12_0= ruleValue ) )
                    // InternalSLEEC.g:305:5: (lv_value_12_0= ruleValue )
                    {
                    // InternalSLEEC.g:305:5: (lv_value_12_0= ruleValue )
                    // InternalSLEEC.g:306:6: lv_value_12_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getValueValueParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_12_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_12_0,
                    							"circus.robocalc.sleec.SLEEC.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleValue"
    // InternalSLEEC.g:328:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalSLEEC.g:328:45: (iv_ruleValue= ruleValue EOF )
            // InternalSLEEC.g:329:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalSLEEC.g:335:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSLEEC.g:341:2: (this_INT_0= RULE_INT )
            // InternalSLEEC.g:342:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleType"
    // InternalSLEEC.g:352:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSLEEC.g:352:45: (iv_ruleType= ruleType EOF )
            // InternalSLEEC.g:353:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSLEEC.g:359:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_scaleParams_7_0 = null;

        AntlrDatatypeRuleToken lv_scaleParams_9_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:365:2: ( ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')' ) ) )
            // InternalSLEEC.g:366:2: ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')' ) )
            {
            // InternalSLEEC.g:366:2: ( ( () otherlv_1= 'boolean' ) | ( () otherlv_3= 'numeric' ) | ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSLEEC.g:367:3: ( () otherlv_1= 'boolean' )
                    {
                    // InternalSLEEC.g:367:3: ( () otherlv_1= 'boolean' )
                    // InternalSLEEC.g:368:4: () otherlv_1= 'boolean'
                    {
                    // InternalSLEEC.g:368:4: ()
                    // InternalSLEEC.g:369:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getBooleanAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getBooleanKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:381:3: ( () otherlv_3= 'numeric' )
                    {
                    // InternalSLEEC.g:381:3: ( () otherlv_3= 'numeric' )
                    // InternalSLEEC.g:382:4: () otherlv_3= 'numeric'
                    {
                    // InternalSLEEC.g:382:4: ()
                    // InternalSLEEC.g:383:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getNumericAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getNumericKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:395:3: ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')' )
                    {
                    // InternalSLEEC.g:395:3: ( () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')' )
                    // InternalSLEEC.g:396:4: () otherlv_5= 'scale' otherlv_6= '(' ( (lv_scaleParams_7_0= ruleLiteral ) ) (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )* otherlv_10= ')'
                    {
                    // InternalSLEEC.g:396:4: ()
                    // InternalSLEEC.g:397:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getScaleAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getScaleKeyword_2_1());
                    			
                    otherlv_6=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalSLEEC.g:411:4: ( (lv_scaleParams_7_0= ruleLiteral ) )
                    // InternalSLEEC.g:412:5: (lv_scaleParams_7_0= ruleLiteral )
                    {
                    // InternalSLEEC.g:412:5: (lv_scaleParams_7_0= ruleLiteral )
                    // InternalSLEEC.g:413:6: lv_scaleParams_7_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getScaleParamsLiteralParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_scaleParams_7_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						add(
                    							current,
                    							"scaleParams",
                    							lv_scaleParams_7_0,
                    							"circus.robocalc.sleec.SLEEC.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSLEEC.g:430:4: (otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==22) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSLEEC.g:431:5: otherlv_8= ',' ( (lv_scaleParams_9_0= ruleLiteral ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FOLLOW_6); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getCommaKeyword_2_4_0());
                    	    				
                    	    // InternalSLEEC.g:435:5: ( (lv_scaleParams_9_0= ruleLiteral ) )
                    	    // InternalSLEEC.g:436:6: (lv_scaleParams_9_0= ruleLiteral )
                    	    {
                    	    // InternalSLEEC.g:436:6: (lv_scaleParams_9_0= ruleLiteral )
                    	    // InternalSLEEC.g:437:7: lv_scaleParams_9_0= ruleLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getTypeAccess().getScaleParamsLiteralParserRuleCall_2_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_scaleParams_9_0=ruleLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"scaleParams",
                    	    								lv_scaleParams_9_0,
                    	    								"circus.robocalc.sleec.SLEEC.Literal");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_5());
                    			

                    }


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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLiteral"
    // InternalSLEEC.g:464:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalSLEEC.g:464:47: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalSLEEC.g:465:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalSLEEC.g:471:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSLEEC.g:477:2: (this_ID_0= RULE_ID )
            // InternalSLEEC.g:478:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getLiteralAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleRuleBlock"
    // InternalSLEEC.g:488:1: entryRuleRuleBlock returns [EObject current=null] : iv_ruleRuleBlock= ruleRuleBlock EOF ;
    public final EObject entryRuleRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBlock = null;


        try {
            // InternalSLEEC.g:488:50: (iv_ruleRuleBlock= ruleRuleBlock EOF )
            // InternalSLEEC.g:489:2: iv_ruleRuleBlock= ruleRuleBlock EOF
            {
             newCompositeNode(grammarAccess.getRuleBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleBlock=ruleRuleBlock();

            state._fsp--;

             current =iv_ruleRuleBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRuleBlock"


    // $ANTLR start "ruleRuleBlock"
    // InternalSLEEC.g:495:1: ruleRuleBlock returns [EObject current=null] : (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' ) ;
    public final EObject ruleRuleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:501:2: ( (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' ) )
            // InternalSLEEC.g:502:2: (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' )
            {
            // InternalSLEEC.g:502:2: (otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end' )
            // InternalSLEEC.g:503:3: otherlv_0= 'rule_start' ( (lv_rules_1_0= ruleRule ) )+ otherlv_2= 'rule_end'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleBlockAccess().getRule_startKeyword_0());
            		
            // InternalSLEEC.g:507:3: ( (lv_rules_1_0= ruleRule ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSLEEC.g:508:4: (lv_rules_1_0= ruleRule )
            	    {
            	    // InternalSLEEC.g:508:4: (lv_rules_1_0= ruleRule )
            	    // InternalSLEEC.g:509:5: lv_rules_1_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getRuleBlockAccess().getRulesRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_rules_1_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_1_0,
            	    						"circus.robocalc.sleec.SLEEC.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleBlockAccess().getRule_endKeyword_2());
            		

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
    // $ANTLR end "ruleRuleBlock"


    // $ANTLR start "entryRuleRule"
    // InternalSLEEC.g:534:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalSLEEC.g:534:45: (iv_ruleRule= ruleRule EOF )
            // InternalSLEEC.g:535:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalSLEEC.g:541:1: ruleRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_trigger_2_0 = null;

        EObject lv_response_4_0 = null;

        EObject lv_defeaters_5_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:547:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* ) )
            // InternalSLEEC.g:548:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* )
            {
            // InternalSLEEC.g:548:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )* )
            // InternalSLEEC.g:549:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'when' ( (lv_trigger_2_0= ruleTrigger ) ) otherlv_3= 'then' ( (lv_response_4_0= ruleResponse ) ) ( (lv_defeaters_5_0= ruleDefeater ) )*
            {
            // InternalSLEEC.g:549:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSLEEC.g:550:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSLEEC.g:550:4: (lv_name_0_0= RULE_ID )
            // InternalSLEEC.g:551:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getWhenKeyword_1());
            		
            // InternalSLEEC.g:571:3: ( (lv_trigger_2_0= ruleTrigger ) )
            // InternalSLEEC.g:572:4: (lv_trigger_2_0= ruleTrigger )
            {
            // InternalSLEEC.g:572:4: (lv_trigger_2_0= ruleTrigger )
            // InternalSLEEC.g:573:5: lv_trigger_2_0= ruleTrigger
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getTriggerTriggerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_trigger_2_0=ruleTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_2_0,
            						"circus.robocalc.sleec.SLEEC.Trigger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getThenKeyword_3());
            		
            // InternalSLEEC.g:594:3: ( (lv_response_4_0= ruleResponse ) )
            // InternalSLEEC.g:595:4: (lv_response_4_0= ruleResponse )
            {
            // InternalSLEEC.g:595:4: (lv_response_4_0= ruleResponse )
            // InternalSLEEC.g:596:5: lv_response_4_0= ruleResponse
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getResponseResponseParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_response_4_0=ruleResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"response",
            						lv_response_4_0,
            						"circus.robocalc.sleec.SLEEC.Response");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSLEEC.g:613:3: ( (lv_defeaters_5_0= ruleDefeater ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==32) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSLEEC.g:614:4: (lv_defeaters_5_0= ruleDefeater )
            	    {
            	    // InternalSLEEC.g:614:4: (lv_defeaters_5_0= ruleDefeater )
            	    // InternalSLEEC.g:615:5: lv_defeaters_5_0= ruleDefeater
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getDefeatersDefeaterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_defeaters_5_0=ruleDefeater();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"defeaters",
            	    						lv_defeaters_5_0,
            	    						"circus.robocalc.sleec.SLEEC.Defeater");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleTrigger"
    // InternalSLEEC.g:636:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalSLEEC.g:636:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalSLEEC.g:637:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalSLEEC.g:643:1: ruleTrigger returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:649:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? ) )
            // InternalSLEEC.g:650:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? )
            {
            // InternalSLEEC.g:650:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )? )
            // InternalSLEEC.g:651:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )?
            {
            // InternalSLEEC.g:651:3: ( (otherlv_0= RULE_ID ) )
            // InternalSLEEC.g:652:4: (otherlv_0= RULE_ID )
            {
            // InternalSLEEC.g:652:4: (otherlv_0= RULE_ID )
            // InternalSLEEC.g:653:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            // InternalSLEEC.g:664:3: (otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSLEEC.g:665:4: otherlv_1= 'and' ( (lv_expr_2_0= ruleMBoolExpr ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getAndKeyword_1_0());
                    			
                    // InternalSLEEC.g:669:4: ( (lv_expr_2_0= ruleMBoolExpr ) )
                    // InternalSLEEC.g:670:5: (lv_expr_2_0= ruleMBoolExpr )
                    {
                    // InternalSLEEC.g:670:5: (lv_expr_2_0= ruleMBoolExpr )
                    // InternalSLEEC.g:671:6: lv_expr_2_0= ruleMBoolExpr
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getExprMBoolExprParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleMBoolExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriggerRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_2_0,
                    							"circus.robocalc.sleec.SLEEC.MBoolExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleMBoolExpr"
    // InternalSLEEC.g:693:1: entryRuleMBoolExpr returns [EObject current=null] : iv_ruleMBoolExpr= ruleMBoolExpr EOF ;
    public final EObject entryRuleMBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMBoolExpr = null;


        try {
            // InternalSLEEC.g:693:50: (iv_ruleMBoolExpr= ruleMBoolExpr EOF )
            // InternalSLEEC.g:694:2: iv_ruleMBoolExpr= ruleMBoolExpr EOF
            {
             newCompositeNode(grammarAccess.getMBoolExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMBoolExpr=ruleMBoolExpr();

            state._fsp--;

             current =iv_ruleMBoolExpr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMBoolExpr"


    // $ANTLR start "ruleMBoolExpr"
    // InternalSLEEC.g:700:1: ruleMBoolExpr returns [EObject current=null] : this_BoolComp_0= ruleBoolComp ;
    public final EObject ruleMBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject this_BoolComp_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:706:2: (this_BoolComp_0= ruleBoolComp )
            // InternalSLEEC.g:707:2: this_BoolComp_0= ruleBoolComp
            {

            		newCompositeNode(grammarAccess.getMBoolExprAccess().getBoolCompParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BoolComp_0=ruleBoolComp();

            state._fsp--;


            		current = this_BoolComp_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleMBoolExpr"


    // $ANTLR start "entryRuleBoolComp"
    // InternalSLEEC.g:718:1: entryRuleBoolComp returns [EObject current=null] : iv_ruleBoolComp= ruleBoolComp EOF ;
    public final EObject entryRuleBoolComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolComp = null;


        try {
            // InternalSLEEC.g:718:49: (iv_ruleBoolComp= ruleBoolComp EOF )
            // InternalSLEEC.g:719:2: iv_ruleBoolComp= ruleBoolComp EOF
            {
             newCompositeNode(grammarAccess.getBoolCompRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolComp=ruleBoolComp();

            state._fsp--;

             current =iv_ruleBoolComp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoolComp"


    // $ANTLR start "ruleBoolComp"
    // InternalSLEEC.g:725:1: ruleBoolComp returns [EObject current=null] : (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* ) ;
    public final EObject ruleBoolComp() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:731:2: ( (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* ) )
            // InternalSLEEC.g:732:2: (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* )
            {
            // InternalSLEEC.g:732:2: (this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )* )
            // InternalSLEEC.g:733:3: this_Not_0= ruleNot ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )*
            {

            			newCompositeNode(grammarAccess.getBoolCompAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSLEEC.g:741:3: ( () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28||LA8_0==38) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSLEEC.g:742:4: () ( (lv_op_2_0= ruleBoolOp ) ) ( (lv_right_3_0= ruleNot ) )
            	    {
            	    // InternalSLEEC.g:742:4: ()
            	    // InternalSLEEC.g:743:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBoolCompAccess().getBoolCompLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSLEEC.g:749:4: ( (lv_op_2_0= ruleBoolOp ) )
            	    // InternalSLEEC.g:750:5: (lv_op_2_0= ruleBoolOp )
            	    {
            	    // InternalSLEEC.g:750:5: (lv_op_2_0= ruleBoolOp )
            	    // InternalSLEEC.g:751:6: lv_op_2_0= ruleBoolOp
            	    {

            	    						newCompositeNode(grammarAccess.getBoolCompAccess().getOpBoolOpEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_op_2_0=ruleBoolOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoolCompRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"circus.robocalc.sleec.SLEEC.BoolOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalSLEEC.g:768:4: ( (lv_right_3_0= ruleNot ) )
            	    // InternalSLEEC.g:769:5: (lv_right_3_0= ruleNot )
            	    {
            	    // InternalSLEEC.g:769:5: (lv_right_3_0= ruleNot )
            	    // InternalSLEEC.g:770:6: lv_right_3_0= ruleNot
            	    {

            	    						newCompositeNode(grammarAccess.getBoolCompAccess().getRightNotParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleNot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBoolCompRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"circus.robocalc.sleec.SLEEC.Not");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleBoolComp"


    // $ANTLR start "entryRuleNot"
    // InternalSLEEC.g:792:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalSLEEC.g:792:44: (iv_ruleNot= ruleNot EOF )
            // InternalSLEEC.g:793:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalSLEEC.g:799:1: ruleNot returns [EObject current=null] : ( ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_2_0 = null;

        EObject this_RelComp_3 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:805:2: ( ( ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp ) )
            // InternalSLEEC.g:806:2: ( ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp )
            {
            // InternalSLEEC.g:806:2: ( ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) ) | this_RelComp_3= ruleRelComp )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSLEEC.g:807:3: ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) )
                    {
                    // InternalSLEEC.g:807:3: ( () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) ) )
                    // InternalSLEEC.g:808:4: () otherlv_1= 'not' ( (lv_left_2_0= ruleRelComp ) )
                    {
                    // InternalSLEEC.g:808:4: ()
                    // InternalSLEEC.g:809:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotKeyword_0_1());
                    			
                    // InternalSLEEC.g:819:4: ( (lv_left_2_0= ruleRelComp ) )
                    // InternalSLEEC.g:820:5: (lv_left_2_0= ruleRelComp )
                    {
                    // InternalSLEEC.g:820:5: (lv_left_2_0= ruleRelComp )
                    // InternalSLEEC.g:821:6: lv_left_2_0= ruleRelComp
                    {

                    						newCompositeNode(grammarAccess.getNotAccess().getLeftRelCompParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_left_2_0=ruleRelComp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_2_0,
                    							"circus.robocalc.sleec.SLEEC.RelComp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:840:3: this_RelComp_3= ruleRelComp
                    {

                    			newCompositeNode(grammarAccess.getNotAccess().getRelCompParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelComp_3=ruleRelComp();

                    state._fsp--;


                    			current = this_RelComp_3;
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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleRelComp"
    // InternalSLEEC.g:852:1: entryRuleRelComp returns [EObject current=null] : iv_ruleRelComp= ruleRelComp EOF ;
    public final EObject entryRuleRelComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelComp = null;


        try {
            // InternalSLEEC.g:852:48: (iv_ruleRelComp= ruleRelComp EOF )
            // InternalSLEEC.g:853:2: iv_ruleRelComp= ruleRelComp EOF
            {
             newCompositeNode(grammarAccess.getRelCompRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelComp=ruleRelComp();

            state._fsp--;

             current =iv_ruleRelComp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelComp"


    // $ANTLR start "ruleRelComp"
    // InternalSLEEC.g:859:1: ruleRelComp returns [EObject current=null] : (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleRelComp() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:865:2: ( (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // InternalSLEEC.g:866:2: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // InternalSLEEC.g:866:2: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            // InternalSLEEC.g:867:3: this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelCompAccess().getAtomParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Atom_0=ruleAtom();

            state._fsp--;


            			current = this_Atom_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSLEEC.g:875:3: ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17||(LA10_0>=33 && LA10_0<=37)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSLEEC.g:876:4: () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // InternalSLEEC.g:876:4: ()
            	    // InternalSLEEC.g:877:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelCompAccess().getRelCompLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSLEEC.g:883:4: ( (lv_op_2_0= ruleRelOp ) )
            	    // InternalSLEEC.g:884:5: (lv_op_2_0= ruleRelOp )
            	    {
            	    // InternalSLEEC.g:884:5: (lv_op_2_0= ruleRelOp )
            	    // InternalSLEEC.g:885:6: lv_op_2_0= ruleRelOp
            	    {

            	    						newCompositeNode(grammarAccess.getRelCompAccess().getOpRelOpEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_op_2_0=ruleRelOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelCompRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"circus.robocalc.sleec.SLEEC.RelOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalSLEEC.g:902:4: ( (lv_right_3_0= ruleAtom ) )
            	    // InternalSLEEC.g:903:5: (lv_right_3_0= ruleAtom )
            	    {
            	    // InternalSLEEC.g:903:5: (lv_right_3_0= ruleAtom )
            	    // InternalSLEEC.g:904:6: lv_right_3_0= ruleAtom
            	    {

            	    						newCompositeNode(grammarAccess.getRelCompAccess().getRightAtomParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleAtom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelCompRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"circus.robocalc.sleec.SLEEC.Atom");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleRelComp"


    // $ANTLR start "entryRuleAtom"
    // InternalSLEEC.g:926:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalSLEEC.g:926:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalSLEEC.g:927:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSLEEC.g:933:1: ruleAtom returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_MBoolExpr_2 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:939:2: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' ) ) )
            // InternalSLEEC.g:940:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' ) )
            {
            // InternalSLEEC.g:940:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSLEEC.g:941:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalSLEEC.g:941:3: ( (otherlv_0= RULE_ID ) )
                    // InternalSLEEC.g:942:4: (otherlv_0= RULE_ID )
                    {
                    // InternalSLEEC.g:942:4: (otherlv_0= RULE_ID )
                    // InternalSLEEC.g:943:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getAtomAccess().getMeasureMeasureCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:955:3: (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' )
                    {
                    // InternalSLEEC.g:955:3: (otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')' )
                    // InternalSLEEC.g:956:4: otherlv_1= '(' this_MBoolExpr_2= ruleMBoolExpr otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomAccess().getMBoolExprParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_22);
                    this_MBoolExpr_2=ruleMBoolExpr();

                    state._fsp--;


                    				current = this_MBoolExpr_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleResponse"
    // InternalSLEEC.g:977:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalSLEEC.g:977:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalSLEEC.g:978:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalSLEEC.g:984:1: ruleResponse returns [EObject current=null] : ( ( (lv_not_0_0= 'not' ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'within' ( (lv_time_3_0= ruleTime ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )? ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_time_3_0 = null;

        EObject lv_response_5_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:990:2: ( ( ( (lv_not_0_0= 'not' ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'within' ( (lv_time_3_0= ruleTime ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )? ) )
            // InternalSLEEC.g:991:2: ( ( (lv_not_0_0= 'not' ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'within' ( (lv_time_3_0= ruleTime ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )? )
            {
            // InternalSLEEC.g:991:2: ( ( (lv_not_0_0= 'not' ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'within' ( (lv_time_3_0= ruleTime ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )? )
            // InternalSLEEC.g:992:3: ( (lv_not_0_0= 'not' ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'within' ( (lv_time_3_0= ruleTime ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )?
            {
            // InternalSLEEC.g:992:3: ( (lv_not_0_0= 'not' ) )
            // InternalSLEEC.g:993:4: (lv_not_0_0= 'not' )
            {
            // InternalSLEEC.g:993:4: (lv_not_0_0= 'not' )
            // InternalSLEEC.g:994:5: lv_not_0_0= 'not'
            {
            lv_not_0_0=(Token)match(input,29,FOLLOW_6); 

            					newLeafNode(lv_not_0_0, grammarAccess.getResponseAccess().getNotNotKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResponseRule());
            					}
            					setWithLastConsumed(current, "not", lv_not_0_0 != null, "not");
            				

            }


            }

            // InternalSLEEC.g:1006:3: ( (otherlv_1= RULE_ID ) )
            // InternalSLEEC.g:1007:4: (otherlv_1= RULE_ID )
            {
            // InternalSLEEC.g:1007:4: (otherlv_1= RULE_ID )
            // InternalSLEEC.g:1008:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResponseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getEventEventCrossReference_1_0());
            				

            }


            }

            // InternalSLEEC.g:1019:3: (otherlv_2= 'within' ( (lv_time_3_0= ruleTime ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSLEEC.g:1020:4: otherlv_2= 'within' ( (lv_time_3_0= ruleTime ) ) (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )?
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getResponseAccess().getWithinKeyword_2_0());
                    			
                    // InternalSLEEC.g:1024:4: ( (lv_time_3_0= ruleTime ) )
                    // InternalSLEEC.g:1025:5: (lv_time_3_0= ruleTime )
                    {
                    // InternalSLEEC.g:1025:5: (lv_time_3_0= ruleTime )
                    // InternalSLEEC.g:1026:6: lv_time_3_0= ruleTime
                    {

                    						newCompositeNode(grammarAccess.getResponseAccess().getTimeTimeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_time_3_0=ruleTime();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResponseRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_3_0,
                    							"circus.robocalc.sleec.SLEEC.Time");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSLEEC.g:1043:4: (otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==31) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalSLEEC.g:1044:5: otherlv_4= 'otherwise' ( (lv_response_5_0= ruleResponse ) )
                            {
                            otherlv_4=(Token)match(input,31,FOLLOW_16); 

                            					newLeafNode(otherlv_4, grammarAccess.getResponseAccess().getOtherwiseKeyword_2_2_0());
                            				
                            // InternalSLEEC.g:1048:5: ( (lv_response_5_0= ruleResponse ) )
                            // InternalSLEEC.g:1049:6: (lv_response_5_0= ruleResponse )
                            {
                            // InternalSLEEC.g:1049:6: (lv_response_5_0= ruleResponse )
                            // InternalSLEEC.g:1050:7: lv_response_5_0= ruleResponse
                            {

                            							newCompositeNode(grammarAccess.getResponseAccess().getResponseResponseParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_response_5_0=ruleResponse();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getResponseRule());
                            							}
                            							set(
                            								current,
                            								"response",
                            								lv_response_5_0,
                            								"circus.robocalc.sleec.SLEEC.Response");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleTime"
    // InternalSLEEC.g:1073:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalSLEEC.g:1073:45: (iv_ruleTime= ruleTime EOF )
            // InternalSLEEC.g:1074:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalSLEEC.g:1080:1: ruleTime returns [EObject current=null] : ( ( (lv_value_0_0= ruleValue ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:1086:2: ( ( ( (lv_value_0_0= ruleValue ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) )
            // InternalSLEEC.g:1087:2: ( ( (lv_value_0_0= ruleValue ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            {
            // InternalSLEEC.g:1087:2: ( ( (lv_value_0_0= ruleValue ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            // InternalSLEEC.g:1088:3: ( (lv_value_0_0= ruleValue ) ) ( (lv_unit_1_0= ruleTimeUnit ) )
            {
            // InternalSLEEC.g:1088:3: ( (lv_value_0_0= ruleValue ) )
            // InternalSLEEC.g:1089:4: (lv_value_0_0= ruleValue )
            {
            // InternalSLEEC.g:1089:4: (lv_value_0_0= ruleValue )
            // InternalSLEEC.g:1090:5: lv_value_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getTimeAccess().getValueValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_value_0_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"circus.robocalc.sleec.SLEEC.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSLEEC.g:1107:3: ( (lv_unit_1_0= ruleTimeUnit ) )
            // InternalSLEEC.g:1108:4: (lv_unit_1_0= ruleTimeUnit )
            {
            // InternalSLEEC.g:1108:4: (lv_unit_1_0= ruleTimeUnit )
            // InternalSLEEC.g:1109:5: lv_unit_1_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getTimeAccess().getUnitTimeUnitEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_1_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_1_0,
            						"circus.robocalc.sleec.SLEEC.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleDefeater"
    // InternalSLEEC.g:1130:1: entryRuleDefeater returns [EObject current=null] : iv_ruleDefeater= ruleDefeater EOF ;
    public final EObject entryRuleDefeater() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefeater = null;


        try {
            // InternalSLEEC.g:1130:49: (iv_ruleDefeater= ruleDefeater EOF )
            // InternalSLEEC.g:1131:2: iv_ruleDefeater= ruleDefeater EOF
            {
             newCompositeNode(grammarAccess.getDefeaterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefeater=ruleDefeater();

            state._fsp--;

             current =iv_ruleDefeater; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefeater"


    // $ANTLR start "ruleDefeater"
    // InternalSLEEC.g:1137:1: ruleDefeater returns [EObject current=null] : (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? ) ;
    public final EObject ruleDefeater() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;

        EObject lv_response_3_0 = null;



        	enterRule();

        try {
            // InternalSLEEC.g:1143:2: ( (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? ) )
            // InternalSLEEC.g:1144:2: (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? )
            {
            // InternalSLEEC.g:1144:2: (otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )? )
            // InternalSLEEC.g:1145:3: otherlv_0= 'unless' ( (lv_expr_1_0= ruleMBoolExpr ) ) (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDefeaterAccess().getUnlessKeyword_0());
            		
            // InternalSLEEC.g:1149:3: ( (lv_expr_1_0= ruleMBoolExpr ) )
            // InternalSLEEC.g:1150:4: (lv_expr_1_0= ruleMBoolExpr )
            {
            // InternalSLEEC.g:1150:4: (lv_expr_1_0= ruleMBoolExpr )
            // InternalSLEEC.g:1151:5: lv_expr_1_0= ruleMBoolExpr
            {

            					newCompositeNode(grammarAccess.getDefeaterAccess().getExprMBoolExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_expr_1_0=ruleMBoolExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefeaterRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"circus.robocalc.sleec.SLEEC.MBoolExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSLEEC.g:1168:3: (otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSLEEC.g:1169:4: otherlv_2= 'then' ( (lv_response_3_0= ruleResponse ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefeaterAccess().getThenKeyword_2_0());
                    			
                    // InternalSLEEC.g:1173:4: ( (lv_response_3_0= ruleResponse ) )
                    // InternalSLEEC.g:1174:5: (lv_response_3_0= ruleResponse )
                    {
                    // InternalSLEEC.g:1174:5: (lv_response_3_0= ruleResponse )
                    // InternalSLEEC.g:1175:6: lv_response_3_0= ruleResponse
                    {

                    						newCompositeNode(grammarAccess.getDefeaterAccess().getResponseResponseParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_response_3_0=ruleResponse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefeaterRule());
                    						}
                    						set(
                    							current,
                    							"response",
                    							lv_response_3_0,
                    							"circus.robocalc.sleec.SLEEC.Response");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleDefeater"


    // $ANTLR start "ruleRelOp"
    // InternalSLEEC.g:1197:1: ruleRelOp returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) ) ;
    public final Enumerator ruleRelOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1203:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) ) )
            // InternalSLEEC.g:1204:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) )
            {
            // InternalSLEEC.g:1204:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '=' ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt15=1;
                }
                break;
            case 34:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            case 36:
                {
                alt15=4;
                }
                break;
            case 37:
                {
                alt15=5;
                }
                break;
            case 17:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSLEEC.g:1205:3: (enumLiteral_0= '<' )
                    {
                    // InternalSLEEC.g:1205:3: (enumLiteral_0= '<' )
                    // InternalSLEEC.g:1206:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelOpAccess().getLESS_THANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1213:3: (enumLiteral_1= '>' )
                    {
                    // InternalSLEEC.g:1213:3: (enumLiteral_1= '>' )
                    // InternalSLEEC.g:1214:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelOpAccess().getGREATER_THANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:1221:3: (enumLiteral_2= '<>' )
                    {
                    // InternalSLEEC.g:1221:3: (enumLiteral_2= '<>' )
                    // InternalSLEEC.g:1222:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelOpAccess().getNOT_EQUALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSLEEC.g:1229:3: (enumLiteral_3= '<=' )
                    {
                    // InternalSLEEC.g:1229:3: (enumLiteral_3= '<=' )
                    // InternalSLEEC.g:1230:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelOpAccess().getLESS_EQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSLEEC.g:1237:3: (enumLiteral_4= '>=' )
                    {
                    // InternalSLEEC.g:1237:3: (enumLiteral_4= '>=' )
                    // InternalSLEEC.g:1238:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelOpAccess().getGREATER_EQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSLEEC.g:1245:3: (enumLiteral_5= '=' )
                    {
                    // InternalSLEEC.g:1245:3: (enumLiteral_5= '=' )
                    // InternalSLEEC.g:1246:4: enumLiteral_5= '='
                    {
                    enumLiteral_5=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getRelOpAccess().getEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRelOpAccess().getEQUALEnumLiteralDeclaration_5());
                    			

                    }


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
    // $ANTLR end "ruleRelOp"


    // $ANTLR start "ruleBoolOp"
    // InternalSLEEC.g:1256:1: ruleBoolOp returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleBoolOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1262:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalSLEEC.g:1263:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalSLEEC.g:1263:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            else if ( (LA16_0==38) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSLEEC.g:1264:3: (enumLiteral_0= 'and' )
                    {
                    // InternalSLEEC.g:1264:3: (enumLiteral_0= 'and' )
                    // InternalSLEEC.g:1265:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolOpAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1272:3: (enumLiteral_1= 'or' )
                    {
                    // InternalSLEEC.g:1272:3: (enumLiteral_1= 'or' )
                    // InternalSLEEC.g:1273:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getBoolOpAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolOpAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleBoolOp"


    // $ANTLR start "ruleTimeUnit"
    // InternalSLEEC.g:1283:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'months' ) | (enumLiteral_6= 'years' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSLEEC.g:1289:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'months' ) | (enumLiteral_6= 'years' ) ) )
            // InternalSLEEC.g:1290:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'months' ) | (enumLiteral_6= 'years' ) )
            {
            // InternalSLEEC.g:1290:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'weeks' ) | (enumLiteral_5= 'months' ) | (enumLiteral_6= 'years' ) )
            int alt17=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt17=1;
                }
                break;
            case 40:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            case 42:
                {
                alt17=4;
                }
                break;
            case 43:
                {
                alt17=5;
                }
                break;
            case 44:
                {
                alt17=6;
                }
                break;
            case 45:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSLEEC.g:1291:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalSLEEC.g:1291:3: (enumLiteral_0= 'seconds' )
                    // InternalSLEEC.g:1292:4: enumLiteral_0= 'seconds'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSLEEC.g:1299:3: (enumLiteral_1= 'minutes' )
                    {
                    // InternalSLEEC.g:1299:3: (enumLiteral_1= 'minutes' )
                    // InternalSLEEC.g:1300:4: enumLiteral_1= 'minutes'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMINUTESEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSLEEC.g:1307:3: (enumLiteral_2= 'hours' )
                    {
                    // InternalSLEEC.g:1307:3: (enumLiteral_2= 'hours' )
                    // InternalSLEEC.g:1308:4: enumLiteral_2= 'hours'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOURSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getHOURSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSLEEC.g:1315:3: (enumLiteral_3= 'days' )
                    {
                    // InternalSLEEC.g:1315:3: (enumLiteral_3= 'days' )
                    // InternalSLEEC.g:1316:4: enumLiteral_3= 'days'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getDAYSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSLEEC.g:1323:3: (enumLiteral_4= 'weeks' )
                    {
                    // InternalSLEEC.g:1323:3: (enumLiteral_4= 'weeks' )
                    // InternalSLEEC.g:1324:4: enumLiteral_4= 'weeks'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getWEEKSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getWEEKSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSLEEC.g:1331:3: (enumLiteral_5= 'months' )
                    {
                    // InternalSLEEC.g:1331:3: (enumLiteral_5= 'months' )
                    // InternalSLEEC.g:1332:4: enumLiteral_5= 'months'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMONTHSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getMONTHSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSLEEC.g:1339:3: (enumLiteral_6= 'years' )
                    {
                    // InternalSLEEC.g:1339:3: (enumLiteral_6= 'years' )
                    // InternalSLEEC.g:1340:4: enumLiteral_6= 'years'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getYEARSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTimeUnitAccess().getYEARSEnumLiteralDeclaration_6());
                    			

                    }


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
    // $ANTLR end "ruleTimeUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000017000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020200010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003E00020002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00003F8000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000002L});

}