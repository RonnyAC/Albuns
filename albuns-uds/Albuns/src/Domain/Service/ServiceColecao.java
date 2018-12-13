/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Service;

import Data.Repository.ColecaoRepository;
import Domain.Argument.Colecao.AdicionarColecaoRequest;
import Domain.Argument.Colecao.AdicionarColecaoResponse;
import Domain.Entity.Colecao;
import Domain.Interface.Repository.IRepositoryColecao;
import Domain.Interface.Service.IServiceColecao;

/**
 *
 * @author Ronny
 */
public class ServiceColecao implements IServiceColecao {

    private final IRepositoryColecao repositoryColecao;

    public ServiceColecao() {
        repositoryColecao = new ColecaoRepository();
    }

    @Override
    public AdicionarColecaoResponse AdicionarAlbumOriginal(AdicionarColecaoRequest request) {
        try {
            var colecao = new Colecao(request.getTitulo(), request.getSenha());
            return repositoryColecao.AdicionarColecao(colecao);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

}
