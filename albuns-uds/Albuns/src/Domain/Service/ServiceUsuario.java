/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Data.Repository.UsuarioRepository;
import Domain.Argument.Usuario.AdicionarUsuarioRequest;
import Domain.Argument.Usuario.AdicionarUsuarioResponse;
import Domain.Argument.Usuario.EditarUsuarioRequest;
import Domain.Argument.Usuario.EditarUsuarioResponse;
import Domain.Argument.Usuario.UsuarioResponse;
import Domain.Entity.Usuario;
import Domain.Interface.Repository.IRepositoryUsuario;
import Domain.Interface.Service.IServiceUsuario;

/**
 *
 * @author Ronny
 */
public class ServiceUsuario implements IServiceUsuario {

    private final IRepositoryUsuario repositoryUsuario;

    public ServiceUsuario() {
        repositoryUsuario = new UsuarioRepository();
    }

    @Override
    public AdicionarUsuarioResponse Adicionar(AdicionarUsuarioRequest request) {
        try {
            var usuario = new Usuario(request.getNome(), request.getEmail(), request.getSenha());
            
            return repositoryUsuario.AdicionarUsusario(usuario);
        } catch (Exception e) {
            System.err.println(e + "Toma no cu");
            return null;
        }
    }

    @Override
    public EditarUsuarioResponse Editar(EditarUsuarioRequest request, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Remover(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsuarioResponse GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
