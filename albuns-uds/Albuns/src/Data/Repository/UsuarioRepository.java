/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Data.Dados.Data;
import Domain.Argument.Usuario.AdicionarUsuarioResponse;
import Domain.Argument.Usuario.EditarUsuarioResponse;
import Domain.Argument.Usuario.UsuarioResponse;
import Domain.Entity.Usuario;
import Domain.Interface.Repository.IRepositoryUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ronny
 */
public class UsuarioRepository implements IRepositoryUsuario {

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

    @Override
    public EditarUsuarioResponse EditarAlbum(Usuario usuario, int id) {
        try {
            if (Data.listaDeUsuarios == null || Data.listaDeUsuarios.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (Usuario item : Data.listaDeUsuarios) {
                if (item.getId().equals(id)) {
                    Data.listaDeUsuarios.add(Data.listaDeUsuarios.indexOf(item), usuario);
                    break;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(AlbumRepository.class.getName()).log(Level.SEVERE, null, e);
        }
        return new EditarUsuarioResponse();
    }

    @Override
    public void RemoverAlbum(int id) {
        try {
            if (Data.listaDeUsuarios == null || Data.listaDeUsuarios.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (Usuario item : Data.listaDeUsuarios) {
                if (item.getId().equals(id)) {
                    Data.listaDeUsuarios.remove(Data.listaDeUsuarios.indexOf(item));
                    break;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(AlbumRepository.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public UsuarioResponse GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
