/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.Usuario.AdicionarUsuarioRequest;
import Domain.Argument.Usuario.AdicionarUsuarioResponse;
import Domain.Argument.Usuario.EditarUsuarioRequest;
import Domain.Argument.Usuario.EditarUsuarioResponse;
import Domain.Argument.Usuario.UsuarioResponse;

/**
 *
 * @author usd - 0013
 */
public interface IServiceUsuario {
    AdicionarUsuarioResponse Adicionar(AdicionarUsuarioRequest request);
    
    EditarUsuarioResponse Editar(EditarUsuarioRequest request, int id);

    void Remover(int id);

    UsuarioResponse GetById(int id);
}
