package Domain.Entity;

/**
 *
 * @author Ronny
 */
public class Figurinha {
    private Integer id;
    private Integer numero;
    private String nome;
    private String descricao;
    private AlbumOriginal albumOriginal;

    public Figurinha(Integer numero, String nome, String descricao, AlbumOriginal albumOriginal) {
        this.numero = numero;
        this.nome = nome;
        this.descricao = descricao;
        this.albumOriginal = albumOriginal;
    }

    public Figurinha() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public AlbumOriginal getAlbum() {
        return albumOriginal;
    }

    public void setAlbum(AlbumOriginal albumOriginal) {
        this.albumOriginal = albumOriginal;
    }
    
    
}
