/** Grammars always start with a grammar header. This grammar is called
 *  ArrayInit and must match the filename: ArrayInit.g4
 */
grammar ArrayInit;

sltl : '<' NAME '>' sltl
     | '(' sltl ')'
     | unaryOp sltl
     | sltl binaryOp sltl
     | NAME
     | TRUE
     ;

unaryOp : GLOBAL
      | FUTURE
      | NEG
      ;

binaryOp : UNTIL
    | AND
    | OR
    ;

/** A rule called init that matches comma-separated values between {...}. */
init  : '{' value (',' value)* '}' ;  // must match at least one value

/** A value can be either a nested array/struct or a simple integer (INT) */
value : init
      | INT
      ;

TRUE    : 'true';
AND     : 'and';
OR      : 'or';
// parser rules start with lowercase letters, lexer rules with uppercase
GLOBAL  : 'G' ;
UNTIL   : 'U' ;
NEG     : '~';
FUTURE  : 'F' ;
NAME    : [a-z_A-Z]+;
INT     : [0-9]+ ;             // Define token INT as one or more digits
WS      : [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out
