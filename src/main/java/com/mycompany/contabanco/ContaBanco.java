/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contabanco;

import java.util.Scanner;

/**
 *
 * @author Marcus
 */
public class ContaBanco {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o numero da conta:");
        int nConta = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite o numero da agencia:");
        String nAgencia = ler.next();
        ler.nextLine();
        System.out.println("Digite o nome do titular da conta:");
        String nNomeCliente = ler.next();
        ler.nextLine();
        System.out.println("Digite o saldo inicial da conta");
        double nSaldo = ler.nextDouble();
        ler.nextLine();
        
        ContaTerminal conta = new ContaTerminal(nConta, nAgencia, nNomeCliente, nSaldo);
        
        System.out.println("Olá " + conta.getNomeCliente() + "!"+
                            "\nObrigado por criar uma conta em nosso banco!"+
                            "\nSua agência é " + conta.getAgencia() + " e sua conta é " + conta.getConta() + "." +
                            "\nSeu saldo de R$" + conta.getSaldo() + " já está disponível para saque.");
    }
}
