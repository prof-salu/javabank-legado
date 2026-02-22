public class ContaCorrente extends Conta {

    public ContaCorrente(double saldoInicial, Notificador notificador) {
        super(saldoInicial, notificador);
    }

    @Override
    public void debitarTaxaManutencao() {
        descontar(15.0); // Taxa específica da Conta Corrente
    }
}