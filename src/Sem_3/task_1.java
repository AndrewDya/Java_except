package Sem_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите данные в формате: (Фамилия Имя Отчество номер телефона) ");
            String input = scanner.nextLine();

            String[] data = input.split(" ");

            if (data.length != 4) {
                System.out.println("Ошибка: неверное количество данных.");
                return;
            }

            String surname = data[0];
            String firstName = data[1];
            String middleName = data[2];
            long phoneNumber = Long.parseLong(data[3]);

            String filename = surname + ".txt";
            FileWriter fileWriter = new FileWriter(filename, true);

            String line = surname + firstName + middleName + phoneNumber;
            fileWriter.write(line + System.lineSeparator());

            fileWriter.close();

            System.out.println("Данные успешно записаны в файл " + filename);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи файла:");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат номера телефона.");
        }
    }
}
