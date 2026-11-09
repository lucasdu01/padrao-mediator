public class Recepcao {

    private static Recepcao instancia = new Recepcao();

    private Recepcao() {}

    public static Recepcao getInstancia() {
        return instancia;
    }

    public String receberElogioGovernanca(String mensagem) {
        return "A Recepção agradece seu contato.\n" +
                "A Governança respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>" + Governanca.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoGovernanca(String mensagem) {
        return "A Recepção agradece seu contato.\n" +
                "A Governança respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>" + Governanca.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoGovernanca(String mensagem) {
        return "A Recepção agradece seu contato.\n" +
                "A Governança respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>" + Governanca.getInstancia().receberSugestao(mensagem);
    }

}
