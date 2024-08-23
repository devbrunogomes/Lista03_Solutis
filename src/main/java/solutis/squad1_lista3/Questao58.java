package solutis.squad1_lista3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Questao58 {

    public static void resposta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a data (dd/MM/yyyy): ");
        String data = scanner.nextLine();
        System.out.print("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (validaData(data, formatter)) {
            LocalDate dataFormatada = LocalDate.parse(data,
                    formatter);
            LocalDate novaData = dataFormatada.plusDays(dias);
            System.out.println("Nova data: "
                    + novaData.format(formatter));
        } else {
            System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
        }
    }

    private static boolean validaData(String data,
            DateTimeFormatter formatter) {
        try {
            LocalDate.parse(data, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }

    }
}
