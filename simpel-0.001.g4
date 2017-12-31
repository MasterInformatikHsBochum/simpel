grammar simpel;

EXPRESSION
    : VARIABLE | FUNCTION | APPLICATION | CALC
    ;

FUNCTION
    : 'function' VARIABLE ':' SCOPE ';'
    ;

application
    : '(' EXPRESSION ')'
    ;

SCOPE
    : EXPRESSION
    ;

VARIABLE
    : [a-z] [a-zA-Z0-9]*
    ;
CALC
    : (NUM | VARIABLE) OPERATOR (NUM | VARIABLE) | (VARIABLE | NUM) OPERATOR CALC
    ;
NUM
    : [0-9] [0-9]*
    ;
OPERATOR 
    : '+' | '-' | '*' | '/'
    ;
WS
   : [ \t\r\n] -> skip
;
