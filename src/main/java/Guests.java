import java.util.Scanner;

 public class Guests {
         static Scanner scanner = new Scanner(System.in);

         public static void main(String[] args) {
             getPerson();
         }

         public static int getPerson() {
             System.out.println("На скольких человек необходимо разделить счёт?");
             while (true) {
                 int x = scanner.nextInt();

                 if (x > 1) {
                     System.out.println("Тогда будем считать");
                     return x;
                 } else {
                     System.out.println("Ошибка, введите корректное значение гостей");
                 }
             }
         }
     }