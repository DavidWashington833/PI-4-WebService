package com.gandalf.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Pedido implements java.io.Serializable {

    private int idPedido;
    private Aplicacao aplicacao;
    private Cliente cliente;
    private Endereco endereco;
    private StatusPedido statusPedido;
    private TipoPagamento tipoPagamento;
    private Date dataPedido;
    private Set itemPedidos = new HashSet(0);

    public Pedido() {
    }

    public Pedido(int idPedido, Aplicacao aplicacao, Cliente cliente, StatusPedido statusPedido, TipoPagamento tipoPagamento, Date dataPedido) {
        this.idPedido = idPedido;
        this.aplicacao = aplicacao;
        this.cliente = cliente;
        this.statusPedido = statusPedido;
        this.tipoPagamento = tipoPagamento;
        this.dataPedido = dataPedido;
    }

    public Pedido(int idPedido, Aplicacao aplicacao, Cliente cliente, Endereco endereco, StatusPedido statusPedido, TipoPagamento tipoPagamento, Date dataPedido, Set itemPedidos) {
        this.idPedido = idPedido;
        this.aplicacao = aplicacao;
        this.cliente = cliente;
        this.endereco = endereco;
        this.statusPedido = statusPedido;
        this.tipoPagamento = tipoPagamento;
        this.dataPedido = dataPedido;
        this.itemPedidos = itemPedidos;
    }

    public int getIdPedido() {
        return this.idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Aplicacao getAplicacao() {
        return this.aplicacao;
    }

    public void setAplicacao(Aplicacao aplicacao) {
        this.aplicacao = aplicacao;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public StatusPedido getStatusPedido() {
        return this.statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public TipoPagamento getTipoPagamento() {
        return this.tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Date getDataPedido() {
        return this.dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Set getItemPedidos() {
        return this.itemPedidos;
    }

    public void setItemPedidos(Set itemPedidos) {
        this.itemPedidos = itemPedidos;
    }

}
