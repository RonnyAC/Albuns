/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.Colecao.AdicionarColecaoRequest;
import Domain.Argument.Colecao.AdicionarColecaoResponse;
import Domain.Argument.Colecao.ColecaoResponse;
import Domain.Argument.Colecao.EditarColecaoRequest;
import Domain.Argument.Colecao.EditarColecaoResponse;

/**
 *
 * @author Ronny
 */
public interface IServiceColecao {

    AdicionarColecaoResponse Adicionar(AdicionarColecaoRequest request);

    EditarColecaoResponse Editar(EditarColecaoRequest request, int id);

    void Remover(int id);

    ColecaoResponse GetById(int id);
}
