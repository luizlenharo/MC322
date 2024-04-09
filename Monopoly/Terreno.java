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
        return true;
    }

    public boolean comprarHotel() {
        return true;
    }
}
