package com.design_pattern.application.core.domain;

public class Email {
    public static String enviar(Observer observer, String mensagem) {
        var mensagemEnviada = String.format("Enviando com o nome para %s, e-mail para %s, com a mensagem: %s",
                observer.getNome(),observer.getEmail(), mensagem);
        System.out.println(mensagemEnviada);
        return mensagemEnviada;
    }
}
