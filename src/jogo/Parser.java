package jogo;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This parser reads user input and tries to interpret it as an "Adventure"
 * command. Every time it is called it reads a line from the terminal and
 * tries to interpret the line as a two word command. It returns the command
 * as an object of class Command.
 *
 * The parser has a set of known command words. It checks user input against
 * the known commands, and if the input is not one of the known commands, it
 * returns a command object that is marked as an unknown command.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Parser 
{
    private CommandWords commands;  // Armazena todos os comandos validos.
    private Scanner reader;         // Leitura das entradas do usuario.

    public Parser() 
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    /**
     * @return The next command from the user.
     */
    public Command getCommand() 
    {
        String inputLine;  
        String word1 = null;
        String word2 = null;
        
        System.out.println("___________________________________________________________________________________________________________________");
        System.out.print("> ");     

        inputLine = reader.nextLine();

        //Separa linha de entrada.
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();      // Pega primeira palavra
            if(tokenizer.hasNext()){
                word2 = tokenizer.next();
                while(tokenizer.hasNext()) {
                    word2 = word2+" "+tokenizer.next();      // todos palavras seguintes sao consideras como segundo comando.
                   
                }
            }
        }
        
        // Checa se a primeira palavra é um comando valido. Se for, cria um objeto comando normalmente
        //Se nao for, é criado um objeto comando com a primeira palavra null.
        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2); 
        }
    }
    
    
    public Command receiveCommand(String comando) 
    {
        String inputLine;  
        String word1 = null;
        String word2 = null;
        
        System.out.println("___________________________________________________________________________________________________________________");
        System.out.print("> ");     

        inputLine = comando;

        //Separa linha de entrada.
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();      // Pega primeira palavra
            if(tokenizer.hasNext()){
                word2 = tokenizer.next();
                while(tokenizer.hasNext()) {
                    word2 = word2+" "+tokenizer.next();      // todos palavras seguintes sao consideras como segundo comando.
                   
                }
            }
        }
        
        // Checa se a primeira palavra é um comando valido. Se for, cria um objeto comando normalmente
        //Se nao for, é criado um objeto comando com a primeira palavra null.
        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2); 
        }
    }
    
    /**
     * Printa a lista de comandos validos.
     */
    public void showCommands()
    {
        commands.showAll();
    }
}
