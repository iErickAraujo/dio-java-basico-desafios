package DesafioControleFluxo.util;

import java.util.Scanner;

public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int obterNumeroInteiroPositivo(String prompt) {
        int numero;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro: ");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero <= 0);

        return numero;
    }
}
