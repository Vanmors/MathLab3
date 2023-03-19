package main.java;


import main.java.Methods.SimpsonMethod;
import main.java.Methods.TrapezoidMethod;

public class Main {

    public static void main(String[] args) {
        SimpsonMethod simpsonMethod = new SimpsonMethod(1, 2, 0.01, 1);
        TrapezoidMethod trapezoidMethod = new TrapezoidMethod(1, 2, 0.01, 2);
        trapezoidMethod.method();
    }
}