import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospedeTest {

    @Test
    void deveElogiarGovernanca() {
        Hospede hospede = new Hospede();
        assertEquals("A Recepção agradece seu contato.\nA Governança respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>A Governança agradece a mensagem: Quarto impecável",
                hospede.elogiarGovernanca("Quarto impecável"));
    }

    @Test
    void deveReclamarGovernanca() {
        Hospede hospede = new Hospede();
        assertEquals("A Recepção agradece seu contato.\nA Governança respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>A Governança vai providenciar a correção do problema: Toalhas não foram trocadas",
                hospede.reclamarGovernanca("Toalhas não foram trocadas"));
    }

    @Test
    void deveSugerirGovernanca() {
        Hospede hospede = new Hospede();
        assertEquals("A Recepção agradece seu contato.\nA Governança respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>A Governança vai avaliar a sugestão: Oferecer travesseiros extras",
                hospede.sugerirGovernanca("Oferecer travesseiros extras"));
    }

}
