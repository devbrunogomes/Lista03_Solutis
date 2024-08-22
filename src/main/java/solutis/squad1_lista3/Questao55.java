
package solutis.squad1_lista3;

/*A operadora de celular Vai-Vai possui um plano com o valor mensal de 50,00 que permite 
100 minutos por mês para qualquer número. Além disso, ela oferece 50 minutos a mais para ligações destinadas a
 um número da própria Vai-Vai. Ainda neste plano ela tem uma promoção onde cada minuto gasto para telefone fixo 
 consome somente a metade. O valor do minuto excedente para outras operadoras é de 0.65, e para a própria Vai-Vai é 0.20. 
Faça um programa que permita ao usuário entrar com o tipo de ligação 
(‘o’ = outras operadoras, ‘v’ = a própria Vai-Vai, ou ‘f’ = telefone fixo) e  a quantidade de minutos. A cada entrada, 
deve-se informar o quanto que ele tem de saldo e o valor a pagar. Faça isto enquanto ele indicar que existem mais ligações a serem digitadas.
 */
import java.util.Scanner;

public class Questao55 {

    public static void resposta() {
        Scanner scanner = new Scanner(System.in);
        
        final double valorMensal = 50.00;
        final int minutosIncluidos = 100;
        final int minutosAdicionais = 50;
        final double valorExcedenteOutras = 0.65;
        final double valorExcedenteVaiVai = 0.20;
        final double valorMinFixo = 0.32; // 0.65 / 2
        
        double saldo = valorMensal;
        int minutosRestantes = minutosIncluidos;
        int minutosRestantesVaiVai = minutosAdicionais;

        while (true) {
            System.out.println("Digite o tipo de ligação ('o' para outras operadoras, 'v' para Vai-Vai, 'f' para telefone fixo) ou 's' para sair: ");
            String tipoLigacao = scanner.nextLine();
            
            if (tipoLigacao.equals("s")) {
                break; // Encerra o loop se o usuário digitar 's'
            }
            
            System.out.println("Digite a quantidade de minutos: ");
            int minutos = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer
            
            double valorPagar = 0.0;
            
            if (tipoLigacao.equals("o")) {
                if (minutos <= minutosRestantes) {
                    minutosRestantes -= minutos;
                } else {
                    int minutosExcedentes = minutos - minutosRestantes;
                    valorPagar = minutosExcedentes * valorExcedenteOutras;
                    minutosRestantes = 0;
                }
            } else if (tipoLigacao.equals("v")) {
                if (minutos <= minutosRestantesVaiVai) {
                    minutosRestantesVaiVai -= minutos;
                } else if (minutos <= minutosRestantesVaiVai + minutosRestantes) {
                    int minutosExcedentes = minutos - minutosRestantesVaiVai;
                    minutosRestantesVaiVai = 0;
                    minutosRestantes -= minutosExcedentes;
                } else {
                    int minutosExcedentes = minutos - (minutosRestantesVaiVai + minutosRestantes);
                    minutosRestantesVaiVai = 0;
                    minutosRestantes = 0;
                    valorPagar = minutosExcedentes * valorExcedenteVaiVai;
                }
            } else if (tipoLigacao.equals("f")) {
                if (minutos <= minutosRestantes) {
                    minutosRestantes -= minutos;
                } else {
                    int minutosExcedentes = minutos - minutosRestantes;
                    valorPagar = minutosExcedentes * valorMinFixo;
                    minutosRestantes = 0;
                }
            } else {
                System.out.println("Tipo de ligação inválido.");
                continue;
            }
            
            // Atualiza o saldo subtraindo o valor a pagar
            saldo -= valorPagar;
            
            // Exibe o saldo atualizado e o valor pago
            System.out.printf("Saldo restante: R$ %.2f\n", saldo);
            System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);

            // Reinicia o valor a pagar para a próxima iteração
            valorPagar = 0.0;
        }
        
        scanner.close();
    }
}
