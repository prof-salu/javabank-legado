public abstract class Conta {
    private double saldo;
    private Notificador notificador; // Baixo Acoplamento (depende da interface)

    // Injeção de dependência via Construtor
    public Conta(double saldoInicial, Notificador notificador) {
        this.saldo = saldoInicial;
        this.notificador = notificador;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        
        // Regra de negócio: Se ficar negativo, avisa o cliente usando o notificador injetado
        if (this.saldo < 0 && this.notificador != null) {
            this.notificador.enviar("Atenção! Conta negativada. Saldo atual: " + this.saldo);
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    protected void descontar(double valor) {
        this.saldo -= valor;
    }

    // Método polimórfico que obrigará as filhas a implementarem as suas próprias taxas
    public abstract void debitarTaxaManutencao();
}
