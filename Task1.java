/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

/**
 * Task1
 */
import java.util.Scanner;

public class Task1 {

    public static float inputFloat(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String num = scanner.nextLine();
        float convertNum = 0;
        try {
            convertNum = Float.parseFloat(num);
        } catch (NumberFormatException e) {
            System.out.println("Cтрока содержит литералы, и не может быть конвертирована в тип float.");
            convertNum = inputFloat(message + "снова ");
        } finally {
            scanner.close();
        }
        return convertNum;
    }

    public static void main(String[] args) {
        float res = inputFloat("Введите число ");
        System.out.println("Число " + res + " сохранено.");
    }
}