public class Main {
    public static void main(String[] args) {

        int cost = 21_367; // Стоимость билета
        int mile = 20; // Количество рублей за 1 милю
        int bonus = cost / mile; // Количество бонусных миль

        System.out.println("Бонусные мили: " + bonus);

    }
}