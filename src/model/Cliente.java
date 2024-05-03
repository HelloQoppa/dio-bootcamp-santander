package model;

import java.util.Scanner;

import Interface.ICliente;

public class Cliente implements ICliente {

    int numero;
    String agencia;
    String nomeCliente;
    Float saldo;

    public Cliente(int numero, String agencia, String nomeCliente, Float saldo) {

        saldo = 0f;
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Cliente() {
        this.saldo = 0f;

    }

    @Override
    public void receberDadosDoCliente() {
        System.out.println("Seja bem vindo");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da agencia");
        agencia = scanner.nextLine();
        System.out.println("Digite o seu nome");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o seu numero");
        numero = scanner.nextInt();

        System.out.println(imprimeDadosDoCliente());
    }

    private String imprimeDadosDoCliente() {
        return "\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível\r\n" + //
                "para saque\".";
    }

}
