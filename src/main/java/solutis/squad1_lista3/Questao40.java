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
public class Questao40 {

    public static void resposta() {
        Scanner scan = new Scanner(System.in);
        int contadorPessoas = 1; //iniciando o contador
        int idadeAtual = 0; //input de cada idade
        int somaIdades = 0;
        double mediaIdades = 0;
        int maiorIdade = 0;
        int menorIdade = Integer.MAX_VALUE;
        int qntdMaiorQue18 = 0;

        System.out.print("Para comecar, digite a quantidade de pessoas do grupo: ");
        int totalPessoas = scan.nextInt();

        do {
            System.out.print("Idade da Pessoa " + contadorPessoas + ": ");
            idadeAtual = scan.nextInt();

            somaIdades += idadeAtual; //somatorio das idades

            maiorIdade = idadeAtual > maiorIdade ? idadeAtual : maiorIdade; //guardando a maior idade
            menorIdade = idadeAtual < menorIdade ? idadeAtual : menorIdade; //guardando a menor idade

            //Teste para saber se é maior de idade
            if (idadeAtual >= 18) {
                qntdMaiorQue18++;
            }

            contadorPessoas++; //incremento do contador
        } while (contadorPessoas <= totalPessoas);

        //Calculos
        mediaIdades = (double) somaIdades / totalPessoas; //calculo da media

        //Saídas
        System.out.println("Media das idades: " + mediaIdades);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de pessoas maior de idade: " + qntdMaiorQue18);
    }
}
