grammar simpel;

expression
    : VARIABLE | function | application | calculation | decision
    ;

function
    : FUNC VARIABLE COLON scope BREAK
    ;

application
    : '(' expression ')'
    ;

scope
    : expression
    ;
decision
    : RAUTE condition COLON scope OPTION scope BREAK
    ;
condition
    : calculation
    ;
VARIABLE
    : [a-z] [a-zA-Z0-9]*
    ;
calculation
    : ((NUM | VARIABLE) OPERATOR (NUM | VARIABLE)) | ((VARIABLE | NUM) OPERATOR calculation)
    ;
FUNC
    :
    'function'
    ;
OPTION
    :
    '|'
    ;
BREAK
    :
    ';'
    ;

COLON
     :
     ':'
     ; 
RAUTE
     :
     '#'
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
