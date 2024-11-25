package com.fullstack.desafios.condicoesCompostas;

import java.util.Scanner;

//27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
//mostrando uma mensagem no final, de acordo com a média atingida:
//- Média até 4.9: REPROVADO
//- Média entre 5.0 e 6.9: RECUPERAÇÃO
//- Média 7.0 ou superior: APROVADO
public class ex27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float n1, n2, media;

        System.out.println("Digite a primeira nota: ");
        n1 = scan.nextFloat();

        System.out.println("Digite a segunda nota: ");
        n2 = scan.nextFloat();

        media = (n1 + n2) / 2;

        System.out.printf("\nSua média foi: %.1f", media);

        if(media > 0 && media < 4.9) {
            System.out.println("\nREPROVADO");
        } else if (media > 5 && media < 6.9) {
            System.out.println("\nRECUPERAÇÃO");
        } else if (media > 7 && media <= 10) {
            System.out.println("\nAPROVADO");
        } else {
            System.out.println("Valor inválido!");
        }

        scan.close();
    }
}
