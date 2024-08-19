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
public class Questao01 {
    public static void resposta() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o ano que vc nasceu: ");
        int anoNascimento = scan.nextInt();
        
        System.out.print("Digite o ano atual: ");
        int anoAtual = scan.nextInt();
        
        System.out.println("A idade que o usuario fez/fara este ano eh: " + (anoAtual - anoNascimento) + " anos!");
    }
}
