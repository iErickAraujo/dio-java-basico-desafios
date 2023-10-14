package DesafioControleFluxo;

// import java.util.Scanner;

import DesafioControleFluxo.exeptions.ParametrosInvalidosException;
import DesafioControleFluxo.util.InputUtil;

public class Contador {
    public static void main(String[] args) {
        // variaveis para testes
        // int parametroUm = 30;
        // int parametroDois = 12;

        // try (Scanner terminal = new Scanner(System.in)) {
        // System.out.println(">> Digite o primeiro Número: ");
        // int parametroUm = terminal.nextInt();
        // System.out.println(">> Digite o segundo Número: ");
        // int parametroDois = terminal.nextInt();

        try {
            int parametroUm = InputUtil.obterNumeroInteiroPositivo(">> Digite o primeiro Número: ");
            int parametroDois = InputUtil
                    .obterNumeroInteiroPositivo(">> Digite o segundo Número(Tem que ser maior que o Primeiro): ");
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("\r\n\nx-x O Segundo parâmetro deve ser maior que o Primeiro!!! \r\n\n" + exception);
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException(
                    "\r\n\nxxx O Segundo parâmetro deve ser maior que o Primeiro!!!\r\n\n");
        }
        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        // i inicia de 1 para ir ate 18

        for (int i = 1; i <= contagem; i++) {
            System.out.println(">> Imprimindo o número: > " + i + " <");
        }
    }
}