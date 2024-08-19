/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

/**
 *
 * @author bsgom
 */
public class Questao25 {
    public static void resposta() {
        Scanner scan = new Scanner(System.in);
        
        //Validacao da HORA
        String horaStr;
        int hora;
        
        do {
            System.out.print("Digite a hora: ");
            horaStr = scan.nextLine();
            
            // Tenta converter a string para um número inteiro
            try {
                hora = Integer.parseInt(horaStr);

                if (hora < 0 || hora > 23) {
                    System.out.println("Hora invalida. Deve estar entre 0 e 23.");
                }
            } catch (NumberFormatException e) {
                //Se a entrada não for um número
                hora = -1; // Força a repetição do loop se a entrada não for um número válido
                System.out.println("Hora invalida. Deve ser um numero entre 0 e 23.");
            }
        } while (hora < 0 || hora > 23);
        
        String horaFormatada = hora < 9 ? ('0' + Integer.toString(hora)) : Integer.toString(hora);
        
        //Validacao dos MINUTOS
        String minutosStr;
        int minutos;
        
        do {
            System.out.print("Digite os minutos: ");
            horaStr = scan.nextLine();
            
            // Tenta converter a string para um número inteiro
            try {
                minutos = Integer.parseInt(horaStr);

                if (minutos < 0 || minutos > 59) {
                    System.out.println("Minutos invalidos. Deve estar entre 0 e 59.");
                }
            } catch (NumberFormatException e) {
                //Se a entrada não for um número
                minutos = -1; // Força a repetição do loop se a entrada não for um número válido
                System.out.println("Minutos invalidos. Deve ser um numero entre 0 e 59.");
            }
        } while (minutos < 0 || minutos > 59);
        
        String minutoFormatado = minutos < 9 ? ('0' + Integer.toString(minutos)) : Integer.toString(minutos);
        
        //Validacao dos Segundos
        String segundosStr;
        int segundos;
        
        do {
            System.out.print("Digite os Segundos: ");
            segundosStr = scan.nextLine();
            
            // Tenta converter a string para um número inteiro
            try {
                segundos = Integer.parseInt(segundosStr);

                if (segundos < 0 || segundos > 59) {
                    System.out.println("Segundos invalidos. Deve estar entre 0 e 59.");
                }
            } catch (NumberFormatException e) {
                //Se a entrada não for um número
                segundos = -1; // Força a repetição do loop se a entrada não for um número válido
                System.out.println("Segundos invalidos. Deve ser um numero entre 0 e 59.");
            }
        } while (segundos < 0 || segundos > 59);
        
        String segundosFormatado = segundos < 9 ? ('0' + Integer.toString(segundos)) : Integer.toString(segundos);
        
        
        
        //Saída
        System.out.println("Hora valida: " + horaFormatada + "hrs");
        System.out.println("Minutos validos: " + minutoFormatado + "m");
        System.out.println("Segundos validos: " + segundosFormatado + "s");
        System.out.println("=======================");                
        System.out.println(horaFormatada + ":" + minutoFormatado + ":" + segundosFormatado);
    }
}
