package com.fullstack.desafios.condicoesBasicas;

import java.util.Scanner;

//19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//não um bom aproveitamento (se ficou acima da média 7.0).

public class ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        float n1, n2, media;

        System.out.println("Qual o nome?");
        nome = scan.nextLine();

        System.out.println("Qual a primeira nota?");
        n1 = scan.nextFloat();

        System.out.println("Qual a segunda nota?");
        n2 = scan.nextFloat();

        media = (n1 + n2) / 2;

        if (media < 0) {
            System.out.println(
                    "\nAs notas devem ser maior que 0.");
        } else if (media >= 0 && media < 7) {
            System.out.printf("\nAluno: %s \nMédia: %.2f" +
                    "\nNão teve bom aproveitamento, ficou abaixo da média (7.0).", nome, media);
        } else {
            System.out.printf("\nAluno: %s \nMédia: %.2f" +
                    "\nParabéns, ficou acima da média!", nome, media);
        }

        scan.close();
    }
}
