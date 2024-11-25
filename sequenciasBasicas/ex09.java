package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

// 9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
//e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float real, dolar;

        System.out.println("Quantos dinheiros (em real) vc tem na carteira? ");
        real = scan.nextFloat();

        dolar = (float) (real / 3.45);

        System.out.printf("\nCom %.2f reais você pode comprar %.2f dólares!", real, dolar);

        scan.close();
    }
}
