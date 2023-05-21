abstract class AbstractManipuladorChamado implements ManipuladorChamado {
    protected ManipuladorChamado proximo;

    @Override
    public void setProximo(ManipuladorChamado proximo) {
        this.proximo = proximo;
    }
}