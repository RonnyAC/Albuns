/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Data.Dados.Data;
import Domain.Argument.Album.AdicionarAlbumResponse;
import Domain.Argument.Album.AlbumResponse;
import Domain.Argument.Album.EditarAlbumResponse;
import Domain.Entity.Album;
import Domain.Interface.Repository.IRepositoryAlbum;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ronny
 */
public class AlbumRepository implements IRepositoryAlbum {

    @Override
    public AdicionarAlbumResponse AdicionarAlbum(Album album) {

        if (Data.listaDeAlbuns.isEmpty()) {
            album.setId(1);
            Data.listaDeAlbuns.add(album);
            return new AdicionarAlbumResponse(album.getId(), "Usuario Adicionado com sucesso!!");
        }

        album.setId(Data.listaDeAlbuns.get(Data.listaDeAlbuns.size() - 1).getId() + 1);
        Data.listaDeAlbuns.add(album);
        return new AdicionarAlbumResponse(album.getId(), "Usuario Adicionado com sucesso!!");
    }

    @Override
    public EditarAlbumResponse EditarAlbum(Album album, int id) {
        try {
            if (Data.listaDeAlbuns == null || Data.listaDeAlbuns.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (Album item : Data.listaDeAlbuns) {
                if (item.getId().equals(id)) {
                    Data.listaDeAlbuns.add(Data.listaDeAlbuns.indexOf(item), album);
                    break;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(AlbumRepository.class.getName()).log(Level.SEVERE, null, e);
        }
        return new EditarAlbumResponse();
    }

    @Override
    public void RemoverAlbum(int id) {
        try {
            if (Data.listaDeAlbuns == null || Data.listaDeAlbuns.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (Album item : Data.listaDeAlbuns) {
                if (item.getId().equals(id)) {
                    Data.listaDeAlbuns.remove(Data.listaDeAlbuns.indexOf(item));
                    break;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(AlbumRepository.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public AlbumResponse GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
