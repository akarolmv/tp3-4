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
 * Funcionalidade: Define um número.
 * </p>
 *
 * Criado em: 13 de out de 2015
 */
public class Num extends Token
{
  public final int value;
  
  public Num (int v)
  {
    super(Tag.NUM);
    value = v;
  }
  
  public String toString ()
  {
    return ""+value;
  }
}
