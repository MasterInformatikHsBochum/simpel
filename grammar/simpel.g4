grammar simpel;

expression
    : VARIABLE | function | application | calculation | decision | inputsimpel | outputsimpel
    ;

function
    : (FUNC VARIABLE COLON scope BREAK) | (FUNC VARIABLE COLON STRING BREAK)
    ;

application
    : '(' expression ')'
    ;

scope
    : expression
    ;
decision
    : IF condition COLON scope OPTION scope BREAK
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
IF
     :
     'if'
     ;
NUM
    : ([0-9] [0-9]*) | ([0-9] [0-9]*'.'[0-9] [0-9]*)
    ;
OPERATOR 
    : '+' | '-' | '*' | '/' | '||' | '&&' | '=='
    ;
WS
   : [ \t\r\n] -> skip
;
STRING
   :
   '"'[a-zA-Z0-9]*'"'
   ;
inputsimpel
   :
   'in->'VARIABLE
   ;
outputsimpel
   :
   'out<-'VARIABLE
   ;
