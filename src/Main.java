public class Main {

    public static void main(String[] args) {

        Cliente amos = new Cliente();
        amos.setNome("Amós Dall`asta");

        Conta cc = new ContaCorrente(amos);
        cc.depositar(100);

        Conta poupanca = new ContaCorrente(amos);

        cc.transferir(50, poupanca);

        cc.extrato();
        poupanca.extrato();

    }
}
