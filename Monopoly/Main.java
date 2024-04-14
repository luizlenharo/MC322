import java.util.Scanner;

public class Main {
    public static void main(String[] args){

       Tabuleiro tabuleiro = new Tabuleiro();
       Scanner entrada = new Scanner(System.in);

       //CADASTRO JOGADORES
       for (int i = 0; i < 6; i++) {
          Jogador newJogador = Jogador.cadastroJogador();
          tabuleiro.addJogador(newJogador.getId());
          if (i > 0) {
             String resposta;
             System.out.printf("[%d/ 6] jogadores. Cadastrar mais um jogador? [s/n] ", Jogador.num_jogadores);
             resposta = entrada.nextLine();
             if (resposta.equals("n")) {
                break;
             }
          }
       }

       // Cadastro de Propriedades
       for (int i = 0; i < 28; i++) {
          System.out.printf("Adicionar (1)Terreno ou (2)Negócio? ");
          String resposta;
          resposta = entrada.nextLine();
          if (resposta.equals("1")) {
             Terreno newTerreno = Terreno.cadastrarTerreno();
             tabuleiro.addPropriedade(newTerreno.getId());
          } else if (resposta.equals("2")) {
             System.out.print("Qual tipo de Negócio? (1)Estação (2)Serviço Público ");
             resposta = entrada.nextLine();
             if (resposta.equals("1")) {
                Estacao newEstacao = Estacao.cadastrarEstacao();
                tabuleiro.addPropriedade(newEstacao.getId());
             } else if (resposta.equals("2")) {
                ServicoPublico newServicoPublico = ServicoPublico.cadastrarServicoPublico();
                tabuleiro.addPropriedade(newServicoPublico.getId());
             }
          }
          System.out.printf("[%d/ 28] propriedades. Cadastrar mais uma propriedade? [s/n] ",
                  Propriedade.getNum_propriedades());
          resposta = entrada.nextLine();
          if (resposta.equals("n")) {
             break;
          }
       }

       Terreno.getPropriedadesCor()[0][0].setDono(Jogador.getJogadores()[0]);
       Terreno.getPropriedadesCor()[0][0].comprarCasa(Jogador.getJogadores()[0]);

       Peca peca1 = new Peca();
       CartaSorte cartaSorte1 = new CartaSorte();
    }
}
