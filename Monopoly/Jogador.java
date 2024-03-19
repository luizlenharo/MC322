public class Jogador {
    private String nome;
    private String cpf;
    private String email;
    private String foto;

    public Jogador (String nome, String cpf, String email, String foto) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.foto = foto;
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

    public String toString() {
        return "Nome: " + nome + "Cpf: " + cpf + "email: " + email + "foto: " + foto;
    }

    public void validarCPF(String cpf){
        String formatCPF = cpf.replaceAll("[^0-9]+", "");
        System.out.println(formatCPF);
    }
}
