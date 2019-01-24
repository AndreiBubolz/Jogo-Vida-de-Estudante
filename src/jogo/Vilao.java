package jogo;

/**
 * Classe abstrata que engloba o VilaoChefao e o VilaoNormal.
 * @author Andrei
 */
public abstract class Vilao extends Personagem {
    private int dinheiro;
    
    public Vilao(String nome, int energia,int dinheiro, int dano) {
        super(nome, energia, dano);
        this.dinheiro = dinheiro;
    }
    /**
     * Retorna o quanto de dinheiro o vilão tem.
     * @return Montante de dinheiro possúido pelo vilão.
     */
    public int pegaDinheiro(){
        return this.dinheiro;
    }
    /**
     * Seta valor do dinheiro do vilao.
     * @param din a ser setado.
     */
    public void setDinheiro(int din){
        this.dinheiro = din;
    }

}
