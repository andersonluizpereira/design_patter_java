package com.design_pattern.application.core.domain;

public interface Observer {
    void update(String mensagem);
    String getNome();
    String getEmail();
}
