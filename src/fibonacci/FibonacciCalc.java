package fibonacci;

public class FibonacciCalc {

    /**
     * Calcula a sequência de Fibonacci até o valor especificado.
     *
     * Este método calcula a sequência de Fibonacci até o valor especificado e retorna
     * um array contendo os valores da sequência.
     *
     * @param valorDeEntrada O valor limite até o qual a sequência de Fibonacci será calculada.
     * @return Um array contendo os números da sequência de Fibonacci até o valor especificado.
     */
    public int[] calcularFibonacci(Integer valorDeEntrada) {
        int[] valorDeSaida = new int[valorDeEntrada];

        for (int i = 0; i < valorDeEntrada; i++) {
            // Se o índice for 0 ou 1, atribui o próprio índice como valor
            if (i < 2) {
                valorDeSaida[i] = i;
            } else {
                // Caso contrário, calcula o valor da sequência somando os dois valores anteriores
                valorDeSaida[i] = valorDeSaida[i - 1] + valorDeSaida[i - 2];
            }
        }

        return valorDeSaida;
    }
}
