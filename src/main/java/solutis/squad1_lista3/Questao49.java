package solutis.squad1_lista3;

/*Exiba os 50 primeiros números da seqüência 
de Fibonacci (1,1,2,3,5,8,13,21,34,55,89,144,233,377,...). */
public class Questao49 {

    // Função recursiva para calcular o n-ésimo número de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void resposta() {
        int n = 50;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
