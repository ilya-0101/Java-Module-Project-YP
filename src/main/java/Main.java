import java.util.List;

public class Main {
    public static void main(String[] args) {
        int persons = Guests.getPerson();
        System.out.println("Количество человек: " + persons);
        List<Calculate.GoodData> goods = Calculate.getGoods();
        double averagePrice = 0.0;
        for (Calculate.GoodData good : goods) {
            averagePrice += good.goodCost;
        }

        double finalCoast = averagePrice / persons;
        printResult(finalCoast);
    }

    private static void printResult(double price) {
        String format = String.valueOf((int) price);
        int preLastDigit = Integer.parseInt(format) % 100 / 10;
        if (preLastDigit == 1)
        {
            System.out.println("Сумма к оплате: " + String.format("%.2f", price) + " рублей");
            return;
        }
        switch (Integer.parseInt(format) % 10) {
            case 1 -> System.out.println("Сумма к оплате: " + String.format("%.2f", price) + " рубль");
            case 2, 3, 4 -> System.out.println("Сумма к оплате: " + String.format("%.2f", price) + " рубля");
            default ->
                    System.out.println("Сумма к оплате: " + String.format("%.2f", price) + " рублей");
        }
    }
}