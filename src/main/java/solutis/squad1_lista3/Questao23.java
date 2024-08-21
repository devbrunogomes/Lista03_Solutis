/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.*;

public class Questao23 {
    public static void resposta(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> meses = new HashMap<>();
        meses.put("janeiro", 1);
        meses.put("fevereiro", 2);
        meses.put("março", 3);
        meses.put("abril", 4);
        meses.put("maio", 5);
        meses.put("junho", 6);
        meses.put("julho", 7);
        meses.put("agosto", 8);
        meses.put("setembro", 9);
        meses.put("outubro", 10);
        meses.put("novembro", 11);
        meses.put("dezembro", 12);


        System.out.println("Nome da 1ª pessoa: ");
        String nome1 = sc.nextLine();
        System.out.println("Dia de aniversário da 1ª pessoa: ");
        int dia1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Mês de aniversário da 1ª pessoa: ");
        String mes1 = sc.nextLine();

        System.out.println("Nome da 2ª pessoa: ");
        String nome2 = sc.nextLine();
        System.out.println("Dia de aniversário da 2ª pessoa: ");
        int dia2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Mês de aniversário da 2ª pessoa: ");
        String mes2 = sc.nextLine();

        calculaAniversario(meses, nome1, dia1, mes1, nome2, dia2, mes2);
    }

    private static void calculaAniversario(Map meses, String nome1, int dia1, String mes1, String nome2, int dia2, String mes2) {
        int niver1 = (int) meses.get(mes1);
        int niver2 = (int) meses.get(mes2);

        if(niver1 < niver2){
            System.out.println(nome1 + " faz aniversário primeiro");
        }else if(niver2 < niver1){
            System.out.println(nome2 + " faz aniversário primeiro");
        }else if(dia1 == dia2){
            System.out.println("Fazem aniversário no mesmo dia");
        } else if (dia1 <dia2) {
            System.out.println(nome1 + " faz aniversário primeiro");
        }else{
            System.out.println(nome2 + " faz aniversário primeiro");
        }
    }
}
