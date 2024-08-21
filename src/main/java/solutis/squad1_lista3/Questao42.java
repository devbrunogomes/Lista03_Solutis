/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.ArrayList;
import java.util.Collections;

public class Questao42 {
    public static void resposta(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 40; i++){
            numeros.clear();

            numeros.add((int)(Math.random() *59));
            numeros.add((int)(Math.random() *59));
            numeros.add((int)(Math.random() *59));

            Collections.sort(numeros);
            System.out.println("Grupo " + i + " " + numeros);
        }
    }
}
