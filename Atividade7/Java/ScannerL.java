import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.util.Scanner;

public class ScannerL {

    /**
     * Le um arquivo de texto e retorna uma lista de tokens.
     */
    public static List<String> tokenizarLivro(String caminhoArquivo) {
        //  expressão regular que captura palavras e a pontuação do texto do arquivo
        String regex = "[a-zA-ZÀ-ÿ0-9]+|[.,!?;:()\\[\\]\"'-]"; 
        Pattern pattern = Pattern.compile(regex);
        List<String> vetorTokens = new ArrayList<>(); //cria a lista de tokens obtidos

        try {
            String texto = new String(Files.readAllBytes(Paths.get(caminhoArquivo)), "UTF-8");
            Matcher matcher = pattern.matcher(texto);
            //enquanto um novo token é encontrado, adiciona o token na lista
            while (matcher.find()) {
                vetorTokens.add(matcher.group());
            }
        } catch (IOException e) {
            return vetorTokens;
        }

        return vetorTokens;
    }

    public static void main(String[] args) {
        String arquivoLivro = "livro.txt";
        List<String> vetorTokens = tokenizarLivro(arquivoLivro);
        if (!vetorTokens.isEmpty()) {
            int totalTokens = vetorTokens.size();
            Scanner leitor = new Scanner(System.in);
            int quantidade = 0;
            // cria um loop ate ser inserido um numero de tokens valido
            while (true) {
                try {
                    System.out.print("O livro tem " + totalTokens + " tokens. Quantos devem ser exibidos? ");
                    quantidade = Integer.parseInt(leitor.nextLine());
                    // verifica se é menor que 1 ou maior que a quantidade de tokens que o livro tem
                    if (quantidade < 1) {
                        System.out.println("Insira um numero maior que zero.\n");
                    } else if (quantidade > totalTokens) {
                        System.out.println("O limite de tokens é " + totalTokens + ". Tente novamente.\n");
                    } 
                    // se for um numero válido no intervalo definido, sai do loop
                    else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Digite um numero inteiro valido.\n");
                }
            }
            
            // caso passe em todas as verificaçoes, exibe a lista final de tokens do livro
            System.out.println("\nExibindo os primeiros " + quantidade + " tokens:");
            System.out.println(vetorTokens.subList(0, quantidade));
            leitor.close();
        } else {
            System.out.println("Nenhum token encontrado ou arquivo não existe.");
        }
    }
}