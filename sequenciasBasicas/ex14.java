package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
//um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
//quantidade de dias pelos quais ele foi alugado. Calcule o preço total total a pagar,
//sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

public class ex14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float kmPercorridos, precoDia = 90, precoFinal;
        float precoKm = 20/100;
        int dias;

        System.out.println("Quantos km foram percorridos? ");
        kmPercorridos = scan.nextFloat();

        System.out.println("\nQuantos dias durou o aluguel? ");
        dias = scan.nextInt();

        precoFinal = (kmPercorridos * precoKm) + (dias * precoDia);

        System.out.printf("\nPreço do aluguel: R$ %.2f", precoFinal);

        scan.close();
    }
}
