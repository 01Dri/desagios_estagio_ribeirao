import fibonacci.FibonacciCalc;
import inversor.InversorChar;
import tests.FibonacciTest;
import tests.InversorCharTest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Alguns testes para verificar se o algoritmo está funcionando
        FibonacciTest fibonacciTest = new FibonacciTest();
        System.out.println(fibonacciTest.testFibonacci());
        System.out.println(fibonacciTest.testUltimoValorFibonacci());


        InversorCharTest inversorCharTest = new InversorCharTest();
        System.out.println(inversorCharTest.testInversor());
        System.out.println(inversorCharTest.testInversorUmCaracter());

        // Esse teste vai lançar uma exceção
        // System.out.println(inversorCharTest.testStringVaziaException());



        FibonacciCalc fibonacciCalc = new FibonacciCalc();
        System.out.println("Digite um número para calcular seu fibonacci: ");
        Integer valor = scanner.nextInt();
        int[] resultado = fibonacciCalc.calcularFibonacci(valor);
        System.out.println("O resultado do seu fibonacci de " + valor + " é: " + Arrays.toString(resultado));

        InversorChar inversor = new InversorChar();
        System.out.println("Digite uma palavra para ser invertida: ");
        String string = scanner.next();
        System.out.println("O resultado é: " + inversor.inverter(string));

    }
}