package jogo;

import javax.swing.JOptionPane;
import static jogo.Game.janela;

/**
 * Personagem principal do jogo. 
 * @author Andrei
 */

public class Heroi extends Personagem{
    private Mochila mochila;

    
    private final float DESCONTO_VENDA = 0.25f;
    private int contadorAtaqueTemporario;
    
    /**
     * Construtor do heroi. Recebe nome, energia e dano por golpe inicial.
     * @param nome nome do heroi
     * @param energia energia inicial do heroi
     * @param danoPorGolpe dano por golpe inicial do heroi.
     */
    public Heroi(String nome, int energia , int danoPorGolpe) {
        super(nome, energia,danoPorGolpe);
        this.mochila = new Mochila();
               
        this.contadorAtaqueTemporario = 0;
        
    }
    
    /**
     * Incrementa valor do contador temporário. Que controla quantos turnos o heroi ainda tem de dano dobrado.
     * @param valor O quanto o contador será incrementado.
     */
    public void incContadorTemp(int valor){
            this.contadorAtaqueTemporario = this.contadorAtaqueTemporario + valor;
    }
    
    /**
     * Decrementa 1 do contador temporario.
     */
    public void decContadorTemp(){
        this.contadorAtaqueTemporario--;
    }
    /**
     * 
     * @return Verdadeiro se o contador está ativo, false se não está. 
     */
    public boolean estaContadorAtivo(){
        if(this.contadorAtaqueTemporario > 0)
            return true;
        else
            return false;
    }
    
    /**
     * 
     * @return Mochila do heroi. 
     */
    public Mochila getMochila() {
        return mochila;
    }
    
    /**
     * Chama o método que printa na tela a mochila do heroi.
     */
    public void mostraMochila(){
        mochila.mostraMochilaHeroi();
    }
    
    /**
     * 
     * @return o tempo restante de ataque dobrado.
     */
    public int getContadorTemp(){
        return this.contadorAtaqueTemporario;
    }
    /**
     * incrementa a energia do heroi atraves de um consumivel ou item.
     * @param qntdAlimento quantidade que irá incrementar na energia.
     */
    public void alimentar(int qntdAlimento) {
        for(int x=0;x<qntdAlimento;x++)
            this.incrementar();
    }
    
    /**
     * Retirar energia do heroi.
     * @param qntoDesalimento o quanto irá tirar da energia.
     */
    public void desalimentar(int qntoDesalimento){
            this.decrementar(Math.abs(qntoDesalimento));
    }
    
    /**
     * Luta com um vilao. Cada um receberá um numero aleatorio entre 1 e 6 e quem tiver o numero maior ganhará o turno.
     * Se o heroi ganhar, chama o metodo para processar a vitoria.
     * Se o heroi perder, chama o medoto para processar a derrota.
     * Se empatar, chama os 2 metodos.
     * @param vilao que o heroi ira enfrentar.
     * @return O personagem que morrer no ataque. Null caso não morra ninguem.
     */
    public Personagem lutar(Personagem vilao) {
        int dadoHeroi = sorte();
        int dadoVilao = vilao.sorte();
        
        if (dadoHeroi == dadoVilao) {
            Game.janela.textoInfo.append("Empate!\n");
            vilao = vilaoPerde(vilao);
            heroiPerde(vilao);
        } else if (dadoHeroi > dadoVilao) {
            Game.janela.textoInfo.append("Você ganhou!\n");
            vilao = vilaoPerde(vilao);
        } else {
            Game.janela.textoInfo.append("Você perdeu!\n");
            heroiPerde(vilao);
        }
        
        if(super.pegaEnergia() <= 0)
            return this;
        else if(vilao.pegaEnergia() <= 0)
            return vilao;
        else
            return null;
    }
    /**
     * Caso o vilão perca o turno.
     * @param vilao atacado.
     * @return vilao apos processado os efeitos do ataque.
     */
    private Personagem vilaoPerde(Personagem vilao){
        if(Game.modoDeus)
            vilao.decrementar(1000);
        
        vilao.decrementar(this.getPoderAtaque());
        
        return vilao;
    }
    
    /**
     * Caso o heroi perca o turno.
     * Caso ele esteja com o colete ativo, o mesmo é decrementador em 1 e o heroi não sofre dano nenhum.
     * Caso o heroi esteja um vilao especifico, e possui o item certo, o dano é reduzido.
     * @param vilao atacante
     */
    private void heroiPerde(Personagem vilao){
          if(Game.modoDeus)
              return;
          
            if(estaColeteAtivo())
                decColete();
            else if(vilao instanceof VilaoNormal){
                    if(this.getMochila().estaRepelenteAtivo()){
                         this.decrementar( (int)(vilao.getDanoPorGolpe()/2)-this.getPoderDefesa());
                         this.getMochila().decRepelente();
                        }else
                         this.decrementar(vilao.getDanoPorGolpe()-this.getPoderDefesa());
                }else{
                if((vilao.pegaNome().equals("Professor de Calculo") && mochila.possuiLivroCalculo())         || 
                   (vilao.pegaNome().equals("Professor de Fisica") && mochila.possuiLivroFisica())           ||
                   (vilao.pegaNome().equals("Professor de Circuitos Digitais") && mochila.possuiLivroCD())   ||  
                   (vilao.pegaNome().equals("Professor de Programacao") && mochila.possuiLivroProg())         )
                      this.decrementar(vilao.getDanoPorGolpe()-this.getPoderDefesa()-1);  
                 else 
                    this.decrementar(vilao.getDanoPorGolpe()-this.getPoderDefesa());

                }
        }
    /**
     * Quando um comando de comprar é usado junto com um item.
     * O item é procurado na mochila e é verificado se o heroi possui o dinheiro suficiente.
     * Caso estiver e for um item de armadura, é chamado o metodo que substitui a respectiva peça antiga da armadura e já faz o pagamento com desconto.
     * Caso seja uma mochila, o tamanho da mochila do heroi é incrementada instantaneamente.
     * Se for um item consumivel, o item é apenas retirado da mochila do comerciante como nas outras compras, e colocado na mochila do heroi.
     * @param comerciante Pela qual se esta realizando a compra.
     * @param item Nome do objeto a ser comprado.
     */
    public void negociarComprar(Comerciante comerciante,String item){
        Mochila mochilaComerciante = comerciante.getMochila();
        
        Item itemComprar = mochilaComerciante.procuraItemMochila(item);
        
        if(itemComprar == null)
            System.out.println("O comerciante não possui o item "+item+".");
        else if(itemComprar instanceof Armadura){
            if(Game.modoDeus)
                mochila.substituiArmadura((Armadura)itemComprar);
            else if(this.mochila.getDinheiro() >= itemComprar.getValor()){
                mochilaComerciante.removeItem(itemComprar);
                mochila.substituiArmadura((Armadura)itemComprar);
                }
            else
                JOptionPane.showMessageDialog(janela,"Dinheiro insuficiente","Erro.",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(Game.modoDeus){
                if(itemComprar.getNomeItem().equals("Mochila Media")){
                    mochila.incTamanhoMochila("Mochila Media");
                    mochilaComerciante.removeItem(itemComprar);
                }else if(itemComprar.getNomeItem().equals("Mochila Grande")){
                    mochila.incTamanhoMochila("Mochila Grande");
                    mochilaComerciante.removeItem(itemComprar); 
                }else if(this.mochila.adicionaItem(itemComprar)){
                        mochilaComerciante.removeItem(itemComprar);
                }
            }else if(this.mochila.getDinheiro() >= itemComprar.getValor()){
                if(itemComprar.getNomeItem().equals("Mochila Media")){
                    mochila.incTamanhoMochila("Mochila Media");
                    mochilaComerciante.removeItem(itemComprar);
                    this.mochila.retiraDinheiro(itemComprar.getValor());    
                }else if(itemComprar.getNomeItem().equals("Mochila Grande")){
                    mochila.incTamanhoMochila("Mochila Grande");
                    mochilaComerciante.removeItem(itemComprar);
                    this.mochila.retiraDinheiro(itemComprar.getValor());    
                }else if(this.mochila.adicionaItem(itemComprar)){
                        mochilaComerciante.removeItem(itemComprar);
                        this.mochila.retiraDinheiro(itemComprar.getValor());
                }
            }else
               JOptionPane.showMessageDialog(janela,"Dinheiro insuficiente","Erro.",JOptionPane.ERROR_MESSAGE);
         
        }
    }
    
    /**
     * Quando um comando de vender é usado junto com um item.
     * O item é procurado na mochila do heroi.
     * Caso for encontrado, ele é retirado da mochila, o valor da venda é calculo de acordo com o desconto de 25%
     * e o valor é adicionado o dinheiro do heroi.
     * @param comerciante pela qual é feita a venda
     * @param item nome do item a ser vendido.
     */
    public void negociarVender(Comerciante comerciante,String item){
        Item itemVender = mochila.procuraItemMochila(item);
        
        if(itemVender==null){
            System.out.println("Você não possui o item "+item+".");
        }else{
            mochila.removeItem(itemVender);
            comerciante.getMochila().adicionaItem(itemVender);
            int valorVenda =  itemVender.getValor() - (int)(itemVender.getValor()*DESCONTO_VENDA);
            mochila.addDinheiro(valorVenda);
            System.out.println("Item "+itemVender.getNomeItem()+" vendido por "+ valorVenda+"$.");
            JOptionPane.showMessageDialog(janela,"Item "+itemVender.getNomeItem()+" vendido por "+ valorVenda+"$.","Item vendido",JOptionPane.INFORMATION_MESSAGE);
            
        }
    }
    
    /**
     * Quando um comando de usar item é usado junto com um item.
     * O item é procurado na mochila do heroi.
     * Caso for encontrado e não for um consumivel, uma mensagem de erro é mostrada.
     * Caso for encontrado e for um consumivel , é chamado os métodos de incremento de energia/dano/colete de cada tipo de item.
     * @param item nome do item a ser usado.
     */
    public void usarItem(String item){
        
        Item itemUsar = mochila.procuraItemMochila(item);
        
        
        if(itemUsar==null){
            System.out.println("Você não possui o item "+item+".");
        }else{
            
            if( !(itemUsar instanceof Consumivel)){
            JOptionPane.showMessageDialog(janela,"Item "+item+" não é consumivel!","Erro.",JOptionPane.ERROR_MESSAGE);
            System.out.println("Item "+item+" não é consumivel!");
            return;
            }
            
            Consumivel consumivel = (Consumivel)itemUsar;
            
            if(consumivel.getNomeItem().equals("Cafe")){
               this.alimentar(consumivel.getPoderDeCura());;
               this.incContadorTemp(consumivel.getPoderDeGolpeTemporario());
               if(getColete()!=null)
                this.getColete().incDuracao((int)(this.getColete().getDuracaoMaxima()/2));
            }else if(consumivel.getNomeItem().equals("Ticket do RU")){
               this.desalimentar(consumivel.getPoderDeCura());
               this.incContadorTemp(consumivel.getPoderDeGolpeTemporario());
               if(getColete()!=null)
               this.getColete().incDuracao(this.getColete().getDuracaoMaxima());
            }else if (consumivel.getNomeItem().equals("Passagem para Casa")){
               this.alimentar(consumivel.getPoderDeCura());
               this.incContadorTemp(consumivel.getPoderDeGolpeTemporario());
               if(getColete()!=null)
                 this.getColete().incDuracao(this.getColete().getDuracaoMaxima());
            }else if (consumivel.getNomeItem().equals("Repelente")){
               this.getMochila().ativaRepelente();
                System.out.println("Item Repelente ativado.");
               return; 
            }else{ 
               this.alimentar(consumivel.getPoderDeCura());
               this.incContadorTemp(consumivel.getPoderDeGolpeTemporario());
               if(getColete()!=null)
                  this.getColete().incDuracao(consumivel.getPoderDeRecuperacaoColete());
               }
            if(mochila.removeItem(itemUsar))
                System.out.println("Item "+itemUsar.getNomeItem()+" usado.");
            else
                System.out.println("Não foi possível usar o ítem "+itemUsar.getNomeItem()+".");
        }   
    }
    
    /**
     * 
     * @return o valor total de defesa somando todas as armaduras da mochila. 
     */
    public int getPoderDefesa(){
        return mochila.calculaDefesa();
    }
    
    /**
     * 
     * @return o valor total de ataque somando todas as armaduras da mochila e o dano proprio do heroi.
     * Caso estiver com o contador de dano ativo, o golpe é dobrado.
     */
    public int getPoderAtaque(){
        if(this.estaContadorAtivo())
            return (mochila.calculaAtaque()+super.getDanoPorGolpe())*2;
        else
            return mochila.calculaAtaque()+super.getDanoPorGolpe();
    }
    
    /**
     * Chama o metodo que adiciona uma chave a mochila do heroi.
     * @param chave coletada de um vilaoChefao.
     */
    public void addChave(Chave chave){
        Item item = (Item)chave;
        mochila.adicionaItem(item);
    }
    /**
     * 
     * @return duracao do colete do heroi em turnos.
     */
    private int getDuracaoColete(){

        return getColete().getDuracao();
    }
    
    /**
     * 
     * @return se o colete está ativo.
     */
    private boolean estaColeteAtivo(){
        Colete colete = getColete();
        if(colete == null)
            return false;
        else
        return colete.estaAtivo();
    }
    
    /**
     * 
     * @return o objeto colete do heroi.
     */
    public Colete getColete(){
        return (Colete)this.getMochila().procuraItemMochila("Colete");
    }
    
    /**
     * Decrementa a duracao do colete.
     */
    private void decColete(){
        Colete colete = (Colete)mochila.procuraItemMochila("Colete");
        
        colete.decDuracao(1);
    }
   
    /**
     * Imprime as informacoes do heroi.
     */
    public void imprimir() {
        

        if(super.pegaEnergia() <=0)
            super.setEnergia(0);
        System.out.println("#####################");
        System.out.println("# Nome: " + super.pegaNome());
        System.out.println("# Energia: " + super.pegaEnergia());
            if(estaColeteAtivo())
                System.out.println("# Colete Ativo. Duração restante: " + getDuracaoColete());
            else
                System.out.println("# Colete Não Ativo.");
            if(this.mochila.getTempoRepelente() > 0){
                if(this.mochila.estaRepelenteAtivo())
                    System.out.println("# Repelente Ativo. Duração restante: "+ this.mochila.getTempoRepelente());
                else
                    System.out.println("# Repelente Não Ativo. Duração restante: "+ this.mochila.getTempoRepelente());
            }  
            if(this.estaContadorAtivo())
                System.out.println("# Poder de Ataque: "+ this.getPoderAtaque()+" (Dobro de ataque por "+this.contadorAtaqueTemporario+" turnos.)");
            else 
                System.out.println("# Poder de Ataque: "+ this.getPoderAtaque());
        System.out.println("# Poder de Defesa: "+ this.getPoderDefesa());
        System.out.println("# Dinheiro: "+ mochila.getDinheiro());
        System.out.println("#####################");
    }
}
