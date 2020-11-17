package JavaCompiler.scanner;

/**
 * 部分注释部分加 *, 表示选择性 Optional
 * 即在基础文法中没有要求(或直接不合法,一般直接不合法_(:з」∠)_)
 * 而在扩展文法中有所要求的 Token类型
 */

public enum TokenType {
    None,       // 空

    /* 无符号整数 Integer */
    Integer,    // classified as follows
    // Decimal && Hexadecimal
    Decimal,        // 十进制
    Hexadecimal,    // 十六进制

    /* 标识符 */
    Identify,   // <NoDigit> {<NoDigit>|<Digit>}
                // <NoDigit> -> 'a'-'z'|'A'-'Z'

    /* 保留字 */
    CONST,      // const
    VOID,       // void
    INT,        // int
    CHAR,       // char
    DOUBLE,     // double
    STRUCT,     // struct
    IF,         // if
    ELSE,       // else
    SWITCH,     // switch
    CASE,       // case
    DEFAULT,    // default
    WHILE,      // while
    FOR,        // for
    DO,         // do
    RETURN,     // return
    BREAK,      // break
    CONTINUE,   // continue
    PRINT,      // print
    SCAN,       // scan

    /* 操作符 */
    Plus,       // +
    Minus,      // -
    Mul,        // *
    Div,        // /
    Assign,     // =
    EqualTo,    // ==
    NoEqualTo,  // !=
    LessThan,   // <
    NoLessThan, // >=
    MoreThan,   // >
    NoMoreThan, // <=

    /* 标点字符 */
    LBrace,     // {
    RBrace,     // }
    LParen,     // (
    RParen,     // )
    LBracket,   // [ *
    RBracket,   // ] *

    Comma,      // ,
    Semicolon,  // ;

    ExclmMk,    // !

    /* 注释 */
    SLineCmt,   // single line comment
    MLineCmt,   // Multi line comment

    /* 文件结尾 */
    EOF,
}
