package br.com.livraria.model;

public class Proprietario {

    private String nome;
    private String cnh;
    private String endereco;

    public void mostrarDetalhes() {

        System.out.println("----- Mostrando os detalhes do Proprietário -----");
        System.out.println("Nome: " + getNome());
        System.out.println("CNH: " + getCnh());
        System.out.println("Endereço: " + getEndereco());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
