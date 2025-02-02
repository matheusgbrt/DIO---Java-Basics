package application;

import exception.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try (terminal) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = getParameterValue(terminal);
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = getParameterValue(terminal);
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.err.println(exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro precisa ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o parâmetro " + i);
        }
    }

    static int getParameterValue(Scanner terminal) {
        while (true) {
            try {
                return terminal.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("A entrada precisa ser um número inteiro.");
                terminal.next();
            }
        }
    }

}