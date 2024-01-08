import java.util.Scanner;

public class Palindrom {

    public static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un cuvant: ");
        String word = scanner.next();

        if (isPalindrome(word)) {
            System.out.println("Cuvantul '" + word + "' este palindrom.");
        } else {
            System.out.println("Cuvantul '" + word + "' nu este palindrom.");
        }
    }
}