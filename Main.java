package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Scanner rostov = new Scanner(System.in);
        List<Object> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o Nome do Titular da Conta:");
            String titular = rostov.nextLine();

            System.out.println("Digite o Saldo do Titular da Conta:");
            double saldo = rostov.nextDouble();

            System.out.println("Digite o Numero da conta do Titular da Conta:");
            int numeroconta = rostov.nextInt();
            rostov.nextLine(); 

            System.out.println("Digite se a conta é Poupança ou Corrente:");
            String pc = rostov.nextLine();

            if (pc.equalsIgnoreCase("Corrente")) {
                System.out.println("Digite o Limite do Titular da Conta:");
                double limite = rostov.nextDouble();
                rostov.nextLine(); 
                ContaCorrente contaCorrente = new ContaCorrente(titular, saldo, numeroconta, limite);
                lista.add(contaCorrente);
                System.out.println("Conta Corrente adicionada: " + contaCorrente);
            } else if (pc.equalsIgnoreCase("Poupança")) {
                ContaPoupanca contaPoupanca = new ContaPoupanca(saldo, titular, numeroconta);
                lista.add(contaPoupanca);
                System.out.println("Conta Poupança adicionada: " + contaPoupanca);
            }

            System.out.println("Deseja Inserir mais contas? Digite S/N:");
            String confirma = rostov.nextLine();

            if (confirma.equalsIgnoreCase("N")) {
                break; 
            }
        }

        System.out.println("\nLista de todas as contas:");
        for (Object conta : lista) {
            System.out.println(conta);
        }

        rostov.close();
    }
}
