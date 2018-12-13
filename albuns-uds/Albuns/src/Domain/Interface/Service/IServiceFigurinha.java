/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.Figurinha.AdicionarFigurinhaRequest;
import Domain.Argument.Figurinha.AdicionarFigurinhaResponse;

/**
 *
 * @author Ronny
 */
public interface IServiceFigurinha {
    AdicionarFigurinhaResponse AdicionarAlbumOriginal(AdicionarFigurinhaRequest request);
}
