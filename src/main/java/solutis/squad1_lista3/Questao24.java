package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao24 {

    public boolean verificaBissexto(int ano) {
        if (ano % 400 == 0) {
            return true;
        } else if (ano % 100 == 0) {
            return false;
        } else if (ano % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void resposta() {
        Questao24 questao = new Questao24();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mes: ");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        int diasMes = 0;
        if (mes >= 1 && mes <= 12) {
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    diasMes = 31;
                    break;
                case 4, 6, 9, 11:
                    diasMes = 30;
                    break;
                case 2:
                    if (questao.verificaBissexto(ano)) {
                        diasMes = 29;
                    } else {
                        diasMes = 28;
                    }
                    break;
            }
        }
        if (dia >= 1 && dia <= diasMes) {
            System.out.printf("A data %d/%d/%d é válida", dia, mes,
                    ano);
        } else {
            System.out.printf("A data %d/%d/%d é inválida", dia,
                    mes, ano);
        }
        scanner.close();
    }
}
