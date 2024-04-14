public class Tabuleiro {
    private int[] jogadores, propriedades;
    //Cada coluna da matriz armazena as propriedades de mesma cor (definida pelo indice da coluna)

    public Tabuleiro() {
        // Informações padrões do Monopoly
        this.jogadores = new int[6];
        this.propriedades = new int[28];
    }

    public Tabuleiro(int numJogadores, int numPropriedades) {
        // Informaçõesdefinidas pelo usuário
        this.jogadores = new int[numJogadores];
        this.propriedades = new int[numPropriedades];
    }

    public boolean addJogador(int id) {
        /*Quando o jogador ja estiver cadastrado, a posição na lista
        jogadores referente ao seu id - 1 tera 1, caso contrário tera 0.
        Se ja tiver 6 jogadores, a função retorna false, caso contrário adiciona
        o jogador e retorna true*/
        if (Jogador.num_jogadores > 5){
            return false;
        }
        this.jogadores[id - 1] = 1;
        return true;
    }

    public boolean removeJogador(int id) {
        /*Quando o jogador ja estiver cadastrado, a posição na lista
        jogadores referente ao seu id - 1 tera 1, caso contrário tera 0.
        Se o id passado for menor que zero ou maior do que 5, id máximo
        em uma partida, a função retorna false, caso contrário remove
        o jogador e retorna true*/
        if (id>5 || id<0) {
            return false;
        }
        this.jogadores[id - 1] = 0;
        Jogador.num_jogadores --;
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
            this.propriedades[id - 1] = 1;
        }
        Propriedade.setNum_propriedades(Propriedade.getNum_propriedades() + 1);
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
            this.propriedades[id - 1] = 0;
        }
        Propriedade.setNum_propriedades(Propriedade.getNum_propriedades() - 1);
        return true;
    }
}
