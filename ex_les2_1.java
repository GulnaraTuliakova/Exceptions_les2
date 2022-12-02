// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;
public class ex_les2_1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число или дробное c точкой ввиде разделителя: ");
        try (Scanner in = new Scanner(System.in)) {
            float number = NumberFloat(in.next());
            if (number != 0)
                System.out.print("Вы ввели число: " + number);
            else
                main(args);
        }
    }

    private static float NumberFloat(String word) {
        float x;
        // while (x == 0.0) {
        try {
            x = Float.parseFloat(word);
        } catch (Exception e) {
            x = 0;
            System.out.println("Формат ввода неверный");
        }
        return x;
    }
}
