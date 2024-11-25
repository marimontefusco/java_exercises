package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
public class ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float largura, altura, area, tinta;

        System.out.println("Digite a largura da parede: ");
        largura = scan.nextFloat();

        System.out.println("\nDigite a altura da parede: ");
        altura = scan.nextFloat();

        area = largura * altura;
        tinta = area / 2;

        System.out.printf("\nA área total da parede é %.2f e você"+
                " precisará de %.1f litros de tinta.", area, tinta);

        scan.close();
    }
}
