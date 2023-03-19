package main.java.Methods;

import main.java.Functions;
import main.java.IO;

public class SimpsonMethod implements Method {

    private double a;
    private double b;
    private double e;
    private int number;

    Functions function = new Functions();

    public SimpsonMethod(double a, double b, double e, int number) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.number = number;
    }


    @Override
    public void method() {
        if (a > b) {
            double tmp = a;
            a = b;
            b = tmp;
        }
        int n = 2;
        double y0 = function.f(a, number);
        double yn = function.f(b, number);
        double r = e + 1;
        double I = function.getI(a, b, number);
        double result = 0;

        while (r > e) {
            double aNew = a;
            double sumEven = 0;
            double sumOdd = 0;
            n *= 2;
            double step = (b - a) / n;
            aNew += step;

            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    sumEven += function.f(aNew, number);
                } else {
                    sumOdd += function.f(aNew, number);
                }
                aNew += step;
            }
            result = step * (y0 + 4 * sumOdd + 2 * sumEven + yn) / 3;
            r = Math.abs(I - result);
        }
        IO io = new IO();
        io.outputFunctions(result, n, r);

    }
}
