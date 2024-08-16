package atividade07;
/*
7. Contagem de Números Pares e Ímpares: Crie um programa que solicite ao usuário um
número e utilize um laço FOR para percorrer todos os números de 1 até o número inserido.
O programa deve contar e exibir a quantidade de números pares e ímpares.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtdInpares=0; int qtdPares=0;
        int pares, impares;

        System.out.print("Digite um numero: ");
        int num = ler.nextInt();

        for(int i=0;i<=num;i++){
            if(i % 2 == 0){
                qtdPares=qtdPares+1;
                System.out.print(i+" | ");
            }
        }
        System.out.println("\nQTD numeros pares: "+qtdPares+"\n");

        for(int j=0;j<=num;j++){
            if(j % 2!= 0){
                qtdInpares=qtdInpares+1;
                System.out.print(j+" | ");
            }
        }
        System.out.println("\nQTD numeros impares: "+qtdInpares);
    }
}