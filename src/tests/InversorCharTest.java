package tests;

import inversor.InversorChar;

public class InversorCharTest {


    public boolean testInversor() {
        String v1 = "carro";
        String resultado = "orrac";
        InversorChar inversorChar = new InversorChar();
        return inversorChar.inverter(v1).equals(resultado);
    }

    public boolean testInversorUmCaracter() {
        String v1 = "c";
        String resultado = "c";
        InversorChar inversorChar = new InversorChar();
        return inversorChar.inverter(v1).equals(resultado);
    }


    // Essa função deve lançar a exceção IllegalArgument
    public  boolean testStringVaziaException() {
        String v1 = "";
        String resultado = "";
        InversorChar inversorChar = new InversorChar();
        return inversorChar.inverter(v1).equals(resultado);
    }
}
