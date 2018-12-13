/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.Album.AdicionarAlbumRequest;
import Domain.Argument.Album.AdicionarAlbumResponse;

/**
 *
 * @author Ronny
 */
public interface IServiceAlbum {

    AdicionarAlbumResponse AdicionarAlbum(AdicionarAlbumRequest request);
}
