import java.util.Scanner;

public class Main {
   public static void Menu(Tabuleiro tabuleiro) {
      Scanner entrada = new Scanner(System.in);
      int resposta;
      while (true) {
         System.out.print("\n---- MONOPOLY ----\n");
         System.out.print("1. Jogadores\n");
         System.out.print("2. Tabuleiro\n");
         System.out.print("0. Sair\n\n");
         System.out.print("* Digite o número para acessar: ");
         resposta = entrada.nextInt();
         if (resposta == 0) {
            break;
         } else if (resposta == 1) {
            while (true) {
               System.out.print("\n---- Jogadores ----\n");
               System.out.print("1. Cadastrados\n");
               System.out.print("2. Cadastrar\n");
               System.out.print("0. Voltar\n\n");
               System.out.print("* Digite o número para acessar: ");
               resposta = entrada.nextInt();
               if (resposta == 0) {
                  break;
               } else if (resposta == 1) {
                  while (true) {
                     if (Jogador.num_jogadores == 0) {
                        System.out.print("\n---- Cadastrados ----\n");
                        System.out.print("Nenhum jogador cadastrado!\n");
                        System.out.print("0. Voltar\n\n");
                        System.out.print("* Digite o número para acessar: ");
                        resposta = entrada.nextInt();
                        if (resposta == 0) {
                           break;
                        }
                     } else {
                        System.out.print("\n---- Cadastrados ----\n");
                        for (int i = 0; i < Jogador.num_jogadores; i++) {
                           System.out.printf("%d. %s\n",i+1, Tabuleiro.getJogadores()[i].getNome());
                        }
                        System.out.print("0. Voltar\n\n");
                        System.out.print("* Digite o número para acessar: ");
                        resposta = entrada.nextInt();
                        if (resposta == 0) {
                           break;
                        } else {
                           Jogador jogador = Tabuleiro.getJogadores()[resposta - 1];
                           System.out.printf("\n---- %s ----\n", jogador.getNome());
                           System.out.printf("* CPF: %s\n", jogador.getCpf());
                           System.out.printf("* E-Mail: %s\n", jogador.getEmail());
                           System.out.printf("* Foto: %s\n", jogador.getFoto());
                           System.out.printf("* ID: %d\n", jogador.getId());
                           System.out.printf("* Dinheiro: %d\n", jogador.getDinheiro());
                           if (jogador.getPeca() == null) {
                              System.out.printf("* Peca: não definida\n");
                              System.out.printf("* Posição: não definida\n");
                           } else {
                              System.out.printf("* Peca: %s\n", jogador.getPeca().getCor());
                              System.out.printf("* Posição: %d\n", jogador.getPeca().getPosicao());
                           }
                           System.out.print("1. Definir peça\n");
                           System.out.printf("0. Voltar\n\n");
                           System.out.print("* Digite o número para acessar: ");
                           resposta = entrada.nextInt();
                           if (resposta == 0) {
                              break;
                           } else if (resposta == 1) {
                              while (true) {
                                 System.out.print("\n---- Definir peça ----\n");
                                 for (int i = 0; i < Peca.getNum_pecas(); i++) {
                                    System.out.printf("%d. %s\n", i+1, Peca.getPecas()[i].getCor());
                                 }
                                 System.out.printf("0. Voltar\n\n");
                                 System.out.print("* Digite o valor para definir a peça: ");
                                 resposta = entrada.nextInt();
                                 if (resposta == 0) {
                                    break;
                                 } else {
                                    if (jogador.definirPeca(Peca.getPecas()[resposta - 1]) == true){
                                       jogador.setPeca(Peca.getPecas()[resposta - 1]);
                                       System.out.print("\n-> Peça definida com sucesso\n ");
                                       break;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               } else if (resposta == 2) {
                  Jogador newJogador = Jogador.cadastroJogador();
                  tabuleiro.addJogador(newJogador);
               }
            }
         } else if (resposta == 2) {
            while (true) {
               System.out.print("\n---- Tabuleiro ----\n");
               System.out.print("1. Peças\n");
               System.out.print("0. Voltar\n\n");
               System.out.print("* Digite o número para acessar: ");
               resposta = entrada.nextInt();
               if (resposta == 0) {
                  break;
               } else if (resposta == 1) {
                  while (true) {
                     System.out.print("\n---- Peças ----\n");
                     System.out.print("1. Cadastradas\n");
                     System.out.print("2. Cadastrar\n");
                     System.out.print("0. Voltar\n\n");
                     System.out.print("* Digite o número para acessar: ");
                     resposta = entrada.nextInt();
                     if (resposta == 0) {
                        break;
                     } else if (resposta == 1) {
                        while (true) {
                           if (Peca.getNum_pecas() == 0) {
                              System.out.print("Nenhuma peça cadastrada!\n");
                              System.out.print("0. Voltar\n\n");
                              System.out.print("* Digite o número para acessar: ");
                              resposta = entrada.nextInt();
                              if (resposta == 0) {
                                 break;
                              }
                           } else {
                              System.out.print("---- Cadastradas ----\n");
                              for (int i = 0; i < Peca.getNum_pecas(); i++) {
                                 System.out.printf("- %s\n", Peca.getPecas()[i].getCor());
                              }
                              System.out.print("0. Voltar\n\n");
                              System.out.print("* Digite o número para acessar: ");
                              resposta = entrada.nextInt();
                              if (resposta == 0) {
                                 break;
                              }
                           }
                        }
                     } else if (resposta == 2) {
                        Peca newPeca = Peca.cadastrarPeca();
                     }
                  }
               }
            }
         }
      }
   }
   public static void main(String[] args){

       Tabuleiro tabuleiro = new Tabuleiro();
       Scanner entrada = new Scanner(System.in);

       Menu(tabuleiro);

       Terreno.getPropriedadesCor()[0][0].setDono(tabuleiro.getJogadores()[0]);
       Terreno.getPropriedadesCor()[0][0].comprarCasa(tabuleiro.getJogadores()[0]);

       CartaSorte cartaSorte1 = new CartaSorte();
    }
}
