/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Repository;

import Domain.Argument.Colecao.AdicionarColecaoResponse;
import Domain.Argument.Colecao.ColecaoResponse;
import Domain.Argument.Colecao.EditarColecaoResponse;
import Domain.Entity.Colecao;

/**
 *
 * @author Ronny
 */
public interface IRepositoryColecao {

    AdicionarColecaoResponse AdicionarColecao(Colecao colecao);

    EditarColecaoResponse EditarAlbum(Colecao colecao, int id);

    void RemoverAlbum(int id);

    ColecaoResponse GetById(int id);
}
