package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

    @Test
    void deveElogiarBalcao() {
        Reader reader = new Reader();
        assertEquals("A Central de Atendimento agradece seu contato.\nO Balcão de Empréstimos respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Balcão de Empréstimos agradece a mensagem: Ótimo atendimento",
                reader.elogiarBalcao("Ótimo atendimento"));
    }

    @Test
    void deveReclamarBalcao() {
        Reader reader = new Reader();
        assertEquals("A Central de Atendimento agradece seu contato.\nO Balcão de Empréstimos respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Balcão de Empréstimos vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                reader.reclamarBalcao("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirBalcao() {
        Reader reader = new Reader();
        assertEquals("A Central de Atendimento agradece seu contato.\nO Balcão de Empréstimos respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Balcão de Empréstimos vai analisar a sugestão: Ampliar horário de funcionamento",
                reader.sugerirBalcao("Ampliar horário de funcionamento"));
    }

}
