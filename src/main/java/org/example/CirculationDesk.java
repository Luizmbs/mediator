package org.example;

public class CirculationDesk implements Sector {

    private static CirculationDesk instancia = new CirculationDesk();

    private CirculationDesk() {}

    public static CirculationDesk getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Balcão de Empréstimos vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Balcão de Empréstimos agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Balcão de Empréstimos vai analisar a sugestão: " + mensagem;
    }
}
