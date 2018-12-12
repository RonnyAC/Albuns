/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Entity;

/**
 *
 * @author Ronny
 */
public class AlbumOriginal {
    private Integer id;
    private String titulo;
    private String descricao;
    private Integer numeroDeFigurinhas;

    public AlbumOriginal(String descricao, String titulo, Integer numeroDeFigurinhas) {
        this.descricao = descricao;
        this.titulo = titulo;
        this.numeroDeFigurinhas = numeroDeFigurinhas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNumeroDeFigurinhas() {
        return numeroDeFigurinhas;
    }

    public void setNumeroDeFigurinhas(Integer numeroDeFigurinhas) {
        this.numeroDeFigurinhas = numeroDeFigurinhas;
    }
    
    
}
