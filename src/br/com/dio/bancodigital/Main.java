package br.com.dio.bancodigital;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Andreia");

        Conta cc1 = new ContaCorrente(cliente1);
        Conta poupanca1 = new ContaPoupanca(cliente1);

        cc1.depositar(300);
        cc1.transferir(100, poupanca1);

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        System.out.println("-------");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Joana");

        Conta cc2 = new ContaCorrente(cliente2);
        Conta poupanca2 = new ContaPoupanca(cliente2);

        cc2.depositar(300);
        cc2.transferir(100, poupanca2);

        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();


        Cliente cliente3 = new Cliente();
        cliente3.setNome("Maria");

        Conta cc3 = new ContaCorrente(cliente3);
        //Conta sacar = new sacar (cliente3);

        cc3.depositar(300);
        cc3.imprimirExtrato();
        cc3.sacar(50);
        System.out.println("-----Saque de 50,00 efetuado------");
        cc3.imprimirExtrato();
        //poupanca2.imprimirExtrato();



    }

}