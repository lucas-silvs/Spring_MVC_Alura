package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;

public class RequisicaoNovoPedido {
    private String nomeProduto;
    private String urlProduto;
    private String urlImagemProduto;
    private String descricaoProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagemProduto() {
        return urlImagemProduto;
    }

    public void setUrlImagemProduto(String urlImagemProduto) {
        this.urlImagemProduto = urlImagemProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setDescricao(this.descricaoProduto);
        pedido.setNomeProduto(this.nomeProduto);
        pedido.setUrlProduto(this.urlProduto);
        pedido.setUrlImagem(this.urlImagemProduto);
        return pedido;
    }
}
