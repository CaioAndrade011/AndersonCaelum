package com.company;

public class Main {
    public static void main(String[] args) {
        Conta contaCaio;
        Conta contaLucas;
        Conta contaSamuel;
        contaCaio = new Conta();
        contaLucas = new Conta();
        contaSamuel = new Conta();
        
        contaCaio.titular = "Caio";
        contaCaio.saldo = 300.00;
        contaCaio.numero = 001;
        contaCaio.agencia = "2664-6";
        contaCaio.dataAbertura = "01/01/2019";
        contaCaio.saque(0.00);
        contaCaio.deposito(0.00);


        contaLucas.titular = "Lukinha";
        contaLucas.saldo = 200.00;
        contaLucas.numero = 002;
        contaLucas.agencia = "2664-6";
        contaLucas.dataAbertura = "02/01/2019";
        contaLucas.saque(0.00);
        contaLucas.deposito(0.00);

        contaSamuel.titular = "Samuel";
        contaSamuel.saldo = 100.00;
        contaSamuel.numero = 003;
        contaSamuel.agencia = "2664-6";
        contaSamuel.dataAbertura = "03/01/2019";
        contaSamuel.saque(0.00);
        contaSamuel.deposito(0.00);

        

        contaCaio.saque(0.00);
        contaCaio.deposito(0.00);

        System.out.println("Seu saldo é: " + contaCaio.saldo);
        System.out.println("Rendimento: " + contaCaio.rendimento());
        System.out.println(contaCaio.dadosConta());

        contaSamuel = contaLucas;

        if (contaCaio == contaLucas) {
            System.out.println("As CC " + contaSamuel.titular + " e " + contaLucas.titular + " são iguais");
        } else {
            System.out.println("As CC " + contaCaio.titular + " e " + contaLucas.titular + " não são iguais");
        }

        if (contaSamuel == contaLucas) {
            System.out.println("As CC " + contaSamuel.titular + " e " + contaLucas.titular + " são iguais");
        } else {
            System.out.println("As CC " + contaSamuel.titular + " e " + contaLucas.titular + " não são iguais");
        }
    }
}
