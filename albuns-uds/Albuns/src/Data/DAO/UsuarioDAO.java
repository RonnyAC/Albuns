/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.DAO;

import Data.Dados.Data;
import Domain.Entity.Usuario;
import java.util.ArrayList;

/**
 *
 * @author usd - 0013
 */
public class UsuarioDAO {
        public void Salvar(Usuario usuario) {
        try {
            if (Data.listaDeUsuarios == null) {
                Data.listaDeUsuarios = new ArrayList<>();
                usuario.setId(1);
                Data.listaDeUsuarios.add(usuario);
            }

            usuario.setId(Data.listaDeUsuarios.get(Data.listaDeUsuarios.size() - 1).getId() + 1);
            Data.listaDeUsuarios.add(usuario);
        } catch (Exception e) {
            throw e;
        }

    }

    public void Editar(Usuario usuario, Integer id) throws Exception {
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
            throw e;
        }

    }

    public void Excluir(Integer id) throws Exception {
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
            throw e;
        }
    }
}
