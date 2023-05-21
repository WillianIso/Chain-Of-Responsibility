class ManipuladorBaixaPrioridade extends AbstractManipuladorChamado {
    @Override
    public void tratarChamado(Chamado chamado) {
        if (chamado.getTipo().equals("baixa")) {
            System.out.println("Chamado de baixa prioridade sendo tratado...");
            // Lógica para tratar o chamado de baixa prioridade
        } else if (proximo != null) {
            proximo.tratarChamado(chamado);
        }
    }
}