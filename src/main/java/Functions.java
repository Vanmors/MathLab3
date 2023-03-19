package main.java;

public class Functions {
    public double f(double x, int number) {
        switch (number) {
            case 1 -> {
                return Math.pow(x, 2);
            }
            case 2 -> {
                return  0.1 * Math.pow(x, 4) + 0.2 * Math.pow(x, 2) - 7;
            }
            case (3) -> {
                return Math.sin(x) + Math.cos(x);
            }
            default -> {
                System.out.println("Введите число в диапазоне 1-4");
                return f(x, number);
            }
        }
    }

    public double f_dx(double x, int number) {
        switch (number) {
            case 1 -> {
                return Math.pow(x, 3) / 3;
            }
            case 2 -> {
                return Math.pow(x, 5) / 50 + Math.pow(x, 3) / 15 - 7 * x;
            }
            case (3) -> {
                return Math.sin(x) - Math.cos(x);
            }
            default -> {
                System.out.println("Введите число в диапазоне 1-4");
                return f(x, number);
            }
        }
    }

    public double getI(double a, double b, int number) {
        return f_dx(b, number) - f_dx(a, number);
    }
}
