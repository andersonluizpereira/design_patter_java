package com.design_pattern.application.core.domain;

public class Pedido {
    private State aguardandoPagamento;
    private State pago;
    private State enviado;
    private State cancelado;
    private State estadoAtual;

    public Pedido(State aguardandoPagamento, State pago, State enviado, State cancelado, State estadoAtual) {
        this.aguardandoPagamento = new AguardandoPagamentoState(this);
        this.pago = new PagoState(this);
        this.enviado = new EnviadoState(this);
        this.cancelado = new CanceladoState(this);
        this.estadoAtual = this.aguardandoPagamento;
    }
    public void realizarPagamento() {
        this.estadoAtual.sucessoAoPagar();
    }
    public void cancelarPedido() {
        this.estadoAtual.cancelarPedido();
    }
    public void despacharPedido() {
        try {
            this.estadoAtual.despacharPedido();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public State getAguardandoPagamento() {
        return aguardandoPagamento;
    }

    public State getPago() {
        return pago;
    }

    public State getEnviado() {
        return enviado;
    }

    public State getCancelado() {
        return cancelado;
    }

    public State getEstadoAtual() {
        return estadoAtual;
    }
}
