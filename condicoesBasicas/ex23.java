package com.fullstack.desafios.condicoesBasicas;

import java.util.Scanner;

//23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
//para todos, mas especialmente para mulheres. Faça um programa que leia nome,
//sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
//que:
//- Homens ganham 5% de desconto
//- Mulheres ganham 13% de desconto
public class ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome, sexo;
        float valorCompra, comDesconto = 0;

        System.out.println("Nome: ");
        nome = scan.nextLine();

        System.out.println("Sexo: ");
        sexo = scan.nextLine().toUpperCase();

        System.out.println("Valor da compra: ");
        valorCompra = scan.nextFloat();

        char feminino = sexo.charAt(0);

        if (feminino == 'F') {
            float desconto = (float) 0.13;

            comDesconto = valorCompra - (valorCompra * desconto);
            System.out.printf("\nNome: %s \nValor com desconto: %.2f", nome, comDesconto);

        } else if (feminino == 'M') {
            float desconto = (float) 0.05;

            comDesconto = valorCompra - (valorCompra * desconto);
            System.out.printf("\nNome: %s \nValor com desconto: %.2f", nome, comDesconto);

        } else {
            System.out.println("Erro ao definir o sexo, tente novamente!");
        }

        scan.close();
    }
}
