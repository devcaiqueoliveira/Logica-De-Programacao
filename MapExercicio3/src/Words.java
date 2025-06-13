import java.util.HashMap;
import java.util.Map;

public class Words {
    private final Map<String, String> wordsDefinition = new HashMap<>();

    public void addWord(String word, String definition) {
            wordsDefinition.put(word, definition);
    }

    public void removeWord(String word) {
        if (!wordsDefinition.containsKey(word)) {
            System.out.println("Erro: A palavra " + word + " não foi encontrada no nosso dicionário");
        } else {
            wordsDefinition.remove(word);
        }
    }

    public void searchDefinition(String word) {
        String definition = wordsDefinition.get(word);
        if (definition == null) {
            System.out.println("Erro: A palavra " + word + " não foi encontrada no nosso dicionário");
        } else {
            System.out.println(definition);
        }
    }
}
