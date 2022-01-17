lexer grammar TraceUppaalLexer;

WS          :   [ \t\r\n]               -> skip ;

STATE       :   'state';
DELAY       :   'delay';
TRANSITION  :   'transition' ;

TAU         :   'tau' ;
IDENTIFIER  :   [a-zA-Z_]([a-zA-Z0-9_])* ;
NAT         :   [0-9]+ ;
POINT       :   ([0-9]*) '.' [0-9]+ ('e-' NAT)?;


ARROW       :   '->' ;
BRACKET_LEFT:   '{' ;
BRACKET_RIGHT:  '}' ;
PAR_LEFT    :   '(' ;
PAR_RIGHT   :   ')' ;
DOT         :   '.' ;
COLON       :   ':' ;
SEMICOLON   :   ';' ;
COMMA       :   ',' ;

QUESTION    :   '?' ;
EXCLAMATION :   '!' ;

FORALL      :   'forall' ;
EXISTS      :   'exists' ;
SUM         :   'sum' ;

TRUE        :   'true' ;
FALSE       :   'false' ;


INT         :   'int' ;
DOUBLE      :   'double' ;
CLOCK       :   'clock' ;
CHAN        :   'chan' ;
BOOL        :   'bool' ;
SQUARE_BRACKET_L: '[' ;
SQUARE_BRACKET_R: ']' ;
SCALAR      :   'scalar' ;
STRUCT      :   'struct' ;

DERIVATE    :   '\'' ;
INCREMENT           :   '++' ;
DECREMENT           :   '--' ;
ASSIGN              :   '=' ;
ASSIGN_COLON        :   ':=' ;
ASSIGN_ADD          :   '+=' ;
ASSIGN_SUB          :   '-=' ;
ASSIGN_MUL          :   '*=' ;
ASSIGN_DIV          :   '/=' ;
ASSIGN_PERCENT      :   '%=' ;
ASSIGN_OR           :   '|=' ;
ASSIGN_AND          :   '&=' ;
ASSIGN_XOR          :   '^=' ;
ASSIGN_LSHIFT       :   '<<=' ;
ASSIGN_RSHIFT       :   '>>=' ;


//Unary
ADD                 :   '+' ; //binary too
SUB                 :   '-' ; //binary too
NOT                 :   'not' ;
NUMERAL             :   '#' ;


//Binary

LESS                :   '<' ;
LESSEQ              :   '<=' ;
COMPARE             :   '==' ;
DIFFERENT           :   '!=' ;
GREATEREQ           :   '>=' ;
GREATER             :   '>' ;
MUL                 :   '*' ;
DIV                 :   '/' ;
PERCENT             :   '%' ;
BITAND              :   '&' ;
BITOR               :   '|' ;
BITXOR              :   '^' ;
LSHIFT              :   '<<' ;
RSHIFT              :   '>>' ;
AND_SYMBOL          :   '&&' ;
OR_SYMBOL           :   '||' ;
MINIMUM             :   '<?' ;
MAXIMUM             :   '>?' ;
OR                  :   'or' ;
AND                 :   'and' ;
IMPLY               :   'imply' ;

