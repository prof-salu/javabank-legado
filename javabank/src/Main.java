public class Main {
    public static void main(String[] args) {
        // Lab 2: Código Procedural e Quebra de Encapsulamento
        double saldo = 1000.0;
        String tipoConta = "CORRENTE";
        
        saldo = saldo - 500.0; // Saque solto
        
        if (tipoConta.equals("CORRENTE")) {
            saldo -= 15.0;
        } else if (tipoConta.equals("POUPANCA")) {
            saldo -= 5.0;
        } else if (tipoConta.equals("SALARIO")) {
            saldo -= 0.0;
        }
        System.out.println("Saldo final: " + saldo);

        // Lab 3: Acoplamento forte (apenas simulação)
        ServicoEmail email = new ServicoEmail();
        if (saldo < 0) {
            email.enviar("Atenção! Conta negativada.");
        }
    }
}