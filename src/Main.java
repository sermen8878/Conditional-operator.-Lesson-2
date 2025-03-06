public class Main {
    public static void main(String[] args) {
        var monthNumber = 12;
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Номер месяца должен быть от 1 до 12");
            return;
        }
        String season;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "неизвестный сезон";
                break;
        }
        System.out.println("Месяц с номером " + monthNumber + " принадлежит к сезону: " + season);
    }
}