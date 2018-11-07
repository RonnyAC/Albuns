package Domain;

/**
 *
 * @author Ronny
 */
public class Album {
    private Integer id;
    private String titulo;
    private String descricao;
    private Integer numeroDeFigurinhas;

    public Album() {
        
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

    public Integer getNumeroDeFigurinhas() {
        return numeroDeFigurinhas;
    }

    public void setNumeroDeFigurinhas(Integer numeroDeFigurinhas) {
        this.numeroDeFigurinhas = numeroDeFigurinhas;
    }
    
    
}
