public class Main {
    public static void main(String[] args) {
        // Инициализация переменной year
        var year = 2021;  // Год для проверки

        // Проверка, является ли год високосным
        if (year <= 1584) {
            System.out.println(year + " год не поддерживается (должен быть больше 1584)");
        } else if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}