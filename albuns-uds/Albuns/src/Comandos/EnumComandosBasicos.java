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
public enum EnumComandosBasicos {
    DEFAULT("Comando padrao para iniciar o sistema"),
    NOVO("Comando para inserir um novo objeto no sistema"),
    SAIR("Comando para sair do sistema");
    
    private final String descricao;

    private EnumComandosBasicos(String descricao) {
        this.descricao = descricao;
    }
    
    public static EnumComandosBasicos getByName(String nome){
        if(nome == null)
            return EnumComandosBasicos.DEFAULT;
        for (EnumComandosBasicos comando : EnumComandosBasicos.values()) {
            if(comando.name().equals(nome))
                return comando;
        }
        
        return EnumComandosBasicos.DEFAULT;
    }
}
