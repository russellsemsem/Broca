package lexer;

public class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public TokenType getType(){
        return type;
    }

    public String getLexeme(){
        return lexeme;
    }

    public Object getLiteral() {
        return literal;
    }

    public String toString() {
        return type + ": " + lexeme;
    }
}
