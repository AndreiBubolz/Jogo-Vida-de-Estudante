
package jogo;

import java.util.ArrayList;
import java.util.List;

/**
 * Mochila pela qual o herói e os comerciantes possuem.
 * Itens podem ser adicionados e removidos. Há uma capacidade máxima de itens que pode ser aumentada comprando no comerciante.
 * A cada 100 dinheiro, 1 peso da mochila é usado.
 * @author Andrei
 */
public class Mochila {
    private ArrayList<Item> mochila;
    private int tamanhoMochila;
    private int qntdChaves;
    //private HashMap<String,String> listaItensUsaveis;
    
    private final int TAMANHO_INICIAL_MOCHILA = 30;
    private final int MOCHILA_MEDIA = 45;
    private final int MOCHILA_GRANDE = 60;
    
    private final int DINHEIRO_INICIAL = 150;
    
    private final float DESCONTO_VENDA = 0.25f;
    
    public Mochila() {
        this.mochila = new ArrayList();
        this.tamanhoMochila = TAMANHO_INICIAL_MOCHILA;
        int espaco = (int)(DINHEIRO_INICIAL/100);
        qntdChaves = 0;
        this.mochila.add(new Diversos("Dinheiro",espaco+1,DINHEIRO_INICIAL));

    }
              
    public ArrayList<Item> getArrayMochila(){
        return this.mochila;
    }
    
    public boolean adicionaItem(Item item){
        int somaTamanhos = getEspacoUsadoMochila();
        
        if(item.getNomeItem().equals("Colete"))
            removeColeteAntigo();

        if((somaTamanhos+item.getTamanho()) > tamanhoMochila ){
            System.out.println("Espaço insuficiente para adicionar "+item.getNomeItem()+" na mochila.");
            return false;
        }
        else{
            mochila.add(item);
            //System.out.println("Item "+item.getNomeItem()+" adicionado na mochila.");
            return true;
        }
    }
    
    private void removeColeteAntigo(){
        if(this.procuraItemMochila("Colete") != null)
            this.removeItem(this.procuraItemMochila("Colete"));
    }
    
    public boolean removeItem(Item item){
        
        for(Item X: mochila)
        {
            if(item.getNomeItem().equals(X.getNomeItem())){
                mochila.remove(X);
                return true;
            }
        }  
        return false;
    }
    
    public int getPrecoItem(String nome){
        for(Item X: mochila){
            if(X.getNomeItem().equals(nome))
                return X.getValor();
        }
        return 0;
    }
    
    public void addDinheiro(int valor) {
        int espaco;
        if(returnIndexDinheiro() == -1){
            espaco = (int)(valor/100);
            mochila.add(new Diversos("Dinheiro",espaco+1,valor));
            System.out.println(valor+"$ coletado. Agora você possui "+valor+"$.");
        }
        else{
                if(temEspacoMaisDinheiro(valor)){
                    int index = returnIndexDinheiro();
                    int valorAtual = mochila.get(index).getValor();
                    int novoValor = valorAtual + valor;
                    espaco = (int)(novoValor/100);
                    mochila.set(index, new Diversos("Dinheiro",espaco+1,novoValor));

                    System.out.println(valor+"$ coletado. Agora você possui "+mochila.get(index).getValor()+"$.");
                }else{
                    encheMochilaDinheiro();
                    
                }
    
        }
    }
    
    private boolean temEspacoMaisDinheiro(int valor){
        int espacoVago = this.tamanhoMochila - this.getEspacoUsadoMochila();
        
        int espaco1 = (int)(valor/100);
        int espaco2 = (int)(((int)(valor%100)+(int)(this.getDinheiro()%100))/100); 
        
        int espacoNecessario = espaco1+espaco2;
        
        if(espacoNecessario < espacoVago){
            return true;
        }else{
            return false;
        }
    }
    
    private void encheMochilaDinheiro(){
        int espacoVago = this.tamanhoMochila - this.getEspacoUsadoMochila();
        int dinheiro = this.getDinheiro();
        int dinheiroAux = dinheiro;
        
        while(espacoVago>0){
            dinheiro = dinheiro + (100 - (dinheiro%100));
            espacoVago--;
        }
        int index = returnIndexDinheiro();
        int espaco = (int)(dinheiro/100);
        mochila.set(index, new Diversos("Dinheiro",espaco+1,dinheiro));
        System.out.println(dinheiro-dinheiroAux+"$ coletado. Agora você possui "+mochila.get(index).getValor()+"$.");
        
    }
    
    public void retiraDinheiro(int valor) {
        int index = returnIndexDinheiro();
        int espacoAtual = (int)this.getDinheiro()/100;
        
        int novoEspaco;
        
        int espacoDiminuir = (int)(valor/100);
        
        if((valor%100) > (this.getDinheiro()%100))
            espacoDiminuir++;
        
        novoEspaco = espacoAtual - espacoDiminuir;
        if(valor > mochila.get(index).getValor())
            mochila.set(index, new Diversos("Dinheiro",novoEspaco+1,0)); 
        else
            mochila.set(index, new Diversos("Dinheiro",novoEspaco+1,mochila.get(index).getValor()-valor));

        System.out.println(valor+"$ gasto. Agora você possui "+mochila.get(index).getValor()+"$.");

            if(mochila.get(index).getValor()==0)
                mochila.remove(index);      
    }
    
    public int getDinheiro(){
        int index = returnIndexDinheiro();
        
        if(index==-1)
            return 0;
        else
            return mochila.get(index).getValor();
    }
    
    private int returnIndexDinheiro(){
        int index=-1;
        for(int i=0;i<mochila.size();i++)
        {
            if(mochila.get(i).getNomeItem().equals("Dinheiro"))
                index=i;
        }
        
        return index;
    }
    
    public void incTamanhoMochila(String tamanho){
        if(tamanho.equals("Mochila Media"))
            tamanhoMochila = MOCHILA_MEDIA;
        else if(tamanho.equals("Mochila Grande"))
            tamanhoMochila = MOCHILA_GRANDE;
        else if(tamanho.equals("Mochila Comerciante"))
            tamanhoMochila = 200;
    }
    
    public void mostraMochila(){
        System.out.println("_________________________");
        for(Item X: this.mochila){
            System.out.println("Item: "+X.getNomeItem());
            if(X instanceof Consumivel){
                System.out.println("Poder de Cura: "+((Consumivel) X).getPoderDeCura());
                if(((Consumivel) X).getPoderDeGolpeTemporario() == 1 || ((Consumivel) X).getPoderDeGolpeTemporario() == 0)
                    System.out.println("Dano dobrado por: "+((Consumivel) X).getPoderDeGolpeTemporario()+" turno.");
                else
                    System.out.println("Dano dobrado por: "+((Consumivel) X).getPoderDeGolpeTemporario()+" turnos.");
                System.out.println("Efeito no colete: "+((Consumivel) X).getPoderDeRecuperacaoColete()+"%");
            }
            if(X instanceof Armadura){
                System.out.println("Poder de Ataque: "+((Armadura) X).getPoderDeAtaque());
                System.out.println("Poder de Defesa: "+((Armadura) X).getPoderDeDefesa());
            }
            
            System.out.println("Peso: "+X.getTamanho());
            System.out.println("Valor: "+X.getValor() +"$.");
            System.out.println("_________________________");
        }
    }
    public void mostraMochilaHeroi(){
        System.out.println("Espaço total: "+this.tamanhoMochila + " || Espaço vago: "+ (this.tamanhoMochila-this.getEspacoUsadoMochila()));
        System.out.println("_________________________");
        for(Item X: this.mochila){
            System.out.println("Item: "+X.getNomeItem());
            if(X instanceof Consumivel){
                System.out.println("Poder de Cura: "+((Consumivel) X).getPoderDeCura());
                if(((Consumivel) X).getPoderDeGolpeTemporario() == 1 || ((Consumivel) X).getPoderDeGolpeTemporario() == 0)
                    System.out.println("Dano dobrado por: "+((Consumivel) X).getPoderDeGolpeTemporario()+" turno.");
                else
                    System.out.println("Dano dobrado por: "+((Consumivel) X).getPoderDeGolpeTemporario()+" turnos.");
                System.out.println("Efeito no colete: "+((Consumivel) X).getPoderDeRecuperacaoColete()+"%");
            }
            if(X instanceof Armadura){
                System.out.println("Poder de Ataque: "+((Armadura) X).getPoderDeAtaque());
                System.out.println("Poder de Defesa: "+((Armadura) X).getPoderDeDefesa());
            }
            int valorVenda = 0;
            if( X.getNomeItem().equals("Dinheiro"))
                valorVenda = X.getValor();
            else
                valorVenda =  X.getValor() - (int)(X.getValor()*DESCONTO_VENDA);
            System.out.println("Peso: "+X.getTamanho());
            if( X instanceof Colete)
                System.out.println("Duração: "+((Colete) X).getDuracao());
            System.out.println("Valor: "+valorVenda +"$.");
            System.out.println("_________________________");
        }
        System.out.println("_________________________");
    }
    
    public int getEspacoUsadoMochila(){
        int somaTamanhos = 0;
        for(Item X: mochila)
            somaTamanhos = somaTamanhos+X.getTamanho();
        
        return somaTamanhos;
    }
    
    public int getDinheiroInicial(){
        return this.DINHEIRO_INICIAL;
    }
    
    public Item procuraItemMochila(String item){
        Item itemM = null;
        
        for(Item X: mochila){
            if(X.getNomeItem().equals(item)){
                itemM = X;
            }
        }
        return itemM;
    }
    /*
    public String eUtilizavel(String item){
        for (Map.Entry<String,String> x : listaItensUsaveis.entrySet()){ 
            if(x.getKey().equals(item))
                return x.getValue();
        }
        
        return null;
    }
    */
    public int calculaDefesa(){
        int defesa=0;
        
        for(Item item: mochila){
            if(item instanceof Armadura)
               defesa = defesa + ((Armadura) item).getPoderDeDefesa();
                
        }
        return defesa;
    }
    
    public int calculaAtaque(){
        int ataque=0;
        
        for(Item item: mochila){
            if(item instanceof Armadura)
               ataque = ataque + ((Armadura) item).getPoderDeAtaque();    
        }
        return ataque;
    }
    
    public void substituiArmadura(Armadura armadura){
        Item retirar = null;
        switch (armadura.getNomeItem()) {
            case "Camisa Social":
                for(Item X: mochila){
                    if(X.getNomeItem().equals("Regata"))
                        retirar = X;
                }   
                break;
            case "Calca Social":
                for(Item X: mochila){
                    if(X.getNomeItem().equals("Bermuda"))
                        retirar = X;
                }   
                break;
            case "Sapato":
                for(Item X: mochila){
                    if(X.getNomeItem().equals("Chinelo"))
                        retirar = X;  
                }   
                break;
            
            /*case "Camisa Social":
                for(Item X: mochila){
                    if(X.getNomeItem().equals("Regata") || X.getNomeItem().equals("Camisa Social"))
                        retirar = X;
                }   
                break;
            case "Calca Social":
                for(Item X: mochila){
                    if(X.getNomeItem().equals("Bermuda") || X.getNomeItem().equals("Calca Social"))
                        retirar = X;
                }   
                break;
            case "Sapato":
                for(Item X: mochila){
                    if(X.getNomeItem().equals("Chinelo") || X.getNomeItem().equals("Sapato"))
                        retirar = X;  
                }   
                break;*/
            default:
                break;
        }
        
        if((tamanhoMochila - getEspacoUsadoMochila())   >=  (armadura.getTamanho()-retirar.getTamanho()) ){
            Item itemRetirar = procuraItemMochila(retirar.getNomeItem());
               if(itemRetirar!=null)
                   removeItem(itemRetirar);
               else
                   System.out.println("Não foi possivel retirar o item"+ itemRetirar.getNomeItem());
            this.adicionaItem(armadura);
            if(!Game.modoDeus)
            this.retiraDinheiro(armadura.getValor() - (itemRetirar.getValor() - (int)(itemRetirar.getValor() - DESCONTO_VENDA)));
        }else{
            System.out.println("Espaço insuficiente para trocar "+armadura.getNomeItem()+" por "+retirar.getNomeItem());
            System.out.println(armadura.getTamanho()+"-"+retirar.getTamanho()+">="+"("+tamanhoMochila + "-" + getEspacoUsadoMochila());
        }
        
    }
    
    public boolean possuiLivroFisica(){
       
        Item item = this.procuraItemMochila("Livro de Fisica");
        if(item == null)
            return false;
        else
            return true;      
    }
    
    public boolean possuiLivroCalculo(){
       
        Item item = this.procuraItemMochila("Livro de Calculo");
        
        if(item == null)
            return false;
        else
            return true; 
    }
    
    public boolean possuiLivroCD(){
       
        Item item = this.procuraItemMochila("Livro de CD");
        
        if(item == null)
            return false;
        else
            return true; 
    }
    
    public boolean possuiLivroProg(){
       
        Item item = this.procuraItemMochila("Livro de Programacao");
        
        if(item == null)
            return false;
        else
            return true; 
    }
    
    public boolean temTodasChaves1(){
        Item chave1,chave2,chave3,chave4 = null;
        qntdChaves=0;
        chave1 = procuraItemMochila("Chave 1 - Prof. CD");
        chave2 = procuraItemMochila("Chave 2 - Prof. Programacao");
        chave3 = procuraItemMochila("Chave 3 - Prof. Calculo");
        chave4 = procuraItemMochila("Chave 4 - Prof. Fisica");
        
        Chave ch = new Chave("");
        
        if(chave1 != null)
            qntdChaves++;
        if(chave2 != null)
            qntdChaves++;
        if(chave3 != null)
            qntdChaves++;
        if(chave4 != null)
            qntdChaves++;
        
        if(chave1 != null && chave2 != null && chave3 != null && chave4 != null)
            return true;
        else{
            //System.out.println("Você tem "+qntdChaves+" chaves. Colete as "+ (ch.getNUMERO_CHAVES_ANO1()-qntdChaves)+" chaves restantes para poder usar o elevador e passar para o segundo ano.");
            return false;
         }
    }
    
    public int getNumeroChaves(){
        return this.qntdChaves;
    }
    
    public boolean estaRepelenteAtivo(){
        Consumivel repelente = (Consumivel)this.procuraItemMochila("Repelente");
        if(repelente == null)
            return false;
        
        return repelente.estaRepelenteAtivo();
    }
    
    public void ativaRepelente(){
        Consumivel repelente = (Consumivel)this.procuraItemMochila("Repelente");
        repelente.ativaRepelente();
    }
    
    public void decRepelente(){
        Consumivel repelente = (Consumivel)this.procuraItemMochila("Repelente");
        repelente.decRepelente();
        
        if(!repelente.estaRepelenteAtivo())
            this.removeItem((Item)repelente);
        
    }
    
    public int getTempoRepelente(){
        Consumivel repelente = (Consumivel)this.procuraItemMochila("Repelente");
        
        if(repelente == null)
            return -1;
        else
            return repelente.getTempoRepelente();
    }
    
    public int getTamanhoMochila(){
        return this.tamanhoMochila;
    }
}



