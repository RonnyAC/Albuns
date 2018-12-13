/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Entity;

import java.util.List;

/**
 *
 * @author Ronny
 */
public class FigurinhasNaoAlocadas {
    private Integer id;
    private Album album;
    private List<Figurinha> figurinhas;

    public FigurinhasNaoAlocadas(Album album) {
        this.album = album;
    }

    
    public FigurinhasNaoAlocadas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Figurinha> getFigurinhas() {
        return figurinhas;
    }

    public void setFigurinhas(List<Figurinha> figurinhas) {
        this.figurinhas = figurinhas;
    }
    
    
}
