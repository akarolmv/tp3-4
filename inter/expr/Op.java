package inter.expr;

import lexer.Token;
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
 * Funcionalidade: Implementa a função reduce(), 
 * retornando-o como um temporário.
 * </p>
 *
 * Criado em: 29 de nov de 2015
 */
public class Op extends Expr
{
  /**
   * Construtor.
   * 
   * @param tok Operador.
   * @param p Tipo.
   */
  public Op(Token tok, Type p)
  {
    super(tok,p);
  }
  
  /**
   * Para cada caso (operadores aritméticos/operadores unários/acesso em vetores), 
   * chama gen para gerar um termo, emite uma função para atribuir o termo a um 
   * novo nome temporário e retorna o temporário.
   * 
   * @return t Temporário.
   */
  public Expr reduce ()
  {
    Expr x = gen();
    Temp t = new Temp(type);
    emit(t.toString()+" = "+x.toString());
    return t;
  }
}
