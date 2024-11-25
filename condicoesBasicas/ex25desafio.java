package com.fullstack.desafios.condicoesBasicas;

import java.util.Scanner;

//25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
//Analise seus comprimentos e diga se é possível formar um triângulo com essas
//retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
//de cada lado deve ser menor que a soma dos outros dois.

public class ex25desafio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float segmento01, segmento02, segmento03;

        System.out.println("Digite a medida do lado 1: ");
        segmento01 = scan.nextFloat();

        System.out.println("Digite a medida do lado 2: ");
        segmento02 = scan.nextFloat();

        System.out.println("Digite a medida do lado 3: ");
        segmento03 = scan.nextFloat();

        if (segmento01 < (segmento02 + segmento03)
                && (segmento02 < (segmento01 + segmento03))
                && (segmento03 < (segmento01 + segmento02))) {

            System.out.println("Sim, é possível formar um triângulo com essas segmentos!");

        } else {
            System.out.println("Não é possível formar um triângulo com estes segmentos!");
        }

    }
}
