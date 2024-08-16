package atividade05;
/*
5. Tabuada Personalizada: Crie um programa que solicite ao usuário um número e gere a
tabuada desse número de 1 a 10 utilizando um laço FOR. O programa deve exibir o
resultado de cada multiplicação.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("\nDigite um numero para gerar sua tabuada: ");
        int num = ler.nextInt();

        for(int i=1;i<=10;i++){
            int resp = num*i;
            System.out.println(num+" x "+i+" = "+resp);
        }
    }
}