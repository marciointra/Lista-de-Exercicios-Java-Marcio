package atividade19;
/*
19. Cálculo de Potência: Crie um programa que solicite ao usuário a base e o expoente,
e utilize um laço FOR para calcular a potência (base^expoente). O programa deve exibir
o resultado ao final.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = ler.nextDouble();

        System.out.print("Digite o expoente: ");
        int expoente = ler.nextInt();

        double resultado = 1.0;

        for(int i=1; i<=Math.abs(expoente); i++){
            resultado *= base;
        }
        if(expoente<0){
            resultado = 1.0/resultado;
        }
        System.out.println("Resultado: " + resultado);
        ler.close();
    }
}
