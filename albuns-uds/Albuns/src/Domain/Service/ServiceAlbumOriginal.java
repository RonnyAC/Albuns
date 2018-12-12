/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Data.Repository.AlbumOriginalRepository;
import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalRequest;
import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalResponse;
import Domain.Entity.AlbumOriginal;
import Domain.Interface.Repository.IRepositoryAlbumOriginal;
import Domain.Interface.Service.IServiceAlbumOriginal;

/**
 *
 * @author Ronny
 */
public class ServiceAlbumOriginal implements IServiceAlbumOriginal {

    private final IRepositoryAlbumOriginal repositoryAlbumOriginal;

    public ServiceAlbumOriginal() {
        repositoryAlbumOriginal = new AlbumOriginalRepository();
    }
    
    
    @Override
    public AdicionarAlbumOriginalResponse AdicionarAlbumOriginal(AdicionarAlbumOriginalRequest request) {
        try {
            var albumOriginal = new AlbumOriginal(request.getDescricao(), request.getTitulo(), request.getNumeroDeFigurinhas());
            return repositoryAlbumOriginal.AdicionarAlbum(albumOriginal);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

}
