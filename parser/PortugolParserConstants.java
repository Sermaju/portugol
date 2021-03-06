/* Generated By:JJTree&JavaCC: Do not edit this line. PortugolParserConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface PortugolParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 4;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 5;
  /** RegularExpression Id. */
  int INT = 6;
  /** RegularExpression Id. */
  int REAL = 7;
  /** RegularExpression Id. */
  int STRING = 8;
  /** RegularExpression Id. */
  int CHAR = 9;
  /** RegularExpression Id. */
  int BOOL = 10;
  /** RegularExpression Id. */
  int CONSTANT = 11;
  /** RegularExpression Id. */
  int VARIABLE = 12;
  /** RegularExpression Id. */
  int REFERENCE = 13;
  /** RegularExpression Id. */
  int VOID = 14;
  /** RegularExpression Id. */
  int IMPORT = 15;
  /** RegularExpression Id. */
  int END = 16;
  /** RegularExpression Id. */
  int RETURN = 17;
  /** RegularExpression Id. */
  int STRUCT = 18;
  /** RegularExpression Id. */
  int IF = 19;
  /** RegularExpression Id. */
  int THEN = 20;
  /** RegularExpression Id. */
  int ELSE = 21;
  /** RegularExpression Id. */
  int ENDIF = 22;
  /** RegularExpression Id. */
  int WHILE = 23;
  /** RegularExpression Id. */
  int DO = 24;
  /** RegularExpression Id. */
  int ENDWHILE = 25;
  /** RegularExpression Id. */
  int FOR = 26;
  /** RegularExpression Id. */
  int OF = 27;
  /** RegularExpression Id. */
  int TO = 28;
  /** RegularExpression Id. */
  int STEP = 29;
  /** RegularExpression Id. */
  int NEXT = 30;
  /** RegularExpression Id. */
  int SWITCH = 31;
  /** RegularExpression Id. */
  int CASE = 32;
  /** RegularExpression Id. */
  int _DEFAULT = 33;
  /** RegularExpression Id. */
  int ENDSWITCH = 34;
  /** RegularExpression Id. */
  int AND = 35;
  /** RegularExpression Id. */
  int OR = 36;
  /** RegularExpression Id. */
  int XOR = 37;
  /** RegularExpression Id. */
  int NOT = 38;
  /** RegularExpression Id. */
  int OP_ASSIGN = 39;
  /** RegularExpression Id. */
  int OP_GE = 40;
  /** RegularExpression Id. */
  int OP_LE = 41;
  /** RegularExpression Id. */
  int OP_G = 42;
  /** RegularExpression Id. */
  int OP_L = 43;
  /** RegularExpression Id. */
  int OP_E = 44;
  /** RegularExpression Id. */
  int OP_NEQ = 45;
  /** RegularExpression Id. */
  int OP_PLUS = 46;
  /** RegularExpression Id. */
  int OP_MINUS = 47;
  /** RegularExpression Id. */
  int OP_MUL = 48;
  /** RegularExpression Id. */
  int OP_DIV = 49;
  /** RegularExpression Id. */
  int OP_MOD = 50;
  /** RegularExpression Id. */
  int LPARENT = 51;
  /** RegularExpression Id. */
  int RPARENT = 52;
  /** RegularExpression Id. */
  int COMMA = 53;
  /** RegularExpression Id. */
  int DOT = 54;
  /** RegularExpression Id. */
  int LBRACKET = 55;
  /** RegularExpression Id. */
  int RBRACKET = 56;
  /** RegularExpression Id. */
  int LKEYWAY = 57;
  /** RegularExpression Id. */
  int RKEYWAY = 58;
  /** RegularExpression Id. */
  int EOL = 59;
  /** RegularExpression Id. */
  int TRUE = 60;
  /** RegularExpression Id. */
  int FALSE = 61;
  /** RegularExpression Id. */
  int NULL = 62;
  /** RegularExpression Id. */
  int IDENTIFIER = 63;
  /** RegularExpression Id. */
  int CHAR_LITERAL = 64;
  /** RegularExpression Id. */
  int INT_LITERAL = 65;
  /** RegularExpression Id. */
  int REAL_LITERAL = 66;
  /** RegularExpression Id. */
  int STRING_LITERAL = 67;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "<SINGLE_LINE_COMMENT>",
    "<MULTI_LINE_COMMENT>",
    "\"inteiro\"",
    "\"real\"",
    "\"texto\"",
    "\"caracter\"",
    "\"logico\"",
    "\"const\"",
    "\"var\"",
    "\"ref\"",
    "\"vazio\"",
    "\"importa\"",
    "\"fim\"",
    "\"retorna\"",
    "\"estrutura\"",
    "\"se\"",
    "\"entao\"",
    "\"senao\"",
    "\"fimse\"",
    "\"enquanto\"",
    "\"faz\"",
    "\"fimenquanto\"",
    "\"para\"",
    "\"de\"",
    "\"ate\"",
    "\"passo\"",
    "\"seguinte\"",
    "\"escolhe\"",
    "\"caso\"",
    "\"defeito\"",
    "\"fimescolhe\"",
    "\"e\"",
    "\"ou\"",
    "\"xou\"",
    "\"nao\"",
    "\"=\"",
    "\">=\"",
    "\"<=\"",
    "\">\"",
    "\"<\"",
    "\"==\"",
    "\"!=\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"(\"",
    "\")\"",
    "\",\"",
    "\".\"",
    "\"[\"",
    "\"]\"",
    "\"{\"",
    "\"}\"",
    "\"\\n\"",
    "\"verdadeiro\"",
    "\"falso\"",
    "\"nulo\"",
    "<IDENTIFIER>",
    "<CHAR_LITERAL>",
    "<INT_LITERAL>",
    "<REAL_LITERAL>",
    "<STRING_LITERAL>",
  };

}
