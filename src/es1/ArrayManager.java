package es1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayManager {
    private int[] array;
    private Random random;
    private Scanner scanner;

    public ArrayManager() {
        array = new int[5];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void start() {
        populateArray();
        printArray();
        performOperations();
    }

    private void populateArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    private void printArray() {
        System.out.println("Array originale: " + Arrays.toString(array));
    }

    private void performOperations() {
        int numero;
        do {
            try {
                System.out.print("Inserisci un numero (0 per terminare): ");
                numero = scanner.nextInt();
                if (numero == 0) {
                    break;
                }
                System.out.print("Scegli la posizione del numero inserito (da 1 a 5): ");
                int posizione = scanner.nextInt();
                if (posizione < 1 || posizione > 5) {
                    throw new IllegalArgumentException("La posizione inserita non è valida.");
                }
                array[posizione - 1] = numero;
                printArray();
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
                scanner.nextLine();
            }
        } while (true);
        scanner.close();
        System.out.println("Programma terminato.");
    }
}
