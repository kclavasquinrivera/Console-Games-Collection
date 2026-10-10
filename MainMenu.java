import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Project Dice");
            System.out.println("2. Letters Project");
            System.out.println("3. Rectangle Project");
            System.out.println("4. BoxCars Project");
            System.out.println("5. Project Yahtzee");
            System.out.println("6. Project Pig");
            System.out.println("7. Project Carta Alta");
            System.out.println("0. exit");
            System.out.print("Select an option: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Tirar 2 dados
                    Dados dado1 = new Dados();
                
                    Dados dado2 = new Dados();
                
                    System.out.println("\nDice roll 1: " + dado1.getValor());
                    Dados.mostrarDado();
                    System.out.println("\nDice roll 2: " + dado2.getValor());
                    Dados.mostrarDado();
                
                    break;

                case 2:
                    System.out.println("\nDealing 20 random cards:\n");
                    for (int i = 0; i < 20; i++) {
                      
                        Carta carta = new Carta();
                      
                        carta.mostrarCarta();
                      
                    }
                    break;

                case 3:
                    System.out.print("\nEnter the length of the rectangle: ");
                    double lon = sc.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double anch = sc.nextDouble();

                    Rectangulo r = new Rectangulo(lon, anch);
                
                    System.out.println("\nPerimeter: " + r.obtenerPerimetro());
                    System.out.println("Area: " + r.obtenerArea());
                    System.out.println("Diagonal: " + r.obtenerLongitudDiagonal());
                    System.out.println("\nASCII representation of the rectangle:\n");
                
                    r.mostrarRectanguloASCII();
                
                    break;
                
                case 4:
                    BoxCars.ejecutar();
                    break;
                
               case 5:
                
                  System.out.println("\nPROJECT YAHTZEE: \n");
                  Yahtzee.ejecutarYahtzee();
                  break;
                
               case 6:
                
                  System.out.println("\nPIG PROJECT:");
                  Cerdo.jugarCerdo();
                  break; 
                
                case 0:
                    System.out.println("Leaving the program...");
                    break;
                
                case 7:
                
                    System.out.println("\nPROJECT HIGH LETTER:");
                    CartaAlta.jugarCartaAlta();
                    break;

                default:
                
                    System.out.println("Invalid option. Please try again..");
                    break;
            }

        } 
          while (opcion != 0);

        sc.close();
    }
}
