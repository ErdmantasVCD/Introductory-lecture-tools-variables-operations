
package uzduotis4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Iveskite krastine a: ");
        double a = scanner.nextDouble();

        System.out.print("Iveskite krastine b: ");
        double b = scanner.nextDouble();

        System.out.print("Iveskite krastine c: ");
        double c = scanner.nextDouble();

        double p = (a + b + c) / 2;

        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Trikampio plotas: " + s);

        scanner.close();
    }
}
