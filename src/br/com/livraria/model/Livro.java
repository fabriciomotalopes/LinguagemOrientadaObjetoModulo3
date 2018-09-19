package br.com.livraria.model;

public abstract class Livro implements Produto{

    public Livro(Autor autor) {
        this.isbn = "000.000.000-00";
        this.autor = autor;
    }

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
 

    public boolean temAutor() {
        return this.autor != null;
    }

    public void mostrarDetalhes() {

        System.out.println("----- Mostrando Detalhes do Livro -----");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("valor: " + getValor());
        System.out.println("ISBN: " + getIsbn());

        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }

        System.out.println("---------------------------------------");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}
