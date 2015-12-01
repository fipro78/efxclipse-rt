/*
 * generated by Xtext
 */
package org.eclipse.fx.code.editor.ldef.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.code.editor.ldef.lDef.ConfigValue;
import org.eclipse.fx.code.editor.ldef.lDef.E4CodeGeneration;
import org.eclipse.fx.code.editor.ldef.lDef.Equals;
import org.eclipse.fx.code.editor.ldef.lDef.Import;
import org.eclipse.fx.code.editor.ldef.lDef.Integration;
import org.eclipse.fx.code.editor.ldef.lDef.JavaCodeGeneration;
import org.eclipse.fx.code.editor.ldef.lDef.JavaFXIntegration;
import org.eclipse.fx.code.editor.ldef.lDef.Keyword;
import org.eclipse.fx.code.editor.ldef.lDef.LDefPackage;
import org.eclipse.fx.code.editor.ldef.lDef.LanguageDef;
import org.eclipse.fx.code.editor.ldef.lDef.LexicalHighlighting;
import org.eclipse.fx.code.editor.ldef.lDef.LexicalPartitionHighlighting_JS;
import org.eclipse.fx.code.editor.ldef.lDef.LexicalPartitionHighlighting_Rule;
import org.eclipse.fx.code.editor.ldef.lDef.Paritioner_JS;
import org.eclipse.fx.code.editor.ldef.lDef.Paritioning;
import org.eclipse.fx.code.editor.ldef.lDef.Partition;
import org.eclipse.fx.code.editor.ldef.lDef.Partition_MultiLineRule;
import org.eclipse.fx.code.editor.ldef.lDef.Partition_SingleLineRule;
import org.eclipse.fx.code.editor.ldef.lDef.Partitioner_Rule;
import org.eclipse.fx.code.editor.ldef.lDef.Range;
import org.eclipse.fx.code.editor.ldef.lDef.Root;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_CharacterRule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_JSRule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_Keyword;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_MultiLineRule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_PatternRule;
import org.eclipse.fx.code.editor.ldef.lDef.Scanner_SingleLineRule;
import org.eclipse.fx.code.editor.ldef.lDef.Token;
import org.eclipse.fx.code.editor.ldef.lDef.WhitespaceRule;
import org.eclipse.fx.code.editor.ldef.services.LDefGrammarAccess;
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

@SuppressWarnings("all")
public class LDefSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LDefGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LDefPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LDefPackage.CONFIG_VALUE:
				sequence_ConfigValue(context, (ConfigValue) semanticObject); 
				return; 
			case LDefPackage.E4_CODE_GENERATION:
				sequence_E4CodeGeneration(context, (E4CodeGeneration) semanticObject); 
				return; 
			case LDefPackage.EQUALS:
				sequence_Equals(context, (Equals) semanticObject); 
				return; 
			case LDefPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case LDefPackage.INTEGRATION:
				sequence_Integration(context, (Integration) semanticObject); 
				return; 
			case LDefPackage.JAVA_CODE_GENERATION:
				sequence_JavaCodeGeneration(context, (JavaCodeGeneration) semanticObject); 
				return; 
			case LDefPackage.JAVA_FX_INTEGRATION:
				sequence_JavaFXIntegration(context, (JavaFXIntegration) semanticObject); 
				return; 
			case LDefPackage.KEYWORD:
				sequence_Keyword(context, (Keyword) semanticObject); 
				return; 
			case LDefPackage.LANGUAGE_DEF:
				sequence_LanguageDef(context, (LanguageDef) semanticObject); 
				return; 
			case LDefPackage.LEXICAL_HIGHLIGHTING:
				sequence_LexicalHighlighting(context, (LexicalHighlighting) semanticObject); 
				return; 
			case LDefPackage.LEXICAL_PARTITION_HIGHLIGHTING_JS:
				sequence_LexicalPartitionHighlighting_JS(context, (LexicalPartitionHighlighting_JS) semanticObject); 
				return; 
			case LDefPackage.LEXICAL_PARTITION_HIGHLIGHTING_RULE:
				sequence_LexicalPartitionHighlighting_Rule(context, (LexicalPartitionHighlighting_Rule) semanticObject); 
				return; 
			case LDefPackage.PARITIONER_JS:
				sequence_Paritioner_JS(context, (Paritioner_JS) semanticObject); 
				return; 
			case LDefPackage.PARITIONING:
				sequence_Paritioning(context, (Paritioning) semanticObject); 
				return; 
			case LDefPackage.PARTITION:
				sequence_Partition(context, (Partition) semanticObject); 
				return; 
			case LDefPackage.PARTITION_MULTI_LINE_RULE:
				sequence_Partition_MultiLineRule(context, (Partition_MultiLineRule) semanticObject); 
				return; 
			case LDefPackage.PARTITION_SINGLE_LINE_RULE:
				sequence_Partition_SingleLineRule(context, (Partition_SingleLineRule) semanticObject); 
				return; 
			case LDefPackage.PARTITIONER_RULE:
				sequence_Partitioner_Rule(context, (Partitioner_Rule) semanticObject); 
				return; 
			case LDefPackage.RANGE:
				sequence_Range(context, (Range) semanticObject); 
				return; 
			case LDefPackage.ROOT:
				sequence_Root(context, (Root) semanticObject); 
				return; 
			case LDefPackage.SCANNER_CHARACTER_RULE:
				sequence_Scanner_CharacterRule(context, (Scanner_CharacterRule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_JS_RULE:
				sequence_Scanner_JSRule(context, (Scanner_JSRule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_KEYWORD:
				sequence_Scanner_Keyword(context, (Scanner_Keyword) semanticObject); 
				return; 
			case LDefPackage.SCANNER_MULTI_LINE_RULE:
				sequence_Scanner_MultiLineRule(context, (Scanner_MultiLineRule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_PATTERN_RULE:
				sequence_Scanner_PatternRule(context, (Scanner_PatternRule) semanticObject); 
				return; 
			case LDefPackage.SCANNER_SINGLE_LINE_RULE:
				sequence_Scanner_SingleLineRule(context, (Scanner_SingleLineRule) semanticObject); 
				return; 
			case LDefPackage.TOKEN:
				sequence_Token(context, (Token) semanticObject); 
				return; 
			case LDefPackage.WHITESPACE_RULE:
				sequence_WhitespaceRule(context, (WhitespaceRule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (key=ID (simpleValue=STRING | children+=ConfigValue+))
	 */
	protected void sequence_ConfigValue(EObject context, ConfigValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING configValue+=ConfigValue*)
	 */
	protected void sequence_E4CodeGeneration(EObject context, E4CodeGeneration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Equals(EObject context, Equals semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.EQUALS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.EQUALS__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEqualsAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildCard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     codeIntegrationList+=CodeIntegration+
	 */
	protected void sequence_Integration(EObject context, Integration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING configValue+=ConfigValue*)
	 */
	protected void sequence_JavaCodeGeneration(EObject context, JavaCodeGeneration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     codegenerationList+=Codegeneration+
	 */
	protected void sequence_JavaFXIntegration(EObject context, JavaFXIntegration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING version=STRING?)
	 */
	protected void sequence_Keyword(EObject context, Keyword semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID paritioning=Paritioning lexicalHighlighting=LexicalHighlighting integration=Integration?)
	 */
	protected void sequence_LanguageDef(EObject context, LanguageDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     list+=LexicalPartitionHighlighting+
	 */
	protected void sequence_LexicalHighlighting(EObject context, LexicalHighlighting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (partition=[Partition|ID] scriptURI=STRING)
	 */
	protected void sequence_LexicalPartitionHighlighting_JS(EObject context, LexicalPartitionHighlighting_JS semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING__PARTITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING__PARTITION));
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING_JS__SCRIPT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.LEXICAL_PARTITION_HIGHLIGHTING_JS__SCRIPT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLexicalPartitionHighlighting_JSAccess().getPartitionPartitionIDTerminalRuleCall_1_0_1(), semanticObject.getPartition());
		feeder.accept(grammarAccess.getLexicalPartitionHighlighting_JSAccess().getScriptURISTRINGTerminalRuleCall_2_0(), semanticObject.getScriptURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (partition=[Partition|ID] whitespace=WhitespaceRule? tokenList+=Token+)
	 */
	protected void sequence_LexicalPartitionHighlighting_Rule(EObject context, LexicalPartitionHighlighting_Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     scriptURI=STRING
	 */
	protected void sequence_Paritioner_JS(EObject context, Paritioner_JS semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.PARITIONER_JS__SCRIPT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.PARITIONER_JS__SCRIPT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParitioner_JSAccess().getScriptURISTRINGTerminalRuleCall_1_0(), semanticObject.getScriptURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (partitions+=Partition+ partitioner=Partitioner)
	 */
	protected void sequence_Paritioning(EObject context, Paritioning semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parition=[Partition|ID] startSeq=STRING check=Check? endSeq=STRING escapeSeq=STRING?)
	 */
	protected void sequence_Partition_MultiLineRule(EObject context, Partition_MultiLineRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Partition(EObject context, Partition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LDefPackage.Literals.PARTITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LDefPackage.Literals.PARTITION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPartitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parition=[Partition|ID] startSeq=STRING check=Check? endSeq=STRING? escapeSeq=STRING?)
	 */
	protected void sequence_Partition_SingleLineRule(EObject context, Partition_SingleLineRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ruleList+=Partition_Rule+
	 */
	protected void sequence_Partitioner_Rule(EObject context, Partitioner_Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((ltIncl='(' | ltIncl='[') minValue+=INT? maxValue+=INT? (gtIncl=')' | gtIncl=']'))
	 */
	protected void sequence_Range(EObject context, Range semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* languageDefinition=LanguageDef)
	 */
	protected void sequence_Root(EObject context, Root semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (characters+=STRING characters+=STRING* check=Check?)
	 */
	protected void sequence_Scanner_CharacterRule(EObject context, Scanner_CharacterRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fileURI=STRING check=Check?)
	 */
	protected void sequence_Scanner_JSRule(EObject context, Scanner_JSRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keywords+=Keyword keywords+=Keyword*)
	 */
	protected void sequence_Scanner_Keyword(EObject context, Scanner_Keyword semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (startSeq=STRING check=Check? endSeq=STRING escapeSeq=STRING?)
	 */
	protected void sequence_Scanner_MultiLineRule(EObject context, Scanner_MultiLineRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (startPattern=STRING length=INT? check=Check? contentPattern=STRING)
	 */
	protected void sequence_Scanner_PatternRule(EObject context, Scanner_PatternRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (startSeq=STRING check=Check? endSeq=STRING? escapeSeq=STRING?)
	 */
	protected void sequence_Scanner_SingleLineRule(EObject context, Scanner_SingleLineRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (default?='default'? name=ID scannerList+=Scanner*)
	 */
	protected void sequence_Token(EObject context, Token semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((characters+=STRING characters+=STRING*) | javawhitespace?='javawhitespace' | fileURI=STRING)
	 */
	protected void sequence_WhitespaceRule(EObject context, WhitespaceRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
