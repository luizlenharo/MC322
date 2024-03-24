import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       //LER JOGADOR
       String nome, cpf, foto, email;
       Scanner entrada = new Scanner(System.in);

       System.out.print("informe o nome: ");
       nome = entrada.nextLine();

       System.out.print("informe o cpf: ");
       cpf = entrada.nextLine();

       System.out.print("informe o foto: ");
       foto = entrada.nextLine();

       System.out.print("informe o email: ");
       email = entrada.nextLine();

       Jogador p1 = new Jogador(nome, cpf, email, foto);

       if (p1.validarCPF(p1.getCpf())){
          System.out.printf("CPF válido!\n");
       }

       if (p1.validarEmail(p1.getEmail())){
          System.out.printf("Email válido!\n");
       }
    }
}
