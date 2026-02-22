public class NotificadorSMS implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[ALERTA VIA SMS] " + mensagem);
    }
}