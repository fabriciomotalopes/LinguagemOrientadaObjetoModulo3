package br.com.livraria.test;

import br.com.livraria.model.Livro;

public class RegrasDeDesconto {
    
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        
        livro.setValor(59.90);
        
        System.out.println("Valor sem Desconto: " + livro.getValor());
        
        if(!livro.aplicaDescontoDe(0.4)){
            System.out.println("O desconto foi maior que 30%");
        }else{
            System.out.println("Valor com Desconto: " + livro.getValor());
        }
        
    }

}
