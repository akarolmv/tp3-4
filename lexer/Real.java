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
 * Funcionalidade: Define números de ponto flutuante.
 * </p>
 *
 * Criado em: 13 de out de 2015
 */
public class Real extends Token
{
  public final float value;
  
  public Real(float v)
  {
    super(Tag.REAL);
    value = v;
  }
  
  public String toString ()
  {
    return ""+value;
  }
}