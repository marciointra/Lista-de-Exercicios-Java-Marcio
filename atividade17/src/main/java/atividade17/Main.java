package atividade17;
/*
17. Contagem de Vogais: Crie um programa que solicite ao usuário uma frase e utilize
um laço FOR para contar o número de vogais presentes. Utilize IF para verificar cada
caractere e determinar se é uma vogal.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = ler.nextLine().toLowerCase();

        int contadorVogais = 0;

        for(int i=0; i<frase.length(); i++){
            char caractere = frase.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }
        System.out.println("Numero de vogais na frase: " + contadorVogais);
        ler.close();
    }
}
