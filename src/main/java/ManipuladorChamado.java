interface ManipuladorChamado {
    void setProximo(ManipuladorChamado proximo);
    void tratarChamado(Chamado chamado);
}