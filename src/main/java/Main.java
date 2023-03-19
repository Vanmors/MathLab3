package main.java;


import main.java.Methods.RectangleMethod;
import main.java.Methods.SimpsonMethod;
import main.java.Methods.TrapezoidMethod;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double e = 0;
        int number = 0;
        int method = 0;
        int methodForRectangle = 0;

        try {
            System.out.println("Выбирите функицю:\n" +
                    "1: x^2\n" +
                    "2: 1/10*x^4 + 1/5*x^2 -7\n" +
                    "3: sin(x) + cos(x)");
            number = scanner.nextInt();
            while (number > 3 || number < 1) {
                System.out.println("Введите число от 1 до 3");
                number = scanner.nextInt();
            }
            System.out.println("Выберете метод решения: \n" +
                    "1: Метод прямоугольников\n" +
                    "2: Метод Симпсона\n" +
                    "3: Метод трапеции");
            method = scanner.nextInt();
            while (method > 3 || method < 1) {
                System.out.println("Введите число от 1 до 3");
                method = scanner.nextInt();
            }

            if (method == 1) {
                System.out.println("Выберете метод решения для метода прямоугольников: \n" +
                        "1: Средина\n" +
                        "2: Левый\n" +
                        "3: Правый");
                methodForRectangle = scanner.nextInt();
            }

            System.out.println("Введите a: ");
            a = scanner.nextDouble();

            System.out.println("Введите b: ");
            b = scanner.nextDouble();

            System.out.println("Введите e: ");
            e = scanner.nextDouble();

        } catch (InputMismatchException exception) {
            System.out.println("Некорректно введены данные");
            System.exit(0);
        }

        switch (method) {
            case 1 -> {
                RectangleMethod rectangleMethod = new RectangleMethod(a, b, e, number, methodForRectangle);
                rectangleMethod.method();
            }
            case 2 -> {
                SimpsonMethod simpsonMethod = new SimpsonMethod(a, b, e, number);
                simpsonMethod.method();
            }
            case 3 -> {
                TrapezoidMethod trapezoidMethod = new TrapezoidMethod(a, b, e, number);
                trapezoidMethod.method();
            }
        }
    }
}