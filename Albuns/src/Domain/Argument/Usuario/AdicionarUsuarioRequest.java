/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Argument.Usuario;

import Domain.Entity.Colecao;
import Domain.Entity.FigurinhasNaoAlocadas;
import Domain.Interface.Argument.IRequest;
import java.util.List;

/**
 *
 * @author usd - 0013
 */
public class AdicionarUsuarioRequest implements IRequest {
    private String email;
    private String senha;
    private List<FigurinhasNaoAlocadas> figurinhasNaoAlocadas;
    private List<Colecao> colecoes;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<FigurinhasNaoAlocadas> getFigurinhasNaoAlocadas() {
        return figurinhasNaoAlocadas;
    }

    public void setFigurinhasNaoAlocadas(List<FigurinhasNaoAlocadas> figurinhasNaoAlocadas) {
        this.figurinhasNaoAlocadas = figurinhasNaoAlocadas;
    }

    public List<Colecao> getColecoes() {
        return colecoes;
    }

    public void setColecoes(List<Colecao> colecoes) {
        this.colecoes = colecoes;
    }
    
    
}
