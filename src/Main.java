import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2020;
        if(clientOS == 0){
            if(clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        }
        else {
            if(clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Андроид по ссылке.");
            } else if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Андроид по ссылке.");
            }
        }
        int year = 2021;
        int initialYear = 1584;
        if((year % 4 == 0) && year % 100 > 0){
            System.out.println(year + " год является високосным.");
        }else if(year % 100 == 0 && year % 400 == 0){
            System.out.println(year + " год является високосным.");
        }else {
            System.out.println("Год " + year + " не является високосным.");
        }
        int deliveryDistance = 95;
        int needDays = 1;
        if(deliveryDistance < 20){
            needDays = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            needDays = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            needDays = 3;
        }else if(deliveryDistance > 100){
            needDays = 0;
        }
        if(needDays == 0){
            System.out.println("Доставки нет.");
        }
        else{
            System.out.println("Потребуется дней: " + needDays);
        }
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println(monthNumber + "-й месяц, (он же Январь), принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println(monthNumber + "-й месяц, (он же Февраль), принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println(monthNumber + "-й месяц, (он же Март), принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println(monthNumber + "-й месяц, (он же Апрель), принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println(monthNumber + "-й месяц, (он же Май), принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println(monthNumber + "-й месяц, (он же Июнь), принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println(monthNumber + "-й месяц, (он же Июль), принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println(monthNumber + "-й месяц, (он же Август), принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println(monthNumber + "-й месяц, (он же Сентябрь), принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println(monthNumber + "-й месяц, (он же Октябрь), принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println(monthNumber + "-й месяц, (он же Ноябрь), принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println(monthNumber + "-й месяц, (он же Декабрь), принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
    }
}