import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiniScanner {

    record Token(String tipo, String lexema) {
        @Override
        public String toString() {
            return "(" + tipo + ", '" + lexema + "')";
        }
    }

    public static List<Token> tokenize(String texto) {
        String regexp = String.join("|",
            "(?<NUM>\\d+)",
            "(?<ID>[a-zA-Z_]\\w*)",
            "(?<OP>[=+\\-*/])",
            "(?<PAREN>[()])",
            "(?<SEMI>;)",
            "(?<SKIP>[ \\t]+)"
        );

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(texto);

        List<Token> tokens = new ArrayList<>();

        while (matcher.find()) {
            for (String grupo : new String[]{"NUM", "ID", "OP", "PAREN", "SEMI", "SKIP"}) {
                if (matcher.group(grupo) != null) {
                    if (!grupo.equals("SKIP")) {
                        tokens.add(new Token(grupo, matcher.group(grupo)));
                    }
                    break;
                }
            }
        }

        return tokens;
    }

    public static void main(String[] args) {
        String codigo = "result = (initial + rate) * 60; position = result";

        System.out.println("Tokens encontrados:");
        for (Token token : tokenize(codigo)) {
            System.out.println("  " + token);
        }
    }
}
