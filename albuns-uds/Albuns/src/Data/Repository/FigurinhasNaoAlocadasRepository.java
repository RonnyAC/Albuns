/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Data.Dados.Data;
import Domain.Argument.FigurinhasNaoAlocadas.AdicionarFigurinhasNaoAlocadasResponse;
import Domain.Entity.FigurinhasNaoAlocadas;
import Domain.Interface.Repository.IRepositoryFigurinhasNaoAlocadas;

/**
 *
 * @author Ronny
 */
public class FigurinhasNaoAlocadasRepository implements IRepositoryFigurinhasNaoAlocadas {

    @Override
    public AdicionarFigurinhasNaoAlocadasResponse AdicionarFigurinhasNaoAlocadas(FigurinhasNaoAlocadas figurinhasNaoAlocadas) {
        if (Data.listaDeFigurinahsNaoAlocadas.isEmpty() ) {
            figurinhasNaoAlocadas.setId(1);
            Data.listaDeFigurinahsNaoAlocadas.add(figurinhasNaoAlocadas);
            return new AdicionarFigurinhasNaoAlocadasResponse(figurinhasNaoAlocadas.getId(), "Usuario Adicionado com sucesso!!");
        }
        figurinhasNaoAlocadas.setId(Data.listaDeFigurinhas.get(Data.listaDeFigurinahsNaoAlocadas.size() - 1).getId() + 1);
        Data.listaDeFigurinahsNaoAlocadas.add(figurinhasNaoAlocadas);
        return new AdicionarFigurinhasNaoAlocadasResponse(figurinhasNaoAlocadas.getId(), "Usuario Adicionado com sucesso!!");
    }

}
