package lexer;

/**
 * Universidade Federal de Minas Gerais
 *
 * Disciplina: 
 *
 * Compiladores I
 *
 * @author Isabel Bicalho Amaro
 * Matrícula: 2013431427
 *
 * <p>
 * Funcionalidade: Gerencia lexemas para palavras reservadas, identificadores
 * e tokens compostos como &&. Ela também é útil para gerenciar a forma
 * escrita dos operadores no código intermediáro, como o menos unário.
 * </p>
 *
 * Criado em: 13 de out de 2015
 */
public class Word extends Token
{
  public static final Word and = new Word ("&&",Tag.AND);
  
  public static final Word or = new Word ("||",Tag.OR);
  
  public static final Word eq = new Word ("==",Tag.EQ);
  
  public static final Word le = new Word ("<=",Tag.LE);
  
  public static final Word ge = new Word (">=",Tag.GE);
  
  public static final Word ne = new Word ("!=",Tag.NE);
  
  public static final Word minus = new Word ("minus",Tag.MINUS);
  
  public static final Word True = new Word ("true",Tag.TRUE);
  
  public static final Word False = new Word ("false",Tag.FALSE);
  
  public static final Word temp = new Word ("t",Tag.TEMP);
  
  public String lexeme = "";
  
  public Word(String s, int tag)
  {
    super(tag);
    lexeme = s;
  }
  
  public String toString()
  {
    return lexeme;
  }
}
