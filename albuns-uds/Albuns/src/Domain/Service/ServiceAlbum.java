/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Data.Repository.AlbumRepository;
import Domain.Argument.Album.AdicionarAlbumRequest;
import Domain.Argument.Album.AdicionarAlbumResponse;
import Domain.Argument.Album.AutenticarAlbumRequest;
import Domain.Argument.Album.AutenticarAlbumResponse;
import Domain.Entity.Album;
import Domain.Interface.Repository.IRepositoryAlbum;
import Domain.Interface.Service.IServiceAlbum;

/**
 *
 * @author Ronny
 */
public class ServiceAlbum implements IServiceAlbum {

    private final IRepositoryAlbum repositoryAlbum;

    public ServiceAlbum() {
        repositoryAlbum = new AlbumRepository();
    }

    @Override
    public AutenticarAlbumResponse AutenticarAlbum(AutenticarAlbumRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AdicionarAlbumResponse AdicionarAlbum(AdicionarAlbumRequest request) {
        try {
            var album = new Album(request.getTitulo(), request.getDescricao());
            return repositoryAlbum.AdicionarAlbum(album);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
}
