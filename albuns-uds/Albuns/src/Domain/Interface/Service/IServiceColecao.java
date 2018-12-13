/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Interface.Service;

import Domain.Argument.Colecao.AdicionarColecaoRequest;
import Domain.Argument.Colecao.AdicionarColecaoResponse;

/**
 *
 * @author Ronny
 */
public interface IServiceColecao {
    AdicionarColecaoResponse AdicionarAlbumOriginal(AdicionarColecaoRequest request);
}
