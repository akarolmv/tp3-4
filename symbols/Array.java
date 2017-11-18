package symbols;

import lexer.Tag;

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
 * Funcionalidade: Os arranjos são o único tipo construído na linguagem fonte.
 * A chamada para super define o campo width, que é essencial para os cálculos
 * de endereço. Ela também define lexeme e tok para valores default que não 
 * são usados.
 * </p>
 *
 * Criado em: 13 de out de 2015
 */
public class Array extends Type
{
  /**
   * Arranjo *of* type
   */
  public Type of;
  
  /**
   * Número de elementos.
   */
  public int size = 1;
  
  /**
   * Construtor
   * 
   * @param sz - Tamanho do array
   * @param p - Tipo do array
   */
  public Array (int sz, Type p)
  {
    super("[]", Tag.INDEX, sz*p.width);
    size = sz;
    of = p;
  }
  
  public String toString ()
  {
    return "["+size+"] "+of.toString();
  }
}
