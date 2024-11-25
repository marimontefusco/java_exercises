package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
//salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
//por hora trabalhada.

public class ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int diasTrabalhados, horaPorDia = 8;
        double salario, valorDaHora = 25;

        System.out.println("Digite o número de dias de trabalhados: ");
        diasTrabalhados = scan.nextInt();

        salario = diasTrabalhados * (horaPorDia * valorDaHora);

        System.out.printf("O salário do funcionário deste mês é: R$ %.2f", salario);

        scan.close();
    }
}
