package atividade01;
/*
1. Sistema de Aprovação de Alunos: Crie um programa que receba as notas de um aluno em
três disciplinas e calcule sua média. Utilize estruturas IF e ELSE para determinar se o aluno
foi aprovado, reprovado ou está em recuperação com base na média (Aprovado: média ≥ 7,
Recuperação: 5 ≤ média < 7, Reprovado: média < 5).
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float media = 0;

        System.out.println("Digite sua nota em Matematica: ");
        float notaMatematica = ler.nextFloat();
        System.out.println("Digite sua nota em Historia: ");
        float notaHistoria = ler.nextFloat();
        System.out.println("Digite sua nota em Portugues: ");
        float notaPortugues = ler.nextFloat();
        media = (notaHistoria+notaMatematica+notaPortugues)/3;

        if(media >= 7.0){
            System.out.println("Sua média foi "+media+" , o aluno está aprovado");
        }
        else if(media >= 5.0 && media < 7.0){
            System.out.println("Sua média foi "+media+" , o aluno está recuperação");
        }
        else{
            System.out.println("Sua média foi "+media+" , o aluno está reprovado");
        }
    }
}