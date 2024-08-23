package solutis.squad1_lista3;

import java.math.BigInteger;

public class Questao52 {

    public static void resposta() {
        BigInteger totalGraos = BigInteger.ZERO;
        for (int i = 1; i <= 64; i++) {
            BigInteger graosQuadrado = BigInteger.TWO.pow(i - 1);
            totalGraos = totalGraos.add(graosQuadrado);
        }
        BigInteger graosPorSaco = BigInteger.valueOf(50000);
        BigInteger totalSacos = totalGraos.divide(graosPorSaco);
        System.out.println("O súdito teria que ganhar "
                + totalGraos + " grãos de arroz.");
        System.out.println("Quantidade de sacos de arroz: "
                + totalSacos);
    }
}
