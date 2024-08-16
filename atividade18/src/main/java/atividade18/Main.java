package atividade18;
/*
18. Sistema de Pedágio: Desenvolva um programa que simule a cobrança de pedágio em 
uma estrada. O usuário deve inserir o tipo de veículo (carro, moto, a) e o 
programa deve utilizar IF-ELSE para calcular o valor do pedágio com base em uma 
tabela de preços predefinida.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o tipo de veiculo (carro, moto ou caminhao): ");
        String tipoVeiculo = ler.nextLine().toLowerCase();

        double valorPedagio=0;

        if (tipoVeiculo.equals("carro")) {
            valorPedagio = 5.00;
        } else if (tipoVeiculo.equals("moto")) {
            valorPedagio = 3.00;
        } else if (tipoVeiculo.equals("caminhao")) {
            valorPedagio = 10.00;
        } else {
            System.out.println("Tipo de veiculo invalido. Verifique a digitacao.");
        }

        System.out.println("Valor do pedagio para " + tipoVeiculo + ": R$" + valorPedagio);
        ler.close();
    }
}
