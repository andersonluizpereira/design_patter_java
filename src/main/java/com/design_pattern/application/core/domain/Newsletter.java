package com.design_pattern.application.core.domain;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private List<String> mensagens = new ArrayList<String>();

    /**
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     *
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.mensagens.get(this.mensagens.size() - 1));
        }
    }

    public void addMensagem(String mensagem) {
        this.mensagens.add(mensagem);
        this.notifyObservers();
    }

    public Integer getQuantidadeMensagens() {
        return this.mensagens.size();
    }

    public String getUltimaMensagem() {
        return this.mensagens.get(this.mensagens.size() - 1);
    }

    public Integer getQuantidadeObservers() {
        return this.observers.size();
    }

}
