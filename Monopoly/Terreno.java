public class Terreno extends Propriedade {
    int numeroCasas;
    int valorCasa;
    int valorHotel;
    boolean hotel;

    public int getNumeroCasas() {
        return numeroCasas;
    }

    public void setNumeroCasas(int numeroCasas) {
        this.numeroCasas = numeroCasas;
    }

    public int getValorCasa() {
        return valorCasa;
    }

    public void setValorCasa(int valorCasa) {
        this.valorCasa = valorCasa;
    }

    public int getValorHotel() {
        return valorHotel;
    }

    public void setValorHotel(int valorHotel) {
        this.valorHotel = valorHotel;
    }

    public boolean getHotel() {
        return hotel;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

    public int calcularAluguel() {
        return aluguel;
    }

    public boolean comprarCasa() {
        /*Verifica as condições para obtenção da casa na propriedade que são:
         - o jogador tem que ter todas os terrenos da mesma cor;
         - os outros terrenos da mesma cor tem que ter no mínimo o mesmo numero
           de casas do terreno em que a casa quer ser comprada;
         - o terreno tem que ter no máximo 3 casas no momento;
         - o jogador tem que ter dinheiro suficiente para comprar a casa
        Caso alguma das condições não seja cumprida, a compra falha e a função
        retorna false. Caso contrário, o numero de casas do terreno aumenta em
        1, o valor da casa é descontado do novo proprietário e a função retorna
        true.
        */
        if (numeroCasas > 3) {
            return false;
        } else {
            numeroCasas ++;
        }
        return true;
    }

    public boolean comprarHotel() {
        return true;
    }
}
