package solutis.squad1_lista3;

import java.util.Scanner;

/**
 *
 * @author bsgom
 */
public class Questao01 {

    public static void resposta() {
        Scanner scan = new Scanner(System.in);

        //Entradas
        System.out.print("Digite o ano que vc nasceu: ");
        int anoNascimento = scan.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scan.nextInt();

        //Saída
        System.out.println("A idade que o usuario fez/fara este ano eh: " + (anoAtual - anoNascimento) + " anos!");

        scan.close();
    }
}
