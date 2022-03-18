public interface IConta {

     void sacar(double valor);

     void depositar(double valor);

     void tranferir(double valor, Conta contaDestino);

     void pix(double valor, Conta contaDestino);

     void pagamento(double valor);

     void imprimirExtrato();

}
