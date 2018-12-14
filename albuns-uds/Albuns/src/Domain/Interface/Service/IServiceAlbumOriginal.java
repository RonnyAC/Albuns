/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalRequest;
import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalResponse;
import Domain.Argument.AlbumOriginal.AlbumOriginalResponse;
import Domain.Argument.AlbumOriginal.EditarAlbumOriginalRequest;
import Domain.Argument.AlbumOriginal.EditarAlbumOriginalResponse;

/**
 *
 * @author Ronny
 */
public interface IServiceAlbumOriginal {
    AdicionarAlbumOriginalResponse Adicionar(AdicionarAlbumOriginalRequest request);
    
    EditarAlbumOriginalResponse Editar(EditarAlbumOriginalRequest request, int id);

    void Remover(int id);

    AlbumOriginalResponse GetById(int id);
}
