import org.code.theater.*;
import org.code.media.*;

public class Dice {
  
    private int caras;
    private int valor;

    public Dice() {
      
        this.caras = 6;
        tirar();
      
    }

    public Dice(int caras) {
      
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
}
