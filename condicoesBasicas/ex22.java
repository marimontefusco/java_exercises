package com.fullstack.desafios.condicoesBasicas;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

//22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//situação em relação ao alistamento militar.
//- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
//alistamento.
//- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
//alistamento.

public class ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int anoNascimento, anoAtual = 2024, idade;

        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = scan.nextInt();

        idade = anoAtual - anoNascimento;

        if (idade == 18) {
            System.out.println("Você está em ano de alistamento!");

        } else if(anoNascimento > 1900 && idade < 18) {
            int anosFaltam = 18 - idade;
            System.out.printf("\nFaltam %d anos para você se alistar.", anosFaltam);

        } else if (anoNascimento > 1900 && idade > 18) {
            int anosPassados = idade - 18;
            System.out.printf("\nJá se passaram %d anos do alistamento.", anosPassados);

        } else {
            System.out.println("Valor inválido!");
        }

        scan.close();
    }
}
