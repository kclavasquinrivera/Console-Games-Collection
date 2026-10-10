import java.util.Arrays;

public class Yahtzee {

    public static String[] asciiDado(int n) {
      
        String[] base = {
          
            "    _______    ",
            "  /\\       \\   ",
            " /()\\   ()  \\  ",
            "/    \\_______\\ ",
            "\\    /()     / ",
            " \\()/   ()  /  ",
            "  \\/_____()/   "
          
        };
      
        return base;
    }

    public static void mostrarCincoDados(Dice[] dados) {
      
        String[][] ascii = new String[5][];
      
        for (int i = 0; i < 5; i++) {
          
            ascii[i] = asciiDado(dados[i].getValor());
          
        }

        for (int fila = 0; fila < ascii[0].length; fila++) {
          
            for (int d = 0; d < 5; d++) {
              
                System.out.print(ascii[d][fila] + "   ");
            }
          
            System.out.println();
        }

        System.out.println();
        System.out.print("Values:  ");
      
        for (Dice d : dados) System.out.print(d.getValor() + "  ");
      
        System.out.println("\n");
      
    }

    public static String determinarMano(int[] v) {
      
        Arrays.sort(v);

        boolean escalera5 =
          
                (v[0] == v[1] - 1) &&
                (v[1] == v[2] - 1) &&
                (v[2] == v[3] - 1) &&
                (v[3] == v[4] - 1);

        boolean escalera4 =
          
                (v[0] == v[1] - 1 && v[1] == v[2] - 1 && v[2] == v[3] - 1) ||
                (v[1] == v[2] - 1 && v[2] == v[3] - 1 && v[3] == v[4] - 1);

        int[] count = new int[6];
      
        for (int n : v) count[n - 1]++;

        boolean trio = false, poker = false, quint = false, par = false;

        for (int c : count) {
          
            if (c == 5) quint = true;
            if (c == 4) poker = true;
            if (c == 3) trio = true;
            if (c == 2) par = true;
          
        }

        if (quint) return "YAHTZEE (Quintuple)";
        if (poker) return "Poker (4 equal)";
        if (trio && par) return "Full House";
        if (escalera5) return "Large staircase";
        if (escalera4) return "Small ladder";
        if (trio) return "Trio";

        return "Chance (no special hands)";
    }

    public static void ejecutarYahtzee() {
      
        Dice[] dados = new Dice[5];
      
        for (int i = 0; i < 5; i++) {
          
            dados[i] = new Dice();
        }

        mostrarCincoDados(dados);

        int[] valores = new int[5];
      
        for (int i = 0; i < 5; i++) valores[i] = dados[i].getValor();

        String mano = determinarMano(valores);

        System.out.println("Hand obtained: " + mano);
      
    }
}
