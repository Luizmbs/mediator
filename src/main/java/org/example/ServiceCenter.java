package org.example;

public class ServiceCenter {

    private static ServiceCenter instancia = new ServiceCenter();

    private ServiceCenter() {}

    public static ServiceCenter getInstancia() {
        return instancia;
    }

    public String receberElogioBalcao(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n"+
                "O Balcão de Empréstimos respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CirculationDesk.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoBalcao(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n"+
                "O Balcão de Empréstimos respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CirculationDesk.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoBalcao(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n"+
                "O Balcão de Empréstimos respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CirculationDesk.getInstancia().receberSugestao(mensagem);
    }

}
