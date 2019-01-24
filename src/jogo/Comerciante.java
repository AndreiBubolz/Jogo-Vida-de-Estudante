
package jogo;

/**
 * Personagem que compra e vende itens no jogo. Podendo ele ser um 'Comerciante' ou 'Bibliotecario'.
 * @author Andrei
 */

public class Comerciante extends Personagem {
    private Mochila mochilaComerciante;
    
    public Comerciante(String nome){
       super(nome,9999,0);
       
       mochilaComerciante = new Mochila();
       mochilaComerciante.retiraDinheiro(mochilaComerciante.getDinheiroInicial());
       mochilaComerciante.incTamanhoMochila("Mochila Comerciante");
    }
    /**
     * Chama o método que printa os itens da mochila do comerciante.
     */
    public void mostrarItens(){
        mochilaComerciante.mostraMochila();
    }
    /**
     * 
     * @return Mochila do comerciante. 
     */
    public Mochila getMochila(){
        return this.mochilaComerciante;
    }
}
