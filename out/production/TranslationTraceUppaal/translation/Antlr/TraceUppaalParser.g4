parser grammar TraceUppaalParser;
options { tokenVocab=TraceUppaalLexer; }
trace       : state (transition state)*;

state       :   'state'
                location
                values
                clocks
                ;

transition  :   delay | discrete ;

location    :   '(' loc+ ')' ;

loc         :   IDENTIFIER '.' IDENTIFIER ;

values      :   (varFieldDecl '=' expr)* ;

clocks      :   '[' ('#'? IDENTIFIER '=' (POINT | NAT) )+ ']' ;

delay       :   'delay' POINT;

discrete    :   'transition'
                aDiscrete+
                ;

aDiscrete   :   loc '->' loc
                '{' guard ',' action ',' (update | NAT)  '}'

                ;

guard       :   expr ;

action      :   sync | tau ;

sync        :   IDENTIFIER ('?' | '!') ;

tau         :   'tau' ;

update      :   assign (',' assign)*;

assign      :   varFieldDecl ':=' expr;

expr        :   IDENTIFIER  # IdentifierExpr
            |   NAT         # NatExpr
            |   POINT       # DoubleExpr
            |   expr '[' expr ']'   # ArrayExpr
            |   expr '\''     # StopWatchExpr
            |   '(' expr ')'  # ParenthesisExpr
            |   expr '++'     # ExprIncrement
            |   '++' expr     # IncrementExpr
            |   expr '--'     # ExprDecrement
            |   '--' expr     # DecrementExpr
            |   expr
                    ('=' | ':=' | '+=' | '-=' | '*=' | '/=' | '%=' | '|=' | '&=' | '^=' | '<<=' | '>>=')
                        expr  # AssignExpr
            |   unary=('-' | '+' | '!' | 'not') expr  # UnaryExpr
            |   expr binary=( '<' | '<=' | '==' | '!=' | '>=' | '>'
                                   ) expr     # ComparisonExpr
            |   expr binary=( '+' | '-' | '*' | '/' | '%' | '&'
                                    |  '|' | '^' | '<<' | '>>' | '&&' | '||'
                                    |  '<?' | '>?' | 'or' | 'and' | ',' | 'imply')
                                    expr      #BinaryExpr
            |   expr '?' expr ':' expr
                                    # IfExpr
            |   expr '.' IDENTIFIER   # DotExpr
            |   expr '(' arguments ')'# FuncExpr
            |   'forall' '(' IDENTIFIER ':' type ')' expr     # ForallExpr
            |   'exists' '(' IDENTIFIER ':' type ')' expr     # ExistsExpr
            |   'sum' '(' IDENTIFIER ':' type ')' expr        # SumExpr
            |   'true'  # TrueExpr
            |   'false' # FalseExpr
            ;

arguments   :   (expr  (',' expr)*)? ;

type        :   IDENTIFIER  # IdentifierType
            |   'int'       # IntType
            |   'double'    # DoubleType
            |   'clock'     # ClockType
            |   'chan'      # ChanType
            |   'bool'      # BoolType
            |   'int' '[' expr ',' expr ']'     # IntDomainType
            |   'scalar' '[' expr ']'           # ScalarType
            |   'struct' '{' (fieldDecl)+ '}'   # StructType
            ;

fieldDecl   :   type varFieldDecl (',' varFieldDecl)* ';' ;

varFieldDecl:   IDENTIFIER arrayDecl* ;

arrayDecl   :   '[' expr ']'    # ArrayDeclExpr
            |   '[' type ']'    # ArrayDeclType
            ;


