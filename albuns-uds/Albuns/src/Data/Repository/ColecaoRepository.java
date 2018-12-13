/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Data.Dados.Data;
import Domain.Argument.Colecao.AdicionarColecaoResponse;
import Domain.Argument.Colecao.ColecaoResponse;
import Domain.Argument.Colecao.EditarColecaoResponse;
import Domain.Entity.Colecao;
import Domain.Interface.Repository.IRepositoryColecao;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ronny
 */
public class ColecaoRepository implements IRepositoryColecao {

    @Override
    public AdicionarColecaoResponse AdicionarColecao(Colecao colecao) {
        if (Data.listaDeColecoes.isEmpty()) {
            colecao.setId(1);
            Data.listaDeColecoes.add(colecao);
            return new AdicionarColecaoResponse(colecao.getId(), "Usuario Adicionado com sucesso!!");
        }
        colecao.setId(Data.listaDeColecoes.get(Data.listaDeColecoes.size() - 1).getId() + 1);
        Data.listaDeColecoes.add(colecao);
        return new AdicionarColecaoResponse(colecao.getId(), "Usuario Adicionado com sucesso!!");
    }

    @Override
    public EditarColecaoResponse EditarAlbum(Colecao colecao, int id) {
        try {
            if (Data.listaDeColecoes == null || Data.listaDeColecoes.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (Colecao item : Data.listaDeColecoes) {
                if (item.getId().equals(id)) {
                    Data.listaDeColecoes.add(Data.listaDeColecoes.indexOf(item), colecao);
                    break;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(AlbumRepository.class.getName()).log(Level.SEVERE, null, e);
        }
        return new EditarColecaoResponse();
    }

    @Override
    public void RemoverAlbum(int id) {
        try {
            if (Data.listaDeColecoes == null || Data.listaDeColecoes.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (Colecao item : Data.listaDeColecoes) {
                if (item.getId().equals(id)) {
                    Data.listaDeColecoes.remove(Data.listaDeColecoes.indexOf(item));
                    break;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(AlbumRepository.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public ColecaoResponse GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
