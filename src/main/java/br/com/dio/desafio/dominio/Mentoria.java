package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data = LocalDate.now();

    public Mentoria() {}

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
    }

    @Override
    public Double calcularXP() {
        return 30.0;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria[" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                ']';
    }
}
