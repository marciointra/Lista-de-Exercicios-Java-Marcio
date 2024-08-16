package atividade09;

/*
9. Verificação de Números Primos: Crie um programa que solicite ao usuário um número e utilize um 
laço FOR para verificar se o número é primo. Utilize IF para determinar se ele é divisível por 
outros números além de 1 e ele mesmo.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
    
            System.out.print("Digite um numero inteiro positivo: ");
            int numero = ler.nextInt();
    
            boolean numPrimo = true;
    
            if(numero <= 1){
                numPrimo = false;
            }else{
                for(int i = 2; i <= Math.sqrt(numero); i++){
                    if(numero % i == 0) {
                        numPrimo = false;
                        break;
                    }
                }
            }
            if(numPrimo){
                System.out.println(numero + " é um numero primo!");
            }else{
                System.out.println(numero + " não e um numero primo.");
            }
        }
    }