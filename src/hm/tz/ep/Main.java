package hm.tz.ep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double result;
        String name;
        try (Scanner input = new Scanner(System.in)) {

            int amount;
            String answertwo;
            double price, power, time;

            System.out.println("Напишите q для русского языка либо e для английского.");
            answertwo = input.nextLine();
            if ("q".equalsIgnoreCase(answertwo)) {
                System.out.println("Введите стоимость за КВт/ч:");
                price = input.nextDouble();
                System.out.println("Введите название прибора:");
                name = input.next();
                System.out.println("Введите количество приборов:");
                amount = input.nextInt();
                System.out.println("Введите мощность прибора(ов) в Ваттах:");
                power = input.nextDouble();
                System.out.println("Введите время работы в часах за рабочий день:");
                time = input.nextDouble();
                result = ((((((power / 1000)) * (time * 30) * price)))) * amount;
                System.out.println("За " + name + " в месяц вы заплатите: " + result + " рублей(я).");
            } else {
                System.out.println("Write price for KWh/h:");
                price = input.nextDouble();
                System.out.println("Name thing:");
                name = input.next();
                System.out.println("Set amount:");
                amount = input.nextInt();
                System.out.println("Set power in Wh:");
                power = input.nextDouble();
                System.out.println("Set time of work in hours:");
                time = input.nextDouble();
                result = ((((((power / 1000)) * (time * 30) * price)))) * amount;
                System.out.println("For " + name + " you will pay: " + result + " in a month in RUB.");
            }



    }

}}
