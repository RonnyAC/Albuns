/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.Usuario.AdicionarUsuarioRequest;
import Domain.Argument.Usuario.AdicionarUsuarioResponse;
import Domain.Argument.Usuario.AutenticarUsuarioRequest;
import Domain.Argument.Usuario.AutenticarUsuarioResponse;

/**
 *
 * @author usd - 0013
 */
public interface IServiceUsuario {
    AutenticarUsuarioResponse AutenticarUsuario(AutenticarUsuarioRequest request);
    AdicionarUsuarioResponse AdicionarUsusario(AdicionarUsuarioRequest request);
}
