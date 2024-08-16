package atividade20;
/*
20. Cálculo de Desconto: Desenvolva um programa que solicite ao usuário o valor 
de uma compra e o percentual de desconto. Utilize IF-ELSE para aplicar o desconto 
correto e exibir o valor final ao usuário.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = ler.nextDouble();

        System.out.print("Digite o percentual de desconto (0 a 100)%: ");
        double percentualDesconto = ler.nextDouble();

        if(percentualDesconto<0 || percentualDesconto>100){
            System.out.println("Percentual de desconto invalido. Deve estar entre 0 e 100.");
            return;
        }
        double valorComDesconto = valorCompra*(1-percentualDesconto/100);

        System.out.println("Valor com desconto: R$ "+valorComDesconto);
        ler.close();
    }
}
