import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = 0;
        Random randomize = new Random();
        int userValue = 0;

        value = randomize.nextInt(100);
        System.out.println("Угадайте загаданное число от 0 до 100");

        while (true) {
            System.out.print("введите число: ");
            userValue = new Scanner(System.in).nextInt();

            if (userValue == value) {
                System.out.println("Поздравляем вы угадали загаданное число: " + value);
                break;
            }

            if (userValue < value) {
                System.out.println("Загаданное число больше");
            }

            if (userValue > value) {
                System.out.println("Загаданное число меньше");
            }

        }
    }
}
