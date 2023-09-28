public class Phone implements  AparelhoTelefonico {

    @Override
    public void ligar(Integer numero) {
        System.out.printf("Ligando para %d.\n", numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
