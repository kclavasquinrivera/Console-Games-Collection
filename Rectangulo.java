public class Rectangulo {
  
    private double longitud;
    private double ancho;

    // Constructor con parámetros
    public Rectangulo(double longitud, double ancho) {
      
        this.longitud = longitud;
        this.ancho = ancho;
      
    }

    public double obtenerPerimetro() {
        return 2 * (longitud + ancho);
      
    }

    public double obtenerArea() {
      
        return longitud * ancho;
    }

    public double obtenerLongitudDiagonal() {
        return Math.sqrt(longitud * longitud + ancho * ancho);
      
    }

    public void mostrarRectanguloASCII() {
      
        int filas = (int) ancho;
        int columnas = (int) longitud;

        System.out.print("+");
        for (int i = 0; i < columnas; i++) {
          
            System.out.print("-");
        }
      
        System.out.println("+");

        for (int i = 0; i < filas; i++) {
          
            System.out.print("|");
          
            for (int j = 0; j < columnas; j++) {
              
                System.out.print(" ");
            }
          
            System.out.println("|");
        }

        System.out.print("+");
      
        for (int i = 0; i < columnas; i++) {
          
            System.out.print("-");
        }
      
        System.out.println("+\n");
    }
}
