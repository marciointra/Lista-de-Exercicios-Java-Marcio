package atividade14;
/*
14. Jogo do Par ou Ímpar: Desenvolva um jogo em que o usuário escolhe um número
e o programa sorteia outro número aleatório. Utilize IF-ELSE para determinar se a
soma dos dois números é par ou ímpar, e declare o vencedor com base na escolha do usuário.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Escolha um numero (1 a 10): ");
        int numeroEscolhido = ler.nextInt();

        int numeroAleatorio = (int)(Math.random()*10)+1;

        System.out.println("Numero sorteado: "+numeroAleatorio);

        int soma = numeroEscolhido+numeroAleatorio;

        if(soma%2==0){
            System.out.println("A soma e par!");
            System.out.println("Voce venceu!");
        }else{
            System.out.println("A soma e impar!");
            System.out.println("O computador venceu!");
        }
        ler.close();
    }
}
