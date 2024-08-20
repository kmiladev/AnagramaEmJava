public class AnagramaEmJava {

    public static void main(String[] args) {
        // Chama o método estático diretamente no método main
        String Palavra1 = "amor";
        String Palavra2 = "roma";

        imprimirAnagramas(Palavra1, Palavra2);
    }

    private static void imprimirAnagramas(String p01, String p02) {
        // Converter em lista usando letras maiúsculas para facilitar a comparação.
        char[] char1 = p01.toUpperCase().toCharArray();
        char[] char2 = p02.toUpperCase().toCharArray();

        // Ordenar alfabeticamente usando as Collections
        java.util.Arrays.sort(char1);
        java.util.Arrays.sort(char2);

        // Armazenar em nova variável a palavra já ordenada e formatada
        String novaP01 = new String(char1);
        String novaP02 = new String(char2);

        // Comparar as duas novas strings e aplicar uma condicional reduzida
        String resultado = novaP01.equals(novaP02) ? "Isto é um Anagrama" : "Isto não é um Anagrama";

        System.out.println("Verificando se as duas palavras impressas na tela são Anagramas");
        System.out.println("A primeira palavra é: " + p01 + " e a segunda palavra é: " + p02);
        System.out.println(resultado);
    }
}
