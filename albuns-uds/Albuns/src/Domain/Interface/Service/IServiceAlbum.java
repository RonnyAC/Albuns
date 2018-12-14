/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.Album.AdicionarAlbumRequest;
import Domain.Argument.Album.AdicionarAlbumResponse;
import Domain.Argument.Album.AlbumResponse;
import Domain.Argument.Album.EditarAlbumRequest;
import Domain.Argument.Album.EditarAlbumResponse;
import java.util.List;

/**
 *
 * @author Ronny
 */
public interface IServiceAlbum {

    AdicionarAlbumResponse Adicionar(AdicionarAlbumRequest request);

    EditarAlbumResponse Editar(EditarAlbumRequest request, int id);

    void Remover(int id);

    AlbumResponse GetById(int id);
    
    List<AlbumResponse> Listar();
}
