package com.company;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        System.out.println("Digite usuario e senha");
        Scanner usu = new Scanner(System.in);
        String usually;
        usually = usu.nextLine();
        String senh;
        senh = usu.nextLine();


        while (senh.equals(usually) ) {
            System.out.println("Usuario e senha iguais");
            senh = usu.nextLine();
            usually = usu.nextLine();

        }
    }
}
