import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       //LER JOGADOR
       /*String nome, cpf, foto, email;
       Scanner entrada = new Scanner(System.in);

       System.out.print("informe o nome: ");
       nome = entrada.nextLine();

       System.out.print("informe o cpf: ");
       cpf = entrada.nextLine();

       System.out.print("informe o foto: ");
       foto = entrada.nextLine();

       System.out.print("informe o email: ");
       email = entrada.nextLine();
       Jogador p1 = new Jogador(nome, cpf, email, foto);*/

       Jogador jogador2 = new Jogador();
       Peca peca1 = new Peca();
       CartaSorte cartaSorte1 = new CartaSorte();
       Tabuleiro tabuleiro = new Tabuleiro();
       Propriedade propriedade1 = new Propriedade();
       Estacao estacao1 = new Estacao();
       ServicoPublico servicoPublico1 = new ServicoPublico();
       Terreno terreno1 = new Terreno();

       if (Validacoes.validarCPF(jogador2)){
          System.out.printf("CPF válido!\n");
       }

       if (Validacoes.validarEmail(jogador2)){
          System.out.printf("Email válido!\n");
       }
    }
}
