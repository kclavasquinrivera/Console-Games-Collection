import java.util.Random;

public class Dados {

    private int caras;   
    private int valor; 

    // Constructor por defecto: dado de 6 caras
    public Dados() {
      
        this.caras = 6;
        tirar();
      
    }

    public Dados(int caras) {
      
        this.caras = caras;
        tirar();
      
    }

    public int tirar() {
        valor = (int)(Math.random() * caras) + 1;
        return valor;
      
    }

    public int getValor() {
      
        return valor;
    }

    public static void mostrarDado() {
      
        System.out.println("              _______.");
        System.out.println("   ______    | .   . |\\");
        System.out.println("  /     /\\   |   .   |.\\");
        System.out.println(" /  '  /  \\  | .   . |.'|");
        System.out.println("/_____/. . \\ |_______|.'|");
        System.out.println("\\ . . \\    /  \\ ' .   '\\|");
        System.out.println(" \\ . . \\  /    \\____'__\\|");
        System.out.println("  \\_____\\/");
        System.out.println();
    }
}
