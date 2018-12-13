/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Repository;

import Domain.Argument.Figurinha.AdicionarFigurinhaResponse;
import Domain.Argument.Figurinha.EditarFigurinhaResponse;
import Domain.Argument.Figurinha.FigurinhaResponse;
import Domain.Entity.Figurinha;

/**
 *
 * @author Ronny
 */
public interface IRepositoryFigurinha {

    AdicionarFigurinhaResponse AdicionarFigurinha(Figurinha figurinha);

    EditarFigurinhaResponse EditarAlbum(Figurinha figurinha, int id);

    void RemoverAlbum(int id);

    FigurinhaResponse GetById(int id);
}
