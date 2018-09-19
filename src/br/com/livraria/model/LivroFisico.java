package br.com.livraria.model;

public class LivroFisico extends Livro implements Promocional{

    public LivroFisico(Autor autor) {
        super(autor);
    }
    
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.setValor( this.getValor() - (this.getValor() * porcentagem));
        return true;
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }

}
