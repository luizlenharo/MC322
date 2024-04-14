public class Propriedade {
    private static int num_propriedades = 0;
    private int id;
    private String nome;
    private int proprietario;
    private Jogador dono;
    private int preco;
    private int aluguel;

    public Propriedade() {
        this.id = num_propriedades + 1;
        this.nome = "";
        this.proprietario = 0;
        this.dono = null;
        this.preco = 0;
        this.aluguel = 0;
        num_propriedades ++;
    }

    public Propriedade(String nome, int preco, int aluguel) {
        this.id = num_propriedades + 1;
        this.nome = nome;
        this.proprietario = 0;
        this.dono = null;
        this.preco = preco;
        this.aluguel = aluguel;
        num_propriedades ++;
    }

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

    public int getProprietario() {
        return proprietario;
    }

    public void setProprietario(int propritario) {
        this.proprietario = propritario;
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

    public Jogador getDono() {
        return dono;
    }

    public void setDono(Jogador dono) {
        this.dono = dono;
    }

    public static int getNum_propriedades() {
        return num_propriedades;
    }

    public static void setNum_propriedades(int num_propriedades) {
        Propriedade.num_propriedades = num_propriedades;
    }

    public int calcularAluguel(){
        return getAluguel();
    }
}

