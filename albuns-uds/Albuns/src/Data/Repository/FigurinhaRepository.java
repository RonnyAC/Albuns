/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Repository;

import Data.Dados.Data;
import Domain.Argument.Figurinha.AdicionarFigurinhaResponse;
import Domain.Argument.Figurinha.EditarFigurinhaResponse;
import Domain.Argument.Figurinha.FigurinhaResponse;
import Domain.Entity.Figurinha;
import Domain.Interface.Repository.IRepositoryFigurinha;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ronny
 */
public class FigurinhaRepository implements IRepositoryFigurinha {

    @Override
    public AdicionarFigurinhaResponse AdicionarFigurinha(Figurinha figurinha) {
        if (Data.listaDeFigurinhas.isEmpty()) {
            figurinha.setId(1);
            Data.listaDeFigurinhas.add(figurinha);
            return new AdicionarFigurinhaResponse(figurinha.getId(), "Usuario Adicionado com sucesso!!");
        }
        figurinha.setId(Data.listaDeFigurinhas.get(Data.listaDeFigurinhas.size() - 1).getId() + 1);
        Data.listaDeFigurinhas.add(figurinha);
        return new AdicionarFigurinhaResponse(figurinha.getId(), "Usuario Adicionado com sucesso!!");
    }

    @Override
    public EditarFigurinhaResponse EditarAlbum(Figurinha figurinha, int id) {
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
            Logger.getLogger(AlbumRepository.class.getName()).log(Level.SEVERE, null, e);
        }
        return new EditarFigurinhaResponse();
    }

    @Override
    public void RemoverAlbum(int id) {
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
            Logger.getLogger(AlbumRepository.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public FigurinhaResponse GetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
