/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import Data.Dados.Data;
import View.TelaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Ronny
 */
public class Start {
    public static void main(String[] args) throws Exception{
        InicializarDados();
        TelaPrincipal iniciar = new TelaPrincipal();
        iniciar.iniciarPrograma();
    }
    
        private static void InicializarDados() {
        System.out.println("Iniciando Data...");

        Data.listaDeAlbuns = new ArrayList<>();
        System.out.println("Lista de albuns criado!");

        Data.listaDeAlbunsOriginais = new ArrayList<>();
        System.out.println("Lista de albuns originais criado!");

        Data.listaDeUsuarios = new ArrayList<>();
        System.out.println("Lista de usuarios criado!");

        Data.listaDeColecoes = new ArrayList<>();
        System.out.println("Lista de coleçoes criado!");

        Data.listaDeFigurinahsNaoAlocadas = new ArrayList<>();
        System.out.println("Lista de figurinhas nao alocadas criado!");

        Data.listaDeFigurinhas = new ArrayList<>();
        System.out.println("Lista de Figurinhas criado!");
    }
}
