package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela:
// Ex:
// Qual é o seu nome? João da Silva
// Olá João da Silva, é um prazer te conhecer!

public class ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;

        System.out.println("Olá, qual é o seu nome? ");
        nome = scan.nextLine();

        System.out.printf("Olá %s, é um prazer te conhecer!", nome);

        scan.close();

    }
}
