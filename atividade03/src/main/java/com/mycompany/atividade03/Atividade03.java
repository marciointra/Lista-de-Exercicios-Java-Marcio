/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade03;

import java.util.Scanner;

/**
3. Calculadora Simples: Crie uma calculadora que permita ao usuário escolher entre as
operações básicas (adição, subtração, multiplicação e divisão). Utilize IF-ELSE para
determinar a operação escolhida e execute-a com base nos números inseridos pelo usuário.
 */
public class Atividade03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int adcao, subtracao, multiplicacao, divisao;
        
        System.out.print("Digite um valor do 1º número: ");
        int num1 = ler.nextInt();
        System.out.print("Digite um valor do 2º número: ");
        int num2 = ler.nextInt();
        
        System.out.println("Digite o sinal da operação aritimética desejada: ");
        System.out.println("\t Digite 1 = '(+) ADÇÃO'");
        System.out.println("\t Digite 2 = '(-) SUBTRAÇÃO'");
        System.out.println("\t Digite 3 = '(*) MULTIPLICAÇÃO'");
        System.out.println("\t Digite 4 = '(/) DIVISÃO'");
        int opcao = ler.nextInt();
        
            if(opcao == 1){
                adcao = num1 + num2;
                System.out.println("O resultado da adção entre "+num1+" + "+num2+" = "+adcao);
            }
            else if(opcao == 2){
                subtracao = num1 - num2;
                System.out.println("O resultado da subtração entre "+num1+" - "+num2+" = "+subtracao);
            }
            else if(opcao == 3){
                multiplicacao = num1 * num2;
                System.out.println("O resultado da multiplicação entre "+num1+" * "+num2+" = "+multiplicacao);
            }
            else if(opcao == 4){
                divisao = num1 / num2;
                System.out.println("O resultado da divisão entre "+num1+" / "+num2+" = "+divisao);
            }else{
                System.out.println("Você digitou '"+opcao+"', esse operador nao é válido ");
            }
        }
    }

