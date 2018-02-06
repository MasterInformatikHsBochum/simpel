grammar simpel;

expression
    : (var | function | application | calculation | decision | inputsimpel | outputsimpel | loop) (var | function | application | calculation | decision | inputsimpel | outputsimpel | loop)*

    ;

function
    : ('func 'VARIABLE COLON scope BREAK) | ('func 'VARIABLE COLON string BREAK)
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
    : ((num | var) op (num | var)) | ((var | num) op calculation) | num | var
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
num
   :
   NUM
   ;
NUM
    : ([0-9] [0-9]*) | ([0-9] [0-9]*'.'[0-9] [0-9]*)
    ;
op
    :
    OPERATOR
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
COMMENT
   :
   '%'[ a-zA-Z0-9]*'%' -> skip
   ;
