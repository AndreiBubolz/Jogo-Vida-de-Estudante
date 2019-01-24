package jogo;

import java.util.Random;

/**
 * Classe abstrata que engloba todos os personagens do jogo. 
 * @author Andrei
 */

public abstract class Personagem {
    private String nome;
    private int energia;
    private int danoPorGolpe;
    
    private int MAX_ENERGIA; 
    private static Random dado;

    public Personagem(String nome, int energia, int danoPorGolpe) {
        this.nome = nome;
        this.energia = energia;
        this.danoPorGolpe = danoPorGolpe;
        this.dado = new Random();
        MAX_ENERGIA = this.energia;
    }

    /**
     * 
     * @return energia do personagem.
     */
    public int pegaEnergia() {
        return energia;
    }
    
    /**
     * Seta valor de energia do personagem.
     * @param energia 
     */
    public void setEnergia(int energia){
        this.energia = energia;
    }
    /**
     * 
     * @return nome do personagem.
     */
    public String pegaNome() {
        return nome;
    }
    
    /**
     * Incrementa valor de energia do personagem.
     */
    public void incrementar() {
        if (energia < MAX_ENERGIA)
            energia++;
    }
    
    /**
     * Decrementa a energia do personagem recebendo um dano. Se o dano por negativo, é porq a defesa do heroi é maior que o ataque do vilao.
     * então não é considerado nenhum dano.
     * @param dano recebido por um vilao.
     */
    public void decrementar(int dano) {
        if(dano > 0){
            if (energia > 0)
                energia = energia-dano;
            }  
    }
    /**
     * 
     * @return valor do dano do golpe do personagem. 
     */
    public int getDanoPorGolpe(){
        return this.danoPorGolpe;
    }
    
    /**
     * Dado usado na batalha.
     * @return um numero aleatorio entre 1 e 6.
     */
    public int sorte() {
        return dado.nextInt(6) + 1;
    }
    
    /**
     * Seta valor do dano do personagem.
     * @param dano a aumentar.
     */
    public void setDano(int dano){
        this.danoPorGolpe = dano;
    }
    
    /**
     * Coloca o nome no personagem.
     * @param nome a colocar.
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    /**
     * 
     * @return Energia maxima do personagem.
     */
    public int getMaxEnergia(){
        
        return this.MAX_ENERGIA;
    }
    /**
     * Imprime informacao do personagem, excluido o heroi que possui seu proprio metodo.
     */
    public void imprimir() {
        Game.janela.textoInfo.setText("");
        Game.janela.textoInfo.append("Informações:\n");
        Game.janela.textoInfo.append("Nome: " + nome+"\n");
        Game.janela.textoInfo.append("Energia: " + energia+"\n");
        Game.janela.textoInfo.append("Dano por Golpe: " + danoPorGolpe+"\n");
        if(this instanceof VilaoChefao){
            VilaoChefao vilaoC = (VilaoChefao)this;
            Game.janela.textoInfo.append("Possui: " + vilaoC.pegaChave().getNomeItem()+"\n");
            Game.janela.textoInfo.append("Dinheiro: "+ vilaoC.pegaDinheiro()+"\n");
        }
        if(this instanceof VilaoNormal){
            VilaoNormal vilaoN = (VilaoNormal)this;
            Game.janela.textoInfo.append("Dinheiro: "+ vilaoN.pegaDinheiro()+"$ \n");   
        }
        
        if(energia <=0)
            energia = 0;
        System.out.println("#####################");
        System.out.println("# Nome: " + nome);
        System.out.println("# Energia: " + energia);
        System.out.println("# Dano por Golpe: " + danoPorGolpe);
        if(this instanceof VilaoChefao){
            VilaoChefao vilaoC = (VilaoChefao)this;
            System.out.println("# Possui: " + vilaoC.pegaChave().getNomeItem());
            System.out.println("# Dinheiro: "+ vilaoC.pegaDinheiro());
        }
        
        if(this instanceof VilaoNormal){
            VilaoNormal vilaoN = (VilaoNormal)this;
            System.out.println("# Dinheiro: "+ vilaoN.pegaDinheiro());
        }
        
        System.out.println("#####################");
    }
   
}
