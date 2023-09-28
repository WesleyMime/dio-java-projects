public interface NavegadorInternet {

    void exibirPagina(Integer numero);

    Integer adicionarAba(String url);

    void removerAba(Integer numero);

    void atualizarPagina();
}
