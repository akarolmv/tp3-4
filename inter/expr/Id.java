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
 * Funcionalidade: <Funcionalidade>
 * </p>
 *
 * Criado em: 29 de nov de 2015
 */
public class Id extends Expr
{
  /**
   * Endereço relativo do identificador.
   */
  public int offset;
  
  /**
   * Construtor.
   * 
   * @param id Identificador.
   * @param p Tipo.
   * @param b Offset.
   */
  public Id(Word id, Type p, int b)
  {
    super(id,p);
    offset = b;
  }
}
