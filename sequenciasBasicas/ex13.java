package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
//seu novo salário, com 15% de aumento.

public class ex13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float salario, novoSalario;

        System.out.println("Digite o salario do funcionario: ");
        salario = scan.nextFloat();

        novoSalario = (float) (salario * 1.15);

        System.out.printf("O novo salário do funcionário é: R$ %.2f", novoSalario);

        scan.close();
    }
}
