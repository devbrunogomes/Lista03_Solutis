package solutis.squad1_lista3;

import java.util.Scanner;

/**
 *
 * @author bsgom
 */
public class Questao10 {

    public static void resposta() {
        Scanner scan = new Scanner(System.in);

        //Entradas
        System.out.print("Digite o valor do seu salario bruto: R$");
        double salarioBruto = scan.nextDouble();

        System.out.print("Digite o valor dos seus descontos: R$");
        double descontos = scan.nextDouble();

        System.out.print("Digite o valor que voce quer pegar emprestado: R$");
        double possivelEmprestimo = scan.nextDouble();

        //Calculos
        double salarioLiquido = salarioBruto - descontos;
        double limiteEmprestimo = salarioLiquido * 0.3;

        //Saídas
        if (possivelEmprestimo <= limiteEmprestimo) {
            System.out.printf("O emprestimo de R$%.2f pode ser realizado", possivelEmprestimo);
        } else {
            System.out.printf("O emprestimo de R$%.2f nao pode ser realizado\n", possivelEmprestimo);
        }
        
        scan.close();
    }
}
