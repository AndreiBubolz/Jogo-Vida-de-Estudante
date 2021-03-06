package jogo;

/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class CommandWords
{
    // Um vetor que armazena todos comandos validos.
    private static final String[] validCommands = {"ir", "falar", "atacar","usar","pegar", "info", "sair", "ajuda", "comprar", "vender",};

    public CommandWords()
    {
       
    }

    /**
     * Checa se o comando é um comando válido.
     * @param aString a ser analisada.
     * @return Verdadeiro se for válido, false se não for.
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        
        return false;
    }

    /**
     * Printa todos comandos válidos.
     */
    public void showAll() 
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
