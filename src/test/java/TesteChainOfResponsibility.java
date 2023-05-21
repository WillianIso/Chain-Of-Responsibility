import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteChainOfResponsibility {
    @Test
    public void testAbrirChamadoBaixaPrioridade() {
        SoftwareAberturaChamados software = new SoftwareAberturaChamados();
        Chamado chamado = new Chamado("baixa");

        Assertions.assertDoesNotThrow(() -> software.abrirChamado(chamado));
    }

    @Test
    public void testAbrirChamadoMediaPrioridade() {
        SoftwareAberturaChamados software = new SoftwareAberturaChamados();
        Chamado chamado = new Chamado("media");

        Assertions.assertDoesNotThrow(() -> software.abrirChamado(chamado));
    }

    @Test
    public void testAbrirChamadoAltaPrioridade() {
        SoftwareAberturaChamados software = new SoftwareAberturaChamados();
        Chamado chamado = new Chamado("alta");

        Assertions.assertDoesNotThrow(() -> software.abrirChamado(chamado));
    }

    @Test
    public void testAbrirChamadoPrioridadeDesconhecida() {
        SoftwareAberturaChamados software = new SoftwareAberturaChamados();
        Chamado chamado = new Chamado("desconhecida");

        Assertions.assertDoesNotThrow(() -> software.abrirChamado(chamado));
    }
}
