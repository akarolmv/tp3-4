package inter.cmd;

import inter.expr.Expr;
import inter.expr.Id;
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
 * Funcionalidade: Implementa atribuições com um identificador 
 * no lado esquerdo e uma expressão à direita.
 * </p>
 *
 * Criado em: 29 de nov de 2015
 */
public class Set extends Stmt
{
  public Id id;
  
  public Expr expr;
  
  /**
   * Construtor.
   * Constrói um nó e verifica seus tipos.
   * 
   * @param i Id
   * @param x Expressão.
   */
  public Set(Id i, Expr x)
  {
    id = i;
    expr = x;
    if(check(id.type, expr.type) == null)
    {
      error("type error");
    }
  }
  
  /**
   * Verifica se dois tipos são iguais.
   * 
   * @param p1 Tipo 1.
   * @param p2 Tipo 2.
   * @return Resposta.
   */
  public Type check(Type p1, Type p2)
  {
    if(Type.numeric(p1) && Type.numeric(p2))
    {
      return p2;
    }
    else if(p1 == Type.Bool && p2 == Type.Bool)
    {
      return p2;
    }
    else
    {
      return null;
    }
  }
  
  /*
   * (non-Javadoc)
   * @see inter.cmd.Stmt#gen(int, int)
   */
  public void gen(int b, int a)
  {
    emit(id.toString()+" = "+expr.gen().toString());
  }
}
