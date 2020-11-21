package JavaCompiler.scanner;

import JavaCompiler.error.CompileError;
import JavaCompiler.error.TokenizeError;
import JavaCompiler.error.ErrorCode;
import JavaCompiler.util.Pos;

import java.security.Key;

public class Tokenizer {
    private StringIter it;

    public Tokenizer(StringIter it) {
        this.it = it;
    }

    public Token nextToken() throws TokenizeError {
        it.readAll();
        // 跳过之前的所有空白字符
//        skipSpaceCharacters();

        if (it.isEOF()) {
            return new Token(TokenType.EOF, "", it.currentPos(), it.currentPos());
        }

        char peek = it.peekChar();
        if (Character.isDigit(peek)) {
//            return lexUInt();
        } else if (Character.isAlphabetic(peek)) {
//            return lexIdentOrKeyword();
        } else {
//            return lexOperatorOrUnknown();
        }
        return  new Token(TokenType.None,new Object(),new Pos(0,0),new Pos(0,0));
    }

}
