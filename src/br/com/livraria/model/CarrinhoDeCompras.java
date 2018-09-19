package br.com.livraria.model;

public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        //produto.aplicaDescontoDe(0.10);
        total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }

}
