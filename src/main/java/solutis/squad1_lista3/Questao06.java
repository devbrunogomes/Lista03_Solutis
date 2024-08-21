/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

public class Questao06 {
    public static void resposta(String[] args) {
        int raio = 5;
        System.out.println("Área do circuo de raio 5m: ");

        calculaArea(raio);
    }

    private static void calculaArea(int raio) {
        double area = Math.PI * raio * raio;
        System.out.printf("A área deste círculo é de %.2f metros quadrados", area);
    }
}
