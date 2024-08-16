package atividade16;
/*
16. Verificação de Palíndromo: Desenvolva um programa que solicite ao usuário uma
palavra e utilize um laço FOR para verificar se ela é um palíndromo. Utilize IF
para comparar os caracteres da palavra e determinar o resultado.
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = ler.nextLine();

        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        boolean palindromo = true;

        for(int i=0; i<palavra.length()/2; i++){
            if(palavra.charAt(i) != palavra.charAt(palavra.length()-1-i)) {
                palindromo = false;
                break;
            }
        }
        if(palindromo){
            System.out.println("A palavra '"+palavra+"' e um palindromo!");
        }else{
            System.out.println("A palavra '"+palavra+"' não e um palindromo.");
        }
        ler.close();
    }
}
