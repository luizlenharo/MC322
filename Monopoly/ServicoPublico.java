import java.util.Scanner;

public class ServicoPublico extends Propriedade {
    public ServicoPublico() {
        super();
    }

    public ServicoPublico(String nome, int preco, int aluguel) {
        super(nome, preco, aluguel);
    }

    public int calcularAluguel(int dados){
        /*O valor cobrado do aluguel é o valor indicado na carta multiplicado
        pelo numero tirado no dado*/
        return getAluguel()*dados;
    }

    public static ServicoPublico cadastrarServicoPublico() {
        /*
        Função recebe os dados do novo Serviço Público por meio do input
        e cria um novo Serviço Público e retorna ele.
         */
        String nome;
        int preco, aluguel;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("--- Propriedade %d (Serviço Público) ---\n", getNum_propriedades() + 1);
        System.out.print("informe o nome: ");
        nome = entrada.nextLine();

        System.out.print("informe o preço: ");
        preco = entrada.nextInt();

        System.out.print("informe o aluguel: ");
        aluguel = entrada.nextInt();

        ServicoPublico servicoPublico = new ServicoPublico(nome, preco, aluguel);
        return servicoPublico;
    }
}
