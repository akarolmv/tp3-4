package symbols;

import java.util.Hashtable;

import inter.expr.Id;
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
 * Funcionalidade: Enquanto a classe Lexer mapeia as cadeias em palavras,
 * a classe Env mapeia tokens de palavra a objetos da classe Id.
 * </p>
 *
 * Criado em: 13 de out de 2015
 */
public class Env
{
  private Hashtable <Token, Id> table;
  
  protected Env prev;
  
  public Env(Env n)
  {
    table = new Hashtable <Token, Id>();
    prev = n;
  }
  
  public void put(Token w, Id i)
  {
    table.put(w, i);
  }
  
  public Id get(Token w)
  {
    for (Env e = this; e != null; e = e.prev)
    {
      Id found = (Id)(e.table.get(w));
      if (found != null)
      {
        return found;
      }
    }
    return null;
  }
}
