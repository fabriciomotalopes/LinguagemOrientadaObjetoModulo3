package br.com.livraria.model;

public class Autor {

    private String nome;
    private String email;
    private String cpf;

    public void mostrarDetalhes() {
        System.out.println("----- Mostrando Detalhes do Autor -----");
        System.out.println("Nome do Autor: " + getNome());
        System.out.println("E-mail: " + getEmail());
        System.out.println("CPF: " + getCpf());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
