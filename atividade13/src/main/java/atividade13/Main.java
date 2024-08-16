package atividade13;
/*
13. Verificação de Ano Bissexto: Crie um programa que solicite ao usuario um ano
e utilize IF-ELSE para verificar se ele e bissexto. O programa deve seguir as
regras de divisibilidade para determinar o resultado.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um ano qualquer para saber se ele e bissexto: ");
        int ano = ler.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println(ano + " e um ano bissexto!");
        }else{
            System.out.println(ano + " não e um ano bissexto.");
        }
        ler.close();
    }
}
