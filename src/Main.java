public class Main {

    public static void main(String[] args) {
        Cliente Regivaldo = new Cliente();
        Regivaldo.setNome("Regivaldo");


        Conta cc = new ContaCorrente(Regivaldo);
        cc.depositar(1000);

       Conta poupanca = new ContaPoupanca(Regivaldo);
       cc.tranferir(400, poupanca);

       Conta contaCorrente = new ContaCorrente(Regivaldo);
       cc.pix( 300, poupanca);

        Conta contaCorrente1 = new ContaCorrente(Regivaldo);
        cc.pagamento(150);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();

    }
}
