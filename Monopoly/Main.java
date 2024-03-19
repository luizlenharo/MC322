import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       System.out.println("ola mundo");
       //LER JOGADOR
       String nome, cpf, foto, email;
       Scanner entrada = new Scanner(System.in);

       System.out.print("informe o nome: ");
       nome = entrada.nextLine();
       System.out.printf("Escreveu: %s\n", nome);

       System.out.print("informe o cpf: ");
       cpf = entrada.nextLine();
       System.out.printf("Escreveu: %s\n", cpf);

       System.out.print("informe o foto: ");
       foto = entrada.nextLine();
       System.out.printf("Escreveu: %s\n", foto);

       System.out.print("informe o email: ");
       email = entrada.nextLine();
       System.out.printf("Escreveu: %s\n", email);

       Jogador p1 = new Jogador(nome, cpf, email, foto);
       p1.validarCPF(cpf);
    }
}
