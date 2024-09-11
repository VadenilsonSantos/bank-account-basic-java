package io.github.vadenilsonSantos;

import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("numero da conta:");
        int numero = sc.nextInt();

        System.out.println("Qual valor deseja adicionar na conta?");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é "+ agencia +", conta " +numero+ " e seu saldo " +saldo+ " já está disponível para saque");
    }
}