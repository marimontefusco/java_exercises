package com.fullstack.desafios.condicoesCompostas;

import java.util.Scanner;

//29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
//quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
//acordo com a tabela a seguir:
//- Até 3 anos de empresa: aumento de 3%
//- entre 3 e 10 anos: aumento de 12.5%
//- 10 anos ou mais: aumento de 20%
public class ex29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        double salario, aumento;
        int anosTrabalhados;

        System.out.println("Nome: ");
        nome = scan.nextLine();

        System.out.println("Salário atual: ");
        salario = scan.nextFloat();

        if (salario < 0) {
            System.out.println("Valor inválido, tente novamente.");
            return;
        }

        System.out.println("Anos na empresa: ");
        anosTrabalhados = scan.nextInt();

        if (anosTrabalhados <= 0) {
            System.out.println("Valor inválido, tente novamente.");
            return;
        }

        if (anosTrabalhados < 3) {
            aumento = 1.03;
        } else if (anosTrabalhados >= 3 && anosTrabalhados < 10) {
            aumento = 1 + (12.5/100);
        } else {
            aumento = 1.2;
        }

        double salarioNovo = salario * aumento;

        System.out.printf("\nNome: %s \nSalário reajustado: R$ %.2f", nome, salarioNovo);

        scan.close();
    }
}
