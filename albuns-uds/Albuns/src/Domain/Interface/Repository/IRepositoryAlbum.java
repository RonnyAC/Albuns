/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Repository;

import Domain.Argument.Album.AdicionarAlbumResponse;
import Domain.Argument.Album.AlbumResponse;
import Domain.Argument.Album.EditarAlbumResponse;
import Domain.Entity.Album;

/**
 *
 * @author Ronny
 */
public interface IRepositoryAlbum {
    AdicionarAlbumResponse AdicionarAlbum(Album album);
    
    EditarAlbumResponse EditarAlbum(Album album, int id);
    
    void RemoverAlbum(int id);
    
    AlbumResponse GetById(int id);
}
