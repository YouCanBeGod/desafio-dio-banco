public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta poupanca = new ContaCorrente();

        cc.transferir(50, poupanca);

        cc.extrato();
        poupanca.extrato();

    }
}
