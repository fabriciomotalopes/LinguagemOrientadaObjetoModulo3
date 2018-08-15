package br.com.livraria.model;

public class Livro {
    
    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    public Autor autor;
    
    public void mostrarDetalhes(){
        
        System.out.println("_____ Mostrando Detalhes do Livro _____");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("valor: " + valor);
        System.out.println("ISBN: " + isbn);
        
        autor.mostrarDetalhes();
        
        
    }
    
}
