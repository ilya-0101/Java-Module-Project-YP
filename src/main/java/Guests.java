import java.io.Serializable;
import java.util.Scanner;

 public class Guests {
         static Scanner scanner = new Scanner(System.in);

         public static void main(String[] args) {
             getPerson();
         }

     public static int getPerson() {
         int count = 0;
         System.out.println("На скольких человек необходимо разделить счёт?");
         while (count < 1) {
             Serializable serializable = scanner.hasNextInt() ? count = scanner.nextInt() : scanner.next();
             {
                 if (serializable instanceof Integer) {
                     if (count > 1) {
                         System.out.println("Тогда будем считать");
                         return count;
                     } else {
                         System.out.println("Ошибка, введите корректное значение гостей");
                     }
                 } else {
                     System.out.println("Ошибка, введите корректное значение гостей");
                 }
             }
         }
         return count;
     }
     }