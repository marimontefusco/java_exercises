package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
//final uma mensagem.
//        Ex:
//        Nome do Funcionário: Maria do Carmo
//        Salário: 1850,45
//        O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.

public class ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        Float salario;

        System.out.println("Digite o nome da funcionária: ");
        nome = scan.nextLine();

        System.out.println("\nDigite o salário: ");
        salario = scan.nextFloat();

        System.out.printf("\nA funcionária %s tem um salário de R$ %2f em Junho.", nome, salario);

        scan.close();
    }
}
