grammar simpel;

expression
    : VARIABLE | function | application | CALC | decision
    ;

function
    : 'function' VARIABLE ':' scope ';'
    ;

application
    : '(' expression ')'
    ;

scope
    : expression
    ;
decision
    : '#' CONDITION ':' scope '|' scope ';'
    ;
CONDITION
    : CALC
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
    : '+' | '-' | '*' | '/' | '||' | '&&' | '=='
    ;
WS
   : [ \t\r\n] -> skip
;
