import java.util.Scanner;

public class Peca {
    private static int num_pecas = 0;
    private static Peca[] pecas = new Peca[5];
    private String cor;
    private int posicao;

    public Peca() {
        this.posicao = 0;
    }
    public Peca(String cor) {
        this.cor = cor;
        this.posicao = 0;
        num_pecas ++;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public static int getNum_pecas() {
        return num_pecas;
    }

    public static void setNum_pecas(int num_pecas) {
        Peca.num_pecas = num_pecas;
    }

    public static Peca[] getPecas() {
        return pecas;
    }

    public static void setPecas(Peca[] pecas) {
        Peca.pecas = pecas;
    }

    public static Peca cadastrarPeca() {
        /*
        Função que recebe as informações da peça e cria ela
         */
        String cor;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("--- Peça %d ---\n", num_pecas + 1);
        System.out.print("informe a cor: ");
        cor = entrada.nextLine();

        Peca newPeca = new Peca(cor);
        pecas[num_pecas - 1] = newPeca;
        return newPeca;
    }
}
