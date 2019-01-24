
package jogo;

/**
 * Item estátivo comprável, que quando ativo anula o golpe do vilão sobre o heroi.
 * @author Andrei
 */
public class Colete extends Item {
    private int duracao;
    
    private int DURACAO_MAXIMA = 5;
    
    public Colete(int preco) {
        super("Colete", 3, preco);
       
        duracao = DURACAO_MAXIMA;
    }
    
    public Colete() {
        super("Colete", 3, 0);
       
        duracao = DURACAO_MAXIMA;
    }
    
    /**
     * Retorna estado atual do colete do heroi.
     * @return Verdadeiro se o celete estiver ativo, falso se não estiver.
     */
    public boolean estaAtivo(){
        if(duracao > 0)
            return true;
        else
            return false;
    }
    
    /**
     * Decrementa o valor da duração do colete.
     * @param dec o quando sera decrementado.
     * Se o decremento deixar a duracao menor ou igual a 0, a duracao recebe 0. Se não, recebe o valor atual menos o decremento.
     */
    public void decDuracao(int dec){
        if(duracao-dec <= 0)
            duracao = 0;
        else
            duracao = duracao - dec;
    }
    
    /**
     * Quando usado um item específico , a duração do colete é incrementada pro máximo. Pode ser usado novamente.
     */
    public void colocaDuracaoMaxima(){
        duracao = DURACAO_MAXIMA;
    }
    
    /**
     * Quando comprado um colete melhor, a duração máxima é incrementada.
     * @param aumento é o quanto o colete vai ser melhorado.
     */
    public void aumentaDuracaoMaxima(int aumento){
        DURACAO_MAXIMA = DURACAO_MAXIMA + aumento;
    }
    
    /**
     * 
     * @return duração do colete do heroi.
     */
    public int getDuracao(){
        return this.duracao;
    }
    
    /**
     * 
     * @return Duração máxima atual do colete.
     */
    public int getDuracaoMaxima(){
        return this.DURACAO_MAXIMA;
    }
    
    /**
     *  Incremente duração do colete.
     * @param duracao é o quanto a duração aumentará.
     */
    public void incDuracao(int duracao){
        if(getDuracao()+duracao > this.DURACAO_MAXIMA)
            this.duracao = this.DURACAO_MAXIMA;
        else
            this.duracao = this.duracao + duracao;
    }
}
