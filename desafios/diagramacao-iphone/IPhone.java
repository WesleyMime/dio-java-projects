public class IPhone {

    private Integer bateria;

    private Integer volume;

    private boolean ligado;

    private final ReprodutorMidia reprodutorMidia;

    private final AparelhoTelefonico aparelhoTelefonico;

    private final NavegadorInternet navegadorInternet;

    public IPhone() {
        this.bateria = 100;
        this.volume = 50;
        this.ligado = false;
        this.reprodutorMidia = new IPod();
        this.aparelhoTelefonico = new Phone();
        this.navegadorInternet = new Safari();
    }

    public void iniciar() {
        System.out.println("IPhone iniciando.");
        this.ligado = true;
    }

    public void desligar() {
        System.out.println("IPhone desligando.");
        this.ligado = false;
    }

    public void aumentarVolume() {
        if (ligado) this.volume++;
        System.out.printf("Volume: %d.\n", volume);
    }

    public void diminuirVolume() {
        if (ligado) this.volume--;
        System.out.printf("Volume: %d.\n", volume);
    }

    public void carregar() {
        if (bateria < 100) {
            this.bateria++;
            System.out.printf("Bateria: %d.\n", bateria);
        }
    }

    public ReprodutorMidia getReprodutorMidia() {
        checarSeDesligado();
        return reprodutorMidia;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        checarSeDesligado();
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        checarSeDesligado();
        return navegadorInternet;
    }

    private void checarSeDesligado() {
        if (!ligado) throw new RuntimeException("IPhone desligado");
    }
}
