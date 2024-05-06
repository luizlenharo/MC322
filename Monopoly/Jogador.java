import javax.management.StandardMBean;
import java.util.Scanner;

public class Jogador {
    public static int num_jogadores = 0;
    private int id;
    private int dinheiro;
    private String nome;
    private String cpf;
    private String email;
    private String foto;
    private Carta cartas[];
    private Peca peca;

    public Jogador (String nome, String cpf, String email, String foto) {
        this.id = num_jogadores + 1;
        this.dinheiro = 2458;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.foto = foto;
        this.cartas = new Carta[30];
        this.peca = null;
        num_jogadores ++;
    }

    public Jogador () {
        this.id = num_jogadores + 1;
        this.dinheiro = 2458;
        this.nome = "";
        this.cpf = "";
        this.email = "";
        this.foto = "";
        this.cartas = new Carta[30];
        this.peca = null;
        num_jogadores ++;
    }

    public String getNome (){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getCpf (){
        return cpf;
    }

    public void setCpf (String cpf){
        this.cpf = cpf;
    }

    public String getEmail (){
        return email;
    }

    public  void setEmail (String email){
        this.email = email;
    }

    public String getFoto (){
        return foto;
    }

    public void setFoto(String foto){
        this.foto = foto;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public boolean definirPeca(Peca peca) {
        if (this.peca != null) {
            return false;
        }
        for (int i = 0; i < Jogador.num_jogadores; i++) {
            if (Tabuleiro.getJogadores()[i].getPeca() != null) {
                if (Tabuleiro.getJogadores()[i].getPeca() == peca) {
                    System.out.print("-> Peça já está em uso! Tente novamente\n");
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        return "Nome: " + nome + "Cpf: " + cpf + "email: " + email + "foto: " + foto;
    }

    public static Jogador cadastroJogador() {
        /* Função recebe as informações do jogador a ser cadastrado por meio de input
        e cria um novo Jogador com os dados obtidos e retorna ele.
        */
        String nome, cpf, foto, email;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("--- Jogador %d ---\n", num_jogadores + 1);
        System.out.print("informe o nome: ");
        nome = entrada.nextLine();

        System.out.print("informe o cpf: ");
        cpf = entrada.nextLine();
        while (Validacoes.validarCPF(cpf) == false) {
            System.out.print("Cpf inválido, tente novamente!\ninforme o cpf: ");
            cpf = entrada.nextLine();
        }

        System.out.print("informe o email: ");
        email = entrada.nextLine();
        while (Validacoes.validarEmail(email) == false) {
            System.out.print("Email inválido, tente novamente!\ninforme o email: ");
            email = entrada.nextLine();
        }

        System.out.print("informe o foto: ");
        foto = entrada.nextLine();

        Jogador jogador = new Jogador(nome, cpf, email, foto);
        return jogador;
    }
}
