package br.com.livraria.test;

import br.com.livraria.model.Automovel;

public class CadastroDeAutomoveis {
    
    public static void main(String[] args) {
        
        Automovel automovel = new Automovel();
        
        automovel.marca = "Fiat";
        automovel.modelo = "Uno";
        automovel.cor = "Preto";
        automovel.ano = 2001;
        automovel.valor = 10000;
        
        automovel.mostrarDetalhes();
        
        Automovel outroAutomovel = new Automovel();
        
        outroAutomovel.marca = "Toyota";
        outroAutomovel.modelo = "Hilux";
        outroAutomovel.cor = "Branca";
        outroAutomovel.ano = 2010;
        outroAutomovel.valor = 100000;
        
        outroAutomovel.mostrarDetalhes();
        
    }
    
}
