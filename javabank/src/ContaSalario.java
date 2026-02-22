public class ContaSalario extends Conta {

    public ContaSalario(double saldoInicial, Notificador notificador) {
        super(saldoInicial, notificador);
    }

    @Override
    public void debitarTaxaManutencao() {
        descontar(0.0); // Conta Salário não tem taxa
    }
}