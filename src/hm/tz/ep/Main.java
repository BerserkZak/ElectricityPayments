package hm.tz.ep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            int amount;
            String answer_lang, answer_type, name;
            double price, price_night, power, time, time_night, result;

            System.out.println("Выберите язык:");
            System.out.println("1 - Русский");
            System.out.println("2 - Английский");
            answer_lang = input.nextLine();
            if ("1".equalsIgnoreCase(answer_lang)) {
                System.out.println("Выберите тип электротарификации:");
                System.out.println("1 - Одноставочный");
                System.out.println("2 - Двухставочный");
                answer_type = input.nextLine();
                if ("1".equalsIgnoreCase(answer_type)) {
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
                } else {
                    System.out.println("Введите стоимость за КВт/ч по дневной зоне:");
                    price = input.nextDouble();
                    System.out.println("Введите стоимость за КВт/ч по ночной зоне:");
                    price_night = input.nextDouble();
                    System.out.println("Введите название прибора:");
                    name = input.next();
                    System.out.println("Введите количество приборов:");
                    amount = input.nextInt();
                    System.out.println("Введите мощность прибора(ов) в Ваттах:");
                    power = input.nextDouble();
                    System.out.println("Введите время работы в часах с 7 утра до 23 вечера:");
                    time = input.nextDouble();
                    System.out.println("Введите время работы в часах с 23 вечера до 7 утра:");
                    time_night = input.nextDouble();
                    result = ((((((power / 1000)) * ((time * 30) * price)))) + ((((((power / 1000)) * ((time_night * 30) * price_night)))))) * amount;
                }
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
