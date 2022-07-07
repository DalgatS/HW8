public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }

    public static void task1() {
        int year = 2000;
        if (visokosniyCheck(year) == 1) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    public static int visokosniyCheck(int year) {
        if ((year % 100 != 0 || year % 400 == 0) && (year % 4 == 0)) {
            return 1;
        }
        return 0;
    }


    public static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2013;

        System.out.println("Установите " + telephoneYearCheck(clientDeviceYear) + "версию приложения для " + telephoneOSCheck(clientOS) + " по ссылке");
    }

    public static String telephoneOSCheck(int OSType) {
        if (OSType == 1) {
            return "Android";
        }
        return "IOS";
    }

    public static String telephoneYearCheck(int telephoneYear) {
        int currentYear = 2022; // Локал дата не работает
        if (telephoneYear < currentYear) {
            return "облегченную ";
        }
        return "";
    }


    public static void task3() {
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + deliveryTime(deliveryDistance));
    }

    public static int deliveryTime(int deliveryDistance) {
        int deliveryMinDistance = 20;
        int deliveryInterval = 40;
        int deliveryTimeD = 1;
        if (deliveryDistance <= deliveryMinDistance) {
            return deliveryTimeD;
        } else {
            return deliveryTimeD + deliveryDistance / deliveryInterval;
        }
    }

}


