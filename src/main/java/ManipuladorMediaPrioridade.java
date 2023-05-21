class ManipuladorMediaPrioridade extends AbstractManipuladorChamado {
    @Override
    public void tratarChamado(Chamado chamado) {
        if (chamado.getTipo().equals("media")) {
            System.out.println("Chamado de média prioridade sendo tratado...");
            // Lógica para tratar o chamado de média prioridade
        } else if (proximo != null) {
            proximo.tratarChamado(chamado);
        }
    }
}