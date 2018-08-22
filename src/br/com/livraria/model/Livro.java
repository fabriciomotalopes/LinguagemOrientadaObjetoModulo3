package br.com.livraria.model;

public class Livro {

    public Livro() {
        System.out.println("Um livro foi criado!");
    }

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        valor = valor - (valor * porcentagem);
        return true;
    }

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

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
