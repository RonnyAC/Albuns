/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import Data.Dados.Data;
import Domain.Argument.Usuario.AdicionarUsuarioRequest;
import Domain.Service.ServiceUsuario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ronny
 */
public class Testes {

    public static void main(String args[]) {
        System.out.println("Iniciando Data...");
        
        Data.listaDeAlbuns = new ArrayList<>();
        System.out.println("Lista de albuns criado!");
        
        Data.listaDeUsuarios = new ArrayList<>();
        System.out.println("Lista de usuarios criado!");
        
        Data.listaDeColecoes = new ArrayList<>();
        System.out.println("Lista de coleçoes criado!");
        
        Data.listaDeFigurinahsNaoAlocadas = new ArrayList<>();
        System.out.println("Lista de figurinhas nao alocadas criado!");
        
        Data.listaDeFigurinhas = new ArrayList<>();
        System.out.println("Lista de Figurinhas criado!");

        var leitura = new Scanner(System.in);
        System.out.println("Iniciando o sistema...");

        var service = new ServiceUsuario();
        System.out.println("Serviço criado");

        AdicionarUsuario(service);
        AdicionarUsuario(service);

        Data.listaDeUsuarios.forEach((t) -> {
            System.out.println(t.getNome() + "-" + t.getId());
        });

        leitura.next();

    }

    private static void metodoUm() {
        StringBuilder nomes = new StringBuilder();
        nomes.append("Carlos>").append("Maria>").append("José>").append("Renata");
        System.out.println(nomes.toString());
    }

    private static void metodoDois() {
        StringBuilder buffer = new StringBuilder("João Silveira Batista");
        System.out.printf(" buffer = %s\n tamanho = %d\n capacidade (%d (tamanho) + "
                + "16(valor inicial padrão)) = %d\n\n",
                buffer.toString(), buffer.length(), buffer.length(), buffer.capacity());

        //EXPANDE A CAPACIDADE P/ 75 CARACTERES
        buffer.ensureCapacity(75);
        System.out.printf("Nova Capacidade = %d\n\n", buffer.capacity());

        //REDEFINE O TAMANHO, NÃO APARECENDO OS CARACTERES 
        // SE O ARGUMENTO FOR MENOR QUE A QUANTIDADE DE CARACTERES ORIGINAL
        buffer.setLength(10);
        System.out.printf("Novo tamanho = %d\n buffer = %s\n", buffer.length(),
                buffer.toString());
    }

    private static void MetodoTres() {
        StringBuilder buffer = new StringBuilder("Usando outros métodos StringBuilder");

        System.out.printf("buffer = %s\n", buffer.toString());
        System.out.printf("Caractere index 0: %s\nCaractere index 4: "
                + "%s\n\n", buffer.charAt(0), buffer.charAt(4));

        char[] charArray = new char[buffer.length()];

        buffer.getChars(0, buffer.length(), charArray, 0);
        System.out.print("Os caracteres são: ");

        for (char c : charArray) {
            System.out.print(c);
        }

        buffer.setCharAt(0, 'O');
        buffer.setCharAt(4, 'P');

        System.out.printf("\n\nbuffer = %s", buffer.toString());

        buffer.reverse();
        System.out.printf("\n\nbuffer = %s\n", buffer.toString());
    }

    private static void AdicionarUsuario(ServiceUsuario service) {
        var request = new AdicionarUsuarioRequest();
        System.out.println("Objeto criado");

        request.setNome("Nome de Teste");
        request.setEmail("EmailTeste@teste.com.br");
        request.setSenha("123456");

        var response = service.AdicionarUsusario(request);
        System.out.println(response.getMensagem());
    }
}
