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
 * Funcionalidade: Define um token.
 * </p>
 *
 * Criado em: 13 de out de 2015
 */
public class Token
{
  public final int tag;
  
  public Token(int t)
  {
    tag = t;
  }
  
  public String toString()
  {
    return ""+(char)tag;
  }
}
