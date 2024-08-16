package atividade15;
/*
15. Cálculo de Fatorial: Crie um programa que solicite ao usuário um número e
utilize um laço FOR para calcular o fatorial desse número. O programa deve exibir
o resultado ao final.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int numero = ler.nextInt();

        long fatorial = 1;

        for(int i=1; i<=numero; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de "+numero+" e "+fatorial);
        ler.close();
    }
}