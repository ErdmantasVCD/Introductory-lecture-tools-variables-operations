
package uzduotis2;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Iveskite kambario ilgi: ");
            int ilgis = scanner.nextInt();

            System.out.print("Iveskite kambario ploti: ");
            int plotis = scanner.nextInt();

            System.out.print("Iveskite plyteliu kaina uz 1 m2: ");
            double kaina = scanner.nextDouble();

            int plotas = ilgis * plotis;
            double suma = plotas * 1.05 * kaina;

            System.out.println("Kambario plotas: " + plotas + " m2");
            System.out.printf("Bendra plyteliu kaina: %.2f EUR%n", suma);

            scanner.close();
        }
    }


