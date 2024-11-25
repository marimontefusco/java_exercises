package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
//        sucessor.
//        Ex:
//        Digite um número: 9
//        O antecessor de 9 é 8
//        O sucessor de 9 é 10
public class ex06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num, antecessor, sucessor;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        antecessor = num -1;
        sucessor = num +1;

        System.out.printf("\n\nNúmero digitado: %d \nAntecessor: %d \nSucessor: %d", num, antecessor, sucessor);

        scan.close();
    }
}
