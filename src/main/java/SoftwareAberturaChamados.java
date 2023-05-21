class SoftwareAberturaChamados {
    private ManipuladorChamado manipuladorInicial;

    public SoftwareAberturaChamados() {
        // Configurando a cadeia de manipuladores
        ManipuladorChamado baixaPrioridade = new ManipuladorBaixaPrioridade();
        ManipuladorChamado mediaPrioridade = new ManipuladorMediaPrioridade();
        ManipuladorChamado altaPrioridade = new ManipuladorAltaPrioridade();

        baixaPrioridade.setProximo(mediaPrioridade);
        mediaPrioridade.setProximo(altaPrioridade);

        manipuladorInicial = baixaPrioridade;
    }

    public void abrirChamado(Chamado chamado) {
        manipuladorInicial.tratarChamado(chamado);
    }
}