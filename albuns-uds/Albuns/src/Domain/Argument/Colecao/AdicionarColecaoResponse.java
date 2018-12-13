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
public class AdicionarColecaoResponse {

    private int id;
    private String mensagem;

    public AdicionarColecaoResponse(int id, String mensagem) {
        this.id = id;
        this.mensagem = mensagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
