
package uzduotis3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Iveskite x1: ");
        int x1 = scanner.nextInt();

        System.out.print("Iveskite y1: ");
        int y1 = scanner.nextInt();

        System.out.print("Iveskite x2: ");
        int x2 = scanner.nextInt();

        System.out.print("Iveskite y2: ");
        int y2 = scanner.nextInt();

        int plotis = x2 - x1;
        int aukstis = y1 - y2;

        int s = plotis * aukstis;
        int p = 2 * (plotis + aukstis);

        System.out.println("Plotas: " + s);
        System.out.println("Perimetras: " + p);

        scanner.close();
    }
}
