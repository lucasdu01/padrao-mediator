public abstract class Pessoa {

    public String elogiarGovernanca(String mensagem) {
        return Recepcao.getInstancia().receberElogioGovernanca(mensagem);
    }

    public String reclamarGovernanca(String mensagem) {
        return Recepcao.getInstancia().receberReclamacaoGovernanca(mensagem);
    }

    public String sugerirGovernanca(String mensagem) {
        return Recepcao.getInstancia().receberSugestaoGovernanca(mensagem);
    }

}
