package com.fullstack.desafios.condicoesCompostas;

import java.util.Scanner;

//33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
//de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
//em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
//ela não pode exceder 30% do salário ou então o empréstimo será negado.
public class ex33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double vCasa,vSalario, anos, mesesAPagar, prestacaoMensal, limiteMax;

        System.out.println("Digite o valor da casa: ");
        vCasa = scan.nextDouble();

        if (vCasa <= 0) {
            System.out.println("Erro: O valor da casa deve ser maior que zero.");
            return;
        }

        System.out.println("Digite o valor do salário do comprador: ");
        vSalario = scan.nextDouble();

        if (vSalario <= 0) {
            System.out.println("Erro: O salário deve ser maior que zero.");
            return;
        }

        System.out.println("Em quantos anos pretende pagar: ");
        anos = scan.nextDouble();

        if (anos <= 0) {
            System.out.println("Erro: O prazo deve ser maior que zero.");
            return;
        }

        mesesAPagar = anos * 12;
        prestacaoMensal = vCasa / mesesAPagar;

        limiteMax = vSalario * 0.3;

        System.out.printf("\nValor da prestação mensal: R$ %.2f. " +
                "\nLimite máximo permitido (até 30%% do salario): R$ %.2f.", prestacaoMensal, limiteMax);

        if (prestacaoMensal <= limiteMax) {
            System.out.println("\nParabéns, empréstimo aprovado!");
        } else {
            System.out.println("\nEmpréstimo negado!");
        }

        scan.close();
    }
}
