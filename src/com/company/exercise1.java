package com.company;

import java.util.Scanner;


public class exercise1 {

    public static void main(String[] args) {
        System.out.println("digite uma nota de 0 a 10");
        Scanner num = new Scanner(System.in);
        int N;
        N = num.nextInt();


        while (N > 10){
            System.out.println("Nota invalida, digite novamente");
            N = num.nextInt();

        }
      System.out.print("Nota valida");

    }
}

