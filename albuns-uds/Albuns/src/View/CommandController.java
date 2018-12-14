/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Comandos.EnumComandosBasicos;
import Comandos.EnumObjetos;
import Domain.Argument.Album.AdicionarAlbumRequest;

/**
 *
 * @author guest-ryhgpp
 */
public class CommandController {

    public EnumComandosBasicos BasicCommandCheck(String command) throws Exception {
        if (EnumComandosBasicos.getByName(command) != null) {
            return EnumComandosBasicos.getByName(command.toUpperCase());
        }
        throw new Exception("Não foi identificado um comando básico na sua clausula");
    }

    public EnumObjetos ObjectCommandCheck(String command) throws Exception {
        if (EnumObjetos.getByName(command) != null) {
            return EnumObjetos.getByName(command.toUpperCase());
        }
        throw new Exception("Não foi identificado um comando básico na sua clausula");
    }

    public AdicionarAlbumRequest RequestAlbumCommandCheck(String[] entireCommand) {
        var request = new AdicionarAlbumRequest();
        String titulo = "";
        String descricao = "";
        for (int i = 2; i < entireCommand.length; i++) {
            switch (i) {
                case 2:
                    titulo = entireCommand[i];
                    break;
                case 3:
                    descricao = entireCommand[i];
                    break;
            }

        }
        request.setDescricao(descricao);
        request.setTitulo(titulo);

        return request;
    }
}
