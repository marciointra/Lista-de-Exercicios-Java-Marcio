package atividade11;
/*
11. Conversor de Temperatura: Crie um programa que converta uma temperatura de 
Celsius para Fahrenheit e vice-versa. O programa deve solicitar ao usuário a 
temperatura e a unidade de origem, e utilizar IF-ELSE para realizar a conversão correta.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o numero da unidade de temperatura: ");
        double temperatura = ler.nextDouble();

        System.out.print("Informe a unidade de temperatura (C para Celsius, F para Fahrenheit): ");
        char unidade_temperatura = ler.next().charAt(0);
        double temperaturaConvertida;

        if(unidade_temperatura == 'C' || unidade_temperatura == 'c') {
            temperaturaConvertida = (9.0 / 5.0) * temperatura + 32;
            System.out.println("Convertendo a temperatura em Fahrenheit: " + temperaturaConvertida);
        }else if (unidade_temperatura == 'F' || unidade_temperatura == 'f') {
            temperaturaConvertida = (5.0 / 9.0) * (temperatura - 32);
            System.out.println("Convertendo a temperatura em Celsius: " + temperaturaConvertida);
        }else {
            System.out.println("Unidade de temperatura inválida. Use C para Celsius ou F para Fahrenheit.");
        }
        ler.close();
    }
}
