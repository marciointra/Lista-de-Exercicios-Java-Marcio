package atividade10;
/*
10. Contagem Regressiva: Desenvolva um programa que exiba uma contagem regressiva de 10 até 0, 
utilizando um laço WHILE. O programa deve exibir cada número em sequência até alcançar o zero.
*/

public class Main {
    public static void main(String[] args) {
        int numero = 10;

        while(numero >= 0){
            System.out.print(numero+", ");
            numero--;
        }
    }
}