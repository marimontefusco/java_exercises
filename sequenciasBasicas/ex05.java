package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
//na tela a sua média na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5

public class ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float n1, n2, media;

        System.out.println("Digite a primeira nota: ");
        n1 = scan.nextFloat();

        System.out.println("\nDigite a segunda nota: ");
        n2 = scan.nextFloat();

        media = (n1 + n2)/2;

        System.out.printf("\nA média das notas é: %.2f", media);

        scan.close();
    }
}
