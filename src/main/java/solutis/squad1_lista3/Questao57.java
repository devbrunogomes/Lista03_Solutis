package solutis.squad1_lista3;

/*Exiba todas as datas de um calendário que estão entre duas datas informadas pelo usuário (dia, mês e ano). Suponha que as duas datas informadas sejam válidas. */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao57 {

    public static void resposta() {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite a primeira data (dd/MM/yyyy): ");

        String data1 = scanner.nextLine();
        LocalDate primeiraData = LocalDate.parse(data1, formatter);

        System.out.println("Digite a segunda data (dd/MM/yyyy): ");

        String data2 = scanner.nextLine();
        LocalDate segundaData = LocalDate.parse(data2, formatter);

        System.out.println("Datas entre " + data1 + " e " + data2 + ":");

        for (LocalDate date = primeiraData; !date.isAfter(segundaData); date = date.plusDays(1)) {
            System.out.println(date.format(formatter));
        }

        scanner.close();
    }
}
