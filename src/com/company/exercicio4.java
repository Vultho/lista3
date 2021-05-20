package com.company;


public class exercicio4 {
    public static void main(String[] args) {
        float paisA = 80000f; //3%
        float paisB = 200000; //1,5%
        int anos = 0;

        while (paisA < paisB) {
            anos++;
            paisA += paisA * 0.03f;
            paisB += paisB * 0.015f;

            System.out.println("Levaria " + anos + " para paisA passar ou igualar paisB");


        }
    }
}
