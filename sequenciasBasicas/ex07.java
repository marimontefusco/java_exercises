package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
//sua terça parte.
//Ex:
//Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666
public class ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float num, dobro, terco;

        System.out.println("Digite um número: ");
        num = scan.nextFloat();

        dobro = num * 2;
        terco = num / 3;

        System.out.printf("O dobro de %.2f é %.2f.", num, dobro);
        System.out.printf("\nA terça parte de %.2f é %.2f. ", num, terco);

        scan.close();
    }
}
