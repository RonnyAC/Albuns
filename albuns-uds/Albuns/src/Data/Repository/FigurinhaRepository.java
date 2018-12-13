/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Data.Dados.Data;
import Domain.Argument.Figurinha.AdicionarFigurinhaResponse;
import Domain.Entity.Figurinha;
import Domain.Interface.Repository.IRepositoryFigurinha;

/**
 *
 * @author Ronny
 */
public class FigurinhaRepository implements IRepositoryFigurinha {

    @Override
    public AdicionarFigurinhaResponse AdicionarFigurinha(Figurinha figurinha) {
        if (Data.listaDeFigurinhas.isEmpty() ) {
            figurinha.setId(1);
            Data.listaDeFigurinhas.add(figurinha);
            return new AdicionarFigurinhaResponse(figurinha.getId(), "Usuario Adicionado com sucesso!!");
        }
        figurinha.setId(Data.listaDeFigurinhas.get(Data.listaDeFigurinhas.size() - 1).getId() + 1);
        Data.listaDeFigurinhas.add(figurinha);
        return new AdicionarFigurinhaResponse(figurinha.getId(), "Usuario Adicionado com sucesso!!");
    }

}