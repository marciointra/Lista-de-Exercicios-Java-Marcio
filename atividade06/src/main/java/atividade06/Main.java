package atividade06;
/*
6. Cálculo de IMC: Desenvolva um programa que calcule o Índice de Massa Corporal (IMC)
de uma pessoa. O programa deve solicitar o peso e a altura do usuário, calcular o IMC e usar
IF-ELSE para classificar o resultado (baixo peso, peso normal, sobrepeso, obesidade).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nDigite seu peso: ");
        float peso = ler.nextFloat();
        System.out.println("digite sua altura");
        float altura = ler.nextFloat();

        float imc = peso/(altura*altura);

        if(imc <= 18.5){
            System.out.println("IMC: "+imc+", classificação: Baixo peso");
        }
        else if(imc > 18.5 && imc < 25){
            System.out.println("IMC: "+imc+", classificação: Peso normal");
        }
        else if(imc >= 25 && imc <= 30){
            System.out.println("IMC: "+imc+", classificação: Sobrepeso");
        }
        else{
            System.out.println("IMC: "+imc+", classificação: Obesidade");
        }
    }
}