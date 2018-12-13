/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Argument.Colecao;

/**
 *
 * @author Ronny
 */
public class AdicionarColecaoRequest {
    private String titulo;
    private String senha;

    public AdicionarColecaoRequest(String titulo, String senha) {
        this.titulo = titulo;
        this.senha = senha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
