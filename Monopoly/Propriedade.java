public class Propriedade extends Carta {
    private static int num_propriedades = 0;
    private String nome;
    private int preco;
    private int aluguel;

    public Propriedade() {
        super();
        this.nome = "";
        this.preco = 0;
        this.aluguel = 0;
        num_propriedades ++;
    }

    public Propriedade(String descricao, String nome, int preco, int aluguel) {
        super(descricao);
        this.nome = nome;
        this.preco = preco;
        this.aluguel = aluguel;
        num_propriedades ++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

