package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

// 16) Desafio - Redução de tempo de vida
// Escreva um programa para calcular a redução do tempo de vida de um fumante.
// Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou.
// Considere que um fumante perde 10 min de vida a cada cigarro.
// Calcule quantos dias de vida um fumante perderá e exiba o total em dias.

public class ex16desafio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdCigarroDia, anosFumando, diaEmMin = 1440, perdaVida = 10;

        System.out.println("Quantos cigarros você fuma por dia?");
        qtdCigarroDia = scan.nextInt();

        System.out.println("Quantos anos faz que você fuma?");
        anosFumando = scan.nextInt();

        int totalCigarrosPorAnos = qtdCigarroDia * anosFumando * 365;

        int minutosPerdidos = qtdCigarroDia * perdaVida;

        int diasPerdidos = minutosPerdidos / diaEmMin;

        System.out.printf("Você perdeu aproximadamente %d dias de vida por fumar.", diasPerdidos);

        scan.close();
    }
}
