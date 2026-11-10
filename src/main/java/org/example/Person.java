package org.example;

public abstract class Person {

    public String elogiarBalcao(String mensagem) {
        return ServiceCenter.getInstancia().receberElogioBalcao(mensagem);
    }

    public String reclamarBalcao(String mensagem) {
        return ServiceCenter.getInstancia().receberReclamacaoBalcao(mensagem);
    }

    public String sugerirBalcao(String mensagem) {
        return ServiceCenter.getInstancia().receberSugestaoBalcao(mensagem);
    }

}
