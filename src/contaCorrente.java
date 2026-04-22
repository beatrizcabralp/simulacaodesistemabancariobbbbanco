public class contaCorrente extends criarConta {

    public contaCorrente(int numero, String cliente) {
        super(numero, cliente);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.05;
        double total = valor + taxa;

        if (saldo >= total) {
            saldo -= total;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void transferir(criarConta destino, double valor) {
        double taxa = valor * 0.05;
        double total = valor + taxa;

        if (saldo >= total) {
            saldo -= total;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}