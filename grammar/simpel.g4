grammar simpel;

expression
    : (var | function | application | calculation | decision | inputsimpel | outputsimpel | loop) (var | function | application | calculation | decision | inputsimpel | outputsimpel | loop)*

    ;

function
    : (FUNC VARIABLE COLON scope BREAK) | (FUNC VARIABLE COLON string BREAK)
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
var
    :
    '$'VARIABLE
    ;
VARIABLE
    : [a-z] [a-zA-Z0-9]*
    ;
calculation
    : ((NUM | var) OPERATOR (NUM | var)) | ((var | NUM) OPERATOR calculation) | NUM | var
    ;
FUNC
    :
    'func '
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
     'if '
     ;
NUM
    : ([0-9] [0-9]*) | ([0-9] [0-9]*'.'[0-9] [0-9]*)
    ;
EQUAL
    :
    '='
    ;
OPERATOR 
    : '+' | '-' | '*' | '/' | '||' | '&&' | '==' | '<=' | '=>' | '<' | '>'
    ;
WS
   : [ \t\r\n] -> skip
;
string
   :
   '"'STRING'"'
   ;
STRING
   :
   [a-zA-Z0-9]*
   ;
inputsimpel
   :
   'in->'var
   ;
outputsimpel
   :
   'out<-'var
   ;
loop
   :
   'while(' condition '):' scope BREAK
   ;  
