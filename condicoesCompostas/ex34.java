package com.fullstack.desafios.condicoesCompostas;

import java.util.Scanner;

////34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
////peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
////indivíduo dentro de certas faixas.
////- abaixo de 18.5: Abaixo do peso
////- entre 18.5 e 25: Peso ideal
////- entre 25 e 30: Sobrepeso
//- entre 30 e 40: Obesidade
//- acima de 40: Obseidade mórbida
//Obs: O IMC é calculado pela expressão peso/altura2 (peso dividido pelo quadrado
//da altura)
public class ex34 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float peso, altura, imc, alturaQuadrado;

        System.out.println("Digite o Peso (ex: 69,2): ");
        peso = scan.nextFloat();

        if (peso <= 0) {
            System.out.println("Peso deve ser maior que 0.");
        }

        System.out.println("Digite a altura (ex: 1,70): ");
        altura = scan.nextFloat();

        if (altura <= 0) {
            System.out.println("Peso deve ser maior que 0.");
        }

        alturaQuadrado = (float) Math.pow(altura,2);
                              // Math.pow(base,expoente)

        imc = peso/alturaQuadrado;

        if (imc < 18.5) {
            System.out.printf("\nSeu IMC: %.1f \nMenor que 18,5: Abaixo do Peso",imc);
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("\nSeu IMC: %.1f \nEntre 18,5 e 24,9: Peso ideal",imc);
        } else if (imc >= 25 && imc <=29.9) {
            System.out.printf("\nSeu IMC: %.1f \nEntre 25,0 e 29,9: Sobrepeso",imc);
        } else if (imc >= 30 && imc <= 39.9) {
            System.out.printf("\nSeu IMC: %.1f \nEntre 30,0 e 39,9: Obesidade",imc);
        } else if (imc >= 40) {
            System.out.printf("\nSeu IMC: %.1f \nMaior que 40,0: Obesidade Mórbida",imc);
        }

        scan.close();
    }
}
