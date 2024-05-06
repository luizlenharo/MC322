public class Carta {
    private static int num_cartas = 0;
    private int id;
    private String descricao;
    private Jogador dono;

    public Carta() {
        this.id = num_cartas + 1;
        this.descricao = "";
        this.dono = null;
        num_cartas ++;
    }

    public Carta(String descricao) {
        this.id = num_cartas ++;
        this.descricao = descricao;
        this.dono = null;
        num_cartas ++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Jogador getDono() {
        return dono;
    }

    public void setDono(Jogador dono) {
        this.dono = dono;
    }
}
