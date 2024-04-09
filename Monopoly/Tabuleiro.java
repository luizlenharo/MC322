public class Tabuleiro {
    int[] jogadores, propriedades;

    public Tabuleiro() {
        this.jogadores = new int[6];
        this.propriedades = new int[28];
    }
    public boolean addJogador(int id) {
        /*Quando o jogador ja estiver cadastrado, a posição na lista
        jogadores referente ao seu id tera 1, caso contrário tera 0.
        Se o id passado for menor que zero ou maior do que 5, id máximo
        em uma partida, a função retorna false, caso contrário adiciona
        o jogador e retorna true*/
        if (id>5 || id<0){
            return false;
        }else {
            this.jogadores[id] = 1;
        }
        return true;
    }

    public boolean removeJogador(int id) {
        /*Quando o jogador ja estiver cadastrado, a posição na lista
        jogadores referente ao seu id tera 1, caso contrário tera 0.
        Se o id passado for menor que zero ou maior do que 5, id máximo
        em uma partida, a função retorna false, caso contrário remove
        o jogador e retorna true*/
        if (id>5 || id<0) {
            return false;
        }else {
            this.jogadores[id] = 0;
        }
        return true;
    }
    public boolean addPropriedade(int id) {
        /*Quando a propriedade ja estiver cadastrada, a posição na lista
        propriedades referente ao seu id tera 1, caso contrário tera 0.
        Se o id passado for menor que zero ou maior do que 27, id máximo
        em uma partida, a função retorna false, caso contrário adiciona
        a propriedade e retorna true*/
        if (id>27 || id<0){
            return false;
        }else {
            this.propriedades[id] = 1;
        }
        return true;
    }

    public boolean removePropriedade(int id) {
        /*Quando a propriedade ja estiver cadastrada, a posição na lista
        propriedades referente ao seu id tera 1, caso contrário tera 0.
        Se o id passado for menor que zero ou maior do que 27, id máximo
        em uma partida, a função retorna false, caso contrário remove
        a propriedade e retorna true*/
        if (id>27 || id<0) {
            return false;
        }else {
            this.propriedades[id] = 0;
        }
        return true;
    }
}
