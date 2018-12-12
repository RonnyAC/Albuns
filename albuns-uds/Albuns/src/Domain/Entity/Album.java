package Domain.Entity;

import java.util.List;

/**
 *
 * @author Ronny
 */
public class Album {

    private Integer id;
    private String titulo;
    private String descricao;
    private List<Figurinha> figurinha;

    public Album(String titulo, String descricao, Integer numeroDeFigurinhas) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Album() {

    }

    public Album(String titulo, String descricao) {
        this.descricao = descricao;
        this.titulo = titulo;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Figurinha> getFigurinha() {
        return figurinha;
    }

    public void setFigurinha(List<Figurinha> figurinha) {
        this.figurinha = figurinha;
    }

}
