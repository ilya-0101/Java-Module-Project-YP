import java.io.Serializable;
import java.util.Scanner;

 public class Guests {
         static Scanner scanner = new Scanner(System.in);

     public static int getPerson() {
         int count = 0;
         System.out.println("На скольких человек необходимо разделить счёт?");
         while (true) {
             if (scanner.hasNextInt()) {
                 count = scanner.nextInt();
                 if (count > 1) {
                     System.out.println("Тогда будем считать");
                     break;
                 } else {
                     System.out.println("Число не должно быть отрицательным или равным 0, повторите ввод");
                     continue;
                 }
                 }
             System.out.println("Ошибка, введите корректное значение гостей");
             scanner.next();
             }
         return count;
     }
     }