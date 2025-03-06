public class Main {
    public static void main(String[] args) {
        var deliveryDistance = 95;
        var deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            System.out.println("Доставка свыше 100 км невозможна");
            return;
        }

        System.out.println("Потребуется дней: " + deliveryTime);
    }
}