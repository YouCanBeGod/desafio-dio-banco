public class Main {

    public static void main(String[] args) {

        Cliente amos = new Cliente();
        amos.setNome("Amós Dall`asta");

        Cliente jonas = new Cliente();
        jonas.setNome("Jonas Andrade");

        Conta cc = new ContaCorrente(amos);
        cc.depositar(100);

        Conta poupanca = new ContaCorrente(jonas);

        cc.transferir(50, poupanca);

        poupanca.pix(15, cc);

        cc.extrato();
        poupanca.extrato();

    }
}
