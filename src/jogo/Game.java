package jogo;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import visual.*;
/**
 * Classe onde é construido e rodado o jogo. Incluindo mapas, personagens e itens.
 * @author Andrei
 */

public class Game 
{    
    private Parser parser;
    public Room currentRoom;
    public Heroi heroi;
    public static JanelaPrincipal janela;
    public static boolean modoDeus = false;
    public boolean vitoria;
    public boolean desistiu;
    
    private final Random random;
    private Mochila todosItens;
    public static Thread thread;
    private final int ENERGIA_INICIAL_HEROI = 100;
    private final int DANO_INICIAL_HEROI = 0;
    
    private final int TAMANHO_REGATA = 4;
    private final int TAMANHO_CHINELO = 2;
    private final int TAMANHO_BERMUDA = 4;
    private final int TAMANHO_AGUA = 2;
    private final int TAMANHO_CAFE = 2;
    private final int TAMANHO_CEREAL = 1;
    private final int TAMANHO_TICKET_RU = 1;
    private final int TAMANHO_PASSAGEM = 1;
    private final int TAMANHO_MOCHILA_MEDIA = 0;
    private final int TAMANHO_CAMISETA = 5;
    private final int TAMANHO_CALCA = 6;
    private final int TAMANHO_TENIS = 4;
    private final int TAMANHO_LIVRO = 2;
    private final int TAMANHO_REPELENTE = 2;
    
    
    private final int PRECO_REGATA = 15;
    private final int PRECO_CHINELO = 10;
    private final int PRECO_BERMUDA = 20;
    private final int PRECO_AGUA = 20;
    private final int PRECO_CAFE = 40;
    private final int PRECO_CEREAL = 15;
    private final int PRECO_TICKET_RU = 20;
    private final int PRECO_PASSAGEM = 20;
    private final int PRECO_MOCHILA_MEDIA = 60;
    private final int PRECO_CAMISETA = 35;
    private final int PRECO_CALCA = 40;
    private final int PRECO_TENIS = 25;
    private final int PRECO_LIVRO_CD = 15;
    private final int PRECO_LIVRO_PROG = 10;
    private final int PRECO_LIVRO_CALC = 20;
    private final int PRECO_LIVRO_FIS = 20;
    private final int PRECO_REPELENTE = 15;
    private final int PRECO_COLETE = 30;
    
    private final int ATQ_ARM_INICIAL = 1;
    private final int DFS_ARM_INICIAL = 1;
    
    private final int ATAQUE_CAMISETA = 2;
    private final int ATAQUE_CALCA = 3;
    private final int ATAQUE_TENIS = 4;
        
    private final int DEFESA_CAMISETA = 3;
    private final int DEFESA_CALCA = 2;
    private final int DEFESA_TENIS = 1;
    
    /**
     * 
     * Cria a primeira fase do jogo e inicializa o Herói com sua mochila.
     * @param jan janela principal
     */
    public Game(JanelaPrincipal jan) 
    {
        criaNivel1();
        parser = new Parser();
        heroi = new Heroi("Estudante",ENERGIA_INICIAL_HEROI,DANO_INICIAL_HEROI);
        criaMochilaInicial();
        random  = new Random();
        janela = jan;
        todosItens = new Mochila();
        vitoria = false;
        desistiu = false;
        //thread = new Thread(semAr);
        //thread.setDaemon(true);
        //thread.start();
        
        criaMochilaTodosItens();
        
    }

    /**
     * Cria o mapa(salas) e os personagens(vilões e comerciantes) do nivel 1.
     */
    private void criaNivel1()
    {
        Room salaSecreta1,salaSecreta2,banheiro,sala101,sala102,sala103,sala104,rua,biblioteca,corredor, labProg, labCD, salaCalculo, salaFisica, cantina,elevador;
      
        // Cria e inicializa as salas e suas saias/entradas.
        sala101 = new Room("na sala 101");
        sala102 = new Room("na sala 102");
        sala103 = new Room("na sala 103");
        sala104 = new Room("na sala 104");
        salaSecreta1 = new Room("na sala secreta 1");
        salaSecreta2 = new Room("na sala secreta 2");
        rua = new Room("na rua");
        biblioteca = new Room("na biblioteca");
        corredor = new Room("no corredor da computação");
        labProg = new Room("no laboratório de programação");
        labCD = new Room("no laboratório de circuitos digitais");
        salaCalculo = new Room("na sala de cálculo");
        salaFisica = new Room("na sala de física");
        cantina = new Room("na cantina");
        elevador = new Room("no elevador");
        banheiro = new Room("no banheiro");
        
        salaSecreta1.setExit("norte", salaSecreta2);
        salaSecreta1.setExit("sul", cantina);
        
        salaSecreta2.setExit("sul", salaSecreta1);
        
        sala101.setExit("norte", labCD);
        sala101.setExit("sul",corredor);
        sala101.setExit("oeste", sala102);
        
        sala102.setExit("leste", sala101);
       
        sala103.setExit("norte", corredor);
        sala103.setExit("sul",sala104);
        sala103.setExit("leste", biblioteca );
        
        sala104.setExit("norte", sala103);
        sala104.setExit("sul", salaFisica);
        
        rua.setExit("leste", cantina);
        rua.setExit("sul", labProg);
        
        biblioteca.setExit("oeste", sala103);
        
        corredor.setExit("norte", sala101);
        corredor.setExit("sul", sala103);
        corredor.setExit("leste", elevador);
        corredor.setExit("oeste", cantina);
        
        labProg.setExit("norte", rua);
        
        labCD.setExit("sul", sala101);

        salaCalculo.setExit("oeste", salaFisica);
        
        salaFisica.setExit("norte", sala104);
        salaFisica.setExit("leste", salaCalculo);

        cantina.setExit("leste", corredor);
        cantina.setExit("oeste", rua);
        cantina.setExit("sul", banheiro);
        cantina.setExit("norte", salaSecreta1);
        
        banheiro.setExit("norte", cantina);
        
        // Insere personages ------------------------
        labProg.insertCharacter(new VilaoChefao("Professor de Programacao",40,20,5,"Chave 2 - Prof. Programacao"));//energia,dinheiro,dano
        labCD.insertCharacter(new VilaoChefao("Professor de Circuitos Digitais",40,20,8,"Chave 1 - Prof. CD"));
        salaCalculo.insertCharacter(new VilaoChefao("Professor de Calculo",60,40,15,"Chave 3 - Prof. Calculo"));
        salaFisica.insertCharacter(new VilaoChefao("Professor de Fisica",40,30,20,"Chave 4 - Prof. Fisica"));
        
        cantina.insertCharacter(criaPrimeiroComerciante());
        biblioteca.insertCharacter(criaBibliotecario());
        
        //Insere Itens -----------------------
        
        banheiro.addItem(new Consumivel("Agua",TAMANHO_AGUA,PRECO_AGUA));
        sala102.addItem(new Consumivel("Cafe",TAMANHO_CAFE,PRECO_CAFE));
        rua.addItem(new Consumivel("Repelente",2,25));
        
        salaSecreta2.addItem(new Diversos("Livro de CD",TAMANHO_LIVRO,PRECO_LIVRO_CD));
        salaSecreta2.addItem(new Diversos("Livro de Programacao",TAMANHO_LIVRO,PRECO_LIVRO_PROG));
        salaSecreta2.addItem(new Diversos("Livro de Calculo",TAMANHO_LIVRO,PRECO_LIVRO_CALC));
        salaSecreta2.addItem(new Diversos("Livro de Fisica",TAMANHO_LIVRO,PRECO_LIVRO_FIS));

        salaSecreta1.addItem(new Consumivel("Agua",TAMANHO_AGUA,PRECO_AGUA));
        salaSecreta1.addItem(new Consumivel("Cafe",TAMANHO_CAFE,PRECO_CAFE));
        salaSecreta1.addItem(new Consumivel("Ticket do RU",TAMANHO_TICKET_RU,PRECO_TICKET_RU));
        salaSecreta1.addItem(new Consumivel("Passagem para Casa",TAMANHO_PASSAGEM,PRECO_PASSAGEM));
        salaSecreta1.addItem(new Consumivel("Repelente",TAMANHO_REPELENTE,PRECO_REPELENTE));
        
        salaSecreta1.addItem(new Colete(0));
        
        
        currentRoom = corredor;  // começa o jogo no corredor.
    }
    
    /**
     * Cria o mapa(salas) e os personagens(vilões e comerciantes) do nivel 2.
     */
    private void criaNivel2(){
        System.out.println();
        System.out.println("Parabéns, você passou para o 2º ano.");
        System.out.println("Seus desafios serão aumentados para testar suas capacidades de sobrevivência.");
        
        Room corredor;
        
        corredor = new Room("no corredor da computação");
        
        currentRoom = corredor;
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
        
        
    }
    
    /**
     *  Loop principal do jogo. Roda até ser inserido um 'sair' ou o heroi morrer.
     */
    public void play() 
    {            
        printWelcome();
      
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        
    }

    /**
     * Printa as boas vindas ao jogador.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Bem vindo ao Vida de Estudante!");
        System.out.println("Vida de Estudante é um jogo baseado no dia a dia de um estudante de engenharia de computação.");
        System.out.println("Digite 'ajuda' caso precise de auxílio.");
        System.out.println();
        System.out.println("Bem vindo ao 1º ano. Supere os desafios do dia a dia e prossiga na graduação.");
        System.out.println(currentRoom.getLongDescription());
        
    }

    /**
     * Método que processa o comando recebido.
     * @param command Comando a ser processado
     * @return True se o comando encerra o jogo, false caso contrário.
     */
    public boolean processCommand(Command command) 
    {
        boolean finalizarJogo = false;

        if(command.isUnknown()) {
            System.out.println("Comando não reconhecido...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("ajuda")) {
            printarAjuda();
        }
        else if (commandWord.equals("ir")) {
            irSala(command);
        }
        else if (commandWord.equals("sair")) {
            finalizarJogo = sair(command);
        }
        else if (commandWord.equals("atacar")) {
            finalizarJogo = atacar(command);
        }
        else if (commandWord.equals("info")) {
            info(command);
        }
        else if (commandWord.equals("falar")){
            falar(command);
        }
        else if(commandWord.equals("comprar")){
            comprar(command);
        }else if(commandWord.equals("vender")){
            vender(command);
        }else if(commandWord.equals("usar")){
            usar(command);
        }else if(commandWord.equals("pegar")){
            pegar(command);
        }
        // else command not recognised.
        return finalizarJogo;
    }

    // implementations of user commands:

    /**
     * Mostrar a ajuda ao usuário.
     * São apresentadas as palavras de comando disponíveis. 
     */
    private void printarAjuda() 
    {
        System.out.println("Você está cansado. Você está sozinho. Você está");
        System.out.println("perambulando pela universidade.");
        System.out.println();
        System.out.println("Seus possíveis comandos são:");
        parser.showCommands();
    }

    /** 
     * Tenta ir para uma sala.
     * Se a sala for valida e houver menos que 4 viloes na sala atual, será concedida a ida para a proxima sala.
     * Um fator aleatorio decidirá se haverá novo viloes na proxima sala.
     */
    private void irSala(Command command) 
    {
        
        if(!command.hasSecondWord()) {
            System.out.println("Ir onde?");
            return;  //Caso não houver segundo comando,é perguntado pra onde deseja ir.
        }
        
        
        
        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);
       
     
        if (nextRoom == null) { //Caso a direcao recebido seja invalida, ou nao esteja presente na sala atual.
            JOptionPane.showMessageDialog(janela,"Não há passagem pelo lado "+command.getSecondWord()+"!","Erro",JOptionPane.ERROR_MESSAGE);
        }else{
            if(nextRoom.getShortDescription().equals("no elevador")){ //Se a sala que for solicitada a ida seja o elevador, é verificado se o heroi poossui as chaves necessarias para ir
                if(heroi.getMochila().temTodasChaves1()){             // e passar de nivel.
                    criaNivel2();
                    vitoria = true;
                    }else{
                 JOptionPane.showMessageDialog(janela,"Você tem "+ heroi.getMochila().getNumeroChaves()+" chaves.\nColete as "+(4-heroi.getMochila().getNumeroChaves())+" restantes para poder usar o elevador.","Erro.",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                if(!currentRoom.permitePassarSala()){
                    JOptionPane.showMessageDialog(janela,"Você não pode sair de uma sala com mais que 3 vilões!","Erro",JOptionPane.ERROR_MESSAGE); //O vilão só poderá mudar de sala caso haja 3 vilões ou menos na sala atual.
                }else{
                    currentRoom = nextRoom;
                    addItemAleatorio();     // Quando muda de sala, 4% de achar um novo item,
                    addVilaoNormalAleatorio(); //Quando muda de sala. 33% de adicionar um novo vilaoNormal.
                    System.out.println(currentRoom.getLongDescription());
                    }
                }
            }
    }

    /** 
     * Se 'sair' for o comando, o jogo é encerrado.
     */
    private boolean sair(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Sair do quê?");
            return false;
        }
        else {
            return true;  
        }
    }
    
    /**
     * Quando um comando de ataque é realizado.
     * @param command comando recebido com o nome do vilao a ser atacado.
     * @return true se o heroi morrer, false caso seguir vivo.
     */
    private boolean atacar(Command command) 
    {
        if(!command.hasSecondWord()) {
            System.out.println("Atacar quem?"); //Caso não haja um nome de vilao a ser atacado, retorna falso.
            return false;
        }

        String vilao = command.getSecondWord();

        Personagem personagem = currentRoom.getCharacter(vilao);

        if (personagem == null) {
            System.out.println("Não há um personagem com esse nome!"); //Caso não haja um vilao com o nome passado.
            return false;
        }
        else {
            if(personagem instanceof Comerciante){
                JOptionPane.showMessageDialog(janela,"Não é possível atacar um comerciante","Erro.",JOptionPane.ERROR_MESSAGE);  //Se o nome for de um comerciante, o heroi é impedido de atacar.
                return false;
            }else{
                //System.out.println("Info dos personagens antes do ataque:");
                //heroi.imprimir();
                //personagem.imprimir();
                heroi.decContadorTemp(); //Decrementa contador do heroi que dobra ataque. Independente de vitoria ou derrota.
                System.out.println("Info dos personagens após o ataque:");
                Personagem X = heroi.lutar(personagem); // chama metodo de luta, onde é processado os danos.
                heroi.imprimir();
                personagem.imprimir();
                
                if(X != null){
                    if(X instanceof Heroi){
                        gameOver(personagem);     // Se o retorno do metodo lutar for um heroi, significa que ele está morto. Estão é retornado true e o jogo encerrado.
                        return true;
                        }
                    else{
                        retiraPersonagem(X);
                        recolheChaveVilao(personagem);
                        recolheDinheiroVilao(personagem); // Se o retorno do metodo lutar for um vilao, significa que o vilao está morto. É recolhido o dinheiro e a chave do mesmo.
                        
                        return false;
                    }
                }
            }
        }
        return false;
    }
    /**
     * Tenta falar com o personagem passado.
     * @param command comando com o comando de falar e o nome do personagem.
     */
    private void falar(Command command){
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Falar com quem?");
            return;  
        }
        
        String nome = command.getSecondWord();
        Personagem personagem = currentRoom.getCharacter(nome);
        
        if(personagem == null){
            System.out.println("Não há um personagem com esse nome!");
        }else{
            if(personagem instanceof Comerciante){
                System.out.println("Você deseja comprar ou vender?");
                Comerciante comerciante = (Comerciante)personagem;
                System.out.println("Digite 'comprar' para mostrar os itens do comerciante. ");
                System.out.println("Digite 'vender' para mostrar seus itens. ");
            }else if(personagem instanceof VilaoNormal)
                JOptionPane.showMessageDialog(janela,"Você está tentando conversar com um(a) "+personagem.pegaNome()+"? Melhor dar um tempo na engenharia...","Erro.",JOptionPane.ERROR_MESSAGE);  
            else{
                JOptionPane.showMessageDialog(janela,personagem.pegaNome() + " não quer conversar com você.","Erro.",JOptionPane.ERROR_MESSAGE);  
            }
        }
      
    }
    /**
     * Tenta comprar item de comerciante presente na sala.
     * @param command comando com nome do item a ser comprado.
     */
    private void comprar(Command command){
        Personagem personagem = currentRoom.procuraVendedor(currentRoom);  //Verifica se há vendedor na sala.
        if(personagem == null){
            JOptionPane.showMessageDialog(janela,"Não há nenhum comerciante nessa sala.","Erro.",JOptionPane.ERROR_MESSAGE);    //Se não houver, retorna.
            return;
        }else{
            if(!command.hasSecondWord()) {
                System.out.println("Comprar o quê?");
                Comerciante comerciante = (Comerciante)personagem;   //Se houver, e o comando comprar estiver sozinho, é mostrada a mochila completa do comerciante.
                System.out.println("Itens do comerciante: ");
                comerciante.mostrarItens();
                return;
                }
            }

            String itemComprar = command.getSecondWord();

            heroi.negociarComprar((Comerciante)personagem,itemComprar);      //Se houver segunda palavra, é invocado o método de compra do heroi.
        }
    /**
     * Tenta vender item da mochila caso haja vendedor presente na sala.
     * @param command comando com nome do item a ser vendido.
     */
    private void vender(Command command){
        Personagem personagem = currentRoom.procuraVendedor(currentRoom);  //Verifica se há vendedor na sala.
        if(personagem == null){
           JOptionPane.showMessageDialog(janela,"Não há nenhum comerciante nessa sala.","Erro.",JOptionPane.ERROR_MESSAGE);  //Se não houver, retorna.
           return;
        }else{
            if(!command.hasSecondWord()) {
                System.out.println("Vender o quê?"); //Se houver, e o comando vender estiver sozinho, é mostrada a mochila completa do heroi.
                System.out.println("Seus Itens: ");
                heroi.mostraMochila();
                return;
                }
            }

            String itemVender = command.getSecondWord();

            heroi.negociarVender((Comerciante)personagem,itemVender);  //Se houver segunda palavra, é invocado o método de venda do heroi.
        }
    
    /**
     * Tenta usar o item, caso esteja presenta na mochila.
     * @param command com o nome do item a ser usado.
     */
    private void usar(Command command){
        if(!command.hasSecondWord()) {
            System.out.println("Usar o quê?"); //Se não houver segunda palavra no comando. 
            return;
        }
        
        String itemUsar = command.getSecondWord(); 
        
        heroi.usarItem(itemUsar);           // Se houve segunda palavra, é invocado o método de uso do item.
    }
    
    /**
     * Tenta pegar um item da sala. Caso ele existir e houver espaço na mochila, ele é adicionado.
     * @param command com o nome do item a ser pego.
     */
    private void pegar(Command command){
        if(!command.hasSecondWord()) {
            System.out.println("Pegar o quê?"); //Se não houver segunda palavra no comando. 
            return;
        }
        
        Item item = currentRoom.getItem(command.getSecondWord());
        
        if(item == null)
            System.out.println("Não há um item "+command.getSecondWord()+" nessa sala.");
        else{
           heroi.getMochila().adicionaItem(item);   
            currentRoom.excluiItem(item);
            }
        
    }
    /**
     * Printa informações da sala, dos personagens e da mochila.
     * @param command 
     */
    private void info(Command command) 
    {
        if(!command.hasSecondWord()) {
            System.out.println(currentRoom.getLongDescription()); //Printa onde o heroi está.
        } else {

            String word = command.getSecondWord();  //Caso haja segunda palavra.
            Item item = todosItens.procuraItemMochila(word);
            
            // Try achive hero info
            if (word.equals(heroi.pegaNome())) {    //Printa a info do heroi.
                heroi.imprimir();
            } else if(word.equals("Mochila")){      //Printa a info da mochila do heroi.
                heroi.mostraMochila();
            }else if(item!=null){
                item.imprimir(item);
            }else{
                Personagem personagem = currentRoom.getCharacter(word);  //Printa a info do personagem presente na sala.

                if (personagem == null) {
                    System.out.println("Não há um personagem com esse nome!");   //Caso o nome seja invalido.
                } else {
                    personagem.imprimir();
                }
            }
        }
    }
    
    /**
     * Cria a mochila no começo do jogo com os itens iniciais do heroi..
     */
    private void criaMochilaInicial(){
        Mochila bag = heroi.getMochila();
        
        bag.adicionaItem(new Consumivel("Agua",TAMANHO_AGUA,PRECO_AGUA));
        bag.adicionaItem(new Consumivel("Barra de Cereal",TAMANHO_CEREAL,PRECO_CEREAL)); 
        bag.adicionaItem(new Consumivel("Cafe",TAMANHO_CAFE,PRECO_CAFE));
        bag.adicionaItem(new Consumivel("Ticket do RU",TAMANHO_TICKET_RU,PRECO_TICKET_RU));
        bag.adicionaItem(new Consumivel("Passagem para Casa",TAMANHO_PASSAGEM,PRECO_PASSAGEM)); 
        
        bag.adicionaItem(new Armadura("Regata",TAMANHO_REGATA,PRECO_REGATA,ATQ_ARM_INICIAL,DFS_ARM_INICIAL));
        bag.adicionaItem(new Armadura("Bermuda",TAMANHO_BERMUDA,PRECO_BERMUDA,ATQ_ARM_INICIAL,DFS_ARM_INICIAL));
        bag.adicionaItem(new Armadura("Chinelo",TAMANHO_CHINELO,PRECO_CHINELO,ATQ_ARM_INICIAL,DFS_ARM_INICIAL));
          
    }
    
    /**
     * Cria o primeiro comerciante da cantina e adiciona os itens a sua mochila.
     * @return o Comerciante
     */
    private Comerciante criaPrimeiroComerciante(){
        Comerciante comerciante = new Comerciante("Comerciante");
        Mochila bag = comerciante.getMochila();
        
        bag.adicionaItem(new Consumivel("Agua",TAMANHO_AGUA,PRECO_AGUA));
        //bag.adicionaItem(new Consumivel("Agua",TAMANHO_AGUA,PRECO_AGUA));
        //bag.adicionaItem(new Consumivel("Agua",TAMANHO_AGUA,PRECO_AGUA));
        //bag.adicionaItem(new Consumivel("Cafe",TAMANHO_CAFE,PRECO_CAFE));
        bag.adicionaItem(new Consumivel("Cafe",TAMANHO_CAFE,PRECO_CAFE));
        //bag.adicionaItem(new Consumivel("Cafe",TAMANHO_CAFE,PRECO_CAFE));
        bag.adicionaItem(new Consumivel("Ticket do RU",TAMANHO_TICKET_RU,PRECO_TICKET_RU));
        bag.adicionaItem(new Consumivel("Passagem para Casa",TAMANHO_PASSAGEM,PRECO_PASSAGEM));
        bag.adicionaItem(new Consumivel("Repelente",TAMANHO_REPELENTE,PRECO_REPELENTE));
        bag.adicionaItem(new Colete(PRECO_COLETE));
        bag.adicionaItem(new Diversos("Mochila Media",TAMANHO_MOCHILA_MEDIA,PRECO_MOCHILA_MEDIA));
        bag.adicionaItem(new Armadura("Camisa Social",TAMANHO_CAMISETA,PRECO_CAMISETA,DEFESA_CAMISETA,ATAQUE_CAMISETA));//tamanho,preco,defesa,ataque
        bag.adicionaItem(new Armadura("Calca Social",TAMANHO_CALCA,PRECO_CALCA,DEFESA_CALCA,ATAQUE_CALCA));
        bag.adicionaItem(new Armadura("Sapato",TAMANHO_TENIS,PRECO_TENIS,DEFESA_TENIS,ATAQUE_TENIS));
        bag.adicionaItem(new Consumivel("Agua",TAMANHO_AGUA,PRECO_AGUA));
        bag.adicionaItem(new Consumivel("Agua",TAMANHO_AGUA,PRECO_AGUA));
        bag.adicionaItem(new Consumivel("Agua",TAMANHO_AGUA,PRECO_AGUA));
        bag.adicionaItem(new Consumivel("Cafe",TAMANHO_CAFE,PRECO_CAFE));
        bag.adicionaItem(new Consumivel("Cafe",TAMANHO_CAFE,PRECO_CAFE));
        
        return comerciante;
    }
    /**
     * Cria o bibliotecario e coloca os livros na mochila dele.
     * @return o bibliotecario.
     */
    private Comerciante criaBibliotecario(){
        Comerciante comerciante = new Comerciante("Bibliotecario");
        Mochila bag = comerciante.getMochila();
        
        bag.adicionaItem(new Diversos("Livro de CD",TAMANHO_LIVRO,PRECO_LIVRO_CD));
        bag.adicionaItem(new Diversos("Livro de Programacao",TAMANHO_LIVRO,PRECO_LIVRO_PROG));
        bag.adicionaItem(new Diversos("Livro de Calculo",TAMANHO_LIVRO,PRECO_LIVRO_CALC));
        bag.adicionaItem(new Diversos("Livro de Fisica",TAMANHO_LIVRO,PRECO_LIVRO_FIS));
        
        return comerciante;
    }
    
    
    /**
     * Retira o personagem da sala caso ele morra.
     * @param vilao 
     */
    private void retiraPersonagem(Personagem vilao){
        if(currentRoom.excluiPersonagem(vilao,janela)){
            System.out.println();
            if(vilao instanceof VilaoChefao)
                JOptionPane.showMessageDialog(janela,vilao.pegaNome()+" derrotado!\nVocê coletou: "+((VilaoChefao) vilao).pegaChave().getNomeItem()+"\nVocê coletou: "+((VilaoChefao) vilao).pegaDinheiro()+"$",vilao.pegaNome()+" derrotado!",JOptionPane.INFORMATION_MESSAGE); 
            else
                JOptionPane.showMessageDialog(janela,vilao.pegaNome()+" derrotado!\nVocê coletou: "+((VilaoNormal) vilao).pegaDinheiro()+"$",vilao.pegaNome()+" derrotado!",JOptionPane.INFORMATION_MESSAGE); 
            }
        else
            System.out.println(vilao.pegaNome()+" não pode ser excluido.");
    }
    
    /**
     * Finaliza o jogo caso o heroi morra e mostra pra quem foi a morte.
     * @param vilao 
     */
    private void gameOver(Personagem vilao){
         JOptionPane.showMessageDialog(janela,"Você foi morto por: "+vilao.pegaNome()+".\nBeba mais café e tenta outra vez.","Game Over!",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    /**
     * Recolhe dinheiro do vilao.
     * @param v vilao pela qual vai ser recolhido o dinheiro.
     */
    private void recolheDinheiroVilao(Personagem v){
        VilaoChefao vilaoC;
        VilaoNormal vilaoN;
        if(v instanceof VilaoChefao){
            vilaoC = (VilaoChefao)v;
            heroi.getMochila().addDinheiro(vilaoC.pegaDinheiro());  
        }
        else if(v instanceof VilaoNormal){
            vilaoN = (VilaoNormal)v;
            heroi.getMochila().addDinheiro(vilaoN.pegaDinheiro());
        }
        
    }
    
    /**
     * Recolhe a chave do vilao morto.
     * @param v vilao pela qual vai ser retirada a chave.
     */
    private void recolheChaveVilao(Personagem v){
        VilaoChefao vilaoC;
        
        if(v instanceof VilaoChefao){
            vilaoC = (VilaoChefao)v;
            heroi.addChave(vilaoC.pegaChave());
        } 
    }
    
    /**
     * Caso mude de sala, um fator aleatorio colocará ou não um item na proxima sala. (4% de chance de colocar)
     * Caso o fator aleatorio de 4% decida que irá ter um item, outro fator aleatorio define se será Agua, Cafe ou Barra de cereal.
     * @param room sala para colocar o item aleatorio.
     */
    private void addItemAleatorio(){
        int sorte = random.nextInt(26);
        int sorte2 = random.nextInt(3);
        
        if(sorte == random.nextInt(26)){
            switch (sorte2){
                    case 0:
                    currentRoom.addItem(new Consumivel("Agua",TAMANHO_AGUA,PRECO_AGUA));
                    return;
                    case 1:
                    currentRoom.addItem(new Consumivel("Barra de Cereal",TAMANHO_CEREAL,PRECO_CEREAL));  
                    return;
                    case 2:
                    currentRoom.addItem(new Consumivel("Cafe",TAMANHO_CAFE,PRECO_CAFE));
                    default:
                    return;
            }         
        }
    }
    
    /**
     * Caso mude de sala, um fator aleatorio colocará ou não um vilao normal na proxima sala. (33% de chance de colocar)
     * Caso o fator aleatorio de 33% decida que irá ter um vilão normal, outro fator aleatorio define se será 1 ou 2 viloes adicionados.
     * @param room sala para colocar o item aleatorio.
     */
    private void addVilaoNormalAleatorio(){
        int y = random.nextInt(3);  
                    if(y == 2){
                            int numRandom = random.nextInt(2)+1;  
                            for(int x=0;x<numRandom;x++)
                                currentRoom.insertCharacter(new VilaoNormal());
                        }
    }
    
    public Parser getParser(){
        return this.parser;
    }
    
    /**
     * Cria uma mochila com todos itens, para adquirir informações posteriormente.
     */
    private void criaMochilaTodosItens(){
        todosItens.incTamanhoMochila("Mochila Comerciante");
        todosItens.adicionaItem(new Consumivel("Agua",TAMANHO_AGUA,PRECO_AGUA));
        todosItens.adicionaItem(new Consumivel("Barra de Cereal",TAMANHO_CEREAL,PRECO_CEREAL)); 
        todosItens.adicionaItem(new Consumivel("Cafe",TAMANHO_CAFE,PRECO_CAFE));
        todosItens.adicionaItem(new Consumivel("Ticket do RU",TAMANHO_TICKET_RU,PRECO_TICKET_RU));
        todosItens.adicionaItem(new Consumivel("Passagem para Casa",TAMANHO_PASSAGEM,PRECO_PASSAGEM)); 
        todosItens.adicionaItem(new Diversos("Livro de CD",TAMANHO_LIVRO,PRECO_LIVRO_CD));
        todosItens.adicionaItem(new Diversos("Livro de Programacao",TAMANHO_LIVRO,PRECO_LIVRO_PROG));
        todosItens.adicionaItem(new Diversos("Livro de Calculo",TAMANHO_LIVRO,PRECO_LIVRO_CALC));
        todosItens.adicionaItem(new Diversos("Livro de Fisica",TAMANHO_LIVRO,PRECO_LIVRO_FIS));
        todosItens.adicionaItem(new Armadura("Regata",TAMANHO_REGATA,PRECO_REGATA,ATQ_ARM_INICIAL,DFS_ARM_INICIAL));
        todosItens.adicionaItem(new Armadura("Bermuda",TAMANHO_BERMUDA,PRECO_BERMUDA,ATQ_ARM_INICIAL,DFS_ARM_INICIAL));
        todosItens.adicionaItem(new Armadura("Chinelo",TAMANHO_CHINELO,PRECO_CHINELO,ATQ_ARM_INICIAL,DFS_ARM_INICIAL));
        todosItens.adicionaItem(new Consumivel("Repelente",TAMANHO_REPELENTE,PRECO_REPELENTE));
        todosItens.adicionaItem(new Diversos("Mochila Media",TAMANHO_MOCHILA_MEDIA,PRECO_MOCHILA_MEDIA));
        todosItens.adicionaItem(new Colete(PRECO_COLETE));
        todosItens.adicionaItem(new Armadura("Camisa Social",TAMANHO_CAMISETA,PRECO_CAMISETA,DEFESA_CAMISETA,ATAQUE_CAMISETA));//tamanho,preco,defesa,ataque
        todosItens.adicionaItem(new Armadura("Calca Social",TAMANHO_CALCA,PRECO_CALCA,DEFESA_CALCA,ATAQUE_CALCA));
        todosItens.adicionaItem(new Armadura("Sapato",TAMANHO_TENIS,PRECO_TENIS,DEFESA_TENIS,ATAQUE_TENIS));
    }
       
    /**
     * 
     * @return mochila com todos itens.
     */
    public Mochila getMochilaComTodosItens(){
        return this.todosItens;
    }
    
    private Runnable semAr = new Runnable() {
	        public void run() {
	            try{
	                semAr();
	            }catch (Exception e){
                        
                    }
     }
    };
	
    public void semAr(){
        Runnable helloRunnable = new Runnable() {
            public void run() {
                if(currentRoom.getShortDescription().equals("na sala 103")){
                    heroi.decrementar(1);
                    janela.atualizaGeral(4);
                }
                
            }
           
        
    };
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    executor.scheduleAtFixedRate(helloRunnable, 0, 2, TimeUnit.SECONDS);
    }          
   
}
