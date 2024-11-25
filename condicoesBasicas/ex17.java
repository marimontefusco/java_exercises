package com.fullstack.desafios.condicoesBasicas;

import java.util.Scanner;

//17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
//o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
public class ex17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float velocidade, vMax = 80.0F, multaPorKm = 5, multa;

        System.out.println("Qual a velocidade do veículo?");
        velocidade = scan.nextFloat();

        if (velocidade > vMax) {

            multa = (velocidade - vMax) * multaPorKm;
            System.out.printf("\nVocê ultrapassou a velocidade máxima de 80km e foi multado." +
                    "\nValor da multa: R$ %.2f", multa);

        } else if (velocidade < 0) {
            System.out.println("\nA velocidade deve ser maior que 0.");

        } else {
            System.out.println("\nParabéns, você não ultrapassou a velocidade máxima de 80km");
        }

        scan.close();
    }
}
