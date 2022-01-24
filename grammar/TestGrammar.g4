parser grammar TestGrammar;

atom_expr: atom trailer?;
atom: fun_call | built_fun_call | list2d | list | IDENTIFIER | STRING | NUMBER | 'True' | 'False' | 'None';
fun_call: IDENTIFIER par_arguments;
par_arguments: '(' (arglist)? ')';
list2d: '[' list (',' list)* ']';
list: '[' (arglist)? ']';
arglist: argument (',' argument)*  (',')?;
argument: test | IDENTIFIER;
trailer: (par_arguments)? brack_arguments*;
brack_arguments: '[' subscriptlist ']';
subscriptlist: subscript_ (',' subscript_)* (',')?;
subscript_: test | (test)? ':' (test)? (slice_step)?;
slice_step: ':' (test)?;