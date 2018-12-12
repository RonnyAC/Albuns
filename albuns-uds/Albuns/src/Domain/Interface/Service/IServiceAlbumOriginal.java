/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalRequest;
import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalResponse;

/**
 *
 * @author Ronny
 */
public interface IServiceAlbumOriginal {
    AdicionarAlbumOriginalResponse AdicionarAlbumOriginal(AdicionarAlbumOriginalRequest request);
}
