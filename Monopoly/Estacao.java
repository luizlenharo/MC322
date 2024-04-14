import java.util.Scanner;

public class Estacao extends Propriedade{
    public Estacao() {
        super();
    }

    public Estacao(String nome, int preco, int aluguel) {
        super(nome, preco, aluguel);
    }

    public int calcularAluguel() {
        return getAluguel();
    }

    public static Estacao cadastrarEstacao() {
        /*
        Função le os dados da estação pelo input e cria uma nova estação com
        esses dados e retorna ela.
         */
        String nome;
        int preco, aluguel;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("--- Propriedade %d (Estação) ---\n", getNum_propriedades() + 1);
        System.out.print("informe o nome: ");
        nome = entrada.nextLine();

        System.out.print("informe o preço: ");
        preco = entrada.nextInt();

        System.out.print("informe o aluguel: ");
        aluguel = entrada.nextInt();

        Estacao estacao = new Estacao(nome, preco, aluguel);
        return estacao;
    }
}
