
package solutis.squad1_lista3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao45 {

    public static void resposta(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int cont = 1;
        int ord = 1;
        do {
            System.out.printf("Digite o %do numero: ", ord++);
            numeros.add(scanner.nextInt());
            cont++;
        } while (cont <= 100);
        int maiorNumero = Collections.max(numeros);
        System.out.println("O maior numero dessa lista é: "
                + maiorNumero);
    }
}
