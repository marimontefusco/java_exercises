package com.fullstack.desafios.condicoesBasicas;

import java.util.Scanner;

//21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
//BISSEXTO.

public class ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ano;

        System.out.println("Digite o ano: ");
        ano = scan.nextInt();

        if (ano < 0) {
            System.out.println("\nO ano deve ser maior que 0.");
        } else if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("\nO ano é bissexto");
        } else {
            System.out.println("\nO ano não é bissexto");
        }

        scan.close();
    }
}
