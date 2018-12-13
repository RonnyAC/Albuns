/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Argument.FigurinhasNaoAlocadas;

import Domain.Entity.Album;

/**
 *
 * @author Ronny
 */
public class AdicionarFigurinhasNaoAlocadasRequest {

    private Album album;

    public AdicionarFigurinhasNaoAlocadasRequest(Album album) {
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

}
