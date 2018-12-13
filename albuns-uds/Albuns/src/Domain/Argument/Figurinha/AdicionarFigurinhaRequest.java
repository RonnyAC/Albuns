/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Argument.Figurinha;

import Domain.Entity.AlbumOriginal;

/**
 *
 * @author Ronny
 */
public class AdicionarFigurinhaRequest {
    private Integer numero;
    private String nome;
    private String descricao;
    private AlbumOriginal albumOriginal;

    public AdicionarFigurinhaRequest(Integer numero, String nome, String descricao, AlbumOriginal albumOriginal) {
        this.numero = numero;
        this.nome = nome;
        this.descricao = descricao;
        this.albumOriginal = albumOriginal;
    }

    
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public AlbumOriginal getAlbumOriginal() {
        return albumOriginal;
    }

    public void setAlbumOriginal(AlbumOriginal albumOriginal) {
        this.albumOriginal = albumOriginal;
    }
    
    
}
