package inter.cmd;

import inter.expr.Node;

/**
 * Universidade Federal de Minas Gerais
 *
 * Disciplina: 
 *
 * Compiladores
 *
 * @author Isabel Bicalho Amaro
 * Matrícula: 2013431427
 *
 * <p>
 * Funcionalidade: Representa o estado na construção da 
 * árvore de sintaxe.
 * </p>
 *
 * Criado em: 29 de nov de 2015
 */
public class Stmt extends Node
{
  /**
   * Representa sequência vazia de comandos.
   */
  public static Stmt Null = new Stmt();
  
  /**
   * Utilizado para comandos break.
   */
  public static Stmt Enclosing = Stmt.Null;
  
  /**
   * Guarda rótulo after.
   * Marca a instrução imediatamente após o código para stmt.
   */
  public int after = 0;
  
  /**
   * Construtor.
   */
  public Stmt ()
  {
    
  }
  
  /**
   * Função para gerar código de três endereços.
   * Chamado com rótulos begin e after.
   * @param b .
   * @param a .
   */
  public void gen(int b, int a)
  {
    
  }
}
