/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Comandos.EnumComandosBasicos;
import Comandos.EnumObjetos;

/**
 *
 * @author guest-ryhgpp
 */
public class CommandController {

    public EnumComandosBasicos BasicCommandCheck(String command) throws Exception {
        if (EnumComandosBasicos.getByName(command) != null) {
            return EnumComandosBasicos.getByName(command);
        }
        throw new Exception("Não foi identificado um comando básico na sua clausula");
    }

    public EnumObjetos ObjectCommandCheck(String command) throws Exception {
        if (EnumObjetos.getByName(command) != null) {
            return EnumObjetos.getByName(command);
        }
        throw new Exception("Não foi identificado um comando básico na sua clausula");
    }
}
