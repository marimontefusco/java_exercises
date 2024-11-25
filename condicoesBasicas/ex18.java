package com.fullstack.desafios.condicoesBasicas;

import java.util.Scanner;

//18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//dela e depois mostre se ela pode ou não votar.
public class ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int anoNascimento, anoAtual = 2024, idade;

        System.out.println("Qual seu ano de nascimento?");
        anoNascimento = scan.nextInt();

        idade = anoAtual - anoNascimento;

        if (idade <= 0) {
            System.out.println("\nAno inexistente, tente novamente.");
        } else if (idade < 18) {
            System.out.println("\nVocê ainda não pode votar!");
        } else {
            System.out.println("\nVocê já pode votar!");
        }

        scan.close();
    }
}
