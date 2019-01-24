
package jogo;

/**
 * Armadura do heroi. Elemento não consumível possuido pelo heroi, pela qual aumenta seus poderes de ataque e defesa.
 * @author Andrei
 */

public class Armadura extends Item {
    private final int poderDeDefesa;
    private final int poderDeAtaque;

    public Armadura(String nomeItem, int tamanho,int valor,int defesa,int ataque) {
        super(nomeItem, tamanho,valor);
        this.poderDeDefesa = defesa;
        this.poderDeAtaque = ataque;
    }
    /** 
     * @return Poder de defesa do Item Armadura. 
     */
    public int getPoderDeDefesa() {
        return poderDeDefesa;
    }

    /**
     * @return Poder de ataque do Item Armadura.
     */
    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }
    
    
}
