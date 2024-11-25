package com.fullstack.desafios.condicoesCompostas;

import java.util.Scanner;

//28) Faça um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua área em m2. O programa também
//devemostrar a classificação desse terreno, de acordo com a lista abaixo:
//- Abaixo de 100m2 = TERRENO POPULAR
//- Entre 100m2 e 500m2 = TERRENO MASTER
//- Acima de 500m2 = TERRENO VIP
public class ex28 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float larg, comp, area;


        System.out.println("Digite a medida da largura do terreno: ");
        larg = scan.nextFloat();

        if (larg <= 0) {
            System.out.println("Valor inválido, tente novamente");
            return;
        }

        System.out.println("Digite a medida do comprimento do terreno:");
        comp = scan.nextFloat();

        if (comp <= 0) {
            System.out.println("Valor inválido, tente novamente");
            return;
        }

        area = larg * comp;

        System.out.printf("\nA área do terreno é %.1f m2.", area);

        if(area < 100) {
            System.out.println("\nTerreno Popular");
        } else if(area >= 100 && area < 500) {
            System.out.println("\nTerreno Master");
        } else {
            System.out.println("\nTerreno Vip");
        }

        scan.close();
    }
}
