package com.fullstack.desafios.condicoesCompostas;

import java.util.Scanner;

//30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
//de triângulo será formado:
//- EQUILÁTERO: todos os lados iguais
//- ISÓSCELES: dois lados iguais
//- ESCALENO: todos os lados diferentes
public class ex30desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float seg1, seg2, seg3;

        System.out.println("Digite a medida do lado 1: ");
        seg1 = scan.nextFloat();

        if (seg1 <= 0) {
            System.out.println("Valor inválido, tente novamente.");
            return;
        }

        System.out.println("Digite a medida do lado 2: ");
        seg2 = scan.nextFloat();

        if (seg2 <= 0) {
            System.out.println("Valor inválido, tente novamente.");
            return;
        }

        System.out.println("Digite a medida do lado 3: ");
        seg3 = scan.nextFloat();

        if (seg3 <= 0) {
            System.out.println("Valor inválido, tente novamente.");
            return;
        }



        if (seg1 < (seg2 + seg3) && (seg2 < (seg1 + seg3)) && (seg3 < (seg1 + seg2))) {

            if(seg1 == seg2) {
                if (seg2 == seg3) {
                    System.out.println("É um triângulo equilátero!");
                } else {
                    System.out.println("É um triângulo isósceles!");
                }
            } else if (seg1 == seg3 && seg1 != seg2) {
                System.out.println("É um triângulo isósceles!");
            } else if(seg2 == seg3 && seg1 != seg2) {
                System.out.println("É um triângulo isósceles!");
            } else {
                System.out.println("É um triângulo escaleno!");
            }

        } else {
            System.out.println("Não é possível formar um triângulo com estes segmentos!");
        }

        scan.close();
    }
}
