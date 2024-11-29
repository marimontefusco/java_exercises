package com.fullstack.desafios.condicoesCompostas;

import java.util.Scanner;

//35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
//aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
//carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
//que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
//quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
//tabela a seguir:
//- Carros populares (aluguel de R$90 por dia)
//- Até 100Km percorridos: R$0,20 por Km
//- Acima de 100Km percorridos: R$0,10 por Km

//- Carros de luxo (aluguel de R$150 por dia)
//- Até 200Km percorridos: R$0,30 por Km
//- Acima de 200Km percorridos: R$0,25 por Km
public class ex35 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double aluguelDia = 0, kmPercorridos, valorKm = 0, valorFinal;
        int tipoCarro, dias;
        String carro = null;

        System.out.println("Informe a quantidade de dias de aluguel: ");
        dias = scan.nextInt();

        if (dias <= 0) {
            System.out.println("\nErro: A quantidade de dias deve ser maior que zero.");
            return;
        }

        System.out.println("\nInforme os km percorridos: ");
        kmPercorridos = scan.nextDouble();

        if (kmPercorridos <= 0) {
            System.out.println("\nErro: Km percorridos deve ser maior que zero.");
            return;
        }

        System.out.println("\nInforme o tipo de carro: " +
                "\n1 - Carro Popular \n2 - Carro de Luxo");
        tipoCarro = scan.nextInt();

        if (tipoCarro != 1 && tipoCarro != 2) {
            System.out.println("Erro: ");
            return;
        }

        if (tipoCarro == 1) {
            aluguelDia = 90.0;
            carro = "Popular";
            if (kmPercorridos >= 1 && kmPercorridos < 100) {
                valorKm = 0.20;
            } else {
                valorKm = 0.10;
            }

        } else if (tipoCarro == 2) {
            aluguelDia = 150.0;
            carro = "Luxo";
            if (kmPercorridos >= 1 && kmPercorridos < 200) {
                valorKm = 0.30;
            } else {
                valorKm = 0.25;
            }
        }

        //aluguel = km percorrido + dias aluguel
        valorFinal =  (aluguelDia * dias) + (kmPercorridos * valorKm);

        System.out.printf("\nTipo do carro: %s \nDias de aluguel: %d " +
                "\nKm percorridos: %.1f \nTotal a pagar: R$%.2f \n", carro, dias,kmPercorridos,valorFinal);

        scan.close();
    }
}
