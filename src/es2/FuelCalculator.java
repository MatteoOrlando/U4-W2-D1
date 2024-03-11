package es2;

import java.util.Scanner;

public class FuelCalculator {
    private Scanner scanner;

    public FuelCalculator() {
        scanner = new Scanner(System.in);
    }

    public void calculateKmPerLiter() {
        try {
            System.out.print("Inserisci il numero di km percorsi: ");
            double kmPercorsi = scanner.nextDouble();
            System.out.print("Inserisci i litri di carburante consumati: ");
            double litriConsumati = scanner.nextDouble();

            if (litriConsumati == 0) {
                throw new IllegalArgumentException("Il numero di litri consumati non può essere zero.");
            }

            double kmPerLitro = kmPercorsi / litriConsumati;
            System.out.println("Il numero di km/litro percorsi è: " + kmPerLitro);
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
