import java.util.concurrent.ForkJoinPool;

public class Tabuleiro {
    private static Jogador jogadores[];
    private static Propriedade propriedades[];

    public Tabuleiro() {
        // Informações padrões do Monopoly
        this.jogadores = new Jogador[6];
        this.propriedades = new Propriedade[28];
    }

    public Tabuleiro(int numJogadores, int numPropriedades) {
        // Informações definidas pelo usuário
        this.jogadores = new Jogador[numJogadores];
        this.propriedades = new Propriedade[numPropriedades];
    }

    public static Jogador[] getJogadores() {
        return jogadores;
    }

    public static void setJogadores(Jogador[] newJogadores) {
        jogadores = newJogadores;
    }

    public static Propriedade[] getPropriedades() {
        return propriedades;
    }

    public static void setPropriedades(Propriedade[] propriedades) {
        propriedades = propriedades;
    }

    public static boolean addJogador(Jogador jogador) {
    /*Adiciona o jogador na posição da lista referente ao seu id-1 se não
    tiver mais de 5 jogadores na lista*/
        if (Jogador.num_jogadores > 5){
            return false;
        }
        jogadores[jogador.getId() - 1] = jogador;
        return true;
    }

    public boolean removeJogador(Jogador jogador) {
        /*Remove o jogador da listae coloca null no lugar*/
        if (this.jogadores[jogador.getId() - 1] == jogador) {
            this.jogadores[jogador.getId() - 1] = null;
        }
        Jogador.num_jogadores --;
        return true;
    }

    public boolean addPropriedade(Propriedade propriedade) {
        /*Se tiver menos de 28 propriedades, adiciona a propriedade na posição
        id-1 da lista*/
        if (Propriedade.getNum_propriedades() > 27) {
            return false;
        }
        this.propriedades[propriedade.getId() - 1] = propriedade;
        return true;
    }

    public boolean removePropriedade(Propriedade propriedade) {
        /*Remove a propriedade da lista e coloca null no lugar dela*/
        if (this.propriedades[propriedade.getId() - 1] == propriedade) {
            this.propriedades[propriedade.getId() - 1] = null;
        }
        Propriedade.setNum_propriedades(Propriedade.getNum_propriedades() - 1);
        return true;
    }
}
