/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.FigurinhasNaoAlocadas.AdicionarFigurinhasNaoAlocadasRequest;
import Domain.Argument.FigurinhasNaoAlocadas.AdicionarFigurinhasNaoAlocadasResponse;
import Domain.Argument.FigurinhasNaoAlocadas.EditarFigurinhasNaoAlocadasRequest;
import Domain.Argument.FigurinhasNaoAlocadas.EditarFigurinhasNaoAlocadasResponse;
import Domain.Argument.FigurinhasNaoAlocadas.FigurinhasNaoAlocadasResponse;

/**
 *
 * @author Ronny
 */
public interface IServiceFigurinhasNaoAlocadas {
    AdicionarFigurinhasNaoAlocadasResponse Adicionar(AdicionarFigurinhasNaoAlocadasRequest request);
    
    EditarFigurinhasNaoAlocadasResponse Editar(EditarFigurinhasNaoAlocadasRequest request, int id);

    void Remover(int id);

    FigurinhasNaoAlocadasResponse GetById(int id);
}
