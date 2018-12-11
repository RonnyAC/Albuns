/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Repository;

import Domain.Argument.Usuario.AdicionarUsuarioResponse;
import Domain.Argument.Usuario.AutenticarUsuarioRequest;
import Domain.Argument.Usuario.AutenticarUsuarioResponse;
import Domain.Entity.Usuario;

/**
 *
 * @author Ronny
 */
public interface IRepositoryUsuario {

    AutenticarUsuarioResponse AutenticarUsuario(AutenticarUsuarioRequest request);

    AdicionarUsuarioResponse AdicionarUsusario(Usuario usuario);
}
