
public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        Agencia agen = new Agencia();
        venilton.setNome("Venilton");
        agen.setNome("Agência 1134 Novo Hamburgo Centro");
        agen.setNumero(1134);
        agen.setEndereco("R. Joaquim Nabuco, 726 - Centro, Novo Hamburgo - RS, 93310-002");

        Conta cc = new ContaCorrente(venilton, agen);
        Conta poupanca = new ContaPoupanca(venilton, agen);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
