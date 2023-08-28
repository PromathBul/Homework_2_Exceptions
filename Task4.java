/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
import java.util.Scanner;

public class Task4 {
    public static String inputString(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        String text = scanner.nextLine();
        scanner.close();
        // исхожу из опредения, что пустая строка - это строка с присвоенным значением, но нулевой длиной, то есть ""
        if (text.length() == 0) {
            throw new RuntimeException("Пустые строки вводить нельзя.");
        }
        System.out.println("Введенная строка сохранена.");
        return text;
    }

    public static void main(String[] args) {
        String query = inputString("Введите фразу: ");
        System.out.println(query);
    }
}
