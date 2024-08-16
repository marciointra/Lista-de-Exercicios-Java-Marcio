package atividade12;
/*
12. Sistema de Votacao: Desenvolva um programa que permita ao usuario votar em
3 candidatos diferentes. O programa deve utilizar um laço FOR para permitir a votacao
de varios eleitores e, ao final, exibir o total de votos de cada candidato e o vencedor.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int totalEleitores;
        int[] votos = new int[3];

        System.out.print("Digite o numero total de eleitores: ");
        totalEleitores = ler.nextInt();

        for(int i=1;i<=totalEleitores;i++){
            System.out.println("Eleitor #"+i);
            System.out.println("Digite o numero do candidato (1, 2 ou 3): ");
            int voto = ler.nextInt();

            if(voto>=1 && voto<=3){
                votos[voto-1]++;
            }else{
                System.out.println("Opcao invalida. Voto não computado.");
            }
        }
        System.out.println("Total de votos:");
        for(int candidato=1;candidato<= 3;candidato++) {
            System.out.println("Candidato "+candidato+": "+votos[candidato-1]+" votos");
        }
        int maxVotos = votos[0];
        int vencedor = 1;
        for(int candidato=2;candidato<=3;candidato++) {
            if(votos[candidato-1] > maxVotos){
                maxVotos = votos[candidato-1];
                vencedor = candidato;
            }
        }
        System.out.println("O vencedor é o Candidato "+vencedor+" com "+maxVotos+" votos!");
        ler.close();
    }
}
