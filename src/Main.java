import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String outputChatbox;
        int n = 2;
        Scanner parser = new Scanner(System.in);
        Random random = new Random();
        outputChatbox = "Insert loop size:";
        System.out.println(outputChatbox);
        if (n > 1) {
            n = parser.nextInt();
        }
        int[] numbers = new int[n + 1];
        int[] primeNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            int number = random.nextInt(20);
            outputChatbox = String.valueOf(number);
            System.out.println("ran" + outputChatbox);
            numbers[i] = number;
            if (number % 2 == 0) {
                System.out.println("this ran");
                primeNumbers[primeNumbers.length] = number;
            }
        }
        for (int index = 0; index < n; index++) {
            System.out.println(primeNumbers[index]);
        }
    }
}