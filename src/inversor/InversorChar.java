package inversor;

import java.util.Arrays;

public class InversorChar {

    /**
     * Uma função para inverter todos os caracteres de uma string
     * Nessa implementação, estou usando arraus de caracteres
     * @param stringInicial String que vai ser convertida
     * @return nova String
     */
    public String inverter(String stringInicial) {

        if (stringInicial.isBlank() || stringInicial.isEmpty()) {
            throw new IllegalArgumentException("A string não pode ser vazio");
        }

        // Estou usando um array auxiliar para armazenar os caracteres da string inicial
        char[] auxArray = new char[stringInicial.length()];

        // Transformando a string inicial em um array de char
        char[] arrayString = stringInicial.toCharArray();

        // Armazenando o tamanho do array
        int lengthArray = arrayString.length;

        // Vai ser utilizada para acessar os indices do array auxiliar

        int contador = 0;

        // Iniciando um looping com o primeiro caracter sendo o ultimo do array
        for (int i = lengthArray- 1 ; i >= 0; i--) {

            // Salvando cada caracter do array de string no meu array auxiliar
            auxArray[contador] = arrayString[i];
            contador++;
        }
        return new String(auxArray);
    }
}
