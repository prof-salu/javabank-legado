public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldoInicial, Notificador notificador) {
        super(saldoInicial, notificador);
    }

    @Override
    public void debitarTaxaManutencao() {
        descontar(5.0); // Taxa específica da Poupança
    }
}