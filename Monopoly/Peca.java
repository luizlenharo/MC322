public class Peca {
    private String cor;
    private int posicao;

    public Peca() {
        this.posicao = 0;
    }
    public Peca(String cor) {
        this.cor = cor;
        this.posicao = 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}
