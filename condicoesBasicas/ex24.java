package com.fullstack.desafios.condicoesBasicas;

import java.util.Scanner;

//24) Faça um algoritmo que pergunte a distância que um passageiro deseja
//percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
//viagens até 200Km e R$0.45 para viagens mais longas.
public class ex24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float distKm, precoKm = 0;

        System.out.println("Qual distância você deseja percorrer (em km)? ");
        distKm = scan.nextFloat();

        if (distKm > 0 && distKm <= 200 ) {
            precoKm = 0.5f;
        } else if(distKm > 200) {
            precoKm = 0.45f;
        }

        float preco = distKm * precoKm;

        System.out.printf("\nDistância percorrida: %.1f\nPreço: %.2f \n", distKm, preco);
    }
}
