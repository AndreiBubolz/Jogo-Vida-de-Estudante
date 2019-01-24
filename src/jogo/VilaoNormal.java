
package jogo;

import java.util.Random;

/**
 * Vilao mais simples em forma de animais. É gerado aleatoreamente no decorrer do jogo.
 * @author Andrei
 */
public class VilaoNormal extends Vilao {
    private final Random aleatorio;
    
    /**
     * Cria um personagem aleatorio pro mapa.
     * É inicialmente criado com tudo zerado, e após isso setado valores aleatorios em todos campos.
     */
    public VilaoNormal() {
        super(" ", 0,0,0);
        
        aleatorio = new Random();
        super.setEnergia(energiaAleat());
        super.setDinheiro( dinheiroAleat());
        super.setDano(danoAleat());
        super.setNome(nomeAleat());
        
    }
    /**
     * Seta ao vilao normal uma energia aleatoria entre 10 e 30.
     * @return valor entr 10 e 30
     */
    private int energiaAleat(){
        return aleatorio.nextInt(20)+10;
    }
    /**
     * Seta ao vilao normal um montante de dinheiro aleatorio entre 1 e 10.
     * @return valor entre 1 e 10.
     */
    private int dinheiroAleat(){
         return aleatorio.nextInt(10)+1;
    }
    
    /**
     * Seta ao vilao normal dano de ataque aleatorio entre 1 e 15.
     * @return valor entre 1 e 10.
     */
    private int danoAleat(){
         return aleatorio.nextInt(15)+1;
    }
    
    /**
     * Seta um nome aleatorio. Pode ser: Rato, Barata, Morcego , Cobra , Aranha , Escorpiao e Centopeia.
     * @return 
     */
    private String nomeAleat(){
        int i = aleatorio.nextInt(7); //gera um numero aleatorio entre 0 e 6.
        
        switch (i){
            case 0:
                return "Rato";
            case 1: 
                return "Barata";
            case 2:
                return "Morcego";
            case 3:
                return "Cobra";
            case 4:
                return "Aranha";
            case 5:
                return "Escorpiao";
            case 6:
                return "Centopeia";
            default:
                return "Rato";
        }
    }
}
