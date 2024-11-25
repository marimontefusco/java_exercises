package com.fullstack.desafios.sequenciasBasicas;

import java.util.Scanner;

//8) Desenvolva um programa que leia uma distância em metros e mostre os valores
//relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 185.72
//A distância de 85.7m corresponde a:
//0.18572Km
//1.8572Hm
//18.572Dam
//
//1857.2dm
//18572.0cm
//185720.0mm
public class ex08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float mts, km, hm, dam, dm, cm, mm;

        System.out.println("Digite uma distância em metros: ");
        mts = scan.nextFloat();

        km = mts / 1000;
        hm = mts / 100;
        dam = mts / 10;

        dm = mts * 10;
        cm = mts * 100;
        mm = mts * 1000;

        System.out.printf("A distância em metros: %f \n%.5f Km \n%.5f Hm " +
                "\n%.5f Km \n%.1f dm \n%.1f cm \n%.1f mm", mts, km, hm, dam, dm, cm, mm);

        scan.close();
    }
}
