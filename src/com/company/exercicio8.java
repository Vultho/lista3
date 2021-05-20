package com.company;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
     Scanner numeros = new Scanner(System.in);
     System.out.println("escreva o primeiro numero");
     int num;
     num = numeros.nextInt();
     System.out.println("escreva o segundo valor)");
     int num2;
     num2 = numeros.nextInt();
     System.out.println("escreva o terceiro valor");
     int num3;
     num3 = numeros.nextInt();
     System.out.println("escreva o quarto valor");
     int num4;
     num4 = numeros.nextInt();
     System.out.println("escreva o cinco valor");
     int num5;
     num5 = numeros.nextInt();
     int soma = num + num2 + num3 + num4 + num5;
     float media= soma/5;

     System.out.println("A soma dos numeros é "+soma+" e a media é " +media);

    }
    }
