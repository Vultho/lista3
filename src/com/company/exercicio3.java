package com.company;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {


        System.out.println("digite seu nome");
        Scanner nom = new Scanner(System.in);
        String nome;
        nome = nom.nextLine();
        String max[] = new String[3];

        while (nome.length() < max.length) {
            System.out.println("nome invalido");
            nome = nom.nextLine();
        }
            System.out.println("nome valido");

        System.out.println("digite sua idade (0 a 150)");
        Scanner ida = new Scanner(System.in);
        int idade;
        idade = ida.nextInt();

        while (idade > 150) {
            System.out.println("idade invalida");
            idade = ida.nextInt();
        }
            System.out.println("idade valida");

        System.out.println("Digite salario (maior que zero)");
        Scanner salario = new Scanner(System.in);
        int sala;
        sala = salario.nextInt();

        while (sala < 0) {
            System.out.println("Salario invalido");
            sala = salario.nextInt();

        }
        System.out.println("Estado civil 's', 'c', 'v' 'd'");
        Scanner estado = new Scanner(System.in);
        String respo;



        switch (respo= estado.nextLine()){
            case "s":
                System.out.println("solteiro");
                break;
            case "c":
                System.out.println("casado");
                break;
            case "v":
                System.out.println("viuvo");
                break;
            case "d":
                System.out.println("divorciado");

        }

    }
}
