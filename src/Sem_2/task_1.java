package Sem_2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        float number = requestFloatInput();
        System.out.println("Введенное число: " + number);
    }

    public static float requestFloatInput() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        float number = 0.0f;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Введите дробное число: ");
                number = scanner.nextFloat();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
                scanner.nextLine();
            }
        }

        return number;
    }
}


