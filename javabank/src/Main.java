public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA JAVABANK (REFATORADO) ===\n");

        // 1. Instanciamos os notificadores (Poderiam ser trocados facilmente)
        Notificador email = new NotificadorEmail();
        Notificador sms = new NotificadorSMS();

        // 2. Criamos as contas e injetamos as dependências
        // A Conta Corrente vai usar E-mail, e a Poupança vai usar SMS
        Conta cc = new ContaCorrente(1000.0, email);
        Conta cp = new ContaPoupanca(1000.0, sms);

        System.out.println("--- Teste Conta Corrente ---");
        cc.sacar(500.0);
        cc.debitarTaxaManutencao();
        System.out.println("Saldo CC: " + cc.getSaldo()); // Deve ser 485.0
        
        // Forçando um saldo negativo para testar o Notificador de Email
        cc.sacar(600.0); 

        System.out.println("\n--- Teste Conta Poupança ---");
        cp.sacar(200.0);
        cp.debitarTaxaManutencao();
        System.out.println("Saldo CP: " + cp.getSaldo()); // Deve ser 795.0
        
        // Forçando um saldo negativo para testar o Notificador de SMS
        cp.sacar(900.0);
    }
}