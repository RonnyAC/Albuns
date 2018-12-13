package Domain.Entity;

import java.util.List;

/**
 *
 * @author Ronny
 */
public class Colecao {
    private Integer id;
    private String titulo;
    private String senha;
    private Float porcentagemConcluido;
    private List<Album> albuns;
    private List<FigurinhasNaoAlocadas> figurinhasNaoAlocadas;

    public Colecao() {
    }

    public Colecao(String titulo, String senha) {
        this.titulo = titulo;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Float getPorcentagemConcluido() {
        return porcentagemConcluido;
    }

    public void setPorcentagemConcluido(Float porcentagemConcluido) {
        this.porcentagemConcluido = porcentagemConcluido;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(List<Album> albuns) {
        this.albuns = albuns;
    }

    public List<FigurinhasNaoAlocadas> getFigurinhasNaoAlocadas() {
        return figurinhasNaoAlocadas;
    }

    public void setFigurinhasNaoAlocadas(List<FigurinhasNaoAlocadas> figurinhasNaoAlocadas) {
        this.figurinhasNaoAlocadas = figurinhasNaoAlocadas;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
