import java.util.Scanner;

public class Cerdo {

    public static void jugarCerdo() {
        Scanner sc = new Scanner(System.in);

        Dados playerDie1 = new Dados();
        Dados playerDie2 = new Dados();
        Dados computerDie1 = new Dados();
        Dados computerDie2 = new Dados();

        int playerScore = 0;
        int computerScore = 0;
        boolean isPlayerTurn = true;

        System.out.println("\nWelcome to the Pig game!\n");

        while (playerScore < 100 && computerScore < 100) {
          
            int roundPoints = 0;

            if (isPlayerTurn) {
              
                System.out.println("=== Player's turn ===");
                boolean continueRolling = true;

                while (continueRolling) {
                  
                    int t1 = playerDie1.tirar();
                    int t2 = playerDie2.tirar();

                    System.out.println("\nYou rolled:");
                  
                    mostrarDado(t1);
                    mostrarDado(t2);
                  
                    System.out.printf("Results: %d and %d\n", t1, t2);

                    if (t1 == 1 && t2 == 1) {
                      
                        playerScore = 0;
                        System.out.println("Two 1s! You lost all accumulated points.");
                        continueRolling = false;
                      
                    } else if (t1 == 1 || t2 == 1) {
                      
                        System.out.println("One 1! You lose points for this round.");
                        continueRolling = false;
                      
                    } else {
                      
                        roundPoints += t1 + t2;
                        System.out.printf("Points this round: %d\n", roundPoints);
                        System.out.print("Do you want to roll again? (y/n): ");
                      
                        String answer = sc.next();
                      
                        if (!answer.equalsIgnoreCase("y")) {
                          
                            playerScore += roundPoints;
                            continueRolling = false;
                          
                        }
                    }
                }

                System.out.printf("Total player score: %d\n", playerScore);
                isPlayerTurn = false;

            } else {
              
                System.out.println("\n=== Computer's turn ===");
                int roundCompPoints = 0;
                boolean continueRolling = true;

                while (continueRolling) {
                  
                    int t1 = computerDie1.tirar();
                    int t2 = computerDie2.tirar();

                    System.out.println("\nComputer rolled:");
                  
                    mostrarDado(t1);
                    mostrarDado(t2);
                  
                    System.out.printf("Results: %d and %d\n", t1, t2);

                    if (t1 == 1 && t2 == 1) {
                      
                        computerScore = 0;
                      
                        System.out.println("Two 1s! Computer lost all points.");
                        continueRolling = false;
                      
                    } else if (t1 == 1 || t2 == 1) {
                      
                        System.out.println("One 1! Computer loses points for this round.");
                        continueRolling = false;
                      
                    } else {
                      
                        roundCompPoints += t1 + t2;
                      
                        if (roundCompPoints >= 20) {
                          
                            computerScore += roundCompPoints;
                            continueRolling = false;
                        }
                    }
                }

                System.out.printf("Total computer score: %d\n", computerScore);
                isPlayerTurn = true;
            }

            System.out.println("\n-----------------------------\n");
        }

        if (playerScore >= 100) {
          
            System.out.println("Congratulations! You won!");
        } else {
          
            System.out.println("Computer wins. Try again!");
        }
    }

    public static void mostrarDado(int valor) {
      
        System.out.println("   ^__^");
        System.out.println("  (oo)\\_______");
        System.out.println("  (__)\\       )\\/\\");
        System.out.println("      ||----w |");
        System.out.println("      ||     ||");
        System.out.printf("     [Value: %d]\n\n", valor);
    }
}
