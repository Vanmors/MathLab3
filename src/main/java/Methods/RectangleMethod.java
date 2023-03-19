package main.java.Methods;

import main.java.Functions;
import main.java.IO;

public class RectangleMethod implements Method {

    private double a;
    private double b;
    private double e;
    private int number;
    private int numberOfMethod;

    Functions function = new Functions();

    public RectangleMethod(double a, double b, double e, int number, int numberOfMethod) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.number = number;
        this.numberOfMethod = numberOfMethod;
    }

    @Override
    public void method() {
        switch (numberOfMethod) {
            case (1) -> {
                methodMid();
            }
            case (2) -> {
                methodLeft();
            }
            case (3) -> {
                methodRight();
            }
        }
    }


    public void methodMid() {
        if (a > b) {
            double tmp = a;
            a = b;
            b = tmp;
        }
        double aNew = a, step, sum = 0, r = e + 1, I = function.getI(a, b, number);
        int n = 2;

        while (r > e) {
            n *= 2;
            step = (b - aNew) / n;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += function.f(aNew + step / 2, number);
                aNew += step;
            }
            sum = sum * step;
            r = Math.abs(I - sum);
            aNew = a;
        }
        if (Double.isNaN(sum) || Double.isNaN(I) || Double.isNaN(r) || Double.isNaN(Math.abs(100 * r / ((I + sum) / 2)))) {
            System.out.println("В выбранном интервале присутсвует разрыв первого рода!\n");
        } else {
            IO io = new IO();
            io.outputFunctions(sum, n, r);
        }
    }

    public void methodLeft() {
        if (a > b) {
            double tmp = a;
            a = b;
            b = tmp;
        }
        double aNew = a, step, sum = 0, r = e + 1, I = function.getI(a, b, number);
        int n = 2;

        while (r > e) {
            n *= 2;
            step = (b - aNew) / n;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += function.f(aNew, number);
                aNew += step;
            }
            sum = sum * step;
            r = Math.abs(I - sum);
            aNew = a;
        }
        if (Double.isNaN(sum) || Double.isNaN(I) || Double.isNaN(r) || Double.isNaN(Math.abs(100 * r / ((I + sum) / 2)))) {
            System.out.println("В выбранном интервале присутсвует разрыв первого рода!\n");
        } else {
            IO io = new IO();
            io.outputFunctions(sum, n, r);
        }
    }

    public void methodRight() {
        if (a > b) {
            double tmp = a;
            a = b;
            b = tmp;
        }
        double aNew = a, step, sum = 0, r = e + 1, I = function.getI(a, b, number);
        int n = 2;

        while (r > e) {
            n *= 2;
            step = (b - aNew) / n;
            aNew += step;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += function.f(aNew, number);
                aNew += step;
            }
            sum = sum * step;
            r = Math.abs(I - sum);
            aNew = a;
        }
        if (Double.isNaN(sum) || Double.isNaN(I) || Double.isNaN(r) || Double.isNaN(Math.abs(100 * r / ((I + sum) / 2)))) {
            System.out.println("В выбранном интервале присутсвует разрыв первого рода!\n");
        } else {
            IO io = new IO();
            io.outputFunctions(sum, n, r);
        }
    }
}
