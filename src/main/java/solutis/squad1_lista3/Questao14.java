/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao14 {


    public static void resposta(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o mes do ano: ");
        String mes = new Scanner(System.in).nextLine();
        mesesDoAno(mes);
    }


    private static void mesesDoAno(String mes) {
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equalsIgnoreCase(mes)) {
                System.out.println(i + 1);
            }
        }
    }
}
