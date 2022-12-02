// 3.Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class ex_les2_4 {
    public static void main(String[] args) {
        System.out.println("Напишите что-нибудь: ");
        try (Scanner in = new Scanner(System.in)) {
            String name = in.nextLine();
            if (name.length() == 0) {
                System.out.println("Строка не должна быть пустой");
                main(args);
            } else
                System.out.println("Вы ввели: " + name);
        }
    }
}
