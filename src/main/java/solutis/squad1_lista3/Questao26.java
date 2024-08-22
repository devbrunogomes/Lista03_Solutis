
package solutis.squad1_lista3;

/*Receba 2 horários e exiba a diferença entre eles em segundos
 A entrada destes horários pode ocorrer em qualquer ordem.
Dica: transforme os dois horários para segundos. */
import java.util.Scanner;

public class Questao26 {

    public static int Segundos(String hora) {
        String[] partes = hora.split(":");
        int horas = Integer.parseInt(partes[0]);
        int min = Integer.parseInt(partes[1]);
        return horas * 3600 + min * 60;
    }

    public static void resposta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um horario (no formato hh:mm): ");
        String hora1 = scanner.nextLine();
        System.out.println("Digite um horario (no formato hh:mm): ");
        String hora2 = scanner.nextLine();

        int seg1 = Segundos(hora1);
        int seg2 = Segundos(hora2);

        int diferenca = Math.abs(seg1 - seg2);
        System.out.println("A  diferença entre os horários é de: " + diferenca + " segundos.");

        scanner.close();
    }

}
