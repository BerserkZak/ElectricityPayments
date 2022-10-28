package com.berserkzak.ep;

public class ElectricThings {
    private String name;
    private int amount;
    private double timeIn;
    private double timeOut;
    private  double powerIn;
    private double powerOut;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount <= 0) {
            System.out.println("Количество не может быть равно или меньше 0! Установлено 1 по умолчанию.");
            this.amount = 1;
        } else this.amount = amount;
    }

    public double getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(double timeIn) {
        if (timeIn <= 0) {
            System.out.println("Время не может быть равно или меньше 0! Установлено 1 по умолчанию.");
            this.timeIn = 1;
        } else this.timeIn = timeIn;
    }

    public double getTimeOut() {
        return calcTimeOut();
    }

    public double getPowerIn() {
        return powerIn;
    }

    public void setPowerIn(double powerIn) {
        if (powerIn <= 0) {
            System.out.println("Мощность не может быть равно или меньше 0! Установлено 1 по умолчанию.");
            this.powerIn = 1;
        } else this.powerIn = powerIn;
    }

    public double getPowerOut() {
        return calcPowerOut();
    }

    private double calcTimeOut() {
            return timeOut = getTimeIn() * 30;
    }

    private double calcPowerOut() {
        return powerOut = getPowerIn() / 1000;
    }

    double calcPayment() {
        return ((getPowerOut()*getTimeOut())*getAmount());
    }

}
