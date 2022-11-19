public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        byte clientOS = 0;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else System.out.println("Установите версию приложения для iOS по ссылке");

    }

    public static void task2 () {
        System.out.println("Задача 2");

        byte clientOS = 1;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android  по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android  по ссылке");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int year = 2021;

        if ((year % 4 == 0) && (year % 100 != 0)  && year < 400) {
            System.out.println(year + " год является високосным");
        } else if (year == 400){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год НЕ является високосным");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        byte deliveryDistance = 95;
        byte addTime = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + addTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (addTime + addTime));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (addTime + addTime + addTime));
        } else System.out.println("Доставка невозможна");
    }

    public static void task5 () {
        System.out.println("Задача 5");

        byte monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Лето");
                break;
            default:
                System.out.println("В году только 12 месяцев");
        }
    }
}