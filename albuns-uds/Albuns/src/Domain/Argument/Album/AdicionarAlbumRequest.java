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
public class AdicionarAlbumRequest {

    private String titulo;
    private String descricao;
    private List<Figurinha> figurinhas;

    public AdicionarAlbumRequest(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
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

    public List<Figurinha> getFigurinhas() {
        return figurinhas;
    }

    public void setFigurinhas(List<Figurinha> figurinhas) {
        this.figurinhas = figurinhas;
    }
    
}
