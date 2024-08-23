package solutis.squad1_lista3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao47 {

    class Paciente {

        String nome;
        String sexo;
        double peso;
        int idade;
        double altura;

        public Paciente(String nome, String sexo, double peso, int idade, double altura) {
            this.nome = nome;
            this.sexo = sexo;
            this.peso = peso;
            this.idade = idade;
            this.altura = altura;
        }
    }

    public static void resposta() {
        Scanner scanner = new Scanner(System.in);
        List<Paciente> pacientes = new ArrayList<>();
        while (true) {
            System.out.print("Digite o nome do paciente (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.print("Informe o sexo do paciente (m/f): ");
            String sexo = scanner.nextLine();
            System.out.print("Informe o peso do paciente: ");
            double peso = scanner.nextDouble();
            System.out.print("Informe a idade do paciente: ");
            int idade = scanner.nextInt();
            System.out.print("Informe a altura do paciente: ");
            double altura = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer do scanner
            Paciente paciente = new Questao47().new Paciente(nome,
                    sexo, peso, idade, altura);
            pacientes.add(paciente);
        }
        int totalPacientes = pacientes.size();
        int totalHomens = 0;
        int totalMulheres = 0;
        double totalIdadeHomens = 0;
        double totalIdadeMulheres = 0;
        int mulheresAlturaPeso = 0;
        int intervaloIdade = 0;
        Paciente pacienteMaisVelho = null;
        Paciente mulherMaisBaixa = null;
        for (Paciente p : pacientes) {
            if (p.sexo.equalsIgnoreCase("m")) {
                totalHomens++;
                totalIdadeHomens += p.idade;
            } else if (p.sexo.equalsIgnoreCase("f")) {
                totalMulheres++;
                totalIdadeMulheres += p.idade;
                if (p.altura >= 1.60 && p.altura <= 1.70 && p.peso
                        > 70) {
                    mulheresAlturaPeso++;
                }
                if (mulherMaisBaixa == null || p.altura
                        < mulherMaisBaixa.altura) {
                    mulherMaisBaixa = p;
                }
            }
            if (p.idade >= 18 && p.idade <= 25) {
                intervaloIdade++;
            }
            if (pacienteMaisVelho == null || p.idade
                    > pacienteMaisVelho.idade) {
                pacienteMaisVelho = p;
            }
        }
        System.out.println("Quantidade de pacientes: "
                + totalPacientes);
        if (totalHomens > 0) {
            System.out.println("Média de idade dos homens: "
                    + (totalIdadeHomens / totalHomens));
        } else {
            System.out.println("Nenhum homem registrado.");
        }
        if (totalMulheres > 0) {
            System.out.println("Média de idade das mulheres: "
                    + (totalIdadeMulheres / totalMulheres));
        } else {
            System.out.println("Nenhuma mulher registrada.");
        }
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + mulheresAlturaPeso);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + intervaloIdade);
        if (pacienteMaisVelho != null) {
            System.out.println("Nome do paciente mais velho: "
                    + pacienteMaisVelho.nome);
        } else {
            System.out.println("Nenhum paciente registrado.");
        }
        if (mulherMaisBaixa != null) {
            System.out.println("Nome da mulher mais baixa: "
                    + mulherMaisBaixa.nome);
        } else {
            System.out.println("Nenhuma mulher registrada.");
        }
    }
}
