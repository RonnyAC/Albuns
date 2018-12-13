/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.FigurinhasNaoAlocadas.AdicionarFigurinhasNaoAlocadasRequest;
import Domain.Argument.FigurinhasNaoAlocadas.AdicionarFigurinhasNaoAlocadasResponse;

/**
 *
 * @author Ronny
 */
public interface IServiceFigurinhasNaoAlocadas {
    AdicionarFigurinhasNaoAlocadasResponse AdicionarAlbumOriginal(AdicionarFigurinhasNaoAlocadasRequest request);
}
