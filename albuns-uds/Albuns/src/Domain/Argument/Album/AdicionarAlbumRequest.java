/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Argument.Album;

/**
 *
 * @author Ronny
 */
public class AdicionarAlbumRequest {

    private String titulo;
    private String descricao;
    private Integer numeroDeFigurinhas;

    public AdicionarAlbumRequest(String titulo, String descricao, Integer numeroDeFigurinhas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.numeroDeFigurinhas = numeroDeFigurinhas;
    }
    
    public AdicionarAlbumRequest() {
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
