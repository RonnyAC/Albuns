/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.DAO;

import Domain.Album;
import Data.Dados.Data;
import java.util.ArrayList;

/**
 *
 * @author usd - 0013
 */
public class AlbumDAO {
    
    public void Salvar(Album album){
        if(Data.listaDeAlbuns == null){
            Data.listaDeAlbuns = new ArrayList<>();
        }
        
        Data.listaDeAlbuns.add(album);
    }
    
    public void Editar(Album album){
        
    }
    
    public void Excluir(Integer id){
        
    }
}
