import java.util.Random;

public class Carta {
  
    private String valor;
    private String palo;

    private static final String[] VALORES = {
      
        "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
    };
    private static final String[] PALOS = { "C", "D", "P", "T" 
                                          }; 


    public Carta() {
      
        Random rand = new Random();
      
        this.valor = VALORES[rand.nextInt(VALORES.length)];
      
        this.palo = PALOS[rand.nextInt(PALOS.length)];
    }

    public Carta(String valor, String palo) {
      
        this.valor = valor;
        this.palo = palo;
    }

    public String getValor() {
        return valor;
      
    }

    public String getPalo() {
      
        return palo;
    }

    public void mostrarCarta() {
      
        System.out.println("+---------+");
        System.out.printf("| %-2s      |\n", valor);
        System.out.println("|         |");
        System.out.printf("|    %s    |\n", palo);
        System.out.println("|         |");
        System.out.printf("|      %-2s |\n", valor);
        System.out.println("+---------+");
        System.out.println();
      
    }
}
