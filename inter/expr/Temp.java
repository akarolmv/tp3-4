package inter.expr;

import lexer.Word;
import symbols.Type;

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
 * Funcionalidade: Cria um temporário. Os nomes dos temporários têm 
 * tipo como todas as outras expressões. O construtor Temp é chamado 
 * como um tipo como parâmetro.
 * </p>
 *
 * Criado em: 29 de nov de 2015
 */
public class Temp extends Expr
{
  /**
   * Contador de temporários.
   */
  public static int count = 0;
  
  /**
   * Código do temporário.
   */
  public int number = 0;
  
  /**
   * Construtor.
   * 
   * @param p Tipo do temporário.
   */
  public Temp(Type p)
  {
    super(Word.temp,p);
    number = ++count;
  }
  
  /*
   * (non-Javadoc)
   * @see inter.Expr#toString()
   */
  public String toString()
  {
    return "t"+number;
  }
}
