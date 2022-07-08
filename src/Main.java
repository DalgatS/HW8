public class Main {
    public static void main(String[] args) {
        System.out.println(visokosniyCheck(2001));
        System.out.println(telephoneCheck(0, 2012));
        System.out.println(deliveryTime(95));
    }


    public static String visokosniyCheck(int year) {
        if ((year % 100 != 0 || year % 400 == 0) && (year % 4 == 0)) {
            return (year + " год является високосным");
        }
        return (year + " год не является високосным");
    }


    public static String telephoneCheck(int clientOS, int clientDeviceYear) {
        int currentYear = 2022; // Локал дата не работает
        String clientOS2 = "";
        String clientDeviceYear2 = "";
        if (clientOS == 1) {
            clientOS2 = "Android";
        } else {
            clientOS2 = "IOS";
        }

        if (clientDeviceYear < currentYear) {
            clientDeviceYear2 = "облегченную ";
        }
        clientDeviceYear2 = "";

        return ("Установите " + clientDeviceYear2 + "версию приложения для " + clientOS2 + " по ссылке");
    }

    public static String deliveryTime(int deliveryDistance) {
        int deliveryMinDistance = 20;
        int deliveryInterval = 40;
        int deliveryTimeD = 1;
        if (deliveryDistance <= deliveryMinDistance) {
            return ("Потребуется дней: " + deliveryTimeD);
        } else {
            return ("Потребуется дней: " + (deliveryTimeD + deliveryDistance / deliveryInterval));
        }
    }

}


