package com.company;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        System.out.println("Numero da população paisA e paisB");
        Scanner popu=new Scanner(System.in);
        float paisA ;
                paisA= popu.nextFloat();
        float paisB;
               paisB= popu.nextFloat();
               System.out.println("digite a porcentagem crescimento paisA e do paisB");
               Scanner por=new Scanner(System.in);
        float porcen;
        porcen= por.nextFloat();
        float porcen2;
                porcen2=por.nextFloat();


         int anos= 0;



        while (paisA < paisB) {
            anos++;
            float porc= porcen/100;
            float porc2=porcen2/100;

            paisA += paisA * porc;

            paisB += paisB * porcen2;

            System.out.println("Levaria " + anos + " anos,para paisA passar ou igualar paisB");


        }
    }
}




