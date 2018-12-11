/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.Album.AdicionarAlbumRequest;
import Domain.Argument.Album.AdicionarAlbumResponse;
import Domain.Argument.Album.AutenticarAlbumRequest;
import Domain.Argument.Album.AutenticarAlbumResponse;

/**
 *
 * @author Ronny
 */
public interface IServiceAlbum {

    AutenticarAlbumResponse AutenticarAlbum(AutenticarAlbumRequest request);

    AdicionarAlbumResponse AdicionarAlbum(AdicionarAlbumRequest request);
}
