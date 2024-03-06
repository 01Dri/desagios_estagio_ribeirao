package tests;

import fibonacci.FibonacciCalc;

public class FibonacciTest {


    public boolean testFibonacci() {
        int tamanhoFibonacci = 10;
        FibonacciCalc fibonacciCalc = new FibonacciCalc();
        return fibonacciCalc.calcularFibonacci(10).length == tamanhoFibonacci;
    }

    public boolean testUltimoValorFibonacci() {
        int valorFinalFibonacciDe10 = 34;
        FibonacciCalc fibonacciCalc = new FibonacciCalc();
        return fibonacciCalc.calcularFibonacci(10)[9] == valorFinalFibonacciDe10;

    }


}
