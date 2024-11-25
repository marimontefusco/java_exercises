package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
//PREÇO PROMOCIONAL, com 5% de desconto.

public class ex12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float preco, naPromocao;
        float desconto;

        System.out.println("Digite o preço do produto: ");
        preco = scan.nextFloat();

        desconto = 5.0f / 100.0f;
        naPromocao = preco - desconto;

        System.out.printf("Preço: R$%.2f \nNa promoção: R$%.2f", preco, naPromocao);

        scan.close();
    }
}
