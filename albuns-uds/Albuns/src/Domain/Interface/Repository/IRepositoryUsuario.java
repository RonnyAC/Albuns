/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Repository;

import Domain.Argument.Usuario.AdicionarUsuarioResponse;
import Domain.Argument.Usuario.EditarUsuarioResponse;
import Domain.Argument.Usuario.UsuarioResponse;
import Domain.Entity.Usuario;

/**
 *
 * @author Ronny
 */
public interface IRepositoryUsuario {

    AdicionarUsuarioResponse AdicionarUsusario(Usuario usuario);

    EditarUsuarioResponse EditarAlbum(Usuario usuario, int id);

    void RemoverAlbum(int id);

    UsuarioResponse GetById(int id);
}
