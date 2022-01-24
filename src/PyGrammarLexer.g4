lexer grammar PyGrammarLexer;

tokens { INDENT, DEDENT }

options {
    superClass=PyGrammarLexerBase;
}

/*
 * lexer rules
 */

STRING
    : '"' .*? '"'
    | '\'' .*? '\''
    ;

NUMBER
    : INTEGER
    | FLOAT
    ;

INTEGER
    : NON_ZERO_DIGIT DIGIT*
    | '0'+
    ;

FLOAT
    : INTEGER '.' FRACTION
    ;

DEF : 'def';
RETURN : 'return';
RAISE : 'raise';
FROM : 'from';
IMPORT : 'import';
AS : 'as';
GLOBAL : 'global';
NONLOCAL : 'nonlocal';
ASSERT : 'assert';
IF : 'if';
ELIF : 'elif';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
IN : 'in';
TRY : 'try';
FINALLY : 'finally';
WITH : 'with';
EXCEPT : 'except';
LAMBDA : 'lambda';
OR : 'or';
AND : 'and';
NOT : 'not';
IS : 'is';
NONE : 'None';
TRUE : 'True';
FALSE : 'False';
CLASS : 'class';
YIELD : 'yield';
DEL : 'del';
PASS : 'pass';
CONTINUE : 'continue';
BREAK : 'break';
ASYNC : 'async';
AWAIT : 'await';
PRINT : 'print';
LEN : 'len';

IDENTIFIER
    : ID_START ID_CONTINUE*
    ;

NEWLINE
    : ( '\r'? '\n' | '\r' | '\f' ) SPACES? {this.onNewLine();}
    ;

COMMENT
    : '#' ~[\r\n\f]*
    ;

SKIP_
    : ( SPACES | COMMENT ) -> skip
    ;

OPEN_PAREN : '(';
CLOSE_PAREN : ')';
OPEN_BRACK : '[';
CLOSE_BRACK : ']';
OPEN_BRACE : '{';
CLOSE_BRACE : '}';

DOT : '.';
ELLIPSIS : '...';
STAR : '*';
COMMA : ',';
COLON : ':';
SEMI_COLON : ';';
POWER : '**';
ASSIGN : '=';
OR_OP : '|';
XOR : '^';
AND_OP : '&';
LEFT_SHIFT : '<<';
RIGHT_SHIFT : '>>';
ADD : '+';
MINUS : '-';
DIV : '/';
MOD : '%';
IDIV : '//';
NOT_OP : '~';
LESS_THAN : '<';
GREATER_THAN : '>';
EQUALS : '==';
GT_EQ : '>=';
LT_EQ : '<=';
NOT_EQ_1 : '<>';
NOT_EQ_2 : '!=';
AT : '@';
ARROW : '->';
ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MULT_ASSIGN : '*=';
AT_ASSIGN : '@=';
DIV_ASSIGN : '/=';
MOD_ASSIGN : '%=';
AND_ASSIGN : '&=';
OR_ASSIGN : '|=';
XOR_ASSIGN : '^=';
LEFT_SHIFT_ASSIGN : '<<=';
RIGHT_SHIFT_ASSIGN : '>>=';
POWER_ASSIGN : '**=';
IDIV_ASSIGN : '//=';

/*
 * fragments
 */

fragment NON_ZERO_DIGIT
    : [1-9]
    ;

fragment DIGIT
    : [0-9]
    ;

fragment FRACTION
    : DIGIT*
    ;

fragment ID_START
    : [A-Z]
    | [a-z]
    | '_'
    ;

fragment ID_CONTINUE
    : ID_START
    | DIGIT
    ;

fragment SPACES
    : [ \t]+
    ;