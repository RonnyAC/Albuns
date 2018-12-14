/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.Figurinha.AdicionarFigurinhaRequest;
import Domain.Argument.Figurinha.AdicionarFigurinhaResponse;
import Domain.Argument.Figurinha.EditarFigurinhaRequest;
import Domain.Argument.Figurinha.EditarFigurinhaResponse;
import Domain.Argument.Figurinha.FigurinhaResponse;

/**
 *
 * @author Ronny
 */
public interface IServiceFigurinha {
    AdicionarFigurinhaResponse Adicionar(AdicionarFigurinhaRequest request);
    
    EditarFigurinhaResponse Editar(EditarFigurinhaRequest request, int id);

    void Remover(int id);

    FigurinhaResponse GetById(int id);
}
