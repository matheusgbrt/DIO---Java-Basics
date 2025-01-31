import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner sc = new Scanner(System.in);

        print("Por favor, digite o Número da Conta.");
        numeroConta = sc.nextInt();
        print("Por vafor, digite o Código da Agência.");
        agencia = sc.next();
        print("Por favor, digite o nome do Cliente.");
        nomeCliente = sc.next();
        print("Por favor, digite o saldo do Cliente.");
        saldo = sc.nextDouble();
        print(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque.",nomeCliente,agencia,numeroConta,saldo));
        sc.close();
    }

    private static void print(String message){
        System.out.println(message);
    }

}