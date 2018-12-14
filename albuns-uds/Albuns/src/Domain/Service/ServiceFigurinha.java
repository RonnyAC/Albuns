/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Data.Repository.FigurinhaRepository;
import Domain.Argument.Figurinha.AdicionarFigurinhaRequest;
import Domain.Argument.Figurinha.AdicionarFigurinhaResponse;
import Domain.Argument.Figurinha.EditarFigurinhaRequest;
import Domain.Argument.Figurinha.EditarFigurinhaResponse;
import Domain.Argument.Figurinha.FigurinhaResponse;
import Domain.Entity.Figurinha;
import Domain.Interface.Repository.IRepositoryFigurinha;
import Domain.Interface.Service.IServiceFigurinha;

/**
 *
 * @author Ronny
 */
public class ServiceFigurinha implements IServiceFigurinha {

    private final IRepositoryFigurinha repositoryFigurinha;

    public ServiceFigurinha() {
        repositoryFigurinha = new FigurinhaRepository();
    }

    @Override
    public AdicionarFigurinhaResponse Adicionar(AdicionarFigurinhaRequest request) {
        try {
            var figurinha = new Figurinha(request.getNumero(), request.getNome(), request.getDescricao(), request.getAlbumOriginal());
            return repositoryFigurinha.AdicionarFigurinha(figurinha);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    @Override
    public EditarFigurinhaResponse Editar(EditarFigurinhaRequest request, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remover(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FigurinhaResponse GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
