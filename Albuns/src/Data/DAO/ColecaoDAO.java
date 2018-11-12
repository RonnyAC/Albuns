/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.DAO;

import Data.Dados.Data;
import Domain.Colecao;
import java.util.ArrayList;

/**
 *
 * @author usd - 0013
 */
public class ColecaoDAO {

    public void Salvar(Colecao colecao) {
        try {
            if (Data.listaDeColecoes == null) {
                Data.listaDeColecoes = new ArrayList<>();
                colecao.setId(1);
                Data.listaDeColecoes.add(colecao);
            }

            colecao.setId(Data.listaDeColecoes.get(Data.listaDeColecoes.size() - 1).getId() + 1);
            Data.listaDeColecoes.add(colecao);
        } catch (Exception e) {
            throw e;
        }

    }

    public void Editar(Colecao colecao, Integer id) throws Exception {
        try {
            if (Data.listaDeColecoes == null || Data.listaDeColecoes.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (Colecao item : Data.listaDeColecoes) {
                if (item.getId().equals(id)) {
                    Data.listaDeColecoes.add(Data.listaDeColecoes.indexOf(item), colecao);
                    break;
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public void Excluir(Integer id) throws Exception {
        try {
            if (Data.listaDeColecoes == null || Data.listaDeColecoes.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (Colecao item : Data.listaDeColecoes) {
                if (item.getId().equals(id)) {
                    Data.listaDeColecoes.remove(Data.listaDeColecoes.indexOf(item));
                    break;
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
