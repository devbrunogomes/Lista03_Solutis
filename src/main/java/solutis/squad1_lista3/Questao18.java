/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

/*Inclua no exercício anterior a solicitação do ano de nascimento e 
também da data de hoje. A partir destas informações, apresente a idade atual desta pessoa. */
import java.util.Scanner;

public class Questao18 {

    public static int Idade(int ano, int nasc) {
        return ano - nasc;
    }

    public static void resposta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dia do seu aniversário(em números):  ");
        int dia = scanner.nextInt();
        System.out.println("Agora digite o mês(em números):  ");
        int mes = scanner.nextInt();
        System.out.println("Digite o seu ano de nascimento(em números):  ");
        int nasc = scanner.nextInt();
        System.out.println("Agora digite o ano em que estamos(em números):  ");
        // foi criada a variavel ano porque assim o programa não fica restrito ao ano em que estamos
        int ano = scanner.nextInt();
        int idade = Idade(ano, nasc);
        String trinta[] = {"Abril", "Junho", "Setembro", "Novembro"};
        String trintaUm[] = {"Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro"};
        String Fevereiro = "Fevereiro";
        boolean dataValida = false;
        String nomeMes = "";

        if (mes >= 1 && mes <= 12) {

            switch (mes) {
                case 2:
                    nomeMes = Fevereiro;
                    dataValida = (dia >= 1 && dia <= 29);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    nomeMes = trinta[mes == 4 ? 0 : mes == 6 ? 1 : mes == 9 ? 2 : 3];
                    dataValida = (dia >= 1 && dia <= 30);
                    break;
                default:
                    nomeMes = trintaUm[mes == 1 ? 0 : mes == 3 ? 1 : mes == 5 ? 2 : mes == 7 ? 3 : mes == 8 ? 4 : mes == 10 ? 5 : 6];
                    dataValida = (dia >= 1 && dia <= 31);
                    break;
            }
        }

        if (dataValida) {
            System.out.println("Data válida: " + dia + " de " + nomeMes + " de " + nasc);
        } else {
            System.out.println("Data Inválida");
        }

        // Verificação do trimestre
        if (mes >= 1 && mes <= 3) {
            System.out.println("Nasceu no 1º Trimestre");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Nasceu no 2º Trimestre");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Nasceu no 3º Trimestre");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("Nasceu no 4º Trimestre");
        }

        // verificação do signo
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Seu signo é Aquário");
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            System.out.println("Seu signo é Peixes");
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Seu signo é Áries");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println("Seu signo é Touro");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Seu signo é Gêmeos");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Seu signo é Câncer");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println(" Seu signo é Leão");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println(" Seu signo é Virgem");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Seu signo é Libra");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Seu signo é Escorpião");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println("Seu signo é Sagitário");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Seu signo é Capricórnio");
        }

        // mostrar a idade
        System.out.printf("Você tem %d anos", idade);

        scanner.close();

    }
}
