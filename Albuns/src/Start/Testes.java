/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

/**
 *
 * @author Ronny
 */
public class Testes {

    public static void main(String args[]) {
        MetodoTres();
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
}
