/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Domain.Argument.Album.AdicionarAlbumRequest;
import Domain.Argument.Album.AdicionarAlbumResponse;
import Domain.Service.ServiceAlbum;

/**
 *
 * @author Ronny
 */
public class AlbumController {
    private final ServiceAlbum service;

    public AlbumController() {
        service = new ServiceAlbum();
    }
   
    public AdicionarAlbumResponse Adicionar(AdicionarAlbumRequest request){
        return service.Adicionar(request);
    }
}
