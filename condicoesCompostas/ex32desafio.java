package com.fullstack.desafios.condicoesCompostas;

import java.util.Scanner;

//32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
//jogador vai tentar descobrir qual foi o valor sorteado.
public class ex32desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chute;
        int num = (int) (Math.random() * 5) + 1;

        System.out.println("Adivinhe o número aleatório entre 1 e 5: ");
        chute = scan.nextInt();

        if (chute > 5 || chute < 1) {
            System.out.println("O número deve ser inteiro, de 1 à 5. Tente novamente: ");
            chute = scan.nextInt();
        }

        System.out.println(num);

        if ( chute == num) {
            System.out.printf("Parabéns, o número aleatório é %d.", num);
        } else {
            System.out.printf("Errou, o número aleatório é %d.", num);
        }

        scan.close();
    }
}
