import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prim {

    public static void printPrimes(int[] numbers) {
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti lungimea sirului de numere: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];
        System.out.println("Introduceti elementele sirului de numere: ");
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Numerele prime din sir sunt: ");
        printPrimes(numbers);
    }
}