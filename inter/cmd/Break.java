package inter.cmd;

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
 * Funcionalidade: Implementa o comando break, que passa 
 * o controle para fora do loop. A classe usa o campo stmt 
 * para guardar a construção do comando envolvente.
 * O código para um objeto Break é um desvio para o rótulo 
 * stmt.after, que marca a instrução imediatamente após o 
 * código para stmt.
 * </p>
 *
 * Criado em: 29 de nov de 2015
 */
public class Break extends Stmt
{
  public Stmt stmt;
  
  /**
   * Construtor.
   */
  public Break()
  {
    if(Stmt.Enclosing == null)
    {
      error("unenclosed break");
    }
    stmt = Stmt.Enclosing;
  }
  
  /*
   * (non-Javadoc)
   * @see inter.cmd.Stmt#gen(int, int)
   */
  public void gen(int b, int a)
  {
    emit("goto L"+stmt.after);
  }
}
