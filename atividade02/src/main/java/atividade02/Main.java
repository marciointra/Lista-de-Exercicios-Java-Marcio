package atividade02;
/*
2. Jogo de Adivinhação: Desenvolva um programa em que o computador escolhe um número
aleatório entre 1 e 100, e o usuário tem que adivinhar. Utilize um laço WHILE para permitir
múltiplas tentativas até que o usuário acerte, e IF-ELSE para fornecer dicas (se o número é
maior ou menor).
 */
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random percorra = new Random();
        Scanner ler = new Scanner(System.in);
        
        int numberCoringa = percorra.nextInt(0,100);
        int number=0;
        
        while(number != numberCoringa){
            System.out.print("Digite um numero: ");
            number = ler.nextInt();
            
            if(number == numberCoringa){
                System.out.println("Parabens! voce acertou o numero escolhido");
                numberCoringa = number;
            }
            else if(number > numberCoringa){
                System.out.println(number+" e MAIOR que numero sorteado: "+numberCoringa);
            }
            else{
                System.out.println(number+" e MENOR que numero sorteado "+numberCoringa);
            }
        }
    }
}