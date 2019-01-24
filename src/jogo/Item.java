
package jogo;

/**
 * Classe abstrata que engloba todos itens do jogo.
 * @author Andrei
 */
abstract public class Item {
    private String nomeItem;
    private int tamanho;
    private int Valor;

    public Item(String nomeItem, int tamanho,int Valor) {
        this.nomeItem = nomeItem;
        this.tamanho = tamanho;
        this.Valor = Valor;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

   
    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void imprimir(Item item){
        Game.janela.textoInfo.setText("");
        Game.janela.textoInfo.append("Informações:\n");
        Game.janela.textoInfo.append("Item: "+item.getNomeItem()+"\n");
        
        if(item instanceof Consumivel){
           Game.janela.textoInfo.append("Poder de Cura: "+((Consumivel) item).getPoderDeCura()+"\n");         
                if(((Consumivel) item).getPoderDeGolpeTemporario() == 1 || ((Consumivel) item).getPoderDeGolpeTemporario() == 0)
                    Game.janela.textoInfo.append("Dano dobrado por: "+((Consumivel) item).getPoderDeGolpeTemporario()+" turno.\n");
                else
                    Game.janela.textoInfo.append("Dano dobrado por: "+((Consumivel) item).getPoderDeGolpeTemporario()+" turnos.\n");
                Game.janela.textoInfo.append("Efeito no colete: "+((Consumivel) item).getPoderDeRecuperacaoColete()+"%\n");
            }
        if(item instanceof Armadura){
            Game.janela.textoInfo.append("Poder de Ataque: "+((Armadura) item).getPoderDeAtaque()+"\n");
            Game.janela.textoInfo.append("Poder de Defesa: "+((Armadura) item).getPoderDeDefesa()+"\n");    
            }
        
        Game.janela.textoInfo.append("Peso: "+item.getTamanho()+"\n");
        Game.janela.textoInfo.append("Valor: "+item.getValor() +"$.\n");
        
        
    }
    
}
