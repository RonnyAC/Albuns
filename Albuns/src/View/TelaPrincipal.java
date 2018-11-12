/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Comandos.EnumComandosBasicos;
import Comandos.EnumObjetos;
import java.util.Scanner;

/**
 *
 * @author Ronny
 */
public class TelaPrincipal {

    private EnumComandosBasicos comandosBasicos;
    private EnumObjetos objetos;

    public void iniciarPrograma() {
        Scanner scanner = new Scanner(System.in);
        var comando = new StringBuilder();
        System.out.println("Inciando o prgrama");
        comandosBasicos = EnumComandosBasicos.DEFAULT;
        objetos = EnumObjetos.DEFAULT;

        while (comandosBasicos != EnumComandosBasicos.SAIR) {
            comando.append(scanner.next());
            comandosBasicos = EnumComandosBasicos.getByName(comando.toString().toUpperCase());
            switch (comandosBasicos) {
                case SAIR:
                    System.out.println("O programa será encerrado!");
                    scanner.next();
                    break;
                case NOVO:
                    System.out.println("Novo o que?");
                    switch (objetos) {
                        case ALBUM:
                            System.out.println("Novo Album criado");
                            break;
                        case COLECAO:
                            System.out.println("Nova Colecao criada");
                            break;
                        case FIGURINHA:
                            System.out.println("Nova Figurinha criada");
                            break;
                        case USUARIO:
                            System.out.println("Novo Usuario criado");
                            break;
                        default:
                            System.out.println("Comando invalido");
                    }
                    break;
                default:
                    System.out.println("Comando invalido");
            }
        }
    }
}
