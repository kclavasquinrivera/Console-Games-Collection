public class BoxCars {

    public static void ejecutar() {
      
        Dados d1 = new Dados(); 
        Dados d2 = new Dados();

        final int REPETICIONES = 1000;
      
        int vagones = 0;

        for (int i = 0; i < REPETICIONES; i++) {
          
            int t1 = d1.tirar();
          
            int t2 = d2.tirar();
            if (t1 == 6 && t2 == 6) vagones++;
          
        }

        double porcentaje = (vagones * 100.0) / REPETICIONES;

        System.out.println();
        System.out.println();

        System.out.println("               (( _______");
        System.out.println("     _______     /\\O    O\\");
        System.out.println("    /O     /\\   /  \\      \\");
        System.out.println("   /   O  /O \\ / O  \\O____O\\ ))");
        System.out.println("((/_____O/    \\\\    /O     /");
        System.out.println("  \\O    O\\    / \\  /   O  /");
        System.out.println("   \\O    O\\ O/   \\\\/_____O/");
        System.out.println("    \\O____O\\\\/ ))    0      ))");
        System.out.println();
        System.out.println();

        String resultado = String.format("%d print runs - %d train cars, %.2f %%", REPETICIONES, vagones, porcentaje);
      
        System.out.println("  ((\"" + resultado + "\"");
        System.out.println();
      
        System.out.println();

    }
}
