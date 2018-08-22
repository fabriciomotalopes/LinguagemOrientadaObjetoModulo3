package br.com.livraria.test;

import br.com.livraria.model.Automovel;
import br.com.livraria.model.Proprietario;

public class RegrasDeDescontoAutomovel {

    public static void main(String[] args) {
        
        Proprietario proprietario = new Proprietario();

        proprietario.setNome("Fabricio");
        proprietario.setCnh("123456789");
        proprietario.setEndereco("Rua do Topografo, 68");

        Automovel automovel = new Automovel(proprietario);

        automovel.setValor(59.90);

        System.out.println("Valor sem Desconto: " + automovel.getValor());

        if (!automovel.aplicaDescontoDe(0.4)) {
            System.out.println("O desconto foi maior que 30%");
        } else {
            System.out.println("Valor com Desconto: " + automovel.getValor());
        }

    }

}
