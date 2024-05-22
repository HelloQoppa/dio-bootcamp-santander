package desafio02;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair

        while (true) {

            System.out.println("Menu:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas
            // pelo usuário.
            switch (opcao) {
                case 1:
                    saldo = getDeposito(scanner, saldo);
                    break;
                case 2:
                    saldo = getSaque(scanner, saldo);
                    break;
                case 3:
                    System.out.println("seu saldo atual é de : " + saldo);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:

        }
    }

    private static double getSaque(Scanner scanner, double saldo) {

        try {
            double saque;
            System.out.println("Qual o valor do saque ? ");
            saque = scanner.nextDouble();

            if (saldo >= saque) {
                saldo -= saque;
                System.out.println("O valor atual do saldo é : " + saldo);
                return saldo;
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");

            }
        } catch (Exception e) {
            System.out.println("não é possivel realizar saque");
        }
        return saldo;

    }

    private static double getDeposito(Scanner scanner, double saldo) {
        System.out.println("Deposito");
        System.out.println("Digite o valor do deposito");
        double deposito = scanner.nextDouble();
        saldo = saldo + deposito;
        System.out.println("saldo de " + saldo);
        return saldo;
    }

}
