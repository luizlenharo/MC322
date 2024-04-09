public class ServicoPublico extends Propriedade {
    public int calcularAluguel(int dados){
        /*O valor cobrado do aluguel é o valor indicado na carta multiplicado
        pelo numero tirado no dado*/
        return getAluguel()*dados;
    }
}
