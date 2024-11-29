package com.fullstack.desafios.condicoesCompostas;

import java.util.Scanner;

//36) Um programa de vida saudável quer dar pontos atividades físicas que podem
//ser trocados por dinheiro. O sistema funciona assim:
// Cada hora de atividade física no mês vale pontos
//- até 10h de atividade no mês: ganha 2 pontos por hora
//- de 10h até 20h de atividade no mês: ganha 5 pontos por hora
//- acima de 20h de atividade no mês: ganha 10 pontos por hora
//- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
//Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
//calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
public class ex36 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double horasMes, pontos = 0, emDinheiro;

        System.out.println("Informe a quantidade de horas das atividades deste mês: ");
        horasMes = scan.nextDouble();

        if (horasMes <= 0) {
            System.out.println("\nErro: A quantidade de horas de atividades deve ser maior que zero.");
            return;

        } else if (horasMes < 10 ) {
            pontos = 2 * horasMes;

        } else if (horasMes >= 10 && horasMes < 20 ) {
            pontos = 5 * horasMes;

        } else {
            pontos = 10 * horasMes;

        }

        emDinheiro = pontos * 0.05;

        System.out.println("\nRegras do Programa:\n- Até 10h de atividade no mês: 2 pontos por hora.\n" +
                "- De 10h até 20h de atividade no mês: 5 pontos por hora.\n" +
                "- Acima de 20h de atividade no mês: 10 pontos por hora.\n" +
                "- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos).");
        System.out.printf("\nHoras de Atividades no mês: %.1f. \nPontos arrecadados: %.1f." +
                "\nGanhou: R$%.2f.\n", horasMes, pontos, emDinheiro);

        scan.close();

    }
}
