package solutis.squad1_lista3;

import java.util.Scanner;

/**
 *
 * @author bsgom
 */
public class Questao03 {

    public static void resposta() {
        Scanner scan = new Scanner(System.in);
        //Entradas
        System.out.print("Digite a quantidade de homens: ");
        int qntdHomens = scan.nextInt();

        System.out.print("Digite a quantidade de mulheres: ");
        int qntdMulheres = scan.nextInt();

        //Calculo Percentual
        int totalDePessoas = qntdHomens + qntdMulheres;
        double percentualHomens = ((double) qntdHomens / totalDePessoas) * 100;
        double percentualMulheres = ((double) qntdMulheres / totalDePessoas) * 100;

        //Saídas
        System.out.println("=====================");
        System.out.printf("Percentual de Homens: %.1f%%\n", percentualHomens);
        System.out.printf("Percentual de Mulheres: %.1f%%\n", percentualMulheres);

        scan.close();
    }
}
