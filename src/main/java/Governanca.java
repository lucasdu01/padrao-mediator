public class Governanca implements Setor {

    private static Governanca instancia = new Governanca();

    private Governanca() {}

    public static Governanca getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Governança vai providenciar a correção do problema: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Governança agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Governança vai avaliar a sugestão: " + mensagem;
    }
}
