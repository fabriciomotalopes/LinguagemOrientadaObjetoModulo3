package br.com.livraria.model;

public class Autor {
    
    public String nome;
    public String email;
    public String cpf;
    
    public void mostrarDetalhes(){
        System.out.println("----- Mostrando Detalhes do Autor -----");
        System.out.println("Nome do Autor: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("CPF: " + cpf);
    }
    
}
