package com.fullstack.desafios.condicoesCompostas;

import java.util.Scanner;

//26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
//na tela uma das mensagens abaixo:
//- O primeiro valor é o maior
//- O segundo valor é o maior
//- Não existe valor maior, os dois são iguais
public class ex26 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite a medida do lado 1: ");
        num1 = scan.nextInt();

        System.out.println("Digite a medida do lado 1: ");
        num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro valor é o maior");
        } else if (num1 < num2) {
            System.out.println("O segundo valor é o maior");

        } else {
            System.out.println("Não existe valor maior, os dois são iguais");
        }

        scan.close();

    }
}
