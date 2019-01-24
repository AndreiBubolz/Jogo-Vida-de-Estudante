
package jogo;

/**
 * Item que o heroi poderá usar para recuperar sua saúde, aumentar poder de golpe/defesa temporariamente e aumentar o colete.
 * @author Andrei
 */

public class Consumivel extends Item {
    private int poderDeGolpeTemporario;
    private int poderRecuperacaoColete;
    private int poderDeCura;
    
    private int tempoRepelente;
    private boolean repelenteAtivo;
    
    private final int PODER_GOLPE_CAFE = 5;
    private final int PODER_COLETE_CAFE = 50;
    private final int PODER_CURA_CAFE = 10;

    private final int PODER_GOLPE_AGUA = 0;
    private final int PODER_COLETE_AGUA = 0;
    private final int PODER_CURA_AGUA = 20;

    private final int PODER_GOLPE_CEREAL = 1;
    private final int PODER_COLETE_CEREAL = 0;
    private final int PODER_CURA_CEREAL = 10;

    private final int PODER_GOLPE_RU = 0;
    private final int PODER_COLETE_RU = 100;
    private final int PODER_CURA_RU = -10;

    private final int PODER_GOLPE_CASA = 2;
    private final int PODER_COLETE_CASA = -25;
    private final int PODER_CURA_CASA = 20;
    
    /**
     * Controi objeto consumivel. Dando a ele nome, tamanho e valores atraves do parametros. Após isso, cada tipo de item é inicializado
     * de uma forma específica, com poder de golpe,de cura e de colete próprios.
     * @param nomeItem nome do item.
     * @param tamanho tamanho do item.
     * @param valor valor do item.
     */
    public Consumivel(String nomeItem,int tamanho,int valor) {
        super(nomeItem, tamanho ,valor);
        this.tempoRepelente = 5;
        this.repelenteAtivo = false;
        
        switch (nomeItem) {
            case "Cafe":
                inicializaCafe();
                break;
            case "Agua":
                inicializaAgua();
                break;
            case "Barra de Cereal":
                inicializaCereal();
                break;
            case "Ticket do RU":
                inicializaRU();
                break;
            case "Passagem para Casa":
                inicializaCasa();
                break;
            case "Repelente":
                inicializaRelelente();
                break;
            default:
                break;
        }
        
        
    }

    /**
     * 
     * @return valor do poder de cura do item. 
     */
    public int getPoderDeCura() {
        return poderDeCura;
    }

    /**
     * 
     * @return Quantos turnos o golpe será maior após o consumo do item.
     */
    public int getPoderDeGolpeTemporario() {
        return poderDeGolpeTemporario;
    }
    
    /**
     * 
     * @return O quanto o colete será recuperado após o consumo do item.
     */
    public int getPoderDeRecuperacaoColete(){
        return poderRecuperacaoColete;
    }
    
    /**
     * Inicializa valores fixos do item café. (Poder de golpe,poder de recuperação de colete e poder de cura)
     */
    private void inicializaCafe(){
        this.poderDeGolpeTemporario = this.PODER_GOLPE_CAFE;
        this.poderRecuperacaoColete = this.PODER_COLETE_CAFE;
        this.poderDeCura = this.PODER_CURA_CAFE;
        
    }
    
    /**
     * Inicializa valores fixos do item agua. (Poder de golpe,poder de recuperação de colete e poder de cura)
     */
    private void inicializaAgua(){
        this.poderDeGolpeTemporario = this.PODER_GOLPE_AGUA;
        this.poderRecuperacaoColete = this.PODER_COLETE_AGUA;
        this.poderDeCura = this.PODER_CURA_AGUA;
    }
    
    /**
     * Inicializa valores fixos do item barra de cereal. (Poder de golpe,poder de recuperação de colete e poder de cura)
     */
    private void inicializaCereal(){
        this.poderDeGolpeTemporario = this.PODER_GOLPE_CEREAL;
        this.poderRecuperacaoColete = this.PODER_COLETE_CEREAL;
        this.poderDeCura = this.PODER_CURA_CEREAL;
    }
    
    /**
     * Inicializa valores fixos do item ticket do ru. (Poder de golpe,poder de recuperação de colete e poder de cura)
     */
    private void inicializaRU(){
        this.poderDeGolpeTemporario = this.PODER_GOLPE_RU;
        this.poderRecuperacaoColete = this.PODER_COLETE_RU;
        this.poderDeCura = this.PODER_CURA_RU;
    }
    
    /**
     * Inicializa valores fixos do item passagem para casa. (Poder de golpe,poder de recuperação de colete e poder de cura)
     */
    private void inicializaCasa(){
        this.poderDeGolpeTemporario = this.PODER_GOLPE_CASA;
        this.poderRecuperacaoColete = this.PODER_COLETE_CASA;
        this.poderDeCura = this.PODER_CURA_CASA;
    }
   
    /**
     * Inicializa valores fixos do item repelente. (Poder de golpe,poder de recuperação de colete e poder de cura zerados) tempoRepelente 5.
     */
    private void inicializaRelelente(){
        this.poderDeGolpeTemporario = 0;
        this.poderRecuperacaoColete = 0;
        this.poderDeCura = 0;
        this.tempoRepelente = 5;
        this.repelenteAtivo = false;
    }
    /**
     * Decrementa tempo do repelente.Se acabar o tempo, desativa ele.
     */
    public void decRepelente(){
        this.tempoRepelente--;
        if(this.tempoRepelente == 0)
            this.repelenteAtivo = false;
    }
    /**
     * 
     * @return true se o repelente esta ativo. falso se não está.
     */
    public boolean estaRepelenteAtivo(){
        return (this.tempoRepelente>0 && this.repelenteAtivo);
    }
    
    /**
     * Ativa o repelente para uso, restringindo a ativação em outros itens.
     */
    public void ativaRepelente(){
        if(super.getNomeItem().equals("Repelente"))
            this.repelenteAtivo = true;
    }
    
    /**
     * 
     * @return tempo ativo do repelente. 
     */
    public int getTempoRepelente(){
        return this.tempoRepelente;
    }
}
