package br.com.livraria.model;

public class Ebook extends Livro implements Promocional{

    public Ebook(Autor autor) {
        super(autor);
    }

    private String waterMark;

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        System.out.println("Aplicando Desconto no EBOOK");
        this.setValor(this.getValor() - (this.getValor() * porcentagem));
        return true;
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

}
