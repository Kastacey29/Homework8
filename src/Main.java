import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2100;
        printResult(year);
        int clientOS = 1;
        int clientDeviceYear = 2022;
        outputScreen(clientOS, clientDeviceYear);
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + outputDays(deliveryDistance));
    }

    private static void printResult(int number) {
        boolean leapYear = isLeapYear(number);
        printIsLeapYearResult(number, leapYear);
    }

    private static boolean isLeapYear(int number) {
        return number % 4 == 0 && number % 100 != 0 || number % 400 == 0;
    }

    private static void printIsLeapYearResult(int number, boolean leapYear) {
        if (leapYear) {
            System.out.println(number + " - високосный год.");
        } else {
            System.out.println(number + " - не високосный год.");
        }
    }

    private static void outputScreen(int OS, int year) {
        int currentYear = LocalDate.now().getYear();
        if ((OS == 0) && (year >= currentYear)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if ((OS == 0) && (year < currentYear)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        if ((OS == 1) && (year >= currentYear)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if ((OS == 1) && (year < currentYear)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    private static int outputDays(int distance) {
        int deliveryDays = 1;
        if (distance > 20) {
            deliveryDays++;
        }
        if (distance > 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }
}