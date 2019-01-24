package jogo;

import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import visual.JanelaPrincipal;

/**
 * Salas do mapa, que podem conter 'n' saidas, 'n' persogagens e 'n' itens.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Room 
{
    private String description;
    private HashMap<String, Room> exits;        // Armazena as saidas de cada sala.
    private HashMap<String, Personagem> personagens; //Armazena os personagens de cada sala
    private HashMap<String, Item> itens; //Armazena os itens de cada sala.

    /**
     * Cria uma sala inicialmente sem saidas.
     * Uma descricao é passada por parametro. Ex: na rua, no corredor, etc.
     * @param description A descrição da sala.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
        personagens = new HashMap<>();
        itens = new HashMap<>();
    }

    /**
     * Define uma saida para a sala.
     * @param direction a direção da saida.
     * @param neighbor  a sala que se terá acesso pela respectiva direção.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return Uma descrição curta da sala.
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Mostra uma descriçao completa do local.EX:
     *     Você está na sala 101.
     *     Saidas: norte sul leste
     * @return uma descriçaõ longa da sala.
     */
    public String getLongDescription()
    {
        System.out.println("======================================================================================================================");
       
        return "Você está " + description + ".\n" + getExitString() + "\n" + getCharactersString() + "\n" + getItensString();
    }

    /**
     * retorna uma string contendo as saidas da sala.
     * @return detalhes das saidas da sala.
     */
    private String getExitString()
    {
        String returnString = "Saídas:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * Retorna a sala que sera alcançada em ta direção.
     * @param direction A direção da saida.
     * @return A sala na dada direção.
     */
    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }
    
    /**
     * Insere um personagem na sala.
     * @param personagem o personagem a ser inserido.
     */
    public void insertCharacter(Personagem personagem) {
        personagens.put(personagem.pegaNome(), personagem);
    }
    
    /**
     * O método retorna uma string com o nome dos personagens da sala.
     * @return a string com a lista de nomes de personagens.
     */
    private String getCharactersString() {
        String returnString = "Personagens:";
        Set<String> keys = personagens.keySet();
        for(String character : keys) {
            returnString += " || " + character;
        }
        return returnString;
    }
    /**
     * O método retorna uma string com o nome dos itens da sala.
     * @return a string com o nome dos itens presentes na sala.
     */
    private String getItensString() {
        String returnString = "Itens:";
        Set<String> keys = itens.keySet();
        for(String item : keys) {
            returnString += " || " + item;
        }
        return returnString;
    }
    
    /**
     * 
     * @param name String com um nome de personagem;
     * @return retorna o personagem caso ele esteja na sala, null se nao estiver.
     */
    public Personagem getCharacter(String name) {
        return personagens.get(name);
    }
    
    /**
     * Exclui personagem da sala
     * @param X Personagem a ser excluido.
     * @return true se for excluido, false se não for.
     */
    public boolean excluiPersonagem(Personagem X,JanelaPrincipal janela){
        janela.atualizaGeral(0);
        return personagens.remove(X.pegaNome(), X);
    }
    
    /**
     * Verifica se há um personagem vendedor na sala.
     * @param room Sala a ser analizada
     * @return O vendedor, caso esteja na sala.
     */
    public Personagem procuraVendedor(Room room){
        Collection<Personagem> values = personagens.values();
        
        for(Personagem X: values){
            if(X instanceof Comerciante)
                return X;
        }
        return null;
    }
    
    /**
     * Verifica se há mais que 2 vilões na sala atual.
     * @return True se tiver 2 ou menos vilões. False se tiver mais de 2 vilões.
     */
    public boolean permitePassarSala(){
        int contador=0;
        
        Collection<Personagem> values = personagens.values();
        
        for(Personagem X: values){
            if(!(X instanceof Comerciante))
                contador++;
        }
        
        return contador <= 3;
        
    }
    
    /**
     * Adiciona um item a sala.
     * @param item a ser adicionado na sala.
     */
    public void addItem(Item item){
        itens.put(item.getNomeItem(), item);
    }
    
    public void excluiItem(Item item){
        itens.remove(item.getNomeItem(), item);
    }
    /**
     * Pega um item na sala recebendo um Objeto item.
     * @param item a ser procurado em forma de objeto Item.
     * @return o Item se estiver presente na sala. Null caso contrario.
     */
    public Item getItem(Item item){
        for(Item X: itens.values()){
            if(X.getNomeItem().equals(item.getNomeItem()))
                return X;
        }
        
        return null;
    }
    
    /**
     * Pega um item na sala recebendo uma string com o nome do objeto.
     * @param item a ser procurado em forma de string.
     * @return o Item se estiver presente na sala. Null caso contrario.
     */
    public Item getItem(String item){
        for(Item X: itens.values()){
            if(X.getNomeItem().equals(item))
                return X;
        }
        
        return null;
    }
    
    /**
     * 
     * @return HashMap com lista com personagens da sala atual. 
     */
    public HashMap<String,Personagem> getListaPersonagens(){
        return this.personagens;
    }
    
    public HashMap<String,Item> getListaItens(){
        return this.itens;
    }
}

