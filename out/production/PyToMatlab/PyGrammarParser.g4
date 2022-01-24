//https://docs.python.org/3/reference/grammar.html
parser grammar PyGrammarParser;

options {
    tokenVocab=PyGrammarLexer;
}

/*
 * parser rules
 */

// startRules:
single_input: NEWLINE | simple_stmt NEWLINE;
file_input: (NEWLINE | stmt)* EOF;

stmt: simple_stmts | compound_stmt;

simple_stmts: simple_stmt NEWLINE;
simple_stmt: assignment_stmt | flow_stmt | expr_stmt;
compound_stmt: if_stmt | func_def | while_stmt | for_stmt;

//simple_stmt
assignment_stmt: test ('='|assignment_op) test ;
assignment_op: ('+=' | '-=' | '*=' | '/=');
flow_stmt: break_stmt | continue_stmt | return_stmt;
break_stmt: 'break';
continue_stmt: 'continue';
return_stmt: 'return' (test)?;
expr_stmt: test;

//compound_stmt
if_stmt: 'if' test ':' block ('elif' test ':' block)* ('else' ':' block)?;
func_def: 'def' IDENTIFIER '(' (arglist)? ')' ':' block;
while_stmt: 'while' test ':' block;
for_stmt: 'for' IDENTIFIER 'in' test ':' block;

test: or_test;
or_test: and_test ('or' and_test)*;
and_test: not_test ('and' not_test)*;
not_test: 'not' not_test | comparison;
comparison: expr (comp_op expr)*;
comp_op: '<'|'>'|'=='|'>='|'<='|'!='|'in'|'not' 'in'|'is'|'is' 'not';

expr: arithm_expr;
arithm_expr: term (add_op term)* ;
term: factor (mul_op factor)* ;
add_op: '+' | '-' ;
mul_op: '/' | '*' | '%' | '//';
factor: ('+'|'-') factor | power ;
power: atom_expr ('**' factor)? ;
atom_expr: atom trailer?;
atom: fun_call | built_fun_call | list2d | list | IDENTIFIER | STRING+ | NUMBER | 'True' | 'False' | 'None';
fun_call: IDENTIFIER par_arguments;
par_arguments: '(' (arglist)? ')';
built_fun_call: ('len'|'print') '(' argument ')';
list2d: '[' list (',' list)* ']';
list: '[' (arglist)? ']';
arglist: argument (',' argument)*;
argument: test | IDENTIFIER;
trailer: (par_arguments)? ('[' subscriptlist ']')+ | par_arguments ('[' subscriptlist ']')*;
subscriptlist: subscript_ (',' subscript_)*;
subscript_: test | slice;
slice: (test)? ':' (test)? (slice_step)?;
slice_step: ':' (test)?;


//atom_expr: (atom | built_fun_call) trailer*;
//atom: list2d | list |
//      IDENTIFIER | NUMBER | STRING | 'None' | 'True' | 'False';
//list2d: '[' list (',' list)* ']';
//list: '[' (arglist)? ']';
//trailer: par_arguments | '.' IDENTIFIER;
//par_arguments: '(' (arglist)? ')';
//brack_arguments: '[' subscriptlist ']';
//arglist: argument (',' argument)*  (',')?;
//argument: test | IDENTIFIER;
//subscriptlist: subscript_ (',' subscript_)* (',')?;
//subscript_: test | (test)? ':' (test)? (slice_step)?;
//slice_step: ':' (test)?;

block: simple_stmt | NEWLINE INDENT stmt+ DEDENT;