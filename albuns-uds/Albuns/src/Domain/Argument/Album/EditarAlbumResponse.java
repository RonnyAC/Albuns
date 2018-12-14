/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Argument.Album;

import Domain.Entity.Figurinha;
import java.util.List;

/**
 *
 * @author Ronny
 */
public class EditarAlbumResponse {

    private String titulo;
    private String descricao;
    private List<Figurinha> figurinha;

    public EditarAlbumResponse() {
    }

    public EditarAlbumResponse(String titulo, String descricao, List<Figurinha> figurinha) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.figurinha = figurinha;
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

    public List<Figurinha> getFigurinha() {
        return figurinha;
    }

    public void setFigurinha(List<Figurinha> figurinha) {
        this.figurinha = figurinha;
    }
}
