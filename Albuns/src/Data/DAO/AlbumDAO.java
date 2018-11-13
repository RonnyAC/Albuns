/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.DAO;

import Domain.Entity.Album;
import Data.Dados.Data;
import java.util.ArrayList;

/**
 *
 * @author usd - 0013
 */
public class AlbumDAO {

    public void Salvar(Album album) {
        try {
            if (Data.listaDeAlbuns == null) {
                Data.listaDeAlbuns = new ArrayList<>();
                album.setId(1);
                Data.listaDeAlbuns.add(album);
            }

            album.setId(Data.listaDeAlbuns.get(Data.listaDeAlbuns.size() - 1).getId() + 1);
            Data.listaDeAlbuns.add(album);
        } catch (Exception e) {
            throw e;
        }

    }

    public void Editar(Album album, Integer id) throws Exception {
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
            throw e;
        }

    }

    public void Excluir(Integer id) throws Exception {
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
            throw e;
        }
    }
}
