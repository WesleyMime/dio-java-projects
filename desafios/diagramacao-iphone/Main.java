public class Main {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        iPhone.iniciar();
        iPhone.aumentarVolume();
        iPhone.aumentarVolume();
        iPhone.carregar();
        iPhone.diminuirVolume();

        NavegadorInternet navegadorInternet = iPhone.getNavegadorInternet();
        Integer numero = navegadorInternet.adicionarAba("google.com");
        navegadorInternet.exibirPagina(numero);
        navegadorInternet.atualizarPagina();
        navegadorInternet.removerAba(numero);

        ReprodutorMidia reprodutorMidia = iPhone.getReprodutorMidia();
        reprodutorMidia.adicionar("1");
        reprodutorMidia.adicionar("2");
        reprodutorMidia.adicionar("3");
        reprodutorMidia.adicionar("4");
        reprodutorMidia.adicionar("5");
        reprodutorMidia.adicionar("6");
        reprodutorMidia.adicionar("7");

        reprodutorMidia.selecionar(5);
        reprodutorMidia.reproduzir();
        reprodutorMidia.pausar();

        reprodutorMidia.embaralhar();
        reprodutorMidia.reproduzir();

        AparelhoTelefonico aparelhoTelefonico = iPhone.getAparelhoTelefonico();
        aparelhoTelefonico.ligar(5550125);
        aparelhoTelefonico.desligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.desligar();
        aparelhoTelefonico.iniciarCorreioVoz();

        iPhone.desligar();
    }
}
