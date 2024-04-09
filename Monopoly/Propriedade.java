public class Propriedade {
    int id;
    String nome;
    int propritario;
    int preco;
    int aluguel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPropritario() {
        return propritario;
    }

    public void setPropritario(int propritario) {
        this.propritario = propritario;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getAluguel() {
        return aluguel;
    }

    public void setAluguel(int aluguel) {
        this.aluguel = aluguel;
    }

    public int calcularAluguel(){
        return getAluguel();
    }
}

