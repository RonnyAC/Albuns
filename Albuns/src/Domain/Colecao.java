package Domain;

import java.util.List;

/**
 *
 * @author Ronny
 */
public class Colecao {
    private Integer id;
    private String titulo;
    private Float porcentagemConcluido;
    private Album album;
    private List<Figurinha> figurinhas;

    public Colecao() {
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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Figurinha> getFigurinhas() {
        return figurinhas;
    }

    public void setFigurinhas(List<Figurinha> figurinhas) {
        this.figurinhas = figurinhas;
    }
    
    
}
