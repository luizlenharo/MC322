import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jogador {
    private int dinheiro;
    private int id;
    private static int num_jogadores = 0;
    private String nome;
    private String cpf;
    private String email;
    private String foto;

    public Jogador (String nome, String cpf, String email, String foto) {
        this.id = num_jogadores + 1;
        this.dinheiro = 0; //todo jogador inicia sem dineiro
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.foto = foto;
        num_jogadores++;
    }

    public Jogador () {
        num_jogadores++;
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

    public String toString() {
        return "Nome: " + nome + "Cpf: " + cpf + "email: " + email + "foto: " + foto;
    }

}
