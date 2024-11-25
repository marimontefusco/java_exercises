package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
//segundo grau e mostre o valor de Delta.
public class ex11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b, c, delta, b2;

        System.out.println("Digite o valor de A: ");
        a = scan.nextInt();

        System.out.println("\nDigite o valor de B: ");
        b = scan.nextInt();

        System.out.println("\nDigite o valor de C: ");
        c = scan.nextInt();

        b2 = (int) Math.pow(b, 2);

        delta = b2 - (4 * a * c);

        System.out.printf("\nO delta da equação vale %d.", delta);

        scan.close();
    }
}
