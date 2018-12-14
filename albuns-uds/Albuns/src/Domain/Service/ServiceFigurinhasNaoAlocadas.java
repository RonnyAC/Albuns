/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Domain.Argument.FigurinhasNaoAlocadas.AdicionarFigurinhasNaoAlocadasRequest;
import Domain.Argument.FigurinhasNaoAlocadas.AdicionarFigurinhasNaoAlocadasResponse;
import Domain.Argument.FigurinhasNaoAlocadas.EditarFigurinhasNaoAlocadasRequest;
import Domain.Argument.FigurinhasNaoAlocadas.EditarFigurinhasNaoAlocadasResponse;
import Domain.Argument.FigurinhasNaoAlocadas.FigurinhasNaoAlocadasResponse;
import Domain.Interface.Service.IServiceFigurinhasNaoAlocadas;

/**
 *
 * @author Ronny
 */
public class ServiceFigurinhasNaoAlocadas implements IServiceFigurinhasNaoAlocadas{

    @Override
    public AdicionarFigurinhasNaoAlocadasResponse Adicionar(AdicionarFigurinhasNaoAlocadasRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EditarFigurinhasNaoAlocadasResponse Editar(EditarFigurinhasNaoAlocadasRequest request, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remover(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FigurinhasNaoAlocadasResponse GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
