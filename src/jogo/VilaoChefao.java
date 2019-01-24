
package jogo;

/**
 * Vilao principal do jogo. Possui as chaves necessarias para passar de nivel.
 * @author Andrei
 */
public class VilaoChefao extends Vilao{
    private Chave chave;

    public VilaoChefao(String nome, int energia, int dinheiro, int dano, String nomeChave) {
        super(nome, energia, dinheiro, dano);
        this.chave = new Chave(nomeChave);
    }
    /**
     * Pega chave do vilao chefao.
     * @return a Chave do vilao.
     */
     public Chave pegaChave(){
        return this.chave;
    }
}
