package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.

public class ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, soma=0;

        System.out.println("Digite o primeiro número: ");
        n1 = scan.nextInt();

        System.out.println("\nDigite o segundo número: ");
        n2 = scan.nextInt();

        soma = n1 + n2;

        System.out.printf("\nA soma de %d e %d é %d", n1, n2, soma);

        scan.close();
    }
}
