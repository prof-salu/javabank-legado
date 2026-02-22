public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[ALERTA VIA EMAIL] " + mensagem);
    }
}