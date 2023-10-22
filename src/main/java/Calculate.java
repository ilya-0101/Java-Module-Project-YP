import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculate {
    static Scanner scanner = new Scanner(System.in);
    static List<GoodData> goods = new ArrayList<>();

    public static List<GoodData> getGoods() {
        while (true) {
            System.out.println("Добавить новый товар? Если да, то напишите любой символ, если нет, введите завершить...");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("завершить")) {
                if (goods.size() < 1) {
                    System.out.println("Нужно добавить хотя бы 1 товар");
                } else {
                    System.out.println("Добавленные товары:");
                    for (GoodData good : goods) {
                        System.out.println("наименование товара: " + good.goodName + " стоимость: " + good.goodCost);
                    }
                    return goods;
                }
            } else {
                String goodName = getGoodName();
                Double goodCoast = getGoodCoast();
                GoodData item = new GoodData(goodName, goodCoast);
                goods.add(item);
                System.out.println("наименование товара: " + goods.get(goods.size() - 1).goodName + " стоимость: " + goods.get(goods.size() - 1).goodCost);
            }
        }
    }

    public static String getGoodName() {
        System.out.println("Введите наименование товара");
        return scanner.next();
    }

    public static Double getGoodCoast() {
        System.out.println("Введите цену товара");
        return Double.parseDouble(String.format("%.2f", Double.parseDouble(scanner.next())).replace(',', '.'));
    }

    public static class GoodData {
        private final String goodName;
        final Double goodCost;

        public GoodData(String goodName, Double goodCost) {
            this.goodName = goodName;
            this.goodCost = goodCost;
        }
    }
}
