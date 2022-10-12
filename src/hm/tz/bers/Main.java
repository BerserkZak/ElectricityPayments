package hm.tz.bers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int time;
        double price, power, result;
        System.out.println("Введите стоимость за КВт/ч:");
        price = input.nextDouble();
        System.out.println("Введите время работы в часах за день:");
        time = input.nextInt();
        System.out.println("Введите мощность прибора:");
        power = input.nextDouble();
        result = (((((power / 1000))*(time*30)*price)));
        System.out.println("За месяц вы заплатите: " + result + " рублей");

    }

}
