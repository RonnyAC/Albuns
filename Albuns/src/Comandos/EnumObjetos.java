/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;

/**
 *
 * @author Ronny
 */
public enum EnumObjetos {
    DEFAULT,
    ALBUM,
    COLECAO,
    FIGURINHA,
    FIGURINHASNAOALOCADAS,
    USUARIO;

    public static EnumObjetos getByName(String nome) {
        if (nome == null) {
            return EnumObjetos.DEFAULT;
        }
        for (EnumObjetos comando : EnumObjetos.values()) {
            if (comando.name().equals(nome)) {
                return comando;
            }
        }

        return EnumObjetos.DEFAULT;
    }
}
