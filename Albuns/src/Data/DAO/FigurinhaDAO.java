/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.DAO;

import Data.Dados.Data;
import Domain.Figurinha;
import java.util.ArrayList;

/**
 *
 * @author usd - 0013
 */
public class FigurinhaDAO {

    public void Salvar(Figurinha figurinha) {
        try {
            if (Data.listaDeFigurinhas == null) {
                Data.listaDeFigurinhas = new ArrayList<>();
                figurinha.setId(1);
                Data.listaDeFigurinhas.add(figurinha);
            }

            figurinha.setId(Data.listaDeFigurinhas.get(Data.listaDeFigurinhas.size() - 1).getId() + 1);
            Data.listaDeFigurinhas.add(figurinha);
        } catch (Exception e) {
            throw e;
        }

    }

    public void Editar(Figurinha figurinha, Integer id) throws Exception {
        try {
            if (Data.listaDeFigurinhas == null || Data.listaDeFigurinhas.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (Figurinha item : Data.listaDeFigurinhas) {
                if (item.getId().equals(id)) {
                    Data.listaDeFigurinhas.add(Data.listaDeFigurinhas.indexOf(item), figurinha);
                    break;
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public void Excluir(Integer id) throws Exception {
        try {
            if (Data.listaDeFigurinhas == null || Data.listaDeFigurinhas.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (Figurinha item : Data.listaDeFigurinhas) {
                if (item.getId().equals(id)) {
                    Data.listaDeFigurinhas.remove(Data.listaDeFigurinhas.indexOf(item));
                    break;
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
