
package solutis.squad1_lista3;

import java.util.Scanner;

/**
 *
 * @author bsgom
 */
public class Questao12 {
   public static void resposta() {
        Scanner scan = new Scanner(System.in);
        
        //Entradas
        System.out.print("Digite a 1a nota: ");
        double notaUm = scan.nextDouble();
        
        System.out.print("Digite a 2a nota: ");
        double notaDois = scan.nextDouble();
        
        System.out.print("Digite a 3a nota: ");
        double notaTres = scan.nextDouble();
        
        //Calculo
        double media = (notaUm + notaDois + notaTres) / 3;
        
        //Saídas
        System.out.println("===================");
        if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else if (media >= 5) {
            System.out.println("Aluno em Recuperacao!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
        
        scan.close();
    } 
}
