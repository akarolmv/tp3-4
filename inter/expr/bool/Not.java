package inter.expr.bool;

import inter.expr.Expr;
import lexer.Token;

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
 * Funcionalidade: Implementa a funcionalidade do Not lótico.
 * </p>
 *
 * Criado em: 29 de nov de 2015
 */
public class Not extends Logical
{
  /**
   * Construtor.
   * 
   * @param tok Operador lógico.
   * @param x Expressão booleana.
   */
  public Not (Token tok, Expr x)
  {
    super(tok,x,x);
  }
  
  /**
   * Gera código de desvio para a expressão boleana B = ~B.
   * 
   * @param t True.
   * @param f False.
   */
  public void jumping(int t, int f)
  {
    expr2.jumping(f, t);
  }
  
  /*
   * (non-Javadoc)
   * @see inter.Logical#toString()
   */
  public String toString()
  {
    return op.toString()+" "+expr2.toString();
  }
}
