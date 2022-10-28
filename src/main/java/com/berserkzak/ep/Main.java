package com.berserkzak.ep;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        ElectricThings fridge = new ElectricThings();

        Scanner inputnew = new Scanner(System.in);

        System.out.println("Введите цену за КВт/ч:");
        double ePrice = inputnew.nextDouble();
        System.out.println("Введите название прибора:");
        fridge.setName(inputnew.next());
        System.out.println("Введите количество электроприборов:");
        fridge.setAmount(inputnew.nextInt());
        System.out.println("Введите время работы в часах:");
        fridge.setTimeIn(inputnew.nextDouble());
        System.out.println("Введите мощность:");
        fridge.setPowerIn(inputnew.nextDouble());

        System.out.println("За " + fridge.getName() + " в месяц вы заплатите: "
                + (fridge.calcPayment()*ePrice) + " рублей(я).");
    }
}
