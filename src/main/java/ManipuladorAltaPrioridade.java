class ManipuladorAltaPrioridade extends AbstractManipuladorChamado {
    @Override
    public void tratarChamado(Chamado chamado) {
        if (chamado.getTipo().equals("alta")) {
            System.out.println("Chamado de alta prioridade sendo tratado...");
            // Lógica para tratar o chamado de alta prioridade
        } else if (proximo != null) {
            proximo.tratarChamado(chamado);
        }
    }
}