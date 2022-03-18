public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO =1 ;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected double pagamento;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
        this.cliente = cliente;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void pix(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void pagamento(double valor){
        this.sacar(valor);
        pagamento =- valor;
    }

    protected void imprimirinfocomuns() {
        System.out.printf("Titular: %s%n",this.cliente.getNome());
        System.out.printf("Agencia: %d%n",this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        System.out.printf("Pagamento: %.2f%n",this.pagamento);
        System.out.printf("Saldo: %.2f%n",this.saldo);
    }
}
