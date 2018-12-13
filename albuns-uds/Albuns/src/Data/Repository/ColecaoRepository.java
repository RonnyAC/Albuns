/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Data.Dados.Data;
import Domain.Argument.Colecao.AdicionarColecaoResponse;
import Domain.Entity.Colecao;
import Domain.Interface.Repository.IRepositoryColecao;

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

}
