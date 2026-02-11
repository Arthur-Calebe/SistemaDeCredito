package test;

import dominio.Cartao;

import java.util.Scanner;

public class SistemaCartao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cartao cartao = new Cartao();

        System.out.println("Digite o nome do titular: ");
        String nome = scanner.nextLine();
        cartao.setNomeTitular(nome);

        System.out.println("Digite o limite do cartão:");
        double limite = scanner.nextDouble();
        cartao.setLimite(limite);


        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1- Realizar uma compra");
            System.out.println("2- Ver limíte disponível");
            System.out.println("3- Ver extrato da conta");
            System.out.println("4- Sair");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o valor da compra");
                double valor = scanner.nextDouble();
                boolean aprovado = cartao.realizarCompra(valor);

                if (aprovado) {
                    System.out.println("Compra aprovada!");
                } else {
                    System.out.println("Compra negada!");
                }

            } else if (opcao == 2) {
                System.out.println("O seu limíte disponível é: " + cartao.getLimiteDisponivel());

            } else if (opcao == 3) {
                cartao.imprimeVia();
            } else if (opcao == 4) {
                System.out.println("Encerrando o sistema...");

            }
        }
    }
}
