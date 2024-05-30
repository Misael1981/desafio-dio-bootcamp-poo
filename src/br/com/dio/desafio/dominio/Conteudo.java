package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    // Constante
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String dscricao;

    // Método abstract siginifica que as classes filhas serão obrigados a
    // implementar uma lógica nesse método
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return dscricao;
    }

    public void setDescricao(String dscricao) {
        this.dscricao = dscricao;
    }

}
