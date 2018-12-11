/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Data.Repository.UsuarioRepository;
import Domain.Argument.Usuario.AdicionarUsuarioRequest;
import Domain.Argument.Usuario.AdicionarUsuarioResponse;
import Domain.Argument.Usuario.AutenticarUsuarioRequest;
import Domain.Argument.Usuario.AutenticarUsuarioResponse;
import Domain.Entity.Usuario;
import Domain.Interface.Repository.IRepositoryUsuario;
import Domain.Interface.Service.IServiceUsuario;
import java.util.ArrayList;

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
    public AutenticarUsuarioResponse AutenticarUsuario(AutenticarUsuarioRequest request) {

        try {
            if (request == null) {
                throw new Exception("Erro encontrado");
            }

            return repositoryUsuario.AutenticarUsuario(request);
        } catch (Exception e) {
            System.err.println(e.getCause());
            return null;
        }
    }

    @Override
    public AdicionarUsuarioResponse AdicionarUsusario(AdicionarUsuarioRequest request) {
        try {
            var usuario = new Usuario(request.getNome(), request.getEmail(), request.getSenha());
            usuario.setColecoes(new ArrayList<>());
            usuario.setFigurinhasNaoAlocadas(new ArrayList<>());

            return repositoryUsuario.AdicionarUsusario(usuario);
        } catch (Exception e) {
            System.err.println(e + "Toma no cu");
            return null;
        }
    }
}
