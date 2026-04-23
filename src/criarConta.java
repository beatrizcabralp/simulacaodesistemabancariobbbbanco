public abstract class criarConta {

    protected int numero;
    protected String cliente;
    protected double saldo;

    public criarConta(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract void sacar(double valor);
    public abstract void transferir(criarConta destino, double valor);
}