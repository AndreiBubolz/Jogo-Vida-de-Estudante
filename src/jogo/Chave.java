
package jogo;

/**
 * Chave pela qual o heroi busca possuir para passar de niveis/anos.
 * @author Andrei
 */

public class Chave extends Item {
    
    private final int NUMERO_CHAVES_ANO1 = 4;
    private final int NUMERO_CHAVES_ANO2 = 4;
    private final int NUMERO_CHAVES_ANO3 = 4;

    public Chave(String nomeItem) {
        super(nomeItem, 1, 0);
    }

    /**
     *
     * @return Numero de chaves necessárias para passar do ano 1.
     */
    public int getNUMERO_CHAVES_ANO1() {
        return NUMERO_CHAVES_ANO1;
    }
    
    /**
     *
     * @return Numero de chaves necessárias para passar do ano 2.
     */
    public int getNUMERO_CHAVES_ANO2() {
        return NUMERO_CHAVES_ANO2;
    }

    /**
     *
     * @return Numero de chaves necessárias para passar do ano 3.
     */
    public int getNUMERO_CHAVES_ANO3() {
        return NUMERO_CHAVES_ANO3;
    }
    
    
 
}
