/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Data.Repository.AlbumRepository;
import Domain.Argument.Album.AdicionarAlbumRequest;
import Domain.Argument.Album.AdicionarAlbumResponse;
import Domain.Argument.Album.AlbumResponse;
import Domain.Argument.Album.EditarAlbumRequest;
import Domain.Argument.Album.EditarAlbumResponse;
import Domain.Entity.Album;
import Domain.Interface.Repository.IRepositoryAlbum;
import Domain.Interface.Service.IServiceAlbum;
import java.util.List;

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
    public AdicionarAlbumResponse Adicionar(AdicionarAlbumRequest request) {
        try {
            var album = new Album(request.getTitulo(), request.getDescricao());
            return repositoryAlbum.AdicionarAlbum(album);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    @Override
    public EditarAlbumResponse Editar(EditarAlbumRequest request, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remover(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AlbumResponse GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AlbumResponse> Listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
