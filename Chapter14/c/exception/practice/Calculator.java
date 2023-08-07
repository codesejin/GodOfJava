package lang.thegodofjava.Chapter14.c.exception.practice;

import lang.thegodofjava.Chapter14.c.exception.MyException;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            calc.printDivide(1,2);
            calc.printDivide(1,0); //If second value is zero, the result will be infinity;
        } catch (MyException e) {
            System.out.println(e.getMessage());;
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public void printDivide(double d1, double d2) throws MyException {
        if (d2 == 0) {
            throw new MyException("Second value can't be Zero");
        }
        double result = d1 / d2;

        System.out.println("result = " + result);
    }
}
