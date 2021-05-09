package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double weight, height, bodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите Ваш рост в сантиметрах: ");
        height = input.nextDouble();

        System.out.print("Введите Ваш вес в килограммах: ");
        weight = input.nextDouble();

        bodyMassIndex = Math.round(weight/Math.pow((height/100),2));
        System.out.format("Ваш Индекс массы тела: %.0f %s ", bodyMassIndex,"-");

        if (bodyMassIndex< 16.5) {
            System.out.format("У Вас крайний недостаток веса");
        }

        if (bodyMassIndex >= 16.5 && bodyMassIndex <= 18.4) {
            System.out.format("У Вас недостаток в весе");
        }

        if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9) {
            System.out.format("У Вас нормальный вес тела");
        }

        if (bodyMassIndex >= 25 && bodyMassIndex <= 30) {
            System.out.format("У Вас избыточная масса тела");
        }

        if (bodyMassIndex >= 30.1 && bodyMassIndex <= 34.9) {
            System.out.format("У Вас ожирение (класс I)");
        }

        if (bodyMassIndex >= 35 && bodyMassIndex <= 40) {
            System.out.format("У Вас ожирение (класс II)");
        }

        if (bodyMassIndex > 40) {
            System.out.format("У Вас ожирение (класс III)");
        }

    }
}
