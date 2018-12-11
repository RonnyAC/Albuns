/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Data.Dados.Data;
import Domain.Argument.Usuario.AdicionarUsuarioResponse;
import Domain.Argument.Usuario.AutenticarUsuarioRequest;
import Domain.Argument.Usuario.AutenticarUsuarioResponse;
import Domain.Entity.Usuario;
import Domain.Interface.Repository.IRepositoryUsuario;

/**
 *
 * @author Ronny
 */
public class UsuarioRepository implements IRepositoryUsuario {

    @Override
    public AutenticarUsuarioResponse AutenticarUsuario(AutenticarUsuarioRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AdicionarUsuarioResponse AdicionarUsusario(Usuario usuario) {
        if (Data.listaDeUsuarios.isEmpty()) {
            usuario.setId(1);
            Data.listaDeUsuarios.add(usuario);
            return new AdicionarUsuarioResponse(usuario.getId(), "Usuario Adicionado com sucesso!!");
        }
        usuario.setId(Data.listaDeUsuarios.get(Data.listaDeUsuarios.size() - 1).getId() + 1);
        Data.listaDeUsuarios.add(usuario);
        return new AdicionarUsuarioResponse(usuario.getId(), "Usuario Adicionado com sucesso!!");
    }

}
