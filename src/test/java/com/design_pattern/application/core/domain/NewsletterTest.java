package com.design_pattern.application.core.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NewsletterTest {

    private Newsletter newsletter = new Newsletter();
    private Funcionario funcionario1;
    private Funcionario funcionario2;
    private Cliente cliente;
    private Parceiro parceiro;
    private Fornecedor fornecedor;

    @BeforeEach
    void init() {
        newsletter = new Newsletter();

        funcionario1 = new Funcionario("Funcionario 1", "funcionario1@email.com", newsletter);
        funcionario2 = new Funcionario("Funcionario 2", "funcionario2@email.com", newsletter);

        cliente = new Cliente("Cliente 1", "cliente1@email.com", newsletter);

        parceiro = new Parceiro("Parceiro 1", "parceiro1@email.com", newsletter);

        fornecedor = new Fornecedor("Fornecedor 1", "fornecedor1@email.com", newsletter);
    }

    @Test
    void addMensagem() {
        var mensagem = "Primeira Mensagem";
        newsletter.addMensagem(mensagem);
        assert(newsletter.getUltimaMensagem().contains(mensagem));
        assertTrue(newsletter.getQuantidadeMensagens() == 1);
        assertEquals(newsletter.getQuantidadeObservers(), 5);
    }

    @Test
    void removeObserver() {
        var mensagem = "Primeira Mensagem";
        newsletter.addMensagem(mensagem);
        newsletter.removeObserver(funcionario1);

        assertTrue(newsletter.getQuantidadeMensagens() == 1);
        assertEquals(newsletter.getQuantidadeObservers(), 4);
        assert(newsletter.getUltimaMensagem().contains(mensagem));

        newsletter.removeObserver(funcionario2);
        mensagem = "Segunda Mensagem";
        newsletter.addMensagem(mensagem);

        assertTrue(newsletter.getQuantidadeMensagens() == 2);
        assertEquals(newsletter.getQuantidadeObservers(), 3);
        assert(newsletter.getUltimaMensagem().contains(mensagem));

        newsletter.removeObserver(cliente);
        mensagem = "Terceira Mensagem";
        newsletter.addMensagem(mensagem);

        assertTrue(newsletter.getQuantidadeMensagens() == 3);
        assertEquals(newsletter.getQuantidadeObservers(), 2);
        assert(newsletter.getUltimaMensagem().contains(mensagem));

        newsletter.removeObserver(parceiro);
        mensagem = "Quarta Mensagem";
        newsletter.addMensagem(mensagem);

        assertTrue(newsletter.getQuantidadeMensagens() == 4);
        assertEquals(newsletter.getQuantidadeObservers(), 1);
        assert(newsletter.getUltimaMensagem().contains(mensagem));

        newsletter.removeObserver(fornecedor);
        mensagem = "Quinta Mensagem";
        newsletter.addMensagem(mensagem);

        assertTrue(newsletter.getQuantidadeMensagens() == 5);
        assertEquals(newsletter.getQuantidadeObservers(), 0);
        assert(newsletter.getUltimaMensagem().contains(mensagem));

        mensagem = "Sexta Mensagem";
        newsletter.addMensagem(mensagem);

        assertTrue(newsletter.getQuantidadeMensagens() == 6);
        assertEquals(newsletter.getQuantidadeObservers(), 0);
        assert(newsletter.getUltimaMensagem().contains(mensagem));

    }

}