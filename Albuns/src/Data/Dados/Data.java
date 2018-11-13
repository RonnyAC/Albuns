/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Dados;

import Domain.Entity.Album;
import Domain.Entity.Colecao;
import Domain.Entity.Figurinha;
import Domain.Entity.FigurinhasNaoAlocadas;
import Domain.Entity.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronny
 */
public class Data {
    public static List<Album> listaDeAlbuns;
    public static List<Figurinha> listaDeFigurinhas;
    public static List<Colecao> listaDeColecoes;
    public static List<FigurinhasNaoAlocadas> listaDeFigurinahsNaoAlocadas;
    public static List<Usuario> listaDeUsuarios;

    public Data() {
        listaDeFigurinahsNaoAlocadas = new ArrayList<>();
        listaDeFigurinhas = new ArrayList<>();
        listaDeColecoes = new ArrayList<>();
        listaDeUsuarios = new ArrayList<>();
        listaDeAlbuns = new ArrayList<>();
    } 
    
}
