package jogo;

/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * This class holds information about a command that was issued by the user.
 * A command currently consists of two strings: a command word and a second
 * word (for example, if the command was "take map", then the two strings
 * obviously are "take" and "map").
 * 
 * The way this is used is: Commands are already checked for being valid
 * command words. If the user entered an invalid command (a word that is not
 * known) then the command word is nulo.
 *
 * If the command had only one word, then the second word is nulo.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Command
{
    private String commandWord;
    private String secondWord;

    /**
     * Cria um objeto comando.Rebendo 2 comandos. 
     * @param firstWord Primeira palavra do comando. É null caso seja comando não conhecido.
     * @param secondWord Secunda palavra do comando. Pode exister ou não.
     */
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    /**
     * Retorna a primeira palavra do comando. Null caso não seja um comando válido.
     * @return A palavra de comando.
     */
    public String getCommandWord()
    {
        return commandWord;
    }

    /**
     * Retorna a segunda palavra do comando. Null caso não tenha uma segunda palavra.
     * @return A segunda palavra do comando.
     */
    public String getSecondWord()
    {
        return secondWord;
    }

    /**
     * @return Verdadeiro se o comando não for conhecido.
     */
    public boolean isUnknown()
    {
        return (commandWord == null);
    }

    /**
     * @return Verdadeiro se há uma segunda palavra de comando.
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}

