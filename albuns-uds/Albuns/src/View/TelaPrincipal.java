/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Comandos.EnumComandosBasicos;
import Comandos.EnumObjetos;
import Controler.AlbumController;
import java.util.Scanner;

/**
 *
 * @author Ronny
 */
public class TelaPrincipal {

    private EnumComandosBasicos comandosBasicos;
    private EnumObjetos objetos;
    private final AlbumController albumController;

    public TelaPrincipal() {
        albumController = new AlbumController();
    }

    public void iniciarPrograma() throws Exception {
        Scanner scanner = new Scanner(System.in);
        CommandController commandController = new CommandController();
        String command = "a";
        System.out.println("Inciando o prgrama");
        comandosBasicos = EnumComandosBasicos.DEFAULT;
        objetos = EnumObjetos.DEFAULT;

        while (comandosBasicos != EnumComandosBasicos.SAIR) {
            command = (scanner.nextLine());
            String[] entireCommand = command.split(" ");

            if (entireCommand.length >= 1) {
                comandosBasicos = commandController.BasicCommandCheck(entireCommand[0]);
                switch (comandosBasicos) {
                    case SAIR:
                        System.out.println("O programa será encerrado!");
                        scanner.next();
                        break;
                    case NOVO:
                    case NOVA:
                        if (entireCommand.length >= 2) {
                            objetos = commandController.ObjectCommandCheck(entireCommand[1]);
                            switch (objetos) {
                                case ALBUM:
                                    var request = commandController.RequestAlbumCommandCheck(entireCommand);
                                    var response = albumController.Adicionar(request);
                                    System.out.println(response.getId() + " " + response.getMensagem());
                                    break;
                                case COLECAO:
                                    System.out.println("Nao Implementado");
                                    break;
                                case FIGURINHA:
                                    System.out.println("Nao Implementado");
                                    break;
                                case USUARIO:
                                    System.out.println("Nao Implementado");
                                    break;
                                default:
                                    System.out.println("Nao Implementado");
                            }
                        }
                        break;
                    default:
                        System.out.println("Comando invalido");
                }
            }
        }
    }
}
