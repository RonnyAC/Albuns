/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Repository;

import Domain.Argument.FigurinhasNaoAlocadas.AdicionarFigurinhasNaoAlocadasResponse;
import Domain.Argument.FigurinhasNaoAlocadas.EditarFigurinhasNaoAlocadasResponse;
import Domain.Argument.FigurinhasNaoAlocadas.FigurinhasNaoAlocadasResponse;
import Domain.Entity.FigurinhasNaoAlocadas;

/**
 *
 * @author Ronny
 */
public interface IRepositoryFigurinhasNaoAlocadas {

    AdicionarFigurinhasNaoAlocadasResponse AdicionarFigurinhasNaoAlocadas(FigurinhasNaoAlocadas figurinhasNaoAlocadas);

    EditarFigurinhasNaoAlocadasResponse EditarAlbum(FigurinhasNaoAlocadas figurinhasNaoAlocadas, int id);

    void RemoverAlbum(int id);

    FigurinhasNaoAlocadasResponse GetById(int id);
}
