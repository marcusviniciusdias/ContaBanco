/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabanco;

/**
 *
 * @author Marcus
 */
public class ContaTerminal {
    private int conta = 0;
    private String agencia = new String("");
    private String nomeCliente = new String("");
    private double saldo = 0.0;
    
    public ContaTerminal(int nConta, String nAgencia, String nNomeCliente, double nSaldo) {
        conta = nConta;
        agencia = nAgencia;
        nomeCliente = nNomeCliente;
        saldo = nSaldo;
    }
    
    public int getConta() {
        return conta;
    }
    
    public String getAgencia() {
        return agencia;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setConta(int nConta) {
        conta = nConta;
    }
    
    public void setAgencia(String nAgencia) {
        agencia = nAgencia;
    }
    
    public void setNomeCliente(String nNomeCliente) {
        nomeCliente = nNomeCliente;
    }
    
    public void setSaldo(double nSaldo) {
        saldo = nSaldo;
    }
}
