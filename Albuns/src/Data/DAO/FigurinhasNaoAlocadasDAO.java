/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.DAO;

import Data.Dados.Data;
import Domain.FigurinhasNaoAlocadas;
import java.util.ArrayList;

/**
 *
 * @author usd - 0013
 */
public class FigurinhasNaoAlocadasDAO {

    public void Salvar(FigurinhasNaoAlocadas figurinhaNaoAlocada) {
        try {
            if (Data.listaDeFigurinahsNaoAlocadas == null) {
                Data.listaDeFigurinahsNaoAlocadas = new ArrayList<>();
                figurinhaNaoAlocada.setId(1);
                Data.listaDeFigurinahsNaoAlocadas.add(figurinhaNaoAlocada);
            }

            figurinhaNaoAlocada.setId(Data.listaDeFigurinahsNaoAlocadas.get(Data.listaDeFigurinahsNaoAlocadas.size() - 1).getId() + 1);
            Data.listaDeFigurinahsNaoAlocadas.add(figurinhaNaoAlocada);
        } catch (Exception e) {
            throw e;
        }

    }

    public void Editar(FigurinhasNaoAlocadas figurinhaNaoAlocada, Integer id) throws Exception {
        try {
            if (Data.listaDeFigurinahsNaoAlocadas == null || Data.listaDeFigurinahsNaoAlocadas.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (FigurinhasNaoAlocadas item : Data.listaDeFigurinahsNaoAlocadas) {
                if (item.getId().equals(id)) {
                    Data.listaDeFigurinahsNaoAlocadas.add(Data.listaDeFigurinahsNaoAlocadas.indexOf(item), figurinhaNaoAlocada);
                    break;
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public void Excluir(Integer id) throws Exception {
        try {
            if (Data.listaDeFigurinahsNaoAlocadas == null || Data.listaDeFigurinahsNaoAlocadas.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (FigurinhasNaoAlocadas item : Data.listaDeFigurinahsNaoAlocadas) {
                if (item.getId().equals(id)) {
                    Data.listaDeFigurinahsNaoAlocadas.remove(Data.listaDeFigurinahsNaoAlocadas.indexOf(item));
                    break;
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
