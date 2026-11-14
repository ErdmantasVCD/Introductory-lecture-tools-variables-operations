package uzduotis1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Iveskite knygu skaiciu per menesi: ");
        int v = scanner.nextInt();

        System.out.print("Iveskite lankytoju skaiciu per metus: ");
        int n = scanner.nextInt();

        double k = v * 12.0 / n;

        System.out.println("Vidutiniskai vienas lankytojas per metus perskaito: " + k);

        scanner.close();
    }
}
