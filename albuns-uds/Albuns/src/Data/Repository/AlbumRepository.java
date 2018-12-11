/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Data.Dados.Data;
import Domain.Argument.Album.AdicionarAlbumResponse;
import Domain.Entity.Album;
import Domain.Interface.Repository.IRepositoryAlbum;

/**
 *
 * @author Ronny
 */
public class AlbumRepository implements IRepositoryAlbum {

    @Override
    public AdicionarAlbumResponse AdicionarAlbum(Album album) {
        
        if (Data.listaDeAlbuns.isEmpty()) {
            album.setId(1);
            Data.listaDeAlbuns.add(album);
            return new AdicionarAlbumResponse(album.getId(), "Usuario Adicionado com sucesso!!");
        }
        
        album.setId(Data.listaDeAlbuns.get(Data.listaDeAlbuns.size() - 1).getId() + 1);
        Data.listaDeAlbuns.add(album);
        return new AdicionarAlbumResponse(album.getId(), "Usuario Adicionado com sucesso!!");
    }

}
