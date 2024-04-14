import java.util.Scanner;

public class Jogador {
    private int dinheiro;
    private int id;
    public static int num_jogadores = 0;
    private String nome;
    private String cpf;
    private String email;
    private String foto;
    private static Jogador[] jogadores = new Jogador[6];

    public Jogador (String nome, String cpf, String email, String foto) {
        this.id = num_jogadores + 1;
        this.dinheiro = 2458;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.foto = foto;
        num_jogadores ++;
    }

    public Jogador () {
        this.id = num_jogadores + 1;
        this.dinheiro = 2458;
        this.nome = "";
        this.cpf = "";
        this.email = "";
        this.foto = "";
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

    public static Jogador[] getJogadores() {
        return jogadores;
    }

    public static void setJogadores(Jogador[] jogadores) {
        Jogador.jogadores = jogadores;
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
        Jogador.jogadores[jogador.id - 1] = jogador;
        return jogador;
    }
}
