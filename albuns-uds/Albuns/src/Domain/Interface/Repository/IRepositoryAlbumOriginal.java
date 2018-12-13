/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Repository;

import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalResponse;
import Domain.Argument.AlbumOriginal.AlbumOriginalResponse;
import Domain.Argument.AlbumOriginal.EditarAlbumOriginalResponse;
import Domain.Entity.AlbumOriginal;

/**
 *
 * @author Ronny
 */
public interface IRepositoryAlbumOriginal {

    AdicionarAlbumOriginalResponse AdicionarAlbum(AlbumOriginal albumOriginal);

    EditarAlbumOriginalResponse EditarAlbum(AlbumOriginal albumOriginal, int id);

    void RemoverAlbum(int id);

    AlbumOriginalResponse GetById(int id);
}
