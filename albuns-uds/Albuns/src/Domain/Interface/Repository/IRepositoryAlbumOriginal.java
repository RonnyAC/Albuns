/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Repository;

import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalResponse;
import Domain.Entity.AlbumOriginal;

/**
 *
 * @author Ronny
 */
public interface IRepositoryAlbumOriginal {
    AdicionarAlbumOriginalResponse AdicionarAlbum(AlbumOriginal albumOriginal);
}
