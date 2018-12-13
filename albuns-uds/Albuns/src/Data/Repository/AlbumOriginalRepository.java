/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Data.Dados.Data;
import Domain.Argument.AlbumOriginal.AdicionarAlbumOriginalResponse;
import Domain.Argument.AlbumOriginal.AlbumOriginalResponse;
import Domain.Argument.AlbumOriginal.EditarAlbumOriginalResponse;
import Domain.Entity.AlbumOriginal;
import Domain.Interface.Repository.IRepositoryAlbumOriginal;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    @Override
    public EditarAlbumOriginalResponse EditarAlbum(AlbumOriginal albumOriginal, int id) {
        try {
            if (Data.listaDeAlbunsOriginais == null || Data.listaDeAlbunsOriginais.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (AlbumOriginal item : Data.listaDeAlbunsOriginais) {
                if (item.getId().equals(id)) {
                    Data.listaDeAlbunsOriginais.add(Data.listaDeAlbunsOriginais.indexOf(item), albumOriginal);
                    break;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(AlbumRepository.class.getName()).log(Level.SEVERE, null, e);
        }
        return new EditarAlbumOriginalResponse();
    }

    @Override
    public void RemoverAlbum(int id) {
        try {
            if (Data.listaDeAlbunsOriginais == null || Data.listaDeAlbunsOriginais.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (AlbumOriginal item : Data.listaDeAlbunsOriginais) {
                if (item.getId().equals(id)) {
                    Data.listaDeAlbunsOriginais.remove(Data.listaDeAlbunsOriginais.indexOf(item));
                    break;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(AlbumRepository.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public AlbumOriginalResponse GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
