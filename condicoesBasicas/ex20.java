package com.fullstack.desafios.condicoesBasicas;

import java.util.Scanner;

//20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
//ÍMPAR.

public class ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Digite um número inteiro:");
        num = scan.nextInt();

        if (num < 0 ){
            System.out.println("\nO número deve ser maior que 0.");
        } else if (num > 0 && num % 2 == 0) {
            System.out.printf("\n%d é um número PAR", num);
        } else {
            System.out.printf("\n%d é um número ÍMPAR", num);
        }

        scan.close();
    }
}
