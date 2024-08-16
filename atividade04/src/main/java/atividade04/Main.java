package atividade04;

/*]
 4. Sistema de Login: Desenvolva um programa que simule um sistema de login simples. O
programa deve solicitar o nome de usuário e senha, e permitir até 3 tentativas. Utilize
WHILE para controlar o número de tentativas e IF-ELSE para verificar a autenticidade dos
dados.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int rep=0; String login="", senha="12345";
        
        System.out.println("Bem vindo usuário!");
        System.out.println("obs.: 'Você tem 3 tentativas para logar no sistema.'");
        
        while(rep < 3){
            System.out.print("Login: ");
            login = ler.nextLine();
    
            System.out.print("Senha: ");
            String inputSenha = ler.nextLine();

            if (!inputSenha.equals(senha)){
                System.out.println("tentativa nº: "+(rep+1)+" Falha ao fazer login!");
            }else{
                System.out.println("Parabens! você está LOGADO!");
                break;
            }
            rep++;
        }
        if(rep == 3){
            System.out.println("Você esgotou todas tentativas!");
        }
    }
}
