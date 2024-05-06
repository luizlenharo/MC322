import java.util.Scanner;

public class Terreno extends Propriedade {
    private int numeroCasas;
    private int valorCasa;
    private int valorHotel;
    private int cor; //inteiro que define o conjunto que o terreno pertence
    private boolean hotel;
    private static Terreno [][] propriedadesCor = new Terreno[8][3];
    //Cada coluna da matriz armazena as propriedades de mesma cor (definida pelo indice da linha)

    public Terreno() {
        super();
        this.numeroCasas = 0;
        this.valorCasa = 0;
        this.valorHotel = 0;
        this.cor = 0;
        this.hotel = false;
    }

    public Terreno(String descricao, String nome, int preco, int aluguel, int valorCasa, int valorHotel, int cor) {
        super(descricao, nome, preco, aluguel);
        this.numeroCasas = 0;
        this.valorCasa = valorCasa;
        this.valorHotel = valorHotel;
        this.cor = cor;
        this.hotel = false;
    }

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

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public boolean getHotel() {
        return hotel;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

    public static Terreno[][] getPropriedadesCor() {
        return propriedadesCor;
    }

    public static boolean addTerreno(Terreno terreno) {
        for (int i = 0; i < propriedadesCor[terreno.getCor() - 1].length; i++) {
            if (propriedadesCor[terreno.getCor() - 1][i] == null) {
                propriedadesCor[terreno.getCor() - 1][i] = terreno;
                break;
            }
        }
        return true;
    }

    public int calcularAluguel() {
        return getAluguel();
    }

    public boolean comprarCasa() {
        if (numeroCasas > 3) {
            return false;
        } else {
            numeroCasas ++;
        }
        return true;
    }

    public boolean comprarCasa(Jogador comprador) {
        /*Verifica as condições para obtenção da casa no terreno que são:
         - o jogador tem que ter todas os terrenos da mesma cor;
         - os outros terrenos da mesma cor tem que ter no mínimo o mesmo numero
           de casas do terreno em que a casa quer ser comprada;
         - o terreno tem que ter no máximo 3 casas no momento;
         - o jogador tem que ter dinheiro suficiente para comprar a casa
        Caso alguma das condições não seja cumprida, a compra falha e a função
        retorna false. Caso contrário, o numero de casas do terreno aumenta em
        1, o valor da casa é descontado do proprietário e a função retorna
        true.
        */
        Jogador jogador;
        Terreno[] terrenosCor = propriedadesCor[cor - 1];  //Lista de todos os terrenos de mesma cor
        /* Verificando se o numero de casas é menor do que 4 e se o jogador
        tem dinheiro para comprar a casa.
        */
        if (numeroCasas > 3 || comprador.getDinheiro() < valorCasa) {
            System.out.print("Compra falhou!\n");
            return false;
        }
        /* Verificando se jogador é dono de todos os terrenos de mesma cor e se
        eles tem o mínimo de casas nescessário.
        */
        for (int i = 0; i < terrenosCor.length; i++) {
            if (terrenosCor[i] == null && i > 0) {
                break;
            }
            jogador = terrenosCor[i].getDono();
            if (jogador.getId() != getDono().getId() || terrenosCor[i].numeroCasas < numeroCasas) {
                System.out.print("Compra falhou!\n");
                return false;
            }
        }
        comprador.setDinheiro(comprador.getDinheiro() - valorCasa);
        numeroCasas ++;
        System.out.printf("Compra bem sucedida!\n");
        return true;
    }

    public boolean comprarHotel() {
        if (hotel == true) {
            return false;
        } else {
            hotel = true;
        }
        return true;
    }

    public boolean comprarHotel(Jogador comprador) {
        /*Verifica as condições para obtenção do hotel no terreno que são:
         - o jogador tem que ter todas os terrenos da mesma cor;
         - os outros terrenos da mesma cor tem que ter no mínimo 4 casas
         - o terreno só pode ter 1 hotel;
         - o jogador tem que ter dinheiro suficiente para comprar a casa
        Caso alguma das condições não seja cumprida, a compra falha e a função
        retorna false. Caso contrário, a variavel hotel do terreno se torna
        true, o valor o hotel é descontado do proprietário e a função retorna
        true.
        */
        Jogador jogador;
        Terreno[] terrenosCor = propriedadesCor[cor - 1];  //Lista de todos os terrenos de mesma cor
        /* Verificando se nao tem hotel e se o jogador tem dinheiro
         para comprar o hotel.
        */
        if (hotel == true || comprador.getDinheiro() < valorHotel) {
            System.out.print("Compra falhou!\n");
            return false;
        }
        /* Verificando se jogador é dono de todos os terrenos de mesma cor e se
        eles tem 4 casas ou hotel.
        */
        for (int i = 0; i < terrenosCor.length; i++) {
            if (terrenosCor[i] == null && i > 0) {
                break;
            }
            jogador = terrenosCor[i].getDono();
            if (jogador.getId() != getDono().getId() || (terrenosCor[i].numeroCasas < 4 && terrenosCor[i].hotel == false)) {
                System.out.print("Compra falhou!\n");
                return false;
            }
        }
        numeroCasas = 0;
        hotel = true;
        comprador.setDinheiro(comprador.getDinheiro() - valorHotel);
        System.out.printf("Compra bem sucedida!\n");
        return true;
    }

    public static Terreno cadastrarTerreno() {
        /*
        Função que le os dados do terreno por meio do input e cria um novo Terreno
        com esses dados e retorna ele.
         */
        String nome, descricao;
        int preco, aluguel, valorCasa, valorHotel, cor;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("--- Propriedade %d (Terreno) ---\n", getNum_propriedades() + 1);
        System.out.print("informe o nome: ");
        nome = entrada.nextLine();

        System.out.print("informe a descrição: ");
        descricao = entrada.nextLine();

        System.out.print("informe o preço: ");
        preco = entrada.nextInt();

        System.out.print("informe o aluguel: ");
        aluguel = entrada.nextInt();

        System.out.print("informe o valor da casa: ");
        valorCasa = entrada.nextInt();

        System.out.print("informe o valor do hotel: ");
        valorHotel = entrada.nextInt();

        System.out.print("informe a cor [1-6]: ");
        cor = entrada.nextInt();

        Terreno terreno = new Terreno(descricao, nome, preco, aluguel, valorCasa, valorHotel, cor);
        Terreno.addTerreno(terreno);
        return terreno;
    }
}
