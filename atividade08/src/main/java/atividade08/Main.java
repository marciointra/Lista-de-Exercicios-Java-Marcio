package atividade08;
/*
8. Sistema de Senha: Desenvolva um programa que solicite ao usuário uma senha e 
utilize IF-ELSE para verificar se ela atende aos critérios de segurança (mínimo de 8 caracteres). 
O programa deve permitir ao usuário tentar novamente até que uma senha válida seja inserida.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma senha (mínimo 8 caracteres): ");
            String senha = ler.nextLine();

            if(senha.length() >= 8){
                System.out.println("Senha válida!");
                break;
            }else{
                System.out.println("Senha inválida. Tente novamente.");
            }
        }
    }
}
