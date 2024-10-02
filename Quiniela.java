public class Quiniela {
    public static void main(String[] args) {
        System.out.println("¡BIENVENIDO AL JUEGO DE LA QUINIELA!");
        System.out.println("------------------------------------");
        int n = 0;

        for (int i = 0; i < 14; i++) {
            System.out.print(" - ");
            n = (int)(Math.random() * 3) + 1;
            if (n == 1) {
                System.out.print("1");
            } else if (n == 2) {
                System.out.print("X");
            } else {
                System.out.print("2");
            }
        }
        System.out.println(" - ");
    }
}
