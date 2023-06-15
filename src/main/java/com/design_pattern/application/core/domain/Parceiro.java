package com.design_pattern.application.core.domain;

public class Parceiro implements Observer {

    private String nome;
    private String email;
    private Subject subject;

    public Parceiro(String nome, String email, Subject subject) {
        this.nome = nome;
        this.email = email;
        this.subject = subject;
        this.subject.registerObserver(this);
    }


    /**
     * @param mensagem
     */
    @Override
    public void update(String mensagem) {
        Email.enviar(this, mensagem);
    }

    /**
     * @return
     */
    @Override
    public String getNome() {
        return this.nome;
    }

    /**
     * @return
     */
    @Override
    public String getEmail() {
        return this.email;
    }
}
