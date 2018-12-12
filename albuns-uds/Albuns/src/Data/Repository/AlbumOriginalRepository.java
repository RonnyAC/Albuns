/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Data.Dados.Data;
import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalResponse;
import Domain.Entity.AlbumOriginal;
import Domain.Interface.Repository.IRepositoryAlbumOriginal;

/**
 *
 * @author Ronny
 */
public class AlbumOriginalRepository implements IRepositoryAlbumOriginal {

    @Override
    public AdicionarAlbumOriginalResponse AdicionarAlbum(AlbumOriginal albumOriginal) {
        if (Data.listaDeAlbunsOriginais.isEmpty()) {
            albumOriginal.setId(1);
            Data.listaDeAlbunsOriginais.add(albumOriginal);
            return new AdicionarAlbumOriginalResponse(albumOriginal.getId(), "Usuario Adicionado com sucesso!!");
        }

        albumOriginal.setId(Data.listaDeAlbunsOriginais.get(Data.listaDeAlbunsOriginais.size() - 1).getId() + 1);
        Data.listaDeAlbunsOriginais.add(albumOriginal);
        return new AdicionarAlbumOriginalResponse(albumOriginal.getId(), "Usuario Adicionado com sucesso!!");
    }

}
