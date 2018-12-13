/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Data.Dados.Data;
import Domain.Argument.FigurinhasNaoAlocadas.AdicionarFigurinhasNaoAlocadasResponse;
import Domain.Argument.FigurinhasNaoAlocadas.EditarFigurinhasNaoAlocadasResponse;
import Domain.Argument.FigurinhasNaoAlocadas.FigurinhasNaoAlocadasResponse;
import Domain.Entity.FigurinhasNaoAlocadas;
import Domain.Interface.Repository.IRepositoryFigurinhasNaoAlocadas;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ronny
 */
public class FigurinhasNaoAlocadasRepository implements IRepositoryFigurinhasNaoAlocadas {

    @Override
    public AdicionarFigurinhasNaoAlocadasResponse AdicionarFigurinhasNaoAlocadas(FigurinhasNaoAlocadas figurinhasNaoAlocadas) {
        if (Data.listaDeFigurinahsNaoAlocadas.isEmpty()) {
            figurinhasNaoAlocadas.setId(1);
            Data.listaDeFigurinahsNaoAlocadas.add(figurinhasNaoAlocadas);
            return new AdicionarFigurinhasNaoAlocadasResponse(figurinhasNaoAlocadas.getId(), "Usuario Adicionado com sucesso!!");
        }
        figurinhasNaoAlocadas.setId(Data.listaDeFigurinhas.get(Data.listaDeFigurinahsNaoAlocadas.size() - 1).getId() + 1);
        Data.listaDeFigurinahsNaoAlocadas.add(figurinhasNaoAlocadas);
        return new AdicionarFigurinhasNaoAlocadasResponse(figurinhasNaoAlocadas.getId(), "Usuario Adicionado com sucesso!!");
    }

    @Override
    public EditarFigurinhasNaoAlocadasResponse EditarAlbum(FigurinhasNaoAlocadas figurinhasNaoAlocadas, int id) {
        try {
            if (Data.listaDeFigurinahsNaoAlocadas == null || Data.listaDeFigurinahsNaoAlocadas.isEmpty()) {
                throw new Exception("Não existem dados a serem alterados");
            }
            for (FigurinhasNaoAlocadas item : Data.listaDeFigurinahsNaoAlocadas) {
                if (item.getId().equals(id)) {
                    Data.listaDeFigurinahsNaoAlocadas.add(Data.listaDeFigurinahsNaoAlocadas.indexOf(item), figurinhasNaoAlocadas);
                    break;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(AlbumRepository.class.getName()).log(Level.SEVERE, null, e);
        }
        return new EditarFigurinhasNaoAlocadasResponse();
    }

    @Override
    public void RemoverAlbum(int id) {
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
            Logger.getLogger(AlbumRepository.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public FigurinhasNaoAlocadasResponse GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
