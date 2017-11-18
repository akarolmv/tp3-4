package inter.cmd;

import inter.expr.Expr;
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
 * Funcionalidade: Implementa um nó para o comando if.
 * </p>
 *
 * Criado em: 29 de nov de 2015
 */
public class If extends Stmt
{
  public Expr expr;
  
  public Stmt stmt;
  
  /**
   * Construtor.
   * 
   * @param x Expressão da condição if.
   * @param s Próximo estado.
   */
  public If(Expr x, Stmt s)
  {
    expr = x;
    stmt = s;
    if (expr.type != Type.Bool)
    {
      expr.error("boolean required in if");
    }
  }
  
  /*
   * (non-Javadoc)
   * @see inter.cmd.Stmt#gen(int, int)
   */
  public void gen(int b, int a)
  {
    int label = newLabel(); // Rótulo do código para stmt.
    expr.jumping(0, a);     // Segue se for true ou vai para a se for false.
    emitLabel(label);
    stmt.gen(label, a);
  }
}
