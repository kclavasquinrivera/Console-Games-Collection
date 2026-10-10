import org.code.theater.*;
import org.code.media.*;

import java.util.Scanner;

public class CartaAlta {

    // Método para determinar el valor numérico de una carta
    private static int valorCarta(String valor) {
      
        switch (valor) {
            
            case "A": return 14;
            case "K": return 13;
            case "Q": return 12;
            case "J": return 11;
            default: return Integer.parseInt(valor);
            
        }
    }

    public static void jugarCartaAlta() {
      
        Scanner sc = new Scanner(System.in);
        int puntajeJugador = 0;
        int puntajeComputadora = 0;

        System.out.println("\n¡Welcome to the High Card game!\n");

        boolean continuar = true;

        while (continuar) {
          
            Carta cartaJugador = new Carta();
            Carta cartaComputadora = new Carta();

            System.out.println("Your letter:");
            cartaJugador.mostrarCarta();

            System.out.println("Computer letter:");
            cartaComputadora.mostrarCarta();

            int valorJugador = valorCarta(cartaJugador.getValor());
            int valorCompu = valorCarta(cartaComputadora.getValor());

            if (valorJugador > valorCompu) {
              
                System.out.println("¡You won this round!");
                puntajeJugador++;
              
            } else if (valorJugador < valorCompu) {
              
                System.out.println("The computer wins this round.");
                puntajeComputadora++;
              
            } else {
              
                System.out.println("Draw in this round.");
            }

            System.out.printf("Score: Player %d - Computer %d\n", puntajeJugador, puntajeComputadora);

            System.out.print("¿Do you want to play another round? (s/n): ");
            String respuesta = sc.next();
          
            if (!respuesta.equalsIgnoreCase("s")) {
              
                continuar = false;
            }

            System.out.println("\n---------------------------\n");
        }

        System.out.println("Game over.");
      
        System.out.printf("Final score: Player %d - Computer %d\n", puntajeJugador, puntajeComputadora);
      
        if (puntajeJugador > puntajeComputadora) System.out.println("¡Congratulations! You won the game.");
          
        else if (puntajeJugador < puntajeComputadora) System.out.println("The computer wins the game.");
          
        else System.out.println("The game ended in a draw.");
    }
}
